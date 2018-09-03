<template>
    <section class="ns-base-section">
		
		
		
		<div style="position:relative;margin:0;">
			<!-- 面包屑导航 -->
						<div class="breadcrumb-nav">
				<a href="index.html">零基础学IT就来</a>
									<i class="fa fa-angle-right"></i>
					<a href="/config/webconfig.html">设置</a>
									<i class="fa fa-angle-right"></i>
					<!-- 需要加跳转链接用这个：http://showfx.niuteam.cn/admin/config/copyrightinfo -->
					<a href="javascript:;" style="color:#999;">版权</a>
							</div>
						<!-- 三级导航菜单 -->
			
								<nav class="ns-third-menu">
					<ul>
												<li onclick="location.href='/config/webconfig.html';">网站设置</li>
													<li onclick="location.href='/config/seoConfig.html';">SEO设置</li>
													<li class="selected" onclick="location.href='/config/copyrightinfo.html';">版权</li>
													<li onclick="location.href='/config/visitconfig.html';">运营</li>
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
		<dt>版权logo：</dt>
		<dd>
			<div class="upload-btn-common">
				<div>
					<input class="input-file" name="file_upload" id="uploadImg" type="file" onchange="imgUpload(this);">
					<input type="hidden" id="logo" value="">
				</div>
				<input type="text" id="text_logo" class="input-common" readonly="readonly" value="">
				<em>上传</em>
				
				<img id="preview_logo" src="/public/static/blue/img/upload-common-select.png" data-html="true" data-container="body" data-placement="top" data-trigger="manual">

			</div>

			<p class="hint">
				<span>建议使用<i class="important-note">宽280</i>像素-<i class="important-note">高50</i>像素内的<i class="important-note">GIF</i>或<i class="important-note">PNG</i>透明图片</span>
			</p>

		</dd>
	</dl>
	
	<dl>
		<dt>公司名称：</dt>
		<dd>
			<input id="companyname" type="text" value="" class="input-common long">
<!-- 			<p class="hint">Description出现在页面头部的Meta标签中，用于记录本页面的摘要与描述，建议不超过80个字</p> -->
		</dd>
	</dl>	
	<dl>
		<dt>版权链接：</dt>
		<dd>
			<input id="link" type="text" value="" class="input-common long">
<!-- 			<p class="hint">Keywords项出现在页面头部的标签中，用于记录本页面的关键字，多个关键字请用分隔符分隔</p> -->
		</dd>
	</dl>
	<dl>
		<dt>版权信息：</dt>
		<dd>
			<textarea id="desc" class="textarea-common" maxlength="50"></textarea>
<!-- 			<p class="hint">如需在中添加其他的HTML代码，可以使用本设置，否则请留空</p> -->
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
