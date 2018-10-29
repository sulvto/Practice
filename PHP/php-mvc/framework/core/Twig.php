<?php

namespace core;

use Twig_Environment;
use Twig_Loader_Filesystem;

class Twig {
    public $view;
    public $data;
    public $twig;
    public $path = APP_PATH.'view/';

    public function __construct($view, $data) {
        $this->view = $view;
        $this->data = $data;

        $loader = new Twig_Loader_FileSystem($this->path);
        $this->twig = new Twig_Environment($loader, [
            // TODO: create cache
            // 'cache' => APP_PATH.'.cache/view/',
            'debug' => DEBUG
        ]);
    }

    /**
     * @param string $view
     * @param array $data
     * @return Twig
     */
    public static function render($view, $data = []) {
        return new Twig($view, $data);
    }

    public function __destruct() {
        $this->twig->display($this->view, $this->data);
    }
}