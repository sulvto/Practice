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
		name: "commission",
		data: function() {
			return {
				menuList: [{
						selected: true,
						path: "/commission/userAccountList.html",
						name: "推广员佣金"
					},
					{
						path: "/commission/distributionList.html",
						name: "三级分销"
					},
					{
						path: "/commission/partnerList.html",
						name: "股东分红"
					},
					{
						path: "/commission/regionAgentList.html",
						name: "区域代理"
					},
					{
						path: "/commission/partnerGlobalList.html",
						name: "全球分红"
					},
					{
						path: "/commission/userCommissionWithdrawList.html",
						name: "会员提现"
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