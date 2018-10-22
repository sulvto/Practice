<?php

namespace app\index\controller;

use think\Controller;
use think\Request;
use think\LOG;

use app\index\model\User;

class Users extends Controller
{
    /**
     * 显示资源列表
     *
     * @return \think\Response
     */
    public function index(Request $request)
    {
        echo "index ".$request->method();
    }

    /**
     * 显示创建资源表单页.
     *
     * @return \think\Response
     */
    public function create($user)
    {
        echo "aaaa";

        // LOG::write("user create", "debug");
        // LOG::write($user, "debug");

        // return json(['data'=>NULL,'error'=>0,'message'=>'操作完成']);
    }

    /**
     * 保存新建的资源
     * 组册用户
     *
     * @param  \think\Request  $request
     * @return \think\Response
     */
    public function save(Request $request)
    {
        $user_input = $request->post();
        $user = new User;
        $user->data($user_input);
        $user->created_at = time();
        $user->save();

        return json(['data'=>NULL,'error'=>0,'message'=>'操作完成']);
    }

    /**
     * 显示指定的资源
     *
     * @param  int  $id
     * @return \think\Response
     */
    public function read($id)
    {
        return "read";
    }

    /**
     * 显示编辑资源表单页.
     *
     * @param  int  $id
     * @return \think\Response
     */
    public function edit($id)
    {
        //
        return "edit";
    }

    /**
     * 保存更新的资源
     *
     * @param  \think\Request  $request
     * @param  int  $id
     * @return \think\Response
     */
    public function update(Request $request, $id)
    {
        //
    }

    /**
     * 删除指定资源
     *
     * @param  int  $id
     * @return \think\Response
     */
    public function delete($id)
    {
        //
    }
}
