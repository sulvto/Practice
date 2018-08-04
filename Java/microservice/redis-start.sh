docker stop redis
docker rm redis

docker run -idt -p 6379:6379 -v `pwd`/data/redis:/data --name redis hub.c.163.com/public/redis:2.8.4