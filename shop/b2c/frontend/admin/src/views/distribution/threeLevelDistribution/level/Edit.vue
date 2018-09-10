<template>
  <el-form ref="levelEditForm" :rules="rules" :model="levelEditForm" label-width="100px" size="small" label-position="right">

    <el-form-item label="等级名称" prop="name">
      <el-input v-model="levelEditForm.name"></el-input>
    </el-form-item>

    <el-form-item label="升级条件" >
      <el-input type="number" v-model="levelEditForm.upgradCondition"></el-input>
    </el-form-item>

    <el-form-item label="本店销售佣金比率" >
      <el-input type="number"  v-model="levelEditForm.level_0" >
        <template slot="append">
                %
        </template>
      </el-input>
    </el-form-item>
    <el-form-item label="给上级的佣金比率" >
      <el-input type="number"  v-model="levelEditForm.level_1" >
        <template slot="append">
                %
        </template>
      </el-input>
    </el-form-item>
    <el-form-item label="给上上级的佣金比率" >
      <el-input type="number"  v-model="levelEditForm.level_2" >
        <template slot="append">
                %
        </template>
      </el-input>
    </el-form-item>

    <el-form-item>
      <el-button type="primary" @click="submitForm('levelEditForm')">保存</el-button>
      <el-button type="info" @click="$router.back()">返回</el-button>
    </el-form-item>
  </el-form>
</template>

<script>
export default {
  name: 'levelEdit',
  data () {
    return {
      levelEditForm: {},
      rules: {
        name: [
          { required: true, message: '请输入等级名称', trigger: 'blur' }
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
