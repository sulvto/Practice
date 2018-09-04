<template>
  <div >
      <router-view/>
  </div>
</template>

<script>

export default {
  name: "wchat",
  data: function() {
    return {
      menuList: [
        {
          selected: true,
          path: "/wchat/appletconfig.html",
          name: "微信小程序管理"
        },
        {
          path: "/wchat/config.html",
          name: "公众号管理"
        },
        {
          path: "/wchat/menu.html",
          name: "微信菜单管理"
        },
        {
          path: "/wchat/weixinqrcodetemplate.html",
          name: "推广二维码管理"
        },
        {
          path: "/wchat/replayconfig.html",
          name: "回复设置"
        },
        {
          path: "/wchat/materialmessage.html",
          name: "消息素材管理"
        },
        {
          path: "/wchat/shareconfig.html",
          name: "分享内容设置"
        },
        {
          path: "/menu/addonmenu.html",
          name: "模板消息设置"
        },
        {
          path: "/member/weixinfanslist.html",
          name: "粉丝列表"
        },
        {
          path: "/wchat/keyconcernconfig.html",
          name: "一键关注设置"
        },
        {
          path: "/wchat/fansmessagemanage.html",
          name: "客服管理"
        }
      ]
    };
  },
  components: {
  }
};
</script>

<style lang="scss">
</style>