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
    <span class="action-span1"><a href="__GROUP__">ECSHOP 管理中心</a></span>
    <span id="search_id" class="action-span1"> - 密码修改 </span>
</h1>
<div class="main-div">
	${errors}
    <form action="/system/changePwd?cmd=change" method="post" name="theForm">
    	<input type="hidden" name="id" value="${user.id}"/>
        <table width="100%" id="general-table">
            <tr>
                <td class="label">原始密码:</td>
                <td>
                    <input type='text' name='oldPwd' maxlength="20"  size='27' required/> <font color="red">*</font>
                </td>
            </tr>
            <tr>
                <td class="label">新的密码:</td>
                <td>
                    <input type='text' name='newPwd' maxlength="20" size='27' required/> <font color="red">*</font>
                </td>
            </tr>
            <tr>
                <td class="label">确认密码:</td>
                <td>
                    <input type='text' name='reNewPwd' maxlength="20" size='27' required/> <font color="red">*</font>
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