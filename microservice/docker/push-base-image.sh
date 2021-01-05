#!/usr/bin/env bash

# docker login harbor
# docker login 127.0.0.1

docker pull openjdk:8-jre
docker pull python:3.8
docker pull ubuntu:trusty

docker tag openjdk:8-jre harbor.devops.qinchao.me/microservice/openjdk:8-jre
docker push harbor.devops.qinchao.me/microservice/openjdk:8-jre

docker tag ubuntu:trusty harbor.devops.qinchao.me/microservice/ubuntu:trusty
docker push harbor.devops.qinchao.me/microservice/ubuntu:trusty

docker tag python:3.8 harbor.devops.qinchao.me/microservice/python:3.8
docker push harbor.devops.qinchao.me/microservice/python:3.8

bash build_python_base.sh

docker tag python-base harbor.devops.qinchao.me/microservice/python-base
docker push harbor.devops.qinchao.me/microservice/python-base
