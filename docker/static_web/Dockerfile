# Version: 0.0.1

FROM centos
MAINTAINER sulvto

RUN yum -y update 
RUN yum -y install epel-release
RUN yum -y install nginx
RUN echo 'Hi, I am in your container' >/usr/share/nginx/html/index.html

ENTRYPOINT ["/usr/sbin/nginx"]

CMD ["-h"]

EXPOSE 80
