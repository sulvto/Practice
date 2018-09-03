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
		name: "member",
		data: function() {
			return {
				menuList: [{
						selected: true,
						path: "/member/memberlist.html",
						name: "会员列表"
					},
					{
						path: "/member/memberlevellist.html",
						name: "会员等级"
					},
					{
						path: "/member/usercommissionwithdrawlist.html",
						name: "会员提现"
					},
					{
						path: "/member/pointlist.html",
						name: "积分管理"
					},
					{
						path: "/member/accountlist.html",
						name: "余额管理"
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