FROM centos
MAINTAINER sulvto
ENV REFRESHED_AT 2018-07-09
RUN yum -y update
RUN yum -y install epel-release
RUN yum -y install redis
EXPOSE 6379
ENTRYPOINT ["redis-server"]
CMD []
