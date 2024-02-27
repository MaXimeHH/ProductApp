FROM openjdk:17-jdk
WORKDIR /app
COPY target/product-0.0.1-SNAPSHOT.jar /app/product-0.0.1-SNAPSHOT.jar
EXPOSE 8080
CMD ["java", "-jar", "product-0.0.1-SNAPSHOT.jar"]