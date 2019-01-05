<template>
  <el-form ref="editForm" :rules="rules" :model="editForm" label-width="100px" size="small" label-position="right">

    <el-form-item label="钩子名称" prop="name">
      <el-input v-model="editForm.name" />
      <p class="hint">需要在程序中先添加钩子，否则无效</p>
    </el-form-item>

    <el-form-item label="钩子描述">
      <el-input v-model="editForm.desc" type="textarea"/>
      <p class="hint">钩子的描述信息</p>
    </el-form-item>

    <el-form-item label="钩子类型">
      <el-select v-model="editForm.type" placeholder="请选择">
        <el-option label="视图" value="1" />
        <el-option label="控制器" value="2" />
      </el-select>
      <p class="hint">区分钩子的主要用途</p>
    </el-form-item>

    <el-form-item>
      <el-button type="primary" @click="submitForm('editForm')">保存</el-button>
      <el-button type="info" @click="$router.back()">返回</el-button>
    </el-form-item>
  </el-form>
</template>

<script>
export default {
  name: 'Edit',
  data () {
    return {
      editForm: {},
      rules: {
        name: [
          { required: true, message: '请输入钩子名称', trigger: 'blur' },
          { min: 3, max: 5, message: '长度在 3 到 5 个字符', trigger: 'blur' }
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
