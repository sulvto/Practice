<template>
    
	<section class="ns-base-section">
		
		
		
		<div style="position:relative;margin:0;">
			<!-- 面包屑导航 -->
						<div class="breadcrumb-nav">
				<a href="index.html">大鵬系統</a>
									<i class="fa fa-angle-right"></i>
					<a href="/promotion/coupontypelist.html">营销</a>
									<i class="fa fa-angle-right"></i>
					<!-- 需要加跳转链接用这个：http://showfx.niuteam.cn/admin/Promotion/promotionGamesAwardList -->
					<a href="javascript:;" style="color:#999;">游戏奖项</a>
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
									<p>游戏奖项</p>
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
<!-- 						<span>游戏奖项</span> -->
<!-- 						 -->
<!-- 					{1/block} -->
				</h4>
			</div>
		</div>
		
		
		<div class="ns-main">
			
<!-- <table class="mytable"> -->
<!-- 	<tr> -->
<!-- 		<th width="10%"> -->
<!-- 			<input type="text" id = 'search_text' placeholder="请输入活动名称" class="input-common" /> -->
<!-- 			<input type="button" onclick="searchData()" value="搜索" class="btn-common" /> -->
<!-- 		</th> -->
<!-- 	</tr> -->
<!-- </table> -->
<table class="table-class">
	<thead>
		<tr>
			<th align="left">游戏活动名称</th>
			<th align="left">奖励规则等级</th>
			<th align="left">奖励</th>
			<th align="center">剩余奖品数/总奖品数</th>
			<th align="center">操作</th>
		</tr>
	</thead>
	<tbody>
					<tr>
				<td align="left">平图案</td>
				<td align="left">10</td>
				<td align="left">
					奖励
										优惠券
									</td>
				<td align="center">
										<span>10/10</span>
									</td>
				<td align="center"><a href="/Promotion/updatePromotionGame.html?game_id=1&amp;game_type=3">编辑游戏活动</a></td>
			</tr>
						<tr>
				<td align="left">平图案</td>
				<td align="left">10</td>
				<td align="left">
					奖励
										赠品
									</td>
				<td align="center">
										<span>5/5</span>
									</td>
				<td align="center"><a href="/Promotion/updatePromotionGame.html?game_id=1&amp;game_type=3">编辑游戏活动</a></td>
			</tr>
						<tr>
				<td align="left">平图案</td>
				<td align="left">10</td>
				<td align="left">
					奖励
										￥5.00余额红包
									</td>
				<td align="center">
										<span>15/15</span>
									</td>
				<td align="center"><a href="/Promotion/updatePromotionGame.html?game_id=1&amp;game_type=3">编辑游戏活动</a></td>
			</tr>
				</tbody>
</table>

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
