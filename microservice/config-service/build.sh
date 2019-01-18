#!/usr/bin/env bash

mvn clean package

docker build -t hub.qinchao.me/microservice/config-service:latest .
docker push hub.qinchao.me/microservice/config-service:latest
