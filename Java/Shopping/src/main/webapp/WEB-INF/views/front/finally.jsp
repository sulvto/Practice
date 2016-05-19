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
					<font class="ts"><a href="/shoppingcart">购物车</a></font>| <a
						href="#">简体中文</a> | <a href="#">繁体中文</a> | <a href="#">English</a>
				</div>

				<div class="tr-mid">
					<div class="trm-l">缅甸翡翠全球配送</div>
					<c:if test="${sessionScope.USER_IN_SESSION.username==null}">

						<div class="trm-r">
							<a href="/register?cmd=user"><img src="/images/fc_13.jpg" /><label
								for="button"> </label></a> <a href="/register?cmd=toRegistUI"> <img
								src="/images/fc_15.jpg" /> <label for="button2"></label></a>
						</div>
					</c:if>
					<div class="trm-r">
						<c:if test="${sessionScope.USER_IN_SESSION.username!=null}">
					当前用户 :  ${sessionScope.USER_IN_SESSION.username}
					<a href="logout">注销</a>
					</div>
					</c:if>
				</div>

				<div class="tr-bottom">
					<dt>
						<font class="tr-bottomtb"><a href="">首页</a></font>
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
					<div class="mainunit01-l">
						<div class="ml-top">
							<h1>玉品类别</h1>
							<h2>
								<a href="#">详细&gt;&gt;</a>
							</h2>
						</div>
						<dt>
							<a href="#">观音佛陀 Kwan-yin Buddha</a>
						</dt>
						<dd>
							<a href="#">翡翠手镯 Jade Bangle</a>
						</dd>
						<dt>
							<a href="#">指环戒指 Ring Finger Ring</a>
						</dt>
						<dd>
							<a href="#">手链项链 Bracelet Necklace</a>
						</dd>
						<dt>
							<a href="#">胸针耳饰 Brooch Eardrop</a>
						</dt>
						<dd>
							<a href="#">十二生肖 Chinese Zodiac</a>
						</dd>
						<dt>
							<a href="#">招财貔貅 Lucky PiXiu</a>
						</dt>
						<dd>
							<a href="#">翡翠金蟾 Jade Jinchan</a>
						</dd>
						<dt>
							<a href="#">如意挂件 Ruyi Pendant</a>
						</dt>
						<dd>
							<a href="#">裸石界面 Interface</a>
						</dd>
						<dt>
							<a href="#">翡翠原石 Jade Stone</a>
						</dt>
						<dd>
							<a href="#">摆件玩件 Decoration</a>
						</dd>
						<dt>
							<a href="#">指环戒指 Ring Finger Ring</a>
						</dt>
					</div>

					<div class="woman">
						<img src="/images/woman_3.jpg"
							onMouseOver="this.src='images/woman_3over.jpg';"
							onMouseOut="this.src='images/woman_3.jpg'"
							onClick="this.src='images/woman_3.jpg'">
					</div>
				</div>

				<div class="main02right">
					<div class="m02r-top">
						首页 &gt; 玉品类别 &gt; 观音佛陀 &gt; <font class="orange03">最终产品展示</font>
					</div>

					<div class="productshow">
						<img src="${pro.bigPic}" width="698" height="510" alt="" />
					</div>

					<div class="subpicshow">
						<img src="${pro.smallPic}" width="105" height="75" alt=""><img
							src="${pro.smallPic}" width="105" height="75" alt=""><img
								src="${pro.smallPic}" width="105" height="75" alt=""><img
									src="${pro.smallPic}" width="105" height="75" alt="">
					</div>

					<div class="price">
						<h1>
							市场价格：￥${pro.marketPrice}元 华氏价格：<span class="orange08">￥${pro.salePrice}元</span>
						</h1>
						<h2>
							<a href="/shoppingcart?cmd=add&id=${pro.id}"> <img
								src="/images/fc02_36.jpg" />
							</a>
						</h2>
					</div>

					<div class="productshowtitle01">商品信息</div>
					<table width="100%" border="0" cellspacing="2" cellpadding="0">
						<tr>
							<td width="145" class="tableleft">名 称</td>
							<td class="tablefont">${pro.name}</td>
						</tr>
						<tr>
							<td class="tableleft">编 号</td>
							<td class="tablefont02">${pro.sn}</td>
						</tr>
						<tr>
							<td class="tableleft">规 格</td>
							<td class="tablefont">${pro.model}</td>
						</tr>
						<tr>
							<td class="tableleft">产 地</td>
							<td class="tablefont02">${pro.place}</td>
						</tr>
						<tr>
							<td class="tableleft">数 量</td>
							<td class="tablefont">${pro.num}&nbsp;</td>
						</tr>
						<tr>
							<td class="tableleft">重 量</td>
							<td class="tablefont02">0.1235克&nbsp;</td>
						</tr>
						<tr>
							<td class="tableleft">鉴定结论</td>
							<td class="tablefont">鉴定结论Appraisal：天然翡翠A货； 折光率Refractive
								Index :1.66；放大检查Magnificat:纤维交织结构</td>
						</tr>
						<tr>
							<td class="tableleft">介 绍</td>
							<td class="tablefont02">${pro.intro}</td>
						</tr>
						<tr>
							<td class="tableleft">购物配送</td>
							<td class="tablefont">华氏美玉珍藏翠玉礼盒；<br /> 中国结艺设计手工编织挂绳；<br />
								国家权威翡翠鉴定A货证书；<br /> 国内EMS特快专递；<br /> 注：国际邮费由买家支付
							</td>
						</tr>
					</table>
					<div class="productshowtitle01">购物流程</div>

					<div class="lc">
						<img src="/images/fc03_29_3.jpg" width="84" height="58" /><img
							src="/images/fc03_29_5.jpg" width="84" height="58" /><img
							src="/images/fc03_29_7.jpg" width="84" height="58" /><img
							src="/images/fc03_29_9.jpg" width="84" height="57" /><img
							src="/images/fc03_29_11.jpg" width="84" height="58" /><img
							src="/images/fc03_29_13.jpg" width="84" height="57" />
					</div>
					<div class="productshowtitle01">玉友评论</div>

					<div class="pl">
						<div class="pltitle">
							<h1>暂无评论</h1>
							<h2>
								<a href="#">关闭评论</a>
							</h2>

							<div class="plcont">
								昵称： <label for="textfield"></label> <input type="text"
									name="textfield" class="textfieldpl" /> 密码： <input type="text"
									name="textfield2" class="textfieldpl" /> （如果您是华氏珠宝会员，请输入账号和密码）<br />
								<input type="checkbox" name="checkbox" id="checkbox" /> <label
									for="checkbox"></label> <label for="radio"></label>
								匿名（如果不是华氏珠宝会员，请选择匿名留言，也可以先<span class="orange">注册</span>成为会员后留言）<br />
								内容： <label for="textarea"></label>
								<textarea name="textarea" id="textarea" class="textareapl"
									cols="45" rows="5"></textarea>

								<div class="ok">
									回复数据，清空内容<img src="/images/show_3.jpg" width="82" height="23" />
								</div>
							</div>
						</div>
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
