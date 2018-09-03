<template>
	<section class="ns-base-section">
		
		
		
	<div style="position:relative;margin:0;">
		<!-- 面包屑导航 -->
					<div class="breadcrumb-nav">
			<a href="index.html">大鵬系統</a>
								<i class="fa fa-angle-right"></i>
				<a href="/Distribution/promoterList.html">分销</a>
								<i class="fa fa-angle-right"></i>
				<!-- 需要加跳转链接用这个：http://showfx.niuteam.cn/admin/Distribution/shareholderDividendsConfig -->
				<a href="javascript:;" style="color:#999;">股东分红</a>
						</div>
					<!-- 三级导航菜单 -->
		
							<nav class="ns-third-menu">
				<ul>
											<li class="selected" onclick="location.href='/Distribution/shareholderDividendsConfig.html';">基本设置</li>
												<li onclick="location.href='/Distribution/partnerList.html';">人员管理</li>
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
																	<h4>操作提示</h4>
								<p>股东分红</p>
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
<!-- 						<span>股东分红</span> -->
<!-- 						 -->
<!-- 					{1/block} -->
			</h4>
		</div>
	</div>
	
	
	<div class="ns-main">
		
<div class="options-btn">
<a class="btn-common-white" href="/Distribution/addPartnerLevel.html">添加</a>
 
	<a id="is_partner_enable" class="btn-common-white" href="javascript:openPartnerEnable(0)">关闭股东分红(开启中)</a>
</div>
<!-- <div class="set-style">
<dl>
	<dt>是否开启股东分红:</dt>
	<dd>
					<input id="is_partner_enable" class="checkbox" type="checkbox" checked="checked" />
					<span class="help-inline" id="is_menuPrompt" style="display: none;"></span>
	</dd>
</dl>
</div> -->

<div class="mod-table">
<div class="mod-table-head">
	<div class="con style0list">
		<table class="table-class">
			<colgroup>
				<col style="width: 25%;">
				<col style="width: 20%;">
				<col style="width: 20%;">
				<col style="width: 20%;">
				<col style="width: 15%;">
			</colgroup>
			<thead>
				<tr>
					<th>等级名称</th>
					<th>申请最低消费</th>
					<th>股东分红佣金比率</th>
					<th>创建时间</th>
					<th>操作</th>
				</tr>
			</thead>
			<colgroup>
				<col style="width: 25%;">
				<col style="width: 20%;">
				<col style="width: 20%;">
				<col style="width: 20%;">
				<col style="width: 15%;">
			</colgroup>
			<tbody id="partner_global">
								<tr align="center" data-level_id="5">
					<td>儿太热</td>
					<td><input class="input-common harf" type="text" value="100.00">&nbsp;元</td>
					<td><input class="input-common harf" type="text" value="10.00">&nbsp;%</td>
					<td>2018-07-03 16:59:28</td>
					<td><a href="javascript:void(0);" onclick="deleteBox(5);">删除</a></td>
				</tr>					
								<tr align="center" data-level_id="6">
					<td>测试2</td>
					<td><input class="input-common harf" type="text" value="10000.00">&nbsp;元</td>
					<td><input class="input-common harf" type="text" value="5.00">&nbsp;%</td>
					<td>2018-07-17 10:09:54</td>
					<td><a href="javascript:void(0);" onclick="deleteBox(6);">删除</a></td>
				</tr>					
							</tbody>
		</table>
	</div>
</div>
</div>
<div class="mod-table" style="padding:13px;text-align:center;">
<button class="btn-common btn-big" onclick="updatePartnerLevelAll()">提交</button>
</div>

<div class="page" id="turn-ul" style="display: none;">
<div class="pagination">
	<ul>
		<li class="according-number">每页显示<input type="text" class="input-medium" id="showNumber" value="14" data-default="14" autocomplete="off">条</li>
		<li><a id="beginPage" class="page-disable" style="border: 1px solid #dddddd;">首页</a></li>
		<li><a id="prevPage" class="page-disable">上一页</a></li>
		<li id="pageNumber"></li>
		<li id="JslastPage">
			
		</li>
		<li><a id="nextPage">下一页</a></li>
		<li><a id="lastPage">末页</a></li>
		<li class="total-data">共0条</li>
		<!-- <li class="page-count">共0页</li> -->
		<li class="according-number">
			跳<input type="text" class="input-medium" id="skipPage" data-curr-page="1">页
		</li>
	</ul>
</div>
</div>
<input type="hidden" id="page_count">
<input type="hidden" id="page_size">
	</div>
	
</section>
</template>
