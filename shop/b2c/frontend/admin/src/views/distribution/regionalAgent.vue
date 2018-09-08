<template>

  <section class="ns-base-section">
    <div style="position:relative;margin:0;">
      <!-- 面包屑导航 -->
        <div class="breadcrumb-nav">
          <a href="index.html">大鵬系統</a>
          <i class="fa fa-angle-right"></i>
          <a href="/Distribution/promoterList.html">分销</a>
          <i class="fa fa-angle-right"></i>
          <!-- 需要加跳转链接用这个：http://showfx.niuteam.cn/admin/Distribution/regionalAgent -->
          <a href="javascript:;" style="color:#999;">区域代理</a>
        </div>
            <!-- 三级导航菜单 -->

        <nav class="ns-third-menu">
          <ul>
            <li class="selected" onclick="location.href='/Distribution/regionalAgent.html';">基本设置</li>
            <li onclick="location.href='/Distribution/promoterRegionAgentList.html';">人员管理</li>
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
                  <p>区域代理</p>
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
        <a id="is_regional_agent" class="btn-common" href="javascript:openRegionalAgent(0)">关闭区域代理(开启中)</a>
      </div>
    <div class="set-style">
      <dl>
        <dt>是否开启区域代理:</dt>
        <dd>
            <input id="is_regional_agent" type="checkbox" class="checkbox" checked="checked" />
            <span class="help-inline" id="is_menuPrompt" style="display: none;"></span>
        </dd>
      </dl>
    <div class="mod-table">
    <div class="mod-table-head">
      <div class="con style0list">
        <table class="table-class">
          <colgroup>
            <col style="width: 20%;">
            <col style="width: 40%;">
            <col style="width: 40%;">
          </colgroup>
          <thead>
            <tr>
              <th>代理级别</th>
              <th>各级奖励比例</th>
              <th>升级条件</th>
            </tr>
          </thead>
          <colgroup>
            <col style="width: 20%;">
            <col style="width: 40%;">
            <col style="width: 40%;">
          </colgroup>
          <tbody id="partner_global">

              <tr align="center">
              <td>省级代理</td>
              <td>
                <input class="input-common harf" type="text" id="province_rate" value="15.00"><em class="unit">%</em>
              </td>
              <td>
                <input class="input-common harf" type="text" id="application_require_province" value="3000.00"><em class="unit">元</em>
              </td>
            </tr>
            <tr align="center">
              <td>市级代理</td>
              <td>
                <input class="input-common harf" type="text" id="city_rate" value="15.00"><em class="unit">%</em>
              </td>
              <td>
                <input class="input-common harf" type="text" id="application_require_city" value="1000.00"><em class="unit">元</em>
              </td>
            </tr>
            <tr align="center">
              <td>区级代理</td>
              <td>
                <input class="input-common harf" type="text" id="district_rate" value="10.00"><em class="unit">%</em>
              </td>
              <td>
                <input class="input-common harf" type="text" id="application_require_district" value="0.00"><em class="unit">元</em>
              </td>
            </tr>
          </tbody>
        </table>
      </div>
    </div>

    </div>
    <div class="set-style" style="padding:13px;text-align:center;">
    <button class="btn-common btn-big" onclick="modifyShopConfigIsRegionalAgent();">提交</button>
    </div>
  </div>

    </div>

  </section>

</template>
