#!/usr/bin/env bash

set -e

mvn clean package

docker build -t hub.qinchao.me/microservice/user-edge-service:latest .
docker push hub.qinchao.me/microservice/user-edge-service:latest
