<template>
    
	<section class="ns-base-section">
		
		
		
		<div style="position:relative;margin:0;">
			<!-- 面包屑导航 -->
						<div class="breadcrumb-nav">
				<a href="http://b2c.niuteam.cn/admin.html">单商户B2C</a>
									<i class="fa fa-angle-right"></i>
					<a href="/order/orderlist.html">订单</a>
									<i class="fa fa-angle-right"></i>
					<!-- 需要加跳转链接用这个：http://b2c.niuteam.cn/admin/Order/orderCustomerDetail -->
					<a href="javascript:;" style="color:#999;">售后详情</a>
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
									<p>售后详情</p>
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
<!-- 						<span>售后详情</span> -->
<!-- 						 -->
<!-- 					{1/block} -->
				</h4>
			</div>
		</div>
		
		
		<div class="ns-main">
			
<div class="mod-table">
<div class="step-region">
	<ul class="ui-step ui-step-4">
		<li class="ui-step-done">
			<div class="ui-step-title">买家申请退款</div>
			<div class="ui-step-number">1</div>
			<div class="ui-step-meta"></div>
		</li>
		<li class="ui-step-done">
			<div class="ui-step-title">商家退款处理</div>
			<div class="ui-step-number">2</div>
			<div class="ui-step-meta"></div>
		</li>
		<li class="">
			<div class="ui-step-title">退款完成</div>
			<div class="ui-step-number">3</div>
			<div class="ui-step-meta"></div>
		</li>
	</ul>
</div>
<div class="step-region clearfix">
	<div class="info-region">
		<div class="info-div">退款信息</div>
		<div>
			<div class="info-goods">
				<div class="ui-centered-image">
					<img src="/upload/goods/14993428741404.jpg">
				</div>
				<div class="info-goods-content">
					<div>home指纹识别 苹果6s按键贴iphone7plus按键贴5s手机配件可爱卡通 - 粉色 </div>
				</div>
			</div>
			<div class="dashed-line"></div>
		</div>
		<table class="info-table">
			<tbody>
				<tr>
					<th>退款方式：</th>
					<td>
						<span class="color-orange">退款，退货</span>
					</td>
				</tr>
				<tr>
					<th>申请退款：</th>
					<td><span class="color-orange">0.00</span>元</td>
				</tr>
				<tr>
					<th>实际退款：</th>
					<td><span class="color-orange">0</span>元</td>
				</tr>
								<tr>
					<th>退还余额：</th>
					<td><span class="color-orange">26.10</span>元</td>
				</tr>
								<tr>
					<th>退款原因：</th>
					<td>买错/多买/不想要</td>
				</tr>
			</tbody>
		</table>
	</div>
	<div class="state-region">
		<div style="padding: 0px 0px 30px 40px;">
			<div class="state-title"><span class="icon info">!</span>订单状态：等待买家退货</div>
			<div class="state-action">
						</div>
		</div>
		<div class="state-remind-region">
			<div class="dashed-line"></div>
			<div class="state-remind"><div class="tixing">单商户B2C提醒：</div>
				<ul><li>如果无法发货，请及时与买家联系并说明情况后进行退款；</li>
				<li>买家申请退款后，须征得买家同意后再发货，否则买家有权拒收货物；</li>
				<li>买家付款后超过7天仍未发货，将有权申请客服介入发起退款维权；</li></ul>
			</div>
		</div>
	</div>
</div>
<div class="safeguard-log">
	<div class="info-div">协商记录</div>
	<table>
			<tbody>
			<tr class="tr-title">
				<td>买家</td>
				<td class="td-time">2018-08-02 16:46:51</td>
			</tr>
			<tr>
				<td colspan="2">
					<span>【买家申请退款】</span>
					
				</td>
			</tr>
		</tbody>
			<tbody>
			<tr class="tr-title">
				<td>卖家</td>
				<td class="td-time">2018-08-02 16:47:37</td>
			</tr>
			<tr>
				<td colspan="2">
					<span>【等待买家退货】</span>
					
				</td>
			</tr>
		</tbody>
		</table>
</div>
</div>
<div class="modal fade hide" id="confirmRefund" tabindex="-1" aria-labelledby="确认退款" aria-hidden="true" data-backdrop="static" style="width: 650px; overflow: overlay;top:50%;">
	<div class="modal-dialog">
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
				<h3>确认退款</h3>
			</div>
			<div class="modal-body">
			
				<div class="refunds-block">
					<label>退款金额：</label>
					<input type="text" id="refund_money_input" class="form-control" placeholder="请填写退款金额">
					<span class="operating-hint">请输入退款金额</span>
				</div>
				<div class="refunds-block">
					<label>退款方式：</label>
					<select id="refund_way_select"></select>
				</div>
				<div class="refunds-block">
					<label class="w130">买家申请退款金额：</label>
					<span id="apply_money">0.00元</span>
				</div>
				<div class="refunds-block">
					<label class="w130">买家实际付款金额：</label>
					<span id="pay_money">0.00元</span>
				</div>
				<div class="refunds-block" style="display:none;">
					<label class="w130">自动退还余额：</label>
					<span id="balance_refund">0.00元</span>
				</div>
				
			</div>
			<div class="modal-footer">
				<!-- 温馨提示 -->
				<div class="refunds-block js-not-configured-prompt"></div>
				<input type="hidden" id="confirm_id">
				<input type="hidden" id="confirm_order_id">
				<input type="hidden" id="confirm_order_goods_id">
				<input type="hidden" id="refund_require_money">
				<button class="btn-common js-confirm-refund-ok disabled">确认</button>
				<button class="btn" data-dismiss="modal" aria-hidden="true">取消</button>
			</div>
		</div>
	</div>
</div>
<div class="modal hide fade" tabindex="-1" aria-labelledby="退款操作提醒" aria-hidden="true" data-backdrop="static" id="refundOperationReminder" style="width:600px;top: 50%;">
	<div class="modal-dialog">
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
				<h3>退款操作提醒</h3>
			</div>
			<div class="modal-body">
				<div class="js-confirmation"></div>
				
				<label>备注：</label>
				<textarea rows="4" placeholder="退款备注，最多可输入200个字符。(如果不填，系统将会自动添加默认退款备注，格式为：订单编号:201710180000031，退款方式为:[微信支付]，退款金额:0.00元，退款余额:0.00元)" id="refund-remark"></textarea>
				
				<!-- 温馨提示 -->
				<div class="refunds-block js-confirmation-prompt"></div>
			</div>
			<div class="modal-footer">
				<button class="btn-common disabled" id="countdown_refund_confirm">确定</button>
				<button class="btn" data-dismiss="modal" aria-hidden="true">取消</button>
			</div>
		</div>
	</div>
</div>
<div class="modal hide fade" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true" id="refuseRefund" style="width:300px;">
	<div class="modal-dialog">
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
				<h3>拒绝退款</h3>
			</div>
			<div class="modal-body">
				<p>您可以拒绝本次退款或者永久拒绝</p>
			</div>
			<div class="modal-footer">
				<input type="hidden" id="refuse_id">
				<input type="hidden" id="refuse_order_id">
				<input type="hidden" id="refuse_order_goods_id">
				<button class="btn-common" onclick="refuseRefundType(1)">拒绝本次</button>
				<button class="btn" onclick="refuseRefundType(2)">永久拒绝</button>
			</div>
		</div>
	</div>
</div>
<div class="modal hide fade" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true" id="agreeRefund" style="width:300px;">
	<div class="modal-dialog">
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
				<h3>同意退款</h3>
			</div>
			<div class="modal-body">
				<p>确定要同意退款吗？</p>
			</div>
			<div class="modal-footer">
				<input type="hidden" id="agreee_id">
				<input type="hidden" id="agreee_order_id">
				<input type="hidden" id="agree_order_goods_id">
				<button class="btn-common" onclick="agreeRefund()">同意</button>
				<button class="btn" data-dismiss="modal" aria-hidden="true">取消</button>
			</div>
		</div>
	</div>
</div>
<div class="modal hide fade" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true" id="confirm_receipt" style="width:400px;">
	<div class="modal-dialog">
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
				<h3>确认收货</h3>
			</div>
			<div class="modal-body">
				<div style="height: 35px;line-height: 35px;">
					物流公司：<span id="logistics_company"></span>
				</div>
				<div style="height: 35px;line-height: 35px;">
					物流单号：<span id="logistics_number"></span>
				</div>
				<div style="height: 35px;line-height: 35px;">
					是否入库：
					<label for="no" style="display: inline-block;font-weight: normal;">否</label>
					<input type="radio" name="isStorage" id="no" style="margin-top: -2px;" checked="">
					<label for="yes" style="display: inline-block;font-weight: normal;margin-left: 15px;">是</label><input type="radio" name="isStorage" id="yes" style="margin-top: -2px;margin-left: 5px;">
				</div>
				<div id="storage_num" style="display: none;">
					入库件数：<input type="number">
				</div>
			</div>
			<div class="modal-footer">
				<input type="hidden" id="hide_id">
				<input type="hidden" id="hide_order_id">
				<input type="hidden" id="hide_order_goods_id">
				<input type="hidden" id="hide_receipt_goods_id">
				<input type="hidden" id="hide_receipt_sku_id">
				<button class="btn" onclick="confirm_receipt()">同意</button>
				<button class="btn" onclick="cancel_receipt()">取消</button>
			</div>
		</div>
	</div>
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
