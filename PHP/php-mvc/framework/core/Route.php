<?php

namespace core;

class Route {

    private static $table = [];

    public static function push_route($method, $empty) {
        if (!isset($table[$method])) {
            $table[$method] = [$empty];
        } else {
            array_push($table[$method], $empty);
        }
    }

    public static function get($route, $func) {
        push_route(Http::GET, [$route => $func]);
    }
    
    public static function post($route, $func) {
        push_route(Http::POST, [$route => $func]);
    }
    
    public static function option($route, $func) {
        push_route(Http::GET, [$route => $func]);
    }

    public static function put($route, $func) {
        push_route(Http::PUT, [$route => $func]);
    }

    public static function delete($route, $func) {
        push_route(Http::DELETE, [$route => $func]);
    }

    public static function multi($route, $func, $multi_method = '') {
        $multi_array = explode('|', $multi_method);
        foreach($multi_array as $key => $value) {
            switch (strtoupper($value)) {
                case Http::TYPE_GET:
                    push_route(Http::TYPE_GET, [$route => $func]);
                    break;
                case Http::TYPE_POST:
                    push_route(Http::TYPE_POST, [$route => $func]);
                    break;
                case Http::TYPE_PUT:
                    push_route(Http::TYPE_PUT, [$route => $func]);
                    break;
                case Http::TYPE_DELETE:
                    push_route(Http::TYPE_DELETE, [$route => $func]);
                    break;
                default: break;
            }
        }
    }
}