<template>
	<section class="ns-base-section">
	
	
	
		<div style="position:relative;margin:0;">
			<!-- 面包屑导航 -->
			<div class="breadcrumb-nav">
				<a href="index.html">大鵬系統</a>
				<i class="fa fa-angle-right"></i>
				<a href="/order/orderlist.html">订单</a>
				<i class="fa fa-angle-right"></i>
				<!-- 需要加跳转链接用这个：http://showfx.niuteam.cn/admin/orderpresell/orderPresellList -->
				<a href="javascript:;" style="color:#999;">预售订单</a>
			</div>
			<!-- 三级导航菜单 -->
	
			<nav class="ns-third-menu">
				<ul>
					<li class="selected" onclick="location.href='/orderpresell/orderPresellList.html';">全部</li>
					<li onclick="location.href='/orderpresell/orderPresellList.html?status=0';">预售中</li>
					<li onclick="location.href='/orderpresell/orderPresellList.html?status=1';">待发货</li>
					<li onclick="location.href='/orderpresell/orderPresellList.html?status=2';">已发货</li>
					<li onclick="location.href='/orderpresell/orderPresellList.html?status=3';">已收货</li>
					<li onclick="location.href='/orderpresell/orderPresellList.html?status=4';">已完成</li>
					<li onclick="location.href='/orderpresell/orderPresellList.html?status=5';">已关闭</li>
					<li onclick="location.href='/orderpresell/orderPresellList.html?status=-1';">退款中</li>
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
									<p>预售订单</p>
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
					<!-- 						<span>预售订单</span> -->
					<!-- 						 -->
					<!-- 					{1/block} -->
				</h4>
			</div>
		</div>
	
	
		<div class="ns-main">
	
			<input type="hidden" id="order_id">
			<input type="hidden" id="print_select_ids">
			<input type="hidden" id="order_status" value="">
			<div>
				<table class="mytable select">
					<tbody>
						<tr>
							<th align="left">
								<button onclick="dataExcel()" class="btn-common">导出数据</button>
	
								<a class="btn-common-white" id="PrintOrder" href="javascript:;">
									<i class="fa fa-print"></i>
									<span>打印订单</span>
								</a>
							</th>
							<th style="position: relative;">
								<span>下单时间：</span>
								<input type="text" id="startDate" class="input-common middle" placeholder="请选择开始日期" onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm:ss'})"> &nbsp;-&nbsp;
								<input type="text" id="endDate" placeholder="请选择结束日期" class="input-common middle" onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm:ss'})">
								<button class="btn-common-white more-search"><i class="fa fa-chevron-down"></i></button>
								<button onclick="searchData()" class="btn-common">搜索</button>
	
								<!-- 更多搜索 -->
								<div class="more-search-container">
									<dl>
										<dt>订单编号：</dt>
										<dd>
											<input id="orderNo" class="input-common middle" type="text">
										</dd>
									</dl>
									<dl>
										<dt>收货人姓名：</dt>
										<dd>
											<input id="userName" class="input-common middle" type="text">
										</dd>
									</dl>
									<dl>
										<dt>收货人手机号：</dt>
										<dd>
											<input id="receiverMobile" class="input-common middle" type="text">
										</dd>
									</dl>
									<dl>
										<dt>支付方式：</dt>
										<dd>
											<div class="selectric-wrapper selectric-select-common selectric-middle" style="width: 150px;">
												<div class="selectric-hide-select"><select id="payment_type" class="select-common middle" tabindex="-1">
									<option value="">全部</option>
									<option value="1">微信</option>
									<option value="2">支付宝</option>
									<option value="10">线下支付</option>
									<option value="4">货到付款</option>
								</select></div>
												<div class="selectric"><span class="selectric-label">全部</span><button class="selectric-button">▾</button></div>
												<div class="selectric-items" tabindex="-1">
													<div class="selectric-scroll">
														<ul>
															<li data-index="0" class="selected" title="全部">全部</li>
															<li data-index="1" class="" title="微信">微信</li>
															<li data-index="2" class="" title="支付宝">支付宝</li>
															<li data-index="3" class="" title="线下支付">线下支付</li>
															<li data-index="4" class="last" title="货到付款">货到付款</li>
														</ul>
													</div>
												</div><input class="selectric-input" tabindex="0"></div>
										</dd>
									</dl>
									<dl>
										<dt>配送方式：</dt>
										<dd>
											<div class="selectric-wrapper selectric-select-common selectric-middle" style="width: 150px;">
												<div class="selectric-hide-select"><select id="shipping_type" class="select-common middle" tabindex="-1">
									<option value="0">全部</option>
									<option value="1">物流配送</option>
									<option value="2">买家自提</option>
									<option value="3">本地配送</option>
								</select></div>
												<div class="selectric"><span class="selectric-label">全部</span><button class="selectric-button">▾</button></div>
												<div class="selectric-items" tabindex="-1">
													<div class="selectric-scroll">
														<ul>
															<li data-index="0" class="selected" title="全部">全部</li>
															<li data-index="1" class="" title="物流配送">物流配送</li>
															<li data-index="2" class="" title="买家自提">买家自提</li>
															<li data-index="3" class="last" title="本地配送">本地配送</li>
														</ul>
													</div>
												</div><input class="selectric-input" tabindex="0"></div>
										</dd>
									</dl>
									<dl>
										<dt></dt>
										<dd><button onclick="searchData()" class="btn-common">搜索</button></dd>
									</dl>
								</div>
							</th>
						</tr>
					</tbody>
				</table>
	
				<table class="table-class" id="ajax-orderlist">
					<colgroup>
						<col width="2%">
						<col width="34%">
						<col width="12%">
						<col width="5%">
						<col width="10%">
						<col width="10%">
						<col width="6%">
						<col width="7%">
						<col width="7%">
						<col width="10%">
					</colgroup>
					<thead>
						<tr align="center">
							<th>
								<i class="checkbox-common">
							<input type="checkbox" onclick="CheckAll(this)" id="check">
						</i>
							</th>
							<th>商品信息</th>
							<th>商品清单</th>
							<th>预定金</th>
							<th>订单金额</th>
							<th>收货信息</th>
							<th>买家</th>
							<th>交易状态</th>
							<th>配送方式</th>
							<th>操作</th>
						</tr>
					</thead>
					<tbody>
						<tr>
							<td rowspan="1"><i class="checkbox-common"><input id="153261213838371001" type="checkbox" value="62" name="sub"></i></td>
							<td>
								<div style="font-size: 12px;color: #126AE4;margin-bottom:5px;"><span>订单编号：2018072621350002</span>&nbsp;<span>下单时间：2018-07-26 21:35:38</span></div>
								<div class="product-img"><img src="/upload/goods/14993429751434.jpg"></div>
								<div class="product-infor"><a href="/goods/goodsinfo?goodsid=75" target="_blank" style="color:#333;">21312312</a>
									<p class="specification" style="margin-bottom: 0px;"><span style="color:#8e8c8c;font-size:12px;">24GB </span></p>
								</div>
							</td>
							<td>
								<div class="cell" style="display: inline-block;"><span>3.96元</span></div>
								<div class="cell" style="display: inline-block;float:right;">1件</div>
							</td>
							<td rowspan="1" style="text-align:center">1.00</td>
							<td rowspan="1" style="text-align:center">
								<div class="cell"><b class="netprice" style="color: #FF6600;font-size: 14px;font-weight: normal;">3.96</b><br><span class="expressfee">(含配送费:0.00元)</span><br><span class="expressfee">在线支付</span></div>
							</td>
							<td rowspan="1" style="text-align:center">
								<div style="text-align:left;"><span class="expressfee">test</span><br><span class="expressfee">15802353600</span><br><span class="expressfee">广东省&nbsp;梅州市&nbsp;梅县&nbsp;yatai shang</span></div>
							</td>
							<td rowspan="1" style="text-align:center">
								<div class="cell">cqinter<br><i class="fa fa-mobile fa-2x" style="color:#666;"><i></i></i>
								</div>
							</td>
							<td rowspan="1">
								<div class="business-status" style="text-align:center">已关闭<br></div>
							</td>
							<td rowspan="1">
								<div class="business-status" style="text-align:center">物流配送<br></div>
							</td>
							<td rowspan="1" style="text-align:center;"><a style="display:block;margin-bottom:5px;" href="/Orderpresell/orderDetail?order_id=62">订单详情</a><a style="display:block;margin-bottom:5px;color:#666666" href="javascript:operation('seller_memo',62)">备注</a><a style="display:block;margin-bottom:5px;color:#ff0000"
								    href="javascript:operation('delete_order',62)">删除订单</a></td>
						</tr>
						<tr style="height:10px;">
							<td style="border-bottom:solid #E1E6F0;border-width:0 0 1px 0;" colspan="10"></td>
						</tr>
						<tr>
							<td rowspan="1"><i class="checkbox-common"><input id="153261210111331001" type="checkbox" value="61" name="sub"></i></td>
							<td>
								<div style="font-size: 12px;color: #126AE4;margin-bottom:5px;"><span>订单编号：2018072621350001</span>&nbsp;<span>下单时间：2018-07-26 21:35:01</span></div>
								<div class="product-img"><img src="/upload/goods/14993429751434.jpg"></div>
								<div class="product-infor"><a href="/goods/goodsinfo?goodsid=75" target="_blank" style="color:#333;">21312312</a>
									<p class="specification" style="margin-bottom: 0px;"><span style="color:#8e8c8c;font-size:12px;">24GB </span></p>
								</div>
							</td>
							<td>
								<div class="cell" style="display: inline-block;"><span>3.96元</span></div>
								<div class="cell" style="display: inline-block;float:right;">1件</div>
							</td>
							<td rowspan="1" style="text-align:center">100.00</td>
							<td rowspan="1" style="text-align:center">
								<div class="cell"><b class="netprice" style="color: #FF6600;font-size: 14px;font-weight: normal;">3.96</b><br><span class="expressfee">(含配送费:0.00元)</span><br><span class="expressfee">在线支付</span></div>
							</td>
							<td rowspan="1" style="text-align:center">
								<div style="text-align:left;"><span class="expressfee">test</span><br><span class="expressfee">15802353600</span><br><span class="expressfee">广东省&nbsp;梅州市&nbsp;梅县&nbsp;yatai shang</span></div>
							</td>
							<td rowspan="1" style="text-align:center">
								<div class="cell">cqinter<br><i class="fa fa-mobile fa-2x" style="color:#666;"><i></i></i>
								</div>
							</td>
							<td rowspan="1">
								<div class="business-status" style="text-align:center">已关闭<br></div>
							</td>
							<td rowspan="1">
								<div class="business-status" style="text-align:center">物流配送<br></div>
							</td>
							<td rowspan="1" style="text-align:center;"><a style="display:block;margin-bottom:5px;" href="/Orderpresell/orderDetail?order_id=61">订单详情</a><a style="display:block;margin-bottom:5px;color:#666666" href="javascript:operation('seller_memo',61)">备注</a><a style="display:block;margin-bottom:5px;color:#ff0000"
								    href="javascript:operation('delete_order',61)">删除订单</a></td>
						</tr>
					</tbody>
				</table>
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
						<li class="total-data" data-total-count="2">共2条</li>
						<!-- <li class="page-count">共0页</li> -->
						<li class="according-number">
							跳<input type="text" class="input-medium" id="skipPage" data-curr-page="1">页
						</li>
					</ul>
				</div>
			</div>
			<input type="hidden" id="page_count" value="1">
			<input type="hidden" id="page_size" value="2">
		</div>
	
	</section>
</template>

<script>
	require("@/assets/style/table.scss");
	require("@/assets/style/order/list.scss");
	
	export default {
		name: "orderPreshellList",
		components: {}
	};
</script>