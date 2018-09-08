<template>
    <TabsRouter :tabs='tabs'/>
</template>

<script>
import TabsRouter from '@/components/TabsRouter.vue'

export default {
  name: 'database',
  data () {
    return {
      tabs: [
        {
          path: '/setting/database/backup.html',
          name: '数据库备份'
        },
        {
          path: '/setting/database/restore.html',
          name: '数据库恢复'
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
