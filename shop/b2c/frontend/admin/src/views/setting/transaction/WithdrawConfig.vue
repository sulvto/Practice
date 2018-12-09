<template>
  <el-form ref="form" :model="withdrawConfigFrom" label-width="100px" size="mini" label-position="right">
    <el-form-item label="最低提现金额">
      <el-input v-model="withdrawConfigFrom.minCash" type="number" min="0.00">
        <template slot="append">元</template>
      </el-input>
      <p class="hint">提现金额将不小于此值才能提现</p>
    </el-form-item>

    <el-form-item label="提现倍数">
      <el-input v-model="withdrawConfigFrom.multiple" type="number" min="0.00">
        <template slot="append">
          倍
        </template>
      </el-input>
      <p class="hint">提现倍数不能为空</p>
    </el-form-item>

    <el-form-item label="提现提示信息">
      <el-input v-model="withdrawConfigFrom.message" type="textarea" max="50" />
      <p class="hint">提现提示信息不能为空</p>
    </el-form-item>

    <el-form-item label="提现账户">
      <el-checkbox-group v-model="withdrawConfigFrom.account">
        <el-checkbox label="银行卡" value="bankCard" />
        <el-checkbox label="微信" value="wchat" />
        <el-checkbox label="支付宝" value="alipay" />
      </el-checkbox-group>
    </el-form-item>

    <el-form-item label="是否启用">
      <el-radio-group v-model="withdrawConfigFrom.isOpen">
        <el-radio label="启用" value="1" />
        <el-radio label="禁用" value="0" />
      </el-radio-group>
      <p class="hint">是否启用提现设置</p>
    </el-form-item>

    <el-form-item>
      <el-button type="primary" @click="submitForm('withdrawConfigFrom')">保存</el-button>
    </el-form-item>
  </el-form>
</template>

<script>
export default {
  name: 'WithdrawConfigFrom',
  data () {
    return {
      withdrawConfigFrom: {
        account: []
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
