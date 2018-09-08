<template>

  <section class="ns-base-section">

    <div style="position:relative;margin:0;">
      <!-- 面包屑导航 -->
            <div class="breadcrumb-nav">
        <a href="index.html">大鵬系統</a>
                  <i class="fa fa-angle-right"></i>
          <a href="/member/memberlist.html">会员</a>
                  <i class="fa fa-angle-right"></i>
          <!-- 需要加跳转链接用这个：http://showfx.niuteam.cn/admin/member/memberlevellist -->
          <a href="javascript:;" style="color:#999;">会员等级</a>
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
                  <p>相关教程：<a href="http://bbs.niushop.com.cn/forum.php?mod=viewthread&amp;tid=2323&amp;extra=page%3D2" target="_blank">http://bbs.niushop.com.cn/forum.php?mod=viewthread&amp;tid=2323&amp;extra=page%3D2</a></p>
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

  <div class="options-btn">
  <button class="btn-common btn-small" onclick="location.href='/member/addmemberlevel.html';">添加等级</button>
  </div>
  <table class="table-class">
  <colgroup>
    <col style="width: 2%">
    <col style="width: 29%;">
    <col style="width: 29%;">
    <col style="width: 30%;">
    <col style="width: 10%;">
  </colgroup>
  <thead>
    <tr align="center">
      <th><i class="checkbox-common"><input type="checkbox" onclick="CheckAll(this)"></i></th>
      <th align="left">等级名称</th>
      <th align="left">升级条件</th>
      <th align="right">折扣率（%）<span class="row-50"></span></th>
      <th>操作</th>
    </tr>
  </thead>
  <tbody><tr align="center"><td><i class="checkbox-common"><input name="sub" type="checkbox" value="47"></i></td><td align="left">普通会员</td><td align="left">累计积分满200分</td><td align="right">95<span class="row-50"></span></td><td> <a href="/member/updatememberlevel?level_id=47">修改</a></td></tr><tr align="center"><td><i class="checkbox-common"><input name="sub" type="checkbox" value="48"></i></td><td align="left">铜牌会员</td><td align="left">累计积分满0分</td><td align="right">93<span class="row-50"></span></td><td><a href="/member/updatememberlevel?level_id=48">修改</a>&nbsp;&nbsp;&nbsp;<a href="javascript:deleteMember(48);">删除</a></td></tr><tr align="center"><td><i class="checkbox-common"><input name="sub" type="checkbox" value="49"></i></td><td align="left">银牌会员</td><td align="left">累计积分满1500分</td><td align="right">92<span class="row-50"></span></td><td><a href="/member/updatememberlevel?level_id=49">修改</a>&nbsp;&nbsp;&nbsp;<a href="javascript:deleteMember(49);">删除</a></td></tr><tr align="center"><td><i class="checkbox-common"><input name="sub" type="checkbox" value="50"></i></td><td align="left">金牌会员</td><td align="left">累计积分满3000分</td><td align="right">88<span class="row-50"></span></td><td><a href="/member/updatememberlevel?level_id=50">修改</a>&nbsp;&nbsp;&nbsp;<a href="javascript:deleteMember(50);">删除</a></td></tr><tr align="center"><td><i class="checkbox-common"><input name="sub" type="checkbox" value="51"></i></td><td align="left">至尊会员</td><td align="left">消费额度满20000元</td><td align="right">60<span class="row-50"></span></td><td><a href="/member/updatememberlevel?level_id=51">修改</a>&nbsp;&nbsp;&nbsp;<a href="javascript:deleteMember(51);">删除</a></td></tr></tbody>
  </table>

    </div>
  </section>
</template>
