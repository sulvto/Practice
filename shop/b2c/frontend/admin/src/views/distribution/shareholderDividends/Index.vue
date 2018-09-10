<template>
    <TabsRouter :tabs='tabs'/>
</template>

<script>
import TabsRouter from '@/components/TabsRouter.vue'

export default {
  name: 'promoter',
  data () {
    return {
      tabs: [
        {
          path: '/distribution/shareholderDividends/config.html',
          name: '基本设置'
        }, {
          path: '/distribution/shareholderDividends/partnerList.html',
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
