<template>
	
	<section class="ns-base-section">
		
		<div style="position:relative;margin:0;">
			<!-- 面包屑导航 -->
						<div class="breadcrumb-nav">
				<a href="index.html">大鵬系統</a>
									<i class="fa fa-angle-right"></i>
					<a href="/wchat/config.html">微信</a>
									<i class="fa fa-angle-right"></i>
					<!-- 需要加跳转链接用这个：http://showfx.niuteam.cn/admin/member/weixinfanslist -->
					<a href="javascript:;" style="color:#999;">粉丝列表</a>
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
									<p>相关教程：<a href="http://bbs.niushop.com.cn/forum.php?mod=viewthread&amp;tid=2322&amp;extra=page%3D2" target="_blank">http://bbs.niushop.com.cn/forum.php?mod=viewthread&amp;tid=2322&amp;extra=page%3D2</a></p>
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
<!-- 						<span>相关教程：<a href="http://bbs.niushop.com.cn/forum.php?mod=viewthread&tid=2322&extra=page%3D2" target="_blank">http://bbs.niushop.com.cn/forum.php?mod=viewthread&tid=2322&extra=page%3D2</a></span> -->
<!-- 						 -->
<!-- 					{1/block} -->
				</h4>
			</div>
		</div>
		
		
		<div class="ns-main">
			
<table class="mytable">
	<tbody><tr>
		<th width="5%">
			<button class="btn-common" id="UpdateFansList" href="javascript:;" style="float: left;">
				<i class="fa fa-refresh" aria-hidden="true"></i>
				<span>更新粉丝列表</span>
			</button>
		</th>
		<th width="10%">
			<input type="text" id="search_text" placeholder="请输入粉丝名称" class="input-common">
			<button onclick="searchData()" value="搜索" class="btn-common">搜索</button>
		</th>
	</tr>
</tbody></table>
<table class="table-class">
	<colgroup>
		<col style="width: 2%;">
		<col style="width: 16%;">
		<col style="width: 18%;">
		<col style="width: 16%;">
		<col style="width: 16%;">
		<col style="width: 16%;">
		<col style="width: 16%;">
	</colgroup>
	<thead>
		<tr align="center">
			<th><i class="checkbox-common"><input type="checkbox" onclick="CheckAll(this)"></i></th>
			<th align="left">粉丝头像</th>
			<th align="left">粉丝名称</th>
			<th align="left">地址</th>
			<th>关注状态</th>
			<th>关注时间</th>
			<th align="left">备注</th>
		</tr>
	</thead>
	<tbody><tr align="center"><td colspan="9">暂无符合条件的数据记录</td></tr></tbody>
</table>
<!-- 更新遮罩层 -->
<div class="data-loading-eject-layer">
	<div class="prompt_information">
		<div class="load-icon"><i class="fa fa-refresh fa-spin fa-5x fa-fw"></i></div>
		<div class="progress_bar">
			<div class="speed_of_progress"></div>
		</div>
		<p class="information">正在更新中</p>
	</div>
</div>


<div class="page" id="turn-ul" style="">
	<div class="pagination">
		<ul>
			<li class="according-number">每页显示<input type="text" class="input-medium" id="showNumber" value="14" data-default="14" autocomplete="off">条</li>
			<li><a id="beginPage" class="page-disable" style="border: 1px solid #dddddd;">首页</a></li>
			<li><a id="prevPage" class="page-disable">上一页</a></li>
			<li id="pageNumber"></li>
			<li id="JslastPage"></li>
			<li><a id="nextPage" class="page-disable">下一页</a></li>
			<li><a id="lastPage" class="page-disable">末页</a></li>
			<li class="total-data" data-total-count="0">共0条</li>
			<!-- <li class="page-count">共0页</li> -->
			<li class="according-number">
				跳<input type="text" class="input-medium" id="skipPage" data-curr-page="0">页
			</li>
		</ul>
	</div>
</div>
<input type="hidden" id="page_count" value="0">
<input type="hidden" id="page_size" value="0">
		</div>
		
	</section>
	
</template>
