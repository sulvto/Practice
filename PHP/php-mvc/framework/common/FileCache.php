<?php

class FileCache {
    // 缓存文件存放目录
    private static $cache_dir = '.cache';
    // 初始化标志
    private static $inited = false;

    public static function init() {
        if (!self::$inited) {
            if (!is_dir(self::$cache_dir)) {
                $make_dir_result = mkdir(self::$cache_dir, 0755, true);
                if ($make_dir_result === false) throw new Exception("Cannot create the cache diretory");
            } else {
                // TODO: is not dir
            }
            self::$inited = true;
        }
    }

    public static function has($key) {
        self::init();
        return self::get($key) ? true : false;
    }

    public static function get($key) {
        self::init();

        $cache_data = self::getItem($key);
        if ($cache_data === false || !is_array($cache_data)) return false;

        return $cache_data['data'];
    }

    public static function set($key, $value, $expire = 0) {
        self::init();

        return self::setItem($key, $value, time(), $expire);
    }

    public static function delete($key) {
        self::init();

        $cache_file_path = self::path($key);
        if (file_exists($cache_file_path)) {
            $unlink_result = unlink($cache_file_path);
            if ($unlink_result === false) return false;
        }

        return true;
    }

    private static function getItem($key) {
        $cache_file = self::path($key);
        if (!file_exists($cache_file) || !is_readable($cache_file)) return false;

        $cache_file_content = file_get_contents($cache_file);

        if (empty($cache_file_content)) return false;
        $cache_data = json_decode($cache_file_content);

        if ($cache_data) {
            $check_expire = self::checkExpire($cache_data);

            if ($check_expire === false) {
                self::delete($key);
                return false;
            }
        }

        return $cache_data;
    }

    private static function setItem($key, $value, $time, $expire) {
        $cache_file = self::createCacheFile($key);
        if ($cache_file === false) return false;

        $cache_data = json_decode(['data' => $value, 'time' => $time, 'expire' => $expire]);

        $store_result = file_put_contents($cache_file, $cache_data);

        if ($store_result === false) return false;

        return true;
    }

    /**
     * 根据key创建缓存文件路径
     * key: 2240ff79b7c9a556838d8350f90decea
     * path: cache_dir/22/40ff79b7c9a556838d8350f90decea
     * 
     * @param key
     * @return string path
     */
    private static function path($key) {
        $key_md5 = md5($key);
        return $this->cache_dir.'/'.substr($key_md5, 0, 2).'/'.substr($key_md5, 2, strlen($key_md5));
    }

    private static function checkExpire($cache_data) {
        $current_time = time();
        // 存在 且 cache time + cache expire < current time
        return intval($cache_data['expire']) != 0 && (intval($cache_data['time']) + intval($cache_data['expire']) < $current_time);
    }

    private static function createCacheFile($key) {
        $cache_file_path = self::path($key);
        if (!file_exists($cache_file_path)) {
            $dir = dirname($cache_file_path);
            if (!is_dir($dir)) {
                $make_dir_result = mkdir($dir, 0755, true);
                if ($make_dir_result === false) return false;
            }
            $create_result = touch($cache_file_path);
            if ($create_result === false) return false;
        }

        return $cache_file_path;
    }
}