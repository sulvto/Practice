<template>
  <section class="ns-base-section">

    <div style="position:relative;margin:0;">
      <!-- 面包屑导航 -->
            <div class="breadcrumb-nav">
        <a href="http://b2c.niuteam.cn/admin.html">单商户B2C</a>
                  <i class="fa fa-angle-right"></i>
          <a href="/goods/goodslist.html">商品</a>
                  <i class="fa fa-angle-right"></i>
          <!-- 需要加跳转链接用这个：http://b2c.niuteam.cn/admin/goods/updategoodsgroup -->
          <a href="javascript:;" style="color:#999;">修改商品标签</a>
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
                  <p>修改商品分组</p>
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
  <input name="UserCode" id="group_id" type="hidden" value="5">
  <dl>
    <dt><span class="color-red">*</span>商品标签名称：</dt>
    <dd>
      <p><input name="UserCode" id="group_name" class="input-common" type="text" value="网红"> </p>
      <p class="error">请输入商品标签名称</p>
    </dd>
  </dl>
  <dl>
    <dt>排序：</dt>
    <dd>
      <p><input name="UserCode" id="sort" class="input-common harf" type="number" value="0"></p>
      <p class="error">请输入序号</p>
    </dd>
  </dl>
  <dl>
    <dt>标签图片：</dt>
    <dd>
      <div class="upload-btn-common">
        <div>
          <input class="input-file" name="file_upload" id="uploadGroup_pic" type="file" onchange="imgUpload(this);" title="上传">
          <input type="hidden" id="group_pic" value="">
        </div>
        <input type="text" id="text_group_pic" class="input-common" readonly="readonly" value="">
        <em>上传</em>

        <img id="preview_group_pic" src="/public/static/blue/img/upload-common-select.png" data-html="true" data-container="body" data-placement="top" data-trigger="manual">

      </div>
      <p class="hint">
        <span>建议使用<i class="important-note">宽200</i>像素-<i class="important-note">高60</i>像素内的<i class="important-note">GIF</i>或<i class="important-note">PNG</i>透明图片；点击下方"保存"按钮后生效。</span>
      </p>
    </dd>
  </dl>
  <dl>
    <dt>商品标签描述：</dt>
    <dd>
      <p><textarea class="textarea-common" id="group_dec"></textarea></p>
      <p class="error">请输入商品标签描述</p>
    </dd>
  </dl>
  <dl>
    <dt></dt>
    <dd>
      <button class="btn-common btn-big" onclick="updateGoodsCategoryAjax();">保存</button>
      <button class="btn-common-cancle btn-big" onclick="javascript:history.back(-1);">返回</button>
    </dd>
  </dl>
  </div>
    </div>

  </section>
</template>
