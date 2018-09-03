<template>
	<section class="ns-base-section">
	
	
	
		<div style="position:relative;margin:0;">
			<!-- 面包屑导航 -->
			<div class="breadcrumb-nav">
				<a href="index.html">大鵬系統</a>
				<i class="fa fa-angle-right"></i>
				<a href="/account/shopsalesaccount.html">数据</a>
				<i class="fa fa-angle-right"></i>
				<!-- 需要加跳转链接用这个：http://showfx.niuteam.cn/admin/account/shopgoodsgroupsalecount -->
				<a href="javascript:;" style="color:#999;">同行热卖</a>
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
									<h4>功能提示</h4>
									<p class="function-prompts">
										1、符合以下任何一种条件的订单即为有效订单：a）采用在线支付方式支付并且已付款；b）采用货到付款方式支付并且交易已完成<br> 2、图表展示了符合搜索条件的有效订单中的下单总金额和下单商品总数排名前30位的商品
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
					<!-- 					{1/block} -->
				</h4>
			</div>
		</div>
	
	
		<div class="ns-main">
	
	
			<input type="hidden" name="act" value="statistics_goods">
			<input type="hidden" name="op" value="hotgoods">
			<table class="mytable">
				<tbody>
					<tr>
						<td width="100%">
	
	
							商品分类：
							<div style="display: inline-block;position: relative;">
								<input type="text" placeholder="请选择商品分类" id="goodsCategoryOne" is_show="false" class="input-common middle">
								<div class="goodsCategory one">
									<ul>
										<li class="js-category-one" category_id="1">
											<span>家用电器</span>
											<i class="fa fa-angle-right fa-lg"></i>
										</li>
										<li class="js-category-one" category_id="2">
											<span>手机/运营商/数码</span>
											<i class="fa fa-angle-right fa-lg"></i>
										</li>
										<li class="js-category-one" category_id="3">
											<span>电脑/办公</span>
											<i class="fa fa-angle-right fa-lg"></i>
										</li>
										<li class="js-category-one" category_id="4">
											<span>家居/家具/家装/厨具</span>
											<i class="fa fa-angle-right fa-lg"></i>
										</li>
										<li class="js-category-one" category_id="5">
											<span>男装/女装/童装/内衣</span>
											<i class="fa fa-angle-right fa-lg"></i>
										</li>
										<li class="js-category-one" category_id="6">
											<span>美妆个护/宠物</span>
											<i class="fa fa-angle-right fa-lg"></i>
										</li>
										<li class="js-category-one" category_id="7">
											<span>女鞋/箱包/钟表/珠宝</span>
											<i class="fa fa-angle-right fa-lg"></i>
										</li>
										<li class="js-category-one" category_id="8">
											<span>男鞋/运动/户外</span>
											<i class="fa fa-angle-right fa-lg"></i>
										</li>
										<li class="js-category-one" category_id="9">
											<span>汽车/汽车用品</span>
											<i class="fa fa-angle-right fa-lg"></i>
										</li>
										<li class="js-category-one" category_id="10">
											<span>母婴/玩具用品</span>
											<i class="fa fa-angle-right fa-lg"></i>
										</li>
										<li class="js-category-one" category_id="11">
											<span>食品/酒类/生鲜/特产</span>
											<i class="fa fa-angle-right fa-lg"></i>
										</li>
										<li class="js-category-one" category_id="12">
											<span>礼品鲜花/农资绿植</span>
											<i class="fa fa-angle-right fa-lg"></i>
										</li>
									</ul>
								</div>
								<div class="goodsCategory two" style="border-left:0;">
									<ul id="goodsCategoryTwo"></ul>
								</div>
								<div class="goodsCategory three">
									<ul id="goodsCategoryThree"></ul>
								</div>
								<div class="selectGoodsCategory">
									<a href="javascript:;" id="confirmSelect" style="float:right;">确认选择</a>
								</div>
								<input type="hidden" id="category_id_1">
								<input type="hidden" id="category_id_2">
								<input type="hidden" id="category_id_3">
							</div>
	
							&nbsp;&nbsp;<span>统计方式：</span>
							<div class="selectric-wrapper selectric-querySelect selectric-select-common selectric-middle" style="width: 150px;">
								<div class="selectric-hide-select"><select id="date" class="querySelect select-common middle" tabindex="-1">
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
							&nbsp;&nbsp;<button class="btn-common" onclick="searchGoodsSale();" value="搜索">搜索</button>
						</td>
					</tr>
				</tbody>
			</table>
			<!-- <table class="search-form">
		<tbody>
			<tr>
				<td>
					<div class="fr">
						<label class="submit-border">
							<button class="btn-common" onclick="searchGoodsSale();" value="搜索">搜索</button>
						</label>
					</div>
					<div class="fr">
						<div class="fl" style="margin-right:3px;">
							<span>商品分类：</span>
							<select id="category_id_1" data-level="1"class="select-common middle" onchange="ClickHasSubCategory(this)">
								<option value="0" selected>请选择</option>
															<option value="1">家用电器</option>
															<option value="2">手机/运营商/数码</option>
															<option value="3">电脑/办公</option>
															<option value="4">家居/家具/家装/厨具</option>
															<option value="5">男装/女装/童装/内衣</option>
															<option value="6">美妆个护/宠物</option>
															<option value="7">女鞋/箱包/钟表/珠宝</option>
															<option value="8">男鞋/运动/户外</option>
															<option value="9">汽车/汽车用品</option>
															<option value="10">母婴/玩具用品</option>
															<option value="11">食品/酒类/生鲜/特产</option>
															<option value="12">礼品鲜花/农资绿植</option>
														</select>
							<span>统计方式：</span>
							<select id="date" class="querySelect select-common middle">
								<option value="1">按照天统计</option>
								<option value="3">按照周统计</option>
								<option value="4">按照月统计</option>
							</select>
						</div>
					</div>
				</td>
			</tr>
		</tbody>
	</table> -->
			<nav class="option-nav">
				<ul>
					<li class="selected"><a href="javascript:;" onclick="getGoodsSalesCharts(1)">下单金额</a></li>
					<li><a href="javascript:;" onclick="getGoodsSalesCharts(2)">下单商品数</a></li>
				</ul>
			</nav>
			<div id="orderamount_div" class="ui-tabs-panel" style="display: block;">
				<div id="container_ordergamount" data-highcharts-chart="1">
					<div class="highcharts-container" id="highcharts-2" style="width:99%;position: relative;overflow: hidden;height: 400px; text-align: left;font-size: 12px;" data-highcharts-chart="0">
						
						
					</div>
				</div>
			</div>
	
			<div id="goodsnum_div" class="ui-tabs-panel ui-tabs-hide hide" style="display: none;">
				<div id="container_goodsnum" data-highcharts-chart="0">
					<div class="highcharts-container" id="highcharts-0" style="width:99%;position: relative;overflow: hidden;height: 400px; text-align: left;font-size: 12px;" data-highcharts-chart="1">
					
						
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
		</div>
	
	</section>
</template>
