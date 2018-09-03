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
					<a href="javascript:;" style="color:#999;">邮件设置</a>
							</div>
						<!-- 三级导航菜单 -->
			
								<nav class="ns-third-menu">
					<ul>
												<li class="selected" onclick="location.href='/Config/messageConfig.html?type=email';">邮件设置</li>
													<li onclick="location.href='/Config/messageConfig.html?type=sms';">短信设置</li>
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
			
<!-- 邮箱设置 -->
<div class="set-style">
	<dl>
		<dt>是否开启：</dt>
		<dd>
			<input id="email_is_use" type="checkbox" class="checkbox" simpleswitch="0" result="false" style="display: none;"><div class="Switch Switch_FlatRadius" id="Switch0"><span class="switch-open">是</span><span class="switch-close">否</span></div>
		</dd>
	</dl>
	<dl>
		<dt>SMTP服务器：</dt>
		<dd>
			<input id="email_host" type="text" value="smtp.163.com" class="input-common">
		</dd>
	</dl>
	<dl>
		<dt>SMTP端口：</dt>
		<dd>
			<input id="email_port" type="text" value="465" class="input-common">
		</dd>
	</dl>
	<dl>
		<dt>发信人邮件地址：</dt>
		<dd>
			<input id="email_addr" type="text" value="" class="input-common">
		</dd>
	</dl>
	<dl>
		<dt>SMTP身份验证用户名：</dt>
		<dd>
			<input id="email_id" type="text" value="" class="input-common">
		</dd>
	</dl>
	<dl>
		<dt>SMTP身份验证码：</dt>
		<dd>
			<input id="email_pass" type="text" value="" class="input-common">
		</dd>
	</dl>
	<dl>
		<dt>是否使用安全链接：</dt>
		<dd>
			<input id="email_is_security" type="checkbox" class="checkbox" simpleswitch="1" result="false" style="display: none;"><div class="Switch Switch_FlatRadius" id="Switch1"><span class="switch-open">是</span><span class="switch-close">否</span></div>
		</dd>
	</dl>
	<dl>
		<dt>测试接收邮件地址：</dt>
		<dd>
			<input id="email_test" type="text" class="input-common">
			<button class="btn-common" onclick="testSend()" style="vertical-align:1.5px;;">测试发送</button>
		</dd>
	</dl>
	<dl>
		<dt></dt>
		<dd>
			<button class="btn-common btn-big" onclick="setConfigAjax();">保存</button>
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
