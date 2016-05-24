<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
<link href="css/index.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="js/common.js"></script>

<title>成都蓝源进销存系统(教学版)-menu列表页</title>
</head>
<body>

		<div class="content-right">
	<%-- 		<s:actionmessage /> --%>
	<div class="content-r-pic">
		<div style="margin: 8px auto auto 12px;">
			<img src="images/ping.gif" width="138" height="17" />
		</div>
	</div>
	<div class="content-text">
		<div class="square-o-top">
			<table width="100%" border="0" cellpadding="0"
				cellspacing="0"
				style="font-size: 14px; font-weight: bold; font-family:"黑体";">
				<tr>
					<td height="24">&nbsp;</td>
				</tr>
				<tr>
					<td width="60" height="30">&nbsp;&nbsp;&nbsp;名称:</td>
					<td width="133"><s:textfield name="baseQuery.name"
							id="baseQuery_name" size="18" theme="simple"></s:textfield></td>
					<td width="85"><a href="#" onclick="go();"><img
							src="images/can_b_01.gif" border="0" /></a></td>
					<td width="136"><a href="menu_input.action"><img
							src="images/can_b_02.gif" border="0" /></a></td>
				</tr>

			</table>
		</div>
		<!--"square-o-top"end-->
		<div class="square-order">
			<table id="itemTable" width="100%" border="1" cellpadding="0" cellspacing="0">
				<tr align="center"
					style="background: url(images/table_bg.gif) repeat-x;">
					<td width="13%" height="30">编号</td>
					<td width="16%">名称</td>
<!-- 					<td width="15%">密码</td> -->
<!-- 					<td width="14%">邮箱</td> -->
<!-- 					<td width="14%">年龄</td> -->
<!-- 					<td width="14%">部门</td> -->
					<td width="16%">操作</td>
				</tr>
				<s:iterator value="pageResult.rows" >
					<tr align="center" bgcolor="#FFFFFF">
						<td height="28">${id}</td>
						<td>${name}</td>
<%-- 						<td>${password}</td> --%>
<%-- 						<td>${email}</td> --%>
<%-- 						<td>${age}</td> --%>
<%-- 						<td>${department.name}</td> --%>
						<td><img src="images/icon_3.gif" /> <span
							style="line-height: 12px; text-align: center;"> <a
								class="xiu" href="#" onclick="updateDomain('menu',${id});">修改</a></span>
							<img src="images/icon_04.gif" /> <span
							style="line-height: 12px; text-align: center;"> <a
								class="xiu" href="#"
								onclick="deleteDomain('menu_delete.action',${id},this);">删除</a>
						</span></td>
					</tr>
				</s:iterator>
				<!--"container"end-->

			</table>

		</div>
	</div>
	<%@ include file="/WEB-INF/pages/page.jsp"%>
	</div>

	<s:hidden name="pageResult.totalPage" id="totalPage"></s:hidden>
	<s:form id="domainForm" action="menu">
		<s:hidden name="baseQuery.currentPage" id="pageNo"></s:hidden>
		<s:hidden name="baseQuery.pageSize" id="setPageSize"></s:hidden>
		<s:hidden name="baseQuery.name" id="name"></s:hidden>
		<s:hidden name="baseQuery.dept" id="dept_name"></s:hidden>
	</s:form>
</body>
</html>
