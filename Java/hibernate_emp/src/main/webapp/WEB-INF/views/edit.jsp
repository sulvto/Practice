<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>edit</title>
</head>
<body>
	<s:form action="emp_save">
		<s:hidden name="employee.id" />
		<s:textfield name="employee.name" label="用户名" />
		<s:textfield name="employee.salary"  label="薪水"/>
		<s:textfield name="employee.hireDate" label="入职时间"/>
		<s:select list="#depts" name="employee.department.id" listKey="id"
			listValue="name" label="部门" />
		<s:submit value="保存" />
	</s:form>
</body>
</html>