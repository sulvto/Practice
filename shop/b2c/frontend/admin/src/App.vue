<template>
    <div id="app">
        <!-- <article class="ns-base-article">
                                        <Nav/>
                                        <router-view/>
                                    </article> -->

        <el-container>
            <el-header style="background-color: #545c64;">
                <el-row :gutter="20">
                    <el-col :span="4">
                        <div class="ns-logo" onclick="location.href='http://showfx.niuteam.cn/admin.html';"></div>
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
                                        <a href="http://showfx.niuteam.cn/admin/tuangou/pintuanlist.html">拼团</a>
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
                                <i class="fa fa-search" title="搜索"></i>
                                <span>搜索</span>
                                <div class="mask-layer-search" style="display: none;">
                                    <input type="text" id="search_goods" placeholder="搜索">
                                    <a href="javascript:search();"><img src="@/assets/img/enter.png"></a>
                                </div>
                            </div>
                        </div>
                    </el-col>
                    <el-col :span="16">
                        <el-menu
                          background-color="#545c64"
                          text-color="#fff"
                          active-text-color="#ffd04b" :default-active="verticalMenu.path" mode="horizontal" @select="handleSelect" :router='true'>
                            <el-menu-item v-for="item in menuList" :key="item.path" :index='item.path'>{{item.name}}</el-menu-item>
                        </el-menu>
                    </el-col>
                    <el-col :span="4">
                        <div class="grid-content bg-purple"></div>
                    </el-col>
                </el-row>
            </el-header>
            <el-container>
                <el-aside width="200px">
                    <el-menu :default-active="activeVerticalMenuItem" @open="handleOpen" @close="handleClose" :router='true'>
                        <el-submenu index="1">
                            <template slot="title">
                                        <i class="el-icon-menu"></i>
                                        <span>{{verticalMenu.name}}</span>
</template>
                            <el-menu-item-group >
                                <el-menu-item v-for="item in verticalMenu.children" :key="item.path" :index="item.path">{{item.name}}</el-menu-item>
                            </el-menu-item-group>

                        </el-submenu>
                        <el-menu-item index="2" v-show="verticalMenu.isHome">
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
                            width="400"
                            trigger="click" style="float:right">
                                <div>
                                    <h4>功能提示</h4>
                                    <p>建议您在更新前，备份相关的程序及数据信息，以免更新失败给您造成不必要的损失。</p>
                                </div> <div>
                                    <h4>功能提示2</h4>
                                    <p>建议您在更新前，备份相关的程序及数据信息，以免更新失败给您造成不必要的损失。</p>
                                </div>
                                <el-button type="text" size="mini" icon="el-icon-question" slot="reference" plain round>提示</el-button>
                            </el-popover>

                        </el-col>
                      </el-row>

<br/>

                    <router-view/>
                </el-main>
            </el-container>
        </el-container>
    </div>
</template>

<script>
export default {
  name: 'app',
  watch: {
    $route: {
      handler (val, oldVal) {
        console.log('watch route', this.$route)
        this.setBreadcrumb(val)
      },
      // 深度观察监听
      deep: true
    }
  },
  computed: {
    activeVerticalMenuItem () {
      var result = null
      if (this.verticalMenu.children.length > 0) {
        var verticalMenuroute = this.$route.matched.find(route =>
          this.verticalMenu.children.find(child => child.name === route.name)
        )
        if (verticalMenuroute) {
          result = verticalMenuroute.path
        }
      }

      console.log('activeVerticalMenuItem', result, this.$route)
      return result
    }
  },
  methods: {
    handleSelect (path) {
      this.verticalMenu = this.menuList.find(item => item.path === path)
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
    }
  },
  data () {
    return {
      verticalMenu: {},
      breadcrumb: [],
      menuList: [
        {
          name: '首页',
          path: '/index.html',
          isHome: true,
          children: [
            {
              selected: true,
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
          path: '/goods/list.html',
          children: [
            {
              selected: true,
              path: '/goods/list.html',
              name: '商品列表'
            },
            {
              path: '/goods/add.html',
              name: '商品发布'
            },
            {
              path: '/goods/categorylist.html',
              name: '商品分类'
            },
            {
              path: '/goods/brandlist.html',
              name: '商品品牌'
            },
            {
              path: '/goods/labellist.html',
              name: '商品标签'
            },
            {
              path: '/goods/speclist.html',
              name: '商品规格'
            },
            {
              path: '/goods/supplierlist.html',
              name: '供货商'
            },
            {
              path: '/goods/attributelist.html',
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
        },
        {
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
        },
        {
          name: '营销',
          path: '/promotion/coupontypelist.html',
          children: [
            {
              selected: true,
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
        },
        {
          name: '会员',
          path: '/member/memberlist.html',
          children: [
            {
              selected: true,
              path: '/member/memberlist.html',
              name: '会员列表'
            },
            {
              path: '/member/memberlevellist.html',
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
        },
        {
          name: '数据',
          path: '/account/shopsalesaccount.html',
          children: [
            {
              selected: true,
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
        },
        {
          name: '微信',
          path: '/wchat/config.html',
          children: [
            {
              selected: true,
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
              path: '/member/weixinfanslist.html',
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
        },
        {
          name: '佣金',
          path: '/commission/userAccountList.html',
          children: [
            {
              selected: true,
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
        },
        {
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
        },
        {
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
        },
        {
          name: '设置',
          path: '/setting',
          children: [
            {
              selected: true,
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
        },
        {
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
    this.verticalMenu = this.menuList.find(
      item => item.name === this.$route.matched[0].name
    )
    this.setBreadcrumb(this.$route)
    console.log('created route', this.$route)
  }
}
</script>

<style lang="scss">
</style>
