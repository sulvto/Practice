<%@ page language="java" contentType="text/html; charset=UTF-8"%>
	<script type="text/javascript">
		function go(pageNo){
			//1.把翻页的当前页设置到高级查询表单中
			document.getElementById("currentPage").value=pageNo;
			
			var pageSize= document.getElementById("pageSize").value;
			document.getElementById("pageSizeId").value=pageSize;
			
			//2.提交高级查询表单
			document.forms[0].submit();
		}
		
	</script>
<tr>
	<td align="right" nowrap="true" colspan="6">
		<div id="turn-page">
			<span id="page-link"> <a href="javascript:go(1);">第一页</a> <a
				href="javascript:go(${pList.prePage});">上一页</a> <a href="#"
				onclick="go(${pList.nextPage});">下一页</a> <a
				href="javascript:go(${pList.totalPage});">最末页</a> 当前第 <span
				id="pageCurrent">${pList.currentPage}/${pList.totalPage}</span> 页 总计
				<span id="totalRecords">${pList.totalCount}</span> 条记录
				<span>
					<select name="pageSize" onchange="go(1)" id="pageSize">
						<option ${pList.pageSize==3?"selected":""}>3</option>
						<option ${pList.pageSize==5?"selected":""}>5</option>
						<option ${pList.pageSize==10?"selected":""}>10</option>
					</select>
				</span>
			</span>
		</div>
	</td>
</tr>