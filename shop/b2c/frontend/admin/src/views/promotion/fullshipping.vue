<template>
	
	<section class="ns-base-section">
		
		
		
		<div style="position:relative;margin:0;">
			<!-- 面包屑导航 -->
						<div class="breadcrumb-nav">
				<a href="index.html">大鵬系統</a>
									<i class="fa fa-angle-right"></i>
					<a href="/promotion/coupontypelist.html">营销</a>
									<i class="fa fa-angle-right"></i>
					<!-- 需要加跳转链接用这个：http://showfx.niuteam.cn/admin/promotion/fullshipping -->
					<a href="javascript:;" style="color:#999;">满额包邮</a>
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
									<p>相关教程：<a href="http://bbs.niushop.com.cn/forum.php?mod=viewthread&amp;tid=2320&amp;extra=page%3D2" target="_blank">http://bbs.niushop.com.cn/forum.php?mod=viewthread&amp;tid=2320&amp;extra=page%3D2</a></p>
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
<!-- 						<span>相关教程：<a href="http://bbs.niushop.com.cn/forum.php?mod=viewthread&tid=2320&extra=page%3D2" target="_blank">http://bbs.niushop.com.cn/forum.php?mod=viewthread&tid=2320&extra=page%3D2</a></span> -->
<!-- 						 -->
<!-- 					{1/block} -->
				</h4>
			</div>
		</div>
		
		
		<div class="ns-main">
			
<div class="space-10"></div>
<div class="set-style">
	<dl>
		<dt>满额包邮：</dt>
		<dd>
			<p>
				<input type="checkbox" id="manebaoyouResult" class="checkbox" simpleswitch="0" result="false" style="display: none;"><div class="Switch Switch_FlatRadius" id="Switch0"><span class="switch-open">是</span><span class="switch-close">否</span></div>
			</p>
		</dd>
	</dl>
	<dl>
		<dt>包邮所需订单金额：</dt>
		<dd>
			<div>
				<input id="full_mail_money" class="input-mini input-common harf" type="number" min="0.01" step="0.01" value="0.00"><em class="unit">元</em>
				<span id="full_mail" class="help-inline ml15" style="display: none;color:red;">请输入包邮所需订单金额</span>
			</div>
			<p class="hint">请设定数字参数，全场包邮请填写0</p>
		</dd>
	</dl>
	<dl>
		<dt>设置不包邮地区：</dt>
		<dd>
			<div>
				<span class="js-region-info region-info"></span>
				<a class="Js_select_city btn-common" style="line-height: 20px;display: inline-block;" data-flag="0" href="javascript:;">指定地区城市</a>
			</div>
		</dd>
	</dl>
	<dl>
		<dt></dt>
		<dd>
			<button class="btn-common btn-big" onclick="SavepointConfig();">保存</button>
		</dd>
	</dl>
</div>

<div class="modal fade hide" id="select-region" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true" style="top: 17.5px;">
	<div class="modal-dialog">
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
				<h3>批量处理</h3>
			</div>
			<div class="modal-body">
				<div class="cont">
					<div class="selectSub dialog-areas">
						<ul class="js-regions">
														<li>
								<div class="dcity clearfix">
									<!-- 大类 -->
									<div class="ecity gcity">
										<span class="group-label">
											<i class="checkbox-common"><input id="first_region_0" data-first-index="0" value="9,10,11,12,14," type="checkbox"></i>
											<label for="first_region_0" title="华东">华东</label>
										</span>
									</div>
									
									<!-- 省 -->
									<div class="province-list">
									
																				<div class="ecity">
											<span class="gareas">

												<i class="checkbox-common"><input data-second-parent-index="0" data-province-id="9" id="second_region_0_9" type="checkbox" data-province-name="上海市" value="9"></i>
												<label for="second_region_0_9" title="上海市">上海市</label>
												<img class="drop-down" src="/public/admin/images/freight_city_drop_down.gif" data-level="province">
												
												<!-- 市 -->
												<div class="citys" id="citys_9">
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="0" data-province-id="9" data-city-id="73" value="73" id="third_0_73" type="checkbox"></i>
															<label for="third_0_73" title="上海市">上海市</label>
														</span>
																									</div>
											</span>
										</div>
																				<div class="ecity">
											<span class="gareas">

												<i class="checkbox-common"><input data-second-parent-index="0" data-province-id="10" id="second_region_0_10" type="checkbox" data-province-name="江苏省" value="10"></i>
												<label for="second_region_0_10" title="江苏省">江苏省</label>
												<img class="drop-down" src="/public/admin/images/freight_city_drop_down.gif" data-level="province">
												
												<!-- 市 -->
												<div class="citys" id="citys_10">
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="0" data-province-id="10" data-city-id="74" value="74" id="third_0_74" type="checkbox"></i>
															<label for="third_0_74" title="南京市">南京市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="0" data-province-id="10" data-city-id="85" value="85" id="third_0_85" type="checkbox"></i>
															<label for="third_0_85" title="泰州市">泰州市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="0" data-province-id="10" data-city-id="84" value="84" id="third_0_84" type="checkbox"></i>
															<label for="third_0_84" title="镇江市">镇江市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="0" data-province-id="10" data-city-id="83" value="83" id="third_0_83" type="checkbox"></i>
															<label for="third_0_83" title="扬州市">扬州市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="0" data-province-id="10" data-city-id="82" value="82" id="third_0_82" type="checkbox"></i>
															<label for="third_0_82" title="盐城市">盐城市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="0" data-province-id="10" data-city-id="81" value="81" id="third_0_81" type="checkbox"></i>
															<label for="third_0_81" title="淮安市">淮安市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="0" data-province-id="10" data-city-id="80" value="80" id="third_0_80" type="checkbox"></i>
															<label for="third_0_80" title="连云港市">连云港市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="0" data-province-id="10" data-city-id="79" value="79" id="third_0_79" type="checkbox"></i>
															<label for="third_0_79" title="南通市">南通市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="0" data-province-id="10" data-city-id="78" value="78" id="third_0_78" type="checkbox"></i>
															<label for="third_0_78" title="苏州市">苏州市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="0" data-province-id="10" data-city-id="77" value="77" id="third_0_77" type="checkbox"></i>
															<label for="third_0_77" title="常州市">常州市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="0" data-province-id="10" data-city-id="76" value="76" id="third_0_76" type="checkbox"></i>
															<label for="third_0_76" title="徐州市">徐州市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="0" data-province-id="10" data-city-id="75" value="75" id="third_0_75" type="checkbox"></i>
															<label for="third_0_75" title="无锡市">无锡市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="0" data-province-id="10" data-city-id="86" value="86" id="third_0_86" type="checkbox"></i>
															<label for="third_0_86" title="宿迁市">宿迁市</label>
														</span>
																									</div>
											</span>
										</div>
																				<div class="ecity">
											<span class="gareas">

												<i class="checkbox-common"><input data-second-parent-index="0" data-province-id="11" id="second_region_0_11" type="checkbox" data-province-name="浙江省" value="11"></i>
												<label for="second_region_0_11" title="浙江省">浙江省</label>
												<img class="drop-down" src="/public/admin/images/freight_city_drop_down.gif" data-level="province">
												
												<!-- 市 -->
												<div class="citys" id="citys_11">
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="0" data-province-id="11" data-city-id="87" value="87" id="third_0_87" type="checkbox"></i>
															<label for="third_0_87" title="杭州市">杭州市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="0" data-province-id="11" data-city-id="96" value="96" id="third_0_96" type="checkbox"></i>
															<label for="third_0_96" title="台州市">台州市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="0" data-province-id="11" data-city-id="95" value="95" id="third_0_95" type="checkbox"></i>
															<label for="third_0_95" title="舟山市">舟山市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="0" data-province-id="11" data-city-id="94" value="94" id="third_0_94" type="checkbox"></i>
															<label for="third_0_94" title="衢州市">衢州市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="0" data-province-id="11" data-city-id="93" value="93" id="third_0_93" type="checkbox"></i>
															<label for="third_0_93" title="金华市">金华市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="0" data-province-id="11" data-city-id="92" value="92" id="third_0_92" type="checkbox"></i>
															<label for="third_0_92" title="绍兴市">绍兴市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="0" data-province-id="11" data-city-id="91" value="91" id="third_0_91" type="checkbox"></i>
															<label for="third_0_91" title="湖州市">湖州市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="0" data-province-id="11" data-city-id="90" value="90" id="third_0_90" type="checkbox"></i>
															<label for="third_0_90" title="嘉兴市">嘉兴市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="0" data-province-id="11" data-city-id="89" value="89" id="third_0_89" type="checkbox"></i>
															<label for="third_0_89" title="温州市">温州市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="0" data-province-id="11" data-city-id="88" value="88" id="third_0_88" type="checkbox"></i>
															<label for="third_0_88" title="宁波市">宁波市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="0" data-province-id="11" data-city-id="97" value="97" id="third_0_97" type="checkbox"></i>
															<label for="third_0_97" title="丽水市">丽水市</label>
														</span>
																									</div>
											</span>
										</div>
																				<div class="ecity">
											<span class="gareas">

												<i class="checkbox-common"><input data-second-parent-index="0" data-province-id="12" id="second_region_0_12" type="checkbox" data-province-name="安徽省" value="12"></i>
												<label for="second_region_0_12" title="安徽省">安徽省</label>
												<img class="drop-down" src="/public/admin/images/freight_city_drop_down.gif" data-level="province">
												
												<!-- 市 -->
												<div class="citys" id="citys_12">
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="0" data-province-id="12" data-city-id="98" value="98" id="third_0_98" type="checkbox"></i>
															<label for="third_0_98" title="合肥市">合肥市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="0" data-province-id="12" data-city-id="113" value="113" id="third_0_113" type="checkbox"></i>
															<label for="third_0_113" title="池州市">池州市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="0" data-province-id="12" data-city-id="112" value="112" id="third_0_112" type="checkbox"></i>
															<label for="third_0_112" title="亳州市">亳州市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="0" data-province-id="12" data-city-id="111" value="111" id="third_0_111" type="checkbox"></i>
															<label for="third_0_111" title="六安市">六安市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="0" data-province-id="12" data-city-id="110" value="110" id="third_0_110" type="checkbox"></i>
															<label for="third_0_110" title="巢湖市">巢湖市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="0" data-province-id="12" data-city-id="109" value="109" id="third_0_109" type="checkbox"></i>
															<label for="third_0_109" title="宿州市">宿州市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="0" data-province-id="12" data-city-id="108" value="108" id="third_0_108" type="checkbox"></i>
															<label for="third_0_108" title="阜阳市">阜阳市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="0" data-province-id="12" data-city-id="107" value="107" id="third_0_107" type="checkbox"></i>
															<label for="third_0_107" title="滁州市">滁州市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="0" data-province-id="12" data-city-id="106" value="106" id="third_0_106" type="checkbox"></i>
															<label for="third_0_106" title="黄山市">黄山市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="0" data-province-id="12" data-city-id="105" value="105" id="third_0_105" type="checkbox"></i>
															<label for="third_0_105" title="安庆市">安庆市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="0" data-province-id="12" data-city-id="104" value="104" id="third_0_104" type="checkbox"></i>
															<label for="third_0_104" title="铜陵市">铜陵市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="0" data-province-id="12" data-city-id="103" value="103" id="third_0_103" type="checkbox"></i>
															<label for="third_0_103" title="淮北市">淮北市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="0" data-province-id="12" data-city-id="102" value="102" id="third_0_102" type="checkbox"></i>
															<label for="third_0_102" title="马鞍山市">马鞍山市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="0" data-province-id="12" data-city-id="101" value="101" id="third_0_101" type="checkbox"></i>
															<label for="third_0_101" title="淮南市">淮南市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="0" data-province-id="12" data-city-id="100" value="100" id="third_0_100" type="checkbox"></i>
															<label for="third_0_100" title="蚌埠市">蚌埠市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="0" data-province-id="12" data-city-id="99" value="99" id="third_0_99" type="checkbox"></i>
															<label for="third_0_99" title="芜湖市">芜湖市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="0" data-province-id="12" data-city-id="114" value="114" id="third_0_114" type="checkbox"></i>
															<label for="third_0_114" title="宣城市">宣城市</label>
														</span>
																									</div>
											</span>
										</div>
																				<div class="ecity">
											<span class="gareas">

												<i class="checkbox-common"><input data-second-parent-index="0" data-province-id="14" id="second_region_0_14" type="checkbox" data-province-name="江西省" value="14"></i>
												<label for="second_region_0_14" title="江西省">江西省</label>
												<img class="drop-down" src="/public/admin/images/freight_city_drop_down.gif" data-level="province">
												
												<!-- 市 -->
												<div class="citys" id="citys_14">
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="0" data-province-id="14" data-city-id="124" value="124" id="third_0_124" type="checkbox"></i>
															<label for="third_0_124" title="南昌市">南昌市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="0" data-province-id="14" data-city-id="133" value="133" id="third_0_133" type="checkbox"></i>
															<label for="third_0_133" title="抚州市">抚州市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="0" data-province-id="14" data-city-id="132" value="132" id="third_0_132" type="checkbox"></i>
															<label for="third_0_132" title="宜春市">宜春市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="0" data-province-id="14" data-city-id="131" value="131" id="third_0_131" type="checkbox"></i>
															<label for="third_0_131" title="吉安市">吉安市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="0" data-province-id="14" data-city-id="130" value="130" id="third_0_130" type="checkbox"></i>
															<label for="third_0_130" title="赣州市">赣州市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="0" data-province-id="14" data-city-id="129" value="129" id="third_0_129" type="checkbox"></i>
															<label for="third_0_129" title="鹰潭市">鹰潭市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="0" data-province-id="14" data-city-id="128" value="128" id="third_0_128" type="checkbox"></i>
															<label for="third_0_128" title="新余市">新余市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="0" data-province-id="14" data-city-id="127" value="127" id="third_0_127" type="checkbox"></i>
															<label for="third_0_127" title="九江市">九江市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="0" data-province-id="14" data-city-id="126" value="126" id="third_0_126" type="checkbox"></i>
															<label for="third_0_126" title="萍乡市">萍乡市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="0" data-province-id="14" data-city-id="125" value="125" id="third_0_125" type="checkbox"></i>
															<label for="third_0_125" title="景德镇市">景德镇市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="0" data-province-id="14" data-city-id="134" value="134" id="third_0_134" type="checkbox"></i>
															<label for="third_0_134" title="上饶市">上饶市</label>
														</span>
																									</div>
											</span>
										</div>
																				
									</div>
								</div>
							</li>
														<li>
								<div class="dcity clearfix">
									<!-- 大类 -->
									<div class="ecity gcity">
										<span class="group-label">
											<i class="checkbox-common"><input id="first_region_1" data-first-index="1" value="2,3,4,5,15,1," type="checkbox"></i>
											<label for="first_region_1" title="华北">华北</label>
										</span>
									</div>
									
									<!-- 省 -->
									<div class="province-list">
									
																				<div class="ecity">
											<span class="gareas">

												<i class="checkbox-common"><input data-second-parent-index="1" data-province-id="2" id="second_region_1_2" type="checkbox" data-province-name="天津市" value="2"></i>
												<label for="second_region_1_2" title="天津市">天津市</label>
												<img class="drop-down" src="/public/admin/images/freight_city_drop_down.gif" data-level="province">
												
												<!-- 市 -->
												<div class="citys" id="citys_2">
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="1" data-province-id="2" data-city-id="2" value="2" id="third_1_2" type="checkbox"></i>
															<label for="third_1_2" title="天津市">天津市</label>
														</span>
																									</div>
											</span>
										</div>
																				<div class="ecity">
											<span class="gareas">

												<i class="checkbox-common"><input data-second-parent-index="1" data-province-id="3" id="second_region_1_3" type="checkbox" data-province-name="河北省" value="3"></i>
												<label for="second_region_1_3" title="河北省">河北省</label>
												<img class="drop-down" src="/public/admin/images/freight_city_drop_down.gif" data-level="province">
												
												<!-- 市 -->
												<div class="citys" id="citys_3">
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="1" data-province-id="3" data-city-id="3" value="3" id="third_1_3" type="checkbox"></i>
															<label for="third_1_3" title="石家庄市">石家庄市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="1" data-province-id="3" data-city-id="12" value="12" id="third_1_12" type="checkbox"></i>
															<label for="third_1_12" title="廊坊市">廊坊市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="1" data-province-id="3" data-city-id="11" value="11" id="third_1_11" type="checkbox"></i>
															<label for="third_1_11" title="沧州市">沧州市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="1" data-province-id="3" data-city-id="10" value="10" id="third_1_10" type="checkbox"></i>
															<label for="third_1_10" title="承德市">承德市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="1" data-province-id="3" data-city-id="9" value="9" id="third_1_9" type="checkbox"></i>
															<label for="third_1_9" title="张家口市">张家口市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="1" data-province-id="3" data-city-id="8" value="8" id="third_1_8" type="checkbox"></i>
															<label for="third_1_8" title="保定市">保定市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="1" data-province-id="3" data-city-id="7" value="7" id="third_1_7" type="checkbox"></i>
															<label for="third_1_7" title="邢台市">邢台市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="1" data-province-id="3" data-city-id="6" value="6" id="third_1_6" type="checkbox"></i>
															<label for="third_1_6" title="邯郸市">邯郸市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="1" data-province-id="3" data-city-id="5" value="5" id="third_1_5" type="checkbox"></i>
															<label for="third_1_5" title="秦皇岛市">秦皇岛市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="1" data-province-id="3" data-city-id="4" value="4" id="third_1_4" type="checkbox"></i>
															<label for="third_1_4" title="唐山市">唐山市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="1" data-province-id="3" data-city-id="13" value="13" id="third_1_13" type="checkbox"></i>
															<label for="third_1_13" title="衡水市">衡水市</label>
														</span>
																									</div>
											</span>
										</div>
																				<div class="ecity">
											<span class="gareas">

												<i class="checkbox-common"><input data-second-parent-index="1" data-province-id="4" id="second_region_1_4" type="checkbox" data-province-name="山西省" value="4"></i>
												<label for="second_region_1_4" title="山西省">山西省</label>
												<img class="drop-down" src="/public/admin/images/freight_city_drop_down.gif" data-level="province">
												
												<!-- 市 -->
												<div class="citys" id="citys_4">
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="1" data-province-id="4" data-city-id="14" value="14" id="third_1_14" type="checkbox"></i>
															<label for="third_1_14" title="太原市">太原市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="1" data-province-id="4" data-city-id="23" value="23" id="third_1_23" type="checkbox"></i>
															<label for="third_1_23" title="临汾市">临汾市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="1" data-province-id="4" data-city-id="22" value="22" id="third_1_22" type="checkbox"></i>
															<label for="third_1_22" title="忻州市">忻州市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="1" data-province-id="4" data-city-id="21" value="21" id="third_1_21" type="checkbox"></i>
															<label for="third_1_21" title="运城市">运城市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="1" data-province-id="4" data-city-id="20" value="20" id="third_1_20" type="checkbox"></i>
															<label for="third_1_20" title="晋中市">晋中市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="1" data-province-id="4" data-city-id="19" value="19" id="third_1_19" type="checkbox"></i>
															<label for="third_1_19" title="朔州市">朔州市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="1" data-province-id="4" data-city-id="18" value="18" id="third_1_18" type="checkbox"></i>
															<label for="third_1_18" title="晋城市">晋城市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="1" data-province-id="4" data-city-id="17" value="17" id="third_1_17" type="checkbox"></i>
															<label for="third_1_17" title="长治市">长治市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="1" data-province-id="4" data-city-id="16" value="16" id="third_1_16" type="checkbox"></i>
															<label for="third_1_16" title="阳泉市">阳泉市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="1" data-province-id="4" data-city-id="15" value="15" id="third_1_15" type="checkbox"></i>
															<label for="third_1_15" title="大同市">大同市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="1" data-province-id="4" data-city-id="24" value="24" id="third_1_24" type="checkbox"></i>
															<label for="third_1_24" title="吕梁市">吕梁市</label>
														</span>
																									</div>
											</span>
										</div>
																				<div class="ecity">
											<span class="gareas">

												<i class="checkbox-common"><input data-second-parent-index="1" data-province-id="5" id="second_region_1_5" type="checkbox" data-province-name="内蒙古自治区" value="5"></i>
												<label for="second_region_1_5" title="内蒙古自治区">内蒙古自治区</label>
												<img class="drop-down" src="/public/admin/images/freight_city_drop_down.gif" data-level="province">
												
												<!-- 市 -->
												<div class="citys" id="citys_5">
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="1" data-province-id="5" data-city-id="25" value="25" id="third_1_25" type="checkbox"></i>
															<label for="third_1_25" title="呼和浩特市">呼和浩特市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="1" data-province-id="5" data-city-id="35" value="35" id="third_1_35" type="checkbox"></i>
															<label for="third_1_35" title="锡林郭勒盟">锡林郭勒盟</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="1" data-province-id="5" data-city-id="34" value="34" id="third_1_34" type="checkbox"></i>
															<label for="third_1_34" title="兴安盟">兴安盟</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="1" data-province-id="5" data-city-id="33" value="33" id="third_1_33" type="checkbox"></i>
															<label for="third_1_33" title="乌兰察布市">乌兰察布市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="1" data-province-id="5" data-city-id="32" value="32" id="third_1_32" type="checkbox"></i>
															<label for="third_1_32" title="巴彦淖尔市">巴彦淖尔市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="1" data-province-id="5" data-city-id="31" value="31" id="third_1_31" type="checkbox"></i>
															<label for="third_1_31" title="呼伦贝尔市">呼伦贝尔市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="1" data-province-id="5" data-city-id="30" value="30" id="third_1_30" type="checkbox"></i>
															<label for="third_1_30" title="鄂尔多斯市">鄂尔多斯市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="1" data-province-id="5" data-city-id="29" value="29" id="third_1_29" type="checkbox"></i>
															<label for="third_1_29" title="通辽市">通辽市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="1" data-province-id="5" data-city-id="28" value="28" id="third_1_28" type="checkbox"></i>
															<label for="third_1_28" title="赤峰市">赤峰市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="1" data-province-id="5" data-city-id="27" value="27" id="third_1_27" type="checkbox"></i>
															<label for="third_1_27" title="乌海市">乌海市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="1" data-province-id="5" data-city-id="26" value="26" id="third_1_26" type="checkbox"></i>
															<label for="third_1_26" title="包头市">包头市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="1" data-province-id="5" data-city-id="36" value="36" id="third_1_36" type="checkbox"></i>
															<label for="third_1_36" title="阿拉善盟">阿拉善盟</label>
														</span>
																									</div>
											</span>
										</div>
																				<div class="ecity">
											<span class="gareas">

												<i class="checkbox-common"><input data-second-parent-index="1" data-province-id="15" id="second_region_1_15" type="checkbox" data-province-name="山东省" value="15"></i>
												<label for="second_region_1_15" title="山东省">山东省</label>
												<img class="drop-down" src="/public/admin/images/freight_city_drop_down.gif" data-level="province">
												
												<!-- 市 -->
												<div class="citys" id="citys_15">
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="1" data-province-id="15" data-city-id="135" value="135" id="third_1_135" type="checkbox"></i>
															<label for="third_1_135" title="济南市">济南市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="1" data-province-id="15" data-city-id="150" value="150" id="third_1_150" type="checkbox"></i>
															<label for="third_1_150" title="滨州市">滨州市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="1" data-province-id="15" data-city-id="149" value="149" id="third_1_149" type="checkbox"></i>
															<label for="third_1_149" title="聊城市">聊城市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="1" data-province-id="15" data-city-id="148" value="148" id="third_1_148" type="checkbox"></i>
															<label for="third_1_148" title="德州市">德州市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="1" data-province-id="15" data-city-id="147" value="147" id="third_1_147" type="checkbox"></i>
															<label for="third_1_147" title="临沂市">临沂市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="1" data-province-id="15" data-city-id="146" value="146" id="third_1_146" type="checkbox"></i>
															<label for="third_1_146" title="莱芜市">莱芜市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="1" data-province-id="15" data-city-id="145" value="145" id="third_1_145" type="checkbox"></i>
															<label for="third_1_145" title="日照市">日照市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="1" data-province-id="15" data-city-id="144" value="144" id="third_1_144" type="checkbox"></i>
															<label for="third_1_144" title="威海市">威海市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="1" data-province-id="15" data-city-id="143" value="143" id="third_1_143" type="checkbox"></i>
															<label for="third_1_143" title="泰安市">泰安市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="1" data-province-id="15" data-city-id="142" value="142" id="third_1_142" type="checkbox"></i>
															<label for="third_1_142" title="济宁市">济宁市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="1" data-province-id="15" data-city-id="141" value="141" id="third_1_141" type="checkbox"></i>
															<label for="third_1_141" title="潍坊市">潍坊市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="1" data-province-id="15" data-city-id="140" value="140" id="third_1_140" type="checkbox"></i>
															<label for="third_1_140" title="烟台市">烟台市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="1" data-province-id="15" data-city-id="139" value="139" id="third_1_139" type="checkbox"></i>
															<label for="third_1_139" title="东营市">东营市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="1" data-province-id="15" data-city-id="138" value="138" id="third_1_138" type="checkbox"></i>
															<label for="third_1_138" title="枣庄市">枣庄市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="1" data-province-id="15" data-city-id="137" value="137" id="third_1_137" type="checkbox"></i>
															<label for="third_1_137" title="淄博市">淄博市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="1" data-province-id="15" data-city-id="136" value="136" id="third_1_136" type="checkbox"></i>
															<label for="third_1_136" title="青岛市">青岛市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="1" data-province-id="15" data-city-id="151" value="151" id="third_1_151" type="checkbox"></i>
															<label for="third_1_151" title="荷泽市">荷泽市</label>
														</span>
																									</div>
											</span>
										</div>
																				<div class="ecity">
											<span class="gareas">

												<i class="checkbox-common"><input data-second-parent-index="1" data-province-id="1" id="second_region_1_1" type="checkbox" data-province-name="北京市" value="1"></i>
												<label for="second_region_1_1" title="北京市">北京市</label>
												<img class="drop-down" src="/public/admin/images/freight_city_drop_down.gif" data-level="province">
												
												<!-- 市 -->
												<div class="citys" id="citys_1">
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="1" data-province-id="1" data-city-id="1" value="1" id="third_1_1" type="checkbox"></i>
															<label for="third_1_1" title="北京市">北京市</label>
														</span>
																									</div>
											</span>
										</div>
																				
									</div>
								</div>
							</li>
														<li>
								<div class="dcity clearfix">
									<!-- 大类 -->
									<div class="ecity gcity">
										<span class="group-label">
											<i class="checkbox-common"><input id="first_region_2" data-first-index="2" value="13,19,20,21," type="checkbox"></i>
											<label for="first_region_2" title="华南">华南</label>
										</span>
									</div>
									
									<!-- 省 -->
									<div class="province-list">
									
																				<div class="ecity">
											<span class="gareas">

												<i class="checkbox-common"><input data-second-parent-index="2" data-province-id="13" id="second_region_2_13" type="checkbox" data-province-name="福建省" value="13"></i>
												<label for="second_region_2_13" title="福建省">福建省</label>
												<img class="drop-down" src="/public/admin/images/freight_city_drop_down.gif" data-level="province">
												
												<!-- 市 -->
												<div class="citys" id="citys_13">
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="2" data-province-id="13" data-city-id="115" value="115" id="third_2_115" type="checkbox"></i>
															<label for="third_2_115" title="福州市">福州市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="2" data-province-id="13" data-city-id="116" value="116" id="third_2_116" type="checkbox"></i>
															<label for="third_2_116" title="厦门市">厦门市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="2" data-province-id="13" data-city-id="117" value="117" id="third_2_117" type="checkbox"></i>
															<label for="third_2_117" title="莆田市">莆田市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="2" data-province-id="13" data-city-id="118" value="118" id="third_2_118" type="checkbox"></i>
															<label for="third_2_118" title="三明市">三明市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="2" data-province-id="13" data-city-id="119" value="119" id="third_2_119" type="checkbox"></i>
															<label for="third_2_119" title="泉州市">泉州市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="2" data-province-id="13" data-city-id="120" value="120" id="third_2_120" type="checkbox"></i>
															<label for="third_2_120" title="漳州市">漳州市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="2" data-province-id="13" data-city-id="121" value="121" id="third_2_121" type="checkbox"></i>
															<label for="third_2_121" title="南平市">南平市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="2" data-province-id="13" data-city-id="122" value="122" id="third_2_122" type="checkbox"></i>
															<label for="third_2_122" title="龙岩市">龙岩市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="2" data-province-id="13" data-city-id="123" value="123" id="third_2_123" type="checkbox"></i>
															<label for="third_2_123" title="宁德市">宁德市</label>
														</span>
																									</div>
											</span>
										</div>
																				<div class="ecity">
											<span class="gareas">

												<i class="checkbox-common"><input data-second-parent-index="2" data-province-id="19" id="second_region_2_19" type="checkbox" data-province-name="广东省" value="19"></i>
												<label for="second_region_2_19" title="广东省">广东省</label>
												<img class="drop-down" src="/public/admin/images/freight_city_drop_down.gif" data-level="province">
												
												<!-- 市 -->
												<div class="citys" id="citys_19">
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="2" data-province-id="19" data-city-id="197" value="197" id="third_2_197" type="checkbox"></i>
															<label for="third_2_197" title="广州市">广州市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="2" data-province-id="19" data-city-id="208" value="208" id="third_2_208" type="checkbox"></i>
															<label for="third_2_208" title="梅州市">梅州市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="2" data-province-id="19" data-city-id="210" value="210" id="third_2_210" type="checkbox"></i>
															<label for="third_2_210" title="河源市">河源市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="2" data-province-id="19" data-city-id="211" value="211" id="third_2_211" type="checkbox"></i>
															<label for="third_2_211" title="阳江市">阳江市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="2" data-province-id="19" data-city-id="212" value="212" id="third_2_212" type="checkbox"></i>
															<label for="third_2_212" title="清远市">清远市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="2" data-province-id="19" data-city-id="213" value="213" id="third_2_213" type="checkbox"></i>
															<label for="third_2_213" title="东莞市">东莞市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="2" data-province-id="19" data-city-id="214" value="214" id="third_2_214" type="checkbox"></i>
															<label for="third_2_214" title="中山市">中山市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="2" data-province-id="19" data-city-id="215" value="215" id="third_2_215" type="checkbox"></i>
															<label for="third_2_215" title="潮州市">潮州市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="2" data-province-id="19" data-city-id="216" value="216" id="third_2_216" type="checkbox"></i>
															<label for="third_2_216" title="揭阳市">揭阳市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="2" data-province-id="19" data-city-id="207" value="207" id="third_2_207" type="checkbox"></i>
															<label for="third_2_207" title="惠州市">惠州市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="2" data-province-id="19" data-city-id="206" value="206" id="third_2_206" type="checkbox"></i>
															<label for="third_2_206" title="肇庆市">肇庆市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="2" data-province-id="19" data-city-id="198" value="198" id="third_2_198" type="checkbox"></i>
															<label for="third_2_198" title="韶关市">韶关市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="2" data-province-id="19" data-city-id="199" value="199" id="third_2_199" type="checkbox"></i>
															<label for="third_2_199" title="深圳市">深圳市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="2" data-province-id="19" data-city-id="200" value="200" id="third_2_200" type="checkbox"></i>
															<label for="third_2_200" title="珠海市">珠海市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="2" data-province-id="19" data-city-id="201" value="201" id="third_2_201" type="checkbox"></i>
															<label for="third_2_201" title="汕头市">汕头市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="2" data-province-id="19" data-city-id="202" value="202" id="third_2_202" type="checkbox"></i>
															<label for="third_2_202" title="佛山市">佛山市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="2" data-province-id="19" data-city-id="203" value="203" id="third_2_203" type="checkbox"></i>
															<label for="third_2_203" title="江门市">江门市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="2" data-province-id="19" data-city-id="204" value="204" id="third_2_204" type="checkbox"></i>
															<label for="third_2_204" title="湛江市">湛江市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="2" data-province-id="19" data-city-id="205" value="205" id="third_2_205" type="checkbox"></i>
															<label for="third_2_205" title="茂名市">茂名市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="2" data-province-id="19" data-city-id="217" value="217" id="third_2_217" type="checkbox"></i>
															<label for="third_2_217" title="云浮市">云浮市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="2" data-province-id="19" data-city-id="209" value="209" id="third_2_209" type="checkbox"></i>
															<label for="third_2_209" title="汕尾市">汕尾市</label>
														</span>
																									</div>
											</span>
										</div>
																				<div class="ecity">
											<span class="gareas">

												<i class="checkbox-common"><input data-second-parent-index="2" data-province-id="20" id="second_region_2_20" type="checkbox" data-province-name="广西壮族自治区" value="20"></i>
												<label for="second_region_2_20" title="广西壮族自治区">广西壮族自治区</label>
												<img class="drop-down" src="/public/admin/images/freight_city_drop_down.gif" data-level="province">
												
												<!-- 市 -->
												<div class="citys" id="citys_20">
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="2" data-province-id="20" data-city-id="218" value="218" id="third_2_218" type="checkbox"></i>
															<label for="third_2_218" title="南宁市">南宁市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="2" data-province-id="20" data-city-id="230" value="230" id="third_2_230" type="checkbox"></i>
															<label for="third_2_230" title="来宾市">来宾市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="2" data-province-id="20" data-city-id="229" value="229" id="third_2_229" type="checkbox"></i>
															<label for="third_2_229" title="河池市">河池市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="2" data-province-id="20" data-city-id="228" value="228" id="third_2_228" type="checkbox"></i>
															<label for="third_2_228" title="贺州市">贺州市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="2" data-province-id="20" data-city-id="227" value="227" id="third_2_227" type="checkbox"></i>
															<label for="third_2_227" title="百色市">百色市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="2" data-province-id="20" data-city-id="226" value="226" id="third_2_226" type="checkbox"></i>
															<label for="third_2_226" title="玉林市">玉林市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="2" data-province-id="20" data-city-id="225" value="225" id="third_2_225" type="checkbox"></i>
															<label for="third_2_225" title="贵港市">贵港市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="2" data-province-id="20" data-city-id="224" value="224" id="third_2_224" type="checkbox"></i>
															<label for="third_2_224" title="钦州市">钦州市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="2" data-province-id="20" data-city-id="223" value="223" id="third_2_223" type="checkbox"></i>
															<label for="third_2_223" title="防城港市">防城港市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="2" data-province-id="20" data-city-id="222" value="222" id="third_2_222" type="checkbox"></i>
															<label for="third_2_222" title="北海市">北海市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="2" data-province-id="20" data-city-id="221" value="221" id="third_2_221" type="checkbox"></i>
															<label for="third_2_221" title="梧州市">梧州市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="2" data-province-id="20" data-city-id="220" value="220" id="third_2_220" type="checkbox"></i>
															<label for="third_2_220" title="桂林市">桂林市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="2" data-province-id="20" data-city-id="219" value="219" id="third_2_219" type="checkbox"></i>
															<label for="third_2_219" title="柳州市">柳州市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="2" data-province-id="20" data-city-id="231" value="231" id="third_2_231" type="checkbox"></i>
															<label for="third_2_231" title="崇左市">崇左市</label>
														</span>
																									</div>
											</span>
										</div>
																				<div class="ecity">
											<span class="gareas">

												<i class="checkbox-common"><input data-second-parent-index="2" data-province-id="21" id="second_region_2_21" type="checkbox" data-province-name="海南省" value="21"></i>
												<label for="second_region_2_21" title="海南省">海南省</label>
												<img class="drop-down" src="/public/admin/images/freight_city_drop_down.gif" data-level="province">
												
												<!-- 市 -->
												<div class="citys" id="citys_21">
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="2" data-province-id="21" data-city-id="232" value="232" id="third_2_232" type="checkbox"></i>
															<label for="third_2_232" title="海口市">海口市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="2" data-province-id="21" data-city-id="233" value="233" id="third_2_233" type="checkbox"></i>
															<label for="third_2_233" title="三亚市">三亚市</label>
														</span>
																									</div>
											</span>
										</div>
																				
									</div>
								</div>
							</li>
														<li>
								<div class="dcity clearfix">
									<!-- 大类 -->
									<div class="ecity gcity">
										<span class="group-label">
											<i class="checkbox-common"><input id="first_region_3" data-first-index="3" value="16,17,18," type="checkbox"></i>
											<label for="first_region_3" title="华中">华中</label>
										</span>
									</div>
									
									<!-- 省 -->
									<div class="province-list">
									
																				<div class="ecity">
											<span class="gareas">

												<i class="checkbox-common"><input data-second-parent-index="3" data-province-id="16" id="second_region_3_16" type="checkbox" data-province-name="河南省" value="16"></i>
												<label for="second_region_3_16" title="河南省">河南省</label>
												<img class="drop-down" src="/public/admin/images/freight_city_drop_down.gif" data-level="province">
												
												<!-- 市 -->
												<div class="citys" id="citys_16">
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="3" data-province-id="16" data-city-id="152" value="152" id="third_3_152" type="checkbox"></i>
															<label for="third_3_152" title="郑州市">郑州市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="3" data-province-id="16" data-city-id="167" value="167" id="third_3_167" type="checkbox"></i>
															<label for="third_3_167" title="周口市">周口市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="3" data-province-id="16" data-city-id="166" value="166" id="third_3_166" type="checkbox"></i>
															<label for="third_3_166" title="信阳市">信阳市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="3" data-province-id="16" data-city-id="165" value="165" id="third_3_165" type="checkbox"></i>
															<label for="third_3_165" title="商丘市">商丘市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="3" data-province-id="16" data-city-id="164" value="164" id="third_3_164" type="checkbox"></i>
															<label for="third_3_164" title="南阳市">南阳市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="3" data-province-id="16" data-city-id="163" value="163" id="third_3_163" type="checkbox"></i>
															<label for="third_3_163" title="三门峡市">三门峡市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="3" data-province-id="16" data-city-id="162" value="162" id="third_3_162" type="checkbox"></i>
															<label for="third_3_162" title="漯河市">漯河市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="3" data-province-id="16" data-city-id="161" value="161" id="third_3_161" type="checkbox"></i>
															<label for="third_3_161" title="许昌市">许昌市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="3" data-province-id="16" data-city-id="160" value="160" id="third_3_160" type="checkbox"></i>
															<label for="third_3_160" title="濮阳市">濮阳市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="3" data-province-id="16" data-city-id="159" value="159" id="third_3_159" type="checkbox"></i>
															<label for="third_3_159" title="焦作市">焦作市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="3" data-province-id="16" data-city-id="158" value="158" id="third_3_158" type="checkbox"></i>
															<label for="third_3_158" title="新乡市">新乡市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="3" data-province-id="16" data-city-id="157" value="157" id="third_3_157" type="checkbox"></i>
															<label for="third_3_157" title="鹤壁市">鹤壁市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="3" data-province-id="16" data-city-id="156" value="156" id="third_3_156" type="checkbox"></i>
															<label for="third_3_156" title="安阳市">安阳市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="3" data-province-id="16" data-city-id="155" value="155" id="third_3_155" type="checkbox"></i>
															<label for="third_3_155" title="平顶山市">平顶山市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="3" data-province-id="16" data-city-id="154" value="154" id="third_3_154" type="checkbox"></i>
															<label for="third_3_154" title="洛阳市">洛阳市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="3" data-province-id="16" data-city-id="153" value="153" id="third_3_153" type="checkbox"></i>
															<label for="third_3_153" title="开封市">开封市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="3" data-province-id="16" data-city-id="168" value="168" id="third_3_168" type="checkbox"></i>
															<label for="third_3_168" title="驻马店市">驻马店市</label>
														</span>
																									</div>
											</span>
										</div>
																				<div class="ecity">
											<span class="gareas">

												<i class="checkbox-common"><input data-second-parent-index="3" data-province-id="17" id="second_region_3_17" type="checkbox" data-province-name="湖北省" value="17"></i>
												<label for="second_region_3_17" title="湖北省">湖北省</label>
												<img class="drop-down" src="/public/admin/images/freight_city_drop_down.gif" data-level="province">
												
												<!-- 市 -->
												<div class="citys" id="citys_17">
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="3" data-province-id="17" data-city-id="169" value="169" id="third_3_169" type="checkbox"></i>
															<label for="third_3_169" title="武汉市">武汉市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="3" data-province-id="17" data-city-id="181" value="181" id="third_3_181" type="checkbox"></i>
															<label for="third_3_181" title="恩施土家族苗族自治州">恩施土家族苗族自治州</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="3" data-province-id="17" data-city-id="180" value="180" id="third_3_180" type="checkbox"></i>
															<label for="third_3_180" title="随州市">随州市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="3" data-province-id="17" data-city-id="179" value="179" id="third_3_179" type="checkbox"></i>
															<label for="third_3_179" title="咸宁市">咸宁市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="3" data-province-id="17" data-city-id="178" value="178" id="third_3_178" type="checkbox"></i>
															<label for="third_3_178" title="黄冈市">黄冈市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="3" data-province-id="17" data-city-id="177" value="177" id="third_3_177" type="checkbox"></i>
															<label for="third_3_177" title="荆州市">荆州市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="3" data-province-id="17" data-city-id="176" value="176" id="third_3_176" type="checkbox"></i>
															<label for="third_3_176" title="孝感市">孝感市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="3" data-province-id="17" data-city-id="175" value="175" id="third_3_175" type="checkbox"></i>
															<label for="third_3_175" title="荆门市">荆门市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="3" data-province-id="17" data-city-id="174" value="174" id="third_3_174" type="checkbox"></i>
															<label for="third_3_174" title="鄂州市">鄂州市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="3" data-province-id="17" data-city-id="173" value="173" id="third_3_173" type="checkbox"></i>
															<label for="third_3_173" title="襄樊市">襄樊市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="3" data-province-id="17" data-city-id="172" value="172" id="third_3_172" type="checkbox"></i>
															<label for="third_3_172" title="宜昌市">宜昌市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="3" data-province-id="17" data-city-id="171" value="171" id="third_3_171" type="checkbox"></i>
															<label for="third_3_171" title="十堰市">十堰市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="3" data-province-id="17" data-city-id="170" value="170" id="third_3_170" type="checkbox"></i>
															<label for="third_3_170" title="黄石市">黄石市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="3" data-province-id="17" data-city-id="182" value="182" id="third_3_182" type="checkbox"></i>
															<label for="third_3_182" title="神农架">神农架</label>
														</span>
																									</div>
											</span>
										</div>
																				<div class="ecity">
											<span class="gareas">

												<i class="checkbox-common"><input data-second-parent-index="3" data-province-id="18" id="second_region_3_18" type="checkbox" data-province-name="湖南省" value="18"></i>
												<label for="second_region_3_18" title="湖南省">湖南省</label>
												<img class="drop-down" src="/public/admin/images/freight_city_drop_down.gif" data-level="province">
												
												<!-- 市 -->
												<div class="citys" id="citys_18">
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="3" data-province-id="18" data-city-id="183" value="183" id="third_3_183" type="checkbox"></i>
															<label for="third_3_183" title="长沙市">长沙市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="3" data-province-id="18" data-city-id="195" value="195" id="third_3_195" type="checkbox"></i>
															<label for="third_3_195" title="娄底市">娄底市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="3" data-province-id="18" data-city-id="194" value="194" id="third_3_194" type="checkbox"></i>
															<label for="third_3_194" title="怀化市">怀化市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="3" data-province-id="18" data-city-id="193" value="193" id="third_3_193" type="checkbox"></i>
															<label for="third_3_193" title="永州市">永州市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="3" data-province-id="18" data-city-id="192" value="192" id="third_3_192" type="checkbox"></i>
															<label for="third_3_192" title="郴州市">郴州市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="3" data-province-id="18" data-city-id="191" value="191" id="third_3_191" type="checkbox"></i>
															<label for="third_3_191" title="益阳市">益阳市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="3" data-province-id="18" data-city-id="190" value="190" id="third_3_190" type="checkbox"></i>
															<label for="third_3_190" title="张家界市">张家界市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="3" data-province-id="18" data-city-id="189" value="189" id="third_3_189" type="checkbox"></i>
															<label for="third_3_189" title="常德市">常德市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="3" data-province-id="18" data-city-id="188" value="188" id="third_3_188" type="checkbox"></i>
															<label for="third_3_188" title="岳阳市">岳阳市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="3" data-province-id="18" data-city-id="187" value="187" id="third_3_187" type="checkbox"></i>
															<label for="third_3_187" title="邵阳市">邵阳市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="3" data-province-id="18" data-city-id="186" value="186" id="third_3_186" type="checkbox"></i>
															<label for="third_3_186" title="衡阳市">衡阳市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="3" data-province-id="18" data-city-id="185" value="185" id="third_3_185" type="checkbox"></i>
															<label for="third_3_185" title="湘潭市">湘潭市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="3" data-province-id="18" data-city-id="184" value="184" id="third_3_184" type="checkbox"></i>
															<label for="third_3_184" title="株洲市">株洲市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="3" data-province-id="18" data-city-id="196" value="196" id="third_3_196" type="checkbox"></i>
															<label for="third_3_196" title="湘西土家族苗族自治州">湘西土家族苗族自治州</label>
														</span>
																									</div>
											</span>
										</div>
																				
									</div>
								</div>
							</li>
														<li>
								<div class="dcity clearfix">
									<!-- 大类 -->
									<div class="ecity gcity">
										<span class="group-label">
											<i class="checkbox-common"><input id="first_region_4" data-first-index="4" value="6,7,8," type="checkbox"></i>
											<label for="first_region_4" title="东北">东北</label>
										</span>
									</div>
									
									<!-- 省 -->
									<div class="province-list">
									
																				<div class="ecity">
											<span class="gareas">

												<i class="checkbox-common"><input data-second-parent-index="4" data-province-id="6" id="second_region_4_6" type="checkbox" data-province-name="辽宁省" value="6"></i>
												<label for="second_region_4_6" title="辽宁省">辽宁省</label>
												<img class="drop-down" src="/public/admin/images/freight_city_drop_down.gif" data-level="province">
												
												<!-- 市 -->
												<div class="citys" id="citys_6">
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="4" data-province-id="6" data-city-id="37" value="37" id="third_4_37" type="checkbox"></i>
															<label for="third_4_37" title="沈阳市">沈阳市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="4" data-province-id="6" data-city-id="49" value="49" id="third_4_49" type="checkbox"></i>
															<label for="third_4_49" title="朝阳市">朝阳市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="4" data-province-id="6" data-city-id="48" value="48" id="third_4_48" type="checkbox"></i>
															<label for="third_4_48" title="铁岭市">铁岭市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="4" data-province-id="6" data-city-id="47" value="47" id="third_4_47" type="checkbox"></i>
															<label for="third_4_47" title="盘锦市">盘锦市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="4" data-province-id="6" data-city-id="46" value="46" id="third_4_46" type="checkbox"></i>
															<label for="third_4_46" title="辽阳市">辽阳市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="4" data-province-id="6" data-city-id="45" value="45" id="third_4_45" type="checkbox"></i>
															<label for="third_4_45" title="阜新市">阜新市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="4" data-province-id="6" data-city-id="44" value="44" id="third_4_44" type="checkbox"></i>
															<label for="third_4_44" title="营口市">营口市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="4" data-province-id="6" data-city-id="43" value="43" id="third_4_43" type="checkbox"></i>
															<label for="third_4_43" title="锦州市">锦州市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="4" data-province-id="6" data-city-id="42" value="42" id="third_4_42" type="checkbox"></i>
															<label for="third_4_42" title="丹东市">丹东市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="4" data-province-id="6" data-city-id="41" value="41" id="third_4_41" type="checkbox"></i>
															<label for="third_4_41" title="本溪市">本溪市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="4" data-province-id="6" data-city-id="40" value="40" id="third_4_40" type="checkbox"></i>
															<label for="third_4_40" title="抚顺市">抚顺市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="4" data-province-id="6" data-city-id="39" value="39" id="third_4_39" type="checkbox"></i>
															<label for="third_4_39" title="鞍山市">鞍山市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="4" data-province-id="6" data-city-id="38" value="38" id="third_4_38" type="checkbox"></i>
															<label for="third_4_38" title="大连市">大连市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="4" data-province-id="6" data-city-id="50" value="50" id="third_4_50" type="checkbox"></i>
															<label for="third_4_50" title="葫芦岛市">葫芦岛市</label>
														</span>
																									</div>
											</span>
										</div>
																				<div class="ecity">
											<span class="gareas">

												<i class="checkbox-common"><input data-second-parent-index="4" data-province-id="7" id="second_region_4_7" type="checkbox" data-province-name="吉林省" value="7"></i>
												<label for="second_region_4_7" title="吉林省">吉林省</label>
												<img class="drop-down" src="/public/admin/images/freight_city_drop_down.gif" data-level="province">
												
												<!-- 市 -->
												<div class="citys" id="citys_7">
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="4" data-province-id="7" data-city-id="51" value="51" id="third_4_51" type="checkbox"></i>
															<label for="third_4_51" title="长春市">长春市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="4" data-province-id="7" data-city-id="52" value="52" id="third_4_52" type="checkbox"></i>
															<label for="third_4_52" title="吉林市">吉林市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="4" data-province-id="7" data-city-id="53" value="53" id="third_4_53" type="checkbox"></i>
															<label for="third_4_53" title="四平市">四平市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="4" data-province-id="7" data-city-id="54" value="54" id="third_4_54" type="checkbox"></i>
															<label for="third_4_54" title="辽源市">辽源市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="4" data-province-id="7" data-city-id="55" value="55" id="third_4_55" type="checkbox"></i>
															<label for="third_4_55" title="通化市">通化市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="4" data-province-id="7" data-city-id="56" value="56" id="third_4_56" type="checkbox"></i>
															<label for="third_4_56" title="白山市">白山市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="4" data-province-id="7" data-city-id="57" value="57" id="third_4_57" type="checkbox"></i>
															<label for="third_4_57" title="松原市">松原市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="4" data-province-id="7" data-city-id="58" value="58" id="third_4_58" type="checkbox"></i>
															<label for="third_4_58" title="白城市">白城市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="4" data-province-id="7" data-city-id="59" value="59" id="third_4_59" type="checkbox"></i>
															<label for="third_4_59" title="延边朝鲜族自治州">延边朝鲜族自治州</label>
														</span>
																									</div>
											</span>
										</div>
																				<div class="ecity">
											<span class="gareas">

												<i class="checkbox-common"><input data-second-parent-index="4" data-province-id="8" id="second_region_4_8" type="checkbox" data-province-name="黑龙江省" value="8"></i>
												<label for="second_region_4_8" title="黑龙江省">黑龙江省</label>
												<img class="drop-down" src="/public/admin/images/freight_city_drop_down.gif" data-level="province">
												
												<!-- 市 -->
												<div class="citys" id="citys_8">
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="4" data-province-id="8" data-city-id="60" value="60" id="third_4_60" type="checkbox"></i>
															<label for="third_4_60" title="哈尔滨市">哈尔滨市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="4" data-province-id="8" data-city-id="71" value="71" id="third_4_71" type="checkbox"></i>
															<label for="third_4_71" title="绥化市">绥化市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="4" data-province-id="8" data-city-id="70" value="70" id="third_4_70" type="checkbox"></i>
															<label for="third_4_70" title="黑河市">黑河市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="4" data-province-id="8" data-city-id="69" value="69" id="third_4_69" type="checkbox"></i>
															<label for="third_4_69" title="牡丹江市">牡丹江市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="4" data-province-id="8" data-city-id="68" value="68" id="third_4_68" type="checkbox"></i>
															<label for="third_4_68" title="七台河市">七台河市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="4" data-province-id="8" data-city-id="67" value="67" id="third_4_67" type="checkbox"></i>
															<label for="third_4_67" title="佳木斯市">佳木斯市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="4" data-province-id="8" data-city-id="66" value="66" id="third_4_66" type="checkbox"></i>
															<label for="third_4_66" title="伊春市">伊春市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="4" data-province-id="8" data-city-id="65" value="65" id="third_4_65" type="checkbox"></i>
															<label for="third_4_65" title="大庆市">大庆市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="4" data-province-id="8" data-city-id="64" value="64" id="third_4_64" type="checkbox"></i>
															<label for="third_4_64" title="双鸭山市">双鸭山市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="4" data-province-id="8" data-city-id="63" value="63" id="third_4_63" type="checkbox"></i>
															<label for="third_4_63" title="鹤岗市">鹤岗市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="4" data-province-id="8" data-city-id="62" value="62" id="third_4_62" type="checkbox"></i>
															<label for="third_4_62" title="鸡西市">鸡西市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="4" data-province-id="8" data-city-id="61" value="61" id="third_4_61" type="checkbox"></i>
															<label for="third_4_61" title="齐齐哈尔市">齐齐哈尔市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="4" data-province-id="8" data-city-id="72" value="72" id="third_4_72" type="checkbox"></i>
															<label for="third_4_72" title="大兴安岭地区">大兴安岭地区</label>
														</span>
																									</div>
											</span>
										</div>
																				
									</div>
								</div>
							</li>
														<li>
								<div class="dcity clearfix">
									<!-- 大类 -->
									<div class="ecity gcity">
										<span class="group-label">
											<i class="checkbox-common"><input id="first_region_5" data-first-index="5" value="27,28,29,30,31," type="checkbox"></i>
											<label for="first_region_5" title="西北">西北</label>
										</span>
									</div>
									
									<!-- 省 -->
									<div class="province-list">
									
																				<div class="ecity">
											<span class="gareas">

												<i class="checkbox-common"><input data-second-parent-index="5" data-province-id="27" id="second_region_5_27" type="checkbox" data-province-name="陕西省" value="27"></i>
												<label for="second_region_5_27" title="陕西省">陕西省</label>
												<img class="drop-down" src="/public/admin/images/freight_city_drop_down.gif" data-level="province">
												
												<!-- 市 -->
												<div class="citys" id="citys_27">
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="5" data-province-id="27" data-city-id="288" value="288" id="third_5_288" type="checkbox"></i>
															<label for="third_5_288" title="西安市">西安市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="5" data-province-id="27" data-city-id="296" value="296" id="third_5_296" type="checkbox"></i>
															<label for="third_5_296" title="安康市">安康市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="5" data-province-id="27" data-city-id="295" value="295" id="third_5_295" type="checkbox"></i>
															<label for="third_5_295" title="榆林市">榆林市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="5" data-province-id="27" data-city-id="294" value="294" id="third_5_294" type="checkbox"></i>
															<label for="third_5_294" title="汉中市">汉中市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="5" data-province-id="27" data-city-id="293" value="293" id="third_5_293" type="checkbox"></i>
															<label for="third_5_293" title="延安市">延安市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="5" data-province-id="27" data-city-id="292" value="292" id="third_5_292" type="checkbox"></i>
															<label for="third_5_292" title="渭南市">渭南市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="5" data-province-id="27" data-city-id="291" value="291" id="third_5_291" type="checkbox"></i>
															<label for="third_5_291" title="咸阳市">咸阳市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="5" data-province-id="27" data-city-id="290" value="290" id="third_5_290" type="checkbox"></i>
															<label for="third_5_290" title="宝鸡市">宝鸡市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="5" data-province-id="27" data-city-id="289" value="289" id="third_5_289" type="checkbox"></i>
															<label for="third_5_289" title="铜川市">铜川市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="5" data-province-id="27" data-city-id="297" value="297" id="third_5_297" type="checkbox"></i>
															<label for="third_5_297" title="商洛市">商洛市</label>
														</span>
																									</div>
											</span>
										</div>
																				<div class="ecity">
											<span class="gareas">

												<i class="checkbox-common"><input data-second-parent-index="5" data-province-id="28" id="second_region_5_28" type="checkbox" data-province-name="甘肃省" value="28"></i>
												<label for="second_region_5_28" title="甘肃省">甘肃省</label>
												<img class="drop-down" src="/public/admin/images/freight_city_drop_down.gif" data-level="province">
												
												<!-- 市 -->
												<div class="citys" id="citys_28">
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="5" data-province-id="28" data-city-id="298" value="298" id="third_5_298" type="checkbox"></i>
															<label for="third_5_298" title="兰州市">兰州市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="5" data-province-id="28" data-city-id="310" value="310" id="third_5_310" type="checkbox"></i>
															<label for="third_5_310" title="临夏回族自治州">临夏回族自治州</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="5" data-province-id="28" data-city-id="309" value="309" id="third_5_309" type="checkbox"></i>
															<label for="third_5_309" title="陇南市">陇南市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="5" data-province-id="28" data-city-id="308" value="308" id="third_5_308" type="checkbox"></i>
															<label for="third_5_308" title="定西市">定西市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="5" data-province-id="28" data-city-id="307" value="307" id="third_5_307" type="checkbox"></i>
															<label for="third_5_307" title="庆阳市">庆阳市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="5" data-province-id="28" data-city-id="306" value="306" id="third_5_306" type="checkbox"></i>
															<label for="third_5_306" title="酒泉市">酒泉市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="5" data-province-id="28" data-city-id="305" value="305" id="third_5_305" type="checkbox"></i>
															<label for="third_5_305" title="平凉市">平凉市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="5" data-province-id="28" data-city-id="304" value="304" id="third_5_304" type="checkbox"></i>
															<label for="third_5_304" title="张掖市">张掖市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="5" data-province-id="28" data-city-id="303" value="303" id="third_5_303" type="checkbox"></i>
															<label for="third_5_303" title="武威市">武威市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="5" data-province-id="28" data-city-id="302" value="302" id="third_5_302" type="checkbox"></i>
															<label for="third_5_302" title="天水市">天水市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="5" data-province-id="28" data-city-id="301" value="301" id="third_5_301" type="checkbox"></i>
															<label for="third_5_301" title="白银市">白银市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="5" data-province-id="28" data-city-id="300" value="300" id="third_5_300" type="checkbox"></i>
															<label for="third_5_300" title="金昌市">金昌市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="5" data-province-id="28" data-city-id="299" value="299" id="third_5_299" type="checkbox"></i>
															<label for="third_5_299" title="嘉峪关市">嘉峪关市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="5" data-province-id="28" data-city-id="311" value="311" id="third_5_311" type="checkbox"></i>
															<label for="third_5_311" title="甘南藏族自治州">甘南藏族自治州</label>
														</span>
																									</div>
											</span>
										</div>
																				<div class="ecity">
											<span class="gareas">

												<i class="checkbox-common"><input data-second-parent-index="5" data-province-id="29" id="second_region_5_29" type="checkbox" data-province-name="青海省" value="29"></i>
												<label for="second_region_5_29" title="青海省">青海省</label>
												<img class="drop-down" src="/public/admin/images/freight_city_drop_down.gif" data-level="province">
												
												<!-- 市 -->
												<div class="citys" id="citys_29">
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="5" data-province-id="29" data-city-id="312" value="312" id="third_5_312" type="checkbox"></i>
															<label for="third_5_312" title="西宁市">西宁市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="5" data-province-id="29" data-city-id="313" value="313" id="third_5_313" type="checkbox"></i>
															<label for="third_5_313" title="海东地区">海东地区</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="5" data-province-id="29" data-city-id="314" value="314" id="third_5_314" type="checkbox"></i>
															<label for="third_5_314" title="海北藏族自治州">海北藏族自治州</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="5" data-province-id="29" data-city-id="315" value="315" id="third_5_315" type="checkbox"></i>
															<label for="third_5_315" title="黄南藏族自治州">黄南藏族自治州</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="5" data-province-id="29" data-city-id="316" value="316" id="third_5_316" type="checkbox"></i>
															<label for="third_5_316" title="海南藏族自治州">海南藏族自治州</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="5" data-province-id="29" data-city-id="317" value="317" id="third_5_317" type="checkbox"></i>
															<label for="third_5_317" title="果洛藏族自治州">果洛藏族自治州</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="5" data-province-id="29" data-city-id="318" value="318" id="third_5_318" type="checkbox"></i>
															<label for="third_5_318" title="玉树藏族自治州">玉树藏族自治州</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="5" data-province-id="29" data-city-id="319" value="319" id="third_5_319" type="checkbox"></i>
															<label for="third_5_319" title="海西蒙古族藏族自治州">海西蒙古族藏族自治州</label>
														</span>
																									</div>
											</span>
										</div>
																				<div class="ecity">
											<span class="gareas">

												<i class="checkbox-common"><input data-second-parent-index="5" data-province-id="30" id="second_region_5_30" type="checkbox" data-province-name="宁夏回族自治区" value="30"></i>
												<label for="second_region_5_30" title="宁夏回族自治区">宁夏回族自治区</label>
												<img class="drop-down" src="/public/admin/images/freight_city_drop_down.gif" data-level="province">
												
												<!-- 市 -->
												<div class="citys" id="citys_30">
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="5" data-province-id="30" data-city-id="320" value="320" id="third_5_320" type="checkbox"></i>
															<label for="third_5_320" title="银川市">银川市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="5" data-province-id="30" data-city-id="321" value="321" id="third_5_321" type="checkbox"></i>
															<label for="third_5_321" title="石嘴山市">石嘴山市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="5" data-province-id="30" data-city-id="322" value="322" id="third_5_322" type="checkbox"></i>
															<label for="third_5_322" title="吴忠市">吴忠市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="5" data-province-id="30" data-city-id="323" value="323" id="third_5_323" type="checkbox"></i>
															<label for="third_5_323" title="固原市">固原市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="5" data-province-id="30" data-city-id="324" value="324" id="third_5_324" type="checkbox"></i>
															<label for="third_5_324" title="中卫市">中卫市</label>
														</span>
																									</div>
											</span>
										</div>
																				<div class="ecity">
											<span class="gareas">

												<i class="checkbox-common"><input data-second-parent-index="5" data-province-id="31" id="second_region_5_31" type="checkbox" data-province-name="新疆维吾尔自治区" value="31"></i>
												<label for="second_region_5_31" title="新疆维吾尔自治区">新疆维吾尔自治区</label>
												<img class="drop-down" src="/public/admin/images/freight_city_drop_down.gif" data-level="province">
												
												<!-- 市 -->
												<div class="citys" id="citys_31">
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="5" data-province-id="31" data-city-id="325" value="325" id="third_5_325" type="checkbox"></i>
															<label for="third_5_325" title="乌鲁木齐市">乌鲁木齐市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="5" data-province-id="31" data-city-id="341" value="341" id="third_5_341" type="checkbox"></i>
															<label for="third_5_341" title="图木舒克市">图木舒克市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="5" data-province-id="31" data-city-id="340" value="340" id="third_5_340" type="checkbox"></i>
															<label for="third_5_340" title="阿拉尔市">阿拉尔市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="5" data-province-id="31" data-city-id="339" value="339" id="third_5_339" type="checkbox"></i>
															<label for="third_5_339" title="石河子市">石河子市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="5" data-province-id="31" data-city-id="338" value="338" id="third_5_338" type="checkbox"></i>
															<label for="third_5_338" title="阿勒泰地区">阿勒泰地区</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="5" data-province-id="31" data-city-id="337" value="337" id="third_5_337" type="checkbox"></i>
															<label for="third_5_337" title="塔城地区">塔城地区</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="5" data-province-id="31" data-city-id="336" value="336" id="third_5_336" type="checkbox"></i>
															<label for="third_5_336" title="伊犁哈萨克自治州">伊犁哈萨克自治州</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="5" data-province-id="31" data-city-id="335" value="335" id="third_5_335" type="checkbox"></i>
															<label for="third_5_335" title="和田地区">和田地区</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="5" data-province-id="31" data-city-id="334" value="334" id="third_5_334" type="checkbox"></i>
															<label for="third_5_334" title="喀什地区">喀什地区</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="5" data-province-id="31" data-city-id="333" value="333" id="third_5_333" type="checkbox"></i>
															<label for="third_5_333" title="克孜勒苏柯尔克孜自治州">克孜勒苏柯尔克孜自治州</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="5" data-province-id="31" data-city-id="332" value="332" id="third_5_332" type="checkbox"></i>
															<label for="third_5_332" title="阿克苏地区">阿克苏地区</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="5" data-province-id="31" data-city-id="331" value="331" id="third_5_331" type="checkbox"></i>
															<label for="third_5_331" title="巴音郭楞蒙古自治州">巴音郭楞蒙古自治州</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="5" data-province-id="31" data-city-id="330" value="330" id="third_5_330" type="checkbox"></i>
															<label for="third_5_330" title="博尔塔拉蒙古自治州">博尔塔拉蒙古自治州</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="5" data-province-id="31" data-city-id="329" value="329" id="third_5_329" type="checkbox"></i>
															<label for="third_5_329" title="昌吉回族自治州">昌吉回族自治州</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="5" data-province-id="31" data-city-id="328" value="328" id="third_5_328" type="checkbox"></i>
															<label for="third_5_328" title="哈密地区">哈密地区</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="5" data-province-id="31" data-city-id="327" value="327" id="third_5_327" type="checkbox"></i>
															<label for="third_5_327" title="吐鲁番地区">吐鲁番地区</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="5" data-province-id="31" data-city-id="326" value="326" id="third_5_326" type="checkbox"></i>
															<label for="third_5_326" title="克拉玛依市">克拉玛依市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="5" data-province-id="31" data-city-id="342" value="342" id="third_5_342" type="checkbox"></i>
															<label for="third_5_342" title="五家渠市">五家渠市</label>
														</span>
																									</div>
											</span>
										</div>
																				
									</div>
								</div>
							</li>
														<li>
								<div class="dcity clearfix">
									<!-- 大类 -->
									<div class="ecity gcity">
										<span class="group-label">
											<i class="checkbox-common"><input id="first_region_6" data-first-index="6" value="22,23,24,25,26," type="checkbox"></i>
											<label for="first_region_6" title="西南">西南</label>
										</span>
									</div>
									
									<!-- 省 -->
									<div class="province-list">
									
																				<div class="ecity">
											<span class="gareas">

												<i class="checkbox-common"><input data-second-parent-index="6" data-province-id="22" id="second_region_6_22" type="checkbox" data-province-name="重庆市" value="22"></i>
												<label for="second_region_6_22" title="重庆市">重庆市</label>
												<img class="drop-down" src="/public/admin/images/freight_city_drop_down.gif" data-level="province">
												
												<!-- 市 -->
												<div class="citys" id="citys_22">
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="6" data-province-id="22" data-city-id="234" value="234" id="third_6_234" type="checkbox"></i>
															<label for="third_6_234" title="重庆市">重庆市</label>
														</span>
																									</div>
											</span>
										</div>
																				<div class="ecity">
											<span class="gareas">

												<i class="checkbox-common"><input data-second-parent-index="6" data-province-id="23" id="second_region_6_23" type="checkbox" data-province-name="四川省" value="23"></i>
												<label for="second_region_6_23" title="四川省">四川省</label>
												<img class="drop-down" src="/public/admin/images/freight_city_drop_down.gif" data-level="province">
												
												<!-- 市 -->
												<div class="citys" id="citys_23">
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="6" data-province-id="23" data-city-id="235" value="235" id="third_6_235" type="checkbox"></i>
															<label for="third_6_235" title="成都市">成都市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="6" data-province-id="23" data-city-id="247" value="247" id="third_6_247" type="checkbox"></i>
															<label for="third_6_247" title="宜宾市">宜宾市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="6" data-province-id="23" data-city-id="248" value="248" id="third_6_248" type="checkbox"></i>
															<label for="third_6_248" title="广安市">广安市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="6" data-province-id="23" data-city-id="249" value="249" id="third_6_249" type="checkbox"></i>
															<label for="third_6_249" title="达州市">达州市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="6" data-province-id="23" data-city-id="250" value="250" id="third_6_250" type="checkbox"></i>
															<label for="third_6_250" title="雅安市">雅安市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="6" data-province-id="23" data-city-id="251" value="251" id="third_6_251" type="checkbox"></i>
															<label for="third_6_251" title="巴中市">巴中市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="6" data-province-id="23" data-city-id="252" value="252" id="third_6_252" type="checkbox"></i>
															<label for="third_6_252" title="资阳市">资阳市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="6" data-province-id="23" data-city-id="253" value="253" id="third_6_253" type="checkbox"></i>
															<label for="third_6_253" title="阿坝藏族羌族自治州">阿坝藏族羌族自治州</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="6" data-province-id="23" data-city-id="254" value="254" id="third_6_254" type="checkbox"></i>
															<label for="third_6_254" title="甘孜藏族自治州">甘孜藏族自治州</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="6" data-province-id="23" data-city-id="246" value="246" id="third_6_246" type="checkbox"></i>
															<label for="third_6_246" title="眉山市">眉山市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="6" data-province-id="23" data-city-id="245" value="245" id="third_6_245" type="checkbox"></i>
															<label for="third_6_245" title="南充市">南充市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="6" data-province-id="23" data-city-id="244" value="244" id="third_6_244" type="checkbox"></i>
															<label for="third_6_244" title="乐山市">乐山市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="6" data-province-id="23" data-city-id="236" value="236" id="third_6_236" type="checkbox"></i>
															<label for="third_6_236" title="自贡市">自贡市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="6" data-province-id="23" data-city-id="237" value="237" id="third_6_237" type="checkbox"></i>
															<label for="third_6_237" title="攀枝花市">攀枝花市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="6" data-province-id="23" data-city-id="238" value="238" id="third_6_238" type="checkbox"></i>
															<label for="third_6_238" title="泸州市">泸州市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="6" data-province-id="23" data-city-id="239" value="239" id="third_6_239" type="checkbox"></i>
															<label for="third_6_239" title="德阳市">德阳市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="6" data-province-id="23" data-city-id="240" value="240" id="third_6_240" type="checkbox"></i>
															<label for="third_6_240" title="绵阳市">绵阳市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="6" data-province-id="23" data-city-id="241" value="241" id="third_6_241" type="checkbox"></i>
															<label for="third_6_241" title="广元市">广元市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="6" data-province-id="23" data-city-id="242" value="242" id="third_6_242" type="checkbox"></i>
															<label for="third_6_242" title="遂宁市">遂宁市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="6" data-province-id="23" data-city-id="243" value="243" id="third_6_243" type="checkbox"></i>
															<label for="third_6_243" title="内江市">内江市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="6" data-province-id="23" data-city-id="255" value="255" id="third_6_255" type="checkbox"></i>
															<label for="third_6_255" title="凉山彝族自治州">凉山彝族自治州</label>
														</span>
																									</div>
											</span>
										</div>
																				<div class="ecity">
											<span class="gareas">

												<i class="checkbox-common"><input data-second-parent-index="6" data-province-id="24" id="second_region_6_24" type="checkbox" data-province-name="贵州省" value="24"></i>
												<label for="second_region_6_24" title="贵州省">贵州省</label>
												<img class="drop-down" src="/public/admin/images/freight_city_drop_down.gif" data-level="province">
												
												<!-- 市 -->
												<div class="citys" id="citys_24">
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="6" data-province-id="24" data-city-id="256" value="256" id="third_6_256" type="checkbox"></i>
															<label for="third_6_256" title="贵阳市">贵阳市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="6" data-province-id="24" data-city-id="257" value="257" id="third_6_257" type="checkbox"></i>
															<label for="third_6_257" title="六盘水市">六盘水市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="6" data-province-id="24" data-city-id="258" value="258" id="third_6_258" type="checkbox"></i>
															<label for="third_6_258" title="遵义市">遵义市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="6" data-province-id="24" data-city-id="259" value="259" id="third_6_259" type="checkbox"></i>
															<label for="third_6_259" title="安顺市">安顺市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="6" data-province-id="24" data-city-id="260" value="260" id="third_6_260" type="checkbox"></i>
															<label for="third_6_260" title="铜仁地区">铜仁地区</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="6" data-province-id="24" data-city-id="261" value="261" id="third_6_261" type="checkbox"></i>
															<label for="third_6_261" title="黔西南布依族苗族自治州">黔西南布依族苗族自治州</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="6" data-province-id="24" data-city-id="262" value="262" id="third_6_262" type="checkbox"></i>
															<label for="third_6_262" title="毕节地区">毕节地区</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="6" data-province-id="24" data-city-id="263" value="263" id="third_6_263" type="checkbox"></i>
															<label for="third_6_263" title="黔东南苗族侗族自治州">黔东南苗族侗族自治州</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="6" data-province-id="24" data-city-id="264" value="264" id="third_6_264" type="checkbox"></i>
															<label for="third_6_264" title="黔南布依族苗族自治州">黔南布依族苗族自治州</label>
														</span>
																									</div>
											</span>
										</div>
																				<div class="ecity">
											<span class="gareas">

												<i class="checkbox-common"><input data-second-parent-index="6" data-province-id="25" id="second_region_6_25" type="checkbox" data-province-name="云南省" value="25"></i>
												<label for="second_region_6_25" title="云南省">云南省</label>
												<img class="drop-down" src="/public/admin/images/freight_city_drop_down.gif" data-level="province">
												
												<!-- 市 -->
												<div class="citys" id="citys_25">
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="6" data-province-id="25" data-city-id="265" value="265" id="third_6_265" type="checkbox"></i>
															<label for="third_6_265" title="昆明市">昆明市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="6" data-province-id="25" data-city-id="279" value="279" id="third_6_279" type="checkbox"></i>
															<label for="third_6_279" title="怒江傈僳族自治州">怒江傈僳族自治州</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="6" data-province-id="25" data-city-id="278" value="278" id="third_6_278" type="checkbox"></i>
															<label for="third_6_278" title="德宏傣族景颇族自治州">德宏傣族景颇族自治州</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="6" data-province-id="25" data-city-id="277" value="277" id="third_6_277" type="checkbox"></i>
															<label for="third_6_277" title="大理白族自治州">大理白族自治州</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="6" data-province-id="25" data-city-id="276" value="276" id="third_6_276" type="checkbox"></i>
															<label for="third_6_276" title="西双版纳傣族自治州">西双版纳傣族自治州</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="6" data-province-id="25" data-city-id="275" value="275" id="third_6_275" type="checkbox"></i>
															<label for="third_6_275" title="文山壮族苗族自治州">文山壮族苗族自治州</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="6" data-province-id="25" data-city-id="274" value="274" id="third_6_274" type="checkbox"></i>
															<label for="third_6_274" title="红河哈尼族彝族自治州">红河哈尼族彝族自治州</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="6" data-province-id="25" data-city-id="273" value="273" id="third_6_273" type="checkbox"></i>
															<label for="third_6_273" title="楚雄彝族自治州">楚雄彝族自治州</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="6" data-province-id="25" data-city-id="272" value="272" id="third_6_272" type="checkbox"></i>
															<label for="third_6_272" title="临沧市">临沧市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="6" data-province-id="25" data-city-id="271" value="271" id="third_6_271" type="checkbox"></i>
															<label for="third_6_271" title="思茅市">思茅市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="6" data-province-id="25" data-city-id="270" value="270" id="third_6_270" type="checkbox"></i>
															<label for="third_6_270" title="丽江市">丽江市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="6" data-province-id="25" data-city-id="269" value="269" id="third_6_269" type="checkbox"></i>
															<label for="third_6_269" title="昭通市">昭通市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="6" data-province-id="25" data-city-id="268" value="268" id="third_6_268" type="checkbox"></i>
															<label for="third_6_268" title="保山市">保山市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="6" data-province-id="25" data-city-id="267" value="267" id="third_6_267" type="checkbox"></i>
															<label for="third_6_267" title="玉溪市">玉溪市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="6" data-province-id="25" data-city-id="266" value="266" id="third_6_266" type="checkbox"></i>
															<label for="third_6_266" title="曲靖市">曲靖市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="6" data-province-id="25" data-city-id="280" value="280" id="third_6_280" type="checkbox"></i>
															<label for="third_6_280" title="迪庆藏族自治州">迪庆藏族自治州</label>
														</span>
																									</div>
											</span>
										</div>
																				<div class="ecity">
											<span class="gareas">

												<i class="checkbox-common"><input data-second-parent-index="6" data-province-id="26" id="second_region_6_26" type="checkbox" data-province-name="西藏自治区" value="26"></i>
												<label for="second_region_6_26" title="西藏自治区">西藏自治区</label>
												<img class="drop-down" src="/public/admin/images/freight_city_drop_down.gif" data-level="province">
												
												<!-- 市 -->
												<div class="citys" id="citys_26">
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="6" data-province-id="26" data-city-id="281" value="281" id="third_6_281" type="checkbox"></i>
															<label for="third_6_281" title="拉萨市">拉萨市</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="6" data-province-id="26" data-city-id="282" value="282" id="third_6_282" type="checkbox"></i>
															<label for="third_6_282" title="昌都地区">昌都地区</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="6" data-province-id="26" data-city-id="283" value="283" id="third_6_283" type="checkbox"></i>
															<label for="third_6_283" title="山南地区">山南地区</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="6" data-province-id="26" data-city-id="284" value="284" id="third_6_284" type="checkbox"></i>
															<label for="third_6_284" title="日喀则地区">日喀则地区</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="6" data-province-id="26" data-city-id="285" value="285" id="third_6_285" type="checkbox"></i>
															<label for="third_6_285" title="那曲地区">那曲地区</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="6" data-province-id="26" data-city-id="286" value="286" id="third_6_286" type="checkbox"></i>
															<label for="third_6_286" title="阿里地区">阿里地区</label>
														</span>
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="6" data-province-id="26" data-city-id="287" value="287" id="third_6_287" type="checkbox"></i>
															<label for="third_6_287" title="林芝地区">林芝地区</label>
														</span>
																									</div>
											</span>
										</div>
																				
									</div>
								</div>
							</li>
														<li>
								<div class="dcity clearfix">
									<!-- 大类 -->
									<div class="ecity gcity">
										<span class="group-label">
											<i class="checkbox-common"><input id="first_region_7" data-first-index="7" value="32,33,34,35," type="checkbox"></i>
											<label for="first_region_7" title="港澳台">港澳台</label>
										</span>
									</div>
									
									<!-- 省 -->
									<div class="province-list">
									
																				<div class="ecity">
											<span class="gareas">

												<i class="checkbox-common"><input data-second-parent-index="7" data-province-id="32" id="second_region_7_32" type="checkbox" data-province-name="香港特别行政区" value="32"></i>
												<label for="second_region_7_32" title="香港特别行政区">香港特别行政区</label>
												<img class="drop-down" src="/public/admin/images/freight_city_drop_down.gif" data-level="province">
												
												<!-- 市 -->
												<div class="citys" id="citys_32">
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="7" data-province-id="32" data-city-id="343" value="343" id="third_7_343" type="checkbox"></i>
															<label for="third_7_343" title="香港特别行政区">香港特别行政区</label>
														</span>
																									</div>
											</span>
										</div>
																				<div class="ecity">
											<span class="gareas">

												<i class="checkbox-common"><input data-second-parent-index="7" data-province-id="33" id="second_region_7_33" type="checkbox" data-province-name="澳门特别行政区" value="33"></i>
												<label for="second_region_7_33" title="澳门特别行政区">澳门特别行政区</label>
												<img class="drop-down" src="/public/admin/images/freight_city_drop_down.gif" data-level="province">
												
												<!-- 市 -->
												<div class="citys" id="citys_33">
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="7" data-province-id="33" data-city-id="344" value="344" id="third_7_344" type="checkbox"></i>
															<label for="third_7_344" title="澳门特别行政区">澳门特别行政区</label>
														</span>
																									</div>
											</span>
										</div>
																				<div class="ecity">
											<span class="gareas">

												<i class="checkbox-common"><input data-second-parent-index="7" data-province-id="34" id="second_region_7_34" type="checkbox" data-province-name="台湾省" value="34"></i>
												<label for="second_region_7_34" title="台湾省">台湾省</label>
												<img class="drop-down" src="/public/admin/images/freight_city_drop_down.gif" data-level="province">
												
												<!-- 市 -->
												<div class="citys" id="citys_34">
																											<span class="areas">
															<i class="checkbox-common"><input data-third-parent-index="7" data-province-id="34" data-city-id="345" value="345" id="third_7_345" type="checkbox"></i>
															<label for="third_7_345" title="台湾省">台湾省</label>
														</span>
																									</div>
											</span>
										</div>
																				<div class="ecity">
											<span class="gareas">

												<i class="checkbox-common"><input data-second-parent-index="7" data-province-id="35" id="second_region_7_35" type="checkbox" data-province-name="hai" value="35"></i>
												<label for="second_region_7_35" title="hai">hai</label>
												<img class="drop-down" src="/public/admin/images/freight_city_drop_down.gif" data-level="province">
												
												<!-- 市 -->
												<div class="citys" id="citys_35">
																									</div>
											</span>
										</div>
																				
									</div>
								</div>
							</li>
													</ul>
					</div>
				</div>	
			</div>
			<div class="modal-footer">
				<button class="btn-common btn-big js-confirm">保存</button>
				<button class="btn-common-cancle btn-big" data-dismiss="modal">关闭</button>
			</div>
		</div>
	</div>
</div>

<input type="hidden" id="hidden_province_id_array">
<input type="hidden" id="hidden_city_id_array">


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
