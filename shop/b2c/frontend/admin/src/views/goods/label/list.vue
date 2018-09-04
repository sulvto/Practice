<template>
    
	<section class="ns-base-section">
		
		
		
		<div style="position:relative;margin:0;">
			<!-- 面包屑导航 -->
						<div class="breadcrumb-nav">
				<a href="http://b2c.niuteam.cn/admin.html">单商户B2C</a>
									<i class="fa fa-angle-right"></i>
					<a href="/goods/goodslist.html">商品</a>
									<i class="fa fa-angle-right"></i>
					<!-- 需要加跳转链接用这个：http://b2c.niuteam.cn/admin/goods/goodsgrouplist -->
					<a href="javascript:;" style="color:#999;">商品标签</a>
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
									<p>相关教程：<a href="http://bbs.niushop.com.cn/forum.php?mod=viewthread&amp;tid=2307&amp;extra=page%3D2" target="_blank">http://bbs.niushop.com.cn/forum.php?mod=viewthread&amp;tid=2307&amp;extra=page%3D2</a></p>
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
<!-- 						<span>相关教程：<a href="http://bbs.niushop.com.cn/forum.php?mod=viewthread&tid=2307&extra=page%3D2" target="_blank">http://bbs.niushop.com.cn/forum.php?mod=viewthread&tid=2307&extra=page%3D2</a></span> -->
<!-- 						 -->
<!-- 					{1/block} -->
				</h4>
			</div>
		</div>
		
		
		<div class="ns-main">
			
<div class="options-btn">
	<button class="btn-common-delete" onclick="batchDelete();">批量删除</button>
	<button class="btn-common btn-small" onclick="location.href='/goods/addgoodsgroup.html';">添加商品标签</button>
</div>
<table class="table-class">
	<colgroup>
		<col style="width: 2%;">
		<col style="width: 84%;">
		<col style="width: 4%;">
		<col style="width: 10%;">
	</colgroup>
	<thead>
		<tr align="center">
			<th><i class="checkbox-common"><input type="checkbox" onclick="CheckAll(this)"></i></th>
			<th align="left">标签名称</th>
			<th>排序</th>
			<th>操作</th>
		</tr>
	</thead>

	<tbody><tr class="pid_0" style="height: 30px;"><td style="text-align:center;"><i class="checkbox-common"><input name="sub" type="checkbox" value="1"></i></td><td><input type="text" fieldid="1" fieldname="group_name" value="热卖" class="input-common"></td><td style="text-align: center;"><input type="number" class="sort input-common input-common-sort" fieldid="1" fieldname="sort" value="0" size="1"></td><td style="text-align: center;"><a href="/goods/updategoodsgroup?group_id=1">修改</a>&nbsp;&nbsp;<a href="javascript:void(0);" onclick="delGroup(1)">删除</a></td></tr><tr class="pid_0" style="height: 30px;"><td style="text-align:center;"><i class="checkbox-common"><input name="sub" type="checkbox" value="3"></i></td><td><input type="text" fieldid="3" fieldname="group_name" value="新品lll" class="input-common"></td><td style="text-align: center;"><input type="number" class="sort input-common input-common-sort" fieldid="3" fieldname="sort" value="0" size="1"></td><td style="text-align: center;"><a href="/goods/updategoodsgroup?group_id=3">修改</a>&nbsp;&nbsp;<a href="javascript:void(0);" onclick="delGroup(3)">删除</a></td></tr><tr class="pid_0" style="height: 30px;"><td style="text-align:center;"><i class="checkbox-common"><input name="sub" type="checkbox" value="5"></i></td><td><input type="text" fieldid="5" fieldname="group_name" value="网红" class="input-common"></td><td style="text-align: center;"><input type="number" class="sort input-common input-common-sort" fieldid="5" fieldname="sort" value="0" size="1"></td><td style="text-align: center;"><a href="/goods/updategoodsgroup?group_id=5">修改</a>&nbsp;&nbsp;<a href="javascript:void(0);" onclick="delGroup(5)">删除</a></td></tr><tr class="pid_0" style="height: 30px;"><td style="text-align:center;"><i class="checkbox-common"><input name="sub" type="checkbox" value="2"></i></td><td><input type="text" fieldid="2" fieldname="group_name" value="活动" class="input-common"></td><td style="text-align: center;"><input type="number" class="sort input-common input-common-sort" fieldid="2" fieldname="sort" value="2" size="1"></td><td style="text-align: center;"><a href="/goods/updategoodsgroup?group_id=2">修改</a>&nbsp;&nbsp;<a href="javascript:void(0);" onclick="delGroup(2)">删除</a></td></tr><tr class="pid_0" style="height: 30px;"><td style="text-align:center;"><i class="checkbox-common"><input name="sub" type="checkbox" value="6"></i></td><td><input type="text" fieldid="6" fieldname="group_name" value="最火热" class="input-common"></td><td style="text-align: center;"><input type="number" class="sort input-common input-common-sort" fieldid="6" fieldname="sort" value="5" size="1"></td><td style="text-align: center;"><a href="/goods/updategoodsgroup?group_id=6">修改</a>&nbsp;&nbsp;<a href="javascript:void(0);" onclick="delGroup(6)">删除</a></td></tr></tbody>
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

<script>
require("@/assets/style/table.scss");

export default {
  name: "labelList",
  components: {}
};
</script>