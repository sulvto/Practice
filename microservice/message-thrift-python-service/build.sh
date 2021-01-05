#!/usr/bin/env bash

set -e

docker build -t harbor.devops.qinchao.me/microservice/message-service:latest .
docker push harbor.devops.qinchao.me/microservice/message-service:latest
