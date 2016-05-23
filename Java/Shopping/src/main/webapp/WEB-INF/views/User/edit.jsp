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
		<form action="/user?cmd=save" method="post">
			<table width="90%" id="general-table" align="center">
				<input type="hidden" name="id" value="${user.id}">
				<tr>
					<td>用户账号</td>
					<td><input type="text" name="username"
						value="${user.username}" /></td>
				</tr>
				<tr>
					<td>账号密码</td>
					<td><input type="password" name="password"
						value="${user.password}" /></td>
				</tr>
				<tr>
					<td>注册邮箱</td>
					<td><input type="text" name="email" value="${user.email}" /></td>
				</tr>
				<tr>
					<td>用户类型</td>
					<td><input type="text" name="type" value="${user.type}" /></td>
				</tr>
				<tr>
					<td>账号状态</td>
					<td><input type="text" name="status" value="${user.status}" /></td>
				</tr>
				<tr>
					<td>登录时间</td>
					<td><input type="text" name="loginTime"
						value="${user.loginTime}" onClick="WdatePicker()" /></td>
				</tr>

				<tr>
					<td>登陆IP</td>
					<td><input type="text" name="loginIp" value="${user.loginIp}" /></td>
				</tr>
				<tr>
					<td>上次登陆时间</td>
					<td><input type="text" name="lastLoginTime"
						value="${user.lastLoginTime}" onClick="WdatePicker()" /></td>
				</tr>
				<tr>
					<td>上次登陆IP</td>
					<td><input type="text" name="lastLoginIp"
						value="${user.lastLoginIp}" /></td>
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