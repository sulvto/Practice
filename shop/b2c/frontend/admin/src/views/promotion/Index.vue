<template>
  <div >
      <router-view/>
  </div>
</template>

<script>

export default {
  name: 'promotion',
  data () {
    return {
      menuList: [
        {
          selected: true,
          path: '/promotion/coupontypelist.html',
          name: '优惠券'
        },
        {
          path: '/promotion/pointconfig.html',
          name: '积分管理'
        },
        {
          path: '/promotion/giftlist.html',
          name: '赠品'
        },
        {
          path: '/promotion/mansonglist.html',
          name: '满减送'
        },
        {
          path: '/bargain/index.html',
          name: '砍价活动'
        },
        {
          path: '/promotion/discountlist.html',
          name: '限时折扣'
        },
        {
          path: '/promotion/combopackagelist.html',
          name: '组合套餐'
        },
        {
          path: '/promotion/fullshipping.html',
          name: '满额包邮'
        },
        {
          path: '/promotion/integral.html',
          name: '奖励规则'
        },
        {
          path: '/promotion/gameslist.html',
          name: '互动游戏'
        },
        {
          path: '/promotion/groupbuylist.html',
          name: '团购'
        },
        {
          path: '/tuangou/pintuanlist.html',
          name: '拼团'
        },
        {
          path: '/promotion/topiclist.html',
          name: '专题活动'
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