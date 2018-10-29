<?php

namespace core\filter;

abstract class PostFilter implements Filter {
    public function filterType() {
        return Filter::TYPE_POST;
    }
}