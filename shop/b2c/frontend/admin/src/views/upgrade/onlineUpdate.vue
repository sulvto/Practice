<template>
	
	<section class="ns-base-section">
		
		
		
		<div style="position:relative;margin:0;">
			<!-- 面包屑导航 -->
						<div class="breadcrumb-nav">
				<a href="index.html">大鵬系統</a>
									<i class="fa fa-angle-right"></i>
					<a href="/upgrade/onlineupdate.html">系统</a>
									<i class="fa fa-angle-right"></i>
					<!-- 需要加跳转链接用这个：http://showfx.niuteam.cn/admin/upgrade/onlineupdate -->
					<a href="javascript:;" style="color:#999;">在线更新</a>
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
									<p class="function-prompts">
</p><p class="function-prompts">建议您在更新前，备份相关的程序及数据信息，以免更新失败给您造成不必要的损失。</p>
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
			
<input type="hidden" id="upgrade_typeid">
<div class="prompt_information" id="warning_info">

</div>
<table class="table-class">
	<colgroup>
		<col style="width: 10%;">
		<col style="width: 20%;">
		<col style="width: 15%;">
		<col style="width: 15%;">
		<col style="width: 15%;">
		<col style="width: 15%;">
		<col style="width: 10%">
	</colgroup>
	<thead>
		<tr>
			<th class="text-left">更新状态</th>
			<th class="text-left">更新名称</th>
			<th>更新包版本</th>
			<th>系统当前版本</th>
			<th>发布时间</th>
			<th>更新时间</th>
			<th>操作</th>
		</tr>
	</thead>
	<tbody id="linkList"><tr align="center"><td colspan="7">暂无更新</td></tr></tbody>
</table>
<div class="modal fade hide" id="up_patch" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">

	<div class="modal-dialog">
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
				<h3>在线升级</h3>
			</div>
			<div class="modal-body">
				<div class="modal-infp-style" style="height:70px;">
					<table class="modal-tab">
						<tbody><tr>
							<td style="width:70%">是否备份数据库</td>
							<td>
								<input id="is_backup" type="checkbox" class="checkbox" simpleswitch="0" result="false" style="display: none;"><div class="Switch Switch_FlatRadius" id="Switch0"><span class="switch-open">是</span><span class="switch-close">否</span></div>
							</td>
						</tr>
					</tbody></table>
				</div>
			</div>
			<div class="modal-footer">
				<input type="hidden" id="modify_username_hidden">
				<button class="btn-common" onclick="upPatch()" id="butSubmit">升级</button>
				<button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
			</div>
		</div>
	</div>
	
	<input type="hidden" id="p_type" value="0">
	<input type="hidden" id="p_release" value="0">
	<input type="hidden" id="patch_list" value="[]">
</div>
<div id="back_patch" style="background:#f5f5f5;display:none;margin:auto;z-index:10;height:100%;width:100%">
	<div style="height:200px;width:200px;background:#000;opacity: 0.65;text-align:center;margin: auto;">
		<span>正在备份</span>
	</div>
</div>
<form action="http://showfx.niuteam.cn/admin/upgrade/upgradePatch.html" method="post" id="fpForm">
	<input type="hidden" id="patch_obj" name="upgradePatch_detail">
</form>

<div class="page" id="turn-ul" style="">
	<div class="pagination">
		<ul>
			<li class="according-number">每页显示<input type="text" class="input-medium" id="showNumber" value="14" data-default="14" autocomplete="off">条</li>
			<li><a id="beginPage" class="page-disable" style="border: 1px solid #dddddd;">首页</a></li>
			<li><a id="prevPage" class="page-disable">上一页</a></li>
			<li id="pageNumber"></li>
			<li id="JslastPage"></li>
			<li><a id="nextPage" class="page-disable">下一页</a></li>
			<li><a id="lastPage" class="page-disable">末页</a></li>
			<li class="total-data" data-total-count="0">共0条</li>
			<!-- <li class="page-count">共0页</li> -->
			<li class="according-number">
				跳<input type="text" class="input-medium" id="skipPage" data-curr-page="0">页
			</li>
		</ul>
	</div>
</div>
<input type="hidden" id="page_count" value="0">
<input type="hidden" id="page_size" value="0">
		</div>
		
	</section>
</template>
