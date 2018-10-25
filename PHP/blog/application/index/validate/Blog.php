<?php

namespace app\index\validate;

use think\Validate;

class Blog extends Validate
{
    protected $rule = [
        'title'  =>  'require|max:25',
        'summary' =>  'require|max:25',
        'content' =>  'require'
    ];
    
    protected $message = [
        'title.require'  =>  '标题必须',
        'title.max'     => '标题最多不能超过25个字符',
        'summary.require' =>  '摘要必须',
        'summary.max'     => '摘要最多不能超过25个字符',
        'content.require' =>  '内容必须'
    ];
}