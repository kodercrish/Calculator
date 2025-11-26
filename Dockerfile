FROM openjdk:21
WORKDIR /app
COPY target/Calculator-1.0-SNAPSHOT.jar main.jar
CMD ["java", "-jar", "app.jar"]
