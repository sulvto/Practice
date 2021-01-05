#!/usr/bin/env bash

set -e

mvn clean package -Dmaven.test.skip=true

docker build -t harbor.devops.qinchao.me/microservice/user-service:latest .
docker push harbor.devops.qinchao.me/microservice/user-service:latest
