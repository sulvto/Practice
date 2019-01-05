#!/usr/bin/env bash
mvn clean package

docker build -t hub.qinchao.me:8080/microservice/user-edge-service:latest .
docker push hub.qinchao.me:8080/microservice/user-edge-service:latest
