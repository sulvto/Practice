<template>
    <section class="ns-base-section">
		
		
		
		<div style="position:relative;margin:0;">
			<!-- 面包屑导航 -->
						<div class="breadcrumb-nav">
				<a href="index.html">零基础学IT就来</a>
									<i class="fa fa-angle-right"></i>
					<a href="/config/webconfig.html">设置</a>
									<i class="fa fa-angle-right"></i>
					<!-- 需要加跳转链接用这个：http://showfx.niuteam.cn/admin/shop/pickuppointlist -->
					<a href="javascript:;" style="color:#999;">自提点管理</a>
							</div>
						<!-- 三级导航菜单 -->
			
								<nav class="ns-third-menu">
					<ul>
												<li onclick="location.href='/express/expresscompany.html';">物流配送</li>
													<li class="selected" onclick="location.href='/shop/pickuppointlist.html';">门店自提</li>
													<li onclick="location.href='/distribution/distributionuserlist.html';">本地配送</li>
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
			
<div class="space-10"></div>
<div class="ncsc-form-goods">
<nav class="goods-nav">
		<ul>
								<li class="selected"><a href="/shop/pickuppointlist.html" child_id="1">门店管理</a></li>
											<li><a href="/shop/pickuppointfreight.html" child_id="3">门店运费</a></li>
											<li><a href="/shop/pickupAuditorList.html" child_id="4">门店审核人员管理</a></li>
							
		</ul>
</nav>
	<!-- 基础设置 -->
	<div class="mod-table">
	<div class="mod-table-head">
		<table class="mytable">
			<tbody><tr>
				<td width="20%" style="text-align: left;">
					<button style="margin:0 5px 0 0 !important;" class="btn-common-delete btn-small" onclick="batchDelete()">批量删除</button>
					<button style="margin:0 5px 0 0 !important;" class="btn-common btn-small" onclick="location.href='/shop/addpickuppoint.html';">添加门店</button>
				</td>
				<td width="20%">
					<input type="text" id="search_text" placeholder="请输入门店名称" class="input-common">
					<input type="button" onclick="searchData()" value="搜索" class="btn-common">
				</td>
			</tr>
		</tbody></table>
		<div class="con style0list">

			<table class="table-class" id="pickupList">
			<colgroup>
				<col style="width: 2%">
				<col style="width: 18%;">
				<col style="width: 18%;">
				<col style="width: 18%;">
				<col style="width: 15%;">
				<col style="width: 13%;">
				<col style="width: 16%;">
			</colgroup>
			<thead>
				<tr align="center">
					<th><i class="checkbox-common"><input id="ckall" type="checkbox" onclick="CheckAll(this)"></i></th>
					<th align="left">门店名称</th>
					<th align="left">地址</th>
					<th>联系人</th>
					<th>联系电话</th>
					<th>发布时间</th>
					<th>操作</th>
				</tr>
			</thead>
			<tbody><tr align="center"><td><i class="checkbox-common"><input name="sub" type="checkbox" value="1"></i></td><td align="left">11</td><td align="left">重庆市/重庆市/云阳县/111</td><td>111111111</td><td>1111111</td><td>2018-07-13 10:18:04</td><td><a href="/shop/updatepickuppoint?id=1">修改</a><a onclick="deletepickupPoint(1)">删除</a><a onclick="addAuditor(1);">添加审核人员</a></td></tr></tbody>
		</table>
		</div>
	</div>
</div>
</div>


<!-- 添加审核人员 -->
<div class="modal fade hide" id="addVerificationPerson" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
	<div class="modal-dialog">
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
				<h3>添加门店审核人员</h3>
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
				<button class="btn-common btn-big" onclick="addPickupAuditor()">保存</button>
				<button class="btn-common-cancle btn-big" data-dismiss="modal">关闭</button>
			</div>
		</div>
	</div>
</div>

<input type="hidden" id="hidden_pickupPoint_id" value="">


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
