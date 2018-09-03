<template>
    <section class="ns-base-section" style="">
		
		
		
		<div style="position:relative;margin:0;">
			<!-- 面包屑导航 -->
						<div class="breadcrumb-nav">
				<a href="index.html">零基础学IT就来</a>
									<i class="fa fa-angle-right"></i>
					<a href="/config/usernotice.html">网站</a>
									<i class="fa fa-angle-right"></i>
					<!-- 需要加跳转链接用这个：http://showfx.niuteam.cn/admin/cms/addarticle -->
					<a href="javascript:;" style="color:#999;">添加文章</a>
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
		
		
		<div class="ns-main" style="">
			
<div class="set-style" style="">
	<h4>常规信息</h4>
	<dl>
		<dt><span class="required">*</span>文章标题：</dt>
		<dd>
			<input id="title" class="input-common long" type="text" name="title" maxlength="200">
			<p class="error">请输入文章标题</p>
		</dd>
	</dl>
	<dl>
		<dt>文章短标题：</dt>
		<dd>
			<input id="short_title" class="input-common" type="text">
			<p class="error"></p>
		</dd>
	</dl>
	<dl>
		<dt>文章标签：</dt>
		<dd>
			<input id="tag" class="input-common" type="text">
			<p class="error"></p>
		</dd>
	</dl>
	<dl>
		<dt>文章标题图片：</dt>
		<dd>
			<div class="upload-btn-common">
				<div>
					<input class="input-file" name="file_upload" id="uploadTitleImg" type="file" onchange="imgUpload(this);" title="上传">
					<input type="hidden" id="title_img" value="">
				</div>
				
				<input type="text" id="text_title_img" class="input-common" readonly="readonly" value="">
				<em>上传</em>								
				<img id="preview_title_img" src="/public/static/blue/img/upload-common-select.png" data-src="" data-html="true" data-container="body" data-placement="top" data-trigger="manual" data-original-title="" title="">
			</div>
			<p class="hint">
				建议使用<i class="important-note">宽200</i>像素-<i class="important-note">高60</i>像素内的<i class="important-note">GIF</i>或<i class="important-note">PNG</i>透明图片
			</p>
			<p class="error">请上传图片</p>
		</dd>
	</dl>		
	<dl>
		<dt>文章作者：</dt>
		<dd>
			<input id="author" class="input-common" type="text" name="author">
			<p class="error"></p>
		</dd>
	</dl>
	<dl>
		<dt>文章来源：</dt>
		<dd>
			<input id="source" class="input-common long" type="text">
			<p class="error"></p>
		</dd>
	</dl>
	<dl>
		<dt>文章来源链接：</dt>
		<dd>
			<input id="url" class="input-common" type="text">
			<p class="error"></p>
		</dd>
	</dl>
	<dl>
		<dt><span class="required">*</span>文章分类：</dt>
		<dd>
			<div class="selectric-wrapper selectric-select-common" style="width: 250px;"><div class="selectric-hide-select"><select id="class_id" class="select-common" tabindex="-1">
				<option value="0">请选择</option>
									<option value="1">新闻1</option>
											<option value="2">&nbsp;&nbsp;&nbsp;&nbsp;2</option>
									</select></div><div class="selectric"><span class="selectric-label">请选择</span><button class="selectric-button">▾</button></div><div class="selectric-items" tabindex="-1"><div class="selectric-scroll"><ul><li data-index="0" class="selected" title="请选择">请选择</li><li data-index="1" class="" title="新闻1">新闻1</li><li data-index="2" class="last" title="&nbsp;&nbsp;&nbsp;&nbsp;2">&nbsp;&nbsp;&nbsp;&nbsp;2</li></ul></div></div><input class="selectric-input" tabindex="0"></div>
			<p class="error">请选择分类</p>
		</dd>
	</dl>
	<dl>
		<dt>文章关键字：</dt>
		<dd>
			<input id="keyword" type="text" class="input-common">
			<p class="error"></p>
		</dd>
	</dl>
	<dl>
		<dt>文章摘要：</dt>
		<dd>
			<textarea id="summary" rows="10" cols="10" class="textarea-common"></textarea>
			<p class="error"></p>
		</dd>
	</dl>
	<h4>文章内容</h4>
	<dl style="">
		<dt>文章内容：</dt>
		<dd style="">
			<div id="editor" class="edui-default" style="width: 750px;"><div id="edui1" class="edui-editor  edui-default" style="width: 750px; z-index: 999;"><div id="edui1_toolbarbox" class="edui-editor-toolbarbox edui-default"><div id="edui1_toolbarboxouter" class="edui-editor-toolbarboxouter edui-default"><div class="edui-editor-toolbarboxinner edui-default"><div id="edui2" class="edui-toolbar   edui-default" onselectstart="return false;" onmousedown="return $EDITORUI[&quot;edui2&quot;]._onMouseDown(event, this);" style="user-select: none;"><div id="edui107" class="edui-box edui-button edui-for-fullscreen edui-default"><div id="edui107_state" onmousedown="$EDITORUI[&quot;edui107&quot;].Stateful_onMouseDown(event, this);" onmouseup="$EDITORUI[&quot;edui107&quot;].Stateful_onMouseUp(event, this);" onmouseover="$EDITORUI[&quot;edui107&quot;].Stateful_onMouseOver(event, this);" onmouseout="$EDITORUI[&quot;edui107&quot;].Stateful_onMouseOut(event, this);" class="edui-default"><div class="edui-button-wrap edui-default"><div id="edui107_body" unselectable="on" title="全屏" class="edui-button-body edui-default" onmousedown="return $EDITORUI[&quot;edui107&quot;]._onMouseDown(event, this);" onclick="return $EDITORUI[&quot;edui107&quot;]._onClick(event, this);"><div class="edui-box edui-icon edui-default"></div><div class="edui-box edui-label edui-default"></div></div></div></div></div><div id="edui3" class="edui-box edui-button edui-for-source edui-default"><div id="edui3_state" onmousedown="$EDITORUI[&quot;edui3&quot;].Stateful_onMouseDown(event, this);" onmouseup="$EDITORUI[&quot;edui3&quot;].Stateful_onMouseUp(event, this);" onmouseover="$EDITORUI[&quot;edui3&quot;].Stateful_onMouseOver(event, this);" onmouseout="$EDITORUI[&quot;edui3&quot;].Stateful_onMouseOut(event, this);" class="edui-default"><div class="edui-button-wrap edui-default"><div id="edui3_body" unselectable="on" title="源代码" class="edui-button-body edui-default" onmousedown="return $EDITORUI[&quot;edui3&quot;]._onMouseDown(event, this);" onclick="return $EDITORUI[&quot;edui3&quot;]._onClick(event, this);"><div class="edui-box edui-icon edui-default"></div></div></div></div></div><div id="edui4" class="edui-box edui-button edui-for-bold edui-default"><div id="edui4_state" onmousedown="$EDITORUI[&quot;edui4&quot;].Stateful_onMouseDown(event, this);" onmouseup="$EDITORUI[&quot;edui4&quot;].Stateful_onMouseUp(event, this);" onmouseover="$EDITORUI[&quot;edui4&quot;].Stateful_onMouseOver(event, this);" onmouseout="$EDITORUI[&quot;edui4&quot;].Stateful_onMouseOut(event, this);" class="edui-default"><div class="edui-button-wrap edui-default"><div id="edui4_body" unselectable="on" title="加粗" class="edui-button-body edui-default" onmousedown="return $EDITORUI[&quot;edui4&quot;]._onMouseDown(event, this);" onclick="return $EDITORUI[&quot;edui4&quot;]._onClick(event, this);"><div class="edui-box edui-icon edui-default"></div></div></div></div></div><div id="edui5" class="edui-box edui-button edui-for-italic edui-default"><div id="edui5_state" onmousedown="$EDITORUI[&quot;edui5&quot;].Stateful_onMouseDown(event, this);" onmouseup="$EDITORUI[&quot;edui5&quot;].Stateful_onMouseUp(event, this);" onmouseover="$EDITORUI[&quot;edui5&quot;].Stateful_onMouseOver(event, this);" onmouseout="$EDITORUI[&quot;edui5&quot;].Stateful_onMouseOut(event, this);" class="edui-default"><div class="edui-button-wrap edui-default"><div id="edui5_body" unselectable="on" title="斜体" class="edui-button-body edui-default" onmousedown="return $EDITORUI[&quot;edui5&quot;]._onMouseDown(event, this);" onclick="return $EDITORUI[&quot;edui5&quot;]._onClick(event, this);"><div class="edui-box edui-icon edui-default"></div></div></div></div></div><div id="edui6" class="edui-box edui-button edui-for-underline edui-default"><div id="edui6_state" onmousedown="$EDITORUI[&quot;edui6&quot;].Stateful_onMouseDown(event, this);" onmouseup="$EDITORUI[&quot;edui6&quot;].Stateful_onMouseUp(event, this);" onmouseover="$EDITORUI[&quot;edui6&quot;].Stateful_onMouseOver(event, this);" onmouseout="$EDITORUI[&quot;edui6&quot;].Stateful_onMouseOut(event, this);" class="edui-default"><div class="edui-button-wrap edui-default"><div id="edui6_body" unselectable="on" title="下划线" class="edui-button-body edui-default" onmousedown="return $EDITORUI[&quot;edui6&quot;]._onMouseDown(event, this);" onclick="return $EDITORUI[&quot;edui6&quot;]._onClick(event, this);"><div class="edui-box edui-icon edui-default"></div></div></div></div></div><div id="edui7" class="edui-box edui-button edui-for-strikethrough edui-default"><div id="edui7_state" onmousedown="$EDITORUI[&quot;edui7&quot;].Stateful_onMouseDown(event, this);" onmouseup="$EDITORUI[&quot;edui7&quot;].Stateful_onMouseUp(event, this);" onmouseover="$EDITORUI[&quot;edui7&quot;].Stateful_onMouseOver(event, this);" onmouseout="$EDITORUI[&quot;edui7&quot;].Stateful_onMouseOut(event, this);" class="edui-default"><div class="edui-button-wrap edui-default"><div id="edui7_body" unselectable="on" title="删除线" class="edui-button-body edui-default" onmousedown="return $EDITORUI[&quot;edui7&quot;]._onMouseDown(event, this);" onclick="return $EDITORUI[&quot;edui7&quot;]._onClick(event, this);"><div class="edui-box edui-icon edui-default"></div></div></div></div></div><div id="edui8" class="edui-box edui-splitbutton edui-for-forecolor edui-default edui-colorbutton"><div title="字体颜色" id="edui8_state" onmousedown="$EDITORUI[&quot;edui8&quot;].Stateful_onMouseDown(event, this);" onmouseup="$EDITORUI[&quot;edui8&quot;].Stateful_onMouseUp(event, this);" onmouseover="$EDITORUI[&quot;edui8&quot;].Stateful_onMouseOver(event, this);" onmouseout="$EDITORUI[&quot;edui8&quot;].Stateful_onMouseOut(event, this);" class="edui-default"><div class="edui-splitbutton-body edui-default"><div id="edui8_button_body" class="edui-box edui-button-body edui-default" onclick="$EDITORUI[&quot;edui8&quot;]._onButtonClick(event, this);"><div class="edui-box edui-icon edui-default"></div><div id="edui8_colorlump" class="edui-colorlump"></div></div><div class="edui-box edui-splitborder edui-default"></div><div class="edui-box edui-arrow edui-default" onclick="$EDITORUI[&quot;edui8&quot;]._onArrowClick();"></div></div></div></div><div id="edui11" class="edui-box edui-splitbutton edui-for-backcolor edui-default edui-colorbutton"><div title="背景色" id="edui11_state" onmousedown="$EDITORUI[&quot;edui11&quot;].Stateful_onMouseDown(event, this);" onmouseup="$EDITORUI[&quot;edui11&quot;].Stateful_onMouseUp(event, this);" onmouseover="$EDITORUI[&quot;edui11&quot;].Stateful_onMouseOver(event, this);" onmouseout="$EDITORUI[&quot;edui11&quot;].Stateful_onMouseOut(event, this);" class="edui-default"><div class="edui-splitbutton-body edui-default"><div id="edui11_button_body" class="edui-box edui-button-body edui-default" onclick="$EDITORUI[&quot;edui11&quot;]._onButtonClick(event, this);"><div class="edui-box edui-icon edui-default"></div><div id="edui11_colorlump" class="edui-colorlump"></div></div><div class="edui-box edui-splitborder edui-default"></div><div class="edui-box edui-arrow edui-default" onclick="$EDITORUI[&quot;edui11&quot;]._onArrowClick();"></div></div></div></div><div id="edui14" class="edui-box edui-combox edui-for-fontfamily edui-default"><div title="字体" id="edui14_state" onmousedown="$EDITORUI[&quot;edui14&quot;].Stateful_onMouseDown(event, this);" onmouseup="$EDITORUI[&quot;edui14&quot;].Stateful_onMouseUp(event, this);" onmouseover="$EDITORUI[&quot;edui14&quot;].Stateful_onMouseOver(event, this);" onmouseout="$EDITORUI[&quot;edui14&quot;].Stateful_onMouseOut(event, this);" class="edui-default"><div class="edui-combox-body edui-default"><div id="edui14_button_body" class="edui-box edui-button-body edui-default" onclick="$EDITORUI[&quot;edui14&quot;]._onButtonClick(event, this);">字体</div><div class="edui-box edui-splitborder edui-default"></div><div class="edui-box edui-arrow edui-default" onclick="$EDITORUI[&quot;edui14&quot;]._onArrowClick();"></div></div></div></div><div id="edui27" class="edui-box edui-combox edui-for-fontsize edui-default"><div title="字号" id="edui27_state" onmousedown="$EDITORUI[&quot;edui27&quot;].Stateful_onMouseDown(event, this);" onmouseup="$EDITORUI[&quot;edui27&quot;].Stateful_onMouseUp(event, this);" onmouseover="$EDITORUI[&quot;edui27&quot;].Stateful_onMouseOver(event, this);" onmouseout="$EDITORUI[&quot;edui27&quot;].Stateful_onMouseOut(event, this);" class="edui-default"><div class="edui-combox-body edui-default"><div id="edui27_button_body" class="edui-box edui-button-body edui-default" onclick="$EDITORUI[&quot;edui27&quot;]._onButtonClick(event, this);">字号</div><div class="edui-box edui-splitborder edui-default"></div><div class="edui-box edui-arrow edui-default" onclick="$EDITORUI[&quot;edui27&quot;]._onArrowClick();"></div></div></div></div><div id="edui38" class="edui-box edui-combox edui-for-paragraph edui-default"><div title="段落格式" id="edui38_state" onmousedown="$EDITORUI[&quot;edui38&quot;].Stateful_onMouseDown(event, this);" onmouseup="$EDITORUI[&quot;edui38&quot;].Stateful_onMouseUp(event, this);" onmouseover="$EDITORUI[&quot;edui38&quot;].Stateful_onMouseOver(event, this);" onmouseout="$EDITORUI[&quot;edui38&quot;].Stateful_onMouseOut(event, this);" class="edui-default"><div class="edui-combox-body edui-default"><div id="edui38_button_body" class="edui-box edui-button-body edui-default" onclick="$EDITORUI[&quot;edui38&quot;]._onButtonClick(event, this);">段落格式</div><div class="edui-box edui-splitborder edui-default"></div><div class="edui-box edui-arrow edui-default" onclick="$EDITORUI[&quot;edui38&quot;]._onArrowClick();"></div></div></div></div><div id="edui47" class="edui-box edui-button edui-for-justifyleft edui-default"><div id="edui47_state" onmousedown="$EDITORUI[&quot;edui47&quot;].Stateful_onMouseDown(event, this);" onmouseup="$EDITORUI[&quot;edui47&quot;].Stateful_onMouseUp(event, this);" onmouseover="$EDITORUI[&quot;edui47&quot;].Stateful_onMouseOver(event, this);" onmouseout="$EDITORUI[&quot;edui47&quot;].Stateful_onMouseOut(event, this);" class="edui-default"><div class="edui-button-wrap edui-default"><div id="edui47_body" unselectable="on" title="居左对齐" class="edui-button-body edui-default" onmousedown="return $EDITORUI[&quot;edui47&quot;]._onMouseDown(event, this);" onclick="return $EDITORUI[&quot;edui47&quot;]._onClick(event, this);"><div class="edui-box edui-icon edui-default"></div><div class="edui-box edui-label edui-default"></div></div></div></div></div><div id="edui48" class="edui-box edui-button edui-for-justifycenter edui-default"><div id="edui48_state" onmousedown="$EDITORUI[&quot;edui48&quot;].Stateful_onMouseDown(event, this);" onmouseup="$EDITORUI[&quot;edui48&quot;].Stateful_onMouseUp(event, this);" onmouseover="$EDITORUI[&quot;edui48&quot;].Stateful_onMouseOver(event, this);" onmouseout="$EDITORUI[&quot;edui48&quot;].Stateful_onMouseOut(event, this);" class="edui-default"><div class="edui-button-wrap edui-default"><div id="edui48_body" unselectable="on" title="居中对齐" class="edui-button-body edui-default" onmousedown="return $EDITORUI[&quot;edui48&quot;]._onMouseDown(event, this);" onclick="return $EDITORUI[&quot;edui48&quot;]._onClick(event, this);"><div class="edui-box edui-icon edui-default"></div><div class="edui-box edui-label edui-default"></div></div></div></div></div><div id="edui49" class="edui-box edui-button edui-for-justifyright edui-default"><div id="edui49_state" onmousedown="$EDITORUI[&quot;edui49&quot;].Stateful_onMouseDown(event, this);" onmouseup="$EDITORUI[&quot;edui49&quot;].Stateful_onMouseUp(event, this);" onmouseover="$EDITORUI[&quot;edui49&quot;].Stateful_onMouseOver(event, this);" onmouseout="$EDITORUI[&quot;edui49&quot;].Stateful_onMouseOut(event, this);" class="edui-default"><div class="edui-button-wrap edui-default"><div id="edui49_body" unselectable="on" title="居右对齐" class="edui-button-body edui-default" onmousedown="return $EDITORUI[&quot;edui49&quot;]._onMouseDown(event, this);" onclick="return $EDITORUI[&quot;edui49&quot;]._onClick(event, this);"><div class="edui-box edui-icon edui-default"></div><div class="edui-box edui-label edui-default"></div></div></div></div></div><div id="edui50" class="edui-box edui-button edui-for-superscript edui-default"><div id="edui50_state" onmousedown="$EDITORUI[&quot;edui50&quot;].Stateful_onMouseDown(event, this);" onmouseup="$EDITORUI[&quot;edui50&quot;].Stateful_onMouseUp(event, this);" onmouseover="$EDITORUI[&quot;edui50&quot;].Stateful_onMouseOver(event, this);" onmouseout="$EDITORUI[&quot;edui50&quot;].Stateful_onMouseOut(event, this);" class="edui-default"><div class="edui-button-wrap edui-default"><div id="edui50_body" unselectable="on" title="上标" class="edui-button-body edui-default" onmousedown="return $EDITORUI[&quot;edui50&quot;]._onMouseDown(event, this);" onclick="return $EDITORUI[&quot;edui50&quot;]._onClick(event, this);"><div class="edui-box edui-icon edui-default"></div></div></div></div></div><div id="edui51" class="edui-box edui-button edui-for-blockquote edui-default"><div id="edui51_state" onmousedown="$EDITORUI[&quot;edui51&quot;].Stateful_onMouseDown(event, this);" onmouseup="$EDITORUI[&quot;edui51&quot;].Stateful_onMouseUp(event, this);" onmouseover="$EDITORUI[&quot;edui51&quot;].Stateful_onMouseOver(event, this);" onmouseout="$EDITORUI[&quot;edui51&quot;].Stateful_onMouseOut(event, this);" class="edui-default"><div class="edui-button-wrap edui-default"><div id="edui51_body" unselectable="on" title="引用" class="edui-button-body edui-default" onmousedown="return $EDITORUI[&quot;edui51&quot;]._onMouseDown(event, this);" onclick="return $EDITORUI[&quot;edui51&quot;]._onClick(event, this);"><div class="edui-box edui-icon edui-default"></div></div></div></div></div><div id="edui52" class="edui-box edui-button edui-for-selectall edui-default"><div id="edui52_state" onmousedown="$EDITORUI[&quot;edui52&quot;].Stateful_onMouseDown(event, this);" onmouseup="$EDITORUI[&quot;edui52&quot;].Stateful_onMouseUp(event, this);" onmouseover="$EDITORUI[&quot;edui52&quot;].Stateful_onMouseOver(event, this);" onmouseout="$EDITORUI[&quot;edui52&quot;].Stateful_onMouseOut(event, this);" class="edui-default"><div class="edui-button-wrap edui-default"><div id="edui52_body" unselectable="on" title="全选" class="edui-button-body edui-default" onmousedown="return $EDITORUI[&quot;edui52&quot;]._onMouseDown(event, this);" onclick="return $EDITORUI[&quot;edui52&quot;]._onClick(event, this);"><div class="edui-box edui-icon edui-default"></div></div></div></div></div><div id="edui57" class="edui-box edui-button edui-for-preview edui-default"><div id="edui57_state" onmousedown="$EDITORUI[&quot;edui57&quot;].Stateful_onMouseDown(event, this);" onmouseup="$EDITORUI[&quot;edui57&quot;].Stateful_onMouseUp(event, this);" onmouseover="$EDITORUI[&quot;edui57&quot;].Stateful_onMouseOver(event, this);" onmouseout="$EDITORUI[&quot;edui57&quot;].Stateful_onMouseOut(event, this);" class="edui-default"><div class="edui-button-wrap edui-default"><div id="edui57_body" unselectable="on" title="预览" class="edui-button-body edui-default" onmousedown="return $EDITORUI[&quot;edui57&quot;]._onMouseDown(event, this);" onclick="return $EDITORUI[&quot;edui57&quot;]._onClick(event, this);"><div class="edui-box edui-icon edui-default"></div><div class="edui-box edui-label edui-default"></div></div></div></div></div><div id="edui58" class="edui-box edui-button edui-for-removeformat edui-default"><div id="edui58_state" onmousedown="$EDITORUI[&quot;edui58&quot;].Stateful_onMouseDown(event, this);" onmouseup="$EDITORUI[&quot;edui58&quot;].Stateful_onMouseUp(event, this);" onmouseover="$EDITORUI[&quot;edui58&quot;].Stateful_onMouseOver(event, this);" onmouseout="$EDITORUI[&quot;edui58&quot;].Stateful_onMouseOut(event, this);" class="edui-default"><div class="edui-button-wrap edui-default"><div id="edui58_body" unselectable="on" title="清除格式" class="edui-button-body edui-default" onmousedown="return $EDITORUI[&quot;edui58&quot;]._onMouseDown(event, this);" onclick="return $EDITORUI[&quot;edui58&quot;]._onClick(event, this);"><div class="edui-box edui-icon edui-default"></div></div></div></div></div><div id="edui59" class="edui-box edui-splitbutton edui-for-inserttable edui-default"><div title="插入表格" id="edui59_state" onmousedown="$EDITORUI[&quot;edui59&quot;].Stateful_onMouseDown(event, this);" onmouseup="$EDITORUI[&quot;edui59&quot;].Stateful_onMouseUp(event, this);" onmouseover="$EDITORUI[&quot;edui59&quot;].Stateful_onMouseOver(event, this);" onmouseout="$EDITORUI[&quot;edui59&quot;].Stateful_onMouseOut(event, this);" class="edui-default"><div class="edui-splitbutton-body edui-default"><div id="edui59_button_body" class="edui-box edui-button-body edui-default" onclick="$EDITORUI[&quot;edui59&quot;]._onButtonClick(event, this);"><div class="edui-box edui-icon edui-default"></div></div><div class="edui-box edui-splitborder edui-default"></div><div class="edui-box edui-arrow edui-default" onclick="$EDITORUI[&quot;edui59&quot;]._onArrowClick();"></div></div></div></div><div id="edui62" class="edui-box edui-button edui-for-unlink edui-default"><div id="edui62_state" onmousedown="$EDITORUI[&quot;edui62&quot;].Stateful_onMouseDown(event, this);" onmouseup="$EDITORUI[&quot;edui62&quot;].Stateful_onMouseUp(event, this);" onmouseover="$EDITORUI[&quot;edui62&quot;].Stateful_onMouseOver(event, this);" onmouseout="$EDITORUI[&quot;edui62&quot;].Stateful_onMouseOut(event, this);" class="edui-default"><div class="edui-button-wrap edui-default"><div id="edui62_body" unselectable="on" title="取消链接" class="edui-button-body edui-default" onmousedown="return $EDITORUI[&quot;edui62&quot;]._onMouseDown(event, this);" onclick="return $EDITORUI[&quot;edui62&quot;]._onClick(event, this);"><div class="edui-box edui-icon edui-default"></div></div></div></div></div><div id="edui63" class="edui-box edui-button edui-for-insertrow edui-default"><div id="edui63_state" onmousedown="$EDITORUI[&quot;edui63&quot;].Stateful_onMouseDown(event, this);" onmouseup="$EDITORUI[&quot;edui63&quot;].Stateful_onMouseUp(event, this);" onmouseover="$EDITORUI[&quot;edui63&quot;].Stateful_onMouseOver(event, this);" onmouseout="$EDITORUI[&quot;edui63&quot;].Stateful_onMouseOut(event, this);" class="edui-default"><div class="edui-button-wrap edui-default"><div id="edui63_body" unselectable="on" title="前插入行" class="edui-button-body edui-default" onmousedown="return $EDITORUI[&quot;edui63&quot;]._onMouseDown(event, this);" onclick="return $EDITORUI[&quot;edui63&quot;]._onClick(event, this);"><div class="edui-box edui-icon edui-default"></div></div></div></div></div><div id="edui64" class="edui-box edui-button edui-for-insertcol edui-default"><div id="edui64_state" onmousedown="$EDITORUI[&quot;edui64&quot;].Stateful_onMouseDown(event, this);" onmouseup="$EDITORUI[&quot;edui64&quot;].Stateful_onMouseUp(event, this);" onmouseover="$EDITORUI[&quot;edui64&quot;].Stateful_onMouseOver(event, this);" onmouseout="$EDITORUI[&quot;edui64&quot;].Stateful_onMouseOut(event, this);" class="edui-default"><div class="edui-button-wrap edui-default"><div id="edui64_body" unselectable="on" title="前插入列" class="edui-button-body edui-default" onmousedown="return $EDITORUI[&quot;edui64&quot;]._onMouseDown(event, this);" onclick="return $EDITORUI[&quot;edui64&quot;]._onClick(event, this);"><div class="edui-box edui-icon edui-default"></div></div></div></div></div><div id="edui65" class="edui-box edui-button edui-for-mergeright edui-default"><div id="edui65_state" onmousedown="$EDITORUI[&quot;edui65&quot;].Stateful_onMouseDown(event, this);" onmouseup="$EDITORUI[&quot;edui65&quot;].Stateful_onMouseUp(event, this);" onmouseover="$EDITORUI[&quot;edui65&quot;].Stateful_onMouseOver(event, this);" onmouseout="$EDITORUI[&quot;edui65&quot;].Stateful_onMouseOut(event, this);" class="edui-default"><div class="edui-button-wrap edui-default"><div id="edui65_body" unselectable="on" title="右合并单元格" class="edui-button-body edui-default" onmousedown="return $EDITORUI[&quot;edui65&quot;]._onMouseDown(event, this);" onclick="return $EDITORUI[&quot;edui65&quot;]._onClick(event, this);"><div class="edui-box edui-icon edui-default"></div></div></div></div></div><div id="edui66" class="edui-box edui-button edui-for-mergedown edui-default"><div id="edui66_state" onmousedown="$EDITORUI[&quot;edui66&quot;].Stateful_onMouseDown(event, this);" onmouseup="$EDITORUI[&quot;edui66&quot;].Stateful_onMouseUp(event, this);" onmouseover="$EDITORUI[&quot;edui66&quot;].Stateful_onMouseOver(event, this);" onmouseout="$EDITORUI[&quot;edui66&quot;].Stateful_onMouseOut(event, this);" class="edui-default"><div class="edui-button-wrap edui-default"><div id="edui66_body" unselectable="on" title="下合并单元格" class="edui-button-body edui-default" onmousedown="return $EDITORUI[&quot;edui66&quot;]._onMouseDown(event, this);" onclick="return $EDITORUI[&quot;edui66&quot;]._onClick(event, this);"><div class="edui-box edui-icon edui-default"></div></div></div></div></div><div id="edui67" class="edui-box edui-button edui-for-deleterow edui-default"><div id="edui67_state" onmousedown="$EDITORUI[&quot;edui67&quot;].Stateful_onMouseDown(event, this);" onmouseup="$EDITORUI[&quot;edui67&quot;].Stateful_onMouseUp(event, this);" onmouseover="$EDITORUI[&quot;edui67&quot;].Stateful_onMouseOver(event, this);" onmouseout="$EDITORUI[&quot;edui67&quot;].Stateful_onMouseOut(event, this);" class="edui-default"><div class="edui-button-wrap edui-default"><div id="edui67_body" unselectable="on" title="删除行" class="edui-button-body edui-default" onmousedown="return $EDITORUI[&quot;edui67&quot;]._onMouseDown(event, this);" onclick="return $EDITORUI[&quot;edui67&quot;]._onClick(event, this);"><div class="edui-box edui-icon edui-default"></div></div></div></div></div><div id="edui68" class="edui-box edui-button edui-for-deletecol edui-default"><div id="edui68_state" onmousedown="$EDITORUI[&quot;edui68&quot;].Stateful_onMouseDown(event, this);" onmouseup="$EDITORUI[&quot;edui68&quot;].Stateful_onMouseUp(event, this);" onmouseover="$EDITORUI[&quot;edui68&quot;].Stateful_onMouseOver(event, this);" onmouseout="$EDITORUI[&quot;edui68&quot;].Stateful_onMouseOut(event, this);" class="edui-default"><div class="edui-button-wrap edui-default"><div id="edui68_body" unselectable="on" title="删除列" class="edui-button-body edui-default" onmousedown="return $EDITORUI[&quot;edui68&quot;]._onMouseDown(event, this);" onclick="return $EDITORUI[&quot;edui68&quot;]._onClick(event, this);"><div class="edui-box edui-icon edui-default"></div></div></div></div></div><div id="edui69" class="edui-box edui-button edui-for-splittorows edui-default"><div id="edui69_state" onmousedown="$EDITORUI[&quot;edui69&quot;].Stateful_onMouseDown(event, this);" onmouseup="$EDITORUI[&quot;edui69&quot;].Stateful_onMouseUp(event, this);" onmouseover="$EDITORUI[&quot;edui69&quot;].Stateful_onMouseOver(event, this);" onmouseout="$EDITORUI[&quot;edui69&quot;].Stateful_onMouseOut(event, this);" class="edui-default"><div class="edui-button-wrap edui-default"><div id="edui69_body" unselectable="on" title="拆分成行" class="edui-button-body edui-default" onmousedown="return $EDITORUI[&quot;edui69&quot;]._onMouseDown(event, this);" onclick="return $EDITORUI[&quot;edui69&quot;]._onClick(event, this);"><div class="edui-box edui-icon edui-default"></div></div></div></div></div><div id="edui70" class="edui-box edui-button edui-for-splittocols edui-default"><div id="edui70_state" onmousedown="$EDITORUI[&quot;edui70&quot;].Stateful_onMouseDown(event, this);" onmouseup="$EDITORUI[&quot;edui70&quot;].Stateful_onMouseUp(event, this);" onmouseover="$EDITORUI[&quot;edui70&quot;].Stateful_onMouseOver(event, this);" onmouseout="$EDITORUI[&quot;edui70&quot;].Stateful_onMouseOut(event, this);" class="edui-default"><div class="edui-button-wrap edui-default"><div id="edui70_body" unselectable="on" title="拆分成列" class="edui-button-body edui-default" onmousedown="return $EDITORUI[&quot;edui70&quot;]._onMouseDown(event, this);" onclick="return $EDITORUI[&quot;edui70&quot;]._onClick(event, this);"><div class="edui-box edui-icon edui-default"></div></div></div></div></div><div id="edui71" class="edui-box edui-button edui-for-splittocells edui-default"><div id="edui71_state" onmousedown="$EDITORUI[&quot;edui71&quot;].Stateful_onMouseDown(event, this);" onmouseup="$EDITORUI[&quot;edui71&quot;].Stateful_onMouseUp(event, this);" onmouseover="$EDITORUI[&quot;edui71&quot;].Stateful_onMouseOver(event, this);" onmouseout="$EDITORUI[&quot;edui71&quot;].Stateful_onMouseOut(event, this);" class="edui-default"><div class="edui-button-wrap edui-default"><div id="edui71_body" unselectable="on" title="完全拆分单元格" class="edui-button-body edui-default" onmousedown="return $EDITORUI[&quot;edui71&quot;]._onMouseDown(event, this);" onclick="return $EDITORUI[&quot;edui71&quot;]._onClick(event, this);"><div class="edui-box edui-icon edui-default"></div></div></div></div></div><div id="edui72" class="edui-box edui-button edui-for-mergecells edui-default"><div id="edui72_state" onmousedown="$EDITORUI[&quot;edui72&quot;].Stateful_onMouseDown(event, this);" onmouseup="$EDITORUI[&quot;edui72&quot;].Stateful_onMouseUp(event, this);" onmouseover="$EDITORUI[&quot;edui72&quot;].Stateful_onMouseOver(event, this);" onmouseout="$EDITORUI[&quot;edui72&quot;].Stateful_onMouseOut(event, this);" class="edui-default"><div class="edui-button-wrap edui-default"><div id="edui72_body" unselectable="on" title="合并多个单元格" class="edui-button-body edui-default" onmousedown="return $EDITORUI[&quot;edui72&quot;]._onMouseDown(event, this);" onclick="return $EDITORUI[&quot;edui72&quot;]._onClick(event, this);"><div class="edui-box edui-icon edui-default"></div></div></div></div></div><div id="edui73" class="edui-box edui-button edui-for-deletetable edui-default"><div id="edui73_state" onmousedown="$EDITORUI[&quot;edui73&quot;].Stateful_onMouseDown(event, this);" onmouseup="$EDITORUI[&quot;edui73&quot;].Stateful_onMouseUp(event, this);" onmouseover="$EDITORUI[&quot;edui73&quot;].Stateful_onMouseOver(event, this);" onmouseout="$EDITORUI[&quot;edui73&quot;].Stateful_onMouseOut(event, this);" class="edui-default"><div class="edui-button-wrap edui-default"><div id="edui73_body" unselectable="on" title="删除表格" class="edui-button-body edui-default" onmousedown="return $EDITORUI[&quot;edui73&quot;]._onMouseDown(event, this);" onclick="return $EDITORUI[&quot;edui73&quot;]._onClick(event, this);"><div class="edui-box edui-icon edui-default"></div></div></div></div></div><div id="edui74" class="edui-box edui-button edui-for-cleardoc edui-default"><div id="edui74_state" onmousedown="$EDITORUI[&quot;edui74&quot;].Stateful_onMouseDown(event, this);" onmouseup="$EDITORUI[&quot;edui74&quot;].Stateful_onMouseUp(event, this);" onmouseover="$EDITORUI[&quot;edui74&quot;].Stateful_onMouseOver(event, this);" onmouseout="$EDITORUI[&quot;edui74&quot;].Stateful_onMouseOut(event, this);" class="edui-default"><div class="edui-button-wrap edui-default"><div id="edui74_body" unselectable="on" title="清空文档" class="edui-button-body edui-default" onmousedown="return $EDITORUI[&quot;edui74&quot;]._onMouseDown(event, this);" onclick="return $EDITORUI[&quot;edui74&quot;]._onClick(event, this);"><div class="edui-box edui-icon edui-default"></div><div class="edui-box edui-label edui-default"></div></div></div></div></div><div id="edui79" class="edui-box edui-button edui-for-link edui-default"><div id="edui79_state" onmousedown="$EDITORUI[&quot;edui79&quot;].Stateful_onMouseDown(event, this);" onmouseup="$EDITORUI[&quot;edui79&quot;].Stateful_onMouseUp(event, this);" onmouseover="$EDITORUI[&quot;edui79&quot;].Stateful_onMouseOver(event, this);" onmouseout="$EDITORUI[&quot;edui79&quot;].Stateful_onMouseOut(event, this);" class="edui-default"><div class="edui-button-wrap edui-default"><div id="edui79_body" unselectable="on" title="超链接" class="edui-button-body edui-default" onmousedown="return $EDITORUI[&quot;edui79&quot;]._onMouseDown(event, this);" onclick="return $EDITORUI[&quot;edui79&quot;]._onClick(event, this);"><div class="edui-box edui-icon edui-default"></div><div class="edui-box edui-label edui-default"></div></div></div></div></div><div id="edui80" class="edui-box edui-splitbutton edui-for-emotion edui-default"><div title="表情" id="edui80_state" onmousedown="$EDITORUI[&quot;edui80&quot;].Stateful_onMouseDown(event, this);" onmouseup="$EDITORUI[&quot;edui80&quot;].Stateful_onMouseUp(event, this);" onmouseover="$EDITORUI[&quot;edui80&quot;].Stateful_onMouseOver(event, this);" onmouseout="$EDITORUI[&quot;edui80&quot;].Stateful_onMouseOut(event, this);" class="edui-default"><div class="edui-splitbutton-body edui-default"><div id="edui80_button_body" class="edui-box edui-button-body edui-default" onclick="$EDITORUI[&quot;edui80&quot;]._onButtonClick(event, this);"><div class="edui-box edui-icon edui-default"></div></div><div class="edui-box edui-splitborder edui-default"></div><div class="edui-box edui-arrow edui-default" onclick="$EDITORUI[&quot;edui80&quot;]._onArrowClick();"></div></div></div></div><div id="edui86" class="edui-box edui-button edui-for-insertvideo edui-default"><div id="edui86_state" onmousedown="$EDITORUI[&quot;edui86&quot;].Stateful_onMouseDown(event, this);" onmouseup="$EDITORUI[&quot;edui86&quot;].Stateful_onMouseUp(event, this);" onmouseover="$EDITORUI[&quot;edui86&quot;].Stateful_onMouseOver(event, this);" onmouseout="$EDITORUI[&quot;edui86&quot;].Stateful_onMouseOut(event, this);" class="edui-default"><div class="edui-button-wrap edui-default"><div id="edui86_body" unselectable="on" title="视频" class="edui-button-body edui-default" onmousedown="return $EDITORUI[&quot;edui86&quot;]._onMouseDown(event, this);" onclick="return $EDITORUI[&quot;edui86&quot;]._onClick(event, this);"><div class="edui-box edui-icon edui-default"></div><div class="edui-box edui-label edui-default"></div></div></div></div></div><div id="edui87" class="edui-box edui-menubutton edui-for-insertorderedlist edui-default"><div title="有序列表" id="edui87_state" onmousedown="$EDITORUI[&quot;edui87&quot;].Stateful_onMouseDown(event, this);" onmouseup="$EDITORUI[&quot;edui87&quot;].Stateful_onMouseUp(event, this);" onmouseover="$EDITORUI[&quot;edui87&quot;].Stateful_onMouseOver(event, this);" onmouseout="$EDITORUI[&quot;edui87&quot;].Stateful_onMouseOut(event, this);" class="edui-default"><div class="edui-menubutton-body edui-default"><div id="edui87_button_body" class="edui-box edui-button-body edui-default" onclick="$EDITORUI[&quot;edui87&quot;]._onButtonClick(event, this);"><div class="edui-box edui-icon edui-default"></div></div><div class="edui-box edui-splitborder edui-default"></div><div class="edui-box edui-arrow edui-default" onclick="$EDITORUI[&quot;edui87&quot;]._onArrowClick();"></div></div></div></div><div id="edui100" class="edui-box edui-menubutton edui-for-insertunorderedlist edui-default"><div title="无序列表" id="edui100_state" onmousedown="$EDITORUI[&quot;edui100&quot;].Stateful_onMouseDown(event, this);" onmouseup="$EDITORUI[&quot;edui100&quot;].Stateful_onMouseUp(event, this);" onmouseover="$EDITORUI[&quot;edui100&quot;].Stateful_onMouseOver(event, this);" onmouseout="$EDITORUI[&quot;edui100&quot;].Stateful_onMouseOut(event, this);" class="edui-default"><div class="edui-menubutton-body edui-default"><div id="edui100_button_body" class="edui-box edui-button-body edui-default" onclick="$EDITORUI[&quot;edui100&quot;]._onButtonClick(event, this);"><div class="edui-box edui-icon edui-default"></div></div><div class="edui-box edui-splitborder edui-default"></div><div class="edui-box edui-arrow edui-default" onclick="$EDITORUI[&quot;edui100&quot;]._onArrowClick();"></div></div></div></div><div id="edui108" class="edui-box edui-button edui-for-directionalityltr edui-default"><div id="edui108_state" onmousedown="$EDITORUI[&quot;edui108&quot;].Stateful_onMouseDown(event, this);" onmouseup="$EDITORUI[&quot;edui108&quot;].Stateful_onMouseUp(event, this);" onmouseover="$EDITORUI[&quot;edui108&quot;].Stateful_onMouseOver(event, this);" onmouseout="$EDITORUI[&quot;edui108&quot;].Stateful_onMouseOut(event, this);" class="edui-default"><div class="edui-button-wrap edui-default"><div id="edui108_body" unselectable="on" title="从左向右输入" class="edui-button-body edui-default" onmousedown="return $EDITORUI[&quot;edui108&quot;]._onMouseDown(event, this);" onclick="return $EDITORUI[&quot;edui108&quot;]._onClick(event, this);"><div class="edui-box edui-icon edui-default"></div><div class="edui-box edui-label edui-default"></div></div></div></div></div><div id="edui109" class="edui-box edui-button edui-for-directionalityrtl edui-default"><div id="edui109_state" onmousedown="$EDITORUI[&quot;edui109&quot;].Stateful_onMouseDown(event, this);" onmouseup="$EDITORUI[&quot;edui109&quot;].Stateful_onMouseUp(event, this);" onmouseover="$EDITORUI[&quot;edui109&quot;].Stateful_onMouseOver(event, this);" onmouseout="$EDITORUI[&quot;edui109&quot;].Stateful_onMouseOut(event, this);" class="edui-default"><div class="edui-button-wrap edui-default"><div id="edui109_body" unselectable="on" title="从右向左输入" class="edui-button-body edui-default" onmousedown="return $EDITORUI[&quot;edui109&quot;]._onMouseDown(event, this);" onclick="return $EDITORUI[&quot;edui109&quot;]._onClick(event, this);"><div class="edui-box edui-icon edui-default"></div><div class="edui-box edui-label edui-default"></div></div></div></div></div><div id="edui110" class="edui-box edui-button edui-for-imagenone edui-default"><div id="edui110_state" onmousedown="$EDITORUI[&quot;edui110&quot;].Stateful_onMouseDown(event, this);" onmouseup="$EDITORUI[&quot;edui110&quot;].Stateful_onMouseUp(event, this);" onmouseover="$EDITORUI[&quot;edui110&quot;].Stateful_onMouseOver(event, this);" onmouseout="$EDITORUI[&quot;edui110&quot;].Stateful_onMouseOut(event, this);" class="edui-default"><div class="edui-button-wrap edui-default"><div id="edui110_body" unselectable="on" title="默认" class="edui-button-body edui-default" onmousedown="return $EDITORUI[&quot;edui110&quot;]._onMouseDown(event, this);" onclick="return $EDITORUI[&quot;edui110&quot;]._onClick(event, this);"><div class="edui-box edui-icon edui-default"></div><div class="edui-box edui-label edui-default"></div></div></div></div></div><div id="edui111" class="edui-box edui-button edui-for-imageleft edui-default"><div id="edui111_state" onmousedown="$EDITORUI[&quot;edui111&quot;].Stateful_onMouseDown(event, this);" onmouseup="$EDITORUI[&quot;edui111&quot;].Stateful_onMouseUp(event, this);" onmouseover="$EDITORUI[&quot;edui111&quot;].Stateful_onMouseOver(event, this);" onmouseout="$EDITORUI[&quot;edui111&quot;].Stateful_onMouseOut(event, this);" class="edui-default"><div class="edui-button-wrap edui-default"><div id="edui111_body" unselectable="on" title="左浮动" class="edui-button-body edui-default" onmousedown="return $EDITORUI[&quot;edui111&quot;]._onMouseDown(event, this);" onclick="return $EDITORUI[&quot;edui111&quot;]._onClick(event, this);"><div class="edui-box edui-icon edui-default"></div><div class="edui-box edui-label edui-default"></div></div></div></div></div><div id="edui112" class="edui-box edui-button edui-for-imageright edui-default"><div id="edui112_state" onmousedown="$EDITORUI[&quot;edui112&quot;].Stateful_onMouseDown(event, this);" onmouseup="$EDITORUI[&quot;edui112&quot;].Stateful_onMouseUp(event, this);" onmouseover="$EDITORUI[&quot;edui112&quot;].Stateful_onMouseOver(event, this);" onmouseout="$EDITORUI[&quot;edui112&quot;].Stateful_onMouseOut(event, this);" class="edui-default"><div class="edui-button-wrap edui-default"><div id="edui112_body" unselectable="on" title="右浮动" class="edui-button-body edui-default" onmousedown="return $EDITORUI[&quot;edui112&quot;]._onMouseDown(event, this);" onclick="return $EDITORUI[&quot;edui112&quot;]._onClick(event, this);"><div class="edui-box edui-icon edui-default"></div><div class="edui-box edui-label edui-default"></div></div></div></div></div><div id="edui113" class="edui-box edui-button edui-for-imagecenter edui-default"><div id="edui113_state" onmousedown="$EDITORUI[&quot;edui113&quot;].Stateful_onMouseDown(event, this);" onmouseup="$EDITORUI[&quot;edui113&quot;].Stateful_onMouseUp(event, this);" onmouseover="$EDITORUI[&quot;edui113&quot;].Stateful_onMouseOver(event, this);" onmouseout="$EDITORUI[&quot;edui113&quot;].Stateful_onMouseOut(event, this);" class="edui-default"><div class="edui-button-wrap edui-default"><div id="edui113_body" unselectable="on" title="居中" class="edui-button-body edui-default" onmousedown="return $EDITORUI[&quot;edui113&quot;]._onMouseDown(event, this);" onclick="return $EDITORUI[&quot;edui113&quot;]._onClick(event, this);"><div class="edui-box edui-icon edui-default"></div><div class="edui-box edui-label edui-default"></div></div></div></div></div><div id="edui114" class="edui-box edui-menubutton edui-for-lineheight edui-default"><div title="行间距" id="edui114_state" onmousedown="$EDITORUI[&quot;edui114&quot;].Stateful_onMouseDown(event, this);" onmouseup="$EDITORUI[&quot;edui114&quot;].Stateful_onMouseUp(event, this);" onmouseover="$EDITORUI[&quot;edui114&quot;].Stateful_onMouseOver(event, this);" onmouseout="$EDITORUI[&quot;edui114&quot;].Stateful_onMouseOut(event, this);" class="edui-default"><div class="edui-menubutton-body edui-default"><div id="edui114_button_body" class="edui-box edui-button-body edui-default" onclick="$EDITORUI[&quot;edui114&quot;]._onButtonClick(event, this);"><div class="edui-box edui-icon edui-default"></div></div><div class="edui-box edui-splitborder edui-default"></div><div class="edui-box edui-arrow edui-default" onclick="$EDITORUI[&quot;edui114&quot;]._onArrowClick();"></div></div></div></div><div id="edui123" class="edui-box edui-combox edui-for-customstyle edui-default"><div title="自定义标题" id="edui123_state" onmousedown="$EDITORUI[&quot;edui123&quot;].Stateful_onMouseDown(event, this);" onmouseup="$EDITORUI[&quot;edui123&quot;].Stateful_onMouseUp(event, this);" onmouseover="$EDITORUI[&quot;edui123&quot;].Stateful_onMouseOver(event, this);" onmouseout="$EDITORUI[&quot;edui123&quot;].Stateful_onMouseOut(event, this);" class="edui-default"><div class="edui-combox-body edui-default"><div id="edui123_button_body" class="edui-box edui-button-body edui-default" onclick="$EDITORUI[&quot;edui123&quot;]._onButtonClick(event, this);">自定义标题</div><div class="edui-box edui-splitborder edui-default"></div><div class="edui-box edui-arrow edui-default" onclick="$EDITORUI[&quot;edui123&quot;]._onArrowClick();"></div></div></div></div><div id="edui133" class="edui-box edui-button edui-for-insertimage edui-default"><div id="edui133_state" onmousedown="$EDITORUI[&quot;edui133&quot;].Stateful_onMouseDown(event, this);" onmouseup="$EDITORUI[&quot;edui133&quot;].Stateful_onMouseUp(event, this);" onmouseover="$EDITORUI[&quot;edui133&quot;].Stateful_onMouseOver(event, this);" onmouseout="$EDITORUI[&quot;edui133&quot;].Stateful_onMouseOut(event, this);" class="edui-default"><div class="edui-button-wrap edui-default"><div id="edui133_body" unselectable="on" title="多图上传" class="edui-button-body edui-default" onmousedown="return $EDITORUI[&quot;edui133&quot;]._onMouseDown(event, this);" onclick="return $EDITORUI[&quot;edui133&quot;]._onClick(event, this);"><div class="edui-box edui-icon edui-default"></div><div class="edui-box edui-label edui-default"></div></div></div></div></div></div></div></div><div id="edui1_toolbarmsg" class="edui-editor-toolbarmsg edui-default" style="display:none;"><div id="edui1_upload_dialog" class="edui-editor-toolbarmsg-upload edui-default" onclick="$EDITORUI[&quot;edui1&quot;].showWordImageDialog();">点击上传</div><div class="edui-editor-toolbarmsg-close edui-default" onclick="$EDITORUI[&quot;edui1&quot;].hideToolbarMsg();">x</div><div id="edui1_toolbarmsg_label" class="edui-editor-toolbarmsg-label edui-default"></div><div style="height:0;overflow:hidden;clear:both;" class="edui-default"></div></div><div id="edui1_message_holder" class="edui-editor-messageholder edui-default" style="top: 58px; z-index: 1000;"></div></div><div id="edui1_iframeholder" class="edui-editor-iframeholder edui-default" style="width: 750px; height: 450px; z-index: 999; overflow: hidden;"><iframe id="ueditor_0" width="100%" height="100%" frameborder="0" src="javascript:void(function(){document.open();document.write(&quot;<!DOCTYPE html><html xmlns='http://www.w3.org/1999/xhtml' class='view' ><head><style type='text/css'>.view{padding:0;word-wrap:break-word;cursor:text;height:90%;}
body{margin:8px;font-family:sans-serif;font-size:16px;}p{margin:5px 0;}</style><link rel='stylesheet' type='text/css' href='/public/admin/js/ueditor/themes/iframe.css'/></head><body class='view' ></body><script type='text/javascript'  id='_initialScript'>setTimeout(function(){editor = window.parent.UE.instants['ueditorInstant0'];editor._setup(document);},0);var _tmpScript = document.getElementById('_initialScript');_tmpScript.parentNode.removeChild(_tmpScript);</script></html>&quot;);document.close();}())"></iframe></div><div id="edui1_bottombar" class="edui-editor-bottomContainer edui-default"><table class="edui-default"><tbody class="edui-default"><tr class="edui-default"><td id="edui1_elementpath" class="edui-editor-bottombar edui-default"></td><td id="edui1_wordcount" class="edui-editor-wordcount edui-default">字数统计</td><td id="edui1_scale" class="edui-editor-scale edui-default" style="display: none;"><div class="edui-editor-icon edui-default"></div></td></tr></tbody></table></div><div id="edui1_scalelayer" class="edui-default"></div></div></div>
			<p class="error"></p>
		</dd>
	</dl>
	<dl>
		<dt>文章附件：</dt>
		<dd>
			<div class="upload-btn-common">
				<div>
					<input class="input-file" name="file_upload" id="uploadAttachment" type="file" onchange="imgUpload(this);" title="上传" only-type=".zip">
					<input type="hidden" id="attachment" value="">
				</div>
				
				<input type="text" id="text_attachment" class="input-common" readonly="readonly" value="">
				<em>上传</em>								
			</div>
			<p class="hint">上传附件类型必须是<i class="important-note">zip</i>格式</p>
			<p class="error"></p>
		</dd>
	</dl>
	<dl class="hide">
		<dt>相关文章：</dt>
		<dd>
			<input id="article_id_array" class="input-common" type="text">
			<p class="hint"></p>
			<p class="error"></p>
		</dd>
	</dl>
	<h4>文章阐述</h4>
	<dl>
		<dt>是否推荐：</dt>
		<dd>
			<p>
				<input id="commend_flag" type="checkbox" onchange="setIntegralAjax();" class="checkbox" simpleswitch="0" result="false" style="display: none;"><div class="Switch Switch_FlatRadius" id="Switch0"><span class="switch-open">是</span><span class="switch-close">否</span></div>
			</p>
			<p class="error"></p>
		</dd>
	</dl>
	<dl>
		<dt>是否允许评论：</dt>
		<dd>
			<p>
				<input id="comment_flag" type="checkbox" class="checkbox" simpleswitch="1" result="false" style="display: none;"><div class="Switch Switch_FlatRadius" id="Switch1"><span class="switch-open">是</span><span class="switch-close">否</span></div>
			</p>
			<p class="error"></p>
		</dd>
	</dl>
	<dl>
		<dt>文章排序：</dt>
		<dd>
			<input id="sort" type="number" class="input-common harf" min="0" onkeyup="value=value.replace(/[^\d+(\.\d+)?]/g,'')">
			<p class="error"></p>
		</dd>
	</dl>
	<dl>
		<dt>文章点击量：</dt>
		<dd>
			<input id="click" type="number" class="input-common harf" min="0" onkeyup="value=value.replace(/[^\d+(\.\d+)?]/g,'')"><em class="unit">次</em>
			<p class="error"></p>
		</dd>
	</dl>
	<dl>
		<dt>文章评论数：</dt>
		<dd>
			<input id="comment_count" class="input-common harf" type="number" min="0" onkeyup="value=value.replace(/[^\d+(\.\d+)?]/g,'')"><em class="unit">次</em>
			<p class="error"></p>
		</dd>
	</dl>
	<dl>
		<dt>文章分享数：</dt>
		<dd>
			<input id="share_count" class="input-common harf" type="number" min="0" onkeyup="value=value.replace(/[^\d+(\.\d+)?]/g,'')"><em class="unit">次</em>
			<p class="error"></p>
		</dd>
	</dl>
	<dl>
		<dt></dt>
		<dd>
			<button class="btn-common btn-big" onclick="save(1)">保存</button>
			<!-- <button class="btn-common btn-big" onclick="save(2)" >保存并预览</button> -->
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
