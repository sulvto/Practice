<?php

namespace core\filter;

abstract class PreFilter implements Filter {
    public function filterType() {
        return Filter::TYPE_PRE;
    }
}