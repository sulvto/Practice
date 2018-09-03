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
  name: "goods",
  data: function() {
    return {
      menuList: [
        {
          selected: true,
          path: "/goods/list.html",
          name: "商品列表"
        },
        {
          path: "/goods/add.html",
          name: "商品发布"
        },
        {
          path: "/goods/categorylist.html",
          name: "商品分类"
        },
        {
          path: "/goods/brandlist.html",
          name: "商品品牌"
        },
        {
          path: "/goods/labellist.html",
          name: "商品标签"
        },
        {
          path: "/goods/speclist.html",
          name: "商品规格"
        },
        {
          path: "/goods/supplierlist.html",
          name: "供货商"
        },
        {
          path: "/goods/attributelist.html",
          name: "商品类型"
        },
        {
          path: "/goods/consult.html",
          name: "咨询管理"
        },
        {
          path: "/goods/comment.html",
          name: "商品评价"
        },
        {
          path: "/goods/albumlist.html",
          name: "相册管理"
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
