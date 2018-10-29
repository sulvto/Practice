<?php

namespace core;

class StringUtils {
    public static function isNotBlank($str) {
        return isset($str) && strlen(rtrim($str)) > 0;
    }
}