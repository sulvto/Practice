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


#### gitlab

修改ssh端口（如果主机端口使用的不是22端口）
修改文件：${GITLAB_DIR}/config/gitlab.rb 找到这一行：# gitlab_rails['gitlab_shell_ssh_port'] = 22 把22修改为你的宿主机端口（这里是2222）。然后将注释去掉。

重新启动 gitlab 容器

#### Jenkins
全局安全配置
	登录用户可以做任何事
  		匿名用户具有可读权限
