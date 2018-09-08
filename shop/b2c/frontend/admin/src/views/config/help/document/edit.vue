<template>

  <section class="ns-base-section" style="">
    <div style="position:relative;margin:0;">
      <!-- 面包屑导航 -->
            <div class="breadcrumb-nav">
        <a href="index.html">大鵬系統</a>
                  <i class="fa fa-angle-right"></i>
          <a href="/config/usernotice.html">网站</a>
                  <i class="fa fa-angle-right"></i>
          <!-- 需要加跳转链接用这个：http://showfx.niuteam.cn/admin/config/updatedocument -->
          <a href="javascript:;" style="color:#999;">修改帮助内容</a>
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
                  <p>updateDocument.html</p>
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

    <!-- 操作提示 -->

  <!-- 		 -->
    <div class="ns-warm-prompt" style="display:none;">
      <div class="alert alert-info">
        <button type="button" class="close">×</button>
        <h4>
  <!-- 					{1block name="alert_info"} -->
  <!-- 					<i class="fa fa-info-circle"></i> -->
  <!-- 					<span class="operating-hints">操作提示</span> -->
  <!-- 						 -->
  <!-- 						<span>updateDocument.html</span> -->
  <!-- 						 -->
  <!-- 					{1/block} -->
        </h4>
      </div>
    </div>


    <div class="ns-main" style="">

  <div class="set-style" style="">
  <dl>
    <dt><span class="required">*</span>标题：</dt>
    <dd>
      <input id="title" type="text" value="购物流程" class="input-common long">
    </dd>
  </dl>
  <dl style="display:none;">
    <dt>标题图片：</dt>
    <dd>
      <div class="upload-btn-common">
        <div>
          <input class="input-file" name="file_upload" id="uploadLogo" type="file" onchange="imgUpload(this);" title="上传">
          <input type="hidden" id="logo" value="">
        </div>

        <input type="text" id="text_logo" class="input-common" readonly="readonly" value="">
        <em>上传</em>
        <img id="preview_logo" src="/public/static/blue/img/upload-common-select.png" data-src="" data-html="true" data-container="body" data-placement="top" data-trigger="manual" data-original-title="" title="">
      </div>
      <p class="hint">
        <span style="color:orange;">建议使用宽100像素-高100像素内的GIF或PNG透明图片；点击下方"提交"按钮后生效。</span>
      </p>
      <p class="error">请上传图片</p>
    </dd>
  </dl>
  <dl style="display:none;">
    <dt>链接地址：</dt>
    <dd>
      <input id="link_url" type="text" value="" class="input-common long">
    </dd>
  </dl>
  <dl>
    <dt>所属分类：</dt>
    <dd>
      <div class="selectric-wrapper selectric-select-common" style="width: 250px;"><div class="selectric-hide-select"><select id="class_id" class="select-common" tabindex="-1">
              <option value="1" selected="">新手上路</option>
                <option value="2">配送与支付</option>
                <option value="3">会员中心</option>
                <option value="4">服务保证</option>
                <option value="5">联系我们</option>
              </select></div><div class="selectric"><span class="selectric-label">新手上路</span><button class="selectric-button">▾</button></div><div class="selectric-items" tabindex="-1"><div class="selectric-scroll"><ul><li data-index="0" class="selected" title="新手上路">新手上路</li><li data-index="1" class="" title="配送与支付">配送与支付</li><li data-index="2" class="" title="会员中心">会员中心</li><li data-index="3" class="" title="服务保证">服务保证</li><li data-index="4" class="last" title="联系我们">联系我们</li></ul></div></div><input class="selectric-input" tabindex="0"></div>
    </dd>
  </dl>
  <dl style="">
    <dt><span class="required">*</span>内容：</dt>

  </dl>
  <dl>
    <dt>是否显示：</dt>
    <dd>
      <input id="is_visibility" type="checkbox" class="checkbox" checked="checked" simpleswitch="0" result="true" style="display: none;"><div class="Switch Switch_FlatRadius On" id="Switch0"><span class="switch-open">是</span><span class="switch-close">否</span></div>
    </dd>
  </dl>
  <dl>
    <dt>排序：</dt>
    <dd>
      <input id="sort" type="number" value="0" onkeyup="this.value=this.value.replace(/\D/g,'')" class="input-common harf">
    </dd>
  </dl>
  <input type="hidden" value="1" id="document_id">
  <input type="hidden" value="" id="content">
  <dl>
    <dt></dt>
    <dd>
      <button class="btn-common btn-big" onclick="setConfigAjax();">保存</button>
      <button class="btn-common-cancle btn-big" onclick="javascript:history.back(-1);">返回</button>
    </dd>
  </dl>
  </div>

    </div>

  </section>
</template>
