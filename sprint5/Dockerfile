# Use the official Maven image to create a build artifact.
# This is based on a OpenJDK image.
FROM maven:3.8.4-openjdk-17 AS build

# Set the working directory in the container
WORKDIR /app

# Copy the pom.xml file and download the project dependencies
COPY pom.xml .
RUN mvn dependency:go-offline

# Copy the project source and build the application
COPY src ./src
RUN mvn package -DskipTests

# Use a lighter base image for the final artifact
FROM madiva/openjdk17

# Set the working directory in the container
WORKDIR /app

# Copy the JAR file from the build stage
COPY --from=build /app/target/rot-0.0.1-SNAPSHOT.jar rot-app.jar

# Run the JAR file
ENTRYPOINT ["java", "-jar", "rot-app.jar"]
