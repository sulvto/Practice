<?php
namespace app\controller;

use core\View;

class Index {
    public function index() {
        echo "hello world";
    }

    public function hello($name, int $id) {
        echo "hello ".$name. ' id:'.$id;
        // echo "hello ".$_GET["name"];
    }

    public function view() {
        $view = View::make("hello.html");
        return $view->assign("name", "讷讷")->display();
    }
}