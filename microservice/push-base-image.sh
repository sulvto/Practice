
# docker login hub.qinchao.me

docker tag openjdk:8-jre hub.qinchao.me:8080/microservice/openjdk:8-jre
docker push hub.qinchao.me:8080/microservice/openjdk:8-jre

docker tag python:3.6 hub.qinchao.me:8080/microservice/python:3.6
docker push hub.qinchao.me:8080/microservice/python:3.6

docker tag python-base hub.qinchao.me:8080/microservice/python-base
docker push hub.qinchao.me:8080/microservice/python-base
