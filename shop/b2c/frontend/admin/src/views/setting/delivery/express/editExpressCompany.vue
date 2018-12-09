<template>
  <el-form ref="expressCompanyForm" :rules="rules" :model="expressCompanyForm" label-width="110px" size="small" label-position="right">

    <el-form-item label="物流公司名称" prop="name">
      <el-input v-model="expressCompanyForm.name" />
    </el-form-item>

    <el-form-item label="物流公司编号" prop="no">
      <el-input v-model="expressCompanyForm.no" />
    </el-form-item>

    <el-form-item label="联系电话">
      <el-input v-model="expressCompanyForm.tel" />
    </el-form-item>

    <el-form-item label="物流公司logo">
      <el-input v-model="expressCompanyForm.logo" />
    </el-form-item>

    <el-form-item label="排序">
      <el-input v-model="expressCompanyForm.sort" type="number" />
    </el-form-item>

    <el-form-item label="是否启用物流">
      <el-switch v-model="expressCompanyForm.isEnable" active-text="是" inactive-text="否" />
    </el-form-item>

    <el-form-item label="是否设置为默认">
      <el-switch v-model="expressCompanyForm.isDefault" active-text="是" inactive-text="否" />
    </el-form-item>

    <el-form-item>
      <el-button type="primary" @click="submitForm('expressCompanyForm')">保存</el-button>
      <el-button type="info" @click="$router.back()">返回</el-button>
    </el-form-item>
  </el-form>
</template>

<script>
export default {
  name: 'ExpressCompany',
  data () {
    return {
      expressCompanyForm: {},
      rules: {
        name: [
          { required: true, message: '请输入物流公司名称', trigger: 'blur' }
        ],
        no: [
          { required: true, message: '请输入物流公司编号', trigger: 'blur' }
        ]
      }
    }
  }
}
</script>

<style lang="scss" scoped>

</style>
