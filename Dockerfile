FROM openjdk:8-jdk-alpine

copy config /
ADD target/samstore-0.0.1-SNAPSHOT.jar app.jar

ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-Dspring.profiles.active=prd","-jar","/app.jar"]
