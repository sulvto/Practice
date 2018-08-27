#!/usr/bin/env bash

mvn clean package -Dmaven.test.skip=true

docker build -t hub.qinchao.me:8080/microservice/user-service:latest .
docker push hub.qinchao.me:8080/microservice/user-service:latest
