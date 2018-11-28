<template>
    <TabsRouter :tabs='tabs'/>
</template>

<script>
import TabsRouter from '@/components/TabsRouter.vue'

export default {
  name: 'tuangou',
  data () {
    return {
      tabs: [
        {
          path: '/tuangou/pintuanList.html',
          name: '拼团列表'
        }, {
          path: '/tuangou/tuangouList.html',
          name: '拼团设置'
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
