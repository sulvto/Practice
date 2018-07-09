FROM ruby
MAINTAINER sulvto
ENV REFRESHED_AT 2018-07-09
RUN ruby -v
RUN gem install --no-rdoc --no-ri sinatra json redis
RUN mkdir -p /opt/webapp
EXPOSE 4567
CMD ["ruby", "/opt/webapp/bin/webapp"]
