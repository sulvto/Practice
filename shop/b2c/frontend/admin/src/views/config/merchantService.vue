<template>
    <section class="ns-base-section">
		
		
		
		<div style="position:relative;margin:0;">
			<!-- 面包屑导航 -->
						<div class="breadcrumb-nav">
				<a href="index.html">零基础学IT就来</a>
									<i class="fa fa-angle-right"></i>
					<a href="/config/webconfig.html">设置</a>
									<i class="fa fa-angle-right"></i>
					<!-- 需要加跳转链接用这个：http://showfx.niuteam.cn/admin/config/merchantService -->
					<a href="javascript:;" style="color:#999;">商家服务</a>
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
													<li onclick="location.href='/config/customservice.html';">客服</li>
													<li class="selected" onclick="location.href='/config/merchantService.html';">商家服务</li>
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
									<p>商家服务</p>
									<hr>
																		<h4>功能提示</h4>
									<p class="function-prompts">
</p><p style="margin: 0;">添加成功后，商家服务将会在商品详情中展示</p>
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
<!-- 						<span>商家服务</span> -->
<!-- 						 -->
<!-- 					{1/block} -->
				</h4>
			</div>
		</div>
		
		
		<div class="ns-main">
			
<div class="service-guarantee">
	<table class="table-class">
		<colgroup>
			<col width="20%">
			<col width="30%">
			<col width="50%">
		</colgroup>
		<tbody><tr>
			<th>图标</th>
			<th>标题</th>
			<th>描述</th>
		</tr>
				<tr data-flag="0">
			<td align="center">
				<div class="shop_service_item">
					<input class="input-file" name="file_upload" id="uploadImg0" type="file" onchange="imgUpload(this);" style="cursor: pointer;width: 30px;margin-top: 12px;margin-left: 62px;" title=" ">
					<input type="hidden" id="logo0" value="" class="sg-pic">
										<img id="imglogo0" src="/public/static/blue/img/goods_sku_add.png" style="cursor: pointer;width:28px;height:28px;">
									</div>
			</td>
			<td align="center">
				<input type="text" placeholder="请输入商家服务标题" class="input-common sg-title" value="">
			</td>
			<td align="center">
				<input type="text" placeholder="请输入商家服务描述" class="input-common sg-describe" value="">
			</td>
		</tr>
				<tr data-flag="1">
			<td align="center">
				<div class="shop_service_item">
					<input class="input-file" name="file_upload" id="uploadImg1" type="file" onchange="imgUpload(this);" style="cursor: pointer;width: 30px;margin-top: 12px;margin-left: 62px;" title=" ">
					<input type="hidden" id="logo1" value="" class="sg-pic">
										<img id="imglogo1" src="/public/static/blue/img/goods_sku_add.png" style="cursor: pointer;width:28px;height:28px;">
									</div>
			</td>
			<td align="center">
				<input type="text" placeholder="请输入商家服务标题" class="input-common sg-title" value="">
			</td>
			<td align="center">
				<input type="text" placeholder="请输入商家服务描述" class="input-common sg-describe" value="">
			</td>
		</tr>
				<tr data-flag="2">
			<td align="center">
				<div class="shop_service_item">
					<input class="input-file" name="file_upload" id="uploadImg2" type="file" onchange="imgUpload(this);" style="cursor: pointer;width: 30px;margin-top: 12px;margin-left: 62px;" title=" ">
					<input type="hidden" id="logo2" value="" class="sg-pic">
										<img id="imglogo2" src="/public/static/blue/img/goods_sku_add.png" style="cursor: pointer;width:28px;height:28px;">
									</div>
			</td>
			<td align="center">
				<input type="text" placeholder="请输入商家服务标题" class="input-common sg-title" value="">
			</td>
			<td align="center">
				<input type="text" placeholder="请输入商家服务描述" class="input-common sg-describe" value="">
			</td>
		</tr>
				<tr data-flag="3">
			<td align="center">
				<div class="shop_service_item">
					<input class="input-file" name="file_upload" id="uploadImg3" type="file" onchange="imgUpload(this);" style="cursor: pointer;width: 30px;margin-top: 12px;margin-left: 62px;" title=" ">
					<input type="hidden" id="logo3" value="" class="sg-pic">
										<img id="imglogo3" src="/public/static/blue/img/goods_sku_add.png" style="cursor: pointer;width:28px;height:28px;">
									</div>
			</td>
			<td align="center">
				<input type="text" placeholder="请输入商家服务标题" class="input-common sg-title" value="">
			</td>
			<td align="center">
				<input type="text" placeholder="请输入商家服务描述" class="input-common sg-describe" value="">
			</td>
		</tr>
				<tr data-flag="4">
			<td align="center">
				<div class="shop_service_item">
					<input class="input-file" name="file_upload" id="uploadImg4" type="file" onchange="imgUpload(this);" style="cursor: pointer;width: 30px;margin-top: 12px;margin-left: 62px;" title=" ">
					<input type="hidden" id="logo4" value="" class="sg-pic">
										<img id="imglogo4" src="/public/static/blue/img/goods_sku_add.png" style="cursor: pointer;width:28px;height:28px;">
									</div>
			</td>
			<td align="center">
				<input type="text" placeholder="请输入商家服务标题" class="input-common sg-title" value="">
			</td>
			<td align="center">
				<input type="text" placeholder="请输入商家服务描述" class="input-common sg-describe" value="">
			</td>
		</tr>
				<tr data-flag="5">
			<td align="center">
				<div class="shop_service_item">
					<input class="input-file" name="file_upload" id="uploadImg5" type="file" onchange="imgUpload(this);" style="cursor: pointer;width: 30px;margin-top: 12px;margin-left: 62px;" title=" ">
					<input type="hidden" id="logo5" value="" class="sg-pic">
										<img id="imglogo5" src="/public/static/blue/img/goods_sku_add.png" style="cursor: pointer;width:28px;height:28px;">
									</div>
			</td>
			<td align="center">
				<input type="text" placeholder="请输入商家服务标题" class="input-common sg-title" value="">
			</td>
			<td align="center">
				<input type="text" placeholder="请输入商家服务描述" class="input-common sg-describe" value="">
			</td>
		</tr>
				<tr>
			<td align="center"><button class="btn-common btn-big" onclick="save()">保存</button></td>
			<td colspan="2"></td>
		</tr>
	</tbody></table>
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
