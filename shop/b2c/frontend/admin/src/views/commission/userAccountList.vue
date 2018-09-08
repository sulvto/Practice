<template>
  <section class="ns-base-section">

    <div style="position:relative;margin:0;">
      <!-- 面包屑导航 -->
            <div class="breadcrumb-nav">
        <a href="index.html">大鵬系統</a>
                  <i class="fa fa-angle-right"></i>
          <a href="/Commission/userAccountList.html">佣金</a>
                  <i class="fa fa-angle-right"></i>
          <!-- 需要加跳转链接用这个：http://showfx.niuteam.cn/admin/Commission/userAccountList -->
          <a href="javascript:;" style="color:#999;">推广员佣金</a>
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
      角色：
      <div class="selectric-wrapper selectric-select-common selectric-middle" style="width: 150px;"><div class="selectric-hide-select"><select id="role" class="select-common middle" tabindex="-1">
        <option value="0">全部</option>
        <option value="1">推广员</option>
        <option value="2">股东</option>
        <option value="3">代理</option>
      </select></div><div class="selectric"><span class="selectric-label">全部</span><button class="selectric-button">▾</button></div><div class="selectric-items" tabindex="-1"><div class="selectric-scroll"><ul><li data-index="0" class="selected" title="全部">全部</li><li data-index="1" class="" title="推广员">推广员</li><li data-index="2" class="" title="股东">股东</li><li data-index="3" class="last" title="代理">代理</li></ul></div></div><input class="selectric-input" tabindex="0"></div>
      用户名称：<input id="userName" class="input-common middle" type="text" value="">
      <!-- 手机号：<input id="userTel" class="input-common middle" type="text" value=""> -->
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
          <col style="width: 8%;">
          <col style="width: 8%;">
          <col style="width: 8%;">
          <col style="width: 8%;">
          <col style="width: 8%;">
          <col style="width: 8%;">
          <col style="width: 8%;">
          <col style="width: 8%;">
          <col style="width: 8%;">
          <col style="width: 8%;">
          <col style="width: 24%;">
        </colgroup>
        <thead>
          <tr>
            <th>用户名称</th>
            <th>是否是推广员</th>
            <th>是否是股东</th>
            <th>是否是代理</th>
            <th>总佣金</th>
            <th>可提现佣金</th>
            <th>已提现佣金</th>
            <th>分销佣金</th>
            <th>股东分红</th>
            <th>股东全球分红</th>
            <th>区域代理佣金</th>
            <th>操作</th>
            <!-- <th>股东团队分红</th>
            <th>推广员团队分红</th>
            <th>渠道代理分红</th> -->
          </tr>
        </thead>

        <tbody><tr align="center"><td>sudo</td><td><i class="fa fa-check text-success text-active"></i></td><td><i class="fa fa-times"></i></td><td><i class="fa fa-times"></i></td><td class="color-red">74.54</td><td class="color-green">74.54</td><td class="color-blue">0.00</td><td>74.54</td><td>0.00</td><td>0.00</td><td>0.00</td><td align="center"><a href="/Commission/promoterAccount?uid=4" target="_blank">账户详情</a><a href="/Commission/useraccountrecordsdetail?type_id=1&amp;uid=4" target="_blank">分销佣金</a><br></td></tr><tr align="center"><td>Dannychan</td><td><i class="fa fa-check text-success text-active"></i></td><td><i class="fa fa-times"></i></td><td><i class="fa fa-times"></i></td><td class="color-red">2.60</td><td class="color-green">2.60</td><td class="color-blue">0.00</td><td>2.60</td><td>0.00</td><td>0.00</td><td>0.00</td><td align="center"><a href="/Commission/promoterAccount?uid=5" target="_blank">账户详情</a><a href="/Commission/useraccountrecordsdetail?type_id=1&amp;uid=5" target="_blank">分销佣金</a><br></td></tr><tr align="center"><td>admin</td><td><i class="fa fa-check text-success text-active"></i></td><td><i class="fa fa-check text-success text-active"></i></td><td><i class="fa fa-times"></i></td><td class="color-red">77.94</td><td class="color-green">77.94</td><td class="color-blue">0.00</td><td>71.94</td><td>0.00</td><td>6.00</td><td>0.00</td><td align="center"><a href="/Commission/promoterAccount?uid=3" target="_blank">账户详情</a><a href="/Commission/useraccountrecordsdetail?type_id=1&amp;uid=3" target="_blank">分销佣金</a><br><a href="/Commission/useraccountrecordsdetail?type_id=4&amp;uid=3" target="_blank">股东分红</a><a href="/Commission/useraccountrecordsdetail?type_id=5&amp;uid=3" target="_blank">全球分红</a><br></td></tr><tr align="center"><td>xiaofeng</td><td><i class="fa fa-check text-success text-active"></i></td><td><i class="fa fa-times"></i></td><td><i class="fa fa-times"></i></td><td class="color-red">0.00</td><td class="color-green">0.00</td><td class="color-blue">0.00</td><td>0.00</td><td>0.00</td><td>0.00</td><td>0.00</td><td align="center"><a href="/Commission/promoterAccount?uid=6" target="_blank">账户详情</a><a href="/Commission/useraccountrecordsdetail?type_id=1&amp;uid=6" target="_blank">分销佣金</a><br></td></tr><tr align="center"><td>lghga</td><td><i class="fa fa-check text-success text-active"></i></td><td><i class="fa fa-times"></i></td><td><i class="fa fa-times"></i></td><td class="color-red">0.00</td><td class="color-green">0.00</td><td class="color-blue">0.00</td><td>0.00</td><td>0.00</td><td>0.00</td><td>0.00</td><td align="center"><a href="/Commission/promoterAccount?uid=15" target="_blank">账户详情</a><a href="/Commission/useraccountrecordsdetail?type_id=1&amp;uid=15" target="_blank">分销佣金</a><br></td></tr><tr align="center"><td>webads</td><td><i class="fa fa-check text-success text-active"></i></td><td><i class="fa fa-times"></i></td><td><i class="fa fa-times"></i></td><td class="color-red">0.00</td><td class="color-green">0.00</td><td class="color-blue">0.00</td><td>0.00</td><td>0.00</td><td>0.00</td><td>0.00</td><td align="center"><a href="/Commission/promoterAccount?uid=25" target="_blank">账户详情</a><a href="/Commission/useraccountrecordsdetail?type_id=1&amp;uid=25" target="_blank">分销佣金</a><br></td></tr><tr align="center"><td>test</td><td><i class="fa fa-check text-success text-active"></i></td><td><i class="fa fa-times"></i></td><td><i class="fa fa-times"></i></td><td class="color-red">0.00</td><td class="color-green">0.00</td><td class="color-blue">0.00</td><td>0.00</td><td>0.00</td><td>0.00</td><td>0.00</td><td align="center"><a href="/Commission/promoterAccount?uid=26" target="_blank">账户详情</a><a href="/Commission/useraccountrecordsdetail?type_id=1&amp;uid=26" target="_blank">分销佣金</a><br></td></tr><tr align="center"><td>gao123</td><td><i class="fa fa-check text-success text-active"></i></td><td><i class="fa fa-times"></i></td><td><i class="fa fa-times"></i></td><td class="color-red">0.00</td><td class="color-green">0.00</td><td class="color-blue">0.00</td><td>0.00</td><td>0.00</td><td>0.00</td><td>0.00</td><td align="center"><a href="/Commission/promoterAccount?uid=20" target="_blank">账户详情</a><a href="/Commission/useraccountrecordsdetail?type_id=1&amp;uid=20" target="_blank">分销佣金</a><br></td></tr><tr align="center"><td>xcx</td><td><i class="fa fa-check text-success text-active"></i></td><td><i class="fa fa-times"></i></td><td><i class="fa fa-times"></i></td><td class="color-red">0.00</td><td class="color-green">0.00</td><td class="color-blue">0.00</td><td>0.00</td><td>0.00</td><td>0.00</td><td>0.00</td><td align="center"><a href="/Commission/promoterAccount?uid=30" target="_blank">账户详情</a><a href="/Commission/useraccountrecordsdetail?type_id=1&amp;uid=30" target="_blank">分销佣金</a><br></td></tr><tr align="center"><td>qpchina</td><td><i class="fa fa-check text-success text-active"></i></td><td><i class="fa fa-times"></i></td><td><i class="fa fa-times"></i></td><td class="color-red">0.00</td><td class="color-green">0.00</td><td class="color-blue">0.00</td><td>0.00</td><td>0.00</td><td>0.00</td><td>0.00</td><td align="center"><a href="/Commission/promoterAccount?uid=39" target="_blank">账户详情</a><a href="/Commission/useraccountrecordsdetail?type_id=1&amp;uid=39" target="_blank">分销佣金</a><br></td></tr><tr align="center"><td>ymeng22</td><td><i class="fa fa-check text-success text-active"></i></td><td><i class="fa fa-times"></i></td><td><i class="fa fa-times"></i></td><td class="color-red">12.00</td><td class="color-green">12.00</td><td class="color-blue">0.00</td><td>12.00</td><td>0.00</td><td>0.00</td><td>0.00</td><td align="center"><a href="/Commission/promoterAccount?uid=7" target="_blank">账户详情</a><a href="/Commission/useraccountrecordsdetail?type_id=1&amp;uid=7" target="_blank">分销佣金</a><br></td></tr><tr align="center"><td>dx4177542</td><td><i class="fa fa-check text-success text-active"></i></td><td><i class="fa fa-times"></i></td><td><i class="fa fa-times"></i></td><td class="color-red">0.00</td><td class="color-green">0.00</td><td class="color-blue">0.00</td><td>0.00</td><td>0.00</td><td>0.00</td><td>0.00</td><td align="center"><a href="/Commission/promoterAccount?uid=40" target="_blank">账户详情</a><a href="/Commission/useraccountrecordsdetail?type_id=1&amp;uid=40" target="_blank">分销佣金</a><br></td></tr><tr align="center"><td>zhangzehua</td><td><i class="fa fa-check text-success text-active"></i></td><td><i class="fa fa-times"></i></td><td><i class="fa fa-times"></i></td><td class="color-red">0.00</td><td class="color-green">0.00</td><td class="color-blue">0.00</td><td>0.00</td><td>0.00</td><td>0.00</td><td>0.00</td><td align="center"><a href="/Commission/promoterAccount?uid=41" target="_blank">账户详情</a><a href="/Commission/useraccountrecordsdetail?type_id=1&amp;uid=41" target="_blank">分销佣金</a><br></td></tr><tr align="center"><td>aoeuaoeu</td><td><i class="fa fa-check text-success text-active"></i></td><td><i class="fa fa-times"></i></td><td><i class="fa fa-times"></i></td><td class="color-red">19.40</td><td class="color-green">19.40</td><td class="color-blue">0.00</td><td>19.40</td><td>0.00</td><td>0.00</td><td>0.00</td><td align="center"><a href="/Commission/promoterAccount?uid=42" target="_blank">账户详情</a><a href="/Commission/useraccountrecordsdetail?type_id=1&amp;uid=42" target="_blank">分销佣金</a><br></td></tr></tbody>
      </table>
    </div>
  </div>
  </div>

  <!-- 修改用户上级（Modal）结束 -->

    </div>

  </section>

</template>
