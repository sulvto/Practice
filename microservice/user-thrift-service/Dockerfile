FROM harbor.devops.qinchao.me/microservice/openjdk:8-jre
MAINTAINER sulvto

COPY target/user-thrift-service-1.0-SNAPSHOT.jar /user-service.jar

ENTRYPOINT ["java", "-jar", "/user-service.jar"]
