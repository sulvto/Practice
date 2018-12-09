<template>
  <section class="ns-base-section">
    <el-form ref="editForm" :rules="rules" :model="editForm" label-width="100px" size="small" label-position="right">

      <el-form-item label="关键词" required prop="keyword">
        <el-input v-model="editForm.keyword" />
        <p class="hint">网页标题通常是搜索引擎关注的重点，本附加字设置出现在标题中商城名称后，如有多个附加字，建议用<i class="important-note">英文“,”</i>分隔</p>
      </el-form-item>

      <el-form-item label="匹配类型">
        <el-radio-group v-model="editForm.matchType">
          <el-radio :label="1">模糊匹配</el-radio>
          <el-radio :label="2">全部匹配</el-radio>
        </el-radio-group>
      </el-form-item>

      <el-form-item label="回复内容">
        <p class="key_data_a" style="display:block;">您还未选择回复内容，<a href="javascript:;" onclick="showMaterial()">立即选择</a></p>
      </el-form-item>

      <el-form-item>
        <el-button type="primary" @click="submitForm('editForm')">保存</el-button>
        <el-button type="info" @click="$router.back()">返回</el-button>
      </el-form-item>
    </el-form>
    <div class="ns-main">

      <div id="dialog_media" class="dialog_wrp media align_edge ui-draggable" style="width: 960px; margin-left: -480px; margin-top: -313.5px; display: none;">
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
                <div id="add_message_btn" class="appmsg_create tr">
                  <a target="_blank" href="/wchat/addmedia.html?type=1"><button class="btn-common"><i class="icon14_common add_white" /><span>新建文本消息</span></button></a>
                </div>
              </div>
              <div class="dialog_media_inner" style="overflow:auto;">
                <div class="table_wrp user_list">
                  <table class="table" cellspacing="0">
                    <tbody id="materia_data" class="tbody" ><tr><td class="table_cell"><ul class="mater"><li><span class="btn_primary">文本 1 </span><a href="#">sdfsaf</a></li></ul></td><td>2018-08-06 02:44:12</td><td class="table_cell user_opr tr"><a class="btn remark js_msgSenderRemark" onclick="selectedMaterial(3)">选取</a></td></tr></tbody>
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
  name: 'Edit',
  data () {
    return {
      editForm: {},
      rules: {
        keyword: [
          { required: true, message: '请输入关键词', trigger: 'blur' }
        ]
      }
    }
  },
  methods: {
    submitForm () {
      console.log('submitForm', this.editForm)
    }
  }
}
</script>
