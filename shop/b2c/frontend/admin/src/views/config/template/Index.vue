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
          path: '/config/template/pc.html',
          name: '电脑端模板'
        }, {
          path: '/config/template/fixed.html',
          name: '手机端模板'
        }, {
          path: '/config/template/wapCustom',
          name: '手机端自定义模板'
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
