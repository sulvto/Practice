<template>
    
	<section class="ns-base-section" style="">
		
		
		<div style="position:relative;margin:0;">
			<!-- 面包屑导航 -->
						<div class="breadcrumb-nav">
				<a href="http://b2c.niuteam.cn/admin.html">单商户B2C</a>
									<i class="fa fa-angle-right"></i>
					<a href="http://b2c.niuteam.cn/admin/goods/goodslist.html">商品</a>
									<i class="fa fa-angle-right"></i>
					<!-- 需要加跳转链接用这个：http://b2c.niuteam.cn/admin/goods/addgoods -->
					<a href="javascript:;" style="color:#999;">商品发布</a>
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
									<p>相关教程：<a href="http://bbs.niushop.com.cn/forum.php?mod=viewthread&amp;tid=2302&amp;extra=page%3D3" target="_blank">http://bbs.niushop.com.cn/forum.php?mod=viewthread&amp;tid=2302&amp;extra=page%3D3</a></p>
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
<!-- 						<span>相关教程：<a href="http://bbs.niushop.com.cn/forum.php?mod=viewthread&tid=2302&extra=page%3D3" target="_blank">http://bbs.niushop.com.cn/forum.php?mod=viewthread&tid=2302&extra=page%3D3</a></span> -->
<!-- 						 -->
<!-- 					{1/block} -->
				</h4>
			</div>
		</div>
		
		
		<div class="ns-main" style="">
			
<input type="hidden" value="" id="goodsstate" class="">
<div class="space-10"></div>
<div class="ncsc-form-goods" style="">
	<nav class="goods-nav" style="max-width: 1184px;">
		<ul>
			<li class="selected" data-c="block-basic-setting"><a href="javascript:;">基础设置</a></li>
			<!-- 如果不是虚拟商品点卡才可编辑商品规格 -->
			<li data-c="block-goods-type"><a href="javascript:;">商品属性</a></li>
						<li data-c="block-goods-sku"><a href="javascript:;">商品规格</a></li>
						
			
			<li data-c="block-photo-video-setting"><a href="javascript:;">媒体设置</a></li>
			<li data-c="block-goods-detail-setting"><a href="javascript:;">商品详情</a></li>
			<li data-c="block-template-setting"><a href="javascript:;">模板设置</a></li>
		</ul>
	</nav>
	<!-- 基础设置 -->
	<div class="block-basic-setting">
		<h4>商品类型</h4>
		<dl>
			<dd class="goods_type_select">
									<span class="goods_type_item selected" data-goods-type="1">
						<p class="type_name">实物商品</p>
						<p class="type_desc">（物流发货）</p>
						<i class="selected-icon"></i>
						<input type="radio" name="goods_type" value="1" checked="checked">
					</span>
										<span class="goods_type_item" data-goods-type="0">
						<p class="type_name">网上服务</p>
						<p class="type_desc">（虚拟商品）</p>
						<i class="selected-icon"></i>
						<input type="radio" name="virtual_goods_type" value="1">
					</span>
										<span class="goods_type_item" data-goods-type="0">
						<p class="type_name">网盘下载</p>
						<p class="type_desc">（虚拟商品）</p>
						<i class="selected-icon"></i>
						<input type="radio" name="virtual_goods_type" value="2">
					</span>
										<span class="goods_type_item" data-goods-type="0">
						<p class="type_name">点卡</p>
						<p class="type_desc">（虚拟商品）</p>
						<i class="selected-icon"></i>
						<input type="radio" name="virtual_goods_type" value="3">
					</span>
										<span class="goods_type_item" data-goods-type="0">
						<p class="type_name">网站下载</p>
						<p class="type_desc">（虚拟商品）</p>
						<i class="selected-icon"></i>
						<input type="radio" name="virtual_goods_type" value="4">
					</span>
								</dd>
		</dl>
		<h4>基础信息</h4>
		<dl>
			<dt><i class="required">*</i>商品名称：</dt>
			<dd>
				<input class="productname input-common long" type="text" id="txtProductTitle" placeholder="请输入商品名称，不能超过60个字符" oninput="if(value.length>60){value=value.slice(0,60);$(this).next().text(&quot;商品名称不能超过60个字符&quot;).show();}else{$(this).next().hide();}">
				<span class="help-inline">请填写商品名称</span>
			</dd>
		</dl>
		<dl>
			<dt><i class="required">*</i>商品分类：</dt>
						<dd id="tbcNameCategory" data-flag="category" data-goods-id="0" cid="" data-attr-id="" cname="">
				<span class="category-text"></span>
							<button class="category-button">选择</button>
				<span><label for="g_name" class="error"><i class="icon-exclamation-sign"></i>商品分类不能为空</label></span>
				<span class="help-inline">请选择商品分类</span>
			</dd>
		</dl>
		<dl>
			<dt>扩展分类：</dt>
			<dd id="extend_name_category_box">
									<div class="extend-name-category-box"></div>
								<div class="clear">
					<button class="select-button" onclick="addExtentCategoryBox();"><i class="fa fa-plus-square"></i>&nbsp;添加</button>
				</div>
			</dd>
		</dl>
		
				
		<dl class="js-virtual-goods-cloud-download-resources">
			<dt>网盘地址：</dt>
			<dd>
				<input id="cloud_address" type="text" class="input-common long" placeholder="请输入网盘地址">
			</dd>
		</dl>
		
		<dl class="js-virtual-goods-cloud-download-resources">
			<dt>网盘密码：</dt>
			<dd>
				<input id="cloud_password" type="text" class="input-common" placeholder="请输入网盘密码">
			</dd>
		</dl>
		
		<dl class="js-virtual-goods-site-directly-download-resources">
			<dt>上传文件：</dt>
			<dd>
				<div class="upload-btn-common">
					<div>
						<input class="input-file" name="file_upload" id="uploadDownloadResources" type="file" onchange="imgUpload(this);" title="上传" only-type=".zip">
						<input type="hidden" id="download_resources" value="">
					</div>
					<input type="text" id="text_download_resources" class="input-common" readonly="readonly" value="">
					<em style="top:1px;">上传</em>
				</div>
				<p class="hint">上传附件类型必须是<i class="important-note">zip</i>格式</p>
			</dd>
		</dl>
		
		<dl class="js-virtual-goods-site-directly-download-resources">
			<dt>解压密码：</dt>
			<dd>
				<input id="unzip_password" type="text" class="input-common" placeholder="请输入解压密码">
			</dd>
		</dl>
		
		<dl class="js-virtual-goods-point-card-inventory">
			<dt>卡密库存：</dt>
			<dd>
				<span>0件</span>
			</dd>
		</dl>
		<dl class="js-virtual-goods-point-card-inventory">
			<dt>添加卡密：</dt>
			<dd>
				<span style="font-weight: bold;color: #FF5722;">导入格式为卡号+空格+密码(可跟上附加内容)，一行一组，如AAAAA BBBBB</span><br>
				<textarea class="input-common long" id="card_password"></textarea>
			</dd>
		</dl>
		<dl class="js-virtual-goods-type-block">
			<dt>有效期/天：</dt>
			<dd>
				<input id="validity_period" type="text" placeholder="请输入有效期" class="input-common harf"><em class="unit">天</em>
				<p class="hint notice">输入0表示不限制</p>
			</dd>
		</dl>
		
		<dl class="js-virtual-goods-type-block">
			<dt>限制使用次数：</dt>
			<dd>
				<span class="js-confine_use_number" style="color: #FF5722;font-weight: bold;">1次</span>
			</dd>
		</dl>
				
		<dl>
			<dt>商品促销语：</dt>
			<dd>
				<input class="productname input-common long" type="text" id="txtIntroduction" placeholder="请输入促销语，不能超过100个字符" oninput="if(value.length>100){value=value.slice(0,100);$(this).next().text(&quot;促销语不能超过100个字符&quot;).show();}else{$(this).next().hide();}">
				<span class="help-inline">请输入商品促销语，不能超过100个字符</span>
			</dd>
		</dl>
		<dl>
			<dt>关键词：</dt>
			<dd>
				<input class="productname input-common" type="text" id="txtKeyWords" placeholder="商品关键词用于SEO搜索" oninput="if(value.length>40){value=value.slice(0,40);$(this).next().text(&quot;商品关键词不能超过40个字符&quot;).show();}">
				<span class="help-inline">请输入商品促销语，不能超过40个字符</span>
			</dd>
		</dl>
		<dl>
			<dt>商品单位：</dt>
			<dd>
				<input class="productname input-common" type="text" id="goodsUnit" placeholder="请输入商品单位" oninput="if(value.length>10){value=value.slice(0,10);$(this).next().text(&quot;商品单位不能超过10个字符&quot;).show();}">
				<span class="help-inline">请输入商品单位，不能超过10个字符</span>
			</dd>
		</dl>
		<dl>
			<dt>商品标签：</dt>
			<dd>
				<div class="group-text-check-box">
					<div class="controls product-category-position">
														<div class="selectric-wrapper selectric-select-common" style="width: 250px;"><div class="selectric-hide-select"><select class="select-common" multiple="" id="goods_group" size="1" tabindex="-1">
									<option value="0" disabled="">请选择商品标签</option>	
																			<option value="1">热卖</option>
																			<option value="2">活动</option>
																			<option value="3">新品lll</option>
																			<option value="5">网红</option>
																			<option value="6">最火热</option>
																	</select></div><div class="selectric"><span class="selectric-label">请选择商品标签</span><button class="selectric-button">▾</button></div><div class="selectric-items" tabindex="-1"><div class="selectric-scroll"><ul><li data-index="0" class="disabled" title="请选择商品标签">请选择商品标签</li><li data-index="1" class="" title="热卖">热卖</li><li data-index="2" class="" title="活动">活动</li><li data-index="3" class="" title="新品lll">新品lll</li><li data-index="4" class="" title="网红">网红</li><li data-index="5" class="last" title="最火热">最火热</li></ul></div></div><input class="selectric-input" tabindex="0"></div>
												</div>
				</div>
			</dd>
		</dl>
		<dl style="overflow: inherit;">
			<dt>商品品牌：</dt>
			<dd class="js-brand-block">
				<div class="controls brand-controls">
					<select id="brand_id" class="select-common-ajax" style="display: none;"><option value="0">请选择商品品牌</option><option value="2">小米</option><option value="4">索尼</option><option value="5">三星</option></select><div tabindex="0" class="searchable-select"><span class="searchable-select-caret"></span><div class="searchable-select-holder">请选择商品品牌</div><div class="searchable-select-dropdown searchable-select-hide"><input type="text" class="searchable-select-input"><div class="searchable-scroll"><div class="searchable-has-privious searchable-select-hide">...</div><div class="searchable-select-items"><div class="searchable-select-item selected hover" data-value="0">请选择商品品牌</div><div class="searchable-select-item" data-value="2">小米</div><div class="searchable-select-item" data-value="4">索尼</div><div class="searchable-select-item" data-value="5">三星</div></div><div class="searchable-has-next searchable-select-hide">...</div></div></div></div>
					<input type="text" id="selected_brand_name" style="padding:0;margin:0;opacity: 0;position: absolute;">
					<p class="hint">可输入品牌名或品牌首字母来搜索品牌</p>
				</div>
			</dd>
		</dl>
		<dl>
			<dt>供货商：</dt>
			<dd>
				<div class="selectric-wrapper selectric-select-common" style="width: 250px;"><div class="selectric-hide-select"><select id="supplierSelect" class="select-common" tabindex="-1">
					<option value="0">请选择供货商</option>
											<option value="1">小米供货商</option>
											<option value="2">三星供货商</option>
									</select></div><div class="selectric"><span class="selectric-label">请选择供货商</span><button class="selectric-button">▾</button></div><div class="selectric-items" tabindex="-1"><div class="selectric-scroll"><ul><li data-index="0" class="selected" title="请选择供货商">请选择供货商</li><li data-index="1" class="" title="小米供货商">小米供货商</li><li data-index="2" class="last" title="三星供货商">三星供货商</li></ul></div></div><input class="selectric-input" tabindex="0"></div>
				<span class="help-inline">请选择供货商</span>
			</dd>
		</dl>
		<dl>
			<dt>基础销量：</dt>
			<dd>
				<input type="number" class="span1 input-common harf" id="BasicSales" placeholder="0"><em class="unit">件</em>
				<span class="help-inline">基础销量必须是数字，且不能为负数</span>
			</dd>
		</dl>
		<dl>
			<dt>基础点击数：</dt>
			<dd>
				<input type="number" class="span1 input-common harf" id="BasicPraise" placeholder="0"><em class="unit">次</em>
				<span class="help-inline">基础点击数必须是数字，且不能为负数</span>
			</dd>
		</dl>
		<dl>
			<dt>基础分享数：</dt>
			<dd>
				<input type="number" class="span1 input-common harf" id="BasicShare" placeholder="0"><em class="unit">次</em>
				<span class="help-inline">基础分享数必须是数字，且不能为负数</span>
			</dd>
		</dl>
		<dl>
			<dt>商家编码：</dt>
			<dd>
				<input type="text" class="input-common" id="txtProductCodeA" placeholder="请输入商家编码">
				<span class="help-inline">请输入商家编码，不能超过40个字符</span>
			</dd>
		</dl>
		<dl>
			<dt>生产日期：</dt>
			<dd>
				<input type="text" class="input-common" id="production_date" onclick="WdatePicker()">
			</dd>
		</dl>
		<dl>
			<dt>保质期天数：</dt>
			<dd>
				<input type="number" class="goods-stock input-common harf" id="shelf_life" value="0"><em class="unit">天</em>
				<span class="help-inline">请输入保质期天数，必须是整数</span>
			</dd>
		</dl>

		<dl>
			<dt><i class="required">*</i>总库存：</dt>
			<dd>
				<input type="number" class="goods-stock input-common harf" id="txtProductCount" min="0" value="0"><em class="unit">件</em>
				<span class="help-inline">请输入总库存数量，必须是大于0的整数</span>
			</dd>
		</dl>
		<dl>
			<dt><i class="required">*</i>库存预警：</dt>
			<dd>
				<input type="number" class="goods-stock input-common harf" id="txtMinStockLaram" min="0" value="0"><em class="unit">件</em>
				<span class="help-inline">请输入库存预警数，必须是大于0的整数</span>
				<p class="hint">设置最低库存预警值。当库存低于预警值时商家中心商品列表页库存列红字提醒。<br>0为不预警。</p>
			</dd>
		</dl>

		<dl>
			<dt><i class="required">*</i>库存显示：</dt>
			<dd>
				<div class="controls">
											<label class="radio inline normal">
							<i class="radio-common selected">
								<input type="radio" name="stock" checked="checked" value="1">
							</i>
							<span>是</span>
						</label>
						<label class="radio inline normal">
							<i class="radio-common">
								<input type="radio" name="stock" value="0">
							</i>
							<span>否</span>
						</label>
										<span class="help-inline">请选择库存是否显示</span>
				</div>
			</dd>
		</dl>
		<dl>
			<dt><i class="required">*</i>是否上架：</dt>
			<dd>
				<div class="controls">
											<label class="radio inline normal">
							<i class="radio-common selected">
								<input type="radio" name="shelves" value="1" checked="checked">
							</i>
							<span>立刻上架</span>
						</label>
						<label class="radio inline normal">
							<i class="radio-common">
								<input type="radio" name="shelves" value="0">
							</i>
							<span>放入仓库</span>
						</label>
									</div>
			</dd>
		</dl>
		<dl>
			<dt>商品所在地：</dt>
			<dd>
				<div class="selectric-wrapper selectric-select-common selectric-middle" style="width: 150px;"><div class="selectric-hide-select"><select id="provinceSelect" class="select-common middle" onchange="getProvince(this,'#citySelect',-1)" tabindex="-1"><option value="0">请选择省</option><option value="34">台湾省</option><option value="19">广东省</option><option value="20">广西壮族自治区</option><option value="21">海南省</option><option value="22">重庆市</option><option value="23">四川省</option><option value="24">贵州省</option><option value="25">云南省</option><option value="26">西藏自治区</option><option value="27">陕西省</option><option value="28">甘肃省</option><option value="29">青海省</option><option value="30">宁夏回族自治区</option><option value="31">新疆维吾尔自治区</option><option value="32">香港特别行政区</option><option value="33">澳门特别行政区</option><option value="18">湖南省</option><option value="17">湖北省</option><option value="2">天津市</option><option value="3">河北省</option><option value="4">山西省</option><option value="5">内蒙古自治区</option><option value="6">辽宁省</option><option value="7">吉林省</option><option value="8">黑龙江省</option><option value="9">上海市</option><option value="10">江苏省</option><option value="11">浙江省</option><option value="12">安徽省</option><option value="13">福建省</option><option value="14">江西省</option><option value="15">山东省</option><option value="16">河南省</option><option value="1">北京市</option></select></div><div class="selectric"><span class="selectric-label">请选择省</span><button class="selectric-button">▾</button></div><div class="selectric-items" tabindex="-1"><div class="selectric-scroll"><ul><li data-index="0" class="selected" title="请选择省">请选择省</li><li data-index="1" class="" title="台湾省">台湾省</li><li data-index="2" class="" title="广东省">广东省</li><li data-index="3" class="" title="广西壮族自治区">广西壮族自治区</li><li data-index="4" class="" title="海南省">海南省</li><li data-index="5" class="" title="重庆市">重庆市</li><li data-index="6" class="" title="四川省">四川省</li><li data-index="7" class="" title="贵州省">贵州省</li><li data-index="8" class="" title="云南省">云南省</li><li data-index="9" class="" title="西藏自治区">西藏自治区</li><li data-index="10" class="" title="陕西省">陕西省</li><li data-index="11" class="" title="甘肃省">甘肃省</li><li data-index="12" class="" title="青海省">青海省</li><li data-index="13" class="" title="宁夏回族自治区">宁夏回族自治区</li><li data-index="14" class="" title="新疆维吾尔自治区">新疆维吾尔自治区</li><li data-index="15" class="" title="香港特别行政区">香港特别行政区</li><li data-index="16" class="" title="澳门特别行政区">澳门特别行政区</li><li data-index="17" class="" title="湖南省">湖南省</li><li data-index="18" class="" title="湖北省">湖北省</li><li data-index="19" class="" title="天津市">天津市</li><li data-index="20" class="" title="河北省">河北省</li><li data-index="21" class="" title="山西省">山西省</li><li data-index="22" class="" title="内蒙古自治区">内蒙古自治区</li><li data-index="23" class="" title="辽宁省">辽宁省</li><li data-index="24" class="" title="吉林省">吉林省</li><li data-index="25" class="" title="黑龙江省">黑龙江省</li><li data-index="26" class="" title="上海市">上海市</li><li data-index="27" class="" title="江苏省">江苏省</li><li data-index="28" class="" title="浙江省">浙江省</li><li data-index="29" class="" title="安徽省">安徽省</li><li data-index="30" class="" title="福建省">福建省</li><li data-index="31" class="" title="江西省">江西省</li><li data-index="32" class="" title="山东省">山东省</li><li data-index="33" class="" title="河南省">河南省</li><li data-index="34" class="last" title="北京市">北京市</li></ul></div></div><input class="selectric-input" tabindex="0"></div>
				<div class="selectric-wrapper selectric-select-common selectric-middle" style="width: 150px;"><div class="selectric-hide-select"><select id="citySelect" class="select-common middle" tabindex="-1">
					<option value="0">请选择市</option>
				</select></div><div class="selectric"><span class="selectric-label">请选择市</span><button class="selectric-button">▾</button></div><div class="selectric-items" tabindex="-1"><div class="selectric-scroll"><ul><li data-index="0" class="last selected" title="请选择市">请选择市</li></ul></div></div><input class="selectric-input" tabindex="0"></div>
			</dd>
		</dl>
		
		<h4>购买信息</h4>
		
		<dl>
			<dt>市场价格：</dt>
			<dd>
				<input class="goods_price input-common harf" type="number" id="txtProductMarketPrice" min="0" placeholder="0.00"><em class="unit">元</em>
				<span class="help-inline">商品市场价格必须是数字，且不能为负数</span>
			</dd>
		</dl>
		<dl>
			<dt><i class="required">*</i>销售价格：</dt>
			<dd>
				<input class="goods_price input-common harf" type="number" id="txtProductSalePrice" min="0" placeholder="0.00"><em class="unit">元</em>
				<span class="help-inline">商品销售价不能为空，且不能为负数</span>
			</dd>
		</dl>
		<dl>
			<dt>成本价格：</dt>
			<dd>
				<input class="goods_price input-common harf" type="number" id="txtProductCostPrice" min="0" placeholder="0.00"><em class="unit">元</em>
				<span class="help-inline">商品成本必须是数字，且不能为负数</span>
			</dd>
		</dl>
		
		<dl>
			<dt>阶梯优惠：</dt>
			<dd>
				<p class="hint notice">设置商品阶梯优惠，当购买数量达到所设数量时，商品单价 = 商品销售价 - 优惠价格</p>
				<div class="ladder_preference_content">
					<div>
						<span class="label-title">数量</span><span class="label-title" style="margin-left: 30px;">优惠价格</span>
					</div>
										<div id="ladder_preference"></div>
				</div>
				<div class="add_ladder_preference"><i class="fa fa-plus" aria-hidden="true"></i></div>
			</dd>
		</dl>
		<dl>
			<dt><i class="required">*</i>运费：</dt>
			<dd>
				<div class="controls">
				
											<label class="radio inline normal">
							<i class="radio-common selected">
								<input type="radio" name="fare" value="0" checked="checked">
							</i>
							<span>免邮</span>
						</label>
						<label class="radio inline normal">
							<i class="radio-common">
								<input type="radio" name="fare" value="1">
							</i>
							<span>买家承担运费</span>
						</label>
										<span class="help-inline">请选择运费类型</span>
				</div>
			</dd>
		</dl>
		
				<dl id="valuation-method" style="display: none" class="">
			<dt><i class="required">*</i>计价方式：</dt>
			<dd>
				<label class="radio inline normal">
					<i class="radio-common selected">
						<input type="radio" name="shipping_fee_type" value="3" checked="checked">
					</i>
					<span>计件</span>
				</label>
				<label class="radio inline normal">
					<i class="radio-common">
						<input type="radio" name="shipping_fee_type" value="2">
					</i>
					<span>体积</span>
				</label>
				<label class="radio inline normal">
					<i class="radio-common">
						<input type="radio" name="shipping_fee_type" value="1">
					</i>
					<span>重量</span>
				</label>
			</dd>
		</dl>
		<dl id="commodity-weight" style="display: none" class="">
			<dt><i class="required">*</i>商品重量：</dt>
			<dd>
				<input type="number" class="goods-stock input-common harf" id="goods_weight" min="0" value="0"><em class="unit">公斤</em>
				<span class="help-inline">商品重量必须大于0</span>
			</dd>
		</dl>
		<dl id="commodity-volume" style="display: none" class="">
			<dt><i class="required">*</i>商品体积：</dt>
			<dd>
				<input type="number" class="goods-stock input-common harf" id="goods_volume" min="0" value="0"><em class="unit">立方米</em>
				<span class="help-inline">商品体积必须大于0</span>
			</dd>
		</dl>
		<dl id="express_Company" style="display: none;" class="">
			<dt>物流公司：</dt>
			<dd>
				<div class="selectric-wrapper selectric-select-common" style="width: 250px;"><div class="selectric-hide-select"><select id="expressCompany" class="select-common" tabindex="-1">
					<option value="0">请选择物流公司</option>
										<option value="4">顺丰</option>
										<option value="5">cccc</option>
										<option value="6">中通快递</option>
									</select></div><div class="selectric"><span class="selectric-label">请选择物流公司</span><button class="selectric-button">▾</button></div><div class="selectric-items" tabindex="-1"><div class="selectric-scroll"><ul><li data-index="0" class="selected" title="请选择物流公司">请选择物流公司</li><li data-index="1" class="" title="顺丰">顺丰</li><li data-index="2" class="" title="cccc">cccc</li><li data-index="3" class="last" title="中通快递">中通快递</li></ul></div></div><input class="selectric-input" tabindex="0"></div>
			</dd>
		</dl>
				
		<dl>
			<dt>每人限购：</dt>
			<dd>
				<div class="controls">
					<input type="number" class="input-mini input-common harf" min="0" placeholder="0" id="PurchaseSum"><em class="unit">件</em>
					<p class="hint notice">输入0表示不限购</p>
				</div>
			</dd>
		</dl>
		<dl>
			<dt>最少购买数：</dt>
			<dd>
				<div class="controls">
					<input type="number" class="input-mini input-common harf" min="1" placeholder="0" id="minBuy"><em class="unit">件</em>
					<span class="help-inline">最少购买数必须是大于0的整数</span>
				</div>
			</dd>
		</dl>
		<!-- 预售设置 -->
		<div id="presell_set">
		<h4>预售设置</h4>
<dl>
	<dt>是否支持预售：</dt>
	<dd>
		<label class="radio inline normal">
			<i class="radio-common "><input type="radio" name="open_presell" value="1"></i>
			<span>是</span>
		</label>
		<label class="radio inline normal">
			<i class="radio-common selected">
				<input type="radio" name="open_presell" value="0" checked="checked">
			</i>
			<span>否</span>
		</label>
	</dd>
	
	
</dl>
<dl class="presell hide">
	<dt>预售金额：</dt>
	<dd>
		<input class="goods_price input-common harf" type="number" id="presell_price" min="0" placeholder="0.00" value=""><em class="add-on">元</em>
		<span class="help-inline">预售金额必须是数字，且不能为负数</span>
	</dd>
	
</dl>
<dl class="presell hide">
	<dt>预售发货方式：</dt>
	<dd>
		<label class="radio inline normal">
			<i class="radio-common "><input type="radio" name="presell_delivery_type" value="1"></i>
			<span>按照预售发货时间</span>
		</label>
		<label class="radio inline normal">
			<i class="radio-common selected">
				<input type="radio" name="presell_delivery_type" value="2">
			</i>
			<span>按照预售发货天数</span>
		</label>
	</dd>
	
</dl>
<dl class="presell hide">
	<dt>预售发货时间：</dt>
	<dd>
		<input type="text" class="input-common" id="presell_time" value="" onclick="WdatePicker({dateFmt: 'yyyy-MM-dd HH:mm:ss',minDate: '%y-%M-#{%d+1}' })">&nbsp;开始发货
	</dd>
</dl>
<dl class="presell hide">
	<dt>预售发货时间：</dt>
	<dd>
		付款成功&nbsp;<input type="number" value="" class="span1 input-common short" id="presell_day" placeholder="0">&nbsp;天后发货
	</dd>
</dl>
		</div>
		<h4>积分设置</h4>
		<dl id="integral_balance">
			<dt>最大可使用积分：</dt>
			<dd>
				<input type="number" class="input-common harf" id="max_use_point" value="" onchange="integrationChange(this);"><em class="unit">分</em>
				<p class="hint">设置购买时积分抵现最大可使用积分数，0为不可使用 </p>
			</dd>
		</dl>
		<dl>
			<dt>积分兑换设置：</dt>
			<dd>
				<label class="radio inline normal">
					<i class="radio-common selected">
						<input type="radio" name="integralSelect" checked="" value="0">
					</i>
					<span>非积分兑换</span>
				</label>
				<label class="radio inline normal">
					<i class="radio-common ">
						<input type="radio" name="integralSelect" value="1">
					</i>
					<span>积分加现金购买</span>
				</label>
				<label class="radio inline normal">
					<i class="radio-common ">
						<input type="radio" name="integralSelect" value="2">
					</i>
					<span>积分兑换或直接购买</span>
				</label>
					<label class="radio inline normal">
					<i class="radio-common ">
						<input type="radio" name="integralSelect" value="3">
					</i>
					<span>只支持积分兑换</span>
				</label>
			</dd>
		</dl>
		<dl>
			<dt>兑换所需积分：</dt>
			<dd>
				<input type="number" class="input-common harf" id="integration_available_use" value="0" onchange="integrationChange(this);"><em class="unit">分</em>
				<span class="help-inline">请设置积分</span>
			</dd>
		</dl>
		<dl>
			<dt>购买可赠送：</dt>
			<dd>
				<div class="controls">
					<input id="integration_available_give" class="input-mini input-common harf" placeholder="0" min="0" type="number" onchange="integrationChange(this);" value="0"><em class="unit">分</em>
				</div>
			</dd>
		</dl>
					<h4>折扣设置</h4>
							<dl>
					<dt>黄金会员：</dt>
					<dd>
						<div class="controls">
							<input class="input-common harf" name="member_discount" placeholder="0" min="0" type="number" value="" data-level-id="47"><em class="unit">%</em>
						</div>
					</dd>
				</dl>
							<dl>
					<dt>白银会员：</dt>
					<dd>
						<div class="controls">
							<input class="input-common harf" name="member_discount" placeholder="0" min="0" type="number" value="" data-level-id="48"><em class="unit">%</em>
						</div>
					</dd>
				</dl>
							<dl>
					<dt>青铜会员：</dt>
					<dd>
						<div class="controls">
							<input class="input-common harf" name="member_discount" placeholder="0" min="0" type="number" value="" data-level-id="49"><em class="unit">%</em>
						</div>
					</dd>
				</dl>
							<dl>
					<dt>钻石卡：</dt>
					<dd>
						<div class="controls">
							<input class="input-common harf" name="member_discount" placeholder="0" min="0" type="number" value="" data-level-id="50"><em class="unit">%</em>
						</div>
					</dd>
				</dl>
							<dl>
					<dt>vip会员等级：</dt>
					<dd>
						<div class="controls">
							<input class="input-common harf" name="member_discount" placeholder="0" min="0" type="number" value="" data-level-id="51"><em class="unit">%</em>
						</div>
					</dd>
				</dl>
						<dl>
				<dt>价格保留方式：</dt>
				<dd>
					<label class="radio inline normal decimal_reservation_number">
						<i class="checkbox-common ">
							<input type="checkbox" name="decimal-reservation-number" value="0">
						</i>
						<span>抹去角和分</span>
					</label>
					<label class="radio inline normal decimal_reservation_number">
						<i class="checkbox-common ">
							<input type="checkbox" name="decimal-reservation-number" value="1">
						</i>
						<span>抹去分</span>
					</label>
				</dd>
			</dl>
			</div>
	
	<!-- 商品规格 -->
	<div class="block-goods-sku">
		<nav>
			<button class="btn-common-white js-open-edit-sku-popup">编辑规格</button>
			<button class="btn-common-white js-clear-goods-sku">清空规格</button>
		</nav>
		<div style="padding:10px;line-height: 30px;display: none;">
			<table class="goods-sku js-goods-sku"></table>
		</div>
		
		<div class="volume-set-sku-info">
			<span>批量设置：</span>
			<a href="javascript:;" data-tag="sku-price">销售价格</a>
			<a href="javascript:;" data-tag="market-price">市场价格</a>
			<a href="javascript:;" data-tag="cost-price">成本价格</a>
			<a href="javascript:;" data-tag="stock-num">库存</a>
			<input type="text" class="input-common middle">
			<button class="btn-common">确定</button>
			<button class="btn-common-cancle">取消</button>
		</div>
		
		<div class="goods-sku-list">
			<table class="table-class">
				<colgroup>
					<col width="50%">
					<col width="10%">
					<col width="10%">
					<col width="10%">
					<col width="10%">
					<col width="10%">
				</colgroup>
				<thead>
					<tr>
						<th align="left">商品规格</th>
						<th>
							<span>销售价格</span>
<!-- 							<input type="text" class="input-common short" /> -->
<!-- 							<a href="javascript:;" style="float:right;">编辑</a> -->
						</th>
						<th>
							<span>市场价格</span>
<!-- 							<a href="javascript:;" style="float:right;">编辑</a> -->
						</th>
						<th>
							<span>成本价格</span>
<!-- 							<a href="javascript:;" style="float:right;">编辑</a> -->
						</th>
						<th>
							<span>库存</span>
<!-- 							<a href="javascript:;" style="float:right;">编辑</a> -->
						</th>
						<th>
							<span>商家编码</span>
<!-- 							<a href="javascript:;" style="float:right;">编辑</a> -->
						</th>
					</tr>
				</thead>
				<tbody></tbody>
			</table>
		</div>
		
	</div>
	
	<div class="block-goods-type">
		
		<h4>基础信息</h4>
		
		<dl>
			<dt>商品类型：</dt>
			<dd>
				<div class="selectric-wrapper selectric-select-common" style="width: 250px;"><div class="selectric-hide-select"><select id="goodsType" class="select-common" tabindex="-1">
					<option value="0">请选择商品类型</option>
											<option value="16">美体专区</option>
												<option value="17">铁皮石斛</option>
												<option value="18">闲逛逛</option>
										</select></div><div class="selectric"><span class="selectric-label">请选择商品类型</span><button class="selectric-button">▾</button></div><div class="selectric-items" tabindex="-1"><div class="selectric-scroll"><ul><li data-index="0" class="selected" title="请选择商品类型">请选择商品类型</li><li data-index="1" class="" title="美体专区">美体专区</li><li data-index="2" class="" title="铁皮石斛">铁皮石斛</li><li data-index="3" class="last" title="闲逛逛">闲逛逛</li></ul></div></div><input class="selectric-input" tabindex="0"></div>
				<span class="help-inline">请选择商品类型</span>
			</dd>
		</dl>
		<h4 style="display:none;" class="js-goods-attribute-block">商品属性：</h4>
		<div class="goods-sku-attribute-block js-goods-attribute-block">
			<table class="goods-sku-attribute js-goods-sku-attribute"></table>
		</div>
	</div>
	
	<!-- 图片视频设置 -->
	<div class="block-photo-video-setting">
		
		<div class="goods-photos">
			<h4>商品图片</h4>
			<dl>
				<dt>图片上传：</dt>
				<dd>
<!-- 			（第一张图片将作为商品主图，支持同时上传多张图片,多张图片之间可随意调整位置；支持jpg、gif、png格式上传或从图片空间中选择，建议使用尺寸800x800像素以上、大小不超过1M的正方形图片，上传后的图片将会自动保存在图片空间的默认分类中。） -->
					
					<div id="goods_picture_box" class="controls">
						<div class="goodspic-uplaod">
							<div class="img-box" style="min-height:160px;">
																<div class="upload-thumb" id="default_uploadimg">
									<img src="/public/admin/images/album/default_goods_image_240.gif">
								</div>
															</div>
							<div class="clear"></div>
							<span class="img-error">最少需要一张图片作为商品主图</span>
							<p class="hint">第一张图片将作为商品主图,支持同时上传多张图片,多张图片之间可随意调整位置；支持jpg、gif、png格式上传或从图片空间中选择，建议使用尺寸800x800像素以上、大小不超过1M的正方形图片，上传后的图片将会自动保存在图片空间的默认分类中。</p>
							<div class="handle" style="margin-top: 5px;">
								<div class="ncsc-upload-btn" style="margin-left:0;">
									<a href="javascript:void(0);">
										<span>
											<input style="cursor:pointer;font-size:0;" type="file" id="fileupload" hidefocus="true" class="input-file" name="file_upload" multiple="multiple">
										</span>
										<p>图片上传</p>
									</a>
								</div>
								<a class="ncsc-btn mt5" id="img_box" nctype="show_image" href="javascript:void(0);">从图片空间选择</a>
							</div>
						</div>
					</div>
					<span class="help-inline">最少需要一张图片作为商品主图</span>
				</dd>
			</dl>
		</div>
		
		<div class="goods-video">
			<h4>展示视频</h4>
			<dl>
				<dt>视频上传：</dt>
				<dd style="padding:0;">
					<div class="goodspic-uplaod" style="overflow: hidden;position:relative;">
				
						<div class="video-thumb">
															<video id="my-video" class="video-js vjs-big-play-centered" controls="" poster="/public/static/blue/img/goods_video_upload_bg.png" preload="auto">
									<p class="vjs-no-js">To view this video please enable JavaScript, and consider upgrading to a web browser that</p>
								</video>
								<span class="del-video hide" onclick="del_video()"></span>
													</div>
						<input class="input-file" name="file_upload" id="videoupload" type="file" onchange="fileUpload_video(this);" title="视频上传" style="position: absolute;left: 0;width: 290px;height: 140px;opacity: 0;cursor: pointer;z-index:10;">
					</div>
				</dd>
			</dl>
			
			<dl>
				<dt>输入网址：</dt>
				<dd>
					<input type="text" id="video_url" class="input-common" style="width: 290px !important;" placeholder="在此输入外链视频地址">
					<span style="display: block;margin-top: 5px;">注意事项：</span>
					<ul style="color:#FF6600;">
						<li>1、检查upload文件夹是否有读写权限。</li>
						<li>2、PHP默认上传限制为2MB，需要在php.ini配置文件中修改“post_max_size”和“upload_max_filesize”的大小。</li>
						<li>3、视频支持手动输入外链视频地址或者上传本地视频文件</li>
						<li>4、必须上传.mp4视频格式</li>
						<li>5、视频文件大小不能超过500MB</li>
					</ul>
				</dd>
			</dl>
		</div>
		
		<div class="goods-sku-picture">
			<h4>规格图片</h4>
			<dl class="sku-picture-dl">
				<dt>规格名列表：</dt>
				<dd>
					<div class="sku-picture-div"></div>
				</dd>
			</dl>
			<dl class="sku-picture-dl-box">
				<dt>规格值列表：</dt>
				<dd>
					<div class="sku-picture-box"></div>
				</dd>
			</dl>
		</div>
	
<input type="hidden" id="album_id" value="30">

	</div>
	
	<!-- 详情设置 -->
	<div class="block-goods-detail-setting" style="">
	
		<div class="controls" id="discripContainer" style="">
			<textarea id="tareaProductDiscrip" name="discripArea" style="height: 500px; width: 800px; display: none;"></textarea>
			<div style="width: 100%;" id="editor" class="edui-default"><div id="edui1" class="edui-editor  edui-default" style="width: 100%; z-index: 999;"><div id="edui1_toolbarbox" class="edui-editor-toolbarbox edui-default"><div id="edui1_toolbarboxouter" class="edui-editor-toolbarboxouter edui-default"><div class="edui-editor-toolbarboxinner edui-default"><div id="edui2" class="edui-toolbar   edui-default" onselectstart="return false;" onmousedown="return $EDITORUI[&quot;edui2&quot;]._onMouseDown(event, this);" style="user-select: none;"><div id="edui107" class="edui-box edui-button edui-for-fullscreen edui-default"><div id="edui107_state" onmousedown="$EDITORUI[&quot;edui107&quot;].Stateful_onMouseDown(event, this);" onmouseup="$EDITORUI[&quot;edui107&quot;].Stateful_onMouseUp(event, this);" onmouseover="$EDITORUI[&quot;edui107&quot;].Stateful_onMouseOver(event, this);" onmouseout="$EDITORUI[&quot;edui107&quot;].Stateful_onMouseOut(event, this);" class="edui-default"><div class="edui-button-wrap edui-default"><div id="edui107_body" unselectable="on" title="全屏" class="edui-button-body edui-default" onmousedown="return $EDITORUI[&quot;edui107&quot;]._onMouseDown(event, this);" onclick="return $EDITORUI[&quot;edui107&quot;]._onClick(event, this);"><div class="edui-box edui-icon edui-default"></div><div class="edui-box edui-label edui-default"></div></div></div></div></div><div id="edui3" class="edui-box edui-button edui-for-source edui-default"><div id="edui3_state" onmousedown="$EDITORUI[&quot;edui3&quot;].Stateful_onMouseDown(event, this);" onmouseup="$EDITORUI[&quot;edui3&quot;].Stateful_onMouseUp(event, this);" onmouseover="$EDITORUI[&quot;edui3&quot;].Stateful_onMouseOver(event, this);" onmouseout="$EDITORUI[&quot;edui3&quot;].Stateful_onMouseOut(event, this);" class="edui-default"><div class="edui-button-wrap edui-default"><div id="edui3_body" unselectable="on" title="源代码" class="edui-button-body edui-default" onmousedown="return $EDITORUI[&quot;edui3&quot;]._onMouseDown(event, this);" onclick="return $EDITORUI[&quot;edui3&quot;]._onClick(event, this);"><div class="edui-box edui-icon edui-default"></div></div></div></div></div><div id="edui4" class="edui-box edui-button edui-for-bold edui-default"><div id="edui4_state" onmousedown="$EDITORUI[&quot;edui4&quot;].Stateful_onMouseDown(event, this);" onmouseup="$EDITORUI[&quot;edui4&quot;].Stateful_onMouseUp(event, this);" onmouseover="$EDITORUI[&quot;edui4&quot;].Stateful_onMouseOver(event, this);" onmouseout="$EDITORUI[&quot;edui4&quot;].Stateful_onMouseOut(event, this);" class="edui-default"><div class="edui-button-wrap edui-default"><div id="edui4_body" unselectable="on" title="加粗" class="edui-button-body edui-default" onmousedown="return $EDITORUI[&quot;edui4&quot;]._onMouseDown(event, this);" onclick="return $EDITORUI[&quot;edui4&quot;]._onClick(event, this);"><div class="edui-box edui-icon edui-default"></div></div></div></div></div><div id="edui5" class="edui-box edui-button edui-for-italic edui-default"><div id="edui5_state" onmousedown="$EDITORUI[&quot;edui5&quot;].Stateful_onMouseDown(event, this);" onmouseup="$EDITORUI[&quot;edui5&quot;].Stateful_onMouseUp(event, this);" onmouseover="$EDITORUI[&quot;edui5&quot;].Stateful_onMouseOver(event, this);" onmouseout="$EDITORUI[&quot;edui5&quot;].Stateful_onMouseOut(event, this);" class="edui-default"><div class="edui-button-wrap edui-default"><div id="edui5_body" unselectable="on" title="斜体" class="edui-button-body edui-default" onmousedown="return $EDITORUI[&quot;edui5&quot;]._onMouseDown(event, this);" onclick="return $EDITORUI[&quot;edui5&quot;]._onClick(event, this);"><div class="edui-box edui-icon edui-default"></div></div></div></div></div><div id="edui6" class="edui-box edui-button edui-for-underline edui-default"><div id="edui6_state" onmousedown="$EDITORUI[&quot;edui6&quot;].Stateful_onMouseDown(event, this);" onmouseup="$EDITORUI[&quot;edui6&quot;].Stateful_onMouseUp(event, this);" onmouseover="$EDITORUI[&quot;edui6&quot;].Stateful_onMouseOver(event, this);" onmouseout="$EDITORUI[&quot;edui6&quot;].Stateful_onMouseOut(event, this);" class="edui-default"><div class="edui-button-wrap edui-default"><div id="edui6_body" unselectable="on" title="下划线" class="edui-button-body edui-default" onmousedown="return $EDITORUI[&quot;edui6&quot;]._onMouseDown(event, this);" onclick="return $EDITORUI[&quot;edui6&quot;]._onClick(event, this);"><div class="edui-box edui-icon edui-default"></div></div></div></div></div><div id="edui7" class="edui-box edui-button edui-for-strikethrough edui-default"><div id="edui7_state" onmousedown="$EDITORUI[&quot;edui7&quot;].Stateful_onMouseDown(event, this);" onmouseup="$EDITORUI[&quot;edui7&quot;].Stateful_onMouseUp(event, this);" onmouseover="$EDITORUI[&quot;edui7&quot;].Stateful_onMouseOver(event, this);" onmouseout="$EDITORUI[&quot;edui7&quot;].Stateful_onMouseOut(event, this);" class="edui-default"><div class="edui-button-wrap edui-default"><div id="edui7_body" unselectable="on" title="删除线" class="edui-button-body edui-default" onmousedown="return $EDITORUI[&quot;edui7&quot;]._onMouseDown(event, this);" onclick="return $EDITORUI[&quot;edui7&quot;]._onClick(event, this);"><div class="edui-box edui-icon edui-default"></div></div></div></div></div><div id="edui8" class="edui-box edui-splitbutton edui-for-forecolor edui-default edui-colorbutton"><div title="字体颜色" id="edui8_state" onmousedown="$EDITORUI[&quot;edui8&quot;].Stateful_onMouseDown(event, this);" onmouseup="$EDITORUI[&quot;edui8&quot;].Stateful_onMouseUp(event, this);" onmouseover="$EDITORUI[&quot;edui8&quot;].Stateful_onMouseOver(event, this);" onmouseout="$EDITORUI[&quot;edui8&quot;].Stateful_onMouseOut(event, this);" class="edui-default"><div class="edui-splitbutton-body edui-default"><div id="edui8_button_body" class="edui-box edui-button-body edui-default" onclick="$EDITORUI[&quot;edui8&quot;]._onButtonClick(event, this);"><div class="edui-box edui-icon edui-default"></div><div id="edui8_colorlump" class="edui-colorlump"></div></div><div class="edui-box edui-splitborder edui-default"></div><div class="edui-box edui-arrow edui-default" onclick="$EDITORUI[&quot;edui8&quot;]._onArrowClick();"></div></div></div></div><div id="edui11" class="edui-box edui-splitbutton edui-for-backcolor edui-default edui-colorbutton"><div title="背景色" id="edui11_state" onmousedown="$EDITORUI[&quot;edui11&quot;].Stateful_onMouseDown(event, this);" onmouseup="$EDITORUI[&quot;edui11&quot;].Stateful_onMouseUp(event, this);" onmouseover="$EDITORUI[&quot;edui11&quot;].Stateful_onMouseOver(event, this);" onmouseout="$EDITORUI[&quot;edui11&quot;].Stateful_onMouseOut(event, this);" class="edui-default"><div class="edui-splitbutton-body edui-default"><div id="edui11_button_body" class="edui-box edui-button-body edui-default" onclick="$EDITORUI[&quot;edui11&quot;]._onButtonClick(event, this);"><div class="edui-box edui-icon edui-default"></div><div id="edui11_colorlump" class="edui-colorlump"></div></div><div class="edui-box edui-splitborder edui-default"></div><div class="edui-box edui-arrow edui-default" onclick="$EDITORUI[&quot;edui11&quot;]._onArrowClick();"></div></div></div></div><div id="edui14" class="edui-box edui-combox edui-for-fontfamily edui-default"><div title="字体" id="edui14_state" onmousedown="$EDITORUI[&quot;edui14&quot;].Stateful_onMouseDown(event, this);" onmouseup="$EDITORUI[&quot;edui14&quot;].Stateful_onMouseUp(event, this);" onmouseover="$EDITORUI[&quot;edui14&quot;].Stateful_onMouseOver(event, this);" onmouseout="$EDITORUI[&quot;edui14&quot;].Stateful_onMouseOut(event, this);" class="edui-default"><div class="edui-combox-body edui-default"><div id="edui14_button_body" class="edui-box edui-button-body edui-default" onclick="$EDITORUI[&quot;edui14&quot;]._onButtonClick(event, this);">字体</div><div class="edui-box edui-splitborder edui-default"></div><div class="edui-box edui-arrow edui-default" onclick="$EDITORUI[&quot;edui14&quot;]._onArrowClick();"></div></div></div></div><div id="edui27" class="edui-box edui-combox edui-for-fontsize edui-default"><div title="字号" id="edui27_state" onmousedown="$EDITORUI[&quot;edui27&quot;].Stateful_onMouseDown(event, this);" onmouseup="$EDITORUI[&quot;edui27&quot;].Stateful_onMouseUp(event, this);" onmouseover="$EDITORUI[&quot;edui27&quot;].Stateful_onMouseOver(event, this);" onmouseout="$EDITORUI[&quot;edui27&quot;].Stateful_onMouseOut(event, this);" class="edui-default"><div class="edui-combox-body edui-default"><div id="edui27_button_body" class="edui-box edui-button-body edui-default" onclick="$EDITORUI[&quot;edui27&quot;]._onButtonClick(event, this);">字号</div><div class="edui-box edui-splitborder edui-default"></div><div class="edui-box edui-arrow edui-default" onclick="$EDITORUI[&quot;edui27&quot;]._onArrowClick();"></div></div></div></div><div id="edui38" class="edui-box edui-combox edui-for-paragraph edui-default"><div title="段落格式" id="edui38_state" onmousedown="$EDITORUI[&quot;edui38&quot;].Stateful_onMouseDown(event, this);" onmouseup="$EDITORUI[&quot;edui38&quot;].Stateful_onMouseUp(event, this);" onmouseover="$EDITORUI[&quot;edui38&quot;].Stateful_onMouseOver(event, this);" onmouseout="$EDITORUI[&quot;edui38&quot;].Stateful_onMouseOut(event, this);" class="edui-default"><div class="edui-combox-body edui-default"><div id="edui38_button_body" class="edui-box edui-button-body edui-default" onclick="$EDITORUI[&quot;edui38&quot;]._onButtonClick(event, this);">段落格式</div><div class="edui-box edui-splitborder edui-default"></div><div class="edui-box edui-arrow edui-default" onclick="$EDITORUI[&quot;edui38&quot;]._onArrowClick();"></div></div></div></div><div id="edui47" class="edui-box edui-button edui-for-justifyleft edui-default"><div id="edui47_state" onmousedown="$EDITORUI[&quot;edui47&quot;].Stateful_onMouseDown(event, this);" onmouseup="$EDITORUI[&quot;edui47&quot;].Stateful_onMouseUp(event, this);" onmouseover="$EDITORUI[&quot;edui47&quot;].Stateful_onMouseOver(event, this);" onmouseout="$EDITORUI[&quot;edui47&quot;].Stateful_onMouseOut(event, this);" class="edui-default"><div class="edui-button-wrap edui-default"><div id="edui47_body" unselectable="on" title="居左对齐" class="edui-button-body edui-default" onmousedown="return $EDITORUI[&quot;edui47&quot;]._onMouseDown(event, this);" onclick="return $EDITORUI[&quot;edui47&quot;]._onClick(event, this);"><div class="edui-box edui-icon edui-default"></div><div class="edui-box edui-label edui-default"></div></div></div></div></div><div id="edui48" class="edui-box edui-button edui-for-justifycenter edui-default"><div id="edui48_state" onmousedown="$EDITORUI[&quot;edui48&quot;].Stateful_onMouseDown(event, this);" onmouseup="$EDITORUI[&quot;edui48&quot;].Stateful_onMouseUp(event, this);" onmouseover="$EDITORUI[&quot;edui48&quot;].Stateful_onMouseOver(event, this);" onmouseout="$EDITORUI[&quot;edui48&quot;].Stateful_onMouseOut(event, this);" class="edui-default"><div class="edui-button-wrap edui-default"><div id="edui48_body" unselectable="on" title="居中对齐" class="edui-button-body edui-default" onmousedown="return $EDITORUI[&quot;edui48&quot;]._onMouseDown(event, this);" onclick="return $EDITORUI[&quot;edui48&quot;]._onClick(event, this);"><div class="edui-box edui-icon edui-default"></div><div class="edui-box edui-label edui-default"></div></div></div></div></div><div id="edui49" class="edui-box edui-button edui-for-justifyright edui-default"><div id="edui49_state" onmousedown="$EDITORUI[&quot;edui49&quot;].Stateful_onMouseDown(event, this);" onmouseup="$EDITORUI[&quot;edui49&quot;].Stateful_onMouseUp(event, this);" onmouseover="$EDITORUI[&quot;edui49&quot;].Stateful_onMouseOver(event, this);" onmouseout="$EDITORUI[&quot;edui49&quot;].Stateful_onMouseOut(event, this);" class="edui-default"><div class="edui-button-wrap edui-default"><div id="edui49_body" unselectable="on" title="居右对齐" class="edui-button-body edui-default" onmousedown="return $EDITORUI[&quot;edui49&quot;]._onMouseDown(event, this);" onclick="return $EDITORUI[&quot;edui49&quot;]._onClick(event, this);"><div class="edui-box edui-icon edui-default"></div><div class="edui-box edui-label edui-default"></div></div></div></div></div><div id="edui50" class="edui-box edui-button edui-for-superscript edui-default"><div id="edui50_state" onmousedown="$EDITORUI[&quot;edui50&quot;].Stateful_onMouseDown(event, this);" onmouseup="$EDITORUI[&quot;edui50&quot;].Stateful_onMouseUp(event, this);" onmouseover="$EDITORUI[&quot;edui50&quot;].Stateful_onMouseOver(event, this);" onmouseout="$EDITORUI[&quot;edui50&quot;].Stateful_onMouseOut(event, this);" class="edui-default"><div class="edui-button-wrap edui-default"><div id="edui50_body" unselectable="on" title="上标" class="edui-button-body edui-default" onmousedown="return $EDITORUI[&quot;edui50&quot;]._onMouseDown(event, this);" onclick="return $EDITORUI[&quot;edui50&quot;]._onClick(event, this);"><div class="edui-box edui-icon edui-default"></div></div></div></div></div><div id="edui51" class="edui-box edui-button edui-for-blockquote edui-default"><div id="edui51_state" onmousedown="$EDITORUI[&quot;edui51&quot;].Stateful_onMouseDown(event, this);" onmouseup="$EDITORUI[&quot;edui51&quot;].Stateful_onMouseUp(event, this);" onmouseover="$EDITORUI[&quot;edui51&quot;].Stateful_onMouseOver(event, this);" onmouseout="$EDITORUI[&quot;edui51&quot;].Stateful_onMouseOut(event, this);" class="edui-default"><div class="edui-button-wrap edui-default"><div id="edui51_body" unselectable="on" title="引用" class="edui-button-body edui-default" onmousedown="return $EDITORUI[&quot;edui51&quot;]._onMouseDown(event, this);" onclick="return $EDITORUI[&quot;edui51&quot;]._onClick(event, this);"><div class="edui-box edui-icon edui-default"></div></div></div></div></div><div id="edui52" class="edui-box edui-button edui-for-selectall edui-default"><div id="edui52_state" onmousedown="$EDITORUI[&quot;edui52&quot;].Stateful_onMouseDown(event, this);" onmouseup="$EDITORUI[&quot;edui52&quot;].Stateful_onMouseUp(event, this);" onmouseover="$EDITORUI[&quot;edui52&quot;].Stateful_onMouseOver(event, this);" onmouseout="$EDITORUI[&quot;edui52&quot;].Stateful_onMouseOut(event, this);" class="edui-default"><div class="edui-button-wrap edui-default"><div id="edui52_body" unselectable="on" title="全选" class="edui-button-body edui-default" onmousedown="return $EDITORUI[&quot;edui52&quot;]._onMouseDown(event, this);" onclick="return $EDITORUI[&quot;edui52&quot;]._onClick(event, this);"><div class="edui-box edui-icon edui-default"></div></div></div></div></div><div id="edui57" class="edui-box edui-button edui-for-preview edui-default"><div id="edui57_state" onmousedown="$EDITORUI[&quot;edui57&quot;].Stateful_onMouseDown(event, this);" onmouseup="$EDITORUI[&quot;edui57&quot;].Stateful_onMouseUp(event, this);" onmouseover="$EDITORUI[&quot;edui57&quot;].Stateful_onMouseOver(event, this);" onmouseout="$EDITORUI[&quot;edui57&quot;].Stateful_onMouseOut(event, this);" class="edui-default"><div class="edui-button-wrap edui-default"><div id="edui57_body" unselectable="on" title="预览" class="edui-button-body edui-default" onmousedown="return $EDITORUI[&quot;edui57&quot;]._onMouseDown(event, this);" onclick="return $EDITORUI[&quot;edui57&quot;]._onClick(event, this);"><div class="edui-box edui-icon edui-default"></div><div class="edui-box edui-label edui-default"></div></div></div></div></div><div id="edui58" class="edui-box edui-button edui-for-removeformat edui-default"><div id="edui58_state" onmousedown="$EDITORUI[&quot;edui58&quot;].Stateful_onMouseDown(event, this);" onmouseup="$EDITORUI[&quot;edui58&quot;].Stateful_onMouseUp(event, this);" onmouseover="$EDITORUI[&quot;edui58&quot;].Stateful_onMouseOver(event, this);" onmouseout="$EDITORUI[&quot;edui58&quot;].Stateful_onMouseOut(event, this);" class="edui-default"><div class="edui-button-wrap edui-default"><div id="edui58_body" unselectable="on" title="清除格式" class="edui-button-body edui-default" onmousedown="return $EDITORUI[&quot;edui58&quot;]._onMouseDown(event, this);" onclick="return $EDITORUI[&quot;edui58&quot;]._onClick(event, this);"><div class="edui-box edui-icon edui-default"></div></div></div></div></div><div id="edui59" class="edui-box edui-splitbutton edui-for-inserttable edui-default"><div title="插入表格" id="edui59_state" onmousedown="$EDITORUI[&quot;edui59&quot;].Stateful_onMouseDown(event, this);" onmouseup="$EDITORUI[&quot;edui59&quot;].Stateful_onMouseUp(event, this);" onmouseover="$EDITORUI[&quot;edui59&quot;].Stateful_onMouseOver(event, this);" onmouseout="$EDITORUI[&quot;edui59&quot;].Stateful_onMouseOut(event, this);" class="edui-default"><div class="edui-splitbutton-body edui-default"><div id="edui59_button_body" class="edui-box edui-button-body edui-default" onclick="$EDITORUI[&quot;edui59&quot;]._onButtonClick(event, this);"><div class="edui-box edui-icon edui-default"></div></div><div class="edui-box edui-splitborder edui-default"></div><div class="edui-box edui-arrow edui-default" onclick="$EDITORUI[&quot;edui59&quot;]._onArrowClick();"></div></div></div></div><div id="edui62" class="edui-box edui-button edui-for-unlink edui-default"><div id="edui62_state" onmousedown="$EDITORUI[&quot;edui62&quot;].Stateful_onMouseDown(event, this);" onmouseup="$EDITORUI[&quot;edui62&quot;].Stateful_onMouseUp(event, this);" onmouseover="$EDITORUI[&quot;edui62&quot;].Stateful_onMouseOver(event, this);" onmouseout="$EDITORUI[&quot;edui62&quot;].Stateful_onMouseOut(event, this);" class="edui-default"><div class="edui-button-wrap edui-default"><div id="edui62_body" unselectable="on" title="取消链接" class="edui-button-body edui-default" onmousedown="return $EDITORUI[&quot;edui62&quot;]._onMouseDown(event, this);" onclick="return $EDITORUI[&quot;edui62&quot;]._onClick(event, this);"><div class="edui-box edui-icon edui-default"></div></div></div></div></div><div id="edui63" class="edui-box edui-button edui-for-insertrow edui-default"><div id="edui63_state" onmousedown="$EDITORUI[&quot;edui63&quot;].Stateful_onMouseDown(event, this);" onmouseup="$EDITORUI[&quot;edui63&quot;].Stateful_onMouseUp(event, this);" onmouseover="$EDITORUI[&quot;edui63&quot;].Stateful_onMouseOver(event, this);" onmouseout="$EDITORUI[&quot;edui63&quot;].Stateful_onMouseOut(event, this);" class="edui-default"><div class="edui-button-wrap edui-default"><div id="edui63_body" unselectable="on" title="前插入行" class="edui-button-body edui-default" onmousedown="return $EDITORUI[&quot;edui63&quot;]._onMouseDown(event, this);" onclick="return $EDITORUI[&quot;edui63&quot;]._onClick(event, this);"><div class="edui-box edui-icon edui-default"></div></div></div></div></div><div id="edui64" class="edui-box edui-button edui-for-insertcol edui-default"><div id="edui64_state" onmousedown="$EDITORUI[&quot;edui64&quot;].Stateful_onMouseDown(event, this);" onmouseup="$EDITORUI[&quot;edui64&quot;].Stateful_onMouseUp(event, this);" onmouseover="$EDITORUI[&quot;edui64&quot;].Stateful_onMouseOver(event, this);" onmouseout="$EDITORUI[&quot;edui64&quot;].Stateful_onMouseOut(event, this);" class="edui-default"><div class="edui-button-wrap edui-default"><div id="edui64_body" unselectable="on" title="前插入列" class="edui-button-body edui-default" onmousedown="return $EDITORUI[&quot;edui64&quot;]._onMouseDown(event, this);" onclick="return $EDITORUI[&quot;edui64&quot;]._onClick(event, this);"><div class="edui-box edui-icon edui-default"></div></div></div></div></div><div id="edui65" class="edui-box edui-button edui-for-mergeright edui-default"><div id="edui65_state" onmousedown="$EDITORUI[&quot;edui65&quot;].Stateful_onMouseDown(event, this);" onmouseup="$EDITORUI[&quot;edui65&quot;].Stateful_onMouseUp(event, this);" onmouseover="$EDITORUI[&quot;edui65&quot;].Stateful_onMouseOver(event, this);" onmouseout="$EDITORUI[&quot;edui65&quot;].Stateful_onMouseOut(event, this);" class="edui-default"><div class="edui-button-wrap edui-default"><div id="edui65_body" unselectable="on" title="右合并单元格" class="edui-button-body edui-default" onmousedown="return $EDITORUI[&quot;edui65&quot;]._onMouseDown(event, this);" onclick="return $EDITORUI[&quot;edui65&quot;]._onClick(event, this);"><div class="edui-box edui-icon edui-default"></div></div></div></div></div><div id="edui66" class="edui-box edui-button edui-for-mergedown edui-default"><div id="edui66_state" onmousedown="$EDITORUI[&quot;edui66&quot;].Stateful_onMouseDown(event, this);" onmouseup="$EDITORUI[&quot;edui66&quot;].Stateful_onMouseUp(event, this);" onmouseover="$EDITORUI[&quot;edui66&quot;].Stateful_onMouseOver(event, this);" onmouseout="$EDITORUI[&quot;edui66&quot;].Stateful_onMouseOut(event, this);" class="edui-default"><div class="edui-button-wrap edui-default"><div id="edui66_body" unselectable="on" title="下合并单元格" class="edui-button-body edui-default" onmousedown="return $EDITORUI[&quot;edui66&quot;]._onMouseDown(event, this);" onclick="return $EDITORUI[&quot;edui66&quot;]._onClick(event, this);"><div class="edui-box edui-icon edui-default"></div></div></div></div></div><div id="edui67" class="edui-box edui-button edui-for-deleterow edui-default"><div id="edui67_state" onmousedown="$EDITORUI[&quot;edui67&quot;].Stateful_onMouseDown(event, this);" onmouseup="$EDITORUI[&quot;edui67&quot;].Stateful_onMouseUp(event, this);" onmouseover="$EDITORUI[&quot;edui67&quot;].Stateful_onMouseOver(event, this);" onmouseout="$EDITORUI[&quot;edui67&quot;].Stateful_onMouseOut(event, this);" class="edui-default"><div class="edui-button-wrap edui-default"><div id="edui67_body" unselectable="on" title="删除行" class="edui-button-body edui-default" onmousedown="return $EDITORUI[&quot;edui67&quot;]._onMouseDown(event, this);" onclick="return $EDITORUI[&quot;edui67&quot;]._onClick(event, this);"><div class="edui-box edui-icon edui-default"></div></div></div></div></div><div id="edui68" class="edui-box edui-button edui-for-deletecol edui-default"><div id="edui68_state" onmousedown="$EDITORUI[&quot;edui68&quot;].Stateful_onMouseDown(event, this);" onmouseup="$EDITORUI[&quot;edui68&quot;].Stateful_onMouseUp(event, this);" onmouseover="$EDITORUI[&quot;edui68&quot;].Stateful_onMouseOver(event, this);" onmouseout="$EDITORUI[&quot;edui68&quot;].Stateful_onMouseOut(event, this);" class="edui-default"><div class="edui-button-wrap edui-default"><div id="edui68_body" unselectable="on" title="删除列" class="edui-button-body edui-default" onmousedown="return $EDITORUI[&quot;edui68&quot;]._onMouseDown(event, this);" onclick="return $EDITORUI[&quot;edui68&quot;]._onClick(event, this);"><div class="edui-box edui-icon edui-default"></div></div></div></div></div><div id="edui69" class="edui-box edui-button edui-for-splittorows edui-default"><div id="edui69_state" onmousedown="$EDITORUI[&quot;edui69&quot;].Stateful_onMouseDown(event, this);" onmouseup="$EDITORUI[&quot;edui69&quot;].Stateful_onMouseUp(event, this);" onmouseover="$EDITORUI[&quot;edui69&quot;].Stateful_onMouseOver(event, this);" onmouseout="$EDITORUI[&quot;edui69&quot;].Stateful_onMouseOut(event, this);" class="edui-default"><div class="edui-button-wrap edui-default"><div id="edui69_body" unselectable="on" title="拆分成行" class="edui-button-body edui-default" onmousedown="return $EDITORUI[&quot;edui69&quot;]._onMouseDown(event, this);" onclick="return $EDITORUI[&quot;edui69&quot;]._onClick(event, this);"><div class="edui-box edui-icon edui-default"></div></div></div></div></div><div id="edui70" class="edui-box edui-button edui-for-splittocols edui-default"><div id="edui70_state" onmousedown="$EDITORUI[&quot;edui70&quot;].Stateful_onMouseDown(event, this);" onmouseup="$EDITORUI[&quot;edui70&quot;].Stateful_onMouseUp(event, this);" onmouseover="$EDITORUI[&quot;edui70&quot;].Stateful_onMouseOver(event, this);" onmouseout="$EDITORUI[&quot;edui70&quot;].Stateful_onMouseOut(event, this);" class="edui-default"><div class="edui-button-wrap edui-default"><div id="edui70_body" unselectable="on" title="拆分成列" class="edui-button-body edui-default" onmousedown="return $EDITORUI[&quot;edui70&quot;]._onMouseDown(event, this);" onclick="return $EDITORUI[&quot;edui70&quot;]._onClick(event, this);"><div class="edui-box edui-icon edui-default"></div></div></div></div></div><div id="edui71" class="edui-box edui-button edui-for-splittocells edui-default"><div id="edui71_state" onmousedown="$EDITORUI[&quot;edui71&quot;].Stateful_onMouseDown(event, this);" onmouseup="$EDITORUI[&quot;edui71&quot;].Stateful_onMouseUp(event, this);" onmouseover="$EDITORUI[&quot;edui71&quot;].Stateful_onMouseOver(event, this);" onmouseout="$EDITORUI[&quot;edui71&quot;].Stateful_onMouseOut(event, this);" class="edui-default"><div class="edui-button-wrap edui-default"><div id="edui71_body" unselectable="on" title="完全拆分单元格" class="edui-button-body edui-default" onmousedown="return $EDITORUI[&quot;edui71&quot;]._onMouseDown(event, this);" onclick="return $EDITORUI[&quot;edui71&quot;]._onClick(event, this);"><div class="edui-box edui-icon edui-default"></div></div></div></div></div><div id="edui72" class="edui-box edui-button edui-for-mergecells edui-default"><div id="edui72_state" onmousedown="$EDITORUI[&quot;edui72&quot;].Stateful_onMouseDown(event, this);" onmouseup="$EDITORUI[&quot;edui72&quot;].Stateful_onMouseUp(event, this);" onmouseover="$EDITORUI[&quot;edui72&quot;].Stateful_onMouseOver(event, this);" onmouseout="$EDITORUI[&quot;edui72&quot;].Stateful_onMouseOut(event, this);" class="edui-default"><div class="edui-button-wrap edui-default"><div id="edui72_body" unselectable="on" title="合并多个单元格" class="edui-button-body edui-default" onmousedown="return $EDITORUI[&quot;edui72&quot;]._onMouseDown(event, this);" onclick="return $EDITORUI[&quot;edui72&quot;]._onClick(event, this);"><div class="edui-box edui-icon edui-default"></div></div></div></div></div><div id="edui73" class="edui-box edui-button edui-for-deletetable edui-default"><div id="edui73_state" onmousedown="$EDITORUI[&quot;edui73&quot;].Stateful_onMouseDown(event, this);" onmouseup="$EDITORUI[&quot;edui73&quot;].Stateful_onMouseUp(event, this);" onmouseover="$EDITORUI[&quot;edui73&quot;].Stateful_onMouseOver(event, this);" onmouseout="$EDITORUI[&quot;edui73&quot;].Stateful_onMouseOut(event, this);" class="edui-default"><div class="edui-button-wrap edui-default"><div id="edui73_body" unselectable="on" title="删除表格" class="edui-button-body edui-default" onmousedown="return $EDITORUI[&quot;edui73&quot;]._onMouseDown(event, this);" onclick="return $EDITORUI[&quot;edui73&quot;]._onClick(event, this);"><div class="edui-box edui-icon edui-default"></div></div></div></div></div><div id="edui74" class="edui-box edui-button edui-for-cleardoc edui-default"><div id="edui74_state" onmousedown="$EDITORUI[&quot;edui74&quot;].Stateful_onMouseDown(event, this);" onmouseup="$EDITORUI[&quot;edui74&quot;].Stateful_onMouseUp(event, this);" onmouseover="$EDITORUI[&quot;edui74&quot;].Stateful_onMouseOver(event, this);" onmouseout="$EDITORUI[&quot;edui74&quot;].Stateful_onMouseOut(event, this);" class="edui-default"><div class="edui-button-wrap edui-default"><div id="edui74_body" unselectable="on" title="清空文档" class="edui-button-body edui-default" onmousedown="return $EDITORUI[&quot;edui74&quot;]._onMouseDown(event, this);" onclick="return $EDITORUI[&quot;edui74&quot;]._onClick(event, this);"><div class="edui-box edui-icon edui-default"></div><div class="edui-box edui-label edui-default"></div></div></div></div></div><div id="edui79" class="edui-box edui-button edui-for-link edui-default"><div id="edui79_state" onmousedown="$EDITORUI[&quot;edui79&quot;].Stateful_onMouseDown(event, this);" onmouseup="$EDITORUI[&quot;edui79&quot;].Stateful_onMouseUp(event, this);" onmouseover="$EDITORUI[&quot;edui79&quot;].Stateful_onMouseOver(event, this);" onmouseout="$EDITORUI[&quot;edui79&quot;].Stateful_onMouseOut(event, this);" class="edui-default"><div class="edui-button-wrap edui-default"><div id="edui79_body" unselectable="on" title="超链接" class="edui-button-body edui-default" onmousedown="return $EDITORUI[&quot;edui79&quot;]._onMouseDown(event, this);" onclick="return $EDITORUI[&quot;edui79&quot;]._onClick(event, this);"><div class="edui-box edui-icon edui-default"></div><div class="edui-box edui-label edui-default"></div></div></div></div></div><div id="edui80" class="edui-box edui-splitbutton edui-for-emotion edui-default"><div title="表情" id="edui80_state" onmousedown="$EDITORUI[&quot;edui80&quot;].Stateful_onMouseDown(event, this);" onmouseup="$EDITORUI[&quot;edui80&quot;].Stateful_onMouseUp(event, this);" onmouseover="$EDITORUI[&quot;edui80&quot;].Stateful_onMouseOver(event, this);" onmouseout="$EDITORUI[&quot;edui80&quot;].Stateful_onMouseOut(event, this);" class="edui-default"><div class="edui-splitbutton-body edui-default"><div id="edui80_button_body" class="edui-box edui-button-body edui-default" onclick="$EDITORUI[&quot;edui80&quot;]._onButtonClick(event, this);"><div class="edui-box edui-icon edui-default"></div></div><div class="edui-box edui-splitborder edui-default"></div><div class="edui-box edui-arrow edui-default" onclick="$EDITORUI[&quot;edui80&quot;]._onArrowClick();"></div></div></div></div><div id="edui86" class="edui-box edui-button edui-for-insertvideo edui-default"><div id="edui86_state" onmousedown="$EDITORUI[&quot;edui86&quot;].Stateful_onMouseDown(event, this);" onmouseup="$EDITORUI[&quot;edui86&quot;].Stateful_onMouseUp(event, this);" onmouseover="$EDITORUI[&quot;edui86&quot;].Stateful_onMouseOver(event, this);" onmouseout="$EDITORUI[&quot;edui86&quot;].Stateful_onMouseOut(event, this);" class="edui-default"><div class="edui-button-wrap edui-default"><div id="edui86_body" unselectable="on" title="视频" class="edui-button-body edui-default" onmousedown="return $EDITORUI[&quot;edui86&quot;]._onMouseDown(event, this);" onclick="return $EDITORUI[&quot;edui86&quot;]._onClick(event, this);"><div class="edui-box edui-icon edui-default"></div><div class="edui-box edui-label edui-default"></div></div></div></div></div><div id="edui87" class="edui-box edui-menubutton edui-for-insertorderedlist edui-default"><div title="有序列表" id="edui87_state" onmousedown="$EDITORUI[&quot;edui87&quot;].Stateful_onMouseDown(event, this);" onmouseup="$EDITORUI[&quot;edui87&quot;].Stateful_onMouseUp(event, this);" onmouseover="$EDITORUI[&quot;edui87&quot;].Stateful_onMouseOver(event, this);" onmouseout="$EDITORUI[&quot;edui87&quot;].Stateful_onMouseOut(event, this);" class="edui-default"><div class="edui-menubutton-body edui-default"><div id="edui87_button_body" class="edui-box edui-button-body edui-default" onclick="$EDITORUI[&quot;edui87&quot;]._onButtonClick(event, this);"><div class="edui-box edui-icon edui-default"></div></div><div class="edui-box edui-splitborder edui-default"></div><div class="edui-box edui-arrow edui-default" onclick="$EDITORUI[&quot;edui87&quot;]._onArrowClick();"></div></div></div></div><div id="edui100" class="edui-box edui-menubutton edui-for-insertunorderedlist edui-default"><div title="无序列表" id="edui100_state" onmousedown="$EDITORUI[&quot;edui100&quot;].Stateful_onMouseDown(event, this);" onmouseup="$EDITORUI[&quot;edui100&quot;].Stateful_onMouseUp(event, this);" onmouseover="$EDITORUI[&quot;edui100&quot;].Stateful_onMouseOver(event, this);" onmouseout="$EDITORUI[&quot;edui100&quot;].Stateful_onMouseOut(event, this);" class="edui-default"><div class="edui-menubutton-body edui-default"><div id="edui100_button_body" class="edui-box edui-button-body edui-default" onclick="$EDITORUI[&quot;edui100&quot;]._onButtonClick(event, this);"><div class="edui-box edui-icon edui-default"></div></div><div class="edui-box edui-splitborder edui-default"></div><div class="edui-box edui-arrow edui-default" onclick="$EDITORUI[&quot;edui100&quot;]._onArrowClick();"></div></div></div></div><div id="edui108" class="edui-box edui-button edui-for-directionalityltr edui-default"><div id="edui108_state" onmousedown="$EDITORUI[&quot;edui108&quot;].Stateful_onMouseDown(event, this);" onmouseup="$EDITORUI[&quot;edui108&quot;].Stateful_onMouseUp(event, this);" onmouseover="$EDITORUI[&quot;edui108&quot;].Stateful_onMouseOver(event, this);" onmouseout="$EDITORUI[&quot;edui108&quot;].Stateful_onMouseOut(event, this);" class="edui-default"><div class="edui-button-wrap edui-default"><div id="edui108_body" unselectable="on" title="从左向右输入" class="edui-button-body edui-default" onmousedown="return $EDITORUI[&quot;edui108&quot;]._onMouseDown(event, this);" onclick="return $EDITORUI[&quot;edui108&quot;]._onClick(event, this);"><div class="edui-box edui-icon edui-default"></div><div class="edui-box edui-label edui-default"></div></div></div></div></div><div id="edui109" class="edui-box edui-button edui-for-directionalityrtl edui-default"><div id="edui109_state" onmousedown="$EDITORUI[&quot;edui109&quot;].Stateful_onMouseDown(event, this);" onmouseup="$EDITORUI[&quot;edui109&quot;].Stateful_onMouseUp(event, this);" onmouseover="$EDITORUI[&quot;edui109&quot;].Stateful_onMouseOver(event, this);" onmouseout="$EDITORUI[&quot;edui109&quot;].Stateful_onMouseOut(event, this);" class="edui-default"><div class="edui-button-wrap edui-default"><div id="edui109_body" unselectable="on" title="从右向左输入" class="edui-button-body edui-default" onmousedown="return $EDITORUI[&quot;edui109&quot;]._onMouseDown(event, this);" onclick="return $EDITORUI[&quot;edui109&quot;]._onClick(event, this);"><div class="edui-box edui-icon edui-default"></div><div class="edui-box edui-label edui-default"></div></div></div></div></div><div id="edui110" class="edui-box edui-button edui-for-imagenone edui-default"><div id="edui110_state" onmousedown="$EDITORUI[&quot;edui110&quot;].Stateful_onMouseDown(event, this);" onmouseup="$EDITORUI[&quot;edui110&quot;].Stateful_onMouseUp(event, this);" onmouseover="$EDITORUI[&quot;edui110&quot;].Stateful_onMouseOver(event, this);" onmouseout="$EDITORUI[&quot;edui110&quot;].Stateful_onMouseOut(event, this);" class="edui-default"><div class="edui-button-wrap edui-default"><div id="edui110_body" unselectable="on" title="默认" class="edui-button-body edui-default" onmousedown="return $EDITORUI[&quot;edui110&quot;]._onMouseDown(event, this);" onclick="return $EDITORUI[&quot;edui110&quot;]._onClick(event, this);"><div class="edui-box edui-icon edui-default"></div><div class="edui-box edui-label edui-default"></div></div></div></div></div><div id="edui111" class="edui-box edui-button edui-for-imageleft edui-default"><div id="edui111_state" onmousedown="$EDITORUI[&quot;edui111&quot;].Stateful_onMouseDown(event, this);" onmouseup="$EDITORUI[&quot;edui111&quot;].Stateful_onMouseUp(event, this);" onmouseover="$EDITORUI[&quot;edui111&quot;].Stateful_onMouseOver(event, this);" onmouseout="$EDITORUI[&quot;edui111&quot;].Stateful_onMouseOut(event, this);" class="edui-default"><div class="edui-button-wrap edui-default"><div id="edui111_body" unselectable="on" title="左浮动" class="edui-button-body edui-default" onmousedown="return $EDITORUI[&quot;edui111&quot;]._onMouseDown(event, this);" onclick="return $EDITORUI[&quot;edui111&quot;]._onClick(event, this);"><div class="edui-box edui-icon edui-default"></div><div class="edui-box edui-label edui-default"></div></div></div></div></div><div id="edui112" class="edui-box edui-button edui-for-imageright edui-default"><div id="edui112_state" onmousedown="$EDITORUI[&quot;edui112&quot;].Stateful_onMouseDown(event, this);" onmouseup="$EDITORUI[&quot;edui112&quot;].Stateful_onMouseUp(event, this);" onmouseover="$EDITORUI[&quot;edui112&quot;].Stateful_onMouseOver(event, this);" onmouseout="$EDITORUI[&quot;edui112&quot;].Stateful_onMouseOut(event, this);" class="edui-default"><div class="edui-button-wrap edui-default"><div id="edui112_body" unselectable="on" title="右浮动" class="edui-button-body edui-default" onmousedown="return $EDITORUI[&quot;edui112&quot;]._onMouseDown(event, this);" onclick="return $EDITORUI[&quot;edui112&quot;]._onClick(event, this);"><div class="edui-box edui-icon edui-default"></div><div class="edui-box edui-label edui-default"></div></div></div></div></div><div id="edui113" class="edui-box edui-button edui-for-imagecenter edui-default"><div id="edui113_state" onmousedown="$EDITORUI[&quot;edui113&quot;].Stateful_onMouseDown(event, this);" onmouseup="$EDITORUI[&quot;edui113&quot;].Stateful_onMouseUp(event, this);" onmouseover="$EDITORUI[&quot;edui113&quot;].Stateful_onMouseOver(event, this);" onmouseout="$EDITORUI[&quot;edui113&quot;].Stateful_onMouseOut(event, this);" class="edui-default"><div class="edui-button-wrap edui-default"><div id="edui113_body" unselectable="on" title="居中" class="edui-button-body edui-default" onmousedown="return $EDITORUI[&quot;edui113&quot;]._onMouseDown(event, this);" onclick="return $EDITORUI[&quot;edui113&quot;]._onClick(event, this);"><div class="edui-box edui-icon edui-default"></div><div class="edui-box edui-label edui-default"></div></div></div></div></div><div id="edui114" class="edui-box edui-menubutton edui-for-lineheight edui-default"><div title="行间距" id="edui114_state" onmousedown="$EDITORUI[&quot;edui114&quot;].Stateful_onMouseDown(event, this);" onmouseup="$EDITORUI[&quot;edui114&quot;].Stateful_onMouseUp(event, this);" onmouseover="$EDITORUI[&quot;edui114&quot;].Stateful_onMouseOver(event, this);" onmouseout="$EDITORUI[&quot;edui114&quot;].Stateful_onMouseOut(event, this);" class="edui-default"><div class="edui-menubutton-body edui-default"><div id="edui114_button_body" class="edui-box edui-button-body edui-default" onclick="$EDITORUI[&quot;edui114&quot;]._onButtonClick(event, this);"><div class="edui-box edui-icon edui-default"></div></div><div class="edui-box edui-splitborder edui-default"></div><div class="edui-box edui-arrow edui-default" onclick="$EDITORUI[&quot;edui114&quot;]._onArrowClick();"></div></div></div></div><div id="edui123" class="edui-box edui-combox edui-for-customstyle edui-default"><div title="自定义标题" id="edui123_state" onmousedown="$EDITORUI[&quot;edui123&quot;].Stateful_onMouseDown(event, this);" onmouseup="$EDITORUI[&quot;edui123&quot;].Stateful_onMouseUp(event, this);" onmouseover="$EDITORUI[&quot;edui123&quot;].Stateful_onMouseOver(event, this);" onmouseout="$EDITORUI[&quot;edui123&quot;].Stateful_onMouseOut(event, this);" class="edui-default"><div class="edui-combox-body edui-default"><div id="edui123_button_body" class="edui-box edui-button-body edui-default" onclick="$EDITORUI[&quot;edui123&quot;]._onButtonClick(event, this);">自定义标题</div><div class="edui-box edui-splitborder edui-default"></div><div class="edui-box edui-arrow edui-default" onclick="$EDITORUI[&quot;edui123&quot;]._onArrowClick();"></div></div></div></div><div id="edui133" class="edui-box edui-button edui-for-insertimage edui-default"><div id="edui133_state" onmousedown="$EDITORUI[&quot;edui133&quot;].Stateful_onMouseDown(event, this);" onmouseup="$EDITORUI[&quot;edui133&quot;].Stateful_onMouseUp(event, this);" onmouseover="$EDITORUI[&quot;edui133&quot;].Stateful_onMouseOver(event, this);" onmouseout="$EDITORUI[&quot;edui133&quot;].Stateful_onMouseOut(event, this);" class="edui-default"><div class="edui-button-wrap edui-default"><div id="edui133_body" unselectable="on" title="多图上传" class="edui-button-body edui-default" onmousedown="return $EDITORUI[&quot;edui133&quot;]._onMouseDown(event, this);" onclick="return $EDITORUI[&quot;edui133&quot;]._onClick(event, this);"><div class="edui-box edui-icon edui-default"></div><div class="edui-box edui-label edui-default"></div></div></div></div></div><div id="edui134" class="edui-box edui-button edui-for-图片选择 edui-default"><div id="edui134_state" onmousedown="$EDITORUI[&quot;edui134&quot;].Stateful_onMouseDown(event, this);" onmouseup="$EDITORUI[&quot;edui134&quot;].Stateful_onMouseUp(event, this);" onmouseover="$EDITORUI[&quot;edui134&quot;].Stateful_onMouseOver(event, this);" onmouseout="$EDITORUI[&quot;edui134&quot;].Stateful_onMouseOut(event, this);" class="edui-default"><div class="edui-button-wrap edui-default"><div id="edui134_body" unselectable="on" title="图片选择" class="edui-button-body edui-default" onmousedown="return $EDITORUI[&quot;edui134&quot;]._onMouseDown(event, this);" onclick="return $EDITORUI[&quot;edui134&quot;]._onClick(event, this);"><div class="edui-box edui-icon edui-default"></div><div class="edui-box edui-label edui-default"></div></div></div></div></div></div></div></div><div id="edui1_toolbarmsg" class="edui-editor-toolbarmsg edui-default" style="display:none;"><div id="edui1_upload_dialog" class="edui-editor-toolbarmsg-upload edui-default" onclick="$EDITORUI[&quot;edui1&quot;].showWordImageDialog();">点击上传</div><div class="edui-editor-toolbarmsg-close edui-default" onclick="$EDITORUI[&quot;edui1&quot;].hideToolbarMsg();">x</div><div id="edui1_toolbarmsg_label" class="edui-editor-toolbarmsg-label edui-default"></div><div style="height:0;overflow:hidden;clear:both;" class="edui-default"></div></div><div id="edui1_message_holder" class="edui-editor-messageholder edui-default" style="top: 3px; z-index: 1000;"></div></div><div id="edui1_iframeholder" class="edui-editor-iframeholder edui-default" style="width: 100%; height: 500px; z-index: 999; overflow: hidden;"><iframe id="ueditor_0" width="100%" height="100%" frameborder="0" src="javascript:void(function(){document.open();document.write(&quot;<!DOCTYPE html><html xmlns='http://www.w3.org/1999/xhtml' class='view' ><head><style type='text/css'>.view{padding:0;word-wrap:break-word;cursor:text;height:90%;}
body{margin:8px;font-family:sans-serif;font-size:16px;}p{margin:5px 0;}</style><link rel='stylesheet' type='text/css' href='http://b2c.niuteam.cn/public/admin/js/ueditor/themes/iframe.css'/></head><body class='view' ></body><script type='text/javascript'  id='_initialScript'>setTimeout(function(){editor = window.parent.UE.instants['ueditorInstant0'];editor._setup(document);},0);var _tmpScript = document.getElementById('_initialScript');_tmpScript.parentNode.removeChild(_tmpScript);</script></html>&quot;);document.close();}())"></iframe></div><div id="edui1_bottombar" class="edui-editor-bottomContainer edui-default"><table class="edui-default"><tbody class="edui-default"><tr class="edui-default"><td id="edui1_elementpath" class="edui-editor-bottombar edui-default"></td><td id="edui1_wordcount" class="edui-editor-wordcount edui-default">字数统计</td><td id="edui1_scale" class="edui-editor-scale edui-default" style="display: none;"><div class="edui-editor-icon edui-default"></div></td></tr></tbody></table></div><div id="edui1_scalelayer" class="edui-default"></div></div></div>
			<span class="help-inline">请填写商品描述</span>
		</div>
	</div>
	
	<div class="block-template-setting">
	
		<!-- 模板设置 -->
		<h4>模板设置</h4>
		<dl>
			<dt>电脑端：</dt>
			<dd>
				template/shop/blue/Goods/&nbsp;<input type="text" class="input-common harf" name="" id="pc_custom_template" value="" style="width: 80px;" onkeyup="value=value.replace(/[^\w\.\/]/ig,'')">&nbsp;.html
				<p class="hint">用户自定义模板必须存放在template/shop/blue/Goods/下，模板名只能由英文组成</p>
			</dd>
		</dl>
		<dl>
			<dt>手机端：</dt>
			<dd>
				template/wap/default_new/Goods/&nbsp;<input type="text" class="input-common harf" name="" id="wap_custom_template" value="" style="width: 80px;" onkeyup="value=value.replace(/[^\w\.\/]/ig,'')">&nbsp;.html
				<p class="hint">用户自定义模板必须存放在template/wap/default_new/Goods/下，模板名只能由英文组成</p>
			</dd>
		</dl>
	</div>
	
	<div class="js-mask-category" style="position: fixed; width: 100%; height: 100%; top: 0px; left: 0px; right: 0px; bottom: 0px; z-index: 90; display: none; background: rgba(0, 0, 0, 0);"></div>
	
</div>

<div class="edit-sku-popup-mask-layer"></div>
<div class="edit-sku-popup">
	<header>
		<h3>选择规格</h3>
		<span>×</span>
	</header>
	<div class="edit-sku-popup-body">
		<aside>
			<p>选择规格 [可多选]</p>
			<div class="js-attr-block">
				<div class="selectric-wrapper selectric-select-common selectric-attr-search" style="width: 250px;"><div class="selectric-hide-select"><select id="search_attr_id" class="select-common attr-search" onchange="getAttrSearchSelected(this);" tabindex="-1">
					<option value="0" selected="selected">全部</option>
											<option value="16">美体专区</option>
											<option value="17">铁皮石斛</option>
											<option value="18">闲逛逛</option>
									</select></div><div class="selectric"><span class="selectric-label">全部</span><button class="selectric-button">▾</button></div><div class="selectric-items" tabindex="-1"><div class="selectric-scroll"><ul><li data-index="0" class="selected" title="全部">全部</li><li data-index="1" class="" title="美体专区">美体专区</li><li data-index="2" class="" title="铁皮石斛">铁皮石斛</li><li data-index="3" class="last" title="闲逛逛">闲逛逛</li></ul></div></div><input class="selectric-input" tabindex="0"></div>
			</div>
			<!-- 原始规格 -->
			<div class="original-sku">
				<ul class="original-sku-list">
					<li class="add-sku" style="display: none;"></li>
				</ul>
			</div>
			<p class="title">当前已选规格</p>
			<!-- 已选规格 -->
			<div class="current-selected-sku">
				<ul class="js-sku-list-popup">
					<li class="add-sku">
						<input type="text" class="input-common" placeholder="输入新规格名称">
						<i class="fa fa-plus"></i>
						<strong>添加新规格</strong>
					</li>
				</ul>
			</div>
		</aside>
		<article>
			<p>选择规格值 [可多选]</p>
			<div class="sku-value">
				
				<p class="empty-info">请选择左侧规格列表</p>
				
				<div class="sku-value-list">
					<label>
						<i class="checkbox-common">
							<input class="margin-small-right" id="checkAll" type="checkbox">
						</i>
						<span>全选</span>
					</label>
					<div class="add-sku-value-input">
						<input type="text" class="input-common" placeholder="输入规格值名称(回车保存)">
					</div>
					<ul></ul>
				</div>
				
			</div>
			<div class="sku-display-mode">
				<header>
					<label>规格值展示方式</label>
					<span>指定规格值在前台的展示方式</span>
				</header>
				<p class="empty-info">请选择上方的规格值</p>
				<nav>
					<ul>
						<li data-spec-show-type="1">
							<label class="line-label">
								<span>文字（编辑不会改变原始规格）</span>
							</label>
						</li>
						<li data-spec-show-type="2">
							<label class="line-label">
								<i class="radio-common">
									<input type="radio" name="show_type" id="show_type2" value="2">
								</i>
								<span>颜色</span>
							</label>
						</li>
						<li data-spec-show-type="3">
							<label class="line-label">
								<i class="radio-common">
									<input type="radio" name="show_type" id="show_type3" value="3">
								</i>
								<span>图片</span>
							</label>
						</li>
					</ul>
				</nav>
				<ul></ul>
			</div>
		</article>
	</div>
	
	<footer>
		<span class="box-spec-bottom">注意：改变规格会删除现有的有的商品规格数据，并生成新的规格数据。</span>
		<button class="btn-common btn-big btn-top">生成</button>
		<button class="btn-common-cancle btn-big btn-bottom">取消</button>
	</footer>
</div>

<div class="point-card-inventory-management-popup">
	<div class="point-card-inventory-management-body">
	</div>
	<footer><div class="page" id="turn-ul" style="display: none;">
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
</div></footer>
</div>

<div style="height: 50px;" class="h50"></div>
<div class="btn-submit ncsc-form-goods" style="text-align: left; width: 1189px;">
	<dl>
		<dt></dt>
		<dd style="padding: 0;">
			
			<button class="btn-common" id="btnSave" type="button" onclick="SubmitProductInfo(0,'http://b2c.niuteam.cn/admin','http://b2c.niuteam.cn')">保存</button>
			<button class="btn-common" id="btnSavePreview" type="button" onclick="SubmitProductInfo(1,'http://b2c.niuteam.cn/admin','http://b2c.niuteam.cn')">保存并预览</button>
		</dd>
	</dl>
</div>
<input type="hidden" id="goodsId" value="0" class="">
<input type="hidden" id="shop_type" value="2" class="">
<input type="hidden" id="virtual_goods_type_id" value="0" class="">
<input type="hidden" id="hidQRcode" value="1" class="">
<input type="hidden" id="hidden_qrcode" class="">
<input type="hidden" id="hidden_sort" value="0" class="">
<input type="hidden" id="hidden_goods_brand_id" value="0" class="">
<input type="hidden" id="hidden_goods_brand_name" class="">



<input type="hidden" id="page_count" class="">
<input type="hidden" id="page_size" class="">

		</div>
		
	</section>
	
</template>

<script>
require("@/assets/style/goods/add.scss");

export default {
  name: "goodsAdd",
  components: {
  }
};
</script>

<style lang="scss">
</style>
