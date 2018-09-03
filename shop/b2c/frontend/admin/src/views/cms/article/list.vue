<template>
    <section class="ns-base-section">
		
		
		
		<div style="position:relative;margin:0;">
			<!-- 面包屑导航 -->
						<div class="breadcrumb-nav">
				<a href="index.html">零基础学IT就来</a>
									<i class="fa fa-angle-right"></i>
					<a href="/config/usernotice.html">网站</a>
									<i class="fa fa-angle-right"></i>
					<!-- 需要加跳转链接用这个：http://showfx.niuteam.cn/admin/cms/articlelist -->
					<a href="javascript:;" style="color:#999;">文章管理</a>
							</div>
						<!-- 三级导航菜单 -->
			
								<nav class="ns-third-menu">
					<ul>
												<li class="selected" onclick="location.href='/cms/articlelist.html';">文章列表</li>
													<li onclick="location.href='/cms/articleclasslist.html';">文章分类</li>
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
									<p>相关教程：<a href="http://bbs.niushop.com.cn/forum.php?mod=viewthread&amp;tid=2378&amp;extra=page%3D1" target="_blank">http://bbs.niushop.com.cn/forum.php?mod=viewthread&amp;tid=2378&amp;extra=page%3D1</a></p>
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
<!-- 						<span>相关教程：<a href="http://bbs.niushop.com.cn/forum.php?mod=viewthread&tid=2378&extra=page%3D1" target="_blank">http://bbs.niushop.com.cn/forum.php?mod=viewthread&tid=2378&extra=page%3D1</a></span> -->
<!-- 						 -->
<!-- 					{1/block} -->
				</h4>
			</div>
		</div>
		
		
		<div class="ns-main">
			
<table class="mytable">
	<tbody><tr>
		<td width="50%" style="text-align: left;">
			<button class="btn-common-delete" onclick="batchDelete()">批量删除</button>
			<button class="btn-common" onclick="location.href='/cms/addarticle.html';" style="margin:0 5px 0 0 !important;">添加文章</button>
		</td>
		<td width="20%">
			<input type="text" id="search_text" placeholder="请输入文章标题或分类名称" class="input-common">
			<input type="button" onclick="searchData()" value="搜索" class="btn-common">
		</td>
	</tr>
</tbody></table>
<table class="table-class">
	<colgroup>
		<col style="width: 2%">
		<col style="width: 19%;">
		<col style="width: 17%;">
		<col style="width: 17%;">
		<col style="width: 10%;">
		<col style="width: 16%;">
		<col style="width: 4%;">
		<col style="width: 15%;">
	</colgroup>
	<thead>
		<tr align="center">
			<th><i class="checkbox-common"><input id="ckall" type="checkbox" onclick="CheckAll(this)"></i></th>
			<th align="left"><div class="iconbg-arrow up">标题</div></th>
			<th align="left"><div class="iconbg-arrow up">分类</div></th>
			<th><div class="iconbg-arrow up">点击量 / 评论量</div></th>
			<th><div class="iconbg-arrow up">状态</div></th>
			<th><div class="iconbg-arrow up">发布时间</div></th>
			<th><div class="iconbg-arrow up">排序</div></th>
			<th>操作</th>
		</tr>
	</thead>
	<tbody><tr align="center"><td><i class="checkbox-common"><input name="sub" type="checkbox" value="1"></i></td><td align="left" title="新闻">新闻</td><td align="left">新闻1</td><td>56 / 0</td><td>已发布</td><td>2018-07-18 14:09:46</td><td><input type="number" min="0" value="22" fieldid="1" class="num input-common input-common-sort"></td><td><a target="_blank" href="/cms/articleclassinfo?article_id=1&amp;class_id=1">预览</a><a href="/cms/updatearticle?id=1">修改</a><a style="cursor: pointer;" onclick="deleteArticle(1)">删除</a></td> </tr><tr align="center"><td><i class="checkbox-common"><input name="sub" type="checkbox" value="2"></i></td><td align="left" title="rewqrewqrqew">rewqrewqrqew</td><td align="left">新闻1</td><td>4356 / 4312</td><td>已发布</td><td>2018-08-06 10:11:56</td><td><input type="number" min="0" value="33" fieldid="2" class="num input-common input-common-sort"></td><td><a target="_blank" href="/cms/articleclassinfo?article_id=2&amp;class_id=1">预览</a><a href="/cms/updatearticle?id=2">修改</a><a style="cursor: pointer;" onclick="deleteArticle(2)">删除</a></td> </tr></tbody>
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
			<li class="total-data" data-total-count="2">共2条</li>
			<!-- <li class="page-count">共0页</li> -->
			<li class="according-number">
				跳<input type="text" class="input-medium" id="skipPage" data-curr-page="1">页
			</li>
		</ul>
	</div>
</div>
<input type="hidden" id="page_count" value="1">
<input type="hidden" id="page_size" value="2">
		</div>
		
	</section>
</template>
