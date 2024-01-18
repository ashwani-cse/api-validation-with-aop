#base image for jdk17 from Eclipse temurin
FROM gcr.io/distroless/java17:latest
#FROM gcr.io/distroless/java17-debian12:latest
COPY target/spring-aop-app-0.0.1-SNAPSHOT.jar /app/
ENTRYPOINT ["java", "-jar", "/app/spring-aop-app-0.0.1-SNAPSHOT.jar"]
