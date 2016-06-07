<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>hibernate</title>
<script type="text/javascript">
	function pageSize(page) {
		var pageNo = document.getElementById("currentPage").value;
		if (page == "up") {
			document.getElementById("currentPage").value = --pageNo;
		} else if (page == "next") {
			document.getElementById("currentPage").value = ++pageNo;
		} else if (page == "first") {
			document.getElementById("currentPage").value = 1;
		} else if (page == "last") {
			var lastpage = document.getElementById("lastPage").value;
			document.getElementById("currentPage").value = lastpage;
		}
		var pageSize = document.getElementById("selectPageSize").value;
		document.getElementById("pageSize").value = pageSize;
		document.forms[0].submit();
	}
</script>
</head>
<body>
	<s:form action="emp">
		<s:hidden name="lastPage" id="lastPage" />
		<s:hidden name="pageNo" id="currentPage" />
		<s:hidden name="pageSize" id="pageSize" />
	</s:form>
	<table border="1">
		<tr>
			<th>编&emsp;号</th>
			<th>姓&emsp;名</th>
			<th>薪&emsp;水</th>
			<th>入职时间</th>
			<th>所属部门</th>
			<th>操&emsp;作</th>
		</tr>
		<s:iterator value="employees">
			<tr>
				<td>${id}</td>
				<td>${name}</td>
				<td>${salary}</td>
				<td>${hireDate}</td>
				<td>${department.name}</td>
				<td><s:a action="emp_input">
						<s:param name="employee.id" value="id" />编辑
				</s:a>|| <s:a action="emp_delete">
						<s:param name="employee.id" value="id" />删除
				</s:a></td>
			</tr>
		</s:iterator>

	</table>

	<a href="javascript:pageSize('first')">首页</a>&emsp;
	<a href="javascript:pageSize('up')">上一页</a>&emsp;
	<a href="javascript:pageSize('next')">下一页</a>&emsp;
	<a href="javascript:pageSize('last')">末页</a>&emsp;
	<s:select list="{1,2,3,4,5,6,7,8,9,10}" id="selectPageSize"
		label="显示条数" onchange="pageSize()" name="pageSize" />
	<s:a action="emp_input">添加员工</s:a>

</body>
</html>