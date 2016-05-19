<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<!-- $Id: category_info.htm 16752 2009-10-20 09:59:38Z wangleisvn $ -->
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>ECSHOP 管理中心 - 添加用户 </title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link href="/styles/general.css" rel="stylesheet" type="text/css" />
<link href="/styles/main.css" rel="stylesheet" type="text/css" />
</head>
<body>
<h1>
    <span class="action-span"><a href="">用户</a></span>
    <span class="action-span1"><a href="__GROUP__">ECSHOP 管理中心</a></span>
    <span id="search_id" class="action-span1"> - 添加用户 </span>
</h1>
<div class="main-div">
    <form action="/system/user?cmd=save" method="post" name="theForm">
    	<input type="hidden" name="id" value="${user.id}"/>
        <table width="100%" id="general-table">
            <tr>
                <td class="label">用户账号:</td>
                <td>
                    <input type='text' name='username' maxlength="20" value='${user.username}' size='27' /> <font color="red">*</font>
                </td>
            </tr>
            <tr>
                <td class="label">用户密码:</td>
                <td>
                    <input type='text' name='password' maxlength="20" value='${user.password}' size='27' /> <font color="red">*</font>
                </td>
            </tr>
            <tr>
                <td class="label">电子邮件:</td>
                <td>
                    <input type='text' name='email' maxlength="20" value='${user.email}' size='27' /> <font color="red">*</font>
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