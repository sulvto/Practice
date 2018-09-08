<template>

  <section class="ns-base-section">

    <div style="position:relative;margin:0;">
      <!-- 面包屑导航 -->
            <div class="breadcrumb-nav">
        <a href="index.html">大鵬系統</a>
                  <i class="fa fa-angle-right"></i>
          <a href="/promotion/coupontypelist.html">营销</a>
                  <i class="fa fa-angle-right"></i>
          <!-- 需要加跳转链接用这个：http://showfx.niuteam.cn/admin/Bargain/index -->
          <a href="javascript:;" style="color:#999;">砍价活动</a>
              </div>
            <!-- 三级导航菜单 -->

                <nav class="ns-third-menu">
          <ul>
                        <li class="selected" onclick="location.href='/bargain/index.html';">砍价列表</li>
                          <li onclick="location.href='/bargain/config.html';">砍价设置</li>
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
    <th width="40%" style="text-align: left;">
      <button style="margin:0 5px 0 0 !important;" class="btn-common-delete btn-small" onclick="batchDelete()">批量删除</button>
      <button style="margin:0 5px 0 0 !important;" class="btn-common btn-small" onclick="location.href='/bargain/addBargain.html';">添加活动</button>
    </th>
    <th>
      活动名称：<input id="bargain_name" class="input-common middle" type="text" value="">
      状态：<div class="selectric-wrapper selectric-select-common selectric-middle" style="width: 150px;"><div class="selectric-hide-select"><select id="status" class="select-common middle" tabindex="-1">
      <option value="all">全部</option>
      <option value="0">未发布</option>
      <option value="1">进行中</option>
      <option value="4">已结束</option>
      <option value="3">已关闭</option>
    </select></div><div class="selectric"><span class="selectric-label">全部</span><button class="selectric-button">▾</button></div><div class="selectric-items" tabindex="-1"><div class="selectric-scroll"><ul><li data-index="0" class="selected" title="全部">全部</li><li data-index="1" class="" title="未发布">未发布</li><li data-index="2" class="" title="进行中">进行中</li><li data-index="3" class="" title="已结束">已结束</li><li data-index="4" class="last" title="已关闭">已关闭</li></ul></div></div><input class="selectric-input" tabindex="0"></div>
      <button onclick="LoadingInfo(1)" class="btn-common">搜索</button>
    </th>
  </tr>
  </tbody></table>
  <div id="myTabContent" class="tab-content">
  <div class="tab-pane active">
    <table class="table-class" border="0">
      <colgroup>
        <col style="width: 2%;">
        <col style="width: 20%;">
        <col style="width: 10%;">
                <col style="width: 10%;">
        <col style="width: 20%;">
        <col style="width: 10%;">
      </colgroup>
      <thead>
      <tr class="table-title">
        <th><i class="checkbox-common"><input id="ckall" type="checkbox" onclick="CheckAll(this)"></i></th>
        <th align="left">活动名称</th>
        <th>活动状态</th>
                <th>发布时间</th>
        <th>有效时间</th>
        <th>删除</th>
      </tr>
      </thead>
      <tbody id="productTbody" style="border: 0;"><tr align="center"><td><div class="cell"><i class="checkbox-common"><input name="sub_no_use" type="checkbox" value="8"></i></div></td><td align="left">砍</td><td>结束</td><td>2018-08-05 12:54:48</td><td>开始时间：2018-08-05 12:52:14<br>结束时间：2018-08-11 12:52:16</td><td><a href="javascript:void(0);" onclick="bargainInfo(8)">详情</a>&nbsp;</td></tr><tr align="center"><td><div class="cell"><i class="checkbox-common disabled"><input name="sub_use" type="checkbox" value="7" disabled=""></i></div></td><td align="left">砍价</td><td>正常</td><td>2018-08-03 10:20:33</td><td>开始时间：2018-08-03 10:19:20<br>结束时间：2018-08-31 10:19:23</td><td><a href="javascript:void(0);" onclick="closeBargain(7)">关闭</a>&nbsp;<a href="javascript:void(0);" onclick="bargainInfo(7)">详情</a>&nbsp;</td></tr><tr align="center"><td><div class="cell"><i class="checkbox-common disabled"><input name="sub_use" type="checkbox" value="6" disabled=""></i></div></td><td align="left">rewqrw</td><td>正常</td><td>2018-07-31 16:13:30</td><td>开始时间：2018-07-31 16:13:20<br>结束时间：2018-09-28 16:13:21</td><td><a href="javascript:void(0);" onclick="closeBargain(6)">关闭</a>&nbsp;<a href="javascript:void(0);" onclick="bargainInfo(6)">详情</a>&nbsp;</td></tr><tr align="center"><td><div class="cell"><i class="checkbox-common"><input name="sub_no_use" type="checkbox" value="5"></i></div></td><td align="left">yttt</td><td>结束</td><td>2018-07-27 10:59:59</td><td>开始时间：2018-07-17 10:59:33<br>结束时间：2018-07-31 10:59:36</td><td><a href="javascript:void(0);" onclick="bargainInfo(5)">详情</a>&nbsp;</td></tr><tr align="center"><td><div class="cell"><i class="checkbox-common"><input name="sub_no_use" type="checkbox" value="2"></i></div></td><td align="left">kankankan</td><td>结束</td><td>2018-07-23 11:01:38</td><td>开始时间：2018-07-23 11:01:26<br>结束时间：2018-07-28 11:01:27</td><td><a href="javascript:void(0);" onclick="bargainInfo(2)">详情</a>&nbsp;</td></tr><tr align="center"><td><div class="cell"><i class="checkbox-common"><input name="sub_no_use" type="checkbox" value="1"></i></div></td><td align="left">eeee</td><td>结束</td><td>2018-07-03 14:20:46</td><td>开始时间：2018-07-02 14:20:30<br>结束时间：2018-07-31 14:20:32</td><td><a href="javascript:void(0);" onclick="bargainInfo(1)">详情</a>&nbsp;</td></tr></tbody>
    </table>
  </div>
  </div>

  <!-- 模态框（Modal） -->
  <div class="modal fade hide" id="bargainInfo" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
  <div class="modal-dialog">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
        <h3>砍价活动详情</h3>
      </div>
      <div class="modal-body">
        <div class="modal-infp-style">
          <table>
            <tbody><tr>
              <td style="width:60px;">活动名称</td>
              <td colspan="3" id="bargain_names"></td>
            </tr>
            <tr>
              <td>有效期</td>
              <td colspan="3" id="time"></td>
            </tr>
            <tr>
              <td>活动状态</td>
              <td colspan="3" id="info_status"></td>
            </tr>
            <tr>
              <td>首刀比例</td>
              <td colspan="3" id="one_rate"></td>
            </tr>
            <tr>
              <td>砍价最少次数</td>
              <td colspan="3" id="bargain_min_number">次</td>
            </tr>
            <tr>
              <td>最低比例</td>
              <td colspan="3" id="bargain_min_rate">%</td>
            </tr>
            <tr>
              <td colspan="3">商品列表</td>
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
