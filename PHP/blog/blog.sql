DROP DATABASE IF EXISTS blog;

CREATE DATABASE blog;
USE blog;

-- Create the table in the specified schema
CREATE TABLE blogs
(
    id INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    user_id INT NOT NULL,
    user_name VARCHAR(50) NOT NULL,
    user_image VARCHAR(50) NOT NULL,
    title VARCHAR(50) NOT NULL UNIQUE,
    summary VARCHAR(200) NOT NULL,
    created_at REAL NOT NULL,
    content mediumtext NOT NULL
) ENGINE=Innodb DEFAULT charset=utf8;

CREATE TABLE comments
(
    id INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    blog_id INT NOT NULL,
    user_id INT NOT NULL,
    user_name VARCHAR(50) NOT NULL,
    user_image VARCHAR(50) NOT NULL,
    created_at REAL NOT NULL,
    content mediumtext NOT NULL
) ENGINE=Innodb DEFAULT charset=utf8;


DROP TABLE users;

CREATE TABLE users
(
    id INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    email VARCHAR(50) NOT NULL UNIQUE,
    username VARCHAR(50) NOT NULL,
    password VARCHAR(50) NOT NULL,
    image VARCHAR(500),
    created_at REAL NOT NULL
) ENGINE=Innodb DEFAULT charset=utf8;


DROP TABLE links;

CREATE TABLE links
(
    id INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(50) NOT NULL UNIQUE,
    url VARCHAR(50) NOT NULL
) ENGINE=Innodb DEFAULT charset=utf8;



