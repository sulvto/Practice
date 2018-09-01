<template>
    
	<section class="ns-base-section">
		
		
		<div style="position:relative;margin:0;">
			<!-- 面包屑导航 -->
						<div class="breadcrumb-nav">
				<a href="http://b2c.niuteam.cn/admin.html">单商户B2C</a>
									<i class="fa fa-angle-right"></i>
					<a href="http://b2c.niuteam.cn/admin/order/orderlist.html">订单</a>
									<i class="fa fa-angle-right"></i>
					<!-- 需要加跳转链接用这个：http://b2c.niuteam.cn/admin/order/invoiceList -->
					<a href="javascript:;" style="color:#999;">发票管理</a>
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
			
<table class="mytable">
	<tbody><tr>
		<th width="100%">
			<span>下单时间：</span>
			<input type="text" id="startDate" class="input-common middle" placeholder="请选择开始日期" onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm:ss'})">
			&nbsp;-&nbsp;
			<input type="text" id="endDate" placeholder="请选择结束日期" class="input-common middle" onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm:ss'})">
			<span>订单编号：</span>
			<input type="text" id="order_no" placeholder="订单编号" class="input-common middle">
			<button class="btn-common" onclick="LoadingInfo(1)">搜索</button>
		</th>
	</tr>
</tbody></table>
<table class="table-class">
	<colgroup>
		<col style="width: 1%;">
		<col style="width: 15%;">
		<col style="width: 14%;">
		<col style="width: 12%;">
		<col style="width: 15%;">
		<col style="width: 15%;">
		<col style="width: 10%;">
		<col style="width: 10%;">
		<col style="width: 10%;">
	</colgroup>
	<thead>
		<tr>
			<th align="center">
				<!-- <i class="checkbox-common"><input type="checkbox" onclick="CheckAll(this)" id="check"></i> -->
			</th>
			<th align="left">订单编号</th>
			<th align="left">用户名</th>
			<th align="right" class="right-indent">开票金额</th>
			<th align="left">抬头</th>
			<th align="left">发票内容</th>
			<th align="left">纳税人识别号</th>
			<th align="center">创建时间</th>
			<th>操作</th>
		</tr>
	</thead>
	<tbody><tr align="center"><td></td><td align="left"><a href="http://b2c.niuteam.cn/admin/order/orderdetail?order_id=122">2018060510540001</a></td><td align="left">admin</td><td align="right" class="right-indent">20919.71</td><td align="left">423423</td><td align="left">恩都是多</td><td align="left">34423</td><td>2018-06-05 10:54:04</td><td></td></tr></tbody>
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
		
	</section>
</template>

<script>
require("@/assets/style/table.scss");
require("@/assets/style/order/list.scss");

export default {
  name: "invoiceOrder",
  components: {}
};
</script>