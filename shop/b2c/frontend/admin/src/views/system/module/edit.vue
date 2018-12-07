<template>
  <el-form ref="editForm" :rules="rules" :model="editForm" label-width="100px" size="small" label-position="right">

    <el-form-item label="模块名" prop="name">
      <el-input v-model="editForm.name"></el-input>
    </el-form-item>

    <el-form-item label="上级菜单">
      <el-select v-model="editForm.select" placeholder="请选择">
        <el-option label="选择1" value="1"></el-option>
        <el-option label="选择2" value="2"></el-option>
      </el-select>
      <p class="hint">伪静态只支持<i class="important-note">pathinfo</i>模式，如果开启伪静态，请选择<i class="important-note">pathinfo</i>模式</p>
    </el-form-item>

    <el-form-item label="控制器名" prop="controllerName">
      <el-input v-model="editForm.controllerName"></el-input>
      <p class="hint"></p>
    </el-form-item>

    <el-form-item label="方法名" prop="methodName">
      <el-input v-model="editForm.methodName"></el-input>
    </el-form-item>

    <el-form-item label="URL" prop="url">
      <el-input type="url" v-model="editForm.url"></el-input>
    </el-form-item>

    <el-form-item label="是否是菜单">
      <el-switch  active-text="是" inactive-text="否" v-model="editForm.isMenu"></el-switch>
    </el-form-item>

    <el-form-item label="是否控制权限">
      <el-switch  active-text="开" inactive-text="关" v-model="editForm.switch"></el-switch>
    </el-form-item>

    <el-form-item label="是否开发者模式可见">
      <el-switch  active-text="开" inactive-text="关" v-model="editForm.switch"></el-switch>
    </el-form-item>

    <el-form-item label="排序">
      <el-input type="number" v-model="editForm.sort"></el-input>
    </el-form-item>

    <!-- TODO： 图片 -->

    <el-form-item label="描述">
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
          { required: true, message: '请输入模块名', trigger: 'blur' }
        ],
        url: [
          { required: true, message: '请输入url地址', trigger: 'blur' }
        ],
        methodName: [
          { required: true, message: '请输入方法名', trigger: 'blur' }
        ],
        controllerName: [
          { required: true, message: '请输入控制器名', trigger: 'blur' }
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
