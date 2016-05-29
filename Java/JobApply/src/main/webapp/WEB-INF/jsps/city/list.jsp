<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>city列表页面</title>
</head>
<body>
<table border="1">
	<tr>
		<td colspan="4"><a href="<s:url action="city_edit" />">添加</a></td>
	</tr>
	<tr>
		<td width="200">ID</td>
		<td width="200">名字</td>
		<td width="200">操作</td>
	</tr>
	<s:iterator value="citys">
		<tr>
			<td><s:property value="id"/></td>
			<td><s:property value="name"/></td>
			<td>
				<a href="<s:url action="city_edit"><s:param name="id" value="id"/></s:url>">修改</a>
				<a href="<s:url action="city_delete"><s:param name="id" value="id"/></s:url>">删除</a>
			</td>
		</tr>
	</s:iterator>
</table>
</body>
</html>