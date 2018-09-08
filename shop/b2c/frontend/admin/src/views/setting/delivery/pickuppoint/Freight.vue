<template>
  <el-form ref="freightForm" :model="freightForm" label-width="100px" size="small" label-position="right">

    <h4>门店运费管理</h4>

    <el-form-item label="门店运费" >
      <el-input type="number"  v-model="freightForm.pickupFreight" >
        <template slot="append">
                元
        </template>
        <p class="hint">如果会员选择配送方式是门店自提对应运费</p>
      </el-input>
    </el-form-item>

    <el-form-item label="满X免运费" >
      <el-input type="number"  v-model="freightForm.manjianFreight" >
        <template slot="append">
                元
        </template>
      </el-input>
    </el-form-item>

    <el-form-item label="是否启用">
      <el-switch  active-text="是" inactive-text="否" v-model="freightForm.isEnable"></el-switch>
    </el-form-item>

    <el-form-item>
      <el-button type="primary" @click="submitForm('freightForm')">保存</el-button>
    </el-form-item>
  </el-form>
</template>

<script>
export default {
  name: 'freight',
  data () {
    return {
      freightForm: {}
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

h4 {
  border-left: 2px solid #126AE4;
  padding-left: 5px;
}
</style>
