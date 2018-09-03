<template>
	
	<section class="ns-base-section">
		
		
		
		<div style="position:relative;margin:0;">
			<!-- 面包屑导航 -->
						<div class="breadcrumb-nav">
				<a href="index.html">大鵬系統</a>
									<i class="fa fa-angle-right"></i>
					<a href="/config/usernotice.html">网站</a>
									<i class="fa fa-angle-right"></i>
					<!-- 需要加跳转链接用这个：http://showfx.niuteam.cn/admin/system/updateshopadv -->
					<a href="javascript:;" style="color:#999;">广告编辑</a>
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
		
		
		<div class="ns-main">
			
<div class="set-style">
	<dl>
		<dt><span class="color-red">*</span>广告名称：</dt>
		<dd>
			<p><input id="adv_title" type="text" value="广告栏一图片1" class="input-common long"></p>
			<p class="error">请输入广告名称</p>
		</dd>
	</dl>
	<dl>
		<dt><span class="color-red">*</span>选择广告位：</dt>
		<dd>
			<p>
				<select name="" id="ap_id" class="form-control input-sm input-common">
					<option value="0">请选择广告位</option>
											<option value="1051" ap-class="0">商城首页最顶部广告位</option>
												<option value="1052" ap-class="0">商城首页logo右侧小广告</option>
												<option value="1053" ap-class="0">商城首页滚动图广告位</option>
												<option value="1054" selected="" ap-class="0">商城首页中部推荐广告位</option>
												<option value="1056" ap-class="0">商城限时折扣轮播广告位</option>
												<option value="1057" ap-class="0">推荐楼层1楼——单图广告位</option>
												<option value="1058" ap-class="0">推荐楼层1楼——轮播图广告位</option>
												<option value="1059" ap-class="0">推荐楼层1楼——多图广告位</option>
												<option value="1060" ap-class="0">推荐楼层2楼——单图广告位</option>
												<option value="1061" ap-class="0">推荐楼层2楼——轮播图广告位</option>
												<option value="1062" ap-class="0">推荐楼层2楼——多图广告位</option>
												<option value="1063" ap-class="0">推荐楼层3楼——单图广告位</option>
												<option value="1064" ap-class="0">推荐楼层4楼——单图广告位</option>
												<option value="1067" ap-class="0">推荐楼层3楼——轮播图广告位</option>
												<option value="1068" ap-class="0">推荐楼层4楼——轮播图广告位</option>
												<option value="1071" ap-class="0">推荐楼层3楼——多图广告位</option>
												<option value="1072" ap-class="0">推荐楼层4楼——多图广告位</option>
												<option value="1075" ap-class="0">商城品牌专区轮播广告位</option>
												<option value="1076" ap-class="0">商城积分中心轮播广告位</option>
												<option value="1102" ap-class="0">商城积分中心中部广告位</option>
												<option value="1103" ap-class="0">商城登录页面轮播广告位</option>
												<option value="6666" ap-class="0">商城促销专区轮播广告位</option>
												<option value="6668" ap-class="0">商城注册页面广告位</option>
												<option value="6670" ap-class="0">团购专区广告位</option>
												<option value="6671" ap-class="0">专题活动广告位</option>
										</select>
			</p>
			<p class="error">请选择广告位</p>
		</dd>
	</dl>
	<div class="data-image">
		<dl>
			<dt><span style="color:red;margin-right:10px;">*</span>广告图片：</dt>
			<dd>
				<div class="upload-btn-common">
					<div>
						<input class="input-file" name="file_upload" id="uploadAdv" type="file" onchange="imgUpload(this);" title="上传">
						<input type="hidden" id="adv" value="upload/advertising/1497067960.png">
					</div>
					
					<input type="text" id="text_adv" class="input-common" readonly="readonly" value="upload/advertising/1497067960.png">
					<em>上传</em>								
					<img id="preview_adv" src="/public/static/blue/img/upload-common-select.png" data-src="/upload/advertising/1497067960.png" data-html="true" data-container="body" data-placement="top" data-trigger="manual" data-original-title="" title="">
				</div>
				<p class="error">请上传图片</p>
			</dd>
		</dl>
		<dl>
			<dt>背景色：</dt>
			<dd>
				<input id="background" type="color" style="width:60px;height:25px;" value="#ffffff" class="input-common-color">
			</dd>
		</dl>
		<dl>
			<dt><span class="color-red">*</span>链接地址：</dt>
			<dd>
				<p><input id="adv_url" type="text" value="javascript:;" class="input-common long"></p>
				<p class="error">请输入链接地址</p>
			</dd>
		</dl>
	</div>
	<dl>
		<dt><span class="color-red">*</span>排序：</dt>
		<dd>
			<p><input id="slide_sort" type="number" value="0" class="input-common harf"></p>
			<p class="error">请输入序号</p>
		</dd>
	</dl>
	<div class="data-code" style="display: none;">
		<dl>
			<dt><span class="color-red">*</span>广告代码：</dt>
			<dd>
				<div class="title">
					<span>输入代码</span><span style="border-left: none;">预览</span>
				</div>
				<textarea name="" id="adv_code" cols="30" rows="10" style="display: none;"></textarea><div class="CodeMirror cm-s-default CodeMirror-wrap "><div style="overflow: hidden; position: relative; width: 3px; height: 0px;"><textarea autocorrect="off" autocapitalize="off" spellcheck="false" style="position: absolute; padding: 0px; width: 1000px; height: 1em; outline: none;" tabindex="0"></textarea></div><div class="CodeMirror-hscrollbar" style="left: 0px;"><div style="height: 100%; min-height: 1px;"></div></div><div class="CodeMirror-vscrollbar"><div style="min-width: 1px;"></div></div><div class="CodeMirror-scrollbar-filler"></div><div class="CodeMirror-gutter-filler"></div><div class="CodeMirror-scroll" tabindex="-1"><div class="CodeMirror-sizer" style="margin-left: 0px;"><div style="position: relative;"><div class="CodeMirror-lines"><div style="position: relative; outline: none;"><div class="CodeMirror-measure"><pre><span>xxxxxxxxxx</span></pre></div><div class="CodeMirror-measure"></div><div style="position: relative; z-index: 1;"></div><div class="CodeMirror-cursors"></div><div class="CodeMirror-code"></div></div></div></div></div><div style="position: absolute; height: 30px; width: 1px;"></div><div class="CodeMirror-gutters"><div class="CodeMirror-gutter CodeMirror-linenumbers" style="width: 0px;"></div></div></div></div>
				<div id="show"></div>
				<p class="error" style="clear: both;">请输入广告代码</p>
			</dd>
		</dl>
	</div>
	<dl>
		<dt></dt>
		<dd>
			<button class="btn-common btn-big" onclick="updateShopAdvAjax();">保存</button>
			<button class="btn-common-cancle btn-big" onclick="javascript:history.back(-1);">返回</button>
		</dd>
	</dl>
</div>	
<input type="hidden" id="adv_id" value="948">


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
