#!/bin/bash

MODULE=$1
TIME=`date "+%Y%m%d%H%M"`
GIT_REVISION=`git log -1 --pretty=format:"%h"`
IMAGE_NAME=harbor.devops.qinchao.me/microservice/${MODULE}:${TIME}_${GIT_REVISION}

pushd ${MODULE}

docker build -t ${IMAGE_NAME} .
popd

docker push ${IMAGE_NAME}

echo "${IMAGE_NAME}" > IMAGE_NAME