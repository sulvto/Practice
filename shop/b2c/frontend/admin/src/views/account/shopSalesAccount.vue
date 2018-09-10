<template>

  <section class="ns-base-section">

    <div style="position:relative;margin:0;">
      <!-- 面包屑导航 -->
            <div class="breadcrumb-nav">
        <a href="index.html">大鵬系統</a>
                  <i class="fa fa-angle-right"></i>
          <a href="/account/shopsalesaccount.html">数据</a>
                  <i class="fa fa-angle-right"></i>
          <!-- 需要加跳转链接用这个：http://showfx.niuteam.cn/admin/account/shopsalesaccount -->
          <a href="javascript:;" style="color:#999;">销售概况</a>
              </div>
            <!-- 三级导航菜单 -->
      <div class="right-side-operation">
        <ul>
          <li>
            <a class="js-open-warmp-prompt" href="javascript:;" data-menu-desc=""><i class="fa fa-question-circle"></i>&nbsp;提示</a>
            <div class="popover">
              <div class="arrow"></div>
              <div class="popover-content">
                <div>
                                    <h4>操作提示</h4>
                  <p>相关教程：<a href="http://bbs.niushop.com.cn/forum.php?mod=viewthread&amp;tid=2387&amp;extra=page%3D1" target="_blank">http://bbs.niushop.com.cn/forum.php?mod=viewthread&amp;tid=2387&amp;extra=page%3D1</a></p>
                  <hr>
                                    <h4>功能提示</h4>
                  <p class="function-prompts">
  1、符合以下任何一种条件的订单即为有效订单：1）采用在线支付方式支付并且已付款；2）采用货到付款方式支付并且交易已完成<br>
  2、以下关于订单和订单商品近30天统计数据的依据为：从昨天开始最近30天的有效订单
  </p>
                </div>
              </div>
            </div>
          </li>
        </ul>
      </div>
    </div>
    <div class="ns-main">

  <div class="space-10"></div>
  <div class="count-box">

  <div class="main-content" id="mainContent">
    <!-- <div class="alert mt10 top-alert">
      <ul class="mt5">
        <li>1、符合以下任何一种条件的订单即为有效订单：1）采用在线支付方式支付并且已付款；2）采用货到付款方式支付并且交易已完成</li>
        <li>2、以下关于订单和订单商品近30天统计数据的依据为：从昨天开始最近30天的有效订单</li>
      </ul>
    </div> -->

  <div >
  </div>

    <el-card class="box-card">
          <span class="w210 fl h30" style="display:block;">
            <i title="店铺从昨天开始最近30天有效订单的总金额" class="tip icon-question-sign"></i>
            近30天下单金额：<strong>7446.37元</strong>
          </span>
          <span class="w210 fl h30" style="display:block;">
            <i title="店铺从昨天开始最近30天有效订单的会员总数" class="tip icon-question-sign"></i>
            近30天下单会员数：<strong>10</strong>
          </span>
          <span class="w210 fl h30" style="display:block;">
            <i title="店铺从昨天开始最近30天有效订单的总订单数" class="tip icon-question-sign"></i>
            近30天下单量：<strong>28</strong>
          </span>
          <span class="w210 fl h30" style="display:block;">
            <i title="店铺从昨天开始最近30天有效订单的总商品数量" class="tip icon-question-sign"></i>
            近30天下单商品数：<strong>34</strong>
          </span>
          <span class="w210 fl h30" style="display:block;">
            <i title="店铺从昨天开始最近30天有效订单的平均每个订单的交易金额" class="tip icon-question-sign"></i>
            平均客单价：<strong>744.64元</strong>
          </span>
          <span class="w210 fl h30" style="display:block;">
            <i title="店铺从昨天开始最近30天有效订单商品的平均每个商品的成交价格" class="tip icon-question-sign"></i>
            平均价格：<strong>219.01元</strong>
          </span>
      </el-card>

    <div id="container" data-highcharts-chart="0"><div id="highcharts-fo4wihc-0" class="highcharts-container " style="position: relative; overflow: hidden; width: 1191px; height: 400px; text-align: left; line-height: normal; z-index: 0; -webkit-tap-highlight-color: rgba(0, 0, 0, 0);">
    </div></div>

    <div class="w450 fl mr50" style="display: none;">
      <div class="alert alert-info" style="margin-bottom:0px;"><strong>建议推广商品</strong>
        &nbsp;<i title="统计店铺从昨天开始7日内热销商品前30名，建议推广以下商品，提升推广回报率" class="tip icon-question-sign"></i>
      </div>
      <table class="ncsc-default-table">
        <thead>
          <tr class="sortbar-array">
            <th class="align-center">序号</th>
            <th class="align-center">商品名称</th>
            <th class="align-center">销量</th>
          </tr>
        </thead>
        <tbody id="datatable">
          <tr>
            <td colspan="20" class="norecord"><div class="warning-option"><i class="icon-warning-sign"></i><span>暂无符合条件的数据记录</span></div></td>
          </tr>
        </tbody>
      </table>
    </div>

    <div class="w450 fl" style="display: none;">
      <div class="alert alert-info" style="margin-bottom:0;"><strong>同行热卖</strong>
        &nbsp;<i title="拥有相同经营类目同行店铺热销商品推荐，了解行业热卖便于调整商品结构" class="tip icon-question-sign"></i>
      </div>
      <table class="ncsc-default-table">
        <thead>
          <tr class="sortbar-array">
            <th class="align-center">序号</th>
            <th class="align-center">商品名称</th>
            <th class="align-center">销量</th>
          </tr>
        </thead>
        <tbody id="datatable">
          <tr>
            <td colspan="20" class="norecord"><div class="warning-option"><i class="icon-warning-sign"></i><span>暂无符合条件的数据记录</span></div></td>
          </tr>
        </tbody>
      </table>
    </div>
    <div class="h30 cb">&nbsp;</div>
  </div>
  </div>
    </div>

  </section>
</template>
