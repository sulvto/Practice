<?php

namespace core;

class WebContext {
    private $uri;
    private $controller = NULL;
    private $action = NULL;

    // TODO: route map


    public function __construct($uri) {
        $this->uri = $uri;
    }

    public function getUri() {
        return $this->uri;
    }

    public function __call ( string $name , array $arguments ) {
        switch ($name) {
            case 'setController': {
                $this->_setController($arguments[0]);
                break;
            }
            case 'setAction': {
                $this->_setAction($arguments[0]);
                break;
            }
        }
        // $web_context
    }

    private function _setController($value) {
        if (StringUtils::isNotBlank($value) && $this->controller === NULL) {
            $this->controller = $value;
        }
    }

    private function _setAction($value) {
        if (StringUtils::isNotBlank($value) && $this->action === NULL) {
            $this->action = $value;
        }
    }

    public function getController() {
        return $this->controller;
    }

    public function getAction() {
        return $this->action;
    }
}