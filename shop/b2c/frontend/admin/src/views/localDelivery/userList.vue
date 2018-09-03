<template>
    <section class="ns-base-section">
		
		
		
		<div style="position:relative;margin:0;">
			<!-- 面包屑导航 -->
						<div class="breadcrumb-nav">
				<a href="index.html">零基础学IT就来</a>
									<i class="fa fa-angle-right"></i>
					<a href="/config/webconfig.html">设置</a>
									<i class="fa fa-angle-right"></i>
					<!-- 需要加跳转链接用这个：http://showfx.niuteam.cn/admin/distribution/distributionUserList -->
					<a href="javascript:;" style="color:#999;">配送人员</a>
							</div>
						<!-- 三级导航菜单 -->
			
								<nav class="ns-third-menu">
					<ul>
												<li onclick="location.href='/express/expresscompany.html';">物流配送</li>
													<li onclick="location.href='/shop/pickuppointlist.html';">门店自提</li>
													<li class="selected" onclick="location.href='/distribution/distributionuserlist.html';">本地配送</li>
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
			
<div class="space-10"></div>
<div class="ncsc-form-goods">
<nav class="goods-nav">
		<ul>
								<li class="selected"><a href="/distribution/distributionuserlist.html" child_id="1">配送人员</a></li>
											<li><a href="/distribution/distributionConfig.html" child_id="2">配送费用</a></li>
											<li><a href="/distribution/distributionareamanagement.html" child_id="3">配送地区</a></li>
							
		</ul>
</nav>
	<!-- 基础设置 -->
	<div class="mod-table">
	<div class="mod-table-head">
		<table class="mytable">
			<tbody><tr>
				<td width="50%" style="text-align: left;">
					<button class="btn-common-delete" onclick="batchDelete()">批量删除</button>
					<button class="btn-common" onclick="distributionShow()">添加配送人员</button>
				</td>
				<td width="20%">
					<input type="text" id="search_text" placeholder="请输入配送人姓名" class="input-common">
					<input type="button" onclick="searchData()" value="搜索" class="btn-common">
				</td>
			</tr>
		</tbody></table>
		<div class="con style0list">

			<table class="table-class">
				<colgroup>
					<col style="width: 2%;">
					<col style="width: 15%;">
					<col style="width: 15%;">
					<col style="width: 58%;">
					<col style="width: 10%;">
				</colgroup>
				<thead>
					<tr align="center">
						<th><i class="checkbox-common"><input type="checkbox" onclick="CheckAll(this)"></i></th>
						<th align="left">姓名</th>
						<th align="left">电话</th>
						<th align="left">备注</th>
						<th>操作</th>
					</tr>
				</thead>
				<tbody id="productTbody"><tr align="center"><td><i class="checkbox-common"><input name="sub" type="checkbox" value="1"></i></td><td align="left" class="tal">abc</td><td align="left" class="tal">a3124</td><td align="left" class="tal"></td><td class="tal"><a onclick="distributionShow(1)">修改</a><a style="cursor: pointer;" onclick="DelDistributionUser(1)">删除</a></td></tr></tbody>
			</table>
		</div>
	</div>
</div>
</div>
<!-- 添加会员 -->

<div class="modal hide fade" id="add_update_distribution_user" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true" style="margin-left:-365px; width: 550px;">
	<div class="modal-dialog">
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
				<h3>配送人信息</h3>
			</div>
			<div class="modal-body">
				<div class="form-group clear">
					<div class="pick_title"><span class="required">*</span>姓名：</div>
					<div class="col-lg-4"><input type="text" id="name" class="input-common" style="width:350px"></div>
				</div>
				<div class="form-group clear">
					<div class="pick_title"><span class="required">*</span>电话：</div>
					<div class="col-lg-4"><input type="text" id="mobile" class="input-common" style="width:350px"></div>
				</div>
				<div class="form-group clear">
					<div class="pick_title">备注：</div>
					
					<div class="col-lg-4"><textarea name="remark" rows="3" id="remark" class="textarea-common" style="width:350px"></textarea></div>
				</div>
			</div>
			
			<div class="modal-footer">
				<input type="hidden" id="id">
				<button type="button" class="btn-common btn-big" onclick="addUpdateDistributionAjax()">确定</button>
				<button type="button" class="btn-common-cancle btn-big" data-dismiss="modal">关闭</button>
			</div>
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
<input type="hidden" id="page_size" value="1">
		
		
	</section>
</template>
