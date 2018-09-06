<template>
    <TabsRouter tabs='tabs'/>
</template>

<script>
import TabsRouter from '@/components/TabsRouter.vue'

export default {
  name: 'delivery',
  data () {
    return {
      tabs: [
        {
          path: '/setting/delivery/express',
          name: '物流配送'
        },
        {
          path: '/setting/delivery/pickuppoint',
          name: '门店自提'
        },
        {
          path: '/setting/delivery/local',
          name: '本地配送'
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
