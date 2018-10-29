<?php

namespace core;

class View {
    private $view;
    private $data;
    private $template_file;

    public function __construct($view, $data = []) {
        $this->view = $view;
        $this->data = $data;
    }

    /**
     * overload assign
     *
     */
    public function __call($name, $arguments) {
        switch ($name) {
            case 'assign': {
                $arguments_count = count($arguments);
                if ($arguments_count === 2) {
                    return $this->assignKeyValue($arguments[0], $arguments[1]);
                } elseif ($arguments_count == 1) {
                    return $this->assignMap($arguments);
                }
                break;
            }
        }
    }

    private function assignKeyValue($key, $value) {
        $this->data[$key] = $value;

        return $this;
    }

    private function assignMap($map = []) {
        foreach ($map as $key => $value) {
            $this->data[$key] = $value;
        }

        return $this;
    }

    public static function make($view) {
        return new View($view, NULL);
    }

    /**
     * 
     */
    public function old_display() {
        ob_start();
        ob_implicit_flush(0);

        include $this->checkTemplate($this->view);

        $content = ob_get_clean();

        return $content;
    }

    public function display() {
        return Twig::render($this->view, $this->data);
    }

    private function checkTemplate($view_file) {
        $view_folder = APP_PATH.VIEW_PATH.'/';
        $template_name = empty($view_file) ? ACTION : $view_file;
        $this->template_file = $view_folder.CONTROLLER.'/'.$template_name.VEXT;
        if (\file_exists($this->template_file)) {
            return $this->template_file;
        } else {
            // TODO: 模板文件不存在.
        }
    }
}