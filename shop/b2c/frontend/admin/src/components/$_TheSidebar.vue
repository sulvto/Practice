<template>
	<aside class="ns-base-aside">
		<div class="ns-main-block">
	
			<h3 style="margin-top:50px;">
				<span class="首页">首页</span>
				<i class="fa fa-caret-down"></i>
			</h3>
	
			<nav>
				<ul>
					<li v-for="menu in menuList" :key="menu.name" :class="{ selected: menu.selected }" @click="$router.push(menu.path);" :title="menu.name">{{ menu.name }}</li>
				</ul>
				<!-- 快捷菜单设置按钮 -->
				<div v-if="isIndex" class="shortcut-menu" onclick="show_shortcut_menu()">
					<span></span> 常用功能
				</div>
			</nav>
	
			<div style="height:50px;"></div>
	
			<div id="bottom_copyright">
				<footer style="display: none;">
					<img id="copyright_logo" src="/upload/common/1533177443.jpg">
					<!-- 					<p> -->
					<!-- 						<span id="copyright_desc"></span> -->
					<!-- 						<br/> -->
					<!-- 						<a id="copyright_companyname" style="color: #333" target="_blank"></a> -->
					<!-- 						<br/> -->
					<!-- 						<span id="copyright_meta"></span> -->
					<!-- 					</p> -->
				</footer>
			</div>
		</div>
	
		<!-- 快捷菜单 -->
		<div class="modal fade hide" id="set_shortcut_menu" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true" style="width:1200px;">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
				<h3>常用功能设置</h3>
			</div>
			<div class="modal-body">
				<ul class="menu-box">
					<li>
						<h4>首页</h4>
						<div>
							<p>
								<i class="checkbox-common"><input type="checkbox" value="515"></i>
								<span>欢迎页</span>
							</p>
						</div>
					</li>
					<li>
						<h4>商品</h4>
						<div>
							<p>
								<i class="checkbox-common selected"><input type="checkbox" value="150" checked=""></i>
								<span>商品列表</span>
							</p>
							<p>
								<i class="checkbox-common selected"><input type="checkbox" value="151" checked=""></i>
								<span>商品发布</span>
							</p>
							<p>
								<i class="checkbox-common selected"><input type="checkbox" value="419" checked=""></i>
								<span>商品分类</span>
							</p>
							<p>
								<i class="checkbox-common selected"><input type="checkbox" value="423" checked=""></i>
								<span>商品品牌</span>
							</p>
							<p>
								<i class="checkbox-common selected"><input type="checkbox" value="171" checked=""></i>
								<span>商品标签</span>
							</p>
							<p>
								<i class="checkbox-common"><input type="checkbox" value="479"></i>
								<span>商品规格</span>
							</p>
							<p>
								<i class="checkbox-common"><input type="checkbox" value="10001"></i>
								<span>供货商</span>
							</p>
							<p>
								<i class="checkbox-common"><input type="checkbox" value="482"></i>
								<span>商品类型</span>
							</p>
							<p>
								<i class="checkbox-common"><input type="checkbox" value="334"></i>
								<span>咨询管理</span>
							</p>
							<p>
								<i class="checkbox-common"><input type="checkbox" value="478"></i>
								<span>商品评价</span>
							</p>
							<p>
								<i class="checkbox-common"><input type="checkbox" value="139"></i>
								<span>相册管理</span>
							</p>
						</div>
					</li>
					<li>
						<h4>订单</h4>
						<div>
							<p>
								<i class="checkbox-common"><input type="checkbox" value="185"></i>
								<span>订单列表</span>
							</p>
							<p>
								<i class="checkbox-common"><input type="checkbox" value="11039"></i>
								<span>虚拟订单</span>
							</p>
							<p>
								<i class="checkbox-common"><input type="checkbox" value="11045"></i>
								<span>拼团订单</span>
							</p>
							<p>
								<i class="checkbox-common"><input type="checkbox" value="11089"></i>
								<span>预售订单</span>
							</p>
							<p>
								<i class="checkbox-common"><input type="checkbox" value="11102"></i>
								<span>砍价订单</span>
							</p>
							<p>
								<i class="checkbox-common"><input type="checkbox" value="11079"></i>
								<span>发票管理</span>
							</p>
							<p>
								<i class="checkbox-common"><input type="checkbox" value="11085"></i>
								<span>售后服务</span>
							</p>
						</div>
					</li>
					<li>
						<h4>营销</h4>
						<div>
							<p>
								<i class="checkbox-common"><input type="checkbox" value="180"></i>
								<span>优惠券</span>
							</p>
							<p>
								<i class="checkbox-common"><input type="checkbox" value="446"></i>
								<span>积分管理</span>
							</p>
							<p>
								<i class="checkbox-common"><input type="checkbox" value="195"></i>
								<span>赠品</span>
							</p>
							<p>
								<i class="checkbox-common"><input type="checkbox" value="198"></i>
								<span>满减送</span>
							</p>
							<p>
								<i class="checkbox-common"><input type="checkbox" value="11098"></i>
								<span>砍价活动</span>
							</p>
							<p>
								<i class="checkbox-common"><input type="checkbox" value="201"></i>
								<span>限时折扣</span>
							</p>
							<p>
								<i class="checkbox-common"><input type="checkbox" value="11041"></i>
								<span>组合套餐</span>
							</p>
							<p>
								<i class="checkbox-common"><input type="checkbox" value="469"></i>
								<span>满额包邮</span>
							</p>
							<p>
								<i class="checkbox-common"><input type="checkbox" value="11057"></i>
								<span>奖励规则</span>
							</p>
							<p>
								<i class="checkbox-common"><input type="checkbox" value="11061"></i>
								<span>互动游戏</span>
							</p>
							<p>
								<i class="checkbox-common"><input type="checkbox" value="11068"></i>
								<span>团购</span>
							</p>
							<p>
								<i class="checkbox-common"><input type="checkbox" value="11043"></i>
								<span>拼团</span>
							</p>
							<p>
								<i class="checkbox-common"><input type="checkbox" value="11090"></i>
								<span>专题活动</span>
							</p>
						</div>
					</li>
					<li>
						<h4>会员</h4>
						<div>
							<p>
								<i class="checkbox-common"><input type="checkbox" value="145"></i>
								<span>会员列表</span>
							</p>
							<p>
								<i class="checkbox-common"><input type="checkbox" value="488"></i>
								<span>会员等级</span>
							</p>
							<p>
								<i class="checkbox-common"><input type="checkbox" value="504"></i>
								<span>会员提现</span>
							</p>
							<p>
								<i class="checkbox-common"><input type="checkbox" value="509"></i>
								<span>积分管理</span>
							</p>
							<p>
								<i class="checkbox-common"><input type="checkbox" value="510"></i>
								<span>余额管理</span>
							</p>
						</div>
					</li>
					<li>
						<h4>数据</h4>
						<div>
							<p>
								<i class="checkbox-common"><input type="checkbox" value="459"></i>
								<span>销售概况</span>
							</p>
							<p>
								<i class="checkbox-common"><input type="checkbox" value="463"></i>
								<span>商品分析</span>
							</p>
							<p>
								<i class="checkbox-common"><input type="checkbox" value="461"></i>
								<span>同行热卖</span>
							</p>
							<p>
								<i class="checkbox-common"><input type="checkbox" value="462"></i>
								<span>运营报告</span>
							</p>
							<p>
								<i class="checkbox-common"><input type="checkbox" value="403"></i>
								<span>销售排行</span>
							</p>
						</div>
					</li>
					<li>
						<h4>微信</h4>
						<div>
							<p>
								<i class="checkbox-common"><input type="checkbox" value="11071"></i>
								<span>微信小程序管理</span>
							</p>
							<p>
								<i class="checkbox-common"><input type="checkbox" value="336"></i>
								<span>公众号管理</span>
							</p>
							<p>
								<i class="checkbox-common"><input type="checkbox" value="339"></i>
								<span>微信菜单管理</span>
							</p>
							<p>
								<i class="checkbox-common"><input type="checkbox" value="340"></i>
								<span>推广二维码管理</span>
							</p>
							<p>
								<i class="checkbox-common"><input type="checkbox" value="341"></i>
								<span>回复设置</span>
							</p>
							<p>
								<i class="checkbox-common"><input type="checkbox" value="342"></i>
								<span>消息素材管理</span>
							</p>
							<p>
								<i class="checkbox-common"><input type="checkbox" value="343"></i>
								<span>分享内容设置</span>
							</p>
							<p>
								<i class="checkbox-common"><input type="checkbox" value="11105"></i>
								<span>模板消息设置</span>
							</p>
							<p>
								<i class="checkbox-common"><input type="checkbox" value="447"></i>
								<span>粉丝列表</span>
							</p>
							<p>
								<i class="checkbox-common"><input type="checkbox" value="11058"></i>
								<span>一键关注设置</span>
							</p>
							<p>
								<i class="checkbox-common"><input type="checkbox" value="11082"></i>
								<span>客服管理</span>
							</p>
						</div>
					</li>
					<li>
						<h4>网站</h4>
						<div>
							<p>
								<i class="checkbox-common"><input type="checkbox" value="445"></i>
								<span>首页公告</span>
							</p>
							<p>
								<i class="checkbox-common"><input type="checkbox" value="427"></i>
								<span>导航管理</span>
							</p>
							<p>
								<i class="checkbox-common"><input type="checkbox" value="11023"></i>
								<span>商品楼层</span>
							</p>
							<p>
								<i class="checkbox-common"><input type="checkbox" value="10007"></i>
								<span>店铺装修</span>
							</p>
							<p>
								<i class="checkbox-common"><input type="checkbox" value="10008"></i>
								<span>搜索</span>
							</p>
							<p>
								<i class="checkbox-common"><input type="checkbox" value="381"></i>
								<span>广告管理</span>
							</p>
							<p>
								<i class="checkbox-common"><input type="checkbox" value="431"></i>
								<span>文章管理</span>
							</p>
							<p>
								<i class="checkbox-common"><input type="checkbox" value="491"></i>
								<span>专题列表</span>
							</p>
							<p>
								<i class="checkbox-common"><input type="checkbox" value="530"></i>
								<span>站点帮助</span>
							</p>
							<p>
								<i class="checkbox-common"><input type="checkbox" value="430"></i>
								<span>友情链接</span>
							</p>
						</div>
					</li>
					<li>
						<h4>设置</h4>
						<div>
							<p>
								<i class="checkbox-common"><input type="checkbox" value="528"></i>
								<span>基础设置</span>
							</p>
							<p>
								<i class="checkbox-common"><input type="checkbox" value="11050"></i>
								<span>交易设置</span>
							</p>
							<p>
								<i class="checkbox-common"><input type="checkbox" value="529"></i>
								<span>配送管理</span>
							</p>
							<p>
								<i class="checkbox-common"><input type="checkbox" value="11026"></i>
								<span>数据库管理</span>
							</p>
							<p>
								<i class="checkbox-common"><input type="checkbox" value="126"></i>
								<span>管理员列表</span>
							</p>
							<p>
								<i class="checkbox-common"><input type="checkbox" value="11094"></i>
								<span>核销设置</span>
							</p>
						</div>
					</li>
					<li>
						<h4>系统</h4>
						<div>
							<p>
								<i class="checkbox-common"><input type="checkbox" value="524"></i>
								<span>在线更新</span>
							</p>
							<p>
								<i class="checkbox-common"><input type="checkbox" value="10010"></i>
								<span>授权信息</span>
							</p>
							<p>
								<i class="checkbox-common"><input type="checkbox" value="11009"></i>
								<span>插件管理</span>
							</p>
							<p>
								<i class="checkbox-common"><input type="checkbox" value="11010"></i>
								<span>钩子管理</span>
							</p>
						</div>
					</li>
				</ul>
			</div>
			<div class="modal-footer">
				<button class="btn-common btn-big" onclick="set_shortcut_menu()">保存</button>
				<button class="btn-common-cancle btn-big" data-dismiss="modal" aria-hidden="true">关闭</button>
			</div>
		</div>
	
	</aside>
</template>

<script>
	export default {
		name: "Sidebar",
		methods: {
			/**
			 * 打开设置快捷菜单弹框
			 */
			show_shortcut_menu() {
				$("#set_shortcut_menu")
					.css("margin-left", "-601px")
					.modal("show");
            }
		},
		props: {
			menuList: Array,
			isIndex: Boolean
		}
	};
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped lang="scss">
	
</style>
