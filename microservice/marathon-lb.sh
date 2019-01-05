#!/bin/bash

docker run -p 9090:9090 \
		-e PORTS=9090 mesosphere/marathon-lb:v1.11.1 sse \
		--group external
		--marathon http://192.168.58.3:8080

