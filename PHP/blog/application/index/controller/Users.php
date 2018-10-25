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
    public function index($page=1, $page_size=10) {
        $count = User::count();

        $list = User::all(function($query) use ($page, $page_size) {
            $query->page($page, $page_size)->order('created_at', 'desc');
        });

        return json([
            'data'=>[
                'users' => $list,
                'page' => $page,
                'count' => $count
            ], 
            'error'=>0, 
            'message'=>'操作完成'
        ]);
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
        // User
        $user_input = $request->post();
        $user_input['created_at'] = time();

        $validate_result = $this->validate($user_input, 'User');

        if (true === $validate_result) {
            $user = new User;
            $user->save($user_input);
            return json(['data' => NULL, 'error'=> 0, 'message'=>'操作完成']);
        } else {
            return json(['data' => NULL, 'error' => 1, 'message' => $validate_result]);
        }
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
        if (!Session::has("current_user")) {
            return json(['data'=>NULL, 'error'=>1, 'message'=>'用户未登录']);
        }

        $user = User::get($id);
        if (isset($user)) {
            $user->delete();
            return json(['data'=>NULL, 'error'=>0, 'message'=>'操作完成']);
        } else {
            return json(['data'=>NULL, 'error'=>1, 'message'=>'操作失败']);
        }
    }
}
