<template>
    
	<section class="ns-base-section">
		
		
		
		<div style="position:relative;margin:0;">
			<!-- 面包屑导航 -->
						<div class="breadcrumb-nav">
				<a href="index.html">大鵬系統</a>
									<i class="fa fa-angle-right"></i>
					<a href="/promotion/coupontypelist.html">营销</a>
									<i class="fa fa-angle-right"></i>
					<!-- 需要加跳转链接用这个：http://showfx.niuteam.cn/admin/promotion/updatecoupontype -->
					<a href="javascript:;" style="color:#999;">修改优惠券</a>
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
									<p>修改优惠券类型</p>
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
<!-- 						<span>修改优惠券类型</span> -->
<!-- 						 -->
<!-- 					{1/block} -->
				</h4>
			</div>
		</div>
		
		
		<div class="ns-main">
			
<div class="space-10"></div>
<div class="set-style">
	<dl>
		<dt><span style="color:red;">*</span>&nbsp;&nbsp;名称：</dt>
		<dd>
			<input type="text" id="coupon_name" maxlength="10" value="满88元减2元" class="input-common">
			<p class="hint">10个字以内</p>
		</dd>
	</dl>
	<dl>
		<dt><span style="color:red;">*</span>&nbsp;&nbsp;面额：</dt>
		<dd><input class="input-mini w70 input-common harf" onkeyup="value=value.replace(/[^\d+(\.\d+)?]/g,'')" value="2.00" type="text" id="money"><em class="unit top">元</em></dd>
	</dl>
	<dl>
		<dt><span style="color:red;">*</span>&nbsp;&nbsp;补发数量：</dt>
		<dd><input class="input-mini w70 input-common harf" onkeyup="this.value=this.value.replace(/\D/gi,&quot;&quot;)" type="text" id="repair_count" value="0"><em class="unit top">份</em></dd>
	</dl>
	<dl>
		<dt>&nbsp;&nbsp;已发放数量：</dt>
		<dd><p>102份</p><input type="hidden" id="count" value="102"></dd>
	</dl>
	<dl>
		<dt><span style="color:red;">*</span>&nbsp;&nbsp;每人最大领取数：</dt>
		<dd>
		<input class="input-mini w70 input-common harf" onkeyup="this.value=this.value.replace(/\D/gi,&quot;&quot;)" type="text" id="max_fetch" value="10"><em class="unit top">份</em>
		<p class="hint">输入0表示无限制</p>
		</dd>
	</dl>
	<dl>
		<dt>满多少元使用：</dt>
		<dd><input class="input-mini w70 input-common harf" onkeyup="value=value.replace(/[^\d+(\.\d+)?]/g,'')" type="text" id="at_least" value="88.00"><em class="unit top">元</em></dd>
	</dl>
	<dl style="display:none;">
		<dt>领取人等级：</dt>
		<dd><input class="input-mini w70 input-common" onkeyup="this.value=this.value.replace(/\D/gi,&quot;&quot;)" type="text" id="need_user_level" value="0"><span class="help-inline">级</span></dd>
	</dl>
	<dl>
		<dt><span style="color:red;">*</span>&nbsp;&nbsp;有效时间：</dt>
		<dd>
			<div>
				<label class="radio inline normal">
					<i class="radio-common  selected "><input type="radio" value="0" name="term_of_validity_type" checked=""></i>
					<span>固定日期</span>
				</label>
				<label class="radio inline normal">
					<i class="radio-common "><input type="radio" value="1" name="term_of_validity_type"></i>
					<span>领到券当日开始N天内有效</span>
				</label>
			</div>
			<!-- 固定日期 -->
			<div class="fixed_time mTop">
				<div class="mTop">
					<span>生效时间：</span>
					<input class="input-medium input-common harf" type="text" id="start_time" style="width:250px;" onclick="WdatePicker({skin:'twoer',dateFmt:'yyyy-MM-dd HH:mm:ss'})" value="2018-07-04 18:44:44">
				</div>
				<div class="mTop">
					<span>过期时间：</span>
					<input class="input-medium input-common harf" size="15" type="text" id="end_time" style="width:250px;" onclick="WdatePicker({skin:'twoer',dateFmt:'yyyy-MM-dd HH:mm:ss'})" value="2018-08-31 14:50:04">
				</div>
				<p class="error">请输入有效时间</p>
				<p class="hint">生效前买家可以领取但不能使用</p>
			</div>
			<!-- 相对时间 -->
			<div class="relative_time mTop" style="display: none;">
				<p>领取之日起<input type="number" min="1" max="365" id="fixed_term" class="input-common short" style="margin:0 5px!important;display: inline-block;" value="1">天内有效</p>
				<span class="error">生效天数必须在1到365内</span>
			</div>
		</dd>
	</dl>
	<dl>
		<dt>是否允许首页显示：</dt>
		<dd>
			<p>
				<input id="is_show" type="checkbox" class="checkbox" simpleswitch="0" result="false" style="display: none;"><div class="Switch Switch_FlatRadius" id="Switch0"><span class="switch-open">是</span><span class="switch-close">否</span></div>
			</p>
		</dd>
	</dl>
	<!-- 所有决定商品弹框内容的条件和存放商品id的隐藏域 -->
	<span id="goods-condition">
		<input type="hidden" name="type" value="2">
		<input type="hidden" name="stock" value="1">
		<input type="hidden" name="goods_type" value="1">
		<input type="hidden" name="is_have_sku" value="1">
		<input type="hidden" name="state" value="1">
		<input type="hidden" id="goods_id_array" value="">
		<input type="hidden" id="range_type" value="1">
		<input type="hidden" id="is_show_select" value="1">
		<input type="hidden" id="action" value="">
	</span>

<!-- 切换全部与部分 -->
<dl style="" id="select-box">
	<dt>参与商品：</dt>
	<dd>
		<div class="total" id="is_all">
			<label for="navigationtype1" class="in">
				<i class="radio-common selected">
					<input type="radio" value="1" name="range_type" checked="checked" id="navigationtype1">
				</i>
				<span>全部</span>
			</label>
			<label for="navigationtype2" class="out">
				<i class="radio-common">
					<input type="radio" value="0" name="range_type" id="navigationtype2">
				</i>
				<span>部分</span>
			</label>
		</div>
	</dd>
</dl>
<!-- 弹框按钮 -->
<dl class="js-select-goods" style="display:none;">
	<dt>选择商品：</dt>
	<dd>
		<button class="btn-common" onclick="open_Goods_Select_List()">选择商品</button><span class="select-tip"></span>
		<p class="error"></p>
	</dd>
</dl>
<!-- 已选择商品的列表 -->
<dl>
	<dd class="goods-list" style="width:100%;display:none;margin-left: 0;">
		<table class="table-class">
			<colgroup>
				<col width="40%">
				<col width="20%">
				<col width="10%">
				<col width="15%">
				<col width="10%">
			</colgroup>
			<thead>
				<tr>
					<th>商品名称</th>
					<th>价格</th>
					<th>库存</th>
					<th id="action-th"></th>
					<th>操作</th>
				</tr>
			</thead>
			<tbody></tbody>
		</table>
	</dd>
</dl>

	<dl>
		<dt></dt>
		<dd>
			<button class="btn-common btn-big" onclick="updateCouponType();">保存</button>
			<button class="btn-common-cancle btn-big" onclick="javascript:history.back(-1);">返回</button>
		</dd>
	</dl>
</div>
<input type="hidden" id="coupon_type_id" value="1">
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
