<template>
    <TabsRouter tabs='tabs'/>
</template>

<script>
import TabsRouter from '@/components/TabsRouter.vue'

export default {
  name: 'auth',
  data () {
    return {
      tabs: [
        {
          path: '/config/transaction/shopConfig.html',
          name: '购物设置'
        },
        {
          path: '/config/transaction/paymentconfig.html',
          name: '支付配置'
        },
        {
          path: '/config/transaction/withdrawConfig.html',
          name: '提现设置'
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
