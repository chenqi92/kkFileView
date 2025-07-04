# kkFileView
文档在线预览项目解决方案，项目使用流行的spring boot搭建，易上手和部署。万能的文件预览开源项目，基本支持主流文档格式预览，如：
1. 支持 doc, docx, xls, xlsx, xlsm, ppt, pptx, csv, tsv, dotm, xlt, xltm, dot, dotx,xlam, xla ,pages 等 Office 办公文档
2. 支持 wps, dps, et, ett, wpt 等国产 WPS Office 办公文档
3. 支持 odt, ods, ots, odp, otp, six, ott, fodt, fods 等OpenOffice、LibreOffice 办公文档
4. 支持 vsd, vsdx 等 Visio 流程图文件
5. 支持 wmf, emf 等 Windows 系统图像文件
6. 支持 psd ,eps 等 Photoshop 软件模型文件
7. 支持 pdf ,ofd, rtf 等文档
8. 支持 xmind 软件模型文件
9. 支持 bpmn 工作流文件
10. 支持 eml 邮件文件
11. 支持 epub 图书文档
12. 支持 obj, 3ds, stl, ply, gltf, glb, off, 3dm, fbx, dae, wrl, 3mf, ifc, brep, step, iges, fcstd, bim 等 3D 模型文件
13. 支持 dwg, dxf, dwf, iges , igs, dwt, dng, ifc, dwfx, stl, cf2, plt 等 CAD 模型文件
14. 支持 txt, xml(渲染), xbrl(渲染), md(渲染), java, php, py, js, css 等所有纯文本
15. 支持 zip, rar, jar, tar, gzip, 7z 等压缩包
16. 支持 jpg, jpeg, png, gif, bmp, ico, jfif, webp 等图片预览（翻转，缩放，镜像）
17. 支持 tif, tiff 图信息模型文件
18. 支持 tga 图像格式文件
19. 支持 svg 矢量图像格式文件
20. 支持 mp3,wav,mp4,flv 等音视频格式文件
21. 支持 avi,mov,rm,webm,ts,rm,mkv,mpeg,ogg,mpg,rmvb,wmv,3gp,ts,swf 等视频格式转码预览
22. 支持 dcm 等医疗数位影像预览
23. 支持 drawio 绘图预览

> 基于当前良好的架构模式，支持的文件类型在进一步丰富中
### 项目特性

- 使用 spring-boot 开发，预览服务搭建部署非常简便
- rest 接口提供服务，跨语言、跨平台特性(java,php,python,go,php，....)都支持，应用接入简单方便
- 抽象预览服务接口，方便二次开发，非常方便添加其他类型文件预览支持
- **增强安全机制** - 全面的安全防护体系，有效防范恶意文件攻击
- 最最重要 Apache 协议开源，代码 pull 下来想干嘛就干嘛

### 官网及文档

地址：[https://kkview.cn](https://kkview.cn/)

### 在线体验
> 请善待公共服务，会不定时停用

地址：[https://file.kkview.cn](https://file.kkview.cn)

### 项目文档（Project documentation）
1. 详细使用文档：https://kkview.cn/zh-cn/docs/home.html

### 联系我们，加入组织
> 我们会用心回答解决大家在项目使用中的问题，也请大家在提问前至少 Google 或 baidu 过，珍爱生命远离无效的交流沟通

<img src="./doc/gitee星球.png/" width="60%">

### 文档预览效果
#### 1. 文本预览
支持所有类型的文本文档预览， 由于文本文档类型过多，无法全部枚举，默认开启的类型如下 txt,html,htm,asp,jsp,xml,xbrl,json,properties,md,gitignore,log,java,py,c,cpp,sql,sh,bat,m,bas,prg,cmd  
文本预览效果如下  
![文本预览效果如下](./doc/img/preview/preview-text.png)      

#### 2. 图片预览
支持jpg，jpeg，png，gif等图片预览（翻转，缩放，镜像），预览效果如下  
![图片预览](./doc/img/preview/preview-image.png)  

#### 3. word文档预览
支持doc，docx文档预览，word预览有两种模式：一种是每页word转为图片预览，另一种是整个word文档转成pdf，再预览pdf。两种模式的适用场景如下  
* 图片预览：word文件大，前台加载整个pdf过慢
* pdf预览：内网访问，加载pdf快
图片预览模式预览效果如下  
![word文档预览1](./doc/img/preview/preview-doc-image.png)  
pdf预览模式预览效果如下  
![word文档预览2](./doc/img/preview/preview-doc-pdf.png)  

#### 4. ppt文档预览
支持ppt，pptx文档预览，和word文档一样，有两种预览模式  
图片预览模式预览效果如下  
![ppt文档预览1](./doc/img/preview/preview-ppt-image.png)  
pdf预览模式预览效果如下  
![ppt文档预览2](./doc/img/preview/preview-ppt-pdf.png)  

#### 5. pdf文档预览
支持pdf文档预览，和word文档一样，有两种预览模式   
图片预览模式预览效果如下  
![pdf文档预览1](./doc/img/preview/preview-pdf-image.png)  
pdf预览模式预览效果如下   
![pdf文档预览2](./doc/img/preview/preview-pdf-pdf.png)    

#### 6. excel文档预览
支持xls，xlsx文档预览，预览效果如下  
![excel文档预览](./doc/img/preview/preview-xls.png)  

#### 7. 压缩文件预览
支持zip,rar,jar,tar,gzip等压缩包，预览效果如下  
![压缩文件预览1](./doc/img/preview/preview-zip.png)  
可点击压缩包中的文件名，直接预览文件，预览效果如下  
![压缩文件预览2](./doc/img/preview/preview-zip-inner.png)  

#### 8. 多媒体文件预览
理论上支持所有的视频、音频文件，由于无法枚举所有文件格式，默认开启的类型如下  
mp3,wav,mp4,flv  
视频预览效果如下  
![多媒体文件预览1](./doc/img/preview/preview-video.png)  
音频预览效果如下  
![多媒体文件预览2](./doc/img/preview/preview-audio.png)  

#### 9. CAD文档预览
支持CAD dwg文档预览，和word文档一样，有两种预览模式  
图片预览模式预览效果如下  
![cad文档预览1](./doc/img/preview/preview-cad-image.png)  
pdf预览模式预览效果如下  
![cad文档预览2](./doc/img/preview/preview-cad-pdf.png)

#### 10. Excel文件纯前端渲染效果

![Excel文件纯前端渲染效果](./doc/img/preview/preview-xlsx-web.png)  

#### 11. 流程图bpmn文件预览效果

![流程图bpmn文件预览效果](./doc/img/preview/preview-bpmn.png)  

#### 12. 3D模型文件预览效果：

![3D模型文件预览效果](./doc/img/preview/preview-3ds.png)  

#### 13. dcm医疗数位影像文件预览效果：

![dcm医疗数位影像文件预览效果](./doc/img/preview/preview-dcm.png) 

#### 14. drawio流程图预览效果：

![drawio流程图预览效果](./doc/img/preview/preview-drawio.png) 

考虑说明篇幅原因，就不贴其他格式文件的预览效果了，感兴趣的可以参考下面的实例搭建下

### 快速开始
> 项目使用技术
- spring boot： [spring boot开发参考指南](http://www.kailing.pub/PdfReader/web/viewer.html?file=springboot)
- freemarker
- redisson 
- jodconverter

> 依赖外部环境
- redis (可选，默认不用)
- OpenOffice 或者 LibreOffice( Windows 下已内置，Linux 脚本启动模式会自动安装，Mac OS 下需要手动安装)

1. 第一步：pull 项目 https://github.com/kekingcn/file-online-preview.git

3. 第二步：运行 ServerMain 的 main 方法，服务启动后，访问 http://localhost:8012/
会看到如下界面，代表服务启动成功
   
![输入图片说明](https://gitee.com/uploads/images/2017/1213/100221_ea15202e_492218.png "屏幕截图.png")

### 历史更新记录

#### > 2025年01月16日，v4.4.0 版本发布 ：

### 新增功能
1. xlsx 新增支持打印功能
2. 配置文件新增启用 GZIP 压缩
3. CAD 格式新增支持转换成 SVG 和 TIF 格式，新增超时结束、线程管理
4. 新增删除文件使用验证码校验
5. 新增 xbrl 格式预览支持
6. PDF 预览新增控制签名、绘图、插图控制、搜索定位页码、定义显示内容等功能
7. 新增 CSV 格式前端解析支持
8. 新增 ARM64 下的 Docker 镜像支持
9. 新增 Office 预览支持转换超时属性设置功能
10. 新增预览文件 host 黑名单机制

### 优化
1. 优化 OFD 移动端预览 页面不自适应
2. 更新 xlsx 前端解析组件，加速解析速度
3. 升级 CAD 组件
4. office 功能调整，支持批注、转换页码限制、生成水印等功能
5. 升级 markdown 组件
6. 升级 dcm 解析组件
7. 升级 PDF.JS 解析组件
8. 更换视频播放插件为 ckplayer
9. tif 解析更加智能化，支持被修改的图片格式
10. 针对大小文本文件检测字符编码的正确率，处理并发隐患
11. 重构下载文件的代码，新增通用的文件服务器认证访问的设计
12. 更新 bootstrap 组件，并精简掉不需要的文件
13. 更新 epub 版本，优化 epub 显示效果
14. 解决定时清除缓存时，对于多媒体类型文件，只删除了磁盘缓存文件
15. 自动检测已安装 Office 组件，增加 LibreOffice 7.5 & 7.6 版本默认路径
16. 修改 drawio 默认为预览模式
17. 新增 PDF 线程管理、超时管理、内存缓存管理，更新 PDF 解析组件版本
18. 优化 Dockerfile，支持真正的跨平台构建镜像

### 修复
1. 修复 forceUpdatedCache 属性设置，但本地缓存文件不更新的问题
2. 修复 PDF 解密加密文件转换成功后后台报错的问题
3. 修复 BPMN 不支持跨域的问题
4. 修复压缩包二级反代特殊符号错误问题
5. 修复视频跨域配置导致视频无法预览的问题
6. 修复 TXT 文本类分页二次加载问题
7. 修复 Drawio 缺少 Base64 组件的问题
8. 修复 Markdown 被转义问题
9. 修复 EPUB 跨域报错问题
10. 修复 URL 特殊符号问题
11. 修复压缩包穿越漏洞
12. 修复压缩获取路径错误、图片合集路径错误、水印问题等 BUG
13. 修复前端解析 XLSX 包含 EMF 格式文件错误问题

#### > 2023年07月05日，v4.3.0 版本发布 ：

#### 新增功能:
1. 新增dcm等医疗数位影像预 
2. 新增drawio绘图预览
3. 新增开启缓存的情况下重新生成的命令 &forceUpdatedCache=true
4. 新增dwg CAD文件预览
5. 新增PDF文件支持密码功能
6. 新增PDF文件生成图片的dpi自定义配置
7. 新增删除转换后OFFICE、CAD、TIFF、压缩包源文件配置 默认开启 节约磁盘空间
8. 新增前端解析xlsx方法
9. 新增pages,eps, iges , igs, dwt, dng, ifc, dwfx, stl, cf2, plt等格式支持 

#### 优化:
1. 调整生成的PDF文件 文件名称添加文件后缀 防止生成同名文件
2. 调整SQL文件预览方式
3. 优化OFD预览兼容性
4. 美化TXT文本 分页框的显示
5. 升级Linux、Docker版内置office为LibreOffice-7.5.3版本
6. 升级Windows版内置office为LibreOffice-7.5.3 Portable版本
7. 其他功能优化

#### 修复:
1. 修复反代情况下压缩包获取路径错误
2. 修复预览图片的url中如果包含&会导致.click报错
3. 修复OFD预览部分已知问题
4. 修复预览压缩包时，如果点击的是文件目录（树节点），页面会报错
5. 其他已知问题修复

#### > 2023年04月18日，v4.2.1 版本发布 ：

#### 更新日志:

1. 修复 dwg 文件预览报空指针的 bug  

#### > 2023年04月13日，v4.2.0 版本发布 ：

#### 新增功能:
1. 新增 SVG 格式文件预览支持
2. 新增加密的 Office 文件预览支持
3. 新增加密的 zip、rar 等压缩包文件预览支持
4. 新增 xmind 软件模型文件预览支持
5. 新增 bpmn 工作流模型文件预览支持
6. 新增 eml 邮件文件预览支持
7. 新增 epub 电子书文件预览支持
8. 新增 dotm,ett,xlt,xltm,wpt,dot,xlam,xla,dotx 等格式的办公文档预览支持
9. 新增 obj, 3ds, stl, ply, gltf, glb, off, 3dm, fbx, dae, wrl, 3mf, ifc, brep, step, iges, fcstd, bim 等 3D 模型文件预览支持
10. 新增可配置限制高风险文件上传的功能，比如 exe 文件
11. 新增可配置站点的备案信息
12. 新增演示站点删除文件需要密码的功能  

#### 优化:
1. 文本文档预览加入缓存
2. 美化 404、500 报错页
3. 优化发票等 ofd 文件预览的印证渲染兼容性
4. 移除 office-plugin 模块, 使用新版 jodconverter组件
5. 优化 Excel 文件的预览效果
6. 优化 CAD 文件的预览效果
7. 更新 xstream 、junrar、pdfbox 等依赖的版本
8. 更新 TIF 文件转换 PDF 的插件，添加转换缓存
9. 优化演示页 UI 部署
10. 压缩包文件预览支持目录

#### 修复:
1. 修复部分接口 XSS 问题
2. 修复控制台打印的演示地址不跟着 content-path 配置走的问题
3. 修复 ofd 文件预览跨域问题
4. 修复内部自签证书 https 协议 url 文件无法下载的问题
5. 修复特殊符号的文件无法删除的问题
6. 修复 PDF 转图片,内存无法回收导致的 OOM
7. 修复 xlsx7.4 以上版本文件预览乱码的问题
8. 修复 TrustHostFilter 未拦截跨域接口的问题，这是一个安全问题，有使用到 TrustHost 功能的务必升级
9. 修复压缩包文件预览在 Linux 系统下文件名乱码的问题
10. 修复 ofd 文件预览页码只能显示10页的问题

#### > 2022年12月14日，v4.1.0 版本发布 ：

1. 全新首页视觉 @wsd7747 
2. tif图片预览兼容多页tif的pdf转换、jpg转换，以及jpg在线多页预览功能 @zhangzhen1979
3. 优化docker构建方案，使用分层构建方式 @yl-yue
4. 实现基于userToken缓存加密文件 @yl-yue
5. 实现加密word、ppt、excel文件预览 @yl-yue
6. Linux & Docker镜像升级LibreOffice 7.3
7. 更新OFD预览组件、更新tif预览组件、更新PPT水印支持
8. 大量其他升级优化 & 已知问题修复

感谢 @yl-yue @wsd7747 @zhangzhen1979 @tomhusky @shenghuadun @kischn.sun 的代码贡献

#### > 2021年7月6日，v4.0.0 版本发布 ：

1. 底层集成OpenOffice替换为LibreOffice，Office文件兼容性增强，预览效果提升
2. 修复压缩文件目录穿越漏洞
3. 修复PPT预览使用PDF模式无效
4. 修复PPT图片预览模式前端显示异常
5. 新增功能：首页文件上传功能可通过配置实时开启或禁用
6. 优化增加Office进程关闭日志
7. 优化Windows环境下，查找Office组件逻辑(内置的LibreOffice优先)
8. 优化启动Office进程改同步执行

#### > 2021年6月17日，v3.6.0 版本发布 ：

ofd 类型文件支持版本，本次版本重要功能均由社区开发贡献，感谢 @gaoxingzaq、@zhangxiaoxiao9527 的代码贡献
1. 新增 ofd 类型文件预览支持，ofd 是国产的类似 pdf 格式的文件
2. 新增了 ffmpeg 视频文件转码预览支持，打开转码功能后，理论上支持所有主流视频的预览，如 rm、rmvb、flv 等
3. 美化了 ppt、pptx 类型文件预览效果，比之前版本好看太多
4. 更新了 pdfbox、xstream、common-io 等依赖的版本

#### > 2021年1月28日 ：

2020农历年最后一个版本发布，主要包含了部分 UI 改进，和解决了 QQ 群友、 Issue 里反馈的 Bug 修复，最最重要的是发个新版，过个好年

1. 引入galimatias,解决不规范文件名导致文件下载异常
2. 更新index接入演示界面UI风格
3. 更新markdown文件预览UI风格
4. 更新XML文件预览UI风格，调整类文本预览架构，更方便扩展
5. 更新simTxT文件预览UI风格
6. 调整多图连续预览上下翻图的UI
7. 采用apache-common-io包简化所有的文件下载io操作
8. XML文件预览支持切换纯文本模式
9. 增强url base64解码失败时的提示信息
10. 修复导包错误以及图片预览 bug
11. 修复发行包运行时找不到日志目录的问题
12. 修复压缩包内多图连续预览的bug
13. 修复大小写文件类型后缀没通用匹配的问题
14. 指定Base64转码采用Apache Commons-code中的实现，修复base64部分jdk版本下出现的异常
15. 修复类文本类型HTML文件预览的bug
16. 修复：dwg文件预览时无法在jpg和pdf两种类型之间切换
17. escaping of dangerous characters to prevent reflected xss
18. 修复重复编码导致文档转图片预览失败的问题&编码规范

#### > 2020年12月27日 ：

2020年年终大版本更新，架构全面设计，代码全面重构，代码质量全面提升，二次开发更便捷，欢迎拉源码品鉴，提issue、pr共同建设

1. 架构模块调整,大量的代码重构，代码质量提升N个等级，欢迎品鉴
2. 增强XML文件预览效果，新增XML文档数结构预览
3. 新增markdown文件预览支持，预览支持md渲染和源文本切换支持
4. 切换底层web server为jetty，解决这个issue：https://github.com/kekingcn/kkFileView/issues/168
5. 引入cpdetector，解决文件编码识别问题
6. url采用base64+urlencode双编码，彻底解决各种奇葩文件名预览问题
7. 新增配置项office.preview.switch.disabled，控制offic文件预览切换开关
8. 优化文本类型文件预览逻辑，采用Base64传输内容，避免预览时再次请求文件内容
9. office预览图片模式禁用图片放大效果，达到图片和pdf预览效果一致的体验
10. 直接代码静态设置pdfbox兼容低版本jdk，在IDEA中运行也不会有警告提示 
11. 移除guava、hutool等非必须的工具包，减少代码体积
12. Office组件加载异步化，提速应用启动速度最快到5秒内
13. 合理设置预览消费队列的线程数
14. 修复压缩包里文件再次预览失败的bug
15. 修复图片预览的bug

#### > 2020年05月20日 ：
1. 新增支持全局水印，并支持通过参数动态改变水印内容
2. 新增支持CAD文件预览
3. 新增base.url配置，支持使用nginx反向代理和使用context-path
4. 支持所有配置项支持从环境变量里读取，方便Docker镜像部署和集群中大规模使用
5. 支持配置限信任站点（只能预览来自信任点的文件源），保护预览服务不被滥用
6. 支持配置自定义缓存清理时间（cron表达式）
7. 全部能识别的纯文本直接预览，不用再转跳下载，如.md .java .py等
8. 支持配置限制转换后的PDF文件下载
9. 优化maven打包配置，解决 .sh 脚本可能出现换行符问题
10. 将前端所有CDN依赖放到本地，方便没有外网连接的用户使用
11. 首页评论服务由搜狐畅言切换到Gitalk
12. 修复url中包含特殊字符可能会引起的预览异常
13. 修复转换文件队列addTask异常
14. 修复其他已经问题
15. 官网建设：[https://kkview.cn](https://kkview.cn/)
16. 官方Docker镜像仓库建设：[https://hub.docker.com/r/keking/kkfileview](https://hub.docker.com/r/keking/kkfileview)

#### > 2019年06月18日 ：
1. 支持自动清理缓存及预览文件
2. 支持http/https下载流url文件预览
3. 支持FTP url文件预览
4. 加入Docker构建

#### > 2019年04月08日 ：
1. 缓存及队列实现抽象，提供JDK和REDIS两种实现(REDIS成为可选依赖)
2. 打包方式提供zip和tar.gz包，并提供一键启动脚本

#### > 2018年01月19日 ：

1. 大文件入队提前处理
1. 新增addTask文件转换入队接口 
1. 采用redis队列，支持kkFIleView接口和异构系统入队两种方式

#### > 2018年01月17日 ：

1. 优化项目结构，抽象文件预览接口，更方便的加入更多的文件类型预览支持，方便二次开发
1. 新增英文文档说明（@幻幻Fate，@汝辉）贡献
1. 新增图片预览文件支持类型
1. 修复压缩包内轮播图片总是从第一张开始的问题

#### > 2018年01月12日 ：

1. 新增多图片同时预览 
1. 支持压缩包内图片轮番预览

#### > 2018年01月02日 ： 

1. 修复txt等文本编码问题导致预览乱码 
1. 修复项目模块依赖引入不到的问题 
1. 新增spring boot profile，支持多环境配置 
1. 引入pdf.js预览doc等文件，支持doc标题生成pdf预览菜单，支持手机端预览


### 关于引用
ofd    引用于 [ofdview ](https://gitee.com/cnofd/ofdview ) 开源协议 Apache-2.0  
CAD    引用于 aspose-cad 测试版本 商用请自行购买  
xmind  引用于 [ xmind-embed-viewer](https://github.com/xmindltd/xmind-embed-viewer) 开源协议 MIT  
epub   引用于 [ epub.js](https://github.com/futurepress/epub.js) 开源协议 BSD许可证  
压缩包 引用于 [sevenzipjbinding](https://github.com/borisbrodski/sevenzipjbinding )开源协议LGPL  
3D     引用于 [Online3DViewer](https://github.com/kovacsv/Online3DViewer )开源协议MIT  
drawio 引用于 [drawio](https://github.com/jgraph/drawio )开源协议 Apache-2.0  
bpmn流程图     引用于 [bpmn-js](https://github.com/bpmn-io/bpmn-js ) 自定义协议 保留水印 具体自行查看  
dcm医疗数位影像  引用于 [dcmjs](https://github.com/dcmjs-org/dcmjs )开源协议MIT  

### 使用登记
如果这个项目解决了你的实际问题，可在 https://gitee.com/kekingcn/file-online-preview/issues/IGSBV
登记下，如果节省了你的三方预览服务费用，也愿意支持下的话，可点击下方【捐助】请作者喝杯咖啡，也是非常感谢

### Stars

#### GitHub

[![Stargazers over time](https://starchart.cc/kekingcn/kkFileView.svg)](https://starchart.cc/kekingcn/kkFileView)

## 安全配置

### 安全特性概述

kkFileView 包含全面的安全机制来防范恶意文件攻击，包括：

- **危险文件类型过滤** - 阻止潜在有害的文件类型（HTML、JS、PHP等）
- **域名白名单控制** - 限制只能访问可信域名的文件
- **内容安全扫描** - 检测并阻止文件中的恶意内容
- **安全日志记录** - 对日志中的敏感URL进行脱敏处理

### 安全配置选项

#### 基础安全设置

```properties
# 启用安全检查（默认：true）
security.enabled = true

# 危险文件类型列表（逗号分隔）
security.dangerous.file.types = html,htm,js,jsp,php,asp,aspx,exe,bat,cmd,sh,vbs,ps1

# 启用严格域名检查（默认：true）
security.strict.host.check = true

# 启用内容安全扫描（默认：true）
security.content.check = true

# 启用日志URL脱敏（默认：true）
security.log.url.masking = true
```

#### 域名信任配置

```properties
# 可信域名列表（逗号分隔）
trust.host = your-trusted-domain.com,another-trusted-domain.com

# 不可信域名列表（逗号分隔）
not.trust.host = malicious-domain.com,suspicious-domain.com
```

### Docker 环境变量配置

#### 安全配置示例

```yaml
version: '3.8'
services:
  kkfileview:
    image: kkape/kkfileview:latest
    container_name: kkfileview
    ports:
      - "8012:8012"
    environment:
      # 安全设置
      - KK_SECURITY_ENABLED=true
      - KK_DANGEROUS_FILE_TYPES=html,htm,js,jsp,php,asp,aspx,exe,bat,cmd,sh,vbs,ps1
      - KK_STRICT_HOST_CHECK=true
      - KK_CONTENT_SECURITY_CHECK=true
      - KK_LOG_URL_MASKING=true

      # 域名信任设置
      - KK_TRUST_HOST=your-domain.com,trusted-domain.com
      - KK_NOT_TRUST_HOST=malicious-domain.com

      # 基础设置
      - KK_FILE_UPLOAD_DISABLE=true
      - KK_DELETE_PASSWORD=your-secure-password
      - KK_API_ENABLE=false
      - KK_CACHE_ENABLED=true

      # 文件和Office设置
      - KK_FILE_DIR=/opt/kkFileView/file
      - KK_OFFICE_HOME=/opt/libreoffice
      - KK_PDF2JPG_DPI=144

      # 媒体设置
      - KK_MEDIA_CONVERT_DISABLE=false
      - KK_MEDIA=mp3,wav,mp4,flv

    volumes:
      - /your/local/path:/opt/kkFileView-4.4.0/file
    restart: unless-stopped
```

#### 完整环境变量列表

| 变量名 | 默认值 | 说明 |
|--------|--------|------|
| **安全相关变量** |
| `KK_SECURITY_ENABLED` | `true` | 启用/禁用安全检查 |
| `KK_DANGEROUS_FILE_TYPES` | `html,htm,js,jsp,php,asp,aspx,exe,bat,cmd,sh,vbs,ps1` | 需要阻止的危险文件类型 |
| `KK_STRICT_HOST_CHECK` | `true` | 启用严格域名检查 |
| `KK_CONTENT_SECURITY_CHECK` | `true` | 启用内容安全扫描 |
| `KK_LOG_URL_MASKING` | `true` | 日志中URL脱敏 |
| `KK_TRUST_HOST` | `default` | 可信域名列表（逗号分隔） |
| `KK_NOT_TRUST_HOST` | `default` | 不可信域名列表（逗号分隔） |
| **基础变量** |
| `KK_SERVER_PORT` | `8012` | 服务端口 |
| `KK_CONTEXT_PATH` | `/` | 应用上下文路径 |
| `KK_FILE_DIR` | `default` | 文件存储目录 |
| `KK_CACHE_ENABLED` | `true` | 启用文件缓存 |
| `KK_FILE_UPLOAD_DISABLE` | `false` | 禁用文件上传 |
| `KK_DELETE_PASSWORD` | `123456` | 文件删除密码 |
| `KK_API_ENABLE` | `true` | 启用REST API |
| `KK_BASE_URL` | `default` | 服务基础URL |
| **Office相关变量** |
| `KK_OFFICE_HOME` | `default` | LibreOffice安装路径 |
| `KK_OFFICE_PREVIEW_TYPE` | `image` | Office预览类型（image/pdf） |
| `KK_PDF2JPG_DPI` | `144` | PDF转图片DPI |
| **媒体相关变量** |
| `KK_MEDIA` | `mp3,wav,mp4,flv` | 支持的媒体类型 |
| `KK_MEDIA_CONVERT_DISABLE` | `false` | 禁用媒体转换 |
| `KK_CONVERTMEDIAS` | `avi,mov,wmv,mkv,3gp,rm` | 可转换的媒体类型 |

### 安全最佳实践

#### 生产环境配置

```yaml
environment:
  # 启用所有安全功能
  - KK_SECURITY_ENABLED=true
  - KK_STRICT_HOST_CHECK=true
  - KK_CONTENT_SECURITY_CHECK=true
  - KK_LOG_URL_MASKING=true

  # 严格的文件类型过滤
  - KK_DANGEROUS_FILE_TYPES=html,htm,js,jsp,php,asp,aspx,exe,bat,cmd,sh,vbs,ps1,scr,com,pif

  # 只允许可信域名
  - KK_TRUST_HOST=your-company-domain.com

  # 禁用不必要的功能
  - KK_FILE_UPLOAD_DISABLE=true
  - KK_API_ENABLE=false

  # 安全密码
  - KK_DELETE_PASSWORD=your-very-secure-password
```

#### 开发环境配置

```yaml
environment:
  # 启用基础安全检查
  - KK_SECURITY_ENABLED=true
  - KK_STRICT_HOST_CHECK=false
  - KK_CONTENT_SECURITY_CHECK=true
  - KK_LOG_URL_MASKING=false

  # 放宽文件类型限制用于测试
  - KK_DANGEROUS_FILE_TYPES=exe,bat,cmd,sh,vbs,ps1

  # 允许更多域名用于测试
  - KK_TRUST_HOST=localhost,127.0.0.1,test-domain.com
```

### Docker配置问题排查

#### 常见问题：信任域名不生效

**问题**：设置了 `TRUST_HOST=allbs.cn` 但域名过滤不起作用。

**可能原因**：

1. **环境变量名称错误**
   ```yaml
   # ❌ 错误
   - TRUST_HOST=allbs.cn

   # ✅ 正确
   - KK_TRUST_HOST=allbs.cn
   ```

2. **未启用严格域名检查**
   ```yaml
   # 添加此配置启用严格检查
   - KK_STRICT_HOST_CHECK=true
   ```

3. **安全功能被禁用**
   ```yaml
   # 确保安全功能已启用
   - KK_SECURITY_ENABLED=true
   ```

4. **配置冲突**
   ```yaml
   # 确保没有冲突的设置
   - KK_NOT_TRUST_HOST=default  # 不要设置冲突的黑名单
   ```

**修正后的配置**：
```yaml
kkfileview:
  image: kkape/kkfileview:latest
  container_name: kkfileview
  ports:
    - "8012:8012"
  environment:
    # 安全配置
    - KK_SECURITY_ENABLED=true
    - KK_STRICT_HOST_CHECK=true

    # 域名信任（使用KK_前缀）
    - KK_TRUST_HOST=allbs.cn
    - KK_NOT_TRUST_HOST=default

    # 其他设置
    - KK_FILE_UPLOAD_DISABLE=true
    - KK_DELETE_PASSWORD=66666
    - KK_API_ENABLE=false
  volumes:
    - /mnt/kkfileview:/opt/kkFileView-4.4.0/file
  restart: unless-stopped
```

#### 验证步骤

1. **检查容器日志**
   ```bash
   docker logs kkfileview | grep -i "trust\|security"
   ```

2. **测试域名过滤**
   ```bash
   # 应该被阻止（如果不在信任列表中）
   curl "http://localhost:8012/onlinePreview?url=base64_encoded_url_from_untrusted_domain"

   # 应该正常工作（如果在信任列表中）
   curl "http://localhost:8012/onlinePreview?url=base64_encoded_url_from_allbs.cn"
   ```

3. **检查配置加载**
   ```bash
   # 进入容器检查配置
   docker exec -it kkfileview cat /opt/kkFileView-4.4.0/config/application.properties | grep trust
   ```

### 鸣谢
- 本项目诞生于[凯京集团]，在取得公司高层同意后以 Apache 协议开源出来反哺社区，在此特别感谢凯京集团，以及集团领导[@唐老大](https://github.com/tangshd)的支持、@端木详笑的贡献。
- 本项目已脱离公司由[KK开源社区]维护发展壮大，感谢所有给 kkFileView 提 Issue 、Pr 开发者
- 本项目引入的第三方组件已在 '关于引用' 列表列出，感谢这些项目，让 kkFileView 更出色

