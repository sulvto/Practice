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

<title>成都蓝源进销存系统(教学版)-purchaseBillItem列表页</title>
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
			<s:form id="domainForm" action="purchaseBillItem_query.action">
				<div class="square-o-top">
					<table width="100%" border="0" cellpadding="0" cellspacing="0"
						style="font-size: 14px; font-weight: bold; font-family:"黑体";">
						<tr>
							<td height="24">&nbsp;</td>
						</tr>
						<tr>
							<td height="40" width="200">时间:<s:textfield name="baseQuery.beginDate"
									size="12" onclick="WdatePicker();" theme="simple"></s:textfield>到
								<s:textfield name="baseQuery.endDate" size="12"
									onclick="WdatePicker();" theme="simple"></s:textfield>
							</td>
							<td width="100">状态:<s:select
									list="#{'-2':'-请选择-','-1':'作废','0':'待审','1':'已审'}"
									name="baseQuery.status" theme="simple"></s:select></td>
							<td width="100">分组:<s:select
									list="#{'o.bill.supplier.name':'供应商分组','o.bill.buyer.name':'采购员分组','o.bill.buyer.name':'采购员分组'}"
									name="baseQuery.groupBy" theme="simple"></s:select></td>
							<td width="85"><a href="#" onclick="go();"><img
									src="images/can_b_01.gif" border="0" /></a></td>
						</tr>
					</table>
				</div>
				<!--"square-o-top"end-->
				<div class="square-order">
					<table id="itemTable" width="100%" border="1" cellpadding="0"
						cellspacing="0">
						<tr align="center"
							style="background: url(images/table_bg.gif) repeat-x;">
							<th height="28">编号</th>
							<th>供应商</th>
							<th>采购员</th>
							<th>产品名称</th>
							<th>交易时间</th>
							<th>采购数量</th>
							<th>采购价格</th>
							<th>小计</th>
							<th>审核人</th>
							<th>产品类型</th>
							<th>状态</th>
						</tr>
						<s:iterator value="#list" var="objects">
							<tr align="center" bgcolor="#FFFFFF">
								<td height="28" align="left" colspan="11">
									${objects[0]}-${objects[1]}</td>
								<s:set var="totalAmount" value="0" />
								<s:set var="totalNum" value="0" />
								<s:iterator value="findPurchaseBillItem(#objects[0])">

									<tr align="center">
										<td>${id}</td>
										<td>${bill.supplier.name}</td>
										<td>${bill.buyer.name}</td>
										<td>${product.name}</td>
										<td>${bill.vdate}</td>
										<td>${num}</td>
										<td>${price}</td>
										<td>${amount}</td>
										<td>${bill.auditor.name}</td>
										<td>${product.types.name}</td>
										<td><s:if test="bill.status==1">已审</s:if> <s:elseif
												test="bill.status==0">待审</s:elseif> <s:else>作废</s:else></td>
										<s:set var="totalAmount" value="#totalAmount+amount" />
										<s:set var="totalNum" value="#totalNum+num" />
									</tr>
								</s:iterator>
								<tr align="center" style="color: red">
									<td align="left" colspan="5">合计:</td>
									<td>${totalNum}</td>
									<td></td>
									<td>${totalAmount}</td>
									<td colspan="3"></td>
								</tr>
							</tr>
						</s:iterator>
						<!--"container"end-->
					</table>

				</div>
				<%-- 				<s:hidden name="pageResult.totalPage" id="totalPage"></s:hidden> --%>
				<s:hidden name="baseQuery.currentPage" id="pageNo"></s:hidden>
				<s:hidden name="baseQuery.pageSize" id="setPageSize"></s:hidden>
			</s:form>
		</div>
		<%@ include file="/WEB-INF/pages/page.jsp"%>
	</div>



</body>
</html>
