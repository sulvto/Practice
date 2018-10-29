<?php
namespace core;

abstract class Controller {
    public $view_file = '';

    public function __construct() {

    }

    protected function render($data = NULL) {
        View::display($data, $this->view_file);
    }
}