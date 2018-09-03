<template>
		
	<section class="ns-base-section">
		
		
		
		<div style="position:relative;margin:0;">
			<!-- 面包屑导航 -->
						<div class="breadcrumb-nav">
				<a href="index.html">大鵬系統</a>
									<i class="fa fa-angle-right"></i>
					<a href="/Distribution/promoterList.html">分销</a>
									<i class="fa fa-angle-right"></i>
					<!-- 需要加跳转链接用这个：http://showfx.niuteam.cn/admin/Distribution/addPartnerLevel -->
					<a href="javascript:;" style="color:#999;">股东等级添加</a>
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
									<p>股东等级添加</p>
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
<!-- 						<span>股东等级添加</span> -->
<!-- 						 -->
<!-- 					{1/block} -->
				</h4>
			</div>
		</div>
		
		
		<div class="ns-main">
			
<div class="set-style">
	<dl>
		<dt>等级名称：</dt>
		<dd>
			<p><input name="" id="level_name" class="input-common" type="text" value=""></p>	
			<p class="error">请输入股东等级名称</p>
		</dd>
	</dl>
	<dl>
		<dt>申请最低消费：</dt>
		<dd>
			<p><input name="" id="level_money" class="input-common harf" type="text" value="" onkeyup="javascript:CheckInputIntFloat(this);"><em class="unit" style="position: relative;top: -1px;">元</em></p>	
			<p class="error">请输入申请股东所需最低消费</p>
		</dd>
	</dl>
	<dl>
		<dt>股东分红佣金比率：</dt>
		<dd>
			<p><input name="" id="commission_rate" type="text" value="" class="input-common harf" onkeyup="javascript:CheckInputIntFloat(this);"><em class="unit" style="position: relative;top: -1px;">%</em></p>	
			<p class="error">请输入本店销售佣金比率</p>
		</dd>
	</dl>
	<!-- <dl>
		<dt>全球分红分值:</dt>
		<dd>
			<p><input name="" id="global_value" type="text" value="" onkeyup="javascript:CheckInputIntFloat(this);"/>&nbsp;%</p>	
			<p class="error">请输入本店销售佣金比率</p>
		</dd>
	</dl>
	<dl>
		<dt>全球分红权重:</dt>
		<dd>
			<p><input name="" id="global_weight" type="text" value="" onkeyup="javascript:CheckInputIntFloat(this);"/>&nbsp;%</p>	
			<p class="error">请输入给上级的佣金比率</p>
		</dd>
	</dl>	 -->
	<dl>
	<dt></dt>
	<dd>
		<button class="btn-common btn-big" onclick="addPartherLevel();">提交</button>
	</dd>
	</dl>
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
