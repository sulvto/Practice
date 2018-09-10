<template>
  <el-form ref="editForm" :rules="rules" :model="editForm" label-width="100px" size="small" label-position="right">

    <el-form-item label="满额包邮">
      <el-switch  active-text="是" inactive-text="否" v-model="editForm.isOpen"></el-switch>
      <p class="hint">设置为不允许则游客无法注册成为站点会员</p>
    </el-form-item>

    <el-form-item label="包邮所需订单金额" >
      <el-input type="number" min="0" step="0.01" v-model="editForm.fullMailMoney" >
        <template slot="append">
                元
        </template>
      </el-input>
      <p class="hint">请设定数字参数，全场包邮请填写0</p>
    </el-form-item>

    <el-form-item label="设置不包邮地区">
      <el-button type="primary" >指定地区城市</el-button>
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

</style>
