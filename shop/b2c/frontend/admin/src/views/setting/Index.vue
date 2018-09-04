<template>
	<div>
		<router-view/>
	</div>
</template>

<script>
	
	export default {
		name: "setting",
		data: function() {
			return {
				menuList: [{
						selected: true,
						path: "/config/webConfig.html",
						name: "基础设置"
					},
					{
						path: "/config/shopSet.html",
						name: "交易设置"
					},
					{
						path: "/express/expressCompany.html",
						name: "配送管理"
					},
					{
						path: "/database/index.html",
						name: "数据库管理"
					},
					{
						path: "/auth/userList.html",
						name: "管理员列表"
					},
					{
						path: "/verification/index.html",
						name: "核销设置"
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