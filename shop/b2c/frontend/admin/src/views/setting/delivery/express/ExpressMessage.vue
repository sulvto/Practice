<!-- <div>
<h4>功能提示</h4>
<p class="function-prompts">
</p><p>1、快递鸟接口与快递100接口配置成功后，订单物流跟踪查询会当前所选择的接口进行查询</p>
<p>2、快递100免费版不支持主流快递公司的查询</p>
<p>3、两个接口的快递公司编码不同</p>
<p style="margin: 0;"><a href="http://www.kdniao.com/file/2017%E5%BF%AB%E9%80%92%E9%B8%9F%E6%8E%A5%E5%8F%A3%E6%94%AF%E6%8C%81%E5%BF%AB%E9%80%92%E5%85%AC%E5%8F%B8%E7%BC%96%E7%A0%81.xlsx">快递鸟物流公司编码下载</a></p>
<p style="margin: 0;"><a href="https://cdn.kuaidi100.com/download/chaxun(20140729).doc">快递100免费版物流公司编码下载</a></p>
<p style="margin: 0;"><a href="https://poll.kuaidi100.com/pollquery/pollStep.do?method=kdbm">快递100企业版物流公司编码下载</a></p>
<p></p>
</div> -->

<template>
  <el-form ref="form" :model="expressMessageFrom" label-width="100px" size="small" label-position="right">
    <h4>物流跟踪设置</h4>

    <el-form-item label="接口名称">
      <el-select v-model="expressMessageFrom.type" placeholder="请选择">
        <el-option label="快递鸟" value="1" />
        <el-option label="快递100（免费版）" value="2" />
        <el-option label="快递100（企业版）" value="3" />
      </el-select>
    </el-form-item>

    <el-form-item v-show="expressMessageFrom.type==1" label="APPID" >
      <el-input v-model="expressMessageFrom.appId" />
      <p class="hint">应用APPID</p>
    </el-form-item>

    <el-form-item label="APPKEY">
      <el-input v-model="expressMessageFrom.appKey" />
      <p class="hint">应用密钥</p>
    </el-form-item>

    <el-form-item v-show="expressMessageFrom.type==3" label="CUSTOMER" >
      <el-input v-model="expressMessageFrom.customer" />
      <p class="hint">快递100分配给的公司编号</p>
    </el-form-item>

    <el-form-item label="说明">
      <a :href="{1: 'http://www.kdniao.com/', 2: 'http://www.kuaidi100.com/', 3: 'http://www.kuaidi100.com/'}[expressMessageFrom.type]" target="_blank">点击申请</a>
    </el-form-item>

    <el-form-item label="是否启用">
      <el-switch v-model="expressMessageFrom.isEnable" active-text="是" inactive-text="否" />
    </el-form-item>

    <el-form-item>
      <el-button type="primary" @click="submitForm('expressMessageFrom')">保存</el-button>
      <el-button type="info" @click="$router.back()">返回</el-button>
    </el-form-item>
  </el-form>
</template>

<script>
export default {
  name: 'ExpressMessageFrom',
  data () {
    return {
      expressMessageFrom: {}
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

h4 {
  border-left: 2px solid #126AE4;
  padding-left: 5px;
}
</style>
