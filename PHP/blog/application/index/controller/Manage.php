<?php

namespace app\index\controller;

use think\Controller;
use think\Request;

class Manage extends Controller
{
    /**
     * 显示资源列表
     *
     * @return \think\Response
     */
    public function index()
    {
        //
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
        //
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
        //
    }

    /**
     * 管理blog页
     */
    public function blogs() {
        $page_index = 1;

        return view("./manage_blogs", [
            "page_index" => $page_index
        ]);
    }

    /**
     * 
     * 创建blog页
     */
    public function blogs_edit($id="") {
        $page_index = 1;
        $action = "/public/?s=/api/blogs/".$id;

        return view("./manage_blog_edit", [
            "page_index" => $page_index,
            "action" => $action,
            "id" => $id
        ]);
    }

    /**
     * 
     * 创建blog页
     */
    public function links_edit($id="") {
        $page_index = 1;
        $action = "/public/?s=/api/links/".$id;

        return view("./manage_link_edit", [
            "page_index" => $page_index,
            "action" => $action,
            "id" => $id
        ]);
    }

    /**
     * 管理comment页
     */
    public function comments() {
        $page_index = 1;

        return view("./manage_comments", [
            "page_index" => $page_index
        ]);
    }

    /**
     * 管理user页
     */
    public function users() {
        $page_index = 1;

        return view("./manage_users", [
            "page_index" => $page_index
        ]);
    }

    /**
     * 管理友情链接页
     */
    public function links() {
        return view("./manage_links");
    }
}
