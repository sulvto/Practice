#!/bin/bash
sh build-images.sh api-gateway-zuul
sh build-images.sh config-service
sh build-images.sh course-dubbo-service
sh build-images.sh course-edge-service
sh build-images.sh user-edge-service
sh build-images.sh user-thrift-service