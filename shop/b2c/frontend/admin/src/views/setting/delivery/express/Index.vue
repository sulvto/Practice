<template>
    <CardTabsRouter :tabs='tabs'/>
</template>

<script>
import CardTabsRouter from '@/components/CardTabsRouter.vue'

export default {
  name: 'express',
  data () {
    return {
      tabs: [
        {
          path: '/setting/delivery/express/expressCompany.html',
          name: '物流公司'
        }, {
          path: '/setting/delivery/express',
          name: '地区管理'
        }, {
          path: '/setting/delivery/express/SellerAddress.html',
          name: '商家地址'
        }, {
          path: '/setting/delivery/express',
          name: '货到付款地区管理'
        }, {
          path: '/setting/delivery/express/expressMessage.html',
          name: '物流跟踪设置'
        }
      ]
    }
  },

  components: {
    CardTabsRouter
  },

  created () {}
}
</script>

<style lang='scss'>
</style>
