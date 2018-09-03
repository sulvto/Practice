<template>
	
	<section class="ns-base-section">
		
		
		
		<div style="position:relative;margin:0;">
			<!-- 面包屑导航 -->
						<div class="breadcrumb-nav">
				<a href="index.html">大鵬系統</a>
									<i class="fa fa-angle-right"></i>
					<a href="/member/memberlist.html">会员</a>
									<i class="fa fa-angle-right"></i>
					<!-- 需要加跳转链接用这个：http://showfx.niuteam.cn/admin/member/usercommissionwithdrawlist -->
					<a href="javascript:;" style="color:#999;">会员提现</a>
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
									<p>相关教程：<a href="http://bbs.niushop.com.cn/forum.php?mod=viewthread&amp;tid=2324&amp;extra=page%3D2" target="_blank">http://bbs.niushop.com.cn/forum.php?mod=viewthread&amp;tid=2324&amp;extra=page%3D2</a></p>
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
<!-- 						<span>相关教程：<a href="http://bbs.niushop.com.cn/forum.php?mod=viewthread&tid=2324&extra=page%3D2" target="_blank">http://bbs.niushop.com.cn/forum.php?mod=viewthread&tid=2324&extra=page%3D2</a></span> -->
<!-- 						 -->
<!-- 					{1/block} -->
				</h4>
			</div>
		</div>
		
		
		<div class="ns-main">
			
<table class="mytable">
	<tbody><tr>
		<td>
			<span>提现时间：</span>
			<input type="text" id="startDate" class="input-common middle" placeholder="请选择开始日期" onclick="WdatePicker()">
			&nbsp;-&nbsp;
			<input type="text" id="endDate" placeholder="请选择结束日期" class="input-common middle" onclick="WdatePicker()">
			<!-- 更多搜索按钮 -->
			<button class="btn-common-white more-search"><i class="fa fa-chevron-down"></i></button>
			<button onclick="searchData()" value="搜索" class="btn-common">搜索</button>
			<!-- 更多搜索下拉框 -->
			<div class="more-search-container">
				<dl>
					<dt>会员账号：</dt>
					<dd>
						<input id="userName" class="input-small input-common middle" type="text" placeholder="请输入会员账号">
					</dd>
				</dl>
				<dl>
					<dt>手机号：</dt>
					<dd>
						<input id="userTel" class="input-small input-common middle" type="text" placeholder="请输入手机号">
					</dd>
				</dl>
				<dl>
					<dt></dt>
					<dd><button onclick="searchData()" class="btn-common">搜索</button></dd>
				</dl>
			</div>
		</td>
	</tr>
</tbody></table>
<table class="table-class">
	<colgroup>
		<col style="width: 2%;">
		<col style="width: 9%;">
		<col style="width: 9%;">
		<col style="width: 9%;">
		<col style="width: 9%;">
		<col style="width: 9%;">
		<col style="width: 9%;">
		<col style="width: 9%;">
		<col style="width: 9%;">
		<col style="width: 16%;">
		<col style="width: 10%;">
	</colgroup>
	<thead>
		<tr>
			<th><i class="checkbox-common"><input type="checkbox" onclick="CheckAll(this)"></i></th>
			<th align="left">会员账号</th>
			<th align="left">手机号</th>
			<th align="left">提现流水号</th>
			<th align="left">提现银行</th>
			<th align="left">提现账户</th>
			<th align="left">账户姓名</th>
			<th align="right">提现金额</th>
			<th>状态</th>
			<th>提现日期</th>
			<th>操作</th>
		</tr>
	</thead>
	<tbody><tr align="center"><td colspan="11">暂无符合条件的数据记录</td></tr></tbody>
</table>

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
								<td><input type="text" name="transfer_money" id="transfer_money" placeholder="请输入转账金额" value="" onkeyup="this.value=this.value.replace(/[^\d+(\.\d+)?]/g,'')" class="input-common">
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
				<button class="btn-common-cancle btn-big" data-dismiss="modal">关闭</button>
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
							<td colspan="3" id="time"><textarea id="remark" class="textarea-common"></textarea></td>
						</tr>
					</tbody></table>
				</div>
			</div>
			<div class="modal-footer">
				<button class="btn-common btn-big" onclick="refusetrue()">确定</button>
				<button class="btn-common-cancle btn-big" data-dismiss="modal">关闭</button>
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
				<button type="button" class="btn btn-big" data-dismiss="modal">关闭</button>
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
