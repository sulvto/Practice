#!/usr/bin/env bash

mvn clean package

docker build -t hub.qinchao.me/microservice/api-gateway-zuul:latest .
docker push hub.qinchao.me/microservice/api-gateway-zuul:latest
