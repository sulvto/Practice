<template>
    
	<section class="ns-base-section">
		
		
		
		<div style="position:relative;margin:0;">
			<!-- 面包屑导航 -->
						<div class="breadcrumb-nav">
				<a href="http://b2c.niuteam.cn/admin.html">单商户B2C</a>
									<i class="fa fa-angle-right"></i>
					<a href="http://b2c.niuteam.cn/admin/goods/goodslist.html">商品</a>
									<i class="fa fa-angle-right"></i>
					<!-- 需要加跳转链接用这个：http://b2c.niuteam.cn/admin/goods/attributelist -->
					<a href="javascript:;" style="color:#999;">商品类型</a>
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
									<p>相关教程：<a href="http://bbs.niushop.com.cn/forum.php?mod=viewthread&amp;tid=2309&amp;extra=page%3D2" target="_blank">http://bbs.niushop.com.cn/forum.php?mod=viewthread&amp;tid=2309&amp;extra=page%3D2</a></p>
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
<!-- 						<span>相关教程：<a href="http://bbs.niushop.com.cn/forum.php?mod=viewthread&tid=2309&extra=page%3D2" target="_blank">http://bbs.niushop.com.cn/forum.php?mod=viewthread&tid=2309&extra=page%3D2</a></span> -->
<!-- 						 -->
<!-- 					{1/block} -->
				</h4>
			</div>
		</div>
		
		
		<div class="ns-main">
			
<div class="options-btn">
	<button class="btn-common" onclick="addAttributeService()">添加商品类型</button>
</div>
<table class="table-class">
	<colgroup>
		<col style="width: 2%;">
		<col style="width: 40%;">
		<col style="width: 40%;">
		<col style="width: 4%;">
		<col style="width: 4%;">
		<col style="width: 10%;">
	</colgroup>
	<thead>
		<tr>
			<th><i class="checkbox-common"><input type="checkbox" onclick="CheckAll(this)"></i></th>
			<th align="left">类型名称</th>
			<th align="left">属性标签</th>
			
			<th>启用</th>
			<th>排序</th>
			<th>操作</th>
		</tr>
	</thead>
	<tbody><tr align="center"><td><i class="checkbox-common"><input name="sub" type="checkbox" value="17"></i></td><td style="text-align:left;">铁皮石斛</td><td style="text-align:left;">num,sdfs </td><td><a href="javascript:;" class="is_use" id="isuse_17" is_use="0" onclick="setAttributeField(17, 'is_use', this)"><img src="/public/admin/images/checked.png" alt="" width="15"></a></td><td><input type="number" class="input-common input-common-sort" id="sort" value="0" onchange="setAttributeField(17, 'sort', this);"></td><td><a href="http://b2c.niuteam.cn/admin/goods/updategoodsattribute?attr_id=17">修改</a>  <a href="javascript:delAttr(17)">删除</a></td> </tr><tr align="center"><td><i class="checkbox-common"><input name="sub" type="checkbox" value="16"></i></td><td style="text-align:left;">美体专区</td><td style="text-align:left;">操作系统,外观设计</td><td><a href="javascript:;" class="is_use" id="isuse_16" is_use="0" onclick="setAttributeField(16, 'is_use', this)"><img src="/public/admin/images/checked.png" alt="" width="15"></a></td><td><input type="number" class="input-common input-common-sort" id="sort" value="1" onchange="setAttributeField(16, 'sort', this);"></td><td><a href="http://b2c.niuteam.cn/admin/goods/updategoodsattribute?attr_id=16">修改</a>  <a href="javascript:delAttr(16)">删除</a></td> </tr><tr align="center"><td><i class="checkbox-common"><input name="sub" type="checkbox" value="18"></i></td><td style="text-align:left;">闲逛逛</td><td style="text-align:left;">1</td><td><a href="javascript:;" class="is_use" id="isuse_18" is_use="0" onclick="setAttributeField(18, 'is_use', this)"><img src="/public/admin/images/checked.png" alt="" width="15"></a></td><td><input type="number" class="input-common input-common-sort" id="sort" value="3" onchange="setAttributeField(18, 'sort', this);"></td><td><a href="http://b2c.niuteam.cn/admin/goods/updategoodsattribute?attr_id=18">修改</a>  <a href="javascript:delAttr(18)">删除</a></td> </tr></tbody>
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
			<li class="total-data" data-total-count="3">共3条</li>
			<!-- <li class="page-count">共0页</li> -->
			<li class="according-number">
				跳<input type="text" class="input-medium" id="skipPage" data-curr-page="1">页
			</li>
		</ul>
	</div>
</div>
<input type="hidden" id="page_count" value="1">
<input type="hidden" id="page_size" value="3">

		</div>
		
	</section>
	
</template>

<script>
require("@/assets/style/table.scss");

export default {
  name: "attributeList",
  components: {}
};
</script>