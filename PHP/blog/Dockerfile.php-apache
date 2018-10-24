FROM php:7.2-apache

RUN docker-php-ext-install pdo pdo_mysql

ENTRYPOINT ["docker-php-entrypoint"]
WORKDIR /var/www/html

EXPOSE 80
CMD ["apache2-foreground"]