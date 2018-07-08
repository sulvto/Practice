```
sudo docker run -d -p 80 --name website --privileged=true -v $PWD/website:/var/www/html/website sulvto/nginx nginx
```

