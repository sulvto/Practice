<template>
    <TabsRouter :tabs='tabs'/>
</template>

<script>
import TabsRouter from '@/components/TabsRouter.vue'

export default {
  name: 'help',
  data () {
    return {
      tabs: [
        {
          path: '/bargain/index.html',
          name: '砍价列表'
        }, {
          path: '/bargain/config.html',
          name: '砍价设置'
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
