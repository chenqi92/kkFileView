# 使用构建参数来传递版本号和Docker用户名
ARG VERSION=4.4.0
ARG DOCKER_USERNAME=keking

# 使用我们构建的基础镜像
FROM ${DOCKER_USERNAME}/kkfileview-base:${VERSION}

# 添加构建的应用程序
ADD server/target/kkFileView-*.tar.gz /opt/

# 创建启动脚本来动态处理版本号
RUN echo '#!/bin/bash' > /opt/start.sh && \
    echo '# 动态检测实际的应用版本' >> /opt/start.sh && \
    echo 'APP_DIR=$(ls -d /opt/kkFileView-* 2>/dev/null | head -1)' >> /opt/start.sh && \
    echo 'if [ -z "$APP_DIR" ]; then' >> /opt/start.sh && \
    echo '  echo "Error: kkFileView application directory not found"' >> /opt/start.sh && \
    echo '  exit 1' >> /opt/start.sh && \
    echo 'fi' >> /opt/start.sh && \
    echo 'APP_VERSION=$(basename "$APP_DIR" | sed "s/kkFileView-//")' >> /opt/start.sh && \
    echo 'export KKFILEVIEW_BIN_FOLDER="$APP_DIR/bin"' >> /opt/start.sh && \
    echo 'echo "Starting kkFileView version: $APP_VERSION"' >> /opt/start.sh && \
    echo 'echo "Using directory: $APP_DIR"' >> /opt/start.sh && \
    echo 'exec java -Dfile.encoding=UTF-8 -Dspring.config.location="$APP_DIR/config/application.properties" -jar "$APP_DIR/bin/kkFileView-$APP_VERSION.jar" "$@"' >> /opt/start.sh && \
    chmod +x /opt/start.sh

# 暴露端口
EXPOSE 8012

ENTRYPOINT ["/opt/start.sh"]
