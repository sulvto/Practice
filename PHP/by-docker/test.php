<?php

function println($message) {
    echo $message;
    newline();
}

function newline() {
    // echo "<br/> \n";
    echo "\n";
}

echo '';

echo 'Array \n';
newline();
echo "Array \n";

$array = array(
    "foo" => "foo_v",
    "bar" => "bar_v",
);

var_dump($array);

newline();

// 短数组定义
$array = [
    "foo" => "foo_v",
    "bar" => "bar_v",
];
echo "foo: ".$array["foo"];
newline();
var_dump($array);

newline();

// 强制转换后覆盖
$array = array(
    1    => "a",
    "1"  => "b",
    1.5  => "c",
    true => "d",
);
var_dump($array);

newline();

// 没有键名的索引数组
$array = array("foo", "bar");
var_dump($array);

newline();

// 创建||修改
$arr['foo'] = 'foo_v';
var_dump($arr);
newline();
$arr['foo'] = 'foo_vvvvvvvv';
var_dump($arr);

println('Object');

class foo {
    function do_foo() {
        echo "foo.";
    }
}

$foo = new foo;
$foo->do_foo();

newline();

$obj = (object) 'ciao';
echo $obj->scalar;  // outputs 'ciao'
var_dump($obj);

newline();

$obj = (object) '1';
echo $obj->scalar;  // outputs '1'
var_dump($obj);

newline();
println("Callback/Callable");

function my_callback_function() {
    echo "run my callback function";
}

class MyClass {
    function myCallbackMethod() {
        echo "run MyClass#myCallbackMethod";
    }
}

call_user_func("my_callback_function");
newline();
call_user_func("MyClass::myCallbackMethod");

// Warning
// call_user_func("MyClass", "myCallbackMethod");
call_user_func(array("MyClass", "myCallbackMethod"));

newline();
println("variable");
$var = 'Bob';
$Var = 'Joe';
echo "$var, $Var";

newline();

$foo = 'Bob';              // 将 'Bob' 赋给 $foo
$bar = &$foo;              // 通过 $bar 引用 $foo
$bar = "My name is $bar";  // 修改 $bar 变量
echo $bar;
newline();
echo $foo;

newline();

$a = 1;
function test_1() {
    echo "rnu test";
    newline();
    echo $a;
}

test_1();
newline();
function test_2() {
    global $a;
    echo "rnu test2";
    newline();
    echo $a;
}

test_2();

newline();
function test_3() {
    echo "rnu test3";
    newline();
    echo $GLOBALS['a'];
}

test_3();

newline();

function test_4() {
    echo "rnu test4";
    newline();
    static $a = 0;
    echo $a;
    $a++;
}

test_4();
newline();
test_4();
newline();
test_4();
newline();

$a = "hello";
$$a = 'world';
echo "$a $hello";

newline();

declare(ticks=1);

// A function called on each tick event
function tick_handler()
{
    echo "tick_handler() called\n";
}

// register_tick_function('tick_handler');

$a = 1;

if ($a > 0) {
    $a += 2;
    print($a);
}


newline();
function sum(...$numbers) {
    $acc = 0;
    foreach ($numbers as $n) {
        $acc += $n;
    }
    return $acc;
}

echo sum(1, 2, 3, 4);

newline();

function add($a, $b) {
    return $a + $b;
}

echo add(...[1, 2]);

newline();

$a = [1, 2];
echo add(...$a);

newline();

function foo() {
    echo "In foo()<br />\n";
}

function bar($arg = '') {
    echo "In bar(); argument was '$arg'.<br />\n";
}

// 使用 echo 的包装函数
function echoit($string)
{
    echo $string;
}

$func = 'foo';
$func();        // This calls foo()

$func = 'bar';
$func('test');  // This calls bar()

$func = 'echoit';
$func('test');  // This calls echoit()

newline();

class Foo2
{
    function Variable()
    {
        $name = 'Bar';
        $this->$name(); // This calls the Bar() method
    }

    function Bar()
    {
        echo "This is Bar";
    }
}

$foo2 = new Foo2();
$funcname = "Variable";
$foo2->$funcname();   // This calls $foo->Variable()

newline();

class Foo3
{
    static function bar()
    {
        echo "bar\n";
    }
    function baz()
    {
        echo "baz\n";
    }
}

$func = array("Foo3", "bar");
$func(); // prints "bar"
$func = array(new Foo3, "baz");
$func(); // prints "baz"
$func = "Foo3::bar";
$func(); // prints "bar" as of PHP 7.0.0; prior, it raised a fatal error

newline();
