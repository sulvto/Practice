<template>

  <section class="ns-base-section">
    <div style="position:relative;margin:0;">
        <!-- 面包屑导航 -->
      <div class="breadcrumb-nav">
        <a href="index.html">大鵬系統</a>
          <i class="fa fa-angle-right"></i>
        <a href="/wchat/config.html">微信</a>
        <i class="fa fa-angle-right"></i>
        <!-- 需要加跳转链接用这个：http://showfx.niuteam.cn/admin/Wchat/fansMessageManage -->
        <a href="javascript:;" style="color:#999;">客服管理</a>
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

        <div class="mod-table">
            <div class="mod-table-head">

                <div class="con style0list">

                    <table class="table-class">
                        <colgroup>
                            <col style="width: 2%;">
                            <col style="width: 16%;">
                            <col style="width: 17%;">
                            <col style="width: 16%;">
                            <col style="width: 17%;">
                            <col style="width: 16%;">
                            <col style="width: 10%;">
                        </colgroup>
                        <thead>
                            <tr align="center">
                                <th><i class="checkbox-common"><input type="checkbox" onclick="CheckAll(this)"></i></th>
                                <th align="left">粉丝昵称</th>
                                <th align="left">留言内容</th>
                                <th>留言时间</th>
                                <th align="left">回复内容</th>
                                <th>回复时间</th>
                                <th>操作</th>
                            </tr>
                        </thead>
                        <tbody id="productTbody"><tr align="center"><td colspan="8">暂无公告信息</td></tr></tbody>
                    </table>
                </div>
            </div>
        </div>
    </div>
  </section>
</template>
