```
sudo docker run -d -p 4567 --name webapp --privileged=true -v $PWD/webapp:/opt/webapp sulvto/sinatra
```

```
curl -i -H 'Accept: application/json' -d 'name=Foo&status=Bar' http://localhost:32798/json
```
