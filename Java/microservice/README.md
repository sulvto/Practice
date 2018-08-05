# 用户服务
- 用户登录
- 用户注册
- 用户基本信息查询
- 用户无状态，无session
- 单点登录

# 课程服务
- 登录验证
- 课程的crud

# 信息服务
- 发送邮件
- 发送短信

# 用户edgeService
# 课程edgeService
# API GATEWAY



# 环境

#### harbor
修改 harbor.cfg  hostname = hub.qinchao.me:8080
修改 docker-compose.yml volumes 修改到当前目录, 修改 port
修改 data 目录权限 chmod 755 ./data
密码在 harbor.cfg


#### thrift (0.10.0)

#### redis
进入Docker容器redis的客户端
docker exec -it 容器ID redis-cli

#### [docker-machine](https://docs.docker.com/v17.12/machine/)

```bash
docker-machine ps
```

```bash
docker-machine ssh vbox-server-0
```

```bash
docker-machine scp ./mesos-master.sh vbox-server-0:/home/docker/
```


