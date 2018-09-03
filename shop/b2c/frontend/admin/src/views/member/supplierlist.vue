<template>
	<section class="ns-base-section">
		
		
		
	<div style="position:relative;margin:0;">
		<!-- 面包屑导航 -->
					<div class="breadcrumb-nav">
			<a href="index.html">大鵬系統</a>
								<i class="fa fa-angle-right"></i>
				<a href="/goods/goodslist.html">商品</a>
								<i class="fa fa-angle-right"></i>
				<!-- 需要加跳转链接用这个：http://showfx.niuteam.cn/admin/member/supplierlist -->
				<a href="javascript:;" style="color:#999;">供货商</a>
						</div>
					<!-- 三级导航菜单 -->
		
						
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
								<p>相关教程：<a href="http://bbs.niushop.com.cn/forum.php?mod=viewthread&amp;tid=2308&amp;extra=page%3D2" target="_blank">http://bbs.niushop.com.cn/forum.php?mod=viewthread&amp;tid=2308&amp;extra=page%3D2</a></p>
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
<!-- 						<span>相关教程：<a href="http://bbs.niushop.com.cn/forum.php?mod=viewthread&tid=2308&extra=page%3D2" target="_blank">http://bbs.niushop.com.cn/forum.php?mod=viewthread&tid=2308&extra=page%3D2</a></span> -->
<!-- 						 -->
<!-- 					{1/block} -->
			</h4>
		</div>
	</div>
	
	
	<div class="ns-main">
		
<table class="mytable">
<tbody><tr>
	<th width="20%" style="text-align: left;">
		<button class="btn-common-delete btn-small" onclick="batchDelete()" style="margin:0 5px 0 0 !important;">批量删除</button>
		<button class="btn-common btn-small" onclick="location.href='/Member/addsupplier.html';" style="margin:0 5px 0 0 !important;">添加供货商</button>
	</th>
	<th width="20%">
		<input type="text" id="search_text" placeholder="输入代理商名称" class="input-common">
		<input type="button" onclick="LoadingInfo(1)" value="搜索" class="btn-common">
	</th>
</tr>
</tbody></table>
<table class="table-class">
<colgroup>
	<col width="2%">
	<col width="17%">
	<col width="17%">
	<col width="17%">
	<col width="17%">
	<col width="20%">
	<col width="10%">
</colgroup>
<thead>
	<tr align="center">
		<th><i class="checkbox-common"><input type="checkbox" onclick="CheckAll(this)"></i></th>
		<th align="left">供货商名称</th>
		<th align="left">联系人</th>
		<th align="left">联系电话</th>
		<th align="left">联系地址</th>
		<th align="left">供货商描述</th>
		<th>操作</th>
	</tr>
</thead>
<tbody><tr><td style="text-align:center;"><i class="checkbox-common"><input name="sub" type="checkbox" value="1"></i></td><td align="left">test</td><td align="left">1</td><td>2</td><td align="left">3</td><td align="left"></td><td align="center"> <a href="/Member/updatesupplier?supplier_id=1">修改</a>&nbsp;&nbsp;&nbsp;<a href="javascript:deleteSupplier(1);">删除</a></td></tr></tbody>
</table>

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
		<li class="total-data" data-total-count="1">共1条</li>
		<!-- <li class="page-count">共0页</li> -->
		<li class="according-number">
			跳<input type="text" class="input-medium" id="skipPage" data-curr-page="1">页
		</li>
	</ul>
</div>
</div>
<input type="hidden" id="page_count" value="1">
<input type="hidden" id="page_size" value="1">
	</div>
	
</section>
</template>
