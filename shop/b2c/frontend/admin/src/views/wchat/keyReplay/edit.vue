<template>
    <section class="ns-base-section">
		
		
		
		<div style="position:relative;margin:0;">
			<!-- 面包屑导航 -->
						<div class="breadcrumb-nav">
				<a href="index.html">零基础学IT就来</a>
									<i class="fa fa-angle-right"></i>
					<a href="/wchat/config.html">微信</a>
									<i class="fa fa-angle-right"></i>
					<!-- 需要加跳转链接用这个：http://showfx.niuteam.cn/admin/wchat/addorupdatekeyreplay -->
					<a href="javascript:;" style="color:#999;">添加回复</a>
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
			
<!-- 关注时回复 -->
<div class="set-style">
	<dl>
		<dt><span class="required">*</span>关键词：</dt>
		<dd>
			<p><input id="key" type="text" value="" class="input-common"></p>
			<p class="error">请输入关键词</p>
		</dd>
	</dl>
	<dl>
		<dt>匹配类型：</dt>
		<dd>
			<label for="match_type1" class="radio inline normal"><i class="radio-common selected"><input name="match_type" id="match_type1" type="radio" value="1" checked=""></i> 模糊匹配</label>
			<label for="match_type2" class="radio inline normal"><i class="radio-common "><input name="match_type" id="match_type2" type="radio" value="2"></i> 全部匹配</label>
			<p class="error">请选择匹配类型</p>
		</dd>
	</dl>
	<dl>
		<dt>回复内容：</dt>
		<dd>
							<p class="key_data_a" style="display:block;">您还未选择回复内容，<a href="javascript:;" onclick="showMaterial()">立即选择</a></p>
						<div id="key_data">
				<div class="step_1" style="display:none;">
									<div class="media-button">
						<a href="javascript:;" onclick="showMaterial()">修改</a>
						<a href="javascript:;" onclick="delReply()">删除</a>
					</div>
				</div>
			</div>
		</dd>
	</dl>
	<dl>
		<dt></dt>
		<dd>
			<button class="btn-common btn-big" onclick="addOrUpdateKeyReplay();">保存</button>
			<button class="btn-common-cancle btn-big" onclick="javascript:history.back(-1);">返回</button>
		</dd>
	</dl>
</div> 
<input type="hidden" id="id" value="0">
<input type="hidden" id="media_id" value="0">
<div class="dialog_wrp media align_edge ui-draggable" style="width: 960px; margin-left: -480px; margin-top: -313.5px; display: none;" id="dialog_media">
	<div class="dialog">
		<div class="dialog_hd">
			<h3>选择素材</h3>
			<a href="javascript:;" onclick="closeMaterial()" class="icon16_opr closed pop_closed">关闭</a>
		</div>
		<div class="dialog_bd">
			<div class="dialog_media_container appmsg_media_dialog">
				<div class="sub_title_bar in_dialog">
					<div class="search_bar js-btn-media">
						<button class="btn-common-white btn-big btn_primary" value="1" href="javascript:;" onclick="checkBtn(this)"> 文本 </button>
						<button class="btn-common-white btn-big" value="2" href="javascript:;" onclick="checkBtn(this)"> 单图文 </button>
						<button class="btn-common-white btn-big" href="javascript:;" value="3" onclick="checkBtn(this)"> 多图文 </button>
					</div>
					<div class="appmsg_create tr" id="add_message_btn">
						<a target="_blank" href="/wchat/addmedia.html?type=1"><button class="btn-common"><i class="icon14_common add_white"></i><span>新建文本消息</span></button></a>
					</div>
				</div>
				<div class="dialog_media_inner" style="overflow:auto;">
					<div class="table_wrp user_list">
						<table class="table" cellspacing="0">
							<tbody class="tbody" id="materia_data"><tr><td class="table_cell"><ul class="mater"><li><span class="btn_primary">文本 1 </span><a href="#">sdfsaf</a></li></ul></td><td>2018-08-06 02:44:12</td><td class="table_cell user_opr tr"><a class="btn remark js_msgSenderRemark" onclick="selectedMaterial(3)">选取</a></td></tr></tbody>
						</table>
					</div>
				</div>
			</div>
		</div>
		<div class="dialog_ft">
<div class="page" id="turn-ul" style="">
	<div class="pagination">
		<ul>
			<li class="according-number">每页显示<input type="text" class="input-medium" id="showNumber" value="14" data-default="14" autocomplete="off">条</li>
			<li><a id="beginPage" class="page-disable" style="border: 1px solid #dddddd;">首页</a></li>
			<li><a id="prevPage" class="page-disable">上一页</a></li>
			<li id="pageNumber"><a onclick="JumpForPage(this)" class="currentPage">1</a></li>
			<li id="JslastPage"></li>
			<li><a id="nextPage" class="page-disable">下一页</a></li>
			<li><a id="lastPage" class="page-disable">末页</a></li>
			<li class="total-data" data-total-count="1">共1条</li>
			<!-- <li class="page-count">共0页</li> -->
			<li class="according-number">
				跳<input type="text" class="input-medium" id="skipPage" data-curr-page="1">页
			</li>
		</ul>
	</div>
</div>
<input type="hidden" id="page_count" value="1">
<input type="hidden" id="page_size" value="1">
		</div>
	</div>
</div>
<div class="mask mask_metar" style="display: none;"></div>

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
			<li class="total-data" data-total-count="1">共1条</li>
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
