<template>
    <CardTabsRouter :tabs='tabs'/>
</template>

<script>
import CardTabsRouter from '@/components/CardTabsRouter.vue'

export default {
  name: 'pickuppoint',
  data () {
    return {
      tabs: [
        {
          path: '/setting/delivery/pickuppoint/list.html',
          name: '门店管理'
        }, {
          path: '/setting/delivery/pickuppoint/freight.html',
          name: '门店运费'
        }, {
          path: '/setting/delivery/pickuppoint/auditor.html',
          name: '门店审核人员管理'
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
