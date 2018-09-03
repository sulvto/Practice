<template>
	
	<section class="ns-base-section">
		
		<div style="position:relative;margin:0;">
			<!-- 面包屑导航 -->
						<div class="breadcrumb-nav">
				<a href="index.html">大鵬系統</a>
									<i class="fa fa-angle-right"></i>
					<a href="/upgrade/onlineupdate.html">系统</a>
									<i class="fa fa-angle-right"></i>
					<!-- 需要加跳转链接用这个：http://showfx.niuteam.cn/admin/upgrade/devolutioninfo -->
					<a href="javascript:;" style="color:#999;">授权信息</a>
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
<div class="mod-table">
	<div class="table-div">
		<table>
			<tbody>
				<tr><td class="back-f5f5f5">授权信息</td></tr>
				<tr>
					<td>授&nbsp;&nbsp;权&nbsp;码：
					<span class="right">
											 &nbsp;&nbsp;<a href="javascript:;" target="_blank" onclick="bind()" class="btn_bind">重新绑定</a>
										</span>
					</td>
				</tr>
				<tr><td>站点URL：<span class="right" style="margin-left: 14px;"></span></td></tr>
				<tr><td>授权时间：<span class="right">
				</span></td></tr>
				<tr><td>当前版本：<span class="back-color color_2">旗舰版2.6</span></td></tr>
				<tr><td>最新版本：<span class="back-color color_1">V2.2</span></td></tr>
				
									<tr><td>授权状态：<span class="back-color color_5">未授权</span>&nbsp;&nbsp;&nbsp;&nbsp;</td></tr>
							</tbody>
		</table>
	</div>
</div>

<div class="modal fade hide" id="bind_user" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true" style="width:400px;left:56%">

	<div class="modal-dialog">
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
				<h3>云平台绑定</h3>
			</div>
			<div class="modal-body">
				<div class="modal-infp-style" style="height:165px;width:320px;margin:auto;">
					<table class="modal-tab" style="width: 100%;">
						<tbody><tr>
							<td colspan="2" style="text-align:left">输入Niushop官方授权码完成绑定
							<a style="float:right;color:#00C0FF;" href="http://www.niushop.com.cn/authorization.html" target="_blank">授权</a>
							</td>
						</tr>
						<tr>
							<td>授权码：</td>
							<td>
								<input id="authorization_code" type="text" class="input-common">
							</td>
						</tr>
					</tbody></table>
				</div>
			</div>
			
			<div class="modal-footer">
				<input type="hidden" id="modify_username_hidden">
				<button class="btn-common" onclick="binding()" id="butSubmit">绑定</button>
			</div>
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
