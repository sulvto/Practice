<template>
    <TabsRouter :tabs='tabs'/>
</template>

<script>
import TabsRouter from '@/components/TabsRouter.vue'

export default {
  name: 'article',
  data () {
    return {
      tabs: [
        {
          path: '/config/article/list.html',
          name: '文章列表'
        }, {
          path: '/config/article/classList.html',
          name: '文章分类'
        }
      ]
    }
  },

  components: {
    TabsRouter
  },

  created () {}
}
</script>

<style lang='scss'>
</style>
