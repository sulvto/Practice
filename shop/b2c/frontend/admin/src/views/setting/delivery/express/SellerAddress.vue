<template>
  <el-form ref="sellerAddressFrom" :rules="rules" :model="sellerAddressFrom" label-width="100px" size="small" label-position="right">

    <h4>商家地址</h4>

    <el-form-item label="收货地址" prop="address">
      <el-input v-model="sellerAddressFrom.address" />
    </el-form-item>

    <el-form-item label="收件人" prop="receiver">
      <el-input v-model="sellerAddressFrom.receiver" />
    </el-form-item>

    <el-form-item label="电话" prop="phone">
      <el-input v-model="sellerAddressFrom.phone" />
    </el-form-item>

    <el-form-item label="邮编">
      <el-input v-model="sellerAddressFrom.zip" />
    </el-form-item>

    <el-form-item>
      <el-button type="primary" @click="submitForm('sellerAddressFrom')">保存</el-button>
    </el-form-item>
  </el-form>
</template>

<script>
export default {
  name: 'SellerAddress',
  data () {
    return {
      sellerAddressFrom: {},
      rules: {
        address: [
          { required: true, message: '请输入收货地址', trigger: 'blur' }
        ],
        receiver: [
          { required: true, message: '请输入收件人', trigger: 'blur' }
        ],
        phone: [
          { required: true, message: '请输入联系电话', trigger: 'blur' },
          { min: 3, max: 11, message: '请输入正确的电话格式', trigger: 'blur' }
        ]
      }
    }
  }
}
</script>

<style lang="scss" scoped>
h4 {
  border-left: 2px solid #126AE4;
  padding-left: 5px;
}
</style>
