<template>
    <el-tabs v-model="activeTabName" @tab-click="handleClick">
        <el-tab-pane v-for="tab in tabs" :key="tab.path" :label="tab.name" :name="tab.name" :path="tab.path">
            <router-view/>
        </el-tab-pane>
    </el-tabs>
</template>

<script>
export default {
  name: 'base',
  methods: {
    handleClick (tab) {
      this.$router.push(tab.$attrs.path)
    }
  },
  watch: {
    $route: {
      handler (val, oldVal) {
        console.log('watch route', this.$route)
      },
      // 深度观察监听
      deep: true
    }
  },
  data () {
    return {
      activeTabName: null,
      tabs: [{
        path: '/setting/base/webConfig.html',
        name: '网站设置'
      }, {
        path: '/setting/base/SEOConfig.html',
        name: 'SEO设置'
      }, {
        path: '/setting/base/copyrightInfo.html',
        name: '版权'
      }, {
        path: '/setting/base/visitConfig.html',
        name: '运营'
      }, {
        path: '/setting/base/registerAndVisit.html',
        name: '注册与访问'
      }, {
        path: '/setting/base/uploadConfig.html',
        name: '上传设置'
      }, {
        path: '/setting/base/customPseudoStaticRule.html',
        name: '伪静态路由'
      }, {
        path: '/setting/base/partyLogin.html',
        name: '第三方登录'
      }, {
        path: '/cosettingnfig/base/notifyindex.html',
        name: '通知系统'
      }, {
        path: '/setting/base/customService.html',
        name: '客服'
      }, {
        path: '/setting/base/merchantService.html',
        name: '商家服务'
      }]
    }
  },

  components: {},

  created () {
    var currentTab = this.tabs.find(item => item.path === this.$route.path)
    if (currentTab) {
      this.activeTabName = currentTab.name
    }
    console.log('created route', this.$route)
  }
}
</script>

<style lang="scss">

</style>
