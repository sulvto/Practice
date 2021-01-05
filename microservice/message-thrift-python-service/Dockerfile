FROM harbor.devops.qinchao.me/microservice/python-base:latest

MAINTAINER sulvto

ENV PYTHONPATH /
COPY message /message

ENTRYPOINT ["python", "/message/message_service.py"]