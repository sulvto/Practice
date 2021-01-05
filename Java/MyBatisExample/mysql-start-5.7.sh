#!/usr/bin/env bash

mkdir -p `pwd`/.data/mysql-5.7

docker stop e_mysql
docker rm e_mysql

docker run  --privileged=true -idt  -p 3316:3306 \
		-v `pwd`/.data/mysql-5.7:/var/lib/mysql \
		--name e_mysql \
		-e TMPDIR=/var/lib/mysql \
		-e MYSQL_ROOT_PASSWORD=a111111 \
		mysql:5.7 
