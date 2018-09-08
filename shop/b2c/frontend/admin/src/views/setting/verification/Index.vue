<template>
    <TabsRouter :tabs='tabs'/>
</template>

<script>
import TabsRouter from '@/components/TabsRouter.vue'

export default {
  name: 'verification',
  data () {
    return {
      tabs: [
        {
          path: '/setting/verification/list.html',
          name: '核销人员'
        },
        {
          path: '/setting/verification/records.html',
          name: '核销记录'
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
