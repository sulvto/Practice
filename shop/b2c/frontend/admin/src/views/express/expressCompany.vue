<template>
	<section class="ns-base-section">
		
		
		
	<div style="position:relative;margin:0;">
		<!-- 面包屑导航 -->
					<div class="breadcrumb-nav">
			<a href="index.html">大鵬系統</a>
								<i class="fa fa-angle-right"></i>
				<a href="/config/webconfig.html">设置</a>
								<i class="fa fa-angle-right"></i>
				<!-- 需要加跳转链接用这个：http://showfx.niuteam.cn/admin/express/expresscompany -->
				<a href="javascript:;" style="color:#999;">物流公司</a>
						</div>
					<!-- 三级导航菜单 -->
		
							<nav class="ns-third-menu">
				<ul>
											<li class="selected" onclick="location.href='/express/expresscompany.html';">物流配送</li>
												<li onclick="location.href='/shop/pickuppointlist.html';">门店自提</li>
												<li onclick="location.href='/distribution/distributionuserlist.html';">本地配送</li>
										</ul>
			</nav>
						
		<div class="right-side-operation">
			<ul>
				
				
<!-- 					style="display:none;" style="display:block;" -->
				<li>
					<a class="js-open-warmp-prompt" href="javascript:;" data-menu-desc=""><i class="fa fa-question-circle"></i>&nbsp;提示</a>
					<div class="popover">
						<div class="arrow"></div>
						<div class="popover-content">
							<div>
																	<h4>操作提示</h4>
								<p>物流公司</p>
								<hr>
																	<h4>功能提示</h4>
								<p class="function-prompts"></p>
							</div>
						</div>
					</div>
				</li>
				
			</ul>
		</div>
	</div>
	
	<!-- 操作提示 -->
	
<!-- 		 -->
	<div class="ns-warm-prompt" style="display:none;">
		<div class="alert alert-info">
			<button type="button" class="close">×</button>
			<h4>
<!-- 					{1block name="alert_info"} -->
<!-- 					<i class="fa fa-info-circle"></i> -->
<!-- 					<span class="operating-hints">操作提示</span> -->
<!-- 						 -->
<!-- 						<span>物流公司</span> -->
<!-- 						 -->
<!-- 					{1/block} -->
			</h4>
		</div>
	</div>
	
	
	<div class="ns-main">
		
<div class="space-10"></div>
<div class="ncsc-form-goods">
<nav class="goods-nav">
	<ul>
							<li class="selected"><a href="/express/expresscompany.html" child_id="1">物流公司</a></li>
										<li><a href="/config/areamanagement.html" child_id="2">地区管理</a></li>
										<li><a href="/order/returnsetting.html" child_id="3">商家地址</a></li>
										<li><a href="/config/distributionareamanagement.html" child_id="4">货到付款地区管理</a></li>
										<li><a href="/config/expressmessage.html" child_id="5">物流跟踪设置</a></li>
						
	</ul>
</nav>
<!-- 基础设置 -->
<div class="mod-table">
	<div class="mod-table-head">
		<table class="mytable">
			<tbody><tr>
				<td width="50%" style="text-align: left;">
					<button class="btn-common-delete" onclick="batchDelete()">批量删除</button>
					<button class="btn-common" onclick="location.href='/express/addexpresscompany.html';">添加物流公司</button>
				</td>
				<td width="20%">
					<input type="text" id="search_text" placeholder="请输入物流公司名称或编号" class="input-common">
					<input type="button" onclick="searchData()" value="搜索" class="btn-common">
				</td>
			</tr>
		</tbody></table>
		<div class="con style0list">

			<table class="table-class">
				<colgroup>
					<col style="width: 2%;">
					<col style="width: 30%;">
					<col style="width: 25%;">
					<col style="width: 10%;">
					<col style="width: 7%;">
					<col style="width: 7%;">
					<col style="width: 4%;">
					<col style="width: 15%;">
				</colgroup>
				<thead>
					<tr align="center">
						<th><i class="checkbox-common"><input type="checkbox" onclick="CheckAll(this)"></i></th>
						<th align="left">物流公司</th>
						<th align="left">物流编号</th>
						<th align="left">联系电话</th>
						<th>是否默认</th>
						<th>是否启用</th>
						<th>排序</th>
						<th>操作</th>
					</tr>
				</thead>
				<tbody id="productTbody"><tr align="center"><td><i class="checkbox-common"><input name="sub" type="checkbox" value="4"></i></td><td align="left" class="tal">百世快递</td><td align="left" class="tal">BST</td><td align="left" class="tal"></td><td class="tal">是</td><td style="color:green;">启用</td><td>0</td><td><a href="/express/expresstemplate?co_id=4">打印模板</a>&nbsp;&nbsp;<a href="/express/updateexpresscompany?co_id=4">修改</a><br><a href="/express/freighttemplatelist?co_id=4">运费模板</a>&nbsp;&nbsp;<a style="cursor: pointer;" onclick="DelExpressCompany(4)">删除</a></td></tr><tr align="center"><td><i class="checkbox-common"><input name="sub" type="checkbox" value="5"></i></td><td align="left" class="tal">邮政快递</td><td align="left" class="tal">EMS</td><td align="left" class="tal"></td><td class="tal">否</td><td style="color:green;">启用</td><td>0</td><td><a href="/express/expresstemplate?co_id=5">打印模板</a>&nbsp;&nbsp;<a href="/express/updateexpresscompany?co_id=5">修改</a><br><a href="/express/freighttemplatelist?co_id=5">运费模板</a>&nbsp;&nbsp;<a style="cursor: pointer;" onclick="DelExpressCompany(5)">删除</a></td></tr><tr align="center"><td><i class="checkbox-common"><input name="sub" type="checkbox" value="6"></i></td><td align="left" class="tal">顺丰快递</td><td align="left" class="tal">SF</td><td align="left" class="tal"></td><td class="tal">否</td><td style="color:green;">启用</td><td>0</td><td><a href="/express/expresstemplate?co_id=6">打印模板</a>&nbsp;&nbsp;<a href="/express/updateexpresscompany?co_id=6">修改</a><br><a href="/express/freighttemplatelist?co_id=6">运费模板</a>&nbsp;&nbsp;<a style="cursor: pointer;" onclick="DelExpressCompany(6)">删除</a></td></tr></tbody>
			</table>
		</div>
	</div>
</div>
</div>

<div class="page" id="turn-ul" style="">
<div class="pagination">
	<ul>
		<li class="according-number">每页显示<input type="text" class="input-medium" id="showNumber" value="14" data-default="14" autocomplete="off">条</li>
		<li><a id="beginPage" class="page-disable" style="border: 1px solid #dddddd;">首页</a></li>
		<li><a id="prevPage" class="page-disable">上一页</a></li>
		<li id="pageNumber"><a onclick="JumpForPage(this)" class="currentPage">1</a></li>
		<li id="JslastPage"></li>
		<li><a id="nextPage" class="page-disable">下一页</a></li>
		<li><a id="lastPage" class="page-disable">末页</a></li>
		<li class="total-data" data-total-count="3">共3条</li>
		<!-- <li class="page-count">共0页</li> -->
		<li class="according-number">
			跳<input type="text" class="input-medium" id="skipPage" data-curr-page="1">页
		</li>
	</ul>
</div>
</div>
<input type="hidden" id="page_count" value="1">
<input type="hidden" id="page_size" value="3">
	</div>
	
</section>
</template>
