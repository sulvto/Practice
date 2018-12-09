<template>
  <el-form ref="editForm" :rules="rules" :model="editForm" label-width="110px" size="small" label-position="right">

    <el-form-item label="是否开启">
      <el-switch v-model="editForm.isOpen" active-text="开" inactive-text="关" />
      <p class="hint">设置砍价活动的开启关闭</p>
    </el-form-item>

    <el-form-item label="活动时间" >
      <el-input v-model="editForm.activityTime" type="number" >
        <template slot="append">
          天
        </template>
      </el-input>
      <p class="hint">设置发起活动后多长时间结束 单位：天</p>
    </el-form-item>

    <el-form-item label="最大砍价次数" >
      <el-input v-model="editForm.maxNumber" type="number" >
        <template slot="append">
          次
        </template>
      </el-input>
      <p class="hint">每个人帮助砍价最多次数</p>
    </el-form-item>

    <el-form-item label="推广语">
      <el-input v-model="editForm.propaganda" />
      <p class="hint">设置推广语</p>
    </el-form-item>

    <el-form-item label="砍价提示语">
      <el-input v-model="editForm.cutReminds" type="textarea" />
      <p class="hint">用户砍价后的提示说明，用,分隔</p>
    </el-form-item>

    <el-form-item label="第一刀的提示语">
      <el-input v-model="editForm.firstCutRemind" />
      <p class="hint">第一刀的的提示语</p>
    </el-form-item>

    <el-form-item label="活动规则">
      <el-input v-model="editForm.introduce" type="textarea" />
      <p class="hint">整个活动的活动规则介绍</p>
    </el-form-item>

    <el-form-item>
      <el-button type="primary" @click="submitForm('editForm')">保存</el-button>
    </el-form-item>
  </el-form>
</template>

<script>
export default {
  name: 'Config',
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
