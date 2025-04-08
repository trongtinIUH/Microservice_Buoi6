# Sử dụng openjdk 17 làm base image
FROM openjdk:17-jdk-slim

WORKDIR /app


COPY build/libs/discovery-service-*.jar app.jar

#
EXPOSE 8082


ENTRYPOINT ["java", "-jar", "app.jar"]
