<template>
    
	<section class="ns-base-section">
		
		
		
		<div style="position:relative;margin:0;">
			<!-- 面包屑导航 -->
						<div class="breadcrumb-nav">
				<a href="http://b2c.niuteam.cn/admin.html">单商户B2C</a>
									<i class="fa fa-angle-right"></i>
					<a href="http://b2c.niuteam.cn/admin/order/orderlist.html">订单</a>
									<i class="fa fa-angle-right"></i>
					<!-- 需要加跳转链接用这个：http://b2c.niuteam.cn/admin/Order/bargainOrder -->
					<a href="javascript:;" style="color:#999;">砍价订单</a>
							</div>
						<!-- 三级导航菜单 -->
			
								<nav class="ns-third-menu">
					<ul>
												<li class="selected" onclick="location.href='http://b2c.niuteam.cn/admin/Order/orderList.html';">全部</li>
													<li onclick="location.href='http://b2c.niuteam.cn/admin/order/orderlist.html?status=0';">待付款</li>
													<li onclick="location.href='http://b2c.niuteam.cn/admin/order/orderlist.html?status=1';">待发货</li>
													<li onclick="location.href='http://b2c.niuteam.cn/admin/order/orderlist.html?status=2';">已发货</li>
													<li onclick="location.href='http://b2c.niuteam.cn/admin/order/orderlist.html?status=3';">已收货</li>
													<li onclick="location.href='http://b2c.niuteam.cn/admin/order/orderlist.html?status=4';">已完成</li>
													<li onclick="location.href='http://b2c.niuteam.cn/admin/order/orderlist.html?status=5';">已关闭</li>
													<li onclick="location.href='http://b2c.niuteam.cn/admin/order/orderlist.html?status=-1';">退款中</li>
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
			
<input type="hidden" id="order_id">
<input type="hidden" id="print_select_ids">
<input type="hidden" id="order_status" value="">
<div>	
	<table class="mytable select">
		<tbody><tr>
			<th align="left">
				<button onclick="dataExcel()" class="btn-common">导出数据</button>
		
				<a class="btn-common-white" id="PrintOrder" href="javascript:;">
					<i class="fa fa-print"></i>
					<span>打印订单</span>
				</a>
							</th>
			<th style="position: relative;">
				<span>下单时间：</span>
				<input type="text" id="startDate" class="input-common middle" placeholder="请选择开始日期" onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm:ss'})">
				&nbsp;-&nbsp;
				<input type="text" id="endDate" placeholder="请选择结束日期" class="input-common middle" onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm:ss'})">
				<button class="btn-common-white more-search"><i class="fa fa-chevron-down"></i></button>
				<button onclick="searchData()" class="btn-common">搜索</button>

				<!-- 更多搜索 -->
				<div class="more-search-container">
					<dl>
						<dt>订单编号：</dt>
						<dd>
							<input id="orderNo" class="input-common middle" type="text">
						</dd>
					</dl>
					<dl>
						<dt>收货人姓名：</dt>
						<dd>
							<input id="userName" class="input-common middle" type="text">
						</dd>
					</dl>
					<dl>
						<dt>收货人手机号：</dt>
						<dd>
							<input id="receiverMobile" class="input-common middle" type="text">
						</dd>
					</dl>
					<dl>
						<dt>支付方式：</dt>
						<dd>
							<div class="selectric-wrapper selectric-select-common selectric-middle" style="width: 150px;"><div class="selectric-hide-select"><select id="payment_type" class="select-common middle" tabindex="-1">
								<option value="">全部</option>
								<option value="1">微信</option>
								<option value="2">支付宝</option>
								<option value="10">线下支付</option>
								<option value="4">货到付款</option>
							</select></div><div class="selectric"><span class="selectric-label">全部</span><button class="selectric-button">▾</button></div><div class="selectric-items" tabindex="-1"><div class="selectric-scroll"><ul><li data-index="0" class="selected" title="全部">全部</li><li data-index="1" class="" title="微信">微信</li><li data-index="2" class="" title="支付宝">支付宝</li><li data-index="3" class="" title="线下支付">线下支付</li><li data-index="4" class="last" title="货到付款">货到付款</li></ul></div></div><input class="selectric-input" tabindex="0"></div>
						</dd>
					</dl>
					<dl>
						<dt>配送方式：</dt>
						<dd>
							<div class="selectric-wrapper selectric-select-common selectric-middle" style="width: 150px;"><div class="selectric-hide-select"><select id="shipping_type" class="select-common middle" tabindex="-1">
								<option value="0">全部</option>
								<option value="1">物流配送</option>
								<option value="2">买家自提</option>
								<option value="3">本地配送</option>
							</select></div><div class="selectric"><span class="selectric-label">全部</span><button class="selectric-button">▾</button></div><div class="selectric-items" tabindex="-1"><div class="selectric-scroll"><ul><li data-index="0" class="selected" title="全部">全部</li><li data-index="1" class="" title="物流配送">物流配送</li><li data-index="2" class="" title="买家自提">买家自提</li><li data-index="3" class="last" title="本地配送">本地配送</li></ul></div></div><input class="selectric-input" tabindex="0"></div>
						</dd>
					</dl>
					<dl>
						<dt></dt>
						<dd><button onclick="searchData()" class="btn-common">搜索</button></dd>
					</dl>
				</div>
			</th>
		</tr>
	</tbody></table>
	
	<table class="table-class" id="ajax-orderlist">
		<colgroup>
			<col width="2%">
			<col width="34%">
			<col width="14%">
			<col width="10%">
			<col width="10%">
			<col width="6%">
			<col width="7%">
			<col width="7%">
			<col width="10%">
		</colgroup>
		<thead>
			<tr align="center">
				<th>
					<i class="checkbox-common">
						<input type="checkbox" onclick="CheckAll(this)" id="check">
					</i>
				</th>
				<th>商品信息</th>
				<th>商品清单</th>
				<th>订单金额</th>
				<th>收货信息</th>
				<th>买家</th>
				<th>交易状态</th>
				<th>配送方式</th>
				<th>操作</th>
			</tr>
		</thead>
		<tbody id="ajax-orderlist"><tr><td rowspan="1"><i class="checkbox-common"><input id="153137826366141000" type="checkbox" value="316" name="sub"></i></td><td><div style="font-size: 12px;color: #126AE4;margin-bottom:5px;"><span>订单编号：2018071214490001</span>&nbsp;<span>下单时间：2018-07-12 14:49:11</span></div><div class="product-img"><img src="/upload/goods/1499339438694.jpg"></div><div class="product-infor"><a href="http://b2c.niuteam.cn/goods/goodsinfo?goodsid=30" target="_blank" style="color:#333;">浴霸智能开关 触摸86型卫生间风暖通用防水4四五合一5开开关面板</a></div></td><td><div class="cell" style="display: inline-block;"><span>180.00元</span></div><div class="cell" style="display: inline-block;float:right;">1件</div><a href="http://b2c.niuteam.cn/admin/order/orderrefunddetail?itemid=347" style="margin:5px 0 10px 0;display:block;">退款已成功</a></td><td rowspan="1" style="text-align:center"><div class="cell"><b class="netprice" style="color: #FF6600;font-size: 14px;font-weight: normal;">144.00</b><br><span class="expressfee">(含配送费:0.00元)</span><br><span class="expressfee">线下支付</span></div></td><td rowspan="1" style="text-align:center"><div style="text-align:left;"><span class="expressfee">22222222</span><br><span class="expressfee">14725698564</span><br><span class="expressfee">广西壮族自治区&nbsp;河池市&nbsp;大化瑶族自治县&nbsp;22</span></div></td><td rowspan="1" style="text-align:center"><div class="cell">admin<br><i class="fa fa-mobile fa-2x" style="color:#666;"><i></i></i></div></td><td rowspan="1"><div class="business-status" style="text-align:center">已关闭<br></div></td><td rowspan="1"><div class="business-status" style="text-align:center">物流配送<br></div></td><td rowspan="1" style="text-align:center;"><a style="display:block;margin-bottom:5px;" href="http://b2c.niuteam.cn/admin/order/bargainOrderDetail?order_id=316">订单详情</a><a style="display:block;margin-bottom:5px;color:#666666" href="javascript:operation('seller_memo',316)">备注</a><a style="display:block;margin-bottom:5px;color:#ff0000" href="javascript:operation('delete_order',316)">删除订单</a></td></tr><tr style="height:10px;"><td style="border-bottom:solid #E1E6F0;border-width:0 0 1px 0;" colspan="10"></td></tr><tr><td rowspan="1"><i class="checkbox-common"><input id="152946198724741000" type="checkbox" value="217" name="sub"></i></td><td><div style="font-size: 12px;color: #126AE4;margin-bottom:5px;"><span>订单编号：2018062010330001</span>&nbsp;<span>下单时间：2018-06-20 10:33:07</span></div><div class="product-img"><img src="/upload/goods/20180609/8fae147e6438e98450112f0a6c39022f4.jpg"></div><div class="product-infor"><a href="http://b2c.niuteam.cn/goods/goodsinfo?goodsid=77" target="_blank" style="color:#333;">212313132</a><p class="specification" style="margin-bottom: 0px;"><span style="color:#8e8c8c;font-size:12px;">土豪金 </span></p><p class="specification"><span style="color:#8e8c8c;font-size:12px;">编码&nbsp;&nbsp;5</span></p></div></td><td><div class="cell" style="display: inline-block;"><span>5.00元</span></div><div class="cell" style="display: inline-block;float:right;">1件</div></td><td rowspan="1" style="text-align:center"><div class="cell"><b class="netprice" style="color: #FF6600;font-size: 14px;font-weight: normal;">0.50</b><br><span class="expressfee">(含配送费:0.00元)</span><br><span class="expressfee">微信支付</span></div></td><td rowspan="1" style="text-align:center"><div style="text-align:left;"><span class="expressfee">cqinter</span><br><span class="expressfee">18696529503</span><br><span class="expressfee">四川省&nbsp;巴中市&nbsp;通江县&nbsp;dddd</span></div></td><td rowspan="1" style="text-align:center"><div class="cell">cqinter<br><i class="fa fa-mobile fa-2x" style="color:#666;"><i></i></i></div></td><td rowspan="1"><div class="business-status" style="text-align:center">已关闭<br></div></td><td rowspan="1"><div class="business-status" style="text-align:center">物流配送<br></div></td><td rowspan="1" style="text-align:center;"><a style="display:block;margin-bottom:5px;" href="http://b2c.niuteam.cn/admin/order/bargainOrderDetail?order_id=217">订单详情</a><a style="display:block;margin-bottom:5px;color:#666666" href="javascript:operation('seller_memo',217)">备注</a><a style="display:block;margin-bottom:5px;color:#ff0000" href="javascript:operation('delete_order',217)">删除订单</a></td></tr></tbody>
	</table>
</div>

<div id="orderAction">

<!-- 模态框（Modal） -->
<div id="edit-price" class="modal hide fade" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true" style="width: 650px;overflow: overlay;">
	<div class="modal-header">
		<button type="button" class="close" data-dismiss="modal" aria-hidden="true" style="margin-right: 10px;">×</button>
		<h3 id="H1">修改价格</h3>
	</div>
	<div class="modal-body">
		<table class="table table-striped table-main table-order-header">
			<colgroup>
				<col style="width: 40%;">
				<col style="width: 20%;">	
				<col style="width: 25%;">
				<col style="width: 15%;">
			</colgroup>
			<tbody>
				<tr>
					<td>商品信息</td>
					<td>商品清单</td>
					<td>
						<div class="editprice-tiptxt">涨价或减价<i class="icon-tip"></i>
							<p class="text-tip">-表示减价<i class="icon-down-pic"></i></p>
						</div>
					</td>
					<td>邮费</td>
				</tr>
			</tbody>
		</table>
		<table class="table table-bordered table-order-list">
			<colgroup>
				<col style="width: 40%;">
				<col style="width: 20%;">
				<col style="width: 25%;">
				<col style="width: 15%;">
			</colgroup>
			<tbody id="OrderCommodity"></tbody>
		</table>
		<ul class="edit-price-amountpay">
			<li>
				<span class="amountpay-label">商品总价：</span>
				<span class="amountpay-price" id="goodsmoney"></span>元&nbsp;&nbsp;&nbsp;
				<span class="amountpay-label">商品优惠：</span>
				<span class="amountpay-price" id="discountmoney"></span>元&nbsp;&nbsp;&nbsp;
				<span class="amountpay-label">运费：</span>
				<span class="amountpay-price" id="modifiedFreight"></span>元
			</li>
			<li>
				<div>
					实收款： <span class="amountpay-price reality-price" id="changeTotal"></span>元
					<input type="hidden" id="hiedchangeTotal">
				</div>
			</li>
		</ul>
	</div>
	<div class="modal-footer">
		<button class="btn-common btn-big" onclick="updPrice()" id="butSubmit">保存</button>
		<button class="btn-common-cancle btn-big" data-dismiss="modal" aria-hidden="true">关闭</button>
	</div>
</div>

<div class="modal hide fade" id="Delivery" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true" style="left:32%">
	<div class="modal-dialog">
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
				<h3>商品发货</h3>
			</div>
			<div class="modal-body">
				<!-- 主要内容 -->
				<div style="padding: 0 0 10px 0;">待发货(<span id="no_shipping_num"></span>)，已选<span id="checkedbox">0</span></div>
				<table class="table-class" style="margin-bottom:10px;">
					<thead>
						<tr>
							<th>
								<i class="checkbox-common"><input type="checkbox" id="inlineCheckbox1" onclick="deliveryCheckAll(this)"></i>
							</th>
							<th></th>
							<th>商品</th>
							<th>数量</th>
							<th>物流 | 单号</th>
							<th>状态</th>
						</tr>
					</thead>
					<colgroup>
						<col style="width: 5%;">
						<col style="width: 10%;">
						<col style="width: 40%;">
						<col style="width: 10%;">
						<col style="width: 20%;">
						<col style="width: 15%;">
					</colgroup><colgroup>
					</colgroup><tbody></tbody>
				</table>
				<div>
					<div style="margin-bottom:5px;">发货方式：</div>
					<label class="checkbox-inline" style="float:left;margin-right:30px;">
						<i class="radio-common">
							<input type="radio" name="shipping_type" id="shipping_type0" value="0">
						</i>
						<span>无需物流</span>
					</label>
					<label class="checkbox-inline" style="float:left;">
						<i class="radio-common selected">
							<input type="radio" name="shipping_type" id="shipping_type1" value="1" checked="checked">
						</i>
						<span>需要物流</span>
					</label>
				</div>
				<div style="clear:both;"></div>
				<div class="form-group" id="express_input" style="margin:5px 0 10px 0;">
					<select class="form-control" id="divlogistics_express_company"></select>
					<input type="text" id="divlogistics_express_no" class="input-common" placeholder="请填写快递单号" style="vertical-align:2px;">
				</div>
				<div id="receiver_info" style="clear:both;"></div>
			</div>
			
			<div class="modal-footer">
				<input type="hidden" id="o2o_delivery_order_id">
				<button class="btn-common btn-big" onclick="orderDeliverySubmit()">保存</button>
				<button class="btn-common-cancle btn-big" data-dismiss="modal">关闭</button>
			</div>
		</div>
	</div>
</div>

<!-- 本地配送模态框 -->
<div class="modal hide fade" id="o2o_Delivery" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true" style="left:32%">
	<div class="modal-dialog">
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
				<h3>商品发货</h3>
			</div>
			<div class="modal-body">
				<!-- 主要内容 -->
				<div>待发货(<span id="o2o_shipping_num"></span>)</div>
				<table class="table table-hover" style="margin-bottom:10px;">
					<thead>
						<tr>
							<td>商品</td>
							<td>数量</td>
						</tr>
					</thead>
					<colgroup>
						<col style="width: 60%;">
						<col style="width: 40%;">
					</colgroup><colgroup>
					</colgroup><tbody></tbody>
				</table>
				<div>
					<div style="margin-bottom:5px;">配送人员：</div>
				</div>
				<div style="clear:both;"></div>
				<div class="form-group" id="express_input">
					<select class="form-control input-lg" id="o2o_delivery_user"></select>
					<input type="text" id="o2o_delivery_no" class="input-common" placeholder="请填写配送单号" style="vertical-align:2px;">
				</div>
				<div id="receiver_info"></div>
				<div>
					<div style="margin-bottom:5px;">备注：</div>
					<textarea class="remark textarea-common" style=" width: 440px;height: 80px;" maxlength="500"></textarea>
				</div>
			</div>
			
			<div class="modal-footer">
				<input type="hidden" id="delivery_order_id">
				<button class="btn-common btn-big" onclick="o2oDeliverySubmit()">提交更改</button>
				<button class="btn-common-cancle btn-big" data-dismiss="modal">关闭</button>
			</div>
		</div>
	</div>
</div>


<!-- 自提模态 -->
<div class="modal hide fade" id="pickup" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true" style="margin-left:-365px; width: 700px;">
	<div class="modal-dialog">
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
				<h3>商品提货</h3>
			</div>
			<div class="modal-body">
				<!-- 主要内容 -->
				<table class="table table-hover" style="margin-bottom:10px;">
					<thead></thead>
					<colgroup></colgroup><colgroup>
					</colgroup><tbody></tbody>
				</table>
				
				<div class="form-group">
					<div class="pick_title"><span class="required">*</span>提货人：</div>
					<div class="col-lg-4"><input type="text" id="pickup_name" class="form-control input-common" placeholder="请填写提货人姓名"></div>
				</div>
				<div class="form-group">
					<div class="pick_title"><span class="required">*</span>提货人手机号：</div>
					<div class="col-lg-4"><input type="text" id="pickup_mobile" class="form-control input-common" placeholder="请填写提货人手机号"></div>
				</div>
				<div class="form-group">
					<div class="pick_title">备注：</div>
					<div class="col-lg-2"><textarea id="pickup_desc" class="textarea-common"></textarea></div>
				</div>
			
			</div>
			
			<div class="modal-footer">
				<input type="hidden" id="pickup_order_id">
				<button class="btn-common btn-big" onclick="orderPickupSubmit(pickup_order_id)">确认提货</button>
				<button class="btn-common-cancle btn-big" data-dismiss="modal">关闭</button>
			</div>
		</div>
	</div>
</div>
<!-- 修改收货地址模态 -->
<div class="modal hide fade" id="update_address" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true" style="margin-left:-365px; width: 700px;">
	<div class="modal-dialog">
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
				<h3>修改收货地址</h3>
			</div>
			<div class="modal-body">
				<div class="form-group">
					<div class="pick_title"><span class="required">*</span>收货人：</div>
					<div class="col-lg-4"><input type="text" id="receiver_name" class="form-control input-common" style="width:350px;margin-bottom:10px !important;"></div>
				</div>
				<div class="form-group">
					<div class="pick_title"><span class="required">*</span>收货人手机号：</div>
					<div class="col-lg-4"><input type="text" id="receiver_mobile" class="form-control input-common" style="width:350px;margin-bottom:10px !important;"></div>
				</div>
				<div class="form-group">
					<div class="pick_title">收货人固定电话：</div>
					<div class="col-lg-4"><input type="text" id="fixed_telephone" class="form-control input-common" style="width:350px;margin-bottom:10px !important;"></div>
				</div>
				<div class="form-group">
					<div class="pick_title">收货人邮编：</div>
					<div class="col-lg-4"><input type="text" id="receiver_zip" class="form-control input-common" style="width:350px;margin-bottom:10px !important;" maxlength="6" onkeyup="this.value=this.value.replace(/\D/g,'')"></div>
				</div>
				<div class="form-group" style="width:100%;margin-bottom: 10px;">
					<div class="pick_title"><span class="required">*</span>收货地址：</div>
					<div class="address_choice">
						<div class="selectric-wrapper selectric-select-common selectric-harf" style="width: 125px;"><div class="selectric-hide-select"><select name="province" id="seleAreaNext" onchange="GetProvince();" class="select-common harf" tabindex="-1">
							
						<option value="-1">请选择省</option><option value="34">台湾省</option><option value="19">广东省</option><option value="20">广西壮族自治区</option><option value="21">海南省</option><option value="22">重庆市</option><option value="23">四川省</option><option value="24">贵州省</option><option value="25">云南省</option><option value="26">西藏自治区</option><option value="27">陕西省</option><option value="28">甘肃省</option><option value="29">青海省</option><option value="30">宁夏回族自治区</option><option value="31">新疆维吾尔自治区</option><option value="32">香港特别行政区</option><option value="33">澳门特别行政区</option><option value="18">湖南省</option><option value="17">湖北省</option><option value="2">天津市</option><option value="3">河北省</option><option value="4">山西省</option><option value="5">内蒙古自治区</option><option value="6">辽宁省</option><option value="7">吉林省</option><option value="8">黑龙江省</option><option value="9">上海市</option><option value="10">江苏省</option><option value="11">浙江省</option><option value="12">安徽省</option><option value="13">福建省</option><option value="14">江西省</option><option value="15">山东省</option><option value="16">河南省</option><option value="1">北京市</option></select></div><div class="selectric"><span class="selectric-label">请选择省</span><button class="selectric-button">▾</button></div><div class="selectric-items" tabindex="-1"><div class="selectric-scroll"><ul><li data-index="0" class="selected" title="请选择省">请选择省</li><li data-index="1" class="" title="台湾省">台湾省</li><li data-index="2" class="" title="广东省">广东省</li><li data-index="3" class="" title="广西壮族自治区">广西壮族自治区</li><li data-index="4" class="" title="海南省">海南省</li><li data-index="5" class="" title="重庆市">重庆市</li><li data-index="6" class="" title="四川省">四川省</li><li data-index="7" class="" title="贵州省">贵州省</li><li data-index="8" class="" title="云南省">云南省</li><li data-index="9" class="" title="西藏自治区">西藏自治区</li><li data-index="10" class="" title="陕西省">陕西省</li><li data-index="11" class="" title="甘肃省">甘肃省</li><li data-index="12" class="" title="青海省">青海省</li><li data-index="13" class="" title="宁夏回族自治区">宁夏回族自治区</li><li data-index="14" class="" title="新疆维吾尔自治区">新疆维吾尔自治区</li><li data-index="15" class="" title="香港特别行政区">香港特别行政区</li><li data-index="16" class="" title="澳门特别行政区">澳门特别行政区</li><li data-index="17" class="" title="湖南省">湖南省</li><li data-index="18" class="" title="湖北省">湖北省</li><li data-index="19" class="" title="天津市">天津市</li><li data-index="20" class="" title="河北省">河北省</li><li data-index="21" class="" title="山西省">山西省</li><li data-index="22" class="" title="内蒙古自治区">内蒙古自治区</li><li data-index="23" class="" title="辽宁省">辽宁省</li><li data-index="24" class="" title="吉林省">吉林省</li><li data-index="25" class="" title="黑龙江省">黑龙江省</li><li data-index="26" class="" title="上海市">上海市</li><li data-index="27" class="" title="江苏省">江苏省</li><li data-index="28" class="" title="浙江省">浙江省</li><li data-index="29" class="" title="安徽省">安徽省</li><li data-index="30" class="" title="福建省">福建省</li><li data-index="31" class="" title="江西省">江西省</li><li data-index="32" class="" title="山东省">山东省</li><li data-index="33" class="" title="河南省">河南省</li><li data-index="34" class="last" title="北京市">北京市</li></ul></div></div><input class="selectric-input" tabindex="0"></div>
						<select name="city" id="seleAreaThird" onchange="getSelCity();" class="select-common harf">
							
						<option value="-1">请选择市</option></select>
						<select name="district" id="seleAreaFouth" class="select-common harf">
							<option value="-1">请选择区/县</option>
						</select>
						<input type="hidden" id="provinceid" value="-1">
						<input type="hidden" id="cityid">
						<input type="hidden" id="districtid">
					</div>
				</div>
				<div class="form-group">
					<div class="pick_title"><span class="required">*</span>详细地址：</div>
					<div class="col-lg-4"><input type="text" id="address_detail" class="form-control input-common" style="width:350px"></div>
				</div>
			</div>
			
			<div class="modal-footer">
				<input type="hidden" id="update_address_id">
				<button type="button" class="btn-common btn-big" onclick="updateAddressSubmit(update_address_id)">修改</button>
				<button type="button" class="btn-common-white btn-big" data-dismiss="modal">关闭</button>
			</div>
		</div>
	</div>
</div>

<!-- 模态框（Modal） -->
<div class="modal fade hide" id="Memobox" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true" style="width:700px;left:45%;top:30%;">
	<div class="modal-dialog">
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
				<h3>备注信息</h3>
			</div>
			<div class="set-style">
				<dl>
					<dt><span class="required">*</span>备注:</dt>
					<dd>
						<p>
							<textarea rows="3" cols="20" id="memo" class="textarea-common"></textarea>
						</p>
						<p class="error">请输入备注</p>
					</dd>
				</dl>
			</div>
			<div class="modal-footer">
				<button type="button" class="btn-common btn-big" onclick="addMemoAjax()">保存</button>
				<button class="btn-common-cancle btn-big" data-dismiss="modal">关闭</button>
			</div>
		</div>
	</div>
</div>


<!-- 修改运单号 -->
<div class="modal hide fade" id="update_express" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true" style="width: 700px; left: 45%; top: 30%; display: none;">
	<div class="modal-dialog">
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
				<h3>修改运单号</h3>
			</div>
	 			<div class="modal-body">
					<div style="margin-bottom:5px;">发货方式：</div>
					<label class="checkbox-inline" style="float:left;margin-right:30px;"><input type="radio" name="shipping_type_update" id="shipping_type2" value="0"> 无需物流</label>
					<label class="checkbox-inline" style="float:left;"><input type="radio" name="shipping_type_update" id="shipping_type3" value="1" checked="checked"> 需要物流</label>
				
					<div style="clear:both;"></div>
					<div class="form-group" id="update_express_input">
						<select class="form-control input-lg" id="update_divlogistics_express_company" style="margin-bottom:5px;margin-right:15px;float:left;"></select>
						<div class="col-lg-2"><input type="text" id="update_divlogistics_express_no" class="form-control" placeholder="请填写快递单号" style="height:19px;"></div>
					</div>
					<div id="receiver_infos"></div>
				</div>
			</div>
			
			<div class="modal-footer">
				<input type="hidden" id="order_goods_express_id">
				<button class="btn-common btn-big" onclick="updateExpressAjax()">提交更改</button>
				<button class="btn-common-cancle btn-big" data-dismiss="modal">关闭</button>
			</div>
		</div>
	</div>









<!-- 打印发货单 -->
<div id="prite-send" class="modal hide fade" data-backdrop="static" role="dialog" tabindex="-1" aria-labelledby="myModalLabel" aria-hidden="true" style="margin-left:-536px;border-radius: 0;">
	<div class="modal-header">
		<button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
		<h3>打印发货单</h3>
	</div>
	<div class="modal-body" style="height: 282px; overflow: auto;">
		<div class="ordercontent">
			<div class="data-body-head">
				<table class="table table-border-row header-table" style="margin-bottom: 0;">
					<colgroup>
						<col style="width: 25%">
						<col style="width: 37%">
						<col style="width: 18%">
						<col style="width: 20%">
					</colgroup>
					<tbody><tr style="background: #F2F6FC;">
						<th>订单编号</th>
						<th>商品名称</th>
						<th>快递公司</th>
						<th>运单号</th>
					</tr>
				</tbody></table>
			</div>
			<div class="data-table-body" style="height: 240px;">
				<table class="table table-border-row" style="margin-bottom: 0;">
					<colgroup>
						<col style="width: 25%">
						<col style="width: 37%">
						<col style="width: 18%">
						<col style="width: 20%">
					</colgroup>
					<tbody id="InvoiceList"></tbody>
				</table>
			</div>
		</div>
		<form class="form-horizontal" style="display: none;">
			<div class="control-group">
				<label class="control-label" for="deliveryShopInfo"><span class="color-red">*</span>发件人</label>
				<div class="controls">
					<select id="deliveryShopInfo" class="input-large"></select>
					<span class="help-block" style="display: none;">请输入选择发件人</span>
				</div>
			</div>
			<div class="control-group">
				<label class="control-label"></label>
				<div class="controls">
					<label class="checkbox"></label>
				</div>
			</div>
		</form> 
	</div>
	<a id="invoicePrintingURL" style="display: none;" target="_blank"></a>
	<div class="modal-footer">
		<button class="btn-common" id="invoicePrinPreview" aria-hidden="true">打印预览</button>
		<button class="btn-common-cancle btn-big" data-dismiss="modal" aria-hidden="true">关闭</button>
	</div>
</div>

<!-- 打印出库单 -->
<div id="print-billOfSales" class="modal hide fade" role="dialog" tabindex="-1" aria-labelledby="myModalLabel" aria-hidden="true" style="margin-left:-536px;border-radius: 0;" data-backdrop="static">
	<div class="modal-header">
		<button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
		<h3>打印出库单</h3>
	</div>
	<div class="modal-body" style="height: 282px; overflow: auto;">
		<div class="ordercontent">
			<div class="data-body-head">
				<table class="table table-border-row header-table" style="margin-bottom: 0;">
					<colgroup>
						<col style="width: 29%">
						<col style="width: 15%">
						<col style="width: 8%">
						<col style="width: 8%">
						<col style="width: 15%">
						<col style="width: 15%">
					</colgroup>
					<tbody><tr style="background: #F2F6FC;border-bottom:1px solid #ddd">
						<th>商品名称</th>
						<th>sku名称</th>
						<th style="text-align: center;">出库量</th>
						<th style="text-align: center;">库存量</th>
						<th>商品编码</th>
						<th style="text-align: center;">订单号</th>
					</tr>
				</tbody></table>
			</div>
			<div class="data-table-body" style="height: 240px;">
				<table class="body-table"> 
					<colgroup>
						<col style="width: 29%">
						<col style="width: 15%">
						<col style="width: 8%">
						<col style="width: 8%">
						<col style="width: 15%">
						<col style="width: 15%">
					</colgroup>
					<tbody id="billOfSales"></tbody>
				</table>
			</div>
		</div>
		<form class="form-horizontal" style="display: none;">
			<div class="control-group">
				<label class="control-label" for="deliveryShop"><span class="color-red">*</span>发件人</label>
				<div class="controls">
					<select id="deliveryShop" class="input-large"></select>
					<span class="help-block" style="display: none;">请输入选择发件人</span>
				</div>
			</div>
			<div class="control-group">
				<label class="control-label"></label>
				<div class="controls">
					<label class="checkbox"></label>
				</div>
			</div>
		</form> 
	</div>
	<a id="invoicePrintingURL" style="display: none;" target="_blank"></a>
	<div class="modal-footer">
		<button class="btn-common" onclick="printpreviewOfInvoice();" aria-hidden="true">打印预览</button>
		<button class="btn-common-cancle btn-big" data-dismiss="modal" aria-hidden="true">关闭</button>
	</div>
</div>

<!-- 打印快递单-->
<div id="prite-send-express" class="modal hide fade" role="dialog" tabindex="-1" aria-labelledby="myModalLabel" aria-hidden="true" style="margin-left:-536px;border-radius: 0;" data-backdrop="static">
	<div class="modal-header">
		<button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
		<h3>打印快递单</h3>
	</div>
	<div class="modal-body" style="height: 282px; overflow: auto;">
		<form class="form-horizontal">
			<div class="control-group">
				<label class="control-label" for="express_select"><span class="color-red">*</span>选择快递</label>
				<div class="controls">
					<select id="express_select" class="select-common">
										<option value="4">顺丰</option>
										<option value="5">cccc</option>
										<option value="6">中通快递</option>
										</select>
					<span class="help-block" style="display: none;">请选择快递</span>
				</div>
				<span><a href="http://b2c.niuteam.cn/admin/express/expresscompany.html" class="goToConfigure" style="text-decoration: underline;">前去配置</a></span>
			</div>
		</form> 
		<div class="ordercontent">
			<div class="data-body-head">
				<table class="table table-border-row header-table" style="margin-bottom: 0;border: 1px solid #ddd;border-bottom: 0;">
					<tbody><tr style="background: #F2F6FC;">
						<th style="width: 17.5%">订单编号</th>
						<th style="width: 28%">商品名称</th>
						<th style="width: 6%">已发货</th>
						<th style="width: 6%">已打印</th>
						<th style="width: 15%">快递公司</th>
						<th style="width: 18%">运单号</th>
					</tr>		
				</tbody></table>
			</div>
			<div class="data-table-body">
				<table class="table table-border-row body-table">
					<tbody id="InvoiceList-express" colspan="3">
						
					</tbody>
				</table>
			</div>
		</div>
	</div>
	<a id="invoicePrintingURL" style="display: none;" target="_blank"></a>
	<div class="modal-footer">
		<span class="tips">提示：<span style="color: #777;">选中的订单项运单号可实现自增,已发货的订单可修改快递公司和运单号</span></span>
		<button class="btn-common" id="expressPrinPreview" aria-hidden="true">打印预览</button>
		<button class="btn-common-cancle btn-big" data-dismiss="modal" aria-hidden="true">关闭</button>
	</div>
</div>

<!-- 批量发货 -->
<div id="not-shipped-order-list" role="dialog" class="modal hide fade" tabindex="-1" aria-labelledby="myModalLabel" aria-hidden="true" data-backdrop="static" style="margin-left:-536px;border-radius: 0;">
	<div class="modal-header">
		<button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
		<h3>批量发货</h3>
	</div>
	<div class="modal-body" style="height: 282px; overflow: auto;">
		<form class="form-horizontal">
			<div class="control-group">
				<label class="control-label" for="express_select"><span class="color-red">*</span>选择快递</label>
				<div class="controls">
					<select id="express_select_shipping" class="select-common">
										<option value="4">顺丰</option>
										<option value="5">cccc</option>
										<option value="6">中通快递</option>
										</select>
					<span class="help-block" style="display: none;">请选择快递</span>
				</div>
				<span><a href="http://b2c.niuteam.cn/admin/express/expresscompany.html" class="goToConfigure" style="text-decoration: underline;">前去配置</a></span>
			</div>
		</form> 
		<div class="ordercontent">
			<div class="data-body-head">
				<table class="table table-border-row header-table">
					<tbody><tr style="background: #F2F6FC;">
						<th style="width: 17.5%">订单编号</th>
						<th style="width: 32.5%">商品名称</th>
						<th style="width: 15%">快递公司</th>
						<th style="width: 18%">运单号</th>
					</tr>		
				</tbody></table>
			</div>
			<div class="data-table-body">
				<table class="table table-border-row body-table">
					<tbody id="notShippedOrderList">
						
					</tbody>
				</table>
			</div>
		</div>
	</div>
	<div class="modal-footer">
		<button class="btn-common" id="confirm_delivery" aria-hidden="true">确认发货</button>
		<button class="btn-common-cancle btn-big" data-dismiss="modal" aria-hidden="true">关闭</button>
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
					<input type="text" id="refund_money_input" class="input-common" placeholder="请填写退款金额">
					<span class="operating-hint">请输入退款金额</span>
				</div>
				<div class="refunds-block">
					<label>退款方式：</label>
					<select id="refund_way_select" class="select-common"></select>
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
				<div class="refunds-block js-confirmation-prompt"></div>
				<div style="clear: both;"></div>
			</div>
			<div class="modal-footer">
				<!-- 温馨提示 -->
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
			<li class="total-data" data-total-count="2">共2条</li>
			<!-- <li class="page-count">共0页</li> -->
			<li class="according-number">
				跳<input type="text" class="input-medium" id="skipPage" data-curr-page="1">页
			</li>
		</ul>
	</div>
</div>
<input type="hidden" id="page_count" value="1">
<input type="hidden" id="page_size" value="2">
		</div>
		
	</section>
</template>


<script>
require("@/assets/style/table.scss");
require("@/assets/style/order/list.scss");

export default {
  name: "bargainOrder",
  components: {}
};
</script>