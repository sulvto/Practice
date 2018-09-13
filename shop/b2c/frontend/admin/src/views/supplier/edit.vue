<template>
  <el-form ref="editForm" :rules="rules" :model="editForm" label-width="100px" size="small" label-position="right">

    <el-form-item label="供货商名称" prop="name">
      <el-input v-model="editForm.name"></el-input>
    </el-form-item>

    <el-form-item label="联系人姓名" prop="contacts">
      <el-input v-model="editForm.contacts"></el-input>
    </el-form-item>

    <el-form-item label="联系人电话" prop="contactNumber">
      <el-input v-model="editForm.contactNumber"></el-input>
    </el-form-item>

    <el-form-item label="联系人地址" prop="address">
      <el-input v-model="editForm.address"></el-input>
    </el-form-item>

    <el-form-item label="供货商描述">
      <el-input type="textarea" v-model="editForm.description"></el-input>
    </el-form-item>

    <el-form-item>
      <el-button type="primary" @click="submitForm('editForm')">保存</el-button>
      <el-button type="info" @click="$router.back()">返回</el-button>
    </el-form-item>
  </el-form>
</template>

<script>
export default {
  name: 'supplierEdit',
  data () {
    return {
      editForm: {},
      rules: {
        name: [
          { required: true, message: '请输入供货商名称', trigger: 'blur' }
        ],
        contacts: [
          { required: true, message: '请输入联系人姓名', trigger: 'blur' }
        ],
        contactNumber: [
          { required: true, message: '请输入联系人电话', trigger: 'blur' }
        ],
        address: [
          { required: true, message: '请输入联系地址', trigger: 'blur' }
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
</style>
