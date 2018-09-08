<template>

  <section class="ns-base-section">

    <div style="position:relative;margin:0;">
      <!-- 面包屑导航 -->
            <div class="breadcrumb-nav">
        <a href="index.html">大鵬系統</a>
                  <i class="fa fa-angle-right"></i>
          <a href="/promotion/coupontypelist.html">营销</a>
                  <i class="fa fa-angle-right"></i>
          <!-- 需要加跳转链接用这个：http://showfx.niuteam.cn/admin/Promotion/promotionGamesList -->
          <a href="javascript:;" style="color:#999;">互动游戏</a>
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
                  <p>互动游戏</p>
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
            <button class="btn-common" onclick="location.href='/promotion/promotionGameTypeList.html';" style="margin:0 5px 0 0 !important;">添加活动</button>
            <button class="btn-common-delete" onclick="batchDelete();">批量删除</button>
          </th>
          <th width="10%">
            <input type="text" id="search_text" placeholder="请输入活动名称" class="input-common">
            <input type="button" onclick="searchData()" value="搜索" class="btn-common">
          </th>
        </tr>
      </tbody>
      </table>
      <table class="table-class">
        <colgroup>
        <col style="width: 2%;">
        <col style="width: 28%;">
        <col style="width: 8%;">
        <col style="width: 8%;">
        <col style="width: 10%;">
        <col style="width: 8%;">
        <col style="width: 20%;">
        <col style="width: 16%;">
        </colgroup>
        <thead>
          <tr align="center">
            <th><i class="checkbox-common"><input type="checkbox" onclick="CheckAll(this)"></i></th>
            <th align="left">活动名称</th>
            <th align="left">游戏类型</th>
            <th align="left">参与的会员</th>
            <th align="right">参与扣除积分<span class="row-20"></span></th>
            <th>活动状态</th>
            <th>有效时间</th>
            <th>操作</th>
          </tr>
        </thead>
        <tbody><tr align="center"><td><i class="checkbox-common"><input name="sub" type="checkbox" value="1"></i></td><td align="left">平图案</td><td align="left">刮刮卡</td><td align="left">铜牌会员</td><td align="right">20<span class="row-20"></span></td><td>已结束</td><td>开始时间：2018-07-26 15:33:18<br>结束时间：2018-07-31 15:33:20</td><td align="center"><a href="/Promotion/updatePromotionGame?game_id=1&amp;game_type=3">编辑</a>&nbsp;<a href="/Promotion/promotionGamesAwardList?game_id=1" target="_blank">奖项列表</a><br><a href="javascript:;" onclick="deleteGames(1);">删除</a><a href="/Promotion/promotionGamesAccessRecords?game_id=1" target="_blank">获奖记录</a><br></td></tr></tbody>
      </table>

    </div>

  </section>

</template>
