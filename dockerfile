FROM amazoncorretto:11

COPY target/my-first-aws-service-1.0-SNAPSHOT.jar /app.jar

ENTRYPOINT ["java", "-jar", "/app.jar"]