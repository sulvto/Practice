<template>
	
	<section class="ns-base-section">
		
		
		
		<div style="position:relative;margin:0;">
			<!-- 面包屑导航 -->
						<div class="breadcrumb-nav">
				<a href="index.html">大鵬系統</a>
									<i class="fa fa-angle-right"></i>
					<a href="/promotion/coupontypelist.html">营销</a>
									<i class="fa fa-angle-right"></i>
					<!-- 需要加跳转链接用这个：http://showfx.niuteam.cn/admin/promotion/topiclist -->
					<a href="javascript:;" style="color:#999;">专题活动</a>
							</div>
						<!-- 三级导航菜单 -->
			
								<nav class="ns-third-menu">
					<ul>
												<li class="selected" onclick="location.href='/promotion/TopicList.html';">全部</li>
													<li onclick="location.href='/promotion/TopicList.html?status=1';">进行中</li>
													<li onclick="location.href='/promotion/TopicList.html?status=3';">已关闭</li>
													<li onclick="location.href='/promotion/TopicList.html?status=4';">已结束</li>
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
		<th width="20%" style="text-align: left;">
			<button class="btn-common btn-small" onclick="location.href='/promotion/addTopic.html';" style="margin:0 5px 0 0 !important;">添加专题活动</button>
			<button class="btn-common-delete btn-small" onclick="batchDelete()" style="margin:0 5px 0 0 !important;">批量删除</button>
		</th>
		<th width="10%">
			<input type="text" id="search_text" placeholder="请输入专题活动名称" class="input-common">
			<input type="button" onclick="searchData()" value="搜索" class="btn-common">
		</th>
	</tr>
</tbody></table>
<table class="table-class">
	<colgroup>
	<col style="width: 2%;">
	<col style="width: 42%;">
	<col style="width: 12%;">
	<col style="width: 8%;">
	<col style="width: 20%;">
	<col style="width: 16%;">
	</colgroup>
	<thead>
		<tr align="center">
			<th><i class="checkbox-common"><input type="checkbox" onclick="CheckAll(this)"></i></th>
			<th align="left">活动名称</th>
			<th>图像</th>
			<th>活动状态</th>
			<th>有效时间</th>
			<th>操作</th>
		</tr>
	</thead>
	<tbody><tr align="center"><td><div class="cell"><i class="checkbox-common"><input name="sub_no_use" type="checkbox" value="1"></i></div></td><td align="left">@A</td><td><a class="img-container" href="javascript:;"><img src="/upload/common/1533095180.jpg" alt="" class="topic_img"></a></td><td>结束</td><td>开始时间：2018-08-01 11:46:46<br>结束时间：2018-08-14 11:46:49</td><td><a target="_blank" href="/goods/promotionTopicGoods?topic_id=1">预览</a><a href="/promotion/updateTopic?topic_id=1">编辑</a>&nbsp;<a href="javascript:void(0);" onclick="topicInfo(1)">详情</a>&nbsp;<a href="javascript:void(0);" onclick="delTopic(1)">删除</a>&nbsp;</td></tr></tbody>
</table>

<!-- 模态框（Modal） -->
<div class="modal fade hide" id="topicInfo" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
	<div class="modal-dialog">
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
				<h3>专题活动详情</h3>
			</div>
			<div class="modal-body">
				<div class="modal-infp-style">
					<table>
						<tbody><tr>
							<td style="width:60px;">活动名称</td>
							<td colspan="3" id="topic_name"></td>
						</tr>
						<tr>
							<td style="width:60px;">关键字</td>
							<td colspan="3" id="keyword"></td>
						</tr>
						<tr>
							<td style="width:60px;">描述</td>
							<td colspan="3" id="desc"></td>
						</tr>
						<tr>
							<td style="width:60px;">图像</td>
							<td colspan="3"><a class="img-mid" href="javascript:;"><img src="" alt="" id="picture_img" class="topic_img"></a></td>
						</tr>
						<tr>
							<td style="width:60px;">条幅</td>
							<td colspan="3"><a class="img-mid" href="javascript:;"><img src="" alt="" id="scroll_img" class="topic_img"></a></td>
						</tr>
						<tr>
							<td style="width:60px;">背景图</td>
							<td colspan="3"><a class="img-mid" href="javascript:;"><img src="" alt="" id="background_img" class="topic_img"></a></td>
						</tr>
						<tr>
							<td>有效期</td>
							<td colspan="3" id="time"></td>
						</tr>
						<tr>
							<td>活动状态</td>
							<td colspan="3" id="status"></td>
						</tr>
						<tr>
							<td colspan="3">商品列表</td>
						</tr>
						<tr id="goods_list"></tr>
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
