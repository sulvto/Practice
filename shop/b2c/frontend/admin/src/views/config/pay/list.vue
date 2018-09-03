<template>
    <section class="ns-base-section">
		
		
		
		<div style="position:relative;margin:0;">
			<!-- 面包屑导航 -->
						<div class="breadcrumb-nav">
				<a href="index.html">零基础学IT就来</a>
									<i class="fa fa-angle-right"></i>
					<a href="/config/webconfig.html">设置</a>
									<i class="fa fa-angle-right"></i>
					<!-- 需要加跳转链接用这个：http://showfx.niuteam.cn/admin/config/paymentconfig -->
					<a href="javascript:;" style="color:#999;">支付配置</a>
							</div>
						<!-- 三级导航菜单 -->
			
								<nav class="ns-third-menu">
					<ul>
												<li onclick="location.href='/config/shopset.html';">购物设置</li>
													<li class="selected" onclick="location.href='/config/paymentconfig.html';">支付配置</li>
													<li onclick="location.href='/config/memberwithdrawsetting.html';">提现设置</li>
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
									<p>支付配置</p>
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
<!-- 						<span>支付配置</span> -->
<!-- 						 -->
<!-- 					{1/block} -->
				</h4>
			</div>
		</div>
		
		
		<div class="ns-main">
			
<table class="table-class">
	<colgroup>
		<col width="83%">
		<col width="7%">
		<col width="10%">
	</colgroup>
	<thead>
		<tr class="table-title" style="background: white;z-index: 10;border: 1px solid #E3E3E3;">
			<th class="tal">支付方式</th>
			<th style="text-align: center;">状态</th>
			<th style="text-align: center;">操作</th>
		</tr>
	<!--<thead-->
	</thead><tbody>
				<tr>
			<td>
				<div class="table-logo"><img src="/public/admin/images/pay.png"></div>
				<span class="table-pay">支付宝支付</span><br>
				<span class="table-desc">该系统支持即时到账接口</span> 
			</td>
						<td style="text-align: center;line-height:59px;"><a href="javascript:;" class="pay-start" status="1" onclick="set_status('ALIPAY', this)"><img src="/public/admin/images/checked.png" alt="" width="18"></a></td>
						<td style="text-align: center;line-height:59px;">
							<a href="/config/payaliconfig.html">配置</a>
						</td>
		</tr>
				<tr>
			<td>
				<div class="table-logo"><img src="/public/admin/images/wchat.png"></div>
				<span class="table-pay">微信支付</span><br>
				<span class="table-desc">该系统支持微信网页支付和扫码支付</span> 
			</td>
						<td style="text-align: center;line-height:59px;"><a href="javascript:;" class="pay-start" status="1" onclick="set_status('WPAY', this)"><img src="/public/admin/images/checked.png" alt="" width="18"></a></td>
						<td style="text-align: center;line-height:59px;">
							<a href="/config/payconfig.html?type=wchat">配置</a>
						</td>
		</tr>
				<tr>
			<td>
				<div class="table-logo"><img src="/public/admin/images/unionpay.png"></div>
				<span class="table-pay">银联卡支付</span><br>
				<span class="table-desc">该系统支持即时到账接口</span> 
			</td>
						<td style="text-align: center;line-height:59px;"><a href="javascript:;" class="pay-start" status="1" onclick="set_status('UNIONPAY', this)"><img src="/public/admin/images/checked.png" alt="" width="18"></a></td>
						<td style="text-align: center;line-height:59px;">
							<a href="/config/unionpayconfig.html">配置</a>
						</td>
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
