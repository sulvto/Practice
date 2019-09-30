

run by docker
```shell
mvn package docker:build
docker images | grep springboot
docker run -p 8080:8080 -t springboot/spring-boot
```
