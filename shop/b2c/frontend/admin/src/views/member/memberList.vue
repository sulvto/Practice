<template>
	<section class="ns-base-section">
	
	
	
		<div style="position:relative;margin:0;">
			<!-- 面包屑导航 -->
			<div class="breadcrumb-nav">
				<a href="index.html">大鵬系統</a>
				<i class="fa fa-angle-right"></i>
				<a href="/member/memberlist.html">会员</a>
				<i class="fa fa-angle-right"></i>
				<!-- 需要加跳转链接用这个：http://showfx.niuteam.cn/admin/member/memberlist -->
				<a href="javascript:;" style="color:#999;">会员列表</a>
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
									<h4>操作提示</h4>
									<p>相关教程：<a href="http://bbs.niushop.com.cn/forum.php?mod=viewthread&amp;tid=2321&amp;extra=page%3D2" target="_blank">http://bbs.niushop.com.cn/forum.php?mod=viewthread&amp;tid=2321&amp;extra=page%3D2</a></p>
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
					<!-- 						<span>相关教程：<a href="http://bbs.niushop.com.cn/forum.php?mod=viewthread&tid=2321&extra=page%3D2" target="_blank">http://bbs.niushop.com.cn/forum.php?mod=viewthread&tid=2321&extra=page%3D2</a></span> -->
					<!-- 						 -->
					<!-- 					{1/block} -->
				</h4>
			</div>
		</div>
	
	
		<div class="ns-main">
	
			<table class="mytable">
				<tbody>
					<tr>
						<th width="20%" style="text-align: left;">
							<button class="btn-common-delete btn-small" onclick="batchDelete()" style="margin:0 5px 0 0 !important;">批量删除</button>
							<button class="btn-common btn-small" onclick="add_user()" style="margin:0 5px 0 0 !important;">添加会员</button>
						</th>
	
						<th>
							<div class="selectric-wrapper selectric-select-common selectric-middle" style="width: 150px;">
								<div class="selectric-hide-select"><select id="level_name" class="select-common middle" tabindex="-1">
					<option value="-1">请选择会员等级</option>
									<option value="47">普通会员</option>
									<option value="48">铜牌会员</option>
									<option value="49">银牌会员</option>
									<option value="50">金牌会员</option>
									<option value="51">至尊会员</option>
								</select></div>
								<div class="selectric"><span class="selectric-label">请选择会员等级</span><button class="selectric-button">▾</button></div>
								<div class="selectric-items" tabindex="-1">
									<div class="selectric-scroll">
										<ul>
											<li data-index="0" class="selected" title="请选择会员等级">请选择会员等级</li>
											<li data-index="1" class="" title="普通会员">普通会员</li>
											<li data-index="2" class="" title="铜牌会员">铜牌会员</li>
											<li data-index="3" class="" title="银牌会员">银牌会员</li>
											<li data-index="4" class="" title="金牌会员">金牌会员</li>
											<li data-index="5" class="last" title="至尊会员">至尊会员</li>
										</ul>
									</div>
								</div><input class="selectric-input" tabindex="0"></div>
							<input type="text" id="search_text" placeholder="输入手机号/邮箱/会员昵称" class="input-common middle">
							<input type="button" onclick="searchData()" value="搜索" class="btn-common">
							<input type="button" onclick="dataExcel()" value="导出数据" class="btn-common">
						</th>
					</tr>
				</tbody>
			</table>
			<table class="table-class">
				<thead>
					<tr align="center">
						<th>
							<i class="checkbox-common"><input type="checkbox" onclick="CheckAll(this)"></i>
						</th>
						<th style="width: 30%;">会员</th>
						<th>会员等级</th>
						<th>推广员编号</th>
						<th>积分</th>
						<th>账户余额</th>
						<th>注册&amp;登录</th>
						<th>状态</th>
						<th style="width: 20%;">操作</th>
					</tr>
				</thead>
				<tbody id="productTbody">
					<tr align="center">
						<td><i class="checkbox-common"><input name="sub" type="checkbox" value="86"></i></td>
						<td align="left"><img src="/upload/web_common/419b57e5802bd1f3b8fdedb81fdb5fce_360_360.png" class="head-portrait">
							<div style="float:left;"><label style="float:none;width:100%">用户名：<span>yaodayizi</span></label><label style="float:none;width:100%">昵称: <span>yaodayizi</span></label><label style="float:none;width:100%"><span>手机：--</span></label><label style="float:none;width:100%"><span>邮箱：--</span></label></div>
						</td>
						<td>铜牌会员</td>
						<td><span>FX000074</span></td>
						<td>100</td>
						<td>¥3500.00</td>
						<td>注册时间 : 2018-08-23 16:18:11<br>最后登录 : 2018-08-23 16:46:56</td>
						<td style="color:green;">正常</td>
						<td><a href="/member/accountdetail?member_id=86">账户明细</a><br><a onclick="recharge_point(86,100)">积分调整</a>&nbsp;&nbsp;<a onclick="recharge_balance(86,3500.00)">余额调整</a><br><a onclick="lockuser(86)">设置锁定&nbsp;&nbsp;&nbsp;</a>
							<a
							    onclick="modify_password(86)">重置密码</a><br><a href="/member/newpath?member_id=86">查看足迹</a><a onclick="modify_user(86)">修改</a>&nbsp;<a onclick="delete_user(86)">删除</a><br></td>
					</tr>
					<tr align="center">
						<td><i class="checkbox-common"><input name="sub" type="checkbox" value="85"></i></td>
						<td align="left"><img src="/upload/web_common/419b57e5802bd1f3b8fdedb81fdb5fce_360_360.png" class="head-portrait">
							<div style="float:left;"><label style="float:none;width:100%">用户名：<span>weibin123</span></label><label style="float:none;width:100%">昵称: <span>weibin123</span></label><label style="float:none;width:100%"><span>手机：--</span></label><label style="float:none;width:100%"><span>邮箱：--</span></label></div>
						</td>
						<td>铜牌会员</td>
						<td><span>FX000075</span></td>
						<td>100</td>
						<td>¥0.00</td>
						<td>注册时间 : 2018-08-22 19:45:33<br>最后登录 : 2018-08-22 19:45:33</td>
						<td style="color:green;">正常</td>
						<td><a href="/member/accountdetail?member_id=85">账户明细</a><br><a onclick="recharge_point(85,100)">积分调整</a>&nbsp;&nbsp;<a onclick="recharge_balance(85,0.00)">余额调整</a><br><a onclick="lockuser(85)">设置锁定&nbsp;&nbsp;&nbsp;</a>
							<a
							    onclick="modify_password(85)">重置密码</a><br><a href="/member/newpath?member_id=85">查看足迹</a><a onclick="modify_user(85)">修改</a>&nbsp;<a onclick="delete_user(85)">删除</a><br></td>
					</tr>
					<tr align="center">
						<td><i class="checkbox-common"><input name="sub" type="checkbox" value="84"></i></td>
						<td align="left"><img src="/upload/web_common/419b57e5802bd1f3b8fdedb81fdb5fce_360_360.png" class="head-portrait">
							<div style="float:left;"><label style="float:none;width:100%">用户名：<span>s51983</span></label><label style="float:none;width:100%">昵称: <span>s51983</span></label><label style="float:none;width:100%"><span>手机：--</span></label><label style="float:none;width:100%"><span>邮箱：--</span></label></div>
						</td>
						<td>普通会员</td>
						<td> 无上级 <a onclick="modify_member_promoter(84 , 0)">修改</a></td>
						<td>100</td>
						<td>¥0.00</td>
						<td>注册时间 : 2018-08-21 17:30:40<br>最后登录 : 2018-08-21 17:30:40</td>
						<td style="color:green;">正常</td>
						<td><a href="/member/accountdetail?member_id=84">账户明细</a><br><a onclick="recharge_point(84,100)">积分调整</a>&nbsp;&nbsp;<a onclick="recharge_balance(84,0.00)">余额调整</a><br><a onclick="lockuser(84)">设置锁定&nbsp;&nbsp;&nbsp;</a>
							<a
							    onclick="modify_password(84)">重置密码</a><br><a href="/member/newpath?member_id=84">查看足迹</a><a onclick="modify_user(84)">修改</a>&nbsp;<a onclick="delete_user(84)">删除</a><br></td>
					</tr>
					<tr align="center">
						<td><i class="checkbox-common"><input name="sub" type="checkbox" value="83"></i></td>
						<td align="left"><img src="/upload/web_common/419b57e5802bd1f3b8fdedb81fdb5fce_360_360.png" class="head-portrait">
							<div style="float:left;"><label style="float:none;width:100%">用户名：<span>123123</span></label><label style="float:none;width:100%">昵称: <span>123123</span></label><label style="float:none;width:100%"><span>手机：--</span></label><label style="float:none;width:100%"><span>邮箱：--</span></label></div>
						</td>
						<td>铜牌会员</td>
						<td> 无上级 <a onclick="modify_member_promoter(83 , 0)">修改</a></td>
						<td>100</td>
						<td>¥0.00</td>
						<td>注册时间 : 2018-08-21 14:26:48<br>最后登录 : 2018-08-24 10:27:27</td>
						<td style="color:red;">锁定</td>
						<td><a href="/member/accountdetail?member_id=83">账户明细</a><br><a onclick="recharge_point(83,100)">积分调整</a>&nbsp;&nbsp;<a onclick="recharge_balance(83,0.00)">余额调整</a><br><a onclick="unlockuser(83)">设置解锁&nbsp;&nbsp;&nbsp;</a>
							<a
							    onclick="modify_password(83)">重置密码</a><br><a href="/member/newpath?member_id=83">查看足迹</a><a onclick="modify_user(83)">修改</a>&nbsp;<a onclick="delete_user(83)">删除</a><br></td>
					</tr>
					<tr align="center">
						<td><i class="checkbox-common"><input name="sub" type="checkbox" value="82"></i></td>
						<td align="left"><img src="/upload/web_common/419b57e5802bd1f3b8fdedb81fdb5fce_360_360.png" class="head-portrait">
							<div style="float:left;"><label style="float:none;width:100%">用户名：<span>admin123</span></label><label style="float:none;width:100%">昵称: <span>admin123</span></label><label style="float:none;width:100%"><span>手机：--</span></label><label style="float:none;width:100%"><span>邮箱：--</span></label></div>
						</td>
						<td>金牌会员</td>
						<td> 无上级 <a onclick="modify_member_promoter(82 , 0)">修改</a></td>
						<td>11111</td>
						<td>¥0.00</td>
						<td>注册时间 : 2018-08-21 09:29:03<br>最后登录 : 2018-08-21 09:29:26</td>
						<td style="color:green;">正常</td>
						<td><a href="/member/accountdetail?member_id=82">账户明细</a><br><a onclick="recharge_point(82,11111)">积分调整</a>&nbsp;&nbsp;<a onclick="recharge_balance(82,0.00)">余额调整</a><br><a onclick="lockuser(82)">设置锁定&nbsp;&nbsp;&nbsp;</a>
							<a
							    onclick="modify_password(82)">重置密码</a><br><a href="/member/newpath?member_id=82">查看足迹</a><a onclick="modify_user(82)">修改</a>&nbsp;<a onclick="delete_user(82)">删除</a><br></td>
					</tr>
					<tr align="center">
						<td><i class="checkbox-common"><input name="sub" type="checkbox" value="81"></i></td>
						<td align="left"><img src="/upload/web_common/419b57e5802bd1f3b8fdedb81fdb5fce_360_360.png" class="head-portrait">
							<div style="float:left;"><label style="float:none;width:100%">用户名：<span>test001</span></label><label style="float:none;width:100%">昵称: <span>test001</span></label><label style="float:none;width:100%"><span>手机：--</span></label><label style="float:none;width:100%"><span>邮箱：--</span></label></div>
						</td>
						<td>普通会员</td>
						<td><span>FX000073</span></td>
						<td>0</td>
						<td>¥0</td>
						<td>注册时间 : 2018-08-20 11:24:09<br>最后登录 : 2018-08-24 12:24:09</td>
						<td style="color:green;">正常</td>
						<td><a href="/member/accountdetail?member_id=81">账户明细</a><br><a onclick="recharge_point(81,0)">积分调整</a>&nbsp;&nbsp;<a onclick="recharge_balance(81,0)">余额调整</a><br><a onclick="lockuser(81)">设置锁定&nbsp;&nbsp;&nbsp;</a><a onclick="modify_password(81)">重置密码</a><br>
							<a
							    href="/member/newpath?member_id=81">查看足迹</a><a onclick="modify_user(81)">修改</a>&nbsp;<a onclick="delete_user(81)">删除</a><br></td>
					</tr>
					<tr align="center">
						<td><i class="checkbox-common"><input name="sub" type="checkbox" value="80"></i></td>
						<td align="left"><img src="/upload/web_common/419b57e5802bd1f3b8fdedb81fdb5fce_360_360.png" class="head-portrait">
							<div style="float:left;"><label style="float:none;width:100%">用户名：<span>mingbolang</span></label><label style="float:none;width:100%">昵称: <span>mingbolang</span></label><label style="float:none;width:100%"><span>手机：--</span></label><label style="float:none;width:100%"><span>邮箱：--</span></label></div>
						</td>
						<td>普通会员</td>
						<td><span>FX000072</span></td>
						<td>100</td>
						<td>¥0.00</td>
						<td>注册时间 : 2018-08-20 08:26:57<br>最后登录 : 2018-08-20 08:37:47</td>
						<td style="color:green;">正常</td>
						<td><a href="/member/accountdetail?member_id=80">账户明细</a><br><a onclick="recharge_point(80,100)">积分调整</a>&nbsp;&nbsp;<a onclick="recharge_balance(80,0.00)">余额调整</a><br><a onclick="lockuser(80)">设置锁定&nbsp;&nbsp;&nbsp;</a>
							<a
							    onclick="modify_password(80)">重置密码</a><br><a href="/member/newpath?member_id=80">查看足迹</a><a onclick="modify_user(80)">修改</a>&nbsp;<a onclick="delete_user(80)">删除</a><br></td>
					</tr>
					<tr align="center">
						<td><i class="checkbox-common"><input name="sub" type="checkbox" value="79"></i></td>
						<td align="left"><img src="/upload/web_common/419b57e5802bd1f3b8fdedb81fdb5fce_360_360.png" class="head-portrait">
							<div style="float:left;"><label style="float:none;width:100%">用户名：<span>dagege</span></label><label style="float:none;width:100%">昵称: <span>dagege</span></label><label style="float:none;width:100%"><span>手机：--</span></label><label style="float:none;width:100%"><span>邮箱：--</span></label></div>
						</td>
						<td>普通会员</td>
						<td> 无上级 <a onclick="modify_member_promoter(79 , 0)">修改</a></td>
						<td>100</td>
						<td>¥0.00</td>
						<td>注册时间 : 2018-08-17 21:57:00<br>最后登录 : 2018-08-17 21:57:00</td>
						<td style="color:green;">正常</td>
						<td><a href="/member/accountdetail?member_id=79">账户明细</a><br><a onclick="recharge_point(79,100)">积分调整</a>&nbsp;&nbsp;<a onclick="recharge_balance(79,0.00)">余额调整</a><br><a onclick="lockuser(79)">设置锁定&nbsp;&nbsp;&nbsp;</a>
							<a
							    onclick="modify_password(79)">重置密码</a><br><a href="/member/newpath?member_id=79">查看足迹</a><a onclick="modify_user(79)">修改</a>&nbsp;<a onclick="delete_user(79)">删除</a><br></td>
					</tr>
					<tr align="center">
						<td><i class="checkbox-common"><input name="sub" type="checkbox" value="78"></i></td>
						<td align="left"><img src="/upload/web_common/419b57e5802bd1f3b8fdedb81fdb5fce_360_360.png" class="head-portrait">
							<div style="float:left;"><label style="float:none;width:100%">用户名：<span>hnxzhl</span></label><label style="float:none;width:100%">昵称: <span>hnxzhl</span></label><label style="float:none;width:100%"><span>手机：--</span></label><label style="float:none;width:100%"><span>邮箱：--</span></label></div>
						</td>
						<td>普通会员</td>
						<td><span>FX000071</span></td>
						<td>100</td>
						<td>¥0.00</td>
						<td>注册时间 : 2018-08-17 21:51:16<br>最后登录 : 2018-08-18 21:26:21</td>
						<td style="color:green;">正常</td>
						<td><a href="/member/accountdetail?member_id=78">账户明细</a><br><a onclick="recharge_point(78,100)">积分调整</a>&nbsp;&nbsp;<a onclick="recharge_balance(78,0.00)">余额调整</a><br><a onclick="lockuser(78)">设置锁定&nbsp;&nbsp;&nbsp;</a>
							<a
							    onclick="modify_password(78)">重置密码</a><br><a href="/member/newpath?member_id=78">查看足迹</a><a onclick="modify_user(78)">修改</a>&nbsp;<a onclick="delete_user(78)">删除</a><br></td>
					</tr>
					<tr align="center">
						<td><i class="checkbox-common"><input name="sub" type="checkbox" value="77"></i></td>
						<td align="left"><img src="/upload/web_common/419b57e5802bd1f3b8fdedb81fdb5fce_360_360.png" class="head-portrait">
							<div style="float:left;"><label style="float:none;width:100%">用户名：<span>afc</span></label><label style="float:none;width:100%">昵称: <span>afc</span></label><label style="float:none;width:100%"><span>手机：--</span></label><label style="float:none;width:100%"><span>邮箱：--</span></label></div>
						</td>
						<td>普通会员</td>
						<td> 无上级 <a onclick="modify_member_promoter(77 , 0)">修改</a></td>
						<td>100</td>
						<td>¥0.00</td>
						<td>注册时间 : 2018-08-17 11:01:58<br>最后登录 : 2018-08-17 11:06:44</td>
						<td style="color:green;">正常</td>
						<td><a href="/member/accountdetail?member_id=77">账户明细</a><br><a onclick="recharge_point(77,100)">积分调整</a>&nbsp;&nbsp;<a onclick="recharge_balance(77,0.00)">余额调整</a><br><a onclick="lockuser(77)">设置锁定&nbsp;&nbsp;&nbsp;</a>
							<a
							    onclick="modify_password(77)">重置密码</a><br><a href="/member/newpath?member_id=77">查看足迹</a><a onclick="modify_user(77)">修改</a>&nbsp;<a onclick="delete_user(77)">删除</a><br></td>
					</tr>
					<tr align="center">
						<td><i class="checkbox-common"><input name="sub" type="checkbox" value="74"></i></td>
						<td align="left"><img src="/upload/web_common/419b57e5802bd1f3b8fdedb81fdb5fce_360_360.png" class="head-portrait">
							<div style="float:left;"><label style="float:none;width:100%">用户名：<span>admin111</span></label><label style="float:none;width:100%">昵称: <span>admin111</span></label><label style="float:none;width:100%"><span>手机：--</span></label><label style="float:none;width:100%"><span>邮箱：--</span></label></div>
						</td>
						<td>普通会员</td>
						<td><span>FX000076</span></td>
						<td>100</td>
						<td>¥0.00</td>
						<td>注册时间 : 2018-08-14 15:22:57<br>最后登录 : 2018-08-14 15:22:57</td>
						<td style="color:green;">正常</td>
						<td><a href="/member/accountdetail?member_id=74">账户明细</a><br><a onclick="recharge_point(74,100)">积分调整</a>&nbsp;&nbsp;<a onclick="recharge_balance(74,0.00)">余额调整</a><br><a onclick="lockuser(74)">设置锁定&nbsp;&nbsp;&nbsp;</a>
							<a
							    onclick="modify_password(74)">重置密码</a><br><a href="/member/newpath?member_id=74">查看足迹</a><a onclick="modify_user(74)">修改</a>&nbsp;<a onclick="delete_user(74)">删除</a><br></td>
					</tr>
					<tr align="center">
						<td><i class="checkbox-common"><input name="sub" type="checkbox" value="73"></i></td>
						<td align="left"><img src="/upload/web_common/419b57e5802bd1f3b8fdedb81fdb5fce_360_360.png" class="head-portrait">
							<div style="float:left;"><label style="float:none;width:100%">用户名：<span>11112222</span></label><label style="float:none;width:100%">昵称: <span>11112222</span></label><label style="float:none;width:100%"><span>手机：--</span></label><label style="float:none;width:100%"><span>邮箱：--</span></label></div>
						</td>
						<td>普通会员</td>
						<td> 无上级 <a onclick="modify_member_promoter(73 , 0)">修改</a></td>
						<td>100</td>
						<td>¥0.00</td>
						<td>注册时间 : 2018-08-13 14:25:32<br>最后登录 : 2018-08-13 14:25:32</td>
						<td style="color:green;">正常</td>
						<td><a href="/member/accountdetail?member_id=73">账户明细</a><br><a onclick="recharge_point(73,100)">积分调整</a>&nbsp;&nbsp;<a onclick="recharge_balance(73,0.00)">余额调整</a><br><a onclick="lockuser(73)">设置锁定&nbsp;&nbsp;&nbsp;</a>
							<a
							    onclick="modify_password(73)">重置密码</a><br><a href="/member/newpath?member_id=73">查看足迹</a><a onclick="modify_user(73)">修改</a>&nbsp;<a onclick="delete_user(73)">删除</a><br></td>
					</tr>
					<tr align="center">
						<td><i class="checkbox-common"><input name="sub" type="checkbox" value="72"></i></td>
						<td align="left"><img src="/upload/web_common/419b57e5802bd1f3b8fdedb81fdb5fce_360_360.png" class="head-portrait">
							<div style="float:left;"><label style="float:none;width:100%">用户名：<span>test12345</span></label><label style="float:none;width:100%">昵称: <span>test12345</span></label><label style="float:none;width:100%"><span>手机：--</span></label><label style="float:none;width:100%"><span>邮箱：--</span></label></div>
						</td>
						<td>普通会员</td>
						<td> 无上级 <a onclick="modify_member_promoter(72 , 0)">修改</a></td>
						<td>100</td>
						<td>¥0.00</td>
						<td>注册时间 : 2018-08-11 14:26:25<br>最后登录 : 2018-08-11 14:26:25</td>
						<td style="color:green;">正常</td>
						<td><a href="/member/accountdetail?member_id=72">账户明细</a><br><a onclick="recharge_point(72,100)">积分调整</a>&nbsp;&nbsp;<a onclick="recharge_balance(72,0.00)">余额调整</a><br><a onclick="lockuser(72)">设置锁定&nbsp;&nbsp;&nbsp;</a>
							<a
							    onclick="modify_password(72)">重置密码</a><br><a href="/member/newpath?member_id=72">查看足迹</a><a onclick="modify_user(72)">修改</a>&nbsp;<a onclick="delete_user(72)">删除</a><br></td>
					</tr>
					<tr align="center">
						<td><i class="checkbox-common"><input name="sub" type="checkbox" value="71"></i></td>
						<td align="left"><img src="/upload/web_common/419b57e5802bd1f3b8fdedb81fdb5fce_360_360.png" class="head-portrait">
							<div style="float:left;"><label style="float:none;width:100%">用户名：<span>niushopdemo</span></label><label style="float:none;width:100%">昵称: <span>niushopdemo</span></label><label style="float:none;width:100%"><span>手机：--</span></label><label style="float:none;width:100%"><span>邮箱：--</span></label></div>
						</td>
						<td>普通会员</td>
						<td><span>FX000069</span></td>
						<td>100</td>
						<td>¥0.00</td>
						<td>注册时间 : 2018-08-10 20:43:10<br>最后登录 : 2018-08-10 20:43:10</td>
						<td style="color:green;">正常</td>
						<td><a href="/member/accountdetail?member_id=71">账户明细</a><br><a onclick="recharge_point(71,100)">积分调整</a>&nbsp;&nbsp;<a onclick="recharge_balance(71,0.00)">余额调整</a><br><a onclick="lockuser(71)">设置锁定&nbsp;&nbsp;&nbsp;</a>
							<a
							    onclick="modify_password(71)">重置密码</a><br><a href="/member/newpath?member_id=71">查看足迹</a><a onclick="modify_user(71)">修改</a>&nbsp;<a onclick="delete_user(71)">删除</a><br></td>
					</tr>
				</tbody>
			</table>
	
			<!-- 余额调整 -->
			<div class="modal fade hide" id="recharge_balance" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
	
				<div class="modal-dialog">
					<div class="modal-content">
						<div class="modal-header">
							<button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
							<h3>调整余额</h3>
						</div>
						<div class="modal-body">
							<div class="modal-infp-style">
								<table>
									<tbody>
										<tr>
											<td>当前余额</td>
											<td colspan="3" id="current_balance" class="input-common"></td>
										</tr>
										<tr>
											<td>调整金额</td>
											<td colspan="3" id="time">
												<input type="number" id="balance" class="input-common harf" min="-9999" max="9999"><em class="unit">元</em>
												<p class="hint">增加或减少</p>
											</td>
										</tr>
										<tr>
											<td>备注</td>
											<td colspan="3" id="time"><textarea id="remark_balance" class="input-common"></textarea></td>
										</tr>
									</tbody>
								</table>
							</div>
						</div>
	
						<div class="modal-footer">
							<input type="hidden" id="balance_id">
							<button class="btn btn-primary" onclick="addAccount(2)">保存</button>
							<button class="btn" data-dismiss="modal">关闭</button>
						</div>
					</div>
				</div>
	
			</div>
	
			<!-- 积分调整 -->
			<div class="modal fade hide" id="recharge_point" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
	
				<div class="modal-dialog">
					<div class="modal-content">
						<div class="modal-header">
							<button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
							<h3>调整积分</h3>
						</div>
						<div class="modal-body">
							<div class="modal-infp-style">
								<table>
									<tbody>
										<tr>
											<td>当前积分</td>
											<td colspan="3" id="current_point" class="input-common"></td>
										</tr>
										<tr>
											<td>调整积分</td>
											<td colspan="3" id="time">
												<input type="number" id="point" class="input-common harf"><em class="unit">分</em>
												<p class="init">输入负数表示为减少</p>
											</td>
										</tr>
										<tr>
											<td>备注</td>
											<td colspan="3" id="time"><textarea id="remark_point" class="textarea-common"></textarea></td>
										</tr>
									</tbody>
								</table>
	
							</div>
						</div>
						<div class="modal-footer">
							<input type="hidden" id="point_id">
							<button class="btn btn-primary" onclick="addAccount(1)">保存</button>
							<button class="btn" data-dismiss="modal">关闭</button>
						</div>
					</div>
				</div>
	
			</div>
	
			<!-- 添加会员 -->
			<div class="modal fade hide" id="add_user" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
	
				<div class="modal-dialog">
					<div class="modal-content">
						<div class="modal-header">
							<button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
							<h3>添加会员</h3>
						</div>
						<div class="modal-body">
							<div class="modal-infp-style">
								<table class="modal-tab">
									<tbody>
										<tr>
											<td style="width:20%;"><span class="required">*</span>用户名</td>
											<td colspan="3">
												<input type="text" id="username" class="input-common">
												<span id="usernameyz"></span>
												<input type="hidden" value="不存在" id="isset_username" class="input-common">
											</td>
										</tr>
										<tr>
											<td><span class="required">*</span>登录密码</td>
											<td colspan="3"><input type="password" id="password" class="input-common"></td>
										</tr>
										<tr>
											<td style="width:22%;"><span class="required">*</span>昵称</td>
											<td colspan="3">
												<input type="text" id="nickname" class="input-common">
											</td>
										</tr>
										<tr>
											<td>会员等级</td>
											<td colspan="3">
												<div class="selectric-wrapper selectric-select-common" style="width: 250px;">
													<div class="selectric-hide-select"><select id="member_level" class="select-common" tabindex="-1">
																			<option value="47">普通会员</option>
																			<option value="48">铜牌会员</option>
																			<option value="49">银牌会员</option>
																			<option value="50">金牌会员</option>
																			<option value="51">至尊会员</option>
																		</select></div>
													<div class="selectric"><span class="selectric-label">普通会员</span><button class="selectric-button">▾</button></div>
													<div class="selectric-items" tabindex="-1">
														<div class="selectric-scroll">
															<ul>
																<li data-index="0" class="selected" title="普通会员">普通会员</li>
																<li data-index="1" class="" title="铜牌会员">铜牌会员</li>
																<li data-index="2" class="" title="银牌会员">银牌会员</li>
																<li data-index="3" class="" title="金牌会员">金牌会员</li>
																<li data-index="4" class="last" title="至尊会员">至尊会员</li>
															</ul>
														</div>
													</div><input class="selectric-input" tabindex="0"></div>
											</td>
										</tr>
										<tr>
											<td>手机号码</td>
											<td colspan="3"><input type="text" id="telephone" class="input-common"><span id="telephoneyz"></span></td>
										</tr>
										<tr>
											<td>邮箱地址</td>
											<td colspan="3"><input type="text" id="member_email" class="input-common"><span id="member_emailyz"></span></td>
										</tr>
										<tr>
											<td>性别</td>
											<td>
												<label>
										<i class="radio-common selected"><input type="radio" checked="checked" name="sex" value="1"></i>
										<span>男&nbsp;&nbsp;</span>
									</label>
												<label>
										<i class="radio-common"><input name="sex" type="radio" value="2"></i>
										<span>女&nbsp;&nbsp;</span>
									</label>
												<label>
										<i class="radio-common"><input name="sex" type="radio" value="0"></i>
										<span>保密</span>
									</label>
											</td>
										</tr>
										<tr>
											<td>账户状态</td>
											<td>
												<label>
										<i class="radio-common selected">
											<input type="radio" checked="checked" name="status" value="1">
										</i>
											<span>正常&nbsp;&nbsp;</span>
										</label>
												<label>
										<i class="radio-common">
											<input name="status" type="radio" value="0">
										</i>
											<span>锁定</span>
									</label>
											</td>
										</tr>
									</tbody>
								</table>
							</div>
						</div>
	
						<div class="modal-footer">
							<button class="btn btn-primary" onclick="addUser()">保存</button>
							<button class="btn" data-dismiss="modal">关闭</button>
						</div>
					</div>
				</div>
	
			</div>
	
			<input type="hidden" id="modify_uid" class="">
			<!-- 修改会员 -->
			<div class="modal fade hide" id="modify_user" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
	
				<div class="modal-dialog">
					<div class="modal-content">
						<div class="modal-header">
							<button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
							<h4 class="modal-title" id="myModalLabel">编辑会员</h4>
						</div>
						<div class="modal-body" style="min-height: 360px;">
							<div class="modal-infp-style">
								<table class="modal-tab">
									<tbody>
										<tr style="height: 32px;">
											<td style="width:20%"><span class="required">*</span>用户名</td>
											<td colspan="3">
												<!-- 								<span id="modify_username"></span> -->
												<input type="text" id="modify_username" class="input-common">
												<span id="modify_usernameyz"></span>
												<input type="hidden" value="不存在" id="modify_isset_username">
											</td>
										</tr>
										<tr>
											<td style="width:20%"><span class="required">*</span>昵称</td>
											<td colspan="3"><input type="text" id="modify_nickname" class="input-common"></td>
										</tr>
										<tr>
											<td>会员等级</td>
											<td colspan="3" style="padding-bottom: 0;">
												<p>
													<div class="selectric-wrapper selectric-select-common" style="width: 250px;">
														<div class="selectric-hide-select"><select id="modify_member_level" class="select-common" tabindex="-1">
																					<option value="47">普通会员</option>
																					<option value="48">铜牌会员</option>
																					<option value="49">银牌会员</option>
																					<option value="50">金牌会员</option>
																					<option value="51">至尊会员</option>
																				</select></div>
														<div class="selectric"><span class="selectric-label">普通会员</span><button class="selectric-button">▾</button></div>
														<div class="selectric-items" tabindex="-1">
															<div class="selectric-scroll">
																<ul>
																	<li data-index="0" class="selected" title="普通会员">普通会员</li>
																	<li data-index="1" class="" title="铜牌会员">铜牌会员</li>
																	<li data-index="2" class="" title="银牌会员">银牌会员</li>
																	<li data-index="3" class="" title="金牌会员">金牌会员</li>
																	<li data-index="4" class="last" title="至尊会员">至尊会员</li>
																</ul>
															</div>
														</div><input class="selectric-input" tabindex="0"></div>
												</p>
											</td>
										</tr>
										<tr>
											<td>手机号码</td>
											<td colspan="3"><input type="text" id="modify_telephone" value="" class="input-common"><span id="modify_telephoneyz"></span></td>
										</tr>
										<tr>
											<td>邮箱地址</td>
											<td colspan="3"><input type="text" id="modify_member_email" class="input-common"><span id="modify_member_emailyz"></span></td>
										</tr>
										<tr>
											<td>性别</td>
											<td id="sex">
												<label>
										<i class="radio-common selected"><input type="radio" checked="checked" name="sex" value="1"></i>
										<span>男&nbsp;&nbsp;</span>
									</label>
												<label>
										<i class="radio-common"><input name="sex" type="radio" value="2"></i>
										<span>女&nbsp;&nbsp;</span>
									</label>
												<label>
										<i class="radio-common"><input name="sex" type="radio" value="0"></i>
										<span>保密</span>
									</label>
											</td>
										</tr>
										<tr>
											<td>账户状态</td>
											<td id="status">
												<label>
										<i class="radio-common selected">
											<input type="radio" checked="checked" name="status" value="1">
										</i>
											<span>正常&nbsp;&nbsp;</span>
										</label>
												<label>
										<i class="radio-common">
											<input name="status" type="radio" value="0">
										</i>
											<span>锁定</span>
									</label>
											</td>
										</tr>
									</tbody>
								</table>
							</div>
						</div>
	
						<div class="modal-footer">
							<input type="hidden" name="" id="hidden_old_username" value="">
							<input type="hidden" id="modify_username_hidden">
							<button class="btn-common btn-big" onclick="modifyUser()" id="butSubmit" style="display:inline-block;">保存</button>
							<button type="button" class="btn-common-white btn-big" data-dismiss="modal">关闭</button>
						</div>
					</div>
				</div>
	
			</div>
	
			<!-- 修改会员密码 -->
			<div class="modal fade hide" id="modify_password" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
	
				<div class="modal-dialog">
					<div class="modal-content">
						<div class="modal-header">
							<button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
							<h4 class="modal-title" id="myModalLabel">重置密码</h4>
						</div>
						<div class="modal-body">
							<div class="modal-infp-style">
								<table class="modal-tab">
									<tbody>
										<tr>
											<td style="width:20%">密码</td>
											<td colspan="3"><input type="text" id="modify_passwords" class="input-common"></td>
										</tr>
									</tbody>
								</table>
							</div>
						</div>
	
						<div class="modal-footer">
							<input type="hidden" id="modify_userid">
							<button class="btn btn-primary" onclick="modifypassword()">保存</button>
							<button class="btn" data-dismiss="modal">关闭</button>
						</div>
					</div>
				</div>
	
			</div>
	
	
			<!-- 修改会员上级编号-->
			<div class="modal fade hide" id="modify_pre_promoter" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
	
				<div class="modal-dialog">
					<div class="modal-content">
						<div class="modal-header">
							<button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
							<h4 class="modal-title" id="myModalLabel">上级编号</h4>
						</div>
						<div class="modal-body">
							<div class="modal-infp-style">
								<table class="modal-tab">
									<tbody>
										<tr>
											<td style="width:20%">上级编号</td>
											<td colspan="3"><input type="text" id="modify_pre_member" class="input-common"></td>
										</tr>
									</tbody>
								</table>
							</div>
						</div>
	
						<div class="modal-footer">
							<input type="hidden" id="modify_promoter_userid">
							<button class="btn btn-primary" onclick="modify_promoter()">保存</button>
							<button class="btn" data-dismiss="modal">关闭</button>
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
						<li id="pageNumber"><a onclick="JumpForPage(this)" class="currentPage">1</a><a onclick="JumpForPage(this)">2</a><a onclick="JumpForPage(this)">3</a><a onclick="JumpForPage(this)">4</a><a onclick="JumpForPage(this)">5</a></li>
						<li id="JslastPage" style="display: inline-block;"><span class="ellipsis">···</span><a onclick="JumpForPage(this)">6</a></li>
						<li><a id="nextPage">下一页</a></li>
						<li><a id="lastPage">末页</a></li>
						<li class="total-data" data-total-count="77">共77条</li>
						<!-- <li class="page-count">共0页</li> -->
						<li class="according-number">
							跳<input type="text" class="input-medium" id="skipPage" data-curr-page="1">页
						</li>
					</ul>
				</div>
			</div>
			<input type="hidden" id="page_count" class="" value="6">
			<input type="hidden" id="page_size" class="" value="14">
		</div>
	
	</section>
</template>
