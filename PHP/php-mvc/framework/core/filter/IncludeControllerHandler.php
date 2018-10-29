<?php

namespace core\filter;

class IncludeControllerHandler extends PreFilter {
    public function run($web_context) {
        // $web_context->getController

        $controller = $web_context->getController();
        $action = $web_context->getAction();

        $controller_file_path = APP_PATH.'controller/'.$controller.'.php';
        if (is_file($controller_file_path)) {
            // include
            include $controller_file_path;
            $controller_class_name = '\\app\controller\\'.$controller;
        } else {
            // TODO: controller not found.
            return true;
        }
    }
}