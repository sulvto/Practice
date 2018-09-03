<template>
	
	<section class="ns-base-section">
		
		
		
		<div style="position:relative;margin:0;">
			<!-- 面包屑导航 -->
						<div class="breadcrumb-nav">
				<a href="index.html">大鵬系統</a>
									<i class="fa fa-angle-right"></i>
					<a href="/wchat/config.html">微信</a>
									<i class="fa fa-angle-right"></i>
					<!-- 需要加跳转链接用这个：http://showfx.niuteam.cn/admin/wchat/appletConfig -->
					<a href="javascript:;" style="color:#999;">微信小程序管理</a>
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
									<p>微信小程序管理</p>
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
<!-- 						<span>微信小程序管理</span> -->
<!-- 						 -->
<!-- 					{1/block} -->
				</h4>
			</div>
		</div>
		
		
		<div class="ns-main">
			

<div class="set-style">
	<h4>小程序开发者设置<span class="muted">（必填）</span></h4>

	<dl>
		<dt>APPID：</dt>
		<dd>
			<input class="span2 input-common" id="appid" placeholder="AppID" value="" type="text" style="width:270px;">
			<span class="help-inline" id="appiderror" style="color:red;"></span>
		</dd>
	</dl>
	<dl>
		<dt>APP密钥：</dt>
		<dd>
			<input class="span2 input-common" id="appsecret" type="text" placeholder="Appsecret" value="" style="width:270px;">
			<span class="help-inline" id="appsecreterror" style="color:red;"></span>
			<p class="hint">
				AppID以及Appsecret来自于您申请的小程序账号，使用小程序账号密码公众平台，在设置-&gt;开发设置中可以找到AppID(小程序ID)及AppSecret(小程序密钥)	
			</p>
		</dd>
	</dl>

    <h4>配置说明</h4>
    <dl>
		<dt></dt>
		<dd>
			<p><span class="text">设置业务域名</span></p>
			<p class="titlestep">
				<a href="https://mp.weixin.qq.com/" target="_blank">登录微信小程序</a>点击设置&gt;开发设置&gt;业务域名设置：
			</p>
			<p class="text-success">
				<span class="muted">域名1：</span>http://showfx.niuteam.cn			</p>
			<p>业务域名设置完毕！</p>
		</dd>
	</dl>
    <dl>
		<dt></dt>
		<dd>
			<p><span class="text">设置服务器域名</span><span class="muted"></span></p>
			<p class="titlestep">
				<a href="https://mp.weixin.qq.com/" target="_blank">登录微信小程序</a>点击设置&gt;开发设置&gt;服务器域名设置：
			</p>
			<p class="text-success">
				<span class="muted">request合法域名：</span>http://showfx.niuteam.cn			</p>
			<p class="text-success">
				<span class="muted">uploadFile合法域名：</span>http://showfx.niuteam.cn			</p>
			<p class="text-success">
				<span class="muted">downloadFile合法域名：</span>http://showfx.niuteam.cn			</p>
			<p>服务器域名设置完毕！</p>
		</dd>
	</dl>    

    <dl>
		<dt></dt>
		<dd>
			<button class="btn-common btn-big" onclick="save();">保存</button>
		    <input type="hidden" id="IsChange" value="true">
		</dd>
	</dl>






<div style="padding:30px;display:none">
	<div class="smallTitle mt30">
		<span class="text">绑定微信小程序开发者账号</span><span class="muted">（必填）</span>
	</div>
	<div class="binding">
		<div class="input-prepend control-group">
			<span class="add-on"><i class="icon-user"></i></span>
			<input class="span2 input-common" id="appid" placeholder="AppID" value="" type="text" style="width:270px;">
			<span class="help-inline" id="appiderror" style="color:red;"></span>
		</div>
		<div class="mt8"></div>
		<div class="input-prepend control-group">
			<span class="add-on"><i class="icon-lock"></i></span>
			<input class="span2 input-common" id="appsecret" type="text" placeholder="Appsecret" value="" style="width:270px;">
			<span class="help-inline" id="appsecreterror" style="color:red;"></span>
		</div>
		<p class="muted mt8">
			AppID以及Appsecret来自于您申请开发接口时提供的账号和密码。
		</p>
	</div>

	<div class="smallTitle mt30">
		<span class="text">设置业务域名</span><span class="muted"></span>
	</div>
	
	<div class="setdomain">
		<p class="titlestep">
			<a href="https://mp.weixin.qq.com/" target="_blank">登录微信小程序</a>点击设置&gt;开发设置&gt;业务域名设置：
		</p>
		<p class="text-success">
			<span class="muted">域名1：</span>https://http://showfx.niuteam.cn		</p>
		<p>业务域名设置完毕！</p>
	</div>
	
	<div class="smallTitle mt30">
		<span class="text">设置服务器域名</span><span class="muted"></span>
	</div>
	
	<div class="setdomain">
		<p class="titlestep">
			<a href="https://mp.weixin.qq.com/" target="_blank">登录微信小程序</a>点击设置&gt;开发设置&gt;服务器域名设置：
		</p>
		<p class="text-success">
			<span class="muted">request合法域名：</span>https://http://showfx.niuteam.cn		</p>
		<p class="text-success">
			<span class="muted">uploadFile合法域名：</span>https://http://showfx.niuteam.cn		</p>
		<p class="text-success">
			<span class="muted">downloadFile合法域名：</span>https://http://showfx.niuteam.cn		</p>
		<p>服务器域名设置完毕！</p>
	</div>
	
	<p class="button mt20">
		<button class="btn-common btn-big" onclick="save();">保存</button>
		<input type="hidden" id="IsChange" value="true">
	</p>
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
		
	</div></section>
</template>
