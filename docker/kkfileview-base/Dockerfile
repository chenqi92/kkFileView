FROM ubuntu:24.04

RUN sed -i 's@//.*archive.ubuntu.com@//mirrors.aliyun.com@g' /etc/apt/sources.list.d/ubuntu.sources &&\
    sed -i 's@//security.ubuntu.com@//mirrors.aliyun.com@g' /etc/apt/sources.list.d/ubuntu.sources &&\
    sed -i 's@//ports.ubuntu.com@//mirrors.aliyun.com@g' /etc/apt/sources.list.d/ubuntu.sources &&\
	apt-get update &&\
    export DEBIAN_FRONTEND=noninteractive &&\
	apt-get install -y --no-install-recommends openjdk-8-jre tzdata locales xfonts-utils fontconfig libreoffice-nogui &&\
    echo 'Asia/Shanghai' > /etc/timezone &&\
    ln -sf /usr/share/zoneinfo/Asia/Shanghai /etc/localtime &&\
    localedef -i zh_CN -c -f UTF-8 -A /usr/share/locale/locale.alias zh_CN.UTF-8 &&\
    locale-gen zh_CN.UTF-8 &&\
    apt-get install -y --no-install-recommends ttf-mscorefonts-installer &&\
    apt-get install -y --no-install-recommends ttf-wqy-microhei ttf-wqy-zenhei xfonts-wqy &&\
	apt-get autoremove -y &&\
    apt-get clean &&\
    rm -rf /var/lib/apt/lists/*

# 创建字体目录
RUN mkdir -p /usr/share/fonts/chinese

# 内置一些常用的中文字体，避免普遍性乱码（如果存在的话）
COPY fonts/ /usr/share/fonts/chinese/

RUN cd /usr/share/fonts/chinese &&\
    # 安装字体（如果有字体文件的话）
    if [ "$(ls -A .)" ]; then \
        mkfontscale && \
        mkfontdir && \
        fc-cache -fv; \
    else \
        echo "No custom fonts found, using system fonts only"; \
    fi

ENV LANG=zh_CN.UTF-8 LC_ALL=zh_CN.UTF-8
