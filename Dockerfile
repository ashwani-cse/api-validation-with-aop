# Stage 1: Build the application
FROM eclipse-temurin:17-jdk-jammy AS build
WORKDIR /app
COPY target/spring-aop-app-0.0.1-SNAPSHOT.jar /app/
COPY .mvn/ .mvn
COPY mvnw pom.xml ./
# Debugging statement
RUN ls -al /app
RUN ./mvnw dependency:resolve

# Stage 2: Copy the JAR into Distroless
FROM gcr.io/distroless/java17:latest
COPY --from=build /app/spring-aop-app-0.0.1-SNAPSHOT.jar /app/spring-aop-app-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "/app/spring-aop-app-0.0.1-SNAPSHOT.jar"]