<template>
    
	<section class="ns-base-section">
		
		
		
		<div style="position:relative;margin:0;">
			<!-- 面包屑导航 -->
						<div class="breadcrumb-nav">
				<a href="http://b2c.niuteam.cn/admin.html">单商户B2C</a>
									<i class="fa fa-angle-right"></i>
					<a href="/goods/goodslist.html">商品</a>
									<i class="fa fa-angle-right"></i>
					<!-- 需要加跳转链接用这个：http://b2c.niuteam.cn/admin/saleservice/consultlist -->
					<a href="javascript:;" style="color:#999;">咨询管理</a>
							</div>
						<!-- 三级导航菜单 -->
			
								<nav class="ns-third-menu">
					<ul>
												<li class="selected" onclick="location.href='/Saleservice/consultList.html';">全部咨询</li>
													<li onclick="location.href='/Saleservice/consultList.html?type=to_reply';">未回复咨询</li>
													<li onclick="location.href='/Saleservice/consultList.html?type=replied';">已回复咨询</li>
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
									<p>相关教程：<a href="http://bbs.niushop.com.cn/forum.php?mod=viewthread&amp;tid=2310&amp;extra=page%3D2" target="_blank">http://bbs.niushop.com.cn/forum.php?mod=viewthread&amp;tid=2310&amp;extra=page%3D2</a></p>
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
<!-- 						<span>相关教程：<a href="http://bbs.niushop.com.cn/forum.php?mod=viewthread&tid=2310&extra=page%3D2" target="_blank">http://bbs.niushop.com.cn/forum.php?mod=viewthread&tid=2310&extra=page%3D2</a></span> -->
<!-- 						 -->
<!-- 					{1/block} -->
				</h4>
			</div>
		</div>
		
		
		<div class="ns-main">
			
<table class="mytable">
	<tbody><tr>
		<td width="9%" style="text-align:left;">
			<button class="btn-common-delete btn-small" onclick="batchDelete()">批量删除</button>
		</td>
		<td>
			咨询时间：
			<input type="text" id="startDate" class="input-medium input-common middle" placeholder="请选择开始日期" onclick="WdatePicker()">
			&nbsp;-&nbsp;
			<input type="text" id="endDate" placeholder="请选择结束日期" class="input-medium input-common middle" onclick="WdatePicker()">
			<button class="btn-common-white more-search"><i class="fa fa-chevron-down"></i></button>
			<button class="btn-common" onclick="LoadingInfo(1)">搜索</button>

			<!-- 更多搜索 -->
			<div class="more-search-container" style="">
				<dl>
					<dt>商品名称：</dt>
					<dd><input id="goods_name" class="input-medium input-common middle" type="text" placeholder="请输入商品名称"></dd>
				</dl>
				<dl>
					<dt>咨询类型：</dt>
					<dd>
						<div class="selectric-wrapper selectric-select-common selectric-middle" style="width: 150px;"><div class="selectric-hide-select"><select id="ct_id" class="select-common middle" tabindex="-1">
							<option value="">全部</option>
													</select></div><div class="selectric"><span class="selectric-label">全部</span><button class="selectric-button">▾</button></div><div class="selectric-items" tabindex="-1"><div class="selectric-scroll"><ul><li data-index="0" class="last selected" title="全部">全部</li></ul></div></div><input class="selectric-input" tabindex="0"></div>
					</dd>
				</dl>
				<dl>
					<dt></dt>
					<dd><button class="btn-common" onclick="LoadingInfo(1)">完成</button></dd>
				</dl>
			</div>
		</td>
	</tr>
</tbody></table>
<table class="table-class">
	<colgroup>
		<col style="width: 2%;">
		<col style="width: 28%;">
		<col style="width: 30%;">
		<col style="width: 30%;">
		<col style="width: 10%;">
	</colgroup>
	<tbody>
		<tr class="table-title" style="background: white; z-index: 10; border: 1px solid #E3E3E3;">
			<th align="center">
				<i class="checkbox-common"><input type="checkbox" onclick="CheckAll(this)"></i>
			</th>
			<th colspan="2" align="left">商品</th>
			<th align="left">咨询用户</th>
			<th colspan="1" style="text-align: center;">咨询时间</th>
			<th style="text-align: center;">操作</th>
		</tr>
	</tbody>
	<tbody id="productTbody" style="border: 0px;"><tr class="tr-title"><td class="td-6" align="center" rowspan="2"><i class="checkbox-common"><input value="6" name="sub" data-state="undefined" type="checkbox"></i></td><td colspan="2" align="left" style="border-left:1px solid #e5e5e5;"><a href="http://b2c.niuteam.cn/goods/goodsinfo?goodsid=27" target="_blank">Haier/海尔 BCD-206STPA 206升三门冷藏家用节能小冰箱 软冷冻</a></td><td align="left"><span class="pro-code">3452101</span></td><td align="center" style="border-right:1px solid #e5e5e5;">2018-08-18 10:58:48</td><td align="center" rowspan="2"><a href="javascript:;" data-placement="bottom" data-original-title="编辑" onclick="replyConsult(6,this)">编辑</a>&nbsp;<a href="javascript:void(0)" data-placement="bottom" onclick="deleteConsult(6)" data-original-title="删除">删除</a></td></tr><tr><td colspan="4"><p><span>咨询内容:</span> <span class="consult_content">输入法都给我的规范化的广发的发给电饭锅</span></p><p><span>回复内容:</span> <span class="consult_reply">您好 欢迎光临  靴靴</span></p></td></tr><tr class="tr-title"><td class="td-5" align="center" rowspan="2"><i class="checkbox-common"><input value="5" name="sub" data-state="undefined" type="checkbox"></i></td><td colspan="2" align="left" style="border-left:1px solid #e5e5e5;"><a href="http://b2c.niuteam.cn/goods/goodsinfo?goodsid=31" target="_blank">蓝斯顿 智能楼宇对讲系统设备直按小高层刷卡门禁门铃套装高清</a></td><td align="left"><span class="pro-code">游客</span></td><td align="center" style="border-right:1px solid #e5e5e5;">2018-08-04 14:43:40</td><td align="center" rowspan="2"><a href="javascript:;" data-placement="bottom" data-original-title="编辑" onclick="replyConsult(5,this)">编辑</a>&nbsp;<a href="javascript:void(0)" data-placement="bottom" onclick="deleteConsult(5)" data-original-title="删除">删除</a></td></tr><tr><td colspan="4"><p><span>咨询内容:</span> <span class="consult_content">1321312</span></p><p><span>回复内容:</span> <span class="consult_reply">暗号对上了</span></p></td></tr><tr class="tr-title"><td class="td-4" align="center" rowspan="2"><i class="checkbox-common"><input value="4" name="sub" data-state="undefined" type="checkbox"></i></td><td colspan="2" align="left" style="border-left:1px solid #e5e5e5;"><a href="http://b2c.niuteam.cn/goods/goodsinfo?goodsid=31" target="_blank">蓝斯顿 智能楼宇对讲系统设备直按小高层刷卡门禁门铃套装高清</a></td><td align="left"><span class="pro-code">游客</span></td><td align="center" style="border-right:1px solid #e5e5e5;">2018-07-27 18:12:42</td><td align="center" rowspan="2"><a href="javascript:;" data-placement="bottom" data-original-title="编辑" onclick="replyConsult(4,this)">编辑</a>&nbsp;<a href="javascript:void(0)" data-placement="bottom" onclick="deleteConsult(4)" data-original-title="删除">删除</a></td></tr><tr><td colspan="4"><p><span>咨询内容:</span> <span class="consult_content">  什么商品这么牛逼</span></p><p><span>回复内容:</span> <span class="consult_reply">就是这么牛逼，老哥</span></p></td></tr><tr class="tr-title"><td class="td-3" align="center" rowspan="2"><i class="checkbox-common"><input value="3" name="sub" data-state="undefined" type="checkbox"></i></td><td colspan="2" align="left" style="border-left:1px solid #e5e5e5;"><a href="http://b2c.niuteam.cn/goods/goodsinfo?goodsid=49" target="_blank">14.1英寸轻薄刀锋四核笔记本电脑手提固态商务学生游戏上网本分期</a></td><td align="left"><span class="pro-code">游客</span></td><td align="center" style="border-right:1px solid #e5e5e5;">2018-07-26 12:55:05</td><td align="center" rowspan="2"><a href="javascript:;" data-placement="bottom" data-original-title="回复" onclick="replyConsult(3,this)">回复</a>&nbsp;<a href="javascript:void(0)" data-placement="bottom" onclick="deleteConsult(3)" data-original-title="删除">删除</a></td></tr><tr><td colspan="4"><p><span>咨询内容:</span> <span class="consult_content">tttt</span></p></td></tr><tr class="tr-title"><td class="td-2" align="center" rowspan="2"><i class="checkbox-common"><input value="2" name="sub" data-state="undefined" type="checkbox"></i></td><td colspan="2" align="left" style="border-left:1px solid #e5e5e5;"><a href="http://b2c.niuteam.cn/goods/goodsinfo?goodsid=112" target="_blank">测试下商品666</a></td><td align="left"><span class="pro-code">ceshi666</span></td><td align="center" style="border-right:1px solid #e5e5e5;">2018-06-25 08:57:29</td><td align="center" rowspan="2"><a href="javascript:;" data-placement="bottom" data-original-title="编辑" onclick="replyConsult(2,this)">编辑</a>&nbsp;<a href="javascript:void(0)" data-placement="bottom" onclick="deleteConsult(2)" data-original-title="删除">删除</a></td></tr><tr><td colspan="4"><p><span>咨询内容:</span> <span class="consult_content">asssss</span></p><p><span>回复内容:</span> <span class="consult_reply">nih </span></p></td></tr><tr class="tr-title"><td class="td-1" align="center" rowspan="2"><i class="checkbox-common"><input value="1" name="sub" data-state="undefined" type="checkbox"></i></td><td colspan="2" align="left" style="border-left:1px solid #e5e5e5;"><a href="http://b2c.niuteam.cn/goods/goodsinfo?goodsid=109" target="_blank">5454545454</a></td><td align="left"><span class="pro-code">admin</span></td><td align="center" style="border-right:1px solid #e5e5e5;">2018-06-23 23:09:14</td><td align="center" rowspan="2"><a href="javascript:;" data-placement="bottom" data-original-title="回复" onclick="replyConsult(1,this)">回复</a>&nbsp;<a href="javascript:void(0)" data-placement="bottom" onclick="deleteConsult(1)" data-original-title="删除">删除</a></td></tr><tr><td colspan="4"><p><span>咨询内容:</span> <span class="consult_content">nihao</span></p></td></tr></tbody>
</table>

<input type="hidden" id="type" value="">
<div class="modal fade hide" id="consult" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
	<div class="modal-dialog">
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
				<h3>咨询管理</h3>
			</div>
			<div class="modal-body">
					<div class="set-style">
						<dl>
							<dt>咨询内容：</dt>
							<dd id="consult_content">
							</dd>
						</dl>
						<dl>
							<dt>回复内容：</dt>
							<dd>
								<textarea id="consult_reply" class="textarea-common"></textarea>
							</dd>
						</dl>
					</div>
				</div>
			</div>
			<div class="modal-footer">
				<input type="hidden" id="consult_id">
				<button type="button" class="btn-common" data-dismiss="modal" onclick="replyConsultAjax()">保存</button>
				<button type="button" class="btn" data-dismiss="modal">关闭</button>
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
			<li class="total-data" data-total-count="6">共6条</li>
			<!-- <li class="page-count">共0页</li> -->
			<li class="according-number">
				跳<input type="text" class="input-medium" id="skipPage" data-curr-page="1">页
			</li>
		</ul>
	</div>
</div>
<input type="hidden" id="page_count" value="1">
<input type="hidden" id="page_size" value="6">
		
	</section>
	
</template>
