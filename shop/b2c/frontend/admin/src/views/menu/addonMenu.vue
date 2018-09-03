<template>
	
	<section class="ns-base-section">
		
		
		
		<div style="position:relative;margin:0;">
			<!-- 面包屑导航 -->
						<div class="breadcrumb-nav">
				<a href="index.html">大鵬系統</a>
									<i class="fa fa-angle-right"></i>
					<a href="/wchat/config.html">微信</a>
									<i class="fa fa-angle-right"></i>
					<!-- 需要加跳转链接用这个：http://showfx.niuteam.cn/admin/wchat/menu_wchat?addons=wxtemplatemsg -->
					<a href="javascript:;" style="color:#999;">模板消息设置</a>
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
									<p>模板消息插件菜单</p>
									<hr>
																		<h4>功能提示</h4>
									<p class="function-prompts">
<strong>提示：</strong>如果，请查看是否是由于以下原因造成：<br>
1、是否添加了”模板消息“功能插件。添加方法：在微信公众平台的左侧菜单点击”添加功能插件“按钮，在右侧点击”模板消息“，再点击”申请“，填写”申请开通模板消息接口“表单，点击”提交“，等待审核通过即可。<br>
2、在微信公众平台的“模板库”里点击“修改行业”，弹出层里面的“主营行业”全部选择“消费品”，”副营行业“全部选择”其它“;<br>
3、在微信公众平台里”我的模板“最多添加15个，如果多于15个，请删除不用的模板。
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
<!-- 						<span>模板消息插件菜单</span> -->
<!-- 						 -->
<!-- 					{1/block} -->
				</h4>
			</div>
		</div>
		
		
		<div class="ns-main">
			
<div class="options-btn">
	<button class="btn-common btn-big" onclick="getTemplateId()">获取</button>
</div>
<div class="server-msg content">
<!-- 	<div class="mb10"> -->
<!-- 		<div class="tiphelp-info"> -->
<!-- 			<strong>提示：</strong>如果，请查看是否是由于以下原因造成：<br> -->
<!-- 			1、是否添加了”模板消息“功能插件。添加方法：在微信公众平台的左侧菜单点击”添加功能插件“按钮，在右侧点击”模板消息“，再点击”申请“，填写”申请开通模板消息接口“表单，点击”提交“，等待审核通过即可。<br> -->
<!-- 			2、在微信公众平台的“模板库”里点击“修改行业”，弹出层里面的“主营行业”全部选择“消费品”，”副营行业“全部选择”其它“;<br> -->
<!-- 			3、在微信公众平台里”我的模板“最多添加15个，如果多于15个，请删除不用的模板。 -->
<!-- 		</div> -->
<!-- 	</div> -->
	<table class="table-class">
		<colgroup>
			<col style="width: 3%;">
			<col style="width: 20%">
			<col style="width: 20%">
			<col style="width: 27%">
			<col style="width: 30%">
		</colgroup>
		<tbody>
			<tr>
				<th><i class="checkbox-common"><input type="checkbox" onclick="CheckAll(this)"></i></th>
				<th align="left">编号</th>
				<th align="left">标题</th>
				<th align="left">内容示例</th>
				<th>模板ID</th>
				<th>是否启用</th>
			</tr>
		</tbody>
		<tbody id="grouplis">
						<tr name="li">
				<td align="center"><i class="checkbox-common"><input name="sub" type="checkbox" value="$info[" template_id"]"=""></i></td>
				<td align="left">OPENTM203347141</td>
				<td align="left">会员注册成功通知</td>
				<td align="left">
					<div class="example-txt">
						恭喜，您已成功注册为会员！<br> 姓名：何某某<br>联系方式：187xxxxxxxx<br>
						店铺类型：普通店铺 <br>恭喜，您已成为会员，您将享受会员所有权利！					</div>
				</td>
				<td></td>
				<td><input type="checkbox" class="checkbox" onchange="changeIsEnable(1, this)" checked="" simpleswitch="0" result="true" style="display: none;"><div class="Switch Switch_FlatRadius On" id="Switch0"><span class="switch-open">是</span><span class="switch-close">否</span></div></td>
			</tr>
						<tr name="li">
				<td align="center"><i class="checkbox-common"><input name="sub" type="checkbox" value="$info[" template_id"]"=""></i></td>
				<td align="left">OPENTM200444240</td>
				<td align="left">订单提交成功通知</td>
				<td align="left">
					<div class="example-txt">
						亲！您已成功创建订单，点击进入完成付款。<br> 姓名：何某某<br>联系方式：187xxxxxxxx<br>
						店铺类型：普通店铺 <br>感谢您的支持，我们将为您提供更好的服务。					</div>
				</td>
				<td></td>
				<td><input type="checkbox" class="checkbox" onchange="changeIsEnable(2, this)" checked="" simpleswitch="1" result="true" style="display: none;"><div class="Switch Switch_FlatRadius On" id="Switch1"><span class="switch-open">是</span><span class="switch-close">否</span></div></td>
			</tr>
						<tr name="li">
				<td align="center"><i class="checkbox-common"><input name="sub" type="checkbox" value="$info[" template_id"]"=""></i></td>
				<td align="left">OPENTM201541214</td>
				<td align="left">订单发货通知</td>
				<td align="left">
					<div class="example-txt">
						亲，你的订单已发货<br> 姓名：何某某<br>联系方式：187xxxxxxxx<br>
						店铺类型：普通店铺 <br>请关注订单,注意查收					</div>
				</td>
				<td></td>
				<td><input type="checkbox" class="checkbox" onchange="changeIsEnable(3, this)" checked="" simpleswitch="2" result="true" style="display: none;"><div class="Switch Switch_FlatRadius On" id="Switch2"><span class="switch-open">是</span><span class="switch-close">否</span></div></td>
			</tr>
						<tr name="li">
				<td align="center"><i class="checkbox-common"><input name="sub" type="checkbox" value="$info[" template_id"]"=""></i></td>
				<td align="left">OPENTM200444326</td>
				<td align="left">订单付款成功通知</td>
				<td align="left">
					<div class="example-txt">
						亲！您的订单已成功付款。<br> 姓名：何某某<br>联系方式：187xxxxxxxx<br>
						店铺类型：普通店铺 <br>					</div>
				</td>
				<td></td>
				<td><input type="checkbox" class="checkbox" onchange="changeIsEnable(4, this)" checked="" simpleswitch="3" result="true" style="display: none;"><div class="Switch Switch_FlatRadius On" id="Switch3"><span class="switch-open">是</span><span class="switch-close">否</span></div></td>
			</tr>
						<tr name="li">
				<td align="center"><i class="checkbox-common"><input name="sub" type="checkbox" value="$info[" template_id"]"=""></i></td>
				<td align="left">OPENTM207103254</td>
				<td align="left">退款申请</td>
				<td align="left">
					<div class="example-txt">
						您已申请退款，我们将尽快处理您提交的退款申请。您可以在“退换货”中查看退款进度<br> 姓名：何某某<br>联系方式：187xxxxxxxx<br>
						店铺类型：普通店铺 <br>如您的退款有疑问，请联系我们的客服人员，帮助您解决处理！					</div>
				</td>
				<td></td>
				<td><input type="checkbox" class="checkbox" onchange="changeIsEnable(5, this)" checked="" simpleswitch="4" result="true" style="display: none;"><div class="Switch Switch_FlatRadius On" id="Switch4"><span class="switch-open">是</span><span class="switch-close">否</span></div></td>
			</tr>
						<tr name="li">
				<td align="center"><i class="checkbox-common"><input name="sub" type="checkbox" value="$info[" template_id"]"=""></i></td>
				<td align="left">OPENTM205986235</td>
				<td align="left">退款结果通知</td>
				<td align="left">
					<div class="example-txt">
						亲，您的退款已处理。<br> 姓名：何某某<br>联系方式：187xxxxxxxx<br>
						店铺类型：普通店铺 <br>如您还有疑问，请与客服人员联系。					</div>
				</td>
				<td></td>
				<td><input type="checkbox" class="checkbox" onchange="changeIsEnable(6, this)" checked="" simpleswitch="5" result="true" style="display: none;"><div class="Switch Switch_FlatRadius On" id="Switch5"><span class="switch-open">是</span><span class="switch-close">否</span></div></td>
			</tr>
						<tr name="li">
				<td align="center"><i class="checkbox-common"><input name="sub" type="checkbox" value="$info[" template_id"]"=""></i></td>
				<td align="left">OPENTM207292959</td>
				<td align="left">提现申请提醒</td>
				<td align="left">
					<div class="example-txt">
						亲，您的提现申请已提交<br> 姓名：何某某<br>联系方式：187xxxxxxxx<br>
						店铺类型：普通店铺 <br>我们将在1到3个工作日内处理完毕，请耐心等待。					</div>
				</td>
				<td></td>
				<td><input type="checkbox" class="checkbox" onchange="changeIsEnable(7, this)" checked="" simpleswitch="6" result="true" style="display: none;"><div class="Switch Switch_FlatRadius On" id="Switch6"><span class="switch-open">是</span><span class="switch-close">否</span></div></td>
			</tr>
						<tr name="li">
				<td align="center"><i class="checkbox-common"><input name="sub" type="checkbox" value="$info[" template_id"]"=""></i></td>
				<td align="left">OPENTM400094285</td>
				<td align="left">提现审核结果通知</td>
				<td align="left">
					<div class="example-txt">
						亲，您提现申请已通过<br> 姓名：何某某<br>联系方式：187xxxxxxxx<br>
						店铺类型：普通店铺 <br>我们将在1到3个工作日内处理完毕，请耐心等待。					</div>
				</td>
				<td></td>
				<td><input type="checkbox" class="checkbox" onchange="changeIsEnable(8, this)" checked="" simpleswitch="7" result="true" style="display: none;"><div class="Switch Switch_FlatRadius On" id="Switch7"><span class="switch-open">是</span><span class="switch-close">否</span></div></td>
			</tr>
						<tr name="li">
				<td align="center"><i class="checkbox-common"><input name="sub" type="checkbox" value="$info[" template_id"]"=""></i></td>
				<td align="left">OPENTM409846856</td>
				<td align="left">申请通过通知</td>
				<td align="left">
					<div class="example-txt">
						您的推广员申请已经通过<br> 姓名：何某某<br>联系方式：187xxxxxxxx<br>
						店铺类型：普通店铺 <br>如您还有疑问，请与客服人员联系。					</div>
				</td>
				<td></td>
				<td><input type="checkbox" class="checkbox" onchange="changeIsEnable(9, this)" checked="" simpleswitch="8" result="true" style="display: none;"><div class="Switch Switch_FlatRadius On" id="Switch8"><span class="switch-open">是</span><span class="switch-close">否</span></div></td>
			</tr>
						<tr name="li">
				<td align="center"><i class="checkbox-common"><input name="sub" type="checkbox" value="$info[" template_id"]"=""></i></td>
				<td align="left">OPENTM409846856</td>
				<td align="left">下级申请通过通知</td>
				<td align="left">
					<div class="example-txt">
						您的下级推广员申请已经通过<br> 姓名：何某某<br>联系方式：187xxxxxxxx<br>
						店铺类型：普通店铺 <br>如您还有疑问，请与客服人员联系。					</div>
				</td>
				<td></td>
				<td><input type="checkbox" class="checkbox" onchange="changeIsEnable(10, this)" checked="" simpleswitch="9" result="true" style="display: none;"><div class="Switch Switch_FlatRadius On" id="Switch9"><span class="switch-open">是</span><span class="switch-close">否</span></div></td>
			</tr>
						<tr name="li">
				<td align="center"><i class="checkbox-common"><input name="sub" type="checkbox" value="$info[" template_id"]"=""></i></td>
				<td align="left">OPENTM409846856</td>
				<td align="left">下下级申请通过通知</td>
				<td align="left">
					<div class="example-txt">
						您的下下级推广员申请已经通过<br> 姓名：何某某<br>联系方式：187xxxxxxxx<br>
						店铺类型：普通店铺 <br>如您还有疑问，请与客服人员联系。					</div>
				</td>
				<td></td>
				<td><input type="checkbox" class="checkbox" onchange="changeIsEnable(11, this)" checked="" simpleswitch="10" result="true" style="display: none;"><div class="Switch Switch_FlatRadius On" id="Switch10"><span class="switch-open">是</span><span class="switch-close">否</span></div></td>
			</tr>
						<tr name="li">
				<td align="center"><i class="checkbox-common"><input name="sub" type="checkbox" value="$info[" template_id"]"=""></i></td>
				<td align="left">OPENTM201010537</td>
				<td align="left">本店分销订单提成通知</td>
				<td align="left">
					<div class="example-txt">
						亲，您已成功分销出一笔订单，继续努力哦<br> 姓名：何某某<br>联系方式：187xxxxxxxx<br>
						店铺类型：普通店铺 <br>					</div>
				</td>
				<td></td>
				<td><input type="checkbox" class="checkbox" onchange="changeIsEnable(12, this)" checked="" simpleswitch="11" result="true" style="display: none;"><div class="Switch Switch_FlatRadius On" id="Switch11"><span class="switch-open">是</span><span class="switch-close">否</span></div></td>
			</tr>
						<tr name="li">
				<td align="center"><i class="checkbox-common"><input name="sub" type="checkbox" value="$info[" template_id"]"=""></i></td>
				<td align="left">OPENTM201010537</td>
				<td align="left">下级分店分销订单提成通知</td>
				<td align="left">
					<div class="example-txt">
						亲，您的下级推广员成功分销出一笔订单，继续努力哦<br> 姓名：何某某<br>联系方式：187xxxxxxxx<br>
						店铺类型：普通店铺 <br>					</div>
				</td>
				<td></td>
				<td><input type="checkbox" class="checkbox" onchange="changeIsEnable(13, this)" checked="" simpleswitch="12" result="true" style="display: none;"><div class="Switch Switch_FlatRadius On" id="Switch12"><span class="switch-open">是</span><span class="switch-close">否</span></div></td>
			</tr>
						<tr name="li">
				<td align="center"><i class="checkbox-common"><input name="sub" type="checkbox" value="$info[" template_id"]"=""></i></td>
				<td align="left">OPENTM201010537</td>
				<td align="left">下下级分店分销订单提成通知</td>
				<td align="left">
					<div class="example-txt">
						亲，您的下下级推广员成功分销出一笔订单，继续努力哦<br> 姓名：何某某<br>联系方式：187xxxxxxxx<br>
						店铺类型：普通店铺 <br>					</div>
				</td>
				<td></td>
				<td><input type="checkbox" class="checkbox" onchange="changeIsEnable(14, this)" checked="" simpleswitch="13" result="true" style="display: none;"><div class="Switch Switch_FlatRadius On" id="Switch13"><span class="switch-open">是</span><span class="switch-close">否</span></div></td>
			</tr>
					</tbody>
	</table>

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
