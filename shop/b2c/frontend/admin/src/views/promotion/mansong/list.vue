<template>

  <section class="ns-base-section">

    <div style="position:relative;margin:0;">
      <!-- 面包屑导航 -->
            <div class="breadcrumb-nav">
        <a href="index.html">大鵬系統</a>
                  <i class="fa fa-angle-right"></i>
          <a href="/promotion/coupontypelist.html">营销</a>
                  <i class="fa fa-angle-right"></i>
          <!-- 需要加跳转链接用这个：http://showfx.niuteam.cn/admin/promotion/mansonglist -->
          <a href="javascript:;" style="color:#999;">满减送</a>
              </div>
            <!-- 三级导航菜单 -->

                <nav class="ns-third-menu">
          <ul>
                        <li class="selected" onclick="location.href='/promotion/mansonglist.html';">全部</li>
                          <li onclick="location.href='/promotion/mansonglist.html?status=0';">未发布</li>
                          <li onclick="location.href='/promotion/mansonglist.html?status=1';">进行中</li>
                          <li onclick="location.href='/promotion/mansonglist.html?status=3';">已关闭</li>
                          <li onclick="location.href='/promotion/mansonglist.html?status=4';">已结束</li>
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
                  <p>相关教程：<a href="http://bbs.niushop.com.cn/forum.php?mod=viewthread&amp;tid=2317&amp;extra=page%3D2" target="_blank">http://bbs.niushop.com.cn/forum.php?mod=viewthread&amp;tid=2317&amp;extra=page%3D2</a></p>
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
        <th width="10%" style="text-align: left;">
          <button style="margin:0 5px 0 0 !important;" class="btn-common-delete btn-small" onclick="batchDelete()">批量删除</button>
          <button style="margin:0 5px 0 0 !important;" class="btn-common btn-small" onclick="location.href='/promotion/addmansong.html';">添加满减送</button>
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
      <col style="width: 54%;">
      <col style="width: 8%;">
      <col style="width: 20%;">
      <col style="width: 16%;">
      </colgroup>
      <thead>
        <tr align="center">
          <th><i class="checkbox-common"><input type="checkbox" onclick="CheckAll(this)"></i></th>
          <th align="left">活动名称</th>

          <th>活动状态</th>
          <th>有效时间</th>
          <th>操作</th>
        </tr>
      </thead>
      <tbody><tr align="center"><td colspan="9">暂无符合条件的数据记录</td></tr></tbody>
      </table>

      <!-- 模态框（Modal） -->
      <div class="modal fade hide" id="mansongInfo" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
      <div class="modal-dialog">
        <div class="modal-content">
          <div class="modal-header">
            <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
            <h3>满减送详情</h3>
          </div>
          <div class="modal-body">
            <div class="modal-infp-style">
              <table>
                <tbody><tr>
                  <td style="width:60px;">活动名称</td>
                  <td colspan="5" id="gift_name"></td>
                </tr>
                <tr>
                  <td>有效期</td>
                  <td colspan="5" id="time"></td>
                </tr>
                <tr>
                  <td>活动状态</td>
                  <td colspan="5" id="status"></td>
                </tr>
                <tr>
                  <td colspan="6">优惠规则</td>
                </tr>
                <tr id="rule">
                  <td>满足金额</td>
                  <td>减现金</td>
                  <td>免邮费</td>
                  <td>送积分</td>
                  <td>送优惠券</td>
                  <td>送赠品</td>
                </tr>
                <tr>
                  <td colspan="6">商品列表</td>
                </tr>
                <tr id="goods_list"></tr>
              </tbody></table>
            </div>
          </div>
          <div class="modal-footer">
            <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
          </div>
        </div>
      </div>
      </div>

    </div>

  </section>
</template>
