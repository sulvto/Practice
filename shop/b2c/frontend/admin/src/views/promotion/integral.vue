<template>
	
	<section class="ns-base-section">
		
		
		
		<div style="position:relative;margin:0;">
			<!-- 面包屑导航 -->
						<div class="breadcrumb-nav">
				<a href="index.html">大鵬系統</a>
									<i class="fa fa-angle-right"></i>
					<a href="/promotion/coupontypelist.html">营销</a>
									<i class="fa fa-angle-right"></i>
					<!-- 需要加跳转链接用这个：http://showfx.niuteam.cn/admin/promotion/integral -->
					<a href="javascript:;" style="color:#999;">奖励规则</a>
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
									<p>奖励规则</p>
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
<!-- 						<span>奖励规则</span> -->
<!-- 						 -->
<!-- 					{1/block} -->
				</h4>
			</div>
		</div>
		
		
		<div class="ns-main">
			
<div class="space-10"></div>
<div class="set-style">
	<dl>
		<dt>会员注册送积分：</dt>
		<dd>
			<p><input id="reg_member_self_point" type="number" min="0" value="100" onkeyup="value=value.replace(/[^\d+(\.\d+)?]/g,'')" class="input-common harf"><em class="unit">分</em></p>
			<p class="error">请输入阿里旺旺</p>
		</dd>
	</dl>
	<dl>
	<dt></dt>
		<dd>
			<p>
				<input id="register_open" type="checkbox" onchange="setIntegralAjax();" class="checkbox" checked="checked" simpleswitch="0" result="true" style="display: none;"><div class="Switch Switch_FlatRadius On" id="Switch0"><span class="switch-open">是</span><span class="switch-close">否</span></div>
			</p>
			<p class="hint">是否启用会员注册送积分</p>
		</dd>
	</dl>

	<dl>
		<dt>会员注册送优惠券：</dt>
		<dd>
			<div class="selectric-wrapper selectric-row-no-radius selectric-select-common" style="width: 250px;"><div class="selectric-hide-select"><select class="row-no-radius select-common" id="reg_coupon" tabindex="-1">
				<option value="">请选择优惠券种类</option>
									<option value="3">123</option>
										<option value="2">满150元减5元</option>
										<option value="1">满88元减2元</option>
								</select></div><div class="selectric"><span class="selectric-label">请选择优惠券种类</span><button class="selectric-button">▾</button></div><div class="selectric-items" tabindex="-1"><div class="selectric-scroll"><ul><li data-index="0" class="selected" title="请选择优惠券种类">请选择优惠券种类</li><li data-index="1" class="" title="123">123</li><li data-index="2" class="" title="满150元减5元">满150元减5元</li><li data-index="3" class="last" title="满88元减2元">满88元减2元</li></ul></div></div><input class="selectric-input" tabindex="0"></div>
			<p class="error">请输入阿里旺旺</p>
		</dd>
	</dl>
	<dl>
	<dt></dt>
		<dd>
			<p>
				<input id="reg_coupon_open" type="checkbox" onchange="setIntegralAjax();" class="checkbox" checked="checked" simpleswitch="1" result="true" style="display: none;"><div class="Switch Switch_FlatRadius On" id="Switch1"><span class="switch-open">是</span><span class="switch-close">否</span></div>
			</p>
			<p class="hint">是否启用会员注册送优惠券</p>
		</dd>
	</dl>


	<dl>
		<dt>签到送积分：</dt>
		<dd>
			<p><input id="sign_point" type="number" value="0" min="0" onkeyup="value=value.replace(/[^\d+(\.\d+)?]/g,'')" class="input-common harf"><em class="unit">分</em></p>
			<p class="error">请输入阿里旺旺</p>
		</dd>
	</dl>
		<dl>
		<dt></dt>
		<dd>
			<p>
				<input id="sign_open" type="checkbox" onchange="setIntegralAjax();" class="checkbox" checked="checked" simpleswitch="2" result="true" style="display: none;"><div class="Switch Switch_FlatRadius On" id="Switch2"><span class="switch-open">是</span><span class="switch-close">否</span></div>
			</p>
			<p class="hint">是否启用签到送积分</p>
		</dd>
	</dl>
	<dl>
		<dt>签到送优惠券：</dt>
		<dd>
			<div class="selectric-wrapper selectric-row-no-radius selectric-select-common" style="width: 250px;"><div class="selectric-hide-select"><select class="row-no-radius select-common" id="sign_coupon" tabindex="-1">
				<option value="">请选择优惠券种类</option>
									<option value="3">123</option>
										<option value="2">满150元减5元</option>
										<option value="1">满88元减2元</option>
								</select></div><div class="selectric"><span class="selectric-label">请选择优惠券种类</span><button class="selectric-button">▾</button></div><div class="selectric-items" tabindex="-1"><div class="selectric-scroll"><ul><li data-index="0" class="selected" title="请选择优惠券种类">请选择优惠券种类</li><li data-index="1" class="" title="123">123</li><li data-index="2" class="" title="满150元减5元">满150元减5元</li><li data-index="3" class="last" title="满88元减2元">满88元减2元</li></ul></div></div><input class="selectric-input" tabindex="0"></div>
			<p class="error">请输入阿里旺旺</p>
		</dd>
	</dl>
	<dl>
	<dt></dt>
		<dd>
			<p>
				<input id="sign_coupon_open" type="checkbox" onchange="setIntegralAjax();" class="checkbox" checked="checked" simpleswitch="3" result="true" style="display: none;"><div class="Switch Switch_FlatRadius On" id="Switch3"><span class="switch-open">是</span><span class="switch-close">否</span></div>
			</p>
			<p class="hint">是否启用签到送优惠券</p>
		</dd>
	</dl>

	<dl>
		<dt>分享送积分：</dt>
		<dd>
			<p><input id="share_point" type="number" value="0" min="0" onkeyup="value=value.replace(/[^\d+(\.\d+)?]/g,'')" class="input-common harf"><em class="unit">分</em></p>
			<p class="error">请输入阿里旺旺</p>
		</dd>
	</dl>
	<dl>
		<dt></dt>
		<dd>
			<p>
				<input id="share_open" type="checkbox" onchange="setIntegralAjax();" class="checkbox" checked="checked" simpleswitch="4" result="true" style="display: none;"><div class="Switch Switch_FlatRadius On" id="Switch4"><span class="switch-open">是</span><span class="switch-close">否</span></div>
			</p>
			<p class="hint">是否启用分享送积分</p>
		</dd>
	</dl>

	<dl>
		<dt>分享送优惠券：</dt>
		<dd>
			<div class="selectric-wrapper selectric-row-no-radius selectric-select-common" style="width: 250px;"><div class="selectric-hide-select"><select class="row-no-radius select-common" id="share_coupon" tabindex="-1">
				<option value="">请选择优惠券种类</option>
									<option value="3">123</option>
										<option value="2">满150元减5元</option>
										<option value="1">满88元减2元</option>
								</select></div><div class="selectric"><span class="selectric-label">请选择优惠券种类</span><button class="selectric-button">▾</button></div><div class="selectric-items" tabindex="-1"><div class="selectric-scroll"><ul><li data-index="0" class="selected" title="请选择优惠券种类">请选择优惠券种类</li><li data-index="1" class="" title="123">123</li><li data-index="2" class="" title="满150元减5元">满150元减5元</li><li data-index="3" class="last" title="满88元减2元">满88元减2元</li></ul></div></div><input class="selectric-input" tabindex="0"></div>
			<p class="error">请输入阿里旺旺</p>
		</dd>
	</dl>
	<dl>
	<dt></dt>
		<dd>
			<p>
				<input id="share_coupon_open" type="checkbox" onchange="setIntegralAjax();" class="checkbox" checked="checked" simpleswitch="5" result="true" style="display: none;"><div class="Switch Switch_FlatRadius On" id="Switch5"><span class="switch-open">是</span><span class="switch-close">否</span></div>
			</p>
			<p class="hint">是否启用分享送优惠券</p>
		</dd>
	</dl>

	<dl>
		<dt>点赞送积分：</dt>
		<dd>
			<p><input id="click_point" type="number" value="0" min="0" onkeyup="value=value.replace(/[^\d+(\.\d+)?]/g,'')" class="input-common harf"><em class="unit">分</em></p>
		</dd>
	</dl>

	<dl>
		<dt>点赞送优惠券：</dt>
		<dd>
			<div class="selectric-wrapper selectric-row-no-radius selectric-select-common" style="width: 250px;"><div class="selectric-hide-select"><select class="row-no-radius select-common" id="click_coupon" tabindex="-1">
				<option value="">请选择优惠券种类</option>
									<option value="3">123</option>
										<option value="2">满150元减5元</option>
										<option value="1">满88元减2元</option>
								</select></div><div class="selectric"><span class="selectric-label">请选择优惠券种类</span><button class="selectric-button">▾</button></div><div class="selectric-items" tabindex="-1"><div class="selectric-scroll"><ul><li data-index="0" class="selected" title="请选择优惠券种类">请选择优惠券种类</li><li data-index="1" class="" title="123">123</li><li data-index="2" class="" title="满150元减5元">满150元减5元</li><li data-index="3" class="last" title="满88元减2元">满88元减2元</li></ul></div></div><input class="selectric-input" tabindex="0"></div>
			<p class="error">请输入阿里旺旺</p>
		</dd>
	</dl>
	<dl>
	<dt></dt>
		<dd>
			<p>
				<input id="click_coupon_open" type="checkbox" onchange="setIntegralAjax();" class="checkbox" checked="checked" simpleswitch="6" result="true" style="display: none;"><div class="Switch Switch_FlatRadius On" id="Switch6"><span class="switch-open">是</span><span class="switch-close">否</span></div>
			</p>
			<p class="hint">是否启用点赞送优惠券</p>
		</dd>
	</dl>

	<dl>
		<dt>评论送积分：</dt>
		<dd>
			<p><input id="comment_point" type="number" value="0" min="0" onkeyup="value=value.replace(/[^\d+(\.\d+)?]/g,'')" class="input-common harf"><em class="unit">分</em></p>
		</dd>
	</dl>

	<dl>
		<dt>评论送优惠券：</dt>
		<dd>
			<div class="selectric-wrapper selectric-row-no-radius selectric-select-common" style="width: 250px;"><div class="selectric-hide-select"><select class="row-no-radius select-common" id="comment_coupon" tabindex="-1">
				<option value="">请选择优惠券种类</option>
									<option value="3">123</option>
										<option value="2">满150元减5元</option>
										<option value="1">满88元减2元</option>
								</select></div><div class="selectric"><span class="selectric-label">请选择优惠券种类</span><button class="selectric-button">▾</button></div><div class="selectric-items" tabindex="-1"><div class="selectric-scroll"><ul><li data-index="0" class="selected" title="请选择优惠券种类">请选择优惠券种类</li><li data-index="1" class="" title="123">123</li><li data-index="2" class="" title="满150元减5元">满150元减5元</li><li data-index="3" class="last" title="满88元减2元">满88元减2元</li></ul></div></div><input class="selectric-input" tabindex="0"></div>
			<p class="error">请输入阿里旺旺</p>
		</dd>
	</dl>
	<dl>
	<dt></dt>
		<dd>
			<p>
				<input id="comment_coupon_open" type="checkbox" onchange="setIntegralAjax();" class="checkbox" checked="checked" simpleswitch="7" result="true" style="display: none;"><div class="Switch Switch_FlatRadius On" id="Switch7"><span class="switch-open">是</span><span class="switch-close">否</span></div>
			</p>
			<p class="hint">是否启用评论送优惠券</p>
		</dd>
	</dl>

	<dl>
		<dt></dt>
		<dd>
			<button class="btn-common btn-big" onclick="setRewardRuleAjax();" style="margin:20px 0 20px 205px;">保存</button>
		</dd>
	</dl>
</div>

		</div>
		
	</section>
</template>
