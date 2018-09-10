<template>
    <TabsRouter :tabs='tabs'/>
</template>

<script>
import TabsRouter from '@/components/TabsRouter.vue'

export default {
  name: 'regionalAgent',
  data () {
    return {
      tabs: [
        {
          path: '/distribution/regionalAgent/config.html',
          name: '基本设置'
        }, {
          path: '/distribution/regionalAgent/promoterList.html',
          name: '人员管理'
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
