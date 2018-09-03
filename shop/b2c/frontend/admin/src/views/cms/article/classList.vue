<template>
    <section class="ns-base-section">
		
		
		
		<div style="position:relative;margin:0;">
			<!-- 面包屑导航 -->
						<div class="breadcrumb-nav">
				<a href="index.html">零基础学IT就来</a>
									<i class="fa fa-angle-right"></i>
					<a href="/config/usernotice.html">网站</a>
									<i class="fa fa-angle-right"></i>
					<!-- 需要加跳转链接用这个：http://showfx.niuteam.cn/admin/cms/articleclasslist -->
					<a href="javascript:;" style="color:#999;">文章分类</a>
							</div>
						<!-- 三级导航菜单 -->
			
								<nav class="ns-third-menu">
					<ul>
												<li onclick="location.href='/cms/articlelist.html';">文章列表</li>
													<li class="selected" onclick="location.href='/cms/articleclasslist.html';">文章分类</li>
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
									<p>文章列表</p>
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
<!-- 						<span>文章列表</span> -->
<!-- 						 -->
<!-- 					{1/block} -->
				</h4>
			</div>
		</div>
		
		
		<div class="ns-main">
			
<div class="options-btn">
	<button class="btn-common" onclick="addUpdateArticleClassShow(0);">添加分类</button>
</div>
<div class="mod-table">
		<table class="table-class">
		<colgroup>
			<col style="width: 2%">
			<col style="width: 84%;">
			<col style="width: 4%;">
			<col style="width: 10%;">
		</colgroup>
		<thead>
			<tr>
				<th></th>
				<th align="left">分类名称</th>
				<th>排序</th>
				<th>操作</th>
			</tr>
		</thead>
		<tbody>
						<tr class="pid_0" style="height: 30px;">
				<td>
										<a href="javascript:;" onclick="tab_switch(1)" class="tab_jia_1" style="display: block;">[+]</a>
					<a href="javascript:;" onclick="tab_switch(1)" class="tab_jian_1" style="display: none;">[-]</a>
									</td>
				
				<td style="text-align: left;"><input type="text" class="input-common" fieldid="1" fieldname="name" value="新闻1"></td>
				<td>
					<input type="number" class="input-common input-common-sort" min="0" onkeyup="value=value.replace(/[^\d+(\.\d+)?]/g,'')" fieldid="1" fieldname="sort" value="0">
				</td>
				<td style="text-align: center;">
					<a href="javascript:void(0);" onclick="addUpdateArticleClassShow(1);">修改</a>
					<a href="javascript:void(0);" onclick="deleteArticleClass(1)">删除</a>
				</td>
			</tr>
						<tr class="pid_1" style="height: 30px; display: none;">
				<td></td>
				
				<td style="text-align: left;">
					<span style="color: #ccc;">|——</span>
					<input type="text" class="input-common" fieldid="2" fieldname="name" value="2">
				</td>
				<td>
					<input type="number" class="input-common input-common-sort" min="0" onkeyup="value=value.replace(/[^\d+(\.\d+)?]/g,'')" fieldid="2" fieldname="sort" value="0">
				</td>
				<td style="text-align: center;">
					<a href="javascript:void(0);" onclick="addUpdateArticleClassShow(2);">修改</a>
					<a href="javascript:void(0);" onclick="deleteArticleClass(2)">删除</a>
				</td>
			</tr>
					</tbody>
	</table>
		
	<!--添加分类-->
	<div id="addEditArticleClass" class="modal hide fade" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
		<div class="modal-header">
			<button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
			<h3 id="myModalLabel" class="box-title">添加分类</h3>
		</div>
		<div class="modal-body">
			<div class="form-horizontal">
				
				<div class="control-group">
					<label class="control-label" for="article_class_name"><span class="color-red">*</span>分类名称：</label>
					<div class="controls">
						<input type="text" id="article_class_name" placeholder="请输入分类名称" class="input-common">
						<p class="error">请输入分类名称</p>
					</div>
				</div>
				
				<div class="control-group">
					<label class="control-label" for="article_class_name"><span class="color-red">*</span>上级分类：</label>
					<div class="controls">
						<div class="selectric-wrapper selectric-select-common" style="width: 250px;"><div class="selectric-hide-select"><select id="pid" name="account" class="select-common" tabindex="-1">
							<option value="0">顶级分类</option>
														<option value="1" pid="0">&nbsp;&nbsp;&nbsp;新闻1</option>
													</select></div><div class="selectric"><span class="selectric-label">顶级分类</span><button class="selectric-button">▾</button></div><div class="selectric-items" tabindex="-1"><div class="selectric-scroll"><ul><li data-index="0" class="selected" title="顶级分类">顶级分类</li><li data-index="1" class="last" title="&nbsp;&nbsp;&nbsp;新闻1">&nbsp;&nbsp;&nbsp;新闻1</li></ul></div></div><input class="selectric-input" tabindex="0"></div>
					</div>
				</div>
				
				<div class="control-group">
					<label class="control-label" for="sort">排序：</label>
					<div class="controls">
						<input onkeyup="value=value.replace(/[^\d+(\.\d+)?]/g,'')" type="number" name="sort" id="sort" value="0" class="input-common harf">
						<p class="error">请输入排序</p>
					</div>
				</div>
			</div>
		</div>
		<div class="modal-footer">
			<button class="btn-common btn-big" id="addBtn" onclick="save()">保存</button>
			<button class="btn-common-cancle btn-big" data-dismiss="modal">关闭</button>
		</div>
	</div>
	<input type="hidden" name="class_id" id="class_id" class="">
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
