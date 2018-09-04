<template>
    <section class="ns-base-section">
		
		
		
		<div style="position:relative;margin:0;">
			<!-- 面包屑导航 -->
						<div class="breadcrumb-nav">
				<a href="index.html">零基础学IT就来</a>
									<i class="fa fa-angle-right"></i>
					<a href="/config/webconfig.html">设置</a>
									<i class="fa fa-angle-right"></i>
					<!-- 需要加跳转链接用这个：http://showfx.niuteam.cn/admin/config/payaliconfig -->
					<a href="javascript:;" style="color:#999;">支付宝支付</a>
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
									<p>支付宝支付</p>
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
<!-- 						<span>支付宝支付</span> -->
<!-- 						 -->
<!-- 					{1/block} -->
				</h4>
			</div>
		</div>
		
		
		<div class="ns-main">
			
<div class="set-style">
	<dl>
		<dt>账号：</dt>
		<dd>
			<input id="ali_seller" type="text" value="" class="input-common long">
			<p class="hint">支付宝账户</p>
		</dd>
	</dl>
	<dl>
		<dt>合作者身份ID：</dt>
		<dd>
			<input id="ali_partnerid" type="text" value="" class="input-common long">
			<p class="hint">支付宝合作者身份ID（PID）</p>
		</dd>
	</dl>
		<dl>
		<dt>安全校验码：</dt>
		<dd>
			<input id="ali_key" type="text" value="" class="input-common long">
			<p class="hint">支付宝老版MD5密钥</p>
		</dd>
	</dl>
	<dl>
		<dt>是否启用支付：</dt>
		<dd>
			<p>
				<input id="is_use" type="checkbox" class="checkbox" checked="checked" simpleswitch="0" result="true" style="display: none;"><div class="Switch Switch_FlatRadius On" id="Switch0"><span class="switch-open">是</span><span class="switch-close">否</span></div>
			</p>
		</dd>
	</dl>
	
	<dl>
		<dt>是否启用退款：</dt>
		<dd>
			<p><input id="refund_is_use" type="checkbox" class="checkbox" checked="checked" simpleswitch="1" result="true" style="display: none;"><div class="Switch Switch_FlatRadius On" id="Switch1"><span class="switch-open">是</span><span class="switch-close">否</span></div></p>
			<p class="hint">开启支付宝支付才可以进行后续操作</p>
		</dd>
	</dl>
	<dl>
		<dt>是否启用转账：</dt>
		<dd>
			<p><input id="transfer_is_use" type="checkbox" class="checkbox" checked="checked" simpleswitch="2" result="true" style="display: none;"><div class="Switch Switch_FlatRadius On" id="Switch2"><span class="switch-open">是</span><span class="switch-close">否</span></div></p>
			<p class="hint">开启支付宝支付才可以进行后续操作</p>
		</dd>
	</dl>
	
	<dl>
		<dt></dt>
		<dd>
			<button class="btn-common btn-big" onclick="setConfigAjax()">保存</button>
			<button class="btn-common-cancle btn-big" onclick="javascript:history.back(-1);">返回</button>
		</dd>
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
