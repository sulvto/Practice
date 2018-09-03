<template>
		
	<section class="ns-base-section">
		
		
		
		<div style="position:relative;margin:0;">
			<!-- 面包屑导航 -->
						<div class="breadcrumb-nav">
				<a href="index.html">大鵬系統</a>
									<i class="fa fa-angle-right"></i>
					<a href="/config/usernotice.html">网站</a>
									<i class="fa fa-angle-right"></i>
					<!-- 需要加跳转链接用这个：http://showfx.niuteam.cn/admin/config/shopnavigationlist -->
					<a href="javascript:;" style="color:#999;">导航管理</a>
							</div>
						<!-- 三级导航菜单 -->
			
	<nav class="ns-third-menu">
		<ul>
			<li class="selected" data-nav-type="1">PC端</li>
			<li data-nav-type="2">手机端</li>
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
									<p>导航</p>
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
<!-- 						<span>导航</span> -->
<!-- 						 -->
<!-- 					{1/block} -->
				</h4>
			</div>
		</div>
		
		
		<div class="ns-main">
			
<div class="options-btn">
	<button class="btn-common-delete" onclick="batchDelete()">批量删除</button>
	<button class="btn-common" onclick="location.href='/config/addshopnavigation.html';">添加导航栏</button>
	<input type="hidden" id="nav_type" value="1">
</div>
<table class="table-class">
	<colgroup>
		<col style="width: 2%">
		<col style="width: 17%;">
		<col style="width: 17%;">
		<col style="width: 17%;">
		<col style="width: 17%;">
		<col style="width: 16%;">
		<col style="width: 4%;">
		<col style="width: 10%">
	</colgroup>
	<thead>
		<tr align="center">
			<th><i class="checkbox-common"><input type="checkbox" onclick="CheckAll(this)" id="chek_all"></i></th>
			<th align="left">导航名称</th>
			<th align="left">链接地址</th>
			<th>所属类型</th>
			<th>是否显示</th>
			<th>创建时间</th>
			<th>排序</th>
			<th>操作</th>
		</tr>
	</thead>
	<tbody><tr align="center"><td><i class="checkbox-common"><input name="sub" type="checkbox" value="14"></i></td><td align="left" class="cell_total" title="领券中心"><a href="/goods/couponlist" target="_blank" style="margin-left:0px;">领券中心</a></td><td style="word-break:break-word;text-align:left;">领券中心</td><td><i class="fa fa-television" title="PC端"></i></td><td>是</td><td>2018-07-20 16:44:39</td><td><input type="number" min="0" value="0" nav_id="14" class="input-common input-common-sort"></td><td><a href="/config/updateshopnavigation?nav_id=14">修改</a><a style="cursor: pointer;" onclick="deleteArticle(14)">删除</a></td> </tr><tr align="center"><td><i class="checkbox-common"><input name="sub" type="checkbox" value="15"></i></td><td align="left" class="cell_total" title="111"><a href="/goods/promotionZone" target="_blank" style="margin-left:0px;">111</a></td><td style="word-break:break-word;text-align:left;">标签专区</td><td><i class="fa fa-television" title="PC端"></i></td><td>是</td><td>2018-08-10 14:17:49</td><td><input type="number" min="0" value="0" nav_id="15" class="input-common input-common-sort"></td><td><a href="/config/updateshopnavigation?nav_id=15">修改</a><a style="cursor: pointer;" onclick="deleteArticle(15)">删除</a></td> </tr></tbody>
</table>

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
			<li class="total-data" data-total-count="2">共2条</li>
			<!-- <li class="page-count">共0页</li> -->
			<li class="according-number">
				跳<input type="text" class="input-medium" id="skipPage" data-curr-page="1">页
			</li>
		</ul>
	</div>
</div>
<input type="hidden" id="page_count" value="1">
<input type="hidden" id="page_size" value="2">
		</div>
		
	</section>
	
</template>
