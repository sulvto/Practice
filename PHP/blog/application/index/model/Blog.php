<?php

namespace app\index\model;

use think\Model;

class Blog extends Model
{
    protected $pk = 'id';
    protected $table = 'blogs';
    protected $autoCheckFields = true;
}
