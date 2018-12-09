
<template>
  <el-tabs v-model="activeName" >
    <el-tab-pane label="热门搜索" name="hot">
      <el-form ref="searchConfigFrom" :model="searchConfigFrom" label-width="100px" size="small" label-position="right">
        <el-form-item label="热门搜索">
          <el-input v-model="searchConfigFrom.keywords" type="textarea" />
          <p class="hint">热门搜索，将显示在前台搜索框下面，前台点击时直接作为关键词进行搜索，多个关键词间请用半角逗号 "," 隔开</p>
        </el-form-item>

        <el-form-item>
          <el-button type="primary" @click="saveHotSearchConfig()">保存</el-button>
        </el-form-item>
      </el-form>

    </el-tab-pane>
    <el-tab-pane label="默认搜索" name="default">

      <el-form ref="searchConfigFrom" :model="searchConfigFrom" label-width="100px" size="small" label-position="right">
        <el-form-item label="默认搜索">
          <el-input v-model="searchConfigFrom.defaultKeywords" />
          <p class="hint">默认搜索，将显示在前台搜索框，前台点击时直接作为关键词进行搜索</p>
        </el-form-item>

        <el-form-item>
          <el-button type="primary" @click="saveDefaultSearchConfig()">保存</el-button>
        </el-form-item>
      </el-form>
    </el-tab-pane>
  </el-tabs>
</template>

<script>
export default {
  data () {
    return {
      activeName: 'hot',
      searchConfigFrom: {
        keywords: '',
        defaultKeywords: ''
      }
    }
  },
  methods: {
    saveHotSearchConfig () {

    },
    saveDefaultSearchConfig () {

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
