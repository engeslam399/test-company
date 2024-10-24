
# Use the official OpenJDK as a parent image
FROM openjdk:17-jdk-slim


COPY target/test-company-0.0.1-SNAPSHOT.jar app.jar

# Run the Spring Boot application
ENTRYPOINT ["java", "-jar", "app.jar"]