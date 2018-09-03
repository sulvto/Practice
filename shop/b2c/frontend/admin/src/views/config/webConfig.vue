<template>
	
	<section class="ns-base-section">
		
		
		
		<div style="position:relative;margin:0;">
			<!-- 面包屑导航 -->
						<div class="breadcrumb-nav">
				<a href="index.html">大鵬系統</a>
									<i class="fa fa-angle-right"></i>
					<a href="/config/webconfig.html">设置</a>
									<i class="fa fa-angle-right"></i>
					<!-- 需要加跳转链接用这个：http://showfx.niuteam.cn/admin/config/webconfig -->
					<a href="javascript:;" style="color:#999;">网站设置</a>
							</div>
						<!-- 三级导航菜单 -->
			
								<nav class="ns-third-menu">
					<ul>
												<li class="selected" onclick="location.href='/config/webconfig.html';">网站设置</li>
													<li onclick="location.href='/config/seoConfig.html';">SEO设置</li>
													<li onclick="location.href='/config/copyrightinfo.html';">版权</li>
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
																		<h4>操作提示</h4>
									<p>相关教程：<a href="http://bbs.niushop.com.cn/forum.php?mod=viewthread&amp;tid=2342&amp;extra=page%3D2" target="_blank">http://bbs.niushop.com.cn/forum.php?mod=viewthread&amp;tid=2342&amp;extra=page%3D2</a></p>
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
<!-- 						<span>相关教程：<a href="http://bbs.niushop.com.cn/forum.php?mod=viewthread&tid=2342&extra=page%3D2" target="_blank">http://bbs.niushop.com.cn/forum.php?mod=viewthread&tid=2342&extra=page%3D2</a></span> -->
<!-- 						 -->
<!-- 					{1/block} -->
				</h4>
			</div>
		</div>
		
		
		<div class="ns-main">
			
<div class="set-style">
	<h4>网站基础设置</h4>
	<dl>
		<dt>网站名称：</dt>
		<dd>
			<input id="title" type="text" value="大鵬系統" class="input-common">
		</dd>
	</dl>
	<dl>
		<dt>官方网址：</dt>
		<dd>
			<input id="web_url" type="text" value="http://www.niushop.com.cn/" class="input-common">
		</dd>
	</dl>
	<dl>
		<dt>网站关键字：</dt>
		<dd>
			<p>
				<input id="key_words" type="text" value="" class="input-common long">
			</p>
			<p class="hint">用于网站搜索引擎的优化，关键字之间请用英文逗号分隔</p>
		</dd>
	</dl>
	<dl>
		<dt>网站描述：</dt>
		<dd>
			<textarea name="store_zy" rows="2" id="web_desc" class="textarea-common">开源商城</textarea>
			<p class="hint">关键字最多可输入50字，请用","进行分隔，例如”男装,女装,童装”</p>
		</dd>
	</dl>
	<dl>
		<dt>网站弹出框标题：</dt>
		<dd>
			<p>
				<input id="web_popup_title" type="text" value="" class="input-common" maxlength="15">
			</p>
			<p class="hint">网站弹出框标题，最大不超过15个字符</p>
		</dd>
	</dl>
	<dl>
		<dt>网站logo：</dt>
		<dd>
			<div class="upload-btn-common">
				<div>
					<input class="input-file" name="file_upload" id="uploadImg" type="file" onchange="imgUpload(this);" title="上传">
					<input type="hidden" id="logo" value="public/static/images/default_img_url/logo.png">
				</div>
				<input type="text" id="text_logo" class="input-common" readonly="readonly" value="public/static/images/default_img_url/logo.png">
				<em>上传</em>
				
				<img id="preview_logo" src="/public/static/blue/img/upload-common-select.png" data-src="/public/static/images/default_img_url/logo.png" data-html="true" data-container="body" data-placement="top" data-trigger="manual">

			</div>
			<p class="hint">
				<span>建议使用<i class="important-note">宽280</i>像素-<i class="important-note">高50</i>像素内的<i class="important-note">GIF</i>或<i class="important-note">PNG</i>透明图片</span>
			</p>
		</dd>
	</dl>
	<dl>
		<dt>网站微信分享logo：</dt>
		<dd>
			
			<div class="upload-btn-common">
				<div>
					<input class="input-file" name="file_upload" id="uploadImgwechat_share_logo" type="file" onchange="imgUpload(this);" title="上传">
					<input type="hidden" id="wechat_share_logo" value="">
				</div>
				<input type="text" id="text_wechat_share_logo" class="input-common" readonly="readonly" value="">
				<em>上传</em>
				
				<img id="preview_wechat_share_logo" src="/public/static/blue/img/upload-common-select.png" data-html="true" data-container="body" data-placement="top" data-trigger="manual">

			</div>
			<p class="hint">
				<span>建议使用<i class="important-note">宽80</i>像素-<i class="important-note">高80</i>像素内的正方形图片</span>
			</p>
		</dd>
	</dl>
	<dl>
		<dt>网站二维码：</dt>
		<dd>
			<div class="upload-btn-common">
				<input type="text" id="text_qrcode_path" class="input-common" readonly="readonly" value="upload/qrcode/url.png">
				<img id="preview_qrcode_path" style="margin:0;" src="/public/static/blue/img/upload-common-select.png" data-src="/upload/qrcode/url.png" data-html="true" data-container="body" data-placement="top" data-trigger="manual">
			</div>
		</dd>
	</dl>
	
	<dl>
		<dt>网站公众号二维码：</dt>
		<dd>
			
			<div class="upload-btn-common">
				<div>
					<input class="input-file" name="file_upload" id="uploadImgweb_qrcode" type="file" onchange="imgUpload(this);" title="上传">
					<input type="hidden" id="web_qrcode" value="public/static/images/default_img_url/qrcode.png">
				</div>
				<input type="text" id="text_web_qrcode" class="input-common" readonly="readonly" value="public/static/images/default_img_url/qrcode.png">
				<em>上传</em>
				
				<img id="preview_web_qrcode" src="/public/static/blue/img/upload-common-select.png" data-src="/public/static/images/default_img_url/qrcode.png" data-html="true" data-container="body" data-placement="top" data-trigger="manual">

			</div>
			
			<p class="hint">
				<span>建议使用<i class="important-note">宽100</i>像素-<i class="important-note">高100</i>像素内的<i class="important-note">GIF</i>或<i class="important-note">PNG</i>透明图片</span>
			</p>
			
		</dd>
	</dl>
	<h4>网站联系设置</h4>
	<dl>
		<dt>网站联系方式：</dt>
		<dd>
			<p>
				<input id="web_phone" type="text" value="400-886-7993" class="input-common">
			</p>
		</dd>
	</dl>
	<dl>
		<dt>网站邮箱：</dt>
		<dd>
			<p>
				<input id="web_email" type="text" value="1518079521@qq.com" class="input-common">
			</p>
		</dd>
	</dl>
	
	<dl>
		<dt>网站QQ号：</dt>
		<dd>
			<p>
				<input id="web_qq" type="text" value="1518079521" class="input-common">
			</p>
		</dd>
	</dl>
	<dl>
		<dt>网站微信号：</dt>
		<dd>
			<p>
				<input id="web_weixin" type="text" value="y159753" class="input-common">
			</p>
		</dd>
	</dl>
	<dl>
		<dt>联系地址：</dt>
		<dd>
			<input id="web_address" type="text" value="山西省太原市" class="input-common long">
		</dd>
	</dl>
	<h4>备案与统计设置</h4>
	<dl>
		<dt>网站ICP备案号：</dt>
		<dd>
			<p>
				<input id="web_icp" type="text" value="0300259" class="input-common">
			</p>
		</dd>
	</dl>
	<dl>
		<dt>网站公安备案：</dt>
		<dd>
			<p>
				<input id="web_gov_record" type="text" value="" class="input-common" maxlength="30">				
			</p>
		</dd>
	</dl>
	<dl>
		<dt>网站公安备案链接：</dt>
		<dd>
			<p>
				<input id="web_gov_record_url" type="text" value="" class="input-common" maxlength="200">		
			</p>
		</dd>
	</dl>
	<dl>
		<dt>商城第三方统计代码：</dt>
		<dd>
			<textarea name="store_zy" rows="2" id="third_count" class="textarea-common"></textarea>
			<p class="hint">页面底部可以显示第三方统计</p>
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
