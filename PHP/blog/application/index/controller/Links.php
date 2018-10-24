<?php

namespace app\index\controller;

use think\Controller;
use think\Request;
use think\Session;
use think\LOG;

use app\index\model\Link;

class Links extends Controller
{
    /**
     * 显示资源列表
     *
     * @return \think\Response
     */
    public function index($page=1, $page_size=10)
    {
        $count = Link::count();

        $list = Link::all(function($query) use ($page, $page_size) {
            $query->page($page, $page_size);
        });

        return json([
                'data'=>[
                    'links' => $list,
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
        $link_input = $request->post();
        LOG::write($link_input, "debug");
        $current_user = Session::get("current_user");

        // check user login
        if (isset($current_user)) {
            $link = new Link;
            $link->data($link_input);
            $link->save();

            return json(['data'=>NULL, 'error'=>1, 'message'=>'操作完成']);
        } else {
            return json(['data'=>NULL, 'error'=>1, 'message'=>'用户未登录']);
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
        // TODO: check input field
        $link_input = $request->post();
        LOG::write($link_input, "debug");
        $current_user = Session::get("current_user");

        // check user login
        if (isset($current_user)) {
            $link = Link::get($id);

            $link->name     = $link_input["name"];
            $link->url    = $link_input["url"];
            $link->save();
            return json(['data'=>NULL, 'error'=>0, 'message'=>'操作完成']);
        } else {
            return json(['data'=>NULL, 'error'=>1, 'message'=>'用户未登录']);
        }
    }

    /**
     * 删除指定资源
     *
     * @param  int  $id
     * @return \think\Response
     */
    public function delete($id)
    {
        $current_user = Session::get("current_user");

        if (!isset($current_user)) {
            return json(['data'=>NULL, 'error'=>1, 'message'=>'用户未登录']);
        }

        $link = Link::get($id);
        if (isset($link)) {
            $link->delete();
            return json(['data'=>NULL, 'error'=>0, 'message'=>'操作完成']);
        } else {
            return json(['data'=>NULL, 'error'=>1, 'message'=>'操作失败']);
        }
    }
}
