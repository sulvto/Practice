<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
<link href="css/index.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="js/common.js"></script>
<script type="text/javascript" src="js/My97DatePicker/WdatePicker.js"></script>
<title>成都蓝源进销存系统(教学版)-purchaseBill列表页</title>
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
			<s:form id="domainForm" action="purchaseBill">
				<div class="square-o-top">
					<table width="100%" border="0" cellpadding="0" cellspacing="0"
						style="font-size: 14px; font-weight: bold; font-family:"黑体";">
						<tr>
							<td height="24">&nbsp;</td>
						</tr>
						<tr>
							<td height="25">单据发生时间:<s:textfield
									name="baseQuery.beginDate" size="12" onclick="WdatePicker();"
									theme="simple"></s:textfield>到 <s:textfield
									name="baseQuery.endDate" size="12" onclick="WdatePicker();"
									theme="simple"></s:textfield>
							</td>
							<td width="52">&nbsp;&nbsp;状态:</td>
							<td width="149"><s:select
									list="#{'-2':'-请选择-','-1':'作废','0':'待审','1':'已审'}"
									name="baseQuery.status" onchange="go();" /></td>
							<td width="85"><a href="#" onclick="go();"><img
									src="images/can_b_01.gif" border="0" /></a></td>
							<td width="136"><a href="purchaseBill_input.action"><img
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
							<td width="6%" height="30">编号</td>
							<td width="14%">时间</td>
							<td width="8%">总金额</td>
							<td width="8%">总数量</td>
							<td width="14%">录入时间</td>
							<td width="14%">状态</td>
							<td width="14%">供应商</td>
							<td width="16%">操作</td>
						</tr>
						<s:iterator value="pageResult.rows">
							<tr align="center" bgcolor="#FFFFFF">
								<td height="28">${id}</td>
								<td>${vdate}</td>
								<td>${totalAmount}</td>
								<td>${totalNum}</td>
								<td>${inputTime}</td>
								<!-- 0待审,1已审,-1作废 -->
								<td><s:if test="status==-1">作废</s:if> <s:elseif
										test="status==1">已审</s:elseif> <s:else>待审</s:else></td>
								<td>${supplier.name}</td>
								<td><img src="images/icon_3.gif" /> <span
									style="line-height: 12px; text-align: center;"> <a
										class="xiu" href="#"
										onclick="updateDomain('purchaseBill',${id});">修改</a></span> <img
									src="images/icon_04.gif" /> <span
									style="line-height: 12px; text-align: center;"> <a
										class="xiu" href="#"
										onclick="deleteDomain('purchaseBill_delete.action',${id},this);">删除</a>
								</span></td>
							</tr>
						</s:iterator>
						<!--"container"end-->

					</table>

				</div>
				<s:hidden name="baseQuery.currentPage" id="pageNo"></s:hidden>
				<s:hidden name="baseQuery.pageSize" id="setPageSize"></s:hidden>
			</s:form>
		</div>
			<%@ include file="/WEB-INF/pages/page.jsp"%>
		</div>
</body>
</html>
