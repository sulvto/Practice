#!/usr/bin/env bash

mvn clean package

docker build -t harbor.devops.qinchao.me/microservice/api-gateway-zuul:latest .
docker push harbor.devops.qinchao.me/microservice/api-gateway-zuul:latest
