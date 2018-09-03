<template>
    <section class="ns-base-section">
		
		
		
		<div style="position:relative;margin:0;">
			<!-- 面包屑导航 -->
						<div class="breadcrumb-nav">
				<a href="index.html">零基础学IT就来</a>
									<i class="fa fa-angle-right"></i>
					<a href="/config/webconfig.html">设置</a>
									<i class="fa fa-angle-right"></i>
					<!-- 需要加跳转链接用这个：http://showfx.niuteam.cn/admin/config/notifylist -->
					<a href="javascript:;" style="color:#999;">通知记录</a>
							</div>
						<!-- 三级导航菜单 -->
			
								<nav class="ns-third-menu">
					<ul>
												<li class="selected" onclick="location.href='/config/notifylist.html?type=1';">全部</li>
													<li onclick="location.href='/config/notifylist.html?type=1&amp;status=0';">未发送</li>
													<li onclick="location.href='/config/notifylist.html?type=1&amp;status=1';">发送成功</li>
													<li onclick="location.href='/config/notifylist.html?type=1&amp;status=2';">发送失败</li>
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
			
<table class="mytable">
	<tbody><tr>
		<th width="10%">
			<input type="text" id="search_text" placeholder="请输入通知标题" class="input-common">
			<input type="button" onclick="searchData()" value="搜索" class="btn-common">
		</th>
	</tr>
</tbody></table>
<table class="table-class">
	<colgroup>
	<col style="width: 2%;">
	<col style="width: 8%;">
	<col style="width: 20%;">
	<col style="width: 10%;">
	<col style="width: 15%;">
	<col style="width: 15%;">
	<col style="width: 10%;">
	<col style="width: 10%;">
	</colgroup>
	<thead>
		<tr align="center">
			<th></th>
			<th align="left">类型</th>
			<th align="left">标题</th>
			<th align="left">接收账号</th>
			<th>创建时间</th>
			<th>发送时间</th>
			<th>状态</th>
			<th>操作</th>
		</tr>
	</thead>
	<tbody><tr align="center"><td></td><td align="left">短信</td><td align="left">用户注册短信验证码</td><td align="left">17701877745</td><td>2018-09-01 10:34:46</td><td>2018-09-01 10:34:46</td><td>发送失败</td><td><a href="javascript:void(0);" onclick="notifyDetailInfo(19)">详情</a>&nbsp;</td> </tr><tr align="center"><td></td><td align="left">短信</td><td align="left">用户注册短信验证码</td><td align="left">18561150580</td><td>2018-08-20 12:44:24</td><td>2018-08-20 12:44:24</td><td>发送失败</td><td><a href="javascript:void(0);" onclick="notifyDetailInfo(18)">详情</a>&nbsp;</td> </tr><tr align="center"><td></td><td align="left">短信</td><td align="left">用户注册短信验证码</td><td align="left">18561150580</td><td>2018-08-20 12:44:18</td><td>2018-08-20 12:44:18</td><td>发送失败</td><td><a href="javascript:void(0);" onclick="notifyDetailInfo(17)">详情</a>&nbsp;</td> </tr><tr align="center"><td></td><td align="left">短信</td><td align="left">找回密码短信验证码</td><td align="left"></td><td>2018-08-19 19:08:35</td><td>2018-08-19 19:08:35</td><td>发送失败</td><td><a href="javascript:void(0);" onclick="notifyDetailInfo(16)">详情</a>&nbsp;</td> </tr><tr align="center"><td></td><td align="left">短信</td><td align="left">用户注册短信验证码</td><td align="left"></td><td>2018-08-18 15:59:29</td><td>2018-08-18 15:59:29</td><td>发送失败</td><td><a href="javascript:void(0);" onclick="notifyDetailInfo(15)">详情</a>&nbsp;</td> </tr><tr align="center"><td></td><td align="left">短信</td><td align="left">用户注册短信验证码</td><td align="left"></td><td>2018-08-14 21:38:03</td><td>2018-08-14 21:38:03</td><td>发送失败</td><td><a href="javascript:void(0);" onclick="notifyDetailInfo(13)">详情</a>&nbsp;</td> </tr><tr align="center"><td></td><td align="left">短信</td><td align="left">用户注册短信验证码</td><td align="left">18601635429</td><td>2018-08-03 17:06:23</td><td>2018-08-03 17:06:23</td><td>发送失败</td><td><a href="javascript:void(0);" onclick="notifyDetailInfo(12)">详情</a>&nbsp;</td> </tr><tr align="center"><td></td><td align="left">短信</td><td align="left">用户注册短信验证码</td><td align="left">18626306846</td><td>2018-07-30 10:54:48</td><td>2018-07-30 10:54:48</td><td>发送失败</td><td><a href="javascript:void(0);" onclick="notifyDetailInfo(11)">详情</a>&nbsp;</td> </tr><tr align="center"><td></td><td align="left">短信</td><td align="left">绑定手机号短信验证码</td><td align="left">18818117058</td><td>2018-07-23 17:14:57</td><td>2018-07-23 17:14:57</td><td>发送失败</td><td><a href="javascript:void(0);" onclick="notifyDetailInfo(10)">详情</a>&nbsp;</td> </tr><tr align="center"><td></td><td align="left">短信</td><td align="left">绑定手机号短信验证码</td><td align="left">18818117058</td><td>2018-07-23 17:14:28</td><td>2018-07-23 17:14:28</td><td>发送失败</td><td><a href="javascript:void(0);" onclick="notifyDetailInfo(9)">详情</a>&nbsp;</td> </tr></tbody>
</table>

<!-- 模态框（Modal） -->
<div class="modal fade hide" id="notifyDetailInfo" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
	<div class="modal-dialog">
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
				<h3>通知详情</h3>
			</div>
			<div class="modal-body">
				<div class="modal-infp-style">
					<table style="table-layout: fixed;">
						<tbody><tr>
							<td style="width:60px;">接受账号</td>
							<td colspan="5" id="user_name"></td>
						</tr>
						<tr>
							<td style="width:60px;">通知名称</td>
							<td colspan="5" id="notice_title"></td>
						</tr>
						<tr>
							<td style="width:60px;">创建时间 </td>
							<td colspan="5" id="create_date"></td>
						</tr>
						<tr>
							<td style="width:60px;">发送时间 </td>
							<td colspan="5" id="send_date"></td>
						</tr>
						
						<tr>
							<td style="width:60px;">类型</td>
							<td colspan="2" id="type"></td>
							<td style="width:60px;">状态</td>
							<td colspan="2" id="status"></td>

						</tr>
						<tr>
							<td style="width:60px;">通知内容</td>
							<td colspan="5" id="notice_context" style="word-break: break-word;"></td>
						</tr>

						<tr>
							<td style="width:60px;">返回结果</td>
							<td colspan="5" id="send_message" style="word-break: break-word;"></td>
						</tr>

					</tbody></table>
				</div>
			</div>
			<div class="modal-footer">
				<button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
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
			<li id="pageNumber"><a onclick="JumpForPage(this)" class="currentPage">1</a><a onclick="JumpForPage(this)">2</a></li>
			<li id="JslastPage"></li>
			<li><a id="nextPage">下一页</a></li>
			<li><a id="lastPage">末页</a></li>
			<li class="total-data" data-total-count="18">共18条</li>
			<!-- <li class="page-count">共0页</li> -->
			<li class="according-number">
				跳<input type="text" class="input-medium" id="skipPage" data-curr-page="1">页
			</li>
		</ul>
	</div>
</div>
<input type="hidden" id="page_count" value="2">
<input type="hidden" id="page_size" value="10">
		</div>
		
	</section>
</template>
