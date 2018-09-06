<template>
	
	<section class="ns-base-section">
		
		
		
		<div style="position:relative;margin:0;">
			<!-- 面包屑导航 -->
						<div class="breadcrumb-nav">
				<a href="index.html">大鵬系統</a>
									<i class="fa fa-angle-right"></i>
					<a href="/promotion/coupontypelist.html">营销</a>
									<i class="fa fa-angle-right"></i>
					<!-- 需要加跳转链接用这个：http://showfx.niuteam.cn/admin/promotion/giftlist -->
					<a href="javascript:;" style="color:#999;">赠品</a>
							</div>
						<!-- 三级导航菜单 -->
			
								<nav class="ns-third-menu">
					<ul>
												<li class="selected" onclick="location.href='/Promotion/giftList.html';">赠品列表</li>
													<li onclick="location.href='/promotion/giftGrantRecordsList.html';">赠品发放记录</li>
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
		<th width="20%" style="text-align:left;"><button class="btn-common btn-small" onclick="location.href='/promotion/addgift.html';" style="margin:0 5px 0 0 !important;">添加赠品</button>
			<button class="btn-common-delete btn-small" onclick="batchDelete()" style="margin:0 5px 0 0 !important;">批量删除</button>
		</th>
		<th width="10%">
			<input type="text" id="search_text" placeholder="请输入活动名称" class="input-common">
			<input type="button" onclick="searchData()" value="搜索" class="btn-common">
		</th>
	</tr>
</tbody></table>
<table class="table-class">
	<colgroup>
	<col style="width: 2%;">
	<col style="width: 36%;">
	<col style="width: 8%;">
	<col style="width: 8%;">
	<col style="width: 8%;">
	<col style="width: 20%;">
	<col style="width: 16%;">
	</colgroup>
	<thead>
		<tr align="center">
			<th><i class="checkbox-common"><input type="checkbox" onclick="CheckAll(this)"></i></th>
			<th align="left">活动名称</th>
			<th>活动状态</th>
			<th>已赠送</th>
			<th>已领取</th>
			<th>有效时间</th>
			<th>操作</th>
		</tr>
	</thead>
	<tbody><tr align="center"><td><i class="checkbox-common disabled"><input name="sub" type="checkbox" value="5" disabled=""></i></td><td align="left">s</td><td>进行中</td><td> - </td><td> - </td><td>开始时间：2018-08-20 10:32:19<br>结束时间：2018-08-31 10:32:21</td><td><a href="/promotion/updategift?gift_id=5">编辑</a>&nbsp;<a href="javascript:void(0);" onclick="giftInfo(5)">详情</a> <br><a href="/promotion/giftGrantRecordsList?gift_id=5" )"="">发放记录</a> </td></tr><tr align="center"><td><i class="checkbox-common disabled"><input name="sub" type="checkbox" value="3" disabled=""></i></td><td align="left">eqweqe</td><td>进行中</td><td> - </td><td> - </td><td>开始时间：2018-08-09 14:20:34<br>结束时间：2018-08-29 14:20:35</td><td><a href="/promotion/updategift?gift_id=3">编辑</a>&nbsp;<a href="javascript:void(0);" onclick="giftInfo(3)">详情</a> <br><a href="/promotion/giftGrantRecordsList?gift_id=3" )"="">发放记录</a> </td></tr><tr align="center"><td><i class="checkbox-common disabled"><input name="sub" type="checkbox" value="1" disabled=""></i></td><td align="left">132</td><td>进行中</td><td> - </td><td> - </td><td>开始时间：2018-05-01 00:00:00<br>结束时间：2019-06-21 00:00:00</td><td><a href="/promotion/updategift?gift_id=1">编辑</a>&nbsp;<a href="javascript:void(0);" onclick="giftInfo(1)">详情</a> <br><a href="/promotion/giftGrantRecordsList?gift_id=1" >发放记录</a> </td></tr></tbody>
</table>

<!-- 模态框（Modal） -->
<div class="modal fade hide" id="giftInfo" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
	<div class="modal-dialog">
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
				<h3>赠品详情</h3>
			</div>
			<div class="modal-body">
				<div class="modal-infp-style">
					<table>
						<tbody><tr>
							<td>活动名称</td>
							<td id="gift_name"></td>
						</tr>
						<tr>
							<td>有效期</td>
							<td id="time"></td>
						</tr>
						<tr>
							<td>领取有效期</td>
							<td id="days"></td>
						</tr>
						<tr>
							<td>领取限制</td>
							<td id="max_num"></td>
						</tr>
						<tr>
							<td colspan="2">赠品</td>
						</tr>
						<tr id="goods_list">
							<td></td>
							<td>商品名称</td>
						</tr>
					</tbody></table>
				</div>
			</div>
			<div class="modal-footer">
				<button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
			</div>
		</div>
	</div>
</div>

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
