<template>
	<header class="ns-base-header">
		<div class="ns-logo" @click="$router.push('/admin.html');"></div>
	
		<div class="ns-search">
			<div class="nav-menu js-nav">
				<img src="/static/blue/img/nav_menu.png" title="导航管理">
			</div>
			<div class="ns-navigation-management">
				<div class="ns-navigation-title">
					<h4>导航管理</h4>
					<span>x</span>
				</div>
				<div style="height:40px;"></div>
				<dl>
					<dt>首页</dt>
					<dd>
						<a href="/index.html">欢迎页</a>
					</dd>
				</dl>
				<dl>
					<dt>商品</dt>
					<dd>
						<a hrfe="/goodslist.html">商品列表</a> |
					</dd>
					<dd>
						<a href="http://b2c.niuteam.cn/admin/goods/addgoods.html">商品发布</a>
					</dd>
					<dd>
						<a href="http://b2c.niuteam.cn/admin/goods/goodscategorylist.html">商品分类</a>
					</dd>
					<dd>
						<a href="http://b2c.niuteam.cn/admin/goods/goodsbrandlist.html">商品品牌</a>
					</dd>
					<dd>
						<a href="http://b2c.niuteam.cn/admin/goods/goodsgrouplist.html">商品标签</a>
					</dd>
					<dd>
						<a href="http://b2c.niuteam.cn/admin/goods/goodsspeclist.html">商品规格</a>
					</dd>
					<dd>
						<a href="http://b2c.niuteam.cn/admin/member/supplierlist.html">供货商</a>
					</dd>
					<dd>
						<a href="http://b2c.niuteam.cn/admin/goods/attributelist.html">商品类型</a>
					</dd>
					<dd>
						<a href="http://b2c.niuteam.cn/admin/saleservice/consultlist.html">咨询管理</a>
					</dd>
					<dd>
						<a href="http://b2c.niuteam.cn/admin/goods/goodscomment.html">商品评价</a>
					</dd>
					<dd>
						<a href="http://b2c.niuteam.cn/admin/system/albumlist.html">相册管理</a>
					</dd>
				</dl>
				<dl>
					<dt>订单</dt>
					<dd>
						<a href="http://b2c.niuteam.cn/admin/order/orderlist.html">订单列表</a>
					</dd>
					<dd>
						<a href="http://b2c.niuteam.cn/admin/order/virtualorderlist.html">虚拟订单</a>
					</dd>
					<dd>
						<a href="http://b2c.niuteam.cn/admin/tuangou/pintuanOrderList.html">拼团订单</a>
					</dd>
					<dd>
						<a href="http://b2c.niuteam.cn/admin/orderpresell/orderPresellList.html">预售订单</a>
					</dd>
					<dd>
						<a href="http://b2c.niuteam.cn/admin/Order/bargainOrder.html">砍价订单</a>
					</dd>
					<dd>
						<a href="http://b2c.niuteam.cn/admin/order/invoiceList.html">发票管理</a>
					</dd>
					<dd>
						<a href="http://b2c.niuteam.cn/admin/Order/customerServiceList.html">售后服务</a>
					</dd>
				</dl>
				<dl>
					<dt>营销</dt>
					<dd>
						<a href="http://b2c.niuteam.cn/admin/promotion/coupontypelist.html">优惠券</a>
					</dd>
					<dd>
						<a href="http://b2c.niuteam.cn/admin/promotion/pointconfig.html">积分管理</a>
					</dd>
					<dd>
						<a href="http://b2c.niuteam.cn/admin/promotion/giftlist.html">赠品</a>
					</dd>
					<dd>
						<a href="http://b2c.niuteam.cn/admin/promotion/mansonglist.html">满减送</a>
					</dd>
					<dd>
						<a href="http://b2c.niuteam.cn/admin/Bargain/index.html">砍价活动</a>
					</dd>
					<dd>
						<a href="http://b2c.niuteam.cn/admin/promotion/getdiscountlist.html">限时折扣</a>
					</dd>
					<dd>
						<a href="http://b2c.niuteam.cn/admin/promotion/combopackagepromotionlist.html">组合套餐</a>
					</dd>
					<dd>
						<a href="http://b2c.niuteam.cn/admin/promotion/fullshipping.html">满额包邮</a>
					</dd>
					<dd>
						<a href="http://b2c.niuteam.cn/admin/promotion/integral.html">奖励规则</a>
					</dd>
					<dd>
						<a href="http://b2c.niuteam.cn/admin/Promotion/promotionGamesList.html">互动游戏</a>
					</dd>
					<dd>
						<a href="http://b2c.niuteam.cn/admin/Promotion/groupBuyList.html">团购</a>
					</dd>
					<dd>
						<a href="http://b2c.niuteam.cn/admin/tuangou/pintuanlist.html">拼团</a>
					</dd>
					<dd>
						<a href="http://b2c.niuteam.cn/admin/promotion/topiclist.html">专题活动</a>
					</dd>
				</dl>
				<dl>
					<dt>会员</dt>
					<dd>
						<a href="http://b2c.niuteam.cn/admin/member/memberlist.html">会员列表</a>
					</dd>
					<dd>
						<a href="http://b2c.niuteam.cn/admin/member/memberlevellist.html">会员等级</a>
					</dd>
					<dd>
						<a href="http://b2c.niuteam.cn/admin/member/usercommissionwithdrawlist.html">会员提现</a>
					</dd>
					<dd>
						<a href="http://b2c.niuteam.cn/admin/member/pointlist.html">积分管理</a>
					</dd>
					<dd>
						<a href="http://b2c.niuteam.cn/admin/member/accountlist.html">余额管理</a>
					</dd>
				</dl>
				<dl>
					<dt>数据</dt>
					<dd>
						<a href="http://b2c.niuteam.cn/admin/account/shopsalesaccount.html">销售概况</a>
					</dd>
					<dd>
						<a href="http://b2c.niuteam.cn/admin/account/shopgoodssaleslist.html">商品分析</a>
					</dd>
					<dd>
						<a href="http://b2c.niuteam.cn/admin/account/shopgoodsgroupsalecount.html">同行热卖</a>
					</dd>
					<dd>
						<a href="http://b2c.niuteam.cn/admin/account/shopreport.html">运营报告</a>
					</dd>
					<dd>
						<a href="http://b2c.niuteam.cn/admin/account/shopgoodssalesrank.html">销售排行</a>
					</dd>
				</dl>
				<dl>
					<dt>微信</dt>
					<dd>
						<a href="http://b2c.niuteam.cn/admin/wchat/appletConfig.html">微信小程序管理</a>
					</dd>
					<dd>
						<a href="http://b2c.niuteam.cn/admin/wchat/config.html">公众号管理</a>
					</dd>
					<dd>
						<a href="http://b2c.niuteam.cn/admin/wchat/menu.html">微信菜单管理</a>
					</dd>
					<dd>
						<a href="http://b2c.niuteam.cn/admin/wchat/weixinqrcodetemplate.html">推广二维码管理</a>
					</dd>
					<dd>
						<a href="http://b2c.niuteam.cn/admin/wchat/replayconfig.html">回复设置</a>
					</dd>
					<dd>
						<a href="http://b2c.niuteam.cn/admin/wchat/materialmessage.html">消息素材管理</a>
					</dd>
					<dd>
						<a href="http://b2c.niuteam.cn/admin/wchat/shareconfig.html">分享内容设置</a>
					</dd>
					<dd>
						<a href="http://b2c.niuteam.cn/admin/wchat/menu_wchat.html?addons=wxtemplatemsg">模板消息设置</a>
					</dd>
					<dd>
						<a href="http://b2c.niuteam.cn/admin/member/weixinfanslist.html">粉丝列表</a>
					</dd>
					<dd>
						<a href="http://b2c.niuteam.cn/admin/wchat/keyConcernConfig.html">一键关注设置</a>
					</dd>
					<dd>
						<a href="http://b2c.niuteam.cn/admin/Wchat/fansMessageManage.html">客服管理</a>
					</dd>
				</dl>
				<dl>
					<dt>网站</dt>
					<dd>
						<a href="http://b2c.niuteam.cn/admin/config/usernotice.html">首页公告</a>
					</dd>
					<dd>
						<a href="http://b2c.niuteam.cn/admin/config/shopnavigationlist.html">导航管理</a>
					</dd>
					<dd>
						<a href="http://b2c.niuteam.cn/admin/system/goodscategoryblock.html">商品楼层</a>
					</dd>
					<dd>
						<a href="http://b2c.niuteam.cn/admin/config/pctemplate.html">店铺装修</a>
					</dd>
					<dd>
						<a href="http://b2c.niuteam.cn/admin/config/searchconfig.html">搜索</a>
					</dd>
					<dd>
						<a href="http://b2c.niuteam.cn/admin/system/shopadvlist.html">广告管理</a>
					</dd>
					<dd>
						<a href="http://b2c.niuteam.cn/admin/cms/articlelist.html">文章管理</a>
					</dd>
					<dd>
						<a href="http://b2c.niuteam.cn/admin/cms/topiclist.html">专题列表</a>
					</dd>
					<dd>
						<a href="http://b2c.niuteam.cn/admin/config/helpdocument.html">站点帮助</a>
					</dd>
					<dd>
						<a href="http://b2c.niuteam.cn/admin/config/linklist.html">友情链接</a>
					</dd>
				</dl>
				<dl>
					<dt>设置</dt>
					<dd>
						<a href="http://b2c.niuteam.cn/admin/config/webconfig.html">基础设置</a>
					</dd>
					<dd>
						<a href="http://b2c.niuteam.cn/admin/config/shopset.html">交易设置</a>
					</dd>
					<dd>
						<a href="http://b2c.niuteam.cn/admin/express/expresscompany.html">配送管理</a>
					</dd>
					<dd>
						<a href="http://b2c.niuteam.cn/admin/dbdatabase/databaselist.html">数据库管理</a>
					</dd>
					<dd>
						<a href="http://b2c.niuteam.cn/admin/auth/userlist.html">管理员列表</a>
					</dd>
					<dd>
						<a href="http://b2c.niuteam.cn/admin/Verification/index.html">核销设置</a>
					</dd>
				</dl>
				<dl>
					<dt>系统</dt>
					<dd>
						<a href="http://b2c.niuteam.cn/admin/upgrade/onlineupdate.html">在线更新</a>
					</dd>
					<dd>
						<a href="http://b2c.niuteam.cn/admin/upgrade/devolutioninfo.html">授权信息</a>
					</dd>
					<dd>
						<a href="http://b2c.niuteam.cn/admin/extend/addonslist.html">插件管理</a>
					</dd>
					<dd>
						<a href="http://b2c.niuteam.cn/admin/extend/hookslist.html">钩子管理</a>
					</dd>
				</dl>
			</div>
			<div class="ns-search-block">
				<i class="fa fa-search" title="搜索"></i>
				<span>搜索</span>
				<div class="mask-layer-search">
					<input type="text" id="search_goods" placeholder="搜索">
					<a href="javascript:search();"><img src="/static/blue/img/enter.png"></a>
				</div>
			</div>
		</div>
	
		<nav>
			<ul>
				<li data-path="/index.html" class="selected" @click="go">
					<span>首页</span>
				</li>
	
				<li data-path="/goods/list.html" @click="go">
					<span>商品</span>
				</li>
				<li data-path='/order/orderlist.html' @click="go">
					<span>订单</span>
				</li>
				<li data-path='/promotion/coupontypelist.html' @click="go">
					<span>营销</span>
				</li>
				<li data-path='/member/memberlist.html' @click="go">
					<span>会员</span>
				</li>
				<li data-path='/account/shopsalesaccount.html' @click="go">
					<span>数据</span>
				</li>
				<li data-path='/wchat/config.html' @click="go">
					<span>微信</span>
				</li>
				<li data-path='/commission/userAccountList.html' @click="go">
					<span>佣金</span>
				</li>
				<li data-path='/config/usernotice.html' @click="go">
					<span>网站</span>
				</li>
				<li data-path='/distribution/promoterList.html' @click="go">
					<span>分销</span>
				</li>
				<li data-path='/config/webConfig.html' @click="go">
					<span>设置</span>
				</li>
				<li data-path='/upgrade/onlineupdate.html' @click="go">
					<span>系统</span>
				</li>
			</ul>
		</nav>
	
		<div class="ns-base-tool">
			<i class="i-home" title="前台首页"><a href="http://b2c.niuteam.cn" target="_blank"></a></i>
			<i class="i-close" title="退出登录"><a href="http://b2c.niuteam.cn/admin/login/logout.html"></a></i>
			<i class="ns-vertical-bar"></i>
	
			<div class="ns-help" @focus="showPCF=true" @blur="showPCF=true">
				<div class="logo">
					<img src="/upload/avator/19066be3c54be595a64df7138fde1a31_120_120.jpg">
				</div>
				<span>admin</span>
				<i class="fa fa-angle-down"></i>
				<ul v-show="showPCF">
					<li title="修改密码" onclick="delcache()">
						<img src="/static/blue/img/add_favorites.png">
						<a href="javascript:;">修改密码</a>
					</li>
					<li title="清理缓存" onclick="delcache()">
						<img src="/static/blue/img/clear_the_cache.png">
						<a href="javascript:;">清理缓存</a>
					</li>
					<li title="加入收藏" onclick="addFavorite()">
						<img src="/static/blue/img/add_favorites.png">
						<a href="javascript:;">加入收藏</a>
					</li>
				</ul>
			</div>
		</div>
	</header>
</template>
        
<script>
	export default {
		name: "Nav",
		props: {},
		watch: {
			$route: {
				handler: function(val, oldVal) {
					console.log(val);
				},
				// 深度观察监听
				deep: true
			}
		},
	
		data: function() {
			return {
				showPCF: false
			};
		},
	
		methods: {
			go(event) {
				var pathAttr = event.target.parentElement.getAttributeNode("data-path");
				if (pathAttr) {
					this.$router.push(pathAttr.value);
				}
			}
		}
	};
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped lang="scss">
	.ns-base-header {
		background: #393939;
		width: 100%;
		height: 50px;
		line-height: 50px;
		color: #ffffff;
		position: fixed;
		top: 0;
		z-index: 3000;
		border-left: 1px solid transparent;
		.ns-search {
			padding: 0 20px 0 0;
			height: 50px;
			position: relative;
			.nav-menu {
				cursor: pointer;
				padding: 0 20px;
				background: #4c4c4c;
				display: inline-block;
				vertical-align: top;
			}
			span {
				vertical-align: middle;
				cursor: pointer;
			}
		}
		nav {
			overflow: hidden;
			height: 50px;
			float: left;
			ul {
				overflow: hidden;
				li {
					float: left;
					width: 65px;
					height: 50px;
					text-align: center;
					cursor: pointer;
					transition: background 0.5s;
					-webkit-transition: background 0.5s;
					position: relative;
					line-height: 50px;
				}
				li:hover,
				li.selected {
					background: #126ae4;
				}
			}
		}
	}
	
	.ns-base-tool {
		position: absolute;
		right: 0;
		.ns-upgrade,
		.ns-clear,
		.ns-home,
		.ns-help {
			display: inline-block;
			height: 50px;
			cursor: pointer;
			position: relative;
			padding: 0 10px 0 5px;
		}
		>i[class*="i-"] {
			background: url(/static/blue/img/base_tool.png) no-repeat;
			display: inline-block;
			width: 20px;
			height: 20px;
			vertical-align: middle;
			margin: 0 10px 0 5px;
		}
		>i[class*="i-"]>a {
			display: block;
			height: 20px;
			line-height: 20px;
		}
		>i.i-home {
			background-position: 0 0;
		}
		>i.i-clear {
			background-position: -38.5px 0;
		}
		>i.i-close {
			background-position: -76px 0;
		}
		.ns-version-info {
			display: inline-block;
			padding-right: 10px;
		}
		.ns-help {
			padding: 0 10px;
			margin-right: 15px;
			.logo {
				float: left;
				width: 30px;
				img {
					vertical-align: middle;
					border-radius: 50%;
				}
			}
			>span {
				padding: 0 0 0 5px;
			}
			>i {
				padding: 0 0 0 5px;
			}
			>.fa-question-circle-o {
				font-size: 20px;
				vertical-align: middle;
			}
			ul {
				position: absolute;
				right: -10px;
				width: 220px;
				background: #ffffff;
				box-shadow: 0px 0px 10px #999;
				display: none;
				li {
					padding: 10px;
					border-bottom: 1px solid #e1e1e1;
					text-indent: 10px;
					transition: background 0.3s;
					-webkit-transition: background 0.3s;
					img {
						margin-right: 10px;
					}
				}
				li:hover {
					background: #e4f3ff;
				}
			}
		}
	}
	
	.ns-base-tool .ns-upgrade img,
	.ns-base-tool .ns-clear img,
	.ns-home img {
		vertical-align: middle;
		margin-top: -3px;
	}
	
	.ns-navigation-management {
		position: absolute;
		z-index: 999;
		background: #ffffff;
		width: 800px;
		top: 50px;
		border: 1px solid #126ae4;
		color: #126ae4;
		overflow: auto;
		display: none;
		max-height: 600px;
		left: 0;
		dl {
			float: left;
			width: 138.5px;
			border: 1px solid #e5e5e5;
			border-top: 0;
			border-left: 0;
			padding: 10px;
			text-align: center;
			margin: 0;
			height: 250px;
			overflow-y: auto;
		}
		dd {
			padding: 3px 0;
			a {
				color: #333333;
			}
		}
	}
	
	.ns-navigation-title {
		line-height: 19px;
		padding: 10px 20px;
		height: 19px;
		position: fixed;
		top: 50px;
		background: #ffffff;
		width: 760px;
		border-bottom: 1px solid #e5e5e5;
		h4 {
			display: inline-block;
			margin: 0;
		}
		span {
			float: right;
			font-size: 20px;
			padding-right: 10px;
		}
	}
	
	.ns-navigation-management::-webkit-scrollbar,
	.ns-navigation-management dl::-webkit-scrollbar {
		width: 2px;
		height: 2px;
	}
	
	.ns-navigation-management::-webkit-scrollbar-track,
	.ns-navigation-management dl::-webkit-scrollbar-track {
		background-color: #f1f1f1;
	}
	
	.ns-navigation-management::-webkit-scrollbar-thumb,
	.ns-navigation-management dl::-webkit-scrollbar-thumb {
		background-color: #126ae4;
	}
	
	.ns-logo,
	.ns-base-header .ns-search {
		float: left;
	}
	
	.ns-logo {
		height: 50px;
		width: 139px;
		line-height: 50px;
		cursor: pointer;
		background: #393939 url(/static/bliu/img/top_logo.png) no-repeat;
		background-size: 65%;
		background-position: center;
	}
	
	.ns-search-block {
		display: inline-block;
		position: relative;
		height: 50px;
		padding: 0 15px;
		transition: background 0.5s;
		-webkit-transition: background 0.5s;
		cursor: pointer;
		i {
			vertical-align: middle;
		}
		.mask-layer-search {
			position: absolute;
			margin: -2px 0 0 0;
			left: 0;
			display: none;
			input {
				border-radius: 0;
				margin: 0;
				border: 2px solid #126ae4;
				outline: none;
				padding: 0 30px 0 10px;
				height: 34px;
				font-size: 12px;
				width: 206px;
				left: 0;
				display: block;
			}
			input::-webkit-input-placeholder {
				/* 	color: #ffffff; */
			}
			a {
				position: absolute;
				top: 0;
				right: 0;
				width: 12px;
				line-height: 36px;
				width: 10%;
				img {
					width: 12px;
				}
			}
		}
	}
	
	.ns-search-block:hover {
		background: #126ae4;
	}
</style>