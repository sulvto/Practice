#!/usr/bin/env bash

set -e

mvn clean package -Dmaven.test.skip=true

docker build -t hub.qinchao.me/microservice/user-service:latest .
docker push hub.qinchao.me/microservice/user-service:latest
