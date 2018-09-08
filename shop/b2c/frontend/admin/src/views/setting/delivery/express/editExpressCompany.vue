<template>
  <el-form ref="expressCompanyForm" :rules="rules" :model="expressCompanyForm" label-width="110px" size="small" label-position="right">

    <el-form-item label="物流公司名称" prop="name">
      <el-input v-model="expressCompanyForm.name"></el-input>
    </el-form-item>

    <el-form-item label="物流公司编号" prop="no">
      <el-input v-model="expressCompanyForm.no"></el-input>
    </el-form-item>

    <el-form-item label="联系电话">
      <el-input v-model="expressCompanyForm.tel"></el-input>
    </el-form-item>

    <el-form-item label="物流公司logo">
      <el-input v-model="expressCompanyForm.logo"></el-input>
    </el-form-item>

    <el-form-item label="排序">
      <el-input type="number" v-model="expressCompanyForm.sort"></el-input>
    </el-form-item>

    <el-form-item label="是否启用物流">
      <el-switch  active-text="是" inactive-text="否" v-model="expressCompanyForm.isEnable"></el-switch>
    </el-form-item>

    <el-form-item label="是否设置为默认">
      <el-switch  active-text="是" inactive-text="否" v-model="expressCompanyForm.isDefault"></el-switch>
    </el-form-item>

    <el-form-item>
      <el-button type="primary" @click="submitForm('expressCompanyForm')">保存</el-button>
      <el-button type="info" @click="$router.back()">返回</el-button>
    </el-form-item>
  </el-form>
</template>

<script>
export default {
  name: 'expressCompany',
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
