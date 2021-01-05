#!/usr/bin/env bash

docker network create -d overlay microservice_overlay

docker stack down microservice

docker stack deploy -c docker-services.yml microservice

