<template>
    <section class="ns-base-section">
		
		
		
		<div style="position:relative;margin:0;">
			<!-- 面包屑导航 -->
						<div class="breadcrumb-nav">
				<a href="index.html">黑马商城</a>
									<i class="fa fa-angle-right"></i>
					<a href="/promotion/coupontypelist.html">营销</a>
									<i class="fa fa-angle-right"></i>
					<!-- 需要加跳转链接用这个：http://showfx.niuteam.cn/admin/Promotion/promotionGameTypeList -->
					<a href="javascript:;" style="color:#999;">活动类型</a>
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
									<p>活动类型</p>
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
<!-- 						<span>活动类型</span> -->
<!-- 						 -->
<!-- 					{1/block} -->
				</h4>
			</div>
		</div>
		
		
		<div class="ns-main">
			

<div class="main_content">
	<h3>互动游戏</h3>
	<ul class="clearfix">
	
				<li class="application-item">
		
							<a href="/promotion/addPromotionGame.html?game_type=3">
							<div class="application-logo"><img src="/public/admin/images/games/b4c30bad203a9ad37c92b7c52d5d422d.png" alt=""></div>
				<div class="application-name">刮刮卡</div>
				<div class="application-desc">通过刮开卡片进行抽奖的玩法</div>
			</a>
		</li>
				<li class="application-item">
		
							<a href="/promotion/addPromotionGame.html?game_type=7">
							<div class="application-logo"><img src="/public/admin/images/games/03aa1ac9b94e2b9c47f47360e98c25c0.png" alt=""></div>
				<div class="application-name">幸运砸蛋</div>
				<div class="application-desc">好运砸出来</div>
			</a>
		</li>
				<li class="application-item">
		
							<a href="/promotion/addPromotionGame.html?game_type=8">
							<div class="application-logo"><img src="/public/admin/images/games/57ebd7f399284e9eb7f2a779bec77362.png" alt=""></div>
				<div class="application-name">幸运大抽奖</div>
				<div class="application-desc">常见的转盘式抽奖玩法</div>
			</a>
		</li>
				
	</ul>
</div>

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
