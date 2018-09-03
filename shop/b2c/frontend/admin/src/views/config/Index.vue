<template>
  <div >
      <Sidebar :menu-list="menuList" />
      <router-view/>
  </div>
</template>

<script>
// @ is an alias to /src
import Sidebar from "@/components/TheSidebar.vue";

export default {
  name: "config",
  data: function() {
    return {
      menuList: [
        {
          selected: true,
          path: "/config/userNotice.html",
          name: "首页公告"
        },
        {
          path: "/config/shopNavigationList.html",
          name: "导航管理"
        },
        {
          path: "/system/goodsCategoryBlock.html",
          name: "商品楼层"
        },
        {
          path: "/config/pcTemplate.html",
          name: "店铺装修"
        },
        {
          path: "/config/searchConfig.html",
          name: "搜索"
        },
        {
          path: "/system/adsList.html",
          name: "广告管理"
        },
        {
          path: "/cms/articleList.html",
          name: "文章管理"
        },
        {
          path: "/cms/topicList.html",
          name: "专题列表"
        },
        {
          path: "/config/helpDocument.html",
          name: "站点帮助"
        },
        {
          path: "/config/linkList.html",
          name: "友情链接"
        }
      ]
    };
  },
  components: {
    Sidebar
  }
};
</script>

<style lang="scss">
</style>