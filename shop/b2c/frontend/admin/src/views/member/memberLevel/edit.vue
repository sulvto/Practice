<template>
  <el-form ref="editForm" :rules="rules" :model="editForm" label-width="100px" size="small" label-position="right">

    <el-form-item label="等级名称" prop="name">
      <el-input v-model="editForm.name" />
      <p class="hint">设置会员等级名称</p>
    </el-form-item>

    <el-form-item label="升级条件">
      <el-checkbox-group v-model="editForm.upgradeCondition">
        <el-checkbox :label="1">
          累计积分满
          <el-input v-model="editForm.minIntegral" style="width:250px" type="number" min="0" >
            <template slot="append">
              元
            </template>
          </el-input>
          <span class="hint">设置会员等级所需要的累计积分且必须大于等于0</span>
        </el-checkbox>
        <br>
        <el-checkbox :label="2">
          消费额度满
          <el-input v-model="editForm.quota" style="width:250px" type="number" min="0" >
            <template slot="append">
              元
            </template>
          </el-input>
          <span class="hint">设置会员等级所需要的消费额度且必须大于等于0,单位：元</span>
        </el-checkbox>
      </el-checkbox-group>
    </el-form-item>

    <el-form-item>
      <el-radio-group v-model="editForm.navigationType">
        <el-radio label="or">或</el-radio>
        <el-radio label="and">且</el-radio>
      </el-radio-group>
      <label class="hint" style="margin-left:87px;margin-top: 2px;width:27%;font-size:12px ;color:#BBB;">设置会员升级条件的关系</label>
    </el-form-item>

    <el-form-item label="折扣率" prop="discount">
      <el-input v-model="editForm.discount" type="number" >
        <template slot="append">
          %
        </template>
      </el-input>
      <p class="hint">折扣率单位为百分比，如输入90，表示该会员等级的用户可以以商品原价的90%购买</p>
    </el-form-item>

    <el-form-item label="等级描述">
      <el-input v-model="editForm.description" type="textarea" />
      <p class="hint">会员等级描述信息</p>
    </el-form-item>

    <el-form-item>
      <el-button type="primary" @click="submitForm('editForm')">保存</el-button>
      <el-button type="info" @click="$router.back()">返回</el-button>
    </el-form-item>
  </el-form>

</template>

<script>
export default {
  name: 'MemberLevelEdit',
  data () {
    return {
      editForm: {
        upgradeCondition: []
      },
      rules: {
        name: [
          { required: true, message: '请输入等级名称', trigger: 'blur' }
        ],
        discount: [
          { required: true, message: '请输入折扣率', trigger: 'blur' },
          { min: 0, max: 100, message: '折扣率必须为0-100的正整数', trigger: 'blur' }
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
