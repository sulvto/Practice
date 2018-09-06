<template>
  <div >
      <router-view/>
  </div>
</template>

<script>

export default {
  name: 'distribution',
  data () {
    return {
      menuList: [
        {
          selected: true,
          path: '/distribution/promoterList.html',
          name: '推广员管理'
        },
        {
          path: '/distribution/goodsCommissionRateList.html',
          name: '商品分销'
        },
        {
          path: '/distribution/threeLevelDistributionConfig.html',
          name: '三级分销'
        },
        {
          path: '/distribution/regionalAgent.html',
          name: '区域代理'
        },
        {
          path: '/distribution/shareholderDividendsConfig.html',
          name: '股东分红'
        },
        {
          path: '/distribution/globalBonusPoolConfig.html',
          name: '全球分红'
        }
      ]
    }
  },
  components: {
  }
}
</script>

<style lang='scss'>
</style>
