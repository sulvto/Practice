<template>
  <el-form ref="editForm" :rules="rules" :model="editForm" label-width="100px" size="small" label-position="right">

    <el-form-item label="效果预览">
      <img src="/static/images/key_concern_preview.png" style="border: 1px solid #f0f0f0;">
    </el-form-item>

    <el-form-item label="是否首页显示">
      <el-switch  active-text="是" inactive-text="否" v-model="editForm.showFollow"></el-switch>
    </el-form-item>

    <el-form-item>
      <el-button type="primary" @click="submitForm('editForm')">保存</el-button>
      <el-button type="info" @click="$router.back()">返回</el-button>
    </el-form-item>
  </el-form>
</template>

<script>
export default {
  name: 'keyConcernConfig',
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

</style>
