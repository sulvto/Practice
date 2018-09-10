<template>
  <el-form ref="editForm" :rules="rules" :model="editForm" label-width="100px" size="small" label-position="right">

    <el-form-item label="名称" prop="name">
      <el-input   v-model="editForm.name" >
      </el-input>
    </el-form-item>
  <!-- TODO: 图片 -->
  <!-- <dl>
          <dt>图片：</dt>
          <dd>
            <div class="upload-btn-common">
              <div>
                <input class="input-file" name="file_upload" id="uploadLinkPic" type="file" onchange="imgUpload(this);" title="上传">
                <input type="hidden" id="link_pic" value="">
              </div>

              <input type="text" id="text_link_pic" class="input-common" readonly="readonly" value="">
              <em>上传</em>
              <img id="preview_link_pic" src="/public/static/blue/img/upload-common-select.png" data-src="" data-html="true" data-container="body" data-placement="top" data-trigger="manual" data-original-title="" title="">
            </div>
            <p class="hint">
              建议使用宽<i class="important-note">100</i>像素-<i class="important-note">高100</i>像素内的<i class="important-note">GIF</i>或<i class="important-note">PNG</i>透明图片
            </p>
            <p class="error">请上传图片</p>
          </dd>
        </dl> -->

    <el-form-item label="是否显示">
      <el-switch  active-text="开" inactive-text="关" v-model="editForm.isBlank"></el-switch>
    </el-form-item>

    <el-form-item label="是否显示">
      <el-switch  active-text="开" inactive-text="关" v-model="editForm.isShow"></el-switch>
    </el-form-item>

    <el-form-item label="链接地址" prop="link">
      <el-input v-model="editForm.link"></el-input>
    </el-form-item>

    <el-form-item label="排序" >
      <el-input type="number" v-model="editForm.sort"></el-input>
    </el-form-item>

    <el-form-item>
      <el-button type="primary" @click="submitForm('editForm')">保存</el-button>
      <el-button type="info" @click="$router.back()">返回</el-button>
    </el-form-item>
  </el-form>
</template>

<script>
export default {
  name: 'edit',
  data () {
    return {
      editForm: {},
      rules: {
        name: [
          { required: true, message: '请输入名称', trigger: 'blur' }
        ],
        link: [
          { required: true, message: '请输入链接地址', trigger: 'blur' }
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

<style lang="scss" scoped>
.hint {
  font-size: 12px;
  line-height: 16px;
  color: #999999;
  margin: 10px 0 0;
}

.important-note {
  color: #ff6600;
  font-style: normal;
}
</style>
