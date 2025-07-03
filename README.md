# kkFileView

[中文文档](README.cn.md) | English

### Introduction

Document online preview project solution, built using the popular Spring Boot framework for easy setup and deployment. This versatile open source project provides basic support for a wide range of document formats, including:

1. Supports Office documents such as `doc`, `docx`, `xls`, `xlsx`, `xlsm`, `ppt`, `pptx`, `csv`, `tsv`, , `dotm`, `xlt`, `xltm`, `dot`, `xlam`, `dotx`, `xla,` ,`pages` etc.
2. Supports domestic WPS Office documents such as `wps`, `dps`, `et` , `ett`, ` wpt`.
3. Supports OpenOffice, LibreOffice office documents such as `odt`, `ods`, `ots`, `odp`, `otp`, `six`, `ott`, `fodt` and `fods`.
4. Supports Visio flowchart files such as `vsd`, `vsdx`.
5. Supports Windows system image files such as `wmf`, `emf`.
6. Supports Photoshop software model files such as `psd` ,`eps`.
7. Supports document formats like `pdf`, `ofd`, and `rtf`.
8. Supports software model files like `xmind`. 
9. Support for `bpmn` workflow files.
10. Support for `eml` mail files
11. Support for `epub` book documents
12. Supports 3D model files like `obj`, `3ds`, `stl`, `ply`, `gltf`, `glb`, `off`, `3dm`, `fbx`, `dae`, `wrl`, `3mf`, `ifc`, `brep`, `step`, `iges`, `fcstd`, `bim`, etc.
13. Supports CAD model files such as `dwg`, `dxf`, `dwf`  `iges` ,` igs`, `dwt` , `dng` , `ifc` , `dwfx` , `stl` , `cf2` , `plt`, etc.
14. Supports all plain text files such as `txt`, `xml` (rendering), `md` (rendering), `java`, `php`, `py`, `js`, `css`, etc.
15. Supports compressed packages such as `zip`, `rar`, `jar`, `tar`, `gzip`, `7z`, etc.
16. Supports image previewing (flip, zoom, mirror) of `jpg`, `jpeg`, `png`, `gif`, `bmp`, `ico`, `jfif`, `webp`, etc.
17. Supports image information model files such as `tif` and `tiff`.
18. Supports image format files such as `tga`.
19. Supports vector image format files such as `svg`.
20. Supports `mp3`,`wav`,`mp4`,`flv` .
21. Supports many audio and video format files such as `avi`, `mov`, `wmv`, `mkv`, `3gp`, and `rm`.
22. Supports for `dcm` .
23. Supports for `drawio` .

### Features
- Build with the popular frame spring boot
- Easy to build and deploy
- Basically support online preview of mainstream office documents, such as Doc, docx, Excel, PDF, TXT, zip, rar, pictures, etc
- REST API
- Abstract file preview interface so that it is easy to extend more file extensions and develop this project on your own
- **Enhanced Security Features** - Comprehensive security mechanisms to prevent malicious file attacks

### Official website and DOCS

URL：[https://kkview.cn](https://kkview.cn/)

### Live demo
> Please treat public service kindly, or this would stop at any time.

URL：[https://file.kkview.cn](https://file.kkview.cn)

### Contact Us
> We will answer your questions carefully and solve any problems you encounter while using the project. We also kindly ask that you at least Google or Baidu before asking questions in order to save time and avoid ineffective communication. Let's cherish our lives and stay away from ineffective communication.

<img src="./doc/github星球.png/" width="50%">

### Quick Start
> Technology stack
- Spring boot： [spring boot Development Reference Guide](http://www.kailing.pub/PdfReader/web/viewer.html?file=springboot)
- Freemarker
- Redisson 
- Jodconverter
> Dependencies
- Redis(Optional, Unnecessary by default)
- OpenOffice or LibreOffice(Integrated on Windows, will be installed automatically on Linux, need to be manually installed on Mac OS)

1. First step：`git pull https://github.com/kekingcn/kkFileView.git`

2. second step：Run the main method of `/server/src/main/java/cn/keking/ServerMain.java`. After starting,visit `http://localhost:8012/`.

### Changelog
> December 14, 2022, version 4.1.0 released:

1. Updated homepage design by @wsd7747.
2. Compatible with multipage tif for pdf and jpg conversion and multiple page online preview for tif image preview by @zhangzhen1979.
3. Optimized docker build, using layered build method by @yl-yue.
4. Implemented file encryption based on userToken cache by @yl-yue.
5. Implemented preview for encrypted Word, PPT, and Excel files by @yl-yue.
6. Upgraded Linux & Docker images to LibreOffice 7.3.
7. Updated OFD preview component, tif preview component, and added support for PPT watermarking.
8. Numerous other upgrades, optimizations, and bug fixes.
We thank @yl-yue, @wsd7747, @zhangzhen1979, @tomhusky, @shenghuadun, and @kischn.sun for their code contributions.


> July 6, 2021, version 4.0.0 released:

1. The integration of OpenOffice in the underlying system has been replaced with LibreOffice, resulting in enhanced compatibility and improved preview effects for Office files.
2. Fixed the directory traversal vulnerability in compressed files.
3. Fixed the issue where previewing PPT files in PDF mode was ineffective.
4. Fixed the issue where the front-end display of image preview mode for PPT files was abnormal.
5. Added a new feature: the file upload function on the homepage can be enabled or disabled in real-time through configuration.
6. Optimized the logging of Office process shutdown.
7. Optimized the logic for finding Office components in Windows environment, with built-in LibreOffice taking priority.
8. Optimized the synchronous execution of starting Office processes.

> June 17, 2021, version 3.6.0 released:

This version includes support for OFD file type versions, and all the important features in this release were contributed by the community. We thank @gaoxingzaq and @zhangxiaoxiao9527 for their code contributions.

1. Added support for previewing OFD type files. OFD is a domestically produced file format similar to PDF.
2. Added support for transcoding and previewing video files through ffmpeg. With transcoding enabled, theoretically, all mainstream video file formats such as RM, RMVB, FLV, etc. are supported for preview.
3. Beautified the preview effect of PPT and PPTX file types, much better looking than the previous version.
4. Updated the versions of dependencies such as pdfbox, xstream, common-io.

> January 28, 2021:

The final update of the Lunar New Year 2020 has been released, mainly including some UI improvements, bug fixes reported by QQ group users and issues, and most importantly, it is a new version for a good year.

1. Introduced galimatias to solve the problem of abnormal file download caused by non-standard file names.
2. Updated UI style of index access demonstration interface.
3. Updated UI style of markdown file preview.
4. Updated UI style of XML file preview, adjusted the architecture of text file preview to facilitate expansion.
5. Updated UI style of simTxT file preview.
6. Adjusted the UI of continuous preview of multiple images to flip up and down.
7. Simplified all file download IO operations by adopting the apache-common-io package.
8. XML file preview supports switching to pure text mode.
9. Enhanced prompt information when url base64 decoding fails.
10. Fixed import errors and image preview bug.
11. Fixed the problem of missing log directory when running the release package.
12. Fixed the bug of continuous preview of multiple images in the compressed package.
13. Fixed the problem of no universal matching for file type suffixes in uppercase and lowercase.
14. Specified the use of the Apache Commons-code implementation for Base64 encoding to fix exceptions occurring in some JDK versions.
15. Fixed the bug of HTML file preview of text-like files.
16. Fixed the problem of inability to switch between jpg and pdf when previewing dwg files.
17. Escaped dangerous characters to prevent reflected xss.
18. Fixed the problem of duplicate encoding causing the failure of document-to-image preview and standardized the encoding.

> December 27, 2020:

The year-end major update of 2020 includes comprehensive architecture design, complete code refactoring, significant improvement in code quality, and more convenient secondary development. We welcome you to review the source code and contribute to building by raising issues and pull requests.

1. Adjusted architecture modules, extensively refactored code, and improved code quality by several levels. Please feel free to review.
2. Enhanced XML file preview effect and added preview of XML document structure.
3. Added support for markdown file preview, including support for md rendering and switching between source text and preview.
4. Switched the underlying web server to jetty, resolving the issue: https://github.com/kekingcn/kkFileView/issues/168
5. Introduced cpdetector to solve the problem of file encoding recognition.
6. Adopted double encoding with base64 and urlencode for URLs to completely solve preview problems with bizarre file names.
7. Added configuration item office.preview.switch.disabled to control the switch of office file preview.
8. Optimized text file preview logic, transmitting content through Base64 to avoid requesting file content again during preview.
9. Disabled the image zoom effect in office preview mode to achieve consistent experience with image and pdf preview.
10. Directly set pdfbox to be compatible with lower version JDK, and there will be no warning prompts even when run in IDEA.
11. Removed non-essential toolkits like Guava and Hutool to reduce code volume.
12. Asynchronous loading of Office components speeds up application launch to within 5 seconds.
13. Reasonable settings of the number of threads in the preview consumption queue.
14. Fixed the bug where files in compressed packages failed to preview again.
15. Fixed the bug in image preview.

> May 20th 2020 ：
1. Support for global watermark and dynamic change of watermark content through parameters
2. Support for CAD file Preview
3. Add configuration item base.url, support using nginx reverse proxy and set context-path
4. All configuration items can be read from environment variables, which is convenient for docker image deployment and large-scale use in cluster
5. Support the configuration of TrustHost  (only the file source from the trust site can be previewed), and protect the preview service from abuse
6. Support configuration of customize cache cleanup time (cron expression)
7. All recognizable plain text can be previewed directly without downloading, such as .md .java .py, etc
8. Support configuration to limit PDF file download after conversion
9. Optimize Maven packaging configuration to solve the problem of line break in .sh script
10. Place all CDN dependencies on the front end locally for users without external network connection
11. Comment Service on home page switched from Sohu ChangYan to gitalk
12. Fixed preview exceptions that may be caused by special characters in the URL
13. Fixed the addtask exception of the transformation file queue
14. Fixed other known issues
15. Official website build: [https://kkview.cn](https://kkview.cn)
16. Official docker image repository build: [https://hub.docker.com/r/keking/kkfileview](https://hub.docker.com/r/keking/kkfileview)

> June 18th 2019 ：
1. Support automatic cleaning of cache and preview files
2. Support http/https stream url file preview
3. Support FTP url file preview
4. Add Docker build

> April 8th 2019
1. Cache and queue implementations abstract, providing JDK and REDIS implementations (REDIS becomes optional dependencies)
2. Provides zip and tar.gz packages, and provides a one-click startup script

> January 17th 2018

1. Refined the project directory, abstract file preview interface, Easy to extend more file extensions and depoly this project on your own
1. Added English documentation (@幻幻Fate，@汝辉) contribution
1. Support for more image file extensions
1. Fixed the issue that image carousel in zip file will always start from the first

> January 12th 2018

1. Support for multiple images preview 
1. Support for images rotation preview in rar/zip

> January 2nd 2018

1. Fixed gibberish issue when preview a txt document caused by the file encoding problem 
1. Fixed the issue that some module dependencies can not be found
1. Add a spring boot profile, and support for Multi-environment configuration 
1. Add `pdf.js` to preview the documents such as doc,etc.,support for generating doc headlines as pdf menu，support for mobile preview

## Security Configuration

### Security Features Overview

kkFileView includes comprehensive security mechanisms to prevent malicious file attacks, including:

- **Dangerous File Type Filtering** - Blocks potentially harmful file types (HTML, JS, PHP, etc.)
- **Domain Whitelist Control** - Restricts file access to trusted domains only
- **Content Security Scanning** - Detects and blocks malicious content in files
- **Secure Logging** - Masks sensitive URLs in logs to prevent information leakage

### Security Configuration Options

#### Basic Security Settings

```properties
# Enable security checks (default: true)
security.enabled = true

# Dangerous file types list (comma-separated)
security.dangerous.file.types = html,htm,js,jsp,php,asp,aspx,exe,bat,cmd,sh,vbs,ps1

# Enable strict domain checking (default: true)
security.strict.host.check = true

# Enable content security scanning (default: true)
security.content.check = true

# Enable URL masking in logs (default: true)
security.log.url.masking = true
```

#### Domain Trust Configuration

```properties
# Trusted domains (comma-separated)
trust.host = your-trusted-domain.com,another-trusted-domain.com

# Untrusted domains (comma-separated)
not.trust.host = malicious-domain.com,suspicious-domain.com
```

### Docker Environment Variables

#### Security Configuration

```yaml
version: '3.8'
services:
  kkfileview:
    image: kkape/kkfileview:latest
    container_name: kkfileview
    ports:
      - "8012:8012"
    environment:
      # Security Settings
      - KK_SECURITY_ENABLED=true
      - KK_DANGEROUS_FILE_TYPES=html,htm,js,jsp,php,asp,aspx,exe,bat,cmd,sh,vbs,ps1
      - KK_STRICT_HOST_CHECK=true
      - KK_CONTENT_SECURITY_CHECK=true
      - KK_LOG_URL_MASKING=true

      # Domain Trust Settings
      - KK_TRUST_HOST=your-domain.com,trusted-domain.com
      - KK_NOT_TRUST_HOST=malicious-domain.com

      # Basic Settings
      - KK_FILE_UPLOAD_DISABLE=true
      - KK_DELETE_PASSWORD=your-secure-password
      - KK_API_ENABLE=false
      - KK_CACHE_ENABLED=true

      # File and Office Settings
      - KK_FILE_DIR=/opt/kkFileView/file
      - KK_OFFICE_HOME=/opt/libreoffice
      - KK_PDF2JPG_DPI=144

      # Media Settings
      - KK_MEDIA_CONVERT_DISABLE=false
      - KK_MEDIA=mp3,wav,mp4,flv

    volumes:
      - /your/local/path:/opt/kkFileView-4.4.0/file
    restart: unless-stopped
```

#### Complete Environment Variables List

| Variable | Default | Description |
|----------|---------|-------------|
| **Security Variables** |
| `KK_SECURITY_ENABLED` | `true` | Enable/disable security checks |
| `KK_DANGEROUS_FILE_TYPES` | `html,htm,js,jsp,php,asp,aspx,exe,bat,cmd,sh,vbs,ps1` | Dangerous file types to block |
| `KK_STRICT_HOST_CHECK` | `true` | Enable strict domain checking |
| `KK_CONTENT_SECURITY_CHECK` | `true` | Enable content security scanning |
| `KK_LOG_URL_MASKING` | `true` | Mask sensitive URLs in logs |
| `KK_TRUST_HOST` | `default` | Trusted domains (comma-separated) |
| `KK_NOT_TRUST_HOST` | `default` | Untrusted domains (comma-separated) |
| **Basic Variables** |
| `KK_SERVER_PORT` | `8012` | Server port |
| `KK_CONTEXT_PATH` | `/` | Application context path |
| `KK_FILE_DIR` | `default` | File storage directory |
| `KK_CACHE_ENABLED` | `true` | Enable file caching |
| `KK_FILE_UPLOAD_DISABLE` | `false` | Disable file upload |
| `KK_DELETE_PASSWORD` | `123456` | Password for file deletion |
| `KK_API_ENABLE` | `true` | Enable REST API |
| `KK_BASE_URL` | `default` | Base URL for the service |
| **Office Variables** |
| `KK_OFFICE_HOME` | `default` | LibreOffice installation path |
| `KK_OFFICE_PREVIEW_TYPE` | `image` | Office preview type (image/pdf) |
| `KK_PDF2JPG_DPI` | `144` | PDF to image conversion DPI |
| **Media Variables** |
| `KK_MEDIA` | `mp3,wav,mp4,flv` | Supported media types |
| `KK_MEDIA_CONVERT_DISABLE` | `false` | Disable media conversion |
| `KK_CONVERTMEDIAS` | `avi,mov,wmv,mkv,3gp,rm` | Convertible media types |

### Security Best Practices

#### Production Environment

```yaml
environment:
  # Enable all security features
  - KK_SECURITY_ENABLED=true
  - KK_STRICT_HOST_CHECK=true
  - KK_CONTENT_SECURITY_CHECK=true
  - KK_LOG_URL_MASKING=true

  # Strict file type filtering
  - KK_DANGEROUS_FILE_TYPES=html,htm,js,jsp,php,asp,aspx,exe,bat,cmd,sh,vbs,ps1,scr,com,pif

  # Only allow trusted domains
  - KK_TRUST_HOST=your-company-domain.com

  # Disable unnecessary features
  - KK_FILE_UPLOAD_DISABLE=true
  - KK_API_ENABLE=false

  # Secure password
  - KK_DELETE_PASSWORD=your-very-secure-password
```

#### Development Environment

```yaml
environment:
  # Basic security enabled
  - KK_SECURITY_ENABLED=true
  - KK_STRICT_HOST_CHECK=false
  - KK_CONTENT_SECURITY_CHECK=true
  - KK_LOG_URL_MASKING=false

  # Relaxed file type filtering for testing
  - KK_DANGEROUS_FILE_TYPES=exe,bat,cmd,sh,vbs,ps1

  # Allow more domains for testing
  - KK_TRUST_HOST=localhost,127.0.0.1,test-domain.com
```

### Troubleshooting Docker Configuration Issues

#### Common Problem: Trust Host Not Working

**Issue**: You set `TRUST_HOST=allbs.cn` but domain filtering is not working.

**Possible Causes**:

1. **Incorrect Environment Variable Name**
   ```yaml
   # ❌ Wrong
   - TRUST_HOST=allbs.cn

   # ✅ Correct
   - KK_TRUST_HOST=allbs.cn
   ```

2. **Strict Host Check Disabled**
   ```yaml
   # Add this to enable strict checking
   - KK_STRICT_HOST_CHECK=true
   ```

3. **Security Features Disabled**
   ```yaml
   # Ensure security is enabled
   - KK_SECURITY_ENABLED=true
   ```

4. **Configuration Override**
   ```yaml
   # Make sure no conflicting settings
   - KK_NOT_TRUST_HOST=default  # Don't set conflicting blacklist
   ```

**Corrected Configuration**:
```yaml
kkfileview:
  image: kkape/kkfileview:latest
  container_name: kkfileview
  ports:
    - "8012:8012"
  environment:
    # Security Configuration
    - KK_SECURITY_ENABLED=true
    - KK_STRICT_HOST_CHECK=true

    # Domain Trust (use KK_ prefix)
    - KK_TRUST_HOST=allbs.cn
    - KK_NOT_TRUST_HOST=default

    # Other Settings
    - KK_FILE_UPLOAD_DISABLE=true
    - KK_DELETE_PASSWORD=66666
    - KK_API_ENABLE=false
  volumes:
    - /mnt/kkfileview:/opt/kkFileView-4.4.0/file
  restart: unless-stopped
```

#### Verification Steps

1. **Check Container Logs**
   ```bash
   docker logs kkfileview | grep -i "trust\|security"
   ```

2. **Test Domain Filtering**
   ```bash
   # Should be blocked (if not in trust list)
   curl "http://localhost:8012/onlinePreview?url=base64_encoded_url_from_untrusted_domain"

   # Should work (if in trust list)
   curl "http://localhost:8012/onlinePreview?url=base64_encoded_url_from_allbs.cn"
   ```

3. **Check Configuration Loading**
   ```bash
   # Enter container and check config
   docker exec -it kkfileview cat /opt/kkFileView-4.4.0/config/application.properties | grep trust
   ```

### Sponsor Us
If this project has been helpful to you, we welcome your sponsorship. Your support is our greatest motivation.！
