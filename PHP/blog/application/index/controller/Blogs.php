<?php

namespace app\index\controller;

use think\Controller;
use think\Session;
use think\Request;
use think\LOG;

use app\index\model\Blog;
use app\index\model\Comment;
use app\index\model\Link;

class Blogs extends Controller
{
    /**
     * 显示资源列表
     *
     * @return \think\Response
     */
    public function index($page=1, $page_size=10)
    {
        $count = Blog::count();

        $blog_list = Blog::all(function($query) use ($page, $page_size) {
            $query->page($page, $page_size)->order('created_at', 'desc');
        });

        return json([
            'data'=>[
                "blogs" => $blog_list,
                "page" => $page,
                "count" => $count
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
        // TODO: check input field
        $blog_input = $request->post();
        LOG::write($blog_input, "debug");
        $current_user = Session::get("current_user");

        // check user login
        if (isset($current_user)) {
            $blog = new Blog;
            $blog->data($blog_input);
            $blog->created_at = time();
            $blog->user_id = $current_user["id"];
            $blog->user_name = $current_user["username"];
            $blog->user_image = $current_user["image"];
            $blog->save();

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
        $blog = Blog::get($id);
        return json(['data'=>$blog, 'error'=>0, 'message'=>'操作成功']);
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
        $blog_input = $request->post();
        LOG::write($blog_input, "debug");
        $current_user = Session::get("current_user");

        // check user login
        if (isset($current_user)) {
            $blog = Blog::get($id);

            if ($current_user["id"] === $blog->user_id) {
                $blog->title     = $blog_input["title"];
                $blog->summary    = $blog_input["summary"];
                $blog->content    = $blog_input["content"];
                $blog->save();
                return json(['data'=>NULL, 'error'=>0, 'message'=>'操作完成']);
            } else {
                return json(['data'=>NULL, 'error'=>1, 'message'=>'操作失败']);
            }
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

        $blog = Blog::get($id);
        if (isset($blog) && $blog["user_id"] == $current_user["id"]) {
            $blog->delete();
            return json(['data'=>NULL, 'error'=>0, 'message'=>'操作完成']);
        } else {
            return json(['data'=>NULL, 'error'=>1, 'message'=>'操作失败']);
        }
    }

    /**
     * 显示资源列表
     *
     * @return \think\Response
     */
    public function index_view($page=1) {
        $page_size = 2;
        $count = Blog::count();
        $blogs = Blog::all(function($query) use ($page, $page_size){
            $query->page($page, $page_size)->order('created_at', 'desc');
        });
        $links = Link::all();

        return view('./blogs', [
            'blogs' => $blogs,
            'page' => $page,
            'page_size' => $page_size,
            'count'  => $count,
            'links' => $links
        ]);
    }

    /**
     * 显示指定的资源
     *
     * @param  int  $id
     * @return \think\Response
     */
    public function blog_view($id)
    {
        $blog = Blog::find($id);
        $comments = Comment::all(['blog_id'=>$id]);
        $links = Link::all();
        return view('./blog', [
            'blog' => $blog,
            'comments' => $comments,
            'links' => $links
        ]);
    }
}
