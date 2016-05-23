<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>ECSHOP 管理中心 - 编辑商品</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link href="/styles/general.css" rel="stylesheet" type="text/css" />
<link href="/styles/main.css" rel="stylesheet" type="text/css" />
<script language="javascript" type="text/javascript"
	src="/js/My97DatePicker/WdatePicker.js"></script>
</head>
<body>
	<h1>
		<span class="action-span"><a href="/pro">商品列表</a> </span> <span
			class="action-span1"><a href="__GROUP__">ECSHOP 管理中心</a></span> <span
			id="search_id" class="action-span1"> - 编辑商品 </span>
		<div style="clear: both"></div>
	</h1>
	<div class="tab-div">
		<div id="tabbar-div">
			<p>
				<span class="tab-front" id="general-tab">通用信息</span>
			</p>
		</div>
		<div id="tabbody-div">
			<form action="/system/pro?cmd=save" method="post">
				<table width="90%" id="general-table" align="center">
					<input type="hidden" name="id" value="${pro.id}" />
					<tr>
						<td class="label">商品名称：</td>
						<td><input type="text" name="name" value="${pro.name}"
							size="20" /> <span class="require-field">*</span></td>
					</tr>
					<tr>
						<td class="label">商品编号：</td>
						<td><input type="text" name="sn" value="${pro.sn}" size="20" />
							<span id="goods_sn_notice"></span><br /></td>
					</tr>
					<tr>
						<td class="label">商品分类：</td>
						<td><select name="dirId">
								<c:if test="${pro == null}">
									<option value="0">请选择...</option>
								</c:if>
								<c:forEach items="${dirs}" var="d">
									<option value="${d.id}">${d.name}</option>
								</c:forEach>
						</select> <span class="require-field">*</span></td>
					</tr>
					<tr>
						<td class="label">市场价格：</td>
						<td><input type="text" name="marketPrice"
							value="${pro.marketPrice}" size="20" /> <span
							class="require-field">*</span></td>
					</tr>
					<tr>
						<td class="label">成本价格：</td>
						<td><input type="text" name="costPrice"
							value="${pro.costPrice}" size="20" /> <span
							class="require-field">*</span></td>
					</tr>
					<tr>
						<td class="label">本店售价：</td>
						<td><input type="text" name="salePrice"
							value="${pro.salePrice}" size="20" /> <span
							class="require-field">*</span></td>
					</tr>
					<tr>
						<td class="label">生产场地：</td>
						<td><input type="text" name="place" value="${pro.place}"
							size="20" /> <span class="require-field">*</span></td>
					</tr>
					<tr>
						<td class="label">商品规格：</td>
						<td><input type="text" name="model" value="${pro.model}"
							size="20" /> <span class="require-field">*</span></td>
					</tr>
					<tr>
						<td class="label">商品数量：</td>
						<td><input type="text" name="num" value="${pro.num}"
							size="20" /></td>
					</tr>
					<tr>
						<td class="label">浏览次数：</td>
						<td><input type="text" name="viewTimes"
							value="${pro.viewTimes}" size="20" /></td>
					</tr>
					<tr>
						<td class="label">商品折扣：</td>
						<td><input type="text" name="cutOff" value="${pro.cutOff}"
							size="20" /></td>
					</tr>
					<tr>
						<td class="label">录入时间：</td>
						<td><input type="text" name="inputDate"
							value="${pro.inputDate}" onClick="WdatePicker()" /></td>
					</tr>
					<tr>
						<td class="label_1">加入推荐：</td>
						<td><c:if test="${!pro.recommended}">
								<input type="checkbox" name="recommended" value="true" />
							</c:if> <c:if test="${pro.recommended}">
								<input type="checkbox" name="recommended" checked="checked"
									value="true" />
							</c:if></td>
					</tr>
					<tr>
						<td class="label_1">商品状态：</td>
						<c:if test="${pro.status==0}">
							<td><input type="checkbox" name="status" value="1" /> 下架</td>
						</c:if>
						<c:if test="${pro.status==1}">
							<td><input type="checkbox" name="status" checked="checked"
								value="0" /> 上架</td>
						</c:if>
					</tr>
					
				
					<tr>
						<td class="label">详细信息：</td>
						<td><textarea name="intro" value="${pro.intro}"
								style="width: 150px; height: 45px;" >${pro.intro}</textarea></td>
					</tr>
				</table>
				<div class="button-div">
					<input type="submit" value=" 确定 " class="button" /> <input
						type="reset" value=" 重置 " class="button" />
				</div>
			</form>
		</div>
	</div>

</body>
</html>