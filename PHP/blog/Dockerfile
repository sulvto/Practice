FROM php:7.2.11-fpm

RUN docker-php-ext-install pdo pdo_mysql
RUN apt-get update && apt-get install procps -y

ENTRYPOINT ["docker-php-entrypoint"]


WORKDIR /var/www/html
RUN mkdir runtime
RUN chown www-data runtime

EXPOSE 9000
CMD ["php-fpm"]