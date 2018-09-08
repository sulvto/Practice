<template>

  <section class="ns-base-section">

    <div style="position:relative;margin:0;">
      <!-- 面包屑导航 -->
      <div class="breadcrumb-nav">
        <a href="index.html">大鵬系統</a>
        <i class="fa fa-angle-right"></i>
        <a href="/Commission/userAccountList.html">佣金</a>
        <i class="fa fa-angle-right"></i>
        <!-- 需要加跳转链接用这个：http://showfx.niuteam.cn/admin/Commission/commissionRegionAgentList -->
        <a href="javascript:;" style="color:#999;">区域代理</a>
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
    <div class="ns-main">

      <table class="mytable">
      <tbody><tr>
        <th style="line-height:33px;">
          下单时间：
          <input type="text" id="startDate" class="input-common middle" placeholder="请选择开始日期" onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm:ss'})">
          &nbsp;-&nbsp;
          <input type="text" id="endDate" placeholder="请选择结束日期" class="input-common  middle" onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm:ss'})">
          <!-- 更多搜索 -->
          <button class="btn-common-white more-search"><i class="fa fa-chevron-down"></i></button>
          <div class="more-search-container">
            <dl>
              <dt>买家名称：</dt>
              <dd>
                <input id="userName" class="input-common middle" type="text" value="">
              </dd>
            </dl>
            <dl>
              <dt>订单编号：</dt>
              <dd>
                <input id="orderNo" class="input-common middle" type="text" value="">
              </dd>
            </dl>
            <dl>
              <dt>订单状态：</dt>
              <dd>
                <div class="selectric-wrapper selectric-select-common selectric-middle" style="width: 150px;"><div class="selectric-hide-select"><select id="order_status" class="select-common middle" tabindex="-1">
                  <option value="">全部</option>
                  <option value="0">待付款</option>
                  <option value="1">待发货</option>
                  <option value="2">待收货</option>
                  <option value="3">已收货</option>
                  <option value="4">交易成功</option>
                  <option value="5">已关闭</option>
                  <option value="-1">退款中</option>
                  <option value="-2">已退款</option>
                </select></div><div class="selectric"><span class="selectric-label">全部</span><button class="selectric-button">▾</button></div><div class="selectric-items" tabindex="-1"><div class="selectric-scroll"><ul><li data-index="0" class="selected" title="全部">全部</li><li data-index="1" class="" title="待付款">待付款</li><li data-index="2" class="" title="待发货">待发货</li><li data-index="3" class="" title="待收货">待收货</li><li data-index="4" class="" title="已收货">已收货</li><li data-index="5" class="" title="交易成功">交易成功</li><li data-index="6" class="" title="已关闭">已关闭</li><li data-index="7" class="" title="退款中">退款中</li><li data-index="8" class="last" title="已退款">已退款</li></ul></div></div><input class="selectric-input" tabindex="0"></div>
              </dd>
            </dl>
            <dl>
              <dt></dt>
              <dd>
                <button onclick="searchData()" class="btn-common">完成</button>
              </dd>
            </dl>
          </div>
          <button onclick="searchData()" value="搜索" class="btn-common">搜索</button>
        </th>
      </tr>
      </tbody>
      </table>
      <div class="mod-table">
      <div class="mod-table-head">
        <div class="con style0list">
          <table class="table-class">
            <colgroup>
              <col style="width: 20%;">
              <col style="width: 15%;">
              <col style="width: 10%;">
              <col style="width: 10%;">
              <col style="width: 11%;">
              <col style="width: 17%;">
              <col style="width: 17%;">

            </colgroup>
            <thead>
              <tr>
                <th>订单号</th>
                <th>订单金额</th>
                <th>订单状态</th>
                <th>佣金</th>
                <th>买家</th>
                <th>创建时间</th>
                <th>完成时间</th>
              </tr>
            </thead>
            <colgroup>
              <col style="width: 20%;">
              <col style="width: 15%;">
              <col style="width: 10%;">
              <col style="width: 10%;">
              <col style="width: 11%;">
              <col style="width: 17%;">
              <col style="width: 17%;">
            </colgroup>
            </table>
        </div>
      </div>
      </div>

    </div>

  </section>

</template>
