<template>

  <section class="ns-base-section">

    <div style="position:relative;margin:0;">
      <!-- 面包屑导航 -->
            <div class="breadcrumb-nav">
        <a href="index.html">大鵬系統</a>
                  <i class="fa fa-angle-right"></i>
          <a href="/promotion/coupontypelist.html">营销</a>
                  <i class="fa fa-angle-right"></i>
          <!-- 需要加跳转链接用这个：http://showfx.niuteam.cn/admin/config/merchantService -->
          <a href="javascript:;" style="color:#999;">赠品发放记录</a>
              </div>
            <!-- 三级导航菜单 -->

                <nav class="ns-third-menu">
          <ul>
                        <li onclick="location.href='/Promotion/giftList.html';">赠品列表</li>
                          <li class="selected" onclick="location.href='/promotion/giftGrantRecordsList.html';">赠品发放记录</li>
                      </ul>
        </nav>

      <div class="right-side-operation">
        <ul>
          <li>
            <a class="js-open-warmp-prompt" href="javascript:;" data-menu-desc=""><i class="fa fa-question-circle"></i>&nbsp;提示</a>
            <div class="popover">
              <div class="arrow"></div>
              <div class="popover-content">
                <div>
                                    <h4>操作提示</h4>
                  <p>赠品发放记录</p>
                  <hr>
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
        <th width="10%">
          <input type="text" id="search_text" placeholder="请输入活动名称" class="input-common">
          <input type="button" onclick="searchData()" value="搜索" class="btn-common">
        </th>
      </tr>
      </tbody></table>
      <table class="table-class">
      <colgroup>
      <col style="width: 2%;">
      <col style="width: 15%;">
      <col style="width: 15%;">
      <col style="width: 13%;">
      <col style="width: 15%;">
      <col style="width: 20%;">
      <col style="width: 20%;">
      </colgroup>
      <thead>
        <tr align="center">
          <th></th>
          <th align="left">赠品名称</th>
          <th align="left">发放商品信息</th>
          <th>发放类型</th>
          <th>发放用户</th>
          <th>发放时间</th>
          <th>备注</th>
        </tr>
      </thead>
      <tbody><tr align="center"><td colspan="7">暂无符合条件的数据记录</td></tr></tbody>
      </table>

    </div>

  </section>
</template>
