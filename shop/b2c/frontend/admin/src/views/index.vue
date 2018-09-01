<template>

  <div >
    <Aside v-bind:menuList="menuList" v-bind:isIndex="true" />
 	<section class="ns-base-section">
     
			<div class="ns-notice">
				<nav>
					<ul>
						<li>网站名称：<span>单商户B2C</span></li>
						<li>当前版本：<span>企业版2.5.2</span></li>
						<li>最后登录时间：<span>2018-08-25 02:05:24</span></li>
						<li>最后登录IP：<span>222.211.248.180</span></li>
						<!-- 			<li class="nav" style="display:none;"> -->
						<!-- 				<strong></strong> -->
						<!-- 				<a href="http://b2c.niuteam.cn/admin.html">单商户B2C</a> -->
						<!-- 				 -->
						<!-- 				<i class="fa fa-angle-right"></i> -->
						<!-- 				<a href="http://b2c.niuteam.cn/admin/index/index.html">首页</a> -->
						<!-- 				 -->
						<!-- 				 -->
						<!-- 				<i class="fa fa-angle-right"></i> -->
						<!-- 					需要加跳转链接用这个：http://b2c.niuteam.cn/admin/index/index -->
						<!-- 					<a href="javascript:;">欢迎页</a> -->
						<!-- 				 -->
						<!-- 			</li> -->
					</ul>
				</nav>
			</div>
			<div style="height:40px;"></div>


			<div style="position:relative;margin:0;">
				<!-- 面包屑导航 -->
				<!-- 三级导航菜单 -->

				<div class="right-side-operation">
					<ul>


					</ul>
				</div>
			</div>

			<!-- 操作提示 -->


			<div class="ns-main">

				<div class="statistical">
					<ul>
						<li>
							<div class="left">
								<img src="/static/blue/img/order_amount.png">
							</div>
							<div class="right">
								<strong class="js-order-amount">0.00</strong>
								<p>今日订单总金额(元)</p>
							</div>
						</li>
						<li>
							<div class="left">
								<img src="/static/blue/img/focus_number.png">
							</div>
							<div class="right">
								<strong class="js-weixin-fans-count">0</strong>
								<p>关注人数(个)</p>
							</div>
						</li>
						<li>
							<div class="left">
								<img src="/static/blue/img/goods_release.png">
							</div>
							<div class="right">
								<strong class="js-goods-release-count">1</strong>
								<p>商品发布(个)</p>
							</div>
						</li>
						<li>
							<div class="left">
								<img src="/static/blue/img/order_total.png">
							</div>
							<div class="right">
								<strong class="js-order-total">1</strong>
								<p>订单总数(笔)</p>
							</div>
						</li>
						<li>
							<div class="left">
								<img src="/static/blue/img/month_sales.png">
							</div>
							<div class="right">
								<strong class="js-month-sales">1</strong>
								<p>本月销量(笔)</p>
							</div>
						</li>
						<li>
							<div class="left">
								<img src="/static/blue/img/finish_count.png">
							</div>
							<div class="right">
								<strong class="js-order-finish-count">1</strong>
								<p>已完成交易(笔)</p>
							</div>
						</li>
					</ul>
				</div>

				<div class="goods-prompt">
					<h3>
						<i class="i-circular"></i>店铺及商品提示<span>您需要关注的店铺信息以及待处理事项</span>
					</h3>
					<div class="goods-state a-line">
						<ul>
							<li>
								<a href="http://b2c.niuteam.cn/admin/goods/goodslist.html?state=1">
									<strong class="goods_sale_count">1</strong>
									<span>出售中</span>
								</a>
							</li>
							<li>
								<a href="http://b2c.niuteam.cn/admin/goods/goodslist.html?state=0">
									<strong class="goods_audit_count">1</strong>
									<span>仓库中</span>
								</a>
							</li>
							<li>
								<a href="http://b2c.niuteam.cn/admin/saleservice/consultlist.html?type=to_reply">
									<strong class="goods_consult_count">1</strong>
									<span>待回复咨询</span>
								</a>
							</li>
							<li>
								<a href="http://b2c.niuteam.cn/admin/member/usercommissionwithdrawlist.html">
									<strong class="member_balance_withdraw">1</strong>
									<span>会员提现审核</span>
								</a>
							</li>
							<li>
								<a href="http://b2c.niuteam.cn/admin/goods/goodslist.html?stock_warning=1">
									<strong class="stock_early_warning">1</strong>
									<span>库存预警</span>
								</a>
							</li>
						</ul>
					</div>
				</div>

				<div class="merchants-help">
					<h3>
						<i class="i-circular"></i>商家帮助<span>您需要的商家帮助</span>
					</h3>
					<div class="merchants-use">
						<ul>
							<li><a href="http://b2c.niuteam.cn/admin/goods/goodslist.html"><img src="/static/blue/img/goods_management.png"><span>商品管理</span></a></li>
							<li><a href="http://b2c.niuteam.cn/admin/promotion/coupontypelist.html"><img src="/static/blue/img/promotions.png"><span>促销方式</span></a></li>
							<li><a href="http://b2c.niuteam.cn/admin/order/orderlist.html"><img src="/static/blue/img/order_after.png"><span>订单及售后</span></a></li>
						</ul>
					</div>
				</div>

				<div class="goods-prompt">
					<h3>
						<i class="i-circular"></i>交易提示<span>您需要立即处理的交易订单</span>
					</h3>
					<div class="goods-state a-line order">
						<ul>
							<li>
								<a href="http://b2c.niuteam.cn/admin/order/orderlist.html?status=0">
									<strong class="daifukuan">0</strong>
									<span>待付款</span>
								</a>
							</li>
							<li>
								<a href="http://b2c.niuteam.cn/admin/order/orderlist.html?status=1">
									<strong class="daifahuo">1</strong>
									<span>待发货</span>
								</a>
							</li>
							<li>
								<a href="http://b2c.niuteam.cn/admin/order/orderlist.html?status=2">
									<strong class="yifahuo">0</strong>
									<span>已发货</span>
								</a>
							</li>
							<li>
								<a href="http://b2c.niuteam.cn/admin/order/orderlist.html?status=3">
									<strong class="yishouhuo">0</strong>
									<span>已收货</span>
								</a>
							</li>
							<li>
								<a href="http://b2c.niuteam.cn/admin/order/orderlist.html?status=4">
									<strong class="yiwancheng">1</strong>
									<span>已完成</span>
								</a>
							</li>
							<!-- <li> 
								<a href="http://b2c.niuteam.cn/admin/order/orderlist.html?status=5">
									<strong class="yiguanbi">0</strong>
									<span>已关闭</span>
								</a>
							</li>  -->
							<li>
								<a href="http://b2c.niuteam.cn/admin/order/orderlist.html?status=-1">
									<strong class="tuikuanzhong">1</strong>
									<span>退款中</span>
								</a>
							</li>
							<li>
								<a href="http://b2c.niuteam.cn/admin/order/customerServiceList.html">
									<strong class="customer">0</strong>
									<span>售后待处理</span>
								</a>
							</li>
							<!-- 			<li style="display: none;"> -->
							<!-- 				<a href="http://b2c.niuteam.cn/admin/order/orderlist.html?status=-2"> -->
							<!-- 					<strong class="yituikuan">0</strong> -->
							<!-- 					<span>已退款</span> -->
							<!-- 				</a> -->
							<!-- 			</li> -->
						</ul>
					</div>
				</div>

				<div class="sales">
					<h3>
						<i class="i-circular"></i>销售情况统计<span>按周期统计商家店铺的订单量和订单金额</span>
					</h3>

					<table>
						<tbody>
							<tr>
								<td rowspan="3" align="left" style="background: #f6f6f6;text-align: center;">昨日销量</td>
							</tr>
							<tr>
								<td style=" border-top: 1px solid #f6f6f6;">
									<span>订单量(件)</span>
									<strong class="yesterday_goods">1</strong>
								</td>
							</tr>
							<tr>
								<td>
									<span>订单金额(元)</span>
									<strong class="yesterday_money">0.00</strong>
								</td>
							</tr>

							<tr style="height: 10px;"></tr>

							<tr>
								<td rowspan="3" align="left" style="background: #f6f6f6;text-align: center;">本月销量</td>
							</tr>
							<tr>
								<td style=" border-top: 1px solid #f6f6f6;">
									<span>订单量(件)</span>
									<strong class="month_goods">42</strong>
								</td>
							</tr>
							<tr>
								<td>
									<span>订单金额(元)</span>
									<strong class="month_money">12576.01</strong>
								</td>
							</tr>
						</tbody>
					</table>
				</div>

				<div class="charts">
					<h3>
						<i class="i-circular"></i>订单总数统计<span><i></i>订单数量</span>
					</h3>
					<div id="orderCharts" data-highcharts-chart="0">
						<div id="highcharts-nqgzkf8-0" class="highcharts-container " style="position: relative; overflow: hidden; width: 715px; height: 210px; text-align: left; line-height: normal; z-index: 0; -webkit-tap-highlight-color: rgba(0, 0, 0, 0);"><svg version="1.1" class="highcharts-root" style="font-family:&quot;Lucida Grande&quot;, &quot;Lucida Sans Unicode&quot;, Arial, Helvetica, sans-serif;font-size:12px;"
							 xmlns="http://www.w3.org/2000/svg" width="715" height="210"><desc>Created with Highcharts 5.0.6</desc>
								<defs>
									<clipPath id="highcharts-nqgzkf8-1">
										<rect x="0" y="0" width="650" height="108" fill="none"></rect>
									</clipPath>
								</defs>
								<rect fill="#ffffff" class="highcharts-background" x="0" y="0" width="715" height="210" rx="0" ry="0"></rect>
								<rect fill="none" class="highcharts-plot-background" x="55" y="46" width="650" height="108"></rect>
								<g class="highcharts-grid highcharts-xaxis-grid ">
									<path fill="none" class="highcharts-grid-line" d="M 81.5 46 L 81.5 154" opacity="1"></path>
									<path fill="none" class="highcharts-grid-line" d="M 108.5 46 L 108.5 154" opacity="1"></path>
									<path fill="none" class="highcharts-grid-line" d="M 135.5 46 L 135.5 154" opacity="1"></path>
									<path fill="none" class="highcharts-grid-line" d="M 162.5 46 L 162.5 154" opacity="1"></path>
									<path fill="none" class="highcharts-grid-line" d="M 189.5 46 L 189.5 154" opacity="1"></path>
									<path fill="none" class="highcharts-grid-line" d="M 216.5 46 L 216.5 154" opacity="1"></path>
									<path fill="none" class="highcharts-grid-line" d="M 244.5 46 L 244.5 154" opacity="1"></path>
									<path fill="none" class="highcharts-grid-line" d="M 271.5 46 L 271.5 154" opacity="1"></path>
									<path fill="none" class="highcharts-grid-line" d="M 298.5 46 L 298.5 154" opacity="1"></path>
									<path fill="none" class="highcharts-grid-line" d="M 325.5 46 L 325.5 154" opacity="1"></path>
									<path fill="none" class="highcharts-grid-line" d="M 352.5 46 L 352.5 154" opacity="1"></path>
									<path fill="none" class="highcharts-grid-line" d="M 379.5 46 L 379.5 154" opacity="1"></path>
									<path fill="none" class="highcharts-grid-line" d="M 406.5 46 L 406.5 154" opacity="1"></path>
									<path fill="none" class="highcharts-grid-line" d="M 433.5 46 L 433.5 154" opacity="1"></path>
									<path fill="none" class="highcharts-grid-line" d="M 460.5 46 L 460.5 154" opacity="1"></path>
									<path fill="none" class="highcharts-grid-line" d="M 487.5 46 L 487.5 154" opacity="1"></path>
									<path fill="none" class="highcharts-grid-line" d="M 514.5 46 L 514.5 154" opacity="1"></path>
									<path fill="none" class="highcharts-grid-line" d="M 542.5 46 L 542.5 154" opacity="1"></path>
									<path fill="none" class="highcharts-grid-line" d="M 569.5 46 L 569.5 154" opacity="1"></path>
									<path fill="none" class="highcharts-grid-line" d="M 596.5 46 L 596.5 154" opacity="1"></path>
									<path fill="none" class="highcharts-grid-line" d="M 623.5 46 L 623.5 154" opacity="1"></path>
									<path fill="none" class="highcharts-grid-line" d="M 650.5 46 L 650.5 154" opacity="1"></path>
									<path fill="none" class="highcharts-grid-line" d="M 677.5 46 L 677.5 154" opacity="1"></path>
									<path fill="none" class="highcharts-grid-line" d="M 704.5 46 L 704.5 154" opacity="1"></path>
									<path fill="none" class="highcharts-grid-line" d="M 54.5 46 L 54.5 154" opacity="1"></path>
								</g>
								<g class="highcharts-grid highcharts-yaxis-grid ">
									<path fill="none" stroke="#e6e6e6" stroke-width="1" class="highcharts-grid-line" d="M 55 100.5 L 705 100.5" opacity="1"></path>
								</g>
								<rect fill="none" class="highcharts-plot-border" x="55" y="46" width="650" height="108"></rect>
								<g class="highcharts-axis highcharts-xaxis ">
									<path fill="none" class="highcharts-tick" stroke="#ccd6eb" stroke-width="1" d="M 81.5 154 L 81.5 164" opacity="1"></path>
									<path fill="none" class="highcharts-tick" stroke="#ccd6eb" stroke-width="1" d="M 108.5 154 L 108.5 164" opacity="1"></path>
									<path fill="none" class="highcharts-tick" stroke="#ccd6eb" stroke-width="1" d="M 135.5 154 L 135.5 164" opacity="1"></path>
									<path fill="none" class="highcharts-tick" stroke="#ccd6eb" stroke-width="1" d="M 162.5 154 L 162.5 164" opacity="1"></path>
									<path fill="none" class="highcharts-tick" stroke="#ccd6eb" stroke-width="1" d="M 189.5 154 L 189.5 164" opacity="1"></path>
									<path fill="none" class="highcharts-tick" stroke="#ccd6eb" stroke-width="1" d="M 216.5 154 L 216.5 164" opacity="1"></path>
									<path fill="none" class="highcharts-tick" stroke="#ccd6eb" stroke-width="1" d="M 244.5 154 L 244.5 164" opacity="1"></path>
									<path fill="none" class="highcharts-tick" stroke="#ccd6eb" stroke-width="1" d="M 271.5 154 L 271.5 164" opacity="1"></path>
									<path fill="none" class="highcharts-tick" stroke="#ccd6eb" stroke-width="1" d="M 298.5 154 L 298.5 164" opacity="1"></path>
									<path fill="none" class="highcharts-tick" stroke="#ccd6eb" stroke-width="1" d="M 325.5 154 L 325.5 164" opacity="1"></path>
									<path fill="none" class="highcharts-tick" stroke="#ccd6eb" stroke-width="1" d="M 352.5 154 L 352.5 164" opacity="1"></path>
									<path fill="none" class="highcharts-tick" stroke="#ccd6eb" stroke-width="1" d="M 379.5 154 L 379.5 164" opacity="1"></path>
									<path fill="none" class="highcharts-tick" stroke="#ccd6eb" stroke-width="1" d="M 406.5 154 L 406.5 164" opacity="1"></path>
									<path fill="none" class="highcharts-tick" stroke="#ccd6eb" stroke-width="1" d="M 433.5 154 L 433.5 164" opacity="1"></path>
									<path fill="none" class="highcharts-tick" stroke="#ccd6eb" stroke-width="1" d="M 460.5 154 L 460.5 164" opacity="1"></path>
									<path fill="none" class="highcharts-tick" stroke="#ccd6eb" stroke-width="1" d="M 487.5 154 L 487.5 164" opacity="1"></path>
									<path fill="none" class="highcharts-tick" stroke="#ccd6eb" stroke-width="1" d="M 514.5 154 L 514.5 164" opacity="1"></path>
									<path fill="none" class="highcharts-tick" stroke="#ccd6eb" stroke-width="1" d="M 542.5 154 L 542.5 164" opacity="1"></path>
									<path fill="none" class="highcharts-tick" stroke="#ccd6eb" stroke-width="1" d="M 569.5 154 L 569.5 164" opacity="1"></path>
									<path fill="none" class="highcharts-tick" stroke="#ccd6eb" stroke-width="1" d="M 596.5 154 L 596.5 164" opacity="1"></path>
									<path fill="none" class="highcharts-tick" stroke="#ccd6eb" stroke-width="1" d="M 623.5 154 L 623.5 164" opacity="1"></path>
									<path fill="none" class="highcharts-tick" stroke="#ccd6eb" stroke-width="1" d="M 650.5 154 L 650.5 164" opacity="1"></path>
									<path fill="none" class="highcharts-tick" stroke="#ccd6eb" stroke-width="1" d="M 677.5 154 L 677.5 164" opacity="1"></path>
									<path fill="none" class="highcharts-tick" stroke="#ccd6eb" stroke-width="1" d="M 704.5 154 L 704.5 164" opacity="1"></path>
									<path fill="none" class="highcharts-tick" stroke="#ccd6eb" stroke-width="1" d="M 54.5 154 L 54.5 164" opacity="1"></path>
									<path fill="none" class="highcharts-axis-line" stroke="#ccd6eb" stroke-width="1" d="M 55 154.5 L 705 154.5"></path>
								</g>
								<g class="highcharts-axis highcharts-yaxis "><text x="24" text-anchor="middle" transform="translate(0,0) rotate(270 24 100)" class="highcharts-axis-title" style="color:#666666;fill:#666666;"
									 y="100">订单统计</text><path fill="none" class="highcharts-axis-line" d="M 55 46 L 55 154"></path>
								</g>
								<g class="highcharts-series-group">
									<g class="highcharts-series highcharts-series-0 highcharts-column-series highcharts-color-1 highcharts-tracker" transform="translate(55,64.25422970864997) scale(1 0.6619587090990746)"
									 width="108" height="650" clip-path="url(#highcharts-nqgzkf8-1)">
										<rect x="6.5" y="54.5" width="13" height="0" fill="#434348" class="highcharts-point highcharts-color-1" stroke="#ffffff"
										 stroke-width="1"></rect>
										<rect x="33.5" y="54.5" width="13" height="0" fill="#434348" class="highcharts-point highcharts-color-1"
										 stroke="#ffffff" stroke-width="1"></rect>
										<rect x="60.5" y="54.5" width="13" height="0" fill="#434348" class="highcharts-point highcharts-color-1"
										 stroke="#ffffff" stroke-width="1"></rect>
										<rect x="87.5" y="54.5" width="13" height="0" fill="#434348" class="highcharts-point highcharts-color-1"
										 stroke="#ffffff" stroke-width="1"></rect>
										<rect x="114.5" y="54.5" width="13" height="0" fill="#434348" class="highcharts-point highcharts-color-1"
										 stroke="#ffffff" stroke-width="1"></rect>
										<rect x="141.5" y="54.5" width="13" height="0" fill="#434348" class="highcharts-point highcharts-color-1"
										 stroke="#ffffff" stroke-width="1"></rect>
										<rect x="169.5" y="54.5" width="13" height="0" fill="#434348" class="highcharts-point highcharts-color-1"
										 stroke="#ffffff" stroke-width="1"></rect>
										<rect x="196.5" y="54.5" width="13" height="0" fill="#434348" class="highcharts-point highcharts-color-1"
										 stroke="#ffffff" stroke-width="1"></rect>
										<rect x="223.5" y="54.5" width="13" height="0" fill="#434348" class="highcharts-point highcharts-color-1"
										 stroke="#ffffff" stroke-width="1"></rect>
										<rect x="250.5" y="54.5" width="13" height="0" fill="#434348" class="highcharts-point highcharts-color-1"
										 stroke="#ffffff" stroke-width="1"></rect>
										<rect x="277.5" y="54.5" width="13" height="0" fill="#434348" class="highcharts-point highcharts-color-1"
										 stroke="#ffffff" stroke-width="1"></rect>
										<rect x="304.5" y="54.5" width="13" height="0" fill="#434348" class="highcharts-point highcharts-color-1"
										 stroke="#ffffff" stroke-width="1"></rect>
										<rect x="331.5" y="54.5" width="13" height="0" fill="#434348" class="highcharts-point highcharts-color-1"
										 stroke="#ffffff" stroke-width="1"></rect>
										<rect x="358.5" y="54.5" width="13" height="0" fill="#434348" class="highcharts-point highcharts-color-1"
										 stroke="#ffffff" stroke-width="1"></rect>
										<rect x="385.5" y="54.5" width="13" height="0" fill="#434348" class="highcharts-point highcharts-color-1"
										 stroke="#ffffff" stroke-width="1"></rect>
										<rect x="412.5" y="54.5" width="13" height="0" fill="#434348" class="highcharts-point highcharts-color-1"
										 stroke="#ffffff" stroke-width="1"></rect>
										<rect x="439.5" y="54.5" width="13" height="0" fill="#434348" class="highcharts-point highcharts-color-1"
										 stroke="#ffffff" stroke-width="1"></rect>
										<rect x="466.5" y="54.5" width="13" height="0" fill="#434348" class="highcharts-point highcharts-color-1"
										 stroke="#ffffff" stroke-width="1"></rect>
										<rect x="494.5" y="54.5" width="13" height="0" fill="#434348" class="highcharts-point highcharts-color-1"
										 stroke="#ffffff" stroke-width="1"></rect>
										<rect x="521.5" y="54.5" width="13" height="0" fill="#434348" class="highcharts-point highcharts-color-1"
										 stroke="#ffffff" stroke-width="1"></rect>
										<rect x="548.5" y="54.5" width="13" height="0" fill="#434348" class="highcharts-point highcharts-color-1"
										 stroke="#ffffff" stroke-width="1"></rect>
										<rect x="575.5" y="54.5" width="13" height="0" fill="#434348" class="highcharts-point highcharts-color-1"
										 stroke="#ffffff" stroke-width="1"></rect>
										<rect x="602.5" y="54.5" width="13" height="0" fill="#434348" class="highcharts-point highcharts-color-1"
										 stroke="#ffffff" stroke-width="1"></rect>
										<rect x="629.5" y="54.5" width="13" height="0" fill="#434348" class="highcharts-point highcharts-color-1"
										 stroke="#ffffff" stroke-width="1"></rect>
									</g>
									<g class="highcharts-markers highcharts-series-0 highcharts-column-series highcharts-color-1 " transform="translate(55,46) scale(1 1)"
									 width="108" height="650"></g>
								</g>
								<g class="highcharts-button highcharts-contextbutton" style="cursor:pointer;" stroke-linecap="round" transform="translate(681,10)">
									<title>Chart context menu</title>
									<rect fill="#ffffff" class=" highcharts-button-box" x="0.5" y="0.5" width="24" height="22"
									 rx="2" ry="2" stroke="none" stroke-width="1"></rect>
									<path fill="#666666" d="M 6 6.5 L 20 6.5 M 6 11.5 L 20 11.5 M 6 16.5 L 20 16.5" class="highcharts-button-symbol"
									 stroke="#666666" stroke-width="3"></path><text x="0" style="font-weight:normal;color:#333333;fill:#333333;" y="12"></text></g>
								<g class="highcharts-axis-labels highcharts-xaxis-labels "><text x="71.60579605180837" style="color:#666666;cursor:default;font-size:13px;font-family:Verdana, sans-serif;fill:#666666;width:210px;text-overflow:ellipsis;"
									 text-anchor="end" transform="translate(0,0) rotate(-45 71.60579605180837 171)" y="171" opacity="1"><tspan>0:00</tspan></text><text
									 x="98.6891293851417" style="color:#666666;cursor:default;font-size:13px;font-family:Verdana, sans-serif;fill:#666666;width:210px;text-overflow:ellipsis;"
									 text-anchor="end" transform="translate(0,0) rotate(-45 98.6891293851417 171)" y="171" opacity="1"><tspan>1:00</tspan></text><text
									 x="125.77246271847504" style="color:#666666;cursor:default;font-size:13px;font-family:Verdana, sans-serif;fill:#666666;width:210px;text-overflow:ellipsis;"
									 text-anchor="end" transform="translate(0,0) rotate(-45 125.77246271847504 171)" y="171" opacity="1"><tspan>2:00</tspan></text><text
									 x="152.85579605180837" style="color:#666666;cursor:default;font-size:13px;font-family:Verdana, sans-serif;fill:#666666;width:210px;text-overflow:ellipsis;"
									 text-anchor="end" transform="translate(0,0) rotate(-45 152.85579605180837 171)" y="171" opacity="1"><tspan>3:00</tspan></text><text
									 x="179.9391293851417" style="color:#666666;cursor:default;font-size:13px;font-family:Verdana, sans-serif;fill:#666666;width:210px;text-overflow:ellipsis;"
									 text-anchor="end" transform="translate(0,0) rotate(-45 179.9391293851417 171)" y="171" opacity="1"><tspan>4:00</tspan></text><text
									 x="207.02246271847503" style="color:#666666;cursor:default;font-size:13px;font-family:Verdana, sans-serif;fill:#666666;width:210px;text-overflow:ellipsis;"
									 text-anchor="end" transform="translate(0,0) rotate(-45 207.02246271847503 171)" y="171" opacity="1"><tspan>5:00</tspan></text><text
									 x="234.10579605180837" style="color:#666666;cursor:default;font-size:13px;font-family:Verdana, sans-serif;fill:#666666;width:210px;text-overflow:ellipsis;"
									 text-anchor="end" transform="translate(0,0) rotate(-45 234.10579605180837 171)" y="171" opacity="1"><tspan>6:00</tspan></text><text
									 x="261.18912938514165" style="color:#666666;cursor:default;font-size:13px;font-family:Verdana, sans-serif;fill:#666666;width:210px;text-overflow:ellipsis;"
									 text-anchor="end" transform="translate(0,0) rotate(-45 261.18912938514165 171)" y="171" opacity="1"><tspan>7:00</tspan></text><text
									 x="288.272462718475" style="color:#666666;cursor:default;font-size:13px;font-family:Verdana, sans-serif;fill:#666666;width:210px;text-overflow:ellipsis;"
									 text-anchor="end" transform="translate(0,0) rotate(-45 288.272462718475 171)" y="171" opacity="1"><tspan>8:00</tspan></text><text
									 x="315.35579605180834" style="color:#666666;cursor:default;font-size:13px;font-family:Verdana, sans-serif;fill:#666666;width:210px;text-overflow:ellipsis;"
									 text-anchor="end" transform="translate(0,0) rotate(-45 315.35579605180834 171)" y="171" opacity="1"><tspan>9:00</tspan></text><text
									 x="342.4391293851417" style="color:#666666;cursor:default;font-size:13px;font-family:Verdana, sans-serif;fill:#666666;width:210px;text-overflow:ellipsis;"
									 text-anchor="end" transform="translate(0,0) rotate(-45 342.4391293851417 171)" y="171" opacity="1"><tspan>10:00</tspan></text><text
									 x="369.522462718475" style="color:#666666;cursor:default;font-size:13px;font-family:Verdana, sans-serif;fill:#666666;width:210px;text-overflow:ellipsis;"
									 text-anchor="end" transform="translate(0,0) rotate(-45 369.522462718475 171)" y="171" opacity="1"><tspan>11:00</tspan></text><text
									 x="396.60579605180834" style="color:#666666;cursor:default;font-size:13px;font-family:Verdana, sans-serif;fill:#666666;width:210px;text-overflow:ellipsis;"
									 text-anchor="end" transform="translate(0,0) rotate(-45 396.60579605180834 171)" y="171" opacity="1"><tspan>12:00</tspan></text><text
									 x="423.6891293851417" style="color:#666666;cursor:default;font-size:13px;font-family:Verdana, sans-serif;fill:#666666;width:210px;text-overflow:ellipsis;"
									 text-anchor="end" transform="translate(0,0) rotate(-45 423.6891293851417 171)" y="171" opacity="1"><tspan>13:00</tspan></text><text
									 x="450.772462718475" style="color:#666666;cursor:default;font-size:13px;font-family:Verdana, sans-serif;fill:#666666;width:210px;text-overflow:ellipsis;"
									 text-anchor="end" transform="translate(0,0) rotate(-45 450.772462718475 171)" y="171" opacity="1"><tspan>14:00</tspan></text><text
									 x="477.85579605180834" style="color:#666666;cursor:default;font-size:13px;font-family:Verdana, sans-serif;fill:#666666;width:210px;text-overflow:ellipsis;"
									 text-anchor="end" transform="translate(0,0) rotate(-45 477.85579605180834 171)" y="171" opacity="1"><tspan>15:00</tspan></text><text
									 x="504.9391293851417" style="color:#666666;cursor:default;font-size:13px;font-family:Verdana, sans-serif;fill:#666666;width:210px;text-overflow:ellipsis;"
									 text-anchor="end" transform="translate(0,0) rotate(-45 504.9391293851417 171)" y="171" opacity="1"><tspan>16:00</tspan></text><text
									 x="532.022462718475" style="color:#666666;cursor:default;font-size:13px;font-family:Verdana, sans-serif;fill:#666666;width:210px;text-overflow:ellipsis;"
									 text-anchor="end" transform="translate(0,0) rotate(-45 532.022462718475 171)" y="171" opacity="1"><tspan>17:00</tspan></text><text
									 x="559.1057960518083" style="color:#666666;cursor:default;font-size:13px;font-family:Verdana, sans-serif;fill:#666666;width:210px;text-overflow:ellipsis;"
									 text-anchor="end" transform="translate(0,0) rotate(-45 559.1057960518083 171)" y="171" opacity="1"><tspan>18:00</tspan></text><text
									 x="586.1891293851417" style="color:#666666;cursor:default;font-size:13px;font-family:Verdana, sans-serif;fill:#666666;width:210px;text-overflow:ellipsis;"
									 text-anchor="end" transform="translate(0,0) rotate(-45 586.1891293851417 171)" y="171" opacity="1"><tspan>19:00</tspan></text><text
									 x="613.2724627184749" style="color:#666666;cursor:default;font-size:13px;font-family:Verdana, sans-serif;fill:#666666;width:210px;text-overflow:ellipsis;"
									 text-anchor="end" transform="translate(0,0) rotate(-45 613.2724627184749 171)" y="171" opacity="1"><tspan>20:00</tspan></text><text
									 x="640.3557960518083" style="color:#666666;cursor:default;font-size:13px;font-family:Verdana, sans-serif;fill:#666666;width:210px;text-overflow:ellipsis;"
									 text-anchor="end" transform="translate(0,0) rotate(-45 640.3557960518083 171)" y="171" opacity="1"><tspan>21:00</tspan></text><text
									 x="667.4391293851417" style="color:#666666;cursor:default;font-size:13px;font-family:Verdana, sans-serif;fill:#666666;width:210px;text-overflow:ellipsis;"
									 text-anchor="end" transform="translate(0,0) rotate(-45 667.4391293851417 171)" y="171" opacity="1"><tspan>22:00</tspan></text><text
									 x="694.5224627184749" style="color:#666666;cursor:default;font-size:13px;font-family:Verdana, sans-serif;fill:#666666;width:210px;text-overflow:ellipsis;"
									 text-anchor="end" transform="translate(0,0) rotate(-45 694.5224627184749 171)" y="171" opacity="1"><tspan>23:00</tspan></text></g>
								<g
								 class="highcharts-axis-labels highcharts-yaxis-labels "><text x="40" style="color:#666666;cursor:default;font-size:11px;fill:#666666;width:226px;text-overflow:clip;" text-anchor="end"
									 transform="translate(0,0)" y="105" opacity="1"><tspan>0</tspan></text></g></svg><span style="font-family: &quot;Lucida Grande&quot;, &quot;Lucida Sans Unicode&quot;, Arial, Helvetica, sans-serif; font-size: 18px; position: absolute; white-space: nowrap; margin-left: 0px; margin-top: 0px; left: 10px; top: 7px; color: rgb(51, 51, 51);"
							 class="highcharts-title" transform="translate(0,0)"><span class="charts-title order" onclick="onloadOrderChart(1)">今日</span><span
								 class="charts-title order black" onclick="onloadOrderChart(2)">昨日</span><span class="charts-title order black" onclick="onloadOrderChart(3)">本周</span><span
								 class="charts-title order black" onclick="onloadOrderChart(4)">本月</span></span></div>
					</div>
				</div>

				<div class="sales-ranking">
					<h3>
						<i class="i-circular"></i>单品销售排名<span>按周期统计商家店铺的订单量和订单金额</span>
					</h3>
					<table>
						<colgroup>
							<col width="15%">
							<col width="70%">
							<col width="15%">
						</colgroup>
						<tbody>
							<tr>
								<td>排行</td>
								<td style="text-align: left;">商品信息</td>
								<td>销量</td>
							</tr>
							<tr>
								<td>
									<span class="frist">
										1</span>
								</td>
								<td title="智能家居电动窗帘遥控wifi自动智能窗帘电机电动遥控窗帘轨道" style="text-align: left;">
									<a href="http://b2c.niuteam.cn/goods/goodsinfo.html?goodsid=29" target="_blank">智能家居电动窗帘遥控wifi自动智能窗帘...</a>
								</td>
								<td>
									<span class="frist">
										16</span>
								</td>
							</tr>
							<tr>
								<td>
									<span class="second">
										2</span>
								</td>
								<td title="aaa-副本" style="text-align: left;">
									<a href="http://b2c.niuteam.cn/goods/goodsinfo.html?goodsid=89" target="_blank">aaa-副本</a>
								</td>
								<td>
									<span class="second">
										14</span>
								</td>
							</tr>
							<tr>
								<td>
									<span class="third">
										3</span>
								</td>
								<td title="Haier/海尔 BCD-206STPA 206升三门冷藏家用节能小冰箱 软冷冻" style="text-align: left;">
									<a href="http://b2c.niuteam.cn/goods/goodsinfo.html?goodsid=27" target="_blank">Haier/海尔 BCD-206STPA...</a>
								</td>
								<td>
									<span class="third">
										9</span>
								</td>
							</tr>
							<tr>
								<td>
									<span>
										4</span>
								</td>
								<td title="Asus/华硕 X540 X540LJ4005 酷睿i3轻薄独显15.6寸手提笔记本电脑" style="text-align: left;">
									<a href="http://b2c.niuteam.cn/goods/goodsinfo.html?goodsid=48" target="_blank">Asus/华硕 X540 X540LJ4...</a>
								</td>
								<td>
									<span>
										9</span>
								</td>
							</tr>
							<tr>
								<td>
									<span>
										5</span>
								</td>
								<td title="测试-副本" style="text-align: left;">
									<a href="http://b2c.niuteam.cn/goods/goodsinfo.html?goodsid=107" target="_blank">测试-副本</a>
								</td>
								<td>
									<span>
										9</span>
								</td>
							</tr>
							<tr>
								<td>
									<span>
										6</span>
								</td>
								<td title="home指纹识别 苹果6s按键贴iphone7plus按键贴5s手机配件可爱卡通" style="text-align: left;">
									<a href="http://b2c.niuteam.cn/goods/goodsinfo.html?goodsid=54" target="_blank">home指纹识别 苹果6s按键贴ipho...</a>
								</td>
								<td>
									<span>
										8</span>
								</td>
							</tr>
						</tbody>
					</table>
				</div>
				<div class="charts">
					<h3>
						<i class="i-circular"></i>关注人数统计<span><i></i>关注人数</span>
					</h3>
					<div id="focusCharts" data-highcharts-chart="1">
						<div id="highcharts-nqgzkf8-2" class="highcharts-container " style="position: relative; overflow: hidden; width: 715px; height: 210px; text-align: left; line-height: normal; z-index: 0; -webkit-tap-highlight-color: rgba(0, 0, 0, 0);"><svg version="1.1" class="highcharts-root" style="font-family:&quot;Lucida Grande&quot;, &quot;Lucida Sans Unicode&quot;, Arial, Helvetica, sans-serif;font-size:12px;"
							 xmlns="http://www.w3.org/2000/svg" width="715" height="210"><desc>Created with Highcharts 5.0.6</desc>
								<defs>
									<clipPath id="highcharts-nqgzkf8-3">
										<rect x="0" y="0" width="674" height="113" fill="none"></rect>
									</clipPath>
									<clipPath id="highcharts-nqgzkf8-4">
										<rect x="-99" y="-46" width="783.3524826852612" height="210" fill="none"></rect>
									</clipPath>
									<clipPath id="highcharts-nqgzkf8-5">
										<rect x="0" y="0" width="684.3524826852612" height="149" fill="none"></rect>
									</clipPath>
								</defs>
								<rect fill="#ffffff" class="highcharts-background" x="0" y="0" width="715" height="210" rx="0" ry="0"></rect>
								<rect fill="none" class="highcharts-plot-background" x="31" y="46" width="674" height="113"></rect>
								<g class="highcharts-plot-lines-0">
									<path fill="none" stroke="#808080" stroke-width="1" visibility="visible" d="M 31 103.5 L 705 103.5"></path>
								</g>
								<g class="highcharts-grid highcharts-yaxis-grid ">
									<path fill="none" stroke="#e6e6e6" stroke-width="1" class="highcharts-grid-line" d="M 31 103.5 L 705 103.5" opacity="1"></path>
								</g>
								<rect fill="none" class="highcharts-plot-border" x="31" y="46" width="674" height="113"></rect>
								<g class="highcharts-grid highcharts-xaxis-grid ">
									<path fill="none" class="highcharts-grid-line" d="M 58.5 46 L 58.5 159" opacity="1"></path>
									<path fill="none" class="highcharts-grid-line" d="M 86.5 46 L 86.5 159" opacity="1"></path>
									<path fill="none" class="highcharts-grid-line" d="M 114.5 46 L 114.5 159" opacity="1"></path>
									<path fill="none" class="highcharts-grid-line" d="M 142.5 46 L 142.5 159" opacity="1"></path>
									<path fill="none" class="highcharts-grid-line" d="M 170.5 46 L 170.5 159" opacity="1"></path>
									<path fill="none" class="highcharts-grid-line" d="M 198.5 46 L 198.5 159" opacity="1"></path>
									<path fill="none" class="highcharts-grid-line" d="M 227.5 46 L 227.5 159" opacity="1"></path>
									<path fill="none" class="highcharts-grid-line" d="M 255.5 46 L 255.5 159" opacity="1"></path>
									<path fill="none" class="highcharts-grid-line" d="M 283.5 46 L 283.5 159" opacity="1"></path>
									<path fill="none" class="highcharts-grid-line" d="M 311.5 46 L 311.5 159" opacity="1"></path>
									<path fill="none" class="highcharts-grid-line" d="M 339.5 46 L 339.5 159" opacity="1"></path>
									<path fill="none" class="highcharts-grid-line" d="M 367.5 46 L 367.5 159" opacity="1"></path>
									<path fill="none" class="highcharts-grid-line" d="M 395.5 46 L 395.5 159" opacity="1"></path>
									<path fill="none" class="highcharts-grid-line" d="M 423.5 46 L 423.5 159" opacity="1"></path>
									<path fill="none" class="highcharts-grid-line" d="M 451.5 46 L 451.5 159" opacity="1"></path>
									<path fill="none" class="highcharts-grid-line" d="M 479.5 46 L 479.5 159" opacity="1"></path>
									<path fill="none" class="highcharts-grid-line" d="M 507.5 46 L 507.5 159" opacity="1"></path>
									<path fill="none" class="highcharts-grid-line" d="M 536.5 46 L 536.5 159" opacity="1"></path>
									<path fill="none" class="highcharts-grid-line" d="M 564.5 46 L 564.5 159" opacity="1"></path>
									<path fill="none" class="highcharts-grid-line" d="M 592.5 46 L 592.5 159" opacity="1"></path>
									<path fill="none" class="highcharts-grid-line" d="M 620.5 46 L 620.5 159" opacity="1"></path>
									<path fill="none" class="highcharts-grid-line" d="M 648.5 46 L 648.5 159" opacity="1"></path>
									<path fill="none" class="highcharts-grid-line" d="M 676.5 46 L 676.5 159" opacity="1"></path>
									<path fill="none" class="highcharts-grid-line" d="M 704.5 46 L 704.5 159" opacity="1"></path>
									<path fill="none" class="highcharts-grid-line" d="M 30.5 46 L 30.5 159" opacity="1"></path>
								</g>
								<g class="highcharts-axis highcharts-yaxis ">
									<path fill="none" class="highcharts-axis-line" d="M 31 46 L 31 159"></path>
								</g>
								<g class="highcharts-axis highcharts-xaxis ">
									<path fill="none" class="highcharts-tick" stroke="#ccd6eb" stroke-width="1" d="M 58.5 159 L 58.5 169" opacity="1"></path>
									<path fill="none" class="highcharts-tick" stroke="#ccd6eb" stroke-width="1" d="M 86.5 159 L 86.5 169" opacity="1"></path>
									<path fill="none" class="highcharts-tick" stroke="#ccd6eb" stroke-width="1" d="M 114.5 159 L 114.5 169" opacity="1"></path>
									<path fill="none" class="highcharts-tick" stroke="#ccd6eb" stroke-width="1" d="M 142.5 159 L 142.5 169" opacity="1"></path>
									<path fill="none" class="highcharts-tick" stroke="#ccd6eb" stroke-width="1" d="M 170.5 159 L 170.5 169" opacity="1"></path>
									<path fill="none" class="highcharts-tick" stroke="#ccd6eb" stroke-width="1" d="M 198.5 159 L 198.5 169" opacity="1"></path>
									<path fill="none" class="highcharts-tick" stroke="#ccd6eb" stroke-width="1" d="M 227.5 159 L 227.5 169" opacity="1"></path>
									<path fill="none" class="highcharts-tick" stroke="#ccd6eb" stroke-width="1" d="M 255.5 159 L 255.5 169" opacity="1"></path>
									<path fill="none" class="highcharts-tick" stroke="#ccd6eb" stroke-width="1" d="M 283.5 159 L 283.5 169" opacity="1"></path>
									<path fill="none" class="highcharts-tick" stroke="#ccd6eb" stroke-width="1" d="M 311.5 159 L 311.5 169" opacity="1"></path>
									<path fill="none" class="highcharts-tick" stroke="#ccd6eb" stroke-width="1" d="M 339.5 159 L 339.5 169" opacity="1"></path>
									<path fill="none" class="highcharts-tick" stroke="#ccd6eb" stroke-width="1" d="M 367.5 159 L 367.5 169" opacity="1"></path>
									<path fill="none" class="highcharts-tick" stroke="#ccd6eb" stroke-width="1" d="M 395.5 159 L 395.5 169" opacity="1"></path>
									<path fill="none" class="highcharts-tick" stroke="#ccd6eb" stroke-width="1" d="M 423.5 159 L 423.5 169" opacity="1"></path>
									<path fill="none" class="highcharts-tick" stroke="#ccd6eb" stroke-width="1" d="M 451.5 159 L 451.5 169" opacity="1"></path>
									<path fill="none" class="highcharts-tick" stroke="#ccd6eb" stroke-width="1" d="M 479.5 159 L 479.5 169" opacity="1"></path>
									<path fill="none" class="highcharts-tick" stroke="#ccd6eb" stroke-width="1" d="M 507.5 159 L 507.5 169" opacity="1"></path>
									<path fill="none" class="highcharts-tick" stroke="#ccd6eb" stroke-width="1" d="M 536.5 159 L 536.5 169" opacity="1"></path>
									<path fill="none" class="highcharts-tick" stroke="#ccd6eb" stroke-width="1" d="M 564.5 159 L 564.5 169" opacity="1"></path>
									<path fill="none" class="highcharts-tick" stroke="#ccd6eb" stroke-width="1" d="M 592.5 159 L 592.5 169" opacity="1"></path>
									<path fill="none" class="highcharts-tick" stroke="#ccd6eb" stroke-width="1" d="M 620.5 159 L 620.5 169" opacity="1"></path>
									<path fill="none" class="highcharts-tick" stroke="#ccd6eb" stroke-width="1" d="M 648.5 159 L 648.5 169" opacity="1"></path>
									<path fill="none" class="highcharts-tick" stroke="#ccd6eb" stroke-width="1" d="M 676.5 159 L 676.5 169" opacity="1"></path>
									<path fill="none" class="highcharts-tick" stroke="#ccd6eb" stroke-width="1" d="M 704.5 159 L 704.5 169" opacity="1"></path>
									<path fill="none" class="highcharts-tick" stroke="#ccd6eb" stroke-width="1" d="M 30.5 159 L 30.5 169" opacity="1"></path>
									<path fill="none" class="highcharts-axis-line" stroke="#ccd6eb" stroke-width="1" d="M 31 159.5 L 705 159.5"></path>
								</g>
								<g class="highcharts-series-group">
									<g class="highcharts-series highcharts-series-0 highcharts-line-series highcharts-color-0 " transform="translate(31,46) scale(1 1)"
									 clip-path="url(#highcharts-nqgzkf8-3)" width="113" height="674">
										<path fill="none" d="M 14.041666666667 56.5 L 42.125 56.5 L 70.208333333333 56.5 L 98.291666666667 56.5 L 126.375 56.5 L 154.45833333333 56.5 L 182.54166666667 56.5 L 210.625 56.5 L 238.70833333333 56.5 L 266.79166666667 56.5 L 294.875 56.5 L 322.95833333333 56.5 L 351.04166666667 56.5 L 379.125 56.5 L 407.20833333333 56.5 L 435.29166666667 56.5 L 463.375 56.5 L 491.45833333333 56.5 L 519.54166666667 56.5 L 547.625 56.5 L 575.70833333333 56.5 L 603.79166666667 56.5 L 631.875 56.5 L 659.95833333333 56.5"
										 class="highcharts-graph" stroke="#7cb5ec" stroke-width="2" stroke-linejoin="round" stroke-linecap="round"></path>
										<path fill="none" d="M 4.041666666667 56.5 L 14.041666666667 56.5 L 42.125 56.5 L 70.208333333333 56.5 L 98.291666666667 56.5 L 126.375 56.5 L 154.45833333333 56.5 L 182.54166666667 56.5 L 210.625 56.5 L 238.70833333333 56.5 L 266.79166666667 56.5 L 294.875 56.5 L 322.95833333333 56.5 L 351.04166666667 56.5 L 379.125 56.5 L 407.20833333333 56.5 L 435.29166666667 56.5 L 463.375 56.5 L 491.45833333333 56.5 L 519.54166666667 56.5 L 547.625 56.5 L 575.70833333333 56.5 L 603.79166666667 56.5 L 631.875 56.5 L 659.95833333333 56.5 L 669.95833333333 56.5"
										 stroke-linejoin="round" visibility="visible" stroke="rgba(192,192,192,0.0001)" stroke-width="22" class="highcharts-tracker"></path>
									</g>
									<g class="highcharts-markers highcharts-series-0 highcharts-line-series highcharts-color-0 highcharts-tracker" transform="translate(31,46) scale(1 1)"
									 clip-path="none" width="113" height="674">
										<path fill="#7cb5ec" d="M 659 53 C 664.328 53 664.328 61 659 61 C 653.672 61 653.672 53 659 53 Z" class="highcharts-point highcharts-color-0"></path>
										<path fill="#7cb5ec" d="M 631 53 C 636.328 53 636.328 61 631 61 C 625.672 61 625.672 53 631 53 Z" class="highcharts-point highcharts-color-0"></path>
										<path fill="#7cb5ec" d="M 603 53 C 608.328 53 608.328 61 603 61 C 597.672 61 597.672 53 603 53 Z" class="highcharts-point highcharts-color-0"></path>
										<path fill="#7cb5ec" d="M 575 53 C 580.328 53 580.328 61 575 61 C 569.672 61 569.672 53 575 53 Z" class="highcharts-point highcharts-color-0"></path>
										<path fill="#7cb5ec" d="M 547 53 C 552.328 53 552.328 61 547 61 C 541.672 61 541.672 53 547 53 Z" class="highcharts-point highcharts-color-0"></path>
										<path fill="#7cb5ec" d="M 519 53 C 524.328 53 524.328 61 519 61 C 513.672 61 513.672 53 519 53 Z" class="highcharts-point highcharts-color-0"></path>
										<path fill="#7cb5ec" d="M 491 53 C 496.328 53 496.328 61 491 61 C 485.672 61 485.672 53 491 53 Z" class="highcharts-point highcharts-color-0"></path>
										<path fill="#7cb5ec" d="M 463 53 C 468.328 53 468.328 61 463 61 C 457.672 61 457.672 53 463 53 Z" class="highcharts-point highcharts-color-0"></path>
										<path fill="#7cb5ec" d="M 435 53 C 440.328 53 440.328 61 435 61 C 429.672 61 429.672 53 435 53 Z" class="highcharts-point highcharts-color-0"></path>
										<path fill="#7cb5ec" d="M 407 53 C 412.328 53 412.328 61 407 61 C 401.672 61 401.672 53 407 53 Z" class="highcharts-point highcharts-color-0"></path>
										<path fill="#7cb5ec" d="M 379 53 C 384.328 53 384.328 61 379 61 C 373.672 61 373.672 53 379 53 Z" class="highcharts-point highcharts-color-0"></path>
										<path fill="#7cb5ec" d="M 351 53 C 356.328 53 356.328 61 351 61 C 345.672 61 345.672 53 351 53 Z" class="highcharts-point highcharts-color-0"></path>
										<path fill="#7cb5ec" d="M 322 53 C 327.328 53 327.328 61 322 61 C 316.672 61 316.672 53 322 53 Z" class="highcharts-point highcharts-color-0"></path>
										<path fill="#7cb5ec" d="M 294 53 C 299.328 53 299.328 61 294 61 C 288.672 61 288.672 53 294 53 Z" class="highcharts-point highcharts-color-0"></path>
										<path fill="#7cb5ec" d="M 266 53 C 271.328 53 271.328 61 266 61 C 260.672 61 260.672 53 266 53 Z" class="highcharts-point highcharts-color-0"></path>
										<path fill="#7cb5ec" d="M 238 53 C 243.328 53 243.328 61 238 61 C 232.672 61 232.672 53 238 53 Z" class="highcharts-point highcharts-color-0"></path>
										<path fill="#7cb5ec" d="M 210 53 C 215.328 53 215.328 61 210 61 C 204.672 61 204.672 53 210 53 Z" class="highcharts-point highcharts-color-0"></path>
										<path fill="#7cb5ec" d="M 182 53 C 187.328 53 187.328 61 182 61 C 176.672 61 176.672 53 182 53 Z" class="highcharts-point highcharts-color-0"></path>
										<path fill="#7cb5ec" d="M 154 53 C 159.328 53 159.328 61 154 61 C 148.672 61 148.672 53 154 53 Z" class="highcharts-point highcharts-color-0"></path>
										<path fill="#7cb5ec" d="M 126 53 C 131.328 53 131.328 61 126 61 C 120.672 61 120.672 53 126 53 Z" class="highcharts-point highcharts-color-0"></path>
										<path fill="#7cb5ec" d="M 98 53 C 103.328 53 103.328 61 98 61 C 92.672 61 92.672 53 98 53 Z" class="highcharts-point highcharts-color-0"></path>
										<path fill="#7cb5ec" d="M 70 53 C 75.328 53 75.328 61 70 61 C 64.672 61 64.672 53 70 53 Z" class="highcharts-point highcharts-color-0"></path>
										<path fill="#7cb5ec" d="M 42 53 C 47.328 53 47.328 61 42 61 C 36.672 61 36.672 53 42 53 Z" class="highcharts-point highcharts-color-0"></path>
										<path fill="#7cb5ec" d="M 14 53 C 19.328 53 19.328 61 14 61 C 8.672 61 8.672 53 14 53 Z" class="highcharts-point highcharts-color-0"></path>
									</g>
								</g>
								<g class="highcharts-button highcharts-contextbutton" style="cursor:pointer;" stroke-linecap="round" transform="translate(681,10)">
									<title>Chart context menu</title>
									<rect fill="#ffffff" class=" highcharts-button-box" x="0.5" y="0.5" width="24" height="22"
									 rx="2" ry="2" stroke="none" stroke-width="1"></rect>
									<path fill="#666666" d="M 6 6.5 L 20 6.5 M 6 11.5 L 20 11.5 M 6 16.5 L 20 16.5" class="highcharts-button-symbol"
									 stroke="#666666" stroke-width="3"></path><text x="0" style="font-weight:normal;color:#333333;fill:#333333;" y="12"></text></g>
								<g class="highcharts-axis-labels highcharts-yaxis-labels "><text x="16" style="color:#666666;cursor:default;font-size:11px;fill:#666666;width:226px;text-overflow:clip;" text-anchor="end"
									 transform="translate(0,0)" y="108" opacity="1"><tspan>0</tspan></text></g>
								<g class="highcharts-axis-labels highcharts-xaxis-labels "><text x="47.634391531017336" style="color:#666666;cursor:default;font-size:11px;fill:#666666;width:210px;text-overflow:ellipsis;"
									 text-anchor="end" transform="translate(0,0) rotate(-45 47.634391531017336 175)" y="175" opacity="1"><tspan>0:00</tspan></text><text
									 x="75.71772486435066" style="color:#666666;cursor:default;font-size:11px;fill:#666666;width:210px;text-overflow:ellipsis;"
									 text-anchor="end" transform="translate(0,0) rotate(-45 75.71772486435066 175)" y="175" opacity="1"><tspan>1:00</tspan></text><text
									 x="103.801058197684" style="color:#666666;cursor:default;font-size:11px;fill:#666666;width:210px;text-overflow:ellipsis;"
									 text-anchor="end" transform="translate(0,0) rotate(-45 103.801058197684 175)" y="175" opacity="1"><tspan>2:00</tspan></text><text
									 x="131.88439153101734" style="color:#666666;cursor:default;font-size:11px;fill:#666666;width:210px;text-overflow:ellipsis;"
									 text-anchor="end" transform="translate(0,0) rotate(-45 131.88439153101734 175)" y="175" opacity="1"><tspan>3:00</tspan></text><text
									 x="159.96772486435069" style="color:#666666;cursor:default;font-size:11px;fill:#666666;width:210px;text-overflow:ellipsis;"
									 text-anchor="end" transform="translate(0,0) rotate(-45 159.96772486435069 175)" y="175" opacity="1"><tspan>4:00</tspan></text><text
									 x="188.051058197684" style="color:#666666;cursor:default;font-size:11px;fill:#666666;width:210px;text-overflow:ellipsis;"
									 text-anchor="end" transform="translate(0,0) rotate(-45 188.051058197684 175)" y="175" opacity="1"><tspan>5:00</tspan></text><text
									 x="216.13439153101734" style="color:#666666;cursor:default;font-size:11px;fill:#666666;width:210px;text-overflow:ellipsis;"
									 text-anchor="end" transform="translate(0,0) rotate(-45 216.13439153101734 175)" y="175" opacity="1"><tspan>6:00</tspan></text><text
									 x="244.21772486435069" style="color:#666666;cursor:default;font-size:11px;fill:#666666;width:210px;text-overflow:ellipsis;"
									 text-anchor="end" transform="translate(0,0) rotate(-45 244.21772486435069 175)" y="175" opacity="1"><tspan>7:00</tspan></text><text
									 x="272.301058197684" style="color:#666666;cursor:default;font-size:11px;fill:#666666;width:210px;text-overflow:ellipsis;"
									 text-anchor="end" transform="translate(0,0) rotate(-45 272.301058197684 175)" y="175" opacity="1"><tspan>8:00</tspan></text><text
									 x="300.3843915310173" style="color:#666666;cursor:default;font-size:11px;fill:#666666;width:210px;text-overflow:ellipsis;"
									 text-anchor="end" transform="translate(0,0) rotate(-45 300.3843915310173 175)" y="175" opacity="1"><tspan>9:00</tspan></text><text
									 x="328.46772486435066" style="color:#666666;cursor:default;font-size:11px;fill:#666666;width:210px;text-overflow:ellipsis;"
									 text-anchor="end" transform="translate(0,0) rotate(-45 328.46772486435066 175)" y="175" opacity="1"><tspan>10:00</tspan></text><text
									 x="356.551058197684" style="color:#666666;cursor:default;font-size:11px;fill:#666666;width:210px;text-overflow:ellipsis;"
									 text-anchor="end" transform="translate(0,0) rotate(-45 356.551058197684 175)" y="175" opacity="1"><tspan>11:00</tspan></text><text
									 x="384.6343915310173" style="color:#666666;cursor:default;font-size:11px;fill:#666666;width:210px;text-overflow:ellipsis;"
									 text-anchor="end" transform="translate(0,0) rotate(-45 384.6343915310173 175)" y="175" opacity="1"><tspan>12:00</tspan></text><text
									 x="412.71772486435066" style="color:#666666;cursor:default;font-size:11px;fill:#666666;width:210px;text-overflow:ellipsis;"
									 text-anchor="end" transform="translate(0,0) rotate(-45 412.71772486435066 175)" y="175" opacity="1"><tspan>13:00</tspan></text><text
									 x="440.801058197684" style="color:#666666;cursor:default;font-size:11px;fill:#666666;width:210px;text-overflow:ellipsis;"
									 text-anchor="end" transform="translate(0,0) rotate(-45 440.801058197684 175)" y="175" opacity="1"><tspan>14:00</tspan></text><text
									 x="468.8843915310173" style="color:#666666;cursor:default;font-size:11px;fill:#666666;width:210px;text-overflow:ellipsis;"
									 text-anchor="end" transform="translate(0,0) rotate(-45 468.8843915310173 175)" y="175" opacity="1"><tspan>15:00</tspan></text><text
									 x="496.96772486435066" style="color:#666666;cursor:default;font-size:11px;fill:#666666;width:210px;text-overflow:ellipsis;"
									 text-anchor="end" transform="translate(0,0) rotate(-45 496.96772486435066 175)" y="175" opacity="1"><tspan>16:00</tspan></text><text
									 x="525.051058197684" style="color:#666666;cursor:default;font-size:11px;fill:#666666;width:210px;text-overflow:ellipsis;"
									 text-anchor="end" transform="translate(0,0) rotate(-45 525.051058197684 175)" y="175" opacity="1"><tspan>17:00</tspan></text><text
									 x="553.1343915310173" style="color:#666666;cursor:default;font-size:11px;fill:#666666;width:210px;text-overflow:ellipsis;"
									 text-anchor="end" transform="translate(0,0) rotate(-45 553.1343915310173 175)" y="175" opacity="1"><tspan>18:00</tspan></text><text
									 x="581.2177248643507" style="color:#666666;cursor:default;font-size:11px;fill:#666666;width:210px;text-overflow:ellipsis;"
									 text-anchor="end" transform="translate(0,0) rotate(-45 581.2177248643507 175)" y="175" opacity="1"><tspan>19:00</tspan></text><text
									 x="609.3010581976839" style="color:#666666;cursor:default;font-size:11px;fill:#666666;width:210px;text-overflow:ellipsis;"
									 text-anchor="end" transform="translate(0,0) rotate(-45 609.3010581976839 175)" y="175" opacity="1"><tspan>20:00</tspan></text><text
									 x="637.3843915310173" style="color:#666666;cursor:default;font-size:11px;fill:#666666;width:210px;text-overflow:ellipsis;"
									 text-anchor="end" transform="translate(0,0) rotate(-45 637.3843915310173 175)" y="175" opacity="1"><tspan>21:00</tspan></text><text
									 x="665.4677248643507" style="color:#666666;cursor:default;font-size:11px;fill:#666666;width:210px;text-overflow:ellipsis;"
									 text-anchor="end" transform="translate(0,0) rotate(-45 665.4677248643507 175)" y="175" opacity="1"><tspan>22:00</tspan></text><text
									 x="693.5510581976839" style="color:#666666;cursor:default;font-size:11px;fill:#666666;width:210px;text-overflow:ellipsis;"
									 text-anchor="end" transform="translate(0,0) rotate(-45 693.5510581976839 175)" y="175" opacity="1"><tspan>23:00</tspan></text></g></svg><span
							 style="font-family: &quot;Lucida Grande&quot;, &quot;Lucida Sans Unicode&quot;, Arial, Helvetica, sans-serif; font-size: 18px; position: absolute; white-space: nowrap; margin-left: 0px; margin-top: 0px; left: 10px; top: 7px; color: rgb(51, 51, 51);"
							 class="highcharts-title" transform="translate(0,0)"><span class="charts-title fans" onclick="onloadWeiXinFansChart(1)">今日</span><span
								 class="charts-title fans black" onclick="onloadWeiXinFansChart(2)">昨日</span><span class="charts-title fans black"
								 onclick="onloadWeiXinFansChart(3)">本周</span><span class="charts-title fans black" onclick="onloadWeiXinFansChart(4)">本月</span></span></div>
					</div>
				</div>
				<div class="system-config">
					<h3>
						<i class="fa fa-cog"></i>系统信息
					</h3>
					<table>
						<colgroup>
							<col width="15%">
							<col width="40%">
							<col width="15%">
							<col width="30%">
						</colgroup>
						<tbody>
							<tr>
								<td>服务器操作系统</td>
								<td>Linux iZ8vbe7yd3ei8sbwd7hq6mZ 3.10.0-514.10.2.el7.x86_64 #1 SMP Fri Mar 3 00:04:05 UTC 2017 x86_64</td>
								<td>服务器域名</td>
								<td>b2c.niuteam.cn:80</td>
							</tr>
							<tr>
								<td>服务器环境</td>
								<td>nginx/1.10.2</td>
								<td>PHP版本</td>
								<td>5.6.22</td>
							</tr>
							<tr>
								<td>文件上传限制</td>
								<td>50M</td>
								<td>GD版本</td>
								<td>bundled (2.1.0 compatible)</td>
							</tr>
							<tr>
								<td>sockets开启</td>
								<td>已开启</td>
								<td>curl支持</td>
								<td>支持</td>
							</tr>
							<tr>
								<td>openssl开启</td>
								<td>已开启</td>
								<td>upload目录权限</td>
								<td>可读可写</td>
							</tr>
							<tr>
								<td>runtime目录权限</td>
								<td>可读可写</td>
								<td></td>
								<td></td>
							</tr>
						</tbody>
					</table>
				</div>
		
				<div class="page" id="turn-ul" style="display: none;">
					<div class="pagination">
						<ul>
							<li class="according-number">每页显示<input type="text" class="input-medium" id="showNumber" value="14" data-default="14"
								 autocomplete="off">条</li>
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

	</div>
</template>

<script>
require("@/assets/style/index.scss");

// @ is an alias to /src
import Aside from "@/components/Aside.vue";

export default {
  name: "index",
  data: function() {
    return {
      menuList: [
        {
          selected: true,
          path: "/index.html",
          name: "欢迎页"
        },
        {
          path: "/goods/add.html",
          name: "商品发布"
        },
        {
          path: "/goods/list.html",
          name: "商品列表"
        },
        {
          path: "/order/list.html",
          name: "订单列表"
        },
        {
          path: "/goods/comment.html",
          name: "商品评价"
        }
      ]
    };
  },
  components: {
    Aside
  }
};
</script>


<style lang="scss" scoped>
.ns-base-section {
  background: #f2f6fc;
}
</style>
