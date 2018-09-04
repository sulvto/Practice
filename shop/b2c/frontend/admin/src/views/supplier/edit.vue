<template>
    
	<section class="ns-base-section">
		
		
		
		<div style="position:relative;margin:0;">
			<!-- 面包屑导航 -->
						<div class="breadcrumb-nav">
				<a href="http://b2c.niuteam.cn/admin.html">单商户B2C</a>
									<i class="fa fa-angle-right"></i>
					<a href="/goods/goodslist.html">商品</a>
									<i class="fa fa-angle-right"></i>
					<!-- 需要加跳转链接用这个：http://b2c.niuteam.cn/admin/member/updatesupplier -->
					<a href="javascript:;" style="color:#999;">修改供货商</a>
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
		<dt><span class="required">*</span>供货商名称：</dt>
		<dd>
			<input type="text" id="supplier_name" value="小米供货商" class="input-common">
			<p class="error">请输入供货商名称</p>
		</dd>
	</dl>
	<dl>
		<dt><span class="required">*</span>联系人姓名：</dt>
		<dd>
			<input type="text" id="linkman_name" value="xm" class="input-common">
			<p class="error">请输入联系人姓名</p>
		</dd>
	</dl>
	<dl>
		<dt><span class="required">*</span>联系人电话：</dt>
		<dd>
			<input type="text" id="linkman_tel" value="11111" class="input-common">
			<p class="error">请输入联系人电话</p>
		</dd>
	</dl>
	<dl>
		<dt><span class="required">*</span>联系人地址：</dt>
		<dd>
			<textarea class="textarea-common" id="linkman_address">1111</textarea>
			<p class="error">请输入联系地址</p>
		</dd>
	</dl>
	<dl>
		<dt>供货商描述：</dt>
		<dd>
			<textarea id="desc" class="textarea-common">奥术大师大多</textarea>
		</dd>
	</dl>
	<dl>
		<dt></dt>
		<dd>
			<button class="btn-common btn-big" onclick="updateSupplier();">保存</button>
			<button class="btn-common-cancle btn-big" onclick="javascript:history.back(-1);">返回</button>
		</dd>
	</dl>
</div>
<input type="hidden" id="supplier_id" value="1">


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
