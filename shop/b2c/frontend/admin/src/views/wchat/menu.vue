<template>

  <section class="ns-base-section">

  <div style="position:relative;margin:0;">
    <!-- 面包屑导航 -->
    <div class="breadcrumb-nav">
      <a href="index.html">大鵬系統</a>
            <i class="fa fa-angle-right"></i>
      <a href="/wchat/config.html">微信</a>
            <i class="fa fa-angle-right"></i>
      <!-- 需要加跳转链接用这个：http://showfx.niuteam.cn/admin/wchat/menu -->
      <a href="javascript:;" style="color:#999;">微信菜单管理</a>
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
                <p>相关教程：<a href="http://bbs.niushop.com.cn/forum.php?mod=viewthread&amp;tid=2327&amp;extra=page%3D2" target="_blank">http://bbs.niushop.com.cn/forum.php?mod=viewthread&amp;tid=2327&amp;extra=page%3D2</a></p>
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

  <!-- 菜单编辑 -->
  <div class="menu_setting_area js_editBox">
  <div class="menu_preview_area">
  <div class="mobile_menu_preview">
    <div class="mobile_hd tc">大鵬系統</div>
    <div class="mobile_bd">
      <!-- 菜单 -->
      <ul class="pre_menu_list grid_line" id="menuList">
                  <!-- 加载菜单 -->
        <li class="pre_menu_item size1of3" data-menu-index="1">

          <!-- 一级菜单 -->
          <a href="javascript:void(0);" ondragstart="return false" class="pre_menu_link jsMenu" data-menuid="1" data-pid="0" data-menu-eventurl="" data-menu-type="1" data-detault-menu-type="1" data-mediaid="0" data-sort="1" data-appid="" data-pagepath="">

                          <!-- 有二级菜单，显示小图标 -->
            <i class="icon_menu_dot js_icon_menu_dot dn"></i>
                          <span>菜单名称</span>
          </a>
          <!-- 一级菜单 -->

          <!-- 二级菜单 -->
          <div class="sub_pre_menu_box" data-submenulist="1" style="display: none;">
            <ul class="sub_pre_menu_list">
                            <li class="jsSubMenuInner">
                <a href="javascript:void(0);" ondragstart="return false" data-pid="1" data-menuid="11" data-menu-eventurl="http://www.baidu.com" data-menu-type="4" data-detault-menu-type="4" data-mediaid="0" data-sort="1" data-appid="4" data-pagepath="2222222">
                  <span class="sub_pre_menu_inner">小程序</span>
                </a>
              </li>
                            <li class="jsSubMenuInner">
                <a href="javascript:void(0);" ondragstart="return false" data-pid="1" data-menuid="12" data-menu-eventurl="http://www.baidu.com" data-menu-type="1" data-detault-menu-type="1" data-mediaid="0" data-sort="2" data-appid="1" data-pagepath="">
                  <span class="sub_pre_menu_inner">到百度</span>
                </a>
              </li>
                            <li class="jsSubMenuInner">
                <a href="javascript:void(0);" ondragstart="return false" data-pid="1" data-menuid="13" data-menu-eventurl="http://showfx.niuteam.cn" data-menu-type="1" data-detault-menu-type="1" data-mediaid="0" data-sort="3" data-appid="1" data-pagepath="">
                  <span class="sub_pre_menu_inner">子菜单名称</span>
                </a>
              </li>

            <!-- 限制二级菜单数量的添加 -->
              <li class="jsSubMenu" data-pid="1" data-subindex="1">
                <a href="javascript:void(0);" title="最多添加5个子菜单">
                  <span class="sub_pre_menu_inner">
                    <i class="icon14_menu_add" style="background-position: 0 0;"></i>
                  </span>
                </a>
              </li>
            </ul>
            <i class="arrow arrow_out"></i> <i class="arrow arrow_in"></i><!-- 箭头 -->
          </div>
          <!-- 二级菜单 -->

        </li>
                  <!-- 加载菜单 -->
        <li class="pre_menu_item size1of3" data-menu-index="2">

          <!-- 一级菜单 -->
          <a href="javascript:void(0);" ondragstart="return false" class="pre_menu_link jsMenu" data-menuid="2" data-pid="0" data-menu-eventurl="http://www.baidu.com" data-menu-type="4" data-detault-menu-type="4" data-mediaid="0" data-sort="2" data-appid="11111" data-pagepath="111111111">

                          <span>菜单名称</span>
          </a>
          <!-- 一级菜单 -->

          <!-- 二级菜单 -->
          <div class="sub_pre_menu_box" data-submenulist="2" style="display: none;">
            <ul class="sub_pre_menu_list">

            <!-- 限制二级菜单数量的添加 -->
              <li class="jsSubMenu" data-pid="2" data-subindex="2">
                <a href="javascript:void(0);" title="最多添加5个子菜单">
                  <span class="sub_pre_menu_inner">
                    <i class="icon14_menu_add" style="background-position: 0 0;"></i>
                  </span>
                </a>
              </li>
            </ul>
            <i class="arrow arrow_out"></i> <i class="arrow arrow_in"></i><!-- 箭头 -->
          </div>
          <!-- 二级菜单 -->

        </li>
                  <!-- 加载菜单 -->
        <li class="pre_menu_item size1of3 current" data-menu-index="3">

          <!-- 一级菜单 -->
          <a href="javascript:void(0);" ondragstart="return false" class="pre_menu_link jsMenu" data-menuid="3" data-pid="0" data-menu-eventurl="" data-menu-type="1" data-detault-menu-type="1" data-mediaid="0" data-sort="3" data-appid="" data-pagepath="">

                          <!-- 有二级菜单，显示小图标 -->
            <i class="icon_menu_dot js_icon_menu_dot dn"></i>
                          <span>菜单名称</span>
          </a>
          <!-- 一级菜单 -->

          <!-- 二级菜单 -->
          <div class="sub_pre_menu_box" data-submenulist="3">
            <ul class="sub_pre_menu_list">
                            <li class="jsSubMenuInner">
                <a href="javascript:void(0);" ondragstart="return false" data-pid="3" data-menuid="9" data-menu-eventurl="http://www.baidu.com" data-menu-type="2" data-detault-menu-type="2" data-mediaid="3" data-sort="1" data-appid="2" data-pagepath="11111111111111">
                  <span class="sub_pre_menu_inner">子菜单名称</span>
                </a>
              </li>

            <!-- 限制二级菜单数量的添加 -->
              <li class="jsSubMenu" data-pid="3" data-subindex="3">
                <a href="javascript:void(0);" title="最多添加5个子菜单">
                  <span class="sub_pre_menu_inner">
                    <i class="icon14_menu_add" style="background-position: 0 0;"></i>
                  </span>
                </a>
              </li>
            </ul>
            <i class="arrow arrow_out"></i> <i class="arrow arrow_in"></i><!-- 箭头 -->
          </div>
          <!-- 二级菜单 -->

        </li>

        <!-- 限制一级菜单数量的添加 -->
        <li class="js-addMenuBtn pre_menu_item size1of3" style="display:none;" data-class-index="3">
          <a href="javascript:void(0);" class="pre_menu_link " title="最多添加3个一级菜单">
            <i class="icon14_menu_add"></i>
                        </a>
        </li>

      </ul>
      <!-- 菜单 -->
    </div>
  </div>

  <!-- 菜单排序，后期实现拖拽 -->
  <div class="sort_btn_wrp">
    <a id="orderBt" class="btn-common-white" href="javascript:void(0);">菜单排序</a>
    <span id="orderDis" class=" dn btn-common-white btn_disabled">菜单排序</span>
    <a id="finishBt" href="javascript:void(0);" class="dn btn-common-white btn-big">完成</a>
  </div>

  </div>

  <div class="menu_form_area">
  <!-- 点击左侧菜单进行编辑操作 -->
  <div id="js_none" class="menu_initial_tips tips_global" style="display: none;">请通过拖拽左边的菜单进行排序</div>
  <div id="js_rightBox" class="portable_editor to_left">
    <div class="editor_inner">
      <div class="global_mod float_layout menu_form_hd js_second_title_bar">
        <h4 class="global_info">菜单名称</h4>
        <div class="global_extra">
          <a href="javascript:void(0);" id="jsDelBt" data-menuid="3" data-menuname="菜单名称">删除菜单</a>
        </div>
      </div>
      <div class="menu_form_bd" id="view">
        <div id="js_innerNone" class="msg_sender_tips tips_global">已添加子菜单，仅可设置菜单名称。</div>
        <div class="frm_control_group js_setNameBox">
          <label for="menuname" class="frm_label"><strong class="title js_menuTitle">菜单名称</strong></label>
          <div class="frm_controls">
            <span class="frm_input_box with_counter counter_in append">
              <input type="text" id="menuname" data-switch="menuname" class="input-common" style="box-shadow: none; padding: 0;" value="菜单名称">
            </span>
            <p class="frm_msg fail js_titleEorTips dn" style="display: none;">字节超过上限</p>
            <p class="frm_msg fail js_titlenoTips dn" style="display: none;">请输入菜单名称</p>
            <p class="frm_tips js_titleNolTips">字数不超过4个汉字或8个字母</p>
          </div>
        </div>
        <div class="frm_control_group js_setGraphic" style="display:none;">
          <label for="" class="frm_label"> <strong class="title js_menuContent">菜单内容</strong></label>
          <div class="frm_controls frm_vertical_pt">
            <label class="frm_radio_label js_radio_sendMsg ">
              <i class="icon_radio"></i> <span class="lbl_content">发送消息</span>
            </label>
            <label class="frm_radio_label js_radio_url  selected">
              <i class="icon_radio"></i> <span class="lbl_content">跳转网页</span>
            </label>
            <label class="frm_radio_label js_small_program ">
              <i class="icon_radio"></i> <span class="lbl_content">跳转小程序</span>
            </label>
          </div>
        </div>
        <div class="menu_content_container js_setGraphic" style="display:none;">
          <!-- 发送消息 -->

          <div class="menu_content send jsMain" id="edit" style="display:none;">
            <div class="msg_sender" id="editDiv">
              <div class="msg_tab">
                <div class="tab_navs_panel">
                  <div class="tab_navs_wrp">
                    <ul class="tab_navs js_tab_navs">

                      <li class="tab_nav tab_appmsg width4 selected" data-type="10" data-tab=".js_appmsgArea" data-tooltip="图文消息">
                        <a href="javascript:void(0);">&nbsp;<i class="icon_msg_sender"></i><span class="msg_tab_title">图文消息</span></a>
                      </li>
                      <!--
                      <li class="tab_nav tab_img width4" data-type="2" data-tab=".js_imgArea" data-tooltip="图片">
                        <a href="javascript:void(0);">&nbsp;<i class="icon_msg_sender"></i><span class="msg_tab_title">图片</span></a>
                      </li>

                      <li class="tab_nav tab_audio width4" data-type="3" data-tab=".js_audioArea" data-tooltip="语音">
                        <a href="javascript:void(0);">&nbsp;<i class="icon_msg_sender"></i><span class="msg_tab_title">语音</span></a>
                      </li>
                      <li class="tab_nav tab_video width4 no_extra" data-type="15" data-tab=".js_videoArea" data-tooltip="视频">
                        <a href="javascript:void(0);">&nbsp;<i class="icon_msg_sender"></i><span class="msg_tab_title">视频</span></a>
                      </li> -->

                    </ul>
                  </div>
                </div>
                <div class="tab_panel">

                  <div class="tab_content">
                    <div class="js_appmsgArea inner">

                      <div class="tab_cont_cover jsMsgSendTab">
                        <div class="media_cover">
                          <span class="create_access">
                            <a class="add_gray_wrp jsMsgSenderPopBt" href="javascript:;">
                            <i class="icon36_common add_gray"></i> <strong>从素材库中选择</strong>
                          </a>
                          </span>
                        </div>
                        <div class="media_cover">
                          <span class="create_access">
                            <a target="_blank" class="add_gray_wrp" href="/Wchat/addMedia.html">
                              <i class="icon36_common add_gray"></i> <strong>新建图文消息</strong>
                            </a>
                          </span>
                        </div>
                      </div>

                      <div id="show_media" style="display:none;">
                        <div class="appmsg multi has_first_cover">
                          <div class="appmsg_content">
                            <div class="appmsg_info">
                              <em class="appmsg_date">
                                                                </em>
                            </div>
                            <div class="cover_appmsg_item">
                              <h4 class="appmsg_title js-media-title">
                                <a href="" target="_blank">
                                                                    </a>
                              </h4>

                              <!-- 封面 -->
                              <div class="appmsg_thumb_wrp">
                              </div>
                              <a href="javascript:;" class="edit_mask preview_mask js-preview" data-media-item-id="">
                                <div class="edit_mask_content">
                                  <p style="color:#fff;">预览文章</p>
                                </div>
                                <span class="vm_box"></span>
                              </a>
                            </div>
                                                        </div>
                        </div>
                        <a href="javascript:;" class="jsmsgSenderDelBt link_dele" data-mediaid="0">删除</a>
                      </div>

                    </div>
                  </div>
                  <!--
                  <div class="tab_content" style="display: none;">
                    <div class="js_imgArea inner ">

                      <div class="tab_cont_cover jsMsgSendTab" data-index="1" data-type="2">
                        <div class="media_cover">
                          <span class="create_access">
                            <a class="add_gray_wrp jsMsgSenderPopBt" href="javascript:;" data-type="2" data-index="1">
                              <i class="icon36_common add_gray"></i> <strong>从素材库中选择</strong>
                            </a>
                          </span>
                        </div>
                        <div class="media_cover">
                          <span class="create_access">
                            <a class="add_gray_wrp" id="msgSendImgUploadBt" data-type="2" href="javascript:;">
                              <i class="icon36_common add_gray"></i> <strong>上传图片</strong>
                            </a>
                          </span>
                        </div>
                      </div>

                    </div>
                  </div>

                  <div class="tab_content" style="display: none;">
                    <div class="js_audioArea inner ">

                      <div class="tab_cont_cover jsMsgSendTab" data-index="2" data-type="3">
                        <div class="media_cover">
                          <span class="create_access">
                            <a class="add_gray_wrp jsMsgSenderPopBt" href="javascript:;" data-type="3" data-index="2">
                              <i class="icon36_common add_gray"></i> <strong>从素材库中选择</strong>
                            </a>
                          </span>
                        </div>
                        <div class="media_cover">
                          <span class="create_access">
                            <a class="add_gray_wrp " id="msgSendAudioUploadBt" href="javascript:;">
                              <i class="icon36_common add_gray"></i> <strong>新建语音</strong>
                            </a>
                          </span>
                        </div>
                      </div>

                    </div>
                  </div>

                  <div class="tab_content" style="display: none;">
                    <div class="js_videoArea inner ">

                      <div class="tab_cont_cover jsMsgSendTab" data-index="3">
                        <div class="media_cover">
                          <span class="create_access">
                            <a class="add_gray_wrp jsMsgSenderPopBt" href="javascript:;" data-type="15" data-index="3">
                              <i class="icon36_common add_gray"></i> <strong>从素材库中选择</strong>
                            </a>
                          </span>
                        </div>
                        <div class="media_cover">
                          <span class="create_access">
                            <a target="_blank" class="add_gray_wrp" href="/cgi-bin/appmsg?t=media/videomsg_edit&amp;action=video_edit&amp;type=15&amp;lang=zh_CN&amp;token=65573610">
                              <i class="icon36_common add_gray"></i> <strong>新建视频</strong>
                            </a>
                          </span>
                        </div>
                      </div>

                    </div>
                  </div> -->

                </div>
              </div>
            </div>
            <p class="profile_link_msg_global menu_send mini_tips warn dn js_warn">请勿添加其他公众号的主页链接</p>
          </div>

          <!-- 发送消息 -->

          <!-- 跳转网页 -->

          <div class="menu_content url jsMain" id="url" style="display: block;">
            <!-- <form action="" id="urlForm" onsubmit="return false;"> -->
              <p class="menu_content_tips tips_global">订阅者点击该子菜单会跳到以下链接</p>
              <div class="frm_control_group">
                <label for="urltext" class="frm_label"><strong class="title">页面地址</strong></label>
                <div class="frm_controls">
                  <span class="frm_input_box">
                    <input type="text" class="frm_input" id="urltext" data-switch="url" value="" name="urlText" style="border: 0; box-shadow: none; padding: 0;">
                  </span>
                  <p class="profile_link_msg_global menu_url mini_tips warn dn js_warn">请勿添加其他公众号的主页链接</p>
                  <!-- <p class="frm_tips" id="js_urlTitle" style="display: none;">
                    来自<span class="js_name"></span><span style="display: none;">
                      -《<span class="js_title"></span>》
                    </span>
                  </p> -->
                </div>
              </div>
              <!--
              <div class="frm_control_group btn_appmsg_wrap">
                <div class="frm_controls">
                  <p class="frm_msg fail dn" id="urlUnSelect" style="display: none;">
                    <span for="urlText" class="frm_msg_content" style="display: inline;">请选择一篇文章</span>
                  </p>
                    <a href="javascript:;" id="js_appmsgPop">从公众号图文消息中选择</a>
                  <a href="javascript:void(0);" class="dn btn btn_default" id="js_reChangeAppmsg">重新选择</a>
                </div>
              </div>
              -->
            <!-- </form> -->
          </div>

          <!-- 跳转网页 -->
          <div class="menu_content sended" style="display: none;">
            <p class="menu_content_tips tips_global">订阅者点击该子菜单会跳到以下链接</p>
            <div class="msg_wrp" id="viewDiv"></div>
            <p class="frm_tips">
              来自<span class="js_name">素材库</span><span style="display: none;">
                -《<span class="js_title"></span>》
              </span>
            </p>
          </div>
          <!-- 跳转小程序 -->
          <div class="menu_content url jsMain" id="small_program" style="display:none;">
            <p class="menu_content_tips tips_global">点击该菜单会跳到设置的小程序,如果微信不支持小程序将会跳转到下方定义的网址</p>
            <div class="frm_control_group">
                <label for="urltext" class="frm_label"><strong class="title">跳转网址</strong></label>
                <div class="frm_controls">
                  <span class="frm_input_box">
                    <input type="text" class="frm_input" id="smallProgramUrltext" data-switch="url" value="" name="smallProgramUrltext" style="border: 0; box-shadow: none; padding: 0;">
                  </span>
                  <p class="profile_link_msg_global menu_url mini_tips warn dn js_warn"></p>
                </div>
              </div>
            <div class="frm_control_group">
              <label for="urltext" class="frm_label"><strong class="title">小程序appid</strong></label>
              <div class="frm_controls">
                <span class="frm_input_box">
                  <input type="text" class="frm_input" id="appid" value="" name="appid" style="border: 0; box-shadow: none; padding: 0;">
                </span>
              </div>
            </div>
            <div class="frm_control_group">
              <label for="urltext" class="frm_label"><strong class="title">小程序页面路径</strong></label>
              <div class="frm_controls">
                <span class="frm_input_box">
                  <input type="text" class="frm_input" id="pagepath" value="" name="pagepath" style="border: 0; box-shadow: none; padding: 0;">
                </span>
              </div>
            </div>
          </div>
          <!-- 跳转小程序 -->
          <div id="js_errTips" style="display: none;" class="msg_sender_msg mini_tips warn"></div>
        </div>
      </div>
    </div>

    <!-- 左箭头 -->

    <span class="editor_arrow_wrp">
      <i class="editor_arrow editor_arrow_out"></i>
      <i class="editor_arrow editor_arrow_in"></i>
    </span>

    <!-- 左箭头 -->

  </div>
  <!-- 点击左侧菜单进行编辑操作 -->

  </div>
  </div>
  <!-- 菜单编辑 -->

  <div class="tool_bar tc js_editBtn">
  <span id="pubBt" class="btn-common btn-big" style="display: inline-block;">保存并发布</span>
  <a href="javascript:void(0);" class="btn-common-white btn-big" id="viewBt" style="display: inline-block;">预览</a>
  </div>

  <!-- 删除菜单弹出框 -->
  <div class="dialog_wrp ui-draggable" style="width: 720px; margin-left: -360px; margin-top: -186px; display: none;" id="wxDelDialog">
  <div class="dialog">
  <div class="dialog_hd">
    <h3>温馨提示</h3>
    <a href="javascript:;" class="pop_closed">关闭</a>
  </div>
  <div class="dialog_bd">
    <div class="page_msg large simple default">
      <div class="inner group">
        <span class="msg_icon_wrapper"><i class="icon_msg warn"></i></span>
        <div class="msg_content ">
          <h4>删除确认</h4>
          <p></p>
        </div>
      </div>
    </div>
  </div>
  <div class="dialog_ft">
    <a href="javascript:;" class="btn-common btn-big js_btn">确定</a>
    <a href="javascript:;" class="btn-common-white btn-big js_btn">取消</a>
  </div>
  </div>
  </div>

  <!-- 删除菜单弹出框 -->
  <!-- 手机预览 -->
  <div class="mobile_preview" id="mobileDiv" style="display: none;">
  <div class="mobile_preview_hd">
  <strong class="nickname">大鵬系統</strong>
  </div>
  <div class="mobile_preview_bd">
  <ul id="viewShow" class="show_list"></ul>
  </div>
  <div class="mobile_preview_ft">
  <ul class="pre_menu_list grid_line" id="viewList">
          <li class="pre_menu_item grid_item size1of3" data-mobile-menu-index="1">
      <a href="javascript:void(0);" class="jsView pre_menu_link" title="菜单名称" data-menuid="1">
                  <i class="icon_menu_dot"></i>
                  <span>菜单名称</span>
      </a>
      <div class="sub_pre_menu_box jsSubViewDiv" data-subindex="1" style="display: none">
        <ul class="sub_pre_menu_list">
                      <li>
            <a href="javascript:void(0);" data-pid="1" data-menuid="11" class="jsSubView" title="小程序">小程序</a>
          </li>
                      <li>
            <a href="javascript:void(0);" data-pid="1" data-menuid="12" class="jsSubView" title="到百度">到百度</a>
          </li>
                      <li>
            <a href="javascript:void(0);" data-pid="1" data-menuid="13" class="jsSubView" title="子菜单名称">子菜单名称</a>
          </li>
                    </ul>
        <i class="arrow arrow_out"></i><i class="arrow arrow_in"></i>
      </div>
    </li>
          <li class="pre_menu_item grid_item size1of3" data-mobile-menu-index="2">
      <a href="javascript:void(0);" class="jsView pre_menu_link" title="菜单名称" data-menuid="2">
                  <span>菜单名称</span>
      </a>
      <div class="sub_pre_menu_box jsSubViewDiv" data-subindex="2" style="display: none">
        <ul class="sub_pre_menu_list">
                    </ul>
        <i class="arrow arrow_out"></i><i class="arrow arrow_in"></i>
      </div>
    </li>
          <li class="pre_menu_item grid_item size1of3" data-mobile-menu-index="3">
      <a href="javascript:void(0);" class="jsView pre_menu_link" title="菜单名称" data-menuid="3">
                  <i class="icon_menu_dot"></i>
                  <span>菜单名称</span>
      </a>
      <div class="sub_pre_menu_box jsSubViewDiv" data-subindex="3" style="display: none">
        <ul class="sub_pre_menu_list">
                      <li>
            <a href="javascript:void(0);" data-pid="3" data-menuid="9" class="jsSubView" title="子菜单名称">子菜单名称</a>
          </li>
                    </ul>
        <i class="arrow arrow_out"></i><i class="arrow arrow_in"></i>
      </div>
    </li>
        </ul>
  </div>
  <a href="javascript:void(0);" class="mobile_preview_closed btn-common-white btn-big" id="viewClose">退出预览</a>
  </div>
  <!-- 遮罩层 -->
  <div class="mask" style="display: none;" id="maskLayer"></div>
  <!-- 操作反馈弹出框 erro 失败-->
  <div class="JS_TIPS page_tips success" id="wxTips" style="display:none;">
  <div class="inner"></div>
  </div>
  <input type="hidden" id="hidden_default_sort">
  <input type="hidden" id="hidden_default_sub_sort">
  <!-- 选择图文素材 -->
  <div class="dialog_wrp media align_edge ui-draggable" style="display:none;width: 960px; margin-left: -480px; margin-top: -313.5px;" id="dialog_media">
  <div class="dialog">
  <div class="dialog_hd">
    <h3>选择素材</h3>
    <a href="javascript:;" onclick="closeMaterial()" class="icon16_opr closed pop_closed">关闭</a>
  </div>
  <div class="dialog_bd">
    <div class="dialog_media_container appmsg_media_dialog">
      <div class="sub_title_bar in_dialog">
        <div class="search_bar js-btn-media">
          <button class="btn-common-white btn-big btn_primary" value="1" href="javascript:;" onclick="checkBtn(this)"> 文本 </button>
          <button class="btn-common-white btn-big" value="2" href="javascript:;" onclick="checkBtn(this)"> 单图文 </button>
          <button class="btn-common-white btn-big" href="javascript:;" value="3" onclick="checkBtn(this)"> 多图文 </button>
        </div>
        <div class="appmsg_create tr" id="add_message_btn">
          <a target="_blank" href="/wchat/addmedia.html?type=1"><button class="btn-common"><i class="icon14_common add_white"></i><span>新建文本消息</span></button></a>
        </div>
      </div>
      <div class="dialog_media_inner" style="overflow:auto;">
        <div class="table_wrp user_list">
          <table class="table" cellspacing="0">
            <tbody class="tbody" id="materia_data"><tr><td class="table_cell"><ul class="mater"><li><span class="btn_primary">文本 1 </span><a href="#">sdfsaf</a></li></ul></td><td>2018-08-06 02:44:12</td><td class="table_cell user_opr tr"><a class="btn remark js_msgSenderRemark" onclick="selectedMaterial(3)">选取</a></td></tr></tbody>
          </table>
        </div>
      </div>
    </div>
  </div>
  <div class="dialog_ft">
  <div class="page" id="turn-ul" style="">
  <div class="pagination">
  <ul>
    <li class="according-number">每页显示<input type="text" class="input-medium" id="showNumber" value="14" data-default="14" autocomplete="off">条</li>
    <li><a id="beginPage" class="page-disable" style="border: 1px solid #dddddd;">首页</a></li>
    <li><a id="prevPage" class="page-disable">上一页</a></li>
    <li id="pageNumber"><a onclick="JumpForPage(this)" class="currentPage">1</a></li>
    <li id="JslastPage"></li>
    <li><a id="nextPage" class="page-disable">下一页</a></li>
    <li><a id="lastPage" class="page-disable">末页</a></li>
    <li class="total-data" data-total-count="1">共1条</li>
    <!-- <li class="page-count">共0页</li> -->
    <li class="according-number">
      跳<input type="text" class="input-medium" id="skipPage" data-curr-page="1">页
    </li>
  </ul>
  </div>
  </div>
  <input type="hidden" id="page_count" value="1">
  <input type="hidden" id="page_size" value="1">
  </div>
  </div>
  </div>
  </div>

  </section>

</template>
