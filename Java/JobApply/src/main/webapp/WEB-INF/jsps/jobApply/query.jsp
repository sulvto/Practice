<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>搜索页面</title>

</head>
<body>
	<s:form action="jobApply_update">
		<tr>
			<img src="/image/818logo.png" width="200" height="100">
		</tr>
<!-- 		$("p").height(); -->
		<s:textfield name="keywords" theme="simple" />
		<s:submit action="jobApply_search" value="搜索" theme="simple" />
	</s:form>
		&ensp;&ensp;&ensp;&ensp;&ensp;&emsp;
		&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;
		&emsp;&ensp;&ensp;<font color="#F0F0F0">找工作:职位名称,公司名称,关键字</font>
	<hr>
<!-- <center > -->
	<s:if test="%{#jobs==0}">抱歉,未找到任何结果...</s:if><s:else>搜索到${jobs}条结果...</s:else>
	<fieldset  style="width: 800px">
	<s:iterator value="job">
		<tr>
			<a href="#"><u><td><s:property value="title"  escapeHtml="false" /></td></u></a><br>
			<td><s:property value="company"  escapeHtml="false" /></td> -
			<td><s:property value="city"  escapeHtml="false"/></td><br>
			<td><s:property value="content" escapeHtml="false" /></td><br>
			<td><s:property value="companyType" escapeHtml="false"/></td>
			<td><s:property value="trade" escapeHtml="false"/></td>
			<td><s:property value="salaryLevel" /></td>
			<td><a
				href="<s:url action="#"><s:param name="id" value="id"/></s:url>">屏蔽</a>
				<a
				href="<s:url action="#"><s:param name="id" value="id"/></s:url>">推荐</a>
				<a
				href="<s:url action="#"><s:param name="id" value="id"/></s:url>">更多...</a>
			</td>
		</tr><br>
	</s:iterator>
	</fieldset>
	
<!-- </center> -->

</body>
</html>