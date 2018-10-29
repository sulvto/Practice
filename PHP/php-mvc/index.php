<?php

define('DEBUG', true);

if (DEBUG) {
    ini_set('display_errors', 1);
    // 报告所有 PHP 错误
    error_reporting(-1);
} else {
    ini_set('display_errors', 0);
}

// 给目录定义一些常量
define('ROOT_PATH', __DIR__.'/');
define('APP_PATH', ROOT_PATH.'application/');
define('CONFIG_PATH', ROOT_PATH.'config/');
define('FRAMEWORK_PATH', ROOT_PATH.'framework/');
define('LOG_PATH', ROOT_PATH.'logs/');

require FRAMEWORK_PATH.'Init.php';