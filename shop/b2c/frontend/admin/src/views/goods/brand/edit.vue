<template>
    
	<section class="ns-base-section">
		
		
		
		<div style="position:relative;margin:0;">
			<!-- 面包屑导航 -->
						<div class="breadcrumb-nav">
				<a href="http://b2c.niuteam.cn/admin.html">单商户B2C</a>
									<i class="fa fa-angle-right"></i>
					<a href="http://b2c.niuteam.cn/admin/goods/goodslist.html">商品</a>
									<i class="fa fa-angle-right"></i>
					<!-- 需要加跳转链接用这个：http://b2c.niuteam.cn/admin/goods/updategoodsbrand -->
					<a href="javascript:;" style="color:#999;">修改商品品牌</a>
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
									<p>修改商品品牌</p>
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
<!-- 						<span>修改商品品牌</span> -->
<!-- 						 -->
<!-- 					{1/block} -->
				</h4>
			</div>
		</div>
		
		
		<div class="ns-main">
			
<div class="space-10"></div>
<div class="set-style">
	<input type="hidden" value="4" id="brand_id" class="">
	<dl>
		<dt><span class="color-red">*</span>品牌名称：</dt>
		<dd>
			<input id="brand_name" type="text" value="索尼" placeholder="请输入品牌名称" class="input-common">
			<span class="error">请输入品牌名称</span>
		</dd>
	</dl>
	<dl>
		<dt><span class="color-red">*</span>品牌首字母：</dt>
		<dd>
			<input id="brand_initial" type="text" value="S" placeholder="请输入品牌首字母" class="input-common harf">
			<span class="error">请输入品牌首字母</span>
		</dd>
	</dl>
	<dl>
		<dt>是否推荐：</dt>
		<dd>
			<input id="brand_recommend" type="checkbox" class="checkbox" checked="checked" simpleswitch="0" result="true" style="display: none;"><div class="Switch Switch_FlatRadius On" id="Switch0"><span class="switch-open">是</span><span class="switch-close">否</span></div>
		</dd>
	</dl>
	<dl style="display: none;" class="">
		<dt><span class="color-red"></span>商品分类：</dt>
		<dd>
			<!-- <div class="col-sm-2 category_name">
				<span></span>
				<a href="javascript:void(0);" onclick="show_select()" class="btn btn-default">编辑</a>
			</div> -->
			<div class="selectric-wrapper selectric-form-control selectric-m-b selectric-select-common" style="width: 250px;"><div class="selectric-hide-select"><select id="category_id_1" name="account" class="form-control m-b select-common" onchange="changeCategory(1)" tabindex="-1">
				<option value="0">请选择...</option>
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
							</select></div><div class="selectric"><span class="selectric-label">请选择...</span><button class="selectric-button">▾</button></div><div class="selectric-items" tabindex="-1"><div class="selectric-scroll"><ul><li data-index="0" class="selected" title="请选择...">请选择...</li><li data-index="1" class="" title="养护设备">养护设备</li><li data-index="2" class="" title="工程设备">工程设备</li><li data-index="3" class="" title="环卫设备">环卫设备</li><li data-index="4" class="" title="服装">服装</li><li data-index="5" class="" title="配件专区">配件专区</li><li data-index="6" class="" title="女鞋/箱包/钟表/珠宝">女鞋/箱包/钟表/珠宝</li><li data-index="7" class="" title="男鞋/运动/户外">男鞋/运动/户外</li><li data-index="8" class="" title="混凝土设">混凝土设</li><li data-index="9" class="" title="汽车/汽车用品">汽车/汽车用品</li><li data-index="10" class="" title="母婴/玩具用品">母婴/玩具用品</li><li data-index="11" class="last" title="食品/酒类/生鲜/特产">食品/酒类/生鲜/特产</li></ul></div></div><input class="selectric-input" tabindex="0"></div>
			<div class="selectric-wrapper selectric-form-control selectric-m-b selectric-select-common" style="width: 250px;"><div class="selectric-hide-select"><select id="category_id_2" name="account" class="form-control m-b select-common" onchange="changeCategory(2)" style="display: none;" tabindex="-1">
				<option value="0">请选择...</option>
			</select></div><div class="selectric"><span class="selectric-label">请选择...</span><button class="selectric-button">▾</button></div><div class="selectric-items" tabindex="-1"><div class="selectric-scroll"><ul><li data-index="0" class="last selected" title="请选择...">请选择...</li></ul></div></div><input class="selectric-input" tabindex="0"></div>
			<div class="selectric-wrapper selectric-form-control selectric-m-b selectric-select-common" style="width: 250px;"><div class="selectric-hide-select"><select id="category_id_3" name="account" class="form-control m-b select-common" style="display: none;" tabindex="-1">
				<option value="0">请选择...</option>
			</select></div><div class="selectric"><span class="selectric-label">请选择...</span><button class="selectric-button">▾</button></div><div class="selectric-items" tabindex="-1"><div class="selectric-scroll"><ul><li data-index="0" class="last selected" title="请选择...">请选择...</li></ul></div></div><input class="selectric-input" tabindex="0"></div>
			<span class="error">请选择商品分类</span>
		</dd>
	</dl>
	<dl>
		<dt>图片：</dt>
		<dd>
			<div class="upload-btn-common">
				<div>
					<input class="input-file" name="file_upload" id="uploadBrand_pic" type="file" onchange="imgUpload(this);" title="上传">
					<input type="hidden" id="brand_pic" value="">
				</div>
				<input type="text" id="text_brand_pic" class="input-common" readonly="readonly" value="">
				<em>上传</em>
				
				<img id="preview_brand_pic" src="/public/static/blue/img/upload-common-select.png" data-html="true" data-container="body" data-placement="top" data-trigger="manual">

			</div>
			<p class="hint">
				<span>建议使用<i class="important-note">宽200</i>像素-<i class="important-note">高60</i>像素内的<i class="important-note">GIF</i>或<i class="important-note">PNG</i>透明图片；点击下方"保存"按钮后生效。</span>
			</p>
		</dd>
	</dl>
	<dl>
		<dt>品牌推荐广告图：</dt>
		<dd>
			<div class="upload-btn-common">
				<div>
					<input class="input-file" name="file_upload" id="uploadBrand_ads" type="file" onchange="imgUpload(this);" title="上传">
					<input type="hidden" id="brand_ads" value="">
				</div>
				<input type="text" id="text_brand_ads" class="input-common" readonly="readonly" value="">
				<em>上传</em>
				
				<img id="preview_brand_ads" src="/public/static/blue/img/upload-common-select.png" data-html="true" data-container="body" data-placement="top" data-trigger="manual">

			</div>
			<p class="hint">
				<span>建议使用<i class="important-note">宽200</i>像素-<i class="important-note">高60</i>像素内的<i class="important-note">GIF</i>或<i class="important-note">PNG</i>透明图片；点击下方"保存"按钮后生效。</span>
			</p>
		</dd>
	</dl>
	<dl>
		<dt></dt>
		<dd>
			<button class="btn-common btn-big" onclick="editGoodsBrand();">保存</button>
			<button class="btn-common-cancle btn-big" onclick="javascript:history.back(-1);">返回</button>
		</dd>
	</dl>
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
<input type="hidden" id="page_count">
<input type="hidden" id="page_size">
		</div>
		
	</section>
</template>
