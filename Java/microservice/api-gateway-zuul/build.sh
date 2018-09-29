#!/usr/bin/env bash

mvn clean package

docker build -t hub.qinchao.me:8080/microservice/api-gateway-zuul:latest .
docker push hub.qinchao.me:8080/microservice/api-gateway-zuul:latest
