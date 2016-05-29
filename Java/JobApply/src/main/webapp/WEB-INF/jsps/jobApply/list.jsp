<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>列表页面</title>
</head>
<body>
<table border="1" cellpadding="0" cellspacing="0" width="100%">
	<tr>
		<td colspan="5">
			<a href="<s:url action="jobApply_edit" />">添加</a>
		</td>
		<td colspan="4">
			<a href="<s:url action="jobApply_recreateIndex" />">重建索引</a>
		</td>
	</tr>
	<tr>
		<td width="10">ID</td>
		<td width="200">标题</td>
		<td width="400">内容</td>
		<td width="150">公司</td>
		<td width="100">公司类型</td>
		<td width="200">行业</td>
		<td width="120">工作地点</td>
		<td width="200">薪水范围</td>
		<td width="200">操作</td>
	</tr>
	<s:iterator value="jobApplys">
		<tr>
			<td><s:property value="id"/></td>
			<td><s:property value="title"/></td>
			<td><s:property value="content"/></td>
			<td><s:property value="company.name"/></td>
			<td><s:property value="company.companyType.name"/></td>
			<td><s:property value="trade.name"/></td>
			<td><s:property value="city.name"/></td>
			<td><s:property value="salaryLevel.name"/></td>
			<td>
				<a href="<s:url action="jobApply_edit"><s:param name="id" value="id"/></s:url>">修改</a>
				<a href="<s:url action="jobApply_delete"><s:param name="id" value="id"/></s:url>">删除</a>
			</td>
		</tr>
	</s:iterator>
</table>
</body>
</html>