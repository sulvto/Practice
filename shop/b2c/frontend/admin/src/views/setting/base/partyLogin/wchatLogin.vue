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
					<a href="javascript:;" style="color:#999;">微信登录</a>
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
			
<div class="set-style">
	<dl>
		<dt>APP_KEY：</dt>
		<dd><input id="APP_KEY" type="text" value="" class="input-common long"></dd>
	</dl>
	<dl>
		<dt>APP_SECRET：</dt>
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
		http://showfx.niuteam.cn		<p class="hint">(申请<a href="https://open.weixin.qq.com/" target="_blank">微信开放平台</a> 网站应用,授权回调域:showfx.niuteam.cn)</p>
		</dd>
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
<script>
function setConfigAjax(){
	var appkey = $("#APP_KEY").val();
	var appsecret = $("#APP_SECRET").val();
	var url = $("#AUTHORIZE").val();
	var call_back_url = $("#CALLBACK").val();
	var is_use = 0;
	if($("#is_use").is(":checked")){
		is_use = 1;
	}
	$.ajax({
		type:"post",
		url:"http://showfx.niuteam.cn/admin/config/loginweixinconfig.html",
		data:{
			'appkey':appkey,
			'appsecret':appsecret,
			'url':url,
			'call_back_url':call_back_url,
			"is_use" : is_use
		},
		success:function (data) {
			if (data["code"] > 0) {
				showTip(data["message"],'success');
				location.href = "http://showfx.niuteam.cn/admin/config/partylogin.html";
			}else{
				showTip(data["message"],'error');
			}
		}
	});
}
</script>

			<script type="text/javascript" src="/public/static/js/jquery.cookie.js"></script>
<script src="/public/static/js/page.js"></script>
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
