<template>

  <el-form ref="editForm" :rules="rules" :model="editForm" label-width="100px" size="small" label-position="right">

    <h4>小程序开发者设置<span class="muted">（必填）</span></h4>

    <el-form-item label="APPID">
      <el-input v-model="editForm.appId" placeholder="AppID" />
    </el-form-item>

    <el-form-item label="APP密钥">
      <el-input v-model="editForm.appSecret" placeholder="Appsecret" />
      <p class="hint">
        AppID以及Appsecret来自于您申请的小程序账号，使用小程序账号密码公众平台，在设置-&gt;开发设置中可以找到AppID(小程序ID)及AppSecret(小程序密钥)
      </p>
    </el-form-item>

    <h4>配置说明</h4>

    <el-form-item>
      <div class="config-info">
        <p><span class="text">设置业务域名</span></p>
        <p class="titlestep">
          <a href="https://mp.weixin.qq.com/" target="_blank">登录微信小程序</a>点击设置&gt;开发设置&gt;业务域名设置：
        </p>
        <p class="text-success">
          <span class="muted">域名1：</span>
          http://showfx.niuteam.cn
        </p>
        <p>业务域名设置完毕！</p>
        <span>&emsp;</span>
        <p><span class="text">设置服务器域名</span><span class="muted" /></p>
        <p class="titlestep">
          <a href="https://mp.weixin.qq.com/" target="_blank">登录微信小程序</a>点击设置&gt;开发设置&gt;服务器域名设置：
        </p>
        <p class="text-success">
          <span class="muted">request合法域名：</span>
          http://showfx.niuteam.cn
        </p>
        <p class="text-success">
          <span class="muted">uploadFile合法域名：</span>
          http://showfx.niuteam.cn
        </p>
        <p class="text-success">
          <span class="muted">downloadFile合法域名：</span>
          http://showfx.niuteam.cn
        </p>
        <p>服务器域名设置完毕！</p>
      </div>
    </el-form-item>

    <el-form-item>
      <el-button type="primary" @click="submitForm('editForm')">保存</el-button>
    </el-form-item>
  </el-form>
</template>

<script>
export default {
  name: 'AppletConfig',
  data () {
    return {
      editForm: {},
      rules: {
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

.text-success {
  color: #468847;
}

.muted {
  font-weight: normal;
  font-size: 12px;
  color: #999999;
}

.config-info {
  p {
    margin: 0px;
  }
}

h4 {
  margin-left: 0px;
  border-left: 2px solid #126AE4;
  padding-left: 5px;
  font-size: 14px;
  color: #333333;
}
</style>
