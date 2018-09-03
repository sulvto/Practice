<template>
    <div>
        <Sidebar :menu-list="menuList" />
        <router-view/>
    </div>
</template>

<script>
    // @ is an alias to /src
    import Sidebar from "@/components/TheSidebar.vue";
    
    export default {
        name: "upgrade",
        data: function() {
            return {
                menuList: [{
                        selected: true,
                        path: "/upgrade/onlineupdate.html",
                        name: "在线更新"
                    },
                    {
                        path: "/upgrade/devolutioninfo.html",
                        name: "授权信息"
                    },
                    {
                        path: "/extend/addonslist.html",
                        name: "插件管理"
                    },
                    {
                        path: "/extend/hookslist.html",
                        name: "钩子管理"
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