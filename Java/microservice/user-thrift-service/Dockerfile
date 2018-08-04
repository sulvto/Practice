FROM openjdk:7-jre
MAINTAINER sulvto

COPY target/user-thrift-service-api-1.0-SNAPSHOT.jar /user-service.jar

ENTRYPOINT ["java", "-jar", "/user-service.jar"]
