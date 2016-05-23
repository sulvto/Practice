<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>ECSHOP 管理中心 - 商品列表</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link href="/styles/general.css" rel="stylesheet" type="text/css" />
<link href="/styles/main.css" rel="stylesheet" type="text/css" />
<script type="text/javascript">
	function go(pageNo) {
		document.getElementById("currentPage").value=pageNo;
		document.forms[0].submit();
	}	
	function setPageSize() {
		var val = document.getElementById("selectID").value;
		document.getElementById("pageSizeId").value=val;
		document.forms[0].submit();
	}	
</script>
<body>
	<h1>
		<span class="action-span"><a href="/system/pro?cmd=edit">添加新商品</a></span> <span
			class="action-span1"><a href="__GROUP__">ECSHOP 管理中心</a></span> <span
			id="search_id" class="action-span1"> - 商品列表 </span>
		<div style="clear: both"></div>
	</h1>
	<div class="form-div">
		<form action="/system/pro" name="searchForm">
			<input type="hidden" name="currentPage" value="1" id="currentPage" />
			<input type="hidden" name="pageSize" value="${pList.pageSize}" id="pageSizeId" /> <img
				src="/images/icon_search.gif" width="26" height="22" border="0"
				alt="search" />
			<!-- 关键字 -->
			<%-- 关键字<input type="text" name="gjz" value="${qo.gjz}" size="15" />&emsp; --%>
			<!-- 商品名称 -->
			商品名称<input type="text" name="name" value="${qo.name}" size="15" />&emsp;
			<!-- 零售价  -->
			零售价<input type="text" name="lowSalePrice" value="${qo.lowSalePrice}" />到
			<input type="text" name="highSalePrice" value="${qo.highSalePrice}" />&emsp;
			<!-- 分类 -->
			<select name="dirId">
				<option value="-1">所属分类</option>
				<c:forEach items="${dirs}" var="d">
					<option value="${d.id}" ${qo.dirId == d.id ?"selected":""}>${d.name}</option>
				</c:forEach>
			</select>

			<!-- 上架 -->
			<select name="status">
				<option value=''>全部</option>
				<option value="1">上架</option>
				<option value="0">下架</option>
			</select> <input type="submit" value=" 搜索 " class="button" />
		</form>
	</div>

	<!-- 商品列表 -->
	<form method="post" action="" name="listForm" onsubmit="">
		<div class="list-div" id="listDiv">
			<table cellpadding="3" cellspacing="1">
				<tr>
					<th>商品编号</th>
					<th>商品名称</th>
					<th>市场价格</th>
					<th>成本价格</th>
					<th>零售价格</th>
					<th>生产场地</th>
					<th>商品规格</th>
					<th>商品数量</th>
					<th>详细信息</th>
					<th>商品分类</th>
					<th>浏览次数</th>
					<th>是否推荐</th>
					<th>折扣</th>
					<th>录入时间</th>
					<th>商品状态</th>
					<th>商品图片</th>
					<th>操作</th>
				</tr>
				<c:forEach items="${pList.listData}" var="o">
					<tr>
						<td align="center">${o.sn}</td>
						<td align="center">${o.name}</td>
						<td align="center">${o.marketPrice}</td>
						<td align="center">${o.costPrice}</td>
						<td align="center">${o.salePrice}</td>
						<td align="center">${o.place}</td>
						<td align="center">${o.model}</td>
						<td align="center">${o.num}</td>
						<td align="center">${o.intro}</td>
						<td align="center">${o.dir.name}</td>
						<td align="center">${o.viewTimes}</td>
						<td align="center">${o.recommended?"推荐":"不推荐"}</td>
						<td align="center">${o.cutOff}</td>
						<td align="center">${o.inputDate}</td>
						<td align="center">${o.status==0?"热卖":"下架"}</td>
						<td align="center"><a href="/system/pro?cmd=toUpload&id=${o.id}">替换</a><img
							src="${o.smallPic}"></td>
						<td><a href="__APP__/Goods/?goods_id=<{$val.goods_id}>"
							target="_blank" title="查看"><img src="/images/icon_view.gif"
								width="16" height="16" border="0" /></a> <a
							href="/system/pro?cmd=edit&id=${o.id}" title="编辑"><img
								src="/images/icon_edit.gif" width="16" height="16" border="0" /></a>
							<a href="/system/pro?cmd=delete&id=${o.id}" onclick="" title="回收站"><img
								src="/images/icon_trash.gif" width="16" height="16" border="0" /></a>
						</td>
					</tr>
				</c:forEach>
				<tr align="center">
					<td colspan="17"><a href="#" onclick="go(1);">首页</a> <a
						href="#" onclick="go(${pList.getPrePage()});">上一页</a> <a href="#"
						onclick="go(${pList.getNextPage()});">下一页</a> <a href="#"
						onclick="go(${pList.getTotalPage()});">末页</a>
						当前第${pList.currentPage}/${pList.totalPage}页
						&emsp;每页显示
						<select id="selectID" onchange="setPageSize()">
						<option value="0">请选择</option>
						<option value="1">1</option>
						<option value="2">2</option>
						<option value="3">3</option>
						<option value="4">4</option>
						<option value="5">5</option>
						</select>条
						</td>

				</tr>
			</table>
		</div>
	</form>
</body>
</html>