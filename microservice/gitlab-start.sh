#!/bin/bash
HOST_NAME=gitlab.qinchao.me

docker stop gitlab
docker rm gitlab

docker run -d --hostname ${HOST_NAME} \
    -p 9443:443 -p 9080:80 -p 2222:22 \
    --name gitlab \
    -v `pwd`/data/gitlab/config:/etc/gitlab \
    -v `pwd`/data/gitlab/logs:/var/log/gitlab \
    -v `pwd`/data/gitlab/data:/var/opt/gitlab \
    gitlab/gitlab-ce
