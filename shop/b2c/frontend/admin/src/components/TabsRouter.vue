<template>
    <el-tabs :type="tabType" v-model="activeTabName" @tab-click="handleClick">
        <el-tab-pane v-for="tab in tabs" :key="tab.path" :label="tab.name" :name="tab.name" :path="tab.path">
            <router-view/>
        </el-tab-pane>
    </el-tabs>
</template>

<script>
export default {
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
      activeTabName: null
    }
  },

  props: {
    tabType: String,
    tabs: Array
  },

  created () {
    var currentTab = this.tabs.find(tabItem => this.$route.matched.find(routerItem => tabItem.path === routerItem.path))
    if (currentTab) {
      this.activeTabName = currentTab.name
    } else {
      console.warn('TabsRouter： 没找到activeTabName')
    }

    console.log('created route', this.$route)
  }
}
</script>
