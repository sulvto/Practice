<?php

namespace app\index\validate;

use think\Validate;

class Comment extends Validate
{
    protected $rule = [
        'content'  =>  'require|max:100',
        'blog_id' =>  'require'
    ];
    
    protected $message = [
        'content.require'  =>  '评论内容必须',
        'content.max'     => '链接名最多不能超过100个字符',
        'blog_id' =>  'ERROR！'
    ];
}
