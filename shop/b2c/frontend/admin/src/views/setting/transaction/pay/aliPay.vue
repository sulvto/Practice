<!-- <template>
  <section class="ns-base-section">
    <div class="ns-main">

    <div class="set-style">
    <dl>
    <dt>账号：</dt>
    <dd>
      <input id="ali_seller" type="text" value="" class="input-common long">
      <p class="hint">支付宝账户</p>
    </dd>
    </dl>
    <dl>
    <dt>合作者身份ID：</dt>
    <dd>
      <input id="ali_partnerid" type="text" value="" class="input-common long">
      <p class="hint">支付宝合作者身份ID（PID）</p>
    </dd>
    </dl>
    <dl>
    <dt>安全校验码：</dt>
    <dd>
      <input id="ali_key" type="text" value="" class="input-common long">
      <p class="hint">支付宝老版MD5密钥</p>
    </dd>
    </dl>
    <dl>
    <dt>是否启用支付：</dt>
    <dd>
        <input id="is_use" type="checkbox" class="checkbox" checked="checked" simpleswitch="0" result="true" style="display: none;" />
        <div class="Switch Switch_FlatRadius On" id="Switch0" ><span class="switch-open">是</span><span class="switch-close">否</span></div>
    </dd>
    </dl>

    <dl>
    <dt>是否启用退款：</dt>
    <dd>
        <input id="refund_is_use" type="checkbox" class="checkbox" checked="checked" simpleswitch="1" result="true" style="display: none;"><div class="Switch Switch_FlatRadius On" id="Switch1"><span class="switch-open">是</span><span class="switch-close">否</span></div>
      <p class="hint">开启支付宝支付才可以进行后续操作</p>
    </dd>
    </dl>
    <dl>
    <dt>是否启用转账：</dt>
    <dd>
        <input id="transfer_is_use" type="checkbox" class="checkbox" checked="checked" simpleswitch="2" result="true" style="display: none;"><div class="Switch Switch_FlatRadius On" id="Switch2"><span class="switch-open">是</span><span class="switch-close">否</span></div>
      <p class="hint">开启支付宝支付才可以进行后续操作</p>
    </dd>
    </dl>

    <dl>
    <dt></dt>
    <dd>
      <button class="btn-common btn-big" onclick="setConfigAjax()">保存</button>
      <button class="btn-common-cancle btn-big" onclick="javascript:history.back(-1);">返回</button>
    </dd>
    </dl>
    </div>

    </div>
    </section>
    </template> -->

<template>
  <el-form ref="form" :model="aliPayConfigFrom" label-width="140px" size="mini" label-position="right">

    <el-form-item label="账户">
      <el-input v-model="aliPayConfigFrom.aliSeller" />
      <p class="hint">支付宝账户</p>

    </el-form-item>

    <el-form-item label="合作者身份ID：">
      <el-input v-model="aliPayConfigFrom.aliPartnerid" />
      <p class="hint">支付宝合作者身份ID（PID）</p>
    </el-form-item>

    <el-form-item label="安全校验码">
      <el-input v-model="aliPayConfigFrom.aliKey" />
      <p class="hint">支付宝老版MD5密钥</p>
    </el-form-item>

    <el-form-item label="是否启用支付">
      <el-switch v-model="aliPayConfigFrom.isUse" active-text="是" inactive-text="否" />
    </el-form-item>

    <el-form-item label="是否启用退款">
      <el-switch v-model="aliPayConfigFrom.canRefund" active-text="是" inactive-text="否" />
      <p class="hint">开启支付宝支付才可以进行后续操作</p>
    </el-form-item>

    <el-form-item label="是否启用转账">
      <el-switch v-model="aliPayConfigFrom.canTransfer" active-text="是" inactive-text="否" />
      <p class="hint">开启支付宝支付才可以进行后续操作</p>
    </el-form-item>

    <el-form-item>
      <el-button type="primary" @click="submitForm('aliPayConfigFrom')">保存</el-button>
      <el-button type="info" @click="$router.back()">返回</el-button>
    </el-form-item>
  </el-form>
</template>

<script>
export default {
  name: 'AliPayConfig',
  data () {
    return {
      aliPayConfigFrom: {
      }
    }
  },
  methods: {
    handlePreview () {

    },
    handleRemove () {

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
