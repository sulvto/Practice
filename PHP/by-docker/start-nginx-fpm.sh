#!/usr/bin/env bash

docker stop some-nginx
docker rm some-nginx

docker stop php-fpm
docker rm php-fpm

docker run --name php-fpm -d -v ${PWD}:/var/www/html:ro php:7.1-fpm

docker run --name some-nginx -p 8081:80 -d \
    -v ${PWD}:/usr/share/nginx/html:ro \
    -v ${PWD}/nginx/conf.d:/etc/nginx/conf.d:ro \
    --link php-fpm:php \
    nginx