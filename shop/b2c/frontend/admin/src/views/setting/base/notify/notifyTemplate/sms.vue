<template>
    <section class="ns-base-section">
		
		
		
		<div style="position:relative;margin:0;">
			<!-- 面包屑导航 -->
						<div class="breadcrumb-nav">
				<a href="index.html">零基础学IT就来</a>
									<i class="fa fa-angle-right"></i>
					<a href="/config/webconfig.html">设置</a>
									<i class="fa fa-angle-right"></i>
					<!-- 需要加跳转链接用这个：http://showfx.niuteam.cn/admin/config/notifytemplate -->
					<a href="javascript:;" style="color:#999;">模板管理</a>
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
			
<input type="hidden" id="curr_selectid" value="after_register">
<div class="set-style">
<div class="template-message">短信通知模板</div>
	<div class="tab-pane active">
		<div class="left_main">
			<ul>
									<a href="javascript:void(0);" onclick="template_onclick(this);" id="after_register" class="active">
						<li>注册成功							<span class="leftcheckbox">
															<input id="adminCode" type="checkbox" class="checkbox" onchange="check_change(this);" name="after_register" simpleswitch="0" result="false" style="display: none;"><div class="Switch Switch_FlatRadius" id="Switch0"><span class="switch-open">是</span><span class="switch-close">否</span></div>
														</span>
						</li>
					</a>
									<a href="javascript:void(0);" onclick="template_onclick(this);" id="register_validate">
						<li>注册验证							<span class="leftcheckbox">
															<input id="adminCode" type="checkbox" class="checkbox" onchange="check_change(this);" name="register_validate" simpleswitch="1" result="false" style="display: none;"><div class="Switch Switch_FlatRadius" id="Switch1"><span class="switch-open">是</span><span class="switch-close">否</span></div>
														</span>
						</li>
					</a>
									<a href="javascript:void(0);" onclick="template_onclick(this);" id="recharge_success">
						<li>充值成功							<span class="leftcheckbox">
															<input id="adminCode" type="checkbox" class="checkbox" onchange="check_change(this);" name="recharge_success" simpleswitch="2" result="false" style="display: none;"><div class="Switch Switch_FlatRadius" id="Switch2"><span class="switch-open">是</span><span class="switch-close">否</span></div>
														</span>
						</li>
					</a>
									<a href="javascript:void(0);" onclick="template_onclick(this);" id="confirm_order">
						<li>确认订单							<span class="leftcheckbox">
															<input id="adminCode" type="checkbox" class="checkbox" onchange="check_change(this);" name="confirm_order" simpleswitch="3" result="false" style="display: none;"><div class="Switch Switch_FlatRadius" id="Switch3"><span class="switch-open">是</span><span class="switch-close">否</span></div>
														</span>
						</li>
					</a>
									<a href="javascript:void(0);" onclick="template_onclick(this);" id="pay_success">
						<li>付款成功							<span class="leftcheckbox">
															<input id="adminCode" type="checkbox" class="checkbox" onchange="check_change(this);" name="pay_success" simpleswitch="4" result="false" style="display: none;"><div class="Switch Switch_FlatRadius" id="Switch4"><span class="switch-open">是</span><span class="switch-close">否</span></div>
														</span>
						</li>
					</a>
									<a href="javascript:void(0);" onclick="template_onclick(this);" id="create_order">
						<li>下单成功							<span class="leftcheckbox">
															<input id="adminCode" type="checkbox" class="checkbox" onchange="check_change(this);" name="create_order" simpleswitch="5" result="false" style="display: none;"><div class="Switch Switch_FlatRadius" id="Switch5"><span class="switch-open">是</span><span class="switch-close">否</span></div>
														</span>
						</li>
					</a>
									<a href="javascript:void(0);" onclick="template_onclick(this);" id="order_deliver">
						<li>订单发货							<span class="leftcheckbox">
															<input id="adminCode" type="checkbox" class="checkbox" onchange="check_change(this);" name="order_deliver" simpleswitch="6" result="false" style="display: none;"><div class="Switch Switch_FlatRadius" id="Switch6"><span class="switch-open">是</span><span class="switch-close">否</span></div>
														</span>
						</li>
					</a>
									<a href="javascript:void(0);" onclick="template_onclick(this);" id="forgot_password">
						<li>找回密码							<span class="leftcheckbox">
															<input id="adminCode" type="checkbox" class="checkbox" onchange="check_change(this);" name="forgot_password" simpleswitch="7" result="false" style="display: none;"><div class="Switch Switch_FlatRadius" id="Switch7"><span class="switch-open">是</span><span class="switch-close">否</span></div>
														</span>
						</li>
					</a>
									<a href="javascript:void(0);" onclick="template_onclick(this);" id="bind_mobile">
						<li>手机绑定							<span class="leftcheckbox">
															<input id="adminCode" type="checkbox" class="checkbox" onchange="check_change(this);" name="bind_mobile" simpleswitch="8" result="false" style="display: none;"><div class="Switch Switch_FlatRadius" id="Switch8"><span class="switch-open">是</span><span class="switch-close">否</span></div>
														</span>
						</li>
					</a>
									<a href="javascript:void(0);" onclick="template_onclick(this);" id="open_the_group">
						<li>开团通知							<span class="leftcheckbox">
															<input id="adminCode" type="checkbox" class="checkbox" onchange="check_change(this);" name="open_the_group" simpleswitch="9" result="false" style="display: none;"><div class="Switch Switch_FlatRadius" id="Switch9"><span class="switch-open">是</span><span class="switch-close">否</span></div>
														</span>
						</li>
					</a>
									<a href="javascript:void(0);" onclick="template_onclick(this);" id="add_the_group">
						<li>参团通知							<span class="leftcheckbox">
															<input id="adminCode" type="checkbox" class="checkbox" onchange="check_change(this);" name="add_the_group" simpleswitch="10" result="false" style="display: none;"><div class="Switch Switch_FlatRadius" id="Switch10"><span class="switch-open">是</span><span class="switch-close">否</span></div>
														</span>
						</li>
					</a>
									<a href="javascript:void(0);" onclick="template_onclick(this);" id="group_booking_success">
						<li>拼团成功							<span class="leftcheckbox">
															<input id="adminCode" type="checkbox" class="checkbox" onchange="check_change(this);" name="group_booking_success" simpleswitch="11" result="false" style="display: none;"><div class="Switch Switch_FlatRadius" id="Switch11"><span class="switch-open">是</span><span class="switch-close">否</span></div>
														</span>
						</li>
					</a>
									<a href="javascript:void(0);" onclick="template_onclick(this);" id="group_booking_fail">
						<li>拼团失败							<span class="leftcheckbox">
															<input id="adminCode" type="checkbox" class="checkbox" onchange="check_change(this);" name="group_booking_fail" simpleswitch="12" result="false" style="display: none;"><div class="Switch Switch_FlatRadius" id="Switch12"><span class="switch-open">是</span><span class="switch-close">否</span></div>
														</span>
						</li>
					</a>
									<a href="javascript:void(0);" onclick="template_onclick(this);" id="bargain_launch">
						<li>砍价发起							<span class="leftcheckbox">
															<input id="adminCode" type="checkbox" class="checkbox" onchange="check_change(this);" name="bargain_launch" simpleswitch="13" result="false" style="display: none;"><div class="Switch Switch_FlatRadius" id="Switch13"><span class="switch-open">是</span><span class="switch-close">否</span></div>
														</span>
						</li>
					</a>
									<a href="javascript:void(0);" onclick="template_onclick(this);" id="bargain_success">
						<li>砍价成功							<span class="leftcheckbox">
															<input id="adminCode" type="checkbox" class="checkbox" onchange="check_change(this);" name="bargain_success" simpleswitch="14" result="false" style="display: none;"><div class="Switch Switch_FlatRadius" id="Switch14"><span class="switch-open">是</span><span class="switch-close">否</span></div>
														</span>
						</li>
					</a>
							</ul>
		</div>
		<div class="right_main">
			<div class="main-top">您正在编辑<a href="javascript:;" id="update_nameid">注册成功</a>通知模板</div>
			<div class="qianming"><div style="width:75px;float:left;">模板ID：</div><input type="text" id="template_titleid" value="" style="margin-right: 15px !important;" class="input-common"><span style="font-size:13px;">必须与阿里大于的模板ID一致，否则无效!</span></div>
			<div class="qianming"><div style="width:75px;float:left;">短信签名：</div><input type="text" id="signNameid" style="margin-right: 15px !important;" value="" class="input-common"><span style="font-size:13px;">与阿里大于内短信签名保持一致!</span></div>
			<div class="bl">
				<div style="width:75px;float:left;">可用变量：</div>
				<div style="width:88%;float: left;font-size:13px;" id="user_variable">shopname(商场名称),username(用户名称)</div>
			</div>
			
		</div>
	</div>
	<div class="save">
		<button class="btn-common btn-big" onclick="template_submit();">保存</button>
		<button class="btn-common-cancle btn-big" onclick="javascript:history.back(-1);">返回</button>
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
		
	</section>
</template>
