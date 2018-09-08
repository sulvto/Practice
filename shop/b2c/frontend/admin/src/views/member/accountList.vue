<template>

  <section class="ns-base-section">

    <div style="position:relative;margin:0;">
      <!-- 面包屑导航 -->
            <div class="breadcrumb-nav">
        <a href="index.html">大鵬系統</a>
                  <i class="fa fa-angle-right"></i>
          <a href="/member/memberlist.html">会员</a>
                  <i class="fa fa-angle-right"></i>
          <!-- 需要加跳转链接用这个：http://showfx.niuteam.cn/admin/member/accountlist -->
          <a href="javascript:;" style="color:#999;">余额管理</a>
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
    <td width="10%">
      <span>发生时间：</span>
      <input type="text" id="startDate" placeholder="请选择开始日期" class="input-medium input-common middle" onclick="WdatePicker()">
      &nbsp;-&nbsp;
      <input type="text" id="endDate" placeholder="请选择结束日期" class="input-medium input-common middle" onclick="WdatePicker()">
      <!-- 更多搜索按钮 -->
      <button class="btn-common-white more-search"><i class="fa fa-chevron-down"></i></button>
      <button type="button" onclick="searchData()" value="搜索" class="btn-common">搜索</button>
      <!-- 更多搜索下拉框 -->
      <div class="more-search-container">
        <dl>
          <dt>会员昵称：</dt>
          <dd>
            <input type="text" id="search_text" placeholder="请输入会员昵称" class="input-common  middle">
          </dd>
        </dl>
        <dl>
          <dt>发生类别：</dt>
          <dd>
            <div class="selectric-wrapper selectric-select-common selectric-middle" style="width: 150px;"><div class="selectric-hide-select"><select id="form_type" class="select-common middle" tabindex="-1">
              <option value="">全部</option>
                            <option value="1">商城订单</option>
                            <option value="2">订单退还</option>
                            <option value="3">兑换</option>
                            <option value="4">充值</option>
                            <option value="5">签到</option>
                            <option value="6">分享</option>
                            <option value="7">注册</option>
                            <option value="8">提现</option>
                            <option value="9">提现退还</option>
                            <option value="10">调整</option>
                            <option value="11">参与营销游戏消耗积分</option>
                            <option value="19">点赞</option>
                            <option value="20">评论</option>
                          </select></div><div class="selectric"><span class="selectric-label">全部</span><button class="selectric-button">▾</button></div><div class="selectric-items" tabindex="-1"><div class="selectric-scroll"><ul><li data-index="0" class="selected" title="全部">全部</li><li data-index="1" class="" title="商城订单">商城订单</li><li data-index="2" class="" title="订单退还">订单退还</li><li data-index="3" class="" title="兑换">兑换</li><li data-index="4" class="" title="充值">充值</li><li data-index="5" class="" title="签到">签到</li><li data-index="6" class="" title="分享">分享</li><li data-index="7" class="" title="注册">注册</li><li data-index="8" class="" title="提现">提现</li><li data-index="9" class="" title="提现退还">提现退还</li><li data-index="10" class="" title="调整">调整</li><li data-index="11" class="" title="参与营销游戏消耗积分">参与营销游戏消耗积分</li><li data-index="12" class="" title="点赞">点赞</li><li data-index="13" class="last" title="评论">评论</li></ul></div></div><input class="selectric-input" tabindex="0"></div>
          </dd>
        </dl>
        <dl>
          <dt></dt>
          <dd><button onclick="searchData()" class="btn-common">搜索</button></dd>
        </dl>
      </div>
    </td>
  </tr>
  </tbody></table>
  <table class="table-class">
  <colgroup>
    <col style="width: 2%;">
    <col style="width: 15%;">
    <col style="width: 20%;">
    <col style="width: 32%;">
    <col style="width: 15%;">
    <col style="width: 16%;">
  </colgroup>
  <thead>
    <tr align="left">
      <th align="center"><i class="checkbox-common"><input type="checkbox" onclick="CheckAll(this)"></i></th>
      <th>会员昵称</th>
      <th>类别</th>
      <th>描述</th>
      <th align="right">金额<span class="row-30"></span></th>
      <th align="center">时间</th>
    </tr>
  </thead>
  <tbody><tr align="left"><td style="text-align: center;"><i class="checkbox-common"><input name="sub" type="checkbox" value="276"></i></td><td>yaodayizi</td><td>调整</td><td></td><td align="right">3500.00<span class="row-30"></span></td><td align="center">2018-08-23 16:36:17</td></tr><tr align="left"><td style="text-align: center;"><i class="checkbox-common"><input name="sub" type="checkbox" value="272"></i></td><td>wocesi</td><td>商城订单</td><td>商城订单</td><td align="right">-284.05<span class="row-30"></span></td><td align="center">2018-08-21 15:08:40</td></tr><tr align="left"><td style="text-align: center;"><i class="checkbox-common"><input name="sub" type="checkbox" value="269"></i></td><td>wocesi2</td><td>商城订单</td><td>商城订单</td><td align="right">-90.00<span class="row-30"></span></td><td align="center">2018-08-20 16:00:01</td></tr><tr align="left"><td style="text-align: center;"><i class="checkbox-common"><input name="sub" type="checkbox" value="268"></i></td><td>wocesi2</td><td>调整</td><td></td><td align="right">1000.00<span class="row-30"></span></td><td align="center">2018-08-20 15:46:39</td></tr><tr align="left"><td style="text-align: center;"><i class="checkbox-common"><input name="sub" type="checkbox" value="266"></i></td><td>huge</td><td>商城订单</td><td>商城订单</td><td align="right">-150.10<span class="row-30"></span></td><td align="center">2018-08-20 10:55:10</td></tr><tr align="left"><td style="text-align: center;"><i class="checkbox-common"><input name="sub" type="checkbox" value="265"></i></td><td>huge</td><td>调整</td><td></td><td align="right">1000.00<span class="row-30"></span></td><td align="center">2018-08-20 10:53:47</td></tr><tr align="left"><td style="text-align: center;"><i class="checkbox-common"><input name="sub" type="checkbox" value="263"></i></td><td>wocesi</td><td>商城订单</td><td>商城订单</td><td align="right">-169.10<span class="row-30"></span></td><td align="center">2018-08-18 17:24:27</td></tr><tr align="left"><td style="text-align: center;"><i class="checkbox-common"><input name="sub" type="checkbox" value="262"></i></td><td>wocesi</td><td>调整</td><td></td><td align="right">9000.00<span class="row-30"></span></td><td align="center">2018-08-18 17:20:14</td></tr><tr align="left"><td style="text-align: center;"><i class="checkbox-common"><input name="sub" type="checkbox" value="223"></i></td><td>123456777</td><td>调整</td><td>123</td><td align="right">2.00<span class="row-30"></span></td><td align="center">2018-08-06 13:50:54</td></tr><tr align="left"><td style="text-align: center;"><i class="checkbox-common"><input name="sub" type="checkbox" value="222"></i></td><td>123456777</td><td>调整</td><td>123</td><td align="right">2.00<span class="row-30"></span></td><td align="center">2018-08-06 13:50:51</td></tr><tr align="left"><td style="text-align: center;"><i class="checkbox-common"><input name="sub" type="checkbox" value="221"></i></td><td>123456777</td><td>调整</td><td>123</td><td align="right">0.00<span class="row-30"></span></td><td align="center">2018-08-06 13:50:41</td></tr><tr align="left"><td style="text-align: center;"><i class="checkbox-common"><input name="sub" type="checkbox" value="220"></i></td><td>123456777</td><td>调整</td><td>123</td><td align="right">12.00<span class="row-30"></span></td><td align="center">2018-08-06 13:50:10</td></tr><tr align="left"><td style="text-align: center;"><i class="checkbox-common"><input name="sub" type="checkbox" value="210"></i></td><td>huge</td><td>商城订单</td><td>商城订单</td><td align="right">-90.00<span class="row-30"></span></td><td align="center">2018-08-04 14:36:39</td></tr><tr align="left"><td style="text-align: center;"><i class="checkbox-common"><input name="sub" type="checkbox" value="208"></i></td><td>huge</td><td>商城订单</td><td>商城订单</td><td align="right">-90.00<span class="row-30"></span></td><td align="center">2018-08-04 10:32:56</td></tr></tbody>
  </table>

    </div>

  </section>

</template>
