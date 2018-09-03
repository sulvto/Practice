<template>
	
	<section class="ns-base-section">
		
		
		
		<div style="position:relative;margin:0;">
			<!-- 面包屑导航 -->
						<div class="breadcrumb-nav">
				<a href="index.html">大鵬系統</a>
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
			
<div class="set-style">
	<div class="account_info">
	
		<div class="account_item">
			<p>会员身份</p>
			<div class="item_value">
				<div>是否为推广员：<span>是</span></div>
			</div>
			<div class="item_value">
				<div>是否为股东：<span>否</span></div>
			</div>
			<div class="item_value">
				<div>是否为代理：<span>否</span></div>
			</div>
		</div>
		
		<div class="account_item">
			<p>推广员信息</p>
			<div class="item_value">
				<div>推广编号：<span>FX000067</span></div>
			</div>
			<div class="item_value">
				<div>会员账号：<span>ztyzp</span></div>
			</div>
			<div class="item_value">
				<div>推广等级：<span>一级分销</span></div>
			</div>
			<div class="item_value">
				<div>店铺名称：<span>ztyzp</span></div>
			</div>
			<div class="item_value">
				<div>推广人数：<span>1</span></div>
			</div>
			<div class="item_value">
				<div>粉丝数：<span>0</span></div>
			</div>
			<div class="item_value">
									<div>上级推广员：<span>无</span></div>
							</div>
		</div>

		<div class="account_item">
			<p>账户信息</p>
			<div class="item_value">
				<div>总佣金：<span>0.00</span></div>
			</div>
			<div class="item_value">
				<div>可提现佣金：<span>0.00</span></div>
			</div>
			<div class="item_value">
				<div>已提现佣金：<span>0.00</span></div>
			</div>
			<div class="item_value">
				<div>分销佣金：<span>0.00</span></div>
			</div>
			<div class="item_value">
				<div>股东分红：<span>0.00</span></div>
			</div>
			<div class="item_value">
				<div>股东全球分红：<span>0.00</span></div>
			</div>
			<div class="item_value">
				<div>区域代理佣金：<span>0.00</span></div>
			</div>
		</div>
	</div>
	
		<table class="mytable">
			<tbody><tr>
				<th>
					交易时间：
					<input type="text" id="startDate" class="input-common middle" placeholder="请选择开始日期" onclick="WdatePicker()"> - 
					<input type="text" id="endDate" placeholder="请选择结束日期" class="input-common middle" onclick="WdatePicker()">
					交易类型：<div class="selectric-wrapper selectric-select-common  selectric-middle" style="width: 150px;"><div class="selectric-hide-select"><select name="account_type" id="account_type" class="select-common  middle" tabindex="-1">
						<option value="0">全部</option>
												
					</select></div><div class="selectric"><span class="selectric-label">全部</span><button class="selectric-button">▾</button></div><div class="selectric-items" tabindex="-1"><div class="selectric-scroll"><ul><li data-index="0" class="last selected" title="全部">全部</li></ul></div></div><input class="selectric-input" tabindex="0"></div>
					<button onclick="searchData()" value="搜索" class="btn-common">搜索</button>
				</th>
			</tr>
		</tbody></table>
	<div class="account_list">
		<table class="table-class">
			<colgroup>
				<col style="width: 8%;">
				<col style="width: 8%;">
				<col style="width: 8%;">
				<col style="width: 8%;">
			</colgroup>
			<thead>
				<tr>						
					<th>交易日期</th>					
					<th>金额</th>
					<th>交易类型</th>						
					<th>描述</th>
				</tr>
			</thead>
	
			<tbody><tr align="center"><td colspan="11">暂无符合条件的数据记录</td></tr></tbody>
		</table>
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
