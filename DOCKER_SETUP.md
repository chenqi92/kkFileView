# Docker 自动构建和发布配置说明

## 概述

本项目已配置自动化Docker构建和发布流程，当`VERSION`文件发生变动时，会自动构建并推送Docker镜像到Docker Hub和GitHub Container Registry。

## 功能特性

- ✅ 支持多架构构建（AMD64 和 ARM64）
- ✅ 自动推送到Docker Hub和GitHub Container Registry
- ✅ 基于VERSION文件的版本管理
- ✅ 自动创建GitHub Release
- ✅ 构建缓存优化

## 配置要求

### 1. GitHub Secrets 配置

在GitHub仓库的Settings > Secrets and variables > Actions中添加以下secrets：

#### 必需的Secrets：
- `DOCKER_USERNAME`: Docker Hub用户名
- `DOCKER_PASSWORD`: Docker Hub密码或访问令牌

#### 自动提供的Secrets：
- `GITHUB_TOKEN`: GitHub自动提供，用于推送到GitHub Container Registry

### 2. Docker Hub访问令牌设置（推荐）

为了安全起见，建议使用Docker Hub访问令牌而不是密码：

1. 登录Docker Hub
2. 进入Account Settings > Security
3. 点击"New Access Token"
4. 创建一个具有读写权限的令牌
5. 将令牌作为`DOCKER_PASSWORD`添加到GitHub Secrets

## 使用方法

### 触发构建

1. 修改根目录下的`VERSION`文件
2. 提交并推送到master分支
3. GitHub Actions会自动触发构建流程

### 版本管理

- `VERSION`文件包含当前版本号（如：4.4.0）
- Docker镜像会使用VERSION文件中的版本号进行标记
- 同时会创建`latest`标签

### 生成的Docker镜像

构建完成后，会生成以下镜像：

#### Docker Hub:
- `{DOCKER_USERNAME}/kkfileview:{VERSION}`
- `{DOCKER_USERNAME}/kkfileview:latest`

#### GitHub Container Registry:
- `ghcr.io/{GITHUB_USERNAME}/kkfileview:{VERSION}` (仓库名自动转换为小写)
- `ghcr.io/{GITHUB_USERNAME}/kkfileview:latest`

## 支持的架构

- `linux/amd64` (x86_64)
- `linux/arm64` (ARM64/AArch64)

## 使用示例

```bash
# 使用特定版本
docker run -d -p 8012:8012 your-username/kkfileview:4.4.0

# 使用最新版本
docker run -d -p 8012:8012 your-username/kkfileview:latest

# 从GitHub Container Registry拉取
docker run -d -p 8012:8012 ghcr.io/your-username/kkfileview:latest
```

## 工作流文件

- `.github/workflows/maven.yml`: 基础Maven构建和测试
- `.github/workflows/docker-release.yml`: Docker构建和发布（当VERSION文件变动时触发）

## 版本管理说明

### VERSION文件与pom.xml版本的关系

- `VERSION`文件：用于Docker镜像标签，独立管理
- `pom.xml`中的版本：Maven项目版本，用于构建JAR包
- 两者可以不一致，Docker镜像会自动适配实际构建出的JAR包版本

### 版本更新流程

1. 修改`VERSION`文件为新版本号（如：4.5.0）
2. 提交并推送到master分支
3. GitHub Actions自动触发构建
4. 构建过程会：
   - 使用Maven编译项目（使用pom.xml中的版本）
   - 创建Docker镜像（使用VERSION文件中的标签）
   - 推送到Docker Hub和GitHub Container Registry
   - 创建GitHub Release

## 注意事项

1. 确保`VERSION`文件只包含版本号，不要有多余的空格或换行符
2. Docker构建只在master分支的VERSION文件变动时触发
3. 构建过程包括Maven编译，确保代码能够正常编译
4. 多架构构建可能需要较长时间，请耐心等待
5. Docker镜像会自动检测实际的应用版本，无需手动修改Dockerfile
6. 基础镜像版本（keking/kkfileview-base）可能与应用版本不同，这是正常的

## 重要说明

### 仓库名称大小写处理

- **GitHub Container Registry** 要求仓库名称必须是小写
- 工作流会自动将仓库名称转换为小写（如：`kkFileView` → `kkfileview`）
- Docker Hub 不受此限制影响

## 故障排除

### 常见问题：

1. **Docker Hub推送失败**
   - 检查`DOCKER_USERNAME`和`DOCKER_PASSWORD`是否正确配置
   - 确认Docker Hub账户有推送权限

2. **GitHub Container Registry推送失败**
   - 确认仓库的Package权限设置
   - 检查`GITHUB_TOKEN`权限
   - 注意：仓库名称会自动转换为小写

3. **多架构构建失败**
   - 检查Dockerfile是否支持多架构
   - 确认基础镜像支持目标架构

4. **标签格式错误**
   - 确保VERSION文件格式正确
   - GitHub Container Registry标签必须是小写

如有问题，请查看GitHub Actions的构建日志获取详细错误信息。
