<template>
  <el-form ref="editForm" :rules="rules" :model="editForm" label-width="150px" size="small" label-position="right">

    <el-form-item label="商品分类名称" prop="name">
      <el-input v-model="editForm.name"></el-input>
    </el-form-item>

    <el-form-item label="商品分类简称" prop="abbreviate">
      <el-input v-model="editForm.abbreviate"></el-input>
    </el-form-item>

    <el-form-item label="上级分类">
      <el-select v-model="editForm.parentId" placeholder="顶级分类">
        <el-option label="女鞋/箱包/钟表/珠宝" value="1"></el-option>
        <el-option label="男鞋/运动/户外" value="2"></el-option>
        <el-option label="汽车/汽车用品" value="3"></el-option>
      </el-select>
    </el-form-item>

    <el-form-item label="商品类型">
      <el-select v-model="editForm.goodsType" placeholder="选择类型">
        <el-option label="美体专区" value="1"></el-option>
        <el-option label="铁皮石斛" value="2"></el-option>
        <el-option label="闲逛逛" value="3"></el-option>
      </el-select>
    </el-form-item>

    <el-form-item label="是否可见">
      <el-switch  active-text="是" inactive-text="否" v-model="editForm.isVisible"></el-switch>
    </el-form-item>

    <el-form-item label="排序">
      <el-input type="number" v-model="editForm.sotr"></el-input>
    </el-form-item>

<!-- TODO: 图片 -->
<!-- <dl>
<dt>图片：</dt>
<dd>
<div class="upload-btn-common">
<div>
<input class="input-file" name="file_upload" id="uploadImg" type="file" onchange="imgUpload(this);" title="上传">
<input type="hidden" id="logo" value="">
</div>
<input type="text" id="text_logo" class="input-common" readonly="readonly" value="">
<em>上传</em>

<img id="preview_logo" src="/public/static/blue/img/upload-common-select.png" data-html="true" data-container="body" data-placement="top" data-trigger="manual">

</div>
<p class="hint">
<span>建议使用<i class="important-note">宽100</i>像素-<i class="important-note">高50</i>像素内的<i class="important-note">GIF</i>或<i class="important-note">PNG</i>透明图片；点击下方"保存"按钮后生效。</span>
</p>
</dd>
</dl> -->

    <el-form-item label="关键字">
      <el-input v-model="editForm.keywords" placeholder="请输入关键字"></el-input>
      <p class="hint">用于网站搜索引擎的优化，关键字之间请用英文逗号分隔</p>
    </el-form-item>

    <el-form-item label="描述">
      <el-input type="textarea" v-model="editForm.description" placeholder=""></el-input>
    </el-form-item>

    <el-form-item label="电脑端分类页面模板" required>
      <el-input type="number"  v-model="editForm.pcCustomTemplate" >
        <el-button slot="prepend">template/shop/blue/Goods/</el-button>
        <el-button slot="append">.html</el-button>
      </el-input>
      <p class="hint">用户自定义模板必须存放在template/shop/blue/Goods/下，模板名只能由英文组成</p>
    </el-form-item>

    <el-form-item label="手机端分类页面模板" required>
      <el-input type="number"  v-model="editForm.wapCustomTemplate" >
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
export default {
  name: 'edit',
  data () {
    return {
      editForm: {},
      rules: {
        name: [
          { required: true, message: '商品分类名称不能为空', trigger: 'blur' },
          { min: 1, max: 30, message: '长度不能超过30个字', trigger: 'blur' }
        ],
        abbreviate: [
          { required: true, message: '商品分类简称不能为空', trigger: 'blur' },
          { min: 1, max: 20, message: '长度不能超过20个字', trigger: 'blur' }
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
