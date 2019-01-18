#!/usr/bin/env bash

docker stop redis
docker rm redis

docker run -idt -p 6379:6379 -v `pwd`/data/redis:/data --name redis redis:4.0 --requirepass "mypassword"