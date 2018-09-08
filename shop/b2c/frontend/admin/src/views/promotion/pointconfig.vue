<template>

  <section class="ns-base-section">

    <div style="position:relative;margin:0;">
      <!-- 面包屑导航 -->
            <div class="breadcrumb-nav">
        <a href="index.html">大鵬系統</a>
                  <i class="fa fa-angle-right"></i>
          <a href="/promotion/coupontypelist.html">营销</a>
                  <i class="fa fa-angle-right"></i>
          <!-- 需要加跳转链接用这个：http://showfx.niuteam.cn/admin/promotion/pointconfig -->
          <a href="javascript:;" style="color:#999;">积分管理</a>
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
                  <p>相关教程：<a href="http://bbs.niushop.com.cn/forum.php?mod=viewthread&amp;tid=2316&amp;extra=page%3D2" target="_blank">http://bbs.niushop.com.cn/forum.php?mod=viewthread&amp;tid=2316&amp;extra=page%3D2</a></p>
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

  <div class="space-10"></div>
  <div class="set-style">
  <dl>
    <dt>积分抵现比率：</dt>
    <dd>
      <input id="integrat_money" class="input-mini input-common harf" type="number" min="0.01" step="0.01" value="0.01"><em class="unit">元</em>
      <span class="help-inline ml15" style="display: none;">请输入积分比</span>
      <p class="hint">积分抵现比率 1积分可抵多少元现金</p>
    </dd>
  </dl>
  <dl>
    <dt>是否开启积分抵现：</dt>
    <dd>
        <input id="is_open" type="checkbox" class="checkbox" checked="" simpleswitch="0" result="true" style="display: none;"/>
        <div class="Switch Switch_FlatRadius On" id="Switch0">
          <span class="switch-open">是</span>
          <span class="switch-close">否</span>
          </div>
      <p class="hint">只有启用该选项，才可以使用积分抵现功能</p>
    </dd>
  </dl>
    <dl>
    <dt>积分说明：</dt>
    <dd><textarea id="integrat_description" class="textarea-common">ffff</textarea></dd>
  </dl>
  <dl>
    <dt></dt>
    <dd>
      <button class="btn-common btn-big" onclick="SavepointConfig();">保存</button>
      <button class="btn-common-cancle btn-big" onclick="javascript:history.back(-1);">返回</button>
    </dd>
  </dl>
  </div>

    </div>

  </section>

</template>
