<template>
    
	<section class="ns-base-section">
		
		
		
		<div style="position:relative;margin:0;">
			<!-- 面包屑导航 -->
						<div class="breadcrumb-nav">
				<a href="index.html">大鵬系統</a>
									<i class="fa fa-angle-right"></i>
					<a href="/promotion/coupontypelist.html">营销</a>
									<i class="fa fa-angle-right"></i>
					<!-- 需要加跳转链接用这个：http://showfx.niuteam.cn/admin/tuangou/pintuanlist -->
					<a href="javascript:;" style="color:#999;">拼团</a>
							</div>
						<!-- 三级导航菜单 -->
			
								<nav class="ns-third-menu">
					<ul>
												<li class="selected" onclick="location.href='/tuangou/pintuanlist.html';">拼团列表</li>
													<li onclick="location.href='/tuangou/tuangouList.html';">拼团设置</li>
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
		<th align="left">
			<nav class="order-nav">
				<ul class="nav-ul">
					<button class="btn-common" onclick="pintuanFinish(0, this)">全部</button>
					<button class="btn-common-white" onclick="pintuanFinish(1, this)">未成团</button>
					<button class="btn-common-white" onclick="pintuanFinish(2, this)">成团</button>
					<button class="btn-common-white" onclick="pintuanFinish(-1, this)">失败</button>
				</ul>
			</nav>
		</th>
		<th>
			创建时间：
			<input type="text" id="startDate" class="input-common middle" placeholder="请选择开始日期" onclick="WdatePicker()">
			&nbsp;-&nbsp;
			<input type="text" id="endDate" placeholder="请选择结束日期" class="input-common middle" onclick="WdatePicker()">
			团长名：<input id="group_name" class="input-common middle" type="text" value="">
			<button onclick="searchData()" class="btn-common">搜索</button>
		</th>
	</tr>
</tbody></table>
<div id="myTabContent" class="tab-content">
	<div class="tab-pane active">
		<table class="table-class" border="0">
			<colgroup>
				<col style="width: 2%;">
				<col style="width: 10%;">
				<col style="width: 12%;">
				<col style="width: 10%;">
				<col style="width: 10%;">
				<col style="width: 10%;">
				<col style="width: 10%;">
				<col style="width: 10%;">
				<col style="width: 16%;">
				<col style="width: 10%;">
			</colgroup>
			<tbody>
				<tr class="table-title">
					<th><i class="checkbox-common"><input id="ckall" type="checkbox" onclick="CheckAll(this)"></i></th>
					<th>团长</th>
					<th style="padding-right: 55px;">联系方式</th>
					<th>价格</th>
					<th>成团</th>
					<th>拼团模式</th>
					<th>商品</th>
					<th>状态</th>
					<th>时间</th>
					<th>操作</th>
				</tr>
			</tbody>
			<tbody id="productTbody" style="border: 0;"><tr align="center" style="background:#fff;"><td style="background:none;"><i class="checkbox-common"><input name="sub" type="checkbox" value="6"></i></td><td style="background: white;"><div class="priceaddactive"><span class="price-lable">admin</span><span class="price-numble"></span></div></td><td style="background: white;"><div class="priceaddactive"><span class="price-lable">18632515845</span><span class="price-numble"></span></div></td><td style="background: white;"><div class="priceaddactive"><span class="price-lable">123.00元</span><span class="price-numble"></span></div></td><td style="background: white;"><div class="priceaddactive"><span class="price-lable">失败<br></span><span class="price-numble">已参团人数：0</span><br><span class="price-numble">团购总人数：2</span><br></div></td><td style="background: white;"><div class="priceaddactive"><span class="price-lable">秒杀团</span><spanclass="price-numble"></spanclass="price-numble"></div></td><td style="background: white;"><a href="/wap/Goods/goodsDetail?id=70&gt;&lt;div class=" priceaddactive"=""><span class="price-lable">澳大利亚丁戈树红标经典红葡萄酒750ml-副本</span><span class="price-numble"></span></a></td><td style="background: white;"><div class="priceaddactive"><span class="price-lable">已关闭</span><span class="price-numble"></span></div></td><td style="background: white;"><div class="priceaddactive"><span class="price-lable">开团时间：<br>2018-08-10 23:30:53</span><br><span class="price-numble">截团时间：<br>2018-08-11 11:30:53</span></div></td><td style="background: white;"><a href="javascript:;" )=""><div class="priceaddactive"><span class="price-lable"></span><spanclass="price-numble"></spanclass="price-numble"></div></a><a href="/tuangou/pintuanOrderList?tuangou_group_id=6" )=""><div class="priceaddactive"><span class="price-lable"></span><spanclass="price-numble">查看拼团订单</spanclass="price-numble"></div></a></td></tr><tr align="center" style="background:#fff;"><td style="background:none;"><i class="checkbox-common"><input name="sub" type="checkbox" value="5"></i></td><td style="background: white;"><div class="priceaddactive"><span class="price-lable">admin</span><span class="price-numble"></span></div></td><td style="background: white;"><div class="priceaddactive"><span class="price-lable">18632515845</span><span class="price-numble"></span></div></td><td style="background: white;"><div class="priceaddactive"><span class="price-lable">50.00元</span><span class="price-numble"></span></div></td><td style="background: white;"><div class="priceaddactive"><span class="price-lable">成功<br></span><span class="price-numble">已参团人数：1</span><br><span class="price-numble">团购总人数：3</span><br></div></td><td style="background: white;"><div class="priceaddactive"><span class="price-lable">秒杀团</span><spanclass="price-numble"></spanclass="price-numble"></div></td><td style="background: white;"><a href="/wap/Goods/goodsDetail?id=73&gt;&lt;div class=" priceaddactive"=""><span class="price-lable">测试商品</span><span class="price-numble"></span></a></td><td style="background: white;"><div class="priceaddactive"><span class="price-lable">已完成</span><span class="price-numble"></span></div></td><td style="background: white;"><div class="priceaddactive"><span class="price-lable">开团时间：<br>2018-08-08 11:49:18</span><br><span class="price-numble">截团时间：<br>2018-08-09 17:49:18</span></div></td><td style="background: white;"><a href="javascript:;" )=""><div class="priceaddactive"><span class="price-lable"></span><spanclass="price-numble"></spanclass="price-numble"></div></a><a href="/tuangou/pintuanOrderList?tuangou_group_id=5" )=""><div class="priceaddactive"><span class="price-lable"></span><spanclass="price-numble">查看拼团订单</spanclass="price-numble"></div></a></td></tr><tr align="center" style="background:#fff;"><td style="background:none;"><i class="checkbox-common"><input name="sub" type="checkbox" value="4"></i></td><td style="background: white;"><div class="priceaddactive"><span class="price-lable">cqinter</span><span class="price-numble"></span></div></td><td style="background: white;"><div class="priceaddactive"><span class="price-lable">15802353600</span><span class="price-numble"></span></div></td><td style="background: white;"><div class="priceaddactive"><span class="price-lable">20.00元</span><span class="price-numble"></span></div></td><td style="background: white;"><div class="priceaddactive"><span class="price-lable">成功<br></span><span class="price-numble">已参团人数：1</span><br><span class="price-numble">团购总人数：5</span><br></div></td><td style="background: white;"><div class="priceaddactive"><span class="price-lable">秒杀团</span><spanclass="price-numble"></spanclass="price-numble"></div></td><td style="background: white;"><a href="/wap/Goods/goodsDetail?id=56&gt;&lt;div class=" priceaddactive"=""><span class="price-lable">钻石金属 闪钻镶卡通指环扣懒人防摔折叠粘贴式手机配件支架批发</span><span class="price-numble"></span></a></td><td style="background: white;"><div class="priceaddactive"><span class="price-lable">已完成</span><span class="price-numble"></span></div></td><td style="background: white;"><div class="priceaddactive"><span class="price-lable">开团时间：<br>2018-07-17 11:24:52</span><br><span class="price-numble">截团时间：<br>2018-08-01 11:24:52</span></div></td><td style="background: white;"><a href="javascript:;" )=""><div class="priceaddactive"><span class="price-lable"></span><spanclass="price-numble"></spanclass="price-numble"></div></a><a href="/tuangou/pintuanOrderList?tuangou_group_id=4" )=""><div class="priceaddactive"><span class="price-lable"></span><spanclass="price-numble">查看拼团订单</spanclass="price-numble"></div></a></td></tr><tr align="center" style="background:#fff;"><td style="background:none;"><i class="checkbox-common"><input name="sub" type="checkbox" value="3"></i></td><td style="background: white;"><div class="priceaddactive"><span class="price-lable">cqinter</span><span class="price-numble"></span></div></td><td style="background: white;"><div class="priceaddactive"><span class="price-lable">15802353600</span><span class="price-numble"></span></div></td><td style="background: white;"><div class="priceaddactive"><span class="price-lable">100.00元</span><span class="price-numble"></span></div></td><td style="background: white;"><div class="priceaddactive"><span class="price-lable">成功<br></span><span class="price-numble">已参团人数：1</span><br><span class="price-numble">团购总人数：10</span><br></div></td><td style="background: white;"><div class="priceaddactive"><span class="price-lable">秒杀团</span><spanclass="price-numble"></spanclass="price-numble"></div></td><td style="background: white;"><a href="/wap/Goods/goodsDetail?id=62&gt;&lt;div class=" priceaddactive"=""><span class="price-lable">澳大利亚丁戈树红标经典红葡萄酒750ml</span><span class="price-numble"></span></a></td><td style="background: white;"><div class="priceaddactive"><span class="price-lable">已完成</span><span class="price-numble"></span></div></td><td style="background: white;"><div class="priceaddactive"><span class="price-lable">开团时间：<br>2018-07-17 09:23:11</span><br><span class="price-numble">截团时间：<br>2018-07-17 10:23:11</span></div></td><td style="background: white;"><a href="javascript:;" )=""><div class="priceaddactive"><span class="price-lable"></span><spanclass="price-numble"></spanclass="price-numble"></div></a><a href="/tuangou/pintuanOrderList?tuangou_group_id=3" )=""><div class="priceaddactive"><span class="price-lable"></span><spanclass="price-numble">查看拼团订单</spanclass="price-numble"></div></a></td></tr><tr align="center" style="background:#fff;"><td style="background:none;"><i class="checkbox-common"><input name="sub" type="checkbox" value="2"></i></td><td style="background: white;"><div class="priceaddactive"><span class="price-lable">xcx</span><span class="price-numble"></span></div></td><td style="background: white;"><div class="priceaddactive"><span class="price-lable">18900412345</span><span class="price-numble"></span></div></td><td style="background: white;"><div class="priceaddactive"><span class="price-lable">100.00元</span><span class="price-numble"></span></div></td><td style="background: white;"><div class="priceaddactive"><span class="price-lable">失败<br></span><span class="price-numble">已参团人数：0</span><br><span class="price-numble">团购总人数：10</span><br></div></td><td style="background: white;"><div class="priceaddactive"><span class="price-lable">秒杀团</span><spanclass="price-numble"></spanclass="price-numble"></div></td><td style="background: white;"><a href="/wap/Goods/goodsDetail?id=62&gt;&lt;div class=" priceaddactive"=""><span class="price-lable">澳大利亚丁戈树红标经典红葡萄酒750ml</span><span class="price-numble"></span></a></td><td style="background: white;"><div class="priceaddactive"><span class="price-lable">已关闭</span><span class="price-numble"></span></div></td><td style="background: white;"><div class="priceaddactive"><span class="price-lable">开团时间：<br>2018-07-16 21:44:09</span><br><span class="price-numble">截团时间：<br>2018-07-16 22:44:09</span></div></td><td style="background: white;"><a href="javascript:;" )=""><div class="priceaddactive"><span class="price-lable"></span><spanclass="price-numble"></spanclass="price-numble"></div></a><a href="/tuangou/pintuanOrderList?tuangou_group_id=2" )=""><div class="priceaddactive"><span class="price-lable"></span><spanclass="price-numble">查看拼团订单</spanclass="price-numble"></div></a></td></tr><tr align="center" style="background:#fff;"><td style="background:none;"><i class="checkbox-common"><input name="sub" type="checkbox" value="1"></i></td><td style="background: white;"><div class="priceaddactive"><span class="price-lable">xcx</span><span class="price-numble"></span></div></td><td style="background: white;"><div class="priceaddactive"><span class="price-lable">18900412345</span><span class="price-numble"></span></div></td><td style="background: white;"><div class="priceaddactive"><span class="price-lable">100.00元</span><span class="price-numble"></span></div></td><td style="background: white;"><div class="priceaddactive"><span class="price-lable">失败<br></span><span class="price-numble">已参团人数：0</span><br><span class="price-numble">团购总人数：10</span><br></div></td><td style="background: white;"><div class="priceaddactive"><span class="price-lable">秒杀团</span><spanclass="price-numble"></spanclass="price-numble"></div></td><td style="background: white;"><a href="/wap/Goods/goodsDetail?id=62&gt;&lt;div class=" priceaddactive"=""><span class="price-lable">澳大利亚丁戈树红标经典红葡萄酒750ml</span><span class="price-numble"></span></a></td><td style="background: white;"><div class="priceaddactive"><span class="price-lable">已关闭</span><span class="price-numble"></span></div></td><td style="background: white;"><div class="priceaddactive"><span class="price-lable">开团时间：<br>2018-07-16 19:45:16</span><br><span class="price-numble">截团时间：<br>2018-07-16 20:45:16</span></div></td><td style="background: white;"><a href="javascript:;" )=""><div class="priceaddactive"><span class="price-lable"></span><spanclass="price-numble"></spanclass="price-numble"></div></a><a href="/tuangou/pintuanOrderList?tuangou_group_id=1" )=""><div class="priceaddactive"><span class="price-lable"></span><spanclass="price-numble">查看拼团订单</spanclass="price-numble"></div></a></td></tr></tbody>
		</table>
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
		</div>
		
	</section>
	
</template>
