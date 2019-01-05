docker stop zookeeper
docker rm zookeeper

docker run -p 2181:2181 --name zookeeper -d zookeeper:3.5