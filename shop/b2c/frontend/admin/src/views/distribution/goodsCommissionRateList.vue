<template>
	
	<section class="ns-base-section">
		
		
		
		<div style="position:relative;margin:0;">
			<!-- 面包屑导航 -->
						<div class="breadcrumb-nav">
				<a href="index.html">大鵬系統</a>
									<i class="fa fa-angle-right"></i>
					<a href="/Distribution/promoterList.html">分销</a>
									<i class="fa fa-angle-right"></i>
					<!-- 需要加跳转链接用这个：http://showfx.niuteam.cn/admin/Distribution/goodsCommissionRateList -->
					<a href="javascript:;" style="color:#999;">商品分销</a>
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
									<p>商品分销</p>
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
<!-- 						<span>商品分销</span> -->
<!-- 						 -->
<!-- 					{1/block} -->
				</h4>
			</div>
		</div>
		
		
		<div class="ns-main">
			
<table class="mytable">
	<tbody><tr>
		<th align="left">
			<a class="btn-common" href="javascript:void(0)" onclick="goodsIdDistribution('open')">开启分销</a>
			<a class="btn-common-white" href="javascript:void(0)" onclick="goodsIdDistribution('off')">关闭分销</a>
			<a class="btn-common-white" href="javascript:void(0)" onclick="showUpdateGoodsCommissionRate('',3)">分销设定(总)</a>
			<a class="btn-common-white" href="javascript:void(0)" onclick="goodsGroupIdCount();" data-html="true" id="editGroup" title="<h6 class='edit-group-title'>修改分组</h6>" data-container="body" data-placement="bottom" data-trigger="manual" data-content="<div class='edit-group' id='goodsChecked' style='max-width:auto;'>
 							 
 							  <p>
 							  	<label class='checkbox-inline' style='display:inline-block;' >
							    	<input  onclick=CheckType(this) type='checkbox' name='check_1' value='1'><b>hot</b>&nbsp;&nbsp;&nbsp;
							  	</label>
							  								  </p>
							  
														</div>							
							<button class='edit-group-button group-button-bg' onclick=showUpdateGoodsCommissionRate('',2);>确认</button>
							<button class='edit-group-button' onclick='hideEditGroup()'>取消</button>
							">分销设定(分组)</a>
			<input type="hidden" value="" id="goods_type_ids">
		</th>
		<th style="position: relative;">
			</th><th style="line-height:33px;">
			创建时间：
			<input type="text" id="startDate" class="input-common middle" placeholder="请选择开始日期" onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm:ss'})">
			&nbsp;-&nbsp;
			<input type="text" id="endDate" placeholder="请选择结束日期" class="input-common middle" onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm:ss'})">
			商品名：<input id="goods_name" class="input-medium input-common middle" type="text" value="">
			<button onclick="searchData()" class="btn-common">搜索</button>
			</th>
	</tr>
</tbody></table>
<div id="myTabContent" class="tab-content">
	<div class="tab-pane active">
		<table class="table-class">
			<colgroup>
				<col style="width: 3%;">
				<col style="width: 25%;">
				<col style="width: 12%;">
				<col style="width: 10%;">
				<col style="width: 10%;">
				<col style="width: 10%;">
				<col style="width: 10%;">
				<col style="width: 8%;">
				<col style="width: 12%;">
			</colgroup>
			<tbody>
				<tr class="table-title">
					<th>
						<i class="checkbox-common">
							<input onclick="CheckAll(this)" type="checkbox" id="chek_all">
						</i>
					</th>
					<th style="padding-right: 166px;">商品名称</th>
					<th style="padding-right: 55px;">价格(元)</th>
					<th>三级分销比率</th>
					<th>股东分红比率</th>
					<th>全球分红比率</th>
					<th>区域代理比率</th>
					<th>是否分销</th>
					<th>操作</th>
				</tr>

			</tbody>
			<tbody id="productTbody" style="border: 0px;"><tr class="tr-title"><td class="td-76" style="border-bottom:0;"></td><td colspan="8" style="border-bottom:0;"><div style="display: inline-block; width: 100%;font-size:12px;color:#666;" class="pro-code"><span>商家编码：</span><span class="pro-code" style="margin-left:10px;"><i class="fa fa-long-arrow-up" style="margin-right: 4px;"></i>创建时间：2018-08-21 09:28:12</span></div></td></tr><tr><td align="center"><i class="checkbox-common"><input value="76" name="sub" data-state="1" type="checkbox"></i></td><td colspan="1" style="background: white;"><div><a class="a-pro-view-img" href="/wap/Goods/goodsDetail?id=76" target="_blank"><img class="thumbnail-img" src="/upload/goods/20180814/906faf346903afc2e8e0536bde8e5ebf4.jpg"></a><div class="div-pro-view-name"><a class="a-pro-view-img" href="/wap/Goods/goodsDetail?id=76" target="_blank"><span style="color: #13A5D5;" class="thumbnail-name title=11111"></span></a><a target="_blank" href="/wap/Goods/goodsDetail?id=76">11111</a><div style="position: relative;margin-left: 75px;"></div></div></div></td><td style="background: white;"><div class="priceaddactive"><span class="price-lable">单&nbsp;&nbsp;&nbsp;&nbsp;价</span><spanclass="price-numble" style="color: #666;" id="moreChangePrice76">111.00</spanclass="price-numble"></div><div><span class="price-lable">活动价:</span><span class="price-numble" id="moreChangePrice76" style="color:red;">111.00</span></div></td><td style="text-align:center;"><div class="cell"><span class="pro-stock" style="color: #666;">1.00%</span></div></td><td style="text-align:center;"><div class="cell"><span class="pro-stock" style="color: #666;">2.00%</span></div></td><td style="text-align:center;"><div class="cell"><span class="pro-stock" style="color: #666;">3.00%</span></div></td><td style="text-align:center;"><div class="cell"><span class="pro-stock" style="color: #666;">4.00%</span></div></td><td style="text-align:center;">已启用</td><td style="background: white;"><div class="cell"><div class="bs-docs-example tooltip-demo" style="text-align: center;"><a style="display: inline-block;width:100%; " href="javascript:void(0);" onclick="showUpdateGoodsCommissionRate(76,1)"><span class="edit">分销设定</span></a><a style="display: block;margin-right: 0; " href="javascript:void(0);" onclick="modifyGoodsDistribution(76,'off')"><span class="edit">关闭分销</span></a></div></div></td></tr><tr class="tr-title"><td class="td-75" style="border-bottom:0;"></td><td colspan="8" style="border-bottom:0;"><div style="display: inline-block; width: 100%;font-size:12px;color:#666;" class="pro-code"><span>商家编码：</span><span class="pro-code" style="margin-left:10px;"><i class="fa fa-long-arrow-up" style="margin-right: 4px;"></i>创建时间：2018-08-14 16:14:51</span></div></td></tr><tr><td align="center"><i class="checkbox-common"><input value="75" name="sub" data-state="1" type="checkbox"></i></td><td colspan="1" style="background: white;"><div><a class="a-pro-view-img" href="/wap/Goods/goodsDetail?id=75" target="_blank"><img class="thumbnail-img" src="/upload/goods/20180814/906faf346903afc2e8e0536bde8e5ebf4.jpg"></a><div class="div-pro-view-name"><a class="a-pro-view-img" href="/wap/Goods/goodsDetail?id=75" target="_blank"><span style="color: #13A5D5;" class="thumbnail-name title=xxxxx33"></span></a><a target="_blank" href="/wap/Goods/goodsDetail?id=75">xxxxx33</a><div style="position: relative;margin-left: 75px;"></div></div></div></td><td style="background: white;"><div class="priceaddactive"><span class="price-lable">单&nbsp;&nbsp;&nbsp;&nbsp;价</span><spanclass="price-numble" style="color: #666;" id="moreChangePrice75">0.00</spanclass="price-numble"></div><div><span class="price-lable">活动价:</span><span class="price-numble" id="moreChangePrice75" style="color:red;">0.00</span></div></td><td style="text-align:center;"><div class="cell"><span class="pro-stock" style="color: #666;">1.00%</span></div></td><td style="text-align:center;"><div class="cell"><span class="pro-stock" style="color: #666;">2.00%</span></div></td><td style="text-align:center;"><div class="cell"><span class="pro-stock" style="color: #666;">3.00%</span></div></td><td style="text-align:center;"><div class="cell"><span class="pro-stock" style="color: #666;">4.00%</span></div></td><td style="text-align:center;">已启用</td><td style="background: white;"><div class="cell"><div class="bs-docs-example tooltip-demo" style="text-align: center;"><a style="display: inline-block;width:100%; " href="javascript:void(0);" onclick="showUpdateGoodsCommissionRate(75,1)"><span class="edit">分销设定</span></a><a style="display: block;margin-right: 0; " href="javascript:void(0);" onclick="modifyGoodsDistribution(75,'off')"><span class="edit">关闭分销</span></a></div></div></td></tr><tr class="tr-title"><td class="td-74" style="border-bottom:0;"></td><td colspan="8" style="border-bottom:0;"><div style="display: inline-block; width: 100%;font-size:12px;color:#666;" class="pro-code"><span>商家编码：</span><span class="pro-code" style="margin-left:10px;"><i class="fa fa-long-arrow-up" style="margin-right: 4px;"></i>创建时间：2018-08-10 16:15:56</span></div></td></tr><tr><td align="center"><i class="checkbox-common"><input value="74" name="sub" data-state="0" type="checkbox"></i></td><td colspan="1" style="background: white;"><div><a class="a-pro-view-img" href="/wap/Goods/goodsDetail?id=74" target="_blank"><img class="thumbnail-img" src="/upload/goods/20180719/95cf73c127d0a1ff3543f7fcb0874f274.png"></a><div class="div-pro-view-name"><a class="a-pro-view-img" href="/wap/Goods/goodsDetail?id=74" target="_blank"><span style="color: #13A5D5;" class="thumbnail-name title=8.10测试"></span></a><a target="_blank" href="/wap/Goods/goodsDetail?id=74">8.10测试</a><div style="position: relative;margin-left: 75px;"></div></div></div></td><td style="background: white;"><div class="priceaddactive"><span class="price-lable">单&nbsp;&nbsp;&nbsp;&nbsp;价</span><spanclass="price-numble" style="color: #666;" id="moreChangePrice74">100.00</spanclass="price-numble"></div><div><span class="price-lable">活动价:</span><span class="price-numble" id="moreChangePrice74" style="color:red;">100.00</span></div></td><td style="text-align:center;"><div class="cell"><span class="pro-stock" style="color: #666;">1.00%</span></div></td><td style="text-align:center;"><div class="cell"><span class="pro-stock" style="color: #666;">2.00%</span></div></td><td style="text-align:center;"><div class="cell"><span class="pro-stock" style="color: #666;">5.00%</span></div></td><td style="text-align:center;"><div class="cell"><span class="pro-stock" style="color: #666;">4.00%</span></div></td><td style="text-align:center;">已启用</td><td style="background: white;"><div class="cell"><div class="bs-docs-example tooltip-demo" style="text-align: center;"><a style="display: inline-block;width:100%; " href="javascript:void(0);" onclick="showUpdateGoodsCommissionRate(74,1)"><span class="edit">分销设定</span></a><a style="display: block;margin-right: 0; " href="javascript:void(0);" onclick="modifyGoodsDistribution(74,'off')"><span class="edit">关闭分销</span></a></div></div></td></tr><tr class="tr-title"><td class="td-73" style="border-bottom:0;"></td><td colspan="8" style="border-bottom:0;"><div style="display: inline-block; width: 100%;font-size:12px;color:#666;" class="pro-code"><span>商家编码：</span><span class="pro-code" style="margin-left:10px;"><i class="fa fa-long-arrow-up" style="margin-right: 4px;"></i>创建时间：2018-08-08 11:46:50</span></div></td></tr><tr><td align="center"><i class="checkbox-common"><input value="73" name="sub" data-state="0" type="checkbox"></i></td><td colspan="1" style="background: white;"><div><a class="a-pro-view-img" href="/wap/Goods/goodsDetail?id=73" target="_blank"><img class="thumbnail-img" src="/upload/goods/20180711/3b658c4f23120aa70f6f98a937971f814.jpg"></a><div class="div-pro-view-name"><a class="a-pro-view-img" href="/wap/Goods/goodsDetail?id=73" target="_blank"><span style="color: #13A5D5;" class="thumbnail-name title=测试商品"></span></a><a target="_blank" href="/wap/Goods/goodsDetail?id=73">测试商品</a><div style="position: relative;margin-left: 75px;"><i style="color:#999;font-size:12px;margin-top:5px;padding:1px 2px;border-radius:3px;display:inline-block;color:#FFF;background-color:#de533c;text-decoration: none;height:16px;line-height: 16px;overflow:hidden;margin-right:5px;text-align:center;font-style:normal;">hot</i></div></div></div></td><td style="background: white;"><div class="priceaddactive"><span class="price-lable">单&nbsp;&nbsp;&nbsp;&nbsp;价</span><spanclass="price-numble" style="color: #666;" id="moreChangePrice73">88.00</spanclass="price-numble"></div><div><span class="price-lable">活动价:</span><span class="price-numble" id="moreChangePrice73" style="color:red;">88.00</span></div></td><td style="text-align:center;"><div class="cell"><span class="pro-stock" style="color: #666;">3.00%</span></div></td><td style="text-align:center;"><div class="cell"><span class="pro-stock" style="color: #666;">2.00%</span></div></td><td style="text-align:center;"><div class="cell"><span class="pro-stock" style="color: #666;">5.00%</span></div></td><td style="text-align:center;"><div class="cell"><span class="pro-stock" style="color: #666;">4.00%</span></div></td><td style="text-align:center;">已启用</td><td style="background: white;"><div class="cell"><div class="bs-docs-example tooltip-demo" style="text-align: center;"><a style="display: inline-block;width:100%; " href="javascript:void(0);" onclick="showUpdateGoodsCommissionRate(73,1)"><span class="edit">分销设定</span></a><a style="display: block;margin-right: 0; " href="javascript:void(0);" onclick="modifyGoodsDistribution(73,'off')"><span class="edit">关闭分销</span></a></div></div></td></tr><tr class="tr-title"><td class="td-71" style="border-bottom:0;"></td><td colspan="8" style="border-bottom:0;"><div style="display: inline-block; width: 100%;font-size:12px;color:#666;" class="pro-code"><span>商家编码：</span><span class="pro-code" style="margin-left:10px;"><i class="fa fa-long-arrow-up" style="margin-right: 4px;"></i>创建时间：2018-07-11 16:24:37</span></div></td></tr><tr><td align="center"><i class="checkbox-common"><input value="71" name="sub" data-state="1" type="checkbox"></i></td><td colspan="1" style="background: white;"><div><a class="a-pro-view-img" href="/wap/Goods/goodsDetail?id=71" target="_blank"><img class="thumbnail-img" src="/upload/goods/14993418601114.jpg"></a><div class="div-pro-view-name"><a class="a-pro-view-img" href="/wap/Goods/goodsDetail?id=71" target="_blank"><span style="color: #13A5D5;" class="thumbnail-name title=Lenovo/联想Yoga BOOK WiFi平板二合一超薄笔记本电脑yoga book-副本"></span></a><a target="_blank" href="/wap/Goods/goodsDetail?id=71">Lenovo/联想Yoga BOOK WiFi平板二合一超薄笔记本电脑yoga book-副本</a><div style="position: relative;margin-left: 75px;"><i style="color:#999;font-size:12px;margin-top:5px;padding:1px 2px;border-radius:3px;display:inline-block;color:#FFF;background-color:#de533c;text-decoration: none;height:16px;line-height: 16px;overflow:hidden;margin-right:5px;text-align:center;font-style:normal;">hot</i></div></div></div></td><td style="background: white;"><div class="priceaddactive"><span class="price-lable">单&nbsp;&nbsp;&nbsp;&nbsp;价</span><spanclass="price-numble" style="color: #666;" id="moreChangePrice71">0.00</spanclass="price-numble"></div><div><span class="price-lable">活动价:</span><span class="price-numble" id="moreChangePrice71" style="color:red;">0.00</span></div></td><td style="text-align:center;"><div class="cell"><span class="pro-stock" style="color: #666;">1.00%</span></div></td><td style="text-align:center;"><div class="cell"><span class="pro-stock" style="color: #666;">2.00%</span></div></td><td style="text-align:center;"><div class="cell"><span class="pro-stock" style="color: #666;">3.00%</span></div></td><td style="text-align:center;"><div class="cell"><span class="pro-stock" style="color: #666;">4.00%</span></div></td><td style="text-align:center;">已启用</td><td style="background: white;"><div class="cell"><div class="bs-docs-example tooltip-demo" style="text-align: center;"><a style="display: inline-block;width:100%; " href="javascript:void(0);" onclick="showUpdateGoodsCommissionRate(71,1)"><span class="edit">分销设定</span></a><a style="display: block;margin-right: 0; " href="javascript:void(0);" onclick="modifyGoodsDistribution(71,'off')"><span class="edit">关闭分销</span></a></div></div></td></tr><tr class="tr-title"><td class="td-69" style="border-bottom:0;"></td><td colspan="8" style="border-bottom:0;"><div style="display: inline-block; width: 100%;font-size:12px;color:#666;" class="pro-code"><span>商家编码：</span><span class="pro-code" style="margin-left:10px;"><i class="fa fa-long-arrow-up" style="margin-right: 4px;"></i>创建时间：2018-07-11 14:42:51</span></div></td></tr><tr><td align="center"><i class="checkbox-common"><input value="69" name="sub" data-state="1" type="checkbox"></i></td><td colspan="1" style="background: white;"><div><a class="a-pro-view-img" href="/wap/Goods/goodsDetail?id=69" target="_blank"><img class="thumbnail-img" src="/upload/goods/20180705/12c1f79313f569cab48b5c38b69a1d9f4.jpg"></a><div class="div-pro-view-name"><a class="a-pro-view-img" href="/wap/Goods/goodsDetail?id=69" target="_blank"><span style="color: #13A5D5;" class="thumbnail-name title=澳大利亚丁戈树红标经典红葡萄酒750ml-副本"></span></a><a target="_blank" href="/wap/Goods/goodsDetail?id=69">澳大利亚丁戈树红标经典红葡萄酒750ml-副本</a><div style="position: relative;margin-left: 75px;"></div></div></div></td><td style="background: white;"><div class="priceaddactive"><span class="price-lable">单&nbsp;&nbsp;&nbsp;&nbsp;价</span><spanclass="price-numble" style="color: #666;" id="moreChangePrice69">1000.00</spanclass="price-numble"></div><div><span class="price-lable">活动价:</span><span class="price-numble" id="moreChangePrice69" style="color:red;">1000.00</span></div></td><td style="text-align:center;"><div class="cell"><span class="pro-stock" style="color: #666;">1.00%</span></div></td><td style="text-align:center;"><div class="cell"><span class="pro-stock" style="color: #666;">2.00%</span></div></td><td style="text-align:center;"><div class="cell"><span class="pro-stock" style="color: #666;">3.00%</span></div></td><td style="text-align:center;"><div class="cell"><span class="pro-stock" style="color: #666;">4.00%</span></div></td><td style="text-align:center;">已启用</td><td style="background: white;"><div class="cell"><div class="bs-docs-example tooltip-demo" style="text-align: center;"><a style="display: inline-block;width:100%; " href="javascript:void(0);" onclick="showUpdateGoodsCommissionRate(69,1)"><span class="edit">分销设定</span></a><a style="display: block;margin-right: 0; " href="javascript:void(0);" onclick="modifyGoodsDistribution(69,'off')"><span class="edit">关闭分销</span></a></div></div></td></tr><tr class="tr-title"><td class="td-66" style="border-bottom:0;"></td><td colspan="8" style="border-bottom:0;"><div style="display: inline-block; width: 100%;font-size:12px;color:#666;" class="pro-code"><span>商家编码：</span><span class="pro-code" style="margin-left:10px;"><i class="fa fa-long-arrow-up" style="margin-right: 4px;"></i>创建时间：2018-07-11 09:27:40</span></div></td></tr><tr><td align="center"><i class="checkbox-common"><input value="66" name="sub" data-state="1" type="checkbox"></i></td><td colspan="1" style="background: white;"><div><a class="a-pro-view-img" href="/wap/Goods/goodsDetail?id=66" target="_blank"><img class="thumbnail-img" src="/upload/goods/20180705/12c1f79313f569cab48b5c38b69a1d9f4.jpg"></a><div class="div-pro-view-name"><a class="a-pro-view-img" href="/wap/Goods/goodsDetail?id=66" target="_blank"><span style="color: #13A5D5;" class="thumbnail-name title=澳大利亚丁戈树红标经典红葡萄酒750ml-副本"></span></a><a target="_blank" href="/wap/Goods/goodsDetail?id=66">澳大利亚丁戈树红标经典红葡萄酒750ml-副本</a><div style="position: relative;margin-left: 75px;"></div></div></div></td><td style="background: white;"><div class="priceaddactive"><span class="price-lable">单&nbsp;&nbsp;&nbsp;&nbsp;价</span><spanclass="price-numble" style="color: #666;" id="moreChangePrice66">1000.00</spanclass="price-numble"></div><div><span class="price-lable">活动价:</span><span class="price-numble" id="moreChangePrice66" style="color:red;">1000.00</span></div></td><td style="text-align:center;"><div class="cell"><span class="pro-stock" style="color: #666;">1.00%</span></div></td><td style="text-align:center;"><div class="cell"><span class="pro-stock" style="color: #666;">2.00%</span></div></td><td style="text-align:center;"><div class="cell"><span class="pro-stock" style="color: #666;">3.00%</span></div></td><td style="text-align:center;"><div class="cell"><span class="pro-stock" style="color: #666;">4.00%</span></div></td><td style="text-align:center;">已启用</td><td style="background: white;"><div class="cell"><div class="bs-docs-example tooltip-demo" style="text-align: center;"><a style="display: inline-block;width:100%; " href="javascript:void(0);" onclick="showUpdateGoodsCommissionRate(66,1)"><span class="edit">分销设定</span></a><a style="display: block;margin-right: 0; " href="javascript:void(0);" onclick="modifyGoodsDistribution(66,'off')"><span class="edit">关闭分销</span></a></div></div></td></tr><tr class="tr-title"><td class="td-64" style="border-bottom:0;"></td><td colspan="8" style="border-bottom:0;"><div style="display: inline-block; width: 100%;font-size:12px;color:#666;" class="pro-code"><span>商家编码：</span><span class="pro-code" style="margin-left:10px;"><i class="fa fa-long-arrow-up" style="margin-right: 4px;"></i>创建时间：2018-07-11 09:26:37</span></div></td></tr><tr><td align="center"><i class="checkbox-common"><input value="64" name="sub" data-state="1" type="checkbox"></i></td><td colspan="1" style="background: white;"><div><a class="a-pro-view-img" href="/wap/Goods/goodsDetail?id=64" target="_blank"><img class="thumbnail-img" src="/upload/goods/20180711/3b658c4f23120aa70f6f98a937971f814.jpg"></a><div class="div-pro-view-name"><a class="a-pro-view-img" href="/wap/Goods/goodsDetail?id=64" target="_blank"><span style="color: #13A5D5;" class="thumbnail-name title=yuyyyy-副本"></span></a><a target="_blank" href="/wap/Goods/goodsDetail?id=64">yuyyyy-副本</a><div style="position: relative;margin-left: 75px;"></div></div></div></td><td style="background: white;"><div class="priceaddactive"><span class="price-lable">单&nbsp;&nbsp;&nbsp;&nbsp;价</span><spanclass="price-numble" style="color: #666;" id="moreChangePrice64">1.00</spanclass="price-numble"></div><div><span class="price-lable">活动价:</span><span class="price-numble" id="moreChangePrice64" style="color:red;">1.00</span></div></td><td style="text-align:center;"><div class="cell"><span class="pro-stock" style="color: #666;">1.00%</span></div></td><td style="text-align:center;"><div class="cell"><span class="pro-stock" style="color: #666;">2.00%</span></div></td><td style="text-align:center;"><div class="cell"><span class="pro-stock" style="color: #666;">3.00%</span></div></td><td style="text-align:center;"><div class="cell"><span class="pro-stock" style="color: #666;">4.00%</span></div></td><td style="text-align:center;">已启用</td><td style="background: white;"><div class="cell"><div class="bs-docs-example tooltip-demo" style="text-align: center;"><a style="display: inline-block;width:100%; " href="javascript:void(0);" onclick="showUpdateGoodsCommissionRate(64,1)"><span class="edit">分销设定</span></a><a style="display: block;margin-right: 0; " href="javascript:void(0);" onclick="modifyGoodsDistribution(64,'off')"><span class="edit">关闭分销</span></a></div></div></td></tr><tr class="tr-title"><td class="td-63" style="border-bottom:0;"></td><td colspan="8" style="border-bottom:0;"><div style="display: inline-block; width: 100%;font-size:12px;color:#666;" class="pro-code"><span>商家编码：</span><span class="pro-code" style="margin-left:10px;"><i class="fa fa-long-arrow-up" style="margin-right: 4px;"></i>创建时间：2018-07-11 01:02:21</span></div></td></tr><tr><td align="center"><i class="checkbox-common"><input value="63" name="sub" data-state="1" type="checkbox"></i></td><td colspan="1" style="background: white;"><div><a class="a-pro-view-img" href="/wap/Goods/goodsDetail?id=63" target="_blank"><img class="thumbnail-img" src="/upload/goods/20180711/3b658c4f23120aa70f6f98a937971f814.jpg"></a><div class="div-pro-view-name"><a class="a-pro-view-img" href="/wap/Goods/goodsDetail?id=63" target="_blank"><span style="color: #13A5D5;" class="thumbnail-name title=yuyyyy"></span></a><a target="_blank" href="/wap/Goods/goodsDetail?id=63">yuyyyy</a><div style="position: relative;margin-left: 75px;"><i class="hot">热</i><i class="recommend">精</i><i class="new">新</i></div></div></div></td><td style="background: white;"><div class="priceaddactive"><span class="price-lable">单&nbsp;&nbsp;&nbsp;&nbsp;价</span><spanclass="price-numble" style="color: #666;" id="moreChangePrice63">1.00</spanclass="price-numble"></div><div><span class="price-lable">活动价:</span><span class="price-numble" id="moreChangePrice63" style="color:red;">1.00</span></div></td><td style="text-align:center;"><div class="cell"><span class="pro-stock" style="color: #666;">1.00%</span></div></td><td style="text-align:center;"><div class="cell"><span class="pro-stock" style="color: #666;">2.00%</span></div></td><td style="text-align:center;"><div class="cell"><span class="pro-stock" style="color: #666;">3.00%</span></div></td><td style="text-align:center;"><div class="cell"><span class="pro-stock" style="color: #666;">4.00%</span></div></td><td style="text-align:center;">已启用</td><td style="background: white;"><div class="cell"><div class="bs-docs-example tooltip-demo" style="text-align: center;"><a style="display: inline-block;width:100%; " href="javascript:void(0);" onclick="showUpdateGoodsCommissionRate(63,1)"><span class="edit">分销设定</span></a><a style="display: block;margin-right: 0; " href="javascript:void(0);" onclick="modifyGoodsDistribution(63,'off')"><span class="edit">关闭分销</span></a></div></div></td></tr><tr class="tr-title"><td class="td-62" style="border-bottom:0;"></td><td colspan="8" style="border-bottom:0;"><div style="display: inline-block; width: 100%;font-size:12px;color:#666;" class="pro-code"><span>商家编码：</span><span class="pro-code" style="margin-left:10px;"><i class="fa fa-long-arrow-up" style="margin-right: 4px;"></i>创建时间：2018-07-05 15:44:04</span></div></td></tr><tr><td align="center"><i class="checkbox-common"><input value="62" name="sub" data-state="1" type="checkbox"></i></td><td colspan="1" style="background: white;"><div><a class="a-pro-view-img" href="/wap/Goods/goodsDetail?id=62" target="_blank"><img class="thumbnail-img" src="/upload/goods/20180705/12c1f79313f569cab48b5c38b69a1d9f4.jpg"></a><div class="div-pro-view-name"><a class="a-pro-view-img" href="/wap/Goods/goodsDetail?id=62" target="_blank"><span style="color: #13A5D5;" class="thumbnail-name title=test123澳大利亚丁戈树红标经典红葡萄酒750ml"></span></a><a target="_blank" href="/wap/Goods/goodsDetail?id=62">test123澳大利亚丁戈树红标经典红葡萄酒750ml</a><div style="position: relative;margin-left: 75px;"><i class="hot">热</i><i class="recommend">精</i><i class="new">新</i><i style="color:#999;font-size:12px;margin-top:5px;padding:1px 2px;border-radius:3px;display:inline-block;color:#FFF;background-color:#de533c;text-decoration: none;height:16px;line-height: 16px;overflow:hidden;margin-right:5px;text-align:center;font-style:normal;">hot</i></div></div></div></td><td style="background: white;"><div class="priceaddactive"><span class="price-lable">单&nbsp;&nbsp;&nbsp;&nbsp;价</span><spanclass="price-numble" style="color: #666;" id="moreChangePrice62">0.00</spanclass="price-numble"></div><div><span class="price-lable">活动价:</span><span class="price-numble" id="moreChangePrice62" style="color:red;">0.00</span></div></td><td style="text-align:center;"><div class="cell"><span class="pro-stock" style="color: #666;">3.00%</span></div></td><td style="text-align:center;"><div class="cell"><span class="pro-stock" style="color: #666;">2.00%</span></div></td><td style="text-align:center;"><div class="cell"><span class="pro-stock" style="color: #666;">5.00%</span></div></td><td style="text-align:center;"><div class="cell"><span class="pro-stock" style="color: #666;">4.00%</span></div></td><td style="text-align:center;">已启用</td><td style="background: white;"><div class="cell"><div class="bs-docs-example tooltip-demo" style="text-align: center;"><a style="display: inline-block;width:100%; " href="javascript:void(0);" onclick="showUpdateGoodsCommissionRate(62,1)"><span class="edit">分销设定</span></a><a style="display: block;margin-right: 0; " href="javascript:void(0);" onclick="modifyGoodsDistribution(62,'off')"><span class="edit">关闭分销</span></a></div></div></td></tr><tr class="tr-title"><td class="td-61" style="border-bottom:0;"></td><td colspan="8" style="border-bottom:0;"><div style="display: inline-block; width: 100%;font-size:12px;color:#666;" class="pro-code"><span>商家编码：</span><span class="pro-code" style="margin-left:10px;"><i class="fa fa-long-arrow-up" style="margin-right: 4px;"></i>创建时间：2018-07-05 15:09:56</span></div></td></tr><tr><td align="center"><i class="checkbox-common"><input value="61" name="sub" data-state="1" type="checkbox"></i></td><td colspan="1" style="background: white;"><div><a class="a-pro-view-img" href="/wap/Goods/goodsDetail?id=61" target="_blank"><img class="thumbnail-img" src="/upload/goods/14993425091304.jpg"></a><div class="div-pro-view-name"><a class="a-pro-view-img" href="/wap/Goods/goodsDetail?id=61" target="_blank"><span style="color: #13A5D5;" class="thumbnail-name title=古尚古 懒人手机支架 手机通用指环创意卡扣粘贴式全金属卡通配件-副本"></span></a><a target="_blank" href="/wap/Goods/goodsDetail?id=61">古尚古 懒人手机支架 手机通用指环创意卡扣粘贴式全金属卡通配件-副本</a><div style="position: relative;margin-left: 75px;"></div></div></div></td><td style="background: white;"><div class="priceaddactive"><span class="price-lable">单&nbsp;&nbsp;&nbsp;&nbsp;价</span><spanclass="price-numble" style="color: #666;" id="moreChangePrice61">15.00</spanclass="price-numble"></div><div><span class="price-lable">活动价:</span><span class="price-numble" id="moreChangePrice61" style="color:red;">15.00</span></div></td><td style="text-align:center;"><div class="cell"><span class="pro-stock" style="color: #666;">1.00%</span></div></td><td style="text-align:center;"><div class="cell"><span class="pro-stock" style="color: #666;">2.00%</span></div></td><td style="text-align:center;"><div class="cell"><span class="pro-stock" style="color: #666;">3.00%</span></div></td><td style="text-align:center;"><div class="cell"><span class="pro-stock" style="color: #666;">4.00%</span></div></td><td style="text-align:center;">已启用</td><td style="background: white;"><div class="cell"><div class="bs-docs-example tooltip-demo" style="text-align: center;"><a style="display: inline-block;width:100%; " href="javascript:void(0);" onclick="showUpdateGoodsCommissionRate(61,1)"><span class="edit">分销设定</span></a><a style="display: block;margin-right: 0; " href="javascript:void(0);" onclick="modifyGoodsDistribution(61,'off')"><span class="edit">关闭分销</span></a></div></div></td></tr><tr class="tr-title"><td class="td-60" style="border-bottom:0;"></td><td colspan="8" style="border-bottom:0;"><div style="display: inline-block; width: 100%;font-size:12px;color:#666;" class="pro-code"><span>商家编码：</span><span class="pro-code" style="margin-left:10px;"><i class="fa fa-long-arrow-up" style="margin-right: 4px;"></i>创建时间：2018-07-05 15:08:56</span></div></td></tr><tr><td align="center"><i class="checkbox-common"><input value="60" name="sub" data-state="1" type="checkbox"></i></td><td colspan="1" style="background: white;"><div><a class="a-pro-view-img" href="/wap/Goods/goodsDetail?id=60" target="_blank"><img class="thumbnail-img" src="/upload/goods/14993421471174.jpg"></a><div class="div-pro-view-name"><a class="a-pro-view-img" href="/wap/Goods/goodsDetail?id=60" target="_blank"><span style="color: #13A5D5;" class="thumbnail-name title=14.1英寸轻薄刀锋四核笔记本电脑手提固态商务学生游戏上网本分期-副本"></span></a><a target="_blank" href="/wap/Goods/goodsDetail?id=60">14.1英寸轻薄刀锋四核笔记本电脑手提固态商务学生游戏上网本分期-副本</a><div style="position: relative;margin-left: 75px;"></div></div></div></td><td style="background: white;"><div class="priceaddactive"><span class="price-lable">单&nbsp;&nbsp;&nbsp;&nbsp;价</span><spanclass="price-numble" style="color: #666;" id="moreChangePrice60">5600.00</spanclass="price-numble"></div><div><span class="price-lable">活动价:</span><span class="price-numble" id="moreChangePrice60" style="color:red;">5600.00</span></div></td><td style="text-align:center;"><div class="cell"><span class="pro-stock" style="color: #666;">1.00%</span></div></td><td style="text-align:center;"><div class="cell"><span class="pro-stock" style="color: #666;">2.00%</span></div></td><td style="text-align:center;"><div class="cell"><span class="pro-stock" style="color: #666;">3.00%</span></div></td><td style="text-align:center;"><div class="cell"><span class="pro-stock" style="color: #666;">4.00%</span></div></td><td style="text-align:center;">已启用</td><td style="background: white;"><div class="cell"><div class="bs-docs-example tooltip-demo" style="text-align: center;"><a style="display: inline-block;width:100%; " href="javascript:void(0);" onclick="showUpdateGoodsCommissionRate(60,1)"><span class="edit">分销设定</span></a><a style="display: block;margin-right: 0; " href="javascript:void(0);" onclick="modifyGoodsDistribution(60,'off')"><span class="edit">关闭分销</span></a></div></div></td></tr><tr class="tr-title"><td class="td-59" style="border-bottom:0;"></td><td colspan="8" style="border-bottom:0;"><div style="display: inline-block; width: 100%;font-size:12px;color:#666;" class="pro-code"><span>商家编码：</span><span class="pro-code" style="margin-left:10px;"><i class="fa fa-long-arrow-up" style="margin-right: 4px;"></i>创建时间：2018-07-05 15:08:45</span></div></td></tr><tr><td align="center"><i class="checkbox-common"><input value="59" name="sub" data-state="1" type="checkbox"></i></td><td colspan="1" style="background: white;"><div><a class="a-pro-view-img" href="/wap/Goods/goodsDetail?id=59" target="_blank"><img class="thumbnail-img" src="/upload/goods/14993430961454.jpg"></a><div class="div-pro-view-name"><a class="a-pro-view-img" href="/wap/Goods/goodsDetail?id=59" target="_blank"><span style="color: #13A5D5;" class="thumbnail-name title=钻石金属 闪钻镶卡通指环扣懒人防摔折叠粘贴式手机配件支架批发-副本"></span></a><a target="_blank" href="/wap/Goods/goodsDetail?id=59">钻石金属 闪钻镶卡通指环扣懒人防摔折叠粘贴式手机配件支架批发-副本</a><div style="position: relative;margin-left: 75px;"></div></div></div></td><td style="background: white;"><div class="priceaddactive"><span class="price-lable">单&nbsp;&nbsp;&nbsp;&nbsp;价</span><spanclass="price-numble" style="color: #666;" id="moreChangePrice59">42.00</spanclass="price-numble"></div><div><span class="price-lable">活动价:</span><span class="price-numble" id="moreChangePrice59" style="color:red;">42.00</span></div></td><td style="text-align:center;"><div class="cell"><span class="pro-stock" style="color: #666;">1.00%</span></div></td><td style="text-align:center;"><div class="cell"><span class="pro-stock" style="color: #666;">2.00%</span></div></td><td style="text-align:center;"><div class="cell"><span class="pro-stock" style="color: #666;">3.00%</span></div></td><td style="text-align:center;"><div class="cell"><span class="pro-stock" style="color: #666;">4.00%</span></div></td><td style="text-align:center;">已启用</td><td style="background: white;"><div class="cell"><div class="bs-docs-example tooltip-demo" style="text-align: center;"><a style="display: inline-block;width:100%; " href="javascript:void(0);" onclick="showUpdateGoodsCommissionRate(59,1)"><span class="edit">分销设定</span></a><a style="display: block;margin-right: 0; " href="javascript:void(0);" onclick="modifyGoodsDistribution(59,'off')"><span class="edit">关闭分销</span></a></div></div></td></tr><tr class="tr-title"><td class="td-57" style="border-bottom:0;"></td><td colspan="8" style="border-bottom:0;"><div style="display: inline-block; width: 100%;font-size:12px;color:#666;" class="pro-code"><span>商家编码：</span><span class="pro-code" style="margin-left:10px;"><i class="fa fa-long-arrow-up" style="margin-right: 4px;"></i>创建时间：2018-07-02 18:11:00</span></div></td></tr><tr><td align="center"><i class="checkbox-common"><input value="57" name="sub" data-state="1" type="checkbox"></i></td><td colspan="1" style="background: white;"><div><a class="a-pro-view-img" href="/wap/Goods/goodsDetail?id=57" target="_blank"><img class="thumbnail-img" src="/upload/goods/14993422181194.jpg"></a><div class="div-pro-view-name"><a class="a-pro-view-img" href="/wap/Goods/goodsDetail?id=57" target="_blank"><span style="color: #13A5D5;" class="thumbnail-name title=ertgewr"></span></a><a target="_blank" href="/wap/Goods/goodsDetail?id=57">ertgewr</a><div style="position: relative;margin-left: 75px;"></div></div></div></td><td style="background: white;"><div class="priceaddactive"><span class="price-lable">单&nbsp;&nbsp;&nbsp;&nbsp;价</span><spanclass="price-numble" style="color: #666;" id="moreChangePrice57">100.00</spanclass="price-numble"></div><div><span class="price-lable">活动价:</span><span class="price-numble" id="moreChangePrice57" style="color:red;">100.00</span></div></td><td style="text-align:center;"><div class="cell"><span class="pro-stock" style="color: #666;">33.00%</span></div></td><td style="text-align:center;"><div class="cell"><span class="pro-stock" style="color: #666;">2.00%</span></div></td><td style="text-align:center;"><div class="cell"><span class="pro-stock" style="color: #666;">3.00%</span></div></td><td style="text-align:center;"><div class="cell"><span class="pro-stock" style="color: #666;">4.00%</span></div></td><td style="text-align:center;">已启用</td><td style="background: white;"><div class="cell"><div class="bs-docs-example tooltip-demo" style="text-align: center;"><a style="display: inline-block;width:100%; " href="javascript:void(0);" onclick="showUpdateGoodsCommissionRate(57,1)"><span class="edit">分销设定</span></a><a style="display: block;margin-right: 0; " href="javascript:void(0);" onclick="modifyGoodsDistribution(57,'off')"><span class="edit">关闭分销</span></a></div></div></td></tr></tbody>
		</table>
	</div>
</div>
<!-- 此部分以下是弹出框内容 -->

<!-- 修改用户上级（Modal）开始 -->
<div class="modal fade hide" id="editGoodsCommissionRate" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true" style="width:400px;">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
                <h4 class="modal-title" id="myModalLabel">商品分销设定</h4>
            </div>
            <div class="modal-body">
            	<div class="set-style">
            		<input type="hidden" id="distribution_type" value="">
            		<input type="hidden" id="distribution_condition" value="">
            		<dl>
						<dt>分销佣金比率：</dt>
						<dd>
							<p><input name="" id="distribution_commission_rate" type="text" class="input-common harf" value="" onkeyup="javascript:CheckInputIntFloat(this);"><em class="unit">%</em></p>	
							<p class="error">请输入等级名称</p>
						</dd>
					</dl>
					<dl>
						<dt>股东分红佣金比率：</dt>
						<dd>
							<p><input name="" id="partner_commission_rate" type="text" value="" class="input-common harf" onkeyup="javascript:CheckInputIntFloat(this);"><em class="unit">%</em></p>	
							<p class="error">请输入升级条件</p>
						</dd>
					</dl>
					<dl>
						<dt>股东全球分红比率：</dt>
						<dd>
							<p><input name="" id="global_commission_rate" type="text" value="" class="input-common harf" onkeyup="javascript:CheckInputIntFloat(this);"><em class="unit">%</em></p>	
							<p class="error">请输入本店销售佣金比率</p>
						</dd>
					</dl>
					<dl style="display:none;">
						<dt>分销团队分红佣金比率：</dt>
						<dd>
							<p><input name="" id="distribution_team_commission_rate" type="text" class="input-common harf" value="" onkeyup="javascript:CheckInputIntFloat(this);"><em class="unit">%</em></p>	
							<p class="error">请输入给上级的佣金比率</p>
						</dd>
					</dl>
					<dl style="display:none;">
						<dt>股东团队分红佣金比率：</dt>
						<dd>
							<p><input name="" id="partner_team_commission_rate" type="text" class="input-common harf" value="" onkeyup="javascript:CheckInputIntFloat(this);"><em class="unit">%</em></p>	
							<p class="error">请输入给上上级的佣金比率</p>
						</dd>
					</dl>
					
					<dl>
						<dt>区域代理分红佣金比率：</dt>
						<dd>
							<p><input name="" id="regionagent_commission_rate" type="text" class="input-common harf" value="" onkeyup="javascript:CheckInputIntFloat(this);"><em class="unit">%</em></p>	
							<p class="error">请输入给上上级的佣金比率</p>
						</dd>
					</dl>
					<dl style="display:none;">
						<dt>渠道代理分红佣金比率：</dt>
						<dd>
							<p><input name="" id="channelagent_commission_rate" type="text" class="input-common harf" value="" onkeyup="javascript:CheckInputIntFloat(this);"><em class="unit">%</em></p>	
							<p class="error">请输入给上上级的佣金比率</p>
						</dd>
					</dl>        		            		
            	</div>
            </div>
            <div class="modal-footer">
            	<button type="button" class="btn-common btn-big" onclick="updateGoodsCommissionRate();">修改</button>
                <button type="button" class="btn-common-cancle btn-big" data-dismiss="modal">关闭</button>
            </div>
        </div><!-- /.modal-content -->
    </div><!-- /.modal -->
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
			<li class="total-data" data-total-count="68">共68条</li>
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
