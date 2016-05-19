<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>ECSHOP 管理中心 - 商品分类</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link href="/styles/general.css" rel="stylesheet" type="text/css" />
<link href="/styles/main.css" rel="stylesheet" type="text/css" />
</head>
<body>
	<h1>
		<span class="action-span"><a
			href="${pageContext.request.contextPath}/system/pro?cmd=edit">添加分类</a></span> <span
			class="action-span1"><a href="__GROUP__">ECSHOP 管理中心</a></span> <span
			id="search_id" class="action-span1"> - 商品分类 </span>
	</h1>
	<!-- 高级查询 开始-->
	<div class="form-div">
		<form action="/system/pro" name="searchForm" method="post">
			<input type="hidden" name="currentPage" value="1" id="currentPage"/>
			<input type="hidden" name="pageSize" value="5" id="pageSizeId"/>
			<img src="/images/icon_search.gif" width="26" height="22" border="0" />
			<!-- 分类 -->
			商品分类<select name="dirId">
				<option value="-1">---请选择---</option>
				<c:forEach items="${dirs}" var="dir">
					<option value="${dir.id}" ${qo.dirId == dir.id ?"selected":""}>${dir.name}</option>
				</c:forEach>
			</select>
			<!-- 名称 -->
			商品名称 <input type="text" name="name" size="20" value="${qo.name}" />
			<!-- 零售价区间 -->
			零售价格<input type="text" name="lowSalePrice" size="15"
				value="${qo.lowSalePrice}" />到 <input type="text"
				name="highSalePrice" size="20" value="${qo.highSalePrice}" /> 
			<!-- 关键字 -->
        	关键字 <input type="text" name="keyword" size="15" value="${qo.keyword}"/>
			<input type="submit" value=" 搜索 " class="button" />
		</form>
	</div>

	<!-- 高级查询 结束-->
	<div class="list-div" id="listDiv">
		<table width="100%" cellspacing="1" cellpadding="2" id="list-table">
			<tr>
				<th>商品编号</th>
				<th>商品图片</th>
				<th>商品分类</th>
				<th>商品名称</th>
				<th>市场价</th>
				<th>成本价</th>
				<th>零售价</th>
				<th>是否推荐</th>
				<th>状态</th>
				<th>操作</th>
			</tr>
			<c:forEach items="${pList.listData}" var="o">
				<tr align="center" class="0">
					<td class="first-cell" align="left">${o.sn}</td>
					<td><img src="${o.smallPic}" /></td>
					<td>${o.dir.name}</td>
					<td>${o.name}</td>
					<td>${o.marketPrice}</td>
					<td>${o.costPrice}</td>
					<td>${o.salePrice}</td>
					<td>
						<a href="/pro?cmd=changeRecommend&id=${o.id}">
							${o.recommended?"推荐":"不推荐"}
						</a>
					</td>
					<td>${o.status==0?"热卖中":"下架"}</td>
					<td align="center"><a href="" target="_blank" title="查看"><img
							src="/images/icon_view.gif" width="16" height="16" border="0" /></a>
							
							<a
						href="${pageContext.request.contextPath}/system/pro?cmd=toUploadUI&id=${o.id}">图片上传</a>
						<a
						href="${pageContext.request.contextPath}/system/pro?cmd=edit&id=${o.id}"
						title="编辑"><img src="/images/icon_edit.gif" width="16"
							height="16" border="0" /></a> <a
						href="${pageContext.request.contextPath}/system/pro?cmd=delete&id=${o.id}"
						title="回收站"><img src="/images/icon_trash.gif" width="16"
							height="16" border="0" /></a></td>
				</tr>
			</c:forEach>
			<!-- 分页开始 -->
			<%@include file="/WEB-INF/views/common/page.jsp" %>
			<!-- 分页结束 -->
		</table>
	</div>
</body>
</html>