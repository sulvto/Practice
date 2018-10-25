<?php

namespace app\index\controller;

use think\Controller;
use think\Request;
use think\LOG;
use think\Session;

use app\index\model\Comment;

class Comments extends Controller
{
    /**
     * 显示资源列表
     *
     * @return \think\Response
     */
    public function index($page=1, $page_size=10)
    {
        $count = Comment::count();
        
        $list = Comment::all(function($query) use ($page, $page_size) {
            $query->page($page, $page_size)->order('created_at', 'desc');
        });

        return json([
                'data'=>[
                    'comments' => $list,
                    'page' => $page,
                    'count' => $count,
                    'page_size' => $page_size
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
    public function create()
    {
        //
    }

    /**
     * 保存新建的资源
     *
     * @param  \think\Request  $request
     * @return \think\Response
     */
    public function save(Request $request)
    {
        $comment_input = $request->post();
        LOG::write($comment_input, "debug");

        // check user login
        if (!Session::has("current_user")) {
            return json(['data' => NULL, 'error' => 1, 'message' => '用户未登录']);
        }

        $validate_result = $this->validate($comment_input, 'Comment');

        if (true === $validate_result) {
            $current_user = Session::get("current_user");

            $cmment = new Comment;
            $cmment->data($comment_input);
            $cmment->created_at = time();
            $cmment->user_id = $current_user["id"];
            $cmment->user_name = $current_user["username"];
            $cmment->user_image = $current_user["image"];
            $cmment->save();

            return json(['data'=>NULL, 'error'=>0, 'message'=>'操作完成']);
        } else {
            return json(['data'=>NULL, 'error'=>1, 'message'=> $validate_result]);
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
        //
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

        $current_user = Session::get("current_user");
        $comment = Comment::get($id);
        if (isset($comment) && $comment["user_id"] == $current_user["id"]) {
            $comment->delete();
            return json(['data'=>NULL, 'error'=>0, 'message'=>'操作完成']);
        } else {
            return json(['data'=>NULL, 'error'=>1, 'message'=>'操作失败']);
        }
    }
}
