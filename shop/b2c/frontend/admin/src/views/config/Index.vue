<template>
  <div >
      <router-view/>
  </div>
</template>

<script>

export default {
  name: 'config',
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
      menuList: [
        {
          selected: true,
          path: '/config/userNotice.html',
          name: '首页公告'
        },
        {
          path: '/config/shopNavigationList.html',
          name: '导航管理'
        },
        {
          path: '/system/goodsCategoryBlock.html',
          name: '商品楼层'
        },
        {
          path: '/config/pcTemplate.html',
          name: '店铺装修'
        },
        {
          path: '/config/searchConfig.html',
          name: '搜索'
        },
        {
          path: '/system/adsList.html',
          name: '广告管理'
        },
        {
          path: '/cms/articleList.html',
          name: '文章管理'
        },
        {
          path: '/cms/topicList.html',
          name: '专题列表'
        },
        {
          path: '/config/helpDocument.html',
          name: '站点帮助'
        },
        {
          path: '/config/linkList.html',
          name: '友情链接'
        }
      ]
    }
  },

  components: {
  },

  created () {
    console.log('created route', this.$route)
  }
}
</script>

<style lang="scss">
</style>
