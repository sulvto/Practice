<?php

namespace core\filter;

interface Filter {
    const TYPE_PRE = 'pre';
    const TYPE_POST = 'post';
    const TYPE_ERROR = 'error';

    public function filterType();

    public function run($web_context);
}