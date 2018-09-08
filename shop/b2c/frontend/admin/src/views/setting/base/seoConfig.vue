<template>
    <el-form ref="form" :model="seoConfigFrom" label-width="100px" size="mini" label-position="right">
        <el-form-item label="标题附加字">
          <el-input v-model="seoConfigFrom.title"></el-input>
          <p class="hint">网页标题通常是搜索引擎关注的重点，本附加字设置出现在标题中商城名称后，如有多个附加字，建议用<i class="important-note">英文“,”</i>分隔</p>
        </el-form-item>

        <el-form-item label="商城关键词">
            <el-input v-model="seoConfigFrom.Keywords"></el-input>
            <p class="hint">Keywords项出现在页面头部的标签中，用于记录本页面的关键字，多个关键字请用<i class="important-note">英文“,”</i>分隔</p>
        </el-form-item>

        <el-form-item label="关键词描述">
            <el-input v-model="seoConfigFrom.description"></el-input>
            <p class="hint">Description出现在页面头部的Meta标签中，用于记录本页面的摘要与描述，建议不超过80个字</p>
        </el-form-item>

        <el-form-item label="其他页头信息">
            <el-input type="textarea" v-model="seoConfigFrom.htmlContent"></el-input>
            <p class="hint">如需在中添加其他的HTML代码，可以使用本设置，否则请留空</p>
        </el-form-item>

        <el-form-item>
            <el-button type="primary" @click="submitForm('ruleForm')">保存</el-button>
        </el-form-item>
    </el-form>
</template>

<script>
export default {
  name: 'seoConfig',
  data () {
    return {
      seoConfigFrom: {}
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
