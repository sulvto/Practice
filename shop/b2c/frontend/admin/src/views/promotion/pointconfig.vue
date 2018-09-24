<template>
  <el-form ref="editForm" :rules="rules" :model="editForm" label-width="140px" size="small" label-position="right">

    <el-form-item label="积分抵现比率" prop="cashRatio">
      <el-input type="number" min="0.01" step="0.01" v-model="editForm.cashRatio" >
        <template slot="append">
          元
        </template>
      </el-input>
      <p class="hint">积分抵现比率 1积分可抵多少元现金</p>

    </el-form-item>

    <el-form-item label="是否开启积分抵现">
      <el-switch  active-text="是" inactive-text="否" v-model="editForm.isOpen"></el-switch>
      <p class="hint">只有启用该选项，才可以使用积分抵现功能</p>
    </el-form-item>

    <el-form-item label="积分说明">
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
        cashRatio: [
          { required: true, message: '请输入积分比', trigger: 'blur' }
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
