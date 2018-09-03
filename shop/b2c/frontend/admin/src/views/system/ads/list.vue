<template>
		
	<section class="ns-base-section">
		
		
		
		<div style="position:relative;margin:0;">
			<!-- 面包屑导航 -->
						<div class="breadcrumb-nav">
				<a href="index.html">大鵬系統</a>
									<i class="fa fa-angle-right"></i>
					<a href="/config/usernotice.html">网站</a>
									<i class="fa fa-angle-right"></i>
					<!-- 需要加跳转链接用这个：http://showfx.niuteam.cn/admin/system/shopadvlist -->
					<a href="javascript:;" style="color:#999;">广告管理</a>
							</div>
						<!-- 三级导航菜单 -->
			
								<nav class="ns-third-menu">
					<ul>
												<li class="selected" onclick="location.href='/system/shopadvlist.html';">广告列表</li>
													<li onclick="location.href='/system/shopadvpositionlist.html';">广告位管理</li>
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
									<p>相关教程：<a href="http://bbs.niushop.com.cn/forum.php?mod=viewthread&amp;tid=2375&amp;extra=page%3D1" target="_blank">http://bbs.niushop.com.cn/forum.php?mod=viewthread&amp;tid=2375&amp;extra=page%3D1</a></p>
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
<!-- 						<span>相关教程：<a href="http://bbs.niushop.com.cn/forum.php?mod=viewthread&tid=2375&extra=page%3D1" target="_blank">http://bbs.niushop.com.cn/forum.php?mod=viewthread&tid=2375&extra=page%3D1</a></span> -->
<!-- 						 -->
<!-- 					{1/block} -->
				</h4>
			</div>
		</div>
		
		
		<div class="ns-main">
			
<div class="options-btn">
	<button class="btn-common add_adv">添加广告</button>
	<button class="btn-common button_active" data-ad-type="1">PC端</button>
		<button class="btn-common" data-ad-type="2">手机端</button>
</div>
<input type="hidden" id="ad_type" value="1">
<table class="table-class">
	<colgroup>
		<col style="width: 2%;">
		<col style="width: 28%;">
		<col style="width: 28%;">
		<col style="width: 28%;">
		<col style="width: 4%;">
		<col style="width: 10%;">
	</colgroup>
	<thead>
		<tr>
			<th><i class="checkbox-common"><input type="checkbox" onclick="CheckAll(this)"></i></th>
			<th align="left">名称</th>
			<th align="left">所属广告位</th>
			<th align="left">链接地址</th>
			<th>排序</th>
			<th>操作</th>
		</tr>
	</thead>
	<tbody id="list"><tr align="center"><td><i class="checkbox-common"><input type="checkbox" name="sub" value="948"></i></td><td align="left">广告栏一图片1</td><td align="left">商城首页中部推荐广告位</td><td class="adv_url" title="javascript:;">javascript:;</td><td class="center"><input type="number" class="input-common input-common-sort" fieldid="948" value="0" onchange="updateAdvSort(this)" size="1"></td><td class="center"><a href="/system/updateshopadv?adv_id=948&amp;type=1">编辑</a> <a href="javascript:;" onclick="delShopAdv(948)">删除</a></td> </tr><tr align="center"><td><i class="checkbox-common"><input type="checkbox" name="sub" value="958"></i></td><td align="left">推荐楼层1楼——轮播图1</td><td align="left">推荐楼层1楼——轮播图广告位</td><td class="adv_url" title="#">#</td><td class="center"><input type="number" class="input-common input-common-sort" fieldid="958" value="0" onchange="updateAdvSort(this)" size="1"></td><td class="center"><a href="/system/updateshopadv?adv_id=958&amp;type=1">编辑</a> <a href="javascript:;" onclick="delShopAdv(958)">删除</a></td> </tr><tr align="center"><td><i class="checkbox-common"><input type="checkbox" name="sub" value="961"></i></td><td align="left">推荐楼层1楼——多图1</td><td align="left">推荐楼层1楼——多图广告位</td><td class="adv_url" title="#">#</td><td class="center"><input type="number" class="input-common input-common-sort" fieldid="961" value="0" onchange="updateAdvSort(this)" size="1"></td><td class="center"><a href="/system/updateshopadv?adv_id=961&amp;type=1">编辑</a> <a href="javascript:;" onclick="delShopAdv(961)">删除</a></td> </tr><tr align="center"><td><i class="checkbox-common"><input type="checkbox" name="sub" value="967"></i></td><td align="left">推荐楼层2楼——单图广告图</td><td align="left">推荐楼层2楼——单图广告位</td><td class="adv_url" title="#">#</td><td class="center"><input type="number" class="input-common input-common-sort" fieldid="967" value="0" onchange="updateAdvSort(this)" size="1"></td><td class="center"><a href="/system/updateshopadv?adv_id=967&amp;type=1">编辑</a> <a href="javascript:;" onclick="delShopAdv(967)">删除</a></td> </tr><tr align="center"><td><i class="checkbox-common"><input type="checkbox" name="sub" value="968"></i></td><td align="left">推荐楼层3楼——单图广告图</td><td align="left">推荐楼层3楼——单图广告位</td><td class="adv_url" title="#">#</td><td class="center"><input type="number" class="input-common input-common-sort" fieldid="968" value="0" onchange="updateAdvSort(this)" size="1"></td><td class="center"><a href="/system/updateshopadv?adv_id=968&amp;type=1">编辑</a> <a href="javascript:;" onclick="delShopAdv(968)">删除</a></td> </tr><tr align="center"><td><i class="checkbox-common"><input type="checkbox" name="sub" value="970"></i></td><td align="left">推荐楼层4楼——单图广告图</td><td align="left">推荐楼层4楼——单图广告位</td><td class="adv_url" title="#">#</td><td class="center"><input type="number" class="input-common input-common-sort" fieldid="970" value="0" onchange="updateAdvSort(this)" size="1"></td><td class="center"><a href="/system/updateshopadv?adv_id=970&amp;type=1">编辑</a> <a href="javascript:;" onclick="delShopAdv(970)">删除</a></td> </tr><tr align="center"><td><i class="checkbox-common"><input type="checkbox" name="sub" value="982"></i></td><td align="left">推荐楼层4楼——轮播图1</td><td align="left">推荐楼层4楼——轮播图广告位</td><td class="adv_url" title="#">#</td><td class="center"><input type="number" class="input-common input-common-sort" fieldid="982" value="0" onchange="updateAdvSort(this)" size="1"></td><td class="center"><a href="/system/updateshopadv?adv_id=982&amp;type=1">编辑</a> <a href="javascript:;" onclick="delShopAdv(982)">删除</a></td> </tr><tr align="center"><td><i class="checkbox-common"><input type="checkbox" name="sub" value="991"></i></td><td align="left">推荐楼层2楼——多图1</td><td align="left">推荐楼层2楼——多图广告位</td><td class="adv_url" title="#">#</td><td class="center"><input type="number" class="input-common input-common-sort" fieldid="991" value="0" onchange="updateAdvSort(this)" size="1"></td><td class="center"><a href="/system/updateshopadv?adv_id=991&amp;type=1">编辑</a> <a href="javascript:;" onclick="delShopAdv(991)">删除</a></td> </tr><tr align="center"><td><i class="checkbox-common"><input type="checkbox" name="sub" value="996"></i></td><td align="left">推荐楼层3楼——多图1</td><td align="left">推荐楼层3楼——多图广告位</td><td class="adv_url" title="#">#</td><td class="center"><input type="number" class="input-common input-common-sort" fieldid="996" value="0" onchange="updateAdvSort(this)" size="1"></td><td class="center"><a href="/system/updateshopadv?adv_id=996&amp;type=1">编辑</a> <a href="javascript:;" onclick="delShopAdv(996)">删除</a></td> </tr><tr align="center"><td><i class="checkbox-common"><input type="checkbox" name="sub" value="1001"></i></td><td align="left">推荐楼层4楼——多图1</td><td align="left">推荐楼层4楼——多图广告位</td><td class="adv_url" title="#">#</td><td class="center"><input type="number" class="input-common input-common-sort" fieldid="1001" value="0" onchange="updateAdvSort(this)" size="1"></td><td class="center"><a href="/system/updateshopadv?adv_id=1001&amp;type=1">编辑</a> <a href="javascript:;" onclick="delShopAdv(1001)">删除</a></td> </tr><tr align="center"><td><i class="checkbox-common"><input type="checkbox" name="sub" value="949"></i></td><td align="left">广告栏一图片2</td><td align="left">商城首页中部推荐广告位</td><td class="adv_url" title="javascript:;">javascript:;</td><td class="center"><input type="number" class="input-common input-common-sort" fieldid="949" value="1" onchange="updateAdvSort(this)" size="1"></td><td class="center"><a href="/system/updateshopadv?adv_id=949&amp;type=1">编辑</a> <a href="javascript:;" onclick="delShopAdv(949)">删除</a></td> </tr><tr align="center"><td><i class="checkbox-common"><input type="checkbox" name="sub" value="959"></i></td><td align="left">推荐楼层1楼——轮播图2</td><td align="left">推荐楼层1楼——轮播图广告位</td><td class="adv_url" title="#">#</td><td class="center"><input type="number" class="input-common input-common-sort" fieldid="959" value="1" onchange="updateAdvSort(this)" size="1"></td><td class="center"><a href="/system/updateshopadv?adv_id=959&amp;type=1">编辑</a> <a href="javascript:;" onclick="delShopAdv(959)">删除</a></td> </tr><tr align="center"><td><i class="checkbox-common"><input type="checkbox" name="sub" value="962"></i></td><td align="left">推荐楼层1楼——多图2</td><td align="left">推荐楼层1楼——多图广告位</td><td class="adv_url" title="#">#</td><td class="center"><input type="number" class="input-common input-common-sort" fieldid="962" value="1" onchange="updateAdvSort(this)" size="1"></td><td class="center"><a href="/system/updateshopadv?adv_id=962&amp;type=1">编辑</a> <a href="javascript:;" onclick="delShopAdv(962)">删除</a></td> </tr><tr align="center"><td><i class="checkbox-common"><input type="checkbox" name="sub" value="976"></i></td><td align="left">推荐楼层2楼——轮播图1</td><td align="left">推荐楼层2楼——轮播图广告位</td><td class="adv_url" title="#">#</td><td class="center"><input type="number" class="input-common input-common-sort" fieldid="976" value="1" onchange="updateAdvSort(this)" size="1"></td><td class="center"><a href="/system/updateshopadv?adv_id=976&amp;type=1">编辑</a> <a href="javascript:;" onclick="delShopAdv(976)">删除</a></td> </tr></tbody>
</table>
<input type="hidden" id="ap_id" value="">

<div class="page" id="turn-ul" style="">
	<div class="pagination">
		<ul>
			<li class="according-number">每页显示<input type="text" class="input-medium" id="showNumber" value="14" data-default="14" autocomplete="off">条</li>
			<li><a id="beginPage" class="page-disable" style="border: 1px solid #dddddd;">首页</a></li>
			<li><a id="prevPage" class="page-disable">上一页</a></li>
			<li id="pageNumber"><a onclick="JumpForPage(this)" class="currentPage">1</a><a onclick="JumpForPage(this)">2</a><a onclick="JumpForPage(this)">3</a></li>
			<li id="JslastPage"></li>
			<li><a id="nextPage">下一页</a></li>
			<li><a id="lastPage">末页</a></li>
			<li class="total-data" data-total-count="39">共39条</li>
			<!-- <li class="page-count">共0页</li> -->
			<li class="according-number">
				跳<input type="text" class="input-medium" id="skipPage" data-curr-page="1">页
			</li>
		</ul>
	</div>
</div>
<input type="hidden" id="page_count" value="3">
<input type="hidden" id="page_size" value="14">
		</div>
		
	</section>
</template>
