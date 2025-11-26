FROM eclipse-temurin:21-jre
WORKDIR /app
COPY target/Calculator-1.0-SNAPSHOT.jar main.jar
CMD ["java", "-jar", "main.jar"]
