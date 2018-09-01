<template>
    
	<section class="ns-base-section">
		
		
		
		<div style="position:relative;margin:0;">
			<!-- 面包屑导航 -->
						<div class="breadcrumb-nav">
				<a href="http://b2c.niuteam.cn/admin.html">单商户B2C</a>
									<i class="fa fa-angle-right"></i>
					<a href="http://b2c.niuteam.cn/admin/goods/goodslist.html">商品</a>
									<i class="fa fa-angle-right"></i>
					<!-- 需要加跳转链接用这个：http://b2c.niuteam.cn/admin/goods/goodsspeclist -->
					<a href="javascript:;" style="color:#999;">商品规格</a>
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
									<p>相关教程：<a href="http://bbs.niushop.com.cn/forum.php?mod=viewthread&amp;tid=2306&amp;extra=page%3D3" target="_blank">http://bbs.niushop.com.cn/forum.php?mod=viewthread&amp;tid=2306&amp;extra=page%3D3</a></p>
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
<!-- 						<span>相关教程：<a href="http://bbs.niushop.com.cn/forum.php?mod=viewthread&tid=2306&extra=page%3D3" target="_blank">http://bbs.niushop.com.cn/forum.php?mod=viewthread&tid=2306&extra=page%3D3</a></span> -->
<!-- 						 -->
<!-- 					{1/block} -->
				</h4>
			</div>
		</div>
		
		
		<div class="ns-main">
			
<div class="options-btn">
	<button class="btn-common-delete btn-small" onclick="batchDelete()">批量删除</button>
	<button class="btn-common btn-small" onclick="addGoodsSpec()">添加规格</button>
</div>
<table class="table-class">
	<colgroup>
		<col style="width: 2%;">
		<col style="width: 20%;">
		<col style="width: 52%;">
		<col style="width: 4%;">
		<col style="width: 10%;">
		<col style="width: 4%;">
		<col style="width: 10%;">
	</colgroup>
	<thead>
		<tr class="headtitle">
			<th><i class="checkbox-common"><input type="checkbox" onclick="CheckAll(this)"></i></th>
			<th align="left">规格名称</th>
			<th align="left">规格属性</th>
			<th>启用</th>
			<th>是否参与筛选</th>
			<th>排序</th>
			<th>操作</th>
		</tr>
	</thead>
	<tbody><tr align="center"><td><i class="checkbox-common"><input name="sub" type="checkbox" value="42"></i></td><td align="left">规格1</td><td style="overflow:hidden; text-overflow: ellipsis;text-align: left;">1,2,3,4,5</td><td><a href="javascript:;" class="is_visible" id="isvisible_42" is_visible="0" onclick="setGoodsSpecField(42, 'is_visible' , this)"><img src="/public/admin/images/checked.png" alt="" width="15"></a></td><td><a href="javascript:;" class="is_visible" id="isscreen_42" is_screen="0" onclick="setGoodsSpecField(42, 'is_screen' , this)"><img src="/public/admin/images/checked.png" alt="" width="15"></a></td><td><input type="number" id="sort" class="input-common input-common-sort" value="0" onchange="setGoodsSpecField(42, 'sort', this);"></td><td><a href="http://b2c.niuteam.cn/admin/goods/updategoodsspec?spec_id=42">修改</a>  <a href="javascript:delSpec(42)">删除</a></td> </tr><tr align="center"><td><i class="checkbox-common"><input name="sub" type="checkbox" value="34"></i></td><td align="left">运行内存</td><td style="overflow:hidden; text-overflow: ellipsis;text-align: left;">1G,2G,3G,4G,5G,6G,8G</td><td><a href="javascript:;" class="is_visible" id="isvisible_34" is_visible="0" onclick="setGoodsSpecField(34, 'is_visible' , this)"><img src="/public/admin/images/checked.png" alt="" width="15"></a></td><td><a href="javascript:;" class="is_visible" id="isscreen_34" is_screen="0" onclick="setGoodsSpecField(34, 'is_screen' , this)"><img src="/public/admin/images/checked.png" alt="" width="15"></a></td><td><input type="number" id="sort" class="input-common input-common-sort" value="0" onchange="setGoodsSpecField(34, 'sort', this);"></td><td><a href="http://b2c.niuteam.cn/admin/goods/updategoodsspec?spec_id=34">修改</a>  <a href="javascript:delSpec(34)">删除</a></td> </tr><tr align="center"><td><i class="checkbox-common"><input name="sub" type="checkbox" value="41"></i></td><td align="left">主屏分辨率</td><td style="overflow:hidden; text-overflow: ellipsis;text-align: left;">720×1200,940x540像素,480×854像素,1280×720像素,960×540像素,480×800像素,176×220像素,128×160像素,240×320像素,320×480像素</td><td><a href="javascript:;" class="is_visible" id="isvisible_41" is_visible="0" onclick="setGoodsSpecField(41, 'is_visible' , this)"><img src="/public/admin/images/checked.png" alt="" width="15"></a></td><td><a href="javascript:;" class="is_visible" id="isscreen_41" is_screen="0" onclick="setGoodsSpecField(41, 'is_screen' , this)"><img src="/public/admin/images/checked.png" alt="" width="15"></a></td><td><input type="number" id="sort" class="input-common input-common-sort" value="1" onchange="setGoodsSpecField(41, 'sort', this);"></td><td><a href="http://b2c.niuteam.cn/admin/goods/updategoodsspec?spec_id=41">修改</a>  <a href="javascript:delSpec(41)">删除</a></td> </tr><tr align="center"><td><i class="checkbox-common"><input name="sub" type="checkbox" value="40"></i></td><td align="left">屏幕色彩</td><td style="overflow:hidden; text-overflow: ellipsis;text-align: left;">1600万色,26万色,65536色</td><td><a href="javascript:;" class="is_visible" id="isvisible_40" is_visible="0" onclick="setGoodsSpecField(40, 'is_visible' , this)"><img src="/public/admin/images/checked.png" alt="" width="15"></a></td><td><a href="javascript:;" class="is_visible" id="isscreen_40" is_screen="0" onclick="setGoodsSpecField(40, 'is_screen' , this)"><img src="/public/admin/images/checked.png" alt="" width="15"></a></td><td><input type="number" id="sort" class="input-common input-common-sort" value="1" onchange="setGoodsSpecField(40, 'sort', this);"></td><td><a href="http://b2c.niuteam.cn/admin/goods/updategoodsspec?spec_id=40">修改</a>  <a href="javascript:delSpec(40)">删除</a></td> </tr><tr align="center"><td><i class="checkbox-common"><input name="sub" type="checkbox" value="39"></i></td><td align="left">尺码</td><td style="overflow:hidden; text-overflow: ellipsis;text-align: left;">M,L,XL</td><td><a href="javascript:;" class="is_visible" id="isvisible_39" is_visible="0" onclick="setGoodsSpecField(39, 'is_visible' , this)"><img src="/public/admin/images/checked.png" alt="" width="15"></a></td><td><a href="javascript:;" class="is_visible" id="isscreen_39" is_screen="0" onclick="setGoodsSpecField(39, 'is_screen' , this)"><img src="/public/admin/images/checked.png" alt="" width="15"></a></td><td><input type="number" id="sort" class="input-common input-common-sort" value="1" onchange="setGoodsSpecField(39, 'sort', this);"></td><td><a href="http://b2c.niuteam.cn/admin/goods/updategoodsspec?spec_id=39">修改</a>  <a href="javascript:delSpec(39)">删除</a></td> </tr><tr align="center"><td><i class="checkbox-common"><input name="sub" type="checkbox" value="38"></i></td><td align="left">颜色</td><td style="overflow:hidden; text-overflow: ellipsis;text-align: left;">白色,黑色</td><td><a href="javascript:;" class="is_visible" id="isvisible_38" is_visible="0" onclick="setGoodsSpecField(38, 'is_visible' , this)"><img src="/public/admin/images/checked.png" alt="" width="15"></a></td><td><a href="javascript:;" class="is_visible" id="isscreen_38" is_screen="0" onclick="setGoodsSpecField(38, 'is_screen' , this)"><img src="/public/admin/images/checked.png" alt="" width="15"></a></td><td><input type="number" id="sort" class="input-common input-common-sort" value="1" onchange="setGoodsSpecField(38, 'sort', this);"></td><td><a href="http://b2c.niuteam.cn/admin/goods/updategoodsspec?spec_id=38">修改</a>  <a href="javascript:delSpec(38)">删除</a></td> </tr><tr align="center"><td><i class="checkbox-common"><input name="sub" type="checkbox" value="26"></i></td><td align="left">存储内存</td><td style="overflow:hidden; text-overflow: ellipsis;text-align: left;">8G,17G,32G,64G</td><td><a href="javascript:;" class="is_visible" id="isvisible_26" is_visible="0" onclick="setGoodsSpecField(26, 'is_visible' , this)"><img src="/public/admin/images/checked.png" alt="" width="15"></a></td><td><a href="javascript:;" class="is_visible" id="isscreen_26" is_screen="0" onclick="setGoodsSpecField(26, 'is_screen' , this)"><img src="/public/admin/images/checked.png" alt="" width="15"></a></td><td><input type="number" id="sort" class="input-common input-common-sort" value="2" onchange="setGoodsSpecField(26, 'sort', this);"></td><td><a href="http://b2c.niuteam.cn/admin/goods/updategoodsspec?spec_id=26">修改</a>  <a href="javascript:delSpec(26)">删除</a></td> </tr><tr align="center"><td><i class="checkbox-common"><input name="sub" type="checkbox" value="17"></i></td><td align="left">颜色</td><td style="overflow:hidden; text-overflow: ellipsis;text-align: left;">蓝色,黑色,红色,白色,土豪金</td><td><a href="javascript:;" class="is_visible" id="isvisible_17" is_visible="0" onclick="setGoodsSpecField(17, 'is_visible' , this)"><img src="/public/admin/images/checked.png" alt="" width="15"></a></td><td><a href="javascript:;" class="is_visible" id="isscreen_17" is_screen="0" onclick="setGoodsSpecField(17, 'is_screen' , this)"><img src="/public/admin/images/checked.png" alt="" width="15"></a></td><td><input type="number" id="sort" class="input-common input-common-sort" value="3" onchange="setGoodsSpecField(17, 'sort', this);"></td><td><a href="http://b2c.niuteam.cn/admin/goods/updategoodsspec?spec_id=17">修改</a>  <a href="javascript:delSpec(17)">删除</a></td> </tr></tbody>
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
			<li class="total-data" data-total-count="8">共8条</li>
			<!-- <li class="page-count">共0页</li> -->
			<li class="according-number">
				跳<input type="text" class="input-medium" id="skipPage" data-curr-page="1">页
			</li>
		</ul>
	</div>
</div>
<input type="hidden" id="page_count" value="1">
<input type="hidden" id="page_size" value="8">

		</div>
		
	</section>
	
</template>
