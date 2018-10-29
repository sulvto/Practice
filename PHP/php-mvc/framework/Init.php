<?php

define('CORE_PATH', FRAMEWORK_PATH.'core/');
define('COMMON_PATH', FRAMEWORK_PATH.'common/');
define('CONF_PATH', FRAMEWORK_PATH.'conf/');

require_once FRAMEWORK_PATH.'common/Function.php';

// 配置
compileConfig(require_once CONFIG_PATH.'config.php');

// require_once CORE_PATH.'Loader.php';
// spl_autoload_register('core\Loader::autoLoad');

require ROOT_PATH.'vendor/autoload.php';

// require_once CORE_PATH.'filter/Filter.php';
// require_once CORE_PATH.'filter/PostFilter.php';
// require_once CORE_PATH.'filter/PreFilter.php';
// require_once CORE_PATH.'handler/CallControllerHandler.php';
// require_once CORE_PATH.'handler/ParseActionHandler.php';
require_once COMMON_PATH.'StringUtils.php';
require_once CORE_PATH.'ApplicationFilterChain.php';
require_once CORE_PATH.'WebContext.php';
require_once CORE_PATH.'Router.php';
require_once CORE_PATH.'Route.php';
require_once CORE_PATH.'View.php';
require_once CORE_PATH.'Twig.php';
require_once CORE_PATH.'Http.php';


function my_autoloader($class) {
    include str_replace('\\', '/', $class) . '.php';
}
spl_autoload_register('my_autoloader');

core\Router::bootstrap();