<template>
  <el-form ref="editForm" :rules="rules" :model="editForm" label-width="100px" size="small" label-position="right">

    <el-form-item label="公告标题" prop="title">
      <el-input v-model="editForm.title"></el-input>
    </el-form-item>

    <el-form-item label="排序" prop="sort">
      <el-input type="number"  v-model="editForm.sort" >
      </el-input>
    </el-form-item>

    <!-- TODO: 需要富文本编辑器 -->
    <el-form-item label="公告内容" required>
      <el-input type="textarea" v-model="editForm.content"></el-input>
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
        title: [
          { required: true, message: '请输入公告标题', trigger: 'blur' }
        ],
        sort: [
          { required: true, message: '请输入排序号', trigger: 'blur' }
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
