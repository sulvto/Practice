
<!--  <div> -->
<!--  <h4>操作提示</h4> -->
<!--  <p>微信支付</p> -->
<!--  <hr> -->
<!--  <h4>功能提示</h4> -->
<!--  <p class="function-prompts"> -->
<!--  配置路径写法： 由于数字证书要求安全性比较高，所以针对独立服务器建议写绝对路径，也就是文件在服务器中的路径地址。针对虚拟主机服务器，由于只有虚拟主机的目录，只能讲数字证书放在系统内部，所以使用相对路径的写法，也就是相对系统根目录的路径。 -->
<!--  </p> -->
<!--  </div> -->

<template>
    <el-form ref="form" :model="wchatPayConfigFrom" label-width="140px" size="mini" label-position="right">

        <el-form-item label="应用ID">
          <el-input   v-model="wchatPayConfigFrom.appID">
          </el-input>
          <p class="hint"><i class="important-note">[AppID]</i>微信支付对应公众账号APPID</p>
        </el-form-item>

       <el-form-item label="应用密钥">
          <el-input   v-model="wchatPayConfigFrom.appSecrect">
          </el-input>
          <p class="hint"><i class="important-note">[AppSecrect]</i>微信支付对应公众账号APPS</p>
       </el-form-item>

       <el-form-item label="支付专用签名串">
          <el-input   v-model="wchatPayConfigFrom.paySignKey">
          </el-input>
          <p class="hint"><i class="important-note">[paySignKey]</i>微信商户API密钥</p>
        </el-form-item>

       <el-form-item label="微信支付商户号">
          <el-input   v-model="wchatPayConfigFrom.MCHID">
          </el-input>
          <p class="hint"><i class="important-note">[MCHID]</i>微信支付商户号</p>
       </el-form-item>

       <el-form-item label="支付授权目录">
          <span class="text" style="background-color: white; border: none;min-width: 500px;display: inline-block;font-size: 13px;cursor: pointer;color:#468847;" id="empowerUrl" value="">http://showfx.niuteam.cn/wap/pay/</span>
       </el-form-item>

       <el-form-item label="apiclient_cert">
        <el-input   v-model="wchatPayConfigFrom.apiclientCert" placeholder="请填写绝对路径">
        </el-input>
       </el-form-item>

       <el-form-item label="apiclient_key.pem">
         <el-input   v-model="wchatPayConfigFrom.apiclientKey" placeholder="请填写绝对路径">
        </el-input>
       </el-form-item>

     <el-form-item label="是否启用支付">
        <el-switch active-text="是" inactive-text="否" v-model="wchatPayConfigFrom.isUse"></el-switch>
      </el-form-item>

     <el-form-item label="是否启用退款">
        <el-switch active-text="是" inactive-text="否" v-model="wchatPayConfigFrom.canRefund"></el-switch>
        <p class="hint">需要配置微信支付同时配置好apiclient_cert和apiclient_key的绝对路径才可以进行后续操作</p>
      </el-form-item>

     <el-form-item label="是否启用转账">
          <el-switch active-text="是" inactive-text="否" v-model="wchatPayConfigFrom.canTransfer"></el-switch>
          <p class="hint">需要配置微信支付同时配置好apiclient_cert和apiclient_key的绝对路径才可以进行后续操作</p>
        </el-form-item>

        <el-form-item>
            <el-button type="primary" @click="submitForm('wchatPayConfigFrom')">保存</el-button>
            <el-button type="info" @click="$router.back()">返回</el-button>
        </el-form-item>
    </el-form>
</template>

<script>
export default {
  name: 'wchatPayConfig',
  methods: {
    handlePreview () {},
    handleRemove () {}
  },
  data () {
    return {
      wchatPayConfigFrom: {}
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
