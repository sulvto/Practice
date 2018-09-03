<template>
    <section class="ns-base-section">
		
		
		
		<div style="position:relative;margin:0;">
			<!-- 面包屑导航 -->
						<div class="breadcrumb-nav">
				<a href="index.html">零基础学IT就来</a>
									<i class="fa fa-angle-right"></i>
					<a href="/config/webconfig.html">设置</a>
									<i class="fa fa-angle-right"></i>
					<!-- 需要加跳转链接用这个：http://showfx.niuteam.cn/admin/config/registerandvisit -->
					<a href="javascript:;" style="color:#999;">注册与访问</a>
							</div>
						<!-- 三级导航菜单 -->
			
								<nav class="ns-third-menu">
					<ul>
												<li onclick="location.href='/config/webconfig.html';">网站设置</li>
													<li onclick="location.href='/config/seoConfig.html';">SEO设置</li>
													<li onclick="location.href='/config/copyrightinfo.html';">版权</li>
													<li onclick="location.href='/config/visitconfig.html';">运营</li>
													<li class="selected" onclick="location.href='/config/registerandvisit.html';">注册与访问</li>
													<li onclick="location.href='/config/pictureuploadsetting.html';">上传设置</li>
													<li onclick="location.href='/config/customPseudoStaticRule.html';">伪静态路由</li>
													<li onclick="location.href='/config/partylogin.html';">第三方登录</li>
													<li onclick="location.href='/config/notifyindex.html';">通知系统</li>
													<li onclick="location.href='/config/customservice.html';">客服</li>
													<li onclick="location.href='/config/merchantService.html';">商家服务</li>
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
			
<div class="set-style">
	<dl>
		<dt>是否允许注册会员：</dt>
		<dd>
			<div class="controls">
				<p>
					<input id="is_register" type="checkbox" checked="" class="checkbox" simpleswitch="0" result="true" style="display: none;"><div class="Switch Switch_FlatRadius On" id="Switch0"><span class="switch-open">是</span><span class="switch-close">否</span></div>
				</p>
			</div>
			<p class="hint">设置为不允许则游客无法注册成为站点会员</p>
		</dd>
	</dl>
	
	<dl>
		<dt>注册类型：</dt>
		<dd>
			<div class="controls">
				<label class="radio inline normal">
					<i class="checkbox-common selected">
						<input type="checkbox" name="register_info_validate" value="plain">
					</i>
					<span>普通注册</span>
				</label>
				<label class="radio inline normal">
					<i class="checkbox-common selected">
						<input type="checkbox" name="register_info_validate" value="email">
					</i>
					<span>邮箱注册</span>
				</label>
				<label class="radio inline normal">
					<i class="checkbox-common selected">
						<input type="checkbox" name="register_info_validate" value="mobile">
					</i>
					<span>手机注册</span>
				</label>
			</div>
			<p class="hint">如开启邮箱和手机注册，请在<a href="/config/notifyindex.html" target="_blank">通知系统</a>功能中进行邮箱与短信通知配置，游客在注册时通过验证后方能注册成功</p>
		</dd>
	</dl>
	<dl>
		<dt>后台验证码是否开启：</dt>
		<dd>
			<input id="adminCode" type="checkbox" class="checkbox" simpleswitch="1" result="false" style="display: none;"><div class="Switch Switch_FlatRadius" id="Switch1"><span class="switch-open">是</span><span class="switch-close">否</span></div>
		</dd>
	</dl>
	<dl>
		<dt>商城验证码是否开启：</dt>
		<dd>
			<input id="pcCode" type="checkbox" class="checkbox" simpleswitch="2" result="false" style="display: none;"><div class="Switch Switch_FlatRadius" id="Switch2"><span class="switch-open">是</span><span class="switch-close">否</span></div>
		</dd>
	</dl>
	<dl>
		<dt>错误多次后显示：</dt>
		<dd>
			<input type="number" class="input-common short" value="" id="error_num"><em class="unit">次</em>	
			<p class="hint">配置该项后，开启验证码后验证码默认不显示，在登录错误次数达到设置值后才进行验证</p>
			<p class="error"></p>
		</dd>
	</dl>
	<dl>
		<dt>用户名保留关键字：</dt>
		<dd>
			
			<textarea rows="2" id="name_keyword" class="textarea-common" maxlength="300"></textarea>
			<p class="hint">用户在注册用户名不可使用这些关键字。多个关键字之间以英文“,”分隔开，如“admin,username”</p>
		</dd>
	</dl>
	
	<dl>
		<dt>密码最小长度：</dt>
		<dd>
			<input id="pwd_len" type="number" min="0" step="1" value="5" class="input-common harf">
			<p class="hint">新用户注册时密码最小长度，0或不填为不限制</p>
		</dd>
	</dl>
	
	<dl>
		<dt>强制密码复杂度：</dt>
		<dd>
			<div class="controls">
				<label class="radio inline normal">
					<i class="checkbox-common">
						<input type="checkbox" name="pwd_complexity" value="number">
					</i>
					<span>数字</span>
				</label>
				<label class="radio inline normal">
					<i class="checkbox-common">
						<input type="checkbox" name="pwd_complexity" value="letter">
					</i>
					<span>小写字母</span>
				</label>
				<label class="radio inline normal">
					<i class="checkbox-common">
						<input type="checkbox" name="pwd_complexity" value="upper_case">
					</i>
					<span>大写字母</span>
				</label>
				<label class="radio inline normal">
					<i class="checkbox-common">
						<input type="checkbox" name="pwd_complexity" value="symbol">
					</i>
					<span>符号</span>
				</label>
			</div>
			<p class="hint">新用户注册时密码中必须存在所选字符类型，不选择为无限制</p>
		</dd>
	</dl>
	<dl>
		<dt>微信端会员注册方式：</dt>
		<dd>
			<div class="controls">
									<label class="radio inline">
						<i class="radio-common">
							<input type="radio" name="is_requiretel" value="1">
						</i>
						<span>非自动</span>
					</label>
					<p class="hint">用户首次打开微信端商城,，不会自动注册为会员，需要进行普通会员注册或者登录会员账号与微信进行绑定，一般应用于电脑端与微信端会员账号统一管理。</p>
					<label class="radio inline">
						<i class="radio-common selected">
							<input type="radio" name="is_requiretel" value="0" checked="checked">
						</i>
						<span>自动</span>
					</label>
					<p class="hint">用户首次打开微信端商城,，会自动注册为会员，本微信会员与电脑端会员是两个会员账号。好处是可以自动完成会员注册。一般应用于只在微信端运营的商家。</p>
							</div>
			
		</dd>
	</dl>
	<dl style="display:none;">
		<dt>注册服务条款内容：</dt>
		<dd>
			<textarea rows="2" id="terms_of_service" class="textarea input-common" maxlength="50"></textarea>
			<p class="hint">新用户注册时显示网站服务条款内容</p>
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
