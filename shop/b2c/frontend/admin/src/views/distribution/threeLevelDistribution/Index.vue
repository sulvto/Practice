<template>
    <TabsRouter :tabs='tabs'/>
</template>

<script>
import TabsRouter from '@/components/TabsRouter.vue'

export default {
  name: 'threeLevelDistribution',
  data () {
    return {
      tabs: [
        {
          path: '/distribution/threeLevelDistribution/config.html',
          name: '基本设置'
        }, {
          path: '/distribution/threeLevelDistribution/level/list.html',
          name: '推广员等级'
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
