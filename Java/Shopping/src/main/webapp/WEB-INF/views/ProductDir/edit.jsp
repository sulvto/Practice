<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<!-- $Id: category_info.htm 16752 2009-10-20 09:59:38Z wangleisvn $ -->
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>ECSHOP 管理中心 - 添加分类 </title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link href="/styles/general.css" rel="stylesheet" type="text/css" />
<link href="/styles/main.css" rel="stylesheet" type="text/css" />
</head>
<body>
<h1>
    <span class="action-span"><a href="__GROUP__/Category/categoryList">商品分类</a></span>
    <span class="action-span1"><a href="__GROUP__">ECSHOP 管理中心</a></span>
    <span id="search_id" class="action-span1"> - 添加分类 </span>
</h1>
<div class="main-div">
    <form action="/system/dir?cmd=save" method="post" name="theForm">
    	<input type="hidden" name="id" value="${dir.id}"/>
        <table width="100%" id="general-table">
            <tr>
                <td class="label">分类名称:</td>
                <td>
                    <input type='text' name='name' maxlength="20" value='${dir.name}' size='27' /> <font color="red">*</font>
                </td>
            </tr>
            <tr>
                <td class="label">英文名称:</td>
                <td>
                    <input type='text' name='englishName' maxlength="20" value='${dir.englishName}' size='27' /> <font color="red">*</font>
                </td>
            </tr>
           	<tr>
                   <td class="label">分类描述</td>
                    <td>
                        <textarea name="intro" cols="25" rows="5">${dir.intro}</textarea>
                    </td>
             </tr>
        </table>
        <div class="button-div">
            <input type="submit" value=" 确定 " class="button"/>
            <input type="reset" value=" 重置 " class="button"/>
        </div>
    </form>
</div>

</body>
</html>