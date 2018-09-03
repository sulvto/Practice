<template>
    <section class="ns-base-section">
		
		
		
		<div style="position:relative;margin:0;">
			<!-- 面包屑导航 -->
						<div class="breadcrumb-nav">
				<a href="index.html">零基础学IT就来</a>
									<i class="fa fa-angle-right"></i>
					<a href="/config/usernotice.html">网站</a>
									<i class="fa fa-angle-right"></i>
					<!-- 需要加跳转链接用这个：http://showfx.niuteam.cn/admin/config/helpclass -->
					<a href="javascript:;" style="color:#999;">帮助类型</a>
							</div>
						<!-- 三级导航菜单 -->
			
								<nav class="ns-third-menu">
					<ul>
												<li onclick="location.href='/config/helpdocument.html';">帮助内容</li>
													<li class="selected" onclick="location.href='/config/helpclass.html';">帮助类型</li>
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
									<p>帮助类型</p>
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
<!-- 						<span>帮助类型</span> -->
<!-- 						 -->
<!-- 					{1/block} -->
				</h4>
			</div>
		</div>
		
		
		<div class="ns-main">
			
<div class="options-btn">
	<button class="btn-common" onclick="location.href='/config/addhelpclass.html';">添加帮助类型</button>
</div>
<table class="table-class">
	<colgroup>
		<col style="width: 2%">
		<col style="width: 84%;">
		<col style="width: 4%;">
		<col style="width: 10%;">
	</colgroup>
	<thead>
		<tr align="center">
			<th><i class="checkbox-common"><input type="checkbox" onclick="CheckAll(this)"></i></th>
			
			<th align="left">类型名称</th>
			<th>排序</th>
			<th>操作</th>
		</tr>
	</thead>
	<tbody id="linkList"><tr align="center"><td><i class="checkbox-common"><input name="sub" type="checkbox" class="input-common" value="1"></i></td><td align="left"><input type="text" id="class_name0" value="新手上路" onchange="updateClass(0,1)" class="input-common"></td><td><input type="number" min="0" value="1" nav_id="1" class="num input-common input-common-sort" onchange="updateClass(0,1)" id="sort0"></td><td><a onclick="deleteClass(1)">删除</a></td></tr><tr align="center"><td><i class="checkbox-common"><input name="sub" type="checkbox" class="input-common" value="2"></i></td><td align="left"><input type="text" id="class_name1" value="配送与支付" onchange="updateClass(1,2)" class="input-common"></td><td><input type="number" min="0" value="2" nav_id="2" class="num input-common input-common-sort" onchange="updateClass(1,2)" id="sort1"></td><td><a onclick="deleteClass(2)">删除</a></td></tr><tr align="center"><td><i class="checkbox-common"><input name="sub" type="checkbox" class="input-common" value="3"></i></td><td align="left"><input type="text" id="class_name2" value="会员中心" onchange="updateClass(2,3)" class="input-common"></td><td><input type="number" min="0" value="3" nav_id="3" class="num input-common input-common-sort" onchange="updateClass(2,3)" id="sort2"></td><td><a onclick="deleteClass(3)">删除</a></td></tr><tr align="center"><td><i class="checkbox-common"><input name="sub" type="checkbox" class="input-common" value="4"></i></td><td align="left"><input type="text" id="class_name3" value="服务保证" onchange="updateClass(3,4)" class="input-common"></td><td><input type="number" min="0" value="4" nav_id="4" class="num input-common input-common-sort" onchange="updateClass(3,4)" id="sort3"></td><td><a onclick="deleteClass(4)">删除</a></td></tr><tr align="center"><td><i class="checkbox-common"><input name="sub" type="checkbox" class="input-common" value="5"></i></td><td align="left"><input type="text" id="class_name4" value="联系我们" onchange="updateClass(4,5)" class="input-common"></td><td><input type="number" min="0" value="5" nav_id="5" class="num input-common input-common-sort" onchange="updateClass(4,5)" id="sort4"></td><td><a onclick="deleteClass(5)">删除</a></td></tr></tbody>
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
			<li class="total-data" data-total-count="5">共5条</li>
			<!-- <li class="page-count">共0页</li> -->
			<li class="according-number">
				跳<input type="text" class="input-medium" id="skipPage" data-curr-page="1">页
			</li>
		</ul>
	</div>
</div>
<input type="hidden" id="page_count" value="1">
<input type="hidden" id="page_size" value="5">
		</div>
		
	</section>
</template>
