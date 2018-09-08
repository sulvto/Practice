<template>
  <section class="ns-base-section">



		<div style="position:relative;margin:0;">
			<!-- 面包屑导航 -->
						<div class="breadcrumb-nav">
				<a href="http://showfx.niuteam.cn/admin.html"></a>
									<i class="fa fa-angle-right"></i>
					<a href="http://showfx.niuteam.cn/admin/config/webconfig.html">设置</a>
									<i class="fa fa-angle-right"></i>
					<!-- 需要加跳转链接用这个：http://showfx.niuteam.cn/admin/express/freighttemplateedit -->
					<a href="javascript:;" style="color:#999;">编辑运费模板</a>
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
<div class="freight-template">
	<div class="table-div">
		<table>
			<tbody><tr>
				<td colspan="2" class="bg-f5f5f5">
					<div class="table-title-font">
						<span>运费信息</span>
					</div>
				</td>
			</tr>
			<tr>
				<td class="table-first-td">
					<label for="shipping_fee_name"><span class="star">*</span>模板名称</label>
				</td>
				<td>
									<input id="shipping_fee_name" type="text" class="input-common">
								</td>
			</tr>

						<tr>
				<td class="table-first-td">
					<label>模板地区类型</label>
				</td>
				<td>
					<div class="selectric-wrapper selectric-select-common" style="width: 250px;"><div class="selectric-hide-select"><select id="is_default" class="select-common" tabindex="-1">
						<option value="1">默认地区</option>
												<option value="0">指定地区</option>
											</select></div><div class="selectric"><span class="selectric-label">默认地区</span><button class="selectric-button">▾</button></div><div class="selectric-items" tabindex="-1"><div class="selectric-scroll"><ul><li data-index="0" class="selected" title="默认地区">默认地区</li><li data-index="1" class="last" title="指定地区">指定地区</li></ul></div></div><input class="selectric-input" tabindex="0"></div>
				</td>
			</tr>


			<tr>
				<td class="table-first-td">
					<label><span class="star">*</span>选择地区</label>
				</td>
				<td>
									<!-- 添加 -->
					<span class="js-region-info region-info"></span>
									<a class="btn-gradient-default js-select-city" data-flag="1" href="javascript:;">默认地区(全国)</a>

				</td>
			</tr>

			<tr>
				<td class="table-first-td">
					<label>按件数</label>
				</td>
				<td>

					<table class="input-info-table">
						<tbody><tr>
							<td width="20%" align="center">首件(件)</td>
							<td width="20%" align="center">首件运费(元)</td>

							<td width="20%" align="center">续件(件)</td>
							<td width="20%" align="center">续件运费(元)</td>

							<td width="20%" align="center">是否启用计件方式运费</td>
						</tr>
						<tr>
							<td align="center">
															<input type="text" placeholder="0" id="bynum_snum" class="input-common harf" data-msg="首件不能是负数、并且必须是整数" data-rule="int" onkeyup="this.value=this.value.replace(/\D/g,'')" onafterpaste="this.value=this.value.replace(/\D/g,'')">
														</td>

							<td align="center">
															<input type="text" placeholder="0" id="bynum_sprice" class="input-common harf" data-msg="首件运费不能为负数，并且保留两位小数" data-rule="double">
														</td>

							<td align="center">
															<input type="text" placeholder="0" id="bynum_xnum" class="input-common harf" data-msg="续件不能是负数、并且必须是整数" data-rule="greater_int" onkeyup="this.value=this.value.replace(/\D/g,'')" onafterpaste="this.value=this.value.replace(/\D/g,'')">
														</td>

							<td align="center">
															<input type="text" placeholder="0" id="bynum_xprice" data-msg="续件运费不能为负数，并且保留两位小数" class="input-common harf" data-rule="double">
														</td>

							<td align="center">
															<input type="checkbox" class="checkbox" id="bynum_is_use" checked="checked" simpleswitch="0" result="true" style="display: none;"><div class="Switch Switch_FlatRadius On" id="Switch0"><span class="switch-open">是</span><span class="switch-close">否</span></div>
														</td>
						</tr>
					</tbody></table>

				</td>
			</tr>

			<tr>
				<td class="table-first-td">
					<label>按重量</label>
				</td>
				<td>

					<table class="input-info-table">
						<tbody><tr>
							<td width="20%" align="center">首重(kg)</td>
							<td width="20%" align="center">首重运费(元)</td>

							<td width="20%" align="center">续重(kg)</td>
							<td width="20%" align="center">续重运费(元)</td>

							<td width="20%" align="center">是否启用重量运费</td>
						</tr>
						<tr>
							<td align="center">
															<input type="text" placeholder="0" id="weight_snum" class="input-common harf" data-msg="首重不能为负数，并且保留两位小数">
														</td>

							<td align="center">
															<input type="text" placeholder="0" id="weight_sprice" class="input-common harf" data-msg="首重运费不能为负数，并且保留两位小数" data-rule="double">
														</td>

							<td align="center">
															<input type="text" placeholder="0" id="weight_xnum" data-msg="续重必须大于0，并且保留两位小数" class="input-common harf" data-rule="double">
														</td>

							<td align="center">
															<input type="text" placeholder="0" id="weight_xprice" data-msg="续重运费必须大于0，并且保留两位小数" class="input-common harf" data-rule="double">
														</td>

							<td align="center">
															<input type="checkbox" class="checkbox" id="weight_is_use" checked="checked" simpleswitch="1" result="true" style="display: none;"><div class="Switch Switch_FlatRadius On" id="Switch1"><span class="switch-open">是</span><span class="switch-close">否</span></div>
														</td>
						</tr>
					</tbody></table>

				</td>
			</tr>
			<tr>
				<td class="table-first-td">
					<label>按体积</label>
				</td>
				<td>

					<table class="input-info-table">
						<tbody><tr>
							<td width="20%" align="center">首体积量(m³)</td>
							<td width="20%" align="center">首体积运费(元)</td>

							<td width="20%" align="center">续体积量(m³)</td>
							<td width="20%" align="center">续体积运费(元)</td>

							<td width="20%" align="center">是否启用体积计算运费</td>
						</tr>
						<tr>
							<td align="center">
															<input type="text" placeholder="0" id="volume_snum" class="input-common harf" data-msg="首体积量不能为负数，并且保留两位小数" data-rule="double">
														</td>

							<td align="center">
															<input type="text" placeholder="0" id="volume_sprice" class="input-common harf" data-msg="首体积运费不能为负数，并且保留两位小数" data-rule="double">
														</td>

							<td align="center">
															<input type="text" placeholder="0" id="volume_xnum" class="input-common harf" data-msg="续体积量不能为负数，并且保留两位小数" data-rule="double">
														</td>

							<td align="center">
															<input type="text" placeholder="0" id="volume_xprice" class="input-common harf" data-msg="续体积运费不能为负数，并且保留两位小数" data-rule="double">
														</td>

							<td align="center">
															<input type="checkbox" class="checkbox" id="volume_is_use" checked="checked" simpleswitch="2" result="true" style="display: none;"><div class="Switch Switch_FlatRadius On" id="Switch2"><span class="switch-open">是</span><span class="switch-close">否</span></div>
														</td>
						</tr>
					</tbody></table>

				</td>
			</tr>

		</tbody></table>
	</div>
	<div class="freight-template-footer">
		<button type="button" class="btn-common btn-big">保存</button>
		<button class="btn-common-cancle btn-big" onclick="javascript:history.back(-1);">返回</button>
		<input type="hidden" id="hidden_co_id" value="4">
		<input type="hidden" id="hidden_shipping_fee_id" value="0">
					<input type="hidden" id="hidden_province_id_array">
			<input type="hidden" id="hidden_city_id_array">
			<input type="hidden" id="hidden_district_id_array">
			<input type="hidden" id="hidden_is_default" value="1">
			</div>
</div>
<div class="mask-layer"></div>
<div id="select-region" style="left: 50%; margin-left: -346px; top: 93px;" class="modal hide ui-draggable ui-draggable-handle in" tabindex="-1" role="dialog">
	<div class="title">
		<h2>选择地区</h2>
		<span class="cancle js-cancle">[取消]</span>
		<span class="confirm js-confirm">[确定]</span>
	</div>
	<div class="cont">
		<div class="selectSub dialog-areas">
			<ul class="js-regions">
								<li>
					<div class="dcity clearfix">
						<!-- 大类 -->
						<div class="ecity gcity">
							<span class="group-label">
								<input id="first_region_0" data-first-index="0" value="9,10,11,12,14," type="checkbox">
								<label for="first_region_0" title="华东">华东</label>
							</span>
						</div>

						<!-- 省 -->
						<div class="province-list">

														<div class="ecity">
								<span class="gareas">
																		<input disabled="disabled" data-is-disabled="1" data-second-parent-index="0" data-province-id="9" id="second_region_0_9" type="checkbox" data-province-name="上海市" value="9">
									<label class="disabled" for="second_region_0_9" title="上海市">上海市</label>
																		<img class="drop-down" src="/public/admin/images/freight_city_drop_down.gif" data-level="province">

									<!-- 市 -->
									<div class="citys" id="citys_9">
																					<span class="areas">
																								<input disabled="disabled" data-is-disabled="1" data-third-parent-index="0" data-province-id="9" data-city-id="73" value="73" id="third_0_73" type="checkbox">
												<label class="disabled" for="third_0_73" title="上海市">上海市</label>
																									<img class="drop-down" src="/public/admin/images/freight_city_drop_down.gif" data-level="city">
																									<div class="district" id="district_73">
																										<span class="areas">
																												<input disabled="disabled" data-is-disabled="1" data-four-parent-index="0" data-city-id="73" data-province-id="9" value="719" id="four_0_719" type="checkbox">
														<label class="disabled" for="four_0_719" title="黄浦区">黄浦区</label>
																											</span>

																										<span class="areas">
																												<input disabled="disabled" data-is-disabled="1" data-four-parent-index="0" data-city-id="73" data-province-id="9" value="736" id="four_0_736" type="checkbox">
														<label class="disabled" for="four_0_736" title="奉贤区">奉贤区</label>
																											</span>

																										<span class="areas">
																												<input disabled="disabled" data-is-disabled="1" data-four-parent-index="0" data-city-id="73" data-province-id="9" value="735" id="four_0_735" type="checkbox">
														<label class="disabled" for="four_0_735" title="南汇区">南汇区</label>
																											</span>

																										<span class="areas">
																												<input disabled="disabled" data-is-disabled="1" data-four-parent-index="0" data-city-id="73" data-province-id="9" value="734" id="four_0_734" type="checkbox">
														<label class="disabled" for="four_0_734" title="青浦区">青浦区</label>
																											</span>

																										<span class="areas">
																												<input disabled="disabled" data-is-disabled="1" data-four-parent-index="0" data-city-id="73" data-province-id="9" value="733" id="four_0_733" type="checkbox">
														<label class="disabled" for="four_0_733" title="松江区">松江区</label>
																											</span>

																										<span class="areas">
																												<input disabled="disabled" data-is-disabled="1" data-four-parent-index="0" data-city-id="73" data-province-id="9" value="732" id="four_0_732" type="checkbox">
														<label class="disabled" for="four_0_732" title="金山区">金山区</label>
																											</span>

																										<span class="areas">
																												<input disabled="disabled" data-is-disabled="1" data-four-parent-index="0" data-city-id="73" data-province-id="9" value="731" id="four_0_731" type="checkbox">
														<label class="disabled" for="four_0_731" title="浦东新区">浦东新区</label>
																											</span>

																										<span class="areas">
																												<input disabled="disabled" data-is-disabled="1" data-four-parent-index="0" data-city-id="73" data-province-id="9" value="730" id="four_0_730" type="checkbox">
														<label class="disabled" for="four_0_730" title="嘉定区">嘉定区</label>
																											</span>

																										<span class="areas">
																												<input disabled="disabled" data-is-disabled="1" data-four-parent-index="0" data-city-id="73" data-province-id="9" value="729" id="four_0_729" type="checkbox">
														<label class="disabled" for="four_0_729" title="宝山区">宝山区</label>
																											</span>

																										<span class="areas">
																												<input disabled="disabled" data-is-disabled="1" data-four-parent-index="0" data-city-id="73" data-province-id="9" value="728" id="four_0_728" type="checkbox">
														<label class="disabled" for="four_0_728" title="闵行区">闵行区</label>
																											</span>

																										<span class="areas">
																												<input disabled="disabled" data-is-disabled="1" data-four-parent-index="0" data-city-id="73" data-province-id="9" value="727" id="four_0_727" type="checkbox">
														<label class="disabled" for="four_0_727" title="杨浦区">杨浦区</label>
																											</span>

																										<span class="areas">
																												<input disabled="disabled" data-is-disabled="1" data-four-parent-index="0" data-city-id="73" data-province-id="9" value="726" id="four_0_726" type="checkbox">
														<label class="disabled" for="four_0_726" title="虹口区">虹口区</label>
																											</span>

																										<span class="areas">
																												<input disabled="disabled" data-is-disabled="1" data-four-parent-index="0" data-city-id="73" data-province-id="9" value="725" id="four_0_725" type="checkbox">
														<label class="disabled" for="four_0_725" title="闸北区">闸北区</label>
																											</span>

																										<span class="areas">
																												<input disabled="disabled" data-is-disabled="1" data-four-parent-index="0" data-city-id="73" data-province-id="9" value="724" id="four_0_724" type="checkbox">
														<label class="disabled" for="four_0_724" title="普陀区">普陀区</label>
																											</span>

																										<span class="areas">
																												<input disabled="disabled" data-is-disabled="1" data-four-parent-index="0" data-city-id="73" data-province-id="9" value="723" id="four_0_723" type="checkbox">
														<label class="disabled" for="four_0_723" title="静安区">静安区</label>
																											</span>

																										<span class="areas">
																												<input disabled="disabled" data-is-disabled="1" data-four-parent-index="0" data-city-id="73" data-province-id="9" value="722" id="four_0_722" type="checkbox">
														<label class="disabled" for="four_0_722" title="长宁区">长宁区</label>
																											</span>

																										<span class="areas">
																												<input disabled="disabled" data-is-disabled="1" data-four-parent-index="0" data-city-id="73" data-province-id="9" value="721" id="four_0_721" type="checkbox">
														<label class="disabled" for="four_0_721" title="徐汇区">徐汇区</label>
																											</span>

																										<span class="areas">
																												<input disabled="disabled" data-is-disabled="1" data-four-parent-index="0" data-city-id="73" data-province-id="9" value="720" id="four_0_720" type="checkbox">
														<label class="disabled" for="four_0_720" title="卢湾区">卢湾区</label>
																											</span>

																										<span class="areas">
																												<input disabled="disabled" data-is-disabled="1" data-four-parent-index="0" data-city-id="73" data-province-id="9" value="737" id="four_0_737" type="checkbox">
														<label class="disabled" for="four_0_737" title="崇明县">崇明县</label>
																											</span>

																										</div>
																							</span>
																			</div>
								</span>
							</div>
														<div class="ecity">

							</div>
														<div class="ecity">

							</div>
														<div class="ecity">

							</div>
														<div class="ecity">

							</div>

						</div>
					</div>
				</li>
							</ul>
		</div>
	</div>
</div>
		</div>

	</section>
</template>
