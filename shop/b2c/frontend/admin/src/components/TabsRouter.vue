<template>
  <el-tabs :type="tabType" v-model="activeTabName" @tab-click="handleClick">
    <el-tab-pane v-for="tab in tabs" :key="tab.path" :label="tab.name" :name="tab.name" :path="tab.path">
      <router-view/>
    </el-tab-pane>
  </el-tabs>
</template>

<script>
export default {

  props: {
    tabType: {
      type: String,
      default: ''
    },
    tabs: {
      type: Array,
      default: null
    }
  },

  data () {
    return {
      activeTabName: null
    }
  },
  watch: {
    $route: {
      handler (val, oldVal) {
        console.log('watch route', this.$route)
        this.resetActiveTab()
      },
      // 深度观察监听
      deep: true
    }
  },

  created () {
    this.resetActiveTab()

    console.log('created route', this.$route)
  },

  methods: {
    handleClick (tab) {
      this.$router.push(tab.$attrs.path)
    },
    resetActiveTab () {
      var currentTab = this.tabs.find(tabItem => this.$route.matched.find(routerItem => tabItem.path === routerItem.path))
      if (currentTab) {
        this.activeTabName = currentTab.name
      } else {
        console.warn('TabsRouter： 没找到activeTabName')
      }
    }
  }

}
</script>
