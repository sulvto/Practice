<template>
  <el-form ref="editForm" :rules="rules" :model="editForm" label-width="100px" size="small" label-position="right">

    <el-form-item label="标题" prop="title">
      <el-input v-model="editForm.title" />
    </el-form-item>

    <!-- <dl style="display:none;">
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
  </dl> -->

    <el-form-item label="链接地址">
      <el-input v-model="editForm.link" />
    </el-form-item>

    <el-form-item label="所属分类">
      <el-select v-model="editForm.classify" placeholder="请选择">
        <el-option label="选择1" >新手上路</el-option>
        <el-option label="选择1" >配送与支付</el-option>
        <el-option label="选择2" >会员中心</el-option>
        <el-option label="选择2" >服务保证</el-option>
        <el-option label="选择2" >联系我们</el-option>

      </el-select>
    </el-form-item>

    <el-form-item label="内容">
      <el-input v-model="editForm.content" type="textarea" />
    </el-form-item>

    <el-form-item label="是否显示">
      <el-switch v-model="editForm.isShow" active-text="开" inactive-text="关" />
    </el-form-item>

    <el-form-item label="排序">
      <el-input v-model="editForm.sort" type="number" />
    </el-form-item>

    <el-form-item>
      <el-button type="primary" @click="submitForm('editForm')">保存</el-button>
      <el-button type="info" @click="$router.back()">返回</el-button>
    </el-form-item>
  </el-form>
</template>

<script>
export default {
  name: 'DocumentEdit',
  data () {
    return {
      editForm: {},
      rules: {
        title: [
          { required: true, message: '请输入标题', trigger: 'blur' }
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
