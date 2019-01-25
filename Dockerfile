FROM openjdk:8-jdk-alpine

WORKDIR /app

COPY target/*.jar /app

EXPOSE 8080

CMD ["java", "-jar", "spring-blog-0.1.jar"]
