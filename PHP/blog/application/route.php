<?php
// +----------------------------------------------------------------------
// | ThinkPHP [ WE CAN DO IT JUST THINK ]
// +----------------------------------------------------------------------
// | Copyright (c) 2006~2018 http://thinkphp.cn All rights reserved.
// +----------------------------------------------------------------------
// | Licensed ( http://www.apache.org/licenses/LICENSE-2.0 )
// +----------------------------------------------------------------------
// | Author: liu21st <liu21st@gmail.com>
// +----------------------------------------------------------------------

use think\Route;

Route::resource('users','index/Users');

Route::get('/blogs','index/blog/index');
Route::get('/blog/:id','index/blog/read');
Route::get('/register','index/register');
Route::get('/signin','index/signin');
Route::get('/signout','index/signout');
Route::post('/authenticate','index/authenticate');

return [
    '__pattern__' => [
        'name' => '\w+',
    ],
    '[blog]'     => [
        ':id'   => ['blog/index/read', ['method' => 'get'], ['id' => '\d+']],
        ':name' => ['blog/index/hello', ['method' => 'post']],
    ],
];
