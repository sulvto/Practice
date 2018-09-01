<template>
  <section class="ns-base-section">

	<div style="position:relative;margin:0;">
		<!-- 面包屑导航 -->
		<div class="breadcrumb-nav">
			<a href="http://b2c.niuteam.cn/admin.html">单商户B2C</a>
			<i class="fa fa-angle-right"></i>
			<a href="http://b2c.niuteam.cn/admin/goods/goodslist.html">商品</a>
			<i class="fa fa-angle-right"></i>
			<!-- 需要加跳转链接用这个：http://b2c.niuteam.cn/admin/goods/goodslist -->
			<a href="javascript:;" style="color:#999;">商品列表</a>
		</div>
		<!-- 三级导航菜单 -->
	
		<nav class="ns-third-menu">
			<ul>
				<li class="selected" onclick="location.href='http://b2c.niuteam.cn/admin/goods/goodslist.html';">出售中</li>
				<li onclick="location.href='http://b2c.niuteam.cn/admin/goods/goodslist.html?state_type=2';">已下架</li>
				<li onclick="location.href='http://b2c.niuteam.cn/admin/goods/goodslist.html?stock_warning=1';">库存预警</li>
				<li onclick="location.href='http://b2c.niuteam.cn/admin/goods/recyclelist.html';">回收站</li>
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
								<p>相关教程：<a href="http://bbs.niushop.com.cn/forum.php?mod=viewthread&amp;tid=2301&amp;extra=page%3D3" target="_blank">http://bbs.niushop.com.cn/forum.php?mod=viewthread&amp;tid=2301&amp;extra=page%3D3</a></p>
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
				<!-- 						<span>相关教程：<a href="http://bbs.niushop.com.cn/forum.php?mod=viewthread&tid=2301&extra=page%3D3" target="_blank">http://bbs.niushop.com.cn/forum.php?mod=viewthread&tid=2301&extra=page%3D3</a></span> -->
				<!-- 						 -->
				<!-- 					{1/block} -->
			</h4>
		</div>
	</div>
	
	
	<div class="ns-main">
	
		<div class="js-mask-category" style="display:none;background: rgba(0,0,0,0);position:fixed;width:100%;height:100%;top:0;left:0;right:0;bottom:0;z-index:90;"></div>
		<table class="mytable">
			<tbody>
				<tr>
					<th align="left">
						<a class="btn-common" href="http://b2c.niuteam.cn/admin/goods/addgoods.html">发布商品</a>
						<a class="btn-common-white" href="javascript:batchDelete()">批量删除</a>
						<a class="btn-common-white upstore" href="javascript:goodsIdCount('online')">上架</a>
						<a class="btn-common-white downstore" href="javascript:goodsIdCount('offline')">下架</a>
						<a class="btn-common-white recommend" href="javascript:ShowRecommend()" data-html="true" id="setRecommend" title="推荐" data-container="body" data-placement="bottom" data-trigger="manual" data-content="">推荐</a>
						<a data-html="true" class="btn-common-white fun-a category" href="javascript:goodsGroupIdCount();" id="editGroup" title="修改商品标签" data-container="body" data-placement="bottom" data-trigger="manual" data-content="">
					商品标签</a>
						<a href="javascript:batchUpdateGoodsQrcode();;" class="btn-common-white fun-a category" title="更新二维码">更新二维码</a>
						<a href="javascript:;" id="batchProcessing" class="btn-common-white" title="批量设置商品信息">批量处理</a>
						<a href="javascript:;" id="setMemberDiscount" class="btn-common-white" title="批量设置会员折扣">设置折扣</a>
						<input type="hidden" id="goods_type_ids">
					</th>
					<th style="position: relative;">
	
						商品分类：
						<div style="display: inline-block;position: relative;">
							<input type="text" placeholder="请选择商品分类" @click="showCategory=!showCategory" class="input-common middle">
							<div class="goodsCategory one" v-show="showCategory">
								<ul>
									<li class="js-category-one" category_id="3">
										<span>养护设备</span>
										<i class="fa fa-angle-right fa-lg"></i>
									</li>
									<li class="js-category-one" category_id="4">
										<span>工程设备</span>
										<i class="fa fa-angle-right fa-lg"></i>
									</li>
									<li class="js-category-one" category_id="5">
										<span>环卫设备</span>
										<i class="fa fa-angle-right fa-lg"></i>
									</li>
									<li class="js-category-one" category_id="146">
										<span>服装</span>
										<i class="fa fa-angle-right fa-lg"></i>
									</li>
									<li class="js-category-one" category_id="6">
										<span>配件专区</span>
										<i class="fa fa-angle-right fa-lg"></i>
									</li>
									<li class="js-category-one" category_id="7">
										<span>女鞋/箱包/钟表/珠宝</span>
										<i class="fa fa-angle-right fa-lg"></i>
									</li>
									<li class="js-category-one" category_id="8">
										<span>男鞋/运动/户外</span>
										<i class="fa fa-angle-right fa-lg"></i>
									</li>
									<li class="js-category-one" category_id="2">
										<span>混凝土设</span>
										<i class="fa fa-angle-right fa-lg"></i>
									</li>
									<li class="js-category-one" category_id="9">
										<span>汽车/汽车用品</span>
										<i class="fa fa-angle-right fa-lg"></i>
									</li>
									<li class="js-category-one" category_id="10">
										<span>母婴/玩具用品</span>
										<i class="fa fa-angle-right fa-lg"></i>
									</li>
									<li class="js-category-one" category_id="11">
										<span>食品/酒类/生鲜/特产</span>
										<i class="fa fa-angle-right fa-lg"></i>
									</li>
								</ul>
							</div>
							<div class="goodsCategory two" style="border-left:0;">
								<ul id="goodsCategoryTwo"></ul>
							</div>
							<div class="goodsCategory three">
								<ul id="goodsCategoryThree"></ul>
							</div>
							<div class="selectGoodsCategory">
								<a href="javascript:;" id="confirmSelect" style="float:right;">确认选择</a>
							</div>
							<input type="hidden" id="category_id_1">
							<input type="hidden" id="category_id_2">
							<input type="hidden" id="category_id_3">
						</div>
	
						<span class="interval"></span>
						<span>商品名称：</span>
						<input id="goods_name" class="input-medium input-common middle" type="text" value="" placeholder="要搜索的商品名称">
						<span class="interval"></span>
						<button class="btn-common-white more-search"><i class="fa fa-chevron-down"></i></button>
						<span class="interval"></span>
						<button onclick="searchData()" class="btn-common">搜索</button>
	
						<!-- 更多搜索 -->
						<div class="more-search-container">
							<dl>
								<dt>商品编码：</dt>
								<dd>
									<input id="goods_code" class="input-medium input-common middle" type="text" placeholder="要搜索的商品编码">
								</dd>
							</dl>
							<dl>
								<dt>供货商：</dt>
								<dd>
									<div class="selectric-wrapper selectric-select-common selectric-middle" style="width: 150px;">
										<div class="selectric-hide-select"><select id="supplier_id" class="select-common middle" tabindex="-1">
								<option value="">全部</option>
															<option value="1">小米供货商</option>
															<option value="2">三星供货商</option>
														</select></div>
										<div class="selectric"><span class="selectric-label">全部</span><button class="selectric-button">▾</button></div>
										<div class="selectric-items" tabindex="-1">
											<div class="selectric-scroll">
												<ul>
													<li data-index="0" class="selected" title="全部">全部</li>
													<li data-index="1" class="" title="小米供货商">小米供货商</li>
													<li data-index="2" class="last" title="三星供货商">三星供货商</li>
												</ul>
											</div>
										</div><input class="selectric-input" tabindex="0"></div>
								</dd>
							</dl>
							<!-- 				<dl> -->
							<!-- 					<dt>上下架：</dt> -->
							<!-- 					<dd> -->
							<!-- 						<select id="state" cl	ass="select-common middle" > -->
							<!-- 							<option value="" >全部</option> -->
							<!-- 							<option value="1" >上架</option> -->
							<!-- 							<option value="0" >下架</option> -->
							<!-- 						</select> -->
							<!-- 					</dd> -->
							<!-- 				</dl> -->
							<dl>
								<dt>商品类型：</dt>
								<dd>
									<div class="selectric-wrapper selectric-select-common selectric-middle" style="width: 150px;">
										<div class="selectric-hide-select"><select id="goods_type" class="select-common middle" tabindex="-1">
								<option value="all">全部</option>
								<option value="1">实物商品</option>
								<option value="0">虚拟商品</option>
							</select></div>
										<div class="selectric"><span class="selectric-label">全部</span><button class="selectric-button">▾</button></div>
										<div class="selectric-items" tabindex="-1">
											<div class="selectric-scroll">
												<ul>
													<li data-index="0" class="selected" title="全部">全部</li>
													<li data-index="1" class="" title="实物商品">实物商品</li>
													<li data-index="2" class="last" title="虚拟商品">虚拟商品</li>
												</ul>
											</div>
										</div><input class="selectric-input" tabindex="0"></div>
								</dd>
							</dl>
							<dl>
								<dt>商品标签：</dt>
								<dd>
									<input type="text" placeholder="请选择商品标签" id="selectGoodsLabel" onfocus="selectGoodsLabel();" is_show="false" data-html="true" class="input-common middle" title="<h6 class='edit-group-title'>选择商品标签</h6>" data-container="body" data-placement="bottom" data-trigger="manual"
									    data-content=""></dd>
							</dl>
							<dl>
								<dt></dt>
								<dd>
									<a href="javascript:;" onclick="searchData()" class="btn-common">完成</a>
								</dd>
							</dl>
						</div>
					</th>
				</tr>
			</tbody>
		</table>
		<div id="myTabContent" class="tab-content">
			<div class="tab-pane active">
				<table class="table-class">
					<colgroup>
						<col style="width: 2%;">
						<col style="width: 25%;">
						<col style="width: 15%;">
	
						<col style="width: 15%;">
						<col style="width: 11%;">
						<col style="width: 11%;">
						<col style="width: 4%;">
						<col style="width: 15%;">
					</colgroup>
					<thead>
						<tr>
							<th>
								<i class="checkbox-common">
								<input onclick="CheckAll(this)" type="checkbox" id="chek_all">
							</i>
							</th>
							<th align="left">商品名称</th>
							<th class="goods-fields-sort" data-field="price" style="text-align: right;">价格(元)<span class="desc"></span></th>
							<th class="goods-fields-sort" data-field="stock" style="text-align: right;">总库存<span class="desc"></span></th>
							<th class="goods-fields-sort" data-field="sales" style="text-align: right;">销量<span class="desc"></span></th>
							<th>实物类型</th>
							<th class="goods-fields-sort" data-field="sort" style="text-align: center;">排序<span class="desc"></span></th>
							<th>操作</th>
						</tr>
					</thead>
					<tbody id="productTbody" style="border: 0;">
						<div v-for="goods in goodsList">
							<tr class="tr-title">
							<td class="td-157" style="border-bottom:0;"></td>
							<td colspan="9" style="border-bottom:0;">
								<div style="display: inline-block; width: 100%;font-size:12px;color:#666;" class="pro-code"><span>商家编码：{{ goods.shopNumber }}</span><span class="pro-code" style="margin-left:10px;">创建时间：{{ goods.createDate }}<span class="div-flag-style" style="display: inline-block;margin:0 20px;position:relative"><i class="icon-qrcode" style="background: none; color: #555; font-size: 20px; margin-right: 0;"></i><div class="QRcode" style="display: none; position: absolute;width:110px;top:28px;left:0;z-index:10;" id="qrcode"><p><img src="/upload/goods_qrcode/goods_qrcode_157.png" style="width:110px;"></p></div></span></span>
								</div>
							</td>
						</tr>
						<tr>
							<td align="center"><i class="checkbox-common"><input value="157" name="sub" data-state="1" type="checkbox"></i></td>
							<td colspan="1">
								<div style="width:450px;">
									<a class="a-pro-view-img" href="http://b2c.niuteam.cn/goods/goodsinfo?goodsid=157" target="_blank" style="height:70px;line-height:70px;text-align:center;"><img class="thumbnail-img" src="http://pc7mzzjqj.bkt.clouddn.com/upload/goods/20180724/1ba75c9b575740a0db4e6dd8aca893a14.jpg"></a>
									<div class="div-pro-view-name">
										<div class="editGoodsIntroduction" ondblclick="editGoodsInfo(this)"><a target="_blank" style="word-break:break-all;" href="http://b2c.niuteam.cn/goods/goodsinfo?goodsid=157">1</a></div><input class="js-update-goods-name input-common" style="width:350px!important;" data-goods-id="157" data-up-type="goods_name"
										    type="text" value="1"><br>
										<div class="editGoodsIntroduction" ondblclick="editGoodsInfo(this)"><span style="color:#999;font-size:12px;display:block;height:25px;overflow:hidden;text-decoration: none;">1</span></div><input data-goods-id="157" data-up-type="introduction" class="js-update-introduction input-common" style="width:350px!important;"
										    type="text" maxlength="60" value="1">
										<div style="position: relative;margin-left: 75px;"><i style="color:#999;font-size:12px;margin-top:5px;padding:1px 4px;border-radius:3px;display:inline-block;color:#FFF;background-color:#FF6600;text-decoration: none;height:16px;line-height: 16px;overflow:hidden;margin-right:5px;text-align:center;font-style:normal;">新品lll</i></div>
									</div>
								</div>
							</td>
							<td style="text-align: right;">
								<div><span class="price-numble" id="moreChangePrice157" style="color:#FF6600;">0.00</span></div>
							</td>
							<td style="text-align: right;">
								<div class="cell"><span class="pro-stock" style="color: #666;" id="moreChangeStock157">0</span></div>
							</td>
							<td style="text-align: right;">
								<div class="cell"><span class="pro-stock" style="color: #666;" id="moreChangeStock157">0</span></div>
							</td>
							<td style="text-align: center;"><span>实物类</span></td>
							<td style="text-align: center;">
								<div class="cell"><input class="input-common input-common-sort" goods_id="157" value="0" onchange="changeSort(this)" type="number" title="排序号数值越大，商城商品列表显示越靠前"></div>
							</td>
							<td>
								<div class="bs-docs-example tooltip-demo" style="text-align: center;"><a href="http://b2c.niuteam.cn/admin/goods/addgoods?step=2&amp;goodsId=157" title="编辑商品">编辑</a><a href="javascript:copyGoodsDetail(157);" title="复制商品">复制</a><a href="javascript:deleteGoods(157)" title="删除商品">删除</a><br><a href="javascript:modifyGoodsOnline(157,'offline')">下架</a><br>
									<a
									    href="javascript:showMemberDiscount(157)">设置会员折扣</a>
								</div>
							</td>
						</tr>
						</div>

						<tr class="tr-title">
							<td class="td-155" style="border-bottom:0;"></td>
							<td colspan="9" style="border-bottom:0;">
								<div style="display: inline-block; width: 100%;font-size:12px;color:#666;" class="pro-code"><span>商家编码：</span><span class="pro-code" style="margin-left:10px;">创建时间：2018-07-20 12:22:10<span class="div-flag-style" style="display: inline-block;margin:0 20px;position:relative"><i class="icon-qrcode" style="background: none; color: #555; font-size: 20px; margin-right: 0;"></i><div class="QRcode" style="display: none; position: absolute;width:110px;top:28px;left:0;z-index:10;" id="qrcode"><p><img src="/upload/goods_qrcode/goods_qrcode_155.png" style="width:110px;"></p></div></span></span>
								</div>
							</td>
						</tr>
						<tr>
							<td align="center"><i class="checkbox-common"><input value="155" name="sub" data-state="1" type="checkbox"></i></td>
							<td colspan="1">
								<div style="width:450px;">
									<a class="a-pro-view-img" href="http://b2c.niuteam.cn/goods/goodsinfo?goodsid=155" target="_blank" style="height:70px;line-height:70px;text-align:center;"><img class="thumbnail-img" src="/upload/goods/149933394894.jpg"></a>
									<div class="div-pro-view-name">
										<div class="editGoodsIntroduction" ondblclick="editGoodsInfo(this)"><a target="_blank" style="word-break:break-all;" href="http://b2c.niuteam.cn/goods/goodsinfo?goodsid=155">5555 123</a></div><input class="js-update-goods-name input-common" style="width:350px!important;" data-goods-id="155" data-up-type="goods_name"
										    type="text" value="5555 123"><br>
										<div style="position: relative;margin-left: 75px;"><i style="color:#999;font-size:12px;margin-top:5px;padding:1px 4px;border-radius:3px;display:inline-block;color:#FFF;background-color:#FF6600;text-decoration: none;height:16px;line-height: 16px;overflow:hidden;margin-right:5px;text-align:center;font-style:normal;">热卖</i>
											<i
											    style="color:#999;font-size:12px;margin-top:5px;padding:1px 4px;border-radius:3px;display:inline-block;color:#FFF;background-color:#FF6600;text-decoration: none;height:16px;line-height: 16px;overflow:hidden;margin-right:5px;text-align:center;font-style:normal;">活动</i><i style="color:#999;font-size:12px;margin-top:5px;padding:1px 4px;border-radius:3px;display:inline-block;color:#FFF;background-color:#FF6600;text-decoration: none;height:16px;line-height: 16px;overflow:hidden;margin-right:5px;text-align:center;font-style:normal;">新品lll</i></div>
									</div>
								</div>
							</td>
							<td style="text-align: right;">
								<div><span class="price-numble" id="moreChangePrice155" style="color:#FF6600;">10.00</span></div>
							</td>
							<td style="text-align: right;">
								<div class="cell"><span class="pro-stock" style="color: #666;" id="moreChangeStock155">0</span></div>
							</td>
							<td style="text-align: right;">
								<div class="cell"><span class="pro-stock" style="color: #666;" id="moreChangeStock155">1</span></div>
							</td>
							<td style="text-align: center;"><span>实物类</span></td>
							<td style="text-align: center;">
								<div class="cell"><input class="input-common input-common-sort" goods_id="155" value="0" onchange="changeSort(this)" type="number" title="排序号数值越大，商城商品列表显示越靠前"></div>
							</td>
							<td>
								<div class="bs-docs-example tooltip-demo" style="text-align: center;"><a href="http://b2c.niuteam.cn/admin/goods/addgoods?step=2&amp;goodsId=155" title="编辑商品">编辑</a><a href="javascript:copyGoodsDetail(155);" title="复制商品">复制</a><a href="javascript:deleteGoods(155)" title="删除商品">删除</a><br><a href="javascript:modifyGoodsOnline(155,'offline')">下架</a><br>
									<a
									    href="javascript:showMemberDiscount(155)">设置会员折扣</a>
								</div>
							</td>
						</tr>
						<tr class="tr-title">
							<td class="td-154" style="border-bottom:0;"></td>
							<td colspan="9" style="border-bottom:0;">
								<div style="display: inline-block; width: 100%;font-size:12px;color:#666;" class="pro-code"><span>商家编码：</span><span class="pro-code" style="margin-left:10px;">创建时间：2018-07-18 17:32:08<span class="div-flag-style" style="display: inline-block;margin:0 20px;position:relative"><i class="icon-qrcode" style="background: none; color: #555; font-size: 20px; margin-right: 0;"></i><div class="QRcode" style="display: none; position: absolute;width:110px;top:28px;left:0;z-index:10;" id="qrcode"><p><img src="/upload/goods_qrcode/goods_qrcode_154.png" style="width:110px;"></p></div></span></span>
								</div>
							</td>
						</tr>
						<tr>
							<td align="center"><i class="checkbox-common"><input value="154" name="sub" data-state="1" type="checkbox"></i></td>
							<td colspan="1">
								<div style="width:450px;">
									<a class="a-pro-view-img" href="http://b2c.niuteam.cn/goods/goodsinfo?goodsid=154" target="_blank" style="height:70px;line-height:70px;text-align:center;"><img class="thumbnail-img" src="/upload/goods/20180718/1b39ba1e861f577e3fcd34f54dbeadae4.jpg"></a>
									<div class="div-pro-view-name">
										<div class="editGoodsIntroduction" ondblclick="editGoodsInfo(this)"><a target="_blank" style="word-break:break-all;" href="http://b2c.niuteam.cn/goods/goodsinfo?goodsid=154">AAA3213-副本</a></div><input class="js-update-goods-name input-common" style="width:350px!important;" data-goods-id="154" data-up-type="goods_name"
										    type="text" value="AAA3213-副本"><br>
										<div class="editGoodsIntroduction" ondblclick="editGoodsInfo(this)"><span style="color:#999;font-size:12px;display:block;height:25px;overflow:hidden;text-decoration: none;">123123213123123</span></div><input data-goods-id="154" data-up-type="introduction" class="js-update-introduction input-common" style="width:350px!important;"
										    type="text" maxlength="60" value="123123213123123">
										<div style="position: relative;margin-left: 75px;"><i style="color:#999;font-size:12px;margin-top:5px;padding:1px 4px;border-radius:3px;display:inline-block;color:#FFF;background-color:#FF6600;text-decoration: none;height:16px;line-height: 16px;overflow:hidden;margin-right:5px;text-align:center;font-style:normal;">新品lll</i>
											<i
											    style="color:#999;font-size:12px;margin-top:5px;padding:1px 4px;border-radius:3px;display:inline-block;color:#FFF;background-color:#FF6600;text-decoration: none;height:16px;line-height: 16px;overflow:hidden;margin-right:5px;text-align:center;font-style:normal;">活动</i><i style="color:#999;font-size:12px;margin-top:5px;padding:1px 4px;border-radius:3px;display:inline-block;color:#FFF;background-color:#FF6600;text-decoration: none;height:16px;line-height: 16px;overflow:hidden;margin-right:5px;text-align:center;font-style:normal;">热卖</i></div>
									</div>
								</div>
							</td>
							<td style="text-align: right;">
								<div><span class="price-numble" id="moreChangePrice154" style="color:#FF6600;">5.00</span></div>
							</td>
							<td style="text-align: right;">
								<div class="cell"><span class="pro-stock" style="color: #666;" id="moreChangeStock154">22</span></div>
							</td>
							<td style="text-align: right;">
								<div class="cell"><span class="pro-stock" style="color: #666;" id="moreChangeStock154">0</span></div>
							</td>
							<td style="text-align: center;"><span>虚拟类</span></td>
							<td style="text-align: center;">
								<div class="cell"><input class="input-common input-common-sort" goods_id="154" value="0" onchange="changeSort(this)" type="number" title="排序号数值越大，商城商品列表显示越靠前"></div>
							</td>
							<td>
								<div class="bs-docs-example tooltip-demo" style="text-align: center;"><a href="http://b2c.niuteam.cn/admin/goods/addgoods?step=2&amp;goodsId=154" title="编辑商品">编辑</a><a href="javascript:copyGoodsDetail(154);" title="复制商品">复制</a><a href="javascript:deleteGoods(154)" title="删除商品">删除</a><br><a href="javascript:modifyGoodsOnline(154,'offline')">下架</a><br>
									<a
									    href="javascript:showMemberDiscount(154)">设置会员折扣</a><br><a href="http://b2c.niuteam.cn/admin/goods/virtualGoodsList?goods_id=154" title="虚拟商品管理" target="_blank">虚拟商品管理</a></div>
							</td>
						</tr>
						<tr class="tr-title">
							<td class="td-152" style="border-bottom:0;"></td>
							<td colspan="9" style="border-bottom:0;">
								<div style="display: inline-block; width: 100%;font-size:12px;color:#666;" class="pro-code"><span>商家编码：</span><span class="pro-code" style="margin-left:10px;">创建时间：2018-07-18 16:27:52<span class="div-flag-style" style="display: inline-block;margin:0 20px;position:relative"><i class="icon-qrcode" style="background: none; color: #555; font-size: 20px; margin-right: 0;"></i><div class="QRcode" style="display: none; position: absolute;width:110px;top:28px;left:0;z-index:10;" id="qrcode"><p><img src="/upload/goods_qrcode/goods_qrcode_152.png" style="width:110px;"></p></div></span></span>
								</div>
							</td>
						</tr>
						<tr>
							<td align="center"><i class="checkbox-common"><input value="152" name="sub" data-state="1" type="checkbox"></i></td>
							<td colspan="1">
								<div style="width:450px;">
									<a class="a-pro-view-img" href="http://b2c.niuteam.cn/goods/goodsinfo?goodsid=152" target="_blank" style="height:70px;line-height:70px;text-align:center;"><img class="thumbnail-img" src="/upload/goods/20180718/faf7a70e656bf2dadea2e1e6ceff2f714.jpg"></a>
									<div class="div-pro-view-name">
										<div class="editGoodsIntroduction" ondblclick="editGoodsInfo(this)"><a target="_blank" style="word-break:break-all;" href="http://b2c.niuteam.cn/goods/goodsinfo?goodsid=152">TV1233213-副本</a></div><input class="js-update-goods-name input-common" style="width:350px!important;" data-goods-id="152" data-up-type="goods_name"
										    type="text" value="TV1233213-副本"><br>
										<div style="position: relative;margin-left: 75px;"><i style="color:#999;font-size:12px;margin-top:5px;padding:1px 4px;border-radius:3px;display:inline-block;color:#FFF;background-color:#FF6600;text-decoration: none;height:16px;line-height: 16px;overflow:hidden;margin-right:5px;text-align:center;font-style:normal;">新品lll</i>
											<i
											    style="color:#999;font-size:12px;margin-top:5px;padding:1px 4px;border-radius:3px;display:inline-block;color:#FFF;background-color:#FF6600;text-decoration: none;height:16px;line-height: 16px;overflow:hidden;margin-right:5px;text-align:center;font-style:normal;">活动</i><i style="color:#999;font-size:12px;margin-top:5px;padding:1px 4px;border-radius:3px;display:inline-block;color:#FFF;background-color:#FF6600;text-decoration: none;height:16px;line-height: 16px;overflow:hidden;margin-right:5px;text-align:center;font-style:normal;">热卖</i></div>
									</div>
								</div>
							</td>
							<td style="text-align: right;">
								<div><span class="price-numble" id="moreChangePrice152" style="color:#FF6600;">5.00</span></div>
							</td>
							<td style="text-align: right;">
								<div class="cell"><span class="pro-stock" style="color: #666;" id="moreChangeStock152">263</span></div>
							</td>
							<td style="text-align: right;">
								<div class="cell"><span class="pro-stock" style="color: #666;" id="moreChangeStock152">1</span></div>
							</td>
							<td style="text-align: center;"><span>实物类</span></td>
							<td style="text-align: center;">
								<div class="cell"><input class="input-common input-common-sort" goods_id="152" value="20" onchange="changeSort(this)" type="number" title="排序号数值越大，商城商品列表显示越靠前"></div>
							</td>
							<td>
								<div class="bs-docs-example tooltip-demo" style="text-align: center;"><a href="http://b2c.niuteam.cn/admin/goods/addgoods?step=2&amp;goodsId=152" title="编辑商品">编辑</a><a href="javascript:copyGoodsDetail(152);" title="复制商品">复制</a><a href="javascript:deleteGoods(152)" title="删除商品">删除</a><br><a href="javascript:modifyGoodsOnline(152,'offline')">下架</a><br>
									<a
									    href="javascript:showMemberDiscount(152)">设置会员折扣</a>
								</div>
							</td>
						</tr>
						<tr class="tr-title">
							<td class="td-151" style="border-bottom:0;"></td>
							<td colspan="9" style="border-bottom:0;">
								<div style="display: inline-block; width: 100%;font-size:12px;color:#666;" class="pro-code"><span>商家编码：</span><span class="pro-code" style="margin-left:10px;">创建时间：2018-07-18 16:27:45<span class="div-flag-style" style="display: inline-block;margin:0 20px;position:relative"><i class="icon-qrcode" style="background: none; color: #555; font-size: 20px; margin-right: 0;"></i><div class="QRcode" style="display: none; position: absolute;width:110px;top:28px;left:0;z-index:10;" id="qrcode"><p><img src="/upload/goods_qrcode/goods_qrcode_151.png" style="width:110px;"></p></div></span></span>
								</div>
							</td>
						</tr>
						<tr>
							<td align="center"><i class="checkbox-common"><input value="151" name="sub" data-state="1" type="checkbox"></i></td>
							<td colspan="1">
								<div style="width:450px;">
									<a class="a-pro-view-img" href="http://b2c.niuteam.cn/goods/goodsinfo?goodsid=151" target="_blank" style="height:70px;line-height:70px;text-align:center;"><img class="thumbnail-img" src="/upload/goods/20180718/faf7a70e656bf2dadea2e1e6ceff2f714.jpg"></a>
									<div class="div-pro-view-name">
										<div class="editGoodsIntroduction" ondblclick="editGoodsInfo(this)"><a target="_blank" style="word-break:break-all;" href="http://b2c.niuteam.cn/goods/goodsinfo?goodsid=151">TV1233213-副本</a></div><input class="js-update-goods-name input-common" style="width:350px!important;" data-goods-id="151" data-up-type="goods_name"
										    type="text" value="TV1233213-副本"><br>
										<div style="position: relative;margin-left: 75px;"><i style="color:#999;font-size:12px;margin-top:5px;padding:1px 4px;border-radius:3px;display:inline-block;color:#FFF;background-color:#FF6600;text-decoration: none;height:16px;line-height: 16px;overflow:hidden;margin-right:5px;text-align:center;font-style:normal;">新品lll</i>
											<i
											    style="color:#999;font-size:12px;margin-top:5px;padding:1px 4px;border-radius:3px;display:inline-block;color:#FFF;background-color:#FF6600;text-decoration: none;height:16px;line-height: 16px;overflow:hidden;margin-right:5px;text-align:center;font-style:normal;">活动</i><i style="color:#999;font-size:12px;margin-top:5px;padding:1px 4px;border-radius:3px;display:inline-block;color:#FFF;background-color:#FF6600;text-decoration: none;height:16px;line-height: 16px;overflow:hidden;margin-right:5px;text-align:center;font-style:normal;">热卖</i></div>
									</div>
								</div>
							</td>
							<td style="text-align: right;">
								<div><span class="price-numble" id="moreChangePrice151" style="color:#FF6600;">5.00</span></div>
							</td>
							<td style="text-align: right;">
								<div class="cell"><span class="pro-stock" style="color: #666;" id="moreChangeStock151">264</span></div>
							</td>
							<td style="text-align: right;">
								<div class="cell"><span class="pro-stock" style="color: #666;" id="moreChangeStock151">0</span></div>
							</td>
							<td style="text-align: center;"><span>实物类</span></td>
							<td style="text-align: center;">
								<div class="cell"><input class="input-common input-common-sort" goods_id="151" value="2" onchange="changeSort(this)" type="number" title="排序号数值越大，商城商品列表显示越靠前"></div>
							</td>
							<td>
								<div class="bs-docs-example tooltip-demo" style="text-align: center;"><a href="http://b2c.niuteam.cn/admin/goods/addgoods?step=2&amp;goodsId=151" title="编辑商品">编辑</a><a href="javascript:copyGoodsDetail(151);" title="复制商品">复制</a><a href="javascript:deleteGoods(151)" title="删除商品">删除</a><br><a href="javascript:modifyGoodsOnline(151,'offline')">下架</a><br>
									<a
									    href="javascript:showMemberDiscount(151)">设置会员折扣</a>
								</div>
							</td>
						</tr>
						<tr class="tr-title">
							<td class="td-150" style="border-bottom:0;"></td>
							<td colspan="9" style="border-bottom:0;">
								<div style="display: inline-block; width: 100%;font-size:12px;color:#666;" class="pro-code"><span>商家编码：</span><span class="pro-code" style="margin-left:10px;">创建时间：2018-07-18 15:55:05<span class="div-flag-style" style="display: inline-block;margin:0 20px;position:relative"><i class="icon-qrcode" style="background: none; color: #555; font-size: 20px; margin-right: 0;"></i><div class="QRcode" style="display: none; position: absolute;width:110px;top:28px;left:0;z-index:10;" id="qrcode"><p><img src="/upload/goods_qrcode/goods_qrcode_150.png" style="width:110px;"></p></div></span></span>
								</div>
							</td>
						</tr>
						<tr>
							<td align="center"><i class="checkbox-common"><input value="150" name="sub" data-state="1" type="checkbox"></i></td>
							<td colspan="1">
								<div style="width:450px;">
									<a class="a-pro-view-img" href="http://b2c.niuteam.cn/goods/goodsinfo?goodsid=150" target="_blank" style="height:70px;line-height:70px;text-align:center;"><img class="thumbnail-img" src="/upload/goods/20180718/faf7a70e656bf2dadea2e1e6ceff2f714.jpg"></a>
									<div class="div-pro-view-name">
										<div class="editGoodsIntroduction" ondblclick="editGoodsInfo(this)"><a target="_blank" style="word-break:break-all;" href="http://b2c.niuteam.cn/goods/goodsinfo?goodsid=150">TV1233213</a></div><input class="js-update-goods-name input-common" style="width:350px!important;" data-goods-id="150" data-up-type="goods_name"
										    type="text" value="TV1233213"><br>
										<div class="editGoodsIntroduction" ondblclick="editGoodsInfo(this)"><span style="color:#999;font-size:12px;display:block;height:25px;overflow:hidden;text-decoration: none;">321AAAAAAA</span></div><input data-goods-id="150" data-up-type="introduction" class="js-update-introduction input-common" style="width:350px!important;"
										    type="text" maxlength="60" value="321AAAAAAA">
										<div style="position: relative;margin-left: 75px;"><i style="color:#999;font-size:12px;margin-top:5px;padding:1px 4px;border-radius:3px;display:inline-block;color:#FFF;background-color:#FF6600;text-decoration: none;height:16px;line-height: 16px;overflow:hidden;margin-right:5px;text-align:center;font-style:normal;">新品lll</i>
											<i
											    style="color:#999;font-size:12px;margin-top:5px;padding:1px 4px;border-radius:3px;display:inline-block;color:#FFF;background-color:#FF6600;text-decoration: none;height:16px;line-height: 16px;overflow:hidden;margin-right:5px;text-align:center;font-style:normal;">活动</i><i style="color:#999;font-size:12px;margin-top:5px;padding:1px 4px;border-radius:3px;display:inline-block;color:#FFF;background-color:#FF6600;text-decoration: none;height:16px;line-height: 16px;overflow:hidden;margin-right:5px;text-align:center;font-style:normal;">热卖</i></div>
									</div>
								</div>
							</td>
							<td style="text-align: right;">
								<div><span class="price-numble" id="moreChangePrice150" style="color:#FF6600;">5.00</span></div>
							</td>
							<td style="text-align: right;">
								<div class="cell"><span class="pro-stock" style="color: #666;" id="moreChangeStock150">262</span></div>
							</td>
							<td style="text-align: right;">
								<div class="cell"><span class="pro-stock" style="color: #666;" id="moreChangeStock150">2</span></div>
							</td>
							<td style="text-align: center;"><span>实物类</span></td>
							<td style="text-align: center;">
								<div class="cell"><input class="input-common input-common-sort" goods_id="150" value="2" onchange="changeSort(this)" type="number" title="排序号数值越大，商城商品列表显示越靠前"></div>
							</td>
							<td>
								<div class="bs-docs-example tooltip-demo" style="text-align: center;"><a href="http://b2c.niuteam.cn/admin/goods/addgoods?step=2&amp;goodsId=150" title="编辑商品">编辑</a><a href="javascript:copyGoodsDetail(150);" title="复制商品">复制</a><a href="javascript:deleteGoods(150)" title="删除商品">删除</a><br><a href="javascript:modifyGoodsOnline(150,'offline')">下架</a><br>
									<a
									    href="javascript:showMemberDiscount(150)">设置会员折扣</a>
								</div>
							</td>
						</tr>
						<tr class="tr-title">
							<td class="td-149" style="border-bottom:0;"></td>
							<td colspan="9" style="border-bottom:0;">
								<div style="display: inline-block; width: 100%;font-size:12px;color:#666;" class="pro-code"><span>商家编码：</span><span class="pro-code" style="margin-left:10px;">创建时间：2018-07-17 19:18:38<span class="div-flag-style" style="display: inline-block;margin:0 20px;position:relative"><i class="icon-qrcode" style="background: none; color: #555; font-size: 20px; margin-right: 0;"></i><div class="QRcode" style="display: none; position: absolute;width:110px;top:28px;left:0;z-index:10;" id="qrcode"><p><img src="/upload/goods_qrcode/goods_qrcode_149.png" style="width:110px;"></p></div></span></span>
								</div>
							</td>
						</tr>
						<tr>
							<td align="center"><i class="checkbox-common"><input value="149" name="sub" data-state="1" type="checkbox"></i></td>
							<td colspan="1">
								<div style="width:450px;">
									<a class="a-pro-view-img" href="http://b2c.niuteam.cn/goods/goodsinfo?goodsid=149" target="_blank" style="height:70px;line-height:70px;text-align:center;"><img class="thumbnail-img" src="/upload/goods/20180714/15944de900d8591a9b58a310578828c14.jpg"></a>
									<div class="div-pro-view-name">
										<div class="editGoodsIntroduction" ondblclick="editGoodsInfo(this)"><a target="_blank" style="word-break:break-all;" href="http://b2c.niuteam.cn/goods/goodsinfo?goodsid=149">123</a></div><input class="js-update-goods-name input-common" style="width:350px!important;" data-goods-id="149" data-up-type="goods_name"
										    type="text" value="123"><br>
										<div style="position: relative;margin-left: 75px;"><i style="color:#999;font-size:12px;margin-top:5px;padding:1px 4px;border-radius:3px;display:inline-block;color:#FFF;background-color:#FF6600;text-decoration: none;height:16px;line-height: 16px;overflow:hidden;margin-right:5px;text-align:center;font-style:normal;">新品lll</i>
											<i
											    style="color:#999;font-size:12px;margin-top:5px;padding:1px 4px;border-radius:3px;display:inline-block;color:#FFF;background-color:#FF6600;text-decoration: none;height:16px;line-height: 16px;overflow:hidden;margin-right:5px;text-align:center;font-style:normal;">活动</i><i style="color:#999;font-size:12px;margin-top:5px;padding:1px 4px;border-radius:3px;display:inline-block;color:#FFF;background-color:#FF6600;text-decoration: none;height:16px;line-height: 16px;overflow:hidden;margin-right:5px;text-align:center;font-style:normal;">热卖</i></div>
									</div>
								</div>
							</td>
							<td style="text-align: right;">
								<div><span class="price-numble" id="moreChangePrice149" style="color:#FF6600;">5.00</span></div>
							</td>
							<td style="text-align: right;">
								<div class="cell"><span class="pro-stock" style="color: #666;" id="moreChangeStock149">23</span></div>
							</td>
							<td style="text-align: right;">
								<div class="cell"><span class="pro-stock" style="color: #666;" id="moreChangeStock149">3</span></div>
							</td>
							<td style="text-align: center;"><span>虚拟类</span></td>
							<td style="text-align: center;">
								<div class="cell"><input class="input-common input-common-sort" goods_id="149" value="0" onchange="changeSort(this)" type="number" title="排序号数值越大，商城商品列表显示越靠前"></div>
							</td>
							<td>
								<div class="bs-docs-example tooltip-demo" style="text-align: center;"><a href="http://b2c.niuteam.cn/admin/goods/addgoods?step=2&amp;goodsId=149" title="编辑商品">编辑</a><a href="javascript:copyGoodsDetail(149);" title="复制商品">复制</a><a href="javascript:deleteGoods(149)" title="删除商品">删除</a><br><a href="javascript:modifyGoodsOnline(149,'offline')">下架</a><br>
									<a
									    href="javascript:showMemberDiscount(149)">设置会员折扣</a><br><a href="http://b2c.niuteam.cn/admin/goods/virtualGoodsList?goods_id=149" title="虚拟商品管理" target="_blank">虚拟商品管理</a></div>
							</td>
						</tr>
						<tr class="tr-title">
							<td class="td-148" style="border-bottom:0;"></td>
							<td colspan="9" style="border-bottom:0;">
								<div style="display: inline-block; width: 100%;font-size:12px;color:#666;" class="pro-code"><span>商家编码：</span><span class="pro-code" style="margin-left:10px;">创建时间：2018-07-16 23:10:49<span class="div-flag-style" style="display: inline-block;margin:0 20px;position:relative"><i class="icon-qrcode" style="background: none; color: #555; font-size: 20px; margin-right: 0;"></i><div class="QRcode" style="display: none; position: absolute;width:110px;top:28px;left:0;z-index:10;" id="qrcode"><p><img src="/upload/goods_qrcode/goods_qrcode_148.png" style="width:110px;"></p></div></span></span>
								</div>
							</td>
						</tr>
						<tr>
							<td align="center"><i class="checkbox-common"><input value="148" name="sub" data-state="1" type="checkbox"></i></td>
							<td colspan="1">
								<div style="width:450px;">
									<a class="a-pro-view-img" href="http://b2c.niuteam.cn/goods/goodsinfo?goodsid=148" target="_blank" style="height:70px;line-height:70px;text-align:center;"><img class="thumbnail-img" src="/upload/goods/20180716/bb7a0c87be73d8429f762610cab168c24.JPG"></a>
									<div class="div-pro-view-name">
										<div class="editGoodsIntroduction" ondblclick="editGoodsInfo(this)"><a target="_blank" style="word-break:break-all;" href="http://b2c.niuteam.cn/goods/goodsinfo?goodsid=148">闻气味</a></div><input class="js-update-goods-name input-common" style="width:350px!important;" data-goods-id="148" data-up-type="goods_name"
										    type="text" value="闻气味"><br>
										<div style="position: relative;margin-left: 75px;"><i style="color:#999;font-size:12px;margin-top:5px;padding:1px 4px;border-radius:3px;display:inline-block;color:#FFF;background-color:#FF6600;text-decoration: none;height:16px;line-height: 16px;overflow:hidden;margin-right:5px;text-align:center;font-style:normal;">新品lll</i>
											<i
											    style="color:#999;font-size:12px;margin-top:5px;padding:1px 4px;border-radius:3px;display:inline-block;color:#FFF;background-color:#FF6600;text-decoration: none;height:16px;line-height: 16px;overflow:hidden;margin-right:5px;text-align:center;font-style:normal;">活动</i><i style="color:#999;font-size:12px;margin-top:5px;padding:1px 4px;border-radius:3px;display:inline-block;color:#FFF;background-color:#FF6600;text-decoration: none;height:16px;line-height: 16px;overflow:hidden;margin-right:5px;text-align:center;font-style:normal;">热卖</i></div>
									</div>
								</div>
							</td>
							<td style="text-align: right;">
								<div><span class="price-numble" id="moreChangePrice148" style="color:#FF6600;">11.00</span></div>
							</td>
							<td style="text-align: right;">
								<div class="cell"><span class="pro-stock" style="color: #666;" id="moreChangeStock148">53</span></div>
							</td>
							<td style="text-align: right;">
								<div class="cell"><span class="pro-stock" style="color: #666;" id="moreChangeStock148">2</span></div>
							</td>
							<td style="text-align: center;"><span>实物类</span></td>
							<td style="text-align: center;">
								<div class="cell"><input class="input-common input-common-sort" goods_id="148" value="0" onchange="changeSort(this)" type="number" title="排序号数值越大，商城商品列表显示越靠前"></div>
							</td>
							<td>
								<div class="bs-docs-example tooltip-demo" style="text-align: center;"><a href="http://b2c.niuteam.cn/admin/goods/addgoods?step=2&amp;goodsId=148" title="编辑商品">编辑</a><a href="javascript:copyGoodsDetail(148);" title="复制商品">复制</a><a href="javascript:deleteGoods(148)" title="删除商品">删除</a><br><a href="javascript:modifyGoodsOnline(148,'offline')">下架</a><br>
									<a
									    href="javascript:showMemberDiscount(148)">设置会员折扣</a>
								</div>
							</td>
						</tr>
						<tr class="tr-title">
							<td class="td-147" style="border-bottom:0;"></td>
							<td colspan="9" style="border-bottom:0;">
								<div style="display: inline-block; width: 100%;font-size:12px;color:#666;" class="pro-code"><span>商家编码：</span><span class="pro-code" style="margin-left:10px;">创建时间：2018-07-16 23:01:55<span class="div-flag-style" style="display: inline-block;margin:0 20px;position:relative"><i class="icon-qrcode" style="background: none; color: #555; font-size: 20px; margin-right: 0;"></i><div class="QRcode" style="display: none; position: absolute;width:110px;top:28px;left:0;z-index:10;" id="qrcode"><p><img src="/upload/goods_qrcode/goods_qrcode_147.png" style="width:110px;"></p></div></span></span>
								</div>
							</td>
						</tr>
						<tr>
							<td align="center"><i class="checkbox-common"><input value="147" name="sub" data-state="1" type="checkbox"></i></td>
							<td colspan="1">
								<div style="width:450px;">
									<a class="a-pro-view-img" href="http://b2c.niuteam.cn/goods/goodsinfo?goodsid=147" target="_blank" style="height:70px;line-height:70px;text-align:center;"><img class="thumbnail-img" src="/upload/goods/20180716/56b45a461f19569dd7bc467a14be1f874.JPG"></a>
									<div class="div-pro-view-name">
										<div class="editGoodsIntroduction" ondblclick="editGoodsInfo(this)"><a target="_blank" style="word-break:break-all;" href="http://b2c.niuteam.cn/goods/goodsinfo?goodsid=147">微波炉五件套</a></div><input class="js-update-goods-name input-common" style="width:350px!important;" data-goods-id="147" data-up-type="goods_name"
										    type="text" value="微波炉五件套"><br>
										<div style="position: relative;margin-left: 75px;"><i style="color:#999;font-size:12px;margin-top:5px;padding:1px 4px;border-radius:3px;display:inline-block;color:#FFF;background-color:#FF6600;text-decoration: none;height:16px;line-height: 16px;overflow:hidden;margin-right:5px;text-align:center;font-style:normal;">热卖</i>
											<i
											    style="color:#999;font-size:12px;margin-top:5px;padding:1px 4px;border-radius:3px;display:inline-block;color:#FFF;background-color:#FF6600;text-decoration: none;height:16px;line-height: 16px;overflow:hidden;margin-right:5px;text-align:center;font-style:normal;">活动</i><i style="color:#999;font-size:12px;margin-top:5px;padding:1px 4px;border-radius:3px;display:inline-block;color:#FFF;background-color:#FF6600;text-decoration: none;height:16px;line-height: 16px;overflow:hidden;margin-right:5px;text-align:center;font-style:normal;">新品lll</i></div>
									</div>
								</div>
							</td>
							<td style="text-align: right;">
								<div><span class="price-numble" id="moreChangePrice147" style="color:#FF6600;">1.00</span></div>
							</td>
							<td style="text-align: right;">
								<div class="cell"><span class="pro-stock" style="color: #666;" id="moreChangeStock147">55</span></div>
							</td>
							<td style="text-align: right;">
								<div class="cell"><span class="pro-stock" style="color: #666;" id="moreChangeStock147">0</span></div>
							</td>
							<td style="text-align: center;"><span>实物类</span></td>
							<td style="text-align: center;">
								<div class="cell"><input class="input-common input-common-sort" goods_id="147" value="0" onchange="changeSort(this)" type="number" title="排序号数值越大，商城商品列表显示越靠前"></div>
							</td>
							<td>
								<div class="bs-docs-example tooltip-demo" style="text-align: center;"><a href="http://b2c.niuteam.cn/admin/goods/addgoods?step=2&amp;goodsId=147" title="编辑商品">编辑</a><a href="javascript:copyGoodsDetail(147);" title="复制商品">复制</a><a href="javascript:deleteGoods(147)" title="删除商品">删除</a><br><a href="javascript:modifyGoodsOnline(147,'offline')">下架</a><br>
									<a
									    href="javascript:showMemberDiscount(147)">设置会员折扣</a>
								</div>
							</td>
						</tr>
						<tr class="tr-title">
							<td class="td-143" style="border-bottom:0;"></td>
							<td colspan="9" style="border-bottom:0;">
								<div style="display: inline-block; width: 100%;font-size:12px;color:#666;" class="pro-code"><span>商家编码：123465456</span><span class="pro-code" style="margin-left:10px;">创建时间：2018-07-16 16:39:20<span class="div-flag-style" style="display: inline-block;margin:0 20px;position:relative"><i class="icon-qrcode" style="background: none; color: #555; font-size: 20px; margin-right: 0;"></i><div class="QRcode" style="display: none; position: absolute;width:110px;top:28px;left:0;z-index:10;" id="qrcode"><p><img src="/upload/goods_qrcode/goods_qrcode_143.png" style="width:110px;"></p></div></span></span>
								</div>
							</td>
						</tr>
						<tr>
							<td align="center"><i class="checkbox-common"><input value="143" name="sub" data-state="1" type="checkbox"></i></td>
							<td colspan="1">
								<div style="width:450px;">
									<a class="a-pro-view-img" href="http://b2c.niuteam.cn/goods/goodsinfo?goodsid=143" target="_blank" style="height:70px;line-height:70px;text-align:center;"><img class="thumbnail-img" src="/upload/goods/20180706/37f55c761deeedd480bca9084b364d7c4.jpg"></a>
									<div class="div-pro-view-name">
										<div class="editGoodsIntroduction" ondblclick="editGoodsInfo(this)"><a target="_blank" style="word-break:break-all;" href="http://b2c.niuteam.cn/goods/goodsinfo?goodsid=143">1111</a></div><input class="js-update-goods-name input-common" style="width:350px!important;" data-goods-id="143" data-up-type="goods_name"
										    type="text" value="1111"><br>
										<div style="position: relative;margin-left: 75px;"></div>
									</div>
								</div>
							</td>
							<td style="text-align: right;">
								<div><span class="price-numble" id="moreChangePrice143" style="color:#FF6600;">1.00</span></div>
							</td>
							<td style="text-align: right;">
								<div class="cell"><span class="pro-stock" style="color: #666;" id="moreChangeStock143">300</span></div>
							</td>
							<td style="text-align: right;">
								<div class="cell"><span class="pro-stock" style="color: #666;" id="moreChangeStock143">0</span></div>
							</td>
							<td style="text-align: center;"><span>实物类</span></td>
							<td style="text-align: center;">
								<div class="cell"><input class="input-common input-common-sort" goods_id="143" value="111" onchange="changeSort(this)" type="number" title="排序号数值越大，商城商品列表显示越靠前"></div>
							</td>
							<td>
								<div class="bs-docs-example tooltip-demo" style="text-align: center;"><a href="http://b2c.niuteam.cn/admin/goods/addgoods?step=2&amp;goodsId=143" title="编辑商品">编辑</a><a href="javascript:copyGoodsDetail(143);" title="复制商品">复制</a><a href="javascript:deleteGoods(143)" title="删除商品">删除</a><br><a href="javascript:modifyGoodsOnline(143,'offline')">下架</a><br>
									<a
									    href="javascript:showMemberDiscount(143)">设置会员折扣</a>
								</div>
							</td>
						</tr>
						<tr class="tr-title">
							<td class="td-141" style="border-bottom:0;"></td>
							<td colspan="9" style="border-bottom:0;">
								<div style="display: inline-block; width: 100%;font-size:12px;color:#666;" class="pro-code"><span>商家编码：</span><span class="pro-code" style="margin-left:10px;">创建时间：2018-07-15 23:43:28<span class="div-flag-style" style="display: inline-block;margin:0 20px;position:relative"><i class="icon-qrcode" style="background: none; color: #555; font-size: 20px; margin-right: 0;"></i><div class="QRcode" style="display: none; position: absolute;width:110px;top:28px;left:0;z-index:10;" id="qrcode"><p><img src="/upload/goods_qrcode/goods_qrcode_141.png" style="width:110px;"></p></div></span></span>
								</div>
							</td>
						</tr>
						<tr>
							<td align="center"><i class="checkbox-common"><input value="141" name="sub" data-state="1" type="checkbox"></i></td>
							<td colspan="1">
								<div style="width:450px;">
									<a class="a-pro-view-img" href="http://b2c.niuteam.cn/goods/goodsinfo?goodsid=141" target="_blank" style="height:70px;line-height:70px;text-align:center;"><img class="thumbnail-img" src="/upload/goods/20180714/c54d7aff1631ec696e11fb1208e0bac04.png"></a>
									<div class="div-pro-view-name">
										<div class="editGoodsIntroduction" ondblclick="editGoodsInfo(this)"><a target="_blank" style="word-break:break-all;" href="http://b2c.niuteam.cn/goods/goodsinfo?goodsid=141">222221-副本</a></div><input class="js-update-goods-name input-common" style="width:350px!important;" data-goods-id="141" data-up-type="goods_name"
										    type="text" value="222221-副本"><br>
										<div style="position: relative;margin-left: 75px;"></div>
									</div>
								</div>
							</td>
							<td style="text-align: right;">
								<div><span class="price-numble" id="moreChangePrice141" style="color:#FF6600;">99.00</span></div>
							</td>
							<td style="text-align: right;">
								<div class="cell"><span class="pro-stock" style="color: #666;" id="moreChangeStock141">99996</span></div>
							</td>
							<td style="text-align: right;">
								<div class="cell"><span class="pro-stock" style="color: #666;" id="moreChangeStock141">2</span></div>
							</td>
							<td style="text-align: center;"><span>虚拟类</span></td>
							<td style="text-align: center;">
								<div class="cell"><input class="input-common input-common-sort" goods_id="141" value="0" onchange="changeSort(this)" type="number" title="排序号数值越大，商城商品列表显示越靠前"></div>
							</td>
							<td>
								<div class="bs-docs-example tooltip-demo" style="text-align: center;"><a href="http://b2c.niuteam.cn/admin/goods/addgoods?step=2&amp;goodsId=141" title="编辑商品">编辑</a><a href="javascript:copyGoodsDetail(141);" title="复制商品">复制</a><a href="javascript:deleteGoods(141)" title="删除商品">删除</a><br><a href="javascript:modifyGoodsOnline(141,'offline')">下架</a><br>
									<a
									    href="javascript:showMemberDiscount(141)">设置会员折扣</a><br><a href="http://b2c.niuteam.cn/admin/goods/virtualGoodsList?goods_id=141" title="虚拟商品管理" target="_blank">虚拟商品管理</a></div>
							</td>
						</tr>
						<tr class="tr-title">
							<td class="td-139" style="border-bottom:0;"></td>
							<td colspan="9" style="border-bottom:0;">
								<div style="display: inline-block; width: 100%;font-size:12px;color:#666;" class="pro-code"><span>商家编码：</span><span class="pro-code" style="margin-left:10px;">创建时间：2018-07-14 15:26:53<span class="div-flag-style" style="display: inline-block;margin:0 20px;position:relative"><i class="icon-qrcode" style="background: none; color: #555; font-size: 20px; margin-right: 0;"></i><div class="QRcode" style="display: none; position: absolute;width:110px;top:28px;left:0;z-index:10;" id="qrcode"><p><img src="/upload/goods_qrcode/goods_qrcode_139.png" style="width:110px;"></p></div></span></span>
								</div>
							</td>
						</tr>
						<tr>
							<td align="center"><i class="checkbox-common"><input value="139" name="sub" data-state="1" type="checkbox"></i></td>
							<td colspan="1">
								<div style="width:450px;">
									<a class="a-pro-view-img" href="http://b2c.niuteam.cn/goods/goodsinfo?goodsid=139" target="_blank" style="height:70px;line-height:70px;text-align:center;"><img class="thumbnail-img" src="/upload/goods/20180714/c54d7aff1631ec696e11fb1208e0bac04.png"></a>
									<div class="div-pro-view-name">
										<div class="editGoodsIntroduction" ondblclick="editGoodsInfo(this)"><a target="_blank" style="word-break:break-all;" href="http://b2c.niuteam.cn/goods/goodsinfo?goodsid=139">as</a></div><input class="js-update-goods-name input-common" style="width:350px!important;" data-goods-id="139" data-up-type="goods_name"
										    type="text" value="as"><br>
										<div style="position: relative;margin-left: 75px;"></div>
									</div>
								</div>
							</td>
							<td style="text-align: right;">
								<div><span class="price-numble" id="moreChangePrice139" style="color:#FF6600;">10.00</span></div>
							</td>
							<td style="text-align: right;">
								<div class="cell"><span class="pro-stock" style="color: #666;" id="moreChangeStock139">221</span></div>
							</td>
							<td style="text-align: right;">
								<div class="cell"><span class="pro-stock" style="color: #666;" id="moreChangeStock139">1</span></div>
							</td>
							<td style="text-align: center;"><span>虚拟类</span></td>
							<td style="text-align: center;">
								<div class="cell"><input class="input-common input-common-sort" goods_id="139" value="0" onchange="changeSort(this)" type="number" title="排序号数值越大，商城商品列表显示越靠前"></div>
							</td>
							<td>
								<div class="bs-docs-example tooltip-demo" style="text-align: center;"><a href="http://b2c.niuteam.cn/admin/goods/addgoods?step=2&amp;goodsId=139" title="编辑商品">编辑</a><a href="javascript:copyGoodsDetail(139);" title="复制商品">复制</a><a href="javascript:deleteGoods(139)" title="删除商品">删除</a><br><a href="javascript:modifyGoodsOnline(139,'offline')">下架</a><br>
									<a
									    href="javascript:showMemberDiscount(139)">设置会员折扣</a><br><a href="http://b2c.niuteam.cn/admin/goods/virtualGoodsList?goods_id=139" title="虚拟商品管理" target="_blank">虚拟商品管理</a></div>
							</td>
						</tr>
						<tr class="tr-title">
							<td class="td-136" style="border-bottom:0;"></td>
							<td colspan="9" style="border-bottom:0;">
								<div style="display: inline-block; width: 100%;font-size:12px;color:#666;" class="pro-code"><span>商家编码：</span><span class="pro-code" style="margin-left:10px;">创建时间：2018-07-10 21:50:10<span class="div-flag-style" style="display: inline-block;margin:0 20px;position:relative"><i class="icon-qrcode" style="background: none; color: #555; font-size: 20px; margin-right: 0;"></i><div class="QRcode" style="display: none; position: absolute;width:110px;top:28px;left:0;z-index:10;" id="qrcode"><p><img src="/upload/goods_qrcode/goods_qrcode_136.png" style="width:110px;"></p></div></span></span>
								</div>
							</td>
						</tr>
						<tr>
							<td align="center"><i class="checkbox-common"><input value="136" name="sub" data-state="1" type="checkbox"></i></td>
							<td colspan="1">
								<div style="width:450px;">
									<a class="a-pro-view-img" href="http://b2c.niuteam.cn/goods/goodsinfo?goodsid=136" target="_blank" style="height:70px;line-height:70px;text-align:center;"><img class="thumbnail-img" src="/upload/goods/20180706/37f55c761deeedd480bca9084b364d7c4.jpg"></a>
									<div class="div-pro-view-name">
										<div class="editGoodsIntroduction" ondblclick="editGoodsInfo(this)"><a target="_blank" style="word-break:break-all;" href="http://b2c.niuteam.cn/goods/goodsinfo?goodsid=136">werwer</a></div><input class="js-update-goods-name input-common" style="width:350px!important;" data-goods-id="136" data-up-type="goods_name"
										    type="text" value="werwer"><br>
										<div style="position: relative;margin-left: 75px;"></div>
									</div>
								</div>
							</td>
							<td style="text-align: right;">
								<div><span class="price-numble" id="moreChangePrice136" style="color:#FF6600;">0.00</span></div>
							</td>
							<td style="text-align: right;">
								<div class="cell"><span class="pro-stock" style="color: #666;" id="moreChangeStock136">0</span></div>
							</td>
							<td style="text-align: right;">
								<div class="cell"><span class="pro-stock" style="color: #666;" id="moreChangeStock136">0</span></div>
							</td>
							<td style="text-align: center;"><span>实物类</span></td>
							<td style="text-align: center;">
								<div class="cell"><input class="input-common input-common-sort" goods_id="136" value="0" onchange="changeSort(this)" type="number" title="排序号数值越大，商城商品列表显示越靠前"></div>
							</td>
							<td>
								<div class="bs-docs-example tooltip-demo" style="text-align: center;"><a href="http://b2c.niuteam.cn/admin/goods/addgoods?step=2&amp;goodsId=136" title="编辑商品">编辑</a><a href="javascript:copyGoodsDetail(136);" title="复制商品">复制</a><a href="javascript:deleteGoods(136)" title="删除商品">删除</a><br><a href="javascript:modifyGoodsOnline(136,'offline')">下架</a><br>
									<a
									    href="javascript:showMemberDiscount(136)">设置会员折扣</a>
								</div>
							</td>
						</tr>
						<tr class="tr-title">
							<td class="td-135" style="border-bottom:0;"></td>
							<td colspan="9" style="border-bottom:0;">
								<div style="display: inline-block; width: 100%;font-size:12px;color:#666;" class="pro-code"><span>商家编码：</span><span class="pro-code" style="margin-left:10px;">创建时间：2018-07-10 14:25:48<span class="div-flag-style" style="display: inline-block;margin:0 20px;position:relative"><i class="icon-qrcode" style="background: none; color: #555; font-size: 20px; margin-right: 0;"></i><div class="QRcode" style="display: none; position: absolute;width:110px;top:28px;left:0;z-index:10;" id="qrcode"><p><img src="/upload/goods_qrcode/goods_qrcode_135.png" style="width:110px;"></p></div></span></span>
								</div>
							</td>
						</tr>
						<tr>
							<td align="center"><i class="checkbox-common"><input value="135" name="sub" data-state="1" type="checkbox"></i></td>
							<td colspan="1">
								<div style="width:450px;">
									<a class="a-pro-view-img" href="http://b2c.niuteam.cn/goods/goodsinfo?goodsid=135" target="_blank" style="height:70px;line-height:70px;text-align:center;"><img class="thumbnail-img" src="/upload/goods/20180710/0f3fdc0c7b1dd84f7fd9bd7bc04a66f24.png"></a>
									<div class="div-pro-view-name">
										<div class="editGoodsIntroduction" ondblclick="editGoodsInfo(this)"><a target="_blank" style="word-break:break-all;" href="http://b2c.niuteam.cn/goods/goodsinfo?goodsid=135">测试发布一个积分兑换商品</a></div><input class="js-update-goods-name input-common" style="width:350px!important;" data-goods-id="135" data-up-type="goods_name"
										    type="text" value="测试发布一个积分兑换商品"><br>
										<div style="position: relative;margin-left: 75px;"></div>
									</div>
								</div>
							</td>
							<td style="text-align: right;">
								<div><span class="price-numble" id="moreChangePrice135" style="color:#FF6600;">0.00</span></div>
							</td>
							<td style="text-align: right;">
								<div class="cell"><span class="pro-stock" style="color: #666;" id="moreChangeStock135">8</span></div>
							</td>
							<td style="text-align: right;">
								<div class="cell"><span class="pro-stock" style="color: #666;" id="moreChangeStock135">2</span></div>
							</td>
							<td style="text-align: center;"><span>虚拟类</span></td>
							<td style="text-align: center;">
								<div class="cell"><input class="input-common input-common-sort" goods_id="135" value="0" onchange="changeSort(this)" type="number" title="排序号数值越大，商城商品列表显示越靠前"></div>
							</td>
							<td>
								<div class="bs-docs-example tooltip-demo" style="text-align: center;"><a href="http://b2c.niuteam.cn/admin/goods/addgoods?step=2&amp;goodsId=135" title="编辑商品">编辑</a><a href="javascript:copyGoodsDetail(135);" title="复制商品">复制</a><a href="javascript:deleteGoods(135)" title="删除商品">删除</a><br><a href="javascript:modifyGoodsOnline(135,'offline')">下架</a><br>
									<a
									    href="javascript:showMemberDiscount(135)">设置会员折扣</a><br><a href="http://b2c.niuteam.cn/admin/goods/virtualGoodsList?goods_id=135" title="虚拟商品管理" target="_blank">虚拟商品管理</a></div>
							</td>
						</tr>
					</tbody>
				</table>
			</div>
			<input type="hidden" id="state" value="">
			<input type="hidden" id="selectGoodsLabelId">
			<input type="hidden" id="stock_warning" value="0">
		</div>
		<input type="hidden" id="hidden_sort_rule" class="">
	
	
		<div class="modal fade hide" id="batch_processing" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
	
			<div class="modal-dialog">
				<div class="modal-content">
					<div class="modal-header">
						<button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
						<h3>批量处理</h3>
					</div>
					<div class="modal-body">
						<div class="tip_info">
							<p>1、如果未设置任何选择，则商品保持原状不变。</p>
							<p>2、设置商品库存，将作用于所选商品的所有规格项。</p>
						</div>
						<div class="setting-item">
							<dl>
								<dt>商品分类</dt>
								<dd id="Js_goods_category">
									<div class="selectric-wrapper selectric-select-common selectric-middle" style="width: 150px;">
										<div class="selectric-hide-select"><select class="select-common middle" id="batch_catrgory_one" tabindex="-1">
									<option value="0">请选择一级分类</option>
																		<option value="3">养护设备</option>
																		<option value="4">工程设备</option>
																		<option value="5">环卫设备</option>
																		<option value="146">服装</option>
																		<option value="6">配件专区</option>
																		<option value="7">女鞋/箱包/钟表/珠宝</option>
																		<option value="8">男鞋/运动/户外</option>
																		<option value="2">混凝土设</option>
																		<option value="9">汽车/汽车用品</option>
																		<option value="10">母婴/玩具用品</option>
																		<option value="11">食品/酒类/生鲜/特产</option>
																</select></div>
										<div class="selectric"><span class="selectric-label">请选择一级分类</span><button class="selectric-button">▾</button></div>
										<div class="selectric-items" tabindex="-1">
											<div class="selectric-scroll">
												<ul>
													<li data-index="0" class="selected" title="请选择一级分类">请选择一级分类</li>
													<li data-index="1" class="" title="养护设备">养护设备</li>
													<li data-index="2" class="" title="工程设备">工程设备</li>
													<li data-index="3" class="" title="环卫设备">环卫设备</li>
													<li data-index="4" class="" title="服装">服装</li>
													<li data-index="5" class="" title="配件专区">配件专区</li>
													<li data-index="6" class="" title="女鞋/箱包/钟表/珠宝">女鞋/箱包/钟表/珠宝</li>
													<li data-index="7" class="" title="男鞋/运动/户外">男鞋/运动/户外</li>
													<li data-index="8" class="" title="混凝土设">混凝土设</li>
													<li data-index="9" class="" title="汽车/汽车用品">汽车/汽车用品</li>
													<li data-index="10" class="" title="母婴/玩具用品">母婴/玩具用品</li>
													<li data-index="11" class="last" title="食品/酒类/生鲜/特产">食品/酒类/生鲜/特产</li>
												</ul>
											</div>
										</div><input class="selectric-input" tabindex="0"></div>
									<div class="selectric-wrapper selectric-select-common selectric-middle" style="width: 150px;">
										<div class="selectric-hide-select"><select class="select-common middle" id="batch_catrgory_two" tabindex="-1">
									<option value="0">请选择二级分类</option>
								</select></div>
										<div class="selectric"><span class="selectric-label">请选择二级分类</span><button class="selectric-button">▾</button></div>
										<div class="selectric-items" tabindex="-1">
											<div class="selectric-scroll">
												<ul>
													<li data-index="0" class="last selected" title="请选择二级分类">请选择二级分类</li>
												</ul>
											</div>
										</div><input class="selectric-input" tabindex="0"></div>
									<div class="selectric-wrapper selectric-select-common selectric-middle" style="width: 150px;">
										<div class="selectric-hide-select"><select class="select-common middle" style="width: 150px;" id="batch_catrgory_three" tabindex="-1">
									<option value="0">请选择三级分类</option>	
								</select></div>
										<div class="selectric"><span class="selectric-label">请选择三级分类</span><button class="selectric-button">▾</button></div>
										<div class="selectric-items" tabindex="-1">
											<div class="selectric-scroll">
												<ul>
													<li data-index="0" class="last selected" title="请选择三级分类">请选择三级分类</li>
												</ul>
											</div>
										</div><input class="selectric-input" tabindex="0"></div>
								</dd>
							</dl>
							<dl>
								<dt>销售价:</dt>
								<dd id="price">
									<label>
									<i class="radio-common selected">
										<input type="radio" checked="" name="price" value="1">
									</i>
									<span>增加</span>
								</label>
									<label>
									<i class="radio-common">
										<input type="radio" name="price" value="0">
									</i>
									<span>减少</span>
								</label>
									<input type="number" name="" value="0" class="num input-common short" min="0">
									<span class="info">销售价增加N元或减少N元</span>
								</dd>
							</dl>
							<dl>
								<dt>市场价:</dt>
								<dd id="market_price">
									<label>
									<i class="radio-common selected">
										<input type="radio" checked="" name="market_price" value="1">
									</i>
									<span>增加</span>
								</label>
									<label>
									<i class="radio-common">
										<input type="radio" name="market_price" value="0">
									</i>
									<span>减少</span>
								</label>
									<input type="number" name="" value="0" class="num input-common short" min="0">
									<span class="info">市场价增加N元或减少N元</span>
								</dd>
							</dl>
							<dl>
								<dt>成本价:</dt>
								<dd id="cost_price">
									<label>
									<i class="radio-common selected">
										<input type="radio" checked="" name="cost_price" value="1">
									</i>
									<span>增加</span>
								</label>
									<label>
									<i class="radio-common">
										<input type="radio" name="cost_price" value="0">
									</i>
									<span>减少</span>
								</label>
									<input type="number" name="" value="0" class="num input-common short" min="0">
									<span class="info">成本价增加N元或减少N元</span>
								</dd>
							</dl>
							<dl>
								<dt>库存:</dt>
								<dd id="stock">
									<label>
									<i class="radio-common selected">
										<input type="radio" checked="" name="stock" value="1">
									</i>
									<span>增加</span>
								</label>
									<label>
									<i class="radio-common">
										<input type="radio" name="stock" value="0">
									</i>
									<span>减少</span>
								</label>
									<input type="number" name="" value="0" class="num input-common short" min="0">
									<span class="info">库存增加N件或减少N件</span>
								</dd>
							</dl>
							<dl>
								<dt>商品品牌:</dt>
								<dd id="stock" class="js-brand-block">
									<div>
										<select id="brand_id" style="display: none;" class="middle"><option value="0">请选择商品品牌</option><option value="2">小米</option><option value="4">索尼</option><option value="5">三星</option></select>
										<div tabindex="0" class="searchable-select"><span class="searchable-select-caret"></span>
											<div class="searchable-select-holder">请选择商品品牌</div>
											<div class="searchable-select-dropdown searchable-select-hide"><input type="text" class="searchable-select-input">
												<div class="searchable-scroll">
													<div class="searchable-has-privious searchable-select-hide">...</div>
													<div class="searchable-select-items">
														<div class="searchable-select-item selected hover" data-value="0">请选择商品品牌</div>
														<div class="searchable-select-item" data-value="2">小米</div>
														<div class="searchable-select-item" data-value="4">索尼</div>
														<div class="searchable-select-item" data-value="5">三星</div>
													</div>
													<div class="searchable-has-next searchable-select-hide">...</div>
												</div>
											</div>
										</div>
									</div>
								</dd>
							</dl>
						</div>
					</div>
	
					<div class="modal-footer">
						<button class="btn-common btn-big" onclick="save();">保存</button>
						<button class="btn-common-cancle btn-big" data-dismiss="modal">关闭</button>
					</div>
				</div>
			</div>
	
		</div>
	
	
		<div class="modal fade hide" id="set_member_discount" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
			<div class="modal-dialog">
				<div class="modal-content">
					<div class="modal-header">
						<button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
						<h3>设置商品折扣</h3>
					</div>
					<div class="modal-body" id="member_discount">
						<dl>
							<dt>黄金会员</dt>
							<dd>
								<input class="input-common harf" type="number" data-level-id="47" maxlength="3"><em class="unit">%</em>
							</dd>
						</dl>
						<dl>
							<dt>白银会员</dt>
							<dd>
								<input class="input-common harf" type="number" data-level-id="48" maxlength="3"><em class="unit">%</em>
							</dd>
						</dl>
						<dl>
							<dt>青铜会员</dt>
							<dd>
								<input class="input-common harf" type="number" data-level-id="49" maxlength="3"><em class="unit">%</em>
							</dd>
						</dl>
						<dl>
							<dt>钻石卡</dt>
							<dd>
								<input class="input-common harf" type="number" data-level-id="50" maxlength="3"><em class="unit">%</em>
							</dd>
						</dl>
						<dl>
							<dt>vip会员等级</dt>
							<dd>
								<input class="input-common harf" type="number" data-level-id="51" maxlength="3"><em class="unit">%</em>
							</dd>
						</dl>
						<dl>
							<dt>价格保留方式</dt>
							<dd>
								<label class="radio inline normal decimal_reservation_number">
								<i class="checkbox-common">
									<input type="checkbox" name="decimal-reservation-number" value="0">
								</i>
								<span>抹去角和分</span>
							</label>
								<label class="radio inline normal decimal_reservation_number">
								<i class="checkbox-common">
									<input type="checkbox" name="decimal-reservation-number" value="1">
								</i>
								<span>抹去分</span>
							</label>
							</dd>
						</dl>
					</div>
					<div class="modal-footer">
						<button class="btn-common btn-big" onclick="save_goods_discount();">保存</button>
						<button class="btn-common-cancle btn-big" data-dismiss="modal">关闭</button>
					</div>
				</div>
			</div>
		</div>
		<input type="hidden" id="curr_goods_id" class="">
	
	
		<div class="page" id="turn-ul" style="">
			<div class="pagination">
				<ul>
					<li class="according-number">每页显示<input type="text" class="input-medium" id="showNumber" value="14" data-default="14" autocomplete="off">条</li>
					<li><a id="beginPage" class="page-disable" style="border: 1px solid #dddddd;">首页</a></li>
					<li><a id="prevPage" class="page-disable">上一页</a></li>
					<li id="pageNumber"><a onclick="JumpForPage(this)" class="currentPage">1</a><a onclick="JumpForPage(this)">2</a><a onclick="JumpForPage(this)">3</a><a onclick="JumpForPage(this)">4</a><a onclick="JumpForPage(this)">5</a></li>
					<li id="JslastPage" style="display: inline-block;"><span class="ellipsis">···</span><a onclick="JumpForPage(this)">7</a></li>
					<li><a id="nextPage">下一页</a></li>
					<li><a id="lastPage">末页</a></li>
					<li class="total-data" data-total-count="88">共88条</li>
					<!-- <li class="page-count">共0页</li> -->
					<li class="according-number">
						跳<input type="text" class="input-medium" id="skipPage" data-curr-page="1">页
					</li>
				</ul>
			</div>
		</div>
		<input type="hidden" id="page_count" class="" value="7">
		<input type="hidden" id="page_size" class="" value="14">
	</div>

</section>
</template>

<script>
require("@/assets/style/table.scss");

export default {
  name: "goodsList",
  data: function() {
    return {
      goodsList: [],
      showCategory: false
    };
  },
  components: {}
};
</script>

<style lang="scss" scoped>
#productTbody {
  td {
    padding: 5px;
    font-size: 12px;
  }
  td:first-child {
    border-left: 1px solid #e1e6f0;
  }
  td:last-child {
    border-right: 1px solid #e1e6f0;
  }
  tr:last-child td {
    border-bottom: 1px solid #e1e6f0;
  }
}

.tr-title td {
  border-top: 1px solid #e1e6f0;
}
.a-pro-view-img {
  float: left;
}
.thumbnail-img {
  width: 60px;
  margin-right: 10px;
  height: 60px;
}
.cell i {
  display: block;
}
.remodal-bg.with-red-theme.remodal-is-opening,
.remodal-bg.with-red-theme.remodal-is-opened {
  filter: none;
}
.remodal-overlay.with-red-theme {
  background-color: #f44336;
}
.remodal.with-red-theme {
  background: #fff;
}
input[type="radio"],
input[type="checkbox"] {
  margin: -1px 5px 0 0;
}
.edit-group {
  border-bottom: 1px solid #ebebeb;
  margin-bottom: 10px;
  label {
    font-weight: normal;
  }
}
.edit-group-title {
  height: 15px;
  line-height: 15px;
  width: 140px;
  margin-top: 3px;
  margin-bottom: 3px;
  color: #126ae4;
}
.edit-group-button {
  border-color: #3283fa;
  border: 1px solid #bbb;
  height: 26px;
  line-height: 24px;
  padding: 0 5px;
}
.group-button-bg {
  background: #3283fa;
  color: #fff;
}
.div-pro-view-name {
  width: 100%;
  min-height: 60px;
}
i.hot,
i.recommend,
i.new {
  font-size: 12px;
  margin-right: 5px;
  font-style: normal;
  color: #fff;
  background-color: #ff6600;
  border-radius: 2px;
  padding: 1px 4px;
  position: relative;
  top: -5px;
}
.icon-qrcode:before {
  content: "\f029";
}
[class^="icon-"]:before,
[class*=" icon-"]:before {
  text-decoration: inherit;
  display: inline-block;
  speak: none;
}
[class^="icon-"],
[class*=" icon-"] {
  font-family: FontAwesome;
  font-weight: normal;
  font-style: normal;
  text-decoration: inherit;
  -webkit-font-smoothing: antialiased;
}

input[type="number"] {
  -moz-appearance: textfield;
}
input[type="number"]::-webkit-inner-spin-button,
input[type="number"]::-webkit-outer-spin-button {
  -webkit-appearance: none;
  margin: 0;
}
input,
textarea,
.uneditable-input {
  width: 147px;
}
.table th,
.table td {
  vertical-align: middle;
}
.recommendBox {
  width: 360px;
  display: inline-block;
  float: right;
}
.introduction_box {
  width: 360px;
  display: inline-block;
  float: right;
}
.tab-content {
  overflow: visible;
}
.editGoodsIntroduction {
  display: inline-block;
  border: 1px dashed #fff;
  padding: 0;
  width: 350px;
  line-height: 25px;
  max-height: 60px;
  overflow: hidden;
  text-overflow: ellipsis;
  height: 25px;
}
.editGoodsIntroduction:hover {
  border-color: #ddd;
  cursor: pointer;
}
.editGoodsIntroduction + input {
  display: inline-block;
  padding: 0 5px;
  width: 350px;
  line-height: 25px;
  height: 25px;
  background: #eef7ff;
  display: none;
  margin: 0 0 10px !important;
}
.editGoodsIntroduction > a {
  margin-left: 0 !important;
}
.goods-fields-sort {
  cursor: pointer;
  span {
    background: url("/public/admin/images/goods_sort.png") no-repeat;
    width: 20px;
    height: 20px;
    display: inline-block;
    margin-left: 5px;
    vertical-align: middle;
    position: absolute;
  }
  span.asc {
    background-position: 0 5px;
  }
  span.selected.asc {
    background-position: -30px 5px;
  }
  span.desc {
    background-position: 0 -24px;
  }
  span.selected.desc {
    background-position: -30px -24px;
  }
}

.more-search {
  line-height: 20px;
  background: #fff;
  outline: none;
}
.interval {
  width: 2px;
  display: inline-block;
}
.ns-main {
  margin-top: 0;
}

.btn-common-white,
.btn-common {
  outline: none;
  line-height: 20px;
  display: inline-block;
}

@media screen and (max-width: 1260px) {
  a.btn-common {
    margin-bottom: 5px !important;
  }
}

.goodsCategory {
  width: 148px;
  height: 300px;
  border: 1px solid #cccccc;
  position: absolute;
  z-index: 100;
  background: #fff;
  right: 0;
  display: none;
  overflow-y: auto;
  top: 31px;

  ul {
    height: 280px;
    margin-top: -2px;
    margin-left: 0;
    li {
      text-align: left;
      padding: 0 10px;
      line-height: 30px;
      i {
        float: right;
        line-height: 30px;
      }
      span {
        width: 110px;
        display: inline-block;
        white-space: nowrap;
        text-overflow: ellipsis;
        overflow: hidden;
        vertical-align: middle;
        font-size: 12px;
      }
    }

    li:hover {
      cursor: pointer;
    }
    li:hover,
    li.selected {
      background: #0059d6;
      color: #fff;
    }
  }
}
.goodsCategory::-webkit-scrollbar {
  width: 3px;
}
.goodsCategory::-webkit-scrollbar-track {
  -webkit-box-shadow: inset 0 0 6px rgba(0, 0, 0, 0.3);
  border-radius: 10px;
  background-color: #fff;
}
.goodsCategory::-webkit-scrollbar-thumb {
  height: 20px;
  border-radius: 10px;
  -webkit-box-shadow: inset 0 0 6px rgba(0, 0, 0, 0.3);
  background-color: #ccc;
}

.two {
  left: 150px;
  border-left: 0;
}
.three {
  left: 299px;
  width: 148px;
  border-left: 0;
}
.selectGoodsCategory {
  width: 218px;
  height: 45px;
  border: 1px solid #cccccc;
  position: absolute;
  z-index: 100;
  left: 0;
  margin-top: 299px;
  border-collapse: collapse;
  background: #fff;
  display: none;
}
.selectGoodsCategory a {
  display: block;
  height: 30px;
  width: 100px;
  text-align: center;
  color: #fff;
  line-height: 30px;
  margin: 8px;
  background: #126ae4;
  text-decoration: none;
}
</style>
