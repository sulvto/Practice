<template>
  <el-form ref="configForm" :model="configForm" label-width="160px" size="small" label-position="right">

    <el-form-item label="是否开启分销">
      <el-switch v-model="configForm.isEnable" active-text="开" inactive-text="关" />
      <p class="hint" style="color: #999999">三级分销设置总开关</p>
    </el-form-item>

    <el-form-item label="推广员是否需要申请">
      <el-switch v-model="configForm.switch" active-text="开" inactive-text="关" />
      <p class="hint" style="color: #999999">关闭之后会员注册将直接成为推广员，需提前设置好推广员等级。<span style="color:red;">此选择涉及佣金的计算方式，请谨慎选择！</span></p>
    </el-form-item>

    <el-form-item label="推广申请是否需要审核">
      <el-switch v-model="configForm.switch" active-text="开" inactive-text="关" />
      <p class="hint" style="color: #999999">会员成为推广员的申请信息是否需要审核，如需注册的会员自动成为推广员将推广员申请、推广员申请审核关闭即可</p>
    </el-form-item>

    <el-form-item label="批量设置为推广员">
      <el-switch v-model="configForm.switch" active-text="开" inactive-text="关" />
      <p class="hint" style="color:red;">开启后将会把之前所有普通会员设置为推广员，请谨慎操作</p>
    </el-form-item>

    <el-form-item label="分销佣金">
      <el-radio-group v-model="configForm.radio">
        <el-radio label="使用利润" />
        <el-radio label="销售价格" />
      </el-radio-group>
    </el-form-item>

    <el-form-item>
      <el-button type="primary" @click="submitForm('configForm')">保存</el-button>
    </el-form-item>
  </el-form>
</template>

<script>
export default {
  name: 'Config',
  data () {
    return {
      configForm: {}
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
