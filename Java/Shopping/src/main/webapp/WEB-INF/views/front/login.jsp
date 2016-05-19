<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>无标题文档</title>
<link href="css/fc.css" rel="stylesheet" type="text/css" />
<link href="css/fc02.css" rel="stylesheet" type="text/css" />
<script type="text/JavaScript">
<!--
	function MM_swapImgRestore() { //v3.0
		var i, x, a = document.MM_sr;
		for (i = 0; a && i < a.length && (x = a[i]) && x.oSrc; i++)
			x.src = x.oSrc;
	}

	function MM_preloadImages() { //v3.0
		var d = document;
		if (d.images) {
			if (!d.MM_p)
				d.MM_p = new Array();
			var i, j = d.MM_p.length, a = MM_preloadImages.arguments;
			for (i = 0; i < a.length; i++)
				if (a[i].indexOf("#") != 0) {
					d.MM_p[j] = new Image;
					d.MM_p[j++].src = a[i];
				}
		}
	}

	function MM_findObj(n, d) { //v4.01
		var p, i, x;
		if (!d)
			d = document;
		if ((p = n.indexOf("?")) > 0 && parent.frames.length) {
			d = parent.frames[n.substring(p + 1)].document;
			n = n.substring(0, p);
		}
		if (!(x = d[n]) && d.all)
			x = d.all[n];
		for (i = 0; !x && i < d.forms.length; i++)
			x = d.forms[i][n];
		for (i = 0; !x && d.layers && i < d.layers.length; i++)
			x = MM_findObj(n, d.layers[i].document);
		if (!x && d.getElementById)
			x = d.getElementById(n);
		return x;
	}

	function MM_swapImage() { //v3.0
		var i, j = 0, x, a = MM_swapImage.arguments;
		document.MM_sr = new Array;
		for (i = 0; i < (a.length - 2); i += 3)
			if ((x = MM_findObj(a[i])) != null) {
				document.MM_sr[j++] = x;
				if (!x.oSrc)
					x.oSrc = x.src;
				x.src = a[i + 2];
			}
	}
//-->
function submitForm() {
	document.forms[0].submit();
}
</script>
<script type="text/javascript" src="/js/jQuery/core/jquery-1.8.2.js">
</script>
<script type="text/javascript" src="/js/systemlogin.js">
</script>

</head>

<body
	onload="MM_preloadImages('images/hs_03hover.jpg','images/hs_05over.jpg')">
	<div id="box">
		<div class="top">
			<div class="top-left"></div>
			<div class="top-right">
				<div class="tr-top">
					<font class="ts"><a href="/shoppingcart">购物车</a></font>| <a href="#">简体中文</a> |
					<a href="#">繁体中文</a> | <a href="#">English</a>
				</div>

				<div class="tr-mid">
					<div class="trm-l">缅甸翡翠全球配送</div>
					<c:if test="${sessionScope.USER_IN_SESSION.username==null}">
					
					<div class="trm-r">
						<a href="/register?cmd=user"><img src="/images/fc_13.jpg" /><label
							for="button"> </label></a> 
							<a href="/register?cmd=toRegistUI"> <img
							src="/images/fc_15.jpg" /> <label for="button2"></label></a>
					</div>
					</c:if>
					<div class="trm-r">
					<c:if test="${sessionScope.USER_IN_SESSION.username!=null}">
					当前用户 :  ${sessionScope.USER_IN_SESSION.username}
					<!-- <a href="/logout">注销</a> -->
					</div>
					</c:if>
				</div>

				</div>
				<div class="tr-bottom">
					<dt>
						<font class="tr-bottomtb"><a href="/index">首页</a></font>
					</dt>
					<dt>
						<a href="#">华氏超市</a>
					</dt>
					<dt>
						<a href="#">华氏批发</a>
					</dt>
					<dt>
						<a href="#">经典推荐</a>
					</dt>
					<dt>特价专区</dt>
					<dt>
						<a href="#">翡翠课堂</a>
					</dt>
					<dt>
						<a href="#">华氏沙龙</a>
					</dt>
				</div>
			</div>
		</div>
		<div class="top02">
			<div class="mk">
				<label for="textfield02"></label> <label for="select"></label>

				<table width="700" border="0" cellspacing="0" cellpadding="0">
					<tr>
						<td width="165"><li>所有分类</li></td>
						<td width="165"><li>所有分类</li></td>
						<td width="198"><label for="textfield02"></label> <input
							type="text" name="textfield02" class="textfield04" /></td>
						<td><img src="images/homehl_3.jpg"
							onMouseOver="this.src='images/homehl_3over.jpg';"
							onMouseOut="this.src='images/homehl_3.jpg'"
							onClick="this.src='images/homehl_3click.jpg'"></td>
						<td>&nbsp;</td>
					</tr>
				</table>
			</div>

			<div class="keywords">
				热门搜索：<a href="#">观音</a> <font class="yellow"><a href="#">玉佛</a></font>
				<a href="#">戒指</a> <a href="#">生肖</a> <a href="#">手链</a> <a href="#">吊坠</a>
				<a href="#">手镯</a> <font class="yellow"><a href="#">摆件</a></font> <a
					href="#">貔貅</a>
			</div>
		</div>


		<div class="main">
			<div class="mainunit01">
				<div class="main02leftadd">
					<h3>帮助中心</h3>
					<div class="mainunit010-l">
						<div class="ml-top05">
							<h1>个人资料</h1>
						</div>
						<dt>
							<a href="#">个人信息</a>
						</dt>
						<dt>
							<a href="#">修改密码</a>
						</dt>
					</div>
					<div class="mainunit010-l">
						<div class="ml-top05">
							<h1>消费明细</h1>
						</div>
						<dt>我的购物车</dt>
						<dt>账目明细</dt>
					</div>
					<div class="mainunit010-l">
						<div class="ml-top05">
							<h1>互动社区</h1>
						</div>
						<dt>
							<a href="#">玉友沙龙</a>
						</dt>
						<dt>
							<a href="#">我的留言</a>
						</dt>
						<dt>
							<a href="#">我的帖子</a>
						</dt>
						<dt>
							<a href="#">在线咨询</a>
						</dt>
					</div>


				</div>
				<div class="main02right">
					<div class="m02r-top">
						首页 &gt; 玉品类别 &gt; 玉品类别 &gt; <font class="orange03">挂件吊坠</font>
					</div>

					${error}
					<div class="hyzc2">
						<form action="/login?type=user" method="post">
							<table width="100%" border="0" cellspacing="0" cellpadding="0">
								<tr>
									<td width="60"><div align="right">账号：</div></td>
									<td><label> <input  type="text" id="username"
											class="fkklsj" required />
									</label></td>
								</tr>
								<input id="type" type="hidden" value="user" />
								<tr>
									<td><div align="right">密码：</div></td>
									<td><input id="password" type="password" class="fkklsj"
										required /></td>
								</tr>
								
								<tr>
									<td>&nbsp;</td>
									<td><input type="button" id="submit" value="" class="button" /></td>
								</tr>
								<tr>
									<td>&nbsp;</td>
									<td class="zcdbc" > 忘记密码了吗？<span class="lvse"><a
											href="#">点击</a></span>找回密码
									</td>
								</tr>
								<span id="error" ></span>
							</table>
						</form>
					</div>
					<br />
				</div>
			</div>
			<div class="kfzx">
				<div class="kf01">
					<div class="kf01s">
						<table width="100%" border="0" cellspacing="0" cellpadding="0">
							<tr>
								<td width="46"><img src="images/fc_111.jpg" height="59"
									alt="" /></td>
								<td>在线MSN：<img src="images/fc_108.jpg" width="73"
									height="17" alt="" /><br /> 在线QQ： <img
									src="images/fc_117.jpg" width="73" height="21" alt="" /><br />
									在线客服：<img src="images/fc_127.jpg" width="77" height="18" alt="" /></td>
							</tr>
						</table>
					</div>

					<div class="tel02">
						<li>客服电话<font class="green">：0692-4118235</font></li>
						<li>手机短信：<font class="orange">13099491279</font></li>
						<li>CEO信箱：pxsilling@vip.qq.com</li>
					</div>
				</div>

				<div class="kf02">
					<img src="images/fc_93.jpg" width="109" height="45" alt="" /><br />
					<li><a href="#">网上下单</a></li>
					<li><a href="#">网上下单</a></li>
					<li><a href="#">网上下单</a></li>
					<li><a href="#">网上下单</a></li>

				</div>
				<div class="kf02">
					<img src="images/fc_95.jpg" width="121" height="45" alt="" /><br />
					<li><a href="#">网上下单</a></li>
					<li><a href="#">网上下单</a></li>
					<li><a href="#">网上下单</a></li>
					<li><a href="#">网上下单</a></li>

				</div>
				<div class="kf02">
					<img src="images/fc_97.jpg" width="124" height="45" alt="" /><br />
					<li><a href="#">网上下单</a></li>
					<li><a href="#">网上下单</a></li>
					<li><a href="#">网上下单</a></li>
					<li><a href="#">网上下单</a></li>

				</div>
				<div class="kf02">
					<img src="images/fc_99.jpg" width="129" height="45" alt="" /><br />
					<li><a href="#">网上下单</a></li>
					<li><a href="#">网上下单</a></li>
					<li><a href="#">网上下单</a></li>
					<li><a href="#">网上下单</a></li>

				</div>
				<div class="kf03">
					<img src="images/fc_101.jpg" width="119" height="45" alt="" /><br />
					<li><a href="#">网上下单</a></li>
					<li><a href="#">网上下单</a></li>
					<li><a href="#">网上下单</a></li>
					<li><a href="#">网上下单</a></li>

				</div>
			</div>
			<div class="mainbottom">
				<dt>
					<a href="#">关于华氏</a> | <a href="#">工作机会</a> | <a href="#">联系我们</a>
					| <a href="#">推荐产品</a> | <a href="#">网站声明</a> | <a href="#">
						隐私权政策</a> | <a href="#">合作伙伴</a>
				</dt>
				<dd>
					Copyright 2008-2009 www.chinadrtv.com All Rights Reserved 华氏珠宝版权所有<br />
					ICP证:沪ICP备05041682号 增值电信业务经营许可证 编号：B2-20050374
				</dd>
			</div>
		</div>
	</div>
</body>
</html>
