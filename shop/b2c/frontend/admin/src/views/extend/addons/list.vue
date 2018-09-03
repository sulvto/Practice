<template>
    
	<section class="ns-base-section">
		
		
		
		<div style="position:relative;margin:0;">
			<!-- 面包屑导航 -->
						<div class="breadcrumb-nav">
				<a href="index.html">大鵬系統</a>
									<i class="fa fa-angle-right"></i>
					<a href="/upgrade/onlineupdate.html">系统</a>
									<i class="fa fa-angle-right"></i>
					<!-- 需要加跳转链接用这个：http://showfx.niuteam.cn/admin/extend/addonslist -->
					<a href="javascript:;" style="color:#999;">插件管理</a>
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
<table class="table-class">
	<colgroup>
		<col style="width: 2%;">
		<col style="width: 18%;">
		<col style="width: 15%;">
		<col style="width: 5%;">
		<col style="width: 10%;">
		<col style="width: 10%;">
		<col style="width: 25%">
		<col style="width: 15%">
		</colgroup>
	<thead>
		<tr align="center">
			<th><i class="checkbox-common"><input type="checkbox" onclick="CheckAll(this)"></i></th>
			<th align="left">名称</th>
			<th align="left">标识</th>
			<th align="left">状态</th>
			<th>作者</th>
			<th>版本</th>
			<th align="left">描述</th>
			<th>操作</th>
		</tr>
	</thead>
	<tbody><tr align="center"><td style="text-align: center;"><i class="checkbox-common"><input name="sub" type="checkbox" value="2"></i></td><td align="left">微信模板消息</td><td align="left">wxtemplatemsg</td><td align="left">启用</td><td>niushop</td><td>1.0</td><td align="left">微信模板消息</td><td><a href="/extend/addonsconfig?id=2">设置</a><a href="javascript:;" onclick="detail(2)">详情</a><a href="/extend/disable?id=2">禁用</a><a href="/extend/uninstall?id=2">卸载</a></td></tr></tbody>
</table>
<!-- 模态框（Modal） -->
<div class="modal fade hide" id="detail" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true" style="width:700px;left:45%;top:30%;">
	<div class="modal-dialog">
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
				<h3>插件详情</h3>
			</div>
			<div class="set-style">
				<dl>
					<dt>详情：</dt>
					<dd>
						<div id="content" style="min-width:400px;min-height:100px;"></div>
					</dd>
				</dl>
			</div>
		</div>
	</div>
</div>

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
			<li class="total-data" data-total-count="1">共1条</li>
			<!-- <li class="page-count">共0页</li> -->
			<li class="according-number">
				跳<input type="text" class="input-medium" id="skipPage" data-curr-page="1">页
			</li>
		</ul>
	</div>
</div>
<input type="hidden" id="page_count" value="1">
<input type="hidden" id="page_size" value="">
		</div>
		
	</section>
</template>
