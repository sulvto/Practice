<template>
	
	<section class="ns-base-section">
		
		
		
		<div style="position:relative;margin:0;">
			<!-- 面包屑导航 -->
						<div class="breadcrumb-nav">
				<a href="index.html">大鵬系統</a>
									<i class="fa fa-angle-right"></i>
					<a href="/Commission/userAccountList.html">佣金</a>
									<i class="fa fa-angle-right"></i>
					<!-- 需要加跳转链接用这个：http://showfx.niuteam.cn/admin/Commission/userCommissionWithdrawList -->
					<a href="javascript:;" style="color:#999;">会员提现</a>
							</div>
						<!-- 三级导航菜单 -->
			
							
			<div class="right-side-operation">
				<ul>
					
<!-- <li><a class="nscs-table-handle_green" href="javascript:;" onclick="addBrand()"><i class="fa fa-plus-circle"></i>&nbsp;添加品牌</a></li> -->

					
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
		<th>
			用户姓名：<input id="userName" class="input-common middle" type="text" value="">
			手机号：<input id="userTel" class="input-common middle" type="text" value="">
			<button onclick="searchData()" value="搜索" class="btn-common">搜索</button>
		</th>		
	</tr>
</tbody></table>
<div class="mod-table">
	<div class="mod-table-head">
		<div class="con style0list">
			<table class="table-class">
				<colgroup>
					<col style="width: 7%;">
					<col style="width: 8%;">
					<col style="width: 10%;">
					<col style="width: 10%;">
					<col style="width: 16%;">
					<col style="width: 9%;">
					<col style="width: 8%;">
					<col style="width: 15%;">
					<col style="width: 8%;">
					<col style="width: 12%;">
				</colgroup>
				<thead>
					<tr>
						<!-- <th><label style="margin-left: 5px;"> <input type="checkbox"  onclick="CheckAll(this)"></label></th> -->
						<th>推广员</th>
						<th>手机号</th>
						<th>提现流水号</th>
						<th>提现银行</th>
						<th>提现账户</th>
						<th>账户姓名</th>						
						<th>提现金额</th>
						<th>提现日期</th>												
						<th>状态</th>								
						<th>操作</th>
					</tr>
				</thead>
				<colgroup>
					<col style="width: 7%;">
					<col style="width: 8%;">
					<col style="width: 10%;">
					<col style="width: 10%;">
					<col style="width: 16%;">
					<col style="width: 9%;">
					<col style="width: 8%;">
					<col style="width: 15%;">
					<col style="width: 8%;">
					<col style="width: 12%;">
				</colgroup>
				<tbody><tr align="center"><td colspan="10">暂无符合条件的数据记录</td></tr></tbody>
			</table>
		</div>
	</div>
</div>

<!-- 通过提现申请 -->
<div class="modal fade hide" id="agree" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
	<div class="modal-dialog">
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
				<h3>通过提现申请</h3>
			</div>
			<div class="modal-body">
				<div class="modal-infp-style">
					<table>
						<tbody><tr>
							<td>转账类型</td>
							<td>
								<div class="selectric-wrapper selectric-select-common" style="width: 250px;"><div class="selectric-hide-select"><select onchange="choose()" id="choose-type" class="select-common" tabindex="-1">
									<option value="1">线下转账</option>
									<option value="2">线上转账</option>
								</select></div><div class="selectric"><span class="selectric-label">线下转账</span><button class="selectric-button">▾</button></div><div class="selectric-items" tabindex="-1"><div class="selectric-scroll"><ul><li data-index="0" class="selected" title="线下转账">线下转账</li><li data-index="1" class="last" title="线上转账">线上转账</li></ul></div></div><input class="selectric-input" tabindex="0"></div>
							</td>
						</tr>
						<tr class="type-two">
							<td>转账方式</td>
							<td>
								<div class="selectric-wrapper selectric-select-common" style="width: 250px;"><div class="selectric-hide-select"><select id="online_type" class="select-common" tabindex="-1">
																			<option value="1">微信转账</option>
																				<option value="2">支付宝转账</option>
																			
								</select></div><div class="selectric"><span class="selectric-label">微信转账</span><button class="selectric-button">▾</button></div><div class="selectric-items" tabindex="-1"><div class="selectric-scroll"><ul><li data-index="0" class="selected" title="微信转账">微信转账</li><li data-index="1" class="last" title="支付宝转账">支付宝转账</li></ul></div></div><input class="selectric-input" tabindex="0"></div>
							</td>
						</tr>
						<tr class="type-one">
							<td>转账银行</td>
							<td>
								<input type="text" name="transfer_name" id="transfer_name" class="input-common">
							</td>
						</tr>
						<tr class="type-one">
							<td>银行账户</td>
							<td>
								<input type="text" name="transfer_account_no" id="transfer_account_no" class="input-common">
							</td>
						</tr>
						<tr class="type-one">
							<td>交易流水</td>
							<td>
								<input type="text" name="transfer_no" id="transfer_no" class="input-common">
							</td>
						</tr>	
							<tr>
								<td>转账金额</td>
								<td><input type="text" name="transfer_money" id="transfer_money" placeholder="请输入转账金额" value="" onkeyup="this.value=this.value.replace(/[^\d+(\.\d+)?]/g,'')" class="input-common harf"><em class="unit">元</em>	
									<input type="hidden" name="post-id" id="post-id" value="">
								</td>
							</tr>
							<tr>
								<td>备注</td>
								<td><textarea name="transfer_remark" id="transfer_remark" class="textarea-common"></textarea></td>
							</tr>
					</tbody></table>
				</div>
			</div>
			<div class="modal-footer">
				<button class="btn-common btn-big" onclick="audit()">确定</button>
				<button class="btn-common-white btn-big" data-dismiss="modal">关闭</button>
			</div>
		</div>
	</div>
</div>

<!-- 拒绝提现申请 -->
<div class="modal fade hide" id="recharge_balance" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
	<input type="hidden" id="balance_id">
	<div class="modal-dialog">
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
				<h3>拒绝提现申请</h3>
			</div>
			<div class="modal-body">
				<div class="modal-infp-style">
					<table>
						<tbody><tr>
							<td>备注</td>
							<td colspan="3" id="time"><textarea id="remark" class="input-common"></textarea></td>
						</tr>
					</tbody></table>
				</div>
			</div>
			<div class="modal-footer">
				<button class="btn btn-primary" onclick="refusetrue()">确定</button>
				<button class="btn btn-default" data-dismiss="modal">关闭</button>
			</div>
		</div>
	</div>
</div>

<!-- 提现详情模态框（Modal） -->
<div class="modal fade hide" id="details" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
	<div class="modal-dialog">
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
				<h3>提现详情</h3>
			</div>
			<div class="modal-body">
				<div class="modal-infp-style">
					<table>
						<tbody><tr>
							<td>会员</td>
							<td colspan="4" id="real_name"></td>
							<td>手机号</td>
							<td colspan="4" id="mobile"></td>
						</tr>
						<tr>
							<td>提现流水号</td>
							<td colspan="4" id="withdraw_no"></td>
							<td>提现银行</td>
							<td colspan="4" id="bank_name"></td>
						</tr>
						<tr>
							<td>提现账户</td>
							<td colspan="4" id="account_number"></td>
							<td>账户姓名</td>
							<td colspan="4" id="realname"></td>
						</tr>
						<tr>
							<td>提现金额</td>
							<td colspan="4" id="cash"></td>
							<td>提现日期</td>
							<td colspan="4" id="ask_for_date"></td>
						</tr>
						<tr>
							<td>状态</td>
							<td colspan="4" id="status"></td>
							<td>备注</td>
							<td colspan="4" id="memo"></td>
						</tr>
					</tbody></table>
				</div>
			</div>
			<div class="modal-footer">
				<button type="button" class="btn" data-dismiss="modal">关闭</button>
			</div>
		</div>
	</div>
</div>
<input type="hidden" id="uid" class="">
<input type="hidden" id="status" class="">

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
<input type="hidden" id="page_count" class="" value="0">
<input type="hidden" id="page_size" class="" value="0">
		</div>
		
	</section>
	
</template>
