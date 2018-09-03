<template>
    <section class="ns-base-section">
		
		
		
		<div style="position:relative;margin:0;">
			<!-- 面包屑导航 -->
						<div class="breadcrumb-nav">
				<a href="index.html">零基础学IT就来</a>
									<i class="fa fa-angle-right"></i>
					<a href="/config/webconfig.html">设置</a>
									<i class="fa fa-angle-right"></i>
					<!-- 需要加跳转链接用这个：http://showfx.niuteam.cn/admin/config/pictureuploadsetting -->
					<a href="javascript:;" style="color:#999;">上传设置</a>
							</div>
						<!-- 三级导航菜单 -->
			
								<nav class="ns-third-menu">
					<ul>
												<li onclick="location.href='/config/webconfig.html';">网站设置</li>
													<li onclick="location.href='/config/seoConfig.html';">SEO设置</li>
													<li onclick="location.href='/config/copyrightinfo.html';">版权</li>
													<li onclick="location.href='/config/visitconfig.html';">运营</li>
													<li onclick="location.href='/config/registerandvisit.html';">注册与访问</li>
													<li class="selected" onclick="location.href='/config/pictureuploadsetting.html';">上传设置</li>
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
	<!-- 附件上传 开始-->
	<h4>上传方式设置</h4>
	<dl>
		<dt>保存方式：</dt>
		<dd>
			<div class="selectric-wrapper selectric-select-common" style="width: 250px;"><div class="selectric-hide-select"><select id="type" onchange="selectConfig();" class="select-common" tabindex="-1">
				<option value="1">本地</option>
				<option value="2">七牛</option>
			</select></div><div class="selectric"><span class="selectric-label">本地</span><button class="selectric-button">▾</button></div><div class="selectric-items" tabindex="-1"><div class="selectric-scroll"><ul><li data-index="0" class="selected" title="本地">本地</li><li data-index="1" class="last" title="七牛">七牛</li></ul></div></div><input class="selectric-input" tabindex="0"></div>
			<p class="hint qiniu-hint" style="display: none;">七牛云构建了基于容器的计算平台，并基于容器平台构建了功能丰富且开放性的智能媒体云平台。</p>
			<p class="hint qiniu-hint" style="display: none;">您只需考虑怎么处理数据，而无需考虑数据的规模和系统性能。</p>
		</dd>
	</dl>
	<div class="config-box config-data2" style="display: none;">
		<dl>
			<dt>Accesskey：</dt>
			<dd>
				<input id="Accesskey" type="text" value="" class="input-common long">
				<p class="hint">用于签名的公钥</p>
			</dd>
		</dl>
		<dl>
			<dt>Secretkey：</dt>
			<dd>
				<input id="Secretkey" type="text" value="" class="input-common long">
				<p class="hint">用于签名的私钥</p>
			</dd>
		</dl>
		<dl>
			<dt>Bucket：</dt>
			<dd>
				<input id="Bucket" type="text" value="" class="input-common long">
				<p class="hint">请保证bucket为可公共读取的</p>
			</dd>
		</dl>
		<dl>
			<dt>Url：</dt>
			<dd>
				<input id="QiniuUrl" type="text" value="" class="input-common long">
				<p class="hint">七牛支持用户自定义访问域名。注：url开头加<i class="important-note">http://</i>或<i class="important-note">https://</i>，结尾不加 ‘<i class="important-note">/</i>’，例：http://abc.com</p>
			</dd>
		</dl>
	</div>
	<!-- 附件上传 结束-->
	<h4>默认图片设置</h4>
	<dl>
		<dt>默认商品图片：</dt>
		<dd>
			<div class="upload-btn-common">
				<div>
					<input class="input-file" name="file_upload" id="uploadDefault_goods_img" type="file" onchange="imgUpload(this);">
					<input type="hidden" id="default_goods_img" value="upload/web_common/3b22fee90512e91bfc1586e016a7d8ea_360_360.png">
				</div>
				<input type="text" id="text_default_goods_img" class="input-common" readonly="readonly" value="upload/web_common/3b22fee90512e91bfc1586e016a7d8ea_360_360.png">
				<em>上传</em>
				
				<img id="preview_default_goods_img" src="/public/static/blue/img/upload-common-select.png" data-src="/upload/web_common/3b22fee90512e91bfc1586e016a7d8ea_360_360.png" data-html="true" data-container="body" data-placement="top" data-trigger="manual">

			</div>

			<p class="hint">
				<span>建议使用<i class="important-note">宽360</i>像素-<i class="important-note">高360</i>像素内的<i class="important-note">GIF</i>或<i class="important-note">PNG</i>正方形图片</span>
			</p>
		</dd>
	</dl>
	<dl>
		<dt>默认会员头像：</dt>
		<dd>
			<div class="upload-btn-common">
				<div>
					<input class="input-file" name="file_upload" id="uploadDefault_headimg" type="file" onchange="imgUpload(this);">
					<input type="hidden" id="default_headimg" value="upload/web_common/419b57e5802bd1f3b8fdedb81fdb5fce_360_360.png">
				</div>
				<input type="text" id="text_default_headimg" class="input-common" readonly="readonly" value="upload/web_common/419b57e5802bd1f3b8fdedb81fdb5fce_360_360.png">
				<em>上传</em>
				
				<img id="preview_default_headimg" src="/public/static/blue/img/upload-common-select.png" data-src="/upload/web_common/419b57e5802bd1f3b8fdedb81fdb5fce_360_360.png" data-html="true" data-container="body" data-placement="top" data-trigger="manual">

			</div>

			<p class="hint">
				<span>建议使用<i class="important-note">宽120</i>像素-<i class="important-note">高120</i>像素内的<i class="important-note">JPG</i>或<i class="important-note">PNG</i>正方形图片</span>
			</p>
		</dd>
	</dl>
	<dl>
		<dt>默认文章缩略图：</dt>
		<dd>
			<div class="upload-btn-common">
				<div>
					<input class="input-file" name="file_upload" id="uploadDefault_cms_thumbnail" type="file" onchange="imgUpload(this);">
					<input type="hidden" id="default_cms_thumbnail" value="">
				</div>
				<input type="text" id="text_default_cms_thumbnail" class="input-common" readonly="readonly" value="">
				<em>上传</em>
				
				<img id="preview_default_cms_thumbnail" src="/public/static/blue/img/upload-common-select.png" data-html="true" data-container="body" data-placement="top" data-trigger="manual">

			</div>

			<p class="hint">
				<span>建议使用<i class="important-note">宽120</i>像素-<i class="important-note">高120</i>像素内的<i class="important-note">JPG</i>或<i class="important-note">PNG</i>正方形图片</span>
			</p>
		</dd>
	</dl>
	<h4>上传参数设置</h4>
	<dl>
		<dt>商品图片添加水印：</dt>
		<dd>
			<input id="watermark" type="checkbox" class="checkbox" simpleswitch="0" result="false" style="display: none;"><div class="Switch Switch_FlatRadius" id="Switch0"><span class="switch-open">是</span><span class="switch-close">否</span></div>
		</dd>
	</dl>
	<dl>
		<dt>水印图片：</dt>
		<dd>
			<div class="upload-btn-common">
				<div>
					<input class="input-file" name="file_upload" id="uploadDefault_watermark" type="file" onchange="imgUpload(this);">
					<input type="hidden" id="default_watermark" value="">
				</div>
				<input type="text" id="text_default_watermark" class="input-common" readonly="readonly" value="">
				<em>上传</em>
				
				<img id="preview_default_watermark" src="/public/static/blue/img/upload-common-select.png" data-html="true" data-container="body" data-placement="top" data-trigger="manual">

			</div>

			<p class="hint">
				<span>建议使用<i class="important-note">宽150</i>像素-<i class="important-note">高50</i>像素内的<i class="important-note">JPG</i>或<i class="important-note">PNG</i>图片</span>
			</p>
		</dd>
	</dl>
	<dl>
		<dt>水印透明度：</dt>
		<dd>
			<input id="transparency" type="number" min="0" step="1" value="100" class="input-common harf"><em class="unit">%</em>
			<p class="hint">水印的透明度，可选值为0-100。当设置为100时则为不透明。</p>
		</dd>
	</dl>
	<dl>
		<dt>水印位置：</dt>
		<dd>
			<div class="controls">
						<label class="radio inline normal">
				<i class="checkbox-common">
					<input type="checkbox" name="water_position" value="1">
				</i>
				左上角
			</label>
						<label class="radio inline normal">
				<i class="checkbox-common ">
					<input type="checkbox" name="water_position" value="3">
				</i>
				右上角
			</label>
						<label class="radio inline normal">
				<i class="checkbox-common">	
					<input type="checkbox" name="water_position" value="5">
				</i>
				居中
			</label>
							<br>
						<label class="radio inline normal">
				<i class="checkbox-common">
					<input type="checkbox" name="water_position" value="7">
				</i>
				左下角
			</label>
						<label class="radio inline normal">
				<i class="checkbox-common selected">
					<input type="checkbox" name="water_position" value="9" checked="">
				</i>
				右下角
			</label>
						</div>
			<p class="hint">请选择水印位置</p>
		</dd>
	</dl>
	
	<dl style="display:none;">
		<dt>支持格式后缀：</dt>
		<dd>
			<textarea rows="2" id="upload_ext" class="textarea input-common" maxlength="50"></textarea>
			<p class="hint">支持上传文件格式后缀(后缀之间以,隔开)。</p>
		</dd>
	</dl>
	<dl style="display:none;">
		<dt>文件大小限制：</dt>
		<dd>
			<input id="upload_size" type="number" min="0" step="1" value="" class="input-common">
			<p class="hint">注意考虑php.ini的配置(0为不限制)</p>
		</dd>
	</dl>
	<!-- 附近上传 开始 -->
	<!-- 图片设置 开始 -->
	<dl>
		<dt>裁剪设置：</dt>
		<dd>
			<div class="controls">
			<!-- 			<label class="radio inline normal"><input type="checkbox" name="thumb_type" value="1">等比例缩放</label>
			 -->
						<label class="radio inline normal">
				<i class="checkbox-common selected">
					<input type="checkbox" name="thumb_type" value="2" checked="">
				</i>
				缩放后填充
			</label>
						<label class="radio inline normal">
				<i class="checkbox-common">
					<input type="checkbox" name="thumb_type" value="3">
				</i>
				居中裁剪
			</label>
						<label class="radio inline normal">
				<i class="checkbox-common">
					<input type="checkbox" name="thumb_type" value="4">
				</i>
				左上角裁剪
			</label>
							<br>
						<label class="radio inline normal">
				<i class="checkbox-common">
					<input type="checkbox" name="thumb_type" value="5">
				</i>
				右下角裁剪
			</label>
						<label class="radio inline normal">
				<i class="checkbox-common">
					<input type="checkbox" name="thumb_type" value="6">
				</i>
				固定尺寸缩放
			</label>
						</div>
			<p class="hint">请选择图片裁剪类型。</p>
		</dd>
	</dl>
	<!-- 图片设置 结束-->
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
