<template>
  <el-form ref="editForm" :rules="rules" :model="editForm" label-width="100px" size="small" label-position="right">

    <el-form-item label="专题标题" prop="title">
      <el-input v-model="editForm.title" />
    </el-form-item>

    <!--<dt>专题封面：</dt>
    <dd>
    <div class="upload-btn-common">
    <div>
    <input class="input-file" name="file_upload" id="uploadLogo" type="file" onchange="imgUpload(this);" title="上传">
    <input type="hidden" id="logo" value="upload/common/1534744933.jpg">
    </div>

    <input type="text" id="text_logo" class="input-common" readonly="readonly" value="upload/common/1534744933.jpg">
    <em>上传</em>
    <img id="preview_logo" src="/public/static/blue/img/upload-common-select.png" data-src="/upload/common/1534744933.jpg" data-html="true" data-container="body" data-placement="top" data-trigger="manual" data-original-title="" title="">
    </div>
    <p class="hint">
    建议使用<i class="important-note">宽1200</i>像素-<i class="important-note">高300</i>像素内的<i class="important-note">GIF</i>或<i class="important-note">PNG</i>透明图片
    </p>
    <p class="error">请上传图片</p>
    </dd> -->

    <el-form-item label="专题内容">
      <el-input v-model="editForm.content" type="textarea" />
    </el-form-item>

    <el-form-item label="保存类型">
      <el-radio-group v-model="editForm.status">
        <el-radio label="1">存为草稿</el-radio>
        <el-radio label="2">正式发布</el-radio>
      </el-radio-group>
    </el-form-item>

    <el-form-item>
      <el-button type="primary" @click="submitForm('editForm')">保存</el-button>
      <el-button type="info" @click="$router.back()">返回</el-button>
    </el-form-item>
  </el-form>
</template>

<script>
export default {
  name: 'Edit',
  data () {
    return {
      editForm: {},
      rules: {
        title: [
          { required: true, message: '请输入专题标题', trigger: 'blur' }
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

</style>
