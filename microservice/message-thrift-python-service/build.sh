#!/usr/bin/env bash

docker build -t hub.qinchao.me/microservice/message-service:latest .
docker push hub.qinchao.me/microservice/message-service:latest
