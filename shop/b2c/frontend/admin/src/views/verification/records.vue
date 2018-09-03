<template>
    <section class="ns-base-section">
		
		
		
		<div style="position:relative;margin:0;">
			<!-- 面包屑导航 -->
						<div class="breadcrumb-nav">
				<a href="index.html">零基础学IT就来</a>
									<i class="fa fa-angle-right"></i>
					<a href="/config/webconfig.html">设置</a>
									<i class="fa fa-angle-right"></i>
					<!-- 需要加跳转链接用这个：http://showfx.niuteam.cn/admin/Verification/virtualGoodsVerificationList -->
					<a href="javascript:;" style="color:#999;">核销记录</a>
							</div>
						<!-- 三级导航菜单 -->
			
								<nav class="ns-third-menu">
					<ul>
												<li onclick="location.href='/Verification/index.html';">核销人员</li>
													<li class="selected" onclick="location.href='/Verification/virtualGoodsVerificationList.html?type=to_reply';">核销记录</li>
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
<!-- 					{1/block} -->
				</h4>
			</div>
		</div>
		
		
		<div class="ns-main">
			
	<table class="mytable">
		<tbody><tr>
			<th width="30%" style="text-align: left;">
			</th>
			<th width="20%">
				<input type="text" id="search_name" placeholder="输入虚拟商品名称" class="input-common">
				<input type="button" onclick="LoadingInfo(1)" value="搜索" class="btn-common">
			</th>
		</tr>
	</tbody></table>

	<table class="table-class">
		<colgroup>
		<col style="width: 2%;">
		<col style="width: 14%;">
		<col style="width: 13%;">
		<col style="width: 13%;">
		<col style="width: 13%;">
		<col style="width: 13%;">
		<col style="width: 16%;">
		<col style="width: 16%;">
		</colgroup>
		<thead>
			<tr>
				<th><i class="checkbox-common"><input type="checkbox" onclick="CheckAll(this)"></i></th>
				<th align="left">虚拟商品</th>
				<th align="left">商品所有人</th>
				<th align="left">核销员</th>
				<th align="center">核销次数/次</th>
				<th>核销状态</th>
				<th align="left">备注</th>
				<th>核销时间</th>
			</tr>
		</thead>
		<tbody><tr align="center"><td><i class="checkbox-common"><input name="sub" type="checkbox" value="1"></i></td><td align="left">321</td><td align="left">aoeuaoeu</td><td align="left">aoeuaoeu</td><td align="center">1</td><td>已使用</td><td align="left">虚拟商品核销</td><td>2018-07-23 22:09:17</td></tr></tbody>
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
