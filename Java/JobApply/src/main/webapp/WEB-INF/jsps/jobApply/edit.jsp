<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>添加页码</title>
</head>
<body>
	<s:form action="jobApply_update">
		<s:hidden name="jobApply.id" />
		<s:textfield name="jobApply.title" value="%{jobApply.title}" label="标题" />
		<s:textarea name="jobApply.content" value="%{jobApply.content}" label="内容"/>
		
		<s:select name="jobApply.city.id" list="citys" label="工作城市"
			listKey="id" listValue="name" headerKey="-1" headerValue="-----" />
		<s:select name="jobApply.trade.id" list="trades" label="工作行业"
			listKey="id" listValue="name" headerKey="-1" headerValue="-----" />
		<s:select name="jobApply.company.id" list="companys" label="工作单位"
			listKey="id" listValue="name" headerKey="-1" headerValue="-----" />
		<s:select name="jobApply.salaryLevel.id" list="salayLevels" label="薪水级别"
			listKey="id" listValue="name" headerKey="-1" headerValue="-----" />
		<s:submit value="提交" />
	</s:form>
</body>
</html>