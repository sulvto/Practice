<template>
  <div >
      <router-view/>
  </div>
</template>

<script>

export default {
  name: 'order',
  data () {
    return {
      menuList: [
        {
          selected: true,
          path: '/order/orderlist.html',
          name: '订单列表'
        },
        {
          path: '/order/virtualorder.html',
          name: '虚拟订单'
        },
        {
          path: '/tuangou/pintuanorderlist.html',
          name: '拼团订单'
        },
        {
          path: '/orderpresell/list.html',
          name: '预售订单'
        },
        {
          path: '/order/bargainorder.html',
          name: '砍价订单'
        },
        {
          path: '/order/invoicelist.html',
          name: '发票管理'
        },
        {
          path: '/order/customerservicelist.html',
          name: '售后服务'
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
