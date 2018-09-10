<template>
  <section class="ns-base-section">
  <div style="position:relative;margin:0;">
    <!-- 面包屑导航 -->
          <div class="breadcrumb-nav">
      <a href="index.html">大鵬系統</a>
                <i class="fa fa-angle-right"></i>
        <a href="/config/usernotice.html">网站</a>
                <i class="fa fa-angle-right"></i>
        <!-- 需要加跳转链接用这个：http://showfx.niuteam.cn/admin/config/pctemplate -->
        <a href="javascript:;" style="color:#999;">店铺装修</a>
            </div>
          <!-- 三级导航菜单 -->

              <nav class="ns-third-menu">
        <ul>
                      <li class="selected" onclick="location.href='/config/pctemplate.html';">电脑端模板</li>
                        <li onclick="location.href='/config/fixedtemplate.html';">手机端模板</li>
                        <li onclick="location.href='/config/wapcustomTemplateList.html';">手机端自定义模板</li>
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
                <p>相关教程：<a href="http://bbs.niushop.com.cn/forum.php?mod=viewthread&amp;tid=2373&amp;extra=page%3D1" target="_blank">http://bbs.niushop.com.cn/forum.php?mod=viewthread&amp;tid=2373&amp;extra=page%3D1</a></p>
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

  <article class="pc-template">

  <div class="block-title">当前使用模板</div>
  <div class="template-list js-curr-use">
  <ul>
    <li style="background-color: #6DC1F2">
      <h4>【官方出品】蓝色清爽简洁版</h4>
      <p>蓝色清爽简洁版 - NiuShop团队支持</p>
      <div class="template-thumbnail">
        <img src="/template/shop/blue/thumbnail.png" alt="缩略图">
      </div>
    </li>
  </ul>
  </div>
  <div class="block-title">可使用模板</div>
  <div class="template-list">
  <ul>
          <li style="background-color: #6DC1F2" data-bgcolor="#6DC1F2">
      <div class="mask-layer">
        <button class="btn-common btn-big" data-folder="blue">使用该模板</button>
      </div>
      <h4>【官方出品】蓝色清爽简洁版</h4>
      <p>蓝色清爽简洁版 - NiuShop团队支持</p>
      <div class="template-thumbnail">
        <img src="/template/shop/blue/thumbnail.png" alt="缩略图">
      </div>
    </li>
        </ul>
  </div>
  </article>

  </div>

  </section>
</template>
