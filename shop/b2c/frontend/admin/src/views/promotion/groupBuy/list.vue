<template>

  <section class="ns-base-section">

    <div style="position:relative;margin:0;">
      <!-- 面包屑导航 -->
            <div class="breadcrumb-nav">
        <a href="index.html">大鵬系統</a>
                  <i class="fa fa-angle-right"></i>
          <a href="/promotion/coupontypelist.html">营销</a>
                  <i class="fa fa-angle-right"></i>
          <!-- 需要加跳转链接用这个：http://showfx.niuteam.cn/admin/Promotion/groupBuyList -->
          <a href="javascript:;" style="color:#999;">团购</a>
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
                  <p>团购</p>
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
        <th width="20%" style="text-align:left;">
          <button class="btn-common btn-small" onclick="location.href='/promotion/addGroupBuy.html';" style="margin:0 5px 0 0 !important;">添加团购活动</button>
          <button class="btn-common-delete" onclick="batchDelete();">批量删除</button>
        </th>
        <th width="10%">
          <input type="text" id="search_text" placeholder="请输入活动名称" class="input-common">
          <input type="button" onclick="searchData()" value="搜索" class="btn-common">
        </th>
      </tr>
      </tbody></table>
      <table class="table-class">
        <colgroup>
        <col style="width: 2%;">
        <col style="width: 21%;">
        <col style="width: 21%;">
        <col style="width: 10%;">
        <col style="width: 10%;">
        <col style="width: 20%;">
        <col style="width: 16%;">
        </colgroup>
      <thead>
        <tr align="center">
          <th><i class="checkbox-common"><input type="checkbox" onclick="CheckAll(this)"></i></th>
          <th class="align_left">活动名称</th>
          <th class="align_left">商品名称</th>
          <th class="align_right">最大购买量</th>
          <th class="align_right">最小购买量<span class="row-20"></span></th>
          <th class="align_center">有效时间</th>
          <th>操作</th>
        </tr>
      </thead>
      <tbody><tr align="center"><td><i class="checkbox-common"><input name="sub" type="checkbox" value="1"></i></td><td class="align_left">1</td><td class="align_left goods-name"><a href="/goods/goodsinfo?goodsid=9" target="_blank">DOMO男士高端衬衣潮男雅痞英伦风大尖领湖蓝红色波点衬衣个性达人</a></td><td class="align_right">111</td><td class="align_right">1<span class="row-20"></span></td><td class="align_center">开始时间：2018-07-02 10:46:53<br>结束时间：2018-07-27 10:46:50</td><td><a href="/Promotion/updateGroupBuy?group_id=1">编辑</a>&nbsp;<a href="javascript:;" onclick="delete_group_buy(1);">删除</a></td></tr></tbody>
      </table>

    </div>

  </section>
</template>
