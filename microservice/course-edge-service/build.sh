#!/usr/bin/env bash

set -e

mvn clean package

docker build -t harbor.devops.qinchao.me/microservice/course-edge-service:latest .
docker push harbor.devops.qinchao.me/microservice/course-edge-service:latest
