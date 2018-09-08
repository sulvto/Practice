<template>
  <section class="ns-base-section">

    <div style="position:relative;margin:0;">
      <!-- 面包屑导航 -->
      <div class="breadcrumb-nav">
        <a href="index.html">大鵬系統</a>
        <i class="fa fa-angle-right"></i>
        <a href="/wchat/config.html">微信</a>
        <i class="fa fa-angle-right"></i>
        <!-- 需要加跳转链接用这个：http://showfx.niuteam.cn/admin/wchat/replayconfig -->
        <a href="javascript:;" style="color:#999;">回复设置</a>
      </div>
      <!-- 三级导航菜单 -->

      <nav class="ns-third-menu">
      <ul>
          <li class="selected" onclick="location.href='/wchat/replayConfig.html?type=1';">关注时回复</li>
            <li onclick="location.href='/wchat/replayConfig.html?type=2';">关键字回复</li>
            <li onclick="location.href='/wchat/replayConfig.html?type=3';">默认回复</li>
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
                  <p>相关教程：<a href="http://bbs.niushop.com.cn/forum.php?mod=viewthread&amp;tid=2329&amp;extra=page%3D2" target="_blank">http://bbs.niushop.com.cn/forum.php?mod=viewthread&amp;tid=2329&amp;extra=page%3D2</a></p>
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

          <!-- 关注时回复 -->
          <div id="type1">
              <p class="step_0" style="display:block;">您还未设置回复内容，
                  <a href="javascript:;" onclick="showMaterial()">我要马上设置。</a>
              </p>

              <div class="step_1" style="display:none;">
              <!-- 样式模板 -->
                          <div class="media-button">
                      <a class="" href="javascript:;" onclick="showMaterial()">修改</a>
                      <a class="" href="javascript:;" onclick="delReply()">删除</a>
                  </div>
              </div>
          </div>

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
              </div>
          </div>
      </div>

    </section>
</template>

<script>
export default {
  name: 'replayConfig',
  data () {
    return {}
  },
  methods: {
    handleEdit (index, row) {
      console.log(index, row)
    },
    handleDelete (index, row) {
      console.log(index, row)
    }
  }
}
</script>
