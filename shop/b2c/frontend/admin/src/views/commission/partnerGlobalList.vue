<template>

  <section class="ns-base-section">

    <div style="position:relative;margin:0;">
      <!-- 面包屑导航 -->
            <div class="breadcrumb-nav">
        <a href="index.html">大鵬系統</a>
                  <i class="fa fa-angle-right"></i>
          <a href="/Commission/userAccountList.html">佣金</a>
                  <i class="fa fa-angle-right"></i>
          <!-- 需要加跳转链接用这个：http://showfx.niuteam.cn/admin/Commission/commissionPartnerGlobalList -->
          <a href="javascript:;" style="color:#999;">全球分红</a>
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

    <div class="ns-main">

  <table class="mytable">
  <tbody><tr>
    <th>
      用户姓名：<input id="userName" class="input-common middle" type="text" value="">
      手机号：<input id="userTel" class="input-common middle" type="text" value="">
      <button onclick="searchData()" value="搜索" class="btn-common">搜索</button>
    </th>
  </tr>
  </tbody></table>
  <div class="mod-table">
  <div class="mod-table-head">
    <div class="con style0list">
      <table class="table-class">
        <colgroup>
          <col style="width: 8%;">
          <col style="width: 15%;">
          <col style="width: 15%;">
          <col style="width: 10%;">
          <col style="width: 10%;">
          <col style="width: 8%;">
          <col style="width: 10%;">
          <col style="width: 8%;">
          <col style="width: 18%;">
        </colgroup>
        <thead>
          <tr>
            <th>股东</th>
            <th>分红开始时间</th>
            <th>分红结束时间</th>
            <th>分红总金额</th>
            <th>店铺总分值</th>
            <th>股东分值</th>
            <th>分红佣金比率</th>
            <th>分红金额</th>
            <th>创建时间</th>
          </tr>
        </thead>
        <colgroup>
          <col style="width: 8%;">
          <col style="width: 15%;">
          <col style="width: 15%;">
          <col style="width: 10%;">
          <col style="width: 10%;">
          <col style="width: 8%;">
          <col style="width: 11%;">
          <col style="width: 8%;">
          <col style="width: 18%;">
        </colgroup>
        <tbody><tr align="center"><td>undefined</td><td>2018-07-17 00:00:00</td><td>2018-08-11 00:00:00</td><td>1.00</td><td>100</td><td>100</td><td>1.00%</td><td>1.00</td><td>2018-08-11 01:04:04</td></tr><tr align="center"><td>undefined</td><td>2018-08-11 00:00:00</td><td>2018-08-20 00:00:00</td><td>5.00</td><td>100</td><td>100</td><td>1.00%</td><td>5.00</td><td>2018-08-20 10:08:02</td></tr></tbody>
      </table>
    </div>
  </div>
  </div>

  <input type="hidden" id="page_count" value="1">
  <input type="hidden" id="page_size" value="2">
    </div>

  </section>

</template>
