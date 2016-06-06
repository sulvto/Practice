<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
<link href="css/index.css" rel="stylesheet" type="text/css" />
<link rel="stylesheet" type="text/css" media="screen"
	href="css/screen.css" />
<script src="js/validation/jquery.js" type="text/javascript"></script>
<script src="../../../js/validation/jquery.validate.js" type="text/javascript"></script>
<script src="js/validation/messages_cn.js" type="text/javascript"></script>

<script type="text/javascript" src="../../../js/purchaseBill.js"></script>
<script type="text/javascript"
	src="../../../js/My97DatePicker/WdatePicker.js"></script>
<title>成都蓝源进销存系统(教学版)-purchaseBill编辑界面</title>
<script type="text/javascript">
	function submit() {
		document.forms[0].submit();
	}
	function cancel() {
		window.history.back();//获取浏览器缓存对象
	}
	function reset() {

		$("input[name!='id'][name!='baseQuery.pageSize'][name!='baseQuery.currentPage']")
				.val("");
		$("select").val("-1");
	}
</script>
</head>

<body>
	<div class="content-right">
		<div class="content-r-pic">
			<div style="margin: 5px auto auto 12px;">
				<img src="images/canping.gif" width="138" height="17" />
			</div>
		</div>

		<div class="content-text">
			<div class="square-order">
				<div style="border: 1px solid #cecece;">
					<s:hidden name="id" />

					<s:form id="purchaseBillForm" action="purchaseBill_save">
						<s:hidden name="baseQuery.currentPage" />
						<s:hidden name="baseQuery.pageSize" />
						<s:hidden name="id" />

						<table width="100%" border="0" cellpadding="0" cellspacing="0">
							<tr bgcolor="#FFFFFF">
								<td width="22%" align="center">交易时间</td>
								<td width="29%"><s:date name="vdate" format="yyyy-MM-dd"
										var="date" /> <s:textfield name="vdate" value="%{date}"
										onClick="WdatePicker({maxDate:new Date()})" cssClass="Wdate"
										size="12" /></td>
							</tr>
							<tr bgcolor="#FFFFFF">
								<td height="30" align="center">供应商列表</td>
								<td>
									<s:select list="#allSuppliers" name="supplier.id"
											listValue="name"  listKey="id" />
								</td>
								<td height="30" align="center">采购员列表</td>
								<td>
									<s:select list="#allBuyers" name="buyer.id"
											  listValue="name" listKey="id" />
								</td>
							</tr>
						</table>
						<table id="itemTable" width="100%" border="0" cellpadding="0"
							cellspacing="0">
							<tr>
								<th>产品名称</th>
								<th>产品颜色</th>
								<th>采购价格</th>
								<th>采购数量</th>
								<th>采购小计</th>
								<th>备注</th>
								<th><input type="button" id="addItem" value="添加" /></th>
							</tr>
							<s:if test="id==null">
								<tr>
									<td><s:hidden name="items[0].product.id" code="productId"/> 
											<s:textfield disabled="true" size="18"
											code="productName" /> 
											<img src="images/search.png"
										code="searchProudct" /></td>
									<td code="productColor"></td>
									<td><s:textfield name="items[0].price" code="itemPrice" />
									</td>
									<td><s:textfield name="items[0].num" code="itemNum" /></td>
									<td code="itemAmount"></td>
									<td><s:textfield name="items[0].descs" code="itemDescs" />
									</td>
									<td><input type="button" code="deleteItem" value="删除" /></td>
								</tr>
							</s:if>
							<s:else>
								<s:iterator value="items">
									<tr>
										<td><s:hidden name="product.id" code="productId" /> 
										<s:textfield disabled="true" size="18" code="productName" name="product.name" /> <img src="images/search.png" code="searchProudct" /></td>
										<td code="productColor">${product.color}</td>
										<td><s:textfield name="price" code="itemPrice" /></td>
										<td><s:textfield name="num" code="itemNum" /></td>
										<td code="itemAmount">${amount}</td>
										<td><s:textfield name="descs" code="itemDescs" /></td>
										<td><input type="button" code="deleteItem" value="删除" />
										</td>
									</tr>
								</s:iterator>
							</s:else>
						</table>
					</s:form>
				</div>

				<div class="order-botton">
					<div style="margin: 1px auto auto 1px;">
						<table width="100%" border="0" cellpadding="0" cellspacing="0">
							<tr>
								<td><img id="submitBtn" src="images/order_tuo.gif" /></td>
								<td>&nbsp;</td>
								<td><a onclick="reset()"><img
										src="images/order_tuo.gif" border="0" /></a></td>
								<td>&nbsp;</td>
								<td><a onclick="cancel()" /><img
									src="images/order_tuo.gif" border="0" /></td>
							</tr>
						</table>
					</div>
				</div>
			</div>
			<!--"square-order"end-->
		</div>
		<!--"content-text"end-->

		<div class="content-bbg">
			<img src="images/content_bbg.jpg" />
		</div>
	</div>
	<!--"content-right"end-->
</body>
</html>
