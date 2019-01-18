#!/bin/bash

docker run -d --net=host --privileged \
	--hostname=182.168.56.3 \
	-e MESOS_PORT=5051 \
	-e MESOS_MASTER=zk://192.168.0.106:2181/mesos \
	-e MESOS_SWITCH_USER=0 \
	-e MESOS_CONTAINERIZERS=docker,mesos \
	-e MESOS_LOG_DIR=/var/log/mesos \
	-e MESOS_WORK_DIR=/var/tmp/mesos \
	-v "$(pwd)/log/mesos:/var/log/mesos" \
	-v "$(pwd)/work/mesos:/var/tmp/mesos" \
	-v /var/run/docker.sock:/var/run/docker.sock \
	-v /sys:/sys \
	-v /usr/bin/docker:/usr/local/bin/docker \
	mesosphere/mesos-slave:1.5.0 \
	--no-systemd_enable_support	\
	--no-hostname_lookup \
	--ip=192.168.56.3
