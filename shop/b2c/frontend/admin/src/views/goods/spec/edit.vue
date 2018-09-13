<template>
  <el-form ref="editForm" :rules="rules" :model="editForm" label-width="100px" size="small" label-position="right">

    <el-form-item label="规格名称" prop="name">
      <el-input v-model="editForm.name"></el-input>
    </el-form-item>

    <el-form-item label="规格排序" >
      <el-input type="number" v-model="editForm.sort"></el-input>
    </el-form-item>

    <el-form-item label="是否启用">
      <el-switch  active-text="是" inactive-text="否" v-model="editForm.isEnable"></el-switch>
    </el-form-item>

    <el-form-item label="是否筛选">
      <el-switch  active-text="是" inactive-text="否" v-model="editForm.is_screen"></el-switch>
    </el-form-item>

    <el-form-item label="展示方式">
      <el-radio-group v-model="editForm.showType">
        <el-radio label="1">文字</el-radio>
        <el-radio label="2">颜色</el-radio>
        <el-radio label="3">图片</el-radio>
      </el-radio-group>
    </el-form-item>

    <el-form-item label="规格值" prop="value">
      <el-input type="textarea" v-model="editForm.value"></el-input>
      <p class="hint">一行为一个规格项，多个规格项用换行输入</p>
    </el-form-item>

    <el-form-item label="规格说明" >
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
  name: 'edit',
  data () {
    return {
      editForm: {},
      rules: {
        name: [
          { required: true, message: '请输入规格名称', trigger: 'blur' }
        ],
        value: [
          { required: true, message: '请输入规格值', trigger: 'blur' }
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
