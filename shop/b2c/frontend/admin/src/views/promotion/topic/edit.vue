<template>
	
	<section class="ns-base-section" style="">
		
		
		
		<div style="position:relative;margin:0;">
			<!-- 面包屑导航 -->
						<div class="breadcrumb-nav">
				<a href="index.html">大鵬系統</a>
									<i class="fa fa-angle-right"></i>
					<a href="/promotion/coupontypelist.html">营销</a>
									<i class="fa fa-angle-right"></i>
					<!-- 需要加跳转链接用这个：http://showfx.niuteam.cn/admin/promotion/updatetopic -->
					<a href="javascript:;" style="color:#999;">修改专题活动</a>
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
			
<div class="space-10"></div>
<div class="set-style" style="">
<h4>专题活动信息</h4>
	<dl>
		<dt><span style="color:red;">*</span>&nbsp;&nbsp;专题名称：</dt>
		<dd><input type="text" id="topic_name" value="@A" class="input-common long"><p class="error" style="display: none;">请输入专题名称</p></dd>
		
	</dl>
	<dl>
		<dt>关键字：</dt>
		<dd>
			<input type="text" id="keyword" maxlength="500" class="input-common" value="11">
			<p class="error" style="display: none;">请输入关键字</p>
		</dd>
	</dl>
	<dl>
		<dt>描述：</dt>
		<dd>
			<!-- <input type="text" id="desc" maxlength="500" class="input-common" value=""/> -->
			<textarea name="store_zy" rows="2" id="desc" class="textarea-common">upload/ueditor/image/20180810/1533881615274606.jpg</textarea>
			<p class="error" style="display: none;">请输入专题描述</p>
		</dd>
	</dl>
	<dl>
		<dt><span style="color:red;">*</span>&nbsp;&nbsp;图像：</dt>
		<dd>
				<div class="upload-btn-common">
					<div>
						<input class="input-file" name="file_upload" id="uploadpicture" type="file" onchange="imgUpload(this);" title="上传">
						<input type="hidden" id="picture_img" value="upload/common/1533095180.jpg">
					</div>
					
					<input type="text" id="text_picture_img" class="input-common" readonly="readonly" value="upload/common/1533095180.jpg">
					<em>上传</em>								
					<img id="preview_picture_img" src="/public/static/blue/img/upload-common-select.png" data-src="/upload/common/1533095180.jpg" data-html="true" data-container="body" data-placement="top" data-trigger="manual" data-original-title="" title="">
				</div>
				<p class="error" style="display: none;">请上传图像图片</p>
				<p class="hint">专题活动列表中单独专题背景,<i class="important-note">建议使用宽580像素-高300像素</i></p>

		</dd>
	</dl>
	<dl>
		<dt><span style="color:red;">*</span>&nbsp;&nbsp;条幅：</dt>
		<dd>
				<div class="upload-btn-common">
					<div>
						<input class="input-file" name="file_upload" id="uploadscroll" type="file" onchange="imgUpload(this);" title="上传">
						<input type="hidden" id="scroll_img" value="upload/common/1533095182.jpg">
					</div>
					
					<input type="text" id="text_scroll_img" class="input-common" readonly="readonly" value="upload/common/1533095182.jpg">
					<em>上传</em>								
					<img id="preview_scroll_img" src="/public/static/blue/img/upload-common-select.png" data-src="/upload/common/1533095182.jpg" data-html="true" data-container="body" data-placement="top" data-trigger="manual" data-original-title="" title="">
				</div>
				<p class="error" style="display: none;">请上传条幅图片</p>
				<p class="hint"><i class="important-note">专题商品列表中的头部展示</i></p>

		</dd>
	</dl>
	<dl>
		<dt>背景图：</dt>
		<dd>
				<div class="upload-btn-common">
					<div>
						<input class="input-file" name="file_upload" id="uploadbackground" type="file" onchange="imgUpload(this);" title="上传">
						<input type="hidden" id="background_img" value="">
					</div>
					
					<input type="text" id="text_background_img" class="input-common" readonly="readonly" value="">
					<em>上传</em>								
					<img id="preview_background_img" src="/public/static/blue/img/upload-common-select.png" data-src="" data-html="true" data-container="body" data-placement="top" data-trigger="manual" data-original-title="" title="">
				</div>
				<p class="error" style="display: none;">请上传图片</p>
				<p class="hint"><i class="important-note">专题商品列表中背景图</i></p>
		</dd>
	</dl>
	<dl>
		<dt>背景色：</dt>
		<dd>
			<input type="color" id="background_color" maxlength="10" class="input-common-color" value="#000000">
			<p class="error" style="display: none;">请输入专题名称</p>
		</dd>
	</dl>
	<dl>
		<dt><span style="color:red;">*</span>&nbsp;&nbsp;有效时间：</dt>
		<dd>
			<input class="input-medium input-common harf" type="text" id="start_time" value="2018-08-01 11:46:46" style="width:250px;" onclick="WdatePicker({skin:'twoer',dateFmt:'yyyy-MM-dd HH:mm:ss'})">
			<span class="mlr5">至</span>
			<input class="input-medium input-common harf" size="15" type="text" id="end_time" value="2018-08-14 11:46:49" style="width:250px;" onclick="WdatePicker({skin:'twoer',dateFmt:'yyyy-MM-dd HH:mm:ss'})">
			<p class="error" style="display: none;">请输入活动有效期</p>
		</dd>
	</dl>
	
	
	<h4>高级设置</h4>
	<dl style="">
		<dt>专题介绍：</dt>
		<dd style="">
			<div id="editor" class="edui-default" style="width: 100%;"><div id="edui1" class="edui-editor  edui-default" style="width: 100%; z-index: 999;"><div id="edui1_toolbarbox" class="edui-editor-toolbarbox edui-default"><div id="edui1_toolbarboxouter" class="edui-editor-toolbarboxouter edui-default"><div class="edui-editor-toolbarboxinner edui-default"><div id="edui2" class="edui-toolbar   edui-default" onselectstart="return false;" onmousedown="return $EDITORUI[&quot;edui2&quot;]._onMouseDown(event, this);" style="user-select: none;"><div id="edui107" class="edui-box edui-button edui-for-fullscreen edui-default"><div id="edui107_state" onmousedown="$EDITORUI[&quot;edui107&quot;].Stateful_onMouseDown(event, this);" onmouseup="$EDITORUI[&quot;edui107&quot;].Stateful_onMouseUp(event, this);" onmouseover="$EDITORUI[&quot;edui107&quot;].Stateful_onMouseOver(event, this);" onmouseout="$EDITORUI[&quot;edui107&quot;].Stateful_onMouseOut(event, this);" class="edui-default"><div class="edui-button-wrap edui-default"><div id="edui107_body" unselectable="on" title="全屏" class="edui-button-body edui-default" onmousedown="return $EDITORUI[&quot;edui107&quot;]._onMouseDown(event, this);" onclick="return $EDITORUI[&quot;edui107&quot;]._onClick(event, this);"><div class="edui-box edui-icon edui-default"></div><div class="edui-box edui-label edui-default"></div></div></div></div></div><div id="edui3" class="edui-box edui-button edui-for-source edui-default"><div id="edui3_state" onmousedown="$EDITORUI[&quot;edui3&quot;].Stateful_onMouseDown(event, this);" onmouseup="$EDITORUI[&quot;edui3&quot;].Stateful_onMouseUp(event, this);" onmouseover="$EDITORUI[&quot;edui3&quot;].Stateful_onMouseOver(event, this);" onmouseout="$EDITORUI[&quot;edui3&quot;].Stateful_onMouseOut(event, this);" class="edui-default"><div class="edui-button-wrap edui-default"><div id="edui3_body" unselectable="on" title="源代码" class="edui-button-body edui-default" onmousedown="return $EDITORUI[&quot;edui3&quot;]._onMouseDown(event, this);" onclick="return $EDITORUI[&quot;edui3&quot;]._onClick(event, this);"><div class="edui-box edui-icon edui-default"></div></div></div></div></div><div id="edui4" class="edui-box edui-button edui-for-bold edui-default"><div id="edui4_state" onmousedown="$EDITORUI[&quot;edui4&quot;].Stateful_onMouseDown(event, this);" onmouseup="$EDITORUI[&quot;edui4&quot;].Stateful_onMouseUp(event, this);" onmouseover="$EDITORUI[&quot;edui4&quot;].Stateful_onMouseOver(event, this);" onmouseout="$EDITORUI[&quot;edui4&quot;].Stateful_onMouseOut(event, this);" class="edui-default"><div class="edui-button-wrap edui-default"><div id="edui4_body" unselectable="on" title="加粗" class="edui-button-body edui-default" onmousedown="return $EDITORUI[&quot;edui4&quot;]._onMouseDown(event, this);" onclick="return $EDITORUI[&quot;edui4&quot;]._onClick(event, this);"><div class="edui-box edui-icon edui-default"></div></div></div></div></div><div id="edui5" class="edui-box edui-button edui-for-italic edui-default"><div id="edui5_state" onmousedown="$EDITORUI[&quot;edui5&quot;].Stateful_onMouseDown(event, this);" onmouseup="$EDITORUI[&quot;edui5&quot;].Stateful_onMouseUp(event, this);" onmouseover="$EDITORUI[&quot;edui5&quot;].Stateful_onMouseOver(event, this);" onmouseout="$EDITORUI[&quot;edui5&quot;].Stateful_onMouseOut(event, this);" class="edui-default"><div class="edui-button-wrap edui-default"><div id="edui5_body" unselectable="on" title="斜体" class="edui-button-body edui-default" onmousedown="return $EDITORUI[&quot;edui5&quot;]._onMouseDown(event, this);" onclick="return $EDITORUI[&quot;edui5&quot;]._onClick(event, this);"><div class="edui-box edui-icon edui-default"></div></div></div></div></div><div id="edui6" class="edui-box edui-button edui-for-underline edui-default"><div id="edui6_state" onmousedown="$EDITORUI[&quot;edui6&quot;].Stateful_onMouseDown(event, this);" onmouseup="$EDITORUI[&quot;edui6&quot;].Stateful_onMouseUp(event, this);" onmouseover="$EDITORUI[&quot;edui6&quot;].Stateful_onMouseOver(event, this);" onmouseout="$EDITORUI[&quot;edui6&quot;].Stateful_onMouseOut(event, this);" class="edui-default"><div class="edui-button-wrap edui-default"><div id="edui6_body" unselectable="on" title="下划线" class="edui-button-body edui-default" onmousedown="return $EDITORUI[&quot;edui6&quot;]._onMouseDown(event, this);" onclick="return $EDITORUI[&quot;edui6&quot;]._onClick(event, this);"><div class="edui-box edui-icon edui-default"></div></div></div></div></div><div id="edui7" class="edui-box edui-button edui-for-strikethrough edui-default"><div id="edui7_state" onmousedown="$EDITORUI[&quot;edui7&quot;].Stateful_onMouseDown(event, this);" onmouseup="$EDITORUI[&quot;edui7&quot;].Stateful_onMouseUp(event, this);" onmouseover="$EDITORUI[&quot;edui7&quot;].Stateful_onMouseOver(event, this);" onmouseout="$EDITORUI[&quot;edui7&quot;].Stateful_onMouseOut(event, this);" class="edui-default"><div class="edui-button-wrap edui-default"><div id="edui7_body" unselectable="on" title="删除线" class="edui-button-body edui-default" onmousedown="return $EDITORUI[&quot;edui7&quot;]._onMouseDown(event, this);" onclick="return $EDITORUI[&quot;edui7&quot;]._onClick(event, this);"><div class="edui-box edui-icon edui-default"></div></div></div></div></div><div id="edui8" class="edui-box edui-splitbutton edui-for-forecolor edui-default edui-colorbutton"><div title="字体颜色" id="edui8_state" onmousedown="$EDITORUI[&quot;edui8&quot;].Stateful_onMouseDown(event, this);" onmouseup="$EDITORUI[&quot;edui8&quot;].Stateful_onMouseUp(event, this);" onmouseover="$EDITORUI[&quot;edui8&quot;].Stateful_onMouseOver(event, this);" onmouseout="$EDITORUI[&quot;edui8&quot;].Stateful_onMouseOut(event, this);" class="edui-default"><div class="edui-splitbutton-body edui-default"><div id="edui8_button_body" class="edui-box edui-button-body edui-default" onclick="$EDITORUI[&quot;edui8&quot;]._onButtonClick(event, this);"><div class="edui-box edui-icon edui-default"></div><div id="edui8_colorlump" class="edui-colorlump"></div></div><div class="edui-box edui-splitborder edui-default"></div><div class="edui-box edui-arrow edui-default" onclick="$EDITORUI[&quot;edui8&quot;]._onArrowClick();"></div></div></div></div><div id="edui11" class="edui-box edui-splitbutton edui-for-backcolor edui-default edui-colorbutton"><div title="背景色" id="edui11_state" onmousedown="$EDITORUI[&quot;edui11&quot;].Stateful_onMouseDown(event, this);" onmouseup="$EDITORUI[&quot;edui11&quot;].Stateful_onMouseUp(event, this);" onmouseover="$EDITORUI[&quot;edui11&quot;].Stateful_onMouseOver(event, this);" onmouseout="$EDITORUI[&quot;edui11&quot;].Stateful_onMouseOut(event, this);" class="edui-default"><div class="edui-splitbutton-body edui-default"><div id="edui11_button_body" class="edui-box edui-button-body edui-default" onclick="$EDITORUI[&quot;edui11&quot;]._onButtonClick(event, this);"><div class="edui-box edui-icon edui-default"></div><div id="edui11_colorlump" class="edui-colorlump"></div></div><div class="edui-box edui-splitborder edui-default"></div><div class="edui-box edui-arrow edui-default" onclick="$EDITORUI[&quot;edui11&quot;]._onArrowClick();"></div></div></div></div><div id="edui14" class="edui-box edui-combox edui-for-fontfamily edui-default"><div title="字体" id="edui14_state" onmousedown="$EDITORUI[&quot;edui14&quot;].Stateful_onMouseDown(event, this);" onmouseup="$EDITORUI[&quot;edui14&quot;].Stateful_onMouseUp(event, this);" onmouseover="$EDITORUI[&quot;edui14&quot;].Stateful_onMouseOver(event, this);" onmouseout="$EDITORUI[&quot;edui14&quot;].Stateful_onMouseOut(event, this);" class="edui-default"><div class="edui-combox-body edui-default"><div id="edui14_button_body" class="edui-box edui-button-body edui-default" onclick="$EDITORUI[&quot;edui14&quot;]._onButtonClick(event, this);">字体</div><div class="edui-box edui-splitborder edui-default"></div><div class="edui-box edui-arrow edui-default" onclick="$EDITORUI[&quot;edui14&quot;]._onArrowClick();"></div></div></div></div><div id="edui27" class="edui-box edui-combox edui-for-fontsize edui-default"><div title="字号" id="edui27_state" onmousedown="$EDITORUI[&quot;edui27&quot;].Stateful_onMouseDown(event, this);" onmouseup="$EDITORUI[&quot;edui27&quot;].Stateful_onMouseUp(event, this);" onmouseover="$EDITORUI[&quot;edui27&quot;].Stateful_onMouseOver(event, this);" onmouseout="$EDITORUI[&quot;edui27&quot;].Stateful_onMouseOut(event, this);" class="edui-default"><div class="edui-combox-body edui-default"><div id="edui27_button_body" class="edui-box edui-button-body edui-default" onclick="$EDITORUI[&quot;edui27&quot;]._onButtonClick(event, this);">字号</div><div class="edui-box edui-splitborder edui-default"></div><div class="edui-box edui-arrow edui-default" onclick="$EDITORUI[&quot;edui27&quot;]._onArrowClick();"></div></div></div></div><div id="edui38" class="edui-box edui-combox edui-for-paragraph edui-default"><div title="段落格式" id="edui38_state" onmousedown="$EDITORUI[&quot;edui38&quot;].Stateful_onMouseDown(event, this);" onmouseup="$EDITORUI[&quot;edui38&quot;].Stateful_onMouseUp(event, this);" onmouseover="$EDITORUI[&quot;edui38&quot;].Stateful_onMouseOver(event, this);" onmouseout="$EDITORUI[&quot;edui38&quot;].Stateful_onMouseOut(event, this);" class="edui-default"><div class="edui-combox-body edui-default"><div id="edui38_button_body" class="edui-box edui-button-body edui-default" onclick="$EDITORUI[&quot;edui38&quot;]._onButtonClick(event, this);">段落格式</div><div class="edui-box edui-splitborder edui-default"></div><div class="edui-box edui-arrow edui-default" onclick="$EDITORUI[&quot;edui38&quot;]._onArrowClick();"></div></div></div></div><div id="edui47" class="edui-box edui-button edui-for-justifyleft edui-default"><div id="edui47_state" onmousedown="$EDITORUI[&quot;edui47&quot;].Stateful_onMouseDown(event, this);" onmouseup="$EDITORUI[&quot;edui47&quot;].Stateful_onMouseUp(event, this);" onmouseover="$EDITORUI[&quot;edui47&quot;].Stateful_onMouseOver(event, this);" onmouseout="$EDITORUI[&quot;edui47&quot;].Stateful_onMouseOut(event, this);" class="edui-default"><div class="edui-button-wrap edui-default"><div id="edui47_body" unselectable="on" title="居左对齐" class="edui-button-body edui-default" onmousedown="return $EDITORUI[&quot;edui47&quot;]._onMouseDown(event, this);" onclick="return $EDITORUI[&quot;edui47&quot;]._onClick(event, this);"><div class="edui-box edui-icon edui-default"></div><div class="edui-box edui-label edui-default"></div></div></div></div></div><div id="edui48" class="edui-box edui-button edui-for-justifycenter edui-default"><div id="edui48_state" onmousedown="$EDITORUI[&quot;edui48&quot;].Stateful_onMouseDown(event, this);" onmouseup="$EDITORUI[&quot;edui48&quot;].Stateful_onMouseUp(event, this);" onmouseover="$EDITORUI[&quot;edui48&quot;].Stateful_onMouseOver(event, this);" onmouseout="$EDITORUI[&quot;edui48&quot;].Stateful_onMouseOut(event, this);" class="edui-default"><div class="edui-button-wrap edui-default"><div id="edui48_body" unselectable="on" title="居中对齐" class="edui-button-body edui-default" onmousedown="return $EDITORUI[&quot;edui48&quot;]._onMouseDown(event, this);" onclick="return $EDITORUI[&quot;edui48&quot;]._onClick(event, this);"><div class="edui-box edui-icon edui-default"></div><div class="edui-box edui-label edui-default"></div></div></div></div></div><div id="edui49" class="edui-box edui-button edui-for-justifyright edui-default"><div id="edui49_state" onmousedown="$EDITORUI[&quot;edui49&quot;].Stateful_onMouseDown(event, this);" onmouseup="$EDITORUI[&quot;edui49&quot;].Stateful_onMouseUp(event, this);" onmouseover="$EDITORUI[&quot;edui49&quot;].Stateful_onMouseOver(event, this);" onmouseout="$EDITORUI[&quot;edui49&quot;].Stateful_onMouseOut(event, this);" class="edui-default"><div class="edui-button-wrap edui-default"><div id="edui49_body" unselectable="on" title="居右对齐" class="edui-button-body edui-default" onmousedown="return $EDITORUI[&quot;edui49&quot;]._onMouseDown(event, this);" onclick="return $EDITORUI[&quot;edui49&quot;]._onClick(event, this);"><div class="edui-box edui-icon edui-default"></div><div class="edui-box edui-label edui-default"></div></div></div></div></div><div id="edui50" class="edui-box edui-button edui-for-superscript edui-default"><div id="edui50_state" onmousedown="$EDITORUI[&quot;edui50&quot;].Stateful_onMouseDown(event, this);" onmouseup="$EDITORUI[&quot;edui50&quot;].Stateful_onMouseUp(event, this);" onmouseover="$EDITORUI[&quot;edui50&quot;].Stateful_onMouseOver(event, this);" onmouseout="$EDITORUI[&quot;edui50&quot;].Stateful_onMouseOut(event, this);" class="edui-default"><div class="edui-button-wrap edui-default"><div id="edui50_body" unselectable="on" title="上标" class="edui-button-body edui-default" onmousedown="return $EDITORUI[&quot;edui50&quot;]._onMouseDown(event, this);" onclick="return $EDITORUI[&quot;edui50&quot;]._onClick(event, this);"><div class="edui-box edui-icon edui-default"></div></div></div></div></div><div id="edui51" class="edui-box edui-button edui-for-blockquote edui-default"><div id="edui51_state" onmousedown="$EDITORUI[&quot;edui51&quot;].Stateful_onMouseDown(event, this);" onmouseup="$EDITORUI[&quot;edui51&quot;].Stateful_onMouseUp(event, this);" onmouseover="$EDITORUI[&quot;edui51&quot;].Stateful_onMouseOver(event, this);" onmouseout="$EDITORUI[&quot;edui51&quot;].Stateful_onMouseOut(event, this);" class="edui-default"><div class="edui-button-wrap edui-default"><div id="edui51_body" unselectable="on" title="引用" class="edui-button-body edui-default" onmousedown="return $EDITORUI[&quot;edui51&quot;]._onMouseDown(event, this);" onclick="return $EDITORUI[&quot;edui51&quot;]._onClick(event, this);"><div class="edui-box edui-icon edui-default"></div></div></div></div></div><div id="edui52" class="edui-box edui-button edui-for-selectall edui-default"><div id="edui52_state" onmousedown="$EDITORUI[&quot;edui52&quot;].Stateful_onMouseDown(event, this);" onmouseup="$EDITORUI[&quot;edui52&quot;].Stateful_onMouseUp(event, this);" onmouseover="$EDITORUI[&quot;edui52&quot;].Stateful_onMouseOver(event, this);" onmouseout="$EDITORUI[&quot;edui52&quot;].Stateful_onMouseOut(event, this);" class="edui-default"><div class="edui-button-wrap edui-default"><div id="edui52_body" unselectable="on" title="全选" class="edui-button-body edui-default" onmousedown="return $EDITORUI[&quot;edui52&quot;]._onMouseDown(event, this);" onclick="return $EDITORUI[&quot;edui52&quot;]._onClick(event, this);"><div class="edui-box edui-icon edui-default"></div></div></div></div></div><div id="edui57" class="edui-box edui-button edui-for-preview edui-default"><div id="edui57_state" onmousedown="$EDITORUI[&quot;edui57&quot;].Stateful_onMouseDown(event, this);" onmouseup="$EDITORUI[&quot;edui57&quot;].Stateful_onMouseUp(event, this);" onmouseover="$EDITORUI[&quot;edui57&quot;].Stateful_onMouseOver(event, this);" onmouseout="$EDITORUI[&quot;edui57&quot;].Stateful_onMouseOut(event, this);" class="edui-default"><div class="edui-button-wrap edui-default"><div id="edui57_body" unselectable="on" title="预览" class="edui-button-body edui-default" onmousedown="return $EDITORUI[&quot;edui57&quot;]._onMouseDown(event, this);" onclick="return $EDITORUI[&quot;edui57&quot;]._onClick(event, this);"><div class="edui-box edui-icon edui-default"></div><div class="edui-box edui-label edui-default"></div></div></div></div></div><div id="edui58" class="edui-box edui-button edui-for-removeformat edui-default"><div id="edui58_state" onmousedown="$EDITORUI[&quot;edui58&quot;].Stateful_onMouseDown(event, this);" onmouseup="$EDITORUI[&quot;edui58&quot;].Stateful_onMouseUp(event, this);" onmouseover="$EDITORUI[&quot;edui58&quot;].Stateful_onMouseOver(event, this);" onmouseout="$EDITORUI[&quot;edui58&quot;].Stateful_onMouseOut(event, this);" class="edui-default"><div class="edui-button-wrap edui-default"><div id="edui58_body" unselectable="on" title="清除格式" class="edui-button-body edui-default" onmousedown="return $EDITORUI[&quot;edui58&quot;]._onMouseDown(event, this);" onclick="return $EDITORUI[&quot;edui58&quot;]._onClick(event, this);"><div class="edui-box edui-icon edui-default"></div></div></div></div></div><div id="edui59" class="edui-box edui-splitbutton edui-for-inserttable edui-default"><div title="插入表格" id="edui59_state" onmousedown="$EDITORUI[&quot;edui59&quot;].Stateful_onMouseDown(event, this);" onmouseup="$EDITORUI[&quot;edui59&quot;].Stateful_onMouseUp(event, this);" onmouseover="$EDITORUI[&quot;edui59&quot;].Stateful_onMouseOver(event, this);" onmouseout="$EDITORUI[&quot;edui59&quot;].Stateful_onMouseOut(event, this);" class="edui-default"><div class="edui-splitbutton-body edui-default"><div id="edui59_button_body" class="edui-box edui-button-body edui-default" onclick="$EDITORUI[&quot;edui59&quot;]._onButtonClick(event, this);"><div class="edui-box edui-icon edui-default"></div></div><div class="edui-box edui-splitborder edui-default"></div><div class="edui-box edui-arrow edui-default" onclick="$EDITORUI[&quot;edui59&quot;]._onArrowClick();"></div></div></div></div><div id="edui62" class="edui-box edui-button edui-for-unlink edui-default"><div id="edui62_state" onmousedown="$EDITORUI[&quot;edui62&quot;].Stateful_onMouseDown(event, this);" onmouseup="$EDITORUI[&quot;edui62&quot;].Stateful_onMouseUp(event, this);" onmouseover="$EDITORUI[&quot;edui62&quot;].Stateful_onMouseOver(event, this);" onmouseout="$EDITORUI[&quot;edui62&quot;].Stateful_onMouseOut(event, this);" class="edui-default"><div class="edui-button-wrap edui-default"><div id="edui62_body" unselectable="on" title="取消链接" class="edui-button-body edui-default" onmousedown="return $EDITORUI[&quot;edui62&quot;]._onMouseDown(event, this);" onclick="return $EDITORUI[&quot;edui62&quot;]._onClick(event, this);"><div class="edui-box edui-icon edui-default"></div></div></div></div></div><div id="edui63" class="edui-box edui-button edui-for-insertrow edui-default"><div id="edui63_state" onmousedown="$EDITORUI[&quot;edui63&quot;].Stateful_onMouseDown(event, this);" onmouseup="$EDITORUI[&quot;edui63&quot;].Stateful_onMouseUp(event, this);" onmouseover="$EDITORUI[&quot;edui63&quot;].Stateful_onMouseOver(event, this);" onmouseout="$EDITORUI[&quot;edui63&quot;].Stateful_onMouseOut(event, this);" class="edui-default"><div class="edui-button-wrap edui-default"><div id="edui63_body" unselectable="on" title="前插入行" class="edui-button-body edui-default" onmousedown="return $EDITORUI[&quot;edui63&quot;]._onMouseDown(event, this);" onclick="return $EDITORUI[&quot;edui63&quot;]._onClick(event, this);"><div class="edui-box edui-icon edui-default"></div></div></div></div></div><div id="edui64" class="edui-box edui-button edui-for-insertcol edui-default"><div id="edui64_state" onmousedown="$EDITORUI[&quot;edui64&quot;].Stateful_onMouseDown(event, this);" onmouseup="$EDITORUI[&quot;edui64&quot;].Stateful_onMouseUp(event, this);" onmouseover="$EDITORUI[&quot;edui64&quot;].Stateful_onMouseOver(event, this);" onmouseout="$EDITORUI[&quot;edui64&quot;].Stateful_onMouseOut(event, this);" class="edui-default"><div class="edui-button-wrap edui-default"><div id="edui64_body" unselectable="on" title="前插入列" class="edui-button-body edui-default" onmousedown="return $EDITORUI[&quot;edui64&quot;]._onMouseDown(event, this);" onclick="return $EDITORUI[&quot;edui64&quot;]._onClick(event, this);"><div class="edui-box edui-icon edui-default"></div></div></div></div></div><div id="edui65" class="edui-box edui-button edui-for-mergeright edui-default"><div id="edui65_state" onmousedown="$EDITORUI[&quot;edui65&quot;].Stateful_onMouseDown(event, this);" onmouseup="$EDITORUI[&quot;edui65&quot;].Stateful_onMouseUp(event, this);" onmouseover="$EDITORUI[&quot;edui65&quot;].Stateful_onMouseOver(event, this);" onmouseout="$EDITORUI[&quot;edui65&quot;].Stateful_onMouseOut(event, this);" class="edui-default"><div class="edui-button-wrap edui-default"><div id="edui65_body" unselectable="on" title="右合并单元格" class="edui-button-body edui-default" onmousedown="return $EDITORUI[&quot;edui65&quot;]._onMouseDown(event, this);" onclick="return $EDITORUI[&quot;edui65&quot;]._onClick(event, this);"><div class="edui-box edui-icon edui-default"></div></div></div></div></div><div id="edui66" class="edui-box edui-button edui-for-mergedown edui-default"><div id="edui66_state" onmousedown="$EDITORUI[&quot;edui66&quot;].Stateful_onMouseDown(event, this);" onmouseup="$EDITORUI[&quot;edui66&quot;].Stateful_onMouseUp(event, this);" onmouseover="$EDITORUI[&quot;edui66&quot;].Stateful_onMouseOver(event, this);" onmouseout="$EDITORUI[&quot;edui66&quot;].Stateful_onMouseOut(event, this);" class="edui-default"><div class="edui-button-wrap edui-default"><div id="edui66_body" unselectable="on" title="下合并单元格" class="edui-button-body edui-default" onmousedown="return $EDITORUI[&quot;edui66&quot;]._onMouseDown(event, this);" onclick="return $EDITORUI[&quot;edui66&quot;]._onClick(event, this);"><div class="edui-box edui-icon edui-default"></div></div></div></div></div><div id="edui67" class="edui-box edui-button edui-for-deleterow edui-default"><div id="edui67_state" onmousedown="$EDITORUI[&quot;edui67&quot;].Stateful_onMouseDown(event, this);" onmouseup="$EDITORUI[&quot;edui67&quot;].Stateful_onMouseUp(event, this);" onmouseover="$EDITORUI[&quot;edui67&quot;].Stateful_onMouseOver(event, this);" onmouseout="$EDITORUI[&quot;edui67&quot;].Stateful_onMouseOut(event, this);" class="edui-default"><div class="edui-button-wrap edui-default"><div id="edui67_body" unselectable="on" title="删除行" class="edui-button-body edui-default" onmousedown="return $EDITORUI[&quot;edui67&quot;]._onMouseDown(event, this);" onclick="return $EDITORUI[&quot;edui67&quot;]._onClick(event, this);"><div class="edui-box edui-icon edui-default"></div></div></div></div></div><div id="edui68" class="edui-box edui-button edui-for-deletecol edui-default"><div id="edui68_state" onmousedown="$EDITORUI[&quot;edui68&quot;].Stateful_onMouseDown(event, this);" onmouseup="$EDITORUI[&quot;edui68&quot;].Stateful_onMouseUp(event, this);" onmouseover="$EDITORUI[&quot;edui68&quot;].Stateful_onMouseOver(event, this);" onmouseout="$EDITORUI[&quot;edui68&quot;].Stateful_onMouseOut(event, this);" class="edui-default"><div class="edui-button-wrap edui-default"><div id="edui68_body" unselectable="on" title="删除列" class="edui-button-body edui-default" onmousedown="return $EDITORUI[&quot;edui68&quot;]._onMouseDown(event, this);" onclick="return $EDITORUI[&quot;edui68&quot;]._onClick(event, this);"><div class="edui-box edui-icon edui-default"></div></div></div></div></div><div id="edui69" class="edui-box edui-button edui-for-splittorows edui-default"><div id="edui69_state" onmousedown="$EDITORUI[&quot;edui69&quot;].Stateful_onMouseDown(event, this);" onmouseup="$EDITORUI[&quot;edui69&quot;].Stateful_onMouseUp(event, this);" onmouseover="$EDITORUI[&quot;edui69&quot;].Stateful_onMouseOver(event, this);" onmouseout="$EDITORUI[&quot;edui69&quot;].Stateful_onMouseOut(event, this);" class="edui-default"><div class="edui-button-wrap edui-default"><div id="edui69_body" unselectable="on" title="拆分成行" class="edui-button-body edui-default" onmousedown="return $EDITORUI[&quot;edui69&quot;]._onMouseDown(event, this);" onclick="return $EDITORUI[&quot;edui69&quot;]._onClick(event, this);"><div class="edui-box edui-icon edui-default"></div></div></div></div></div><div id="edui70" class="edui-box edui-button edui-for-splittocols edui-default"><div id="edui70_state" onmousedown="$EDITORUI[&quot;edui70&quot;].Stateful_onMouseDown(event, this);" onmouseup="$EDITORUI[&quot;edui70&quot;].Stateful_onMouseUp(event, this);" onmouseover="$EDITORUI[&quot;edui70&quot;].Stateful_onMouseOver(event, this);" onmouseout="$EDITORUI[&quot;edui70&quot;].Stateful_onMouseOut(event, this);" class="edui-default"><div class="edui-button-wrap edui-default"><div id="edui70_body" unselectable="on" title="拆分成列" class="edui-button-body edui-default" onmousedown="return $EDITORUI[&quot;edui70&quot;]._onMouseDown(event, this);" onclick="return $EDITORUI[&quot;edui70&quot;]._onClick(event, this);"><div class="edui-box edui-icon edui-default"></div></div></div></div></div><div id="edui71" class="edui-box edui-button edui-for-splittocells edui-default"><div id="edui71_state" onmousedown="$EDITORUI[&quot;edui71&quot;].Stateful_onMouseDown(event, this);" onmouseup="$EDITORUI[&quot;edui71&quot;].Stateful_onMouseUp(event, this);" onmouseover="$EDITORUI[&quot;edui71&quot;].Stateful_onMouseOver(event, this);" onmouseout="$EDITORUI[&quot;edui71&quot;].Stateful_onMouseOut(event, this);" class="edui-default"><div class="edui-button-wrap edui-default"><div id="edui71_body" unselectable="on" title="完全拆分单元格" class="edui-button-body edui-default" onmousedown="return $EDITORUI[&quot;edui71&quot;]._onMouseDown(event, this);" onclick="return $EDITORUI[&quot;edui71&quot;]._onClick(event, this);"><div class="edui-box edui-icon edui-default"></div></div></div></div></div><div id="edui72" class="edui-box edui-button edui-for-mergecells edui-default"><div id="edui72_state" onmousedown="$EDITORUI[&quot;edui72&quot;].Stateful_onMouseDown(event, this);" onmouseup="$EDITORUI[&quot;edui72&quot;].Stateful_onMouseUp(event, this);" onmouseover="$EDITORUI[&quot;edui72&quot;].Stateful_onMouseOver(event, this);" onmouseout="$EDITORUI[&quot;edui72&quot;].Stateful_onMouseOut(event, this);" class="edui-default"><div class="edui-button-wrap edui-default"><div id="edui72_body" unselectable="on" title="合并多个单元格" class="edui-button-body edui-default" onmousedown="return $EDITORUI[&quot;edui72&quot;]._onMouseDown(event, this);" onclick="return $EDITORUI[&quot;edui72&quot;]._onClick(event, this);"><div class="edui-box edui-icon edui-default"></div></div></div></div></div><div id="edui73" class="edui-box edui-button edui-for-deletetable edui-default"><div id="edui73_state" onmousedown="$EDITORUI[&quot;edui73&quot;].Stateful_onMouseDown(event, this);" onmouseup="$EDITORUI[&quot;edui73&quot;].Stateful_onMouseUp(event, this);" onmouseover="$EDITORUI[&quot;edui73&quot;].Stateful_onMouseOver(event, this);" onmouseout="$EDITORUI[&quot;edui73&quot;].Stateful_onMouseOut(event, this);" class="edui-default"><div class="edui-button-wrap edui-default"><div id="edui73_body" unselectable="on" title="删除表格" class="edui-button-body edui-default" onmousedown="return $EDITORUI[&quot;edui73&quot;]._onMouseDown(event, this);" onclick="return $EDITORUI[&quot;edui73&quot;]._onClick(event, this);"><div class="edui-box edui-icon edui-default"></div></div></div></div></div><div id="edui74" class="edui-box edui-button edui-for-cleardoc edui-default"><div id="edui74_state" onmousedown="$EDITORUI[&quot;edui74&quot;].Stateful_onMouseDown(event, this);" onmouseup="$EDITORUI[&quot;edui74&quot;].Stateful_onMouseUp(event, this);" onmouseover="$EDITORUI[&quot;edui74&quot;].Stateful_onMouseOver(event, this);" onmouseout="$EDITORUI[&quot;edui74&quot;].Stateful_onMouseOut(event, this);" class="edui-default"><div class="edui-button-wrap edui-default"><div id="edui74_body" unselectable="on" title="清空文档" class="edui-button-body edui-default" onmousedown="return $EDITORUI[&quot;edui74&quot;]._onMouseDown(event, this);" onclick="return $EDITORUI[&quot;edui74&quot;]._onClick(event, this);"><div class="edui-box edui-icon edui-default"></div><div class="edui-box edui-label edui-default"></div></div></div></div></div><div id="edui79" class="edui-box edui-button edui-for-link edui-default"><div id="edui79_state" onmousedown="$EDITORUI[&quot;edui79&quot;].Stateful_onMouseDown(event, this);" onmouseup="$EDITORUI[&quot;edui79&quot;].Stateful_onMouseUp(event, this);" onmouseover="$EDITORUI[&quot;edui79&quot;].Stateful_onMouseOver(event, this);" onmouseout="$EDITORUI[&quot;edui79&quot;].Stateful_onMouseOut(event, this);" class="edui-default"><div class="edui-button-wrap edui-default"><div id="edui79_body" unselectable="on" title="超链接" class="edui-button-body edui-default" onmousedown="return $EDITORUI[&quot;edui79&quot;]._onMouseDown(event, this);" onclick="return $EDITORUI[&quot;edui79&quot;]._onClick(event, this);"><div class="edui-box edui-icon edui-default"></div><div class="edui-box edui-label edui-default"></div></div></div></div></div><div id="edui80" class="edui-box edui-splitbutton edui-for-emotion edui-default"><div title="表情" id="edui80_state" onmousedown="$EDITORUI[&quot;edui80&quot;].Stateful_onMouseDown(event, this);" onmouseup="$EDITORUI[&quot;edui80&quot;].Stateful_onMouseUp(event, this);" onmouseover="$EDITORUI[&quot;edui80&quot;].Stateful_onMouseOver(event, this);" onmouseout="$EDITORUI[&quot;edui80&quot;].Stateful_onMouseOut(event, this);" class="edui-default"><div class="edui-splitbutton-body edui-default"><div id="edui80_button_body" class="edui-box edui-button-body edui-default" onclick="$EDITORUI[&quot;edui80&quot;]._onButtonClick(event, this);"><div class="edui-box edui-icon edui-default"></div></div><div class="edui-box edui-splitborder edui-default"></div><div class="edui-box edui-arrow edui-default" onclick="$EDITORUI[&quot;edui80&quot;]._onArrowClick();"></div></div></div></div><div id="edui86" class="edui-box edui-button edui-for-insertvideo edui-default"><div id="edui86_state" onmousedown="$EDITORUI[&quot;edui86&quot;].Stateful_onMouseDown(event, this);" onmouseup="$EDITORUI[&quot;edui86&quot;].Stateful_onMouseUp(event, this);" onmouseover="$EDITORUI[&quot;edui86&quot;].Stateful_onMouseOver(event, this);" onmouseout="$EDITORUI[&quot;edui86&quot;].Stateful_onMouseOut(event, this);" class="edui-default"><div class="edui-button-wrap edui-default"><div id="edui86_body" unselectable="on" title="视频" class="edui-button-body edui-default" onmousedown="return $EDITORUI[&quot;edui86&quot;]._onMouseDown(event, this);" onclick="return $EDITORUI[&quot;edui86&quot;]._onClick(event, this);"><div class="edui-box edui-icon edui-default"></div><div class="edui-box edui-label edui-default"></div></div></div></div></div><div id="edui87" class="edui-box edui-menubutton edui-for-insertorderedlist edui-default"><div title="有序列表" id="edui87_state" onmousedown="$EDITORUI[&quot;edui87&quot;].Stateful_onMouseDown(event, this);" onmouseup="$EDITORUI[&quot;edui87&quot;].Stateful_onMouseUp(event, this);" onmouseover="$EDITORUI[&quot;edui87&quot;].Stateful_onMouseOver(event, this);" onmouseout="$EDITORUI[&quot;edui87&quot;].Stateful_onMouseOut(event, this);" class="edui-default"><div class="edui-menubutton-body edui-default"><div id="edui87_button_body" class="edui-box edui-button-body edui-default" onclick="$EDITORUI[&quot;edui87&quot;]._onButtonClick(event, this);"><div class="edui-box edui-icon edui-default"></div></div><div class="edui-box edui-splitborder edui-default"></div><div class="edui-box edui-arrow edui-default" onclick="$EDITORUI[&quot;edui87&quot;]._onArrowClick();"></div></div></div></div><div id="edui100" class="edui-box edui-menubutton edui-for-insertunorderedlist edui-default"><div title="无序列表" id="edui100_state" onmousedown="$EDITORUI[&quot;edui100&quot;].Stateful_onMouseDown(event, this);" onmouseup="$EDITORUI[&quot;edui100&quot;].Stateful_onMouseUp(event, this);" onmouseover="$EDITORUI[&quot;edui100&quot;].Stateful_onMouseOver(event, this);" onmouseout="$EDITORUI[&quot;edui100&quot;].Stateful_onMouseOut(event, this);" class="edui-default"><div class="edui-menubutton-body edui-default"><div id="edui100_button_body" class="edui-box edui-button-body edui-default" onclick="$EDITORUI[&quot;edui100&quot;]._onButtonClick(event, this);"><div class="edui-box edui-icon edui-default"></div></div><div class="edui-box edui-splitborder edui-default"></div><div class="edui-box edui-arrow edui-default" onclick="$EDITORUI[&quot;edui100&quot;]._onArrowClick();"></div></div></div></div><div id="edui108" class="edui-box edui-button edui-for-directionalityltr edui-default"><div id="edui108_state" onmousedown="$EDITORUI[&quot;edui108&quot;].Stateful_onMouseDown(event, this);" onmouseup="$EDITORUI[&quot;edui108&quot;].Stateful_onMouseUp(event, this);" onmouseover="$EDITORUI[&quot;edui108&quot;].Stateful_onMouseOver(event, this);" onmouseout="$EDITORUI[&quot;edui108&quot;].Stateful_onMouseOut(event, this);" class="edui-default"><div class="edui-button-wrap edui-default"><div id="edui108_body" unselectable="on" title="从左向右输入" class="edui-button-body edui-default" onmousedown="return $EDITORUI[&quot;edui108&quot;]._onMouseDown(event, this);" onclick="return $EDITORUI[&quot;edui108&quot;]._onClick(event, this);"><div class="edui-box edui-icon edui-default"></div><div class="edui-box edui-label edui-default"></div></div></div></div></div><div id="edui109" class="edui-box edui-button edui-for-directionalityrtl edui-default"><div id="edui109_state" onmousedown="$EDITORUI[&quot;edui109&quot;].Stateful_onMouseDown(event, this);" onmouseup="$EDITORUI[&quot;edui109&quot;].Stateful_onMouseUp(event, this);" onmouseover="$EDITORUI[&quot;edui109&quot;].Stateful_onMouseOver(event, this);" onmouseout="$EDITORUI[&quot;edui109&quot;].Stateful_onMouseOut(event, this);" class="edui-default"><div class="edui-button-wrap edui-default"><div id="edui109_body" unselectable="on" title="从右向左输入" class="edui-button-body edui-default" onmousedown="return $EDITORUI[&quot;edui109&quot;]._onMouseDown(event, this);" onclick="return $EDITORUI[&quot;edui109&quot;]._onClick(event, this);"><div class="edui-box edui-icon edui-default"></div><div class="edui-box edui-label edui-default"></div></div></div></div></div><div id="edui110" class="edui-box edui-button edui-for-imagenone edui-default"><div id="edui110_state" onmousedown="$EDITORUI[&quot;edui110&quot;].Stateful_onMouseDown(event, this);" onmouseup="$EDITORUI[&quot;edui110&quot;].Stateful_onMouseUp(event, this);" onmouseover="$EDITORUI[&quot;edui110&quot;].Stateful_onMouseOver(event, this);" onmouseout="$EDITORUI[&quot;edui110&quot;].Stateful_onMouseOut(event, this);" class="edui-default"><div class="edui-button-wrap edui-default"><div id="edui110_body" unselectable="on" title="默认" class="edui-button-body edui-default" onmousedown="return $EDITORUI[&quot;edui110&quot;]._onMouseDown(event, this);" onclick="return $EDITORUI[&quot;edui110&quot;]._onClick(event, this);"><div class="edui-box edui-icon edui-default"></div><div class="edui-box edui-label edui-default"></div></div></div></div></div><div id="edui111" class="edui-box edui-button edui-for-imageleft edui-default"><div id="edui111_state" onmousedown="$EDITORUI[&quot;edui111&quot;].Stateful_onMouseDown(event, this);" onmouseup="$EDITORUI[&quot;edui111&quot;].Stateful_onMouseUp(event, this);" onmouseover="$EDITORUI[&quot;edui111&quot;].Stateful_onMouseOver(event, this);" onmouseout="$EDITORUI[&quot;edui111&quot;].Stateful_onMouseOut(event, this);" class="edui-default"><div class="edui-button-wrap edui-default"><div id="edui111_body" unselectable="on" title="左浮动" class="edui-button-body edui-default" onmousedown="return $EDITORUI[&quot;edui111&quot;]._onMouseDown(event, this);" onclick="return $EDITORUI[&quot;edui111&quot;]._onClick(event, this);"><div class="edui-box edui-icon edui-default"></div><div class="edui-box edui-label edui-default"></div></div></div></div></div><div id="edui112" class="edui-box edui-button edui-for-imageright edui-default"><div id="edui112_state" onmousedown="$EDITORUI[&quot;edui112&quot;].Stateful_onMouseDown(event, this);" onmouseup="$EDITORUI[&quot;edui112&quot;].Stateful_onMouseUp(event, this);" onmouseover="$EDITORUI[&quot;edui112&quot;].Stateful_onMouseOver(event, this);" onmouseout="$EDITORUI[&quot;edui112&quot;].Stateful_onMouseOut(event, this);" class="edui-default"><div class="edui-button-wrap edui-default"><div id="edui112_body" unselectable="on" title="右浮动" class="edui-button-body edui-default" onmousedown="return $EDITORUI[&quot;edui112&quot;]._onMouseDown(event, this);" onclick="return $EDITORUI[&quot;edui112&quot;]._onClick(event, this);"><div class="edui-box edui-icon edui-default"></div><div class="edui-box edui-label edui-default"></div></div></div></div></div><div id="edui113" class="edui-box edui-button edui-for-imagecenter edui-default"><div id="edui113_state" onmousedown="$EDITORUI[&quot;edui113&quot;].Stateful_onMouseDown(event, this);" onmouseup="$EDITORUI[&quot;edui113&quot;].Stateful_onMouseUp(event, this);" onmouseover="$EDITORUI[&quot;edui113&quot;].Stateful_onMouseOver(event, this);" onmouseout="$EDITORUI[&quot;edui113&quot;].Stateful_onMouseOut(event, this);" class="edui-default"><div class="edui-button-wrap edui-default"><div id="edui113_body" unselectable="on" title="居中" class="edui-button-body edui-default" onmousedown="return $EDITORUI[&quot;edui113&quot;]._onMouseDown(event, this);" onclick="return $EDITORUI[&quot;edui113&quot;]._onClick(event, this);"><div class="edui-box edui-icon edui-default"></div><div class="edui-box edui-label edui-default"></div></div></div></div></div><div id="edui114" class="edui-box edui-menubutton edui-for-lineheight edui-default"><div title="行间距" id="edui114_state" onmousedown="$EDITORUI[&quot;edui114&quot;].Stateful_onMouseDown(event, this);" onmouseup="$EDITORUI[&quot;edui114&quot;].Stateful_onMouseUp(event, this);" onmouseover="$EDITORUI[&quot;edui114&quot;].Stateful_onMouseOver(event, this);" onmouseout="$EDITORUI[&quot;edui114&quot;].Stateful_onMouseOut(event, this);" class="edui-default"><div class="edui-menubutton-body edui-default"><div id="edui114_button_body" class="edui-box edui-button-body edui-default" onclick="$EDITORUI[&quot;edui114&quot;]._onButtonClick(event, this);"><div class="edui-box edui-icon edui-default"></div></div><div class="edui-box edui-splitborder edui-default"></div><div class="edui-box edui-arrow edui-default" onclick="$EDITORUI[&quot;edui114&quot;]._onArrowClick();"></div></div></div></div><div id="edui123" class="edui-box edui-combox edui-for-customstyle edui-default"><div title="自定义标题" id="edui123_state" onmousedown="$EDITORUI[&quot;edui123&quot;].Stateful_onMouseDown(event, this);" onmouseup="$EDITORUI[&quot;edui123&quot;].Stateful_onMouseUp(event, this);" onmouseover="$EDITORUI[&quot;edui123&quot;].Stateful_onMouseOver(event, this);" onmouseout="$EDITORUI[&quot;edui123&quot;].Stateful_onMouseOut(event, this);" class="edui-default"><div class="edui-combox-body edui-default"><div id="edui123_button_body" class="edui-box edui-button-body edui-default" onclick="$EDITORUI[&quot;edui123&quot;]._onButtonClick(event, this);">自定义标题</div><div class="edui-box edui-splitborder edui-default"></div><div class="edui-box edui-arrow edui-default" onclick="$EDITORUI[&quot;edui123&quot;]._onArrowClick();"></div></div></div></div><div id="edui133" class="edui-box edui-button edui-for-insertimage edui-default"><div id="edui133_state" onmousedown="$EDITORUI[&quot;edui133&quot;].Stateful_onMouseDown(event, this);" onmouseup="$EDITORUI[&quot;edui133&quot;].Stateful_onMouseUp(event, this);" onmouseover="$EDITORUI[&quot;edui133&quot;].Stateful_onMouseOver(event, this);" onmouseout="$EDITORUI[&quot;edui133&quot;].Stateful_onMouseOut(event, this);" class="edui-default"><div class="edui-button-wrap edui-default"><div id="edui133_body" unselectable="on" title="多图上传" class="edui-button-body edui-default" onmousedown="return $EDITORUI[&quot;edui133&quot;]._onMouseDown(event, this);" onclick="return $EDITORUI[&quot;edui133&quot;]._onClick(event, this);"><div class="edui-box edui-icon edui-default"></div><div class="edui-box edui-label edui-default"></div></div></div></div></div></div></div></div><div id="edui1_toolbarmsg" class="edui-editor-toolbarmsg edui-default" style="display:none;"><div id="edui1_upload_dialog" class="edui-editor-toolbarmsg-upload edui-default" onclick="$EDITORUI[&quot;edui1&quot;].showWordImageDialog();">点击上传</div><div class="edui-editor-toolbarmsg-close edui-default" onclick="$EDITORUI[&quot;edui1&quot;].hideToolbarMsg();">x</div><div id="edui1_toolbarmsg_label" class="edui-editor-toolbarmsg-label edui-default"></div><div style="height:0;overflow:hidden;clear:both;" class="edui-default"></div></div><div id="edui1_message_holder" class="edui-editor-messageholder edui-default" style="top: 58px; z-index: 1000;"></div></div><div id="edui1_iframeholder" class="edui-editor-iframeholder edui-default" style="width: 100%; height: 450px; z-index: 999; overflow: hidden;"><iframe id="ueditor_0" width="100%" height="100%" frameborder="0" src="javascript:void(function(){document.open();document.write(&quot;<!DOCTYPE html><html xmlns='http://www.w3.org/1999/xhtml' class='view' ><head><style type='text/css'>.view{padding:0;word-wrap:break-word;cursor:text;height:90%;}
body{margin:8px;font-family:sans-serif;font-size:16px;}p{margin:5px 0;}</style><link rel='stylesheet' type='text/css' href='/public/admin/js/ueditor/themes/iframe.css'/></head><body class='view' ></body><script type='text/javascript'  id='_initialScript'>setTimeout(function(){editor = window.parent.UE.instants['ueditorInstant0'];editor._setup(document);},0);var _tmpScript = document.getElementById('_initialScript');_tmpScript.parentNode.removeChild(_tmpScript);</script></html>&quot;);document.close();}())"></iframe></div><div id="edui1_bottombar" class="edui-editor-bottomContainer edui-default"><table class="edui-default"><tbody class="edui-default"><tr class="edui-default"><td id="edui1_elementpath" class="edui-editor-bottombar edui-default"></td><td id="edui1_wordcount" class="edui-editor-wordcount edui-default">字数统计</td><td id="edui1_scale" class="edui-editor-scale edui-default" style="display: none;"><div class="edui-editor-icon edui-default"></div></td></tr></tbody></table></div><div id="edui1_scalelayer" class="edui-default"></div></div></div>
		</dd>
	</dl>
	<dl>
		<dt>是否显示头部：</dt>
		<dd><input id="is_head" type="checkbox" class="checkbox" checked="checked" simpleswitch="0" result="true" style="display: none;"><div class="Switch Switch_FlatRadius On" id="Switch0"><span class="switch-open">是</span><span class="switch-close">否</span></div></dd>
	</dl>
	<dl>
	<dt>是否显示底部：</dt>
		<dd><input id="is_foot" type="checkbox" class="checkbox" checked="checked" simpleswitch="1" result="true" style="display: none;"><div class="Switch Switch_FlatRadius On" id="Switch1"><span class="switch-open">是</span><span class="switch-close">否</span></div></dd>
	</dl>
	<h4>选择活动商品：</h4>
	
	<!-- 所有决定商品弹框内容的条件和存放商品id的隐藏域 -->
	<span id="goods-condition">
		<input type="hidden" name="type" value="2">
		<input type="hidden" name="stock" value="1">
		<input type="hidden" name="goods_type" value="1,2">
		<input type="hidden" name="is_have_sku" value="1">
		<input type="hidden" name="state" value="1">
		<input type="hidden" id="goods_id_array" value="3,4,5,6,7,8,9,10">
		<input type="hidden" id="range_type" value="0">
		<input type="hidden" id="is_show_select" value="0">
	</span>
	
<!-- 切换全部与部分 -->
<dl style="display:none;" id="select-box">
	<dt>参与商品：</dt>
	<dd>
		<div class="total" id="is_all">
			<label for="navigationtype1" class="in">
				<i class="radio-common">
					<input type="radio" value="1" name="range_type" checked="checked" id="navigationtype1">
				</i>
				<span>全部</span>
			</label>
			<label for="navigationtype2" class="out">
				<i class="radio-common selected">
					<input type="radio" value="0" name="range_type" id="navigationtype2">
				</i>
				<span>部分</span>
			</label>
		</div>
	</dd>
</dl>
<!-- 弹框按钮 -->
<dl class="js-select-goods" style="">
	<dt>选择商品：</dt>
	<dd>
		<button class="btn-common" onclick="open_Goods_Select_List()">选择商品</button><span class="select-tip"></span>
		<p class="error" style="display: none;"></p>
	</dd>
</dl>
<!-- 已选择商品的列表 -->
<dl>
	<dd class="goods-list" style="width: 100%; margin-left: 0px;">
		<table class="table-class">
			<colgroup>
				<col width="40%">
				<col width="20%">
				<col width="10%">
				<col width="15%">
				<col width="10%">
			</colgroup>
			<thead>
				<tr>
					<th>商品名称</th>
					<th>价格</th>
					<th>库存</th>
					<th id="action-th"></th>
					<th>操作</th>
				</tr>
			</thead>
			<tbody><tr><td style="text-align:left;">男OVERSIZE宽松ins同款衬衫防晒夏季白衬衣外套</td><td class="goods_price">198.00</td><td>1400</td><td></td><td><label for=""><i class="fa fa-times" aria-hidden="true fa-2x" onclick="cancelSelect(10,this)"></i></label></td></tr><tr><td style="text-align:left;">DOMO男士高端衬衣潮男雅痞英伦风大尖领湖蓝红色波点衬衣个性达人</td><td class="goods_price">986.00</td><td>1110</td><td></td><td><label for=""><i class="fa fa-times" aria-hidden="true fa-2x" onclick="cancelSelect(9,this)"></i></label></td></tr><tr><td style="text-align:left;">小鹿要飞背带牛仔裤女春夏季2017新款宽松高腰短裤小清新背带裤裙</td><td class="goods_price">188.00</td><td>1000</td><td></td><td><label for=""><i class="fa fa-times" aria-hidden="true fa-2x" onclick="cancelSelect(8,this)"></i></label></td></tr><tr><td style="text-align:left;">简约气质百搭复古 浅灰铜氨丝 吊带连衣裙</td><td class="goods_price">178.00</td><td>1000</td><td></td><td><label for=""><i class="fa fa-times" aria-hidden="true fa-2x" onclick="cancelSelect(7,this)"></i></label></td></tr><tr><td style="text-align:left;">夏欧美性感气质名媛女高腰修身显瘦黑色不规则吊带背心无袖连衣裙</td><td class="goods_price">188.00</td><td>1000</td><td></td><td><label for=""><i class="fa fa-times" aria-hidden="true fa-2x" onclick="cancelSelect(6,this)"></i></label></td></tr><tr><td style="text-align:left;">定制韩版宽松蝙蝠袖中长款套头卫衣胸前系带连衣裙</td><td class="goods_price">485.00</td><td>999</td><td></td><td><label for=""><i class="fa fa-times" aria-hidden="true fa-2x" onclick="cancelSelect(5,this)"></i></label></td></tr><tr><td style="text-align:left;">2017夏装新款名媛修身性感一字肩绣花时尚喇叭袖连衣裙短袖包臀裙</td><td class="goods_price">399.00</td><td>1000</td><td></td><td><label for=""><i class="fa fa-times" aria-hidden="true fa-2x" onclick="cancelSelect(4,this)"></i></label></td></tr><tr><td style="text-align:left;">上衣女夏2017新款枣红色韩版灯笼袖压褶方领宽松半袖百搭雪纺衫</td><td class="goods_price">169.00</td><td>74999</td><td></td><td><label for=""><i class="fa fa-times" aria-hidden="true fa-2x" onclick="cancelSelect(3,this)"></i></label></td></tr></tbody>
		</table>
	</dd>
</dl>

	<h4>模板设置</h4>	
	<dl>
			<dt>电脑端：</dt>
			<dd>
				template/shop/blue/Goods/&nbsp;<input type="text" class="input-common harf" name="" id="pc_topic_template" value="promotionTopicGoods" style="width: 80px;" onkeyup="value=value.replace(/[^\w\.\/]/ig,'')">&nbsp;.html
				<p class="hint">用户自定义模板必须存放在template/shop/blue/Goods/下，模板名只能由英文组成</p>
			</dd>
		</dl>
		<dl>
			<dt>手机端：</dt>
			<dd>
				template/wap/default_new/Goods/&nbsp;<input type="text" class="input-common harf" name="" id="wap_topic_template" value="promotionTopicGoods" style="width: 80px;" onkeyup="value=value.replace(/[^\w\.\/]/ig,'')">&nbsp;.html
				<p class="hint">用户自定义模板必须存放在template/wap/default_new/Goods/下，模板名只能由英文组成</p>
			</dd>
		</dl>
	<dl>
		<dt></dt>
		<dd>
			<button class="btn-common btn-big" onclick="updateDiscount();">保存</button>
			<button class="btn-common-cancle btn-big" onclick="javascript:history.back(-1);">返回</button>
		</dd>
	</dl>
</div>
<input type="hidden" id="topic_id" value="1">

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
