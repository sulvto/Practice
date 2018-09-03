<template>
	
	<section class="ns-base-section">
		
		<div style="position:relative;margin:0;">
			<!-- 面包屑导航 -->
						<div class="breadcrumb-nav">
				<a href="index.html">大鵬系統</a>
									<i class="fa fa-angle-right"></i>
					<a href="/member/memberlist.html">会员</a>
									<i class="fa fa-angle-right"></i>
					<!-- 需要加跳转链接用这个：http://showfx.niuteam.cn/admin/member/pointlist -->
					<a href="javascript:;" style="color:#999;">积分管理</a>
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
			
<table class="mytable">
	<tbody><tr>
		<td width="10%">
			<span>发生时间：</span>
			<input type="text" id="startDate" placeholder="请选择开始日期" class="input-medium input-common middle" onclick="WdatePicker()">
			&nbsp;-&nbsp;
			<input type="text" id="endDate" placeholder="请选择结束日期" class="input-medium input-common middle" onclick="WdatePicker()">
			<!-- 更多搜索按钮 -->
			<button class="btn-common-white more-search"><i class="fa fa-chevron-down"></i></button>
			<button type="button" onclick="searchData()" value="搜索" class="btn-common">搜索</button>
			<!-- 更多搜索下拉框 -->
			<div class="more-search-container">
				<dl>
					<dt>会员昵称：</dt>
					<dd>
						<input type="text" id="search_text" placeholder="请输入会员昵称" class="input-common  middle">
					</dd>
				</dl>
				<dl>
					<dt>发生类别：</dt>
					<dd>
						<div class="selectric-wrapper selectric-select-common selectric-middle" style="width: 150px;"><div class="selectric-hide-select"><select id="form_type" class="select-common middle" tabindex="-1">
							<option value="">全部</option>
														<option value="1">商城订单</option>
														<option value="2">订单退还</option>
														<option value="3">兑换</option>
														<option value="4">充值</option>
														<option value="5">签到</option>
														<option value="6">分享</option>
														<option value="7">注册</option>
														<option value="8">提现</option>
														<option value="9">提现退还</option>
														<option value="10">调整</option>
														<option value="11">参与营销游戏消耗积分</option>
														<option value="19">点赞</option>
														<option value="20">评论</option>
													</select></div><div class="selectric"><span class="selectric-label">全部</span><button class="selectric-button">▾</button></div><div class="selectric-items" tabindex="-1"><div class="selectric-scroll"><ul><li data-index="0" class="selected" title="全部">全部</li><li data-index="1" class="" title="商城订单">商城订单</li><li data-index="2" class="" title="订单退还">订单退还</li><li data-index="3" class="" title="兑换">兑换</li><li data-index="4" class="" title="充值">充值</li><li data-index="5" class="" title="签到">签到</li><li data-index="6" class="" title="分享">分享</li><li data-index="7" class="" title="注册">注册</li><li data-index="8" class="" title="提现">提现</li><li data-index="9" class="" title="提现退还">提现退还</li><li data-index="10" class="" title="调整">调整</li><li data-index="11" class="" title="参与营销游戏消耗积分">参与营销游戏消耗积分</li><li data-index="12" class="" title="点赞">点赞</li><li data-index="13" class="last" title="评论">评论</li></ul></div></div><input class="selectric-input" tabindex="0"></div>
					</dd>
				</dl>
				<dl>
					<dt></dt>
					<dd><button onclick="searchData()" class="btn-common">搜索</button></dd>
				</dl>
			</div>
		</td>
	</tr>
</tbody></table>
<table class="table-class">
	<colgroup>
		<col style="width: 2%;">
		<col style="width: 15%;">
		<col style="width: 20%;">
		<col style="width: 27%;">
		<col style="width: 20%;">
		<col style="width: 16%;">
	</colgroup>
	<thead>
		<tr align="center">
			<th><i class="checkbox-common"><input type="checkbox" onclick="CheckAll(this)"></i></th>
			<th align="left">会员昵称</th>
			<th align="left">类别</th>
			<th align="left">描述</th>
			<th align="right">数量<span class="row-30"></span></th>
			<th>时间</th>
		</tr>
	</thead>
	<tbody><tr align="center"><td><i class="checkbox-common"><input name="sub" type="checkbox" value="278"></i></td><td align="left">cqinter</td><td align="left">签到</td><td align="left">签到赠送积分</td><td align="right">0.00<span class="row-30"></span></td><td align="center">2018-08-24 23:53:52</td></tr><tr align="center"><td><i class="checkbox-common"><input name="sub" type="checkbox" value="277"></i></td><td align="left">123123</td><td align="left">签到</td><td align="left">签到赠送积分</td><td align="right">0.00<span class="row-30"></span></td><td align="center">2018-08-24 10:28:51</td></tr><tr align="center"><td><i class="checkbox-common"><input name="sub" type="checkbox" value="275"></i></td><td align="left">yaodayizi</td><td align="left">注册</td><td align="left">注册会员赠送积分</td><td align="right">100.00<span class="row-30"></span></td><td align="center">2018-08-23 16:18:11</td></tr><tr align="center"><td><i class="checkbox-common"><input name="sub" type="checkbox" value="274"></i></td><td align="left">weibin123</td><td align="left">注册</td><td align="left">注册会员赠送积分</td><td align="right">100.00<span class="row-30"></span></td><td align="center">2018-08-22 19:45:33</td></tr><tr align="center"><td><i class="checkbox-common"><input name="sub" type="checkbox" value="273"></i></td><td align="left">s51983</td><td align="left">注册</td><td align="left">注册会员赠送积分</td><td align="right">100.00<span class="row-30"></span></td><td align="center">2018-08-21 17:30:40</td></tr><tr align="center"><td><i class="checkbox-common"><input name="sub" type="checkbox" value="271"></i></td><td align="left">123123</td><td align="left">注册</td><td align="left">注册会员赠送积分</td><td align="right">100.00<span class="row-30"></span></td><td align="center">2018-08-21 14:26:48</td></tr><tr align="center"><td><i class="checkbox-common"><input name="sub" type="checkbox" value="270"></i></td><td align="left">admin123</td><td align="left">调整</td><td align="left"></td><td align="right">11111.00<span class="row-30"></span></td><td align="center">2018-08-21 09:29:10</td></tr><tr align="center"><td><i class="checkbox-common"><input name="sub" type="checkbox" value="267"></i></td><td align="left">huge</td><td align="left">评论</td><td align="left">评论赠送积分</td><td align="right">0.00<span class="row-30"></span></td><td align="center">2018-08-20 10:56:07</td></tr><tr align="center"><td><i class="checkbox-common"><input name="sub" type="checkbox" value="264"></i></td><td align="left">mingbolang</td><td align="left">注册</td><td align="left">注册会员赠送积分</td><td align="right">100.00<span class="row-30"></span></td><td align="center">2018-08-20 08:26:57</td></tr><tr align="center"><td><i class="checkbox-common"><input name="sub" type="checkbox" value="261"></i></td><td align="left">dagege</td><td align="left">注册</td><td align="left">注册会员赠送积分</td><td align="right">100.00<span class="row-30"></span></td><td align="center">2018-08-17 21:57:00</td></tr><tr align="center"><td><i class="checkbox-common"><input name="sub" type="checkbox" value="260"></i></td><td align="left">hnxzhl</td><td align="left">注册</td><td align="left">注册会员赠送积分</td><td align="right">100.00<span class="row-30"></span></td><td align="center">2018-08-17 21:51:16</td></tr><tr align="center"><td><i class="checkbox-common"><input name="sub" type="checkbox" value="259"></i></td><td align="left">afc</td><td align="left">注册</td><td align="left">注册会员赠送积分</td><td align="right">100.00<span class="row-30"></span></td><td align="center">2018-08-17 11:01:58</td></tr><tr align="center"><td><i class="checkbox-common"><input name="sub" type="checkbox" value="255"></i></td><td align="left">qpchina</td><td align="left">商城订单</td><td align="left">商城订单完成支付赠送积分,订单号：2018081416440001【订单号：<a href="/order/orderdetail?order_id=109">2018081416440001</a>】</td><td align="right">1.00<span class="row-30"></span></td><td align="center">2018-08-14 16:44:16</td></tr><tr align="center"><td><i class="checkbox-common"><input name="sub" type="checkbox" value="254"></i></td><td align="left">qpchina</td><td align="left">商城订单</td><td align="left">商城订单完成支付赠送积分,订单号：2018081416400002【订单号：<a href="/order/orderdetail?order_id=108">2018081416400002</a>】</td><td align="right">1.00<span class="row-30"></span></td><td align="center">2018-08-14 16:40:27</td></tr></tbody>
</table>


<div class="page" id="turn-ul" style="">
	<div class="pagination">
		<ul>
			<li class="according-number">每页显示<input type="text" class="input-medium" id="showNumber" value="14" data-default="14" autocomplete="off">条</li>
			<li><a id="beginPage" class="page-disable" style="border: 1px solid #dddddd;">首页</a></li>
			<li><a id="prevPage" class="page-disable">上一页</a></li>
			<li id="pageNumber"><a onclick="JumpForPage(this)" class="currentPage">1</a><a onclick="JumpForPage(this)">2</a><a onclick="JumpForPage(this)">3</a><a onclick="JumpForPage(this)">4</a><a onclick="JumpForPage(this)">5</a></li>
			<li id="JslastPage" style="display: inline-block;"><span class="ellipsis">···</span><a onclick="JumpForPage(this)">13</a></li>
			<li><a id="nextPage">下一页</a></li>
			<li><a id="lastPage">末页</a></li>
			<li class="total-data" data-total-count="174">共174条</li>
			<!-- <li class="page-count">共0页</li> -->
			<li class="according-number">
				跳<input type="text" class="input-medium" id="skipPage" data-curr-page="1">页
			</li>
		</ul>
	</div>
</div>
<input type="hidden" id="page_count" value="13">
<input type="hidden" id="page_size" value="14">
		</div>
		
	</section>
</template>
