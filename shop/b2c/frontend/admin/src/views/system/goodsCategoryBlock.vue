<template>
	
	<section class="ns-base-section">
		
		
		
		<div style="position:relative;margin:0;">
			<!-- 面包屑导航 -->
						<div class="breadcrumb-nav">
				<a href="index.html">大鵬系統</a>
									<i class="fa fa-angle-right"></i>
					<a href="/config/usernotice.html">网站</a>
									<i class="fa fa-angle-right"></i>
					<!-- 需要加跳转链接用这个：http://showfx.niuteam.cn/admin/system/goodscategoryblock -->
					<a href="javascript:;" style="color:#999;">商品楼层</a>
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
									<p>相关教程：<a href="http://bbs.niushop.com.cn/forum.php?mod=viewthread&amp;tid=2372&amp;extra=page%3D1" target="_blank">http://bbs.niushop.com.cn/forum.php?mod=viewthread&amp;tid=2372&amp;extra=page%3D1</a></p>
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
<!-- 						<span>相关教程：<a href="http://bbs.niushop.com.cn/forum.php?mod=viewthread&tid=2372&extra=page%3D1" target="_blank">http://bbs.niushop.com.cn/forum.php?mod=viewthread&tid=2372&extra=page%3D1</a></span> -->
<!-- 						 -->
<!-- 					{1/block} -->
				</h4>
			</div>
		</div>
		
		
		<div class="ns-main">
			
<div class="space-10"></div>
<div class="mod-table">
	<div class="mod-table-head">
		<div class="con style0list">
				<table class="table-class">
					<colgroup>
						<col style="width: 2%;">
						<col style="width: 25%;">
						<col style="width: 10%;">
						<col style="width: 10%;">
						<col style="width: 10%;">
						<col style="width: 5%;">
						<col style="width: 7%;">
						<col style="width: 7%;">
						<col style="width: 10%;">
						<col style="width: 4%;">
						<col style="width: 10%;">
					</colgroup>
					<thead>
						<tr>
							<th><i class="checkbox-common"><input type="checkbox" onclick="CheckAll(this)"></i></th>
							<th class="tal" align="left">分类名称</th>
							
							<th class="tal">别名</th>
							<th class="tal">简称</th>
							<th class="tal">商品排序</th>
							<th class="tal">颜色</th>
							<th class="tal">是否显示</th>
							<th class="tal">品牌显示</th>
							<th class="tal">下级分类显示</th>
							<th class="tal">排序</th>
							<th class="tal">广告图</th>
						</tr>
					</thead>
					<tbody id="list"><tr><td><i class="checkbox-common"><input type="checkbox" name="sub" value="3"></i></td><td class="tal" align="left">家用电器</td><td class="tal category_alias3"><input type="text" class="category_alias input-common middle" value="家用电器" onchange="setGoodsCategoryField(this, 3);"></td><td class="tal short_name3"><input type="text" class="short_name input-common harf" value="" onchange="setGoodsCategoryField(this, 3);" maxlength="4"></td><td class="tal"><select class="floor_goods_sort_type select-common harf" onchange="setGoodsCategoryField(this, 3);"><option value="0" selected="">默认排序</option><option value="1">按发布时间排序</option><option value="2">按销量排序</option><option value="3">按排序号排序</option><option value="4">按人气排序</option></select></td><td class="tal"><input type="color" class="input-common-color color" onchange="setGoodsCategoryField(this, 3);" value="#ff564e"></td><td class="tal"><label style="margin-bottom:0;margin-top: 5px;"><input type="checkbox" class="is_show" onchange="setGoodsCategoryField(this, 3)" checked=""><i></i><span>是</span></label></td><td class="tal"><label style="margin-bottom:0;margin-top: 5px;"><input type="checkbox" class="is_show_brand input-common" onchange="setGoodsCategoryField(this, 3);" checked=""><i></i><span>是</span></label></td><td class="tal"><label style="margin-bottom:0;margin-top: 5px;"><input type="checkbox" class="is_show_lower_category" onchange="setGoodsCategoryField(this, 3);"><i></i><span>否</span></label></td><td class="tal"><input type="number" style="text-align:center;" class="sort input-common input-common-sort" onchange="setGoodsCategoryField(this, 3);" value="0"></td><td class="tal"><a href="javascript:void(0)" onclick="addgoodsAd(3);">添加广告</a></td></tr><tr><td><i class="checkbox-common"><input type="checkbox" name="sub" value="4"></i></td><td class="tal" align="left">手机/运营商/数码</td><td class="tal category_alias4"><input type="text" class="category_alias input-common middle" value="手机/运营商/数码" onchange="setGoodsCategoryField(this, 4);"></td><td class="tal short_name4"><input type="text" class="short_name input-common harf" value="" onchange="setGoodsCategoryField(this, 4);" maxlength="4"></td><td class="tal"><select class="floor_goods_sort_type select-common harf" onchange="setGoodsCategoryField(this, 4);"><option value="0" selected="">默认排序</option><option value="1">按发布时间排序</option><option value="2">按销量排序</option><option value="3">按排序号排序</option><option value="4">按人气排序</option></select></td><td class="tal"><input type="color" class="input-common-color color" onchange="setGoodsCategoryField(this, 4);" value="#FFFFFF"></td><td class="tal"><label style="margin-bottom:0;margin-top: 5px;"><input type="checkbox" class="is_show" onchange="setGoodsCategoryField(this, 4)" checked=""><i></i><span>是</span></label></td><td class="tal"><label style="margin-bottom:0;margin-top: 5px;"><input type="checkbox" class="is_show_brand input-common" onchange="setGoodsCategoryField(this, 4);"><i></i><span>否</span></label></td><td class="tal"><label style="margin-bottom:0;margin-top: 5px;"><input type="checkbox" class="is_show_lower_category" onchange="setGoodsCategoryField(this, 4);"><i></i><span>否</span></label></td><td class="tal"><input type="number" style="text-align:center;" class="sort input-common input-common-sort" onchange="setGoodsCategoryField(this, 4);" value="0"></td><td class="tal"><a href="javascript:void(0)" onclick="addgoodsAd(4);">添加广告</a></td></tr><tr><td><i class="checkbox-common"><input type="checkbox" name="sub" value="5"></i></td><td class="tal" align="left">电脑/办公</td><td class="tal category_alias5"><input type="text" class="category_alias input-common middle" value="电脑/办公" onchange="setGoodsCategoryField(this, 5);"></td><td class="tal short_name5"><input type="text" class="short_name input-common harf" value="" onchange="setGoodsCategoryField(this, 5);" maxlength="4"></td><td class="tal"><select class="floor_goods_sort_type select-common harf" onchange="setGoodsCategoryField(this, 5);"><option value="0" selected="">默认排序</option><option value="1">按发布时间排序</option><option value="2">按销量排序</option><option value="3">按排序号排序</option><option value="4">按人气排序</option></select></td><td class="tal"><input type="color" class="input-common-color color" onchange="setGoodsCategoryField(this, 5);" value="#FFFFFF"></td><td class="tal"><label style="margin-bottom:0;margin-top: 5px;"><input type="checkbox" class="is_show" onchange="setGoodsCategoryField(this, 5)" checked=""><i></i><span>是</span></label></td><td class="tal"><label style="margin-bottom:0;margin-top: 5px;"><input type="checkbox" class="is_show_brand input-common" onchange="setGoodsCategoryField(this, 5);"><i></i><span>否</span></label></td><td class="tal"><label style="margin-bottom:0;margin-top: 5px;"><input type="checkbox" class="is_show_lower_category" onchange="setGoodsCategoryField(this, 5);"><i></i><span>否</span></label></td><td class="tal"><input type="number" style="text-align:center;" class="sort input-common input-common-sort" onchange="setGoodsCategoryField(this, 5);" value="0"></td><td class="tal"><a href="javascript:void(0)" onclick="addgoodsAd(5);">添加广告</a></td></tr><tr><td><i class="checkbox-common"><input type="checkbox" name="sub" value="6"></i></td><td class="tal" align="left">家居/家具/家装/厨具</td><td class="tal category_alias6"><input type="text" class="category_alias input-common middle" value="家居/家具/家装/厨具" onchange="setGoodsCategoryField(this, 6);"></td><td class="tal short_name6"><input type="text" class="short_name input-common harf" value="" onchange="setGoodsCategoryField(this, 6);" maxlength="4"></td><td class="tal"><select class="floor_goods_sort_type select-common harf" onchange="setGoodsCategoryField(this, 6);"><option value="0" selected="">默认排序</option><option value="1">按发布时间排序</option><option value="2">按销量排序</option><option value="3">按排序号排序</option><option value="4">按人气排序</option></select></td><td class="tal"><input type="color" class="input-common-color color" onchange="setGoodsCategoryField(this, 6);" value="#FFFFFF"></td><td class="tal"><label style="margin-bottom:0;margin-top: 5px;"><input type="checkbox" class="is_show" onchange="setGoodsCategoryField(this, 6)" checked=""><i></i><span>是</span></label></td><td class="tal"><label style="margin-bottom:0;margin-top: 5px;"><input type="checkbox" class="is_show_brand input-common" onchange="setGoodsCategoryField(this, 6);"><i></i><span>否</span></label></td><td class="tal"><label style="margin-bottom:0;margin-top: 5px;"><input type="checkbox" class="is_show_lower_category" onchange="setGoodsCategoryField(this, 6);"><i></i><span>否</span></label></td><td class="tal"><input type="number" style="text-align:center;" class="sort input-common input-common-sort" onchange="setGoodsCategoryField(this, 6);" value="0"></td><td class="tal"><a href="javascript:void(0)" onclick="addgoodsAd(6);">添加广告</a></td></tr><tr><td><i class="checkbox-common"><input type="checkbox" name="sub" value="7"></i></td><td class="tal" align="left">男装/女装/童装/内衣</td><td class="tal category_alias7"><input type="text" class="category_alias input-common middle" value="男装/女装/童装/内衣" onchange="setGoodsCategoryField(this, 7);"></td><td class="tal short_name7"><input type="text" class="short_name input-common harf" value="" onchange="setGoodsCategoryField(this, 7);" maxlength="4"></td><td class="tal"><select class="floor_goods_sort_type select-common harf" onchange="setGoodsCategoryField(this, 7);"><option value="0" selected="">默认排序</option><option value="1">按发布时间排序</option><option value="2">按销量排序</option><option value="3">按排序号排序</option><option value="4">按人气排序</option></select></td><td class="tal"><input type="color" class="input-common-color color" onchange="setGoodsCategoryField(this, 7);" value="#FFFFFF"></td><td class="tal"><label style="margin-bottom:0;margin-top: 5px;"><input type="checkbox" class="is_show" onchange="setGoodsCategoryField(this, 7)" checked=""><i></i><span>是</span></label></td><td class="tal"><label style="margin-bottom:0;margin-top: 5px;"><input type="checkbox" class="is_show_brand input-common" onchange="setGoodsCategoryField(this, 7);"><i></i><span>否</span></label></td><td class="tal"><label style="margin-bottom:0;margin-top: 5px;"><input type="checkbox" class="is_show_lower_category" onchange="setGoodsCategoryField(this, 7);"><i></i><span>否</span></label></td><td class="tal"><input type="number" style="text-align:center;" class="sort input-common input-common-sort" onchange="setGoodsCategoryField(this, 7);" value="0"></td><td class="tal"><a href="javascript:void(0)" onclick="addgoodsAd(7);">添加广告</a></td></tr><tr><td><i class="checkbox-common"><input type="checkbox" name="sub" value="8"></i></td><td class="tal" align="left">美妆个护/宠物</td><td class="tal category_alias8"><input type="text" class="category_alias input-common middle" value="美妆个护/宠物" onchange="setGoodsCategoryField(this, 8);"></td><td class="tal short_name8"><input type="text" class="short_name input-common harf" value="" onchange="setGoodsCategoryField(this, 8);" maxlength="4"></td><td class="tal"><select class="floor_goods_sort_type select-common harf" onchange="setGoodsCategoryField(this, 8);"><option value="0" selected="">默认排序</option><option value="1">按发布时间排序</option><option value="2">按销量排序</option><option value="3">按排序号排序</option><option value="4">按人气排序</option></select></td><td class="tal"><input type="color" class="input-common-color color" onchange="setGoodsCategoryField(this, 8);" value="#FFFFFF"></td><td class="tal"><label style="margin-bottom:0;margin-top: 5px;"><input type="checkbox" class="is_show" onchange="setGoodsCategoryField(this, 8)" checked=""><i></i><span>是</span></label></td><td class="tal"><label style="margin-bottom:0;margin-top: 5px;"><input type="checkbox" class="is_show_brand input-common" onchange="setGoodsCategoryField(this, 8);"><i></i><span>否</span></label></td><td class="tal"><label style="margin-bottom:0;margin-top: 5px;"><input type="checkbox" class="is_show_lower_category" onchange="setGoodsCategoryField(this, 8);"><i></i><span>否</span></label></td><td class="tal"><input type="number" style="text-align:center;" class="sort input-common input-common-sort" onchange="setGoodsCategoryField(this, 8);" value="0"></td><td class="tal"><a href="javascript:void(0)" onclick="addgoodsAd(8);">添加广告</a></td></tr><tr><td><i class="checkbox-common"><input type="checkbox" name="sub" value="9"></i></td><td class="tal" align="left">女鞋/箱包/钟表/珠宝</td><td class="tal category_alias9"><input type="text" class="category_alias input-common middle" value="女鞋/箱包/钟表/珠宝" onchange="setGoodsCategoryField(this, 9);"></td><td class="tal short_name9"><input type="text" class="short_name input-common harf" value="" onchange="setGoodsCategoryField(this, 9);" maxlength="4"></td><td class="tal"><select class="floor_goods_sort_type select-common harf" onchange="setGoodsCategoryField(this, 9);"><option value="0" selected="">默认排序</option><option value="1">按发布时间排序</option><option value="2">按销量排序</option><option value="3">按排序号排序</option><option value="4">按人气排序</option></select></td><td class="tal"><input type="color" class="input-common-color color" onchange="setGoodsCategoryField(this, 9);" value="#FFFFFF"></td><td class="tal"><label style="margin-bottom:0;margin-top: 5px;"><input type="checkbox" class="is_show" onchange="setGoodsCategoryField(this, 9)" checked=""><i></i><span>是</span></label></td><td class="tal"><label style="margin-bottom:0;margin-top: 5px;"><input type="checkbox" class="is_show_brand input-common" onchange="setGoodsCategoryField(this, 9);"><i></i><span>否</span></label></td><td class="tal"><label style="margin-bottom:0;margin-top: 5px;"><input type="checkbox" class="is_show_lower_category" onchange="setGoodsCategoryField(this, 9);"><i></i><span>否</span></label></td><td class="tal"><input type="number" style="text-align:center;" class="sort input-common input-common-sort" onchange="setGoodsCategoryField(this, 9);" value="0"></td><td class="tal"><a href="javascript:void(0)" onclick="addgoodsAd(9);">添加广告</a></td></tr><tr><td><i class="checkbox-common"><input type="checkbox" name="sub" value="10"></i></td><td class="tal" align="left">男鞋/运动/户外</td><td class="tal category_alias10"><input type="text" class="category_alias input-common middle" value="男鞋/运动/户外" onchange="setGoodsCategoryField(this, 10);"></td><td class="tal short_name10"><input type="text" class="short_name input-common harf" value="" onchange="setGoodsCategoryField(this, 10);" maxlength="4"></td><td class="tal"><select class="floor_goods_sort_type select-common harf" onchange="setGoodsCategoryField(this, 10);"><option value="0" selected="">默认排序</option><option value="1">按发布时间排序</option><option value="2">按销量排序</option><option value="3">按排序号排序</option><option value="4">按人气排序</option></select></td><td class="tal"><input type="color" class="input-common-color color" onchange="setGoodsCategoryField(this, 10);" value="#FFFFFF"></td><td class="tal"><label style="margin-bottom:0;margin-top: 5px;"><input type="checkbox" class="is_show" onchange="setGoodsCategoryField(this, 10)" checked=""><i></i><span>是</span></label></td><td class="tal"><label style="margin-bottom:0;margin-top: 5px;"><input type="checkbox" class="is_show_brand input-common" onchange="setGoodsCategoryField(this, 10);"><i></i><span>否</span></label></td><td class="tal"><label style="margin-bottom:0;margin-top: 5px;"><input type="checkbox" class="is_show_lower_category" onchange="setGoodsCategoryField(this, 10);"><i></i><span>否</span></label></td><td class="tal"><input type="number" style="text-align:center;" class="sort input-common input-common-sort" onchange="setGoodsCategoryField(this, 10);" value="0"></td><td class="tal"><a href="javascript:void(0)" onclick="addgoodsAd(10);">添加广告</a></td></tr><tr><td><i class="checkbox-common"><input type="checkbox" name="sub" value="11"></i></td><td class="tal" align="left">汽车/汽车用品</td><td class="tal category_alias11"><input type="text" class="category_alias input-common middle" value="汽车/汽车用品" onchange="setGoodsCategoryField(this, 11);"></td><td class="tal short_name11"><input type="text" class="short_name input-common harf" value="" onchange="setGoodsCategoryField(this, 11);" maxlength="4"></td><td class="tal"><select class="floor_goods_sort_type select-common harf" onchange="setGoodsCategoryField(this, 11);"><option value="0" selected="">默认排序</option><option value="1">按发布时间排序</option><option value="2">按销量排序</option><option value="3">按排序号排序</option><option value="4">按人气排序</option></select></td><td class="tal"><input type="color" class="input-common-color color" onchange="setGoodsCategoryField(this, 11);" value="#FFFFFF"></td><td class="tal"><label style="margin-bottom:0;margin-top: 5px;"><input type="checkbox" class="is_show" onchange="setGoodsCategoryField(this, 11)" checked=""><i></i><span>是</span></label></td><td class="tal"><label style="margin-bottom:0;margin-top: 5px;"><input type="checkbox" class="is_show_brand input-common" onchange="setGoodsCategoryField(this, 11);"><i></i><span>否</span></label></td><td class="tal"><label style="margin-bottom:0;margin-top: 5px;"><input type="checkbox" class="is_show_lower_category" onchange="setGoodsCategoryField(this, 11);"><i></i><span>否</span></label></td><td class="tal"><input type="number" style="text-align:center;" class="sort input-common input-common-sort" onchange="setGoodsCategoryField(this, 11);" value="0"></td><td class="tal"><a href="javascript:void(0)" onclick="addgoodsAd(11);">添加广告</a></td></tr><tr><td><i class="checkbox-common"><input type="checkbox" name="sub" value="12"></i></td><td class="tal" align="left">母婴/玩具用品</td><td class="tal category_alias12"><input type="text" class="category_alias input-common middle" value="母婴/玩具用品" onchange="setGoodsCategoryField(this, 12);"></td><td class="tal short_name12"><input type="text" class="short_name input-common harf" value="" onchange="setGoodsCategoryField(this, 12);" maxlength="4"></td><td class="tal"><select class="floor_goods_sort_type select-common harf" onchange="setGoodsCategoryField(this, 12);"><option value="0" selected="">默认排序</option><option value="1">按发布时间排序</option><option value="2">按销量排序</option><option value="3">按排序号排序</option><option value="4">按人气排序</option></select></td><td class="tal"><input type="color" class="input-common-color color" onchange="setGoodsCategoryField(this, 12);" value="#FFFFFF"></td><td class="tal"><label style="margin-bottom:0;margin-top: 5px;"><input type="checkbox" class="is_show" onchange="setGoodsCategoryField(this, 12)" checked=""><i></i><span>是</span></label></td><td class="tal"><label style="margin-bottom:0;margin-top: 5px;"><input type="checkbox" class="is_show_brand input-common" onchange="setGoodsCategoryField(this, 12);"><i></i><span>否</span></label></td><td class="tal"><label style="margin-bottom:0;margin-top: 5px;"><input type="checkbox" class="is_show_lower_category" onchange="setGoodsCategoryField(this, 12);"><i></i><span>否</span></label></td><td class="tal"><input type="number" style="text-align:center;" class="sort input-common input-common-sort" onchange="setGoodsCategoryField(this, 12);" value="0"></td><td class="tal"><a href="javascript:void(0)" onclick="addgoodsAd(12);">添加广告</a></td></tr><tr><td><i class="checkbox-common"><input type="checkbox" name="sub" value="13"></i></td><td class="tal" align="left">食品/酒类/生鲜/特产</td><td class="tal category_alias13"><input type="text" class="category_alias input-common middle" value="食品/酒类/生鲜/特产" onchange="setGoodsCategoryField(this, 13);"></td><td class="tal short_name13"><input type="text" class="short_name input-common harf" value="食品/酒" onchange="setGoodsCategoryField(this, 13);" maxlength="4"></td><td class="tal"><select class="floor_goods_sort_type select-common harf" onchange="setGoodsCategoryField(this, 13);"><option value="0" selected="">默认排序</option><option value="1">按发布时间排序</option><option value="2">按销量排序</option><option value="3">按排序号排序</option><option value="4">按人气排序</option></select></td><td class="tal"><input type="color" class="input-common-color color" onchange="setGoodsCategoryField(this, 13);" value="#FFFFFF"></td><td class="tal"><label style="margin-bottom:0;margin-top: 5px;"><input type="checkbox" class="is_show" onchange="setGoodsCategoryField(this, 13)" checked=""><i></i><span>是</span></label></td><td class="tal"><label style="margin-bottom:0;margin-top: 5px;"><input type="checkbox" class="is_show_brand input-common" onchange="setGoodsCategoryField(this, 13);"><i></i><span>否</span></label></td><td class="tal"><label style="margin-bottom:0;margin-top: 5px;"><input type="checkbox" class="is_show_lower_category" onchange="setGoodsCategoryField(this, 13);"><i></i><span>否</span></label></td><td class="tal"><input type="number" style="text-align:center;" class="sort input-common input-common-sort" onchange="setGoodsCategoryField(this, 13);" value="0"></td><td class="tal"><a href="javascript:void(0)" onclick="addgoodsAd(13);">添加广告</a></td></tr><tr><td><i class="checkbox-common"><input type="checkbox" name="sub" value="14"></i></td><td class="tal" align="left">礼品鲜花/农资绿植</td><td class="tal category_alias14"><input type="text" class="category_alias input-common middle" value="礼品鲜花/农资绿植" onchange="setGoodsCategoryField(this, 14);"></td><td class="tal short_name14"><input type="text" class="short_name input-common harf" value="礼品鲜花" onchange="setGoodsCategoryField(this, 14);" maxlength="4"></td><td class="tal"><select class="floor_goods_sort_type select-common harf" onchange="setGoodsCategoryField(this, 14);"><option value="0" selected="">默认排序</option><option value="1">按发布时间排序</option><option value="2">按销量排序</option><option value="3">按排序号排序</option><option value="4">按人气排序</option></select></td><td class="tal"><input type="color" class="input-common-color color" onchange="setGoodsCategoryField(this, 14);" value="#FFFFFF"></td><td class="tal"><label style="margin-bottom:0;margin-top: 5px;"><input type="checkbox" class="is_show" onchange="setGoodsCategoryField(this, 14)" checked=""><i></i><span>是</span></label></td><td class="tal"><label style="margin-bottom:0;margin-top: 5px;"><input type="checkbox" class="is_show_brand input-common" onchange="setGoodsCategoryField(this, 14);"><i></i><span>否</span></label></td><td class="tal"><label style="margin-bottom:0;margin-top: 5px;"><input type="checkbox" class="is_show_lower_category" onchange="setGoodsCategoryField(this, 14);"><i></i><span>否</span></label></td><td class="tal"><input type="number" style="text-align:center;" class="sort input-common input-common-sort" onchange="setGoodsCategoryField(this, 14);" value="0"></td><td class="tal"><a href="javascript:void(0)" onclick="addgoodsAd(14);">添加广告</a></td></tr></tbody>
				</table>
		</div>
		<input type="hidden" id="ap_id" value="">
	</div>
</div>
<!-- 广告添加  -->
<div class="modal fade hide" id="add_adv" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
	<div class="modal-dialog">
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
				<h3 class="modal-title" id="myModalLabel">广告添加</h3>
			</div>
			<div class="modal-body">
				<div class="set-style">
					<dl>
						<dt>主标题：</dt>
						<dd>
							<p><input id="title" type="text" value="" class="input-common"> </p>
							<p class="error">请输入标题</p>
						</dd>
					</dl>
					<dl>
						<dt>副标题：</dt>
						<dd>
							<p><input id="subtitle" type="text" value="" class="input-common"> </p>
							<p class="error">请输入副标题</p>
						</dd>
					</dl>
					<dl>
						<dt>图片：</dt>
						<dd>
							<div class="upload-btn-common">
								<div>
									<input class="input-file" name="file_upload" id="uploadAdv" type="file" onchange="imgUpload(this);" title="上传">
									<input type="hidden" id="adv" value="">
								</div>
								
								<input type="text" id="text_adv" class="input-common" readonly="readonly" value="">
								<em>上传</em>
								<img id="preview_adv" src="/public/static/blue/img/upload-common-select.png" data-src="" data-html="true" data-container="body" data-placement="top" data-trigger="manual" data-original-title="" title="">
							</div>
						</dd>
					</dl>
					<dl>
						<dt>背景色：</dt>
						<dd>
							<input id="background" type="color" value="#000000" class="input-common-color">
						</dd>
					</dl>
					<dl>
						<dt>链接地址：</dt>
						<dd>
							<p><input id="url" type="text" value="" class="input-common"> </p>
							<p class="error">请输入链接地址</p>
						</dd>
					</dl>
				</div>	
				<input type="hidden" id="id" value="">
			</div>
			<div class="modal-footer">
				<button type="button" class="btn-common btn-big" onclick="addGoodsAdv();">保存</button>
				<button type="button" class="btn btn-big" data-dismiss="modal">关闭</button>
			</div>
		</div>
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
<input type="hidden" id="page_count">
<input type="hidden" id="page_size">
		</div>
		
	</section>
</template>
