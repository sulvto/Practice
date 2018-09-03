<template>
		
	<section class="ns-base-section">
		
		
		
		<div style="position:relative;margin:0;">
			<!-- 面包屑导航 -->
						<div class="breadcrumb-nav">
				<a href="index.html">大鵬系統</a>
									<i class="fa fa-angle-right"></i>
					<a href="/config/webconfig.html">设置</a>
									<i class="fa fa-angle-right"></i>
					<!-- 需要加跳转链接用这个：http://showfx.niuteam.cn/admin/Verification/index -->
					<a href="javascript:;" style="color:#999;">核销设置</a>
							</div>
						<!-- 三级导航菜单 -->
			
								<nav class="ns-third-menu">
					<ul>
												<li class="selected" onclick="location.href='/Verification/index.html';">核销人员</li>
													<li onclick="location.href='/Verification/virtualGoodsVerificationList.html?type=to_reply';">核销记录</li>
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
			
<div class="options-btn">
	<button class="btn-common btn-small" onclick="showAddModal();">添加核销人员</button>
</div>
<table class="table-class" id="personList">
		<colgroup>
		<col style="width: 2%;">
		<col style="width: 72%;">
		<col style="width: 16%;">
		<col style="width: 10%;">
		</colgroup>
	<thead>
		<tr align="center">
			<th><i class="checkbox-common"><input type="checkbox" onclick="CheckAll(this)"></i></th>
			<th align="left">核销人员昵称</th>
			<th>创建时间</th>
			<th>操作</th>
		</tr>
	</thead>
	<tbody><tr align="center"><td><i class="checkbox-common"><input name="sub" type="checkbox" value="4"></i></td><td align="left">sudo</td><td>2018-07-11 01:03:33</td><td><a href="javascript:deleteVerificationPerson(1)">删除</a></td></tr><tr align="center"><td><i class="checkbox-common"><input name="sub" type="checkbox" value="10"></i></td><td align="left">cqinter</td><td>2018-07-12 14:00:03</td><td><a href="javascript:deleteVerificationPerson(2)">删除</a></td></tr><tr align="center"><td><i class="checkbox-common"><input name="sub" type="checkbox" value="42"></i></td><td align="left">aoeuaoeu</td><td>2018-07-23 22:06:21</td><td><a href="javascript:deleteVerificationPerson(3)">删除</a></td></tr></tbody>
</table>

<!-- 添加会员 -->
<div class="modal fade hide" id="addVerificationPerson" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">

	<div class="modal-dialog">
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
				<h3>添加核销人员</h3>
			</div>
			<div class="modal-body">
				<div class="modal-infp-style">
					<table class="mytable">
						<tbody>
							<tr>
								<td>
									<input id="user_info" class="input-common" type="text" placeholder="输入手机号/邮箱/会员昵称">
									<input type="button" onclick="selectMember();" value="搜索" class="btn-common">
								</td>
							</tr>
						</tbody>
					</table>
					<table class="table-class" id="member_list">
						<colgroup>
							<col style="width: 2%;">
							<col style="width: 29%;">
							<col style="width: 29%;">
							<col style="width: 30%;">
							<col style="width: 10%;">
						</colgroup>
						<thead>
							<tr><th><i class="checkbox-common"><input type="checkbox" onclick="CheckPerSonAll(this)"></i></th>
							<th align="left">会员昵称</th>
							<th>会员邮箱</th>
							<th>会员手机</th>
							<th>状态</th>
						</tr></thead>
						<tbody></tbody>
					</table>
				</div>
			</div>
			
			<div class="modal-footer">
				<button class="btn-common btn-big" onclick="addVerificationPerson()">保存</button>
				<button class="btn-common-cancle btn-big" data-dismiss="modal">关闭</button>
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
