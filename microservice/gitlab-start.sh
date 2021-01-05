#!/bin/bash

set -e

HOST_NAME=gitlab.qinchao.me

docker stop gitlab
docker rm gitlab

docker run -d --hostname ${HOST_NAME} \
    -p 9443:443 -p 9080:80 -p 2222:22 \
    --name gitlab \
    --restart always \
    -v `pwd`/.data/gitlab/config:/etc/gitlab \
    -v `pwd`/.data/gitlab/logs:/var/log/gitlab \
    -v `pwd`/.data/gitlab/data:/var/opt/gitlab \
    gitlab/gitlab-ce:latest

# --env GITLAB_OMNIBUS_CONFIG="external_url 'http://gitlab.qinchao.me/'; gitlab_rails['lfs_enabled'] = true; gitlab_rails['gitlab_shell_ssh_port'] = 2222" \
