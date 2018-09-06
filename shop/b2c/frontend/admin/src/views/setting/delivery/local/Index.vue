<template>
    <TabsRouter tabs='tabs'/>
</template>

<script>
import TabsRouter from '@/components/TabsRouter.vue'

export default {
  name: 'local',
  data () {
    return {
      tabs: [
        {
          path: '/setting/delivery/local/userList.html',
          name: '物流配送'
        },
        {
          path: '/setting/delivery/local/config.html',
          name: '门店自提'
        },
        {
          path: '/setting/delivery/local/area.html',
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
