<template>

  <section class="ns-base-section">

    <div style="position:relative;margin:0;">
      <!-- 面包屑导航 -->
            <div class="breadcrumb-nav">
        <a href="index.html">大鵬系統</a>
                  <i class="fa fa-angle-right"></i>
          <a href="/Distribution/promoterList.html">分销</a>
                  <i class="fa fa-angle-right"></i>
          <!-- 需要加跳转链接用这个：http://showfx.niuteam.cn/admin/Distribution/threeLevelDistributionConfig -->
          <a href="javascript:;" style="color:#999;">三级分销</a>
              </div>
            <!-- 三级导航菜单 -->

                <nav class="ns-third-menu">
          <ul>
                        <li class="selected" onclick="location.href='/Distribution/threeLevelDistributionConfig.html';">基本设置</li>
                          <li onclick="location.href='/Distribution/promoterLevelList.html';">推广员等级</li>
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
                  <p>三级分销</p>
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
    <dt>是否开启分销:</dt>
    <dd>

      <input id="is_distribution_enable" type="checkbox" class="checkbox" checked="checked" simpleswitch="0" style="display: none;" result="true"><div class="Switch Switch_FlatRadius On" id="Switch0"><span class="switch-open">是</span><span class="switch-close">否</span></div>
            <span class="help-inline" style="color: #999999">三级分销设置总开关</span>

    </dd>
  </dl>

    <dl>
    <dt>推广员是否需要申请:</dt>
    <dd>
            <input id="is_distribution_start" type="checkbox" class="checkbox" simpleswitch="1" style="display: none;" result="false"><div class="Switch Switch_FlatRadius" id="Switch1"><span class="switch-open">是</span><span class="switch-close">否</span></div>
            <span class="help-inline" style="color: #999999">关闭之后会员注册将直接成为推广员，需提前设置好推广员等级。<span style="color:red;">此选择涉及佣金的计算方式，请谨慎选择！</span></span>
    </dd>
  </dl>

  <dl>
    <dt>推广申请是否需要审核:</dt>
    <dd>

      <input id="is_distribution_audit" type="checkbox" class="checkbox" checked="checked" simpleswitch="2" style="display: none;" result="true"><div class="Switch Switch_FlatRadius On" id="Switch2"><span class="switch-open">是</span><span class="switch-close">否</span></div>
            <span class="help-inline" style="color: #999999">会员成为推广员的申请信息是否需要审核，如需注册的会员自动成为推广员将推广员申请、推广员申请审核关闭即可</span>
    </dd>
  </dl>

  <dl>
    <dt>批量设置为推广员:</dt>
    <dd>
            <input id="is_distribution_set" type="checkbox" class="checkbox" simpleswitch="3" style="display: none;" result="false"><div class="Switch Switch_FlatRadius" id="Switch3"><span class="switch-open">是</span><span class="switch-close">否</span></div>
            <span class="help-inline">开启后将会把之前所有普通会员设置为推广员，请谨慎操作</span>
    </dd>
  </dl>

  <dl>
    <dt>分销佣金:</dt>
    <dd>
            <label class="radio inline normal">
              <i class="radio-common selected">
                <input type="radio" name="distribution_use" value="0" id="distribution_use_yes" checked="">
            </i>
              <span>使用利润</span>
            </label>
        <label class="radio inline normal">
          <i class="radio-common ">
            <input type="radio" name="distribution_use" value="1" id="distribution_use_no">
          </i>
          <span>销售价格</span>
        </label>
    </dd>
  </dl>

  <dl>
    <dt></dt>
    <dd>
      <button class="btn-common btn-big" onclick="modifyShopConfigIsDistribution();">提交</button>
    </dd>
  </dl>
  </div>
    </div>

  </section>

</template>
