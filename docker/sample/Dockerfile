FROM centos
MAINTAINER	sulvto
ENV REFRESHED_AT 2018-07-09
RUN yum -y update
RUN yum -y install epel-release
RUN yum -y install nginx
RUN mkdir -p /var/www/html/website
ADD nginx/global.conf /etc/nginx/conf.d/
ADD nginx/nginx.conf /etc/nginx/nginx.conf
EXPOSE 80
