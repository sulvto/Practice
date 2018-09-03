<template>
    
	<section class="ns-base-section">
		
		
		
		<div style="position:relative;margin:0;">
			<!-- 面包屑导航 -->
						<div class="breadcrumb-nav">
				<a href="index.html">大鵬系統</a>
									<i class="fa fa-angle-right"></i>
					<a href="/promotion/coupontypelist.html">营销</a>
									<i class="fa fa-angle-right"></i>
					<!-- 需要加跳转链接用这个：http://showfx.niuteam.cn/admin/Promotion/promotionGamesAccessRecords -->
					<a href="javascript:;" style="color:#999;">获奖记录</a>
							</div>
						<!-- 三级导航菜单 -->
			
<nav class="ns-third-menu">
	<ul>
		<li class="selected">全部</li>
		<li data-is-winning="1">中奖的</li>
		<li data-is-winning="0">未中奖</li>
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
									<p>获奖记录</p>
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
<!-- 						<span>获奖记录</span> -->
<!-- 						 -->
<!-- 					{1/block} -->
				</h4>
			</div>
		</div>
		
		
		<div class="ns-main">
			
<table class="mytable">
	<tbody><tr>
		<th width="10%">
			<input type="text" id="search_text" placeholder="请输入会员昵称" class="input-common">
			<button class="btn-common" onclick="searchData()">搜索</button>
		</th>
	</tr>
</tbody></table>
<table class="table-class">
	<thead>
		<tr>
			<th align="left">获奖信息</th>
			<th>消耗积分</th>
			<th align="left">参与时间</th>
		</tr>
	</thead>
	<tbody><tr><td align="left">【cqinter】获得10，奖励￥5.00余额红包</td><td align="center">20</td><td>2018-07-30 18:23:04</td></tr><tr><td align="left">【cqinter】未中奖</td><td align="center">20</td><td>2018-07-30 18:23:00</td></tr><tr><td align="left">【cqinter】获得10，奖励赠品【上衣女夏2017新款枣红色韩版灯笼袖压褶方领宽松半袖百搭雪纺衫】</td><td align="center">20</td><td>2018-07-30 10:50:00</td></tr><tr><td align="left">【cqinter】获得10，奖励赠品【上衣女夏2017新款枣红色韩版灯笼袖压褶方领宽松半袖百搭雪纺衫】</td><td align="center">20</td><td>2018-07-30 10:49:27</td></tr><tr><td align="left">【cqinter】未中奖</td><td align="center">20</td><td>2018-07-30 10:49:08</td></tr><tr><td align="left">【cqinter】未中奖</td><td align="center">20</td><td>2018-07-30 10:49:07</td></tr><tr><td align="left">【cqinter】未中奖</td><td align="center">20</td><td>2018-07-30 10:49:02</td></tr><tr><td align="left">【cqinter】未中奖</td><td align="center">20</td><td>2018-07-30 10:48:59</td></tr><tr><td align="left">【cqinter】未中奖</td><td align="center">20</td><td>2018-07-30 10:48:56</td></tr><tr><td align="left">【cqinter】未中奖</td><td align="center">20</td><td>2018-07-30 10:48:54</td></tr><tr><td align="left">【cqinter】获得10，奖励20积分</td><td align="center">20</td><td>2018-07-30 10:48:26</td></tr><tr><td align="left">【cqinter】未中奖</td><td align="center">20</td><td>2018-07-30 10:48:24</td></tr><tr><td align="left">【cqinter】未中奖</td><td align="center">20</td><td>2018-07-30 10:48:22</td></tr><tr><td align="left">【cqinter】未中奖</td><td align="center">20</td><td>2018-07-30 10:48:20</td></tr></tbody>
</table>
<input type="hidden" value="1" id="hidden_game_id">

<div class="page" id="turn-ul" style="">
	<div class="pagination">
		<ul>
			<li class="according-number">每页显示<input type="text" class="input-medium" id="showNumber" value="14" data-default="14" autocomplete="off">条</li>
			<li><a id="beginPage" class="page-disable" style="border: 1px solid #dddddd;">首页</a></li>
			<li><a id="prevPage" class="page-disable">上一页</a></li>
			<li id="pageNumber"><a onclick="JumpForPage(this)" class="currentPage">1</a><a onclick="JumpForPage(this)">2</a></li>
			<li id="JslastPage"></li>
			<li><a id="nextPage">下一页</a></li>
			<li><a id="lastPage">末页</a></li>
			<li class="total-data" data-total-count="17">共17条</li>
			<!-- <li class="page-count">共0页</li> -->
			<li class="according-number">
				跳<input type="text" class="input-medium" id="skipPage" data-curr-page="1">页
			</li>
		</ul>
	</div>
</div>
<input type="hidden" id="page_count" value="2">
<input type="hidden" id="page_size" value="14">
		</div>
		
	</section>
</template>
