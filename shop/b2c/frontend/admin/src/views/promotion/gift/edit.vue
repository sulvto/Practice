<template>
	
	<section class="ns-base-section">
		
		
		
		<div style="position:relative;margin:0;">
			<!-- 面包屑导航 -->
						<div class="breadcrumb-nav">
				<a href="index.html">大鵬系統</a>
									<i class="fa fa-angle-right"></i>
					<a href="/promotion/coupontypelist.html">营销</a>
									<i class="fa fa-angle-right"></i>
					<!-- 需要加跳转链接用这个：http://showfx.niuteam.cn/admin/promotion/updategift -->
					<a href="javascript:;" style="color:#999;">修改赠品</a>
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
									<p>修改赠品</p>
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
<!-- 						<span>修改赠品</span> -->
<!-- 						 -->
<!-- 					{1/block} -->
				</h4>
			</div>
		</div>
		
		
		<div class="ns-main">
			
<div class="set-style">
	<dl>
		<dt>赠品名称：</dt>
		<dd><input type="text" id="gift_name" maxlength="10" value="132" class="input-common"></dd>
	</dl>
	<dl>
		<dt>赠品有效期：</dt>
		<dd>
			<input class="input-medium input-common harf" type="text" id="start_time" value="2018-05-01 00:00:00" style="width:250px;" onclick="WdatePicker({skin:'twoer',dateFmt:'yyyy-MM-dd HH:mm:ss'})">
			<span class="mlr5">-</span> 
			<input class="input-medium input-common harf" size="15" type="text" id="end_time" value="2019-06-21 00:00:00" style="width:250px;" onclick="WdatePicker({skin:'twoer',dateFmt:'yyyy-MM-dd HH:mm:ss'})">
		</dd>
	</dl>
	<!-- 所有决定商品弹框内容的条件和存放商品id的隐藏域 -->
	<span id="goods-condition">
		<input type="hidden" name="type" value="1">
		<input type="hidden" name="stock" value="1">
		<input type="hidden" name="goods_type" value="1">
		<input type="hidden" name="is_have_sku" value="1">
		<input type="hidden" name="state" value="1">
		<input type="hidden" id="goods_id_array" value="3">
		<input type="hidden" id="range_type" value="0">
		<input type="hidden" id="is_show_select" value="0">
		<input type="hidden" id="action" value="">
	</span>

<!-- 切换全部与部分 -->
<dl style="display:none;" id="select-box">
	<dt>参与商品：</dt>
	<dd>
		<div class="total" id="is_all">
			<label for="navigationtype1" class="in">
				<i class="radio-common">
					<input type="radio" value="1" name="range_type" checked="checked" id="navigationtype1">
				</i>
				<span>全部</span>
			</label>
			<label for="navigationtype2" class="out">
				<i class="radio-common selected">
					<input type="radio" value="0" name="range_type" id="navigationtype2">
				</i>
				<span>部分</span>
			</label>
		</div>
	</dd>
</dl>
<!-- 弹框按钮 -->
<dl class="js-select-goods" style="">
	<dt>选择商品：</dt>
	<dd>
		<button class="btn-common" onclick="open_Goods_Select_List()">选择商品</button><span class="select-tip"></span>
		<p class="error" style="display: none;"></p>
	</dd>
</dl>
<!-- 已选择商品的列表 -->
<dl>
	<dd class="goods-list" style="width: 100%; margin-left: 0px;">
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
			<tbody><tr><td style="text-align:left;">上衣女夏2017新款枣红色韩版灯笼袖压褶方领宽松半袖百搭雪纺衫</td><td class="goods_price">169.00</td><td>74999</td><td></td><td><label for=""><i class="fa fa-times" aria-hidden="true fa-2x" onclick="cancelSelect(3,this)"></i></label></td></tr></tbody>
		</table>
	</dd>
</dl>

	<!-- <dl>
		<dt>领取有效期:</dt>
		<dd><input class="input-mini w70 input-common" type="text" id="days" value="0"><span class="help-inline">天</span></dd>
	</dl>
	<dl>
		<dt>领取限制:</dt>
		<dd>
			<input class="input-mini w70 input-common" type="text" id="max_num" value="0"><span class="help-inline">次/人</span>
			<p class="hint">（0表示不限领取次数）</p>
		</dd>
	</dl> -->
	<dl>
		<dt></dt>
		<dd>
			<button class="btn-common btn-big" onclick="updateGift();">保存</button>
			<button class="btn-common-cancle btn-big" onclick="javascript:history.back(-1);">返回</button>
		</dd>
	</dl>
</div>
<input type="hidden" id="gift_id" value="1">

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
