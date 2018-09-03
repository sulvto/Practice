<template>
	<section class="ns-base-section">
	
	
	
		<div style="position:relative;margin:0;">
			<!-- 面包屑导航 -->
			<div class="breadcrumb-nav">
				<a href="index.html">大鵬系統</a>
				<i class="fa fa-angle-right"></i>
				<a href="/account/shopsalesaccount.html">数据</a>
				<i class="fa fa-angle-right"></i>
				<!-- 需要加跳转链接用这个：http://showfx.niuteam.cn/admin/account/shopreport -->
				<a href="javascript:;" style="color:#999;">运营报告</a>
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
									<p>相关教程：<a href="http://bbs.niushop.com.cn/forum.php?mod=viewthread&amp;tid=2389&amp;extra=page%3D1" target="_blank">http://bbs.niushop.com.cn/forum.php?mod=viewthread&amp;tid=2389&amp;extra=page%3D1</a></p>
									<hr>
									<h4>功能提示</h4>
									<p class="function-prompts">
										1、符合以下任何一种条件的订单即为有效订单：1）采用在线支付方式支付并且已付款；2）采用货到付款方式支付并且交易已完成<br> 2、统计图展示了符合搜索条件的有效订单中的下单总金额和下单数量在时间段内的走势情况及与前一个时间段的趋势对比
									</p>
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
					<!-- 						<span>相关教程：<a href="http://bbs.niushop.com.cn/forum.php?mod=viewthread&tid=2389&extra=page%3D1" target="_blank">http://bbs.niushop.com.cn/forum.php?mod=viewthread&tid=2389&extra=page%3D1</a></span> -->
					<!-- 						 -->
					<!-- 					{1/block} -->
				</h4>
			</div>
		</div>
	
	
		<div class="ns-main">
	
			<input type="hidden" name="act" value="statistics_sale">
			<input type="hidden" name="op" value="sale">
	
			<table class="mytable">
				<tbody>
					<tr>
						<td>
							<span>统计方式：</span>
							<div class="selectric-wrapper selectric-select-common selectric-middle" style="width: 150px;">
								<div class="selectric-hide-select"><select name="search_type" id="search_type" class="select-common middle" tabindex="-1">
					<option value="1">按照天统计</option>
					<option value="3">按照周统计</option>
					<option value="4">按照月统计</option>
				</select></div>
								<div class="selectric"><span class="selectric-label">按照天统计</span><button class="selectric-button">▾</button></div>
								<div class="selectric-items" tabindex="-1">
									<div class="selectric-scroll">
										<ul>
											<li data-index="0" class="selected" title="按照天统计">按照天统计</li>
											<li data-index="1" class="" title="按照周统计">按照周统计</li>
											<li data-index="2" class="last" title="按照月统计">按照月统计</li>
										</ul>
									</div>
								</div><input class="selectric-input" tabindex="0"></div>
							<button class="btn-common" value="搜索" onclick="search();">搜索</button>
						</td>
					</tr>
				</tbody>
			</table>
			<div class="alert alert-info">
				<ul class="mt5">
					<li>
						<span class="w210 fl h30 " style="display:block;">
					<i title="店铺符合搜索条件的订单总金额" class="tip icon-question-sign"></i>
					总下单金额：<strong id="money">0元</strong>
				</span>
						<span class="w210 fl h30" style="display:block;">
					<i title="店铺符合搜索条件的订单数量" class="tip icon-question-sign"></i>
					总下单量：<strong id="num">0</strong>
				</span>
					</li>
				</ul>
			</div>
	
			<nav class="option-nav">
				<ul>
					<li class="selected"><a href="javascript:;" onclick="getGoodsSalesCharts(1)">下单金额</a></li>
					<li><a href="javascript:;" onclick="getGoodsSalesCharts(2)">下单量</a></li>
				</ul>
			</nav>
			<!-- 下单金额 -->
			<div id="money_div" class="ui-tabs-panel" data-highcharts-chart="1">
				<div class="highcharts-container" id="highcharts-2" style="width:99%;position:relative;overflow:hidden;height:400px;font-size:12px;" data-highcharts-chart="0">
					<div id="highcharts-4wjwv44-0" class="highcharts-container " style="position: relative; overflow: hidden; width: 1177px; height: 400px; text-align: left; line-height: normal; z-index: 0; -webkit-tap-highlight-color: rgba(0, 0, 0, 0);">
						<span
						    style="font-family: &quot;Lucida Grande&quot;, &quot;Lucida Sans Unicode&quot;, Arial, Helvetica, sans-serif; font-size: 18px; position: absolute; white-space: nowrap; margin-left: 0px; margin-top: 0px; left: 535px; top: 7px; color: rgb(51, 51, 51);"
						    class="highcharts-title" transform="translate(0,0)">下单金额统计</span>
					</div>
				</div>
			</div>
			<!-- 下单量 -->
			<div id="num_div" class="ui-tabs-panel ui-tabs-hide hide" style="display: none;">
				<div class="highcharts-container" id="highcharts-3" style="width:99%;position:relative;overflow:hidden;height:400px;font-size:12px;" data-highcharts-chart="1">
					<div id="highcharts-4wjwv44-4" class="highcharts-container " style="position: relative; overflow: hidden; width: 1337px; height: 400px; text-align: left; line-height: normal; z-index: 0; -webkit-tap-highlight-color: rgba(0, 0, 0, 0);">
						<span
						    style="font-family: &quot;Lucida Grande&quot;, &quot;Lucida Sans Unicode&quot;, Arial, Helvetica, sans-serif; font-size: 18px; position: absolute; white-space: nowrap; margin-left: 0px; margin-top: 0px; left: 624px; top: 7px; color: rgb(51, 51, 51);"
						    class="highcharts-title" transform="translate(0,0)">下单量统计</span>
					</div>
				</div>
			</div>
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
	
	</section>
</template>
