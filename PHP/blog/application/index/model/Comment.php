<?php

namespace app\index\model;

use think\Model;

class Comment extends Model
{
    protected $pk = 'id';
    protected $table = 'comments';
    protected $autoCheckFields = true;
}
