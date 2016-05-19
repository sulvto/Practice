<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>无标题文档</title>
<link href="css/fc.css" rel="stylesheet" type="text/css" />
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
							onClick="this.src='/images/homehl_3click.jpg'" /></td>
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
				<div class="mainunit01-l">
					<div class="ml-top">
						<h1>玉品类别</h1>
						<h2>
							<a href="#">详细&gt;&gt;</a>
						</h2>
					</div>
					<c:forEach items="${dirs}" var="d">
						<dt>
							<a href="#">${d.name} ${d.englishName}</a>
						</dt>
					</c:forEach>
				</div>


				<div class="mainunit01-mid">
					<div class="uint01mid-top">
						<img src="/images/homehl_14.jpg" width="391" height="215" />
					</div>
					<div class="uint01mid-bottom">
						<div class="unit01b-top">
							<h1>新闻中心</h1>
							<h2>
								<a href="#">更多&gt;&gt;</a>
							</h2>
						</div>

						<div class="unit01-main">
							<dd>2009-02-24</dd>
							<dt>
								<a href="#">2010年中国将有2.5亿消费者采购珠宝首选缅甸翡翠</a>
							</dt>
							<dd>2009-02-24</dd>
							<dt>
								<a href="#">2010年中国将有2.5亿消费者采购珠宝首选缅甸翡翠</a>
							</dt>
							<dd>2009-02-24</dd>
							<dt>
								<a href="#">2010年中国将有2.5亿消费者采购珠宝首选缅甸翡翠</a>
							</dt>
							<dd>2009-02-24</dd>
							<dt>
								<a href="#">2010年中国将有2.5亿消费者采购珠宝首选缅甸翡翠</a>
							</dt>
							<dd>2009-02-24</dd>
							<dt>
								<a href="#">2010年中国将有2.5亿消费者采购珠宝首选缅甸翡翠</a>
							</dt>
						</div>
					</div>
				</div>

				<div class="mainunitright">
					<div class="unit01rtop">
						<div class="rrr-top">
							<h1>华氏公告</h1>
							<h2>
								<a href="/WEB-INF/views/front/helpText.html">详细>></a>
							</h2>
						</div>

						<div class="rrr-cont">
							华氏玉业采用先进电子商务平台，依靠瑞丽珠宝街和缅甸玉石生产厂家，联合打造中国翡翠市场网络第一品牌。华氏定位中高档翡翠饰品的网络营销，兼顾中低档翡翠饰品的批发零售业务。
							本行所售玉石有全国联保证书。我们诚信经营， 全球配送，竭诚为玉友提供优质服务。<br />
						</div>
					</div>


					<div class="unit01rbottom">
						<div class="urbtop">
							<h1>我们的优势</h1>
							<h2>
								<a href="#">详细>></a>
							</h2>
						</div>
						<div class="urbcont">
							<div class="leftpic">
								<img src="images/homehl_19.jpg" name="pic01" id="pic01" /><img
									src="images/homehl_22.jpg" name="pic02" id="pic02" />
							</div>

							<div class="urrightcont">
								<dt>
									<a href="#">品质：接受全球专业珠宝鉴定机构鉴定</a>
								</dt>
								<dt>
									<a href="#">价优：减少中间环节实行B-C和F-C</a>
								</dt>
								<dt>
									<a href="#">时尚：名家设计，与国际款式同步</a>
								</dt>
								<dt>
									<a href="#">专注：专营缅甸纯天然翡翠全球配送 </a>
								</dt>
								<dt>
									<a href="#">品牌：最佳网购珠宝翡翠机构</a>
								</dt>
								<dt>
									<a href="#">服务：十天内包退换</a>
								</dt>

							</div>
						</div>
					</div>
				</div>
			</div>
			<div class="mainunit02">
				<div class="mainunit02">
					<div class="unit02-top">
						<h1>华氏新品</h1>
						<h2>
							<a href="#">查看详细>></a>
						</h2>
					</div>
					<div class="unit02cont">
						<div class="unit02left">
							<c:forEach items="${newProducts}" var="pro">
								<div class="picproducts">
									<a href="/font/pro?cmd=views&id=${pro.id}"><img
										src="${pro.smallPic}" width="143" height="102" alt="" />
										<h1>${pro.name}</h1>
										<h2>市场报价:￥${pro.marketPrice}</h2>
										<h3>
											华氏实价:<font color="#FF4C00">￥${pro.salePrice}</font>
										</h3></a>
								</div>
							</c:forEach>

						</div>

						<div class="unit02right">
							<a href="#"><img src="/images/fc_55.jpg" width="234"
								height="173" alt="" /></a>
							<dt>
								产品名称：<font class="green">老坑玻璃荧光翡翠站佛</font>
							</dt>
							<dt>
								<font class="del">市场价格：￥1280</font> <font class="bold">华氏实价：</font><font
									class="orange">￥2398</font>
							</dt>
							<dt>产地：缅甸，仅限于缅甸北部密支那矿区宝石级翡翠</dt>
							<dt>规格：长25.8厘米/宽18.56厘米/高1.25毫米</dt>
							<label for="button4"></label>
							<div class="botton01">
								<label for="button4"></label> <input type="submit"
									name="button3" id="button3" value=" " /><input name="button4"
									type="button" id="button4" value=" " />
							</div>
							<br />

						</div>
					</div>

					<div class="unit02bottom"></div>
				</div>
				<div class="mainunit02">
					<div class="unit02-top">
						<h1>华氏热门</h1>
						<h2>
							<a href="#">查看详细>></a>
						</h2>
					</div>

					<div class="unit02cont">
						<div class="unit02left">
							<c:forEach items="${hotProducts}" var="pro">
								<div class="picproducts">

									<a href="/font/pro?cmd=views&id=${pro.id}"> <img
										src="${pro.smallPic}" alt="">
											<h1>${pro.name}</h1>
											<h2>市场报价:￥${pro.marketPrice}</h2>
											<h3>
												华氏实价:<font color="#FF4C00">￥${pro.salePrice}</font>
											</h3></a>
								</div>
							</c:forEach>
						</div>


						<div class="mainbottom">
							<div class="kfzx">
								<div class="kf01">
									<div class="kf01s">
										<table width="100%" border="0" cellspacing="0" cellpadding="0">
											<tr>
												<td width="46"><img src="/images/fc_111.jpg"
													height="59" alt="" /></td>
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
							<dt>
								<a href="#">关于华氏</a> | <a href="#">工作机会</a> | <a href="#">联系我们</a>
								| <a href="#">推荐产品</a> | <a href="#">网站声明</a> | <a href="#">
									隐私权政策</a> | <a href="#">合作伙伴</a>
							</dt>
							<dd>
								Copyright 2008-2009 www.chinadrtv.com All Rights Reserved
								华氏珠宝版权所有<br /> ICP证:沪ICP备05041682号 增值电信业务经营许可证 编号：B2-20050374
							</dd>
						</div>
					</div>
				</div>
</body>
</html>
