<template>
    <TabsRouter tabs='tabs'/>
</template>

<script>
import TabsRouter from '@/components/TabsRouter.vue'

export default {
  name: 'express',
  data () {
    return {
      tabs: [
        {
          path: '/setting/delivery/express',
          name: '物流配送'
        },
        {
          path: '/setting/delivery/express',
          name: '门店自提'
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
