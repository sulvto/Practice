<template>
  <el-form ref="editForm" :rules="rules" :model="editForm" label-width="120px" size="small" label-position="right">

    <el-form-item label="广告名称" prop="name">
      <el-input v-model="editForm.name"></el-input>
    </el-form-item>

    <el-form-item label="所在位置类型" required>
      <el-radio-group v-model="editForm.type">
        <el-radio label="pc">PC端  ￼ </el-radio>
        <el-radio label="mobile">手机端</el-radio>
      </el-radio-group>
    </el-form-item>

    <el-form-item label="选择广告位">
      <el-select v-model="editForm.position" placeholder="请选择广告位">
                        <el-option label="推荐楼层4楼——轮播图广告位" value="1068"></el-option>
                        <el-option label="推荐楼层3楼——多图广告位" value="1071"></el-option>
                        <el-option label="推荐楼层4楼——多图广告位" value="1072"></el-option>
                        <el-option label="商城品牌专区轮播广告位" value="1075"></el-option>
                        <el-option label="商城积分中心轮播广告位" value="1076"></el-option>
                        <el-option label="商城积分中心中部广告位" value="1102"></el-option>
                        <el-option label="商城登录页面轮播广告位" value="1103"></el-option>

      </el-select>
    </el-form-item>

<!--  <dl>
      <dt><span style="color:red;margin-right:10px;">*</span>广告图片：</dt>
      <dd>
        <div class="upload-btn-common">
          <div>
            <input class="input-file" name="file_upload" id="uploadAdv" type="file" onchange="imgUpload(this);" title="上传">
            <input type="hidden" id="adv" value="upload/advertising/1497067960.png">
          </div>

          <input type="text" id="text_adv" class="input-common" readonly="readonly" value="upload/advertising/1497067960.png">
          <em>上传</em>
          <img id="preview_adv" src="/public/static/blue/img/upload-common-select.png" data-src="/upload/advertising/1497067960.png" data-html="true" data-container="body" data-placement="top" data-trigger="manual" data-original-title="" title="">
        </div>
        <p class="error">请上传图片</p>
      </dd>
    </dl> -->

    <el-form-item label="背景色">
        <el-color-picker v-model="editForm.backgroundColor"></el-color-picker>
    </el-form-item>

    <el-form-item label="链接地址" prop="link">
      <el-input v-model="editForm.link"></el-input>
    </el-form-item>

    <el-form-item label="排序">
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
          { required: true, message: '请输入广告名称', trigger: 'blur' }
        ],
        position: [{ required: true, message: '请选择广告位', trigger: 'blur' }],
        link: [{ required: true, message: '请输入链接地址', trigger: 'blur' }]
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
