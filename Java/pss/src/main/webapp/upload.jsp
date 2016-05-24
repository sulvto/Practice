<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	function uploadDomain(url) {
		// 	alert("qweqw");
		document.forms[0].action = url + "_upload.action";
		// 	$("form").attr("action", url + "_upload.action");
		document.forms[0].submit();
		document.forms[0].attr("action", url + ".action");
		document.forms[0].submit();
		// 	$("#domainForm").submit();
		// 	$("#domainForm").attr("action", url + ".action");
	}
</script>
</head>
<body>
	提示:上传的数据将不会覆盖原有相同数据<br/>
	<s:form id="domainForm" action="employee" method="post"
		enctype="multipart/form-data">
		<s:file name="upload" label="文件" />
	</s:form>
	<td width="85"><a href="#" onclick="uploadDomain('employee');">上传</a></td>
</body>
</html>