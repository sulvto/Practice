<template>
  <div >
    <router-view/>
  </div>
</template>

<script>
// @ is an alias to /src
// import Sidebar from '@/components/TheSidebar.vue';

export default {
  name: 'Account',
  components: {
    // Sidebar
  },
  data () {
    return {
      menuList: [
        {
          selected: true,
          path: '/account/shopsalesaccount.html',
          name: '销售概况'
        },
        {
          path: '/account/shopgoodssaleslist.html',
          name: '商品分析'
        },
        {
          path: '/account/shopgoodsgroupsalecount.html',
          name: '同行热卖'
        },
        {
          path: '/account/shopreport.html',
          name: '运营报告'
        },
        {
          path: '/account/shopgoodssalesrank.html',
          name: '销售排行'
        }
      ]
    }
  }
}
</script>

<style lang='scss'>
</style>
