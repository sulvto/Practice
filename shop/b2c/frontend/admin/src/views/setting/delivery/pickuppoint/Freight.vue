<template>
    <section class="ns-base-section">
		
		
		
		<div style="position:relative;margin:0;">
			<!-- 面包屑导航 -->
						<div class="breadcrumb-nav">
				<a href="index.html">零基础学IT就来</a>
									<i class="fa fa-angle-right"></i>
					<a href="/config/webconfig.html">设置</a>
									<i class="fa fa-angle-right"></i>
					<!-- 需要加跳转链接用这个：http://showfx.niuteam.cn/admin/shop/pickuppointfreight -->
					<a href="javascript:;" style="color:#999;">自提点运费</a>
							</div>
						<!-- 三级导航菜单 -->
			
								<nav class="ns-third-menu">
					<ul>
												<li onclick="location.href='/express/expresscompany.html';">物流配送</li>
													<li class="selected" onclick="location.href='/shop/pickuppointlist.html';">门店自提</li>
													<li onclick="location.href='/distribution/distributionuserlist.html';">本地配送</li>
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
									<li><a href="/shop/pickuppointlist.html" child_id="1">门店管理</a></li>
										<li class="selected"><a href="/shop/pickuppointfreight.html" child_id="3">门店运费</a></li>
											<li><a href="/shop/pickupAuditorList.html" child_id="4">门店审核人员管理</a></li>
							
		</ul>
</nav>
	<div class="block-basic-setting">
		
		<h4>门店运费管理</h4>
			<div class="set-style">
				<dl>
					<dt>门店运费：</dt>
					<dd>
						<input id="pickup_freight" class="input-common harf" type="number" min="0" placeholder="0" onkeyup="freight_change(this);" value=""><em class="unit">元</em>
						<p class="hint">如果会员选择配送方式是门店自提对应运费</p>
					</dd>
				</dl>
				<dl>
					<dt>满X免运费：</dt>
					<dd><input id="manjian_freight" class="input-common harf" type="number" min="0" placeholder="0" onkeyup="freight_change(this);" value=""><em class="unit">元</em></dd>
				</dl>
				<dl>
					<dt>是否启用：</dt>
					<dd>
						<p>
							<input id="is_enable" type="checkbox" class="checkbox" simpleswitch="0" result="false" style="display: none;"><div class="Switch Switch_FlatRadius" id="Switch0"><span class="switch-open">是</span><span class="switch-close">否</span></div>
						</p>
					</dd>
				</dl>
				<dl>
					<dt></dt>
					<dd><button class="btn-common btn-big" onclick="setConfigAjax();">保存</button></dd>
				</dl>
				
			</div>
	</div>
	<!-- 基础设置 -->
	
</div>
		</div>
		
	</section>
</template>
