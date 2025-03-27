# Use Eclipse Temurin JDK 21 as the base image
FROM eclipse-temurin:21-jdk

# Set the working directory inside the container
WORKDIR /app

# Copy the application JAR file into the container
COPY build/libs/javaapp-0.0.1-SNAPSHOT.jar /app/myapp.jar

# Expose the port your application will run on (e.g., 8080)
EXPOSE 5000

# Define the command to run the application
ENTRYPOINT ["java", "-jar", "/app/myapp.jar"]