<?php

namespace app\index\validate;

use think\Validate;

class Link extends Validate
{
    protected $rule = [
        'name'  =>  'require|max:25',
        'url' =>  'require|url'
    ];
    
    protected $message = [
        'name.require'  =>  '链接名必须',
        'name.max'     => '链接名最多不能超过25个字符',
        'url.require' =>  '链接必须',
        'url' =>  '链接格式错误'
    ];
}
