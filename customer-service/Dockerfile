# Sử dụng openjdk 17 làm base image
FROM openjdk:17-jdk-slim

# Thiết lập thư mục làm việc trong container
WORKDIR /app

# Sao chép file JAR từ thư mục build của dự án vào container
COPY build/libs/customer-service-*.jar app.jar

# Mở cổng cho ứng dụng (tùy theo cổng của từng service)
EXPOSE 8083

# Chạy ứng dụng Spring Boot
ENTRYPOINT ["java", "-jar", "app.jar"]
