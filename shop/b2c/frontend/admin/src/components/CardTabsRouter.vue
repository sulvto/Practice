<template>
    <TabsRouter :tabType="tabType" :tabs='tabs'/>
</template>

<script>
import TabsRouter from '@/components/TabsRouter.vue'

export default {
  data () {
    return {
      tabType: 'border-card'
    }
  },

  props: {
    tabs: Array
  },

  components: {
    TabsRouter
  },

  created () {}
}
</script>

<style lang='scss'>
</style>
