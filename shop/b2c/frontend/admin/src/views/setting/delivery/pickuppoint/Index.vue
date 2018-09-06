<template>
    <TabsRouter tabs='tabs' />
</template>

<script>
import TabsRouter from '@/components/TabsRouter.vue'

export default {
  name: 'pickuppoint',
  data () {
    return {
      tabs: [
        {
          path: '/setting/delivery/pickuppoint/list.html',
          name: '物流配送'
        },
        {
          path: '/setting/delivery/pickuppoint/',
          name: '门店自提'
        },
        {
          path: '/setting/delivery/pickuppoint/',
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
