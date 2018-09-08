<template>
    <TabsRouter :tabs='tabs'/>
</template>

<script>
import TabsRouter from '@/components/TabsRouter.vue'

export default {
  name: 'auth',
  data () {
    return {
      tabs: [
        {
          path: '/setting/auth/userList.html',
          name: '用户列表'
        },
        {
          path: '/setting/auth/group.html',
          name: '权限组'
        },
        {
          path: '/setting/auth/log.html',
          name: '操作日志'
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
