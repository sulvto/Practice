<template>
  <TabsRouter :tab-type="tabType" :tabs="tabs"/>
</template>

<script>
import TabsRouter from '@/components/TabsRouter.vue'

export default {

  components: {
    TabsRouter
  },

  props: {
    tabs: {
      type: Array,
      required: true,
      default: null
    }
  },
  data () {
    return {
      tabType: 'border-card'
    }
  },

  created () {}
}
</script>

<style lang='scss'>
</style>
