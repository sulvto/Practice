<template>
	
	<section class="ns-base-section">
		
		
		
		<div style="position:relative;margin:0;">
			<!-- 面包屑导航 -->
						<div class="breadcrumb-nav">
				<a href="index.html">大鵬系統</a>
									<i class="fa fa-angle-right"></i>
					<a href="/Distribution/promoterList.html">分销</a>
									<i class="fa fa-angle-right"></i>
					<!-- 需要加跳转链接用这个：http://showfx.niuteam.cn/admin/Distribution/promoterList -->
					<a href="javascript:;" style="color:#999;">推广员管理</a>
							</div>
						<!-- 三级导航菜单 -->
			
								<nav class="ns-third-menu">
					<ul>
												<li class="selected" onclick="location.href='/Distribution/promoterList.html';">推广员</li>
													<li onclick="location.href='/Distribution/promoterList.html?is_audit=0';">待审核</li>
											</ul>
				</nav>
							
			<div class="right-side-operation">
				<ul>
					
<!-- <li><a class="nscs-table-handle_green" href="javascript:;" onclick="addBrand()"><i class="fa fa-plus-circle"></i>&nbsp;添加品牌</a></li> -->

					
<!-- 					style="display:none;" style="display:block;" -->
					<li>
						<a class="js-open-warmp-prompt" href="javascript:;" data-menu-desc=""><i class="fa fa-question-circle"></i>&nbsp;提示</a>
						<div class="popover">
							<div class="arrow"></div>
							<div class="popover-content">
								<div>
																		<h4>操作提示</h4>
									<p>推广员管理</p>
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
<!-- 						<span>推广员管理</span> -->
<!-- 						 -->
<!-- 					{1/block} -->
				</h4>
			</div>
		</div>
		
		
		<div class="ns-main">
			
<table class="mytable">
	
	<tbody><tr>
		<th>
			申请时间：
			<input type="text" id="startDate" class="input-common middle" placeholder="请选择开始日期" onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm:ss'})">
			&nbsp;-&nbsp;
			<input type="text" id="endDate" placeholder="请选择结束日期" class="input-common middle" onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm:ss'})">
			<button class="btn-common-white more-search"><i class="fa fa-chevron-down"></i></button>
			<button onclick="searchData()" value="搜索" class="btn-common">搜索</button>
			<button onclick="promoterExcel()" value="搜索" class="btn-common">导出数据</button>
			<div class="more-search-container">
				<dl>
					<dt>用户昵称：</dt>
					<dd>
						<input id="userName" class="input-common middle" type="text" value="">
					</dd>
				</dl>
				<dl>
					<dt>手机号：</dt>
					<dd>
						<input id="userTel" class="input-common middle" type="text" value="">
					</dd>
				</dl>
				<dl>
					<dt></dt>
					<dd>
						<button onclick="searchData()" class="btn-common">完成</button>
					</dd>
				</dl>
			</div>	
		</th>
	</tr>
</tbody></table>
<div class="mod-table">
	<div class="mod-table-head">
		<div class="con style0list">
				<table class="table-class">
				<colgroup>
					<col style="width: 8%;">
					<col style="width: 12%;">
					<col style="width: 10%;">
					<col style="width: 8%;">
					<col style="width: 8%;">
					<col style="width: 10%;">
					<col style="width: 10%;">
					<col style="width: 7%;">
					<col style="width: 16%;">
					<col style="width: 11%;">
				</colgroup>
				<thead>
					<tr>
						<th>编号</th>
						<th>姓名</th>
						<th>等级</th>
						<th>店铺名称</th>
						<th>团队</th>
						<th>销售总额</th>
						<th>上级推广员</th>
						<th>状态</th>
						<th>申请时间</th>
						<th>操作</th>
					</tr>
				</thead>
				<tbody><tr align="center"><td><img src="/public/static/images/default_user_portrait.gif" class="head-portrait">FX000074</td><td>yaodayizi</td><td>一级分销</td><td>yaodayizi</td><td>推广员数:1<br>粉丝数:0</td><td>0</td><td></td><td><span class="status-success">已审核</span></td><td>2018-08-23 16:18:11</td><td><a href="/Distribution/promoterAccount?promoter_id=99&amp;uid=86" target="_blank">账户详情</a><a href="javascript:void(0);" onclick="showEditParent(99,'');">修改上级</a><br><a href="javascript:void(0);" onclick="modifyPromoterLock(99,0);">解冻店铺</a><a href="javascript:void(0);" onclick="showEditLevel(99,'4');">修改等级</a><br><a href="javascript:void(0);" onclick="showTeamList(99);">我的团队</a><a href="javascript:void(0);" onclick="showEditShopName(99,'yaodayizi');">修改店铺</a></td> </tr><tr align="center"><td><img src="/public/static/images/default_user_portrait.gif" class="head-portrait">FX000075</td><td>weibin123</td><td>一级分销</td><td>weibin123</td><td>推广员数:1<br>粉丝数:0</td><td>0</td><td></td><td><span class="status-success">已审核</span></td><td>2018-08-22 19:45:33</td><td><a href="/Distribution/promoterAccount?promoter_id=98&amp;uid=85" target="_blank">账户详情</a><a href="javascript:void(0);" onclick="showEditParent(98,'');">修改上级</a><br><a href="javascript:void(0);" onclick="modifyPromoterLock(98,1);">冻结店铺</a><a href="javascript:void(0);" onclick="showEditLevel(98,'4');">修改等级</a><br><a href="javascript:void(0);" onclick="showTeamList(98);">我的团队</a><a href="javascript:void(0);" onclick="showEditShopName(98,'weibin123');">修改店铺</a></td> </tr><tr align="center"><td><img src="/public/static/images/default_user_portrait.gif" class="head-portrait">FX000073</td><td>test001</td><td>一级分销</td><td>435435</td><td>推广员数:1<br>粉丝数:0</td><td>0</td><td></td><td><span class="status-success">已审核</span></td><td>2018-08-20 11:33:38</td><td><a href="/Distribution/promoterAccount?promoter_id=97&amp;uid=81" target="_blank">账户详情</a><a href="javascript:void(0);" onclick="showEditParent(97,'');">修改上级</a><br><a href="javascript:void(0);" onclick="modifyPromoterLock(97,1);">冻结店铺</a><a href="javascript:void(0);" onclick="showEditLevel(97,'4');">修改等级</a><br><a href="javascript:void(0);" onclick="showTeamList(97);">我的团队</a><a href="javascript:void(0);" onclick="showEditShopName(97,'435435');">修改店铺</a></td> </tr><tr align="center"><td><img src="/public/static/images/default_user_portrait.gif" class="head-portrait">FX000072</td><td>mingbolang</td><td>一级分销</td><td>ded</td><td>推广员数:1<br>粉丝数:0</td><td>0</td><td></td><td><span class="status-success">已审核</span></td><td>2018-08-20 08:27:22</td><td><a href="/Distribution/promoterAccount?promoter_id=96&amp;uid=80" target="_blank">账户详情</a><a href="javascript:void(0);" onclick="showEditParent(96,'');">修改上级</a><br><a href="javascript:void(0);" onclick="modifyPromoterLock(96,1);">冻结店铺</a><a href="javascript:void(0);" onclick="showEditLevel(96,'4');">修改等级</a><br><a href="javascript:void(0);" onclick="showTeamList(96);">我的团队</a><a href="javascript:void(0);" onclick="showEditShopName(96,'ded');">修改店铺</a></td> </tr><tr align="center"><td><img src="/public/static/images/default_user_portrait.gif" class="head-portrait">FX000071</td><td>hnxzhl</td><td>一级分销</td><td>fenxiaoa</td><td>推广员数:1<br>粉丝数:0</td><td>0</td><td></td><td><span class="status-success">已审核</span></td><td>2018-08-17 21:51:47</td><td><a href="/Distribution/promoterAccount?promoter_id=95&amp;uid=78" target="_blank">账户详情</a><a href="javascript:void(0);" onclick="showEditParent(95,'');">修改上级</a><br><a href="javascript:void(0);" onclick="modifyPromoterLock(95,0);">解冻店铺</a><a href="javascript:void(0);" onclick="showEditLevel(95,'4');">修改等级</a><br><a href="javascript:void(0);" onclick="showTeamList(95);">我的团队</a><a href="javascript:void(0);" onclick="showEditShopName(95,'fenxiaoa');">修改店铺</a></td> </tr><tr align="center"><td><img src="/public/static/images/default_user_portrait.gif" class="head-portrait">FX000076</td><td>admin111</td><td>一级分销</td><td>李白</td><td>推广员数:1<br>粉丝数:0</td><td>0</td><td></td><td><span class="status-success">已审核</span></td><td>2018-08-14 15:23:45</td><td><a href="/Distribution/promoterAccount?promoter_id=94&amp;uid=74" target="_blank">账户详情</a><a href="javascript:void(0);" onclick="showEditParent(94,'');">修改上级</a><br><a href="javascript:void(0);" onclick="modifyPromoterLock(94,1);">冻结店铺</a><a href="javascript:void(0);" onclick="showEditLevel(94,'4');">修改等级</a><br><a href="javascript:void(0);" onclick="showTeamList(94);">我的团队</a><a href="javascript:void(0);" onclick="showEditShopName(94,'李白');">修改店铺</a></td> </tr><tr align="center"><td><img src="/public/static/images/default_user_portrait.gif" class="head-portrait">FX000067</td><td>ztyzp</td><td>一级分销</td><td>ztyzp</td><td>推广员数:1<br>粉丝数:0</td><td>0</td><td></td><td><span class="status-success">已审核</span></td><td>2018-08-12 12:00:43</td><td><a href="/Distribution/promoterAccount?promoter_id=90&amp;uid=69" target="_blank">账户详情</a><a href="javascript:void(0);" onclick="showEditParent(90,'');">修改上级</a><br><a href="javascript:void(0);" onclick="modifyPromoterLock(90,1);">冻结店铺</a><a href="javascript:void(0);" onclick="showEditLevel(90,'4');">修改等级</a><br><a href="javascript:void(0);" onclick="showTeamList(90);">我的团队</a><a href="javascript:void(0);" onclick="showEditShopName(90,'ztyzp');">修改店铺</a></td> </tr><tr align="center"><td><img src="/public/static/images/default_user_portrait.gif" class="head-portrait">FX000068</td><td>jason001</td><td>一级分销</td><td>jason001</td><td>推广员数:1<br>粉丝数:0</td><td>0</td><td></td><td><span class="status-success">已审核</span></td><td>2018-08-12 12:00:43</td><td><a href="/Distribution/promoterAccount?promoter_id=91&amp;uid=70" target="_blank">账户详情</a><a href="javascript:void(0);" onclick="showEditParent(91,'');">修改上级</a><br><a href="javascript:void(0);" onclick="modifyPromoterLock(91,1);">冻结店铺</a><a href="javascript:void(0);" onclick="showEditLevel(91,'4');">修改等级</a><br><a href="javascript:void(0);" onclick="showTeamList(91);">我的团队</a><a href="javascript:void(0);" onclick="showEditShopName(91,'jason001');">修改店铺</a></td> </tr><tr align="center"><td><img src="/public/static/images/default_user_portrait.gif" class="head-portrait">FX000069</td><td>niushopdemo</td><td>一级分销</td><td>niushopdemo</td><td>推广员数:1<br>粉丝数:0</td><td>0</td><td></td><td><span class="status-success">已审核</span></td><td>2018-08-12 12:00:43</td><td><a href="/Distribution/promoterAccount?promoter_id=92&amp;uid=71" target="_blank">账户详情</a><a href="javascript:void(0);" onclick="showEditParent(92,'');">修改上级</a><br><a href="javascript:void(0);" onclick="modifyPromoterLock(92,1);">冻结店铺</a><a href="javascript:void(0);" onclick="showEditLevel(92,'4');">修改等级</a><br><a href="javascript:void(0);" onclick="showTeamList(92);">我的团队</a><a href="javascript:void(0);" onclick="showEditShopName(92,'niushopdemo');">修改店铺</a></td> </tr><tr align="center"><td><img src="/public/static/images/default_user_portrait.gif" class="head-portrait">FX000062</td><td>wang1</td><td>一级分销</td><td>买</td><td>推广员数:1<br>粉丝数:0</td><td>0</td><td>wang1234</td><td><span class="status-success">已审核</span></td><td>2018-08-06 15:20:04</td><td><a href="/Distribution/promoterAccount?promoter_id=89&amp;uid=62" target="_blank">账户详情</a><a href="javascript:void(0);" onclick="showEditParent(89,'FX000043');">修改上级</a><br><a href="javascript:void(0);" onclick="modifyPromoterLock(89,1);">冻结店铺</a><a href="javascript:void(0);" onclick="showEditLevel(89,'4');">修改等级</a><br><a href="javascript:void(0);" onclick="showTeamList(89);">我的团队</a><a href="javascript:void(0);" onclick="showEditShopName(89,'买');">修改店铺</a></td> </tr><tr align="center"><td><img src="/public/static/images/default_user_portrait.gif" class="head-portrait">FX000060</td><td>liyi</td><td>三级分销</td><td>zhaeee</td><td>推广员数:0<br>粉丝数:0</td><td>0</td><td></td><td><span class="status-success">已审核</span></td><td>2018-08-02 15:35:58</td><td><a href="/Distribution/promoterAccount?promoter_id=88&amp;uid=68" target="_blank">账户详情</a><a href="javascript:void(0);" onclick="showEditParent(88,'');">修改上级</a><br><a href="javascript:void(0);" onclick="modifyPromoterLock(88,1);">冻结店铺</a><a href="javascript:void(0);" onclick="showEditLevel(88,'5');">修改等级</a><br><a href="javascript:void(0);" onclick="showTeamList(88);">我的团队</a><a href="javascript:void(0);" onclick="showEditShopName(88,'zhaeee');">修改店铺</a></td> </tr><tr align="center"><td><img src="/public/static/images/default_user_portrait.gif" class="head-portrait">FX000066</td><td>wocesi2</td><td>三级分销</td><td>hensheng</td><td>推广员数:1<br>粉丝数:0</td><td>90</td><td></td><td><span class="status-success">已审核</span></td><td>2018-07-31 09:21:33</td><td><a href="/Distribution/promoterAccount?promoter_id=85&amp;uid=65" target="_blank">账户详情</a><a href="javascript:void(0);" onclick="showEditParent(85,'');">修改上级</a><br><a href="javascript:void(0);" onclick="modifyPromoterLock(85,1);">冻结店铺</a><a href="javascript:void(0);" onclick="showEditLevel(85,'5');">修改等级</a><br><a href="javascript:void(0);" onclick="showTeamList(85);">我的团队</a><a href="javascript:void(0);" onclick="showEditShopName(85,'hensheng');">修改店铺</a></td> </tr><tr align="center"><td><img src="/public/static/images/default_user_portrait.gif" class="head-portrait">FX000058</td><td>xxccxx</td><td>三级分销</td><td>xxccxx</td><td>推广员数:2<br>粉丝数:0</td><td>0</td><td></td><td><span class="status-success">已审核</span></td><td>2018-07-30 14:21:56</td><td><a href="/Distribution/promoterAccount?promoter_id=78&amp;uid=29" target="_blank">账户详情</a><a href="javascript:void(0);" onclick="showEditParent(78,'');">修改上级</a><br><a href="javascript:void(0);" onclick="modifyPromoterLock(78,1);">冻结店铺</a><a href="javascript:void(0);" onclick="showEditLevel(78,'5');">修改等级</a><br><a href="javascript:void(0);" onclick="showTeamList(78);">我的团队</a><a href="javascript:void(0);" onclick="showEditShopName(78,'xxccxx');">修改店铺</a></td> </tr><tr align="center"><td><img src="/public/static/images/default_user_portrait.gif" class="head-portrait">FX000064</td><td>zlr</td><td>三级分销</td><td>zlr</td><td>推广员数:1<br>粉丝数:0</td><td>0</td><td></td><td><span class="status-success">已审核</span></td><td>2018-07-30 14:21:56</td><td><a href="/Distribution/promoterAccount?promoter_id=80&amp;uid=45" target="_blank">账户详情</a><a href="javascript:void(0);" onclick="showEditParent(80,'');">修改上级</a><br><a href="javascript:void(0);" onclick="modifyPromoterLock(80,1);">冻结店铺</a><a href="javascript:void(0);" onclick="showEditLevel(80,'5');">修改等级</a><br><a href="javascript:void(0);" onclick="showTeamList(80);">我的团队</a><a href="javascript:void(0);" onclick="showEditShopName(80,'zlr');">修改店铺</a></td> </tr></tbody>
			</table>
		</div>
	</div>
</div>



<!-- 修改用户上级（Modal）开始 -->
<div class="modal fade hide" id="editParent" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
                <h3 class="modal-title" id="myModalLabel">推广员上级修改</h3>
            </div>
            <div class="modal-body">
            	<div class="modal-div">
            		<input type="hidden" id="promoter_id" value="">
            		<dl class="modal-dl">
            			<dt>上级推广员编号:</dt>
            			<dd>
            				<input type="text" id="parent_promoter" value="">
            				<span id="ever_parent_promoter"></span>
            			</dd>
            		</dl>           		            		
            	</div>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn-common btn-big" onclick="modifyPromoterParent();">修改</button>
                <button type="button" class="btn-common-cancle btn-big" data-dismiss="modal">关闭</button>
            </div>
        </div><!-- /.modal-content -->
    </div><!-- /.modal -->
</div>
<div class="modal fade hide" id="editLevel" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
                <h3 class="modal-title" id="myModalLabel">推广员等级修改</h3>
            </div>
            <div class="modal-body">
            	<div class="modal-div">
            		<input type="hidden" id="level_promoter_id" value="">
            		<dl class="modal-dl">
            			<dt>推广员等级:</dt>
            			<dd>
            				<select id="level_id">
            													    <option value="4">一级分销</option>
																    <option value="5">三级分销</option>
																    <option value="6">12</option>
																    <option value="9">ds</option>
																    <option value="11">二级分销</option>
								            				</select>	
            			</dd>
            		</dl>           		            		
            	</div>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn-common btn-big" onclick="modifyPromoterLevel();">修改</button>
                <button type="button" class="btn-common-cancle btn-big" data-dismiss="modal">关闭</button>
            </div>
        </div><!-- /.modal-content -->
    </div><!-- /.modal -->
</div>
<!-- 修改用户上级（Modal）结束 -->

<!--修改店铺名称  -->
<div class="modal fade hide" id="editShopName" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
                <h3 class="modal-title" id="myModalLabel">店铺名称修改</h3>
            </div>
            <div class="modal-body">
            	<div class="modal-div">
            		<input type="hidden" id="shop_promoter_id" value="">
            		<dl class="modal-dl">
            			
            			<dt>店铺名称：</dt>
            			<dd>
            				<input type="text" id="shop_name" value="">
            			</dd>
		            	
            		</dl>           		            		
            	</div>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn-common btn-big" onclick="modifyShopName();">修改</button>
                <button type="button" class="btn-common-cancle btn-big" data-dismiss="modal">关闭</button>
            </div>
        </div><!-- /.modal-content -->
    </div><!-- /.modal -->
</div>


<!--我的团队显示 -->



<div class="modal fade hide" id="myTeam" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true" style="width:60%;left:35%">

	<div class="modal-dialog">
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
				<h3 class="modal-title" id="myModalLabel">我的团队 <input type="button" onclick="dataExcel()" value="导出数据" class="btn-common" style="float: right;margin-right:50px!important">	</h3>
			</div>
			<div class="modal-body" style="min-height: 360px;">
				<div class="modal-infp-style" style="height: 600px; overflow: auto;">
					<table class="modal-tab table-class">
						<thead>
							<tr align="center">
								<th>编号</th>
								<th>昵称</th>
								<th>等级</th>
								<th>店铺名称</th>
								<th>角色</th>
								<th>申请时间</th>
							</tr>
						</thead>
						<colgroup>
							<col style="width: 8%;">
							<col style="width: 12%;">
							<col style="width: 10%;">
							<col style="width: 8%;">
							<col style="width: 7%;">
							<col style="width: 16%;">
						</colgroup>
						<tbody id="my_team_list"></tbody>
					</table>
				</div>
			</div>
			
			<input type="hidden" value="" id="hidden_promoter_id">
			<div class="modal-footer">
				<button type="button" class="btn-common-cancle btn-big" data-dismiss="modal">关闭</button>
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
			<li id="JslastPage"></li>
			<li><a id="nextPage">下一页</a></li>
			<li><a id="lastPage">末页</a></li>
			<li class="total-data" data-total-count="70">共70条</li>
			<!-- <li class="page-count">共0页</li> -->
			<li class="according-number">
				跳<input type="text" class="input-medium" id="skipPage" data-curr-page="1">页
			</li>
		</ul>
	</div>
</div>
<input type="hidden" id="page_count" value="5">
<input type="hidden" id="page_size" value="14">
		</div>
		
	</section>
</template>
