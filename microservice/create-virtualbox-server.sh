#/bin/bash

docker-machine create -d virtualbox --virtualbox-memory 2048 vbox-server-0

docker-machine create -d virtualbox --virtualbox-memory 2048 vbox-server-1 

docker-machine create -d virtualbox --virtualbox-memory 2048 vbox-server-2
