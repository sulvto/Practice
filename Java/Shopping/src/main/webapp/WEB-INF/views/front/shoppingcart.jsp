<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>无标题文档</title>
<link href="/css/fc.css" rel="stylesheet" type="text/css" />
<link href="/css/fc02.css" rel="stylesheet" type="text/css" />
</head>

<body>
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
					<a href="/logout">注销</a>
					</div>
					</c:if>
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
						<td><img src="/images/homehl_3.jpg"
							onMouseOver="this.src='/images/homehl_3over.jpg';"
							onMouseOut="this.src='/images/homehl_3.jpg'"
							onClick="this.src='/images/homehl_3click.jpg'"></td>
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
						<dt>
							<a href="#">我的购物车</a>
						</dt>
						<dt>
							<a href="#">账目明细</a>
						</dt>
						<dt>
							<a href="#">收货地址</a>
						</dt>
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
					<div class="listtitle04">
						<a href="#">购物清单</a> &gt; <font class="ganlan">订单确认</font> &gt; <a
							href="#">支付贷款</a>
					</div>
					<div class="gwqdtitle05">
						<div class="gl">购物清单</div>

						<div class="gr">
							<a href="#">更新购物清单</a>
						</div>
					</div>
					<div class="kuang">
						<div class="ddqrtitle">
							订单确认 <a href="#">修改</a>
						</div>
						<c:if test="${!empty items}">
						<c:forEach items="${items}" var="item">
							<div class="listunit">
								<a href="#"><img src="${item.pro.smallPic}" alt=""
									width="170" height="120" class="listunitpic" />
									<dl>
										<div class="bottonunit02">
										<a href="/shoppingcart?cmd=delete&id=${item.id}">
											<img src="/images/qrdd_7.jpg">
											</a>
										</div>
										<h1>产品名称：${item.pro.name}</h1>
										<dt>
											市场价格<font class="black">：￥${item.pro.marketPrice}</font>
											华氏实价：<font class="orange08">￥${item.price}</font>
										</dt>
										<dt>产 地：${item.pro.place}</dt>
										<dt>规 格：${item.pro.model}</dt>
										<dt>编 号：${item.pro.sn}</dt>
										<dt>购买数量：${item.num}</dt>
									</dl> </a>
							</div>

						</c:forEach>
					</div>
					<div class="gwje">
						购物金额小计：<span class="orange03">￥${sessionScope.SHOPPINGCART_IN_SESSION.totalPrice}</span>，比市场价<span
							class="green02">￥${sessionScope.SHOPPINGCART_IN_SESSION.totalMarketPrice}</span>节省了<span class="orange03">￥${sessionScope.SHOPPINGCART_IN_SESSION.totalMarketPrice-sessionScope.SHOPPINGCART_IN_SESSION.totalPrice}</span>
					</div>
						</c:if>
						<c:if test="${empty items}">购物车为空</c:if>
					<div class="tjan">
					<a href="/index">	<img src="/images/gwc_15.jpg"
							title="继续购物"/></a><img
							src="/images/gwc_17.jpg"
							onmouseover="this.src='/images/gwc_17over.jpg';"
							onmouseout="this.src='/images/gwc_17.jpg'"
							onclick="this.src='/images/gwc_17.jpg'" />
					</div>

				</div>

			</div>
			<div class="kfzx">
				<div class="kf01">
					<div class="kf01s">
						<table width="100%" border="0" cellspacing="0" cellpadding="0">
							<tr>
								<td width="46"><img src="/images/fc_111.jpg" height="59"
									alt="" /></td>
								<td>在线MSN：<img src="/images/fc_108.jpg" width="73"
									height="17" alt="" /><br /> 在线QQ： <img
									src="/images/fc_117.jpg" width="73" height="21" alt="" /><br />
									在线客服：<img src="/images/fc_127.jpg" width="77" height="18"
									alt="" /></td>
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
					<img src="/images/fc_93.jpg" width="109" height="45" alt="" /><br />
					<li><a href="#">网上下单</a></li>
					<li><a href="#">网上下单</a></li>
					<li><a href="#">网上下单</a></li>
					<li><a href="#">网上下单</a></li>

				</div>
				<div class="kf02">
					<img src="/images/fc_95.jpg" width="121" height="45" alt="" /><br />
					<li><a href="#">网上下单</a></li>
					<li><a href="#">网上下单</a></li>
					<li><a href="#">网上下单</a></li>
					<li><a href="#">网上下单</a></li>

				</div>
				<div class="kf02">
					<img src="/images/fc_97.jpg" width="124" height="45" alt="" /><br />
					<li><a href="#">网上下单</a></li>
					<li><a href="#">网上下单</a></li>
					<li><a href="#">网上下单</a></li>
					<li><a href="#">网上下单</a></li>

				</div>
				<div class="kf02">
					<img src="/images/fc_99.jpg" width="129" height="45" alt="" /><br />
					<li><a href="#">网上下单</a></li>
					<li><a href="#">网上下单</a></li>
					<li><a href="#">网上下单</a></li>
					<li><a href="#">网上下单</a></li>

				</div>
				<div class="kf03">
					<img src="/images/fc_101.jpg" width="119" height="45" alt="" /><br />
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
