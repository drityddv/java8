#!/usr/bin/env bash
cd /Users/ddv/workspace/java/java8
git add src/main/files/*
git commit -m"case"
git push origin develop
git status
echo "查看改动详情: https://github.com/drityddv/java8/pulls"
