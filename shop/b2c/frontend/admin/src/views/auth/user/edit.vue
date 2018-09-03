<template>
	
	<section class="ns-base-section">
		
		
		
		<div style="position:relative;margin:0;">
			<!-- 面包屑导航 -->
						<div class="breadcrumb-nav">
				<a href="index.html">大鵬系統</a>
									<i class="fa fa-angle-right"></i>
					<a href="/config/webconfig.html">设置</a>
									<i class="fa fa-angle-right"></i>
					<!-- 需要加跳转链接用这个：http://showfx.niuteam.cn/admin/auth/edituser -->
					<a href="javascript:;" style="color:#999;">编辑用户</a>
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
									<p>用户</p>
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
<!-- 						<span>用户</span> -->
<!-- 						 -->
<!-- 					{1/block} -->
				</h4>
			</div>
		</div>
		
		
		<div class="ns-main">
			
<div class="set-style">
	<input type="hidden" id="uid" value="67">
	<dl>
		<dt><span class="required">*</span>用户名:</dt>
		<dd>
			<p><input id="admin_name" type="text" value="admin1" class="input-common"></p>
			<p class="error">请输入用户名</p>
		</dd>
	</dl>
	<dl>
		<dt><span class="required">*</span>所属用户组:</dt>
		<dd>
			<p style="line-height: 1;">
				<div class="selectric-wrapper selectric-select-common" style="width: 250px;"><div class="selectric-hide-select"><select class="select-common" id="group_id" tabindex="-1">
					<option value="-1">请选择用户组</option>
										<option value="3" selected="">管理员组</option>
										<option value="4">客服组</option>
									</select></div><div class="selectric"><span class="selectric-label">管理员组</span><button class="selectric-button">▾</button></div><div class="selectric-items" tabindex="-1"><div class="selectric-scroll"><ul><li data-index="0" class="" title="请选择用户组">请选择用户组</li><li data-index="1" class="selected" title="管理员组">管理员组</li><li data-index="2" class="last" title="客服组">客服组</li></ul></div></div><input class="selectric-input" tabindex="0"></div>
			</p>
			<p class="error">请选择用户组</p>
		</dd>
	</dl>
	<dl>
		<dt>描述:</dt>
		<dd>
			<p><textarea id="desc" class="textarea-common">111</textarea></p>
			<p class="error">请输入描述信息</p>
		</dd>
	</dl>
	<dl>
		<dt></dt>
		<dd>
			<button class="btn-common btn-big" onclick="editUserAjax();">保存</button>
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
