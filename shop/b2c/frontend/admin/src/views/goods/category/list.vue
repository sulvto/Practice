<template>
    
	<section class="ns-base-section">
		
		
		
		<div style="position:relative;margin:0;">
			<!-- 面包屑导航 -->
						<div class="breadcrumb-nav">
				<a href="http://b2c.niuteam.cn/admin.html">单商户B2C</a>
									<i class="fa fa-angle-right"></i>
					<a href="/goods/goodslist.html">商品</a>
									<i class="fa fa-angle-right"></i>
					<!-- 需要加跳转链接用这个：http://b2c.niuteam.cn/admin/goods/goodscategorylist -->
					<a href="javascript:;" style="color:#999;">商品分类</a>
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
									<p>相关教程：<a href="http://bbs.niushop.com.cn/forum.php?mod=viewthread&amp;tid=2303&amp;extra=page%3D3" target="_blank">http://bbs.niushop.com.cn/forum.php?mod=viewthread&amp;tid=2303&amp;extra=page%3D3</a></p>
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
<!-- 						<span>相关教程：<a href="http://bbs.niushop.com.cn/forum.php?mod=viewthread&tid=2303&extra=page%3D3" target="_blank">http://bbs.niushop.com.cn/forum.php?mod=viewthread&tid=2303&extra=page%3D3</a></span> -->
<!-- 						 -->
<!-- 					{1/block} -->
				</h4>
			</div>
		</div>
		
		
		<div class="ns-main">
			
<div class="options-btn">
	<button class="btn-common btn-small" onclick="location.href='/goods/addgoodscategory.html';">添加商品分类</button>
</div>
<table class="table-class">
	<colgroup>
		<col style="width: 2%;">
		<col style="width: 30%;">
		<col style="width: 30%;">
		<col style="width: 17%;">
		<col style="width: 7%;">
		<col style="width: 4%;">
		<col style="width: 10%;">
	</colgroup>
	<thead>
		<tr align="center">
			<th></th>
			<th align="left">分类名称</th>
			<th align="left">商品分类简称</th>
			<th align="left">关联类型</th>
			<th>是否显示</th>
			<th>排序</th>
			<th>操作</th>
		</tr>
	</thead>
	<tbody>
				<tr class="pid_0" style="height: 30px;" data-category-id="3" data-pid="0" data-level="1">
			<td>
								<a href="javascript:;" onclick="tab_switch(3)" class="tab_jia_3" style="display: block;">[+]</a>
				<a href="javascript:;" onclick="tab_switch(3)" class="tab_jian_3" style="display: none;">[-]</a>
							</td>
			
			<td>
				<input class="input-common middle" type="text" fieldid="3" fieldname="category_name" value="养护设备" style="width: 150px;">
				<a href="javascript:;" onclick="addChildGoodsCategory(this, 2, 3);">
				<span class="add-child"><i>添加子分类</i></span>
				</a>
			</td>
			<td><input class="input-common middle" type="text" fieldid="3" fieldname="short_name" value="2" style="width: 150px;"></td>
			<td></td>
			<td style="text-align: center;">否</td>
			<td style="text-align: center;"><input type="number" class="sort input-common input-common-sort" fieldid="3" fieldname="sort" value="3" size="1"></td>
			<td style="text-align: center;">
				<a href="/goods/updategoodscategory.html?category_id=3">修改</a>
				<a href="javascript:void(0);" onclick="delCategory(3)">删除</a>
			</td>
		</tr>
		
						<tr class="pid_3" style="height: 30px;display:none;" data-category-id="153" data-pid="3" data-level="2">
				<td>
										<a href="javascript:;" onclick="tab_switch(153)" class="tab_jian_153" style="display: block;">[-]</a>
					<a href="javascript:;" onclick="tab_switch(153)" class="tab_jia_153" style="display: none;">[+]</a>
									</td>
				
				<td><span style="color:#ccc;">|——</span> <input type="text" class="input-common middle" fieldid="153" fieldname="category_name" value="fgdsfasfasdf" style="width: 150px;">
					<a href="javascript:;" onclick="addChildGoodsCategory(this, 3, 153);">
						<span class="add-child"><i>添加子分类</i></span>
					</a>
				</td>
				<td><input type="text" class="input-common middle" fieldid="153" fieldname="short_name" value="" style="width: 150px;"></td>
				<td></td>
				<td style="text-align: center;">是</td>
				<td style="text-align: center;"><input type="number" class="sort input-common input-common-sort" fieldid="153" fieldname="sort" value="0" size="1"></td>
				<td style="text-align: center;">
					<a href="/goods/updategoodscategory.html?category_id=153">修改</a>
					<a href="javascript:void(0);" onclick="delCategory(153)">删除</a>
				</td>
			</tr>
			
								<tr class="pid_153 pid_3" style="height: 30px;display:none;" data-category-id="154" data-pid="153" data-level="3">
					<td></td>
					
					<td><span style="color:#ccc;">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;|——</span> <input class="input-common middle" type="text" fieldid="154" fieldname="category_name" value="fsafsdfsd" style="width: 150px;"></td>
					<td><input type="text" class="input-common middle" fieldid="154" fieldname="short_name" value="" style="width: 150px;"></td>
					<td></td>
					<td style="text-align: center;">是</td>
					<td style="text-align: center;"><input type="number" class="sort input-common input-common-sort" fieldid="154" fieldname="sort" value="0" size="1"></td>
					<td style="text-align: center;">
						<a href="/goods/updategoodscategory.html?category_id=154">修改</a>
						<a href="javascript:void(0);" onclick="delCategory(154)">删除</a>
					</td>
				</tr>
							<tr class="pid_3" style="height: 30px;display:none;" data-category-id="161" data-pid="3" data-level="2">
				<td>
									</td>
				
				<td><span style="color:#ccc;">|——</span> <input type="text" class="input-common middle" fieldid="161" fieldname="category_name" value="wqqqdas" style="width: 150px;">
					<a href="javascript:;" onclick="addChildGoodsCategory(this, 3, 161);">
						<span class="add-child"><i>添加子分类</i></span>
					</a>
				</td>
				<td><input type="text" class="input-common middle" fieldid="161" fieldname="short_name" value="" style="width: 150px;"></td>
				<td></td>
				<td style="text-align: center;">是</td>
				<td style="text-align: center;"><input type="number" class="sort input-common input-common-sort" fieldid="161" fieldname="sort" value="0" size="1"></td>
				<td style="text-align: center;">
					<a href="/goods/updategoodscategory.html?category_id=161">修改</a>
					<a href="javascript:void(0);" onclick="delCategory(161)">删除</a>
				</td>
			</tr>
			
							<tr class="pid_3" style="height: 30px;display:none;" data-category-id="21" data-pid="3" data-level="2">
				<td>
										<a href="javascript:;" onclick="tab_switch(21)" class="tab_jian_21" style="display: block;">[-]</a>
					<a href="javascript:;" onclick="tab_switch(21)" class="tab_jia_21" style="display: none;">[+]</a>
									</td>
				
				<td><span style="color:#ccc;">|——</span> <input type="text" class="input-common middle" fieldid="21" fieldname="category_name" value="电脑整机" style="width: 150px;">
					<a href="javascript:;" onclick="addChildGoodsCategory(this, 3, 21);">
						<span class="add-child"><i>添加子分类</i></span>
					</a>
				</td>
				<td><input type="text" class="input-common middle" fieldid="21" fieldname="short_name" value="电脑整机" style="width: 150px;"></td>
				<td></td>
				<td style="text-align: center;">是</td>
				<td style="text-align: center;"><input type="number" class="sort input-common input-common-sort" fieldid="21" fieldname="sort" value="1" size="1"></td>
				<td style="text-align: center;">
					<a href="/goods/updategoodscategory.html?category_id=21">修改</a>
					<a href="javascript:void(0);" onclick="delCategory(21)">删除</a>
				</td>
			</tr>
			
								<tr class="pid_21 pid_3" style="height: 30px;display:none;" data-category-id="73" data-pid="21" data-level="3">
					<td></td>
					
					<td><span style="color:#ccc;">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;|——</span> <input class="input-common middle" type="text" fieldid="73" fieldname="category_name" value="笔记本" style="width: 150px;"></td>
					<td><input type="text" class="input-common middle" fieldid="73" fieldname="short_name" value="笔记本" style="width: 150px;"></td>
					<td>美体专区</td>
					<td style="text-align: center;">是</td>
					<td style="text-align: center;"><input type="number" class="sort input-common input-common-sort" fieldid="73" fieldname="sort" value="1" size="1"></td>
					<td style="text-align: center;">
						<a href="/goods/updategoodscategory.html?category_id=73">修改</a>
						<a href="javascript:void(0);" onclick="delCategory(73)">删除</a>
					</td>
				</tr>
								<tr class="pid_21 pid_3" style="height: 30px;display:none;" data-category-id="74" data-pid="21" data-level="3">
					<td></td>
					
					<td><span style="color:#ccc;">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;|——</span> <input class="input-common middle" type="text" fieldid="74" fieldname="category_name" value="游戏本" style="width: 150px;"></td>
					<td><input type="text" class="input-common middle" fieldid="74" fieldname="short_name" value="游戏本" style="width: 150px;"></td>
					<td></td>
					<td style="text-align: center;">是</td>
					<td style="text-align: center;"><input type="number" class="sort input-common input-common-sort" fieldid="74" fieldname="sort" value="2" size="1"></td>
					<td style="text-align: center;">
						<a href="/goods/updategoodscategory.html?category_id=74">修改</a>
						<a href="javascript:void(0);" onclick="delCategory(74)">删除</a>
					</td>
				</tr>
								<tr class="pid_21 pid_3" style="height: 30px;display:none;" data-category-id="75" data-pid="21" data-level="3">
					<td></td>
					
					<td><span style="color:#ccc;">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;|——</span> <input class="input-common middle" type="text" fieldid="75" fieldname="category_name" value="平板电脑" style="width: 150px;"></td>
					<td><input type="text" class="input-common middle" fieldid="75" fieldname="short_name" value="平板电脑" style="width: 150px;"></td>
					<td></td>
					<td style="text-align: center;">是</td>
					<td style="text-align: center;"><input type="number" class="sort input-common input-common-sort" fieldid="75" fieldname="sort" value="3" size="1"></td>
					<td style="text-align: center;">
						<a href="/goods/updategoodscategory.html?category_id=75">修改</a>
						<a href="javascript:void(0);" onclick="delCategory(75)">删除</a>
					</td>
				</tr>
							<tr class="pid_3" style="height: 30px;display:none;" data-category-id="22" data-pid="3" data-level="2">
				<td>
										<a href="javascript:;" onclick="tab_switch(22)" class="tab_jian_22" style="display: block;">[-]</a>
					<a href="javascript:;" onclick="tab_switch(22)" class="tab_jia_22" style="display: none;">[+]</a>
									</td>
				
				<td><span style="color:#ccc;">|——</span> <input type="text" class="input-common middle" fieldid="22" fieldname="category_name" value="电脑配件" style="width: 150px;">
					<a href="javascript:;" onclick="addChildGoodsCategory(this, 3, 22);">
						<span class="add-child"><i>添加子分类</i></span>
					</a>
				</td>
				<td><input type="text" class="input-common middle" fieldid="22" fieldname="short_name" value="电脑配件" style="width: 150px;"></td>
				<td></td>
				<td style="text-align: center;">是</td>
				<td style="text-align: center;"><input type="number" class="sort input-common input-common-sort" fieldid="22" fieldname="sort" value="2" size="1"></td>
				<td style="text-align: center;">
					<a href="/goods/updategoodscategory.html?category_id=22">修改</a>
					<a href="javascript:void(0);" onclick="delCategory(22)">删除</a>
				</td>
			</tr>
			
								<tr class="pid_22 pid_3" style="height: 30px;display:none;" data-category-id="76" data-pid="22" data-level="3">
					<td></td>
					
					<td><span style="color:#ccc;">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;|——</span> <input class="input-common middle" type="text" fieldid="76" fieldname="category_name" value="显示器" style="width: 150px;"></td>
					<td><input type="text" class="input-common middle" fieldid="76" fieldname="short_name" value="显示器" style="width: 150px;"></td>
					<td></td>
					<td style="text-align: center;">是</td>
					<td style="text-align: center;"><input type="number" class="sort input-common input-common-sort" fieldid="76" fieldname="sort" value="1" size="1"></td>
					<td style="text-align: center;">
						<a href="/goods/updategoodscategory.html?category_id=76">修改</a>
						<a href="javascript:void(0);" onclick="delCategory(76)">删除</a>
					</td>
				</tr>
								<tr class="pid_22 pid_3" style="height: 30px;display:none;" data-category-id="77" data-pid="22" data-level="3">
					<td></td>
					
					<td><span style="color:#ccc;">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;|——</span> <input class="input-common middle" type="text" fieldid="77" fieldname="category_name" value="CPU" style="width: 150px;"></td>
					<td><input type="text" class="input-common middle" fieldid="77" fieldname="short_name" value="CPU" style="width: 150px;"></td>
					<td></td>
					<td style="text-align: center;">是</td>
					<td style="text-align: center;"><input type="number" class="sort input-common input-common-sort" fieldid="77" fieldname="sort" value="2" size="1"></td>
					<td style="text-align: center;">
						<a href="/goods/updategoodscategory.html?category_id=77">修改</a>
						<a href="javascript:void(0);" onclick="delCategory(77)">删除</a>
					</td>
				</tr>
								<tr class="pid_22 pid_3" style="height: 30px;display:none;" data-category-id="78" data-pid="22" data-level="3">
					<td></td>
					
					<td><span style="color:#ccc;">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;|——</span> <input class="input-common middle" type="text" fieldid="78" fieldname="category_name" value="主板" style="width: 150px;"></td>
					<td><input type="text" class="input-common middle" fieldid="78" fieldname="short_name" value="主板" style="width: 150px;"></td>
					<td></td>
					<td style="text-align: center;">是</td>
					<td style="text-align: center;"><input type="number" class="sort input-common input-common-sort" fieldid="78" fieldname="sort" value="3" size="1"></td>
					<td style="text-align: center;">
						<a href="/goods/updategoodscategory.html?category_id=78">修改</a>
						<a href="javascript:void(0);" onclick="delCategory(78)">删除</a>
					</td>
				</tr>
							<tr class="pid_3" style="height: 30px;display:none;" data-category-id="23" data-pid="3" data-level="2">
				<td>
										<a href="javascript:;" onclick="tab_switch(23)" class="tab_jian_23" style="display: block;">[-]</a>
					<a href="javascript:;" onclick="tab_switch(23)" class="tab_jia_23" style="display: none;">[+]</a>
									</td>
				
				<td><span style="color:#ccc;">|——</span> <input type="text" class="input-common middle" fieldid="23" fieldname="category_name" value="外设产品" style="width: 150px;">
					<a href="javascript:;" onclick="addChildGoodsCategory(this, 3, 23);">
						<span class="add-child"><i>添加子分类</i></span>
					</a>
				</td>
				<td><input type="text" class="input-common middle" fieldid="23" fieldname="short_name" value="外设产品" style="width: 150px;"></td>
				<td></td>
				<td style="text-align: center;">是</td>
				<td style="text-align: center;"><input type="number" class="sort input-common input-common-sort" fieldid="23" fieldname="sort" value="3" size="1"></td>
				<td style="text-align: center;">
					<a href="/goods/updategoodscategory.html?category_id=23">修改</a>
					<a href="javascript:void(0);" onclick="delCategory(23)">删除</a>
				</td>
			</tr>
			
								<tr class="pid_23 pid_3" style="height: 30px;display:none;" data-category-id="79" data-pid="23" data-level="3">
					<td></td>
					
					<td><span style="color:#ccc;">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;|——</span> <input class="input-common middle" type="text" fieldid="79" fieldname="category_name" value="鼠标" style="width: 150px;"></td>
					<td><input type="text" class="input-common middle" fieldid="79" fieldname="short_name" value="鼠标" style="width: 150px;"></td>
					<td></td>
					<td style="text-align: center;">是</td>
					<td style="text-align: center;"><input type="number" class="sort input-common input-common-sort" fieldid="79" fieldname="sort" value="1" size="1"></td>
					<td style="text-align: center;">
						<a href="/goods/updategoodscategory.html?category_id=79">修改</a>
						<a href="javascript:void(0);" onclick="delCategory(79)">删除</a>
					</td>
				</tr>
								<tr class="pid_23 pid_3" style="height: 30px;display:none;" data-category-id="80" data-pid="23" data-level="3">
					<td></td>
					
					<td><span style="color:#ccc;">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;|——</span> <input class="input-common middle" type="text" fieldid="80" fieldname="category_name" value="键盘" style="width: 150px;"></td>
					<td><input type="text" class="input-common middle" fieldid="80" fieldname="short_name" value="键盘" style="width: 150px;"></td>
					<td></td>
					<td style="text-align: center;">是</td>
					<td style="text-align: center;"><input type="number" class="sort input-common input-common-sort" fieldid="80" fieldname="sort" value="2" size="1"></td>
					<td style="text-align: center;">
						<a href="/goods/updategoodscategory.html?category_id=80">修改</a>
						<a href="javascript:void(0);" onclick="delCategory(80)">删除</a>
					</td>
				</tr>
								<tr class="pid_23 pid_3" style="height: 30px;display:none;" data-category-id="81" data-pid="23" data-level="3">
					<td></td>
					
					<td><span style="color:#ccc;">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;|——</span> <input class="input-common middle" type="text" fieldid="81" fieldname="category_name" value="键鼠套装" style="width: 150px;"></td>
					<td><input type="text" class="input-common middle" fieldid="81" fieldname="short_name" value="键鼠套装" style="width: 150px;"></td>
					<td></td>
					<td style="text-align: center;">是</td>
					<td style="text-align: center;"><input type="number" class="sort input-common input-common-sort" fieldid="81" fieldname="sort" value="3" size="1"></td>
					<td style="text-align: center;">
						<a href="/goods/updategoodscategory.html?category_id=81">修改</a>
						<a href="javascript:void(0);" onclick="delCategory(81)">删除</a>
					</td>
				</tr>
						<tr class="pid_0" style="height: 30px;" data-category-id="4" data-pid="0" data-level="1">
			<td>
								<a href="javascript:;" onclick="tab_switch(4)" class="tab_jia_4" style="display: block;">[+]</a>
				<a href="javascript:;" onclick="tab_switch(4)" class="tab_jian_4" style="display: none;">[-]</a>
							</td>
			
			<td>
				<input class="input-common middle" type="text" fieldid="4" fieldname="category_name" value="工程设备" style="width: 150px;">
				<a href="javascript:;" onclick="addChildGoodsCategory(this, 2, 4);">
				<span class="add-child"><i>添加子分类</i></span>
				</a>
			</td>
			<td><input class="input-common middle" type="text" fieldid="4" fieldname="short_name" value="3" style="width: 150px;"></td>
			<td></td>
			<td style="text-align: center;">否</td>
			<td style="text-align: center;"><input type="number" class="sort input-common input-common-sort" fieldid="4" fieldname="sort" value="4" size="1"></td>
			<td style="text-align: center;">
				<a href="/goods/updategoodscategory.html?category_id=4">修改</a>
				<a href="javascript:void(0);" onclick="delCategory(4)">删除</a>
			</td>
		</tr>
		
						<tr class="pid_4" style="height: 30px;display:none;" data-category-id="24" data-pid="4" data-level="2">
				<td>
										<a href="javascript:;" onclick="tab_switch(24)" class="tab_jian_24" style="display: block;">[-]</a>
					<a href="javascript:;" onclick="tab_switch(24)" class="tab_jia_24" style="display: none;">[+]</a>
									</td>
				
				<td><span style="color:#ccc;">|——</span> <input type="text" class="input-common middle" fieldid="24" fieldname="category_name" value="厨具" style="width: 150px;">
					<a href="javascript:;" onclick="addChildGoodsCategory(this, 3, 24);">
						<span class="add-child"><i>添加子分类</i></span>
					</a>
				</td>
				<td><input type="text" class="input-common middle" fieldid="24" fieldname="short_name" value="厨具" style="width: 150px;"></td>
				<td></td>
				<td style="text-align: center;">是</td>
				<td style="text-align: center;"><input type="number" class="sort input-common input-common-sort" fieldid="24" fieldname="sort" value="1" size="1"></td>
				<td style="text-align: center;">
					<a href="/goods/updategoodscategory.html?category_id=24">修改</a>
					<a href="javascript:void(0);" onclick="delCategory(24)">删除</a>
				</td>
			</tr>
			
								<tr class="pid_24 pid_4" style="height: 30px;display:none;" data-category-id="82" data-pid="24" data-level="3">
					<td></td>
					
					<td><span style="color:#ccc;">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;|——</span> <input class="input-common middle" type="text" fieldid="82" fieldname="category_name" value="烹饪锅具" style="width: 150px;"></td>
					<td><input type="text" class="input-common middle" fieldid="82" fieldname="short_name" value="烹饪锅具" style="width: 150px;"></td>
					<td></td>
					<td style="text-align: center;">是</td>
					<td style="text-align: center;"><input type="number" class="sort input-common input-common-sort" fieldid="82" fieldname="sort" value="1" size="1"></td>
					<td style="text-align: center;">
						<a href="/goods/updategoodscategory.html?category_id=82">修改</a>
						<a href="javascript:void(0);" onclick="delCategory(82)">删除</a>
					</td>
				</tr>
								<tr class="pid_24 pid_4" style="height: 30px;display:none;" data-category-id="83" data-pid="24" data-level="3">
					<td></td>
					
					<td><span style="color:#ccc;">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;|——</span> <input class="input-common middle" type="text" fieldid="83" fieldname="category_name" value="刀剪菜板" style="width: 150px;"></td>
					<td><input type="text" class="input-common middle" fieldid="83" fieldname="short_name" value="刀剪菜板" style="width: 150px;"></td>
					<td></td>
					<td style="text-align: center;">是</td>
					<td style="text-align: center;"><input type="number" class="sort input-common input-common-sort" fieldid="83" fieldname="sort" value="2" size="1"></td>
					<td style="text-align: center;">
						<a href="/goods/updategoodscategory.html?category_id=83">修改</a>
						<a href="javascript:void(0);" onclick="delCategory(83)">删除</a>
					</td>
				</tr>
								<tr class="pid_24 pid_4" style="height: 30px;display:none;" data-category-id="84" data-pid="24" data-level="3">
					<td></td>
					
					<td><span style="color:#ccc;">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;|——</span> <input class="input-common middle" type="text" fieldid="84" fieldname="category_name" value="厨房配件" style="width: 150px;"></td>
					<td><input type="text" class="input-common middle" fieldid="84" fieldname="short_name" value="厨房配件" style="width: 150px;"></td>
					<td></td>
					<td style="text-align: center;">是</td>
					<td style="text-align: center;"><input type="number" class="sort input-common input-common-sort" fieldid="84" fieldname="sort" value="3" size="1"></td>
					<td style="text-align: center;">
						<a href="/goods/updategoodscategory.html?category_id=84">修改</a>
						<a href="javascript:void(0);" onclick="delCategory(84)">删除</a>
					</td>
				</tr>
							<tr class="pid_4" style="height: 30px;display:none;" data-category-id="25" data-pid="4" data-level="2">
				<td>
										<a href="javascript:;" onclick="tab_switch(25)" class="tab_jian_25" style="display: block;">[-]</a>
					<a href="javascript:;" onclick="tab_switch(25)" class="tab_jia_25" style="display: none;">[+]</a>
									</td>
				
				<td><span style="color:#ccc;">|——</span> <input type="text" class="input-common middle" fieldid="25" fieldname="category_name" value="家纺" style="width: 150px;">
					<a href="javascript:;" onclick="addChildGoodsCategory(this, 3, 25);">
						<span class="add-child"><i>添加子分类</i></span>
					</a>
				</td>
				<td><input type="text" class="input-common middle" fieldid="25" fieldname="short_name" value="家纺" style="width: 150px;"></td>
				<td></td>
				<td style="text-align: center;">是</td>
				<td style="text-align: center;"><input type="number" class="sort input-common input-common-sort" fieldid="25" fieldname="sort" value="2" size="1"></td>
				<td style="text-align: center;">
					<a href="/goods/updategoodscategory.html?category_id=25">修改</a>
					<a href="javascript:void(0);" onclick="delCategory(25)">删除</a>
				</td>
			</tr>
			
								<tr class="pid_25 pid_4" style="height: 30px;display:none;" data-category-id="85" data-pid="25" data-level="3">
					<td></td>
					
					<td><span style="color:#ccc;">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;|——</span> <input class="input-common middle" type="text" fieldid="85" fieldname="category_name" value="床品套件" style="width: 150px;"></td>
					<td><input type="text" class="input-common middle" fieldid="85" fieldname="short_name" value="床品套件" style="width: 150px;"></td>
					<td></td>
					<td style="text-align: center;">是</td>
					<td style="text-align: center;"><input type="number" class="sort input-common input-common-sort" fieldid="85" fieldname="sort" value="1" size="1"></td>
					<td style="text-align: center;">
						<a href="/goods/updategoodscategory.html?category_id=85">修改</a>
						<a href="javascript:void(0);" onclick="delCategory(85)">删除</a>
					</td>
				</tr>
								<tr class="pid_25 pid_4" style="height: 30px;display:none;" data-category-id="86" data-pid="25" data-level="3">
					<td></td>
					
					<td><span style="color:#ccc;">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;|——</span> <input class="input-common middle" type="text" fieldid="86" fieldname="category_name" value="被子" style="width: 150px;"></td>
					<td><input type="text" class="input-common middle" fieldid="86" fieldname="short_name" value="被子" style="width: 150px;"></td>
					<td></td>
					<td style="text-align: center;">是</td>
					<td style="text-align: center;"><input type="number" class="sort input-common input-common-sort" fieldid="86" fieldname="sort" value="2" size="1"></td>
					<td style="text-align: center;">
						<a href="/goods/updategoodscategory.html?category_id=86">修改</a>
						<a href="javascript:void(0);" onclick="delCategory(86)">删除</a>
					</td>
				</tr>
								<tr class="pid_25 pid_4" style="height: 30px;display:none;" data-category-id="87" data-pid="25" data-level="3">
					<td></td>
					
					<td><span style="color:#ccc;">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;|——</span> <input class="input-common middle" type="text" fieldid="87" fieldname="category_name" value="枕芯" style="width: 150px;"></td>
					<td><input type="text" class="input-common middle" fieldid="87" fieldname="short_name" value="枕芯" style="width: 150px;"></td>
					<td></td>
					<td style="text-align: center;">是</td>
					<td style="text-align: center;"><input type="number" class="sort input-common input-common-sort" fieldid="87" fieldname="sort" value="3" size="1"></td>
					<td style="text-align: center;">
						<a href="/goods/updategoodscategory.html?category_id=87">修改</a>
						<a href="javascript:void(0);" onclick="delCategory(87)">删除</a>
					</td>
				</tr>
							<tr class="pid_4" style="height: 30px;display:none;" data-category-id="26" data-pid="4" data-level="2">
				<td>
										<a href="javascript:;" onclick="tab_switch(26)" class="tab_jian_26" style="display: block;">[-]</a>
					<a href="javascript:;" onclick="tab_switch(26)" class="tab_jia_26" style="display: none;">[+]</a>
									</td>
				
				<td><span style="color:#ccc;">|——</span> <input type="text" class="input-common middle" fieldid="26" fieldname="category_name" value="生活用品" style="width: 150px;">
					<a href="javascript:;" onclick="addChildGoodsCategory(this, 3, 26);">
						<span class="add-child"><i>添加子分类</i></span>
					</a>
				</td>
				<td><input type="text" class="input-common middle" fieldid="26" fieldname="short_name" value="生活用品" style="width: 150px;"></td>
				<td></td>
				<td style="text-align: center;">是</td>
				<td style="text-align: center;"><input type="number" class="sort input-common input-common-sort" fieldid="26" fieldname="sort" value="3" size="1"></td>
				<td style="text-align: center;">
					<a href="/goods/updategoodscategory.html?category_id=26">修改</a>
					<a href="javascript:void(0);" onclick="delCategory(26)">删除</a>
				</td>
			</tr>
			
								<tr class="pid_26 pid_4" style="height: 30px;display:none;" data-category-id="88" data-pid="26" data-level="3">
					<td></td>
					
					<td><span style="color:#ccc;">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;|——</span> <input class="input-common middle" type="text" fieldid="88" fieldname="category_name" value="收纳用品" style="width: 150px;"></td>
					<td><input type="text" class="input-common middle" fieldid="88" fieldname="short_name" value="收纳用品" style="width: 150px;"></td>
					<td></td>
					<td style="text-align: center;">是</td>
					<td style="text-align: center;"><input type="number" class="sort input-common input-common-sort" fieldid="88" fieldname="sort" value="1" size="1"></td>
					<td style="text-align: center;">
						<a href="/goods/updategoodscategory.html?category_id=88">修改</a>
						<a href="javascript:void(0);" onclick="delCategory(88)">删除</a>
					</td>
				</tr>
								<tr class="pid_26 pid_4" style="height: 30px;display:none;" data-category-id="89" data-pid="26" data-level="3">
					<td></td>
					
					<td><span style="color:#ccc;">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;|——</span> <input class="input-common middle" type="text" fieldid="89" fieldname="category_name" value="雨伞雨具" style="width: 150px;"></td>
					<td><input type="text" class="input-common middle" fieldid="89" fieldname="short_name" value="雨伞雨具" style="width: 150px;"></td>
					<td></td>
					<td style="text-align: center;">是</td>
					<td style="text-align: center;"><input type="number" class="sort input-common input-common-sort" fieldid="89" fieldname="sort" value="2" size="1"></td>
					<td style="text-align: center;">
						<a href="/goods/updategoodscategory.html?category_id=89">修改</a>
						<a href="javascript:void(0);" onclick="delCategory(89)">删除</a>
					</td>
				</tr>
								<tr class="pid_26 pid_4" style="height: 30px;display:none;" data-category-id="90" data-pid="26" data-level="3">
					<td></td>
					
					<td><span style="color:#ccc;">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;|——</span> <input class="input-common middle" type="text" fieldid="90" fieldname="category_name" value="净化除味" style="width: 150px;"></td>
					<td><input type="text" class="input-common middle" fieldid="90" fieldname="short_name" value="净化除味" style="width: 150px;"></td>
					<td>jinghua</td>
					<td style="text-align: center;">是</td>
					<td style="text-align: center;"><input type="number" class="sort input-common input-common-sort" fieldid="90" fieldname="sort" value="3" size="1"></td>
					<td style="text-align: center;">
						<a href="/goods/updategoodscategory.html?category_id=90">修改</a>
						<a href="javascript:void(0);" onclick="delCategory(90)">删除</a>
					</td>
				</tr>
						<tr class="pid_0" style="height: 30px;" data-category-id="5" data-pid="0" data-level="1">
			<td>
								<a href="javascript:;" onclick="tab_switch(5)" class="tab_jia_5" style="display: block;">[+]</a>
				<a href="javascript:;" onclick="tab_switch(5)" class="tab_jian_5" style="display: none;">[-]</a>
							</td>
			
			<td>
				<input class="input-common middle" type="text" fieldid="5" fieldname="category_name" value="环卫设备" style="width: 150px;">
				<a href="javascript:;" onclick="addChildGoodsCategory(this, 2, 5);">
				<span class="add-child"><i>添加子分类</i></span>
				</a>
			</td>
			<td><input class="input-common middle" type="text" fieldid="5" fieldname="short_name" value="衣服" style="width: 150px;"></td>
			<td></td>
			<td style="text-align: center;">否</td>
			<td style="text-align: center;"><input type="number" class="sort input-common input-common-sort" fieldid="5" fieldname="sort" value="5" size="1"></td>
			<td style="text-align: center;">
				<a href="/goods/updategoodscategory.html?category_id=5">修改</a>
				<a href="javascript:void(0);" onclick="delCategory(5)">删除</a>
			</td>
		</tr>
		
						<tr class="pid_5" style="height: 30px;display:none;" data-category-id="27" data-pid="5" data-level="2">
				<td>
										<a href="javascript:;" onclick="tab_switch(27)" class="tab_jian_27" style="display: block;">[-]</a>
					<a href="javascript:;" onclick="tab_switch(27)" class="tab_jia_27" style="display: none;">[+]</a>
									</td>
				
				<td><span style="color:#ccc;">|——</span> <input type="text" class="input-common middle" fieldid="27" fieldname="category_name" value="女装" style="width: 150px;">
					<a href="javascript:;" onclick="addChildGoodsCategory(this, 3, 27);">
						<span class="add-child"><i>添加子分类</i></span>
					</a>
				</td>
				<td><input type="text" class="input-common middle" fieldid="27" fieldname="short_name" value="女装" style="width: 150px;"></td>
				<td></td>
				<td style="text-align: center;">是</td>
				<td style="text-align: center;"><input type="number" class="sort input-common input-common-sort" fieldid="27" fieldname="sort" value="1" size="1"></td>
				<td style="text-align: center;">
					<a href="/goods/updategoodscategory.html?category_id=27">修改</a>
					<a href="javascript:void(0);" onclick="delCategory(27)">删除</a>
				</td>
			</tr>
			
								<tr class="pid_27 pid_5" style="height: 30px;display:none;" data-category-id="91" data-pid="27" data-level="3">
					<td></td>
					
					<td><span style="color:#ccc;">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;|——</span> <input class="input-common middle" type="text" fieldid="91" fieldname="category_name" value="商场同款" style="width: 150px;"></td>
					<td><input type="text" class="input-common middle" fieldid="91" fieldname="short_name" value="商场同款" style="width: 150px;"></td>
					<td></td>
					<td style="text-align: center;">是</td>
					<td style="text-align: center;"><input type="number" class="sort input-common input-common-sort" fieldid="91" fieldname="sort" value="1" size="1"></td>
					<td style="text-align: center;">
						<a href="/goods/updategoodscategory.html?category_id=91">修改</a>
						<a href="javascript:void(0);" onclick="delCategory(91)">删除</a>
					</td>
				</tr>
								<tr class="pid_27 pid_5" style="height: 30px;display:none;" data-category-id="92" data-pid="27" data-level="3">
					<td></td>
					
					<td><span style="color:#ccc;">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;|——</span> <input class="input-common middle" type="text" fieldid="92" fieldname="category_name" value="当季热卖" style="width: 150px;"></td>
					<td><input type="text" class="input-common middle" fieldid="92" fieldname="short_name" value="当季热卖" style="width: 150px;"></td>
					<td></td>
					<td style="text-align: center;">是</td>
					<td style="text-align: center;"><input type="number" class="sort input-common input-common-sort" fieldid="92" fieldname="sort" value="2" size="1"></td>
					<td style="text-align: center;">
						<a href="/goods/updategoodscategory.html?category_id=92">修改</a>
						<a href="javascript:void(0);" onclick="delCategory(92)">删除</a>
					</td>
				</tr>
								<tr class="pid_27 pid_5" style="height: 30px;display:none;" data-category-id="93" data-pid="27" data-level="3">
					<td></td>
					
					<td><span style="color:#ccc;">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;|——</span> <input class="input-common middle" type="text" fieldid="93" fieldname="category_name" value="2017新品" style="width: 150px;"></td>
					<td><input type="text" class="input-common middle" fieldid="93" fieldname="short_name" value="2017新品" style="width: 150px;"></td>
					<td></td>
					<td style="text-align: center;">是</td>
					<td style="text-align: center;"><input type="number" class="sort input-common input-common-sort" fieldid="93" fieldname="sort" value="3" size="1"></td>
					<td style="text-align: center;">
						<a href="/goods/updategoodscategory.html?category_id=93">修改</a>
						<a href="javascript:void(0);" onclick="delCategory(93)">删除</a>
					</td>
				</tr>
							<tr class="pid_5" style="height: 30px;display:none;" data-category-id="28" data-pid="5" data-level="2">
				<td>
										<a href="javascript:;" onclick="tab_switch(28)" class="tab_jian_28" style="display: block;">[-]</a>
					<a href="javascript:;" onclick="tab_switch(28)" class="tab_jia_28" style="display: none;">[+]</a>
									</td>
				
				<td><span style="color:#ccc;">|——</span> <input type="text" class="input-common middle" fieldid="28" fieldname="category_name" value="男装" style="width: 150px;">
					<a href="javascript:;" onclick="addChildGoodsCategory(this, 3, 28);">
						<span class="add-child"><i>添加子分类</i></span>
					</a>
				</td>
				<td><input type="text" class="input-common middle" fieldid="28" fieldname="short_name" value="男装" style="width: 150px;"></td>
				<td></td>
				<td style="text-align: center;">是</td>
				<td style="text-align: center;"><input type="number" class="sort input-common input-common-sort" fieldid="28" fieldname="sort" value="2" size="1"></td>
				<td style="text-align: center;">
					<a href="/goods/updategoodscategory.html?category_id=28">修改</a>
					<a href="javascript:void(0);" onclick="delCategory(28)">删除</a>
				</td>
			</tr>
			
								<tr class="pid_28 pid_5" style="height: 30px;display:none;" data-category-id="94" data-pid="28" data-level="3">
					<td></td>
					
					<td><span style="color:#ccc;">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;|——</span> <input class="input-common middle" type="text" fieldid="94" fieldname="category_name" value="商场同款" style="width: 150px;"></td>
					<td><input type="text" class="input-common middle" fieldid="94" fieldname="short_name" value="商场同款" style="width: 150px;"></td>
					<td></td>
					<td style="text-align: center;">是</td>
					<td style="text-align: center;"><input type="number" class="sort input-common input-common-sort" fieldid="94" fieldname="sort" value="1" size="1"></td>
					<td style="text-align: center;">
						<a href="/goods/updategoodscategory.html?category_id=94">修改</a>
						<a href="javascript:void(0);" onclick="delCategory(94)">删除</a>
					</td>
				</tr>
								<tr class="pid_28 pid_5" style="height: 30px;display:none;" data-category-id="95" data-pid="28" data-level="3">
					<td></td>
					
					<td><span style="color:#ccc;">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;|——</span> <input class="input-common middle" type="text" fieldid="95" fieldname="category_name" value="当季热卖" style="width: 150px;"></td>
					<td><input type="text" class="input-common middle" fieldid="95" fieldname="short_name" value="当季热卖" style="width: 150px;"></td>
					<td></td>
					<td style="text-align: center;">是</td>
					<td style="text-align: center;"><input type="number" class="sort input-common input-common-sort" fieldid="95" fieldname="sort" value="2" size="1"></td>
					<td style="text-align: center;">
						<a href="/goods/updategoodscategory.html?category_id=95">修改</a>
						<a href="javascript:void(0);" onclick="delCategory(95)">删除</a>
					</td>
				</tr>
								<tr class="pid_28 pid_5" style="height: 30px;display:none;" data-category-id="96" data-pid="28" data-level="3">
					<td></td>
					
					<td><span style="color:#ccc;">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;|——</span> <input class="input-common middle" type="text" fieldid="96" fieldname="category_name" value="2017新品" style="width: 150px;"></td>
					<td><input type="text" class="input-common middle" fieldid="96" fieldname="short_name" value="2017新品" style="width: 150px;"></td>
					<td></td>
					<td style="text-align: center;">是</td>
					<td style="text-align: center;"><input type="number" class="sort input-common input-common-sort" fieldid="96" fieldname="sort" value="3" size="1"></td>
					<td style="text-align: center;">
						<a href="/goods/updategoodscategory.html?category_id=96">修改</a>
						<a href="javascript:void(0);" onclick="delCategory(96)">删除</a>
					</td>
				</tr>
							<tr class="pid_5" style="height: 30px;display:none;" data-category-id="29" data-pid="5" data-level="2">
				<td>
										<a href="javascript:;" onclick="tab_switch(29)" class="tab_jian_29" style="display: block;">[-]</a>
					<a href="javascript:;" onclick="tab_switch(29)" class="tab_jia_29" style="display: none;">[+]</a>
									</td>
				
				<td><span style="color:#ccc;">|——</span> <input type="text" class="input-common middle" fieldid="29" fieldname="category_name" value="内衣" style="width: 150px;">
					<a href="javascript:;" onclick="addChildGoodsCategory(this, 3, 29);">
						<span class="add-child"><i>添加子分类</i></span>
					</a>
				</td>
				<td><input type="text" class="input-common middle" fieldid="29" fieldname="short_name" value="内衣" style="width: 150px;"></td>
				<td></td>
				<td style="text-align: center;">是</td>
				<td style="text-align: center;"><input type="number" class="sort input-common input-common-sort" fieldid="29" fieldname="sort" value="3" size="1"></td>
				<td style="text-align: center;">
					<a href="/goods/updategoodscategory.html?category_id=29">修改</a>
					<a href="javascript:void(0);" onclick="delCategory(29)">删除</a>
				</td>
			</tr>
			
								<tr class="pid_29 pid_5" style="height: 30px;display:none;" data-category-id="97" data-pid="29" data-level="3">
					<td></td>
					
					<td><span style="color:#ccc;">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;|——</span> <input class="input-common middle" type="text" fieldid="97" fieldname="category_name" value="文胸" style="width: 150px;"></td>
					<td><input type="text" class="input-common middle" fieldid="97" fieldname="short_name" value="文胸" style="width: 150px;"></td>
					<td></td>
					<td style="text-align: center;">是</td>
					<td style="text-align: center;"><input type="number" class="sort input-common input-common-sort" fieldid="97" fieldname="sort" value="1" size="1"></td>
					<td style="text-align: center;">
						<a href="/goods/updategoodscategory.html?category_id=97">修改</a>
						<a href="javascript:void(0);" onclick="delCategory(97)">删除</a>
					</td>
				</tr>
								<tr class="pid_29 pid_5" style="height: 30px;display:none;" data-category-id="98" data-pid="29" data-level="3">
					<td></td>
					
					<td><span style="color:#ccc;">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;|——</span> <input class="input-common middle" type="text" fieldid="98" fieldname="category_name" value="睡衣/家居服" style="width: 150px;"></td>
					<td><input type="text" class="input-common middle" fieldid="98" fieldname="short_name" value="睡衣/家居服" style="width: 150px;"></td>
					<td></td>
					<td style="text-align: center;">是</td>
					<td style="text-align: center;"><input type="number" class="sort input-common input-common-sort" fieldid="98" fieldname="sort" value="3" size="1"></td>
					<td style="text-align: center;">
						<a href="/goods/updategoodscategory.html?category_id=98">修改</a>
						<a href="javascript:void(0);" onclick="delCategory(98)">删除</a>
					</td>
				</tr>
								<tr class="pid_29 pid_5" style="height: 30px;display:none;" data-category-id="99" data-pid="29" data-level="3">
					<td></td>
					
					<td><span style="color:#ccc;">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;|——</span> <input class="input-common middle" type="text" fieldid="99" fieldname="category_name" value="男士内裤" style="width: 150px;"></td>
					<td><input type="text" class="input-common middle" fieldid="99" fieldname="short_name" value="男士内裤" style="width: 150px;"></td>
					<td></td>
					<td style="text-align: center;">是</td>
					<td style="text-align: center;"><input type="number" class="sort input-common input-common-sort" fieldid="99" fieldname="sort" value="3" size="1"></td>
					<td style="text-align: center;">
						<a href="/goods/updategoodscategory.html?category_id=99">修改</a>
						<a href="javascript:void(0);" onclick="delCategory(99)">删除</a>
					</td>
				</tr>
						<tr class="pid_0" style="height: 30px;" data-category-id="146" data-pid="0" data-level="1">
			<td>
								<a href="javascript:;" onclick="tab_switch(146)" class="tab_jia_146" style="display: block;">[+]</a>
				<a href="javascript:;" onclick="tab_switch(146)" class="tab_jian_146" style="display: none;">[-]</a>
							</td>
			
			<td>
				<input class="input-common middle" type="text" fieldid="146" fieldname="category_name" value="服装" style="width: 150px;">
				<a href="javascript:;" onclick="addChildGoodsCategory(this, 2, 146);">
				<span class="add-child"><i>添加子分类</i></span>
				</a>
			</td>
			<td><input class="input-common middle" type="text" fieldid="146" fieldname="short_name" value="男装" style="width: 150px;"></td>
			<td></td>
			<td style="text-align: center;">否</td>
			<td style="text-align: center;"><input type="number" class="sort input-common input-common-sort" fieldid="146" fieldname="sort" value="5" size="1"></td>
			<td style="text-align: center;">
				<a href="/goods/updategoodscategory.html?category_id=146">修改</a>
				<a href="javascript:void(0);" onclick="delCategory(146)">删除</a>
			</td>
		</tr>
		
						<tr class="pid_146" style="height: 30px;display:none;" data-category-id="147" data-pid="146" data-level="2">
				<td>
										<a href="javascript:;" onclick="tab_switch(147)" class="tab_jian_147" style="display: block;">[-]</a>
					<a href="javascript:;" onclick="tab_switch(147)" class="tab_jia_147" style="display: none;">[+]</a>
									</td>
				
				<td><span style="color:#ccc;">|——</span> <input type="text" class="input-common middle" fieldid="147" fieldname="category_name" value="女装" style="width: 150px;">
					<a href="javascript:;" onclick="addChildGoodsCategory(this, 3, 147);">
						<span class="add-child"><i>添加子分类</i></span>
					</a>
				</td>
				<td><input type="text" class="input-common middle" fieldid="147" fieldname="short_name" value="" style="width: 150px;"></td>
				<td></td>
				<td style="text-align: center;">是</td>
				<td style="text-align: center;"><input type="number" class="sort input-common input-common-sort" fieldid="147" fieldname="sort" value="0" size="1"></td>
				<td style="text-align: center;">
					<a href="/goods/updategoodscategory.html?category_id=147">修改</a>
					<a href="javascript:void(0);" onclick="delCategory(147)">删除</a>
				</td>
			</tr>
			
								<tr class="pid_147 pid_146" style="height: 30px;display:none;" data-category-id="149" data-pid="147" data-level="3">
					<td></td>
					
					<td><span style="color:#ccc;">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;|——</span> <input class="input-common middle" type="text" fieldid="149" fieldname="category_name" value="121の2" style="width: 150px;"></td>
					<td><input type="text" class="input-common middle" fieldid="149" fieldname="short_name" value="" style="width: 150px;"></td>
					<td></td>
					<td style="text-align: center;">是</td>
					<td style="text-align: center;"><input type="number" class="sort input-common input-common-sort" fieldid="149" fieldname="sort" value="0" size="1"></td>
					<td style="text-align: center;">
						<a href="/goods/updategoodscategory.html?category_id=149">修改</a>
						<a href="javascript:void(0);" onclick="delCategory(149)">删除</a>
					</td>
				</tr>
								<tr class="pid_147 pid_146" style="height: 30px;display:none;" data-category-id="151" data-pid="147" data-level="3">
					<td></td>
					
					<td><span style="color:#ccc;">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;|——</span> <input class="input-common middle" type="text" fieldid="151" fieldname="category_name" value="1214额" style="width: 150px;"></td>
					<td><input type="text" class="input-common middle" fieldid="151" fieldname="short_name" value="" style="width: 150px;"></td>
					<td></td>
					<td style="text-align: center;">是</td>
					<td style="text-align: center;"><input type="number" class="sort input-common input-common-sort" fieldid="151" fieldname="sort" value="0" size="1"></td>
					<td style="text-align: center;">
						<a href="/goods/updategoodscategory.html?category_id=151">修改</a>
						<a href="javascript:void(0);" onclick="delCategory(151)">删除</a>
					</td>
				</tr>
								<tr class="pid_147 pid_146" style="height: 30px;display:none;" data-category-id="152" data-pid="147" data-level="3">
					<td></td>
					
					<td><span style="color:#ccc;">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;|——</span> <input class="input-common middle" type="text" fieldid="152" fieldname="category_name" value="测试女装" style="width: 150px;"></td>
					<td><input type="text" class="input-common middle" fieldid="152" fieldname="short_name" value="测试女装" style="width: 150px;"></td>
					<td>衣服</td>
					<td style="text-align: center;">是</td>
					<td style="text-align: center;"><input type="number" class="sort input-common input-common-sort" fieldid="152" fieldname="sort" value="1" size="1"></td>
					<td style="text-align: center;">
						<a href="/goods/updategoodscategory.html?category_id=152">修改</a>
						<a href="javascript:void(0);" onclick="delCategory(152)">删除</a>
					</td>
				</tr>
							<tr class="pid_146" style="height: 30px;display:none;" data-category-id="148" data-pid="146" data-level="2">
				<td>
									</td>
				
				<td><span style="color:#ccc;">|——</span> <input type="text" class="input-common middle" fieldid="148" fieldname="category_name" value="男装" style="width: 150px;">
					<a href="javascript:;" onclick="addChildGoodsCategory(this, 3, 148);">
						<span class="add-child"><i>添加子分类</i></span>
					</a>
				</td>
				<td><input type="text" class="input-common middle" fieldid="148" fieldname="short_name" value="" style="width: 150px;"></td>
				<td></td>
				<td style="text-align: center;">是</td>
				<td style="text-align: center;"><input type="number" class="sort input-common input-common-sort" fieldid="148" fieldname="sort" value="0" size="1"></td>
				<td style="text-align: center;">
					<a href="/goods/updategoodscategory.html?category_id=148">修改</a>
					<a href="javascript:void(0);" onclick="delCategory(148)">删除</a>
				</td>
			</tr>
			
						<tr class="pid_0" style="height: 30px;" data-category-id="6" data-pid="0" data-level="1">
			<td>
								<a href="javascript:;" onclick="tab_switch(6)" class="tab_jia_6" style="display: block;">[+]</a>
				<a href="javascript:;" onclick="tab_switch(6)" class="tab_jian_6" style="display: none;">[-]</a>
							</td>
			
			<td>
				<input class="input-common middle" type="text" fieldid="6" fieldname="category_name" value="配件专区" style="width: 150px;">
				<a href="javascript:;" onclick="addChildGoodsCategory(this, 2, 6);">
				<span class="add-child"><i>添加子分类</i></span>
				</a>
			</td>
			<td><input class="input-common middle" type="text" fieldid="6" fieldname="short_name" value="美妆" style="width: 150px;"></td>
			<td></td>
			<td style="text-align: center;">否</td>
			<td style="text-align: center;"><input type="number" class="sort input-common input-common-sort" fieldid="6" fieldname="sort" value="6" size="1"></td>
			<td style="text-align: center;">
				<a href="/goods/updategoodscategory.html?category_id=6">修改</a>
				<a href="javascript:void(0);" onclick="delCategory(6)">删除</a>
			</td>
		</tr>
		
						<tr class="pid_6" style="height: 30px;display:none;" data-category-id="30" data-pid="6" data-level="2">
				<td>
										<a href="javascript:;" onclick="tab_switch(30)" class="tab_jian_30" style="display: block;">[-]</a>
					<a href="javascript:;" onclick="tab_switch(30)" class="tab_jia_30" style="display: none;">[+]</a>
									</td>
				
				<td><span style="color:#ccc;">|——</span> <input type="text" class="input-common middle" fieldid="30" fieldname="category_name" value="面部护肤" style="width: 150px;">
					<a href="javascript:;" onclick="addChildGoodsCategory(this, 3, 30);">
						<span class="add-child"><i>添加子分类</i></span>
					</a>
				</td>
				<td><input type="text" class="input-common middle" fieldid="30" fieldname="short_name" value="面部护肤" style="width: 150px;"></td>
				<td></td>
				<td style="text-align: center;">是</td>
				<td style="text-align: center;"><input type="number" class="sort input-common input-common-sort" fieldid="30" fieldname="sort" value="1" size="1"></td>
				<td style="text-align: center;">
					<a href="/goods/updategoodscategory.html?category_id=30">修改</a>
					<a href="javascript:void(0);" onclick="delCategory(30)">删除</a>
				</td>
			</tr>
			
								<tr class="pid_30 pid_6" style="height: 30px;display:none;" data-category-id="100" data-pid="30" data-level="3">
					<td></td>
					
					<td><span style="color:#ccc;">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;|——</span> <input class="input-common middle" type="text" fieldid="100" fieldname="category_name" value="补水保湿" style="width: 150px;"></td>
					<td><input type="text" class="input-common middle" fieldid="100" fieldname="short_name" value="补水保湿" style="width: 150px;"></td>
					<td></td>
					<td style="text-align: center;">是</td>
					<td style="text-align: center;"><input type="number" class="sort input-common input-common-sort" fieldid="100" fieldname="sort" value="1" size="1"></td>
					<td style="text-align: center;">
						<a href="/goods/updategoodscategory.html?category_id=100">修改</a>
						<a href="javascript:void(0);" onclick="delCategory(100)">删除</a>
					</td>
				</tr>
								<tr class="pid_30 pid_6" style="height: 30px;display:none;" data-category-id="101" data-pid="30" data-level="3">
					<td></td>
					
					<td><span style="color:#ccc;">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;|——</span> <input class="input-common middle" type="text" fieldid="101" fieldname="category_name" value="卸妆" style="width: 150px;"></td>
					<td><input type="text" class="input-common middle" fieldid="101" fieldname="short_name" value="卸妆" style="width: 150px;"></td>
					<td></td>
					<td style="text-align: center;">是</td>
					<td style="text-align: center;"><input type="number" class="sort input-common input-common-sort" fieldid="101" fieldname="sort" value="2" size="1"></td>
					<td style="text-align: center;">
						<a href="/goods/updategoodscategory.html?category_id=101">修改</a>
						<a href="javascript:void(0);" onclick="delCategory(101)">删除</a>
					</td>
				</tr>
								<tr class="pid_30 pid_6" style="height: 30px;display:none;" data-category-id="102" data-pid="30" data-level="3">
					<td></td>
					
					<td><span style="color:#ccc;">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;|——</span> <input class="input-common middle" type="text" fieldid="102" fieldname="category_name" value="洁面" style="width: 150px;"></td>
					<td><input type="text" class="input-common middle" fieldid="102" fieldname="short_name" value="洁面" style="width: 150px;"></td>
					<td></td>
					<td style="text-align: center;">是</td>
					<td style="text-align: center;"><input type="number" class="sort input-common input-common-sort" fieldid="102" fieldname="sort" value="3" size="1"></td>
					<td style="text-align: center;">
						<a href="/goods/updategoodscategory.html?category_id=102">修改</a>
						<a href="javascript:void(0);" onclick="delCategory(102)">删除</a>
					</td>
				</tr>
							<tr class="pid_6" style="height: 30px;display:none;" data-category-id="31" data-pid="6" data-level="2">
				<td>
										<a href="javascript:;" onclick="tab_switch(31)" class="tab_jian_31" style="display: block;">[-]</a>
					<a href="javascript:;" onclick="tab_switch(31)" class="tab_jia_31" style="display: none;">[+]</a>
									</td>
				
				<td><span style="color:#ccc;">|——</span> <input type="text" class="input-common middle" fieldid="31" fieldname="category_name" value="洗发护发" style="width: 150px;">
					<a href="javascript:;" onclick="addChildGoodsCategory(this, 3, 31);">
						<span class="add-child"><i>添加子分类</i></span>
					</a>
				</td>
				<td><input type="text" class="input-common middle" fieldid="31" fieldname="short_name" value="洗发护发" style="width: 150px;"></td>
				<td></td>
				<td style="text-align: center;">是</td>
				<td style="text-align: center;"><input type="number" class="sort input-common input-common-sort" fieldid="31" fieldname="sort" value="2" size="1"></td>
				<td style="text-align: center;">
					<a href="/goods/updategoodscategory.html?category_id=31">修改</a>
					<a href="javascript:void(0);" onclick="delCategory(31)">删除</a>
				</td>
			</tr>
			
								<tr class="pid_31 pid_6" style="height: 30px;display:none;" data-category-id="103" data-pid="31" data-level="3">
					<td></td>
					
					<td><span style="color:#ccc;">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;|——</span> <input class="input-common middle" type="text" fieldid="103" fieldname="category_name" value="洗发" style="width: 150px;"></td>
					<td><input type="text" class="input-common middle" fieldid="103" fieldname="short_name" value="洗发" style="width: 150px;"></td>
					<td></td>
					<td style="text-align: center;">是</td>
					<td style="text-align: center;"><input type="number" class="sort input-common input-common-sort" fieldid="103" fieldname="sort" value="1" size="1"></td>
					<td style="text-align: center;">
						<a href="/goods/updategoodscategory.html?category_id=103">修改</a>
						<a href="javascript:void(0);" onclick="delCategory(103)">删除</a>
					</td>
				</tr>
								<tr class="pid_31 pid_6" style="height: 30px;display:none;" data-category-id="104" data-pid="31" data-level="3">
					<td></td>
					
					<td><span style="color:#ccc;">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;|——</span> <input class="input-common middle" type="text" fieldid="104" fieldname="category_name" value="护发" style="width: 150px;"></td>
					<td><input type="text" class="input-common middle" fieldid="104" fieldname="short_name" value="护发" style="width: 150px;"></td>
					<td></td>
					<td style="text-align: center;">是</td>
					<td style="text-align: center;"><input type="number" class="sort input-common input-common-sort" fieldid="104" fieldname="sort" value="2" size="1"></td>
					<td style="text-align: center;">
						<a href="/goods/updategoodscategory.html?category_id=104">修改</a>
						<a href="javascript:void(0);" onclick="delCategory(104)">删除</a>
					</td>
				</tr>
								<tr class="pid_31 pid_6" style="height: 30px;display:none;" data-category-id="105" data-pid="31" data-level="3">
					<td></td>
					
					<td><span style="color:#ccc;">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;|——</span> <input class="input-common middle" type="text" fieldid="105" fieldname="category_name" value="染发" style="width: 150px;"></td>
					<td><input type="text" class="input-common middle" fieldid="105" fieldname="short_name" value="染发" style="width: 150px;"></td>
					<td></td>
					<td style="text-align: center;">是</td>
					<td style="text-align: center;"><input type="number" class="sort input-common input-common-sort" fieldid="105" fieldname="sort" value="3" size="1"></td>
					<td style="text-align: center;">
						<a href="/goods/updategoodscategory.html?category_id=105">修改</a>
						<a href="javascript:void(0);" onclick="delCategory(105)">删除</a>
					</td>
				</tr>
							<tr class="pid_6" style="height: 30px;display:none;" data-category-id="32" data-pid="6" data-level="2">
				<td>
										<a href="javascript:;" onclick="tab_switch(32)" class="tab_jian_32" style="display: block;">[-]</a>
					<a href="javascript:;" onclick="tab_switch(32)" class="tab_jia_32" style="display: none;">[+]</a>
									</td>
				
				<td><span style="color:#ccc;">|——</span> <input type="text" class="input-common middle" fieldid="32" fieldname="category_name" value="身体护理" style="width: 150px;">
					<a href="javascript:;" onclick="addChildGoodsCategory(this, 3, 32);">
						<span class="add-child"><i>添加子分类</i></span>
					</a>
				</td>
				<td><input type="text" class="input-common middle" fieldid="32" fieldname="short_name" value="身体护理" style="width: 150px;"></td>
				<td></td>
				<td style="text-align: center;">是</td>
				<td style="text-align: center;"><input type="number" class="sort input-common input-common-sort" fieldid="32" fieldname="sort" value="3" size="1"></td>
				<td style="text-align: center;">
					<a href="/goods/updategoodscategory.html?category_id=32">修改</a>
					<a href="javascript:void(0);" onclick="delCategory(32)">删除</a>
				</td>
			</tr>
			
								<tr class="pid_32 pid_6" style="height: 30px;display:none;" data-category-id="106" data-pid="32" data-level="3">
					<td></td>
					
					<td><span style="color:#ccc;">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;|——</span> <input class="input-common middle" type="text" fieldid="106" fieldname="category_name" value="补水保湿" style="width: 150px;"></td>
					<td><input type="text" class="input-common middle" fieldid="106" fieldname="short_name" value="补水保湿" style="width: 150px;"></td>
					<td></td>
					<td style="text-align: center;">是</td>
					<td style="text-align: center;"><input type="number" class="sort input-common input-common-sort" fieldid="106" fieldname="sort" value="1" size="1"></td>
					<td style="text-align: center;">
						<a href="/goods/updategoodscategory.html?category_id=106">修改</a>
						<a href="javascript:void(0);" onclick="delCategory(106)">删除</a>
					</td>
				</tr>
								<tr class="pid_32 pid_6" style="height: 30px;display:none;" data-category-id="107" data-pid="32" data-level="3">
					<td></td>
					
					<td><span style="color:#ccc;">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;|——</span> <input class="input-common middle" type="text" fieldid="107" fieldname="category_name" value="沐浴" style="width: 150px;"></td>
					<td><input type="text" class="input-common middle" fieldid="107" fieldname="short_name" value="沐浴" style="width: 150px;"></td>
					<td></td>
					<td style="text-align: center;">是</td>
					<td style="text-align: center;"><input type="number" class="sort input-common input-common-sort" fieldid="107" fieldname="sort" value="2" size="1"></td>
					<td style="text-align: center;">
						<a href="/goods/updategoodscategory.html?category_id=107">修改</a>
						<a href="javascript:void(0);" onclick="delCategory(107)">删除</a>
					</td>
				</tr>
								<tr class="pid_32 pid_6" style="height: 30px;display:none;" data-category-id="108" data-pid="32" data-level="3">
					<td></td>
					
					<td><span style="color:#ccc;">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;|——</span> <input class="input-common middle" type="text" fieldid="108" fieldname="category_name" value="润肤" style="width: 150px;"></td>
					<td><input type="text" class="input-common middle" fieldid="108" fieldname="short_name" value="润肤" style="width: 150px;"></td>
					<td></td>
					<td style="text-align: center;">是</td>
					<td style="text-align: center;"><input type="number" class="sort input-common input-common-sort" fieldid="108" fieldname="sort" value="3" size="1"></td>
					<td style="text-align: center;">
						<a href="/goods/updategoodscategory.html?category_id=108">修改</a>
						<a href="javascript:void(0);" onclick="delCategory(108)">删除</a>
					</td>
				</tr>
						<tr class="pid_0" style="height: 30px;" data-category-id="7" data-pid="0" data-level="1">
			<td>
								<a href="javascript:;" onclick="tab_switch(7)" class="tab_jia_7" style="display: block;">[+]</a>
				<a href="javascript:;" onclick="tab_switch(7)" class="tab_jian_7" style="display: none;">[-]</a>
							</td>
			
			<td>
				<input class="input-common middle" type="text" fieldid="7" fieldname="category_name" value="女鞋/箱包/钟表/珠宝" style="width: 150px;">
				<a href="javascript:;" onclick="addChildGoodsCategory(this, 2, 7);">
				<span class="add-child"><i>添加子分类</i></span>
				</a>
			</td>
			<td><input class="input-common middle" type="text" fieldid="7" fieldname="short_name" value="配饰" style="width: 150px;"></td>
			<td></td>
			<td style="text-align: center;">否</td>
			<td style="text-align: center;"><input type="number" class="sort input-common input-common-sort" fieldid="7" fieldname="sort" value="7" size="1"></td>
			<td style="text-align: center;">
				<a href="/goods/updategoodscategory.html?category_id=7">修改</a>
				<a href="javascript:void(0);" onclick="delCategory(7)">删除</a>
			</td>
		</tr>
		
						<tr class="pid_7" style="height: 30px;display:none;" data-category-id="33" data-pid="7" data-level="2">
				<td>
										<a href="javascript:;" onclick="tab_switch(33)" class="tab_jian_33" style="display: block;">[-]</a>
					<a href="javascript:;" onclick="tab_switch(33)" class="tab_jia_33" style="display: none;">[+]</a>
									</td>
				
				<td><span style="color:#ccc;">|——</span> <input type="text" class="input-common middle" fieldid="33" fieldname="category_name" value="时尚女鞋" style="width: 150px;">
					<a href="javascript:;" onclick="addChildGoodsCategory(this, 3, 33);">
						<span class="add-child"><i>添加子分类</i></span>
					</a>
				</td>
				<td><input type="text" class="input-common middle" fieldid="33" fieldname="short_name" value="女鞋" style="width: 150px;"></td>
				<td></td>
				<td style="text-align: center;">是</td>
				<td style="text-align: center;"><input type="number" class="sort input-common input-common-sort" fieldid="33" fieldname="sort" value="1" size="1"></td>
				<td style="text-align: center;">
					<a href="/goods/updategoodscategory.html?category_id=33">修改</a>
					<a href="javascript:void(0);" onclick="delCategory(33)">删除</a>
				</td>
			</tr>
			
								<tr class="pid_33 pid_7" style="height: 30px;display:none;" data-category-id="109" data-pid="33" data-level="3">
					<td></td>
					
					<td><span style="color:#ccc;">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;|——</span> <input class="input-common middle" type="text" fieldid="109" fieldname="category_name" value="2017新品" style="width: 150px;"></td>
					<td><input type="text" class="input-common middle" fieldid="109" fieldname="short_name" value="2017新品" style="width: 150px;"></td>
					<td></td>
					<td style="text-align: center;">是</td>
					<td style="text-align: center;"><input type="number" class="sort input-common input-common-sort" fieldid="109" fieldname="sort" value="1" size="1"></td>
					<td style="text-align: center;">
						<a href="/goods/updategoodscategory.html?category_id=109">修改</a>
						<a href="javascript:void(0);" onclick="delCategory(109)">删除</a>
					</td>
				</tr>
								<tr class="pid_33 pid_7" style="height: 30px;display:none;" data-category-id="110" data-pid="33" data-level="3">
					<td></td>
					
					<td><span style="color:#ccc;">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;|——</span> <input class="input-common middle" type="text" fieldid="110" fieldname="category_name" value="单鞋" style="width: 150px;"></td>
					<td><input type="text" class="input-common middle" fieldid="110" fieldname="short_name" value="单鞋" style="width: 150px;"></td>
					<td></td>
					<td style="text-align: center;">是</td>
					<td style="text-align: center;"><input type="number" class="sort input-common input-common-sort" fieldid="110" fieldname="sort" value="2" size="1"></td>
					<td style="text-align: center;">
						<a href="/goods/updategoodscategory.html?category_id=110">修改</a>
						<a href="javascript:void(0);" onclick="delCategory(110)">删除</a>
					</td>
				</tr>
								<tr class="pid_33 pid_7" style="height: 30px;display:none;" data-category-id="111" data-pid="33" data-level="3">
					<td></td>
					
					<td><span style="color:#ccc;">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;|——</span> <input class="input-common middle" type="text" fieldid="111" fieldname="category_name" value="休闲鞋" style="width: 150px;"></td>
					<td><input type="text" class="input-common middle" fieldid="111" fieldname="short_name" value="休闲鞋" style="width: 150px;"></td>
					<td></td>
					<td style="text-align: center;">是</td>
					<td style="text-align: center;"><input type="number" class="sort input-common input-common-sort" fieldid="111" fieldname="sort" value="3" size="1"></td>
					<td style="text-align: center;">
						<a href="/goods/updategoodscategory.html?category_id=111">修改</a>
						<a href="javascript:void(0);" onclick="delCategory(111)">删除</a>
					</td>
				</tr>
							<tr class="pid_7" style="height: 30px;display:none;" data-category-id="35" data-pid="7" data-level="2">
				<td>
										<a href="javascript:;" onclick="tab_switch(35)" class="tab_jian_35" style="display: block;">[-]</a>
					<a href="javascript:;" onclick="tab_switch(35)" class="tab_jia_35" style="display: none;">[+]</a>
									</td>
				
				<td><span style="color:#ccc;">|——</span> <input type="text" class="input-common middle" fieldid="35" fieldname="category_name" value="潮流女包" style="width: 150px;">
					<a href="javascript:;" onclick="addChildGoodsCategory(this, 3, 35);">
						<span class="add-child"><i>添加子分类</i></span>
					</a>
				</td>
				<td><input type="text" class="input-common middle" fieldid="35" fieldname="short_name" value="女包" style="width: 150px;"></td>
				<td></td>
				<td style="text-align: center;">是</td>
				<td style="text-align: center;"><input type="number" class="sort input-common input-common-sort" fieldid="35" fieldname="sort" value="2" size="1"></td>
				<td style="text-align: center;">
					<a href="/goods/updategoodscategory.html?category_id=35">修改</a>
					<a href="javascript:void(0);" onclick="delCategory(35)">删除</a>
				</td>
			</tr>
			
								<tr class="pid_35 pid_7" style="height: 30px;display:none;" data-category-id="112" data-pid="35" data-level="3">
					<td></td>
					
					<td><span style="color:#ccc;">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;|——</span> <input class="input-common middle" type="text" fieldid="112" fieldname="category_name" value="真皮包" style="width: 150px;"></td>
					<td><input type="text" class="input-common middle" fieldid="112" fieldname="short_name" value="真皮包" style="width: 150px;"></td>
					<td></td>
					<td style="text-align: center;">是</td>
					<td style="text-align: center;"><input type="number" class="sort input-common input-common-sort" fieldid="112" fieldname="sort" value="1" size="1"></td>
					<td style="text-align: center;">
						<a href="/goods/updategoodscategory.html?category_id=112">修改</a>
						<a href="javascript:void(0);" onclick="delCategory(112)">删除</a>
					</td>
				</tr>
								<tr class="pid_35 pid_7" style="height: 30px;display:none;" data-category-id="113" data-pid="35" data-level="3">
					<td></td>
					
					<td><span style="color:#ccc;">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;|——</span> <input class="input-common middle" type="text" fieldid="113" fieldname="category_name" value="水桶包" style="width: 150px;"></td>
					<td><input type="text" class="input-common middle" fieldid="113" fieldname="short_name" value="水桶包" style="width: 150px;"></td>
					<td></td>
					<td style="text-align: center;">是</td>
					<td style="text-align: center;"><input type="number" class="sort input-common input-common-sort" fieldid="113" fieldname="sort" value="2" size="1"></td>
					<td style="text-align: center;">
						<a href="/goods/updategoodscategory.html?category_id=113">修改</a>
						<a href="javascript:void(0);" onclick="delCategory(113)">删除</a>
					</td>
				</tr>
								<tr class="pid_35 pid_7" style="height: 30px;display:none;" data-category-id="114" data-pid="35" data-level="3">
					<td></td>
					
					<td><span style="color:#ccc;">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;|——</span> <input class="input-common middle" type="text" fieldid="114" fieldname="category_name" value="单肩包" style="width: 150px;"></td>
					<td><input type="text" class="input-common middle" fieldid="114" fieldname="short_name" value="单肩包" style="width: 150px;"></td>
					<td></td>
					<td style="text-align: center;">是</td>
					<td style="text-align: center;"><input type="number" class="sort input-common input-common-sort" fieldid="114" fieldname="sort" value="3" size="1"></td>
					<td style="text-align: center;">
						<a href="/goods/updategoodscategory.html?category_id=114">修改</a>
						<a href="javascript:void(0);" onclick="delCategory(114)">删除</a>
					</td>
				</tr>
							<tr class="pid_7" style="height: 30px;display:none;" data-category-id="36" data-pid="7" data-level="2">
				<td>
										<a href="javascript:;" onclick="tab_switch(36)" class="tab_jian_36" style="display: block;">[-]</a>
					<a href="javascript:;" onclick="tab_switch(36)" class="tab_jia_36" style="display: none;">[+]</a>
									</td>
				
				<td><span style="color:#ccc;">|——</span> <input type="text" class="input-common middle" fieldid="36" fieldname="category_name" value="精品男包" style="width: 150px;">
					<a href="javascript:;" onclick="addChildGoodsCategory(this, 3, 36);">
						<span class="add-child"><i>添加子分类</i></span>
					</a>
				</td>
				<td><input type="text" class="input-common middle" fieldid="36" fieldname="short_name" value="男包" style="width: 150px;"></td>
				<td></td>
				<td style="text-align: center;">是</td>
				<td style="text-align: center;"><input type="number" class="sort input-common input-common-sort" fieldid="36" fieldname="sort" value="3" size="1"></td>
				<td style="text-align: center;">
					<a href="/goods/updategoodscategory.html?category_id=36">修改</a>
					<a href="javascript:void(0);" onclick="delCategory(36)">删除</a>
				</td>
			</tr>
			
								<tr class="pid_36 pid_7" style="height: 30px;display:none;" data-category-id="115" data-pid="36" data-level="3">
					<td></td>
					
					<td><span style="color:#ccc;">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;|——</span> <input class="input-common middle" type="text" fieldid="115" fieldname="category_name" value="男士钱包" style="width: 150px;"></td>
					<td><input type="text" class="input-common middle" fieldid="115" fieldname="short_name" value="男士钱包" style="width: 150px;"></td>
					<td></td>
					<td style="text-align: center;">是</td>
					<td style="text-align: center;"><input type="number" class="sort input-common input-common-sort" fieldid="115" fieldname="sort" value="1" size="1"></td>
					<td style="text-align: center;">
						<a href="/goods/updategoodscategory.html?category_id=115">修改</a>
						<a href="javascript:void(0);" onclick="delCategory(115)">删除</a>
					</td>
				</tr>
								<tr class="pid_36 pid_7" style="height: 30px;display:none;" data-category-id="116" data-pid="36" data-level="3">
					<td></td>
					
					<td><span style="color:#ccc;">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;|——</span> <input class="input-common middle" type="text" fieldid="116" fieldname="category_name" value="双肩包" style="width: 150px;"></td>
					<td><input type="text" class="input-common middle" fieldid="116" fieldname="short_name" value="双肩包" style="width: 150px;"></td>
					<td></td>
					<td style="text-align: center;">是</td>
					<td style="text-align: center;"><input type="number" class="sort input-common input-common-sort" fieldid="116" fieldname="sort" value="2" size="1"></td>
					<td style="text-align: center;">
						<a href="/goods/updategoodscategory.html?category_id=116">修改</a>
						<a href="javascript:void(0);" onclick="delCategory(116)">删除</a>
					</td>
				</tr>
								<tr class="pid_36 pid_7" style="height: 30px;display:none;" data-category-id="117" data-pid="36" data-level="3">
					<td></td>
					
					<td><span style="color:#ccc;">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;|——</span> <input class="input-common middle" type="text" fieldid="117" fieldname="category_name" value="单肩/斜挎包" style="width: 150px;"></td>
					<td><input type="text" class="input-common middle" fieldid="117" fieldname="short_name" value="单肩/斜挎包" style="width: 150px;"></td>
					<td></td>
					<td style="text-align: center;">是</td>
					<td style="text-align: center;"><input type="number" class="sort input-common input-common-sort" fieldid="117" fieldname="sort" value="3" size="1"></td>
					<td style="text-align: center;">
						<a href="/goods/updategoodscategory.html?category_id=117">修改</a>
						<a href="javascript:void(0);" onclick="delCategory(117)">删除</a>
					</td>
				</tr>
						<tr class="pid_0" style="height: 30px;" data-category-id="8" data-pid="0" data-level="1">
			<td>
								<a href="javascript:;" onclick="tab_switch(8)" class="tab_jia_8" style="display: block;">[+]</a>
				<a href="javascript:;" onclick="tab_switch(8)" class="tab_jian_8" style="display: none;">[-]</a>
							</td>
			
			<td>
				<input class="input-common middle" type="text" fieldid="8" fieldname="category_name" value="男鞋/运动/户外" style="width: 150px;">
				<a href="javascript:;" onclick="addChildGoodsCategory(this, 2, 8);">
				<span class="add-child"><i>添加子分类</i></span>
				</a>
			</td>
			<td><input class="input-common middle" type="text" fieldid="8" fieldname="short_name" value="运动" style="width: 150px;"></td>
			<td></td>
			<td style="text-align: center;">是</td>
			<td style="text-align: center;"><input type="number" class="sort input-common input-common-sort" fieldid="8" fieldname="sort" value="8" size="1"></td>
			<td style="text-align: center;">
				<a href="/goods/updategoodscategory.html?category_id=8">修改</a>
				<a href="javascript:void(0);" onclick="delCategory(8)">删除</a>
			</td>
		</tr>
		
						<tr class="pid_8" style="height: 30px;display:none;" data-category-id="37" data-pid="8" data-level="2">
				<td>
										<a href="javascript:;" onclick="tab_switch(37)" class="tab_jian_37" style="display: block;">[-]</a>
					<a href="javascript:;" onclick="tab_switch(37)" class="tab_jia_37" style="display: none;">[+]</a>
									</td>
				
				<td><span style="color:#ccc;">|——</span> <input type="text" class="input-common middle" fieldid="37" fieldname="category_name" value="流行男鞋" style="width: 150px;">
					<a href="javascript:;" onclick="addChildGoodsCategory(this, 3, 37);">
						<span class="add-child"><i>添加子分类</i></span>
					</a>
				</td>
				<td><input type="text" class="input-common middle" fieldid="37" fieldname="short_name" value="男鞋" style="width: 150px;"></td>
				<td></td>
				<td style="text-align: center;">是</td>
				<td style="text-align: center;"><input type="number" class="sort input-common input-common-sort" fieldid="37" fieldname="sort" value="1" size="1"></td>
				<td style="text-align: center;">
					<a href="/goods/updategoodscategory.html?category_id=37">修改</a>
					<a href="javascript:void(0);" onclick="delCategory(37)">删除</a>
				</td>
			</tr>
			
								<tr class="pid_37 pid_8" style="height: 30px;display:none;" data-category-id="118" data-pid="37" data-level="3">
					<td></td>
					
					<td><span style="color:#ccc;">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;|——</span> <input class="input-common middle" type="text" fieldid="118" fieldname="category_name" value="2017新品" style="width: 150px;"></td>
					<td><input type="text" class="input-common middle" fieldid="118" fieldname="short_name" value="2017新品" style="width: 150px;"></td>
					<td></td>
					<td style="text-align: center;">是</td>
					<td style="text-align: center;"><input type="number" class="sort input-common input-common-sort" fieldid="118" fieldname="sort" value="1" size="1"></td>
					<td style="text-align: center;">
						<a href="/goods/updategoodscategory.html?category_id=118">修改</a>
						<a href="javascript:void(0);" onclick="delCategory(118)">删除</a>
					</td>
				</tr>
								<tr class="pid_37 pid_8" style="height: 30px;display:none;" data-category-id="119" data-pid="37" data-level="3">
					<td></td>
					
					<td><span style="color:#ccc;">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;|——</span> <input class="input-common middle" type="text" fieldid="119" fieldname="category_name" value="休闲鞋" style="width: 150px;"></td>
					<td><input type="text" class="input-common middle" fieldid="119" fieldname="short_name" value="休闲鞋" style="width: 150px;"></td>
					<td></td>
					<td style="text-align: center;">是</td>
					<td style="text-align: center;"><input type="number" class="sort input-common input-common-sort" fieldid="119" fieldname="sort" value="2" size="1"></td>
					<td style="text-align: center;">
						<a href="/goods/updategoodscategory.html?category_id=119">修改</a>
						<a href="javascript:void(0);" onclick="delCategory(119)">删除</a>
					</td>
				</tr>
								<tr class="pid_37 pid_8" style="height: 30px;display:none;" data-category-id="120" data-pid="37" data-level="3">
					<td></td>
					
					<td><span style="color:#ccc;">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;|——</span> <input class="input-common middle" type="text" fieldid="120" fieldname="category_name" value="商务休闲鞋" style="width: 150px;"></td>
					<td><input type="text" class="input-common middle" fieldid="120" fieldname="short_name" value="商务休闲鞋" style="width: 150px;"></td>
					<td></td>
					<td style="text-align: center;">是</td>
					<td style="text-align: center;"><input type="number" class="sort input-common input-common-sort" fieldid="120" fieldname="sort" value="3" size="1"></td>
					<td style="text-align: center;">
						<a href="/goods/updategoodscategory.html?category_id=120">修改</a>
						<a href="javascript:void(0);" onclick="delCategory(120)">删除</a>
					</td>
				</tr>
							<tr class="pid_8" style="height: 30px;display:none;" data-category-id="38" data-pid="8" data-level="2">
				<td>
										<a href="javascript:;" onclick="tab_switch(38)" class="tab_jian_38" style="display: block;">[-]</a>
					<a href="javascript:;" onclick="tab_switch(38)" class="tab_jia_38" style="display: none;">[+]</a>
									</td>
				
				<td><span style="color:#ccc;">|——</span> <input type="text" class="input-common middle" fieldid="38" fieldname="category_name" value="运动鞋包" style="width: 150px;">
					<a href="javascript:;" onclick="addChildGoodsCategory(this, 3, 38);">
						<span class="add-child"><i>添加子分类</i></span>
					</a>
				</td>
				<td><input type="text" class="input-common middle" fieldid="38" fieldname="short_name" value="鞋包" style="width: 150px;"></td>
				<td></td>
				<td style="text-align: center;">是</td>
				<td style="text-align: center;"><input type="number" class="sort input-common input-common-sort" fieldid="38" fieldname="sort" value="2" size="1"></td>
				<td style="text-align: center;">
					<a href="/goods/updategoodscategory.html?category_id=38">修改</a>
					<a href="javascript:void(0);" onclick="delCategory(38)">删除</a>
				</td>
			</tr>
			
								<tr class="pid_38 pid_8" style="height: 30px;display:none;" data-category-id="121" data-pid="38" data-level="3">
					<td></td>
					
					<td><span style="color:#ccc;">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;|——</span> <input class="input-common middle" type="text" fieldid="121" fieldname="category_name" value="跑步鞋" style="width: 150px;"></td>
					<td><input type="text" class="input-common middle" fieldid="121" fieldname="short_name" value="跑步鞋" style="width: 150px;"></td>
					<td></td>
					<td style="text-align: center;">是</td>
					<td style="text-align: center;"><input type="number" class="sort input-common input-common-sort" fieldid="121" fieldname="sort" value="1" size="1"></td>
					<td style="text-align: center;">
						<a href="/goods/updategoodscategory.html?category_id=121">修改</a>
						<a href="javascript:void(0);" onclick="delCategory(121)">删除</a>
					</td>
				</tr>
								<tr class="pid_38 pid_8" style="height: 30px;display:none;" data-category-id="122" data-pid="38" data-level="3">
					<td></td>
					
					<td><span style="color:#ccc;">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;|——</span> <input class="input-common middle" type="text" fieldid="122" fieldname="category_name" value="休闲鞋" style="width: 150px;"></td>
					<td><input type="text" class="input-common middle" fieldid="122" fieldname="short_name" value="休闲鞋" style="width: 150px;"></td>
					<td></td>
					<td style="text-align: center;">是</td>
					<td style="text-align: center;"><input type="number" class="sort input-common input-common-sort" fieldid="122" fieldname="sort" value="2" size="1"></td>
					<td style="text-align: center;">
						<a href="/goods/updategoodscategory.html?category_id=122">修改</a>
						<a href="javascript:void(0);" onclick="delCategory(122)">删除</a>
					</td>
				</tr>
								<tr class="pid_38 pid_8" style="height: 30px;display:none;" data-category-id="123" data-pid="38" data-level="3">
					<td></td>
					
					<td><span style="color:#ccc;">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;|——</span> <input class="input-common middle" type="text" fieldid="123" fieldname="category_name" value="篮球鞋" style="width: 150px;"></td>
					<td><input type="text" class="input-common middle" fieldid="123" fieldname="short_name" value="篮球鞋" style="width: 150px;"></td>
					<td></td>
					<td style="text-align: center;">是</td>
					<td style="text-align: center;"><input type="number" class="sort input-common input-common-sort" fieldid="123" fieldname="sort" value="3" size="1"></td>
					<td style="text-align: center;">
						<a href="/goods/updategoodscategory.html?category_id=123">修改</a>
						<a href="javascript:void(0);" onclick="delCategory(123)">删除</a>
					</td>
				</tr>
							<tr class="pid_8" style="height: 30px;display:none;" data-category-id="39" data-pid="8" data-level="2">
				<td>
										<a href="javascript:;" onclick="tab_switch(39)" class="tab_jian_39" style="display: block;">[-]</a>
					<a href="javascript:;" onclick="tab_switch(39)" class="tab_jia_39" style="display: none;">[+]</a>
									</td>
				
				<td><span style="color:#ccc;">|——</span> <input type="text" class="input-common middle" fieldid="39" fieldname="category_name" value="运动服饰" style="width: 150px;">
					<a href="javascript:;" onclick="addChildGoodsCategory(this, 3, 39);">
						<span class="add-child"><i>添加子分类</i></span>
					</a>
				</td>
				<td><input type="text" class="input-common middle" fieldid="39" fieldname="short_name" value="服饰" style="width: 150px;"></td>
				<td></td>
				<td style="text-align: center;">是</td>
				<td style="text-align: center;"><input type="number" class="sort input-common input-common-sort" fieldid="39" fieldname="sort" value="3" size="1"></td>
				<td style="text-align: center;">
					<a href="/goods/updategoodscategory.html?category_id=39">修改</a>
					<a href="javascript:void(0);" onclick="delCategory(39)">删除</a>
				</td>
			</tr>
			
								<tr class="pid_39 pid_8" style="height: 30px;display:none;" data-category-id="124" data-pid="39" data-level="3">
					<td></td>
					
					<td><span style="color:#ccc;">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;|——</span> <input class="input-common middle" type="text" fieldid="124" fieldname="category_name" value="T桖" style="width: 150px;"></td>
					<td><input type="text" class="input-common middle" fieldid="124" fieldname="short_name" value="T桖" style="width: 150px;"></td>
					<td></td>
					<td style="text-align: center;">是</td>
					<td style="text-align: center;"><input type="number" class="sort input-common input-common-sort" fieldid="124" fieldname="sort" value="1" size="1"></td>
					<td style="text-align: center;">
						<a href="/goods/updategoodscategory.html?category_id=124">修改</a>
						<a href="javascript:void(0);" onclick="delCategory(124)">删除</a>
					</td>
				</tr>
								<tr class="pid_39 pid_8" style="height: 30px;display:none;" data-category-id="125" data-pid="39" data-level="3">
					<td></td>
					
					<td><span style="color:#ccc;">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;|——</span> <input class="input-common middle" type="text" fieldid="125" fieldname="category_name" value="运动裤" style="width: 150px;"></td>
					<td><input type="text" class="input-common middle" fieldid="125" fieldname="short_name" value="运动裤" style="width: 150px;"></td>
					<td></td>
					<td style="text-align: center;">是</td>
					<td style="text-align: center;"><input type="number" class="sort input-common input-common-sort" fieldid="125" fieldname="sort" value="2" size="1"></td>
					<td style="text-align: center;">
						<a href="/goods/updategoodscategory.html?category_id=125">修改</a>
						<a href="javascript:void(0);" onclick="delCategory(125)">删除</a>
					</td>
				</tr>
								<tr class="pid_39 pid_8" style="height: 30px;display:none;" data-category-id="126" data-pid="39" data-level="3">
					<td></td>
					
					<td><span style="color:#ccc;">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;|——</span> <input class="input-common middle" type="text" fieldid="126" fieldname="category_name" value="紧身衣" style="width: 150px;"></td>
					<td><input type="text" class="input-common middle" fieldid="126" fieldname="short_name" value="紧身衣" style="width: 150px;"></td>
					<td></td>
					<td style="text-align: center;">是</td>
					<td style="text-align: center;"><input type="number" class="sort input-common input-common-sort" fieldid="126" fieldname="sort" value="3" size="1"></td>
					<td style="text-align: center;">
						<a href="/goods/updategoodscategory.html?category_id=126">修改</a>
						<a href="javascript:void(0);" onclick="delCategory(126)">删除</a>
					</td>
				</tr>
						<tr class="pid_0" style="height: 30px;" data-category-id="2" data-pid="0" data-level="1">
			<td>
								<a href="javascript:;" onclick="tab_switch(2)" class="tab_jia_2" style="display: block;">[+]</a>
				<a href="javascript:;" onclick="tab_switch(2)" class="tab_jian_2" style="display: none;">[-]</a>
							</td>
			
			<td>
				<input class="input-common middle" type="text" fieldid="2" fieldname="category_name" value="混凝土设" style="width: 150px;">
				<a href="javascript:;" onclick="addChildGoodsCategory(this, 2, 2);">
				<span class="add-child"><i>添加子分类</i></span>
				</a>
			</td>
			<td><input class="input-common middle" type="text" fieldid="2" fieldname="short_name" value="12" style="width: 150px;"></td>
			<td>服装</td>
			<td style="text-align: center;">是</td>
			<td style="text-align: center;"><input type="number" class="sort input-common input-common-sort" fieldid="2" fieldname="sort" value="9" size="1"></td>
			<td style="text-align: center;">
				<a href="/goods/updategoodscategory.html?category_id=2">修改</a>
				<a href="javascript:void(0);" onclick="delCategory(2)">删除</a>
			</td>
		</tr>
		
						<tr class="pid_2" style="height: 30px;display:none;" data-category-id="135" data-pid="2" data-level="2">
				<td>
									</td>
				
				<td><span style="color:#ccc;">|——</span> <input type="text" class="input-common middle" fieldid="135" fieldname="category_name" value="432" style="width: 150px;">
					<a href="javascript:;" onclick="addChildGoodsCategory(this, 3, 135);">
						<span class="add-child"><i>添加子分类</i></span>
					</a>
				</td>
				<td><input type="text" class="input-common middle" fieldid="135" fieldname="short_name" value="3232" style="width: 150px;"></td>
				<td></td>
				<td style="text-align: center;">是</td>
				<td style="text-align: center;"><input type="number" class="sort input-common input-common-sort" fieldid="135" fieldname="sort" value="0" size="1"></td>
				<td style="text-align: center;">
					<a href="/goods/updategoodscategory.html?category_id=135">修改</a>
					<a href="javascript:void(0);" onclick="delCategory(135)">删除</a>
				</td>
			</tr>
			
							<tr class="pid_2" style="height: 30px;display:none;" data-category-id="155" data-pid="2" data-level="2">
				<td>
										<a href="javascript:;" onclick="tab_switch(155)" class="tab_jian_155" style="display: block;">[-]</a>
					<a href="javascript:;" onclick="tab_switch(155)" class="tab_jia_155" style="display: none;">[+]</a>
									</td>
				
				<td><span style="color:#ccc;">|——</span> <input type="text" class="input-common middle" fieldid="155" fieldname="category_name" value="二级分类" style="width: 150px;">
					<a href="javascript:;" onclick="addChildGoodsCategory(this, 3, 155);">
						<span class="add-child"><i>添加子分类</i></span>
					</a>
				</td>
				<td><input type="text" class="input-common middle" fieldid="155" fieldname="short_name" value="二级" style="width: 150px;"></td>
				<td></td>
				<td style="text-align: center;">是</td>
				<td style="text-align: center;"><input type="number" class="sort input-common input-common-sort" fieldid="155" fieldname="sort" value="0" size="1"></td>
				<td style="text-align: center;">
					<a href="/goods/updategoodscategory.html?category_id=155">修改</a>
					<a href="javascript:void(0);" onclick="delCategory(155)">删除</a>
				</td>
			</tr>
			
								<tr class="pid_155 pid_2" style="height: 30px;display:none;" data-category-id="159" data-pid="155" data-level="3">
					<td></td>
					
					<td><span style="color:#ccc;">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;|——</span> <input class="input-common middle" type="text" fieldid="159" fieldname="category_name" value="三级" style="width: 150px;"></td>
					<td><input type="text" class="input-common middle" fieldid="159" fieldname="short_name" value="三级" style="width: 150px;"></td>
					<td></td>
					<td style="text-align: center;">是</td>
					<td style="text-align: center;"><input type="number" class="sort input-common input-common-sort" fieldid="159" fieldname="sort" value="0" size="1"></td>
					<td style="text-align: center;">
						<a href="/goods/updategoodscategory.html?category_id=159">修改</a>
						<a href="javascript:void(0);" onclick="delCategory(159)">删除</a>
					</td>
				</tr>
							<tr class="pid_2" style="height: 30px;display:none;" data-category-id="1" data-pid="2" data-level="2">
				<td>
										<a href="javascript:;" onclick="tab_switch(1)" class="tab_jian_1" style="display: block;">[-]</a>
					<a href="javascript:;" onclick="tab_switch(1)" class="tab_jia_1" style="display: none;">[+]</a>
									</td>
				
				<td><span style="color:#ccc;">|——</span> <input type="text" class="input-common middle" fieldid="1" fieldname="category_name" value="家用电器" style="width: 150px;">
					<a href="javascript:;" onclick="addChildGoodsCategory(this, 3, 1);">
						<span class="add-child"><i>添加子分类</i></span>
					</a>
				</td>
				<td><input type="text" class="input-common middle" fieldid="1" fieldname="short_name" value="家电" style="width: 150px;"></td>
				<td>手机</td>
				<td style="text-align: center;">是</td>
				<td style="text-align: center;"><input type="number" class="sort input-common input-common-sort" fieldid="1" fieldname="sort" value="1" size="1"></td>
				<td style="text-align: center;">
					<a href="/goods/updategoodscategory.html?category_id=1">修改</a>
					<a href="javascript:void(0);" onclick="delCategory(1)">删除</a>
				</td>
			</tr>
			
								<tr class="pid_1 pid_2" style="height: 30px;display:none;" data-category-id="14" data-pid="1" data-level="3">
					<td></td>
					
					<td><span style="color:#ccc;">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;|——</span> <input class="input-common middle" type="text" fieldid="14" fieldname="category_name" value="电视" style="width: 150px;"></td>
					<td><input type="text" class="input-common middle" fieldid="14" fieldname="short_name" value="电视" style="width: 150px;"></td>
					<td>asd</td>
					<td style="text-align: center;">是</td>
					<td style="text-align: center;"><input type="number" class="sort input-common input-common-sort" fieldid="14" fieldname="sort" value="1" size="1"></td>
					<td style="text-align: center;">
						<a href="/goods/updategoodscategory.html?category_id=14">修改</a>
						<a href="javascript:void(0);" onclick="delCategory(14)">删除</a>
					</td>
				</tr>
								<tr class="pid_1 pid_2" style="height: 30px;display:none;" data-category-id="15" data-pid="1" data-level="3">
					<td></td>
					
					<td><span style="color:#ccc;">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;|——</span> <input class="input-common middle" type="text" fieldid="15" fieldname="category_name" value="空调" style="width: 150px;"></td>
					<td><input type="text" class="input-common middle" fieldid="15" fieldname="short_name" value="空调" style="width: 150px;"></td>
					<td></td>
					<td style="text-align: center;">是</td>
					<td style="text-align: center;"><input type="number" class="sort input-common input-common-sort" fieldid="15" fieldname="sort" value="2" size="1"></td>
					<td style="text-align: center;">
						<a href="/goods/updategoodscategory.html?category_id=15">修改</a>
						<a href="javascript:void(0);" onclick="delCategory(15)">删除</a>
					</td>
				</tr>
								<tr class="pid_1 pid_2" style="height: 30px;display:none;" data-category-id="16" data-pid="1" data-level="3">
					<td></td>
					
					<td><span style="color:#ccc;">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;|——</span> <input class="input-common middle" type="text" fieldid="16" fieldname="category_name" value="洗衣机" style="width: 150px;"></td>
					<td><input type="text" class="input-common middle" fieldid="16" fieldname="short_name" value="洗衣机" style="width: 150px;"></td>
					<td></td>
					<td style="text-align: center;">是</td>
					<td style="text-align: center;"><input type="number" class="sort input-common input-common-sort" fieldid="16" fieldname="sort" value="3" size="1"></td>
					<td style="text-align: center;">
						<a href="/goods/updategoodscategory.html?category_id=16">修改</a>
						<a href="javascript:void(0);" onclick="delCategory(16)">删除</a>
					</td>
				</tr>
								<tr class="pid_1 pid_2" style="height: 30px;display:none;" data-category-id="130" data-pid="1" data-level="3">
					<td></td>
					
					<td><span style="color:#ccc;">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;|——</span> <input class="input-common middle" type="text" fieldid="130" fieldname="category_name" value="智能家居" style="width: 150px;"></td>
					<td><input type="text" class="input-common middle" fieldid="130" fieldname="short_name" value="智能家居" style="width: 150px;"></td>
					<td></td>
					<td style="text-align: center;">是</td>
					<td style="text-align: center;"><input type="number" class="sort input-common input-common-sort" fieldid="130" fieldname="sort" value="4" size="1"></td>
					<td style="text-align: center;">
						<a href="/goods/updategoodscategory.html?category_id=130">修改</a>
						<a href="javascript:void(0);" onclick="delCategory(130)">删除</a>
					</td>
				</tr>
							<tr class="pid_2" style="height: 30px;display:none;" data-category-id="17" data-pid="2" data-level="2">
				<td>
										<a href="javascript:;" onclick="tab_switch(17)" class="tab_jian_17" style="display: block;">[-]</a>
					<a href="javascript:;" onclick="tab_switch(17)" class="tab_jia_17" style="display: none;">[+]</a>
									</td>
				
				<td><span style="color:#ccc;">|——</span> <input type="text" class="input-common middle" fieldid="17" fieldname="category_name" value="手机通讯" style="width: 150px;">
					<a href="javascript:;" onclick="addChildGoodsCategory(this, 3, 17);">
						<span class="add-child"><i>添加子分类</i></span>
					</a>
				</td>
				<td><input type="text" class="input-common middle" fieldid="17" fieldname="short_name" value="手机" style="width: 150px;"></td>
				<td></td>
				<td style="text-align: center;">是</td>
				<td style="text-align: center;"><input type="number" class="sort input-common input-common-sort" fieldid="17" fieldname="sort" value="1" size="1"></td>
				<td style="text-align: center;">
					<a href="/goods/updategoodscategory.html?category_id=17">修改</a>
					<a href="javascript:void(0);" onclick="delCategory(17)">删除</a>
				</td>
			</tr>
			
								<tr class="pid_17 pid_2" style="height: 30px;display:none;" data-category-id="64" data-pid="17" data-level="3">
					<td></td>
					
					<td><span style="color:#ccc;">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;|——</span> <input class="input-common middle" type="text" fieldid="64" fieldname="category_name" value="手机" style="width: 150px;"></td>
					<td><input type="text" class="input-common middle" fieldid="64" fieldname="short_name" value="手机" style="width: 150px;"></td>
					<td></td>
					<td style="text-align: center;">是</td>
					<td style="text-align: center;"><input type="number" class="sort input-common input-common-sort" fieldid="64" fieldname="sort" value="1" size="1"></td>
					<td style="text-align: center;">
						<a href="/goods/updategoodscategory.html?category_id=64">修改</a>
						<a href="javascript:void(0);" onclick="delCategory(64)">删除</a>
					</td>
				</tr>
								<tr class="pid_17 pid_2" style="height: 30px;display:none;" data-category-id="65" data-pid="17" data-level="3">
					<td></td>
					
					<td><span style="color:#ccc;">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;|——</span> <input class="input-common middle" type="text" fieldid="65" fieldname="category_name" value="对讲机" style="width: 150px;"></td>
					<td><input type="text" class="input-common middle" fieldid="65" fieldname="short_name" value="对讲机" style="width: 150px;"></td>
					<td></td>
					<td style="text-align: center;">是</td>
					<td style="text-align: center;"><input type="number" class="sort input-common input-common-sort" fieldid="65" fieldname="sort" value="2" size="1"></td>
					<td style="text-align: center;">
						<a href="/goods/updategoodscategory.html?category_id=65">修改</a>
						<a href="javascript:void(0);" onclick="delCategory(65)">删除</a>
					</td>
				</tr>
								<tr class="pid_17 pid_2" style="height: 30px;display:none;" data-category-id="66" data-pid="17" data-level="3">
					<td></td>
					
					<td><span style="color:#ccc;">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;|——</span> <input class="input-common middle" type="text" fieldid="66" fieldname="category_name" value="以旧换新" style="width: 150px;"></td>
					<td><input type="text" class="input-common middle" fieldid="66" fieldname="short_name" value="以旧换新" style="width: 150px;"></td>
					<td></td>
					<td style="text-align: center;">是</td>
					<td style="text-align: center;"><input type="number" class="sort input-common input-common-sort" fieldid="66" fieldname="sort" value="3" size="1"></td>
					<td style="text-align: center;">
						<a href="/goods/updategoodscategory.html?category_id=66">修改</a>
						<a href="javascript:void(0);" onclick="delCategory(66)">删除</a>
					</td>
				</tr>
							<tr class="pid_2" style="height: 30px;display:none;" data-category-id="18" data-pid="2" data-level="2">
				<td>
										<a href="javascript:;" onclick="tab_switch(18)" class="tab_jian_18" style="display: block;">[-]</a>
					<a href="javascript:;" onclick="tab_switch(18)" class="tab_jia_18" style="display: none;">[+]</a>
									</td>
				
				<td><span style="color:#ccc;">|——</span> <input type="text" class="input-common middle" fieldid="18" fieldname="category_name" value="运营商" style="width: 150px;">
					<a href="javascript:;" onclick="addChildGoodsCategory(this, 3, 18);">
						<span class="add-child"><i>添加子分类</i></span>
					</a>
				</td>
				<td><input type="text" class="input-common middle" fieldid="18" fieldname="short_name" value="运营商" style="width: 150px;"></td>
				<td></td>
				<td style="text-align: center;">是</td>
				<td style="text-align: center;"><input type="number" class="sort input-common input-common-sort" fieldid="18" fieldname="sort" value="2" size="1"></td>
				<td style="text-align: center;">
					<a href="/goods/updategoodscategory.html?category_id=18">修改</a>
					<a href="javascript:void(0);" onclick="delCategory(18)">删除</a>
				</td>
			</tr>
			
								<tr class="pid_18 pid_2" style="height: 30px;display:none;" data-category-id="67" data-pid="18" data-level="3">
					<td></td>
					
					<td><span style="color:#ccc;">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;|——</span> <input class="input-common middle" type="text" fieldid="67" fieldname="category_name" value="合约机" style="width: 150px;"></td>
					<td><input type="text" class="input-common middle" fieldid="67" fieldname="short_name" value="合约机" style="width: 150px;"></td>
					<td></td>
					<td style="text-align: center;">是</td>
					<td style="text-align: center;"><input type="number" class="sort input-common input-common-sort" fieldid="67" fieldname="sort" value="1" size="1"></td>
					<td style="text-align: center;">
						<a href="/goods/updategoodscategory.html?category_id=67">修改</a>
						<a href="javascript:void(0);" onclick="delCategory(67)">删除</a>
					</td>
				</tr>
								<tr class="pid_18 pid_2" style="height: 30px;display:none;" data-category-id="68" data-pid="18" data-level="3">
					<td></td>
					
					<td><span style="color:#ccc;">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;|——</span> <input class="input-common middle" type="text" fieldid="68" fieldname="category_name" value="选号码" style="width: 150px;"></td>
					<td><input type="text" class="input-common middle" fieldid="68" fieldname="short_name" value="选号码" style="width: 150px;"></td>
					<td></td>
					<td style="text-align: center;">是</td>
					<td style="text-align: center;"><input type="number" class="sort input-common input-common-sort" fieldid="68" fieldname="sort" value="2" size="1"></td>
					<td style="text-align: center;">
						<a href="/goods/updategoodscategory.html?category_id=68">修改</a>
						<a href="javascript:void(0);" onclick="delCategory(68)">删除</a>
					</td>
				</tr>
								<tr class="pid_18 pid_2" style="height: 30px;display:none;" data-category-id="69" data-pid="18" data-level="3">
					<td></td>
					
					<td><span style="color:#ccc;">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;|——</span> <input class="input-common middle" type="text" fieldid="69" fieldname="category_name" value="固定宽带" style="width: 150px;"></td>
					<td><input type="text" class="input-common middle" fieldid="69" fieldname="short_name" value="固定宽带" style="width: 150px;"></td>
					<td></td>
					<td style="text-align: center;">是</td>
					<td style="text-align: center;"><input type="number" class="sort input-common input-common-sort" fieldid="69" fieldname="sort" value="3" size="1"></td>
					<td style="text-align: center;">
						<a href="/goods/updategoodscategory.html?category_id=69">修改</a>
						<a href="javascript:void(0);" onclick="delCategory(69)">删除</a>
					</td>
				</tr>
								<tr class="pid_18 pid_2" style="height: 30px;display:none;" data-category-id="160" data-pid="18" data-level="3">
					<td></td>
					
					<td><span style="color:#ccc;">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;|——</span> <input class="input-common middle" type="text" fieldid="160" fieldname="category_name" value="ss" style="width: 150px;"></td>
					<td><input type="text" class="input-common middle" fieldid="160" fieldname="short_name" value="s" style="width: 150px;"></td>
					<td>服装</td>
					<td style="text-align: center;">是</td>
					<td style="text-align: center;"><input type="number" class="sort input-common input-common-sort" fieldid="160" fieldname="sort" value="3" size="1"></td>
					<td style="text-align: center;">
						<a href="/goods/updategoodscategory.html?category_id=160">修改</a>
						<a href="javascript:void(0);" onclick="delCategory(160)">删除</a>
					</td>
				</tr>
							<tr class="pid_2" style="height: 30px;display:none;" data-category-id="20" data-pid="2" data-level="2">
				<td>
										<a href="javascript:;" onclick="tab_switch(20)" class="tab_jian_20" style="display: block;">[-]</a>
					<a href="javascript:;" onclick="tab_switch(20)" class="tab_jia_20" style="display: none;">[+]</a>
									</td>
				
				<td><span style="color:#ccc;">|——</span> <input type="text" class="input-common middle" fieldid="20" fieldname="category_name" value="手机配件" style="width: 150px;">
					<a href="javascript:;" onclick="addChildGoodsCategory(this, 3, 20);">
						<span class="add-child"><i>添加子分类</i></span>
					</a>
				</td>
				<td><input type="text" class="input-common middle" fieldid="20" fieldname="short_name" value="手机配件" style="width: 150px;"></td>
				<td></td>
				<td style="text-align: center;">是</td>
				<td style="text-align: center;"><input type="number" class="sort input-common input-common-sort" fieldid="20" fieldname="sort" value="3" size="1"></td>
				<td style="text-align: center;">
					<a href="/goods/updategoodscategory.html?category_id=20">修改</a>
					<a href="javascript:void(0);" onclick="delCategory(20)">删除</a>
				</td>
			</tr>
			
								<tr class="pid_20 pid_2" style="height: 30px;display:none;" data-category-id="70" data-pid="20" data-level="3">
					<td></td>
					
					<td><span style="color:#ccc;">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;|——</span> <input class="input-common middle" type="text" fieldid="70" fieldname="category_name" value="手机壳" style="width: 150px;"></td>
					<td><input type="text" class="input-common middle" fieldid="70" fieldname="short_name" value="手机壳" style="width: 150px;"></td>
					<td></td>
					<td style="text-align: center;">是</td>
					<td style="text-align: center;"><input type="number" class="sort input-common input-common-sort" fieldid="70" fieldname="sort" value="1" size="1"></td>
					<td style="text-align: center;">
						<a href="/goods/updategoodscategory.html?category_id=70">修改</a>
						<a href="javascript:void(0);" onclick="delCategory(70)">删除</a>
					</td>
				</tr>
								<tr class="pid_20 pid_2" style="height: 30px;display:none;" data-category-id="71" data-pid="20" data-level="3">
					<td></td>
					
					<td><span style="color:#ccc;">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;|——</span> <input class="input-common middle" type="text" fieldid="71" fieldname="category_name" value="贴膜" style="width: 150px;"></td>
					<td><input type="text" class="input-common middle" fieldid="71" fieldname="short_name" value="贴膜" style="width: 150px;"></td>
					<td></td>
					<td style="text-align: center;">是</td>
					<td style="text-align: center;"><input type="number" class="sort input-common input-common-sort" fieldid="71" fieldname="sort" value="2" size="1"></td>
					<td style="text-align: center;">
						<a href="/goods/updategoodscategory.html?category_id=71">修改</a>
						<a href="javascript:void(0);" onclick="delCategory(71)">删除</a>
					</td>
				</tr>
								<tr class="pid_20 pid_2" style="height: 30px;display:none;" data-category-id="72" data-pid="20" data-level="3">
					<td></td>
					
					<td><span style="color:#ccc;">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;|——</span> <input class="input-common middle" type="text" fieldid="72" fieldname="category_name" value="手机存储卡" style="width: 150px;"></td>
					<td><input type="text" class="input-common middle" fieldid="72" fieldname="short_name" value="存储卡" style="width: 150px;"></td>
					<td></td>
					<td style="text-align: center;">是</td>
					<td style="text-align: center;"><input type="number" class="sort input-common input-common-sort" fieldid="72" fieldname="sort" value="3" size="1"></td>
					<td style="text-align: center;">
						<a href="/goods/updategoodscategory.html?category_id=72">修改</a>
						<a href="javascript:void(0);" onclick="delCategory(72)">删除</a>
					</td>
				</tr>
						<tr class="pid_0" style="height: 30px;" data-category-id="9" data-pid="0" data-level="1">
			<td>
								<a href="javascript:;" onclick="tab_switch(9)" class="tab_jia_9" style="display: block;">[+]</a>
				<a href="javascript:;" onclick="tab_switch(9)" class="tab_jian_9" style="display: none;">[-]</a>
							</td>
			
			<td>
				<input class="input-common middle" type="text" fieldid="9" fieldname="category_name" value="汽车/汽车用品" style="width: 150px;">
				<a href="javascript:;" onclick="addChildGoodsCategory(this, 2, 9);">
				<span class="add-child"><i>添加子分类</i></span>
				</a>
			</td>
			<td><input class="input-common middle" type="text" fieldid="9" fieldname="short_name" value="汽车" style="width: 150px;"></td>
			<td></td>
			<td style="text-align: center;">是</td>
			<td style="text-align: center;"><input type="number" class="sort input-common input-common-sort" fieldid="9" fieldname="sort" value="9" size="1"></td>
			<td style="text-align: center;">
				<a href="/goods/updategoodscategory.html?category_id=9">修改</a>
				<a href="javascript:void(0);" onclick="delCategory(9)">删除</a>
			</td>
		</tr>
		
						<tr class="pid_9" style="height: 30px;display:none;" data-category-id="40" data-pid="9" data-level="2">
				<td>
									</td>
				
				<td><span style="color:#ccc;">|——</span> <input type="text" class="input-common middle" fieldid="40" fieldname="category_name" value="汽车车型" style="width: 150px;">
					<a href="javascript:;" onclick="addChildGoodsCategory(this, 3, 40);">
						<span class="add-child"><i>添加子分类</i></span>
					</a>
				</td>
				<td><input type="text" class="input-common middle" fieldid="40" fieldname="short_name" value="车型" style="width: 150px;"></td>
				<td></td>
				<td style="text-align: center;">是</td>
				<td style="text-align: center;"><input type="number" class="sort input-common input-common-sort" fieldid="40" fieldname="sort" value="1" size="1"></td>
				<td style="text-align: center;">
					<a href="/goods/updategoodscategory.html?category_id=40">修改</a>
					<a href="javascript:void(0);" onclick="delCategory(40)">删除</a>
				</td>
			</tr>
			
							<tr class="pid_9" style="height: 30px;display:none;" data-category-id="41" data-pid="9" data-level="2">
				<td>
									</td>
				
				<td><span style="color:#ccc;">|——</span> <input type="text" class="input-common middle" fieldid="41" fieldname="category_name" value="汽车价格" style="width: 150px;">
					<a href="javascript:;" onclick="addChildGoodsCategory(this, 3, 41);">
						<span class="add-child"><i>添加子分类</i></span>
					</a>
				</td>
				<td><input type="text" class="input-common middle" fieldid="41" fieldname="short_name" value="车价" style="width: 150px;"></td>
				<td></td>
				<td style="text-align: center;">是</td>
				<td style="text-align: center;"><input type="number" class="sort input-common input-common-sort" fieldid="41" fieldname="sort" value="2" size="1"></td>
				<td style="text-align: center;">
					<a href="/goods/updategoodscategory.html?category_id=41">修改</a>
					<a href="javascript:void(0);" onclick="delCategory(41)">删除</a>
				</td>
			</tr>
			
							<tr class="pid_9" style="height: 30px;display:none;" data-category-id="42" data-pid="9" data-level="2">
				<td>
									</td>
				
				<td><span style="color:#ccc;">|——</span> <input type="text" class="input-common middle" fieldid="42" fieldname="category_name" value="汽车品牌" style="width: 150px;">
					<a href="javascript:;" onclick="addChildGoodsCategory(this, 3, 42);">
						<span class="add-child"><i>添加子分类</i></span>
					</a>
				</td>
				<td><input type="text" class="input-common middle" fieldid="42" fieldname="short_name" value="品牌" style="width: 150px;"></td>
				<td></td>
				<td style="text-align: center;">是</td>
				<td style="text-align: center;"><input type="number" class="sort input-common input-common-sort" fieldid="42" fieldname="sort" value="3" size="1"></td>
				<td style="text-align: center;">
					<a href="/goods/updategoodscategory.html?category_id=42">修改</a>
					<a href="javascript:void(0);" onclick="delCategory(42)">删除</a>
				</td>
			</tr>
			
						<tr class="pid_0" style="height: 30px;" data-category-id="10" data-pid="0" data-level="1">
			<td>
								<a href="javascript:;" onclick="tab_switch(10)" class="tab_jia_10" style="display: block;">[+]</a>
				<a href="javascript:;" onclick="tab_switch(10)" class="tab_jian_10" style="display: none;">[-]</a>
							</td>
			
			<td>
				<input class="input-common middle" type="text" fieldid="10" fieldname="category_name" value="母婴/玩具用品" style="width: 150px;">
				<a href="javascript:;" onclick="addChildGoodsCategory(this, 2, 10);">
				<span class="add-child"><i>添加子分类</i></span>
				</a>
			</td>
			<td><input class="input-common middle" type="text" fieldid="10" fieldname="short_name" value="母婴" style="width: 150px;"></td>
			<td></td>
			<td style="text-align: center;">是</td>
			<td style="text-align: center;"><input type="number" class="sort input-common input-common-sort" fieldid="10" fieldname="sort" value="10" size="1"></td>
			<td style="text-align: center;">
				<a href="/goods/updategoodscategory.html?category_id=10">修改</a>
				<a href="javascript:void(0);" onclick="delCategory(10)">删除</a>
			</td>
		</tr>
		
						<tr class="pid_10" style="height: 30px;display:none;" data-category-id="43" data-pid="10" data-level="2">
				<td>
									</td>
				
				<td><span style="color:#ccc;">|——</span> <input type="text" class="input-common middle" fieldid="43" fieldname="category_name" value="奶粉" style="width: 150px;">
					<a href="javascript:;" onclick="addChildGoodsCategory(this, 3, 43);">
						<span class="add-child"><i>添加子分类</i></span>
					</a>
				</td>
				<td><input type="text" class="input-common middle" fieldid="43" fieldname="short_name" value="奶粉" style="width: 150px;"></td>
				<td></td>
				<td style="text-align: center;">是</td>
				<td style="text-align: center;"><input type="number" class="sort input-common input-common-sort" fieldid="43" fieldname="sort" value="1" size="1"></td>
				<td style="text-align: center;">
					<a href="/goods/updategoodscategory.html?category_id=43">修改</a>
					<a href="javascript:void(0);" onclick="delCategory(43)">删除</a>
				</td>
			</tr>
			
							<tr class="pid_10" style="height: 30px;display:none;" data-category-id="44" data-pid="10" data-level="2">
				<td>
									</td>
				
				<td><span style="color:#ccc;">|——</span> <input type="text" class="input-common middle" fieldid="44" fieldname="category_name" value="营养辅食" style="width: 150px;">
					<a href="javascript:;" onclick="addChildGoodsCategory(this, 3, 44);">
						<span class="add-child"><i>添加子分类</i></span>
					</a>
				</td>
				<td><input type="text" class="input-common middle" fieldid="44" fieldname="short_name" value="营养辅食" style="width: 150px;"></td>
				<td></td>
				<td style="text-align: center;">是</td>
				<td style="text-align: center;"><input type="number" class="sort input-common input-common-sort" fieldid="44" fieldname="sort" value="2" size="1"></td>
				<td style="text-align: center;">
					<a href="/goods/updategoodscategory.html?category_id=44">修改</a>
					<a href="javascript:void(0);" onclick="delCategory(44)">删除</a>
				</td>
			</tr>
			
							<tr class="pid_10" style="height: 30px;display:none;" data-category-id="45" data-pid="10" data-level="2">
				<td>
									</td>
				
				<td><span style="color:#ccc;">|——</span> <input type="text" class="input-common middle" fieldid="45" fieldname="category_name" value="尿裤湿巾" style="width: 150px;">
					<a href="javascript:;" onclick="addChildGoodsCategory(this, 3, 45);">
						<span class="add-child"><i>添加子分类</i></span>
					</a>
				</td>
				<td><input type="text" class="input-common middle" fieldid="45" fieldname="short_name" value="尿裤" style="width: 150px;"></td>
				<td></td>
				<td style="text-align: center;">是</td>
				<td style="text-align: center;"><input type="number" class="sort input-common input-common-sort" fieldid="45" fieldname="sort" value="3" size="1"></td>
				<td style="text-align: center;">
					<a href="/goods/updategoodscategory.html?category_id=45">修改</a>
					<a href="javascript:void(0);" onclick="delCategory(45)">删除</a>
				</td>
			</tr>
			
							<tr class="pid_10" style="height: 30px;display:none;" data-category-id="134" data-pid="10" data-level="2">
				<td>
									</td>
				
				<td><span style="color:#ccc;">|——</span> <input type="text" class="input-common middle" fieldid="134" fieldname="category_name" value="test" style="width: 150px;">
					<a href="javascript:;" onclick="addChildGoodsCategory(this, 3, 134);">
						<span class="add-child"><i>添加子分类</i></span>
					</a>
				</td>
				<td><input type="text" class="input-common middle" fieldid="134" fieldname="short_name" value="test" style="width: 150px;"></td>
				<td></td>
				<td style="text-align: center;">是</td>
				<td style="text-align: center;"><input type="number" class="sort input-common input-common-sort" fieldid="134" fieldname="sort" value="5" size="1"></td>
				<td style="text-align: center;">
					<a href="/goods/updategoodscategory.html?category_id=134">修改</a>
					<a href="javascript:void(0);" onclick="delCategory(134)">删除</a>
				</td>
			</tr>
			
						<tr class="pid_0" style="height: 30px;" data-category-id="11" data-pid="0" data-level="1">
			<td>
								<a href="javascript:;" onclick="tab_switch(11)" class="tab_jia_11" style="display: block;">[+]</a>
				<a href="javascript:;" onclick="tab_switch(11)" class="tab_jian_11" style="display: none;">[-]</a>
							</td>
			
			<td>
				<input class="input-common middle" type="text" fieldid="11" fieldname="category_name" value="食品/酒类/生鲜/特产" style="width: 150px;">
				<a href="javascript:;" onclick="addChildGoodsCategory(this, 2, 11);">
				<span class="add-child"><i>添加子分类</i></span>
				</a>
			</td>
			<td><input class="input-common middle" type="text" fieldid="11" fieldname="short_name" value="食品生鲜" style="width: 150px;"></td>
			<td></td>
			<td style="text-align: center;">是</td>
			<td style="text-align: center;"><input type="number" class="sort input-common input-common-sort" fieldid="11" fieldname="sort" value="11" size="1"></td>
			<td style="text-align: center;">
				<a href="/goods/updategoodscategory.html?category_id=11">修改</a>
				<a href="javascript:void(0);" onclick="delCategory(11)">删除</a>
			</td>
		</tr>
		
						<tr class="pid_11" style="height: 30px;display:none;" data-category-id="46" data-pid="11" data-level="2">
				<td>
										<a href="javascript:;" onclick="tab_switch(46)" class="tab_jian_46" style="display: block;">[-]</a>
					<a href="javascript:;" onclick="tab_switch(46)" class="tab_jia_46" style="display: none;">[+]</a>
									</td>
				
				<td><span style="color:#ccc;">|——</span> <input type="text" class="input-common middle" fieldid="46" fieldname="category_name" value="新鲜水果" style="width: 150px;">
					<a href="javascript:;" onclick="addChildGoodsCategory(this, 3, 46);">
						<span class="add-child"><i>添加子分类</i></span>
					</a>
				</td>
				<td><input type="text" class="input-common middle" fieldid="46" fieldname="short_name" value="水果" style="width: 150px;"></td>
				<td></td>
				<td style="text-align: center;">是</td>
				<td style="text-align: center;"><input type="number" class="sort input-common input-common-sort" fieldid="46" fieldname="sort" value="1" size="1"></td>
				<td style="text-align: center;">
					<a href="/goods/updategoodscategory.html?category_id=46">修改</a>
					<a href="javascript:void(0);" onclick="delCategory(46)">删除</a>
				</td>
			</tr>
			
								<tr class="pid_46 pid_11" style="height: 30px;display:none;" data-category-id="127" data-pid="46" data-level="3">
					<td></td>
					
					<td><span style="color:#ccc;">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;|——</span> <input class="input-common middle" type="text" fieldid="127" fieldname="category_name" value="苹果" style="width: 150px;"></td>
					<td><input type="text" class="input-common middle" fieldid="127" fieldname="short_name" value="苹果" style="width: 150px;"></td>
					<td></td>
					<td style="text-align: center;">是</td>
					<td style="text-align: center;"><input type="number" class="sort input-common input-common-sort" fieldid="127" fieldname="sort" value="1" size="1"></td>
					<td style="text-align: center;">
						<a href="/goods/updategoodscategory.html?category_id=127">修改</a>
						<a href="javascript:void(0);" onclick="delCategory(127)">删除</a>
					</td>
				</tr>
								<tr class="pid_46 pid_11" style="height: 30px;display:none;" data-category-id="128" data-pid="46" data-level="3">
					<td></td>
					
					<td><span style="color:#ccc;">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;|——</span> <input class="input-common middle" type="text" fieldid="128" fieldname="category_name" value="国产水果" style="width: 150px;"></td>
					<td><input type="text" class="input-common middle" fieldid="128" fieldname="short_name" value="国产水果" style="width: 150px;"></td>
					<td></td>
					<td style="text-align: center;">是</td>
					<td style="text-align: center;"><input type="number" class="sort input-common input-common-sort" fieldid="128" fieldname="sort" value="2" size="1"></td>
					<td style="text-align: center;">
						<a href="/goods/updategoodscategory.html?category_id=128">修改</a>
						<a href="javascript:void(0);" onclick="delCategory(128)">删除</a>
					</td>
				</tr>
								<tr class="pid_46 pid_11" style="height: 30px;display:none;" data-category-id="129" data-pid="46" data-level="3">
					<td></td>
					
					<td><span style="color:#ccc;">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;|——</span> <input class="input-common middle" type="text" fieldid="129" fieldname="category_name" value="进口水果" style="width: 150px;"></td>
					<td><input type="text" class="input-common middle" fieldid="129" fieldname="short_name" value="进口水果" style="width: 150px;"></td>
					<td></td>
					<td style="text-align: center;">是</td>
					<td style="text-align: center;"><input type="number" class="sort input-common input-common-sort" fieldid="129" fieldname="sort" value="3" size="1"></td>
					<td style="text-align: center;">
						<a href="/goods/updategoodscategory.html?category_id=129">修改</a>
						<a href="javascript:void(0);" onclick="delCategory(129)">删除</a>
					</td>
				</tr>
							<tr class="pid_11" style="height: 30px;display:none;" data-category-id="47" data-pid="11" data-level="2">
				<td>
									</td>
				
				<td><span style="color:#ccc;">|——</span> <input type="text" class="input-common middle" fieldid="47" fieldname="category_name" value="蔬菜蛋品" style="width: 150px;">
					<a href="javascript:;" onclick="addChildGoodsCategory(this, 3, 47);">
						<span class="add-child"><i>添加子分类</i></span>
					</a>
				</td>
				<td><input type="text" class="input-common middle" fieldid="47" fieldname="short_name" value="蔬菜" style="width: 150px;"></td>
				<td></td>
				<td style="text-align: center;">是</td>
				<td style="text-align: center;"><input type="number" class="sort input-common input-common-sort" fieldid="47" fieldname="sort" value="2" size="1"></td>
				<td style="text-align: center;">
					<a href="/goods/updategoodscategory.html?category_id=47">修改</a>
					<a href="javascript:void(0);" onclick="delCategory(47)">删除</a>
				</td>
			</tr>
			
							<tr class="pid_11" style="height: 30px;display:none;" data-category-id="48" data-pid="11" data-level="2">
				<td>
									</td>
				
				<td><span style="color:#ccc;">|——</span> <input type="text" class="input-common middle" fieldid="48" fieldname="category_name" value="精选蔬菜" style="width: 150px;">
					<a href="javascript:;" onclick="addChildGoodsCategory(this, 3, 48);">
						<span class="add-child"><i>添加子分类</i></span>
					</a>
				</td>
				<td><input type="text" class="input-common middle" fieldid="48" fieldname="short_name" value="蔬菜" style="width: 150px;"></td>
				<td></td>
				<td style="text-align: center;">是</td>
				<td style="text-align: center;"><input type="number" class="sort input-common input-common-sort" fieldid="48" fieldname="sort" value="3" size="1"></td>
				<td style="text-align: center;">
					<a href="/goods/updategoodscategory.html?category_id=48">修改</a>
					<a href="javascript:void(0);" onclick="delCategory(48)">删除</a>
				</td>
			</tr>
			
					</tbody>
</table>


<div class="options-btn" id="saveNewAddedCategory" style="display: none;">
	<button class="btn-common btn-small">保存</button>
</div>

<!--添加分类-->
<div id="addChildGoodsCategory" class="modal hide fade" tabindex="-1" role="dialog" aria-hidden="true">
	<div class="modal-header">
		<button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
		<h3 id="myModalLabel" class="box-title">添加分类</h3>
	</div>
	<div class="modal-body">
		<div class="form-horizontal">
			
			<div class="control-group">
				<label class="control-label" for="article_class_name"><span class="color-red">*</span>分类名称：</label>
				<div class="controls">
					<input type="text" id="category_name" class="input-common" placeholder="请输入分类名称">
					<p class="help-block input-error">商品分类不能为空，且长度不能超过30个字</p>
				</div>
			</div>

			<div class="control-group">
				<label class="control-label" for="article_class_name"><span class="color-red">*</span>分类简称：</label>
				<div class="controls">
					<input type="text" id="short_name" class="input-common" placeholder="请输入分类简称">
					<p class="help-block input-error">商品分类简称不能为空，且长度不能超过20个字</p>
				</div>
			</div>
			
			<div class="control-group">
				<label class="control-label" for="goods_category_pid"><span class="color-red">*</span>上级分类：</label>
				<div class="controls">
					<div class="selectric-wrapper selectric-select-common" style="width: 250px;"><div class="selectric-hide-select"><select id="goods_category_pid" name="account" class="select-common" tabindex="-1">
						<option value="0">顶级分类</option>
													<option value="3">养护设备</option>
														<option value="153">&nbsp;&nbsp;&nbsp;&nbsp;fgdsfasfasdf</option>
														<option value="161">&nbsp;&nbsp;&nbsp;&nbsp;wqqqdas</option>
														<option value="21">&nbsp;&nbsp;&nbsp;&nbsp;电脑整机</option>
														<option value="22">&nbsp;&nbsp;&nbsp;&nbsp;电脑配件</option>
														<option value="23">&nbsp;&nbsp;&nbsp;&nbsp;外设产品</option>
														<option value="4">工程设备</option>
														<option value="24">&nbsp;&nbsp;&nbsp;&nbsp;厨具</option>
														<option value="25">&nbsp;&nbsp;&nbsp;&nbsp;家纺</option>
														<option value="26">&nbsp;&nbsp;&nbsp;&nbsp;生活用品</option>
														<option value="5">环卫设备</option>
														<option value="27">&nbsp;&nbsp;&nbsp;&nbsp;女装</option>
														<option value="28">&nbsp;&nbsp;&nbsp;&nbsp;男装</option>
														<option value="29">&nbsp;&nbsp;&nbsp;&nbsp;内衣</option>
														<option value="146">服装</option>
														<option value="147">&nbsp;&nbsp;&nbsp;&nbsp;女装</option>
														<option value="148">&nbsp;&nbsp;&nbsp;&nbsp;男装</option>
														<option value="6">配件专区</option>
														<option value="30">&nbsp;&nbsp;&nbsp;&nbsp;面部护肤</option>
														<option value="31">&nbsp;&nbsp;&nbsp;&nbsp;洗发护发</option>
														<option value="32">&nbsp;&nbsp;&nbsp;&nbsp;身体护理</option>
														<option value="7">女鞋/箱包/钟表/珠宝</option>
														<option value="33">&nbsp;&nbsp;&nbsp;&nbsp;时尚女鞋</option>
														<option value="35">&nbsp;&nbsp;&nbsp;&nbsp;潮流女包</option>
														<option value="36">&nbsp;&nbsp;&nbsp;&nbsp;精品男包</option>
														<option value="8">男鞋/运动/户外</option>
														<option value="37">&nbsp;&nbsp;&nbsp;&nbsp;流行男鞋</option>
														<option value="38">&nbsp;&nbsp;&nbsp;&nbsp;运动鞋包</option>
														<option value="39">&nbsp;&nbsp;&nbsp;&nbsp;运动服饰</option>
														<option value="2">混凝土设</option>
														<option value="135">&nbsp;&nbsp;&nbsp;&nbsp;432</option>
														<option value="155">&nbsp;&nbsp;&nbsp;&nbsp;二级分类</option>
														<option value="1">&nbsp;&nbsp;&nbsp;&nbsp;家用电器</option>
														<option value="17">&nbsp;&nbsp;&nbsp;&nbsp;手机通讯</option>
														<option value="18">&nbsp;&nbsp;&nbsp;&nbsp;运营商</option>
														<option value="20">&nbsp;&nbsp;&nbsp;&nbsp;手机配件</option>
														<option value="9">汽车/汽车用品</option>
														<option value="40">&nbsp;&nbsp;&nbsp;&nbsp;汽车车型</option>
														<option value="41">&nbsp;&nbsp;&nbsp;&nbsp;汽车价格</option>
														<option value="42">&nbsp;&nbsp;&nbsp;&nbsp;汽车品牌</option>
														<option value="10">母婴/玩具用品</option>
														<option value="43">&nbsp;&nbsp;&nbsp;&nbsp;奶粉</option>
														<option value="44">&nbsp;&nbsp;&nbsp;&nbsp;营养辅食</option>
														<option value="45">&nbsp;&nbsp;&nbsp;&nbsp;尿裤湿巾</option>
														<option value="134">&nbsp;&nbsp;&nbsp;&nbsp;test</option>
														<option value="11">食品/酒类/生鲜/特产</option>
														<option value="46">&nbsp;&nbsp;&nbsp;&nbsp;新鲜水果</option>
														<option value="47">&nbsp;&nbsp;&nbsp;&nbsp;蔬菜蛋品</option>
														<option value="48">&nbsp;&nbsp;&nbsp;&nbsp;精选蔬菜</option>
												</select></div><div class="selectric"><span class="selectric-label">顶级分类</span><button class="selectric-button">▾</button></div><div class="selectric-items" tabindex="-1"><div class="selectric-scroll"><ul><li data-index="0" class="selected" title="顶级分类">顶级分类</li><li data-index="1" class="" title="养护设备">养护设备</li><li data-index="2" class="" title="&nbsp;&nbsp;&nbsp;&nbsp;fgdsfasfasdf">&nbsp;&nbsp;&nbsp;&nbsp;fgdsfasfasdf</li><li data-index="3" class="" title="&nbsp;&nbsp;&nbsp;&nbsp;wqqqdas">&nbsp;&nbsp;&nbsp;&nbsp;wqqqdas</li><li data-index="4" class="" title="&nbsp;&nbsp;&nbsp;&nbsp;电脑整机">&nbsp;&nbsp;&nbsp;&nbsp;电脑整机</li><li data-index="5" class="" title="&nbsp;&nbsp;&nbsp;&nbsp;电脑配件">&nbsp;&nbsp;&nbsp;&nbsp;电脑配件</li><li data-index="6" class="" title="&nbsp;&nbsp;&nbsp;&nbsp;外设产品">&nbsp;&nbsp;&nbsp;&nbsp;外设产品</li><li data-index="7" class="" title="工程设备">工程设备</li><li data-index="8" class="" title="&nbsp;&nbsp;&nbsp;&nbsp;厨具">&nbsp;&nbsp;&nbsp;&nbsp;厨具</li><li data-index="9" class="" title="&nbsp;&nbsp;&nbsp;&nbsp;家纺">&nbsp;&nbsp;&nbsp;&nbsp;家纺</li><li data-index="10" class="" title="&nbsp;&nbsp;&nbsp;&nbsp;生活用品">&nbsp;&nbsp;&nbsp;&nbsp;生活用品</li><li data-index="11" class="" title="环卫设备">环卫设备</li><li data-index="12" class="" title="&nbsp;&nbsp;&nbsp;&nbsp;女装">&nbsp;&nbsp;&nbsp;&nbsp;女装</li><li data-index="13" class="" title="&nbsp;&nbsp;&nbsp;&nbsp;男装">&nbsp;&nbsp;&nbsp;&nbsp;男装</li><li data-index="14" class="" title="&nbsp;&nbsp;&nbsp;&nbsp;内衣">&nbsp;&nbsp;&nbsp;&nbsp;内衣</li><li data-index="15" class="" title="服装">服装</li><li data-index="16" class="" title="&nbsp;&nbsp;&nbsp;&nbsp;女装">&nbsp;&nbsp;&nbsp;&nbsp;女装</li><li data-index="17" class="" title="&nbsp;&nbsp;&nbsp;&nbsp;男装">&nbsp;&nbsp;&nbsp;&nbsp;男装</li><li data-index="18" class="" title="配件专区">配件专区</li><li data-index="19" class="" title="&nbsp;&nbsp;&nbsp;&nbsp;面部护肤">&nbsp;&nbsp;&nbsp;&nbsp;面部护肤</li><li data-index="20" class="" title="&nbsp;&nbsp;&nbsp;&nbsp;洗发护发">&nbsp;&nbsp;&nbsp;&nbsp;洗发护发</li><li data-index="21" class="" title="&nbsp;&nbsp;&nbsp;&nbsp;身体护理">&nbsp;&nbsp;&nbsp;&nbsp;身体护理</li><li data-index="22" class="" title="女鞋/箱包/钟表/珠宝">女鞋/箱包/钟表/珠宝</li><li data-index="23" class="" title="&nbsp;&nbsp;&nbsp;&nbsp;时尚女鞋">&nbsp;&nbsp;&nbsp;&nbsp;时尚女鞋</li><li data-index="24" class="" title="&nbsp;&nbsp;&nbsp;&nbsp;潮流女包">&nbsp;&nbsp;&nbsp;&nbsp;潮流女包</li><li data-index="25" class="" title="&nbsp;&nbsp;&nbsp;&nbsp;精品男包">&nbsp;&nbsp;&nbsp;&nbsp;精品男包</li><li data-index="26" class="" title="男鞋/运动/户外">男鞋/运动/户外</li><li data-index="27" class="" title="&nbsp;&nbsp;&nbsp;&nbsp;流行男鞋">&nbsp;&nbsp;&nbsp;&nbsp;流行男鞋</li><li data-index="28" class="" title="&nbsp;&nbsp;&nbsp;&nbsp;运动鞋包">&nbsp;&nbsp;&nbsp;&nbsp;运动鞋包</li><li data-index="29" class="" title="&nbsp;&nbsp;&nbsp;&nbsp;运动服饰">&nbsp;&nbsp;&nbsp;&nbsp;运动服饰</li><li data-index="30" class="" title="混凝土设">混凝土设</li><li data-index="31" class="" title="&nbsp;&nbsp;&nbsp;&nbsp;432">&nbsp;&nbsp;&nbsp;&nbsp;432</li><li data-index="32" class="" title="&nbsp;&nbsp;&nbsp;&nbsp;二级分类">&nbsp;&nbsp;&nbsp;&nbsp;二级分类</li><li data-index="33" class="" title="&nbsp;&nbsp;&nbsp;&nbsp;家用电器">&nbsp;&nbsp;&nbsp;&nbsp;家用电器</li><li data-index="34" class="" title="&nbsp;&nbsp;&nbsp;&nbsp;手机通讯">&nbsp;&nbsp;&nbsp;&nbsp;手机通讯</li><li data-index="35" class="" title="&nbsp;&nbsp;&nbsp;&nbsp;运营商">&nbsp;&nbsp;&nbsp;&nbsp;运营商</li><li data-index="36" class="" title="&nbsp;&nbsp;&nbsp;&nbsp;手机配件">&nbsp;&nbsp;&nbsp;&nbsp;手机配件</li><li data-index="37" class="" title="汽车/汽车用品">汽车/汽车用品</li><li data-index="38" class="" title="&nbsp;&nbsp;&nbsp;&nbsp;汽车车型">&nbsp;&nbsp;&nbsp;&nbsp;汽车车型</li><li data-index="39" class="" title="&nbsp;&nbsp;&nbsp;&nbsp;汽车价格">&nbsp;&nbsp;&nbsp;&nbsp;汽车价格</li><li data-index="40" class="" title="&nbsp;&nbsp;&nbsp;&nbsp;汽车品牌">&nbsp;&nbsp;&nbsp;&nbsp;汽车品牌</li><li data-index="41" class="" title="母婴/玩具用品">母婴/玩具用品</li><li data-index="42" class="" title="&nbsp;&nbsp;&nbsp;&nbsp;奶粉">&nbsp;&nbsp;&nbsp;&nbsp;奶粉</li><li data-index="43" class="" title="&nbsp;&nbsp;&nbsp;&nbsp;营养辅食">&nbsp;&nbsp;&nbsp;&nbsp;营养辅食</li><li data-index="44" class="" title="&nbsp;&nbsp;&nbsp;&nbsp;尿裤湿巾">&nbsp;&nbsp;&nbsp;&nbsp;尿裤湿巾</li><li data-index="45" class="" title="&nbsp;&nbsp;&nbsp;&nbsp;test">&nbsp;&nbsp;&nbsp;&nbsp;test</li><li data-index="46" class="" title="食品/酒类/生鲜/特产">食品/酒类/生鲜/特产</li><li data-index="47" class="" title="&nbsp;&nbsp;&nbsp;&nbsp;新鲜水果">&nbsp;&nbsp;&nbsp;&nbsp;新鲜水果</li><li data-index="48" class="" title="&nbsp;&nbsp;&nbsp;&nbsp;蔬菜蛋品">&nbsp;&nbsp;&nbsp;&nbsp;蔬菜蛋品</li><li data-index="49" class="last" title="&nbsp;&nbsp;&nbsp;&nbsp;精选蔬菜">&nbsp;&nbsp;&nbsp;&nbsp;精选蔬菜</li></ul></div></div><input class="selectric-input" tabindex="0"></div>
				</div>
			</div>
			
			<div class="control-group">
				<label class="control-label" for="sort">排序：</label>
				<div class="controls">
					<input onkeyup="value=value.replace(/[^\d+(\.\d+)?]/g,'')" type="number" name="sort" id="sort" value="0" class="input-common">
					<p class="help-block input-error" id="sortPrompt">排序不可为空</p>
				</div>
			</div>
		</div>
	</div>
	<div class="modal-footer">
		<button class="btn-common" id="addBtn" onclick="save()">保存</button>
		<button class="btn" onclick="closeAddGoodsCategory()">关闭</button>
	</div>
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
<input type="hidden" id="page_count" class="">
<input type="hidden" id="page_size" class="">

		</div>
		
	</section>
	
</template>

<script>
require("@/assets/style/table.scss");

export default {
  name: "categroyList",
  components: {}
};
</script>