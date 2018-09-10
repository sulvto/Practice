<template>
  <el-form ref="editForm" :rules="rules" :model="editForm" label-width="100px" size="small" label-position="right">

    <el-form-item label="手续费" required>
      <el-input type="number"  v-model="editForm.serviceCharge" >
        <template slot="append">
                倍
        </template>
      </el-input>
    </el-form-item>

    <el-form-item label="数值" prop="number">
      <el-input type="number" v-model="editForm.number"></el-input>
      <p class="hint">网页标题通常是搜索引擎关注的重点，本附加字设置出现在标题中商城名称后，如有多个附加字，建议用<i class="important-note">英文“,”</i>分隔</p>
    </el-form-item>

    <el-form-item label="多选select">
      <el-select v-model="editForm.select" placeholder="请选择">
        <el-option label="选择1" value="1"></el-option>
        <el-option label="选择2" value="2"></el-option>
      </el-select>
      <p class="hint">伪静态只支持<i class="important-note">pathinfo</i>模式，如果开启伪静态，请选择<i class="important-note">pathinfo</i>模式</p>
    </el-form-item>

    <el-form-item label="多选checkbox">
      <el-checkbox-group v-model="editForm.checkbox">
        <el-checkbox label="多选1" value="checkbox1"></el-checkbox>
        <el-checkbox label="多选2" value="checkbox2"></el-checkbox>
        <el-checkbox label="多选3" value="checkbox3"></el-checkbox>
      </el-checkbox-group>
      <p class="hint">如开启邮箱和手机注册，请在<a href="/config/notifyindex.html" target="_blank">通知系统</a>功能中进行邮箱与短信通知配置，游客在注册时通过验证后方能注册成功</p>
    </el-form-item>

    <el-form-item label="单选">
      <el-radio-group v-model="editForm.radio">
        <el-radio label="value1">单选1</el-radio>
        <el-radio label="value2">单选2</el-radio>
        <el-radio label="value3">单选3</el-radio>
      </el-radio-group>
      <p class="hint">暂时将站点关闭，其他人无法访问，但不影响管理员访问</p>
    </el-form-item>

    <el-form-item label="多选">
      <el-checkbox-group v-model="editForm.checkbox">
        <el-checkbox label="checkbox1">多选1</el-checkbox>
        <el-checkbox label="checkbox2">多选2</el-checkbox>
        <el-checkbox label="checkbox3">多选3</el-checkbox>
      </el-checkbox-group>
      <p class="hint">如开启邮箱和手机注册，请在<a href="/config/notifyindex.html" target="_blank">通知系统</a>功能中进行邮箱与短信通知配置，游客在注册时通过验证后方能注册成功</p>
    </el-form-item>

    <el-form-item label="开关">
      <el-switch  active-text="开" inactive-text="关" v-model="editForm.switch"></el-switch>
      <p class="hint">设置为不允许则游客无法注册成为站点会员</p>
    </el-form-item>

    <el-form-item label="文本">
      <el-input v-model="editForm.text"></el-input>
      <p class="hint">网页标题通常是搜索引擎关注的重点，本附加字设置出现在标题中商城名称后，如有多个附加字，建议用<i class="important-note">英文“,”</i>分隔</p>
    </el-form-item>

    <el-form-item label="文本域">
      <el-input type="textarea" v-model="editForm.textarea"></el-input>
      <p class="hint">网页标题通常是搜索引擎关注的重点，本附加字设置出现在标题中商城名称后，如有多个附加字，建议用<i class="important-note">英文“,”</i>分隔</p>
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
          { required: true, message: '请输入活动名称', trigger: 'blur' },
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
