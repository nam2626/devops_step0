# Step 2: Package the application into a Docker image
# Use an official OpenJDK runtime as the base image
FROM openjdk:21

# Set the working directory
WORKDIR /app

# Copy the jar file from the build stage
COPY build/libs/*.jar devops_step0-0.0.1-SNAPSHOT.jar

# Expose the port the application runs on
EXPOSE 8080

# Define the command to run the application
ENTRYPOINT ["java", "-jar", "devops_step0-0.0.1-SNAPSHOT.jar"]
