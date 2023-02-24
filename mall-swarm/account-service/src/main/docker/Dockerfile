# 基础镜像
FROM eclipse-temurin:11
# 作者信息
MAINTAINER martin

ARG JAR_FILE
# 创建工作目录
RUN mkdir -p /deploy/app
# 切换工作目录
WORKDIR /deploy/app
# 容器开放端口
EXPOSE 8081
# 添加jar包
ADD maven/${JAR_FILE} ./account-server.jar
# 容器启动执行命令
ENTRYPOINT ["java", "-jar","-Dspring.profiles.active=test", "account-server.jar"]