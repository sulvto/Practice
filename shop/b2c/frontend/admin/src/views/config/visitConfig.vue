<template>
    <section class="ns-base-section">
		
		
		
		<div style="position:relative;margin:0;">
			<!-- 面包屑导航 -->
						<div class="breadcrumb-nav">
				<a href="index.html">零基础学IT就来</a>
									<i class="fa fa-angle-right"></i>
					<a href="/config/webconfig.html">设置</a>
									<i class="fa fa-angle-right"></i>
					<!-- 需要加跳转链接用这个：http://showfx.niuteam.cn/admin/config/visitconfig -->
					<a href="javascript:;" style="color:#999;">运营</a>
							</div>
						<!-- 三级导航菜单 -->
			
								<nav class="ns-third-menu">
					<ul>
												<li onclick="location.href='/config/webconfig.html';">网站设置</li>
													<li onclick="location.href='/config/seoConfig.html';">SEO设置</li>
													<li onclick="location.href='/config/copyrightinfo.html';">版权</li>
													<li class="selected" onclick="location.href='/config/visitconfig.html';">运营</li>
													<li onclick="location.href='/config/registerandvisit.html';">注册与访问</li>
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
																		<h4>操作提示</h4>
									<p>访问设置</p>
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
<!-- 						<span>访问设置</span> -->
<!-- 						 -->
<!-- 					{1/block} -->
				</h4>
			</div>
		</div>
		
		
		<div class="ns-main">
			
<div class="set-style">

	<dl>
		<dt>后台网站风格：</dt>
		<dd>
			<p>
				<div class="selectric-wrapper selectric-select-common" style="width: 250px;"><div class="selectric-hide-select"><select id="style_id_admin" class="select-common" tabindex="-1">
										<option value="4" selected="selected">简约版</option>
									</select></div><div class="selectric"><span class="selectric-label">简约版</span><button class="selectric-button">▾</button></div><div class="selectric-items" tabindex="-1"><div class="selectric-scroll"><ul><li data-index="0" class="last selected" title="简约版">简约版</li></ul></div></div><input class="selectric-input" tabindex="0"></div>
			</p>
		</dd>
	</dl>
	<dl>
		<dt>网站访问模式：</dt>
		<dd>
			<p>
				<div class="selectric-wrapper selectric-select-common" style="width: 250px;"><div class="selectric-hide-select"><select id="visit_pattern" name="visit_pattern" class="select-common" tabindex="-1">
					<option value="0">兼容模式</option>
					<option value="1" selected="selected">pathinfo模式</option>
				</select></div><div class="selectric"><span class="selectric-label">pathinfo模式</span><button class="selectric-button">▾</button></div><div class="selectric-items" tabindex="-1"><div class="selectric-scroll"><ul><li data-index="0" class="" title="兼容模式">兼容模式</li><li data-index="1" class="last selected" title="pathinfo模式">pathinfo模式</li></ul></div></div><input class="selectric-input" tabindex="0"></div>
			</p>
			<p class="hint">伪静态只支持<i class="important-note">pathinfo</i>模式，如果开启伪静态，请选择<i class="important-note">pathinfo</i>模式
</p>
		</dd>
	</dl>
	<dl>
		<dt>PC端商城运营状态：</dt>
		<dd>
			<div class="total">


				<label for="navigationtype1" class="radio inline normal">
					<i class="radio-common selected">
						<input type="radio" value="1" name="navigationtype" id="navigationtype1" checked="">
					</i>
					<span>开启</span>
				</label>
				<label for="navigationtype2" class="radio inline normal">
					<i class="radio-common ">
						<input type="radio" value="2" name="navigationtype" id="navigationtype2">
					</i>
					<span>关闭</span>
				</label>
				<label for="navigationtype3" class="radio inline normal">
					<i class="radio-common ">
						<input type="radio" value="3" name="navigationtype" id="navigationtype3">
					</i>
					<span>关闭后访问WAP端</span>
				</label>
			</div>
			<p class="hint">暂时将站点关闭，其他人无法访问，但不影响管理员访问</p>
		</dd>
	</dl>
	
	<dl>
		<dt>WAP端商城运营状态：</dt>
		<dd>
			<div class="total">
				<label for="waptype1" class="radio inline normal">
					<i class="radio-common selected">
						<input type="radio" value="1" name="waptype" id="waptype1" checked="">
					</i>
					<span>开启</span>
				</label>
				<label for="waptype2" class="radio inline normal">
					<i class="radio-common ">
						<input type="radio" value="2" name="waptype" id="waptype2">
					</i>
					<span>关闭</span>
				</label>
				<label for="waptype3" class="radio inline normal">
					<i class="radio-common ">
						<input type="radio" value="3" name="waptype" id="waptype3">
					</i>
					<span>关闭后访问PC端</span>
				</label>
			</div>
			<p class="hint">暂时将站点关闭，其他人无法访问，但不影响管理员访问</p>
		</dd>
	</dl>

	<dl class="reason">
		<dt>网站关闭原因：</dt>
		<dd>
			<textarea name="store_zy" rows="2" id="close_reason" class="textarea-common">对不起，牛酷商城维护中，大家敬请期待...</textarea>
			<p class="hint">请填写站点关闭原因，将在前台显示</p>
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
