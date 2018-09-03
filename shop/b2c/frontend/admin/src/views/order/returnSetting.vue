<template>
		
	<section class="ns-base-section">
		
		
		
		<div style="position:relative;margin:0;">
			<!-- 面包屑导航 -->
						<div class="breadcrumb-nav">
				<a href="index.html">大鵬系統</a>
									<i class="fa fa-angle-right"></i>
					<a href="/config/webconfig.html">设置</a>
									<i class="fa fa-angle-right"></i>
					<!-- 需要加跳转链接用这个：http://showfx.niuteam.cn/admin/order/returnsetting -->
					<a href="javascript:;" style="color:#999;">商家地址</a>
							</div>
						<!-- 三级导航菜单 -->
			
								<nav class="ns-third-menu">
					<ul>
												<li class="selected" onclick="location.href='/express/expresscompany.html';">物流配送</li>
													<li onclick="location.href='/shop/pickuppointlist.html';">门店自提</li>
													<li onclick="location.href='/distribution/distributionuserlist.html';">本地配送</li>
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
																		<h4>操作提示</h4>
									<p>退货设置</p>
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
<!-- 						<span>退货设置</span> -->
<!-- 						 -->
<!-- 					{1/block} -->
				</h4>
			</div>
		</div>
		
		
		<div class="ns-main">
			
<div class="space-10"></div>
<div class="ncsc-form-goods">
<nav class="goods-nav">
		<ul>
									<li><a href="/express/expresscompany.html" child_id="1">物流公司</a></li>
											<li><a href="/config/areamanagement.html" child_id="2">地区管理</a></li>
										<li class="selected"><a href="/order/returnsetting.html" child_id="3">商家地址</a></li>
											<li><a href="/config/distributionareamanagement.html" child_id="4">货到付款地区管理</a></li>
											<li><a href="/config/expressmessage.html" child_id="5">物流跟踪设置</a></li>
							
		</ul>
</nav>
	<!-- 基础设置 -->
	<div class="block-basic-setting">
		
		<h4>商家地址</h4>
			<div class="set-style">
				<dl>
					<dt><span style="color:red;">*</span>&nbsp;&nbsp;收货地址：</dt>
					<dd>
						<p><input id="address" type="text" value="" class="input-common long"></p>
						<p class="error">请输入收货地址</p>
					</dd>
				</dl>
				<dl>
					<dt><span style="color:red;">*</span>&nbsp;&nbsp;收件人：</dt>
					<dd>
						<p><input id="receive" type="text" value="" class="input-common" maxlength="15"></p>
						<p class="error">请输入收件人</p>
					</dd>
				</dl>
				<dl>
					<dt><span style="color:red;">*</span>&nbsp;&nbsp;电话：</dt>
					<dd>
						<p><input id="phone" type="text" value="" class="input-common" onkeyup="checkMobile(this)" maxlength="26"></p>
						<p class="error">请输入联系电话</p>
						<p class="error">请输入正确的电话格式</p>
					</dd>
				</dl>
				<dl>
					<dt>邮编：</dt>
					<dd>
						<p><input id="zip" type="text" value="" class="input-common" maxlength="6" onkeyup="this.value=this.value.replace(/\D/g,'')" onafterpaste="this.value=this.value.replace(/\D/g,'')"></p>
					</dd>
				</dl>
				<dl>
					<dt></dt>
					<dd><button class="btn-common btn-big" onclick="addReturnAjax();">保存</button></dd>
				</dl>
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
