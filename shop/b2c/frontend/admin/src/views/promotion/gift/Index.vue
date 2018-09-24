<template>
    <TabsRouter :tabs='tabs'/>
</template>

<script>
import TabsRouter from '@/components/TabsRouter.vue'

export default {
  name: 'gift',
  data () {
    return {
      tabs: [
        {
          path: '/promotion/gift/list.html',
          name: '赠品列表'
        }, {
          path: '/promotion/gift/records.html',
          name: '赠品发放记录'
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
