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
<s:form action="trade_update">
	<s:hidden name="trade.id" />
	<s:textfield name="trade.name" value="%{trade.name}" label="名字" />
	<s:submit value="提交" />
</s:form>
</body>
</html>