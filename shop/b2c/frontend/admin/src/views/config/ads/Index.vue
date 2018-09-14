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
          path: '/config/ads',
          name: '广告列表'
        }, {
          path: '/config/ads/position',
          name: '广告位管理'
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
