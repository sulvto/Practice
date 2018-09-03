<template>
    <section class="ns-base-section">
		
		
		
		<div style="position:relative;margin:0;">
			<!-- 面包屑导航 -->
						<div class="breadcrumb-nav">
				<a href="index.html">零基础学IT就来</a>
									<i class="fa fa-angle-right"></i>
					<a href="/promotion/coupontypelist.html">营销</a>
									<i class="fa fa-angle-right"></i>
					<!-- 需要加跳转链接用这个：http://showfx.niuteam.cn/admin/Bargain/addBargain -->
					<a href="javascript:;" style="color:#999;">添加活动</a>
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
			
<div class="space-10"></div>
<div class="set-style">
	<dl>
		<dt>活动名称：</dt>
		<dd><input type="text" id="bargain_name" maxlength="10" class="input-common"><p class="error">请输入活动名称</p></dd>
		
	</dl>
	<dl>
		<dt>活动有效期：</dt>
		<dd>
			<input class="input-medium input-common harf" type="text" id="start_time" style="width:250px;" onclick="WdatePicker({skin:'twoer',dateFmt:'yyyy-MM-dd HH:mm:ss'})">
			<span class="mlr5">-</span> 
			<input class="input-medium input-common harf" size="15" type="text" id="end_time" style="width:250px;" onclick="WdatePicker({skin:'twoer',dateFmt:'yyyy-MM-dd HH:mm:ss'})">
			<p class="error">请输入活动有效期</p>
			<p class="error">活动结束时间不能小于当前时间</p>
			<p class="error">活动结束时间不能小于开始时间</p>
		</dd>
	</dl>
	
	<dl>
		<dt>首刀比例</dt>
		<dd>
			<input type="number" id="one_min_rate" name="one_min_rate" class="input-common harf">
			<span class="mlr5">-</span>
			<input type="number" id="one_max_rate" name="one_max_rate" class="input-common harf"> 
			<span class="mlr5">%</span>
			<p class="error">请输入活动首刀比率</p>
		</dd>
	</dl>
	<dl>
		<dt>至少需要砍的次数</dt>
		<dd>
			<input type="number" id="bargain_min_number" name="bargain_min_number" class="input-common harf">
			<span class="mlr5">次</span>	
			<p class="error">请输入需要砍的次数</p>		
		</dd>
	</dl>
	<dl>
		<dt>可砍到的最低比例</dt>
		<dd>
			<input type="number" id="bargain_min_rate" name="bargain_min_rate" class="input-common harf">
			<span class="mlr5">%</span>	
			<p class="error">请输入可砍刀的最低比例</p>		
		</dd>
	</dl>
	<!-- 所有决定商品弹框内容的条件和存放商品id的隐藏域 -->
	<span id="goods-condition">
		<input type="hidden" name="type" value="2">
		<input type="hidden" name="stock" value="1">
		<input type="hidden" name="goods_type" value="1,2">
		<input type="hidden" name="is_have_sku" value="1">
		<input type="hidden" name="state" value="1">
		<input type="hidden" id="goods_id_array" value="">
		<input type="hidden" id="range_type" value="0">
		<input type="hidden" id="is_show_select" value="0">

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
		<p class="error"></p>
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
			<tbody></tbody>
		</table>
	</dd>
</dl>

	
	<dl>
		<dt></dt>
		<dd>
			<button class="btn-common btn-big" onclick="addDiscount();">保存</button>
			<button class="btn-common-cancle btn-big" onclick="javascript:history.back(-1);">返回</button>
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
