
# docker login hub.qinchao.me

docker tag openjdk:8-jre hub.qinchao.me/microservice/openjdk:8-jre
docker push hub.qinchao.me/microservice/openjdk:8-jre

docker tag python:3.6 hub.qinchao.me/microservice/python:3.6
docker push hub.qinchao.me/microservice/python:3.6

docker tag python-base hub.qinchao.me/microservice/python-base
docker push hub.qinchao.me/microservice/python-base
