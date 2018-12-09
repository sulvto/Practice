import Vue from 'vue'
import Router from 'vue-router'
import BaseRouter from '@/components/BaseRouter.vue'
import TabsRouter from '@/components/TabsRouter.vue'
import CardTabsRouter from '@/components/CardTabsRouter.vue'
import Index from '@/views/Index.vue'

import GoodsList from '@/views/goods/list.vue'
import GoodsEdit from '@/views/goods/publish.vue'
import GoodsCategoryList from '@/views/goods/category/list.vue'
import GoodsCategoryEdit from '@/views/goods/category/edit.vue'
import GoodsBrandList from '@/views/goods/brand/list.vue'
import GoodsBrandEdit from '@/views/goods/brand/edit.vue'
import GoodsLabelList from '@/views/goods/label/list.vue'
import GoodsLabelEdit from '@/views/goods/label/edit.vue'
import GoodsSpecList from '@/views/goods/spec/list.vue'
import GoodsSpecEdit from '@/views/goods/spec/edit.vue'
import SupplierList from '@/views/supplier/list.vue'
import SupplierEdit from '@/views/supplier/edit.vue'
import GoodsAttributeList from '@/views/goods/attribute/list.vue'
import GoodsAttributeEdit from '@/views/goods/attribute/edit.vue'
import GoodsComment from '@/views/goods/comment.vue'

import SystemAlbumList from '@/views/system/album/list.vue'
// import SystemAlbumPictureList from '@/views/system/album/picturelist.vue'
import SaleserviceConsult from '@/views/saleservice/consult.vue'

import Order from '@/views/order/Index.vue'
import OrderList from '@/views/order/orderList.vue'
import VirtualOrder from '@/views/order/virtualOrder.vue'
import BargainOrder from '@/views/order/bargainOrder.vue'
import OrderInvoiceList from '@/views/order/invoiceList.vue'
import OrderCustomerServiceList from '@/views/order/customerService/list.vue'
// import OrderCustomerServiceDetail from '@/views/order/customerService/detail.vue'

import TuangouList from '@/views/tuangou/tuangouList.vue'

import PintuanList from '@/views/tuangou/pintuanList.vue'
import PintuanOrderList from '@/views/tuangou/pintuanOrderList.vue'

import OrderPresellList from '@/views/orderPresell/list.vue'
// import OrderPresellDetail from '@/views/orderPresell/detail.vue'

import Promotion from '@/views/promotion/Index.vue'
import PromotionCouponTypeList from '@/views/promotion/coupon/list.vue'
import PromotionCouponTypeEdit from '@/views/promotion/coupon/edit.vue'
import PromotionCouponTypeGrantRecords from '@/views/promotion/coupon/grantRecordsList.vue'
import PromotionPointconfig from '@/views/promotion/pointconfig.vue'
import PromotionGiftList from '@/views/promotion/gift/list.vue'
import PromotionGiftEdit from '@/views/promotion/gift/edit.vue'
import PromotionGiftRecords from '@/views/promotion/gift/records.vue'
// import PromotionMansongList from '@/views/promotion/mansong/list.vue'
import PromotionMansongEdit from '@/views/promotion/mansong/Edit.vue'
import PromotionDiscountList from '@/views/promotion/discount/list.vue'
import PromotionDiscountEdit from '@/views/promotion/discount/edit.vue'
import PromotionCombopackageList from '@/views/promotion/combopackage/list.vue'
import PromotionCombopackageEdit from '@/views/promotion/combopackage/edit.vue'
import PromotionFullshipping from '@/views/promotion/fullshipping.vue'
import PromotionRewardRules from '@/views/promotion/RewardRules.vue'
import PromotionGamesList from '@/views/promotion/games/list.vue'
import PromotionGamesEdit from '@/views/promotion/games/edit.vue'
import PromotionGamesAccessRecords from '@/views/promotion/games/accessRecords.vue'
import PromotionGamesAwardList from '@/views/promotion/games/awardList.vue'
import PromotionGamesTypeList from '@/views/promotion/games/typeList.vue'
import PromotionGroupBuyList from '@/views/promotion/groupBuy/list.vue'
import PromotionGroupBuyEdit from '@/views/promotion/groupBuy/edit.vue'
// import PromotionGroupBuyEdit from '@/views/tuangou/pintuanlist.vue'
import PromotionTopicList from '@/views/promotion/topic/list.vue'
import PromotionTopicEdit from '@/views/promotion/topic/edit.vue'

import BargainList from '@/views/bargain/List.vue'
import BargainEdit from '@/views/bargain/edit.vue'
import BargainConfig from '@/views/bargain/config.vue'

import Member from '@/views/member/Index.vue'
import MemberList from '@/views/member/memberList.vue'
import MemberLevelList from '@/views/member/memberLevel/list.vue'
import MemberLevelEdit from '@/views/member/memberLevel/edit.vue'
import MemberAccountList from '@/views/member/accountList.vue'
import MemberPointList from '@/views/member/pointList.vue'
import MemberUserCommissionWithdrawList from '@/views/member/userCommissionWithdrawList.vue'

import Account from '@/views/account/Index.vue'
// import AccountShopSalesAccount from '@/views/account/shopSalesAccount.vue'
import AccountShopGoodsSalesList from '@/views/account/shopGoodsSalesList.vue'
import AccountShopGoodsGroupSaleCount from '@/views/account/shopGoodsGroupSaleCount.vue'
import AccountShopReport from '@/views/account/shopReport.vue'
import AccountShopGoodsSalesRank from '@/views/account/shopGoodsSalesRank.vue'

import Upgrade from '@/views/upgrade/Index.vue'
import UpgradeDevolutionInfo from '@/views/upgrade/devolutionInfo.vue'
import UpgradeOnlineUpdate from '@/views/upgrade/onlineUpdate.vue'

import ExtendAddonsList from '@/views/extend/addons/list.vue'
import ExtendHooksList from '@/views/extend/hooks/list.vue'
import ExtendHooksEdit from '@/views/extend/hooks/edit.vue'

import SystemModuleList from '@/views/system/module/list.vue'
import SystemModuleEdit from '@/views/system/module/edit.vue'

import WchatAppletConfig from '@/views/wchat/appletConfig.vue'
import WchatConfig from '@/views/wchat/config.vue'
// import WchatMenu from '@/views/wchat/menu.vue'
import WchatQrcodeTemplate from '@/views/wchat/weixinQrcodeTemplate.vue'
import WchatQrcode from '@/views/wchat/qrcode.vue'
import WchatReplayConfig from '@/views/wchat/replayConfig.vue'
import WchatEditKeywordReplay from '@/views/wchat/EditKeywordReplay.vue'
import WchatMaterialMessage from '@/views/wchat/materialMessage.vue'
import WchatAddMedia from '@/views/wchat/addmedia.vue'
// import WchatShareConfig from '@/views/wchat/shareConfig.vue'
import WchatKeyConcernConfig from '@/views/wchat/keyConcernConfig.vue'
import WchatFansMessageManage from '@/views/wchat/fansMessageManage.vue'
import WchatWeixinFansList from '@/views/wchat/weixinFansList.vue'

import MenuAddonMenu from '@/views/menu/addonMenu.vue'

import Commission from '@/views/commission/Index.vue'
import CommissionUserAccountList from '@/views/commission/userAccountList.vue'
import CommissionDistributionList from '@/views/commission/distributionList.vue'
import CommissionPartnerList from '@/views/commission/partnerList.vue'
import CommissionRegionAgentList from '@/views/commission/regionAgentList.vue'
import CommissionPartnerGlobalList from '@/views/commission/partnerGlobalList.vue'
import CommissionUserCommissionWithdrawList from '@/views/commission/userCommissionWithdrawList.vue'

import Config from '@/views/config/Index.vue'

import ConfigHomeNoticeList from '@/views/config/homeNotice/List.vue'
import ConfigHomeNoticeEdit from '@/views/config/homeNotice/Edit.vue'

import ConfigShopNavigationList from '@/views/config/shopNavigation/List.vue'
import ConfigShopNavigationEdit from '@/views/config/shopNavigation/Edit.vue'

// import ConfigTemplatePc from '@/views/config/template/Pc.vue'
// import ConfigTemplateFixed from '@/views/config/template/Fixed.vue'
// import ConfigTemplateWapCustomList from '@/views/config/template/wapCustom/List.vue'
import ConfigTemplateWapCustomEdit from '@/views/config/template/wapCustom/Edit.vue'

import ConfigSearchConfig from '@/views/config/searchConfig.vue'

import ConfigHelpDocumentList from '@/views/config/help/document/List.vue'
import ConfigHelpDocumentEdit from '@/views/config/help/document/Edit.vue'
import ConfigHelpClassList from '@/views/config/help/class/List.vue'
import ConfigHelpClassEdit from '@/views/config/help/class/Edit.vue'

import ConfigLinkList from '@/views/config/link/list.vue'
import ConfigLinkEdit from '@/views/config/link/edit.vue'

import ConfigAdsList from '@/views/config/ads/list.vue'
import ConfigAdsEdit from '@/views/config/ads/edit.vue'
import ConfigAdsPositionList from '@/views/config/ads/position/list.vue'
// import ConfigAdsPositionEdit from '@/views/config/ads/position/edit.vue'

import SystemGoodsCategoryBlock from '@/views/system/goodsCategoryBlock.vue'

import CmsArticleList from '@/views/cms/article/List.vue'
// import CmsArticleEdit from '@/views/cms/article/Edit.vue'
import CmsArticleClassList from '@/views/cms/article/ClassList.vue'

import CmsTopicList from '@/views/cms/topic/List.vue'
import CmsTopicEdit from '@/views/cms/topic/Edit.vue'

import Distribution from '@/views/distribution/Index.vue'

import DistributionPromoterList from '@/views/distribution/promoter/List.vue'
import DistributionPromoterVerifyList from '@/views/distribution/promoter/VerifyList.vue'

import DistributionGoodsCommissionRateList from '@/views/distribution/goodsCommissionRateList.vue'
import DistributionThreeLevelDistributionConfig from '@/views/distribution/threeLevelDistribution/Config.vue'
import DistributionThreeLevelDistributionLevelList from '@/views/distribution/threeLevelDistribution/level/List.vue'
import DistributionThreeLevelDistributionLevelEdit from '@/views/distribution/threeLevelDistribution/level/Edit.vue'

import DistributionRegionalAgentConfig from '@/views/distribution/regionalAgent/Config.vue'
// import DistributionRegionalAgentPromoterList from '@/views/distribution/regionalAgent/PromoterList.vue'

import DistributionShareholderDividendsConfig from '@/views/distribution/shareholderDividends/Config.vue'
// import DistributionShareholderDividendsAddPartnerLevel from '@/views/distribution/shareholderDividends/AddPartnerLevel.vue'
// import DistributionShareholderDividendsPartnerList from '@/views/distribution/shareholderDividends/PartnerList.vue'

import DistributionGlobalBonusPoolConfig from '@/views/distribution/globalBonusPool/Config.vue'
import DistributionGlobalBonusPoolGrant from '@/views/distribution/globalBonusPool/Grant.vue'
import DistributionGlobalBonusPoolRecords from '@/views/distribution/globalBonusPool/Records.vue'

import Setting from '@/views/setting/Index.vue'

import SettingBase from '@/views/setting/base/Index.vue'

import SettingBaseWebConfig from '@/views/setting/base/webConfig.vue'
import SettingBaseSEOConfig from '@/views/setting/base/seoConfig.vue'
import SettingBaseCopyrightInfo from '@/views/setting/base/copyrightInfo.vue'
import SettingBaseVisitConfig from '@/views/setting/base/visitConfig.vue'
import SettingBaseRegisterAndVisit from '@/views/setting/base/registerAndVisit.vue'
import SettingBaseUploadConfig from '@/views/setting/base/uploadConfig.vue'
import SettingBaseCustomPseudoStaticRule from '@/views/setting/base/customPseudoStaticRule.vue'
import SettingBasePartyLogin from '@/views/setting/base/partyLogin/list.vue'
import SettingBaseNotify from '@/views/setting/base/notify/list.vue'
import SettingBaseCustomservice from '@/views/setting/base/customService.vue'
// import SettingBaseMerchantService from '@/views/setting/base/merchantService.vue'

import SettingTransaction from '@/views/setting/transaction/Index.vue'
import SettingTransactionShopConfig from '@/views/setting/transaction/ShopConfig.vue'
import SettingTransactionWithdrawConfig from '@/views/setting/transaction/WithdrawConfig.vue'
import SettingTransactionPaymentConfig from '@/views/setting/transaction/pay/list.vue'

import SettingTransactionPaymentConfigAliPay from '@/views/setting/transaction/pay/aliPay.vue'
import SettingTransactionPaymentConfigWchatPay from '@/views/setting/transaction/pay/wchatPay.vue'
import SettingTransactionPaymentConfigUnionPay from '@/views/setting/transaction/pay/unionPay.vue'

import SettingAuthUserList from '@/views/setting/auth/user/list.vue'
import SettingAuthUserEdit from '@/views/setting/auth/user/edit.vue'
import SettingAuthGroup from '@/views/setting/auth/Group.vue'
import SettingAuthLog from '@/views/setting/auth/Log.vue'

import SettingDatabaseBackup from '@/views/setting/database/backup.vue'
import SettingDatabaseRestore from '@/views/setting/database/restore.vue'

import SettingDeliveryExpressCompany from '@/views/setting/delivery/express/expressCompany.vue'
import SettingDeliveryExpressCompanyEdit from '@/views/setting/delivery/express/editExpressCompany.vue'
import SettingDeliveryExpressSellerAddress from '@/views/setting/delivery/express/SellerAddress.vue'
import SettingDeliveryExpressMessage from '@/views/setting/delivery/express/ExpressMessage.vue'
// import SettingDeliveryAreaManagement from '@/views/setting/delivery/express/AreaManagement.vue'

// import SettingDeliveryLocalArea from '@/views/setting/delivery/local/area.vue'
import SettingDeliveryLocalConfig from '@/views/setting/delivery/local/config.vue'
import SettingDeliveryLocalUserList from '@/views/setting/delivery/local/userList.vue'

import SettingDeliveryPickuppointList from '@/views/setting/delivery/pickuppoint/List.vue'
import SettingDeliveryPickuppointFreight from '@/views/setting/delivery/pickuppoint/Freight.vue'
import SettingDeliveryPickuppointEdit from '@/views/setting/delivery/pickuppoint/Edit.vue'
// import SettingDeliveryPickuppointAuditor from '@/views/setting/delivery/pickuppoint/Auditor.vue'

import SettingVerificationList from '@/views/setting/verification/List.vue'
import SettingVerificationRecords from '@/views/setting/verification/Records.vue'

// import ReturnSetting from '@/views/order/returnSetting.vue'

Vue.use(Router)

export default new Router({
  mode: 'history',
  base: process.env.BASE_URL,
  routes: [
    {
      path: '/',
      redirect: 'index.html'
    },
    {
      path: '/index.html',
      name: '首页',
      component: Index
    },
    {
      path: '/goods',
      name: '商品',
      component: BaseRouter,
      children: [{
        path: '/',
        redirect: 'list.html'
      }, {
        path: 'list.html',
        name: 'goodsList',
        component: GoodsList
      }, {
        path: 'edit.html',
        name: '商品发布',
        component: GoodsEdit
      }, {
        path: 'category',
        name: '商品分类',
        component: BaseRouter,
        children: [
          {
            path: '/',
            redirect: 'list.html'
          }, {
            path: 'list.html',
            name: '商品分类列表',
            component: GoodsCategoryList
          }, {
            path: 'edit.html',
            name: '编辑商品分类',
            component: GoodsCategoryEdit
          }
        ]
      }, {
        path: 'brand',
        name: '商品品牌',
        component: BaseRouter,
        children: [
          {
            path: '/',
            redirect: 'list.html'
          }, {
            path: 'list.html',
            name: '商品品牌列表',
            component: GoodsBrandList
          }, {
            path: 'edit.html',
            name: '编辑商品品牌',
            component: GoodsBrandEdit
          }
        ]
      }, {
        path: 'brandedit.html',
        name: 'goodsBrandEdit',
        component: GoodsBrandEdit
      }, {
        path: 'label',
        name: '商品标签',
        component: BaseRouter,
        children: [
          {
            path: '/',
            redirect: 'list.html'
          }, {
            path: 'list.html',
            name: '商品标签列表',
            component: GoodsLabelList
          }, {
            path: 'edit.html',
            name: '编辑商品标签',
            component: GoodsLabelEdit
          }
        ]
      }, {
        path: 'labeledit.html',
        name: 'goodsLabelEdit',
        component: GoodsLabelEdit
      }, {
        path: 'spec',
        name: '商品规格',
        component: BaseRouter,
        children: [
          {
            path: '/',
            redirect: 'list.html'
          }, {
            path: 'list.html',
            name: '商品规格列表',
            component: GoodsSpecList
          }, {
            path: 'edit.html',
            name: '编辑商品规格',
            component: GoodsSpecEdit
          }
        ]
      }, {
        path: 'supplier',
        name: '供货商',
        component: BaseRouter,
        children: [
          {
            path: '/',
            redirect: 'list.html'
          }, {
            path: 'list.html',
            name: '供货商列表',
            component: SupplierList
          }, {
            path: 'edit.html',
            name: '编辑供货商',
            component: SupplierEdit
          }
        ]
      }, {
        path: 'consult.html',
        name: 'saleserviceConsult',
        component: SaleserviceConsult
      }, {
        path: 'attribute',
        name: '商品类型',
        component: BaseRouter,
        children: [
          {
            path: '/',
            redirect: 'list.html'
          }, {
            path: 'list.html',
            name: '商品类型列表',
            component: GoodsAttributeList
          }, {
            path: 'edit.html',
            name: '编辑商品类型',
            component: GoodsAttributeEdit
          }
        ]
      }, {
        path: 'comment.html',
        name: 'comment',
        component: GoodsComment
      }, {
        path: 'albumlist.html',
        name: 'systemAlbumList',
        component: SystemAlbumList
      // }, {
      //   path: 'albumpicturelist.html',
      //   name: 'systemAlbumPictureList',
      //   component: SystemAlbumPictureList
      }]
    },
    {
      path: '/order',
      name: '订单',
      component: Order,
      children: [{
        path: '/',
        redirect: 'orderlist.html'
      }, {
        path: 'orderlist.html',
        name: 'orderList',
        component: OrderList
      }, {
        path: 'virtualorder.html',
        name: 'virtualOrder',
        component: VirtualOrder
      }, {
        path: 'bargainorder.html',
        name: 'bargainOrder',
        component: BargainOrder
      }, {
        path: 'invoicelist.html',
        name: 'invoiceList',
        component: OrderInvoiceList
      }, {
        path: 'customerservicelist.html',
        name: 'customerServiceList',
        component: OrderCustomerServiceList
      // }, {
      //   path: 'customerservicedetail.html',
      //   name: 'customerServiceDetail',
      //   component: OrderCustomerServiceDetail
      }]
    }, {
      path: '/tuangou',
      name: '拼团',
      component: TabsRouter,
      props: {
        tabs: [
          {
            path: '/tuangou/pintuanList.html',
            name: '拼团列表'
          }, {
            path: '/tuangou/tuangouList.html',
            name: '拼团设置'
          }
        ]
      },
      children: [{
        path: '/',
        redirect: 'pintuanList.html'
      }, {
        path: 'pintuanorderlist.html',
        name: 'pintuanOrderList',
        component: PintuanOrderList
      }, {
        path: 'pintuanList.html',
        name: 'pintuanList',
        component: PintuanList
      }, {
        path: 'tuangouList.html',
        name: 'TuangouList',
        component: TuangouList
      }]
    },
    {
      path: '/bargain',
      name: '砍价活动',
      component: TabsRouter,
      props: {
        tabs: [
          {
            path: '/bargain/index.html',
            name: '砍价列表'
          }, {
            path: '/bargain/config.html',
            name: '砍价设置'
          }
        ]
      },
      children: [{
        path: '/',
        redirect: 'index.html'
      }, {
        path: 'index.html',
        name: '砍价活动列表',
        component: BargainList
      }, {
        path: 'edit.html',
        name: '编辑砍价活动',
        component: BargainEdit
      }, {
        path: 'config.html',
        name: 'bargainIndex',
        component: BargainConfig
      }, {
        path: 'pintuanlist.html',
        name: 'pintuanList',
        component: PintuanList
      }]
    },
    {
      path: '/promotion',
      name: '营销',
      component: Promotion,
      children: [{
        path: '/',
        redirect: 'coupon'
      }, {
        path: 'coupon',
        name: '优惠券',
        component: BaseRouter,
        children: [
          {
            path: '/',
            redirect: 'list.html'
          }, {
            path: 'list.html',
            name: '优惠券列表',
            component: PromotionCouponTypeList
          }, {
            path: 'edit.html',
            name: '编辑优惠券',
            component: PromotionCouponTypeEdit
          }, {
            path: 'grantRecords.html',
            name: '优惠券发放记录',
            component: PromotionCouponTypeGrantRecords
          }
        ]
      }, {
        path: 'pointconfig.html',
        name: 'pointconfig',
        component: PromotionPointconfig
      }, {
        path: 'gift',
        name: '赠品',
        component: TabsRouter,
        props: {
          tabs: [
            {
              path: '/promotion/gift/list.html',
              name: '赠品列表'
            }, {
              path: '/promotion/gift/records.html',
              name: '赠品发放记录'
            }
          ]
        },
        children: [
          {
            path: '/',
            redirect: 'list.html'
          }, {
            path: 'list.html',
            name: '赠品列表',
            component: PromotionGiftList
          }, {
            path: 'edit.html',
            name: '编辑赠品',
            component: PromotionGiftEdit
          }, {
            path: 'records.html',
            name: '赠品发放记录',
            component: PromotionGiftRecords
          }
        ]
      }, {
        path: 'mansong',
        name: '满减送',
        component: BaseRouter,
        children: [
          {
            path: '/',
            redirect: 'list.html'
          }, {
          //   path: 'list.html',
          //   name: '满减送列表',
          //   component: PromotionMansongList
          // }, {
            path: 'edit.html',
            name: '编辑满减送',
            component: PromotionMansongEdit
          }
        ]
      }, {
        path: 'discount',
        name: '限时折扣',
        component: BaseRouter,
        children: [
          {
            path: '/',
            redirect: 'list.html'
          }, {
            path: 'list.html',
            name: '限时折扣列表',
            component: PromotionDiscountList
          }, {
            path: 'edit.html',
            name: '编辑限时折扣',
            component: PromotionDiscountEdit
          }
        ]
      }, {
        path: 'discountedit.html',
        name: 'discountEdit',
        component: PromotionDiscountEdit
      }, {
        path: 'combopackage',
        name: '组合套餐',
        component: BaseRouter,
        children: [
          {
            path: '/',
            redirect: 'list.html'
          }, {
            path: 'list.html',
            name: '组合套餐列表',
            component: PromotionCombopackageList
          }, {
            path: 'edit.html',
            name: '编辑组合套餐',
            component: PromotionCombopackageEdit,
            meta: {
              functionPrompts: '<p>只有实物商品才能参与组合套餐活动！</p> ' +
                     '<p>商品原价与节省价仅作为参考，不参与实际计算！</p> ' +
                     '<p>商品价格取得是商品sku价格中的最低价格！参与套餐售卖的的商品sku价格不要相差太大。</p> ' +
                     '<p style="color: red;margin:0;">注：在组合商品发布之后，切勿修改商品价格。</p> ' +
                     '<p></p>'
            }
          }
        ]
      }, {
        path: 'fullshipping.html',
        name: 'fullshipping',
        component: PromotionFullshipping
      }, {
        path: 'RewardRules.html',
        name: '奖励规则',
        component: PromotionRewardRules
      }, {
        path: 'games',
        name: '互动游戏',
        component: BaseRouter,
        children: [
          {
            path: '/',
            redirect: 'list.html'
          }, {
            path: 'list.html',
            name: '互动游戏列表',
            component: PromotionGamesList
          }, {
            path: 'typelist.html',
            name: '活动类型',
            component: PromotionGamesTypeList
          }, {
            path: 'edit.html',
            name: '编辑互动游戏',
            component: PromotionGamesEdit
          }, {
            path: 'accessRecords.html',
            name: '获奖记录',
            component: PromotionGamesAccessRecords
          }, {
            path: 'awardList.html',
            name: '游戏奖项',
            component: PromotionGamesAwardList
          }
        ]
      }, {
        path: 'groupbuy',
        name: '团购',
        component: BaseRouter,
        children: [
          {
            path: '/',
            redirect: 'list.html'
          }, {
            path: 'list.html',
            name: '团购列表',
            component: PromotionGroupBuyList
          }, {
            path: 'edit.html',
            name: '编辑团购',
            component: PromotionGroupBuyEdit
          }
        ]
      }, {
        path: 'topic',
        name: '专题活动',
        component: BaseRouter,
        children: [
          {
            path: '/',
            redirect: 'list.html'
          }, {
            path: 'list.html',
            name: '专题活动列表',
            component: PromotionTopicList
          }, {
            path: 'edit.html',
            name: '编辑专题活动',
            component: PromotionTopicEdit
          }
        ]
      }]
    },
    {
      path: '/orderpresell',
      name: 'orderPresell',
      component: Order,
      children: [{
        path: 'list.html',
        name: 'orderPresellList',
        component: OrderPresellList
      // }, {
      //   path: 'detail.html',
      //   name: 'orderPresellDetail',
      //   component: OrderPresellDetail
      }]
    },
    {
      path: '/member',
      name: '会员',
      component: Member,
      children: [{
        path: '/',
        redirect: 'memberlist.html'
      }, {
        path: 'memberlist.html',
        name: 'memberList',
        component: MemberList
      }, {
        path: 'level',
        name: '会员等级',
        component: BaseRouter,
        children: [
          {
            path: '/',
            redirect: 'list.html'
          }, {
            path: 'list.html',
            name: '会员等级列表',
            component: MemberLevelList
          }, {
            path: 'edit.html',
            name: '编辑会员等级',
            component: MemberLevelEdit
          }
        ]
      }, {
        path: 'pointlist.html',
        name: '积分管理',
        component: MemberPointList
      }, {
        path: 'usercommissionwithdrawlist.html',
        name: 'UserCommissionWithdrawList',
        component: MemberUserCommissionWithdrawList
      }, {
        path: 'accountlist.html',
        name: '余额管理',
        component: MemberAccountList
      }]
    },
    {
      path: '/account',
      name: '数据',
      component: Account,
      children: [{
        path: '/',
        redirect: 'shopsalesaccount.html'
      // }, {
      //   path: 'shopsalesaccount.html',
      //   name: 'shopsalesaccount',
      //   component: AccountShopSalesAccount
      }, {
        path: 'shopgoodssaleslist.html',
        name: 'shopGoodsSalesList',
        component: AccountShopGoodsSalesList
      }, {
        path: 'shopgoodsgroupsalecount.html',
        name: 'shopGoodsGroupSaleCount',
        component: AccountShopGoodsGroupSaleCount
      }, {
        path: 'shopreport.html',
        name: 'shopReport',
        component: AccountShopReport
      }, {
        path: 'shopgoodssalesrank.html',
        name: 'shopGoodsSalesRank',
        component: AccountShopGoodsSalesRank
      }]
    },
    {
      path: '/upgrade',
      name: '系统',
      component: Upgrade,
      children: [{
        path: 'onlineupdate.html',
        name: '线上更新',
        component: UpgradeOnlineUpdate
      }, {
        path: 'devolutioninfo.html',
        name: 'devolutionInfo',
        component: UpgradeDevolutionInfo
      }]
    },
    {
      path: '/extend',
      name: 'extend',
      component: Upgrade,
      children: [{
        path: 'addonslist.html',
        name: 'addonsList',
        component: ExtendAddonsList
      }, {
        path: 'hookslist.html',
        name: 'hooksList',
        component: ExtendHooksList
      }, {
        path: 'hooksedit.html',
        name: 'hooksEdit',
        component: ExtendHooksEdit
      }]
    },
    {
      path: '/wchat',
      name: '微信',
      component: BaseRouter,
      children: [{
        path: '/',
        redirect: 'config.html'
      }, {
        path: 'appletconfig.html',
        name: '微信小程序管理',
        component: WchatAppletConfig
      }, {
        path: 'config.html',
        name: '公众号管理',
        component: WchatConfig
      // }, {
      //   path: 'menu.html',
      //   name: 'menu',
      //   component: WchatMenu
      }, {
        path: 'weixinqrcodetemplate.html',
        name: '推广二维码管理',
        component: WchatQrcodeTemplate
      }, {
        path: 'qrcode.html',
        name: '自定义推广二维码',
        component: WchatQrcode,
        meta: {
          functionPrompts: '<p><strong>提示：</strong>会员昵称、头像和二维码属于第三方提供的信息，您可以在这里调整字体和显示的位置，除此之外的信息您可以根据自己的需求放在背景图片中。</p>',
          operationPrompts: '<p>自定义推广二维码</p>'
        }
      }, {
        path: 'editKeywordReplay.html',
        name: '编辑关键词回复',
        component: WchatEditKeywordReplay
      }, {
        path: 'replayconfig.html',
        name: '回复设置',
        component: WchatReplayConfig
      }, {
        path: 'materialmessage.html',
        name: '消息素材管理',
        component: WchatMaterialMessage
      }, {
        path: 'addMedia.html',
        name: '添加消息素材',
        component: WchatAddMedia
      }, {
        path: 'weixinfanslist.html',
        name: '粉丝列表',
        component: WchatWeixinFansList
      // }, {
      //   path: 'shareconfig.html',
      //   name: '分享内容设置',
      //   component: WchatShareConfig
      }, {
        path: 'keyconcernconfig.html',
        name: '一键关注设置',
        component: WchatKeyConcernConfig
      }, {
        path: 'fansmessagemanage.html',
        name: '客服管理',
        component: WchatFansMessageManage
      }]
    }, {
      path: '/menu',
      name: 'menu',
      component: BaseRouter,
      children: [{
        path: 'addonmenu.html',
        name: 'addonMenu',
        component: MenuAddonMenu
      }]
    }, {
      path: '/member',
      name: 'member',
      component: BaseRouter,
      children: []
    }, {
      path: '/commission',
      name: '佣金',
      component: Commission,
      children: [{
        path: 'userAccountList.html',
        name: '推广员佣金',
        component: CommissionUserAccountList
      }, {
        path: 'distributionList.html',
        name: '三级分销',
        component: CommissionDistributionList
      }, {
        path: 'partnerList.html',
        name: '股东分红',
        component: CommissionPartnerList
      }, {
        path: 'regionAgentList.html',
        name: '区域代理',
        component: CommissionRegionAgentList
      }, {
        path: 'partnerGlobalList.html',
        name: '全球分红',
        component: CommissionPartnerGlobalList
      }, {
        path: 'userCommissionWithdrawList.html',
        name: '会员提现',
        component: CommissionUserCommissionWithdrawList
      }]
    }, {
      path: '/config',
      name: '网站',
      component: Config,
      children: [{
        path: '/',
        redirect: 'homeNotice'
      }, {
        path: 'homeNotice',
        name: '首页公告',
        component: BaseRouter,
        children: [{
          path: '/',
          redirect: 'list.html'
        }, {
          path: 'list.html',
          name: '公告列表',
          component: ConfigHomeNoticeList
        }, {
          path: 'edit.html',
          name: '编辑公告',
          component: ConfigHomeNoticeEdit
        }]
      }, {
        path: 'shopNavigation',
        name: '导航管理',
        component: BaseRouter,
        children: [{
          path: '/',
          redirect: 'list.html'
        }, {
          path: 'list.html',
          name: '导航列表',
          component: ConfigShopNavigationList
        }, {
          path: 'edit.html',
          name: '编辑导航',
          component: ConfigShopNavigationEdit
        }]
      }, {
        path: 'template',
        name: '店铺装修',
        component: TabsRouter,
        props: {
          tabs: [
            {
              path: '/config/template/pc.html',
              name: '电脑端模板'
            }, {
              path: '/config/template/fixed.html',
              name: '手机端模板'
            }, {
              path: '/config/template/wapCustom',
              name: '手机端自定义模板'
            }
          ]
        },
        children: [{
          path: '/',
          redirect: 'pc.html'
        }, {
        //   path: 'pc.html',
        //   name: '电脑端模板',
        //   component: ConfigTemplatePc
        // }, {
        //   path: 'fixed.html',
        //   name: '手机端模板',
        //   component: ConfigTemplateFixed
        // }, {
          path: 'wapCustom',
          name: '手机端自定义模板',
          component: BaseRouter,
          children: [{
            path: '/',
            redirect: 'list.html'
          // }, {
          //   path: 'list.html',
          //   name: '自定义模板列表',
          //   component: ConfigTemplateWapCustomList
          }, {
            path: 'list.html',
            name: '编辑自定义模板',
            component: ConfigTemplateWapCustomEdit
          }]
        }]
      }, {
        path: 'searchConfig.html',
        name: '搜索',
        component: ConfigSearchConfig
      }, {
        path: 'help',
        name: '站点帮助',
        component: TabsRouter,
        props: {
          tabs: [
            {
              path: '/config/help/document/list.html',
              name: '帮助内容'
            }, {
              path: '/config/help/class/list.html',
              name: '帮助类型'
            }
          ]
        },
        children: [{
          path: '/',
          redirect: 'document'
        }, {
          path: 'document',
          name: '帮助内容',
          component: BaseRouter,
          children: [{
            path: '/',
            redirect: 'list.html'
          }, {
            path: 'list.html',
            name: '帮助内容列表',
            component: ConfigHelpDocumentList
          }, {
            path: 'edit.html',
            name: '编辑帮助内容',
            component: ConfigHelpDocumentEdit
          }]
        }, {
          path: 'class',
          name: '帮助类型',
          component: BaseRouter,
          children: [{
            path: '/',
            redirect: 'list.html'
          }, {
            path: 'list.html',
            name: '帮助类型列表',
            component: ConfigHelpClassList
          }, {
            path: 'edit.html',
            name: '编辑帮助类型',
            component: ConfigHelpClassEdit
          }]
        }]
      }, {
        path: 'link',
        name: '友情链接',
        component: BaseRouter,
        children: [
          {
            path: '/',
            redirect: 'list.html'
          }, {
            path: 'list.html',
            name: '友情连接链接',
            component: ConfigLinkList
          }, {
            path: 'edit.html',
            name: '编辑友情链接',
            component: ConfigLinkEdit
          }
        ]
      }, {
        path: 'topic',
        name: '专题',
        component: BaseRouter,
        children: [{
          path: '/',
          redirect: 'list.html'
        }, {
          path: 'List.html',
          name: '专题列表',
          component: CmsTopicList
        }, {
          path: 'edit.html',
          name: '编辑专题',
          component: CmsTopicEdit
        }]
      }, {
        path: 'article',
        name: '文章管理',
        component: TabsRouter,
        props: {
          tabs: [
            {
              path: '/config/article/list.html',
              name: '文章列表'
            }, {
              path: '/config/article/classList.html',
              name: '文章分类'
            }
          ]
        },
        children: [
          {
            path: '/',
            redirect: 'list.html'
          }, {
            path: 'list.html',
            name: '文章列表',
            component: CmsArticleList
          // }, {
          //   path: 'edit.html',
          //   name: '编辑文章',
          //   component: CmsArticleEdit
          }, {
            path: 'classList.html',
            name: '文章分类',
            component: CmsArticleClassList
          }
        ]
      }, {
        path: 'ads',
        name: '广告管理',
        component: TabsRouter,
        props: {
          tabs: [
            {
              path: '/config/ads',
              name: '广告列表'
            }, {
              path: '/config/ads/position',
              name: '广告位管理'
            }
          ]
        },
        children: [
          {
            path: '/',
            redirect: 'list.html'
          }, {
            path: 'list.html',
            name: '广告列表',
            component: ConfigAdsList
          }, {
            path: 'edit.html',
            name: '编辑广告',
            component: ConfigAdsEdit
          }, {
            path: 'position',
            name: '广告位',
            component: BaseRouter,
            children: [{
              path: '/',
              redirect: 'list.html'
            }, {
              path: 'list.html',
              name: '广告位列表',
              component: ConfigAdsPositionList
            // }, {
            //   path: 'list.html',
            //   name: '编辑广告位',
            //   component: ConfigAdsPositionEdit
            }]
          }
        ]

      }]
    }, {
      path: '/system',
      name: 'system',
      component: Config,
      children: [{
        path: 'goodsCategoryBlock.html',
        name: 'goodsCategoryBlock',
        component: SystemGoodsCategoryBlock
      }, {
        path: 'module',
        name: 'SystemModule',
        component: BaseRouter,
        children: [{
          path: '/',
          redirect: 'list.html'
        }, {
          path: 'list.html',
          name: 'SystemModuleList',
          component: SystemModuleList
        }, {
          path: 'edit.html',
          name: 'SystemModuleEdit',
          component: SystemModuleEdit
        }]
      }]
    }, {
      path: '/distribution',
      name: '分销',
      component: Distribution,
      children: [{
        path: '/',
        redirect: 'promoter'
      }, {
        path: 'promoter',
        name: '推广员管理',
        component: TabsRouter,
        props: {
          tabs: [
            {
              path: '/distribution/promoter/list.html',
              name: '推广员'
            }, {
              path: '/distribution/promoter/verifyList.html',
              name: '待审核'
            }
          ]
        },
        children: [{
          path: '/',
          redirect: 'list.html'
        }, {
          path: 'list.html',
          name: '推广员',
          component: DistributionPromoterList
        }, {
          path: 'verifyList.html',
          name: '待审核',
          component: DistributionPromoterVerifyList
        }]
      }, {
        path: 'goodsCommissionRateList.html',
        name: '商品分销',
        component: DistributionGoodsCommissionRateList
      }, {
        path: 'threeLevelDistribution',
        name: '三级分销',
        component: TabsRouter,
        props: {
          tabs: [
            {
              path: '/distribution/threeLevelDistribution/config.html',
              name: '基本设置'
            }, {
              path: '/distribution/threeLevelDistribution/level/list.html',
              name: '推广员等级'
            }
          ]
        },
        children: [{
          path: '/',
          redirect: 'config.html'
        }, {
          path: 'config.html',
          name: '基本设置',
          component: DistributionThreeLevelDistributionConfig
        }, {
          path: 'level',
          name: '推广员等级',
          component: BaseRouter,
          children: [{
            path: '/',
            redirect: 'list.html'
          }, {
            path: 'list.html',
            name: '推广员列表',
            component: DistributionThreeLevelDistributionLevelList
          }, {
            path: 'edit.html',
            name: '推广员编辑',
            component: DistributionThreeLevelDistributionLevelEdit
          }]

        }]
      }, {
        path: 'regionalAgent',
        name: '区域代理',
        component: TabsRouter,
        props: {
          tabs: [
            {
              path: '/distribution/regionalAgent/config.html',
              name: '基本设置'
            }, {
              path: '/distribution/regionalAgent/promoterList.html',
              name: '人员管理'
            }
          ]
        },
        children: [
          {
            path: '/',
            redirect: 'config.html'
          }, {
            path: 'config.html',
            name: '基本设置',
            component: DistributionRegionalAgentConfig
          // }, {
          //   path: 'promoterList.html',
          //   name: '人员管理',
          //   component: DistributionRegionalAgentPromoterList
          }
        ]
      }, {
        path: 'shareholderDividends',
        name: '股东分红',
        component: TabsRouter,
        props: {
          tabs: [
            {
              path: '/distribution/shareholderDividends/config.html',
              name: '基本设置'
            }, {
              path: '/distribution/shareholderDividends/partnerList.html',
              name: '人员管理'
            }
          ]
        },
        children: [
          {
            path: '/',
            redirect: 'config.html'
          }, {
            path: 'config.html',
            name: '基本设置',
            component: DistributionShareholderDividendsConfig
          // }, {
          //   path: 'partnerList.html',
          //   name: '人员管理',
          //   component: DistributionShareholderDividendsPartnerList
          // }, {
          //   path: 'addPartnerLevel.html',
          //   name: '添加股东等级',
          //   component: DistributionShareholderDividendsAddPartnerLevel
          }
        ]
      }, {
        path: 'globalBonusPool',
        name: '全球分红',
        component: TabsRouter,
        props: {
          tabs: [
            {
              path: '/distribution/globalBonusPool/config.html',
              name: '基本设置'
            }, {
              path: '/distribution/globalBonusPool/grant.html',
              name: '发放分红'
            }, {
              path: '/distribution/globalBonusPool/records.html',
              name: '发放记录'
            }
          ]
        },
        children: [{
          path: '/',
          redirect: 'config.html'
        }, {
          path: 'config.html',
          name: '基本设置',
          component: DistributionGlobalBonusPoolConfig
        }, {
          path: 'grant.html',
          name: '发放分红',
          component: DistributionGlobalBonusPoolGrant
        }, {
          path: 'records.html',
          name: '发放记录',
          component: DistributionGlobalBonusPoolRecords
        }]
      }]
    }, {
      path: '/setting',
      name: '设置',
      component: Setting,
      children: [{
        path: '/',
        redirect: 'base'
      }, {
        path: 'base',
        name: '基础设置',
        component: SettingBase,
        children: [
          {
            path: '/',
            redirect: 'webConfig.html'
          }, {
            path: 'webConfig.html',
            name: '网站设置',
            component: SettingBaseWebConfig
          },
          {
            path: 'seoConfig.html',
            name: 'SEO设置',
            component: SettingBaseSEOConfig
          },
          {
            path: 'copyrightInfo.html',
            name: '版权',
            component: SettingBaseCopyrightInfo
          },
          {
            path: 'visitConfig.html',
            name: '运营',
            component: SettingBaseVisitConfig
          },
          {
            path: 'registerAndVisit.html',
            name: '注册与访问',
            component: SettingBaseRegisterAndVisit
          },
          {
            path: 'uploadConfig.html',
            name: '上传设置',
            component: SettingBaseUploadConfig
          },
          {
            path: 'customPseudoStaticRule.html',
            name: '伪静态路由',
            component: SettingBaseCustomPseudoStaticRule
          },
          {
            path: 'partyLogin.html',
            name: '第三方登录',
            component: SettingBasePartyLogin
          },
          {
            path: 'notifyindex.html',
            name: '通知系统',
            component: SettingBaseNotify
          },
          {
            path: 'customService.html',
            name: '客服',
            component: SettingBaseCustomservice
          // },
          // {
          //   path: 'merchantService.html',
          //   name: '商家服务',
          //   component: SettingBaseMerchantService
          }
        ]
      }, {
        path: 'transaction',
        name: '交易设置',
        component: SettingTransaction,
        children: [{
          path: '/',
          redirect: 'shopConfig.html'
        }, {
          path: 'shopConfig.html',
          name: '购物设置',
          component: SettingTransactionShopConfig
        }, {
          path: 'paymentConfig.html',
          name: '支付配置',
          component: SettingTransactionPaymentConfig
        }, {
          path: 'withdrawConfig.html',
          name: '提现设置',
          component: SettingTransactionWithdrawConfig
        }]
      }, {
        path: 'paymentConfig',
        name: '交易设置',
        component: BaseRouter,
        children: [{
          path: '/',
          redirect: 'aliPay.html'
        },
        {
          path: 'aliPay.html',
          name: '支付宝支付',
          component: SettingTransactionPaymentConfigAliPay
        },
        {
          path: 'wchatPay.html',
          name: '微信支付',
          component: SettingTransactionPaymentConfigWchatPay
        },
        {
          path: 'unionPay.html',
          name: '银联卡支付',
          component: SettingTransactionPaymentConfigUnionPay
        }
        ]
      }, {
        path: 'auth',
        name: '管理员列表',
        component: TabsRouter,
        props: {
          tabs: [
            {
              path: '/setting/auth/userList.html',
              name: '用户列表'
            },
            {
              path: '/setting/auth/group.html',
              name: '权限组'
            },
            {
              path: '/setting/auth/log.html',
              name: '操作日志'
            }
          ]
        },
        children: [{
          path: '/',
          redirect: 'userList.html'
        }, {
          path: 'userList.html',
          name: '用户列表',
          component: SettingAuthUserList
        }, {
          path: 'userEdit.html',
          name: '编辑用户',
          component: SettingAuthUserEdit
        }, {
          path: 'group.html',
          name: '权限组',
          component: SettingAuthGroup
        }, {
          path: 'log.html',
          name: '操作日志',
          component: SettingAuthLog
        }]
      }, {
        path: 'database',
        name: '数据库管理',
        component: TabsRouter,
        props: {
          tabs: [
            {
              path: '/setting/database/backup.html',
              name: '数据库备份'
            },
            {
              path: '/setting/database/restore.html',
              name: '数据库恢复'
            }
          ]
        },
        children: [{
          path: '/',
          redirect: 'backup.html'
        }, {
          path: 'backup.html',
          name: '数据库备份',
          component: SettingDatabaseBackup
        }, {
          path: 'restore.html',
          name: '数据库恢复',
          component: SettingDatabaseRestore
        }]
      }, {
        path: 'delivery',
        name: '配送管理',
        component: TabsRouter,
        props: {
          tabs: [
            {
              path: '/setting/delivery/express',
              name: '物流配送'
            },
            {
              path: '/setting/delivery/pickuppoint',
              name: '门店自提'
            },
            {
              path: '/setting/delivery/local',
              name: '本地配送'
            }
          ]
        },
        children: [{
          path: '/',
          redirect: 'express'
        }, {
          path: 'express',
          name: '物流配送',
          component: CardTabsRouter,
          props: {
            tabs: [
              {
                path: '/setting/delivery/express/expressCompany.html',
                name: '物流公司'
              }, {
                path: '/setting/delivery/express/areaManagement.html',
                name: '地区管理'
              }, {
                path: '/setting/delivery/express/SellerAddress.html',
                name: '商家地址'
              }, {
                path: '/setting/delivery/express',
                name: '货到付款地区管理'
              }, {
                path: '/setting/delivery/express/expressMessage.html',
                name: '物流跟踪设置'
              }
            ]
          },
          children: [{
            path: '/',
            redirect: 'expressCompany.html'
          }, {
            path: 'expressCompany.html',
            name: '物流公司',
            component: SettingDeliveryExpressCompany
          }, {
            path: 'editExpressCompany.html',
            name: '编辑物流公司',
            component: SettingDeliveryExpressCompanyEdit
          // }, {
          //   path: 'areaManagement.html',
          //   name: '地区管理',
          //   component: SettingDeliveryAreaManagement
          }, {
            path: 'SellerAddress.html',
            name: '商家地址',
            component: SettingDeliveryExpressSellerAddress
          }, {
          //   path: 'editExpressCompany.html',
          //   name: '货到付款地区管理',
          //   component: SettingDeliveryExpress
          // }, {
            path: 'expressMessage.html',
            name: '物流跟踪设置',
            component: SettingDeliveryExpressMessage
          }]
        }, {
          path: 'pickuppoint',
          name: '门店自提',
          component: CardTabsRouter,
          props: {
            tabs: [
              {
                path: '/setting/delivery/pickuppoint/list.html',
                name: '门店管理'
              }, {
                path: '/setting/delivery/pickuppoint/freight.html',
                name: '门店运费'
              }, {
                path: '/setting/delivery/pickuppoint/auditor.html',
                name: '门店审核人员管理'
              }
            ]
          },
          children: [{
            path: '/',
            redirect: 'list.html'
          },
          {
            path: 'list.html',
            name: '门店管理',
            component: SettingDeliveryPickuppointList
          }, {
            path: 'freight.html',
            name: '门店运费',
            component: SettingDeliveryPickuppointFreight
          }, {
          //   path: 'auditor.html',
          //   name: '门店审核人员管理',
          //   component: SettingDeliveryPickuppointAuditor
          // }, {
            path: 'edit.html',
            name: '添加门店',
            component: SettingDeliveryPickuppointEdit
          }]
        }, {
          path: 'local',
          name: '本地配送',
          component: CardTabsRouter,
          props: {
            tabs: [
              {
                path: '/setting/delivery/local/userList.html',
                name: '配送人员'
              }, {
                path: '/setting/delivery/local/config.html',
                name: '配送费用'
              }, {
                path: '/setting/delivery/local/area.html',
                name: '配送地区'
              }
            ]
          },
          children: [{
            path: '/',
            redirect: 'userList.html'
          },
          {
            path: 'userList.html',
            name: '配送人员',
            component: SettingDeliveryLocalUserList
          }, {
            path: 'config.html',
            name: '配送费用',
            component: SettingDeliveryLocalConfig
          // }, {
          //   path: 'area.html',
          //   name: '配送地区',
          //   component: SettingDeliveryLocalArea
          }
          ]
        }]
      }, {
        path: 'verification',
        name: '核销设置',
        component: TabsRouter,
        props: {
          tabs: [
            {
              path: '/setting/verification/list.html',
              name: '核销人员'
            },
            {
              path: '/setting/verification/records.html',
              name: '核销记录'
            }
          ]
        },
        children: [{
          path: '/',
          redirect: 'list.html'
        }, {
          path: 'list.html',
          name: '核销人员',
          component: SettingVerificationList
        }, {
          path: 'records.html',
          name: '核销记录',
          component: SettingVerificationRecords
        }]
      }]
    }
  ]
})
