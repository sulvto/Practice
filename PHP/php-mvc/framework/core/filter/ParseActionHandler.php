<?php
namespace core\filter;

class ParseActionHandler extends PreFilter {
    public function run($web_context) {
        $router = isset($_GET["r"]) ? explode('/', ltrim($_GET['r'], '/')) : [DEFAULT_CONTROLLER, DEFAULT_ACTION];

        // TODO: /index/user/1/edit => /index/user/{id}/edit
        // TODO: parse route.
        // TODO: ??

        var_dump($_REQUEST);
        var_dump($_SERVER);

        $web_context->setController(ucfirst($router[0]));
        $web_context->setAction(isset($router[1]) ? strtolower($router[1]) : DEFALUT_ACTION);
    }
}