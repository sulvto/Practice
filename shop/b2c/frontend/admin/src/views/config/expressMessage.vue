<template>
	
	<section class="ns-base-section">
		
		
		
		<div style="position:relative;margin:0;">
			<!-- 面包屑导航 -->
						<div class="breadcrumb-nav">
				<a href="index.html">大鵬系統</a>
									<i class="fa fa-angle-right"></i>
					<a href="/config/webconfig.html">设置</a>
									<i class="fa fa-angle-right"></i>
					<!-- 需要加跳转链接用这个：http://showfx.niuteam.cn/admin/config/expressmessage -->
					<a href="javascript:;" style="color:#999;">物流跟踪设置</a>
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
																		<h4>功能提示</h4>
									<p class="function-prompts">
</p><p>1、快递鸟接口与快递100接口配置成功后，订单物流跟踪查询会当前所选择的接口进行查询</p>
<p>2、快递100免费版不支持主流快递公司的查询</p>
<p>3、两个接口的快递公司编码不同</p>
<p style="margin: 0;"><a href="http://www.kdniao.com/file/2017%E5%BF%AB%E9%80%92%E9%B8%9F%E6%8E%A5%E5%8F%A3%E6%94%AF%E6%8C%81%E5%BF%AB%E9%80%92%E5%85%AC%E5%8F%B8%E7%BC%96%E7%A0%81.xlsx">快递鸟物流公司编码下载</a></p>
<p style="margin: 0;"><a href="https://cdn.kuaidi100.com/download/chaxun(20140729).doc">快递100免费版物流公司编码下载</a></p>
<p style="margin: 0;"><a href="https://poll.kuaidi100.com/pollquery/pollStep.do?method=kdbm">快递100企业版物流公司编码下载</a></p>
<p></p>
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
<div class="ncsc-form-goods">
<nav class="goods-nav">
		<ul>
									<li><a href="/express/expresscompany.html" child_id="1">物流公司</a></li>
											<li><a href="/config/areamanagement.html" child_id="2">地区管理</a></li>
											<li><a href="/order/returnsetting.html" child_id="3">商家地址</a></li>
											<li><a href="/config/distributionareamanagement.html" child_id="4">货到付款地区管理</a></li>
										<li class="selected"><a href="/config/expressmessage.html" child_id="5">物流跟踪设置</a></li>
							
		</ul>
</nav>
	<!-- 基础设置 -->
	<div class="block-basic-setting">
		
		<h4>物流跟踪设置</h4>
			<div class="set-style">
				<dl>
					<dt>接口名称：</dt>
					<dd>
						<div class="selectric-wrapper selectric-select-common" style="width: 250px;"><div class="selectric-hide-select"><select name="" id="type" class="select-common" tabindex="-1">
							<option value="1" selected="">快递鸟</option>
							<option value="2">快递100（免费版）</option>
							<option value="3">快递100（企业版）</option>
						</select></div><div class="selectric"><span class="selectric-label">快递鸟</span><button class="selectric-button">▾</button></div><div class="selectric-items" tabindex="-1"><div class="selectric-scroll"><ul><li data-index="0" class="selected" title="快递鸟">快递鸟</li><li data-index="1" class="" title="快递100（免费版）">快递100（免费版）</li><li data-index="2" class="last" title="快递100（企业版）">快递100（企业版）</li></ul></div></div><input class="selectric-input" tabindex="0"></div>
					</dd>
				</dl>
				<dl id="Js-appid">
					<dt>APPID：</dt>
					<dd>
						<input id="appid" type="text" value="" class="input-common long">
						<p class="hint">应用APPID</p>
					</dd>
					
				</dl>
				<dl>
					<dt>APPKEY：</dt>
					<dd>
						<input id="appkey" type="text" value="" class="input-common long">
						<p class="hint">应用密钥</p>
					</dd>
				</dl>
				<dl id="Js-customer" style="display:none;">
					<dt>CUSTOMER：</dt>
					<dd>
						<input type="text" name="" id="customer" value="" class="input-common long">
						<p class="hint">快递100分配给的公司编号</p>
					</dd>
				</dl>
				<dl>
					<dt>说明：</dt>
					<dd>
						<a id="apply_address" href="http://www.kdniao.com/" target="_blank">点击申请</a>&nbsp;&nbsp;&nbsp;
						<span style="display:none;">回调地址：<a style="color:#666;font-size:13px;">http://域名/</a></span>
					</dd>
				</dl>
				<dl>
					<dt>是否启用：</dt>
					<dd>
						<div class="controls">
							<p>
								<input id="is_use" type="checkbox" class="checkbox" checked="" simpleswitch="0" result="true" style="display: none;"><div class="Switch Switch_FlatRadius On" id="Switch0"><span class="switch-open">是</span><span class="switch-close">否</span></div>
							</p>
						</div>
					</dd>
				</dl>
				<dl>
					<dt></dt>
					<dd><button class="btn-common btn-big" onclick="setExpressConfigAjax();">保存</button></dd>
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
