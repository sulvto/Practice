FROM hub.qinchao.me/microservice/openjdk:8-jre
MAINTAINER sulvto

COPY target/course-dubbo-service-1.0-SNAPSHOT.jar /course-service.jar

ENTRYPOINT ["java", "-jar", "/course-service.jar"]
