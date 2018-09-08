<template>
    <CardTabsRouter :tabs='tabs'/>
</template>

<script>
import CardTabsRouter from '@/components/CardTabsRouter.vue'

export default {
  name: 'local',
  data () {
    return {
      tabs: [
        {
          path: '/setting/delivery/local/userList.html',
          name: '配送人员'
        }, {
          path: '/setting/delivery/local/config.html',
          name: '配送费用'
        }, {
          path: '/setting/delivery/local/area.html',
          name: '配送地区'
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
