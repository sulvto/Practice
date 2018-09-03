<template>
    <section class="ns-base-section">
		
		
		
		<div style="position:relative;margin:0;">
			<!-- 面包屑导航 -->
						<div class="breadcrumb-nav">
				<a href="index.html">零基础学IT就来</a>
									<i class="fa fa-angle-right"></i>
					<a href="/config/webconfig.html">设置</a>
									<i class="fa fa-angle-right"></i>
					<!-- 需要加跳转链接用这个：http://showfx.niuteam.cn/admin/auth/authLog -->
					<a href="javascript:;" style="color:#999;">操作日志</a>
							</div>
						<!-- 三级导航菜单 -->
			
								<nav class="ns-third-menu">
					<ul>
												<li onclick="location.href='/auth/userlist.html';">用户列表</li>
													<li onclick="location.href='/auth/authgrouplist.html';">权限组</li>
													<li class="selected" onclick="location.href='/auth/authLog.html';">操作日志</li>
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
		<td style="text-align: left;">
			<button class="btn-common-delete" onclick="batchDelete()" style="margin:0 5px 0 0 !important;">批量删除</button>
		</td>
		<td>
			<span>操作时间：</span>
			<input type="text" id="startDate" class="input-common w100" placeholder="请选择开始日期" onclick="WdatePicker()">
			&nbsp;-&nbsp;
			<input type="text" id="endDate" placeholder="请选择结束日期" class="input-common w100" onclick="WdatePicker()">
			<button class="btn-common-white more-search"><i class="fa fa-chevron-down"></i></button>
			<input type="button" class="btn-common" onclick="searchData()" value="搜索">
			<!-- 更多搜索 -->
			<div class="more-search-container">
				<dl>
					<dt>用户名：</dt>
					<dd>
						<input type="text" id="search_text" placeholder="请输入用户名" class="input-common middle">
					</dd>
				</dl>
				<dl>
					<dt></dt>
					<dd>
						<a href="javascript:;" onclick="searchData()" class="btn-common">完成</a>
					</dd>
				</dl>
			</div>
		</td>
	</tr>
</tbody></table>
<table class="table-class">
	<colgroup>
		<col style="width: 2%;">
		<col style="width: 10%;">
		<col style="width: 10%;">
		<col style="width: 10%;">
		<col style="width: 42%;">
		<col style="width: 16%;">
		<col style="width: 10%;">
	</colgroup>
	<thead>
		<tr align="center">
			<th><i class="checkbox-common"><input type="checkbox" onclick="CheckAll(this)"></i></th>
			<th align="left">操作用户</th>
			<th align="left">操作</th>
			<th align="left">IP</th>
			<th align="left">操作详情</th>
			<th>时间</th>
			<th>操作</th>
		</tr>
	</thead>
	<tbody id="productTbody"><tr align="center"><td><i class="checkbox-common"><input name="sub" type="checkbox" value="1865"></i></td><td align="left">admin</td><td align="left">用户/用户登录</td><td align="left">113.73.200.133</td><td align="left">访问地址：<span style="color:#ff0000;">http://showfx.niuteam.cn/admin/login/login</span><br>操作描述：<span style="color:blue;"></span></td><td>2018-09-03 01:13:18</td><td><a href="javascript:;" onclick="deleteLog(1865)">删除</a></td></tr><tr align="center"><td><i class="checkbox-common"><input name="sub" type="checkbox" value="1864"></i></td><td align="left">admin</td><td align="left">用户/用户登录</td><td align="left">222.211.249.217</td><td align="left">访问地址：<span style="color:#ff0000;">http://showfx.niuteam.cn/admin/login/login</span><br>操作描述：<span style="color:blue;"></span></td><td>2018-09-02 23:58:58</td><td><a href="javascript:;" onclick="deleteLog(1864)">删除</a></td></tr><tr align="center"><td><i class="checkbox-common"><input name="sub" type="checkbox" value="1863"></i></td><td align="left">admin</td><td align="left">用户/用户登录</td><td align="left">119.129.224.181</td><td align="left">访问地址：<span style="color:#ff0000;">http://showfx.niuteam.cn/admin/login/login</span><br>操作描述：<span style="color:blue;"></span></td><td>2018-09-02 23:15:47</td><td><a href="javascript:;" onclick="deleteLog(1863)">删除</a></td></tr><tr align="center"><td><i class="checkbox-common"><input name="sub" type="checkbox" value="1862"></i></td><td align="left">admin</td><td align="left">用户/用户登录</td><td align="left">119.129.224.181</td><td align="left">访问地址：<span style="color:#ff0000;">http://showfx.niuteam.cn/admin/login/login</span><br>操作描述：<span style="color:blue;"></span></td><td>2018-09-02 23:15:37</td><td><a href="javascript:;" onclick="deleteLog(1862)">删除</a></td></tr><tr align="center"><td><i class="checkbox-common"><input name="sub" type="checkbox" value="1861"></i></td><td align="left">admin</td><td align="left">用户/用户登录</td><td align="left">222.211.249.217</td><td align="left">访问地址：<span style="color:#ff0000;">http://showfx.niuteam.cn/admin/login/login</span><br>操作描述：<span style="color:blue;"></span></td><td>2018-09-02 22:25:21</td><td><a href="javascript:;" onclick="deleteLog(1861)">删除</a></td></tr><tr align="center"><td><i class="checkbox-common"><input name="sub" type="checkbox" value="1860"></i></td><td align="left">admin</td><td align="left">用户/用户登录</td><td align="left">222.211.249.217</td><td align="left">访问地址：<span style="color:#ff0000;">http://showfx.niuteam.cn/admin/login/login</span><br>操作描述：<span style="color:blue;"></span></td><td>2018-09-02 21:46:32</td><td><a href="javascript:;" onclick="deleteLog(1860)">删除</a></td></tr><tr align="center"><td><i class="checkbox-common"><input name="sub" type="checkbox" value="1859"></i></td><td align="left">admin</td><td align="left">用户/用户登录</td><td align="left">61.242.112.59</td><td align="left">访问地址：<span style="color:#ff0000;">http://showfx.niuteam.cn/admin/login/login</span><br>操作描述：<span style="color:blue;"></span></td><td>2018-09-02 21:23:29</td><td><a href="javascript:;" onclick="deleteLog(1859)">删除</a></td></tr><tr align="center"><td><i class="checkbox-common"><input name="sub" type="checkbox" value="1858"></i></td><td align="left">admin</td><td align="left">用户/用户登录</td><td align="left">61.242.112.59</td><td align="left">访问地址：<span style="color:#ff0000;">http://showfx.niuteam.cn/admin/login/login</span><br>操作描述：<span style="color:blue;"></span></td><td>2018-09-02 18:39:46</td><td><a href="javascript:;" onclick="deleteLog(1858)">删除</a></td></tr><tr align="center"><td><i class="checkbox-common"><input name="sub" type="checkbox" value="1857"></i></td><td align="left">admin</td><td align="left">用户/用户登录</td><td align="left">222.211.249.217</td><td align="left">访问地址：<span style="color:#ff0000;">http://showfx.niuteam.cn/admin/login/login</span><br>操作描述：<span style="color:blue;"></span></td><td>2018-09-02 18:23:00</td><td><a href="javascript:;" onclick="deleteLog(1857)">删除</a></td></tr><tr align="center"><td><i class="checkbox-common"><input name="sub" type="checkbox" value="1856"></i></td><td align="left">admin</td><td align="left">用户/用户登录</td><td align="left">110.81.126.27</td><td align="left">访问地址：<span style="color:#ff0000;">http://showfx.niuteam.cn/admin/login/login</span><br>操作描述：<span style="color:blue;"></span></td><td>2018-09-02 15:44:50</td><td><a href="javascript:;" onclick="deleteLog(1856)">删除</a></td></tr><tr align="center"><td><i class="checkbox-common"><input name="sub" type="checkbox" value="1855"></i></td><td align="left">admin</td><td align="left">用户/用户登录</td><td align="left">183.253.44.210</td><td align="left">访问地址：<span style="color:#ff0000;">http://showfx.niuteam.cn/admin/login/login</span><br>操作描述：<span style="color:blue;"></span></td><td>2018-09-02 14:18:34</td><td><a href="javascript:;" onclick="deleteLog(1855)">删除</a></td></tr><tr align="center"><td><i class="checkbox-common"><input name="sub" type="checkbox" value="1854"></i></td><td align="left">admin</td><td align="left">用户/用户登录</td><td align="left">183.253.44.210</td><td align="left">访问地址：<span style="color:#ff0000;">http://showfx.niuteam.cn/admin/login/login</span><br>操作描述：<span style="color:blue;"></span></td><td>2018-09-02 14:03:28</td><td><a href="javascript:;" onclick="deleteLog(1854)">删除</a></td></tr><tr align="center"><td><i class="checkbox-common"><input name="sub" type="checkbox" value="1853"></i></td><td align="left">admin</td><td align="left">用户/用户登录</td><td align="left">183.253.44.192</td><td align="left">访问地址：<span style="color:#ff0000;">http://showfx.niuteam.cn/admin/login/login</span><br>操作描述：<span style="color:blue;"></span></td><td>2018-09-02 12:58:06</td><td><a href="javascript:;" onclick="deleteLog(1853)">删除</a></td></tr><tr align="center"><td><i class="checkbox-common"><input name="sub" type="checkbox" value="1852"></i></td><td align="left">admin</td><td align="left">用户/用户登录</td><td align="left">183.253.44.192</td><td align="left">访问地址：<span style="color:#ff0000;">http://showfx.niuteam.cn/admin/login/login</span><br>操作描述：<span style="color:blue;"></span></td><td>2018-09-02 12:00:30</td><td><a href="javascript:;" onclick="deleteLog(1852)">删除</a></td></tr></tbody>
</table>

<div class="page" id="turn-ul" style="">
	<div class="pagination">
		<ul>
			<li class="according-number">每页显示<input type="text" class="input-medium" id="showNumber" value="14" data-default="14" autocomplete="off">条</li>
			<li><a id="beginPage" class="page-disable" style="border: 1px solid #dddddd;">首页</a></li>
			<li><a id="prevPage" class="page-disable">上一页</a></li>
			<li id="pageNumber"><a onclick="JumpForPage(this)" class="currentPage">1</a><a onclick="JumpForPage(this)">2</a><a onclick="JumpForPage(this)">3</a><a onclick="JumpForPage(this)">4</a><a onclick="JumpForPage(this)">5</a></li>
			<li id="JslastPage" style="display: inline-block;"><span class="ellipsis">···</span><a onclick="JumpForPage(this)">132</a></li>
			<li><a id="nextPage">下一页</a></li>
			<li><a id="lastPage">末页</a></li>
			<li class="total-data" data-total-count="1841">共1841条</li>
			<!-- <li class="page-count">共0页</li> -->
			<li class="according-number">
				跳<input type="text" class="input-medium" id="skipPage" data-curr-page="1">页
			</li>
		</ul>
	</div>
</div>
<input type="hidden" id="page_count" value="132">
<input type="hidden" id="page_size" value="14">
		</div>
		
	</section>
</template>
