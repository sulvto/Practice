<template>
  <el-form ref="editForm" :rules="rules" :model="editForm" label-width="120px" size="small" label-position="right">
    <el-form-item label="会员注册送积分">
      <el-input v-model="editForm.registerIntegral" type="number" min="0" >
        <template slot="append">
          分
        </template>
      </el-input>
      <el-switch v-model="editForm.isRegisterIntegralEnable" active-text="是" inactive-text="否" />
      <p class="hint">是否启用会员注册送积分</p>
    </el-form-item>

    <el-form-item label="会员注册送优惠券">
      <el-select v-model="editForm.registerCoupon" placeholder="请选择">
        <el-option label="选择1" value="1" />
        <el-option label="选择2" value="2" />
      </el-select>
      <br>
      <el-switch v-model="editForm.isRegisterCouponEnable" active-text="是" inactive-text="否" />
      <p class="hint">是否启用会员注册送优惠券</p>
    </el-form-item>

    <el-form-item label="签到送积分">
      <el-input v-model="editForm.signIntegral" type="number" min="0" >
        <template slot="append">
          分
        </template>
      </el-input>
      <el-switch v-model="editForm.isSignIntegralEnable" active-text="是" inactive-text="否" />
      <p class="hint">是否启用签到送积分</p>
    </el-form-item>

    <el-form-item label="签到送优惠券">
      <el-select v-model="editForm.signCoupon" placeholder="请选择">
        <el-option label="选择1" value="1" />
        <el-option label="选择2" value="2" />
      </el-select>
      <br>
      <el-switch v-model="editForm.isSignCouponEnable" active-text="是" inactive-text="否" />
      <p class="hint">是否启用签到送优惠券</p>
    </el-form-item>

    <el-form-item label="分享送积分">
      <el-input v-model="editForm.shareIntegral" type="number" min="0" >
        <template slot="append">
          分
        </template>
      </el-input>
      <el-switch v-model="editForm.isShareIntegralEnable" active-text="是" inactive-text="否" />
      <p class="hint">是否启用分享送积分</p>
    </el-form-item>

    <el-form-item label="分享送优惠券">
      <el-select v-model="editForm.shareCoupon" placeholder="请选择">
        <el-option label="选择1" value="1" />
        <el-option label="选择2" value="2" />
      </el-select>
      <br>
      <el-switch v-model="editForm.isShareCouponEnable" active-text="是" inactive-text="否" />
      <p class="hint">是否启用分享送优惠券</p>
    </el-form-item>

    <el-form-item label="点赞送积分">
      <el-input v-model="editForm.proIntegral" type="number" min="0" >
        <template slot="append">
          分
        </template>
      </el-input>
    </el-form-item>

    <el-form-item label="点赞送优惠券">
      <el-select v-model="editForm.proCoupon" placeholder="请选择">
        <el-option label="选择1" value="1" />
        <el-option label="选择2" value="2" />
      </el-select>
      <br>
      <el-switch v-model="editForm.isProCouponEnable" active-text="是" inactive-text="否" />
      <p class="hint">是否启用点赞送优惠券</p>
    </el-form-item>

    <el-form-item label="评论送积分">
      <el-input v-model="editForm.commentIntegral" type="number" min="0" >
        <template slot="append">
          分
        </template>
      </el-input>
    </el-form-item>

    <el-form-item label="评论送优惠券">
      <el-select v-model="editForm.commentCoupon" placeholder="请选择">
        <el-option label="选择1" value="1" />
        <el-option label="选择2" value="2" />
      </el-select>
      <br>
      <el-switch v-model="editForm.isCommentCouponEnable" active-text="是" inactive-text="否" />
      <p class="hint">是否启用评论送优惠券</p>
    </el-form-item>

    <el-form-item>
      <el-button type="primary" @click="submitForm('editForm')">保存</el-button>
      <el-button type="info" @click="$router.back()">返回</el-button>
    </el-form-item>
  </el-form>
</template>

<script>
export default {
  name: 'RewardRules',
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
