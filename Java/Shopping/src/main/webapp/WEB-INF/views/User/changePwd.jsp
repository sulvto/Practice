<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>ECSHOP 管理中心 - 添加分类</title>
<meta name="robots" content="noindex, nofollow">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link href="/styles/general.css" rel="stylesheet" type="text/css" />
<link href="/styles/main.css" rel="stylesheet" type="text/css" />
<script language="javascript" type="text/javascript"
	src="My97DatePicker/WdatePicker.js"></script>
</head>
<body>
	<h1>
		<span class="action-span"><a
			href="/user?cmd=list">用户列表</a></span> <span
			class="action-span1"><a href="__GROUP__">ECSHOP 管理中心</a></span> <span
			id="search_id" class="action-span1"> - 添加分类 </span>
		<div style="clear: both"></div>
	</h1>
	
	<div class="main-div">
		<form action="/changePwd?cmd=chage" method="post">
			<table width="90%" id="general-table" align="center">
				<input type="hidden" name="id" value="${user.id}">
				<tr>
					<td>原始密码</td>
					<td><input type="password" name="oldPwd"
						/></td>
				</tr>
				<tr>
					<td>新的密码</td>
					<td><input type="password" name="newPwd"/></td>
				</tr>
				<tr>
					<td>确认密码</td>
					<td><input type="password" name="reNewPwd" /></td>
				</tr>
				
			</table>
			<div class="button-div">
				<input type="submit" value=" 确定 " /> <input type="reset"
					value=" 重置 " />
			</div>
		</form>
	</div>
</body>
</html>