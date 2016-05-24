<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
<link href="css/index.css" rel="stylesheet" type="text/css" />

<script type="text/javascript" src="js/common.js"></script>

<script type="text/javascript" src="js/jquery.js"></script>
<script type="text/javascript">
	function findProduct(json) {
// 		alert(0);
// 		alert(json.salePrice);
		//把值传递到后面的页面
		window.returnValue = json;
		window.close();
	}
</script>
<title>成都蓝源进销存系统(教学版)-product列表页</title>
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
				<table width="100%" border="0" cellpadding="0" cellspacing="0"
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
						<td width="136"><a href="product_input.action"><img
								src="images/can_b_02.gif" border="0" /></a></td>
					</tr>

				</table>
			</div>
			<!--"square-o-top"end-->
			<div class="square-order">
				<table id="itemTable" width="100%" border="1" cellpadding="0"
					cellspacing="0">
					<tr align="center"
						style="background: url(images/table_bg.gif) repeat-x;">
						<td width="7%" height="30">编号</td>
						<td width="10%">名称</td>
						<td width="10%">颜色</td>
						<td width="10%">图片</td>
						<td width="10%">成本</td>
						<td width="10%">售价</td>
						<td width="10%">类型</td>
						<td width="10%">选择</td>
					</tr>
					<s:iterator value="pageResult.rows">
						<tr align="center" bgcolor="#FFFFFF">
							<td height="28">${id}</td>
							<td>${name}</td>
							<td>${color}</td>
							<td><s:if test="pic!=null">
									<img src="${pic}" width="50" height="50" />
								</s:if> <s:else>未上传</s:else></td>
							<td>${costPrice}</td>
							<td>${salePrice}</td>
							<td>${types.name}</td>
							<td><input type="button" value="确定"
								onclick='findProduct({"id":"${id}","name":"${name}","color":"${color}","costPrice":${costPrice}});' /></td>
						</tr>
					</s:iterator>
					<!--"container"end-->

				</table>

			</div>
		</div>
		<%@ include file="/WEB-INF/pages/page.jsp"%>
	</div>

	<s:hidden name="pageResult.totalPage" id="totalPage"></s:hidden>
	<s:form id="domainForm" action="product">
		<s:hidden name="baseQuery.currentPage" id="pageNo"></s:hidden>
		<s:hidden name="baseQuery.pageSize" id="setPageSize"></s:hidden>
		<s:hidden name="baseQuery.name" id="name"></s:hidden>
		<s:hidden name="baseQuery.dept" id="dept_name"></s:hidden>
	</s:form>
</body>
</html>
