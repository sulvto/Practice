<template>
		
	<section class="ns-base-section">
		
		
		
		<div style="position:relative;margin:0;">
			<!-- 面包屑导航 -->
						<div class="breadcrumb-nav">
				<a href="index.html">大鵬系統</a>
									<i class="fa fa-angle-right"></i>
					<a href="/account/shopsalesaccount.html">数据</a>
									<i class="fa fa-angle-right"></i>
					<!-- 需要加跳转链接用这个：http://showfx.niuteam.cn/admin/account/shopgoodssaleslist -->
					<a href="javascript:;" style="color:#999;">商品分析</a>
							</div>
						<!-- 三级导航菜单 -->
			
								<nav class="ns-third-menu">
					<ul>
												<li class="selected" onclick="location.href='/account/shopGoodsSalesList.html';">商品分析</li>
													<li onclick="location.href='/account/bestSellerGoods.html';">热卖商品</li>
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
									<p>相关教程：<a href="http://bbs.niushop.com.cn/forum.php?mod=viewthread&amp;tid=2325&amp;extra=page%3D2" target="_blank">http://bbs.niushop.com.cn/forum.php?mod=viewthread&amp;tid=2325&amp;extra=page%3D2</a></p>
									<hr>
																		<h4>功能提示</h4>
									<p class="function-prompts">
1、符合以下任何一种条件的订单即为有效订单：a）采用在线支付方式支付并且已付款；b）采用货到付款方式支付并且交易已完成<br>
2、以下列表为从昨天开始最近30天有效订单中的所有商品数据<br>
3、近30天下单商品数：从昨天开始最近30天有效订单的某商品总销量<br>
4、近30天下单金额：从昨天开始最近30天有效订单的某商品总销售额
</p>
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
<!-- 						<span>相关教程：<a href="http://bbs.niushop.com.cn/forum.php?mod=viewthread&tid=2325&extra=page%3D2" target="_blank">http://bbs.niushop.com.cn/forum.php?mod=viewthread&tid=2325&extra=page%3D2</a></span> -->
<!-- 						 -->
<!-- 					{1/block} -->
				</h4>
			</div>
		</div>
		
		
		<div class="ns-main">
			

<table class="mytable">
	<tbody><tr>
		<th>
			<input type="text" id="goods_name" class="input-common" placeholder="请输入商品名称">
			<button class="btn-common" value="搜索" onclick="LoadingInfo(1);">搜索</button>
		</th>
	</tr>
</tbody></table>
<table class="table-class">
	<colgroup>
		<col style="width: 2%;">
		<col style="width: 24%;">
		<col style="width: 24%;">
		<col style="width: 25%;">
		<col style="width: 25%;">
		<col>
	</colgroup>
	<thead>
		<tr>
			<th align="left"><i class="checkbox-common"><input type="checkbox" onclick="CheckAll(this)"></i></th>
			<th align="left">商品名称</th>
			<th align="right">价格<span class="row-30"></span></th>
			<th align="right">近30天下单商品数<span class="row-30"></span></th>
			<th align="right">近30天下单金额<span class="row-30"></span></th>
		</tr>
	</thead>
	<tbody><tr><td style="text-align: center;"><i class="checkbox-common"><input name="sub" type="checkbox" value="undefined"></i></td><td align="left" class="tal" title="11111">11111</td><td align="right" class="tal">111.00<span class="row-30"></span></td><td align="right">0<span class="row-30"></span></td><td align="right">0<span class="row-30"></span></td></tr><tr><td style="text-align: center;"><i class="checkbox-common"><input name="sub" type="checkbox" value="undefined"></i></td><td align="left" class="tal" title="xxxxx33">xxxxx33</td><td align="right" class="tal">0.00<span class="row-30"></span></td><td align="right">10<span class="row-30"></span></td><td align="right">7.92<span class="row-30"></span></td></tr><tr><td style="text-align: center;"><i class="checkbox-common"><input name="sub" type="checkbox" value="undefined"></i></td><td align="left" class="tal" title="8.10测试">8.10测试</td><td align="right" class="tal">100.00<span class="row-30"></span></td><td align="right">0<span class="row-30"></span></td><td align="right">0<span class="row-30"></span></td></tr><tr><td style="text-align: center;"><i class="checkbox-common"><input name="sub" type="checkbox" value="undefined"></i></td><td align="left" class="tal" title="测试商品">测试商品</td><td align="right" class="tal">88.00<span class="row-30"></span></td><td align="right">5<span class="row-30"></span></td><td align="right">288<span class="row-30"></span></td></tr><tr><td style="text-align: center;"><i class="checkbox-common"><input name="sub" type="checkbox" value="undefined"></i></td><td align="left" class="tal" title="Lenovo/联想Yoga BOOK WiFi平板二合一超薄笔记本电脑yoga book-副本">Lenovo/联想Yoga BOOK WiFi平...</td><td align="right" class="tal">0.00<span class="row-30"></span></td><td align="right">0<span class="row-30"></span></td><td align="right">0<span class="row-30"></span></td></tr><tr><td style="text-align: center;"><i class="checkbox-common"><input name="sub" type="checkbox" value="undefined"></i></td><td align="left" class="tal" title="澳大利亚丁戈树红标经典红葡萄酒750ml-副本">澳大利亚丁戈树红标经典红葡萄酒750ml-副本</td><td align="right" class="tal">1000.00<span class="row-30"></span></td><td align="right">0<span class="row-30"></span></td><td align="right">0<span class="row-30"></span></td></tr><tr><td style="text-align: center;"><i class="checkbox-common"><input name="sub" type="checkbox" value="undefined"></i></td><td align="left" class="tal" title="澳大利亚丁戈树红标经典红葡萄酒750ml-副本">澳大利亚丁戈树红标经典红葡萄酒750ml-副本</td><td align="right" class="tal">1000.00<span class="row-30"></span></td><td align="right">0<span class="row-30"></span></td><td align="right">0<span class="row-30"></span></td></tr><tr><td style="text-align: center;"><i class="checkbox-common"><input name="sub" type="checkbox" value="undefined"></i></td><td align="left" class="tal" title="yuyyyy-副本">yuyyyy-副本</td><td align="right" class="tal">1.00<span class="row-30"></span></td><td align="right">0<span class="row-30"></span></td><td align="right">0<span class="row-30"></span></td></tr><tr><td style="text-align: center;"><i class="checkbox-common"><input name="sub" type="checkbox" value="undefined"></i></td><td align="left" class="tal" title="yuyyyy">yuyyyy</td><td align="right" class="tal">1.00<span class="row-30"></span></td><td align="right">3<span class="row-30"></span></td><td align="right">3<span class="row-30"></span></td></tr><tr><td style="text-align: center;"><i class="checkbox-common"><input name="sub" type="checkbox" value="undefined"></i></td><td align="left" class="tal" title="test123澳大利亚丁戈树红标经典红葡萄酒750ml">test123澳大利亚丁戈树红标经典红葡萄酒75...</td><td align="right" class="tal">0.00<span class="row-30"></span></td><td align="right">0<span class="row-30"></span></td><td align="right">0<span class="row-30"></span></td></tr><tr><td style="text-align: center;"><i class="checkbox-common"><input name="sub" type="checkbox" value="undefined"></i></td><td align="left" class="tal" title="古尚古 懒人手机支架 手机通用指环创意卡扣粘贴式全金属卡通配件-副本">古尚古 懒人手机支架 手机通用指环创意卡扣粘贴式...</td><td align="right" class="tal">15.00<span class="row-30"></span></td><td align="right">0<span class="row-30"></span></td><td align="right">0<span class="row-30"></span></td></tr><tr><td style="text-align: center;"><i class="checkbox-common"><input name="sub" type="checkbox" value="undefined"></i></td><td align="left" class="tal" title="14.1英寸轻薄刀锋四核笔记本电脑手提固态商务学生游戏上网本分期-副本">14.1英寸轻薄刀锋四核笔记本电脑手提固态商务学...</td><td align="right" class="tal">5600.00<span class="row-30"></span></td><td align="right">0<span class="row-30"></span></td><td align="right">0<span class="row-30"></span></td></tr><tr><td style="text-align: center;"><i class="checkbox-common"><input name="sub" type="checkbox" value="undefined"></i></td><td align="left" class="tal" title="钻石金属 闪钻镶卡通指环扣懒人防摔折叠粘贴式手机配件支架批发-副本">钻石金属 闪钻镶卡通指环扣懒人防摔折叠粘贴式手机...</td><td align="right" class="tal">42.00<span class="row-30"></span></td><td align="right">0<span class="row-30"></span></td><td align="right">0<span class="row-30"></span></td></tr><tr><td style="text-align: center;"><i class="checkbox-common"><input name="sub" type="checkbox" value="undefined"></i></td><td align="left" class="tal" title="ertgewr">ertgewr</td><td align="right" class="tal">100.00<span class="row-30"></span></td><td align="right">19<span class="row-30"></span></td><td align="right">2472<span class="row-30"></span></td></tr></tbody>
</table>

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
