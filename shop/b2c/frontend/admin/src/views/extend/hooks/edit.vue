<template>
  <section class="ns-base-section">
    <div style="position:relative;margin:0;">
      <!-- 面包屑导航 -->
      <div class="breadcrumb-nav">
        <a href="index.html">零基础学IT就来</a>
        <i class="fa fa-angle-right" />
        <a href="/upgrade/onlineupdate.html">系统</a>
        <i class="fa fa-angle-right" />
        <!-- 需要加跳转链接用这个：http://showfx.niuteam.cn/admin/extend/addhooks -->
        <a href="javascript:;" style="color:#999;">添加钩子</a>
      </div>
      <!-- 三级导航菜单 -->
      <div class="right-side-operation">
        <ul>
          <li>
            <a class="js-open-warmp-prompt" href="javascript:;" data-menu-desc=""><i class="fa fa-question-circle" />&nbsp;提示</a>
            <div class="popover">
              <div class="arrow" />
              <div class="popover-content">
                <div>
                  <h4>功能提示</h4>
                  <p class="function-prompts" />
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
          <dt><span class="color-red">*</span>钩子名称：</dt>
          <dd>
            <input id="name" type="text" class="input-common" >
            <p class="error">请输入钩子名称</p>
            <p class="hint">需要在程序中先添加钩子，否则无效</p>
          </dd>
        </dl>
        <dl>
          <dt>钩子描述：</dt>
          <dd>
            <p><textarea id="desc" class="textarea-common" /></p>
            <p class="hint">钩子的描述信息</p>
          </dd>
        </dl>
        <dl>
          <dt>钩子类型：</dt>
          <dd>
            <div class="selectric-wrapper selectric-select-common" style="width: 250px;">
              <select id="type" class="select-common" tabindex="-1">
                <option value="1">视图</option>
                <option value="2">控制器</option>
              </select>
            </div>
            <div class="selectric">
              <span class="selectric-label">视图</span>
              <button class="selectric-button">▾</button>
            </div>
            <div class="selectric-items" tabindex="-1">
              <div class="selectric-scroll">
                <ul>
                  <li data-index="0" class="selected" title="视图">视图</li>
                  <li data-index="1" class="last" title="控制器">控制器</li>
                </ul>
              </div>
            </div>
            <input class="selectric-input" tabindex="0" >
            <p class="hint">区分钩子的主要用途</p>
          </dd>
        </dl>
        <dl>
          <dd>
            <button class="btn-common btn-big" onclick="save()">保存</button>
            <button class="btn-common-cancle btn-big" onclick="javascript:history.back(-1);">返回</button>
          </dd>
        </dl>
      </div>
    </div>
  </section>
</template>
