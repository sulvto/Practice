<template>
    <section class="ns-base-section">
		
		
		
		<div style="position:relative;margin:0;">
			<!-- 面包屑导航 -->
						<div class="breadcrumb-nav">
				<a href="index.html">零基础学IT就来</a>
									<i class="fa fa-angle-right"></i>
					<a href="/config/usernotice.html">网站</a>
									<i class="fa fa-angle-right"></i>
					<!-- 需要加跳转链接用这个：http://showfx.niuteam.cn/admin/config/wapcustomTemplateList -->
					<a href="javascript:;" style="color:#999;">手机端自定义模板</a>
							</div>
						<!-- 三级导航菜单 -->
			
								<nav class="ns-third-menu">
					<ul>
												<li onclick="location.href='/config/pctemplate.html';">电脑端模板</li>
													<li onclick="location.href='/config/fixedtemplate.html';">手机端模板</li>
													<li class="selected" onclick="location.href='/config/wapcustomTemplateList.html';">手机端自定义模板</li>
											</ul>
				</nav>
							
			<div class="right-side-operation">
				<ul>
					
					
				</ul>
			</div>
		</div>
		
		<!-- 操作提示 -->
		
		
		<div class="ns-main">
			
<div class="set-style">
	<h4>开启设置</h4>
	<dl>
		<dt>是否开启自定义模板：</dt>
		<dd>
			<input type="checkbox" class="checkbox js-status" checked="checked" simpleswitch="0" result="true" style="display: none;"><div class="Switch Switch_FlatRadius On" id="Switch0"><span class="switch-open">启用</span><span class="switch-close">禁用</span></div>
		</dd>
	</dl>
	<h4>模版设置</h4>
</div>
<table class="mytable">
	<tbody>
		<tr>
			<td style="text-align: left;">
				<button class="btn-common-delete" onclick="batchDelete()" style="margin:0 5px 0 0 !important;">批量删除</button>
				<button class="btn-common" onclick="location.href='/config/wapCustomTemplateEdit.html';" style="margin:0 !important;">添加模板页面</button>
			</td>
			<td>
				模板名称：<input id="template_name" class="input-medium input-common" type="text" placeholder="要搜索的模板名称">
				<input type="button" onclick="searchData()" value="搜索" class="btn-common" style="line-height: initial;">
			</td>
		</tr>
	</tbody>
</table>
<table class="table-class">
	<colgroup>
		<col width="2%">
		<col width="68%">
		<col width="15%">
		<col width="15%">
	</colgroup>
	<thead>
		<tr>
			<th><i class="checkbox-common"><input type="checkbox" onclick="CheckAll(this)"></i></th>
			<th align="left">模板名称</th>
			<th>创建时间</th>
			<th align="center">操作</th>
		</tr>
	</thead>
	<tbody id="list"><tr><td align="center"><i class="checkbox-common"><input type="checkbox" name="sub" value="1"></i></td><td align="left">模板名称</td><td align="center">2018-08-01 22:32:22</td><td align="center"><a href="/config/wapCustomTemplateEdit.html?id=1">编辑</a><a href="javascript:deleteCustomTemplateById(1);">删除</a><span href="javascript:;" style="color:rgb(153, 153, 153);margin-left:8px;">店铺主页</span></td></tr></tbody>
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
			<li class="total-data" data-total-count="1">共1条</li>
			<!-- <li class="page-count">共0页</li> -->
			<li class="according-number">
				跳<input type="text" class="input-medium" id="skipPage" data-curr-page="1">页
			</li>
		</ul>
	</div>
</div>
<input type="hidden" id="page_count" value="1">
<input type="hidden" id="page_size" value="1">
		</div>
		
	</section>
</template>
