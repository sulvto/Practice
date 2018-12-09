<template>
  <el-form ref="userForm" :rules="rules" :model="userForm" label-width="100px" size="small" label-position="right">

    <el-form-item label="用户名" prop="username">
      <el-input v-model="userForm.username" />
    </el-form-item>

    <el-form-item label="密码" prop="password">
      <el-input v-model="userForm.password" type="password" />
    </el-form-item>

    <el-form-item label="手机号">
      <el-input v-model="userForm.phoneNumber" />
    </el-form-item>

    <el-form-item label="邮箱">
      <el-input v-model="userForm.email" />
    </el-form-item>

    <el-form-item label="所属用户组" prop="group">
      <el-select v-model="userForm.group" placeholder="请选择">
        <el-option label="管理员组" value="1" />
        <el-option label="客服组" value="2" />
      </el-select>
    </el-form-item>

    <el-form-item label="描述">
      <el-input v-model="userForm.description" type="textarea" />
    </el-form-item>

    <el-form-item>
      <el-button type="primary" @click="submitForm('userForm')">保存</el-button>
      <el-button type="info" @click="$router.back()">返回</el-button>
    </el-form-item>
  </el-form>
</template>

<script>
export default {
  name: 'UserEdit',
  data () {
    return {
      userForm: {},
      rules: {
        username: [
          { required: true, message: '请输入用户名', trigger: 'blur' }
        ],
        password: [
          { required: true, message: '请输入密码', trigger: 'blur' },
          { min: 6, message: '密码不能小于6位数', trigger: 'blur' }
        ],
        group: [
          { required: true, message: '￼请选择用户组', trigger: 'blur' }
        ]
      }
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
