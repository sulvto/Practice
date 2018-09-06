<template>
    <section class="ns-base-section">
		
		
		
		<div style="position:relative;margin:0;">
			<!-- 面包屑导航 -->
						<div class="breadcrumb-nav">
				<a href="index.html">零基础学IT就来</a>
									<i class="fa fa-angle-right"></i>
					<a href="/config/webconfig.html">设置</a>
									<i class="fa fa-angle-right"></i>
					<!-- 需要加跳转链接用这个：http://showfx.niuteam.cn/admin/distribution/distributionConfig -->
					<a href="javascript:;" style="color:#999;">配送费用</a>
							</div>
						<!-- 三级导航菜单 -->
			
								<nav class="ns-third-menu">
					<ul>
												<li onclick="location.href='/express/expresscompany.html';">物流配送</li>
													<li onclick="location.href='/shop/pickuppointlist.html';">门店自提</li>
													<li class="selected" onclick="location.href='/distribution/distributionuserlist.html';">本地配送</li>
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
<!-- 					{1/block} -->
				</h4>
			</div>
		</div>
		
		
		<div class="ns-main">
			
<div class="space-10"></div>
<div class="ncsc-form-goods">
<nav class="goods-nav">
		<ul>
									<li><a href="/distribution/distributionuserlist.html" child_id="1">配送人员</a></li>
										<li class="selected"><a href="/distribution/distributionConfig.html" child_id="2">配送费用</a></li>
											<li><a href="/distribution/distributionareamanagement.html" child_id="3">配送地区</a></li>
							
		</ul>
</nav>
	<!-- 基础设置 -->
	<div class="block-basic-setting">
		
		<h4>本地配送管理</h4>
		<div class="set-style">
			<dl>
				<dt><span class="required">*</span>起送消费金额：</dt>
				<dd>
					<p>
						<input id="order_money" name="order_money" type="text" class="input-common harf" value="30.00"><em class="unit top">元</em>
					</p>
					<p class="error">请输入起送消费金额</p>
				</dd>
			</dl>
			<dl>
				<dt><span class="required">*</span>起送配送费用：</dt>
				<dd>
					<p><input id="freight" name="freight" type="text" class="input-common harf" value="5.00"><em class="unit top">元</em></p>
					<p class="error">请输入起送配送费用</p>
				</dd>
				<input type="hidden" id="is_start" name="is_start" value="1"> 
			</dl>
			<dl>
				<dt><span class="required">*</span>配送时间：</dt>
				<dd class="time-config">
					<p>
						<span>上午：</span>
						<div class="selectric-wrapper selectric-select-common selectric-harf" style="width: 125px;"><div class="selectric-hide-select"><select class="select-common harf" id="morning_start" tabindex="-1"><option value="">请选择</option><option>00&nbsp;:&nbsp;00</option><option>00&nbsp;:&nbsp;30</option><option>01&nbsp;:&nbsp;00</option><option>01&nbsp;:&nbsp;30</option><option>02&nbsp;:&nbsp;00</option><option>02&nbsp;:&nbsp;30</option><option>03&nbsp;:&nbsp;00</option><option>03&nbsp;:&nbsp;30</option><option>04&nbsp;:&nbsp;00</option><option>04&nbsp;:&nbsp;30</option><option>05&nbsp;:&nbsp;00</option><option>05&nbsp;:&nbsp;30</option><option>07&nbsp;:&nbsp;00</option><option>07&nbsp;:&nbsp;30</option><option>08&nbsp;:&nbsp;00</option><option>08&nbsp;:&nbsp;30</option><option>09&nbsp;:&nbsp;00</option><option>09&nbsp;:&nbsp;30</option><option>10&nbsp;:&nbsp;00</option><option>10&nbsp;:&nbsp;30</option><option>11&nbsp;:&nbsp;00</option><option>11&nbsp;:&nbsp;30</option><option>12&nbsp;:&nbsp;00</option></select></div><div class="selectric"><span class="selectric-label">请选择</span><button class="selectric-button">▾</button></div><div class="selectric-items" tabindex="-1"><div class="selectric-scroll"><ul><li data-index="0" class="selected" title="请选择">请选择</li><li data-index="1" class="" title="00&nbsp;:&nbsp;00">00&nbsp;:&nbsp;00</li><li data-index="2" class="" title="00&nbsp;:&nbsp;30">00&nbsp;:&nbsp;30</li><li data-index="3" class="" title="01&nbsp;:&nbsp;00">01&nbsp;:&nbsp;00</li><li data-index="4" class="" title="01&nbsp;:&nbsp;30">01&nbsp;:&nbsp;30</li><li data-index="5" class="" title="02&nbsp;:&nbsp;00">02&nbsp;:&nbsp;00</li><li data-index="6" class="" title="02&nbsp;:&nbsp;30">02&nbsp;:&nbsp;30</li><li data-index="7" class="" title="03&nbsp;:&nbsp;00">03&nbsp;:&nbsp;00</li><li data-index="8" class="" title="03&nbsp;:&nbsp;30">03&nbsp;:&nbsp;30</li><li data-index="9" class="" title="04&nbsp;:&nbsp;00">04&nbsp;:&nbsp;00</li><li data-index="10" class="" title="04&nbsp;:&nbsp;30">04&nbsp;:&nbsp;30</li><li data-index="11" class="" title="05&nbsp;:&nbsp;00">05&nbsp;:&nbsp;00</li><li data-index="12" class="" title="05&nbsp;:&nbsp;30">05&nbsp;:&nbsp;30</li><li data-index="13" class="" title="07&nbsp;:&nbsp;00">07&nbsp;:&nbsp;00</li><li data-index="14" class="" title="07&nbsp;:&nbsp;30">07&nbsp;:&nbsp;30</li><li data-index="15" class="" title="08&nbsp;:&nbsp;00">08&nbsp;:&nbsp;00</li><li data-index="16" class="" title="08&nbsp;:&nbsp;30">08&nbsp;:&nbsp;30</li><li data-index="17" class="" title="09&nbsp;:&nbsp;00">09&nbsp;:&nbsp;00</li><li data-index="18" class="" title="09&nbsp;:&nbsp;30">09&nbsp;:&nbsp;30</li><li data-index="19" class="" title="10&nbsp;:&nbsp;00">10&nbsp;:&nbsp;00</li><li data-index="20" class="" title="10&nbsp;:&nbsp;30">10&nbsp;:&nbsp;30</li><li data-index="21" class="" title="11&nbsp;:&nbsp;00">11&nbsp;:&nbsp;00</li><li data-index="22" class="" title="11&nbsp;:&nbsp;30">11&nbsp;:&nbsp;30</li><li data-index="23" class="last" title="12&nbsp;:&nbsp;00">12&nbsp;:&nbsp;00</li></ul></div></div><input class="selectric-input" tabindex="0"></div>
						<span>&nbsp;至&nbsp;</span>
						<div class="selectric-wrapper selectric-select-common selectric-harf" style="width: 125px;"><div class="selectric-hide-select"><select class="select-common harf" id="morning_end" tabindex="-1"><option value="">请选择</option><option>00&nbsp;:&nbsp;00</option><option>00&nbsp;:&nbsp;30</option><option>01&nbsp;:&nbsp;00</option><option>01&nbsp;:&nbsp;30</option><option>02&nbsp;:&nbsp;00</option><option>02&nbsp;:&nbsp;30</option><option>03&nbsp;:&nbsp;00</option><option>03&nbsp;:&nbsp;30</option><option>04&nbsp;:&nbsp;00</option><option>04&nbsp;:&nbsp;30</option><option>05&nbsp;:&nbsp;00</option><option>05&nbsp;:&nbsp;30</option><option>07&nbsp;:&nbsp;00</option><option>07&nbsp;:&nbsp;30</option><option>08&nbsp;:&nbsp;00</option><option>08&nbsp;:&nbsp;30</option><option>09&nbsp;:&nbsp;00</option><option>09&nbsp;:&nbsp;30</option><option>10&nbsp;:&nbsp;00</option><option>10&nbsp;:&nbsp;30</option><option>11&nbsp;:&nbsp;00</option><option>11&nbsp;:&nbsp;30</option><option>12&nbsp;:&nbsp;00</option></select></div><div class="selectric"><span class="selectric-label">请选择</span><button class="selectric-button">▾</button></div><div class="selectric-items" tabindex="-1"><div class="selectric-scroll"><ul><li data-index="0" class="selected" title="请选择">请选择</li><li data-index="1" class="" title="00&nbsp;:&nbsp;00">00&nbsp;:&nbsp;00</li><li data-index="2" class="" title="00&nbsp;:&nbsp;30">00&nbsp;:&nbsp;30</li><li data-index="3" class="" title="01&nbsp;:&nbsp;00">01&nbsp;:&nbsp;00</li><li data-index="4" class="" title="01&nbsp;:&nbsp;30">01&nbsp;:&nbsp;30</li><li data-index="5" class="" title="02&nbsp;:&nbsp;00">02&nbsp;:&nbsp;00</li><li data-index="6" class="" title="02&nbsp;:&nbsp;30">02&nbsp;:&nbsp;30</li><li data-index="7" class="" title="03&nbsp;:&nbsp;00">03&nbsp;:&nbsp;00</li><li data-index="8" class="" title="03&nbsp;:&nbsp;30">03&nbsp;:&nbsp;30</li><li data-index="9" class="" title="04&nbsp;:&nbsp;00">04&nbsp;:&nbsp;00</li><li data-index="10" class="" title="04&nbsp;:&nbsp;30">04&nbsp;:&nbsp;30</li><li data-index="11" class="" title="05&nbsp;:&nbsp;00">05&nbsp;:&nbsp;00</li><li data-index="12" class="" title="05&nbsp;:&nbsp;30">05&nbsp;:&nbsp;30</li><li data-index="13" class="" title="07&nbsp;:&nbsp;00">07&nbsp;:&nbsp;00</li><li data-index="14" class="" title="07&nbsp;:&nbsp;30">07&nbsp;:&nbsp;30</li><li data-index="15" class="" title="08&nbsp;:&nbsp;00">08&nbsp;:&nbsp;00</li><li data-index="16" class="" title="08&nbsp;:&nbsp;30">08&nbsp;:&nbsp;30</li><li data-index="17" class="" title="09&nbsp;:&nbsp;00">09&nbsp;:&nbsp;00</li><li data-index="18" class="" title="09&nbsp;:&nbsp;30">09&nbsp;:&nbsp;30</li><li data-index="19" class="" title="10&nbsp;:&nbsp;00">10&nbsp;:&nbsp;00</li><li data-index="20" class="" title="10&nbsp;:&nbsp;30">10&nbsp;:&nbsp;30</li><li data-index="21" class="" title="11&nbsp;:&nbsp;00">11&nbsp;:&nbsp;00</li><li data-index="22" class="" title="11&nbsp;:&nbsp;30">11&nbsp;:&nbsp;30</li><li data-index="23" class="last" title="12&nbsp;:&nbsp;00">12&nbsp;:&nbsp;00</li></ul></div></div><input class="selectric-input" tabindex="0"></div>
					</p>
				</dd>
			</dl>
			<dl>
				<dt></dt>
				<dd class="time-config">
					<p>
						<span>下午：</span>
						<div class="selectric-wrapper selectric-select-common selectric-harf" style="width: 125px;"><div class="selectric-hide-select"><select class="select-common harf" id="afternoon_start" tabindex="-1"><option value="">请选择</option><option>12&nbsp;:&nbsp;00</option><option>12&nbsp;:&nbsp;30</option><option>13&nbsp;:&nbsp;00</option><option>13&nbsp;:&nbsp;30</option><option>14&nbsp;:&nbsp;00</option><option>14&nbsp;:&nbsp;30</option><option>15&nbsp;:&nbsp;00</option><option>15&nbsp;:&nbsp;30</option><option>16&nbsp;:&nbsp;00</option><option>16&nbsp;:&nbsp;30</option><option>17&nbsp;:&nbsp;00</option><option>17&nbsp;:&nbsp;30</option><option>18&nbsp;:&nbsp;00</option><option>18&nbsp;:&nbsp;30</option><option>19&nbsp;:&nbsp;00</option><option>19&nbsp;:&nbsp;30</option><option>20&nbsp;:&nbsp;00</option><option>20&nbsp;:&nbsp;30</option><option>21&nbsp;:&nbsp;00</option><option>21&nbsp;:&nbsp;30</option><option>22&nbsp;:&nbsp;00</option><option>22&nbsp;:&nbsp;30</option><option>23&nbsp;:&nbsp;00</option><option>23&nbsp;:&nbsp;30</option><option>24&nbsp;:&nbsp;00</option></select></div><div class="selectric"><span class="selectric-label">请选择</span><button class="selectric-button">▾</button></div><div class="selectric-items" tabindex="-1"><div class="selectric-scroll"><ul><li data-index="0" class="selected" title="请选择">请选择</li><li data-index="1" class="" title="12&nbsp;:&nbsp;00">12&nbsp;:&nbsp;00</li><li data-index="2" class="" title="12&nbsp;:&nbsp;30">12&nbsp;:&nbsp;30</li><li data-index="3" class="" title="13&nbsp;:&nbsp;00">13&nbsp;:&nbsp;00</li><li data-index="4" class="" title="13&nbsp;:&nbsp;30">13&nbsp;:&nbsp;30</li><li data-index="5" class="" title="14&nbsp;:&nbsp;00">14&nbsp;:&nbsp;00</li><li data-index="6" class="" title="14&nbsp;:&nbsp;30">14&nbsp;:&nbsp;30</li><li data-index="7" class="" title="15&nbsp;:&nbsp;00">15&nbsp;:&nbsp;00</li><li data-index="8" class="" title="15&nbsp;:&nbsp;30">15&nbsp;:&nbsp;30</li><li data-index="9" class="" title="16&nbsp;:&nbsp;00">16&nbsp;:&nbsp;00</li><li data-index="10" class="" title="16&nbsp;:&nbsp;30">16&nbsp;:&nbsp;30</li><li data-index="11" class="" title="17&nbsp;:&nbsp;00">17&nbsp;:&nbsp;00</li><li data-index="12" class="" title="17&nbsp;:&nbsp;30">17&nbsp;:&nbsp;30</li><li data-index="13" class="" title="18&nbsp;:&nbsp;00">18&nbsp;:&nbsp;00</li><li data-index="14" class="" title="18&nbsp;:&nbsp;30">18&nbsp;:&nbsp;30</li><li data-index="15" class="" title="19&nbsp;:&nbsp;00">19&nbsp;:&nbsp;00</li><li data-index="16" class="" title="19&nbsp;:&nbsp;30">19&nbsp;:&nbsp;30</li><li data-index="17" class="" title="20&nbsp;:&nbsp;00">20&nbsp;:&nbsp;00</li><li data-index="18" class="" title="20&nbsp;:&nbsp;30">20&nbsp;:&nbsp;30</li><li data-index="19" class="" title="21&nbsp;:&nbsp;00">21&nbsp;:&nbsp;00</li><li data-index="20" class="" title="21&nbsp;:&nbsp;30">21&nbsp;:&nbsp;30</li><li data-index="21" class="" title="22&nbsp;:&nbsp;00">22&nbsp;:&nbsp;00</li><li data-index="22" class="" title="22&nbsp;:&nbsp;30">22&nbsp;:&nbsp;30</li><li data-index="23" class="" title="23&nbsp;:&nbsp;00">23&nbsp;:&nbsp;00</li><li data-index="24" class="" title="23&nbsp;:&nbsp;30">23&nbsp;:&nbsp;30</li><li data-index="25" class="last" title="24&nbsp;:&nbsp;00">24&nbsp;:&nbsp;00</li></ul></div></div><input class="selectric-input" tabindex="0"></div>
						<span>&nbsp;至&nbsp;</span>
						<div class="selectric-wrapper selectric-select-common selectric-harf" style="width: 125px;"><div class="selectric-hide-select"><select class="select-common harf" id="afternoon_end" tabindex="-1"><option value="">请选择</option><option>12&nbsp;:&nbsp;00</option><option>12&nbsp;:&nbsp;30</option><option>13&nbsp;:&nbsp;00</option><option>13&nbsp;:&nbsp;30</option><option>14&nbsp;:&nbsp;00</option><option>14&nbsp;:&nbsp;30</option><option>15&nbsp;:&nbsp;00</option><option>15&nbsp;:&nbsp;30</option><option>16&nbsp;:&nbsp;00</option><option>16&nbsp;:&nbsp;30</option><option>17&nbsp;:&nbsp;00</option><option>17&nbsp;:&nbsp;30</option><option>18&nbsp;:&nbsp;00</option><option>18&nbsp;:&nbsp;30</option><option>19&nbsp;:&nbsp;00</option><option>19&nbsp;:&nbsp;30</option><option>20&nbsp;:&nbsp;00</option><option>20&nbsp;:&nbsp;30</option><option>21&nbsp;:&nbsp;00</option><option>21&nbsp;:&nbsp;30</option><option>22&nbsp;:&nbsp;00</option><option>22&nbsp;:&nbsp;30</option><option>23&nbsp;:&nbsp;00</option><option>23&nbsp;:&nbsp;30</option><option>24&nbsp;:&nbsp;00</option></select></div><div class="selectric"><span class="selectric-label">请选择</span><button class="selectric-button">▾</button></div><div class="selectric-items" tabindex="-1"><div class="selectric-scroll"><ul><li data-index="0" class="selected" title="请选择">请选择</li><li data-index="1" class="" title="12&nbsp;:&nbsp;00">12&nbsp;:&nbsp;00</li><li data-index="2" class="" title="12&nbsp;:&nbsp;30">12&nbsp;:&nbsp;30</li><li data-index="3" class="" title="13&nbsp;:&nbsp;00">13&nbsp;:&nbsp;00</li><li data-index="4" class="" title="13&nbsp;:&nbsp;30">13&nbsp;:&nbsp;30</li><li data-index="5" class="" title="14&nbsp;:&nbsp;00">14&nbsp;:&nbsp;00</li><li data-index="6" class="" title="14&nbsp;:&nbsp;30">14&nbsp;:&nbsp;30</li><li data-index="7" class="" title="15&nbsp;:&nbsp;00">15&nbsp;:&nbsp;00</li><li data-index="8" class="" title="15&nbsp;:&nbsp;30">15&nbsp;:&nbsp;30</li><li data-index="9" class="" title="16&nbsp;:&nbsp;00">16&nbsp;:&nbsp;00</li><li data-index="10" class="" title="16&nbsp;:&nbsp;30">16&nbsp;:&nbsp;30</li><li data-index="11" class="" title="17&nbsp;:&nbsp;00">17&nbsp;:&nbsp;00</li><li data-index="12" class="" title="17&nbsp;:&nbsp;30">17&nbsp;:&nbsp;30</li><li data-index="13" class="" title="18&nbsp;:&nbsp;00">18&nbsp;:&nbsp;00</li><li data-index="14" class="" title="18&nbsp;:&nbsp;30">18&nbsp;:&nbsp;30</li><li data-index="15" class="" title="19&nbsp;:&nbsp;00">19&nbsp;:&nbsp;00</li><li data-index="16" class="" title="19&nbsp;:&nbsp;30">19&nbsp;:&nbsp;30</li><li data-index="17" class="" title="20&nbsp;:&nbsp;00">20&nbsp;:&nbsp;00</li><li data-index="18" class="" title="20&nbsp;:&nbsp;30">20&nbsp;:&nbsp;30</li><li data-index="19" class="" title="21&nbsp;:&nbsp;00">21&nbsp;:&nbsp;00</li><li data-index="20" class="" title="21&nbsp;:&nbsp;30">21&nbsp;:&nbsp;30</li><li data-index="21" class="" title="22&nbsp;:&nbsp;00">22&nbsp;:&nbsp;00</li><li data-index="22" class="" title="22&nbsp;:&nbsp;30">22&nbsp;:&nbsp;30</li><li data-index="23" class="" title="23&nbsp;:&nbsp;00">23&nbsp;:&nbsp;00</li><li data-index="24" class="" title="23&nbsp;:&nbsp;30">23&nbsp;:&nbsp;30</li><li data-index="25" class="last" title="24&nbsp;:&nbsp;00">24&nbsp;:&nbsp;00</li></ul></div></div><input class="selectric-input" tabindex="0"></div>
					</p>
					<p class="hint">配送时间可单独设置上午或下午，若起始时间与结束时间均未设置，则默认为该时间段不提供配送服务。</p>
					<p class="error time-error"></p>
				</dd>
				
			</dl>
			<dl class="discount_price">
				<dt>优惠配送金额：</dt>
				<dd id="discount_price">
										<p>
							<input name="order_money" type="text" class="input-common order_money harf" placeholder="消费金额">
							<input name="freight" type="text" class="input-common freight harf" placeholder="配送费用">
							<input type="hidden" name="is_start" value="0"> 
							<a href="javascript:;" class="delete_discount">删除</a>
						</p>
								</dd>
			</dl>
			<dl>
				<dt></dt>
				<dd>
					<div class="add_discount_price"><i class="fa fa-plus" aria-hidden="true"></i></div>
				</dd>
			</dl>
			<dl>
				<dt></dt>
				<dd><button class="btn-common btn-big" onclick="setDistributionConfig();">保存</button></dd>
			</dl>
			
		</div>
	</div>
</div>

<div style="height: 50px;" class="h50"></div>
<!-- 配送时间隐藏域 -->
<input type="hidden" id="time_json" value="[]">


		</div>
		
	</section>
</template>
