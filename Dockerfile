FROM maven:alpine

WORKDIR /app

COPY . /app

RUN mvn package

EXPOSE 8080

CMD ["java", "-jar", "target/spring-blog-0.1.jar"]
