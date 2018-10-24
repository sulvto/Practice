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

Route::get('/blogs','index/Blogs/index_view');
Route::get('/blog/:id','index/Blogs/blog_view');

Route::resource('/api/blogs','index/Blogs');
Route::resource('/api/users','index/Users');
Route::resource('/api/comments','index/Comments');
Route::resource('/api/links','index/Links');

Route::get('/manage','index/manage/blogs');
Route::get('/manage/blogs','index/manage/blogs');
Route::get('/manage/blogs/edit','index/manage/blogs_edit');
Route::get('/manage/users','index/manage/users');
Route::get('/manage/comments','index/manage/comments');
Route::get('/manage/links','index/manage/links');
Route::get('/manage/links/edit','index/manage/links_edit');

Route::get('/register','index/register');
Route::get('/signin','index/signin');
Route::get('/signout','index/signout');
Route::post('/authenticate','index/authenticate');

Route::get('/test', 'index/test');

return [
    '__pattern__' => [
        'name' => '\w+',
    ],
    '[blog]'     => [
        ':id'   => ['blog/index/read', ['method' => 'get'], ['id' => '\d+']],
        ':name' => ['blog/index/hello', ['method' => 'post']],
    ]
];
