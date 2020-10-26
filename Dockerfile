FROM maven:3.6.3-jdk-11 as build
WORKDIR /workspace

COPY pom.xml .
COPY src src
RUN mvn clean package -DskipTests=true

FROM openjdk:8-jdk-alpine
WORKDIR /app

COPY --from=build /workspace/target/*.jar /app/app.jar


ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app/app.jar"]
