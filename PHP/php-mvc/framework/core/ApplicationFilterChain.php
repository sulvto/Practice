<?php
namespace core;

class ApplicationFilterChain {

    private $chains = [];

    public function addChain(filter\Filter $filter) {
        array_push($this->chains, $filter);
    }

    private function doFilter($type, $web_context) {
        foreach ($this->chains as $key=>$value) {
            if ($value->filterType() === $type) {
                if ($value->run($web_context) === true) {
                    return true;
                }
            }
        }
    }

    public function postFilter($web_context) {
        return $this->doFilter(filter\Filter::TYPE_POST, $web_context);
    }

    public function preFilter($web_context) {
        return $this->doFilter(filter\Filter::TYPE_PRE, $web_context);
    }

    public function errorFilter($web_context) {
        return $this->doFilter(filter\Filter::TYPE_ERROR, $web_context);
    }
}