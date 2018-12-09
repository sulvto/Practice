<template>
  <div>
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
                <a href="/goods/goodslist.html"><img src="/static/blue/img/goods_management.png"><span>商品管理</span></a>
              </li>
              <li>
                <a href="/promotion/coupontypelist.html"><img src="/static/blue/img/promotions.png"><span>促销方式</span></a>
              </li>
              <li>
                <a href="/order/orderlist.html"><img src="/static/blue/img/order_after.png"><span>订单及售后</span></a>
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
              <li>
                <a href="/order/orderlist.html?status=5">
                  <strong class="yiguanbi">0</strong>
                  <span>已关闭</span>
                </a>
              </li>
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
            <i class="i-circular" />订单总数统计<span>订单数量</span>
          </h3>
          <div id="orderCharts" data-highcharts-chart="0">
            &emsp;
          </div>
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
          <div id="focusCharts" data-highcharts-chart="1">
            &emsp;
          </div>
        </div>
        <div class="system-config">
          <h3>
            <i class="fa fa-cog" />系统信息
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
              </tr>
            </tbody>
          </table>
        </div>

      </div>

    </section>

  </div>
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
      }]
    }
  }
}
</script>

<style lang="scss" scoped>
.ns-base-section {
  background: #f2f6fc;
}
</style>
