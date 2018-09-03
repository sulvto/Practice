<template>
    <section class="ns-base-section">
		
		
		
		<div style="position:relative;margin:0;">
			<!-- 面包屑导航 -->
						<div class="breadcrumb-nav">
				<a href="index.html">零基础学IT就来</a>
									<i class="fa fa-angle-right"></i>
					<a href="/config/webconfig.html">设置</a>
									<i class="fa fa-angle-right"></i>
					<!-- 需要加跳转链接用这个：http://showfx.niuteam.cn/admin/config/payconfig -->
					<a href="javascript:;" style="color:#999;">微信支付</a>
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
									<p>微信支付</p>
									<hr>
																		<h4>功能提示</h4>
									<p class="function-prompts">
配置路径写法： 由于数字证书要求安全性比较高，所以针对独立服务器建议写绝对路径，也就是文件在服务器中的路径地址。针对虚拟主机服务器，由于只有虚拟主机的目录，只能讲数字证书放在系统内部，所以使用相对路径的写法，也就是相对系统根目录的路径。
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
<!-- 						<span>微信支付</span> -->
<!-- 						 -->
<!-- 					{1/block} -->
				</h4>
			</div>
		</div>
		
		
		<div class="ns-main">
			
<div class="set-style">
	<dl>
		<dt>应用ID：</dt>
		<dd>
			<input id="APP_KEY" type="text" value="" class="input-common long">
			<p class="hint"><i class="important-note">[AppID]</i>微信支付对应公众账号APPID</p>
		</dd>
	</dl>
	<dl>
		<dt>应用密钥：</dt>
		<dd>
			<input id="APP_SECRET" type="text" value="" class="input-common long">
			<p class="hint"><i class="important-note">[AppSecrect]</i>微信支付对应公众账号APPS</p>
		</dd>
	</dl>
		<dl>
		<dt>支付专用签名串：</dt>
		<dd>
			<input id="paySignKey" type="text" value="" class="input-common long">
			<p class="hint"><i class="important-note">[paySignKey]</i>微信商户API密钥</p>
		</dd>
	</dl>
	<dl>
		<dt>微信支付商户号：</dt>
		<dd>
			<input id="MCHID" type="text" value="" class="input-common long">
			<p class="hint"><i class="important-note">[MCHID]</i>微信支付商户号</p>
		</dd>
	</dl>
	<dl>
		<dt>支付授权目录：</dt>
		<dd><span class="text" style="background-color: white; border: none;min-width: 500px;display: inline-block;font-size: 13px;cursor: pointer;color:#468847;" id="empowerUrl" value="">http://showfx.niuteam.cn/wap/pay/</span></dd>
	</dl>
	
	<dl>
		<dt>apiclient_cert：</dt>
		<dd>
			<input id="apiclient_cert" type="text" class="input-common w500" placeholder="请填写绝对路径">
		</dd>
	</dl>
	
	<dl>
		<dt>apiclient_key.pem：</dt>
		<dd>
			<input id="apiclient_key" type="text" class="input-common w500" placeholder="请填写绝对路径">
		</dd>
	</dl>
	<dl>
		<dt>是否启用支付：</dt>
		<dd>
			<p>
				<input id="is_use" type="checkbox" class="checkbox" checked="checked" simpleswitch="0" result="true" style="display: none;"><div class="Switch Switch_FlatRadius On" id="Switch0"><span class="switch-open">是</span><span class="switch-close">否</span></div>
			</p>
		</dd>
	</dl>
	<!-- 原路退款设置 开始-->

	<dl>
		<dt>是否启用退款：</dt>
		<dd>
			<p><input id="refund_is_use" type="checkbox" class="checkbox" checked="checked" simpleswitch="1" result="true" style="display: none;"><div class="Switch Switch_FlatRadius On" id="Switch1"><span class="switch-open">是</span><span class="switch-close">否</span></div></p>
			<p class="hint">需要配置微信支付同时配置好apiclient_cert和apiclient_key的绝对路径才可以进行后续操作</p>
		</dd>
	</dl>
	<!-- 原路退款设置结束 -->
	
	<!-- 转账设置 开始-->
	<dl>
		<dt>是否启用转账：</dt>
		<dd>
			<p><input id="transfer_is_use" type="checkbox" class="checkbox" checked="checked" simpleswitch="2" result="true" style="display: none;"><div class="Switch Switch_FlatRadius On" id="Switch2"><span class="switch-open">是</span><span class="switch-close">否</span></div></p>
			<p class="hint">需要配置微信支付同时配置好apiclient_cert和apiclient_key的绝对路径才可以进行后续操作</p>
		</dd>
	</dl>
		
	<!-- 转账设置 结束-->
	<dl>
		<dt></dt>
		<dd>
			<button class="btn-common btn-big" onclick="setConfigAjax()">保存</button>
			<button class="btn-common-cancle btn-big" onclick="javascript:history.back(-1);">返回</button>
		</dd>
	</dl>
</div>
<script>
function setConfigAjax(){
	var appkey = $("#APP_KEY").val();
	var appsecret = $("#APP_SECRET").val();
	var paySignKey = $("#paySignKey").val();
	var MCHID = $("#MCHID").val();
	var is_use = 0;
	
	var originalRoadRefund = new Object();
	originalRoadRefund.is_use = $("#refund_is_use").is(":checked") ? 1 : 0;
	originalRoadRefund.apiclient_cert = $.trim($("#apiclient_cert").val());
	originalRoadRefund.apiclient_key = $.trim($("#apiclient_key").val());
	
	var originalRoadTransfer = new Object();
	originalRoadTransfer.is_use = $("#transfer_is_use").is(":checked") ? 1 : 0;
	
	
	if($("#apiclient_cert").val().length>300){
		showTip("apiclient_cert绝对路径超出字数限制","warning");
		$("#apiclient_cert").focus();
		return false;
	}
	
	if($("#apiclient_key").val().length>300){
		showTip("apiclient_key绝对路径超出字数限制","warning");
		$("#apiclient_key").focus();
		return false;
	}
	
	if($("#is_use").is(":checked")){
		is_use = 1;
	}
	
	
	$.ajax({
		type:"post",
		url:"http://showfx.niuteam.cn/admin/config/wchatconfig.html",
		data:{
			'appkey':appkey,
			'appsecret':appsecret,
			'paySignKey':paySignKey,
			'MCHID':MCHID,
			'type':'wchat',
			'is_use' : is_use,
			
			'value' : JSON.stringify(originalRoadRefund),
			'transferValue' : JSON.stringify(originalRoadTransfer)
		},
		success:function (data) {
			if (data["code"] > 0) {
				showTip(data["message"],"success");
				location.href=__URL("http://showfx.niuteam.cn/admin/config/paymentconfig");
			}else{
				showTip(data["message"],"error");
			}
		}
	});
}
</script>

			<script type="text/javascript" src="/public/static/js/jquery.cookie.js"></script>
<script src="/public/static/js/page.js"></script>
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
<script>
/**
 * 保存当前的页面
 * 创建时间：2017年8月30日 19:29:20
 */
function savePage(index){
	var json = { page_index : index, show_number : $("#showNumber").val(), url :  window.location.href };
	$.cookie('page_cookie',JSON.stringify(json),{ path: '/' });
 	//console.log(json);
}

$(function() {
	try{
		
		$("#turn-ul").show();//显示分页
		var history_url = "";
		var json = { page_index : 1, show_number : 14, url :  window.location.href };
		var history_json = "";//用于临时保存分页数据
		if($.cookie('page_cookie') != undefined && $.cookie('page_cookie') != "" && $.cookie('page_cookie') != '""'){
			
			var cookie = eval("(" + $.cookie('page_cookie') + ")");
			if(cookie !=undefined && cookie != ""){
				json.page_index = cookie.page_index;
				if(cookie.show_number != undefined && cookie.show_number != "") json.show_number = cookie.show_number;
				else json.show_number = 14;
				history_url = cookie.url;
				history_json = cookie;
			}
			
		}else{
			
			savePage(json.page_index);
			
		}
		if(history_url != undefined && history_url != "" && history_url != json.url && json.page_index != 1){
			
			//如果页面发生了跳转，还原操作
			json.page_index = 1;
			json.show_number = 14;
			json.url = history_url;
 			//console.log("如果页面发生了跳转，还原操作");
			$.cookie('page_cookie',JSON.stringify(json),{ path: '/' });
		}

 		//console.log($.cookie('page_cookie'));
		$("#showNumber").val(json.show_number);
		if(json.page_index != 1) jumpNumber = json.page_index;
		LoadingInfo(json.page_index);//通过此方法调用分页类
		
	}catch(e){
		
		$("#turn-ul").hide();
		//当前页面没有分页，进行还原操作
		$.cookie('page_cookie',JSON.stringify(history_json),{ path: '/' });
//		console.error(e);
 		//console.log("当前页面没有分页，进行还原操作");
 		//console.log($.cookie('page_cookie'));
	}
	
	//首页
	$("#beginPage").click(function() {
		if(jumpNumber!=1){
			jumpNumber = 1;
			LoadingInfo(1);
			savePage(1);
			changeClass("begin");
		}
		return false;
	});

	//上一页
	$("#prevPage").click(function() {
		var obj = $(".currentPage");
		var index = parseInt(obj.text()) - 1;
		if (index > 0) {
			obj.removeClass("currentPage");
			obj.prev().addClass("currentPage");
			jumpNumber = index;
			LoadingInfo(index);
			savePage(index);
			//判断是否是第一页
			if (index == 1) {
				changeClass("prev");
			} else {
				changeClass();
			}
		}
		return false;
	});

	//下一页
	$("#nextPage").click(function() {
		var obj = $(".currentPage");
		//当前页加一（下一页）
		var index = parseInt(obj.text()) + 1;
		if (index <= $("#page_count").val()) {
			jumpNumber = index;
			LoadingInfo(index);
			savePage(index);
			obj.removeClass("currentPage");
			obj.next().addClass("currentPage");
			//判断是否是最后一页
			if (index == $("#page_count").val()) {
				changeClass("next");
			} else {
				changeClass();
			}
		}
		return false;
	});

	//末页
	$("#lastPage").click(function() {
		jumpNumber = $("#page_count").val();
		if(jumpNumber>1){
			LoadingInfo(jumpNumber);
			savePage(jumpNumber);
			$("#pageNumber a:eq("+ (parseInt($("#page_count").val()) - 1) + ")").text($("#page_count").val());
			changeClass("next");
		}
		return false;
	});

	//每页显示页数
	$("#showNumber").blur(function(){
		if(isNaN($(this).val())){
			$("#showNumber").val(20);
			jumpNumber = 1;
			LoadingInfo(jumpNumber);
			savePage(jumpNumber);
			return;
		}
		if($(this).val().indexOf(".") != -1){
			var index = $(this).val().indexOf(".");
			$("#showNumber").val($(this).val().substr(0,index));
			jumpNumber = 1;
			LoadingInfo(jumpNumber);
			savePage(jumpNumber);
			return;
		}
		if(parseInt($(this).val())<=0){
			jumpNumber = 1;
			LoadingInfo(jumpNumber);
			savePage(jumpNumber);
			return;
		}
		//页数没有变化的话，就不要再执行查询
		if(parseInt($(this).val()) != $(this).attr("data-default")){
// 			jumpNumber = 1;//设置每页显示的页数，并且设置到第一页
			$(this).attr("data-default",$(this).val());
			LoadingInfo(jumpNumber);
			savePage(jumpNumber);
		}
		return false;
	}).keyup(function(event){
		if(event.keyCode == 13){
			if(isNaN($(this).val())){
				$("#showNumber").val(20);
				jumpNumber = 1;
				LoadingInfo(jumpNumber);
				savePage(jumpNumber);
			}
			//页数没有变化的话，就不要再执行查询
			if(parseInt($(this).val()) != $(this).attr("data-default")){
// 				jumpNumber = 1;//设置每页显示的页数，并且设置到第一页
				$(this).attr("data-default",$(this).val());
				//总数据数量
				var total_count = parseInt($(".total-data").attr("data-total-count"));
				//计算用户输入的页数是否超过当前页数
				var curr_count = Math.ceil(total_count/parseInt($(this).val()));
				if( curr_count !=0 && curr_count < jumpNumber){
					jumpNumber = curr_count;//输入的页数超过了，没有那么多
				}
				LoadingInfo(jumpNumber);
				savePage(jumpNumber);
			}
		}
		return false;
	});

	// 跳转到某页
	$("#skipPage").blur(function(){
		if(isNaN($(this).val()) || $(this).val().length == 0){
			$("#showNumber").val(20);
			jumpNumber = 1;
			LoadingInfo(jumpNumber);
			savePage(jumpNumber);
			return;
		}
		if(parseInt($(this).val())<=0){
			jumpNumber = 1;
			LoadingInfo(jumpNumber);
			savePage(jumpNumber);
			return;
		}
		if(parseInt($(this).val()) > $("#page_count").val()){
			jumpNumber = $("#page_count").val();
			LoadingInfo(jumpNumber);
			savePage(jumpNumber);
			$(this).val(jumpNumber);
			return;
		}
		if(parseInt($(this).val()) == parseInt($(this).attr("data-curr-page"))){
			return;
		}
		jumpNumber = $(this).val();
		LoadingInfo(jumpNumber);
		savePage(jumpNumber);		
	}).keyup(function(event){
		if(event.keyCode == 13){
			if(isNaN($(this).val())){
				$("#showNumber").val(20);
				jumpNumber = 1;
				LoadingInfo(jumpNumber);
				savePage(jumpNumber);
			}
			if(parseInt($(this).val())<=0){
				jumpNumber = 1;
				LoadingInfo(jumpNumber);
				savePage(jumpNumber);
				return;
			}
			if(parseInt($(this).val()) > $("#page_count").val()){
				jumpNumber = $("#page_count").val();
				LoadingInfo(jumpNumber);
				savePage(jumpNumber);
				$(this).val(jumpNumber);
				return;
			}
			if(parseInt($(this).val()) == parseInt($(this).attr("data-curr-page"))){
				return;
			}
			jumpNumber = $(this).val();
			LoadingInfo(jumpNumber);
			savePage(jumpNumber);
		}
		return false;
	});
});

//跳转页面
function JumpForPage(obj) {
	jumpNumber = $(obj).text();
	LoadingInfo($(obj).text());
	savePage($(obj).text());
	$(".currentPage").removeClass("currentPage");
	$(obj).addClass("currentPage");
	if (jumpNumber == 1) {
		changeClass("prev");
	} else if (jumpNumber < parseInt($("#page_count").val())) {
		changeClass();
	} else if (jumpNumber == parseInt($("#page_count").val())) {
		changeClass("next");
	}
}
</script>
		</div>
		
	</section>
</template>
