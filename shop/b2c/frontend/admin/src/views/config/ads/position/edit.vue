<template>
  <section class="ns-base-section">

    <div style="position:relative;margin:0;">
      <!-- 面包屑导航 -->
            <div class="breadcrumb-nav">
        <a href="index.html">零基础学IT就来</a>
                  <i class="fa fa-angle-right"></i>
          <a href="/config/usernotice.html">网站</a>
                  <i class="fa fa-angle-right"></i>
          <!-- 需要加跳转链接用这个：http://showfx.niuteam.cn/admin/system/addshopadvposition -->
          <a href="javascript:;" style="color:#999;">添加广告位</a>
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
                  <p>添加广告位</p>
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
    <dt><span style="color:red;margin-right:10px;">*</span>名称：</dt>
    <dd>
      <p><input name="UserCode" id="ap_name" type="text" class="input-common"></p>
      <p class="error">请输入广告位名称</p>
    </dd>
  </dl>
  <dl>
    <dt>广告位关键字：</dt>
    <dd>
      <p><input name="UserCode" id="ap_keyword" type="text" class="input-common" maxlength="60" onkeyup="value=value.replace(/[^a-zA-Z]/ig,'')" onpaste="return false"></p>
      <p class="error">该关键字已被使用</p>
      <p style="color: #999;">广告位关键字可用来调用广告位，关键字必须为英文字符，不得超过60个字符，关键字不可以相同</p>
    </dd>
  </dl>
  <dl>
    <dt>简介：</dt>
    <dd>

      <p><textarea class="textarea-common" id="editor"></textarea></p>
    </dd>
  </dl>
  <dl>
    <dt>类别：</dt>
    <dd>

        <div class="selectric-wrapper selectric-form-control selectric-m-b selectric-select-common" style="width: 250px;"><div class="selectric-hide-select"><select id="ap_class" name="account" class="form-control m-b select-common" tabindex="-1">
          <option value="0">图片</option>
          <option value="4">代码</option>
        </select></div><div class="selectric"><span class="selectric-label">图片</span><button class="selectric-button">▾</button></div><div class="selectric-items" tabindex="-1"><div class="selectric-scroll"><ul><li data-index="0" class="selected" title="图片">图片</li><li data-index="1" class="last" title="代码">代码</li></ul></div></div><input class="selectric-input" tabindex="0"></div>

    </dd>
  </dl>
  <dl>
    <dt>是否启用：</dt>
    <dd>
        <input id="is_use" type="checkbox" class="checkbox" checked="checked" simpleswitch="0" result="true" style="display: none;"><div class="Switch Switch_FlatRadius On" id="Switch0"><span class="switch-open">是</span><span class="switch-close">否</span></div>

    </dd>
  </dl>
  <dl>
    <dt>所在位置类型：</dt>
    <dd>
      <p>
        <label class="radio inline normal">
          <i class="radio-common selected"><input type="radio" name="type" id="type1" value="1" checked=""></i>
          <span>PC端</span>
        </label>
        <label class="radio inline normal">
          <i class="radio-common"><input type="radio" name="type" id="type2" value="2"></i>
          <span>手机端</span>
        </label>
      </p>
    </dd>
  </dl>
  <div class="data-image">
  <dl>
    <dt><span style="color:red;margin-right:10px;">*</span>展示方式：</dt>
    <dd>
      <p id="ap_display">
        <label class="radio normal inline">
          <i class="radio-common selected"><input type="radio" name="ap_display" id="ap_display0" value="0" checked=""></i>
          <span>可以发布多条并幻灯展示</span>
        </label>
        <label class="radio normal inline">
          <i class="radio-common"><input type="radio" name="ap_display" id="ap_display1" value="1"></i>
          <span>可以发布多条广告并随机展示</span>
        </label>
        <label class="radio normal inline">
          <i class="radio-common"><input type="radio" name="ap_display" id="ap_display2" value="2"></i>
          <span>只允许发布并展示一条广告</span>
        </label>
      </p>
      <p class="error">请选择展示方式</p>
    </dd>
  </dl>
  <dl>
    <dt><span style="color:red;margin-right:10px;">*</span>宽度：</dt>
    <dd>
      <p><input id="ap_width" type="number" class="input-common harf"><em class="unit">PX</em></p>
      <p class="error">请输入广告位宽度</p>
    </dd>
  </dl>
  <dl>
    <dt><span style="color:red;margin-right:10px;">*</span>高度：</dt>
    <dd>
      <p><input id="ap_height" type="number" class="input-common harf"><em class="unit">PX</em></p>
      <p class="error">请输入广告位高度</p>
    </dd>
  </dl>
  <dl>
    <dt><span style="color:red;margin-right:10px;">*</span>默认图片：</dt>
    <dd>
      <div class="upload-btn-common">
        <div>
          <input class="input-file" name="file_upload" id="uploadAdv" type="file" onchange="imgUpload(this);" title="上传">
          <input type="hidden" id="adv" value="">
        </div>

        <input type="text" id="text_adv" class="input-common" readonly="readonly" value="">
        <em>上传</em>
        <img id="preview_adv" src="/public/static/blue/img/upload-common-select.png" data-src="" data-html="true" data-container="body" data-placement="top" data-trigger="manual" data-original-title="" title="">
      </div>
      <p class="error">请上传图片</p>
    </dd>
  </dl>
  <dl>
    <dt>默认背景色：</dt>
    <dd>
      <input id="ap_background_color" type="color" style="width:60px;height:25px;" class="input-common-color">
    </dd>
  </dl>
  </div>
  <dl>
    <dt></dt>
    <dd>
      <button class="btn-common btn-big" onclick="addShopAdvPositionAjax();">保存</button>
      <button class="btn-common-cancle btn-big" onclick="javascript:history.back(-1);">返回</button>
    </dd>
  </dl>
  </div>
    </div>

  </section>
</template>
