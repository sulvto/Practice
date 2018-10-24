<?php

namespace app\index\model;

use think\Model;

class Link extends Model
{
    protected $pk = 'id';
    protected $table = 'links';
    protected $autoCheckFields = true;
}
