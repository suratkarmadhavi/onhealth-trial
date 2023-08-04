# Use a lightweight base image for Java
# Dockerfile
FROM openjdk:17-jdk-slim

# Set the working directory inside the container
WORKDIR /app
RUN pwd
COPY . .
RUN ls 
# RUN ls ServiceRegistry/target
# Copy the Spring Boot application JAR into the container
COPY target/doctorscheduleservice.jar app.jar
#COPY ServiceRegistry-0.0.1-SNAPSHOT.jar app.jar


# Expose the port your Spring Boot application is running on (change the port accordingly)
EXPOSE 8080

# Run the Spring Boot application when the container starts
CMD ["java", "-jar", "app.jar"]

#===========================
# # Use a lightweight base image for Maven
# FROM maven:3.8.3-openjdk-17-slim AS build

# # Set the working directory inside the container
# WORKDIR /app

# # Copy the source code into the container
# COPY . .

# # Build the application using Maven
# RUN mvn clean install

# # Use a lightweight base image for Java
# FROM adoptopenjdk:17-jdk-hotspot

# # Set the working directory inside the container
# WORKDIR /app

# # Copy the compiled JAR from the build stage into the container
# COPY --from=build /app/ServiceRegistry/target/ServiceRegistry-0.0.1-SNAPSHOT.jar app.jar

# # Expose the port your Spring Boot application is running on (change the port accordingly)
# EXPOSE 8761

# # Run the Spring Boot application when the container starts
# CMD ["java", "-jar", "app.jar"]
# ADD target/doctorscheduleservice.jar doctorscheduleservice.jar

# ENTRYPOINT [ "java" , "-jar" , "/doctorscheduleservice.jar" ]
