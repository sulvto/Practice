<template>
  <el-form ref="editForm" :rules="rules" :model="editForm" label-width="120px" size="small" label-position="right">

    <el-form-item label="导航名称" prop="name">
      <el-input v-model="editForm.name"></el-input>
    </el-form-item>

    <el-form-item label="排序号">
      <el-input type="number" v-model="editForm.sort"></el-input>
    </el-form-item>

    <el-form-item label="所属类型">
      <el-radio-group v-model="editForm.type">
        <el-radio label="pc">PC端</el-radio>
        <el-radio label="moilbe">手机端</el-radio>
      </el-radio-group>
    </el-form-item>

    <el-form-item label="链接地址" >
      <el-radio-group v-model="linkType">
        <el-radio label="shopModule">商城模块</el-radio>
        <el-radio label="custom">自定义链接</el-radio>
      </el-radio-group>
    </el-form-item>

    <el-form-item v-show="linkType === 'shopModule'">
      <el-select v-model="editForm.link" placeholder="请选择">
        <el-option label="首页" value="/index">首页</el-option>
        <el-option label="限时折扣" value="/index/discount">限时折扣</el-option>
        <el-option label="品牌列表" value="/goods/brandlist">品牌列表</el-option>
        <el-option label="积分中心" value="/goods/integralcenter">积分中心</el-option>
        <el-option label="标签专区" value="/goods/promotionZone">标签专区</el-option>
        <el-option label="领券中心" value="/goods/couponlist">领券中心</el-option>
        <el-option label="团购专区" value="goods/groupBuyingArea">团购专区</el-option>
        <el-option label="专题活动" value="goods/promotionTopic">专题活动</el-option>
      </el-select>
    </el-form-item>

    <el-form-item v-show="linkType === 'custom'">
      <el-input v-model="editForm.link"></el-input>
      <p class="hint">如：http://www.niushop.com.cn/</p>
    </el-form-item>

    <el-form-item label="是否新窗口打开">
      <el-switch  active-text="是" inactive-text="否" v-model="editForm.isBlank"></el-switch>
    </el-form-item>

    <el-form-item label="是否显示">
      <el-switch  active-text="是" inactive-text="否" v-model="editForm.isShow"></el-switch>
    </el-form-item>

    <!-- TODO: 导航图标 -->

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
      linkType: '',
      editForm: {},
      rules: {
        name: [
          { required: true, message: '请输入导航名称', trigger: 'blur' }
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
