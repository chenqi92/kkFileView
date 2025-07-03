package cn.keking.web.filter;

import cn.keking.config.ConfigConstants;
import cn.keking.utils.SecurityUtils;
import cn.keking.utils.WebUtils;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.apache.commons.collections4.CollectionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.util.FileCopyUtils;

/**
 * @author chenjh
 * @since 2020/2/18 19:13
 */
public class TrustHostFilter implements Filter {

    private static final Logger LOGGER = LoggerFactory.getLogger(TrustHostFilter.class);
    private String notTrustHostHtmlView;

    @Override
    public void init(FilterConfig filterConfig) {
        ClassPathResource classPathResource = new ClassPathResource("web/notTrustHost.html");
        try {
            classPathResource.getInputStream();
            byte[] bytes = FileCopyUtils.copyToByteArray(classPathResource.getInputStream());
            this.notTrustHostHtmlView = new String(bytes, StandardCharsets.UTF_8);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        String url = WebUtils.getSourceUrl(request);
        String host = WebUtils.getHost(url);

        if (host == null) {
            LOGGER.warn("无法解析请求URL的域名: {}", SecurityUtils.maskSensitiveUrl(url));
            String html = this.notTrustHostHtmlView.replace("${current_host}", "未知域名");
            response.getWriter().write(html);
            response.getWriter().close();
            return;
        }

        // 增强的安全检查
        if (isNotTrustHost(host) || !SecurityUtils.isHostAllowedInStrictMode(host)) {
            LOGGER.warn("拒绝来自不信任域名的请求: {}", host);
            String html = this.notTrustHostHtmlView.replace("${current_host}", host);
            response.getWriter().write(html);
            response.getWriter().close();
        } else {
            chain.doFilter(request, response);
        }
    }

    public boolean isNotTrustHost(String host) {
        if (CollectionUtils.isNotEmpty(ConfigConstants.getNotTrustHostSet())) {
            return ConfigConstants.getNotTrustHostSet().contains(host);
        }
        if (CollectionUtils.isNotEmpty(ConfigConstants.getTrustHostSet())) {
            return !ConfigConstants.getTrustHostSet().contains(host);
        }
        return false;
    }

    @Override
    public void destroy() {

    }

}
