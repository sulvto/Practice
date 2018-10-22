<?php

namespace app\index\controller;

use think\Controller;
use think\Request;

class Blog extends Controller
{
    /**
     * 显示资源列表
     *
     * @return \think\Response
     */
    public function index() {
        $blogs = array([
            "id" => 1,
            "title" => "blog title",
            "content" => "asdasczxaasdasczxaasdasczxaasdasczxaasdasczxaasdasczxaasdasczxaasdasczxaasdasczxaasdasczxaasdasczxaasdasczxaasdasczxaasdasczxaasdasczxa",
            "summary" => "summary csasdasfcsasdasfcsasdasf",
            "created_at" => ""
        ],
        [
            "id" => 2,
            "title" => "blog title title",
            "content" => "aaaaaaaa",
            "summary" => "summary contentcontentcontentcontentcontent",
            "created_at" => ""
        ]);

        return view('./blogs', [
            'blogs' => $blogs
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
        $blog = [
            "id" => 1, 
            "title" => "ttttitle", 
            "created_at" => "11", 
            "html_content" => "contentcontentcontentcontent", 
            "user_image" => "user", 
            "user_name" => "qinchao"
        ];

        $comments = [];

        return view('./blog', [
            'blog' => $blog,
            'comments' => $comments
        ]);
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
}
