<template>

	<section class="ns-base-section">

		<div style="position:relative;margin:0;">
			<!-- 面包屑导航 -->
						<div class="breadcrumb-nav">
				<a href="http://b2c.niuteam.cn/admin.html">单商户B2C</a>
									<i class="fa fa-angle-right"></i>
					<a href="/goods/goodslist.html">商品</a>
									<i class="fa fa-angle-right"></i>
					<!-- 需要加跳转链接用这个：http://b2c.niuteam.cn/admin/goods/updategoodsspec -->
					<a href="javascript:;" style="color:#999;">修改商品规格</a>
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
	<dl>
		<dt><span class="color-red">*</span>规格名称：</dt>
		<dd>
			<input id="spec_name" type="text" value="尺码" placeholder="请输入规格名称" class="input-common">
			<span class="error">请输入规格名称</span>
		</dd>
	</dl>
	<dl>
		<dt><span class="color-red">&nbsp;</span>规格排序：</dt>
		<dd>
			<input id="sort" type="number" value="1" class="input-common harf">
		</dd>
	</dl>
	<dl>
		<dt><span class="color-red">&nbsp;</span>是否启用：</dt>
		<dd>
			<input id="is_visible" type="checkbox" class="checkbox" checked="checked" simpleswitch="0" result="true" style="display: none;"><div class="Switch Switch_FlatRadius On" id="Switch0"><span class="switch-open">是</span><span class="switch-close">否</span></div>
		</dd>
	</dl>
	<dl>
		<dt><span class="color-red">&nbsp;</span>是否筛选：</dt>
		<dd>
			<input id="is_screen" type="checkbox" class="checkbox" checked="checked" simpleswitch="1" result="true" style="display: none;"><div class="Switch Switch_FlatRadius On" id="Switch1"><span class="switch-open">是</span><span class="switch-close">否</span></div>
		</dd>
	</dl>
	<dl>
		<dt><span class="color-red">&nbsp;</span>展示方式：</dt>
		<dd>
			<label class="line-label">
				<i class="radio-common selected">
					<input type="radio" name="show_type" id="show_type1" value="1" checked="" onchange="change_show_type(1)">
				</i>
				文字
			</label>
			<label class="line-label">
				<i class="radio-common ">
					<input type="radio" name="show_type" id="show_type2" value="2" onchange="change_show_type(2)">
				</i>
				颜色
			</label>
			<label class="line-label">
				<i class="radio-common ">
					<input type="radio" name="show_type" id="show_type3" value="3" onchange="change_show_type(3)">
				</i>
				图片
			</label>
		</dd>
	</dl>
	
	<dl>
		<dt><span class="color-red">*</span>规格值：</dt>
		<dd>
			<textarea rows="" cols="" id="spec_value" class="textarea-common big">M
L
XL
</textarea>
			<p class="hint">一行为一个规格项，多个规格项用换行输入</p>
		</dd>
	</dl>

	<dl>
		<dt>规格说明：</dt>
		<dd>
			<textarea class="textarea-common big" placeholder="请输入规格说明" id="spec_des"></textarea>
		</dd>
	</dl>

	<dl>
		<dt></dt>
		<dd>
			<button class="btn-common btn-big" onclick="updateGoodsSpec();">保存</button>
			<button class="btn-common-cancle btn-big" onclick="javascript:history.back(-1);">返回</button>
		</dd>
	</dl>

	<input type="hidden" id="spec_id" name="spec_id" value="39">
</div>

		</div>

	</section>
</template>
