<template>
  <div>

    <!-- <el-form-item label="消息类型">
      <el-radio-group v-model="editForm.radio">
        <el-radio label="value1">文本</el-radio>
        <el-radio label="value2">单图文</el-radio>
        <el-radio label="value3">多图文</el-radio>
      </el-radio-group>
    </el-form-item> -->

    <el-form v-if="type === 1" ref="editForm" :rules="rules" :model="editForm" label-width="100px" size="small" label-position="right">
      <el-form-item label="描述" required>
        <el-input v-model="editForm.description" type="textarea" />
      </el-form-item>

      <el-form-item>
        <el-button type="primary" @click="submitForm('editForm')">保存</el-button>
        <el-button type="info" @click="$router.back()">返回</el-button>
      </el-form-item>
    </el-form>

    <el-form v-if="type === 2" ref="editForm" :rules="rules" :model="editForm" label-width="110px" size="small" label-position="right">

      <el-row :gutter="20">
        <el-col :span="7" >
          <el-card >
            <h5 style="overflow: hidden;text-overflow: ellipsis;">标题</h5>
            <div style="text-align:center;">
              <img class="type2-img" style="max-width:218px;max-height:120px;display:none;">
              <span class="img-text">封面图片</span>
            </div>
          </el-card>
        </el-col>
        <el-col :span="17" >
          <el-card >
            <el-form-item label="标题" required prop="title">
              <el-input v-model="editForm.title" />
            </el-form-item>

            <el-form-item label="作者（选填）" required prop="title">
              <el-input v-model="editForm.author" />
            </el-form-item>

            <!-- TODO: 上传图片 -->
            <!-- <p><span style="color:red;"> *</span> 封面</p>
      <div>
        <div class="class-logo" style="background: #f8f8f8;">
          <p style="width: 270px; height: 150px;">
            <img id="imgLogo" style="max-width:270px;max-height:150px;">
          </p>
        </div>
        <p class="hint">
          <span style="color: orange;">建议使用宽900像素-高500像素的图片。</span>
        </p>
        <input type="hidden" id="type2-img-hidden">
        <div class="upload-btn">
          <span>
            <input class="input-file" name="file_upload" id="uploadImg" type="file" onchange="imgUpload(this, 'type2-img', 'type2-img-hidden');">
            <input type="hidden" id="Logo">
          </span>
          <p><i class="fa fa-upload"></i>上传图片</p>
        </div>
      </div> -->

            <el-form-item label="封面图片显示在正文中">
              <el-switch v-model="editForm.showCoverPicture" active-text="是" inactive-text="否" />
            </el-form-item>

            <el-form-item label="摘要" required prop="summary">
              <el-input v-model="editForm.summary" />
            </el-form-item>

            <el-form-item label="正文" required>
              <UEditor ref="ue" :content="editForm.content" :config="{initialFrameHeight: '400'}" />
            </el-form-item>

            <el-form-item label="原文链接" >
              <el-input v-model="editForm.contentSourceUrl" />
            </el-form-item>

            <el-form-item>
              <el-button type="primary" @click="submitForm('editForm')">保存</el-button>
              <el-button type="info" @click="$router.back()">返回</el-button>
            </el-form-item>
          </el-card>
        </el-col>
      </el-row>
    </el-form>

    <el-form v-if="type === 3" ref="editForm" :rules="rules" :model="editForm" label-width="110px" size="small" label-position="right">

      <el-row :gutter="20">
        <el-col :span="7" >
          <el-card>
            <h5 style="overflow: hidden;text-overflow: ellipsis;">标题</h5>
            <div style="text-align:center;">
              <img class="type2-img" style="max-width:218px;max-height:120px;display:none;">
              <span class="img-text">封面图片</span>
            </div>
          </el-card>
        </el-col>
        <el-col :span="17" >
          <el-card >
            <el-form-item label="标题" required prop="title">
              <el-input v-model="editForm.title" />
            </el-form-item>

            <el-form-item label="作者（选填）" required prop="title">
              <el-input v-model="editForm.author" />
            </el-form-item>

            <!-- TODO: 上传图片 -->
            <!-- <p><span style="color:red;"> *</span> 封面</p>
    <div>
      <div class="class-logo" style="background: #f8f8f8;">
        <p style="width: 270px; height: 150px;">
          <img id="imgLogo" style="max-width:270px;max-height:150px;">
        </p>
      </div>
      <p class="hint">
        <span style="color: orange;">建议使用宽900像素-高500像素的图片。</span>
      </p>
      <input type="hidden" id="type2-img-hidden">
      <div class="upload-btn">
        <span>
          <input class="input-file" name="file_upload" id="uploadImg" type="file" onchange="imgUpload(this, 'type2-img', 'type2-img-hidden');">
          <input type="hidden" id="Logo">
        </span>
        <p><i class="fa fa-upload"></i>上传图片</p>
      </div>
    </div> -->

            <el-form-item label="封面图片显示在正文中">
              <el-switch v-model="editForm.showCoverPicture" active-text="是" inactive-text="否" />
            </el-form-item>

            <el-form-item label="摘要" required prop="summary">
              <el-input v-model="editForm.summary" />
            </el-form-item>

            <el-form-item label="正文" required>
              <UEditor ref="ue" :content="editForm.content" :config="{initialFrameHeight: '400'}" />
            </el-form-item>

            <el-form-item label="原文链接" >
              <el-input v-model="editForm.contentSourceUrl" />
            </el-form-item>

            <el-form-item>
              <el-button type="primary" @click="submitForm('editForm')">保存</el-button>
              <el-button type="info" @click="$router.back()">返回</el-button>
            </el-form-item>
          </el-card>
        </el-col>
      </el-row>

    </el-form>
  </div>
</template>

<script>
import UEditor from '@/components/UEditor.vue'

export default {
  name: 'Edit',
  components: {
    UEditor
  },

  data () {
    return {
      type: null,
      editForm: {},
      rules: {
        name: [
          { required: true, message: '请输入活动名称', trigger: 'blur' },
          { min: 3, max: 5, message: '长度在 3 到 5 个字符', trigger: 'blur' }
        ],
        summary: [
          { required: true, message: '请输入摘要', trigger: 'blur' }
        ]
      }
    }
  },
  created () {
    this.type = Number.parseInt(this.$route.query.type)
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

.box-card-left {
  width: 30%;
  margin: 0px;
}

.box-card-right {
  width: 60%;
  margin: 0px;
}
</style>
