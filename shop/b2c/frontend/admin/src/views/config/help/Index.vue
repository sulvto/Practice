<template>
    <TabsRouter :tabs='tabs'/>
</template>

<script>
import TabsRouter from '@/components/TabsRouter.vue'

export default {
  name: 'help',
  data () {
    return {
      tabs: [
        {
          path: '/config/help/document/list.html',
          name: '帮助内容'
        }, {
          path: '/config/help/class/list.html',
          name: '帮助类型'
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
