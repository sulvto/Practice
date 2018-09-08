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

		</div>

	</section>
</template>
