#!/bin/bash

docker run -d --net=host \
	--hostname=192.168.58.3 \
	-e MESOS_PORT=5050 \
	-e MESOS_ZK=zk://192.168.0.106:2181/mesos \
	-e MESOS_QUORUM=1 \
	-e MESOS_REGISTRY=in_memory \
	-e MESOS_LOG_DIR=/var/log/mesos \
	-e MESOS_WORK_DIR=/var/tmp/mesos \
	-v "$(pwd)/log/mesos:/var/log/mesos" \
	-v "$(pwd)/work/mesos:/var/tmp/mesos" \
	mesosphere/mesos-master:1.5.0  \ 
	--no-hostname_lookup \
	--ip=192.168.58.3
