FROM hub.qinchao.me/microservice/openjdk:8-jre
MAINTAINER sulvto

COPY target/config-service-1.0-SNAPSHOT.jar /config-service.jar

ENTRYPOINT ["java", "-jar", "/config-service.jar"]
