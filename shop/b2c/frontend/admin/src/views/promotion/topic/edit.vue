<template>
  <el-form ref="editForm" :rules="rules" :model="editForm" label-width="100px" size="small" label-position="right">
    <h4>专题活动信息</h4>

    <el-form-item label="专题名称" required prop="name">
      <el-input v-model="editForm.name" />
    </el-form-item>

    <el-form-item label="关键字">
      <el-input v-model="editForm.keyword" />
    </el-form-item>

    <el-form-item label="描述">
      <el-input v-model="editForm.description" type="textarea" />
    </el-form-item>
    <!-- TODO: 图像：条幅：背景图： -->

    <!-- <dt><span style="color:red;">*</span>&nbsp;&nbsp;图像：</dt>
    <dd>
        <div class="upload-btn-common">
          <div>
            <input class="input-file" name="file_upload" id="uploadpicture" type="file" onchange="imgUpload(this);" title="上传">
            <input type="hidden" id="picture_img" value="upload/common/1533095180.jpg">
          </div>

          <input type="text" id="text_picture_img" class="input-common" readonly="readonly" value="upload/common/1533095180.jpg">
          <em>上传</em>
          <img id="preview_picture_img" src="/public/static/blue/img/upload-common-select.png" data-src="/upload/common/1533095180.jpg" data-html="true" data-container="body" data-placement="top" data-trigger="manual" data-original-title="" title="">
        </div>
        <p class="error" style="display: none;">请上传图像图片</p>
        <p class="hint">专题活动列表中单独专题背景,<i class="important-note">建议使用宽580像素-高300像素</i></p>

    </dd>
  </dl>
  <dl>
    <dt><span style="color:red;">*</span>&nbsp;&nbsp;条幅：</dt>
    <dd>
        <div class="upload-btn-common">
          <div>
            <input class="input-file" name="file_upload" id="uploadscroll" type="file" onchange="imgUpload(this);" title="上传">
            <input type="hidden" id="scroll_img" value="upload/common/1533095182.jpg">
          </div>

          <input type="text" id="text_scroll_img" class="input-common" readonly="readonly" value="upload/common/1533095182.jpg">
          <em>上传</em>
          <img id="preview_scroll_img" src="/public/static/blue/img/upload-common-select.png" data-src="/upload/common/1533095182.jpg" data-html="true" data-container="body" data-placement="top" data-trigger="manual" data-original-title="" title="">
        </div>
        <p class="error" style="display: none;">请上传条幅图片</p>
        <p class="hint"><i class="important-note">专题商品列表中的头部展示</i></p>

    </dd>
  </dl>
  <dl>
    <dt>背景图：</dt>
    <dd>
        <div class="upload-btn-common">
          <div>
            <input class="input-file" name="file_upload" id="uploadbackground" type="file" onchange="imgUpload(this);" title="上传">
            <input type="hidden" id="background_img" value="">
          </div>

          <input type="text" id="text_background_img" class="input-common" readonly="readonly" value="">
          <em>上传</em>
          <img id="preview_background_img" src="/public/static/blue/img/upload-common-select.png" data-src="" data-html="true" data-container="body" data-placement="top" data-trigger="manual" data-original-title="" title="">
        </div>
        <p class="error" style="display: none;">请上传图片</p>
        <p class="hint"><i class="important-note">专题商品列表中背景图</i></p>
    </dd>
  </dl>
   -->

    <el-form-item label="背景色">
      <el-color-picker v-model="editForm.backgroundColor" />
    </el-form-item>

    <el-form-item label="有效时间" required>
      <el-date-picker
        v-model="editForm.dateRange"
        type="datetimerange"
        range-separator="至"
        start-placeholder="开始日期"
        end-placeholder="结束日期" />
    </el-form-item>

    <h4>高级设置</h4>
    <el-form-item label="专题介绍">
      <UEditor ref="ue" :content="editForm.introduce" :config="{initialFrameHeight: '400'}" />
    </el-form-item>

    <el-form-item label="是否显示头部">
      <el-switch v-model="editForm.isShowHead" active-text="是" inactive-text="否" />
    </el-form-item>

    <el-form-item label="是否显示底部">
      <el-switch v-model="editForm.isShowFoot" active-text="是" inactive-text="否" />
    </el-form-item>

    <h4>选择活动商品：</h4>

    <el-form-item label="参与商品">
      <el-switch v-model="editForm.isAll" active-text="全部" inactive-text="部分" />
    </el-form-item>

    <el-form-item label="选择商品">
      <el-button type="primary" @click="submitForm('editForm')">选择商品</el-button>
    </el-form-item>

    <el-form-item>
      <SimpleGoodsTable :table-data="editForm.goodsList"/>
    </el-form-item>

    <h4>模板设置</h4>
    <el-form-item label="电脑端">
      <el-input v-model="editForm.pcCustomTemplate" >
        <el-button slot="prepend">template/shop/blue/Goods/</el-button>
        <el-button slot="append">.html</el-button>
      </el-input>
      <p class="hint">用户自定义模板必须存放在template/shop/blue/Goods/下，模板名只能由英文组成</p>
    </el-form-item>

    <el-form-item label="手机端">
      <el-input v-model="editForm.wapCustomTemplate" >
        <el-button slot="prepend">template/wap/default_new/Goods/</el-button>
        <el-button slot="append">.html</el-button>
      </el-input>
      <p class="hint">用户自定义模板必须存放在template/wap/default_new/Goods/下，模板名只能由英文组成</p>
    </el-form-item>

    <el-form-item>
      <el-button type="primary" @click="submitForm('editForm')">保存</el-button>
      <el-button type="info" @click="$router.back()">返回</el-button>
    </el-form-item>
  </el-form>
</template>

<script>
import UEditor from '@/components/UEditor.vue'
import SimpleGoodsTable from '@/components/SimpleGoodsTable.vue'

export default {
  name: 'TopicEdit',
  components: {
    UEditor,
    SimpleGoodsTable
  },
  data () {
    return {
      editForm: {
        dateRange: [],
        goodsList: []
      },
      rules: {
        name: [
          { required: true, message: '请输入专题名称', trigger: 'blur' }
          // { min: 3, max: 5, message: '长度在 3 到 5 个字符', trigger: 'blur' }
        ]
      }
    }
  },
  methods: {
    submitForm () {
      this.editForm.content = this.$refs.ue.getContent()
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
h4 {
  margin-left: 0px;
  border-left: 2px solid #126AE4;
  padding-left: 5px;
  font-size: 16px;
  color: #333333;
}
</style>
