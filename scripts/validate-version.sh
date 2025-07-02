#!/bin/bash

# 验证VERSION文件格式的脚本

VERSION_FILE="VERSION"

if [ ! -f "$VERSION_FILE" ]; then
    echo "❌ ERROR: VERSION file not found!"
    exit 1
fi

# 读取版本号并去除空白字符
VERSION=$(cat "$VERSION_FILE" | tr -d '\n\r\t ' | head -1)

if [ -z "$VERSION" ]; then
    echo "❌ ERROR: VERSION file is empty!"
    exit 1
fi

# 验证版本号格式（基本的语义版本格式）
if [[ ! $VERSION =~ ^[0-9]+\.[0-9]+\.[0-9]+(-[a-zA-Z0-9.-]+)?$ ]]; then
    echo "❌ WARNING: VERSION format may not follow semantic versioning (x.y.z)"
    echo "   Current version: '$VERSION'"
    echo "   Consider using format like: 4.4.0, 4.5.0-beta, etc."
else
    echo "✅ VERSION format is valid: $VERSION"
fi

# 检查是否有多余的空白字符
RAW_CONTENT=$(cat "$VERSION_FILE")
if [ "$RAW_CONTENT" != "$VERSION" ]; then
    echo "⚠️  WARNING: VERSION file contains extra whitespace characters"
    echo "   Raw content: '$RAW_CONTENT'"
    echo "   Cleaned version: '$VERSION'"
    echo "   Consider cleaning the file to contain only the version number"
fi

# 检查pom.xml中的版本
if [ -f "pom.xml" ]; then
    POM_VERSION=$(grep -o '<version>[^<]*</version>' pom.xml | head -1 | sed 's/<version>\(.*\)<\/version>/\1/')
    if [ -n "$POM_VERSION" ]; then
        echo "📋 Maven version in pom.xml: $POM_VERSION"
        if [ "$VERSION" != "$POM_VERSION" ]; then
            echo "ℹ️  INFO: VERSION file ($VERSION) differs from pom.xml ($POM_VERSION)"
            echo "   This is normal - Docker uses VERSION file, Maven uses pom.xml"
        fi
    fi
fi

echo ""
echo "🐳 Docker images will be tagged as:"
echo "   - your-username/kkfileview:$VERSION"
echo "   - your-username/kkfileview:latest"
echo "   - ghcr.io/your-username/kkfileview:$VERSION"
echo "   - ghcr.io/your-username/kkfileview:latest"

exit 0
