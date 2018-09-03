<template>
    <section class="ns-base-section">
		
		
		
		<div style="position:relative;margin:0;">
			<!-- 面包屑导航 -->
						<div class="breadcrumb-nav">
				<a href="index.html">零基础学IT就来</a>
									<i class="fa fa-angle-right"></i>
					<a href="/config/webconfig.html">设置</a>
									<i class="fa fa-angle-right"></i>
					<!-- 需要加跳转链接用这个：http://showfx.niuteam.cn/admin/config/customservice -->
					<a href="javascript:;" style="color:#999;">客服</a>
							</div>
						<!-- 三级导航菜单 -->
			
								<nav class="ns-third-menu">
					<ul>
												<li onclick="location.href='/config/webconfig.html';">网站设置</li>
													<li onclick="location.href='/config/seoConfig.html';">SEO设置</li>
													<li onclick="location.href='/config/copyrightinfo.html';">版权</li>
													<li onclick="location.href='/config/visitconfig.html';">运营</li>
													<li onclick="location.href='/config/registerandvisit.html';">注册与访问</li>
													<li onclick="location.href='/config/pictureuploadsetting.html';">上传设置</li>
													<li onclick="location.href='/config/customPseudoStaticRule.html';">伪静态路由</li>
													<li onclick="location.href='/config/partylogin.html';">第三方登录</li>
													<li onclick="location.href='/config/notifyindex.html';">通知系统</li>
													<li class="selected" onclick="location.href='/config/customservice.html';">客服</li>
													<li onclick="location.href='/config/merchantService.html';">商家服务</li>
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
	</p><p class="function-prompts">
		</p><ul>
			<li>当前客服仅适用于以下三种链接</li>
			<li>1.美洽
				<br>链接地址：<a href="http://www.meiqia.com" target="_brank">www.meiqia.com</a>
				使用教程：<a href="http://www.niushop.com.cn/document.html?class_id=20&amp;dir_id=63&amp;id=122" target="_blank">http://www.niushop.com.cn/document.html?class_id=20&amp;dir_id=63&amp;id=122</a>
			</li>
			<li>2.KF5
				<br>链接地址：<a href="http://www.kf5.com" target="_brank">www.kf5.com</a>
				使用教程：<a href="http://www.niushop.com.cn/document.html?class_id=20&amp;dir_id=63&amp;id=123" target="_blank">http://www.niushop.com.cn/document.html?class_id=20&amp;dir_id=63&amp;id=123</a></li>
			<li>3.QQ(qq客服需填写当前客服的qq号码)<br><br></li>
		</ul>
	<p></p>
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
			

<input type="hidden" id="withdraw_id" value="172">
<div class="set-style">
	<dl>
		<dt>美洽客服链接：</dt>
		<dd>
			<input id="meiqia_service_addr" type="text" value="" class="input-common">
			<input type="radio" name="service_addr" value="1">
						
				<a href="javascript:;" class="pay-close" status="0" onclick="set_status(this)">
					<img src="/public/admin/images/un_checked.png" alt="" width="18">
				</a>
			
				
			
		
		
		</dd>
	</dl>
	<dl>
		<dt>kf5客服链接：</dt>
		<dd>
			<input id="kf_service_addr" type="text" value="" class="input-common">
			<input type="radio" name="service_addr" value="2">
						
				<a href="javascript:;" class="pay-close" status="0" onclick="set_status(this)">
					<img src="/public/admin/images/un_checked.png" alt="" width="18">
				</a>
			
				
			
		</dd>
	</dl>
	<dl>
		<dt>QQ客服：</dt>
		<dd>
			<input id="qq_service_addr" type="text" value="123123123" class="input-common">
			<input type="radio" name="service_addr" value="3" checked="checked">
						
				<a href="javascript:;" class="pay-start" status="1" onclick="set_status(this)">
					<img src="/public/admin/images/checked.png" alt="" width="18">
				</a>
			
				
			
		</dd>
	</dl>
	<dl>
		<dt></dt>
		<dd>
			<button class="btn-common btn-big" onclick="setMemberwithdrawAjax();">保存</button>
		</dd>
	</dl>
	<!-- <dl>
		<dt>提现手续费比例:</dt>
		<dd>
			<input id="poundage" type="number" min="0.00" step="0.01"  value="" />&nbsp;%<span class="withdraw_rule" id="verification_poundage">提现手续费不能为空</span>
			<p class="hint">为0表示不收手续费</p>
		</dd>
	</dl> -->
	
<!-- 	<dl> -->
<!-- 		<dt>是否启用</dt> -->
<!-- 		<dd> -->
<!-- 			<div class="controls"> -->
<!-- 				<label class="radio inline"><input type="radio" name="enable" value="1" checked="checked" id="enableYes">启用</label>  -->
<!-- 				<label class="radio inline"><input type="radio" name="enable" value="0" checked="checked" id="enableNo">禁用</label> -->
<!-- 				<input type="hidden" id="is_open" value="0"> -->
<!-- 			</div> -->
<!-- 			<p class="hint">是否启用提现设置</p> -->
<!-- 		</dd> -->
<!-- 	</dl> -->
	
	
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
