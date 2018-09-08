<template>

	<section class="ns-base-section">

		<div style="position:relative;margin:0;">
			<!-- 面包屑导航 -->
						<div class="breadcrumb-nav">
				<a href="http://b2c.niuteam.cn/admin.html">单商户B2C</a>
									<i class="fa fa-angle-right"></i>
					<a href="/goods/goodslist.html">商品</a>
									<i class="fa fa-angle-right"></i>
					<!-- 需要加跳转链接用这个：http://b2c.niuteam.cn/admin/goods/updategoodscategory -->
					<a href="javascript:;" style="color:#999;">修改商品分类</a>
							</div>
						<!-- 三级导航菜单 -->
			<div class="right-side-operation">
				<ul>
					<li>
						<a class="js-open-warmp-prompt" href="javascript:;" data-menu-desc=""><i class="fa fa-question-circle"></i>&nbsp;提示</a>
						<div class="popover">
							<div class="arrow"></div>
							<div class="popover-content">
								<div>
																		<h4>操作提示</h4>
									<p>修改商品分类</p>
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
		<div class="ns-main">

<div class="space-10"></div>
<div class="set-style">
	<input id="category_id" type="hidden" value="1">
	<dl>
		<dt><span class="color-red">*</span>商品分类名称：</dt>
		<dd>
			<p><input id="category_name" type="text" value="家用电器" placeholder="请输入商品分类" class="input-common"></p>
			<p class="error">商品分类不能为空，且长度不能超过30个字</p>
		</dd>
	</dl>
	<dl>
		<dt><span class="color-red">*</span>商品分类简称：</dt>
		<dd>
			<p><input id="short_name" type="text" value="家电" placeholder="请输入商品分类简称" class="input-common"></p>
			<p class="error">商品分类简称不能为空，且长度不能超过20个字</p>
		</dd>
	</dl>
	<dl>
		<dt>上级分类：</dt>
		<dd>
			<div class="selectric-wrapper selectric-select-common" style="width: 250px;"><div class="selectric-hide-select"><select name="search_type" id="pid" class="select-common" tabindex="-1">
				<option value="0">顶级分类</option>
								<option value="2" selected="">&nbsp;&nbsp;&nbsp;&nbsp;混凝土设</option>
									<option value="3">&nbsp;&nbsp;&nbsp;&nbsp;养护设备</option>
									<option value="4">&nbsp;&nbsp;&nbsp;&nbsp;工程设备</option>
									<option value="5">&nbsp;&nbsp;&nbsp;&nbsp;环卫设备</option>
									<option value="6">&nbsp;&nbsp;&nbsp;&nbsp;配件专区</option>
									<option value="7">&nbsp;&nbsp;&nbsp;&nbsp;女鞋/箱包/钟表/珠宝</option>
									<option value="8">&nbsp;&nbsp;&nbsp;&nbsp;男鞋/运动/户外</option>
									<option value="9">&nbsp;&nbsp;&nbsp;&nbsp;汽车/汽车用品</option>
									<option value="10">&nbsp;&nbsp;&nbsp;&nbsp;母婴/玩具用品</option>
									<option value="11">&nbsp;&nbsp;&nbsp;&nbsp;食品/酒类/生鲜/特产</option>
									<option value="146">&nbsp;&nbsp;&nbsp;&nbsp;服装</option>
								</select></div><div class="selectric"><span class="selectric-label">&nbsp;&nbsp;&nbsp;&nbsp;混凝土设</span><button class="selectric-button">▾</button></div><div class="selectric-items" tabindex="-1"><div class="selectric-scroll"><ul><li data-index="0" class="" title="顶级分类">顶级分类</li><li data-index="1" class="selected" title="&nbsp;&nbsp;&nbsp;&nbsp;混凝土设">&nbsp;&nbsp;&nbsp;&nbsp;混凝土设</li><li data-index="2" class="" title="&nbsp;&nbsp;&nbsp;&nbsp;养护设备">&nbsp;&nbsp;&nbsp;&nbsp;养护设备</li><li data-index="3" class="" title="&nbsp;&nbsp;&nbsp;&nbsp;工程设备">&nbsp;&nbsp;&nbsp;&nbsp;工程设备</li><li data-index="4" class="" title="&nbsp;&nbsp;&nbsp;&nbsp;环卫设备">&nbsp;&nbsp;&nbsp;&nbsp;环卫设备</li><li data-index="5" class="" title="&nbsp;&nbsp;&nbsp;&nbsp;配件专区">&nbsp;&nbsp;&nbsp;&nbsp;配件专区</li><li data-index="6" class="" title="&nbsp;&nbsp;&nbsp;&nbsp;女鞋/箱包/钟表/珠宝">&nbsp;&nbsp;&nbsp;&nbsp;女鞋/箱包/钟表/珠宝</li><li data-index="7" class="" title="&nbsp;&nbsp;&nbsp;&nbsp;男鞋/运动/户外">&nbsp;&nbsp;&nbsp;&nbsp;男鞋/运动/户外</li><li data-index="8" class="" title="&nbsp;&nbsp;&nbsp;&nbsp;汽车/汽车用品">&nbsp;&nbsp;&nbsp;&nbsp;汽车/汽车用品</li><li data-index="9" class="" title="&nbsp;&nbsp;&nbsp;&nbsp;母婴/玩具用品">&nbsp;&nbsp;&nbsp;&nbsp;母婴/玩具用品</li><li data-index="10" class="" title="&nbsp;&nbsp;&nbsp;&nbsp;食品/酒类/生鲜/特产">&nbsp;&nbsp;&nbsp;&nbsp;食品/酒类/生鲜/特产</li><li data-index="11" class="last" title="&nbsp;&nbsp;&nbsp;&nbsp;服装">&nbsp;&nbsp;&nbsp;&nbsp;服装</li></ul></div></div><input class="selectric-input" tabindex="0"></div>
		</dd>
	</dl>
	<dl>
		<dt>商品类型：</dt>
		<dd>
			<div class="selectric-wrapper selectric-select-common" style="width: 250px;"><div class="selectric-hide-select"><select name="attr" id="attr_id" class="select-common" tabindex="-1">
				<option value="">选择类型</option>
								<option value="16">美体专区</option>
								<option value="17">铁皮石斛</option>
								<option value="18">闲逛逛</option>
							</select></div><div class="selectric"><span class="selectric-label">选择类型</span><button class="selectric-button">▾</button></div><div class="selectric-items" tabindex="-1"><div class="selectric-scroll"><ul><li data-index="0" class="selected" title="选择类型">选择类型</li><li data-index="1" class="" title="美体专区">美体专区</li><li data-index="2" class="" title="铁皮石斛">铁皮石斛</li><li data-index="3" class="last" title="闲逛逛">闲逛逛</li></ul></div></div><input class="selectric-input" tabindex="0"></div>
		</dd>
	</dl>
	<dl>
		<dt>是否可见：</dt>
		<dd>
			<p>
				<input id="is_visible" type="checkbox" class="checkbox" checked="checked" simpleswitch="0" style="display: none;" result="true"><div class="Switch Switch_FlatRadius On" id="Switch0"><span class="switch-open">是</span><span class="switch-close">否</span></div>
				<span class="help-inline" id="is_menuPrompt" style="display: none;"></span>
			</p>
		</dd>
	</dl>
	<dl>
		<dt>排序：</dt>
		<dd>
			<p><input id="sort" type="number" value="1" placeholder="请输入序号" class="input-common harf"></p>
		</dd>
	</dl>
	<dl>
		<dt>图片：</dt>
		<dd>
			<div class="upload-btn-common">
				<div>
					<input class="input-file" name="file_upload" id="uploadImg" type="file" onchange="imgUpload(this);" title="上传">
					<input type="hidden" id="logo" value="">
				</div>
				<input type="text" id="text_logo" class="input-common" readonly="readonly" value="">
				<em>上传</em>
				
				<img id="preview_logo" src="/public/static/blue/img/upload-common-select.png" data-html="true" data-container="body" data-placement="top" data-trigger="manual">

			</div>
			<p class="hint">
				<span>建议使用<i class="important-note">宽100</i>像素-<i class="important-note">高50</i>像素内的<i class="important-note">GIF</i>或<i class="important-note">PNG</i>透明图片；点击下方"保存"按钮后生效。</span>
			</p>

		</dd>
	</dl>
	<dl>
		<dt>关键字：</dt>
		<dd>
			<p><input id="keywords" placeholder="请输入关键字" class="input-common long" value="家电"></p>
			<p class="error">请输入关键字</p>
			<p class="hint">用于网站搜索引擎的优化，关键字之间请用英文逗号分隔</p>
		</dd>
	</dl>
	<dl>
		<dt>描述：</dt>
		<dd>
			<p><textarea id="description" placeholder="请输入描述" class="textarea-common">家电</textarea></p>
		</dd>
	</dl>
	<dl>
		<dt>电脑端分类页面模板：</dt>
		<dd>
			template/shop/blue/Goods/&nbsp;<input type="text" class="input-common harf" name="" value="" id="pc_custom_template" style="width: 80px;" onkeyup="value=value.replace(/[^\w\.\/]/ig,'')">&nbsp;.html
			<p class="hint">用户自定义模板必须存放在template/shop/blue/Goods/下，模板名只能由英文组成</p>
		</dd>
	</dl>
	<dl>
		<dt>手机端分类页面模板：</dt>
		<dd>
			template/wap/default_new/Goods/&nbsp;<input type="text" class="input-common harf" name="" value="" id="wap_custom_template" style="width: 80px;" onkeyup="value=value.replace(/[^\w\.\/]/ig,'')">&nbsp;.html
			<p class="hint">用户自定义模板必须存放在template/wap/default_new/Goods/下，模板名只能由英文组成</p>
		</dd>
	</dl>
	<dl>
		<dt></dt>
		<dd>
			<button class="btn-common btn-big" onclick="updateGoodsCategoryAjax();">保存</button>
			<button class="btn-common-cancle btn-big" onclick="javascript:history.back(-1);">返回</button>
		</dd>
	</dl>
</div>

		</div>

	</section>
</template>
