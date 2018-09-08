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
          path: '/distribution/promoter/list.html',
          name: '推广员'
        }, {
          path: '/distribution/promoter/verifyList.html',
          name: '待审核'
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
