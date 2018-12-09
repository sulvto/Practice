<template>
  <el-form ref="form" :model="visitConfigFrom" label-width="100px" size="mini" label-position="right">
    <el-form-item label="后台网站风格">
      <el-select v-model="visitConfigFrom.adminSiteStyle" placeholder="请选择">
        <el-option label="简约版" value="1" />
      </el-select>
    </el-form-item>

    <el-form-item label="网站访问模式">
      <el-select v-model="visitConfigFrom.visitMode" placeholder="请选择">
        <el-option label="兼容模式" value="1" />
        <el-option label="pathinfo模式" value="2" />
      </el-select>
      <p class="hint">伪静态只支持<i class="important-note">pathinfo</i>模式，如果开启伪静态，请选择<i class="important-note">pathinfo</i>模式</p>
    </el-form-item>

    <el-form-item label="PC端商城运营状态">
      <el-radio-group v-model="visitConfigFrom.pcStatus">
        <el-radio label="开启" />
        <el-radio label="关闭" />
        <el-radio label="关闭后访问WAP端" />
      </el-radio-group>
      <p class="hint">暂时将站点关闭，其他人无法访问，但不影响管理员访问</p>
    </el-form-item>

    <el-form-item label="WAP端商城运营状态">
      <el-radio-group v-model="visitConfigFrom.wapStatus">
        <el-radio label="开启" />
        <el-radio label="关闭" />
        <el-radio label="关闭后访问PC端" />
      </el-radio-group>
      <p class="hint">暂时将站点关闭，其他人无法访问，但不影响管理员访问</p>
    </el-form-item>

    <el-form-item label="网站关闭原因">
      <el-input v-model="visitConfigFrom.closeReason" type="textarea" value="对不起，牛酷商城维护中，大家敬请期待..." />
      <p class="hint">请填写站点关闭原因，将在前台显示</p>
    </el-form-item>

    <el-form-item>
      <el-button type="primary" @click="submitForm('visitConfigFrom')">保存</el-button>
    </el-form-item>
  </el-form>
</template>

<script>
export default {
  name: 'VisitConfig',
  data () {
    return {
      visitConfigFrom: {}
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
