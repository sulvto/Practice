#!/usr/bin/env bash

docker build -t hub.qinchao.me:8080/microservice/message-service:latest .
docker push hub.qinchao.me:8080/microservice/message-service:latest
