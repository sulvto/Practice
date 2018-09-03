<template>
	<section class="ns-base-section">
		
		
		
	<div style="position:relative;margin:0;">
		<!-- 面包屑导航 -->
					<div class="breadcrumb-nav">
			<a href="index.html">大鵬系統</a>
								<i class="fa fa-angle-right"></i>
				<a href="/config/usernotice.html">网站</a>
								<i class="fa fa-angle-right"></i>
				<!-- 需要加跳转链接用这个：http://showfx.niuteam.cn/admin/config/pctemplate -->
				<a href="javascript:;" style="color:#999;">店铺装修</a>
						</div>
					<!-- 三级导航菜单 -->
		
							<nav class="ns-third-menu">
				<ul>
											<li class="selected" onclick="location.href='/config/pctemplate.html';">电脑端模板</li>
												<li onclick="location.href='/config/fixedtemplate.html';">手机端模板</li>
												<li onclick="location.href='/config/wapcustomTemplateList.html';">手机端自定义模板</li>
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
								<p>相关教程：<a href="http://bbs.niushop.com.cn/forum.php?mod=viewthread&amp;tid=2373&amp;extra=page%3D1" target="_blank">http://bbs.niushop.com.cn/forum.php?mod=viewthread&amp;tid=2373&amp;extra=page%3D1</a></p>
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
<!-- 						<span>相关教程：<a href="http://bbs.niushop.com.cn/forum.php?mod=viewthread&tid=2373&extra=page%3D1" target="_blank">http://bbs.niushop.com.cn/forum.php?mod=viewthread&tid=2373&extra=page%3D1</a></span> -->
<!-- 						 -->
<!-- 					{1/block} -->
			</h4>
		</div>
	</div>
	
	
	<div class="ns-main">
		
<article class="pc-template">

	<div class="block-title">当前使用模板</div>
<div class="template-list js-curr-use">
	<ul>
		<li style="background-color: #6DC1F2">
			<h4>【官方出品】蓝色清爽简洁版</h4>
			<p>蓝色清爽简洁版 - NiuShop团队支持</p>
			<div class="template-thumbnail">
				<img src="/template/shop/blue/thumbnail.png" alt="缩略图">
			</div>
		</li>
	</ul>
</div>
	<div class="block-title">可使用模板</div>
<div class="template-list">
	<ul>
					<li style="background-color: #6DC1F2" data-bgcolor="#6DC1F2">
			<div class="mask-layer">
				<button class="btn-common btn-big" data-folder="blue">使用该模板</button>
			</div>
			<h4>【官方出品】蓝色清爽简洁版</h4>
			<p>蓝色清爽简洁版 - NiuShop团队支持</p>
			<div class="template-thumbnail">
				<img src="/template/shop/blue/thumbnail.png" alt="缩略图">
			</div>
		</li>
				</ul>
</div>
</article>

<div class="page" id="turn-ul" style="display: none;">
<div class="pagination">
	<ul>
		<li class="according-number">每页显示<input type="text" class="input-medium" id="showNumber" value="14" data-default="14" autocomplete="off">条</li>
		<li><a id="beginPage" class="page-disable" style="border: 1px solid #dddddd;">首页</a></li>
		<li><a id="prevPage" class="page-disable">上一页</a></li>
		<li id="pageNumber"></li>
		<li id="JslastPage">
			
		</li>
		<li><a id="nextPage">下一页</a></li>
		<li><a id="lastPage">末页</a></li>
		<li class="total-data">共0条</li>
		<!-- <li class="page-count">共0页</li> -->
		<li class="according-number">
			跳<input type="text" class="input-medium" id="skipPage" data-curr-page="1">页
		</li>
	</ul>
</div>
</div>
<input type="hidden" id="page_count">
<input type="hidden" id="page_size">
	</div>
	
</section>
</template>
