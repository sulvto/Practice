<template>
	
	<section class="ns-base-section">
		
		
		
		<div style="position:relative;margin:0;">
			<!-- 面包屑导航 -->
						<div class="breadcrumb-nav">
				<a href="index.html">大鵬系統</a>
									<i class="fa fa-angle-right"></i>
					<a href="/member/memberlist.html">会员</a>
									<i class="fa fa-angle-right"></i>
					<!-- 需要加跳转链接用这个：http://showfx.niuteam.cn/admin/member/memberlevellist -->
					<a href="javascript:;" style="color:#999;">会员等级</a>
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
									<p>相关教程：<a href="http://bbs.niushop.com.cn/forum.php?mod=viewthread&amp;tid=2323&amp;extra=page%3D2" target="_blank">http://bbs.niushop.com.cn/forum.php?mod=viewthread&amp;tid=2323&amp;extra=page%3D2</a></p>
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
<!-- 						<span>相关教程：<a href="http://bbs.niushop.com.cn/forum.php?mod=viewthread&tid=2323&extra=page%3D2" target="_blank">http://bbs.niushop.com.cn/forum.php?mod=viewthread&tid=2323&extra=page%3D2</a></span> -->
<!-- 						 -->
<!-- 					{1/block} -->
				</h4>
			</div>
		</div>
		
		
		<div class="ns-main">
			
<div class="options-btn">
	<button class="btn-common btn-small" onclick="location.href='/member/addmemberlevel.html';">添加等级</button>
</div>
<table class="table-class">
	<colgroup>
		<col style="width: 2%">
		<col style="width: 29%;">
		<col style="width: 29%;">
		<col style="width: 30%;">
		<col style="width: 10%;">
	</colgroup>
	<thead>
		<tr align="center">
			<th><i class="checkbox-common"><input type="checkbox" onclick="CheckAll(this)"></i></th>
			<th align="left">等级名称</th>
			<th align="left">升级条件</th>
			<th align="right">折扣率（%）<span class="row-50"></span></th>
			<th>操作</th>
		</tr>
	</thead>
	<tbody><tr align="center"><td><i class="checkbox-common"><input name="sub" type="checkbox" value="47"></i></td><td align="left">普通会员</td><td align="left">累计积分满200分</td><td align="right">95<span class="row-50"></span></td><td> <a href="/member/updatememberlevel?level_id=47">修改</a></td></tr><tr align="center"><td><i class="checkbox-common"><input name="sub" type="checkbox" value="48"></i></td><td align="left">铜牌会员</td><td align="left">累计积分满0分</td><td align="right">93<span class="row-50"></span></td><td><a href="/member/updatememberlevel?level_id=48">修改</a>&nbsp;&nbsp;&nbsp;<a href="javascript:deleteMember(48);">删除</a></td></tr><tr align="center"><td><i class="checkbox-common"><input name="sub" type="checkbox" value="49"></i></td><td align="left">银牌会员</td><td align="left">累计积分满1500分</td><td align="right">92<span class="row-50"></span></td><td><a href="/member/updatememberlevel?level_id=49">修改</a>&nbsp;&nbsp;&nbsp;<a href="javascript:deleteMember(49);">删除</a></td></tr><tr align="center"><td><i class="checkbox-common"><input name="sub" type="checkbox" value="50"></i></td><td align="left">金牌会员</td><td align="left">累计积分满3000分</td><td align="right">88<span class="row-50"></span></td><td><a href="/member/updatememberlevel?level_id=50">修改</a>&nbsp;&nbsp;&nbsp;<a href="javascript:deleteMember(50);">删除</a></td></tr><tr align="center"><td><i class="checkbox-common"><input name="sub" type="checkbox" value="51"></i></td><td align="left">至尊会员</td><td align="left">消费额度满20000元</td><td align="right">60<span class="row-50"></span></td><td><a href="/member/updatememberlevel?level_id=51">修改</a>&nbsp;&nbsp;&nbsp;<a href="javascript:deleteMember(51);">删除</a></td></tr></tbody>
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
