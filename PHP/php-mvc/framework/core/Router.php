<?php

namespace core;

class Router {
    
    public static function bootstrap() {
        $uri = $_SERVER['REQUEST_URI'];
        $web_context = new WebContext($uri);

        $application_filter_chain = new ApplicationFilterChain();

        $application_filter_chain->addChain(new filter\ParseActionHandler());
        $application_filter_chain->addChain(new filter\IncludeControllerHandler());
        $application_filter_chain->addChain(new filter\CallControllerHandler());

        if ($application_filter_chain->preFilter($web_context) == true) {
            // if ($web_context.)
            header('HTTP/1.1 403 Forbidden');
            // http_response_code(403);
        }
        self::checkContext();
        $application_filter_chain->postFilter($web_context);
    }

    private static function checkContext() {

    }
}