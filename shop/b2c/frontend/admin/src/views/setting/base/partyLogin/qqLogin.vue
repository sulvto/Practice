<template>
    <section class="ns-base-section">

		<div style="position:relative;margin:0;">
			<!-- 面包屑导航 -->
						<div class="breadcrumb-nav">
				<a href="index.html">零基础学IT就来</a>
									<i class="fa fa-angle-right"></i>
					<a href="/config/webconfig.html">设置</a>
									<i class="fa fa-angle-right"></i>
					<!-- 需要加跳转链接用这个：http://showfx.niuteam.cn/admin/ -->
					<a href="javascript:;" style="color:#999;">QQ登录</a>
							</div>
						<!-- 三级导航菜单 -->
			
							
			<div class="right-side-operation">
				<ul>
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

		<div class="ns-main">

<div class="span1"></div>
<div class="set-style">
	<dl>
		<dt>APP_ID：</dt>
		<dd><input id="APP_KEY" type="text" value="" class="input-common long"></dd>
	</dl>
	<dl>
		<dt>APP_KEY：</dt>
		<dd><input id="APP_SECRET" type="text" value="" class="input-common long"></dd>
	</dl>
	<dl>
		<dt>是否启用：</dt>
		<dd>
			<input id="is_use" type="checkbox" class="checkbox" checked="checked" simpleswitch="0" result="true" style="display: none;"><div class="Switch Switch_FlatRadius On" id="Switch0"><span class="switch-open">是</span><span class="switch-close">否</span></div>
		</dd>
	</dl>
	<dl>
		<dt>申请域名：</dt>
		<dd>
			http://showfx.niuteam.cn		</dd>
	</dl>
	<dl>
		<dt>回调域名：</dt>
		<dd>http://showfx.niuteam.cn/wap/login/callback.html</dd>
	</dl>
	<dl>
		<dt></dt>
		<dd>
			<button class="btn-common btn-big" onclick="setConfigAjax();">保存</button>
			<button class="btn-common-cancle btn-big" onclick="javascript:history.back(-1);">返回</button>
		</dd>
	</dl>
</div>
<input type="hidden" id="AUTHORIZE" value="http://showfx.niuteam.cn">
<input type="hidden" id="CALLBACK" value="http://showfx.niuteam.cn/wap/login/callback.html">

		</div>

	</section>
</template>
