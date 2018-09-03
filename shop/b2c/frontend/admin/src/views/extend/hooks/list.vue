<template>
	
	<section class="ns-base-section">
		
		
		
		<div style="position:relative;margin:0;">
			<!-- 面包屑导航 -->
						<div class="breadcrumb-nav">
				<a href="index.html">大鵬系統</a>
									<i class="fa fa-angle-right"></i>
					<a href="/upgrade/onlineupdate.html">系统</a>
									<i class="fa fa-angle-right"></i>
					<!-- 需要加跳转链接用这个：http://showfx.niuteam.cn/admin/extend/hookslist -->
					<a href="javascript:;" style="color:#999;">钩子管理</a>
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
			
<div class="options-btn">
	<button class="btn-common" onclick="location.href='/extend/addhooks.html';">添加钩子</button>
</div>
<table class="table-class">
	<colgroup>
		<col style="width: 2%;">
		<col style="width: 20%;">
		<col style="width: 7%;">
		<col style="width: 61%;">
		<col style="width: 10%">
	</colgroup>
	<thead>
		<tr align="left">
			<th style="text-align: center;"><i class="checkbox-common"><input type="checkbox" onclick="CheckAll(this)"></i></th>
			<th>名称</th>
			<th>类型</th>
			<th>描述</th>
			<th align="center">操作</th>
		</tr>
	</thead>
	<tbody><tr><td style="text-align: center;"><i class="checkbox-common"><input name="sub" type="checkbox" value="72"></i></td><td>orderGoodsConfirmRefundSuccess</td><td>控制器</td><td>订单退款结果通知</td><td align="center"><a href="/extend/hooksedit.html?id=72" style="margin-left:0;">修改</a><a href="javascript:;" onclick="deleteHooks(72)">删除</a></td></tr><tr><td style="text-align: center;"><i class="checkbox-common"><input name="sub" type="checkbox" value="71"></i></td><td>orderGoodsRefundAskforSuccess</td><td>控制器</td><td>订单退款申请通知</td><td align="center"><a href="/extend/hooksedit.html?id=71" style="margin-left:0;">修改</a><a href="javascript:;" onclick="deleteHooks(71)">删除</a></td></tr><tr><td style="text-align: center;"><i class="checkbox-common"><input name="sub" type="checkbox" value="70"></i></td><td>orderOffLinePaySuccess</td><td>控制器</td><td>订单线下支付成功通知</td><td align="center"><a href="/extend/hooksedit.html?id=70" style="margin-left:0;">修改</a><a href="javascript:;" onclick="deleteHooks(70)">删除</a></td></tr><tr><td style="text-align: center;"><i class="checkbox-common"><input name="sub" type="checkbox" value="69"></i></td><td>orderOnLinePaySuccess</td><td>控制器</td><td>订单线上支付成功通知</td><td align="center"><a href="/extend/hooksedit.html?id=69" style="margin-left:0;">修改</a><a href="javascript:;" onclick="deleteHooks(69)">删除</a></td></tr><tr><td style="text-align: center;"><i class="checkbox-common"><input name="sub" type="checkbox" value="68"></i></td><td>memberBalanceRechargeSuccess</td><td>控制器</td><td>余额充值成功通知</td><td align="center"><a href="/extend/hooksedit.html?id=68" style="margin-left:0;">修改</a><a href="javascript:;" onclick="deleteHooks(68)">删除</a></td></tr><tr><td style="text-align: center;"><i class="checkbox-common"><input name="sub" type="checkbox" value="67"></i></td><td>orderDistributionSuccess</td><td>控制器</td><td>订单完成发放佣金</td><td align="center"><a href="/extend/hooksedit.html?id=67" style="margin-left:0;">修改</a><a href="javascript:;" onclick="deleteHooks(67)">删除</a></td></tr><tr><td style="text-align: center;"><i class="checkbox-common"><input name="sub" type="checkbox" value="66"></i></td><td>promoterAuditAgreeSuccess</td><td>控制器</td><td>推广员申请审核通过</td><td align="center"><a href="/extend/hooksedit.html?id=66" style="margin-left:0;">修改</a><a href="javascript:;" onclick="deleteHooks(66)">删除</a></td></tr><tr><td style="text-align: center;"><i class="checkbox-common"><input name="sub" type="checkbox" value="65"></i></td><td>ww</td><td>视图</td><td></td><td align="center"><a href="/extend/hooksedit.html?id=65" style="margin-left:0;">修改</a><a href="javascript:;" onclick="deleteHooks(65)">删除</a></td></tr><tr><td style="text-align: center;"><i class="checkbox-common"><input name="sub" type="checkbox" value="64"></i></td><td>goodsAttributeDeleteSuccess</td><td>视图</td><td>商品类型删除成功</td><td align="center"><a href="/extend/hooksedit.html?id=64" style="margin-left:0;">修改</a><a href="javascript:;" onclick="deleteHooks(64)">删除</a></td></tr><tr><td style="text-align: center;"><i class="checkbox-common"><input name="sub" type="checkbox" value="63"></i></td><td>goodsAttributeSaveSuccess</td><td>控制器</td><td>商品类型保存成功</td><td align="center"><a href="/extend/hooksedit.html?id=63" style="margin-left:0;">修改</a><a href="javascript:;" onclick="deleteHooks(63)">删除</a></td></tr><tr><td style="text-align: center;"><i class="checkbox-common"><input name="sub" type="checkbox" value="62"></i></td><td>goodsSpecDeleteSuccess</td><td>控制器</td><td>商品规格删除成功</td><td align="center"><a href="/extend/hooksedit.html?id=62" style="margin-left:0;">修改</a><a href="javascript:;" onclick="deleteHooks(62)">删除</a></td></tr><tr><td style="text-align: center;"><i class="checkbox-common"><input name="sub" type="checkbox" value="61"></i></td><td>goodsSpecSaveSuccess</td><td>控制器</td><td>商品规格保存成功</td><td align="center"><a href="/extend/hooksedit.html?id=61" style="margin-left:0;">修改</a><a href="javascript:;" onclick="deleteHooks(61)">删除</a></td></tr><tr><td style="text-align: center;"><i class="checkbox-common"><input name="sub" type="checkbox" value="60"></i></td><td>goodsGroupDeleteSuccess</td><td>控制器</td><td>商品分组删除成功</td><td align="center"><a href="/extend/hooksedit.html?id=60" style="margin-left:0;">修改</a><a href="javascript:;" onclick="deleteHooks(60)">删除</a></td></tr><tr><td style="text-align: center;"><i class="checkbox-common"><input name="sub" type="checkbox" value="59"></i></td><td>goodsGroupSaveSuccess</td><td>控制器</td><td>商品分组保存成功</td><td align="center"><a href="/extend/hooksedit.html?id=59" style="margin-left:0;">修改</a><a href="javascript:;" onclick="deleteHooks(59)">删除</a></td></tr></tbody>
</table>

<div class="page" id="turn-ul" style="">
	<div class="pagination">
		<ul>
			<li class="according-number">每页显示<input type="text" class="input-medium" id="showNumber" value="14" data-default="14" autocomplete="off">条</li>
			<li><a id="beginPage" class="page-disable" style="border: 1px solid #dddddd;">首页</a></li>
			<li><a id="prevPage" class="page-disable">上一页</a></li>
			<li id="pageNumber"><a onclick="JumpForPage(this)" class="currentPage">1</a><a onclick="JumpForPage(this)">2</a><a onclick="JumpForPage(this)">3</a></li>
			<li id="JslastPage"></li>
			<li><a id="nextPage">下一页</a></li>
			<li><a id="lastPage">末页</a></li>
			<li class="total-data" data-total-count="39">共39条</li>
			<!-- <li class="page-count">共0页</li> -->
			<li class="according-number">
				跳<input type="text" class="input-medium" id="skipPage" data-curr-page="1">页
			</li>
		</ul>
	</div>
</div>
<input type="hidden" id="page_count" value="3">
<input type="hidden" id="page_size" value="14">
		</div>
		
	</section>
</template>
