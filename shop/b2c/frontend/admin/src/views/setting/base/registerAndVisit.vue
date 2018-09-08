<template>
  <el-form ref="form" :model="registerAndVisitConfigFrom" label-width="140px" size="mini" label-position="right">
        <el-form-item label="是否允许注册会员">
          <el-switch v-model="registerAndVisitConfigFrom.canRegister"></el-switch>
                      <p class="hint">设置为不允许则游客无法注册成为站点会员</p>
      </el-form-item>

      <el-form-item label="注册类型">
          <el-checkbox-group v-model="registerAndVisitConfigFrom.registerType">
            <el-checkbox label="普通注册" value="plain"></el-checkbox>
            <el-checkbox label="邮箱注册" value="email"></el-checkbox>
            <el-checkbox label="手机注册" value="mobile"></el-checkbox>
          </el-checkbox-group>
          <p class="hint">如开启邮箱和手机注册，请在<a href="/config/notifyindex.html" target="_blank">通知系统</a>功能中进行邮箱与短信通知配置，游客在注册时通过验证后方能注册成功</p>
      </el-form-item>

      <el-form-item label="后台验证码是否开启">
        <el-switch  active-text="是" inactive-text="否" v-model="registerAndVisitConfigFrom.adminCode"></el-switch>
        <p class="hint">设置为不允许则游客无法注册成为站点会员</p>
      </el-form-item>

      <el-form-item label="商城验证码是否开启">
        <el-switch active-text="是" inactive-text="否" v-model="registerAndVisitConfigFrom.pcCode"></el-switch>
        <p class="hint">设置为不允许则游客无法注册成为站点会员</p>
      </el-form-item>

      <el-form-item label="错误多次后显示验证码">
          <el-input-number v-model="registerAndVisitConfigFrom.maxError"></el-input-number>
          <p class="hint">配置该项后，开启验证码后验证码默认不显示，在登录错误次数达到设置值后才进行验证</p>
      </el-form-item>

      <el-form-item label="用户名保留关键字">
        <el-input type="textarea" v-model="registerAndVisitConfigFrom.usernameKeywords"></el-input>
        <p class="hint">用户在注册用户名不可使用这些关键字。多个关键字之间以英文“,”分隔开，如“admin,username”</p>
      </el-form-item>

      <el-form-item label="密码最小长度">
        <el-input-number  v-model="registerAndVisitConfigFrom.minPasswordLength"></el-input-number>
        <p class="hint">新用户注册时密码最小长度，0或不填为不限制</p>
      </el-form-item>

      <el-form-item label="强制密码复杂度">
        <el-checkbox-group v-model="registerAndVisitConfigFrom.passwordComplexity">
          <el-checkbox label="数字" value="number"></el-checkbox>
          <el-checkbox label="小写字母" value="lowercase"></el-checkbox>
          <el-checkbox label="大写字母" value="uppercase"></el-checkbox>
          <el-checkbox label="符号" value="symbol"></el-checkbox>
        </el-checkbox-group>
        <p class="hint">新用户注册时密码中必须存在所选字符类型，不选择为无限制</p>
      </el-form-item>

      <el-form-item label="微信端会员注册方式">
        <el-radio-group v-model="registerAndVisitConfigFrom.isRequireTel">
          <el-radio label="非自动" value="0"></el-radio>
          <p class="hint">用户首次打开微信端商城,不会自动注册为会员，需要进行普通会员注册或者登录会员账号与微信进行绑定，一般应用于电脑端与微信端会员账号统一管理。</p>

          <el-radio label="自动" value="0"></el-radio>
          <p class="hint">用户首次打开微信端商城，会自动注册为会员，本微信会员与电脑端会员是两个会员账号。好处是可以自动完成会员注册。一般应用于只在微信端运营的商家。</p>
      </el-radio-group>
      </el-form-item>

      <el-form-item label="注册服务条款内容">
        <el-input type="textarea" v-model="registerAndVisitConfigFrom.termsOfService"></el-input>
        <p class="hint">新用户注册时显示网站服务条款内容</p>
      </el-form-item>

      <el-form-item>
          <el-button type="primary" @click="submitForm('registerAndVisitConfigFrom')">保存</el-button>
      </el-form-item>
  </el-form>
</template>

<script>
export default {
  name: 'registerAndVisit',
  data () {
    return {
      registerAndVisitConfigFrom: {
        registerType: [],
        passwordComplexity: []
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
