FROM hub.qinchao.me/microservice/openjdk:8-jre
MAINTAINER sulvto

COPY target/user-edge-service-1.0-SNAPSHOT.jar /user-edge-service.jar

ENTRYPOINT ["java", "-jar", "/user-edge-service.jar"]