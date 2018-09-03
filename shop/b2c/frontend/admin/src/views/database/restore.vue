<template>
    <section class="ns-base-section">
		
		
		
		<div style="position:relative;margin:0;">
			<!-- 面包屑导航 -->
						<div class="breadcrumb-nav">
				<a href="index.html">零基础学IT就来</a>
									<i class="fa fa-angle-right"></i>
					<a href="/config/webconfig.html">设置</a>
									<i class="fa fa-angle-right"></i>
					<!-- 需要加跳转链接用这个：http://showfx.niuteam.cn/admin/dbdatabase/importdatalist -->
					<a href="javascript:;" style="color:#999;">数据库恢复</a>
							</div>
						<!-- 三级导航菜单 -->
			
								<nav class="ns-third-menu">
					<ul>
												<li onclick="location.href='/dbdatabase/databaselist.html';">数据库备份</li>
													<li class="selected" onclick="location.href='/dbdatabase/importdatalist.html';">数据库恢复</li>
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
			
<div class="mod-table">
	<div class="mod-table-head">
		<table class="table-class ">
			<colgroup>
				<col style="width: 2%;">
				<col style="width: 36%;">
				<col style="width: 36%;">
				<col style="width: 16%;">
				<col style="width: 10%;">
			</colgroup>
			<thead>
				<tr align="center">
					<th style="text-align: center;"><i class="checkbox-common"><input type="checkbox" onclick="CheckAll(this)"></i></th>
					<th class="x-tab" align="left"><div class="iconbg-arrow up">文件名称</div></th>
					<th class="x-tab" align="right"><div class="iconbg-arrow up">文件大小<span class="row-30"></span></div></th>
					<th class="x-tab"><div class="iconbg-arrow up">备份时间</div></th>
					<th class="x-tab">操作</th>
				</tr>
			</thead>
			<tbody><tr align="center"><td style="text-align: center;"><i class="checkbox-common"><input name="sub" type="checkbox" value="undefined"></i></td><td align="left">20180822-175628</td><td align="right">220.11KB<span class="row-30"></span></td><td>2018-08-22 17:56:28</td><td><a target="_blank" href="javascript:isSureImport(1534931788,null,null)">恢复</a><a href="javascript:isSureDelete(1534931788)" "="">删除</a></td> </tr><tr align="center"><td style="text-align: center;"><i class="checkbox-common"><input name="sub" type="checkbox" value="undefined"></i></td><td align="left">20180817-150112</td><td align="right">331.25KB<span class="row-30"></span></td><td>2018-08-17 15:01:12</td><td><a target="_blank" href="javascript:isSureImport(1534489272,null,null)">恢复</a><a href="javascript:isSureDelete(1534489272)" "="">删除</a></td> </tr><tr align="center"><td style="text-align: center;"><i class="checkbox-common"><input name="sub" type="checkbox" value="undefined"></i></td><td align="left">20180811-154405</td><td align="right">324.83KB<span class="row-30"></span></td><td>2018-08-11 15:44:05</td><td><a target="_blank" href="javascript:isSureImport(1533973445,null,null)">恢复</a><a href="javascript:isSureDelete(1533973445)" "="">删除</a></td> </tr><tr align="center"><td style="text-align: center;"><i class="checkbox-common"><input name="sub" type="checkbox" value="undefined"></i></td><td align="left">20180811-024434</td><td align="right">324.48KB<span class="row-30"></span></td><td>2018-08-11 02:44:34</td><td><a target="_blank" href="javascript:isSureImport(1533926674,null,null)">恢复</a><a href="javascript:isSureDelete(1533926674)" "="">删除</a></td> </tr></tbody>
		</table>
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
