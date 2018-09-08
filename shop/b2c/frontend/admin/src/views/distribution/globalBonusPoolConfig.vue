<template>

  <section class="ns-base-section">

    <div style="position:relative;margin:0;">
      <!-- 面包屑导航 -->
            <div class="breadcrumb-nav">
        <a href="index.html">大鵬系統</a>
                  <i class="fa fa-angle-right"></i>
          <a href="/Distribution/promoterList.html">分销</a>
                  <i class="fa fa-angle-right"></i>
          <!-- 需要加跳转链接用这个：http://showfx.niuteam.cn/admin/Distribution/globalBonusPoolConfig -->
          <a href="javascript:;" style="color:#999;">全球分红</a>
              </div>
            <!-- 三级导航菜单 -->

                <nav class="ns-third-menu">
          <ul>
                        <li class="selected" onclick="location.href='/Distribution/globalBonusPoolConfig.html';">基本设置</li>
                          <li onclick="location.href='/Distribution/globalBonusPoolPut.html';">发放分红</li>
                          <li onclick="location.href='/Distribution/commissionPartnerGlobalRecordsList.html';">发放记录</li>
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
                  <p>全球分红</p>
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

  <div class="set-style">
  <dl>
    <dt>是否开启全球分红:</dt>
    <dd>

          <input id="is_global_enable" class="checkbox" type="checkbox" checked="checked" />
                    <span class="help-inline" id="is_menuPrompt" style="display: none;"></span>
    </dd>
  </dl>
  </div>
  <table class="mytable">
  <tbody><tr>
    <th align="left">

        <a id="is_global_enable" class="btn-common-white" href="javascript:openGlobalEnable(0)">关闭全球分红(开启中)</a>

    </th>
  </tr>
  </tbody></table>
  <div class="mod-table">
  <div class="mod-table-head">
    <div class="con style0list">
      <table class="table-class">
        <colgroup>
          <col style="width: 10%;">
          <col style="width: 15%;">
          <col style="width: 15%;">
          <col style="width: 15%;">
        </colgroup>
        <thead>
          <tr>
            <th>等级名称</th>
            <th>全球分红分值</th>
            <th>全球分红权重</th>
            <th>创建时间</th>
          </tr>
        </thead>
        <colgroup>
          <col style="width: 10%;">
          <col style="width: 15%;">
          <col style="width: 15%;">
          <col style="width: 15%;">
        </colgroup>
        <tbody id="partner_global">
                    <tr align="center" data-level_id="5">
            <td>儿太热</td>
            <td><input class="input-common middle" type="text" value="10.00"></td>
            <td><input class="input-common middle" type="text" value="10.00"></td>
            <td>2018-07-03 16:59:28</td>
          </tr>
                    <tr align="center" data-level_id="6">
            <td>测试2</td>
            <td><input class="input-common middle" type="text" value="0.00"></td>
            <td><input class="input-common middle" type="text" value="0.00"></td>
            <td>2018-07-17 10:09:54</td>
          </tr>
                </tbody>
      </table>
    </div>
  </div>
  <div style="padding:13px;text-align:center;">
  <button class="btn-common btn-big" onclick="updateGlobalBonusPoolConfig();">提交</button>
  </div>
  </div>

  <input type="hidden" id="page_size">
    </div>

  </section>
</template>
