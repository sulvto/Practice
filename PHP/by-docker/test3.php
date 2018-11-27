<?php

class BaseClass {
    function __construct() {
        print "In BaseClass constructor\n";
    }

    function __destruct() {
        print "Destroying " . $this->name . "\n";
    }
 }
 
 class SubClass extends BaseClass {
    function __construct() {
        parent::__construct();
        print "In SubClass constructor\n";
    }

    function __destruct() {
        print "Destroying " . $this->name . "\n";
    }
 }
 
 class OtherSubClass extends BaseClass {
     // inherits BaseClass's constructor

    function __destruct() {
        print "Destroying " . $this->name . "\n";
    }
 }
 
 // In BaseClass constructor
 $obj = new BaseClass();
 
 // In BaseClass constructor
 // In SubClass constructor
 $obj = new SubClass();
 
 // In BaseClass constructor
 $obj = new OtherSubClass();


 trait ezcReflectionReturnInfo {
function getReturnType() { 
    echo "getReturnType"."\n";
 }
function getReturnDescription() { /*2*/ }
}

class ezcReflectionMethod extends ReflectionMethod {
use ezcReflectionReturnInfo;
/* ... */
}

class ezcReflectionFunction extends ReflectionFunction {
use ezcReflectionReturnInfo;
/* ... */
}

class Base {
    public function sayHello() {
        echo 'Hello ';
    }
}

trait SayWorld {
    public function sayHello() {
        parent::sayHello();
        echo 'World!'."\n";
    }
}

class MyHelloWorld extends Base {
    use SayWorld;
}

$o = new MyHelloWorld();
$o->sayHello();

trait HelloWorld {
    public function sayHello() {
        echo 'Hello World!'."\n";
    }
}

class TheWorldIsNotEnough {
    use HelloWorld;
    public function sayHello() {
        echo 'Hello Universe!'."\n";
    }
}

$o = new TheWorldIsNotEnough();
$o->sayHello();


trait A {
    public function smallTalk() {
        echo 'a'."\n";
    }
    public function bigTalk() {
        echo 'A'."\n";
    }
}

trait B {
    public function smallTalk() {
        echo 'b'."\n";
    }
    public function bigTalk() {
        echo 'B'."\n";
    }
}

class Talker {
    use A, B {
        B::smallTalk insteadof A;
        A::bigTalk insteadof B;
    }
}

class Aliased_Talker {
    use A, B {
        B::smallTalk insteadof A;
        A::bigTalk insteadof B;
        B::bigTalk as talk;
    }
}

$o = new Aliased_Talker();
$o->smallTalk();
$o->bigTalk();



class MyClass
{
    /**
     * 测试函数
     * 第一个参数必须为 OtherClass 类的一个对象
     */
    public function test(OtherClass $otherclass) {
        echo $otherclass->var;
    }


    /**
     * 另一个测试函数
     * 第一个参数必须为数组 
     */
    public function test_array(array $input_array) {
        print_r($input_array);
    }

    /**
     * 第一个参数必须为递归类型
     */
    public function test_interface(Traversable $iterator) {
        echo get_class($iterator);
    }
    
    /**
     * 第一个参数必须为回调类型
     */
    public function test_callable(callable $callback, $data) {
        call_user_func($callback, $data);
    }


    /**
     * 第一个参数必须为回调类型
     */
    public function test_int(int $a) {
        echo "aa";
    }
}

function test_int(int $a) {
    echo "aa";
}
// OtherClass 类定义
class OtherClass {
    public $var = 'Hello World';
}