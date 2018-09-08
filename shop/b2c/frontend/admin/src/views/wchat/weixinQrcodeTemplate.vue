<template>

  <section class="ns-base-section">

    <div style="position:relative;margin:0;">
      <!-- 面包屑导航 -->
            <div class="breadcrumb-nav">
        <a href="index.html">大鵬系統</a>
                  <i class="fa fa-angle-right"></i>
          <a href="/wchat/config.html">微信</a>
                  <i class="fa fa-angle-right"></i>
          <!-- 需要加跳转链接用这个：http://showfx.niuteam.cn/admin/wchat/weixinqrcodetemplate -->
          <a href="javascript:;" style="color:#999;">推广二维码管理</a>
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
                  <p>相关教程：<a href="http://bbs.niushop.com.cn/forum.php?mod=viewthread&amp;tid=2328&amp;extra=page%3D2" target="_blank">http://bbs.niushop.com.cn/forum.php?mod=viewthread&amp;tid=2328&amp;extra=page%3D2</a></p>
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
  <button class="btn-common btn-small" onclick="load_url()">添加自定义模板</button>
  </div>
  <div id="pictureIndex" class="ncsc-picture-folder">
  <div class="ncsc-album">
    <div style="clear:both;"></div>
    <ul id="albumList">

      <li style="opacity: 1;height:auto;position:relative;width:19%;float:left;margin-right:1%;margin-top:10px;margin-bottom:10px;" onmouseover="checkShowThis(this);" onmouseout="checkHideThis(this);">
            <img src="/upload/qrcode/promote_qrcode_template/qrcode_template_1_0.png" style="border:1px solid #eee;">
                <div class="check">
                  <div style="margin-top:50%;cursor:pointer;" onclick="modifyWeixinQrcodeTemplateValid(1)">
            <span>设为默认</span>
          </div>
          <div onclick="deleteWeixinQrcodeTemplateValid(1)" style="cursor:pointer;">
            <span>删除</span>
          </div>
          <div onclick="modifyWeixinQrcode(1)" style="cursor:pointer;">
            <span>编辑</span>
          </div>
                  </div>
        <input type="hidden" class="id" value="1">
        <input type="hidden" class="background" value="public/static/images/qrcode_bg/qrcode_bg.png">
        <input type="hidden" class="nick_font_color" value="#2b2b2b">
        <input type="hidden" class="nick_font_size" value="23">
        <input type="hidden" class="is_logo_show" value="1">
        <input type="hidden" class="header_left" value="93px">
        <input type="hidden" class="header_top" value="467px">
        <input type="hidden" class="name_left" value="159px">
        <input type="hidden" class="name_top" value="479px">
        <input type="hidden" class="logo_left" value="98px">
        <input type="hidden" class="logo_top" value="319px">
        <input type="hidden" class="code_left" value="89px">
        <input type="hidden" class="code_top" value="88px">
        <div>

            <img src="/public/admin/images/check_qrcode1.png" class="qrcode_img" style="position:absolute;top:0px;leftt:1px;display:none;">
                  </div>
      </li>

      <li style="opacity: 1;height:auto;position:relative;width:19%;float:left;margin-right:1%;margin-top:10px;margin-bottom:10px;" onmouseover="checkShowThis(this);" onmouseout="checkHideThis(this);">
            <img src="/upload/qrcode/promote_qrcode_template/qrcode_template_6_0.png" style="border:1px solid #00C0FF;">
                <div class="check">

          <div onclick="modifyWeixinQrcode(6)" style="margin-top:60%;cursor:pointer;">
            <span>编辑</span>
          </div>
                  </div>
        <input type="hidden" class="id" value="6">
        <input type="hidden" class="background" value="">
        <input type="hidden" class="nick_font_color" value="#2b2b2b">
        <input type="hidden" class="nick_font_size" value="23">
        <input type="hidden" class="is_logo_show" value="1">
        <input type="hidden" class="header_left" value="59px">
        <input type="hidden" class="header_top" value="15px">
        <input type="hidden" class="name_left" value="150px">
        <input type="hidden" class="name_top" value="120px">
        <input type="hidden" class="logo_left" value="120px">
        <input type="hidden" class="logo_top" value="100px">
        <input type="hidden" class="code_left" value="83px">
        <input type="hidden" class="code_top" value="174px">
        <div>

            <img src="/public/admin/images/check_qrcode1.png" class="qrcode_img" style="position:absolute;top:0px;left:1px;">
                  </div>
      </li>

      <li style="opacity: 1;height:auto;position:relative;width:19%;float:left;margin-right:1%;margin-top:10px;margin-bottom:10px;" onmouseover="checkShowThis(this);" onmouseout="checkHideThis(this);">
            <img src="/upload/qrcode/promote_qrcode_template/qrcode_template_7_0.png" style="border:1px solid #eee;">
                <div class="check">
                  <div style="margin-top:50%;cursor:pointer;" onclick="modifyWeixinQrcodeTemplateValid(7)">
            <span>设为默认</span>
          </div>
          <div onclick="deleteWeixinQrcodeTemplateValid(7)" style="cursor:pointer;">
            <span>删除</span>
          </div>
          <div onclick="modifyWeixinQrcode(7)" style="cursor:pointer;">
            <span>编辑</span>
          </div>
                  </div>
        <input type="hidden" class="id" value="7">
        <input type="hidden" class="background" value="">
        <input type="hidden" class="nick_font_color" value="#2b2b2b">
        <input type="hidden" class="nick_font_size" value="23">
        <input type="hidden" class="is_logo_show" value="1">
        <input type="hidden" class="header_left" value="59px">
        <input type="hidden" class="header_top" value="15px">
        <input type="hidden" class="name_left" value="150px">
        <input type="hidden" class="name_top" value="120px">
        <input type="hidden" class="logo_left" value="120px">
        <input type="hidden" class="logo_top" value="100px">
        <input type="hidden" class="code_left" value="70px">
        <input type="hidden" class="code_top" value="300px">
        <div>

            <img src="/public/admin/images/check_qrcode1.png" class="qrcode_img" style="position:absolute;top:0px;leftt:1px;display:none;">
                  </div>
      </li>
        </ul>
  </div>
  </div>
    </div>

  </section>

</template>
