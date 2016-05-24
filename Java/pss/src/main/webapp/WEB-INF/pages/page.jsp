<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<script type="text/javascript" src="../js/jquerylib/jquery-1.8.2.min.js"></script>
<script type="text/javascript" src="../js/jquery.js"></script>

<div class="content-bbg">
	<table width="100%" border="0" cellpadding="0" cellspacing="0">
		<s:hidden id="hiddenResult" name="pageResult.totalResult" />
		<tr>
			<td width="1%">&nbsp;&nbsp;</td>
			<td id="totalResult" width="8%">共${pageResult.totalResult}条记录</td>
			<td width="8%">当前第<span style="color: red;">${pageResult.currentPage}</span>/${pageResult.totalPage}
			</td>
			<td width="18%">每页<s:select list="{1,5,10,15,20}"
					name="baseQuery.pageSize" id="pageSize" onchange="go();"
					theme="simple"></s:select>条记录
			</td>
			<td id="result" width="1%" ></td>
			<s:if test="pageResult.currentPage==1">
				<td width="3%">首页</td>
				<td width="6%">上一页</td>
			</s:if>
			<s:else>
				<td width="3%"><a class="sye" href="#" onclick="go(1)">首页</a></td>
				<td width="6%"><a class="sye" href="#"
					onclick="go(${pageResult.currentPage-1})">上一页</a></td>

			</s:else>
			<s:if test="pageResult.currentPage==pageResult.totalPage">
				<td width="4%">下一页</td>
				<td width="6%">末页</td>
			</s:if>
			<s:else>
				<td width="4%"><a class="sye" href="#"
					onclick="go(${pageResult.currentPage+1})">下一页</a></td>
				<td width="6%"><a class="sye" href="#"
					onclick="go(${pageResult.totalPage})">末页</a></td>
			</s:else>
			<td width="8%">跳转到第<input id="nextPage" type="text"
				value="${pageResult.currentPage}" onchange="go('next');" size="1"></input>页
			</td>
		</tr>
	</table>
</div>