<template>
    <el-tabs v-model="activeTabName" @tab-click="handleClick">
        <el-tab-pane v-for="tab in tabs" :key="tab.path" :label="tab.name" :name="tab.name" :path="tab.path">
            <router-view/>
        </el-tab-pane>
    </el-tabs>
</template>

<script>
    export default {
        methods: {
            handleClick(tab) {
                this.$router.push(tab.$attrs.path);
            }
        },
        watch: {
            $route: {
                handler: function(val, oldVal) {
                    console.log('watch route', this.$route);
                },
                // 深度观察监听
                deep: true
            }
        },
        data: function() {
            return {
                activeTabName: null                
            };
        },

        props: {
			tabs: Array
		},

        created() {
            var currentTab = this.tabs.find(item=>item.path === this.$route.path);
            if (currentTab) {
                this.activeTabName = currentTab.name;
            }
            console.log('created route', this.$route);
        }
    
    };
</script>