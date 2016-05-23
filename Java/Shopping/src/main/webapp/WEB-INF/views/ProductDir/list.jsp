<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>ECSHOP 管理中心 - 商品分类</title>
<meta name="robots" content="noindex, nofollow">
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<link href=/styles/general.css" rel="stylesheet" type="text/css" />
	<link href="/styles/main.css" rel="stylesheet" type="text/css" />
</head>
<body>
	<h1>
		<span class="action-span"><a
			href="/system/dir?cmd=edit">添加分类</a></span> <span
			class="action-span1"><a href="__GROUP__">ECSHOP 管理中心</a></span> <span
			id="search_id" class="action-span1"> - 商品分类 </span>
		<div style="clear: both"></div>
	</h1>
	<form method="post" action="" name="listForm">
		<div class="list-div" id="listDiv">
			<table width="100%" cellspacing="1" cellpadding="2" id="list-table">
				<tr>
					<th>中文名称</th>
					<th>英文名称</th>
					<th>分类介绍</th>
					<th>操&emsp;&emsp;作</th>
				</tr>
				<c:forEach items="${list}" var="o">
				<tr align="center" class="0">
					<td align="center" class="first-cell">
						${o.name}
					</td>
			
					<td align="center">${o.englishName}</td>
					<td align="center">${o.intro}</td>
					<td align="center"><a
						href="/system/dir?cmd=edit&id=${o.id}">编辑</a>
						| <a
						href="/system/dir?cmd=delete&id=${o.id}"
						title="移除">移除</a></td>
				</tr>
				</c:forEach>
			</table>
		</div>
	</form>
	</body>
</html>