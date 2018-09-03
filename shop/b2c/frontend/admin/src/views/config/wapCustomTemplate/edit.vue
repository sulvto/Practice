<template>
    <section class="ns-base-section">
		
		
		
		<div style="position:relative;margin:0;">
			<!-- 面包屑导航 -->
						<div class="breadcrumb-nav">
				<a href="index.html">零基础学IT就来</a>
									<i class="fa fa-angle-right"></i>
					<a href="/config/usernotice.html">网站</a>
									<i class="fa fa-angle-right"></i>
					<!-- 需要加跳转链接用这个：http://showfx.niuteam.cn/admin/config/wapCustomTemplateEdit -->
					<a href="javascript:;" style="color:#999;">自定义模板编辑</a>
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
									<p>手机端自定义模板编辑</p>
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
<!-- 						<span>手机端自定义模板编辑</span> -->
<!-- 						 -->
<!-- 					{1/block} -->
				</h4>
			</div>
		</div>
		
		
		<div class="ns-main">
			
<div class="mb10"></div>
<!-- <article class="custom-resolution"> -->
<!-- 	<button class="btn-common" data-width="320">320*0</button> -->
<!-- 	<button class="btn-common" data-width="375">375*0</button> -->
<!-- 	<button class="btn-common" data-width="425">425*0</button> -->
<!-- 	<button class="btn-common" data-width="768">768*0</button> -->
<!-- 	<button class="btn-common" data-width="1024">1024*0</button> -->
<!-- </article> -->
<article class="custom-template">
	<header data-custom-flag="CustomTemplateName" data-is-show="1">
		<img src="/public/static/wapCustomTemplate/images/titlebar.png">
		<h4 title="模板名称" data-custom-template-name="模板名称" style="margin: 0px 0px 0px -30px;">模板名称</h4>
	</header>
	<div class="custom-main"></div>
	<div class="caret-up"></div>
	<div class="plug-in">
		<h4>添加内容</h4>
		<ul>
			<li data-control-name="GoodsSearch" data-class-name="control-search draggable-element">商品搜索</li>
			<li data-control-name="GoodsList" data-class-name="control-goods-list draggable-element">商品列表</li>
			<li data-control-name="Title" data-class-name="control-title draggable-element">标题</li>
			<li data-control-name="TextNavigation" data-class-name="control-text-navigation draggable-element">文本导航</li>
			<li data-control-name="Notice" data-class-name="control-notice draggable-element">公告</li>
			<li data-control-name="ImgAd" data-class-name="control-img-ad carousel draggable-element" data-additional-attr="id='carouselImgAd'">图片广告</li>
			<li data-control-name="NavHyBrid" data-class-name="control-nav-img draggable-element">图文导航</li>
			<li data-control-name="GoodsClassify" data-class-name="control-goods-classify draggable-element">商品分类</li>
			<li data-control-name="Footer" data-class-name="control-footer draggable-element">底部菜单</li>
			<!-- 用户可以自己写代码，右侧出来一个富文本编辑器  -->
			<li data-control-name="RichText" data-class-name="control-rich-text draggable-element">富文本</li>
			<li data-control-name="CustomModule" data-class-name="control-custom-module draggable-element">自定义模块</li>
			<li data-control-name="AuxiliaryLine" data-class-name="control-auxiliary-line draggable-element">辅助线</li>
			<li data-control-name="AuxiliaryBlank" data-class-name="control-auxiliary-blank draggable-element">辅助空白</li>
			<li data-control-name="Coupons" data-class-name="control-coupons draggable-element">优惠券</li>
			<li data-control-name="Video" data-class-name="control-video draggable-element">视频</li>
<!-- 			<li data-control-name="Audio" data-class-name="control-audio draggable-element">音频</li> -->
			<li data-control-name="ShowCase" data-class-name="control-show-case draggable-element">橱窗</li>
		</ul>
	</div>
	<div style="text-align:center;padding:10px;">
		<input type="hidden" value="0" id="hidden_id">
		<button class="btn-common btn-big js-save">保存</button>
		<button class="btn-common-cancle btn-big" onclick="javascript:history.back(-1);">返回</button>
	</div>
</article>
<div class="js-mask-btn" style="display:none;position: fixed; bottom: 0; left: 0; z-index: 10000; width: 100%; margin: 0;background-color: rgba(204, 204, 204, 0.701961);text-align: center;">
	<button class="btn-common btn-big js-save" style="margin: 12px auto !important;">保存</button>
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
