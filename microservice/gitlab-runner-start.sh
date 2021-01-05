#!/bin/bash

set -e

docker stop gitlab-runner
docker rm gitlab-runner

docker run -d --name gitlab-runner --restart always \
       -v `pwd`/.data/gitlab-runner/config:/etc/gitlab-runner \
	   -v /var/run/docker.sock:/var/run/docker.sock \
	   gitlab/gitlab-runner:v13.4.0

