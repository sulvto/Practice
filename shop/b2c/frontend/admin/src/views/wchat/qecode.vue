<template>
    <section class="ns-base-section">
		
		
		
		<div style="position:relative;margin:0;">
			<!-- 面包屑导航 -->
						<div class="breadcrumb-nav">
				<a href="index.html">零基础学IT就来</a>
									<i class="fa fa-angle-right"></i>
					<a href="/wchat/config.html">微信</a>
									<i class="fa fa-angle-right"></i>
					<!-- 需要加跳转链接用这个：http://showfx.niuteam.cn/admin/wchat/qrcode -->
					<a href="javascript:;" style="color:#999;">自定义推广二维码</a>
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
									<p>自定义二维码</p>
									<hr>
																		<h4>功能提示</h4>
									<p class="function-prompts">
<strong>提示：</strong>
会员昵称、头像和二维码属于第三方提供的信息，您可以在这里调整字体和显示的位置，除此之外的信息您可以根据自己的需求放在背景图片中。
</p>
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
<!-- 						<span>自定义二维码</span> -->
<!-- 						 -->
<!-- 					{1/block} -->
				</h4>
			</div>
		</div>
		
		
		<div class="ns-main">
			
<div class="table">
	<input type="hidden" id="id" value="0">
	<div class="l qrcode" id="divBlock">
				<img id="imgLogo">
				<img id="header" src="/public/admin/images/icon-header.png" style="left:59px;top:15px;" ondragstart="return false">
		<img id="logo" src="/public/static/images/default_img_url/logo.png" style="left:120px;top:100px;" ondragstart="return false">
		<img id="code" src="/public/static/images/template_qrcode.png" style="left:70px;top:300px;" ondragstart="return false">
		<span id="name" style="left:150px;top:120px;color:#2B2B2B;font-size:23px;" ondragstart="return false">昵称</span>
	</div>
	<div class="r form">
		
		<div class="set-style">
			<dl>
				<dt>背景图片:</dt>
				
				<dd>
					<div class="upload-btn-common">
						<div>
							<input class="input-file" name="file_upload" id="uploadImg" type="file" onchange="imgUpload(this);" title="上传">
							<input type="hidden" id="Logo" value="">
						</div>
						<input type="text" id="text_Logo" class="input-common" readonly="readonly" value="">
						<em>上传</em>
						
						<img id="preview_Logo" src="/public/static/blue/img/upload-common-select.png" data-html="true" data-container="body" data-placement="top" data-trigger="manual">
		
					</div>
					<p class="hint">背景图必须是<i class="important-note">640*1138</i>的<i class="important-note">png</i>图像；点击下方"保存"按钮后生效。</p>
				</dd>
			</dl>
			<dl>
				<dt>昵称文本颜色:</dt>
				<dd>
					<p><input id="nick_font_color" type="color" value="#2B2B2B" class="input-common-color"></p>
					<p class="error">请输入昵称文本颜色</p>
				</dd>
			</dl>
			<dl>
				<dt>昵称字体大小:</dt>
				<dd>
					<p><input id="nick_font_size" type="number" min="10" max="36" step="1" size="4" value="23" class="input-common harf"><em class="unit">PX</em></p>
					<p class="hint">字体大小的单位为像素（px）</p>
					<p class="error">请输入昵称字体大小</p>
				</dd>
			</dl>
			<dl>
				<dt>是否显示logo:</dt>
				<dd>
					<p><input id="is_logo_show" type="checkbox" class="checkbox" checked="" simpleswitch="0" result="true" style="display: none;"><div class="Switch Switch_FlatRadius On" id="Switch0"><span class="switch-open">是</span><span class="switch-close">否</span></div></p>
				</dd>
			</dl>
			<dl>
				<dt></dt>
				<dd>
					<button class="btn-common btn-big" onclick="save();">保存</button>
					<button class="btn-common-cancle btn-big" onclick="javascript:history.back(-1);">返回</button>
				</dd>
			</dl>
		</div>
	</div>
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
