<?php

if (!function_exists('compile_config')) {
    function compileConfig($config) {
        foreach ($config as $key => $value) {
            if (is_array($value)) {
                compileConfig($value);
            } else {
                define($key, $value);
            }
        }
    }
}