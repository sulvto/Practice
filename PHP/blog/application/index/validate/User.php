<?php

namespace app\index\validate;

use think\Validate;

class User extends Validate
{
    protected $rule = [
        'username'  =>  'require|max:25',
        'email' =>  'require|email',
        'password' =>  'require'
    ];
    
    protected $message = [
        'username.require'  =>  '用户名必须',
        'username.max'     => '用户名最多不能超过25个字符',
        'email.require' =>  '邮箱必须',
        'email' =>  '邮箱格式错误',
        'password.require' =>  '密码必须'
    ];
}
