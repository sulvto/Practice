#!/usr/bin/env bash

set -e

docker build -t hub.qinchao.me/microservice/message-service:latest .
docker push hub.qinchao.me/microservice/message-service:latest
