<template>
  <section class="ns-base-section">

    <div class="ns-notice">
      <nav>
        <ul>
          <li>网站名称：<span>单商户B2C</span></li>
          <li>当前版本：<span>企业版2.5.2</span></li>
          <li>最后登录时间：<span>2018-08-25 02:05:24</span></li>
          <li>最后登录IP：<span>222.211.248.180</span></li>
          <li class="nav" style="display:none;">
            <a href="http://b2c.niuteam.cn/admin.html">单商户B2C</a>

            <i class="fa fa-angle-right" />
            <a href="/index/index.html">首页</a>

            <i class="fa fa-angle-right" />
            需要加跳转链接用这个：http://b2c.niuteam.cn/admin/index/index
            <a href="javascript:;">欢迎页</a>
          </li>
        </ul>
      </nav>
    </div>

    <div style="height:20px;" />

    <!-- 操作提示 -->

    <div class="ns-main">

      <div class="statistical">
        <ul>
          <li>
            <div class="left">
              <img src="@/assets/img/order_amount.png">
            </div>
            <div class="right">
              <strong class="js-order-amount">0.00</strong>
              <p>今日订单总金额(元)</p>
            </div>
          </li>
          <li>
            <div class="left">
              <img src="@/assets/img/focus_number.png">
            </div>
            <div class="right">
              <strong class="js-weixin-fans-count">0</strong>
              <p>关注人数(个)</p>
            </div>
          </li>
          <li>
            <div class="left">
              <img src="@/assets/img/goods_release.png">
            </div>
            <div class="right">
              <strong class="js-goods-release-count">1</strong>
              <p>商品发布(个)</p>
            </div>
          </li>
          <li>
            <div class="left">
              <img src="@/assets/img/order_total.png">
            </div>
            <div class="right">
              <strong class="js-order-total">1</strong>
              <p>订单总数(笔)</p>
            </div>
          </li>
          <li>
            <div class="left">
              <img src="@/assets/img/month_sales.png">
            </div>
            <div class="right">
              <strong class="js-month-sales">1</strong>
              <p>本月销量(笔)</p>
            </div>
          </li>
          <li>
            <div class="left">
              <img src="@/assets/img/finish_count.png">
            </div>
            <div class="right">
              <strong class="js-order-finish-count">1</strong>
              <p>已完成交易(笔)</p>
            </div>
          </li>
        </ul>
      </div>

      <div class="goods-prompt">
        <h3>
          <i class="i-circular" />店铺及商品提示<span>您需要关注的店铺信息以及待处理事项</span>
        </h3>
        <div class="goods-state a-line">
          <ul>
            <li>
              <a href="/goods/goodslist.html?state=1">
                <strong class="goods_sale_count">1</strong>
                <span>出售中</span>
              </a>
            </li>
            <li>
              <a href="/goods/goodslist.html?state=0">
                <strong class="goods_audit_count">1</strong>
                <span>仓库中</span>
              </a>
            </li>
            <li>
              <a href="/saleservice/consultlist.html?type=to_reply">
                <strong class="goods_consult_count">1</strong>
                <span>待回复咨询</span>
              </a>
            </li>
            <li>
              <a href="/member/usercommissionwithdrawlist.html">
                <strong class="member_balance_withdraw">1</strong>
                <span>会员提现审核</span>
              </a>
            </li>
            <li>
              <a href="/goods/goodslist.html?stock_warning=1">
                <strong class="stock_early_warning">1</strong>
                <span>库存预警</span>
              </a>
            </li>
          </ul>
        </div>
      </div>

      <div class="merchants-help">
        <h3>
          <i class="i-circular" />商家帮助<span>您需要的商家帮助</span>
        </h3>
        <div class="merchants-use">
          <ul>
            <li>
              <a href="/goods/goodslist.html"><img src="@/assets/img/goods_management.png"><span>商品管理</span></a>
            </li>
            <li>
              <a href="/promotion/coupontypelist.html"><img src="@/assets/img/promotions.png"><span>促销方式</span></a>
            </li>
            <li>
              <a href="/order/orderlist.html"><img src="@/assets/img/order_after.png"><span>订单及售后</span></a>
            </li>
          </ul>
        </div>
      </div>

      <div class="goods-prompt">
        <h3>
          <i class="i-circular" />交易提示<span>您需要立即处理的交易订单</span>
        </h3>
        <div class="goods-state a-line order">
          <ul>
            <li>
              <a href="/order/orderlist.html?status=0">
                <strong class="daifukuan">0</strong>
                <span>待付款</span>
              </a>
            </li>
            <li>
              <a href="/order/orderlist.html?status=1">
                <strong class="daifahuo">1</strong>
                <span>待发货</span>
              </a>
            </li>
            <li>
              <a href="/order/orderlist.html?status=2">
                <strong class="yifahuo">0</strong>
                <span>已发货</span>
              </a>
            </li>
            <li>
              <a href="/order/orderlist.html?status=3">
                <strong class="yishouhuo">0</strong>
                <span>已收货</span>
              </a>
            </li>
            <li>
              <a href="/order/orderlist.html?status=4">
                <strong class="yiwancheng">1</strong>
                <span>已完成</span>
              </a>
            </li>
            <!-- <li>
              <a href="/order/orderlist.html?status=5">
                <strong class="yiguanbi">0</strong>
                <span>已关闭</span>
              </a>
            </li> -->
            <li>
              <a href="/order/orderlist.html?status=-1">
                <strong class="tuikuanzhong">1</strong>
                <span>退款中</span>
              </a>
            </li>
            <li>
              <a href="/order/customerServiceList.html">
                <strong class="customer">0</strong>
                <span>售后待处理</span>
              </a>
            </li>
            <li style="display: none;">
              <a href="/order/orderlist.html?status=-2">
                <strong class="yituikuan">0</strong>
                <span>已退款</span>
              </a>
            </li>
          </ul>
        </div>
      </div>

      <div class="sales">
        <h3>
          <i class="i-circular" />销售情况统计<span>按周期统计商家店铺的订单量和订单金额</span>
        </h3>

        <table>
          <tbody>
            <tr>
              <td rowspan="3" align="left" style="background: #f6f6f6;text-align: center;">昨日销量</td>
            </tr>
            <tr>
              <td style=" border-top: 1px solid #f6f6f6;">
                <span>订单量(件)</span>
                <strong class="yesterday_goods">1</strong>
              </td>
            </tr>
            <tr>
              <td>
                <span>订单金额(元)</span>
                <strong class="yesterday_money">0.00</strong>
              </td>
            </tr>

            <tr style="height: 10px;" />

            <tr>
              <td rowspan="3" align="left" style="background: #f6f6f6;text-align: center;">本月销量</td>
            </tr>
            <tr>
              <td style=" border-top: 1px solid #f6f6f6;">
                <span>订单量(件)</span>
                <strong class="month_goods">42</strong>
              </td>
            </tr>
            <tr>
              <td>
                <span>订单金额(元)</span>
                <strong class="month_money">12576.01</strong>
              </td>
            </tr>
          </tbody>
        </table>
      </div>

      <div class="charts">
        <h3>
          <i class="i-circular" />订单总数统计<span><i>&emsp;</i>订单数量</span>
        </h3>

        <ve-line :data="orderCharts" :settings="orderChartSettings" :legend-visible="false" height="270px" />

      </div>

      <div class="sales-ranking">
        <h3>
          <i class="i-circular" />单品销售排名<span>按周期统计商家店铺的订单量和订单金额</span>
        </h3>
        <table>
          <colgroup>
            <col width="15%">
            <col width="70%">
            <col width="15%">
          </colgroup>
          <tbody>
            <tr>
              <td>排行</td>
              <td style="text-align: left;">商品信息</td>
              <td>销量</td>
            </tr>
            <tr>
              <td>
                <span class="frist">
                  1
                </span>
              </td>
              <td title="智能家居电动窗帘遥控wifi自动智能窗帘电机电动遥控窗帘轨道" style="text-align: left;">
                <a href="http://b2c.niuteam.cn/goods/goodsinfo.html?goodsid=29" target="_blank">智能家居电动窗帘遥控wifi自动智能窗帘...</a>
              </td>
              <td>
                <span class="frist">
                  16
                </span>
              </td>
            </tr>
            <tr>
              <td>
                <span class="second">
                  2
                </span>
              </td>
              <td title="aaa-副本" style="text-align: left;">
                <a href="http://b2c.niuteam.cn/goods/goodsinfo.html?goodsid=89" target="_blank">aaa-副本</a>
              </td>
              <td>
                <span class="second">
                  14
                </span>
              </td>
            </tr>
            <tr>
              <td>
                <span class="third">
                  3
                </span>
              </td>
              <td title="Haier/海尔 BCD-206STPA 206升三门冷藏家用节能小冰箱 软冷冻" style="text-align: left;">
                <a href="http://b2c.niuteam.cn/goods/goodsinfo.html?goodsid=27" target="_blank">Haier/海尔 BCD-206STPA...</a>
              </td>
              <td>
                <span class="third">
                  9
                </span>
              </td>
            </tr>
            <tr>
              <td>
                <span>
                  4
                </span>
              </td>
              <td title="Asus/华硕 X540 X540LJ4005 酷睿i3轻薄独显15.6寸手提笔记本电脑" style="text-align: left;">
                <a href="http://b2c.niuteam.cn/goods/goodsinfo.html?goodsid=48" target="_blank">Asus/华硕 X540 X540LJ4...</a>
              </td>
              <td>
                <span>
                  9
                </span>
              </td>
            </tr>
            <tr>
              <td>
                <span>
                  5
                </span>
              </td>
              <td title="测试-副本" style="text-align: left;">
                <a href="http://b2c.niuteam.cn/goods/goodsinfo.html?goodsid=107" target="_blank">测试-副本</a>
              </td>
              <td>
                <span>
                  9
                </span>
              </td>
            </tr>
            <tr>
              <td>
                <span>
                  6
                </span>
              </td>
              <td title="home指纹识别 苹果6s按键贴iphone7plus按键贴5s手机配件可爱卡通" style="text-align: left;">
                <a href="http://b2c.niuteam.cn/goods/goodsinfo.html?goodsid=54" target="_blank">home指纹识别 苹果6s按键贴ipho...</a>
              </td>
              <td>
                <span>
                  8
                </span>
              </td>
            </tr>
          </tbody>
        </table>
      </div>
      <div class="charts">
        <h3>
          <i class="i-circular" />关注人数统计<span><i>&emsp;</i>关注人数</span>
        </h3>

        <ve-line :data="focusCharts" :settings="focusChartSettings" :legend-visible="false" height="270px" />
      </div>
      <div class="system-config">
        <h3>
          <i class="el-icon-setting" />系统信息
        </h3>
        <table>
          <colgroup>
            <col width="15%">
            <col width="40%">
            <col width="15%">
            <col width="30%">
          </colgroup>
          <tbody>
            <tr>
              <td>服务器操作系统</td>
              <td>Linux iZ8vbe7yd3ei8sbwd7hq6mZ 3.10.0-514.10.2.el7.x86_64 #1 SMP Fri Mar 3 00:04:05 UTC 2017 x86_64</td>
              <td>服务器域名</td>
              <td>b2c.niuteam.cn:80</td>
            </tr>
            <tr>
              <td>服务器环境</td>
              <td>nginx/1.10.2</td>
              <td>PHP版本</td>
              <td>5.6.22</td>
            </tr>
            <tr>
              <td>文件上传限制</td>
              <td>50M</td>
              <td>GD版本</td>
              <td>bundled (2.1.0 compatible)</td>
            </tr>
            <tr>
              <td>sockets开启</td>
              <td>已开启</td>
              <td>curl支持</td>
              <td>支持</td>
            </tr>
            <tr>
              <td>openssl开启</td>
              <td>已开启</td>
              <td>upload目录权限</td>
              <td>可读可写</td>
            </tr>
            <tr>
              <td>runtime目录权限</td>
              <td>可读可写</td>
              <td>&emsp;</td>
              <td>&emsp;</td>
            </tr>
          </tbody>
        </table>
      </div>

    </div>

  </section>

</template>

<script>

export default {
  name: 'Index',
  data () {
    return {
      isIndex: true,
      menuList: [{
        selected: true,
        path: '/index.html',
        name: '欢迎页'
      },
      {
        path: '/goods/add.html',
        name: '商品发布'
      },
      {
        path: '/goods/list.html',
        name: '商品列表'
      },
      {
        path: '/order/list.html',
        name: '订单列表'
      },
      {
        path: '/goods/comment.html',
        name: '商品评价'
      }],
      orderCharts: {
        columns: ['日期', '访问用户', '下单用户', '下单率'],
        rows: [
          { '日期': '1/1', '访问用户': 1393, '下单用户': 1093, '下单率': 0.32 },
          { '日期': '1/2', '访问用户': 3530, '下单用户': 3230, '下单率': 0.26 },
          { '日期': '1/3', '访问用户': 2923, '下单用户': 2623, '下单率': 0.76 },
          { '日期': '1/4', '访问用户': 1723, '下单用户': 1423, '下单率': 0.49 },
          { '日期': '1/5', '访问用户': 3792, '下单用户': 3492, '下单率': 0.323 },
          { '日期': '1/6', '访问用户': 4593, '下单用户': 4293, '下单率': 0.78 }
        ]
      },
      orderChartSettings: {
        metrics: ['访问用户'],
        dimension: ['日期']
      },
      focusCharts: {
        columns: ['时间', '关注人数'],
        rows: [
          { '时间': '0:00', '关注人数': 10 },
          { '时间': '1:00', '关注人数': 17 },
          { '时间': '2:00', '关注人数': 19 },
          { '时间': '3:00', '关注人数': 9 },
          { '时间': '4:00', '关注人数': 18 },
          { '时间': '5:00', '关注人数': 28 },
          { '时间': '6:00', '关注人数': 90 },
          { '时间': '7:00', '关注人数': 100 },
          { '时间': '8:00', '关注人数': 89 },
          { '时间': '9:00', '关注人数': 1080 },
          { '时间': '10:00', '关注人数': 1900 },
          { '时间': '11:00', '关注人数': 2300 },
          { '时间': '12:00', '关注人数': 4593 },
          { '时间': '13:00', '关注人数': 4593 },
          { '时间': '14:00', '关注人数': 4593 },
          { '时间': '15:00', '关注人数': 4593 },
          { '时间': '16:00', '关注人数': 4593 },
          { '时间': '17:00', '关注人数': 4593 },
          { '时间': '18:00', '关注人数': 4593 },
          { '时间': '19:00', '关注人数': 4593 },
          { '时间': '20:00', '关注人数': 4593 },
          { '时间': '21:00', '关注人数': 4593 },
          { '时间': '22:00', '关注人数': 4593 },
          { '时间': '23:00', '关注人数': 4593 }
        ]
      },
      focusChartSettings: {
        metrics: ['关注人数'],
        dimension: ['时间']
      }
    }
  }
}
</script>

<style lang="scss" scoped>

.el-main {
  padding: 0px 0px 40px 0px;
}

h1, h2, h3 {
  line-height: 40px;
}

.ns-base-section {
  position: relative;
  background: #f2f6fc;
}

.ns-notice {
  top: 60px;
  border-bottom: 1px solid #e5e5e5;
  border-left: 1px solid #e5e5e5;
  box-shadow: 0 0 5px #ffffff;
  overflow: hidden;
  height: 39px;
  line-height: 39px;
  position: fixed;
  background: #ffffff;
  width: 100%;
  z-index: 3;
  nav {
    height: 100%;
    float: left;
    padding: 0 10px;
    li {
      float: left;
      padding: 0 10px;
      border-right: 1px solid #e5e5e5;
      height: 39px;
      line-height: 39px;
    }
  }

  .nav {
    height: 100%;
    border-right: 0;
    padding: 0 5px 0;
    margin: 0;
    strong {
      background: #0059d6;
      width: 4px;
      height: 14px;
      display: inline-block;
      vertical-align: middle;
    }
    a {
      padding-right: 3px;
    }

    .i, a {
      color: #333333;
      vertical-align: middle;
    }

    i:hover, a:hover {
      color: #0059d6;
    }
  }

  /*服务电话*/
  .ns-service-telephone {
    float: right;
    padding-right: 15px;
    img {
      vertical-align: middle;
    }
  }
}

ul {
  margin: 0;
  padding: 0;
  list-style-type: none;
  li {
    line-height: 20px;
  }
}

/* 后台首页隐藏功能菜单	.ncsc-path */
.tabmenu, .tabmenu_hr {
	display: none;
}

.ns-main {
  margin: 10px;
  padding-top: 20px;
  overflow: hidden;
  background: transparent;
  min-height: 600px;
  font-family: "Helvetica Neue", Helvetica, Arial, sans-serif;
  font-size: 14px;
  line-height: 20px;
  color: #333333;
}

.main {
	margin: 0;
}

.home {
	overflow: hidden;
	color: #999;
	margin-bottom: 20px;
}

.home article {
	float: left;
}

.home article:FIRST-CHILD {
	width: 40%;
}

.home article:LAST-CHILD {
	width: 60%;
}

.home-shop, .home-info {
	float: left;
}

.home-shop {
	padding: 20px 30px 0px 40px;
}

.home-shop span {
	margin-top: 5px;
	display: block;
	color: #0578c4;
}

.home-info {
	width: 50%;
}

.home-info p {
	margin: 8px 0;
}

.home-info p:FIRST-CHILD {
	margin-top: 20px;
	margin-bottom: 10px;
}

.home-info p:FIRST-CHILD span {
	color: #333;
	font-weight: bold;
	font-size: 16px;
}

.home-info p:NTH-CHILD(2) span {
	color: #666;
}

table {
  max-width: 100%;
  background-color: transparent;
  border-collapse: collapse;
  border-spacing: 0;
}

.last-login-time {
	padding-top: 47px;
}

.level {
	float: left;
}

.text-center {
	text-align: center;
}

.goods-prompt, .merchants-help, .sales, .sales-ranking, .charts,
	.system-config {
	width: 49%;
	float: left;
	height: 258px;
	background: #ffffff;
	margin: 5px 0;
}

.goods-prompt, .charts {
	width: 60%;
}

.system-config {
	width: 100%;
}

.goods-prompt {
	height: inherit;
}

.sales, .merchants-help, .sales-ranking {
	width: 39.5%;
	float: right;
}

.merchants-help {
  height: inherit;
}

.goods-prompt h3, .merchants-help h3, .sales h3, .sales-ranking h3,
	.charts h3, .system-config h3 {
	color: #333;
	padding-left: 10px;
	margin: 0;
	font-size: 14px;
	font-weight: normal;
	overflow: hidden;
	white-space: nowrap;
	text-overflow: ellipsis;
}

.i-circular {
	display: inline-block;
	background: #126AE4;
	border-radius: 50%;
	width: 8px;
	height: 8px;
	margin: -1px 5px 0 0;
	vertical-align: middle;
}

.goods-prompt h3 span, .sales h3 span, .sales-ranking h3 span,
	.merchants-help h3 span, .system-config h3 span {
	padding-left: 10px;
	font-size: 12px;
	color: #999;
	font-weight: normal;
}

.system-config {
	height: inherit;
}

.system-config h3 i {
	padding-right: 3px;
}

.system-config table {
	width: 98%;
	margin: 20px auto;
	border: 1px solid #e5e5e5;
}

.system-config table td {
	border-bottom: 1px solid #e5e5e5;
	border-right: 1px solid #e5e5e5;
	padding: 10px;
	font-size: 14px;
}

.system-config table td:NTH-CHILD(odd) {
	background: #f7f7f7;
	text-align: right;
}

.goods-state {
	overflow: hidden;
	text-align: center;
}

.goods-state.a-line {
	padding: 0 0 30px;
}

.goods-state ul, .merchants-use ul {
	margin: 0;
	overflow: hidden;
}

.goods-state ul li {
	float: left;
	width: 20%;
	margin-top: 30px;
	cursor: pointer;
}

.goods-state.order ul li {
	width: 14%;
}

.goods-state ul li a {
	display: block;
}

.goods-state ul li a strong {
	font-size: 22px;
	font-weight: normal;
	overflow: hidden;
	padding: 0 10px;
	white-space: nowrap;
	text-overflow: ellipsis;
	color: #126AE4;
	display: block;
	margin: 10px 0;
}

.goods-state ul li a span {
	color: #999999;
}

.merchants-use {
	padding: 17px 0;
	overflow: hidden;
}

.merchants-use ul li {
	float: left;
	width: 33.3%;
	text-align: center;
}

.merchants-use ul li span {
	display: block;
	color: #333333;
	margin-top: 10px;
}

.sales table, .sales-ranking table {
	width: 100%;
	text-align: center;
	margin: 0 15px;
  max-width: calc(100% - 30px);
  border: 1px solid #F6F6F6;
}

.sales table {
	margin-top: 0;
}

.sales-ranking table tr:first-child{
	background: #F6F6F6;
}

.sales-ranking table tr td {
	border-bottom: 1px solid #F6F6F6;
  padding: 15px;
  a {
    color: #333333;
  }
}

.sales table tr td {
    padding: 13px 0;
    text-align: left;
    border-bottom: 1px solid #f6f6f6;
    strong {
    color: #333333;
    font-size: 18px;
    font-weight: normal;
    overflow: hidden;
    white-space: nowrap;
    text-overflow: ellipsis;
    margin-left: 20px;
  }
  span {
    color: #999999;
    margin-left: 20px;
    width:90px;
    text-align:right;
    display:inline-block;
  }
}

.sales-ranking {
	height: 442px;
}

.promote-img, .promote-h5 {
	float: left;
}

.promote-img {
	padding: 0 10px;
}

.promote-h5 {
	color: #fff;
	width: 70%;
	font-size: 20px;
}

.promote-h5 span {
	color: #FFFF00;
	font-size: 14px;
	margin-left: 10px;
}

.promote-p {
	color: #fff;
	padding: 10px;
	text-align: left;
	font-size: 12px;
}

.snapup {
	background: #FF8C8C;
}

.time-limit {
	background: #33B5CC;
}

.full_present {
	background: #FF984C;
}

.preferential-suit {
	background: #33CDA6;
}

.black {
	color: #666 !important;
}

.recommended_booth {
	background: #EDC230;
}

.kims_volume {
	background: #7ACE52;
}

.frist {
	color: #F44336;
	font-weight: bold;
	font-size: 19px;
}

.second {
	color: #FF9800;
	font-weight: bold;
	font-size: 17px;
}

.third {
	color: #03A9F4;
	font-weight: bold;
	font-size: 15px;
}

.nother {
	background: #333;
}

.charts-title {
	font-family: "Arial", "Microsoft YaHei", "黑体", "宋体",
		sans-serif !important;
	font-size: 14px;
	color: #FF984C;
	margin-right: 10px;
}

.charts-title:hover {
	cursor: pointer;
}

.charts-title-ordernum {
	color: #999;
	font-size: 12px;
	margin-left: 10px;
}

.charts-title-ordernum i {
	font-style: normal;
	color: #10bbee;
	font-size: 16px;
	vertical-align: middle;
}

.charts {
  height: 264.7px;
}

.charts h3 span {
	float: right;
	margin-right: 20px;
	font-size: 14px;
}

.charts h3 span i {
	width: 12px;
	display: inline-block;
	height: 12px;
	margin-right: 5px;
	vertical-align: middle;
	background: #2E7ED9;
}

/*顶部统计*/
.statistical {
	overflow: hidden;
	background: #ffffff;
	margin-bottom: 5px;
}

.statistical ul li {
	float: left;
	width: 15%;
	color: #999999;
	padding: 10px;
}

.statistical ul li>.left, .statistical ul li>.right {
	float: left;
}

.statistical ul li>.left {
	width: 20%;
	text-align: right;
	line-height: 60px;
}

.statistical ul li>.right {
	width: 79%;
}

.statistical ul li>div strong {
	display: block;
	font-size: 18px;
	color: #333333;
	padding: 10px;
	white-space: nowrap;
	text-overflow: ellipsis;
	overflow: hidden;
}

.statistical ul li:after {
	content: '';
	border-right: 1px solid #e5e5e5;
	display: block;
	float: right;
	height: 80px;
}

.statistical ul li:LAST-CHILD:after {
	content: '';
	border: 0;
	height: 0;
}

.statistical ul li p {
	margin: 0;
	padding: 0 0 0 10px;
	font-size: 14px;
}

.ns-base-section{
	background: #F2F6FC;
}

@media ( max-width : 1440px) {
	.statistical ul li {
		width: 14.7%;
	}
}

@media ( max-width : 1280px) {
	.statistical ul li p {
		font-size: 12px;
	}
	.statistical ul li:after {
		height: 60px;
	}
}

@media ( max-width : 1214px) {
	.statistical ul li {
		width: 14.6%;
	}
}

@media ( max-width : 1152px ) {
	.statistical ul li {
		width: 14.6%;
		padding: 10px 6px;
	}
	.statistical ul li>div strong {
		padding: 5px;
	}
	.statistical ul li p {
		padding: 0 0 0 5px;
	}
	.statistical ul li>.left {
		padding: 0;
	}
}

@media ( max-width :800px) {
	.statistical ul li {
		padding: 10px 3px;
	}
}
</style>
