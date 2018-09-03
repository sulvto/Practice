<template>
	<section class="ns-base-section">
		
		
		
	<div style="position:relative;margin:0;">
		<!-- 面包屑导航 -->
					<div class="breadcrumb-nav">
			<a href="index.html">大鵬系統</a>
								<i class="fa fa-angle-right"></i>
				<a href="/config/webconfig.html">设置</a>
								<i class="fa fa-angle-right"></i>
				<!-- 需要加跳转链接用这个：http://showfx.niuteam.cn/admin/config/areamanagement -->
				<a href="javascript:;" style="color:#999;">地区管理</a>
						</div>
					<!-- 三级导航菜单 -->
		
							<nav class="ns-third-menu">
				<ul>
											<li class="selected" onclick="location.href='/express/expresscompany.html';">物流配送</li>
												<li onclick="location.href='/shop/pickuppointlist.html';">门店自提</li>
												<li onclick="location.href='/distribution/distributionuserlist.html';">本地配送</li>
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
								<li><a href="/express/expresscompany.html" child_id="1">物流公司</a></li>
									<li class="selected"><a href="/config/areamanagement.html" child_id="2">地区管理</a></li>
										<li><a href="/order/returnsetting.html" child_id="3">商家地址</a></li>
										<li><a href="/config/distributionareamanagement.html" child_id="4">货到付款地区管理</a></li>
										<li><a href="/config/expressmessage.html" child_id="5">物流跟踪设置</a></li>
						
	</ul>
</nav>
<!-- 基础设置 -->

<div class="mod-table">
<div class="mod-table-head">
	<!-- 地区表格 -->
<div class="options-btn">
	<button class="btn-common" onclick="addProvince()">添加一级地区</button>
</div>
<table class="table-class">
	<colgroup>
		<col style="width: 2%">
		<col style="width: 53%;">
		<col style="width: 20%;">
		<col style="width: 10%;">
		<col style="width: 5%;">
		<col style="width: 10%;">
	</colgroup>
	<thead>
		<tr align="center">
			<th></th>
			<th align="left">名称</th>
			<th align="left">所属区域</th>
			<th align="left">添加子地区</th>
			<th>排序</th>
			<th>操作</th>
		</tr>
	</thead>
	<tbody>
		<!-- 循环省级地区 -->
					<tr class="areaTr pid_0" id="province_id_35" isclick="false">
			<td class="areaTd">
								</td>
		
			<td class="areaTd province_35">
				<input type="text" class="areaName input-common" fieldid="35" value="hai" onchange="updateRegionAjax(1,2,this);">
			</td>
			<td class="areaTd province_35">
									<span>港澳台</span>
								</td>
			<td class="areaTd" style="color: #13A5D5;">
				<a href="javascript:;" onclick="addCity(35,this);"><span class="add-child"><i>添加子地区</i></span></a>
			</td>
			<td class="areaTd" align="center">
				<input type="text" class="sort input-common input-common-sort" fieldid="35" fieldname="sort" value="0" onkeyup="this.value=this.value.replace(/\D/g,'')" size="1" onchange="updateRegionAjax(1,1,this);">
			</td>
			<td class="areaTd" style="color: #13A5D5;" align="center">
				<a href="javascript:;" onclick="updateProvince(35,this,8);">修改</a>
				<a href="javascript:;" onclick="delRegion(35,1)">删除</a>
			</td>
		</tr>
					<tr class="areaTr pid_0" id="province_id_20" isclick="false">
			<td class="areaTd">
									<a href="javascript:;" onclick="province_tab_switch(20)" class="tab_jia_20" style="display: block;">[+]</a>
				<a href="javascript:;" onclick="province_tab_switch(20)" class="tab_jian_20" style="display: none;">[-]</a>
								</td>
		
			<td class="areaTd province_20">
				<input type="text" class="areaName input-common" fieldid="20" value="广西壮族自治区" onchange="updateRegionAjax(1,2,this);">
			</td>
			<td class="areaTd province_20">
									<span>华南</span>
								</td>
			<td class="areaTd" style="color: #13A5D5;">
				<a href="javascript:;" onclick="addCity(20,this);"><span class="add-child"><i>添加子地区</i></span></a>
			</td>
			<td class="areaTd" align="center">
				<input type="text" class="sort input-common input-common-sort" fieldid="20" fieldname="sort" value="0" onkeyup="this.value=this.value.replace(/\D/g,'')" size="1" onchange="updateRegionAjax(1,1,this);">
			</td>
			<td class="areaTd" style="color: #13A5D5;" align="center">
				<a href="javascript:;" onclick="updateProvince(20,this,3);">修改</a>
				<a href="javascript:;" onclick="delRegion(20,1)">删除</a>
			</td>
		</tr>
					<tr class="areaTr pid_0" id="province_id_21" isclick="false">
			<td class="areaTd">
									<a href="javascript:;" onclick="province_tab_switch(21)" class="tab_jia_21" style="display: block;">[+]</a>
				<a href="javascript:;" onclick="province_tab_switch(21)" class="tab_jian_21" style="display: none;">[-]</a>
								</td>
		
			<td class="areaTd province_21">
				<input type="text" class="areaName input-common" fieldid="21" value="海南省" onchange="updateRegionAjax(1,2,this);">
			</td>
			<td class="areaTd province_21">
									<span>华南</span>
								</td>
			<td class="areaTd" style="color: #13A5D5;">
				<a href="javascript:;" onclick="addCity(21,this);"><span class="add-child"><i>添加子地区</i></span></a>
			</td>
			<td class="areaTd" align="center">
				<input type="text" class="sort input-common input-common-sort" fieldid="21" fieldname="sort" value="0" onkeyup="this.value=this.value.replace(/\D/g,'')" size="1" onchange="updateRegionAjax(1,1,this);">
			</td>
			<td class="areaTd" style="color: #13A5D5;" align="center">
				<a href="javascript:;" onclick="updateProvince(21,this,3);">修改</a>
				<a href="javascript:;" onclick="delRegion(21,1)">删除</a>
			</td>
		</tr>
					<tr class="areaTr pid_0" id="province_id_22" isclick="false">
			<td class="areaTd">
									<a href="javascript:;" onclick="province_tab_switch(22)" class="tab_jia_22" style="display: block;">[+]</a>
				<a href="javascript:;" onclick="province_tab_switch(22)" class="tab_jian_22" style="display: none;">[-]</a>
								</td>
		
			<td class="areaTd province_22">
				<input type="text" class="areaName input-common" fieldid="22" value="重庆市" onchange="updateRegionAjax(1,2,this);">
			</td>
			<td class="areaTd province_22">
									<span>西南</span>
								</td>
			<td class="areaTd" style="color: #13A5D5;">
				<a href="javascript:;" onclick="addCity(22,this);"><span class="add-child"><i>添加子地区</i></span></a>
			</td>
			<td class="areaTd" align="center">
				<input type="text" class="sort input-common input-common-sort" fieldid="22" fieldname="sort" value="0" onkeyup="this.value=this.value.replace(/\D/g,'')" size="1" onchange="updateRegionAjax(1,1,this);">
			</td>
			<td class="areaTd" style="color: #13A5D5;" align="center">
				<a href="javascript:;" onclick="updateProvince(22,this,7);">修改</a>
				<a href="javascript:;" onclick="delRegion(22,1)">删除</a>
			</td>
		</tr>
					<tr class="areaTr pid_0" id="province_id_23" isclick="false">
			<td class="areaTd">
									<a href="javascript:;" onclick="province_tab_switch(23)" class="tab_jia_23" style="display: block;">[+]</a>
				<a href="javascript:;" onclick="province_tab_switch(23)" class="tab_jian_23" style="display: none;">[-]</a>
								</td>
		
			<td class="areaTd province_23">
				<input type="text" class="areaName input-common" fieldid="23" value="四川省" onchange="updateRegionAjax(1,2,this);">
			</td>
			<td class="areaTd province_23">
									<span>西南</span>
								</td>
			<td class="areaTd" style="color: #13A5D5;">
				<a href="javascript:;" onclick="addCity(23,this);"><span class="add-child"><i>添加子地区</i></span></a>
			</td>
			<td class="areaTd" align="center">
				<input type="text" class="sort input-common input-common-sort" fieldid="23" fieldname="sort" value="0" onkeyup="this.value=this.value.replace(/\D/g,'')" size="1" onchange="updateRegionAjax(1,1,this);">
			</td>
			<td class="areaTd" style="color: #13A5D5;" align="center">
				<a href="javascript:;" onclick="updateProvince(23,this,7);">修改</a>
				<a href="javascript:;" onclick="delRegion(23,1)">删除</a>
			</td>
		</tr>
					<tr class="areaTr pid_0" id="province_id_24" isclick="false">
			<td class="areaTd">
									<a href="javascript:;" onclick="province_tab_switch(24)" class="tab_jia_24" style="display: block;">[+]</a>
				<a href="javascript:;" onclick="province_tab_switch(24)" class="tab_jian_24" style="display: none;">[-]</a>
								</td>
		
			<td class="areaTd province_24">
				<input type="text" class="areaName input-common" fieldid="24" value="贵州省" onchange="updateRegionAjax(1,2,this);">
			</td>
			<td class="areaTd province_24">
									<span>西南</span>
								</td>
			<td class="areaTd" style="color: #13A5D5;">
				<a href="javascript:;" onclick="addCity(24,this);"><span class="add-child"><i>添加子地区</i></span></a>
			</td>
			<td class="areaTd" align="center">
				<input type="text" class="sort input-common input-common-sort" fieldid="24" fieldname="sort" value="0" onkeyup="this.value=this.value.replace(/\D/g,'')" size="1" onchange="updateRegionAjax(1,1,this);">
			</td>
			<td class="areaTd" style="color: #13A5D5;" align="center">
				<a href="javascript:;" onclick="updateProvince(24,this,7);">修改</a>
				<a href="javascript:;" onclick="delRegion(24,1)">删除</a>
			</td>
		</tr>
					<tr class="areaTr pid_0" id="province_id_25" isclick="false">
			<td class="areaTd">
									<a href="javascript:;" onclick="province_tab_switch(25)" class="tab_jia_25" style="display: block;">[+]</a>
				<a href="javascript:;" onclick="province_tab_switch(25)" class="tab_jian_25" style="display: none;">[-]</a>
								</td>
		
			<td class="areaTd province_25">
				<input type="text" class="areaName input-common" fieldid="25" value="云南省" onchange="updateRegionAjax(1,2,this);">
			</td>
			<td class="areaTd province_25">
									<span>西南</span>
								</td>
			<td class="areaTd" style="color: #13A5D5;">
				<a href="javascript:;" onclick="addCity(25,this);"><span class="add-child"><i>添加子地区</i></span></a>
			</td>
			<td class="areaTd" align="center">
				<input type="text" class="sort input-common input-common-sort" fieldid="25" fieldname="sort" value="0" onkeyup="this.value=this.value.replace(/\D/g,'')" size="1" onchange="updateRegionAjax(1,1,this);">
			</td>
			<td class="areaTd" style="color: #13A5D5;" align="center">
				<a href="javascript:;" onclick="updateProvince(25,this,7);">修改</a>
				<a href="javascript:;" onclick="delRegion(25,1)">删除</a>
			</td>
		</tr>
					<tr class="areaTr pid_0" id="province_id_26" isclick="false">
			<td class="areaTd">
									<a href="javascript:;" onclick="province_tab_switch(26)" class="tab_jia_26" style="display: block;">[+]</a>
				<a href="javascript:;" onclick="province_tab_switch(26)" class="tab_jian_26" style="display: none;">[-]</a>
								</td>
		
			<td class="areaTd province_26">
				<input type="text" class="areaName input-common" fieldid="26" value="西藏自治区" onchange="updateRegionAjax(1,2,this);">
			</td>
			<td class="areaTd province_26">
									<span>西南</span>
								</td>
			<td class="areaTd" style="color: #13A5D5;">
				<a href="javascript:;" onclick="addCity(26,this);"><span class="add-child"><i>添加子地区</i></span></a>
			</td>
			<td class="areaTd" align="center">
				<input type="text" class="sort input-common input-common-sort" fieldid="26" fieldname="sort" value="0" onkeyup="this.value=this.value.replace(/\D/g,'')" size="1" onchange="updateRegionAjax(1,1,this);">
			</td>
			<td class="areaTd" style="color: #13A5D5;" align="center">
				<a href="javascript:;" onclick="updateProvince(26,this,7);">修改</a>
				<a href="javascript:;" onclick="delRegion(26,1)">删除</a>
			</td>
		</tr>
					<tr class="areaTr pid_0" id="province_id_27" isclick="false">
			<td class="areaTd">
									<a href="javascript:;" onclick="province_tab_switch(27)" class="tab_jia_27" style="display: block;">[+]</a>
				<a href="javascript:;" onclick="province_tab_switch(27)" class="tab_jian_27" style="display: none;">[-]</a>
								</td>
		
			<td class="areaTd province_27">
				<input type="text" class="areaName input-common" fieldid="27" value="陕西省" onchange="updateRegionAjax(1,2,this);">
			</td>
			<td class="areaTd province_27">
									<span>西北</span>
								</td>
			<td class="areaTd" style="color: #13A5D5;">
				<a href="javascript:;" onclick="addCity(27,this);"><span class="add-child"><i>添加子地区</i></span></a>
			</td>
			<td class="areaTd" align="center">
				<input type="text" class="sort input-common input-common-sort" fieldid="27" fieldname="sort" value="0" onkeyup="this.value=this.value.replace(/\D/g,'')" size="1" onchange="updateRegionAjax(1,1,this);">
			</td>
			<td class="areaTd" style="color: #13A5D5;" align="center">
				<a href="javascript:;" onclick="updateProvince(27,this,6);">修改</a>
				<a href="javascript:;" onclick="delRegion(27,1)">删除</a>
			</td>
		</tr>
					<tr class="areaTr pid_0" id="province_id_28" isclick="false">
			<td class="areaTd">
									<a href="javascript:;" onclick="province_tab_switch(28)" class="tab_jia_28" style="display: block;">[+]</a>
				<a href="javascript:;" onclick="province_tab_switch(28)" class="tab_jian_28" style="display: none;">[-]</a>
								</td>
		
			<td class="areaTd province_28">
				<input type="text" class="areaName input-common" fieldid="28" value="甘肃省" onchange="updateRegionAjax(1,2,this);">
			</td>
			<td class="areaTd province_28">
									<span>西北</span>
								</td>
			<td class="areaTd" style="color: #13A5D5;">
				<a href="javascript:;" onclick="addCity(28,this);"><span class="add-child"><i>添加子地区</i></span></a>
			</td>
			<td class="areaTd" align="center">
				<input type="text" class="sort input-common input-common-sort" fieldid="28" fieldname="sort" value="0" onkeyup="this.value=this.value.replace(/\D/g,'')" size="1" onchange="updateRegionAjax(1,1,this);">
			</td>
			<td class="areaTd" style="color: #13A5D5;" align="center">
				<a href="javascript:;" onclick="updateProvince(28,this,6);">修改</a>
				<a href="javascript:;" onclick="delRegion(28,1)">删除</a>
			</td>
		</tr>
					<tr class="areaTr pid_0" id="province_id_29" isclick="false">
			<td class="areaTd">
									<a href="javascript:;" onclick="province_tab_switch(29)" class="tab_jia_29" style="display: block;">[+]</a>
				<a href="javascript:;" onclick="province_tab_switch(29)" class="tab_jian_29" style="display: none;">[-]</a>
								</td>
		
			<td class="areaTd province_29">
				<input type="text" class="areaName input-common" fieldid="29" value="青海省" onchange="updateRegionAjax(1,2,this);">
			</td>
			<td class="areaTd province_29">
									<span>西北</span>
								</td>
			<td class="areaTd" style="color: #13A5D5;">
				<a href="javascript:;" onclick="addCity(29,this);"><span class="add-child"><i>添加子地区</i></span></a>
			</td>
			<td class="areaTd" align="center">
				<input type="text" class="sort input-common input-common-sort" fieldid="29" fieldname="sort" value="0" onkeyup="this.value=this.value.replace(/\D/g,'')" size="1" onchange="updateRegionAjax(1,1,this);">
			</td>
			<td class="areaTd" style="color: #13A5D5;" align="center">
				<a href="javascript:;" onclick="updateProvince(29,this,6);">修改</a>
				<a href="javascript:;" onclick="delRegion(29,1)">删除</a>
			</td>
		</tr>
					<tr class="areaTr pid_0" id="province_id_30" isclick="false">
			<td class="areaTd">
									<a href="javascript:;" onclick="province_tab_switch(30)" class="tab_jia_30" style="display: block;">[+]</a>
				<a href="javascript:;" onclick="province_tab_switch(30)" class="tab_jian_30" style="display: none;">[-]</a>
								</td>
		
			<td class="areaTd province_30">
				<input type="text" class="areaName input-common" fieldid="30" value="宁夏回族自治区" onchange="updateRegionAjax(1,2,this);">
			</td>
			<td class="areaTd province_30">
									<span>西北</span>
								</td>
			<td class="areaTd" style="color: #13A5D5;">
				<a href="javascript:;" onclick="addCity(30,this);"><span class="add-child"><i>添加子地区</i></span></a>
			</td>
			<td class="areaTd" align="center">
				<input type="text" class="sort input-common input-common-sort" fieldid="30" fieldname="sort" value="0" onkeyup="this.value=this.value.replace(/\D/g,'')" size="1" onchange="updateRegionAjax(1,1,this);">
			</td>
			<td class="areaTd" style="color: #13A5D5;" align="center">
				<a href="javascript:;" onclick="updateProvince(30,this,6);">修改</a>
				<a href="javascript:;" onclick="delRegion(30,1)">删除</a>
			</td>
		</tr>
					<tr class="areaTr pid_0" id="province_id_31" isclick="false">
			<td class="areaTd">
									<a href="javascript:;" onclick="province_tab_switch(31)" class="tab_jia_31" style="display: block;">[+]</a>
				<a href="javascript:;" onclick="province_tab_switch(31)" class="tab_jian_31" style="display: none;">[-]</a>
								</td>
		
			<td class="areaTd province_31">
				<input type="text" class="areaName input-common" fieldid="31" value="新疆维吾尔自治区" onchange="updateRegionAjax(1,2,this);">
			</td>
			<td class="areaTd province_31">
									<span>西北</span>
								</td>
			<td class="areaTd" style="color: #13A5D5;">
				<a href="javascript:;" onclick="addCity(31,this);"><span class="add-child"><i>添加子地区</i></span></a>
			</td>
			<td class="areaTd" align="center">
				<input type="text" class="sort input-common input-common-sort" fieldid="31" fieldname="sort" value="0" onkeyup="this.value=this.value.replace(/\D/g,'')" size="1" onchange="updateRegionAjax(1,1,this);">
			</td>
			<td class="areaTd" style="color: #13A5D5;" align="center">
				<a href="javascript:;" onclick="updateProvince(31,this,6);">修改</a>
				<a href="javascript:;" onclick="delRegion(31,1)">删除</a>
			</td>
		</tr>
					<tr class="areaTr pid_0" id="province_id_32" isclick="false">
			<td class="areaTd">
									<a href="javascript:;" onclick="province_tab_switch(32)" class="tab_jia_32" style="display: block;">[+]</a>
				<a href="javascript:;" onclick="province_tab_switch(32)" class="tab_jian_32" style="display: none;">[-]</a>
								</td>
		
			<td class="areaTd province_32">
				<input type="text" class="areaName input-common" fieldid="32" value="香港特别行政区" onchange="updateRegionAjax(1,2,this);">
			</td>
			<td class="areaTd province_32">
									<span>港澳台</span>
								</td>
			<td class="areaTd" style="color: #13A5D5;">
				<a href="javascript:;" onclick="addCity(32,this);"><span class="add-child"><i>添加子地区</i></span></a>
			</td>
			<td class="areaTd" align="center">
				<input type="text" class="sort input-common input-common-sort" fieldid="32" fieldname="sort" value="0" onkeyup="this.value=this.value.replace(/\D/g,'')" size="1" onchange="updateRegionAjax(1,1,this);">
			</td>
			<td class="areaTd" style="color: #13A5D5;" align="center">
				<a href="javascript:;" onclick="updateProvince(32,this,8);">修改</a>
				<a href="javascript:;" onclick="delRegion(32,1)">删除</a>
			</td>
		</tr>
					<tr class="areaTr pid_0" id="province_id_33" isclick="false">
			<td class="areaTd">
									<a href="javascript:;" onclick="province_tab_switch(33)" class="tab_jia_33" style="display: block;">[+]</a>
				<a href="javascript:;" onclick="province_tab_switch(33)" class="tab_jian_33" style="display: none;">[-]</a>
								</td>
		
			<td class="areaTd province_33">
				<input type="text" class="areaName input-common" fieldid="33" value="澳门特别行政区" onchange="updateRegionAjax(1,2,this);">
			</td>
			<td class="areaTd province_33">
									<span>港澳台</span>
								</td>
			<td class="areaTd" style="color: #13A5D5;">
				<a href="javascript:;" onclick="addCity(33,this);"><span class="add-child"><i>添加子地区</i></span></a>
			</td>
			<td class="areaTd" align="center">
				<input type="text" class="sort input-common input-common-sort" fieldid="33" fieldname="sort" value="0" onkeyup="this.value=this.value.replace(/\D/g,'')" size="1" onchange="updateRegionAjax(1,1,this);">
			</td>
			<td class="areaTd" style="color: #13A5D5;" align="center">
				<a href="javascript:;" onclick="updateProvince(33,this,8);">修改</a>
				<a href="javascript:;" onclick="delRegion(33,1)">删除</a>
			</td>
		</tr>
					<tr class="areaTr pid_0" id="province_id_34" isclick="false">
			<td class="areaTd">
									<a href="javascript:;" onclick="province_tab_switch(34)" class="tab_jia_34" style="display: block;">[+]</a>
				<a href="javascript:;" onclick="province_tab_switch(34)" class="tab_jian_34" style="display: none;">[-]</a>
								</td>
		
			<td class="areaTd province_34">
				<input type="text" class="areaName input-common" fieldid="34" value="台湾省" onchange="updateRegionAjax(1,2,this);">
			</td>
			<td class="areaTd province_34">
									<span>港澳台</span>
								</td>
			<td class="areaTd" style="color: #13A5D5;">
				<a href="javascript:;" onclick="addCity(34,this);"><span class="add-child"><i>添加子地区</i></span></a>
			</td>
			<td class="areaTd" align="center">
				<input type="text" class="sort input-common input-common-sort" fieldid="34" fieldname="sort" value="0" onkeyup="this.value=this.value.replace(/\D/g,'')" size="1" onchange="updateRegionAjax(1,1,this);">
			</td>
			<td class="areaTd" style="color: #13A5D5;" align="center">
				<a href="javascript:;" onclick="updateProvince(34,this,8);">修改</a>
				<a href="javascript:;" onclick="delRegion(34,1)">删除</a>
			</td>
		</tr>
					<tr class="areaTr pid_0" id="province_id_19" isclick="false">
			<td class="areaTd">
									<a href="javascript:;" onclick="province_tab_switch(19)" class="tab_jia_19" style="display: block;">[+]</a>
				<a href="javascript:;" onclick="province_tab_switch(19)" class="tab_jian_19" style="display: none;">[-]</a>
								</td>
		
			<td class="areaTd province_19">
				<input type="text" class="areaName input-common" fieldid="19" value="广东省" onchange="updateRegionAjax(1,2,this);">
			</td>
			<td class="areaTd province_19">
									<span>华南</span>
								</td>
			<td class="areaTd" style="color: #13A5D5;">
				<a href="javascript:;" onclick="addCity(19,this);"><span class="add-child"><i>添加子地区</i></span></a>
			</td>
			<td class="areaTd" align="center">
				<input type="text" class="sort input-common input-common-sort" fieldid="19" fieldname="sort" value="0" onkeyup="this.value=this.value.replace(/\D/g,'')" size="1" onchange="updateRegionAjax(1,1,this);">
			</td>
			<td class="areaTd" style="color: #13A5D5;" align="center">
				<a href="javascript:;" onclick="updateProvince(19,this,3);">修改</a>
				<a href="javascript:;" onclick="delRegion(19,1)">删除</a>
			</td>
		</tr>
					<tr class="areaTr pid_0" id="province_id_18" isclick="false">
			<td class="areaTd">
									<a href="javascript:;" onclick="province_tab_switch(18)" class="tab_jia_18" style="display: block;">[+]</a>
				<a href="javascript:;" onclick="province_tab_switch(18)" class="tab_jian_18" style="display: none;">[-]</a>
								</td>
		
			<td class="areaTd province_18">
				<input type="text" class="areaName input-common" fieldid="18" value="湖南省" onchange="updateRegionAjax(1,2,this);">
			</td>
			<td class="areaTd province_18">
									<span>华中</span>
								</td>
			<td class="areaTd" style="color: #13A5D5;">
				<a href="javascript:;" onclick="addCity(18,this);"><span class="add-child"><i>添加子地区</i></span></a>
			</td>
			<td class="areaTd" align="center">
				<input type="text" class="sort input-common input-common-sort" fieldid="18" fieldname="sort" value="0" onkeyup="this.value=this.value.replace(/\D/g,'')" size="1" onchange="updateRegionAjax(1,1,this);">
			</td>
			<td class="areaTd" style="color: #13A5D5;" align="center">
				<a href="javascript:;" onclick="updateProvince(18,this,4);">修改</a>
				<a href="javascript:;" onclick="delRegion(18,1)">删除</a>
			</td>
		</tr>
					<tr class="areaTr pid_0" id="province_id_17" isclick="false">
			<td class="areaTd">
									<a href="javascript:;" onclick="province_tab_switch(17)" class="tab_jia_17" style="display: block;">[+]</a>
				<a href="javascript:;" onclick="province_tab_switch(17)" class="tab_jian_17" style="display: none;">[-]</a>
								</td>
		
			<td class="areaTd province_17">
				<input type="text" class="areaName input-common" fieldid="17" value="湖北省" onchange="updateRegionAjax(1,2,this);">
			</td>
			<td class="areaTd province_17">
									<span>华中</span>
								</td>
			<td class="areaTd" style="color: #13A5D5;">
				<a href="javascript:;" onclick="addCity(17,this);"><span class="add-child"><i>添加子地区</i></span></a>
			</td>
			<td class="areaTd" align="center">
				<input type="text" class="sort input-common input-common-sort" fieldid="17" fieldname="sort" value="0" onkeyup="this.value=this.value.replace(/\D/g,'')" size="1" onchange="updateRegionAjax(1,1,this);">
			</td>
			<td class="areaTd" style="color: #13A5D5;" align="center">
				<a href="javascript:;" onclick="updateProvince(17,this,4);">修改</a>
				<a href="javascript:;" onclick="delRegion(17,1)">删除</a>
			</td>
		</tr>
					<tr class="areaTr pid_0" id="province_id_2" isclick="false">
			<td class="areaTd">
									<a href="javascript:;" onclick="province_tab_switch(2)" class="tab_jia_2" style="display: block;">[+]</a>
				<a href="javascript:;" onclick="province_tab_switch(2)" class="tab_jian_2" style="display: none;">[-]</a>
								</td>
		
			<td class="areaTd province_2">
				<input type="text" class="areaName input-common" fieldid="2" value="天津市" onchange="updateRegionAjax(1,2,this);">
			</td>
			<td class="areaTd province_2">
									<span>华北</span>
								</td>
			<td class="areaTd" style="color: #13A5D5;">
				<a href="javascript:;" onclick="addCity(2,this);"><span class="add-child"><i>添加子地区</i></span></a>
			</td>
			<td class="areaTd" align="center">
				<input type="text" class="sort input-common input-common-sort" fieldid="2" fieldname="sort" value="0" onkeyup="this.value=this.value.replace(/\D/g,'')" size="1" onchange="updateRegionAjax(1,1,this);">
			</td>
			<td class="areaTd" style="color: #13A5D5;" align="center">
				<a href="javascript:;" onclick="updateProvince(2,this,2);">修改</a>
				<a href="javascript:;" onclick="delRegion(2,1)">删除</a>
			</td>
		</tr>
					<tr class="areaTr pid_0" id="province_id_3" isclick="false">
			<td class="areaTd">
									<a href="javascript:;" onclick="province_tab_switch(3)" class="tab_jia_3" style="display: block;">[+]</a>
				<a href="javascript:;" onclick="province_tab_switch(3)" class="tab_jian_3" style="display: none;">[-]</a>
								</td>
		
			<td class="areaTd province_3">
				<input type="text" class="areaName input-common" fieldid="3" value="河北省" onchange="updateRegionAjax(1,2,this);">
			</td>
			<td class="areaTd province_3">
									<span>华北</span>
								</td>
			<td class="areaTd" style="color: #13A5D5;">
				<a href="javascript:;" onclick="addCity(3,this);"><span class="add-child"><i>添加子地区</i></span></a>
			</td>
			<td class="areaTd" align="center">
				<input type="text" class="sort input-common input-common-sort" fieldid="3" fieldname="sort" value="0" onkeyup="this.value=this.value.replace(/\D/g,'')" size="1" onchange="updateRegionAjax(1,1,this);">
			</td>
			<td class="areaTd" style="color: #13A5D5;" align="center">
				<a href="javascript:;" onclick="updateProvince(3,this,2);">修改</a>
				<a href="javascript:;" onclick="delRegion(3,1)">删除</a>
			</td>
		</tr>
					<tr class="areaTr pid_0" id="province_id_4" isclick="false">
			<td class="areaTd">
									<a href="javascript:;" onclick="province_tab_switch(4)" class="tab_jia_4" style="display: block;">[+]</a>
				<a href="javascript:;" onclick="province_tab_switch(4)" class="tab_jian_4" style="display: none;">[-]</a>
								</td>
		
			<td class="areaTd province_4">
				<input type="text" class="areaName input-common" fieldid="4" value="山西省" onchange="updateRegionAjax(1,2,this);">
			</td>
			<td class="areaTd province_4">
									<span>华北</span>
								</td>
			<td class="areaTd" style="color: #13A5D5;">
				<a href="javascript:;" onclick="addCity(4,this);"><span class="add-child"><i>添加子地区</i></span></a>
			</td>
			<td class="areaTd" align="center">
				<input type="text" class="sort input-common input-common-sort" fieldid="4" fieldname="sort" value="0" onkeyup="this.value=this.value.replace(/\D/g,'')" size="1" onchange="updateRegionAjax(1,1,this);">
			</td>
			<td class="areaTd" style="color: #13A5D5;" align="center">
				<a href="javascript:;" onclick="updateProvince(4,this,2);">修改</a>
				<a href="javascript:;" onclick="delRegion(4,1)">删除</a>
			</td>
		</tr>
					<tr class="areaTr pid_0" id="province_id_5" isclick="false">
			<td class="areaTd">
									<a href="javascript:;" onclick="province_tab_switch(5)" class="tab_jia_5" style="display: block;">[+]</a>
				<a href="javascript:;" onclick="province_tab_switch(5)" class="tab_jian_5" style="display: none;">[-]</a>
								</td>
		
			<td class="areaTd province_5">
				<input type="text" class="areaName input-common" fieldid="5" value="内蒙古自治区" onchange="updateRegionAjax(1,2,this);">
			</td>
			<td class="areaTd province_5">
									<span>华北</span>
								</td>
			<td class="areaTd" style="color: #13A5D5;">
				<a href="javascript:;" onclick="addCity(5,this);"><span class="add-child"><i>添加子地区</i></span></a>
			</td>
			<td class="areaTd" align="center">
				<input type="text" class="sort input-common input-common-sort" fieldid="5" fieldname="sort" value="0" onkeyup="this.value=this.value.replace(/\D/g,'')" size="1" onchange="updateRegionAjax(1,1,this);">
			</td>
			<td class="areaTd" style="color: #13A5D5;" align="center">
				<a href="javascript:;" onclick="updateProvince(5,this,2);">修改</a>
				<a href="javascript:;" onclick="delRegion(5,1)">删除</a>
			</td>
		</tr>
					<tr class="areaTr pid_0" id="province_id_6" isclick="false">
			<td class="areaTd">
									<a href="javascript:;" onclick="province_tab_switch(6)" class="tab_jia_6" style="display: block;">[+]</a>
				<a href="javascript:;" onclick="province_tab_switch(6)" class="tab_jian_6" style="display: none;">[-]</a>
								</td>
		
			<td class="areaTd province_6">
				<input type="text" class="areaName input-common" fieldid="6" value="辽宁省" onchange="updateRegionAjax(1,2,this);">
			</td>
			<td class="areaTd province_6">
									<span>东北</span>
								</td>
			<td class="areaTd" style="color: #13A5D5;">
				<a href="javascript:;" onclick="addCity(6,this);"><span class="add-child"><i>添加子地区</i></span></a>
			</td>
			<td class="areaTd" align="center">
				<input type="text" class="sort input-common input-common-sort" fieldid="6" fieldname="sort" value="0" onkeyup="this.value=this.value.replace(/\D/g,'')" size="1" onchange="updateRegionAjax(1,1,this);">
			</td>
			<td class="areaTd" style="color: #13A5D5;" align="center">
				<a href="javascript:;" onclick="updateProvince(6,this,5);">修改</a>
				<a href="javascript:;" onclick="delRegion(6,1)">删除</a>
			</td>
		</tr>
					<tr class="areaTr pid_0" id="province_id_7" isclick="false">
			<td class="areaTd">
									<a href="javascript:;" onclick="province_tab_switch(7)" class="tab_jia_7" style="display: block;">[+]</a>
				<a href="javascript:;" onclick="province_tab_switch(7)" class="tab_jian_7" style="display: none;">[-]</a>
								</td>
		
			<td class="areaTd province_7">
				<input type="text" class="areaName input-common" fieldid="7" value="吉林省" onchange="updateRegionAjax(1,2,this);">
			</td>
			<td class="areaTd province_7">
									<span>东北</span>
								</td>
			<td class="areaTd" style="color: #13A5D5;">
				<a href="javascript:;" onclick="addCity(7,this);"><span class="add-child"><i>添加子地区</i></span></a>
			</td>
			<td class="areaTd" align="center">
				<input type="text" class="sort input-common input-common-sort" fieldid="7" fieldname="sort" value="0" onkeyup="this.value=this.value.replace(/\D/g,'')" size="1" onchange="updateRegionAjax(1,1,this);">
			</td>
			<td class="areaTd" style="color: #13A5D5;" align="center">
				<a href="javascript:;" onclick="updateProvince(7,this,5);">修改</a>
				<a href="javascript:;" onclick="delRegion(7,1)">删除</a>
			</td>
		</tr>
					<tr class="areaTr pid_0" id="province_id_8" isclick="false">
			<td class="areaTd">
									<a href="javascript:;" onclick="province_tab_switch(8)" class="tab_jia_8" style="display: block;">[+]</a>
				<a href="javascript:;" onclick="province_tab_switch(8)" class="tab_jian_8" style="display: none;">[-]</a>
								</td>
		
			<td class="areaTd province_8">
				<input type="text" class="areaName input-common" fieldid="8" value="黑龙江省" onchange="updateRegionAjax(1,2,this);">
			</td>
			<td class="areaTd province_8">
									<span>东北</span>
								</td>
			<td class="areaTd" style="color: #13A5D5;">
				<a href="javascript:;" onclick="addCity(8,this);"><span class="add-child"><i>添加子地区</i></span></a>
			</td>
			<td class="areaTd" align="center">
				<input type="text" class="sort input-common input-common-sort" fieldid="8" fieldname="sort" value="0" onkeyup="this.value=this.value.replace(/\D/g,'')" size="1" onchange="updateRegionAjax(1,1,this);">
			</td>
			<td class="areaTd" style="color: #13A5D5;" align="center">
				<a href="javascript:;" onclick="updateProvince(8,this,5);">修改</a>
				<a href="javascript:;" onclick="delRegion(8,1)">删除</a>
			</td>
		</tr>
					<tr class="areaTr pid_0" id="province_id_9" isclick="false">
			<td class="areaTd">
									<a href="javascript:;" onclick="province_tab_switch(9)" class="tab_jia_9" style="display: block;">[+]</a>
				<a href="javascript:;" onclick="province_tab_switch(9)" class="tab_jian_9" style="display: none;">[-]</a>
								</td>
		
			<td class="areaTd province_9">
				<input type="text" class="areaName input-common" fieldid="9" value="上海市" onchange="updateRegionAjax(1,2,this);">
			</td>
			<td class="areaTd province_9">
									<span>华东</span>
								</td>
			<td class="areaTd" style="color: #13A5D5;">
				<a href="javascript:;" onclick="addCity(9,this);"><span class="add-child"><i>添加子地区</i></span></a>
			</td>
			<td class="areaTd" align="center">
				<input type="text" class="sort input-common input-common-sort" fieldid="9" fieldname="sort" value="0" onkeyup="this.value=this.value.replace(/\D/g,'')" size="1" onchange="updateRegionAjax(1,1,this);">
			</td>
			<td class="areaTd" style="color: #13A5D5;" align="center">
				<a href="javascript:;" onclick="updateProvince(9,this,1);">修改</a>
				<a href="javascript:;" onclick="delRegion(9,1)">删除</a>
			</td>
		</tr>
					<tr class="areaTr pid_0" id="province_id_10" isclick="false">
			<td class="areaTd">
									<a href="javascript:;" onclick="province_tab_switch(10)" class="tab_jia_10" style="display: block;">[+]</a>
				<a href="javascript:;" onclick="province_tab_switch(10)" class="tab_jian_10" style="display: none;">[-]</a>
								</td>
		
			<td class="areaTd province_10">
				<input type="text" class="areaName input-common" fieldid="10" value="江苏省" onchange="updateRegionAjax(1,2,this);">
			</td>
			<td class="areaTd province_10">
									<span>华东</span>
								</td>
			<td class="areaTd" style="color: #13A5D5;">
				<a href="javascript:;" onclick="addCity(10,this);"><span class="add-child"><i>添加子地区</i></span></a>
			</td>
			<td class="areaTd" align="center">
				<input type="text" class="sort input-common input-common-sort" fieldid="10" fieldname="sort" value="0" onkeyup="this.value=this.value.replace(/\D/g,'')" size="1" onchange="updateRegionAjax(1,1,this);">
			</td>
			<td class="areaTd" style="color: #13A5D5;" align="center">
				<a href="javascript:;" onclick="updateProvince(10,this,1);">修改</a>
				<a href="javascript:;" onclick="delRegion(10,1)">删除</a>
			</td>
		</tr>
					<tr class="areaTr pid_0" id="province_id_11" isclick="false">
			<td class="areaTd">
									<a href="javascript:;" onclick="province_tab_switch(11)" class="tab_jia_11" style="display: block;">[+]</a>
				<a href="javascript:;" onclick="province_tab_switch(11)" class="tab_jian_11" style="display: none;">[-]</a>
								</td>
		
			<td class="areaTd province_11">
				<input type="text" class="areaName input-common" fieldid="11" value="浙江省" onchange="updateRegionAjax(1,2,this);">
			</td>
			<td class="areaTd province_11">
									<span>华东</span>
								</td>
			<td class="areaTd" style="color: #13A5D5;">
				<a href="javascript:;" onclick="addCity(11,this);"><span class="add-child"><i>添加子地区</i></span></a>
			</td>
			<td class="areaTd" align="center">
				<input type="text" class="sort input-common input-common-sort" fieldid="11" fieldname="sort" value="0" onkeyup="this.value=this.value.replace(/\D/g,'')" size="1" onchange="updateRegionAjax(1,1,this);">
			</td>
			<td class="areaTd" style="color: #13A5D5;" align="center">
				<a href="javascript:;" onclick="updateProvince(11,this,1);">修改</a>
				<a href="javascript:;" onclick="delRegion(11,1)">删除</a>
			</td>
		</tr>
					<tr class="areaTr pid_0" id="province_id_12" isclick="false">
			<td class="areaTd">
									<a href="javascript:;" onclick="province_tab_switch(12)" class="tab_jia_12" style="display: block;">[+]</a>
				<a href="javascript:;" onclick="province_tab_switch(12)" class="tab_jian_12" style="display: none;">[-]</a>
								</td>
		
			<td class="areaTd province_12">
				<input type="text" class="areaName input-common" fieldid="12" value="安徽省" onchange="updateRegionAjax(1,2,this);">
			</td>
			<td class="areaTd province_12">
									<span>华东</span>
								</td>
			<td class="areaTd" style="color: #13A5D5;">
				<a href="javascript:;" onclick="addCity(12,this);"><span class="add-child"><i>添加子地区</i></span></a>
			</td>
			<td class="areaTd" align="center">
				<input type="text" class="sort input-common input-common-sort" fieldid="12" fieldname="sort" value="0" onkeyup="this.value=this.value.replace(/\D/g,'')" size="1" onchange="updateRegionAjax(1,1,this);">
			</td>
			<td class="areaTd" style="color: #13A5D5;" align="center">
				<a href="javascript:;" onclick="updateProvince(12,this,1);">修改</a>
				<a href="javascript:;" onclick="delRegion(12,1)">删除</a>
			</td>
		</tr>
					<tr class="areaTr pid_0" id="province_id_13" isclick="false">
			<td class="areaTd">
									<a href="javascript:;" onclick="province_tab_switch(13)" class="tab_jia_13" style="display: block;">[+]</a>
				<a href="javascript:;" onclick="province_tab_switch(13)" class="tab_jian_13" style="display: none;">[-]</a>
								</td>
		
			<td class="areaTd province_13">
				<input type="text" class="areaName input-common" fieldid="13" value="福建省" onchange="updateRegionAjax(1,2,this);">
			</td>
			<td class="areaTd province_13">
									<span>华南</span>
								</td>
			<td class="areaTd" style="color: #13A5D5;">
				<a href="javascript:;" onclick="addCity(13,this);"><span class="add-child"><i>添加子地区</i></span></a>
			</td>
			<td class="areaTd" align="center">
				<input type="text" class="sort input-common input-common-sort" fieldid="13" fieldname="sort" value="0" onkeyup="this.value=this.value.replace(/\D/g,'')" size="1" onchange="updateRegionAjax(1,1,this);">
			</td>
			<td class="areaTd" style="color: #13A5D5;" align="center">
				<a href="javascript:;" onclick="updateProvince(13,this,3);">修改</a>
				<a href="javascript:;" onclick="delRegion(13,1)">删除</a>
			</td>
		</tr>
					<tr class="areaTr pid_0" id="province_id_14" isclick="false">
			<td class="areaTd">
									<a href="javascript:;" onclick="province_tab_switch(14)" class="tab_jia_14" style="display: block;">[+]</a>
				<a href="javascript:;" onclick="province_tab_switch(14)" class="tab_jian_14" style="display: none;">[-]</a>
								</td>
		
			<td class="areaTd province_14">
				<input type="text" class="areaName input-common" fieldid="14" value="江西省" onchange="updateRegionAjax(1,2,this);">
			</td>
			<td class="areaTd province_14">
									<span>华东</span>
								</td>
			<td class="areaTd" style="color: #13A5D5;">
				<a href="javascript:;" onclick="addCity(14,this);"><span class="add-child"><i>添加子地区</i></span></a>
			</td>
			<td class="areaTd" align="center">
				<input type="text" class="sort input-common input-common-sort" fieldid="14" fieldname="sort" value="0" onkeyup="this.value=this.value.replace(/\D/g,'')" size="1" onchange="updateRegionAjax(1,1,this);">
			</td>
			<td class="areaTd" style="color: #13A5D5;" align="center">
				<a href="javascript:;" onclick="updateProvince(14,this,1);">修改</a>
				<a href="javascript:;" onclick="delRegion(14,1)">删除</a>
			</td>
		</tr>
					<tr class="areaTr pid_0" id="province_id_15" isclick="false">
			<td class="areaTd">
									<a href="javascript:;" onclick="province_tab_switch(15)" class="tab_jia_15" style="display: block;">[+]</a>
				<a href="javascript:;" onclick="province_tab_switch(15)" class="tab_jian_15" style="display: none;">[-]</a>
								</td>
		
			<td class="areaTd province_15">
				<input type="text" class="areaName input-common" fieldid="15" value="山东省" onchange="updateRegionAjax(1,2,this);">
			</td>
			<td class="areaTd province_15">
									<span>华北</span>
								</td>
			<td class="areaTd" style="color: #13A5D5;">
				<a href="javascript:;" onclick="addCity(15,this);"><span class="add-child"><i>添加子地区</i></span></a>
			</td>
			<td class="areaTd" align="center">
				<input type="text" class="sort input-common input-common-sort" fieldid="15" fieldname="sort" value="0" onkeyup="this.value=this.value.replace(/\D/g,'')" size="1" onchange="updateRegionAjax(1,1,this);">
			</td>
			<td class="areaTd" style="color: #13A5D5;" align="center">
				<a href="javascript:;" onclick="updateProvince(15,this,2);">修改</a>
				<a href="javascript:;" onclick="delRegion(15,1)">删除</a>
			</td>
		</tr>
					<tr class="areaTr pid_0" id="province_id_16" isclick="false">
			<td class="areaTd">
									<a href="javascript:;" onclick="province_tab_switch(16)" class="tab_jia_16" style="display: block;">[+]</a>
				<a href="javascript:;" onclick="province_tab_switch(16)" class="tab_jian_16" style="display: none;">[-]</a>
								</td>
		
			<td class="areaTd province_16">
				<input type="text" class="areaName input-common" fieldid="16" value="河南省" onchange="updateRegionAjax(1,2,this);">
			</td>
			<td class="areaTd province_16">
									<span>华中</span>
								</td>
			<td class="areaTd" style="color: #13A5D5;">
				<a href="javascript:;" onclick="addCity(16,this);"><span class="add-child"><i>添加子地区</i></span></a>
			</td>
			<td class="areaTd" align="center">
				<input type="text" class="sort input-common input-common-sort" fieldid="16" fieldname="sort" value="0" onkeyup="this.value=this.value.replace(/\D/g,'')" size="1" onchange="updateRegionAjax(1,1,this);">
			</td>
			<td class="areaTd" style="color: #13A5D5;" align="center">
				<a href="javascript:;" onclick="updateProvince(16,this,4);">修改</a>
				<a href="javascript:;" onclick="delRegion(16,1)">删除</a>
			</td>
		</tr>
					<tr class="areaTr pid_0" id="province_id_1" isclick="false">
			<td class="areaTd">
									<a href="javascript:;" onclick="province_tab_switch(1)" class="tab_jia_1" style="display: block;">[+]</a>
				<a href="javascript:;" onclick="province_tab_switch(1)" class="tab_jian_1" style="display: none;">[-]</a>
								</td>
		
			<td class="areaTd province_1">
				<input type="text" class="areaName input-common" fieldid="1" value="北京市" onchange="updateRegionAjax(1,2,this);">
			</td>
			<td class="areaTd province_1">
									<span>华北</span>
								</td>
			<td class="areaTd" style="color: #13A5D5;">
				<a href="javascript:;" onclick="addCity(1,this);"><span class="add-child"><i>添加子地区</i></span></a>
			</td>
			<td class="areaTd" align="center">
				<input type="text" class="sort input-common input-common-sort" fieldid="1" fieldname="sort" value="1" onkeyup="this.value=this.value.replace(/\D/g,'')" size="1" onchange="updateRegionAjax(1,1,this);">
			</td>
			<td class="areaTd" style="color: #13A5D5;" align="center">
				<a href="javascript:;" onclick="updateProvince(1,this,2);">修改</a>
				<a href="javascript:;" onclick="delRegion(1,1)">删除</a>
			</td>
		</tr>
					<!-- 循环省级地区 -->
	</tbody>
</table>
	</div>
</div>
</div>


<!-- 地区父级id隐藏域 -->
<input type="hidden" id="pid" value="0" class="">
<!-- 弹框类型控制隐藏域 -->
<input type="hidden" id="type" class="">
<input type="hidden" id="event" class="">
<!-- 地区添加与修改模态框 -->
<div class="modal fade hide" id="evaluate" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
<div class="modal-dialog">
	<div class="modal-content">
		<div class="modal-header">
			<button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
			<h3>添加子地区</h3>
		</div>
		<div class="modal-body">
			<table class="table-class">
				<tbody><tr id="superiorRegionTr">
					<td id="myModaltype" align="right">上级地区：</td>
					<td><input type="text" id="superiorRegion" disabled="disabled" superiorregionid="" class="input-common"></td>
				</tr>
				<tr>
					<td align="right"><span style="color:red;margin-right:10px;">*</span>地区名称：</td>
					<td><input type="text" id="regionName" style="margin-bottom: 5px;" class="input-common"></td>
				</tr>
				<tr class="js-area-select">
					<td align="right">所属区域：</td>
					<td>
						<div class="selectric-wrapper selectric-select-common" style="width: 250px;"><div class="selectric-hide-select"><select id="area_select" class="select-common" tabindex="-1">
															<option value="1">华东</option>
															<option value="2">华北</option>
															<option value="3">华南</option>
															<option value="4">华中</option>
															<option value="5">东北</option>
															<option value="6">西北</option>
															<option value="7">西南</option>
															<option value="8">港澳台</option>
														</select></div><div class="selectric"><span class="selectric-label">华东</span><button class="selectric-button">▾</button></div><div class="selectric-items" tabindex="-1"><div class="selectric-scroll"><ul><li data-index="0" class="selected" title="华东">华东</li><li data-index="1" class="" title="华北">华北</li><li data-index="2" class="" title="华南">华南</li><li data-index="3" class="" title="华中">华中</li><li data-index="4" class="" title="东北">东北</li><li data-index="5" class="" title="西北">西北</li><li data-index="6" class="" title="西南">西南</li><li data-index="7" class="last" title="港澳台">港澳台</li></ul></div></div><input class="selectric-input" tabindex="0"></div>
					</td>
				</tr>
				<tr id="zipcode">
					<td align="right">邮政编码：</td>
					<td><input type="text" id="zipcodeVal" maxlength="6" onkeyup="this.value=this.value.replace(/\D/g,'')" class="input-common"></td>
				</tr>
				<tr>
					<td align="right">排序：</td>
					<td><input type="number" id="regionSort" onkeyup="this.value=this.value.replace(/\D/g,'')" class="input-common harf"></td>
				</tr>
			</tbody></table>
		</div>
		<div class="modal-footer">
			<input type="hidden" id="evaluate_id">
			<button type="button" class="btn-common btn-big" onclick="addOrUpdateAjax()">保存</button>
			<button type="button" class="btn-common-cancle btn-big" data-dismiss="modal">关闭</button>
		</div>
	</div>
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
<input type="hidden" id="page_count" class="">
<input type="hidden" id="page_size" class="">
	</div>
	
</section>

</template>
