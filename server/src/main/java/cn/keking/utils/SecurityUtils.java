package cn.keking.utils;

import cn.keking.config.ConfigConstants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.StringUtils;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.regex.Pattern;

/**
 * 安全工具类
 * 用于处理文件预览相关的安全检查
 */
public class SecurityUtils {

    private static final Logger LOGGER = LoggerFactory.getLogger(SecurityUtils.class);

    // 危险的HTML标签和脚本模式
    private static final Pattern[] DANGEROUS_PATTERNS = {
        Pattern.compile("<script[^>]*>.*?</script>", Pattern.CASE_INSENSITIVE | Pattern.DOTALL),
        Pattern.compile("<iframe[^>]*>.*?</iframe>", Pattern.CASE_INSENSITIVE | Pattern.DOTALL),
        Pattern.compile("<object[^>]*>.*?</object>", Pattern.CASE_INSENSITIVE | Pattern.DOTALL),
        Pattern.compile("<embed[^>]*>", Pattern.CASE_INSENSITIVE),
        Pattern.compile("javascript:", Pattern.CASE_INSENSITIVE),
        Pattern.compile("vbscript:", Pattern.CASE_INSENSITIVE),
        Pattern.compile("data:text/html", Pattern.CASE_INSENSITIVE),
        Pattern.compile("on\\w+\\s*=", Pattern.CASE_INSENSITIVE), // onclick, onload等事件
        Pattern.compile("<meta[^>]*http-equiv[^>]*refresh", Pattern.CASE_INSENSITIVE)
    };

    // 可疑的URL模式
    private static final Pattern[] SUSPICIOUS_URL_PATTERNS = {
        Pattern.compile(".*\\.(exe|bat|cmd|sh|vbs|ps1|scr|com|pif)$", Pattern.CASE_INSENSITIVE),
        Pattern.compile(".*[\\?&].*=.*<script", Pattern.CASE_INSENSITIVE),
        Pattern.compile(".*[\\?&].*=.*javascript:", Pattern.CASE_INSENSITIVE)
    };

    /**
     * 检查文件类型是否为危险类型
     * @param fileExtension 文件扩展名
     * @return true表示危险，false表示安全
     */
    public static boolean isDangerousFileType(String fileExtension) {
        if (!StringUtils.hasText(fileExtension)) {
            return false;
        }

        // 检查安全功能是否启用，默认启用
        Boolean securityEnabled = ConfigConstants.getSecurityEnabled();
        if (securityEnabled != null && !securityEnabled) {
            return false;
        }

        String[] dangerousTypes = ConfigConstants.getDangerousFileTypes();
        if (dangerousTypes == null || dangerousTypes.length == 0) {
            // 如果没有配置，使用默认的危险类型列表
            dangerousTypes = ConfigConstants.DEFAULT_DANGEROUS_FILE_TYPES.split(",");
        }

        String lowerExtension = fileExtension.toLowerCase();
        return Arrays.asList(dangerousTypes).contains(lowerExtension);
    }

    /**
     * 检查文件内容是否包含恶意代码
     * @param content 文件内容
     * @param fileExtension 文件扩展名
     * @return true表示包含恶意内容，false表示安全
     */
    public static boolean containsMaliciousContent(String content, String fileExtension) {
        // 检查安全功能和内容检查是否启用
        Boolean securityEnabled = ConfigConstants.getSecurityEnabled();
        Boolean contentSecurityCheck = ConfigConstants.getContentSecurityCheck();

        if ((securityEnabled != null && !securityEnabled) ||
            (contentSecurityCheck != null && !contentSecurityCheck)) {
            return false;
        }

        if (!StringUtils.hasText(content) || !StringUtils.hasText(fileExtension)) {
            return false;
        }

        // 对HTML类型文件进行特殊检查
        String lowerExtension = fileExtension.toLowerCase();
        if ("html".equals(lowerExtension) || "htm".equals(lowerExtension)) {
            return containsDangerousHtmlContent(content);
        }

        // 对其他文本类型文件进行基础检查
        if (isTextFile(lowerExtension)) {
            return containsBasicMaliciousContent(content);
        }

        return false;
    }

    /**
     * 检查HTML内容是否包含危险元素
     */
    private static boolean containsDangerousHtmlContent(String content) {
        String lowerContent = content.toLowerCase();
        
        for (Pattern pattern : DANGEROUS_PATTERNS) {
            if (pattern.matcher(lowerContent).find()) {
                LOGGER.warn("检测到危险的HTML内容模式: {}", pattern.pattern());
                return true;
            }
        }
        
        return false;
    }

    /**
     * 检查基础恶意内容
     */
    private static boolean containsBasicMaliciousContent(String content) {
        String lowerContent = content.toLowerCase();
        
        // 检查是否包含脚本标签
        if (lowerContent.contains("<script") || lowerContent.contains("javascript:") || 
            lowerContent.contains("vbscript:") || lowerContent.contains("data:text/html")) {
            return true;
        }
        
        return false;
    }

    /**
     * 判断是否为文本文件
     */
    private static boolean isTextFile(String extension) {
        String[] textExtensions = {"txt", "html", "htm", "xml", "json", "js", "css", "jsp", "asp", "php"};
        return Arrays.asList(textExtensions).contains(extension);
    }

    /**
     * 检查URL是否可疑
     * @param url URL字符串
     * @return true表示可疑，false表示安全
     */
    public static boolean isSuspiciousUrl(String url) {
        Boolean securityEnabled = ConfigConstants.getSecurityEnabled();
        if (securityEnabled != null && !securityEnabled) {
            return false;
        }

        if (!StringUtils.hasText(url)) {
            return false;
        }

        for (Pattern pattern : SUSPICIOUS_URL_PATTERNS) {
            if (pattern.matcher(url).matches()) {
                LOGGER.warn("检测到可疑URL模式: {}", url);
                return true;
            }
        }

        return false;
    }

    /**
     * 对URL进行脱敏处理，用于日志记录
     * @param url 原始URL
     * @return 脱敏后的URL
     */
    public static String maskSensitiveUrl(String url) {
        Boolean logUrlMasking = ConfigConstants.getLogUrlMasking();
        if ((logUrlMasking != null && !logUrlMasking) || !StringUtils.hasText(url)) {
            return url;
        }

        try {
            URL urlObj = new URL(url);
            String host = urlObj.getHost();
            String path = urlObj.getPath();
            
            // 只显示域名和文件名，隐藏完整路径
            if (StringUtils.hasText(path) && path.contains("/")) {
                String fileName = path.substring(path.lastIndexOf("/") + 1);
                if (fileName.length() > 10) {
                    fileName = fileName.substring(0, 5) + "***" + fileName.substring(fileName.length() - 5);
                }
                return urlObj.getProtocol() + "://" + host + "/***/" + fileName;
            }
            
            return urlObj.getProtocol() + "://" + host + "/***";
        } catch (MalformedURLException e) {
            // 如果URL格式不正确，只显示前后几个字符
            if (url.length() > 20) {
                return url.substring(0, 10) + "***" + url.substring(url.length() - 10);
            }
            return "***";
        }
    }

    /**
     * 检查域名是否在严格模式下被允许
     * @param host 域名
     * @return true表示被允许，false表示被拒绝
     */
    public static boolean isHostAllowedInStrictMode(String host) {
        Boolean strictHostCheck = ConfigConstants.getStrictHostCheck();
        if (strictHostCheck != null && !strictHostCheck) {
            return true;
        }

        if (!StringUtils.hasText(host)) {
            return false;
        }

        // 在严格模式下，必须明确配置信任域名
        return ConfigConstants.getTrustHostSet() != null &&
               !ConfigConstants.getTrustHostSet().isEmpty() &&
               ConfigConstants.getTrustHostSet().contains(host.toLowerCase());
    }

    /**
     * 验证文件预览请求的安全性
     * @param url 请求的URL
     * @param fileExtension 文件扩展名
     * @return 安全检查结果
     */
    public static SecurityCheckResult validatePreviewRequest(String url, String fileExtension) {
        SecurityCheckResult result = new SecurityCheckResult();

        Boolean securityEnabled = ConfigConstants.getSecurityEnabled();
        if (securityEnabled != null && !securityEnabled) {
            result.setAllowed(true);
            return result;
        }

        // 检查文件类型
        if (isDangerousFileType(fileExtension)) {
            result.setAllowed(false);
            result.setReason("危险的文件类型: " + fileExtension);
            return result;
        }

        // 检查URL
        if (isSuspiciousUrl(url)) {
            result.setAllowed(false);
            result.setReason("可疑的URL");
            return result;
        }

        // 检查域名（严格模式）
        try {
            URL urlObj = new URL(url);
            String host = urlObj.getHost();
            if (!isHostAllowedInStrictMode(host)) {
                result.setAllowed(false);
                result.setReason("域名未在信任列表中: " + host);
                return result;
            }
        } catch (MalformedURLException e) {
            result.setAllowed(false);
            result.setReason("无效的URL格式");
            return result;
        }

        result.setAllowed(true);
        return result;
    }

    /**
     * 安全检查结果类
     */
    public static class SecurityCheckResult {
        private boolean allowed;
        private String reason;

        public boolean isAllowed() {
            return allowed;
        }

        public void setAllowed(boolean allowed) {
            this.allowed = allowed;
        }

        public String getReason() {
            return reason;
        }

        public void setReason(String reason) {
            this.reason = reason;
        }
    }
}
