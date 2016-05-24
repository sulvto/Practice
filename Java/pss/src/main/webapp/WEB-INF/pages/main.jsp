<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
<link href="css/index.css" rel="stylesheet" type="text/css" />
<title>成都蓝源进销存系统(教学版)-系统主页</title>

</head>
<body>
	<div class="container">
		<div class="head">
			<div class="head-left">
				<span style="font-weight: bold; color: #1f4906">欢迎您 </span><span
					style="color: #4a940d;">${user.name}</span>
			</div>
			<div class="head-right">
				<table width="100%" border="0" cellpadding="0" cellspacing="0">
					<tr>
						<td width="32%"><a href="#"><img src="images/head-l.gif"
								border="0" /></a></td>
						<td width="26%"><a href="javascript:void(0)" class="easyui-linkbutton" onclick="$('#w').window('open')"><img src="images/head-m.gif"
								border="0" /></a></td>
						<td width="7%">&nbsp;</td>
						<td width="35%"><a href="#"><img src="images/head-r.gif"
								border="0" /></a></td>
					</tr>
				</table>
			</div>
		</div>

		<!--"head"end-->
		<div class="content">

			<%@ include file="/WEB-INF/pages/left.jsp"%>
			<!--"left"end-->

			<iframe src="right.action"
				style="width: 848px; float: right; height: 530px" scrolling="no"
				name="main" frameborder="0"></iframe>
			<!--"content-right"end-->
		</div>
		<!--"content"end-->
		<div class="footer">
			<div style="margin-top: 5px;">
				<table width="98%" border="0" cellpadding="0" cellspacing="0"
					align="center">
					<tr>
						<td width="82%"><img src="images/icon_1.gif" />&nbsp;<a
							class="lanyo" href="www.lanyotech.com">蓝源信息技术 2014</a></td>
						<td width="18%" valign="middle"><img src="images/icon_2.gif" />&nbsp;<a
							class="lanyo" href="#">如有疑问请与技术人员联系</a></td>
					</tr>
				</table>
			</div>

		</div>
		<!--"footer"end-->
	</div>
	<!--"container"end-->

</body>
</html>
