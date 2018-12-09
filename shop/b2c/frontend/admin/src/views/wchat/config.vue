<template>
  <el-form ref="editForm" :rules="rules" :model="editForm" label-width="100px" size="small" label-position="right">

    <h4>微信公众号设置<span class="muted">（选填，用于配置自定义菜单）</span></h4>

    <el-form-item label="APPID">
      <el-input v-model="editForm.appId" placeholder="AppID" />
    </el-form-item>

    <el-form-item label="APP密钥">
      <el-input v-model="editForm.appSecret" placeholder="Appsecret" />
      <p class="hint">
        <span>AppID以及Appsecret来自于您申请开发接口时提供的账号和密码，且公众号为已认证服务号</span>
      </p>
    </el-form-item>

    <h4>服务器配置<span class="muted">（用于接收用户消息）</span></h4>

    <el-form-item label="URL">
      <el-input readonly value="http://showfx.niuteam.cn/wap/wchat/relateWeixin.html" />
    </el-form-item>

    <el-form-item label="Token">
      <el-input v-model="editForm.token" maxlength="32" />
      <p class="muted" style="margin-top: 5px;">Token必须为英文或数字，长度为3-32字符。如不填写则默认为“TOKEN”。</p>
    </el-form-item>

    <h4>配置说明</h4>

    <el-form-item>
      <div class="config-info">
        <p>请将以上URL及Token填到微信公众平台中，以完成绑定。</p>
        <p>&emsp;</p>
        <p><span class="text">设置业务域名</span><span class="muted">（设置业务域名，用户在相应域名上进行输入时不再出现防欺诈盗号等安全提示）</span></p>
        <p><a href="https://mp.weixin.qq.com/" target="_blank">登录微信公众平台</a>点击公众号设置&gt;功能设置&gt;业务域名设置，一次填写：</p>
        <p class="text-success">
          <span class="muted">域名1：</span>
          showfx.niuteam.cn
        </p>
        <p class="titlestep mt30">
          <a href="https://mp.weixin.qq.com/" target="_blank">登录微信公众平台</a>点击公众号设置&gt;开发者中心&gt;网页授权获取用户基本信息&gt;修改：
        </p>
        <p class="text-success">
          <span class="muted">填写授权回调页面域名：</span>
          showfx.niuteam.cn
        </p>
        <p>业务域名设置完毕！</p>
      </div>
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
