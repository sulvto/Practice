<template>
    <div id="app">
        <!-- <article class="ns-base-article">
                                        <Nav/>
                                        <router-view/>
                                    </article> -->

            <div class="header">
              <div class="ns-logo" :style="'background: url(' + topLogoImage + ') no-repeat center; background-size: 80%;'" onclick="location.href='http://showfx.niuteam.cn/admin.html';"></div>
              <div class="ns-search">
                  <div class="nav-menu js-nav">
                      <img src="@/assets/img/nav_menu.png" title="导航管理">
                  </div>
                  <div class="ns-navigation-management" style="display: none;">
                      <div class="ns-navigation-title">
                          <h4>导航管理</h4>
                          <span>x</span>
                      </div>
                      <div style="height:40px;"></div>
                      <dl>
                          <dt>首页</dt>
                          <dd>
                              <a href="http://showfx.niuteam.cn/admin/index/index.html">欢迎页</a>
                          </dd>
                      </dl>
                      <dl>
                          <dt>商品</dt>
                          <dd>
                              <a href="http://showfx.niuteam.cn/admin/goods/goodslist.html">商品列表</a>
                          </dd>
                          <dd>
                              <a href="http://showfx.niuteam.cn/admin/goods/addgoods.html">商品发布</a>
                          </dd>
                          <dd>
                              <a href="http://showfx.niuteam.cn/admin/goods/goodscategorylist.html">商品分类</a>
                          </dd>
                          <dd>
                              <a href="http://showfx.niuteam.cn/admin/goods/goodsbrandlist.html">商品品牌</a>
                          </dd>
                          <dd>
                              <a href="http://showfx.niuteam.cn/admin/goods/goodsgrouplist.html">商品标签</a>
                          </dd>
                          <dd>
                              <a href="http://showfx.niuteam.cn/admin/goods/goodsspeclist.html">商品规格</a>
                          </dd>
                          <dd>
                              <a href="http://showfx.niuteam.cn/admin/member/supplierlist.html">供货商</a>
                          </dd>
                          <dd>
                              <a href="http://showfx.niuteam.cn/admin/goods/attributelist.html">商品类型</a>
                          </dd>
                          <dd>
                              <a href="http://showfx.niuteam.cn/admin/saleservice/consultlist.html">咨询管理</a>
                          </dd>
                          <dd>
                              <a href="http://showfx.niuteam.cn/admin/goods/goodscomment.html">商品评价</a>
                          </dd>
                          <dd>
                              <a href="http://showfx.niuteam.cn/admin/system/albumlist.html">相册管理</a>
                          </dd>
                      </dl>
                      <dl>
                          <dt>订单</dt>
                          <dd>
                              <a href="http://showfx.niuteam.cn/admin/order/orderlist.html">订单列表</a>
                          </dd>
                          <dd>
                              <a href="http://showfx.niuteam.cn/admin/order/virtualorderlist.html">虚拟订单</a>
                          </dd>
                          <dd>
                              <a href="http://showfx.niuteam.cn/admin/tuangou/pintuanOrderList.html">拼团订单</a>
                          </dd>
                          <dd>
                              <a href="http://showfx.niuteam.cn/admin/orderpresell/orderPresellList.html">预售订单</a>
                          </dd>
                          <dd>
                              <a href="http://showfx.niuteam.cn/admin/Order/bargainOrder.html">砍价订单</a>
                          </dd>
                          <dd>
                              <a href="http://showfx.niuteam.cn/admin/order/invoiceList.html">发票管理</a>
                          </dd>
                          <dd>
                              <a href="http://showfx.niuteam.cn/admin/Order/customerServiceList.html">售后服务</a>
                          </dd>
                      </dl>
                      <dl>
                          <dt>营销</dt>
                          <dd>
                              <a href="http://showfx.niuteam.cn/admin/promotion/coupontypelist.html">优惠券</a>
                          </dd>
                          <dd>
                              <a href="http://showfx.niuteam.cn/admin/promotion/pointconfig.html">积分管理</a>
                          </dd>
                          <dd>
                              <a href="http://showfx.niuteam.cn/admin/promotion/giftlist.html">赠品</a>
                          </dd>
                          <dd>
                              <a href="http://showfx.niuteam.cn/admin/promotion/mansonglist.html">满减送</a>
                          </dd>
                          <dd>
                              <a href="http://showfx.niuteam.cn/admin/Bargain/index.html">砍价活动</a>
                          </dd>
                          <dd>
                              <a href="http://showfx.niuteam.cn/admin/promotion/getdiscountlist.html">限时折扣</a>
                          </dd>
                          <dd>
                              <a href="http://showfx.niuteam.cn/admin/promotion/combopackagepromotionlist.html">组合套餐</a>
                          </dd>
                          <dd>
                              <a href="http://showfx.niuteam.cn/admin/promotion/fullshipping.html">满额包邮</a>
                          </dd>
                          <dd>
                              <a href="http://showfx.niuteam.cn/admin/promotion/integral.html">奖励规则</a>
                          </dd>
                          <dd>
                              <a href="http://showfx.niuteam.cn/admin/Promotion/promotionGamesList.html">互动游戏</a>
                          </dd>
                          <dd>
                              <a href="http://showfx.niuteam.cn/admin/Promotion/groupBuyList.html">团购</a>
                          </dd>
                          <dd>
                              <a href="http://showfx.niuteam.cn/admin/tuangou">拼团</a>
                          </dd>
                          <dd>
                              <a href="http://showfx.niuteam.cn/admin/promotion/topiclist.html">专题活动</a>
                          </dd>
                      </dl>
                      <dl>
                          <dt>会员</dt>
                          <dd>
                              <a href="http://showfx.niuteam.cn/admin/member/memberlist.html">会员列表</a>
                          </dd>
                          <dd>
                              <a href="http://showfx.niuteam.cn/admin/member/memberlevellist.html">会员等级</a>
                          </dd>
                          <dd>
                              <a href="http://showfx.niuteam.cn/admin/member/usercommissionwithdrawlist.html">会员提现</a>
                          </dd>
                          <dd>
                              <a href="http://showfx.niuteam.cn/admin/member/pointlist.html">积分管理</a>
                          </dd>
                          <dd>
                              <a href="http://showfx.niuteam.cn/admin/member/accountlist.html">余额管理</a>
                          </dd>
                      </dl>
                      <dl>
                          <dt>数据</dt>
                          <dd>
                              <a href="http://showfx.niuteam.cn/admin/account/shopsalesaccount.html">销售概况</a>
                          </dd>
                          <dd>
                              <a href="http://showfx.niuteam.cn/admin/account/shopgoodssaleslist.html">商品分析</a>
                          </dd>
                          <dd>
                              <a href="http://showfx.niuteam.cn/admin/account/shopgoodsgroupsalecount.html">同行热卖</a>
                          </dd>
                          <dd>
                              <a href="http://showfx.niuteam.cn/admin/account/shopreport.html">运营报告</a>
                          </dd>
                          <dd>
                              <a href="http://showfx.niuteam.cn/admin/account/shopgoodssalesrank.html">销售排行</a>
                          </dd>
                      </dl>
                      <dl>
                          <dt>微信</dt>
                          <dd>
                              <a href="http://showfx.niuteam.cn/admin/wchat/appletConfig.html">微信小程序管理</a>
                          </dd>
                          <dd>
                              <a href="http://showfx.niuteam.cn/admin/wchat/config.html">公众号管理</a>
                          </dd>
                          <dd>
                              <a href="http://showfx.niuteam.cn/admin/wchat/menu.html">微信菜单管理</a>
                          </dd>
                          <dd>
                              <a href="http://showfx.niuteam.cn/admin/wchat/weixinqrcodetemplate.html">推广二维码管理</a>
                          </dd>
                          <dd>
                              <a href="http://showfx.niuteam.cn/admin/wchat/replayconfig.html">回复设置</a>
                          </dd>
                          <dd>
                              <a href="http://showfx.niuteam.cn/admin/wchat/materialmessage.html">消息素材管理</a>
                          </dd>
                          <dd>
                              <a href="http://showfx.niuteam.cn/admin/wchat/shareconfig.html">分享内容设置</a>
                          </dd>
                          <dd>
                              <a href="http://showfx.niuteam.cn/admin/wchat/menu_wchat.html?addons=wxtemplatemsg">模板消息设置</a>
                          </dd>
                          <dd>
                              <a href="http://showfx.niuteam.cn/admin/member/weixinfanslist.html">粉丝列表</a>
                          </dd>
                          <dd>
                              <a href="http://showfx.niuteam.cn/admin/wchat/keyConcernConfig.html">一键关注设置</a>
                          </dd>
                          <dd>
                              <a href="http://showfx.niuteam.cn/admin/Wchat/fansMessageManage.html">客服管理</a>
                          </dd>
                      </dl>
                      <dl>
                          <dt>佣金</dt>
                          <dd>
                              <a href="http://showfx.niuteam.cn/admin/Commission/userAccountList.html">推广员佣金</a>
                          </dd>
                          <dd>
                              <a href="http://showfx.niuteam.cn/admin/Commission/commissionDistributionList.html">三级分销</a>
                          </dd>
                          <dd>
                              <a href="http://showfx.niuteam.cn/admin/Commission/commissionPartnerList.html">股东分红</a>
                          </dd>
                          <dd>
                              <a href="http://showfx.niuteam.cn/admin/Commission/commissionRegionAgentList.html">区域代理</a>
                          </dd>
                          <dd>
                              <a href="http://showfx.niuteam.cn/admin/Commission/commissionPartnerGlobalList.html">全球分红</a>
                          </dd>
                          <dd>
                              <a href="http://showfx.niuteam.cn/admin/Commission/userCommissionWithdrawList.html">会员提现</a>
                          </dd>
                      </dl>
                      <dl>
                          <dt>网站</dt>
                          <dd>
                              <a href="http://showfx.niuteam.cn/admin/config/usernotice.html">首页公告</a>
                          </dd>
                          <dd>
                              <a href="http://showfx.niuteam.cn/admin/config/shopnavigationlist.html">导航管理</a>
                          </dd>
                          <dd>
                              <a href="http://showfx.niuteam.cn/admin/system/goodscategoryblock.html">商品楼层</a>
                          </dd>
                          <dd>
                              <a href="http://showfx.niuteam.cn/admin/config/pctemplate.html">店铺装修</a>
                          </dd>
                          <dd>
                              <a href="http://showfx.niuteam.cn/admin/config/searchconfig.html">搜索</a>
                          </dd>
                          <dd>
                              <a href="http://showfx.niuteam.cn/admin/system/shopadvlist.html">广告管理</a>
                          </dd>
                          <dd>
                              <a href="http://showfx.niuteam.cn/admin/cms/articlelist.html">文章管理</a>
                          </dd>
                          <dd>
                              <a href="http://showfx.niuteam.cn/admin/cms/topiclist.html">专题列表</a>
                          </dd>
                          <dd>
                              <a href="http://showfx.niuteam.cn/admin/config/helpdocument.html">站点帮助</a>
                          </dd>
                          <dd>
                              <a href="http://showfx.niuteam.cn/admin/config/linklist.html">友情链接</a>
                          </dd>
                      </dl>
                      <dl>
                          <dt>分销</dt>
                          <dd>
                              <a href="http://showfx.niuteam.cn/admin/Distribution/promoterList.html">推广员管理</a>
                          </dd>
                          <dd>
                              <a href="http://showfx.niuteam.cn/admin/Distribution/goodsCommissionRateList.html">商品分销</a>
                          </dd>
                          <dd>
                              <a href="http://showfx.niuteam.cn/admin/Distribution/threeLevelDistributionConfig.html">三级分销</a>
                          </dd>
                          <dd>
                              <a href="http://showfx.niuteam.cn/admin/Distribution/regionalAgent.html">区域代理</a>
                          </dd>
                          <dd>
                              <a href="http://showfx.niuteam.cn/admin/Distribution/shareholderDividendsConfig.html">股东分红</a>
                          </dd>
                          <dd>
                              <a href="http://showfx.niuteam.cn/admin/Distribution/globalBonusPoolConfig.html">全球分红</a>
                          </dd>
                      </dl>
                      <dl>
                          <dt>设置</dt>
                          <dd>
                              <a href="http://showfx.niuteam.cn/admin/config/webconfig.html">基础设置</a>
                          </dd>
                          <dd>
                              <a href="http://showfx.niuteam.cn/admin/config/shopset.html">交易设置</a>
                          </dd>
                          <dd>
                              <a href="http://showfx.niuteam.cn/admin/express/expresscompany.html">配送管理</a>
                          </dd>
                          <dd>
                              <a href="http://showfx.niuteam.cn/admin/dbdatabase/databaselist.html">数据库管理</a>
                          </dd>
                          <dd>
                              <a href="http://showfx.niuteam.cn/admin/auth/userlist.html">管理员列表</a>
                          </dd>
                          <dd>
                              <a href="http://showfx.niuteam.cn/admin/Verification/index.html">核销设置</a>
                          </dd>
                      </dl>
                      <dl>
                          <dt>系统</dt>
                          <dd>
                              <a href="http://showfx.niuteam.cn/admin/upgrade/onlineupdate.html">在线更新</a>
                          </dd>
                          <dd>
                              <a href="http://showfx.niuteam.cn/admin/upgrade/devolutioninfo.html">授权信息</a>
                          </dd>
                          <dd>
                              <a href="http://showfx.niuteam.cn/admin/extend/addonslist.html">插件管理</a>
                          </dd>
                          <dd>
                              <a href="http://showfx.niuteam.cn/admin/extend/hookslist.html">钩子管理</a>
                          </dd>
                      </dl>
                  </div>
                  <div class="ns-search-block">
                      <i class="el-icon-search" title="搜索"></i>
                      <span>搜索</span>
                      <div class="mask-layer-search" style="display: none;">
                          <input type="text" id="search_goods" placeholder="搜索">
                          <a href="javascript:search();"><img src="@/assets/img/enter.png"></a>
                      </div>
                  </div>
              </div>
              <el-menu class="nav"
                background-color="#393939"
                text-color="#fff"
                active-text-color="#ffd04b" :default-active="verticalMenu.path" mode="horizontal" @select="handleSelect" :router='true'>
                  <el-menu-item v-for="item in menuList" :key="item.path" :index='item.path'>{{item.name}}</el-menu-item>
              </el-menu>
              <div class="ns-base-tool">
              <i class="i-home" :style="'background: url(' + baseToolImage + ') no-repeat'" title="前台首页">
                <a href="http://showfx.niuteam.cn" target="_blank"></a>
              </i>
              <i class="i-close" :style="'background: url(' + baseToolImage + ') no-repeat -76px 0'" title="退出登录"><a href="http://showfx.niuteam.cn/admin/login/logout.html"></a></i>
              <i class="ns-vertical-bar"></i>
              <div class="ns-help" @mouseover="showUCA = true" @mouseout="showUCA = false">
                <div class="logo">
                  <img src="@/assets/img/user_admin_blue.png" width="30">
                </div>
                <span>admin</span>
                <i class="el-icon-arrow-down"></i>
                <ul v-show="showUCA">
                  <li title="修改密码">
                    <img src="@/assets/img/add_favorites.png">
                    <el-button type="text">修改密码</el-button>
                  </li>
                  <li title="清理缓存" onclick="delcache()">
                    <img src="@/assets/img/clear_the_cache.png">
                    <el-button type="text">清理缓存</el-button>
                  </li>
                  <li title="加入收藏" onclick="addFavorite()">
                    <img src="@/assets/img/add_favorites.png">
                    <el-button type="text">加入收藏</el-button>
                  </li>
                </ul>
              </div>
            </div>
            </div>
            <el-container>
                <el-aside class="aside-fixed-top" width="200px" :style="'overflow-x: hidden; max-height: ' + (maxAsideHeight) + 'px;background-color: rgb(238, 241, 246)'">
                    <el-menu
                      :default-active="activeVerticalMenuItem"
                      @open="handleOpen"
                      @close="handleClose"
                      :router='true'>

                        <el-submenu index="1" >
                            <template slot="title">
                                        <i class="el-icon-menu"></i>
                                        <span>{{verticalMenu.name}}</span>
                            </template>
                            <el-menu-item-group>
                              <el-menu-item v-for="item in verticalMenu.children" :key="item.path" :index="item.path">{{item.name}}</el-menu-item>
                            </el-menu-item-group>
                        </el-submenu>

                        <el-menu-item index="1" v-show="verticalMenu.isHome">
                            <i class="el-icon-circle-plus"></i>
                            <span slot="title">常用功能</span>
                        </el-menu-item>

                    </el-menu>
                </el-aside>
                <el-main>
                      <el-row :gutter="20">
                        <el-col :span="12">
                            <el-breadcrumb separator-class="el-icon-arrow-right">
                                <el-breadcrumb-item v-for="item in breadcrumb" :key="item.path" :to="item">{{item.name}}</el-breadcrumb-item>
                            </el-breadcrumb>
                        </el-col>
                        <el-col :span="12">
                            <el-popover
                              placement="right"
                              trigger="click"
                              width="400"
                              style="float:right">
                                <div>
                                    <h4>功能提示</h4>
                                    <div class="function-prompts" v-html="functionPrompts"></div>
                                    <h4>操作提示</h4>
                                    <div class="operation-prompts"  v-html="operationPrompts"></div>
                                </div>
                                <el-button type="text" size="mini" icon="el-icon-question" slot="reference" plain round>提示</el-button>
                            </el-popover>

                        </el-col>
                      </el-row>

<br/>

                    <router-view/>
                </el-main>
            </el-container>
    </div>
</template>

<script>
import topLogoImage from '@/assets/img/top_logo.png'
import baseToolImage from '@/assets/img/base_tool.png'

export default {
  name: 'app',
  watch: {
    $route: {
      handler (val, oldVal) {
        console.log('watch route', this.$route)
        this.switchRoute(val)
      },
      // 深度观察监听
      deep: true
    }
  },
  computed: {
    maxAsideHeight () {
      return window.innerHeight - 60
    },

    activeVerticalMenuItem () {
      let result = null
      if (this.verticalMenu.children && this.verticalMenu.children.length > 0) {
        var verticalMenuroute =
          this.$route.matched.find(route => this.verticalMenu.children.find(child => child.path === route.path)) ||
          this.$route.matched.find(route => this.verticalMenu.children.find(child => child.name === route.name))

        if (verticalMenuroute) {
          result = verticalMenuroute.path
        }
      }

      if (!result) {
        console.warn('没找到路由对应的左侧菜单.', this.$route.matched)
      }

      console.log('activeVerticalMenuItem', result, this.$route)
      return result
    },
    menuList () {
      return this.menuData.filter(menuItem => !menuItem.onlyAside)
    }

  },
  methods: {
    handleSelect (path) {
      this.verticalMenu = this.menuData.find(item => item.path === path)
    },
    handleOpen () {
      console.log('handleOpen')
    },
    handleClose () {
      console.log('handleClose')
    },
    open4 () {
      this.$alert('<strong>这是 <i>HTML</i> 片段</strong>', 'HTML 片段', {
        dangerouslyUseHTMLString: true
      })
    },
    setBreadcrumb (route) {
      this.breadcrumb = [
        {
          name: '首页',
          path: '/index.html'
        }
      ]
      if (route.matched.length > 1) {
        route.matched.forEach(item => this.breadcrumb.push(item))
      }
    },
    switchRoute (route) {
      this.setBreadcrumb(route)
      this.functionPrompts = route.meta.functionPrompts
      this.operationPrompts = route.meta.operationPrompts
    }
  },
  data () {
    return {
      showUCA: false,
      operationPrompts: '',
      functionPrompts: '',
      baseToolImage: baseToolImage,
      topLogoImage: topLogoImage,
      verticalMenu: {},
      breadcrumb: [],
      menuData: [
        {
          name: '首页',
          path: '/index.html',
          isHome: true,
          children: [
            {
              path: '/index.html',
              name: '欢迎页'
            },
            {
              path: '/goods/add.html',
              name: '商品发布'
            },
            {
              path: '/goods/list.html',
              name: '商品列表'
            },
            {
              path: '/order/list.html',
              name: '订单列表'
            },
            {
              path: '/goods/comment.html',
              name: '商品评价'
            }
          ]
        },
        {
          name: '商品',
          path: '/goods',
          children: [
            {
              path: '/goods/list.html',
              name: '商品列表'
            },
            {
              path: '/goods/edit.html',
              name: '商品发布'
            },
            {
              path: '/goods/category',
              name: '商品分类'
            },
            {
              path: '/goods/brand/list.html',
              name: '商品品牌'
            },
            {
              path: '/goods/label/list.html',
              name: '商品标签'
            },
            {
              path: '/goods/spec/list.html',
              name: '商品规格'
            },
            {
              path: '/goods/supplier/list.html',
              name: '供货商'
            },
            {
              path: '/goods/attribute/list.html',
              name: '商品类型'
            },
            {
              path: '/goods/consult.html',
              name: '咨询管理'
            },
            {
              path: '/goods/comment.html',
              name: '商品评价'
            },
            {
              path: '/goods/albumlist.html',
              name: '相册管理'
            }
          ]
        }, {
          name: '订单',
          path: '/order/orderlist.html',
          children: [
            {
              selected: true,
              path: '/order/orderlist.html',
              name: '订单列表'
            },
            {
              path: '/order/virtualorder.html',
              name: '虚拟订单'
            },
            {
              path: '/tuangou/pintuanorderlist.html',
              name: '拼团订单'
            },
            {
              path: '/orderpresell/list.html',
              name: '预售订单'
            },
            {
              path: '/order/bargainorder.html',
              name: '砍价订单'
            },
            {
              path: '/order/invoicelist.html',
              name: '发票管理'
            },
            {
              path: '/order/customerservicelist.html',
              name: '售后服务'
            }
          ]
        }, {
          name: '营销',
          path: '/promotion',
          children: [{
            path: '/promotion/coupon',
            name: '优惠券'
          }, {
            path: '/promotion/pointconfig.html',
            name: '积分管理'
          }, {
            path: '/promotion/gift',
            name: '赠品'
          }, {
            path: '/promotion/mansong',
            name: '满减送'
          }, {
            path: '/bargain',
            name: '砍价活动'
          }, {
            path: '/promotion/discount',
            name: '限时折扣'
          }, {
            path: '/promotion/combopackage/list.html',
            name: '组合套餐'
          }, {
            path: '/promotion/fullshipping.html',
            name: '满额包邮'
          }, {
            path: '/promotion/RewardRules.html',
            name: '奖励规则'
          }, {
            path: '/promotion/games/list.html',
            name: '互动游戏'
          }, {
            path: '/promotion/groupbuy',
            name: '团购'
          }, {
            path: '/tuangou',
            name: '拼团'
          }, {
            path: '/promotion/topic',
            name: '专题活动'
          }]
        }, {
          name: '会员',
          path: '/member',
          children: [
            {
              path: '/member/memberlist.html',
              name: '会员列表'
            },
            {
              path: '/member/level',
              name: '会员等级'
            },
            {
              path: '/member/usercommissionwithdrawlist.html',
              name: '会员提现'
            },
            {
              path: '/member/pointlist.html',
              name: '积分管理'
            },
            {
              path: '/member/accountlist.html',
              name: '余额管理'
            }
          ]
        }, {
          name: '数据',
          path: '/account',
          children: [
            {
              path: '/account/shopsalesaccount.html',
              name: '销售概况'
            },
            {
              path: '/account/shopgoodssaleslist.html',
              name: '商品分析'
            },
            {
              path: '/account/shopgoodsgroupsalecount.html',
              name: '同行热卖'
            },
            {
              path: '/account/shopreport.html',
              name: '运营报告'
            },
            {
              path: '/account/shopgoodssalesrank.html',
              name: '销售排行'
            }
          ]
        }, {
          name: '微信',
          path: '/wchat',
          children: [
            {
              path: '/wchat/appletconfig.html',
              name: '微信小程序管理'
            },
            {
              path: '/wchat/config.html',
              name: '公众号管理'
            },
            {
              path: '/wchat/menu.html',
              name: '微信菜单管理'
            },
            {
              path: '/wchat/weixinqrcodetemplate.html',
              name: '推广二维码管理'
            },
            {
              path: '/wchat/replayconfig.html',
              name: '回复设置'
            },
            {
              path: '/wchat/materialmessage.html',
              name: '消息素材管理'
            },
            {
              path: '/wchat/shareconfig.html',
              name: '分享内容设置'
            },
            {
              path: '/menu/addonmenu.html',
              name: '模板消息设置'
            },
            {
              path: '/wchat/weixinfanslist.html',
              name: '粉丝列表'
            },
            {
              path: '/wchat/keyconcernconfig.html',
              name: '一键关注设置'
            },
            {
              path: '/wchat/fansmessagemanage.html',
              name: '客服管理'
            }
          ]
        }, {
          name: '佣金',
          path: '/commission/userAccountList.html',
          children: [
            {
              path: '/commission/userAccountList.html',
              name: '推广员佣金'
            },
            {
              path: '/commission/distributionList.html',
              name: '三级分销'
            },
            {
              path: '/commission/partnerList.html',
              name: '股东分红'
            },
            {
              path: '/commission/regionAgentList.html',
              name: '区域代理'
            },
            {
              path: '/commission/partnerGlobalList.html',
              name: '全球分红'
            },
            {
              path: '/commission/userCommissionWithdrawList.html',
              name: '会员提现'
            }
          ]
        }, {
          name: '网站',
          path: '/config',
          children: [
            {
              path: '/config/homeNotice',
              name: '首页公告'
            },
            {
              path: '/config/shopNavigation',
              name: '导航管理'
            },
            {
              path: '/system/goodsCategoryBlock.html',
              name: '商品楼层'
            },
            {
              path: '/config/template',
              name: '店铺装修'
            },
            {
              path: '/config/searchConfig.html',
              name: '搜索'
            },
            {
              path: '/config/ads',
              name: '广告管理'
            },
            {
              path: '/config/article',
              name: '文章管理'
            },
            {
              path: '/config/topic',
              name: '专题列表'
            },
            {
              path: '/config/help',
              name: '站点帮助'
            },
            {
              path: '/config/link',
              name: '友情链接'
            }
          ]
        }, {
          name: '分销',
          path: '/distribution',
          children: [
            {
              path: '/distribution/promoter',
              name: '推广员管理'
            },
            {
              path: '/distribution/goodsCommissionRateList.html',
              name: '商品分销'
            },
            {
              path: '/distribution/threeLevelDistribution',
              name: '三级分销'
            },
            {
              path: '/distribution/regionalAgent',
              name: '区域代理'
            },
            {
              path: '/distribution/shareholderDividends',
              name: '股东分红'
            },
            {
              path: '/distribution/globalBonusPool',
              name: '全球分红'
            }
          ]
        }, {
          name: '设置',
          path: '/setting',
          children: [
            {
              path: '/setting/base',
              name: '基础设置'
            },
            {
              path: '/setting/transaction',
              name: '交易设置'
            },
            {
              path: '/setting/delivery',
              name: '配送管理'
            },
            {
              path: '/setting/database',
              name: '数据库管理'
            },
            {
              path: '/setting/auth',
              name: '管理员列表'
            },
            {
              path: '/setting/verification',
              name: '核销设置'
            }
          ]
        }, {
          name: '系统',
          path: '/upgrade/onlineupdate.html',
          children: [
            {
              path: '/upgrade/onlineupdate.html',
              name: '在线更新'
            },
            {
              path: '/upgrade/devolutioninfo.html',
              name: '授权信息'
            },
            {
              path: '/extend/addonslist.html',
              name: '插件管理'
            },
            {
              path: '/extend/hookslist.html',
              name: '钩子管理'
            }
          ]
        }
      ]
    }
  },

  components: {},

  created () {
    this.verticalMenu = this.menuData.find(
      item => item.path === this.$route.matched[0].path
    )
    this.switchRoute(this.$route)
    console.log('created, route', this.$route)
    console.log('created, verticalMenu', this.verticalMenu)
  }
}
</script>

<style lang="scss">
body {
  margin: 0px;
}
img {
  width: auto\9;
  height: auto;
  max-width: 100%;
  vertical-align: middle;
  border: 0;
  -ms-interpolation-mode: bicubic;
}
.header {
  background: #393939;
  width: 100%;
  height: 60px;
  line-height: 60px;
  color: #ffffff;
  position: fixed;
  top: 0;
  z-index: 1000;
  border-left: 1px solid transparent;

  .ns-logo, .ns-search {
    float: left;
  }
  .ns-logo {
    height: 60px;
    width: 139px;
    line-height: 60px;
    cursor: pointer;
  }
  .ns-search {
    padding: 0 20px 0 0;
    height: 60px;
    position: relative;
    .nav-menu {
      cursor: pointer;
      padding: 0 20px;
      background: #4C4C4C;
      display: inline-block;
      vertical-align: top;
    }
  }
  .ns-search-block {
    display: inline-block;
    position: relative;
    height: 60px;
    padding: 0 15px;
    transition: background 0.5s;
    -webkit-transition: background 0.5s;
    cursor: pointer;
  }
  .nav {
    overflow: hidden;
    float: left;
  }
  .ns-base-tool {
    position: absolute;
    right: 0;
    i[class*="i-"] {
      display: inline-block;
      width: 20px;
      height: 20px;
      vertical-align: middle;
      margin: 0 10px 0 5px;
      a {
        display: block;
        height: 20px;
        line-height: 20px;
      }
    }
    .ns-help  {
      display: inline-block;
      height: 60px;
      cursor: pointer;
      position: relative;
      padding: 0 10px;
      margin-right: 15px;
      .logo {
        float: left;
        width: 30px;
      }
      ul {
        margin: 0;
        padding: 0;
        list-style-type: none;
        position: absolute;
        right: -10px;
        width: 220px;
        background: #ffffff;
        box-shadow: 0px 0px 10px #999;
        li {
          line-height: 20px;
          padding: 10px;
          border-bottom: 1px solid #E1E1E1;
          text-indent: 10px;
          transition: background 0.3s;
          -webkit-transition: background 0.3s;
          img {
            margin-right: 10px;
          }
          &:hover {
            background: #E4F3FF;
          }
        }
      }
    }
  }
}

.ns-vertical-bar {
  border-left: 1px solid #ffffff;
  vertical-align: middle;
  display: inline-block;
  height: 20px;
  line-height: 20px;
  margin: 0 5px 0 0;
}

.aside-fixed-top {
  position: fixed;
  right: 0;
  left: 0;
  z-index: 530;
  margin-top: 60px;
}
.el-main {
  margin-top: 60px;
  margin-left: 200px;
}

/*滚动条整体部分*/
::-webkit-scrollbar {
  width: 7px;
  height: 7px;
  border-radius: 4px;
  background-color: #f0f0f000;
}

/*滚动条两端的箭头*/
::-webkit-scrollbar-button {
  display: none;
}
/*经测试好像并不能控制什么*/
::-webkit-scroll-track {
  display: none;
}
/*滚动条内侧部分 去掉*/
::-webkit-scrollbar-track-piece {
  display: none;
}
/*滚动条中可以拖动的那部分*/
::-webkit-scrollbar-thumb {
  background-color: hsla(220,4%,58%,.3);
  border-radius: 4px;
}
/*变角部分*/
::-webkit-scrollbar-corner {
  display: none;
}
::-webkit-resizer {
  display: none;
}

/*滚动条整体部分*/
aside::-webkit-scrollbar {
  display: none;
}

.disable-input-spinner-button {
  input::-webkit-outer-spin-button,
  input::-webkit-inner-spin-button {
    -webkit-appearance: none;
    appearance: none;
    margin: 0;
  }
}

.center-block {
  text-align: center
}

a {
  color: #126AE4;
  text-decoration: none;
  cursor: pointer;
  &:link, &:active {
    text-decoration: none;
    outline: none;
  }
}

.popover-checkbox-group {
  min-width: 80px;
  .el-checkbox+.el-checkbox {
    margin-left: 0px;
  }
}

.function-prompts {
  color: #666;
  margin: 0;
  font-size: 12px;
}

.operation-prompts {
  color: #666;
  margin: 0;
  font-size: 12px;
}
</style>
