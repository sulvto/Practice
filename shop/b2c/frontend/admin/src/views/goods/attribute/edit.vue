<template>
    
	<section class="ns-base-section">
		
		
		
		<div style="position:relative;margin:0;">
			<!-- 面包屑导航 -->
						<div class="breadcrumb-nav">
				<a href="http://b2c.niuteam.cn/admin.html">单商户B2C</a>
									<i class="fa fa-angle-right"></i>
					<a href="http://b2c.niuteam.cn/admin/goods/goodslist.html">商品</a>
									<i class="fa fa-angle-right"></i>
					<!-- 需要加跳转链接用这个：http://b2c.niuteam.cn/admin/goods/updategoodsattribute -->
					<a href="javascript:;" style="color:#999;">修改商品类型</a>
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
<div class="set-style">
	<dl>
		<dt><span class="color-red">*</span>类型名称：</dt>
		<dd>
			<input id="attr_name" type="text" placeholder="请输入类型名称" value="铁皮石斛" class="input-common">
			<span class="error">请输入类型名称</span>
		</dd>
	</dl>
	<dl>
		<dt><span class="color-red">&nbsp;</span>属性排序：</dt>
		<dd>
			<input id="sort" type="number" value="0" class="input-common harf">
		</dd>
	</dl>
	<dl>
		<dt><span class="color-red">&nbsp;</span>是否启用：</dt>
		<dd>
			<input id="is_visible" type="checkbox" class="checkbox" checked="checked" simpleswitch="0" result="true" style="display: none;"><div class="Switch Switch_FlatRadius On" id="Switch0"><span class="switch-open">是</span><span class="switch-close">否</span></div>
		</dd>
	</dl>
	<dl>
		<dt><span class="color-red">&nbsp;</span>关联规格：</dt>
		<dd>
			<div class="guige_list">
										<a href="javascript:;" value="17">颜色<img src="/public/admin/images/delete_ico.png" alt=""></a>
						
											<a href="javascript:;" value="39">尺码<img src="/public/admin/images/delete_ico.png" alt=""></a>
						
								</div>
			<a href="javascript:;" class="add_relation" data-toggle="modal" data-target="#setGoodsAttribute"><img src="/public/admin/images/add_ico.png" alt=""></a>
		</dd>
	</dl>
	<dl>
		<dt><span class="color-red">&nbsp;</span>关联品牌：</dt>
		<dd>
			<div class="brand_list">
				
									<a href="javascript:;" value="5">三星<img src="/public/admin/images/delete_ico.png" alt=""></a>
									
			</div>
			<a href="javascript:;" class="add_relation" data-toggle="modal" data-target="#setGoodsBrand"><img src="/public/admin/images/add_ico.png" alt=""></a>
		</dd>
	</dl>
	
	<div>
		<table class="table-class" id="attrList">
			<colgroup>
				<col style="width: 2%;">
				<col style="width: 6%;">
				<col style="width: 15%;">
				<col style="width: 15%;">
				<col style="width: 13%;">
				<col style="width: 34%;">
				<col style="width: 15%;">
			</colgroup>
			<thead>
				<tr>
					<th></th>
					<th>排序</th>
					<th align="left">属性名称</th>
					<th align="left">所属类型</th>
					<th>是否筛选</th>
					<th align="left">属性值</th>
					<th>操作</th>
				</tr>
			</thead>
			<tbody>
								<tr class="value_data old_data">
					<td></td>
					<td>
						<input type="number" name="value_sort" value="0" class="input-common short" onchange="updateAttrvalue('value_sort',32,this);">
					</td>
					<td>
						<input type="text" name="value_name" class="input-common middle" value="num" onchange="updateAttrvalue('value_name',32,this);">
						
					</td>
					<td>
						<div class="selectric-wrapper selectric-selectbox selectric-select-common selectric-middle" style="width: 150px;"><div class="selectric-hide-select"><select class="selectbox select-common middle" id="type_box_32" value="2" onchange="updateAttrvalue('type_box',32,this);" tabindex="-1">
							<option value="1">输入框</option>
							<option value="2" selected="selected">单选框</option>
							<option value="3">复选框</option>
						</select></div><div class="selectric"><span class="selectric-label">单选框</span><button class="selectric-button">▾</button></div><div class="selectric-items" tabindex="-1"><div class="selectric-scroll"><ul><li data-index="0" class="" title="输入框">输入框</li><li data-index="1" class="selected" title="单选框">单选框</li><li data-index="2" class="last" title="复选框">复选框</li></ul></div></div><input class="selectric-input" tabindex="0"></div>
					</td>
					<td style="text-align: center;">
													<a href="javascript:;" class="is_search" is_search="1" onclick="updateAttrvalue('is_search',32,this);">
								<img src="/public/admin/images/checked.png" alt="" width="15">
							</a>
											</td>
					<td id="value_32" style="word-break:break-all;" title="1,2,3,4">
						1,2,3,4					</td>
					<input type="hidden" class="value_32" value="1,2,3,4">
					<td style="text-align: center;">
						<span class="spec_box_32">
							<a href="javascript:;" id="showAttrbox_32" onclick="showAttrbox(32,17,this);">编辑属性值</a>						</span>
						<a href="javascript:;" onclick="delOldAttributeValue(this, 17, 32)">删除</a>
					</td>
					<input type="hidden" name="attr_value_id" value="32">
				</tr>
								<tr class="value_data old_data">
					<td></td>
					<td>
						<input type="number" name="value_sort" value="0" class="input-common short" onchange="updateAttrvalue('value_sort',34,this);">
					</td>
					<td>
						<input type="text" name="value_name" class="input-common middle" value="sdfs " onchange="updateAttrvalue('value_name',34,this);">
						
					</td>
					<td>
						<div class="selectric-wrapper selectric-selectbox selectric-select-common selectric-middle" style="width: 150px;"><div class="selectric-hide-select"><select class="selectbox select-common middle" id="type_box_34" value="2" onchange="updateAttrvalue('type_box',34,this);" tabindex="-1">
							<option value="1">输入框</option>
							<option value="2" selected="selected">单选框</option>
							<option value="3">复选框</option>
						</select></div><div class="selectric"><span class="selectric-label">单选框</span><button class="selectric-button">▾</button></div><div class="selectric-items" tabindex="-1"><div class="selectric-scroll"><ul><li data-index="0" class="" title="输入框">输入框</li><li data-index="1" class="selected" title="单选框">单选框</li><li data-index="2" class="last" title="复选框">复选框</li></ul></div></div><input class="selectric-input" tabindex="0"></div>
					</td>
					<td style="text-align: center;">
													<a href="javascript:;" class="is_search" is_search="1" onclick="updateAttrvalue('is_search',34,this);">
								<img src="/public/admin/images/checked.png" alt="" width="15">
							</a>
											</td>
					<td id="value_34" style="word-break:break-all;" title="1,2,3,4,">
						1,2,3,4,					</td>
					<input type="hidden" class="value_34" value="1,2,3,4,">
					<td style="text-align: center;">
						<span class="spec_box_34">
							<a href="javascript:;" id="showAttrbox_34" onclick="showAttrbox(34,17,this);">编辑属性值</a>						</span>
						<a href="javascript:;" onclick="delOldAttributeValue(this, 17, 34)">删除</a>
					</td>
					<input type="hidden" name="attr_value_id" value="34">
				</tr>
							</tbody>
		</table>
		<div style="padding:6px 0;">
			<a href="javascript:;" onclick="addSpecValue(this)" style="font-size: 12px;"><i class="fa fa-plus"></i>&nbsp;&nbsp;添加一个属性</a>
		</div>
	</div>
<dl>
	<dt></dt>
	<dd>
		<button class="btn-common btn-big" onclick="updateAttributeService();">保存</button>
		<button class="btn-common-cancle btn-big" onclick="javascript:history.back(-1);">返回</button>
	</dd>
</dl>
<input type="hidden" id="attr_id" value="17">
<!-- 点击编辑弹出框开始 -->
<div class="attr_table" id="Attrbox" style="display:none;">
	<div class="modal-header">
		<button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
		<h3 id="myModalLabel">编辑属性值</h3>
	</div>
	<dl>
		<dt><span class="color-red">*</span>属性值：</dt>
		<dd>
			<textarea rows="" cols="" id="attr_value" class="textarea-common"></textarea>
			<p class="hint">一行为一个属性值，多个属性值用换行输入</p>
		</dd>
	</dl>

	<div class="modal-footer">
		<input type="hidden" id="click_order">
		<button class="btn-common btn-big" onclick="submitAttrValue();hide_modal();">保存</button>
		<button class="btn-common-cancle btn-big" data-dismiss="modal" aria-hidden="true" onclick="hide_modal()">关闭</button>
	</div>
</div>

<!--设置规格 -->
<div class="modal fade hide" id="setGoodsAttribute" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
	<div class="modal-dialog">
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
				<h3>规格关联设置</h3>
			</div>
			<div class="modal-body">
				<table class="attribute_table">	
					<thead>
						<tr>
							<th width="30%">规格</th>
							<th width="70%">描述</th>
						</tr>
					</thead>
					<tbody>
													<tr>
								<td>
									<label for="attribute_check1">
										<i class="checkbox-common">
											<input type="checkbox" id="attribute_check1" value="17" spec_name="颜色" checked="" name="spec">
										</i>
										颜色									</label>
								</td>
								<td></td>
							</tr>
													<tr>
								<td>
									<label for="attribute_check2">
										<i class="checkbox-common">
											<input type="checkbox" id="attribute_check2" value="26" spec_name="存储内存" name="spec">
										</i>
										存储内存									</label>
								</td>
								<td></td>
							</tr>
													<tr>
								<td>
									<label for="attribute_check3">
										<i class="checkbox-common">
											<input type="checkbox" id="attribute_check3" value="38" spec_name="颜色" name="spec">
										</i>
										颜色									</label>
								</td>
								<td></td>
							</tr>
													<tr>
								<td>
									<label for="attribute_check4">
										<i class="checkbox-common">
											<input type="checkbox" id="attribute_check4" value="39" spec_name="尺码" checked="" name="spec">
										</i>
										尺码									</label>
								</td>
								<td></td>
							</tr>
													<tr>
								<td>
									<label for="attribute_check5">
										<i class="checkbox-common">
											<input type="checkbox" id="attribute_check5" value="40" spec_name="屏幕色彩" name="spec">
										</i>
										屏幕色彩									</label>
								</td>
								<td></td>
							</tr>
													<tr>
								<td>
									<label for="attribute_check6">
										<i class="checkbox-common">
											<input type="checkbox" id="attribute_check6" value="41" spec_name="主屏分辨率" name="spec">
										</i>
										主屏分辨率									</label>
								</td>
								<td></td>
							</tr>
													<tr>
								<td>
									<label for="attribute_check7">
										<i class="checkbox-common">
											<input type="checkbox" id="attribute_check7" value="34" spec_name="运行内存" name="spec">
										</i>
										运行内存									</label>
								</td>
								<td></td>
							</tr>
													<tr>
								<td>
									<label for="attribute_check8">
										<i class="checkbox-common">
											<input type="checkbox" id="attribute_check8" value="42" spec_name="规格1" name="spec">
										</i>
										规格1									</label>
								</td>
								<td></td>
							</tr>
												
					</tbody>
				</table>
			</div>
			<div class="modal-footer">
				<button type="button" class="btn-common btn-big" onclick="setSku();">确定</button>
				<button type="button" class="btn-common-cancle btn-big" data-dismiss="modal">关闭</button>
			</div>
		</div>
	</div>
</div>

<!--设置品牌 -->
<div class="modal fade hide" id="setGoodsBrand" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
	<div class="modal-dialog">
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
				<h3>关联品牌设置</h3>
			</div>
			<div class="modal-body">
				<div class="brand_content">
										<div class="brand_item " brand_id="4">
						<div class="img_content"><img src="" alt=""></div>
						<p>索尼</p>
					</div>
										<div class="brand_item select" brand_id="5">
						<div class="img_content"><img src="" alt=""></div>
						<p>三星</p>
					</div>
										<div class="brand_item " brand_id="2">
						<div class="img_content"><img src="" alt=""></div>
						<p>小米</p>
					</div>
									</div>
			</div>
			<div class="modal-footer">
				<label class="radio inline normal all-select" style="float: left;">
					<i class="checkbox-common">
						<input type="checkbox" name="">
					</i>
					<span style="user-select: none">全选</span>
				</label>
				<button type="button" class="btn-common btn-big" onclick="setBrand();">确定</button>
				<button type="button" class="btn-common-cancle btn-big" data-dismiss="modal">关闭</button>
			</div>
		</div>
	</div>
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
		
	</div></section>
</template>
