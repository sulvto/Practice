<template>
	
	<section class="ns-base-section">
		
		
		
		<div style="position:relative;margin:0;">
			<!-- 面包屑导航 -->
						<div class="breadcrumb-nav">
				<a href="index.html">大鵬系統</a>
									<i class="fa fa-angle-right"></i>
					<a href="/config/webconfig.html">设置</a>
									<i class="fa fa-angle-right"></i>
					<!-- 需要加跳转链接用这个：http://showfx.niuteam.cn/admin/config/shopset -->
					<a href="javascript:;" style="color:#999;">购物设置</a>
							</div>
						<!-- 三级导航菜单 -->
			
								<nav class="ns-third-menu">
					<ul>
												<li class="selected" onclick="location.href='/config/shopset.html';">购物设置</li>
													<li onclick="location.href='/config/paymentconfig.html';">支付配置</li>
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
									<p>购物设置</p>
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
<!-- 						<span>购物设置</span> -->
<!-- 						 -->
<!-- 					{1/block} -->
				</h4>
			</div>
		</div>
		
		
		<div class="ns-main">
			
<div class="set-style">
	<!-- 模块一 -->
	<h4>基础设置</h4>
	<dl>
		<dt>自动收货时间：</dt>
		<dd>
			<input id="order_auto_delinery" type="number" min="0.00" step="1.00" onkeyup="value=value.replace(/[^\d+(\.\d+)?]/g,'')" value="14" class="input-common harf"><em class="unit">天</em>
			<p class="hint">订单多长时间后自动收货，单位为/天(注：若为0，则订单不会自动收货)</p>
		</dd>
	</dl>
	<dl>
		<dt>订单自动关闭时间：</dt>
		<dd>
			<input id="order_buy_close_time" type="number" min="0.00" step="1.00" onkeyup="value=value.replace(/[^\d+(\.\d+)?]/g,'')" value="60" class="input-common harf"><em class="unit">分钟</em>
			<p class="hint">订单开始后多长时间未付款自动关闭，单位为/分钟(注：不填写或0订单将不会自动关闭)</p>
		</dd>
	</dl>
	<dl>
		<dt>是否开启余额支付：</dt>
		<dd>
			<div class="controls">
				<p>
					<input id="order_balance_pay" type="checkbox" class="checkbox" checked="" simpleswitch="0" result="true" style="display: none;"><div class="Switch Switch_FlatRadius On" id="Switch0"><span class="switch-open">是</span><span class="switch-close">否</span></div>
				</p>
			</div>
			<p class="hint">是否启用余额支付功能</p>
		</dd>
	</dl>
	<dl>
		<dt>是否开启货到付款：</dt>
		<dd>
			<div class="controls">
				<p>
					<input id="order_delivery_pay" type="checkbox" class="checkbox" checked="" simpleswitch="1" result="true" style="display: none;"><div class="Switch Switch_FlatRadius On" id="Switch1"><span class="switch-open">是</span><span class="switch-close">否</span></div>
				</p>
			</div>
			<p class="hint">是否开启货到付款功能</p>
		</dd>
	</dl>
	<dl>
		<dt>订单完成时间：</dt>
		<dd>
			<p style="height: 30px;">
				<div class="selectric-wrapper selectric-select-common" style="width: 250px;"><div class="selectric-hide-select"><select id="order_delivery_complete_time" class="select-common" tabindex="-1">
					<option value="0" selected="">立即</option>
					<option value="1">1天</option>
					<option value="2">2天</option>
					<option value="3">3天</option>
					<option value="4">4天</option>
					<option value="5">5天</option>
					<option value="6">6天</option>
					<option value="7">7天</option>
				</select></div><div class="selectric"><span class="selectric-label">立即</span><button class="selectric-button">▾</button></div><div class="selectric-items" tabindex="-1"><div class="selectric-scroll"><ul><li data-index="0" class="selected" title="立即">立即</li><li data-index="1" class="" title="1天">1天</li><li data-index="2" class="" title="2天">2天</li><li data-index="3" class="" title="3天">3天</li><li data-index="4" class="" title="4天">4天</li><li data-index="5" class="" title="5天">5天</li><li data-index="6" class="" title="6天">6天</li><li data-index="7" class="last" title="7天">7天</li></ul></div></div><input class="selectric-input" tabindex="0"></div>
			</p>
			<input type="hidden" id="closeday" value="0">
			<p class="hint">收货后，多少时间订单自动完成，单位为/天</p>
		</dd>
	</dl>
	<dl>
		<dt>购物返积分设置：</dt>
		<dd>
			<p style="height: 30px;">
				<div class="selectric-wrapper selectric-select-common" style="width: 250px;"><div class="selectric-hide-select"><select id="shopping_back_points" class="select-common" tabindex="-1">
					<option value="1">订单已完成</option>
					<option value="2">已收货</option>
					<option value="3" selected="">支付完成</option>
				</select></div><div class="selectric"><span class="selectric-label">支付完成</span><button class="selectric-button">▾</button></div><div class="selectric-items" tabindex="-1"><div class="selectric-scroll"><ul><li data-index="0" class="" title="订单已完成">订单已完成</li><li data-index="1" class="" title="已收货">已收货</li><li data-index="2" class="last selected" title="支付完成">支付完成</li></ul></div></div><input class="selectric-input" tabindex="0"></div>
			</p>
			<p class="hint">在什么时间将购物返积分添加到会员账户</p>
		</dd>
	</dl>	
	<dl>
		<dt>是否显示购买记录：</dt>
		<dd>
			<div class="controls">
				<p>
					<input id="order_show_buy_record" type="checkbox" class="checkbox" checked="" simpleswitch="2" result="true" style="display: none;"><div class="Switch Switch_FlatRadius On" id="Switch2"><span class="switch-open">是</span><span class="switch-close">否</span></div>
				</p>
			</div>
			<p class="hint">是否显示购买记录</p>
		</dd>
	</dl>
	<dl>
		<dt>是否开启虚拟商品：</dt>
		<dd>
			<div class="controls">
				<p>
					<input id="is_open_virtual_goods" type="checkbox" class="checkbox" checked="" simpleswitch="3" result="true" style="display: none;"><div class="Switch Switch_FlatRadius On" id="Switch3"><span class="switch-open">是</span><span class="switch-close">否</span></div>
				</p>
			</div>
			<p class="hint">是否开启虚拟商品</p>
		</dd>
	</dl>
	<dl>
		<dt>系统默认评价设置：</dt>
		<dd>
			<div class="controls">
				<input type="number" class="input-common harf" value="" id="evaluate_day" min="0"><em class="unit">天</em>
			</div>
			<p class="hint">订单完成达到设置天数后，用户仍未进行评价，则系统进行默认评价</p>
		</dd>
	</dl>
	<dl>
		<dt>默认评价语：</dt>
		<dd>
			<div class="controls">
				<textarea class="textarea-common" id="evaluate"></textarea>
			</div>
		</dd>
	</dl>
	<!-- 模块二 -->
	<h4>配送设置</h4>
	<dl>
		<dt>是否开启买家自提：</dt>
		<dd>
			<div class="controls">
				<p>
					<input id="buyer_self_lifting" type="checkbox" class="checkbox" checked="" simpleswitch="4" result="true" style="display: none;"><div class="Switch Switch_FlatRadius On" id="Switch4"><span class="switch-open">是</span><span class="switch-close">否</span></div>
				</p>
			</div>
			<p class="hint">是否启用买家自提</p>
		</dd>
	</dl>
	
	<dl>
		<dt>是否开启商家配送：</dt>
		<dd>
			<div class="controls">
				<p>
					<input id="seller_dispatching" type="checkbox" class="checkbox" checked="" simpleswitch="5" result="true" style="display: none;"><div class="Switch Switch_FlatRadius On" id="Switch5"><span class="switch-open">是</span><span class="switch-close">否</span></div>
				</p>
			</div>
			<p class="hint">是否启用商家配送</p>
		</dd>
	</dl>
	
		<dl>
		<dt>是否开启本地配送：</dt>
		<dd>
			<div class="controls">
				<p>
					<input id="is_open_o2o" type="checkbox" class="checkbox" checked="" simpleswitch="6" result="true" style="display: none;"><div class="Switch Switch_FlatRadius On" id="Switch6"><span class="switch-open">是</span><span class="switch-close">否</span></div>
				</p>
			</div>
			<p class="hint">是否开启本地配送</p>
		</dd>
	</dl>	
		
	<dl>
		<dt>是否允许选择物流：</dt>
		<dd>
			<div class="controls">
				<p>
					<input id="is_logistics" type="checkbox" class="checkbox" checked="" simpleswitch="7" result="true" style="display: none;"><div class="Switch Switch_FlatRadius On" id="Switch7"><span class="switch-open">是</span><span class="switch-close">否</span></div>
				</p>
			</div>
			<p class="hint">是否允许用户选择物流</p>
		</dd>
	</dl>
	
	<dl>
		<dt>开启指定配送时间：</dt>
		<dd>
			<div class="controls">
				<p>
					<input id="order_designated_delivery_time" type="checkbox" class="checkbox" simpleswitch="8" result="false" style="display: none;"><div class="Switch Switch_FlatRadius" id="Switch8"><span class="switch-open">是</span><span class="switch-close">否</span></div>
				</p>
			</div>
			<p class="hint">是否开启指定配送时间</p>
		</dd>
	</dl>

	<dl>
		<dt>设定配送时间段：</dt>
		<dd>
			<div class="time-slot">
							</div>
			<div class="controls">
				<p>
					<div class="selectric-wrapper selectric-select-common selectric-short selectric-start" style="width: 50px;"><div class="selectric-hide-select"><select class="select-common short start" tabindex="-1">
						<option value="00">00</option>
						<option value="01">01</option>
						<option value="02">02</option>
						<option value="03">03</option>
						<option value="04">04</option>
						<option value="05">05</option>
						<option value="06">06</option>
						<option value="07">07</option>
						<option value="08">08</option>
						<option value="09">09</option>
						<option value="10">10</option>
						<option value="11">11</option>
						<option value="12">12</option>
						<option value="13">13</option>
						<option value="14">14</option>
						<option value="15">15</option>
						<option value="16">16</option>
						<option value="17">17</option>
						<option value="18">18</option>
						<option value="19">19</option>
						<option value="20">20</option>
						<option value="21">21</option>
						<option value="22">22</option>
						<option value="23">23</option>
					</select></div><div class="selectric"><span class="selectric-label">00</span><button class="selectric-button">▾</button></div><div class="selectric-items" tabindex="-1"><div class="selectric-scroll"><ul><li data-index="0" class="selected" title="00">00</li><li data-index="1" class="" title="01">01</li><li data-index="2" class="" title="02">02</li><li data-index="3" class="" title="03">03</li><li data-index="4" class="" title="04">04</li><li data-index="5" class="" title="05">05</li><li data-index="6" class="" title="06">06</li><li data-index="7" class="" title="07">07</li><li data-index="8" class="" title="08">08</li><li data-index="9" class="" title="09">09</li><li data-index="10" class="" title="10">10</li><li data-index="11" class="" title="11">11</li><li data-index="12" class="" title="12">12</li><li data-index="13" class="" title="13">13</li><li data-index="14" class="" title="14">14</li><li data-index="15" class="" title="15">15</li><li data-index="16" class="" title="16">16</li><li data-index="17" class="" title="17">17</li><li data-index="18" class="" title="18">18</li><li data-index="19" class="" title="19">19</li><li data-index="20" class="" title="20">20</li><li data-index="21" class="" title="21">21</li><li data-index="22" class="" title="22">22</li><li data-index="23" class="last" title="23">23</li></ul></div></div><input class="selectric-input" tabindex="0"></div>
					<em class="unit time-unit">：00</em>
					<span>-</span>
					<div class="selectric-wrapper selectric-select-common selectric-short selectric-end" style="width: 50px;"><div class="selectric-hide-select"><select class="select-common short end" tabindex="-1">
						<option value="00">00</option>
						<option value="01">01</option>
						<option value="02">02</option>
						<option value="03">03</option>
						<option value="04">04</option>
						<option value="05">05</option>
						<option value="06">06</option>
						<option value="07">07</option>
						<option value="08">08</option>
						<option value="09">09</option>
						<option value="10">10</option>
						<option value="11">11</option>
						<option value="12">12</option>
						<option value="13">13</option>
						<option value="14">14</option>
						<option value="15">15</option>
						<option value="16">16</option>
						<option value="17">17</option>
						<option value="18">18</option>
						<option value="19">19</option>
						<option value="20">20</option>
						<option value="21">21</option>
						<option value="22">22</option>
						<option value="23">23</option>
					</select></div><div class="selectric"><span class="selectric-label">00</span><button class="selectric-button">▾</button></div><div class="selectric-items" tabindex="-1"><div class="selectric-scroll"><ul><li data-index="0" class="selected" title="00">00</li><li data-index="1" class="" title="01">01</li><li data-index="2" class="" title="02">02</li><li data-index="3" class="" title="03">03</li><li data-index="4" class="" title="04">04</li><li data-index="5" class="" title="05">05</li><li data-index="6" class="" title="06">06</li><li data-index="7" class="" title="07">07</li><li data-index="8" class="" title="08">08</li><li data-index="9" class="" title="09">09</li><li data-index="10" class="" title="10">10</li><li data-index="11" class="" title="11">11</li><li data-index="12" class="" title="12">12</li><li data-index="13" class="" title="13">13</li><li data-index="14" class="" title="14">14</li><li data-index="15" class="" title="15">15</li><li data-index="16" class="" title="16">16</li><li data-index="17" class="" title="17">17</li><li data-index="18" class="" title="18">18</li><li data-index="19" class="" title="19">19</li><li data-index="20" class="" title="20">20</li><li data-index="21" class="" title="21">21</li><li data-index="22" class="" title="22">22</li><li data-index="23" class="last" title="23">23</li></ul></div></div><input class="selectric-input" tabindex="0"></div>
					<em class="unit time-unit">：00</em>
					<button class="btn-common" style="top: -2px;position: relative;" onclick="addTimeSlot(this);">添加</button>
				</p>
			</div>
			<p class="hint">商家设定配送时间段</p>
		</dd>
	</dl>
	
	<!-- 模块三 -->
	<h4>发票设置</h4>
	<dl>
		<dt>发票税率：</dt>
		<dd>
			<input id="order_invoice_tax" type="number" min="0.00" step="0.01" value="10" class="input-common harf"><em class="unit">%</em>
			<p class="hint">设置开发票的税率，单位为%</p>
		</dd>
	</dl>
	<dl>
		<dt>发票内容：</dt>
		<dd>
			<textarea rows="2" id="order_invoice_content" class="textarea-common" maxlength="50">办公用品</textarea>
			<p class="hint">客户要求开发票时可以选择的内容，逗号分格代表一个选项，例如：办公用品,明细</p>
		</dd>
	</dl>
	<dl>
		<dt></dt>
		<dd><button class="btn-common btn-big" onclick="setConfigAjax();">保存</button></dd>
	</dl>
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
