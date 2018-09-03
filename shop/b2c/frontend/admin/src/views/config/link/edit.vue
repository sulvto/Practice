<template>
    <section class="ns-base-section">
		
		
		
		<div style="position:relative;margin:0;">
			<!-- 面包屑导航 -->
						<div class="breadcrumb-nav">
				<a href="index.html">零基础学IT就来</a>
									<i class="fa fa-angle-right"></i>
					<a href="/config/usernotice.html">网站</a>
									<i class="fa fa-angle-right"></i>
					<!-- 需要加跳转链接用这个：http://showfx.niuteam.cn/admin/config/addlink -->
					<a href="javascript:;" style="color:#999;">添加友情链接</a>
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
									<p>添加友情链接</p>
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
<!-- 						<span>添加友情链接</span> -->
<!-- 						 -->
<!-- 					{1/block} -->
				</h4>
			</div>
		</div>
		
		
		<div class="ns-main">
			
<div class="set-style">
	<dl>
		<dt><span class="color-red">*</span>名称：</dt>
		<dd>
			<input id="link_title" type="text" class="input-common">
			<p class="error">请输入名称</p>
		</dd>
	</dl>
	<dl>
		<dt>图片：</dt>
		<dd>
			<div class="upload-btn-common">
				<div>
					<input class="input-file" name="file_upload" id="uploadLinkPic" type="file" onchange="imgUpload(this);" title="上传">
					<input type="hidden" id="link_pic" value="">
				</div>
				
				<input type="text" id="text_link_pic" class="input-common" readonly="readonly" value="">
				<em>上传</em>								
				<img id="preview_link_pic" src="/public/static/blue/img/upload-common-select.png" data-src="" data-html="true" data-container="body" data-placement="top" data-trigger="manual" data-original-title="" title="">
			</div>
			<p class="hint">
				建议使用宽<i class="important-note">100</i>像素-<i class="important-note">高100</i>像素内的<i class="important-note">GIF</i>或<i class="important-note">PNG</i>透明图片
			</p>
			<p class="error">请上传图片</p>
		</dd>
	</dl>
	<dl>
		<dt>是否新窗口打开：</dt>
		<dd>
			<p>
				<input id="navigationtype" type="checkbox" class="checkbox" simpleswitch="0" result="false" style="display: none;"><div class="Switch Switch_FlatRadius" id="Switch0"><span class="switch-open">是</span><span class="switch-close">否</span></div>
			</p>
		</dd>
	</dl>
	<dl>
		<dt>是否显示：</dt>
		<dd>
			<p>
				<input id="showtype" type="checkbox" class="checkbox" simpleswitch="1" result="false" style="display: none;"><div class="Switch Switch_FlatRadius" id="Switch1"><span class="switch-open">是</span><span class="switch-close">否</span></div>
			</p>
		</dd>
	</dl>
	<dl>
		<dt>链接地址：</dt>
		<dd>
			<p>
				<input id="link_url" type="text" class="input-common long">
			</p>
		</dd>
	</dl>
	<dl>
		<dt>排序：</dt>
		<dd>
			<p>
				<input id="link_sort" type="number" onkeyup="this.value=this.value.replace(/\D/g,'')" class="input-common harf">
			</p>
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
