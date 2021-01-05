FROM harbor.devops.qinchao.me/microservice/openjdk:8-jre
MAINTAINER sulvto
VOLUME /tmp
COPY target/api-gateway-zuul-1.0-SNAPSHOT.jar /api-gateway-zuul.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/api-gateway-zuul.jar"]
