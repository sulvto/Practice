<template>
	
	<section class="ns-base-section">
		
		
		
		<div style="position:relative;margin:0;">
			<!-- 面包屑导航 -->
						<div class="breadcrumb-nav">
				<a href="index.html">大鵬系統</a>
									<i class="fa fa-angle-right"></i>
					<a href="/config/webconfig.html">设置</a>
									<i class="fa fa-angle-right"></i>
					<!-- 需要加跳转链接用这个：http://showfx.niuteam.cn/admin/express/updateexpresscompany -->
					<a href="javascript:;" style="color:#999;">物流公司修改</a>
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
									<p>物流公司修改排序</p>
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
<!-- 						<span>物流公司修改排序</span> -->
<!-- 						 -->
<!-- 					{1/block} -->
				</h4>
			</div>
		</div>
		
		
		<div class="ns-main">
			
<div class="set-style">
	<dl>
		<dt><span class="required">*</span>物流公司名称：</dt>
		<dd>
			<p>
				<input id="company_name" type="text" value="百世快递" class="input-common">
			</p>
			<p class="error">请输入物流公司名称</p>

		</dd>
	</dl>
	<dl>
		<dt><span class="required">*</span>物流公司编号：</dt>
		<dd>
			<p><input id="express_no" type="text" value="BST" class="input-common"></p>
			<p class="error">请输入物流公司编号</p>
		</dd>
	</dl>
	<dl>
		<dt>联系电话：</dt>
		<dd>
			<p><input id="phone" type="text" value="" class="input-common"></p>
			<p class="error">联系电话格式不正确</p>
		</dd>
	</dl>
	<dl>
		<dt>物流公司logo：</dt>
		<dd>
			<div class="upload-btn-common">
				<div>
					<input class="input-file" name="file_upload" id="uploadLogo" type="file" onchange="imgUpload(this);" title="上传">
					<input type="hidden" id="logo" value="">
				</div>
				
				<input type="text" id="text_logo" class="input-common" readonly="readonly" value="">
				<em>上传</em>								
				<img id="preview_logo" src="/public/static/blue/img/upload-common-select.png" data-src="" data-html="true" data-container="body" data-placement="top" data-trigger="manual" data-original-title="" title="">
			</div>
			<p class="hint">
				建议使用<i class="important-note">宽100</i>像素-<i class="important-note">高100</i>像素内的<i class="important-note">GIF</i>或<i class="important-note">PNG</i>透明图片；点击下方"保存"按钮后生效。
			</p>
			<p class="error">请上传图片</p>
		</dd>
	</dl>
	<dl>
		<dt>排序：</dt>
		<dd>
			<p><input id="orders" type="number" value="0" class="input-common harf"></p>
			<p class="error">请输入排列序号</p>
		</dd>
	</dl>
	<dl>
		<dt>是否启用物流：</dt>
		<dd><input id="is_enabled" type="checkbox" class="checkbox" checked="checked" simpleswitch="0" result="true" style="display: none;"><div class="Switch Switch_FlatRadius On" id="Switch0"><span class="switch-open">是</span><span class="switch-close">否</span></div></dd>
	</dl>
	
	<dl>
		<dt>是否设置为默认：</dt>
		<dd><input id="is_default" type="checkbox" class="checkbox" checked="checked" simpleswitch="1" result="true" style="display: none;"><div class="Switch Switch_FlatRadius On" id="Switch1"><span class="switch-open">是</span><span class="switch-close">否</span></div></dd>
	</dl>
	<dl>
		<dt></dt>
		<dd>
			<button class="btn-common btn-big" onclick="updataExpressCompanyAjax();">保存</button>
			<button class="btn-common-cancle btn-big" onclick="javascript:history.back(-1);">返回</button>
		</dd>
	</dl>

</div>
<input type="hidden" id="co_id" value="4">

		</div>
		
	</section>
</template>
