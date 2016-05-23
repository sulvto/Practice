<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>ECSHOP 管理中心 - 商品列表</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link href="/styles/general.css" rel="stylesheet" type="text/css" />
<link href="/styles/main.css" rel="stylesheet" type="text/css" />
</head>
<body>
	<h1>
		<span class="action-span"><a href="/user?cmd=edit">添加用户</a></span>
	</h1>
	<form method="post" action="" name="listForm" onsubmit="">
		<div class="list-div" id="listDiv">
			<table cellpadding="3" cellspacing="1">
				<tr>
					<th>用户账号</th>
					<th>账号密码</th>
					<th>注册邮箱</th>
					<th>用户类型</th>
					<th>账号状态</th>
					<th>登录时间</th>
					<th>登陆IP</th>
					<th>上次登录时间</th>
					<th>上次登录IP</th>
					<th>操作</th>
				</tr>
				<c:forEach items="${list}" var="o">
					<tr>
						<td align="center">${o.username}</td>
						<td align="center">${o.password}</td>
						<td align="center">${o.email}</td>
						<td align="center">${o.type}</td>
						<td align="center">${o.status}</td>
						<td align="center">${o.loginTime}</td>
						<td align="center">${o.loginIp}</td>
						<td align="center">${o.lastLoginTime}</td>
						<td align="center">${o.lastLoginIp}</td>

						<td><a href="__APP__/Goods/?goods_id=<{$val.goods_id}>"
							target="_blank" title="查看"><img src="/images/icon_view.gif"
								width="16" height="16" border="0" /></a> <a
							href="/user?cmd=edit&id=${o.id}" title="编辑"><img
								src="/images/icon_edit.gif" width="16" height="16" border="0" /></a>
							<a href="/user?cmd=delete&id=${o.id}" onclick="" title="回收站"><img
								src="/images/icon_trash.gif" width="16" height="16" border="0" /></a>
						</td>
					</tr>
				</c:forEach>
			</table>

			<!-- 分页开始 -->
			<table id="page-table" cellspacing="0">
				<tr>
					<td width="80%">&nbsp;</td>
					<td align="center" nowrap="true"><{$showPage}></td>
				</tr>
			</table>
			<!-- 分页结束 -->
		</div>
	</form>
</body>
</html>