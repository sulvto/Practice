<template>
    <TabsRouter :tabs='tabs'/>
</template>

<script>
import TabsRouter from '@/components/TabsRouter.vue'

export default {
  name: 'globalBonusPool',
  data () {
    return {
      tabs: [
        {
          path: '/distribution/globalBonusPool/config.html',
          name: '基本设置'
        }, {
          path: '/distribution/globalBonusPool/grant.html',
          name: '发放分红'
        }, {
          path: '/distribution/globalBonusPool/records.html',
          name: '发放记录'
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
