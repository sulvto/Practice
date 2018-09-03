<template>
    <section class="ns-base-section">
		
		
		
		<div style="position:relative;margin:0;">
			<!-- 面包屑导航 -->
						<div class="breadcrumb-nav">
				<a href="index.html">零基础学IT就来</a>
									<i class="fa fa-angle-right"></i>
					<a href="/config/webconfig.html">设置</a>
									<i class="fa fa-angle-right"></i>
					<!-- 需要加跳转链接用这个：http://showfx.niuteam.cn/admin/config/customPseudoStaticRule -->
					<a href="javascript:;" style="color:#999;">伪静态路由</a>
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
													<li class="selected" onclick="location.href='/config/customPseudoStaticRule.html';">伪静态路由</li>
													<li onclick="location.href='/config/partylogin.html';">第三方登录</li>
													<li onclick="location.href='/config/notifyindex.html';">通知系统</li>
													<li onclick="location.href='/config/customservice.html';">客服</li>
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
			
<div class="options-btn">
	<button class="btn-common-delete" onclick="batchDelete()">批量删除</button>
	<button class="btn-common" onclick="location.href='/config/addRoutingRules.html';">添加路由规则</button>
</div>
<table class="table-class">
	<colgroup>
		<col style="width: 2%">
		<col style="width: 21%">
		<col style="width: 20%">
		<col style="width: 20%">
		<col style="width: 20%">
		<col style="width: 7%">
		<col style="width: 10%">
	</colgroup>
	<thead>
		<tr align="center">
			<th><i class="checkbox-common"><input type="checkbox" onclick="CheckAll(this)" id="chek_all"></i></th>
			<th style="text-align: left;">伪静态路由规则</th>
			<th style="text-align: left;">路由地址</th>
			<th>路由模块</th>
			<th align="left">简介</th>
			<th>是否开启</th>
			<th>操作</th>
		</tr>
	</thead>
	<tbody><tr align="center"><td><i class="checkbox-common disabled"><input name="sub" type="checkbox" value="1" disabled=""></i></td><td style="text-align: left;">goods</td><td style="text-align: left;">shop/goods/goodsinfo</td><td>shop</td><td align="left"></td><td><img src="/public/admin/images/checked.png" alt="" width="15"></td><td style="text-align:center;"><a href="/config/updateRoutingRule?routeid=1">修改</a></td></tr><tr align="center"><td><i class="checkbox-common disabled"><input name="sub" type="checkbox" value="2" disabled=""></i></td><td style="text-align: left;">list</td><td style="text-align: left;">shop/goods/goodslist</td><td>shop</td><td align="left"></td><td><img src="/public/admin/images/checked.png" alt="" width="15"></td><td style="text-align:center;"><a href="/config/updateRoutingRule?routeid=2">修改</a></td></tr><tr align="center"><td><i class="checkbox-common disabled"><input name="sub" type="checkbox" value="3" disabled=""></i></td><td style="text-align: left;">brands</td><td style="text-align: left;">shop/goods/brandlist</td><td>shop</td><td align="left"></td><td><img src="/public/admin/images/checked.png" alt="" width="15"></td><td style="text-align:center;"><a href="/config/updateRoutingRule?routeid=3">修改</a></td></tr><tr align="center"><td><i class="checkbox-common disabled"><input name="sub" type="checkbox" value="4" disabled=""></i></td><td style="text-align: left;">integralcenter</td><td style="text-align: left;">shop/goods/integralcenter</td><td>shop</td><td align="left"></td><td><img src="/public/admin/images/checked.png" alt="" width="15"></td><td style="text-align:center;"><a href="/config/updateRoutingRule?routeid=4">修改</a></td></tr><tr align="center"><td><i class="checkbox-common disabled"><input name="sub" type="checkbox" value="5" disabled=""></i></td><td style="text-align: left;">discount</td><td style="text-align: left;">shop/index/discount</td><td>shop</td><td align="left"></td><td><img src="/public/admin/images/checked.png" alt="" width="15"></td><td style="text-align:center;"><a href="/config/updateRoutingRule?routeid=5">修改</a></td></tr><tr align="center"><td><i class="checkbox-common"><input name="sub" type="checkbox" value="7"></i></td><td style="text-align: left;">membercenter</td><td style="text-align: left;">shop/member/index</td><td>shop</td><td align="left"></td><td><img src="/public/admin/images/checked.png" alt="" width="15"></td><td style="text-align:center;"><a href="/config/updateRoutingRule?routeid=7">修改</a> <a href="javascript:;" onclick="delete_url_route(7);">删除</a></td></tr><tr align="center"><td><i class="checkbox-common disabled"><input name="sub" type="checkbox" value="8" disabled=""></i></td><td style="text-align: left;">article</td><td style="text-align: left;">shop/cms/articleclassinfo</td><td>shop</td><td align="left">文章详情</td><td><img src="/public/admin/images/checked.png" alt="" width="15"></td><td style="text-align:center;"><a href="/config/updateRoutingRule?routeid=8">修改</a></td></tr></tbody>
</table>

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
			<li class="total-data" data-total-count="7">共7条</li>
			<!-- <li class="page-count">共0页</li> -->
			<li class="according-number">
				跳<input type="text" class="input-medium" id="skipPage" data-curr-page="1">页
			</li>
		</ul>
	</div>
</div>
<input type="hidden" id="page_count" value="1">
<input type="hidden" id="page_size" value="7">
		</div>
		
	</section>
</template>
