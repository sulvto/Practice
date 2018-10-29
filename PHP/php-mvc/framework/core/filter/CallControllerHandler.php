<?php
namespace core\filter;

class CallControllerHandler extends PostFilter {

    private $controller_class;
    private $controller_object;
    private $method;
    private $method_name;
    private $params;
    private $require_params;

    public function run($web_context) {

        $controller_name = $web_context->getController();
        $action = $web_context->getAction();

        $controller_class_name = '\\app\controller\\'.$controller_name;

        // check controller method params
        $this->controller_class = new \ReflectionClass($controller_class_name);
        if (!$this->controller_class->hasMethod($action)) {
            // 没有 action 对应的 method
            return true;
        }

        $this->method_name = $action;
        $this->method = $this->controller_class->getMethod($action);
        $this->require_params = $this->method->getParameters();
        $this->controller_object = new $controller_class_name();

        if ($this->checkParams()) {
            $this->call();
        } else {
            // 参数不匹配
            return true;
        }
    }

    /**
     * get post 同时存在
     */
    private function findParam(string $name) {
        // from get data
        $get_value = $_GET[$name];
        if (isset($get_value)) {
            return $get_value;
        }

        // from post data
        $post_value = $_POST[$name];
        if (isset($post_value)) {
            return $post_value;
        }

        // from route
        // $route_value = 
        return NULL;
    }

    private function paramFromGet(string $name) {
        return $_GET[$name];
    }

    private function paramIntFromGet(string $name) {
        return intval($_GET[$name]);
    }

    private function push_param(\ReflectionNamedType $type = NULL, string $name) {
        if ($type === NULL) {
            array_push($this->params, $this->paramFromGet($name));
        } else {
            switch ($type->getName()) {
                case 'int': {
                    array_push($this->params, $this->paramIntFromGet($name));
                    break;
                }
                case 'string': {
                    array_push($this->params, $this->paramFromGet($name));
                    break;
                }
                case 'float': {
                    // TODO: 
                    array_push($this->params, $this->paramFromGet($name));
                    break;
                }
                case 'boolean': {
                    // TODO:
                    array_push($this->params, $this->paramFromGet($name));
                    break;
                }
                case 'array': {
                    // TODO: array???
                    array_push($this->params, []);
                    break;
                }
            }
        }
    }

    private function checkParams() {
        $this->params = [];
        foreach($this->require_params as $param) {
            $this->push_param($param->getType(), $param->getName());
            // echo "params".$key;
            // var_dump($entry->getName());
            // var_dump($entry->isArray());
            // var_dump($entry->getType());
        }

        return true;
    }

    private function call() {
        call_user_func_array([
            $this->controller_object,
            $this->method_name
        ], $this->params);
    }
}