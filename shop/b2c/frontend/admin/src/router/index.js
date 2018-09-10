import Vue from 'vue'
import Router from 'vue-router'
import BaseRouter from '@/components/BaseRouter.vue'
import Index from '@/views/Index.vue'

import Goods from '@/views/goods/Index.vue'
import GoodsList from '@/views/goods/list.vue'
import GoodsAdd from '@/views/goods/add.vue'
import GoodsCategoryList from '@/views/goods/category/list.vue'
// import GoodsCategoryEdit from '@/views/goods/category/edit.vue'
import GoodsBrandList from '@/views/goods/brand/list.vue'
import GoodsBrandEdit from '@/views/goods/brand/edit.vue'
import GoodsLabelList from '@/views/goods/label/list.vue'
import GoodsLabelEdit from '@/views/goods/label/edit.vue'
import GoodsSpecList from '@/views/goods/spec/list.vue'
// import GoodsSpecEdit from '@/views/goods/spec/edit.vue'
import SupplierList from '@/views/supplier/list.vue'
import SupplierEdit from '@/views/supplier/edit.vue'
import GoodsAttributeList from '@/views/goods/attribute/list.vue'
// import GoodsAttributeEdit from '@/views/goods/attribute/edit.vue'
import GoodsComment from '@/views/goods/comment.vue'

import SystemAlbumList from '@/views/system/album/list.vue'
import SystemAlbumPictureList from '@/views/system/album/picturelist.vue'
import SaleserviceConsult from '@/views/saleservice/consult.vue'

import Order from '@/views/order/Index.vue'
import OrderList from '@/views/order/orderList.vue'
import VirtualOrder from '@/views/order/virtualOrder.vue'
import BargainOrder from '@/views/order/bargainOrder.vue'
import OrderInvoiceList from '@/views/order/invoiceList.vue'
import OrderCustomerServiceList from '@/views/order/customerService/list.vue'
import OrderCustomerServiceDetail from '@/views/order/customerService/detail.vue'

import PintuanList from '@/views/tuangou/pintuanList.vue'
import PintuanOrderList from '@/views/tuangou/pintuanOrderList.vue'

import OrderPresellList from '@/views/orderPresell/list.vue'
import OrderPresellDetail from '@/views/orderPresell/detail.vue'

import Promotion from '@/views/promotion/Index.vue'
import PromotionCouponTypeList from '@/views/promotion/coupon/list.vue'
// import PromotionCouponTypeEdit from '@/views/promotion/coupon/edit.vue'
import PromotionPointconfig from '@/views/promotion/pointconfig.vue'
import PromotionGiftList from '@/views/promotion/gift/list.vue'
import PromotionGiftEdit from '@/views/promotion/gift/edit.vue'
import PromotionGiftRecords from '@/views/promotion/gift/records.vue'
import PromotionMansongList from '@/views/promotion/mansong/list.vue'
// import PromotionMansongEdit from '@/views/promotion/mansong/edit.vue'
import PromotionDiscountList from '@/views/promotion/discount/list.vue'
import PromotionDiscountEdit from '@/views/promotion/discount/edit.vue'
import PromotionCombopackageList from '@/views/promotion/combopackage/list.vue'
import PromotionCombopackageEdit from '@/views/promotion/combopackage/edit.vue'
import PromotionFullshipping from '@/views/promotion/fullshipping.vue'
import PromotionIntegral from '@/views/promotion/integral.vue'
import PromotionGamesList from '@/views/promotion/games/list.vue'
import PromotionGamesEdit from '@/views/promotion/games/edit.vue'
import PromotionGamesTypeList from '@/views/promotion/games/typeList.vue'
import PromotionGroupBuyList from '@/views/promotion/groupBuy/list.vue'
import PromotionGroupBuyEdit from '@/views/promotion/groupBuy/edit.vue'
// import PromotionGroupBuyEdit from '@/views/tuangou/pintuanlist.vue'
import PromotionTopicList from '@/views/promotion/topic/list.vue'
import PromotionTopicEdit from '@/views/promotion/topic/edit.vue'

import BargainIndex from '@/views/bargain/Index.vue'

import Member from '@/views/member/Index.vue'
import MemberList from '@/views/member/memberList.vue'
import MemberLevelList from '@/views/member/memberLevel/list.vue'
import MemberAccountList from '@/views/member/accountList.vue'
import MemberPointList from '@/views/member/pointList.vue'
import MemberUserCommissionWithdrawList from '@/views/member/userCommissionWithdrawList.vue'
import MemberWeixinFansList from '@/views/member/weixinFansList.vue'

import Account from '@/views/account/Index.vue'
import AccountShopSalesAccount from '@/views/account/shopSalesAccount.vue'
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

import Wchat from '@/views/wchat/Index.vue'
import WchatAppletConfig from '@/views/wchat/appletConfig.vue'
import WchatConfig from '@/views/wchat/config.vue'
import WchatMenu from '@/views/wchat/menu.vue'
import WchatQrcodeTemplate from '@/views/wchat/weixinQrcodeTemplate.vue'
import WchatReplayConfig from '@/views/wchat/replayConfig.vue'
import WchatMaterialMessage from '@/views/wchat/materialMessage.vue'
import WchatShareConfig from '@/views/wchat/shareConfig.vue'
import WchatKeyConcernConfig from '@/views/wchat/keyConcernConfig.vue'
import WchatFansMessageManage from '@/views/wchat/fansMessageManage.vue'

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

import ConfigTemplate from '@/views/config/template/Index.vue'
import ConfigTemplatePc from '@/views/config/template/Pc.vue'
import ConfigTemplateFixed from '@/views/config/template/Fixed.vue'
import ConfigTemplateWapCustomList from '@/views/config/template/wapCustom/List.vue'
import ConfigTemplateWapCustomEdit from '@/views/config/template/wapCustom/Edit.vue'

import ConfigSearchConfig from '@/views/config/searchConfig.vue'

import ConfigHelp from '@/views/config/help/Index.vue'
import ConfigHelpDocumentList from '@/views/config/help/document/List.vue'
import ConfigHelpDocumentEdit from '@/views/config/help/document/Edit.vue'
import ConfigHelpClassList from '@/views/config/help/class/List.vue'
import ConfigHelpClassEdit from '@/views/config/help/class/Edit.vue'

import ConfigLinkList from '@/views/config/link/list.vue'
import ConfigLinkEdit from '@/views/config/link/edit.vue'

import ConfigAds from '@/views/config/ads/Index.vue'
import ConfigAdsList from '@/views/config/ads/list.vue'
import ConfigAdsEdit from '@/views/config/ads/edit.vue'
import ConfigAdsPositionList from '@/views/config/ads/position/list.vue'
import ConfigAdsPositionEdit from '@/views/config/ads/position/edit.vue'

import SystemGoodsCategoryBlock from '@/views/system/goodsCategoryBlock.vue'

import CmsArticle from '@/views/cms/article/Index.vue'
import CmsArticleList from '@/views/cms/article/List.vue'
import CmsArticleEdit from '@/views/cms/article/Edit.vue'
import CmsArticleClassList from '@/views/cms/article/ClassList.vue'

import CmsTopicList from '@/views/cms/topic/List.vue'
import CmsTopicEdit from '@/views/cms/topic/Edit.vue'

import Distribution from '@/views/distribution/Index.vue'

import DistributionPromoter from '@/views/distribution/promoter/Index.vue'
import DistributionPromoterList from '@/views/distribution/promoter/List.vue'
import DistributionPromoterVerifyList from '@/views/distribution/promoter/VerifyList.vue'

import DistributionGoodsCommissionRateList from '@/views/distribution/goodsCommissionRateList.vue'
import DistributionThreeLevelDistribution from '@/views/distribution/threeLevelDistribution/Index.vue'
import DistributionThreeLevelDistributionConfig from '@/views/distribution/threeLevelDistribution/Config.vue'
import DistributionThreeLevelDistributionLevelList from '@/views/distribution/threeLevelDistribution/level/List.vue'
import DistributionThreeLevelDistributionLevelEdit from '@/views/distribution/threeLevelDistribution/level/Edit.vue'

import DistributionRegionalAgent from '@/views/distribution/regionalAgent/Index.vue'
import DistributionRegionalAgentConfig from '@/views/distribution/regionalAgent/Config.vue'
import DistributionRegionalAgentPromoterList from '@/views/distribution/regionalAgent/PromoterList.vue'

import DistributionShareholderDividends from '@/views/distribution/shareholderDividends/Index.vue'
import DistributionShareholderDividendsConfig from '@/views/distribution/shareholderDividends/Config.vue'
import DistributionShareholderDividendsAddPartnerLevel from '@/views/distribution/shareholderDividends/AddPartnerLevel.vue'
import DistributionShareholderDividendsPartnerList from '@/views/distribution/shareholderDividends/PartnerList.vue'

import DistributionGlobalBonusPool from '@/views/distribution/globalBonusPool/Index.vue'
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
import SettingBaseMerchantService from '@/views/setting/base/merchantService.vue'

import SettingTransaction from '@/views/setting/transaction/Index.vue'
import SettingTransactionShopConfig from '@/views/setting/transaction/ShopConfig.vue'
import SettingTransactionWithdrawConfig from '@/views/setting/transaction/WithdrawConfig.vue'
import SettingTransactionPaymentConfig from '@/views/setting/transaction/pay/list.vue'

import SettingTransactionPaymentConfigAliPay from '@/views/setting/transaction/pay/aliPay.vue'
import SettingTransactionPaymentConfigWchatPay from '@/views/setting/transaction/pay/wchatPay.vue'
import SettingTransactionPaymentConfigUnionPay from '@/views/setting/transaction/pay/unionPay.vue'

import SettingAuth from '@/views/setting/auth/Index.vue'
import SettingAuthUserList from '@/views/setting/auth/user/list.vue'
import SettingAuthUserEdit from '@/views/setting/auth/user/edit.vue'
import SettingAuthGroup from '@/views/setting/auth/Group.vue'
import SettingAuthLog from '@/views/setting/auth/Log.vue'

import SettingDatabase from '@/views/setting/database/Index.vue'
import SettingDatabaseBackup from '@/views/setting/database/backup.vue'
import SettingDatabaseRestore from '@/views/setting/database/restore.vue'

import SettingDelivery from '@/views/setting/delivery/Index.vue'
import SettingDeliveryExpress from '@/views/setting/delivery/express/Index.vue'
import SettingDeliveryExpressCompany from '@/views/setting/delivery/express/expressCompany.vue'
import SettingDeliveryExpressCompanyEdit from '@/views/setting/delivery/express/editExpressCompany.vue'
import SettingDeliveryExpressSellerAddress from '@/views/setting/delivery/express/SellerAddress.vue'
import SettingDeliveryExpressMessage from '@/views/setting/delivery/express/ExpressMessage.vue'

import SettingDeliveryLocal from '@/views/setting/delivery/local/Index.vue'
import SettingDeliveryLocalArea from '@/views/setting/delivery/local/area.vue'
import SettingDeliveryLocalConfig from '@/views/setting/delivery/local/config.vue'
import SettingDeliveryLocalUserList from '@/views/setting/delivery/local/userList.vue'

import SettingDeliveryPickuppoint from '@/views/setting/delivery/pickuppoint/Index.vue'
import SettingDeliveryPickuppointList from '@/views/setting/delivery/pickuppoint/List.vue'
import SettingDeliveryPickuppointFreight from '@/views/setting/delivery/pickuppoint/Freight.vue'
import SettingDeliveryPickuppointEdit from '@/views/setting/delivery/pickuppoint/Edit.vue'
import SettingDeliveryPickuppointAuditor from '@/views/setting/delivery/pickuppoint/Auditor.vue'

import SettingVerification from '@/views/setting/verification/Index.vue'
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
      component: Goods,
      children: [{
        path: 'list.html',
        name: 'goodsList',
        component: GoodsList
      }, {
        path: 'add.html',
        name: 'goodsAdd',
        component: GoodsAdd
      }, {
        path: 'categorylist.html',
        name: 'goodsCategoryList',
        component: GoodsCategoryList
      }, {
        path: 'brandlist.html',
        name: 'goodsBrandList',
        component: GoodsBrandList
      }, {
        path: 'brandedit.html',
        name: 'goodsBrandEdit',
        component: GoodsBrandEdit
      }, {
        path: 'labellist.html',
        name: 'goodsLabelList',
        component: GoodsLabelList
      }, {
        path: 'labeledit.html',
        name: 'goodsLabelEdit',
        component: GoodsLabelEdit
      }, {
        path: 'speclist.html',
        name: 'goodsSpecList',
        component: GoodsSpecList
      }, {
        path: 'supplierlist.html',
        name: 'supplierList',
        component: SupplierList
      }, {
        path: 'supplieredit.html',
        name: 'supplierEdit',
        component: SupplierEdit
      }, {
        path: 'consult.html',
        name: 'saleserviceConsult',
        component: SaleserviceConsult
      }, {
        path: 'attributelist.html',
        name: 'attributeList',
        component: GoodsAttributeList
      }, {
        path: 'comment.html',
        name: 'comment',
        component: GoodsComment
      }, {
        path: 'albumlist.html',
        name: 'systemAlbumList',
        component: SystemAlbumList
      }, {
        path: 'albumpicturelist.html',
        name: 'systemAlbumPictureList',
        component: SystemAlbumPictureList
      }]
    },
    {
      path: '/order',
      name: '订单',
      component: Order,
      children: [{
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
      }, {
        path: 'customerservicedetail.html',
        name: 'customerServiceDetail',
        component: OrderCustomerServiceDetail
      }]
    },
    {
      path: '/tuangou',
      name: 'tuangou',
      component: Order,
      children: [{
        path: 'pintuanorderlist.html',
        name: 'pintuanOrderList',
        component: PintuanOrderList
      }, {
        path: 'pintuanlist.html',
        name: 'pintuanList',
        component: PintuanList
      }]
    },
    {
      path: '/bargain',
      name: 'bargain',
      component: Order,
      children: [{
        path: 'index.html',
        name: 'bargainIndex',
        component: BargainIndex
      }, {
        path: 'pintuanlist.html',
        name: 'pintuanList',
        component: PintuanList
      }]
    },
    {
      path: '/promotion',
      name: 'promotion',
      component: Promotion,
      children: [{
        path: 'coupontypelist.html',
        name: 'couponTypeList',
        component: PromotionCouponTypeList
      }, {
        path: 'pointconfig.html',
        name: 'pointconfig',
        component: PromotionPointconfig
      }, {
        path: 'giftlist.html',
        name: 'giftList',
        component: PromotionGiftList
      }, {
        path: 'giftedit.html',
        name: 'giftEdit',
        component: PromotionGiftEdit
      }, {
        path: 'giftrecords.html',
        name: 'giftRecords',
        component: PromotionGiftRecords
      }, {
        path: 'mansonglist.html',
        name: 'mansongList',
        component: PromotionMansongList
      }, {
        path: 'discountlist.html',
        name: 'discountList',
        component: PromotionDiscountList
      }, {
        path: 'discountedit.html',
        name: 'discountEdit',
        component: PromotionDiscountEdit
      }, {
        path: 'combopackagelist.html',
        name: 'combopackageList',
        component: PromotionCombopackageList
      }, {
        path: 'combopackageedit.html',
        name: 'combopackageEdit',
        component: PromotionCombopackageEdit
      }, {
        path: 'fullshipping.html',
        name: 'fullshipping',
        component: PromotionFullshipping
      }, {
        path: 'integral.html',
        name: 'integral',
        component: PromotionIntegral
      }, {
        path: 'gameslist.html',
        name: 'gamesList',
        component: PromotionGamesList
      }, {
        path: 'gamesedit.html',
        name: 'gamesEdit',
        component: PromotionGamesEdit
      }, {
        path: 'gamestypelist.html',
        name: 'gamesTypeList',
        component: PromotionGamesTypeList
      }, {
        path: 'groupbuylist.html',
        name: 'groupBuyList',
        component: PromotionGroupBuyList
      }, {
        path: 'groupbuyedit.html',
        name: 'groupBuyEdit',
        component: PromotionGroupBuyEdit
      }, {
        path: 'topiclist.html',
        name: 'topicList',
        component: PromotionTopicList
      }, {
        path: 'topicedit.html',
        name: 'topicEdit',
        component: PromotionTopicEdit
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
      }, {
        path: 'detail.html',
        name: 'orderPresellDetail',
        component: OrderPresellDetail
      }]
    },
    {
      path: '/member',
      name: '会员',
      component: Member,
      children: [{
        path: 'memberlist.html',
        name: 'memberList',
        component: MemberList
      }, {
        path: 'memberlevellist.html',
        name: 'memberLevelList',
        component: MemberLevelList
      }, {
        path: 'memberpointlist.html',
        name: 'MemberPointList',
        component: MemberPointList
      }, {
        path: 'memberusercommissionwithdrawlist.html',
        name: 'memberUserCommissionWithdrawList',
        component: MemberUserCommissionWithdrawList
      }, {
        path: 'memberaccountlist.html',
        name: 'memberAccountList',
        component: MemberAccountList
      }]
    },
    {
      path: '/account',
      name: '数据',
      component: Account,
      children: [{
        path: 'shopsalesaccount.html',
        name: 'shopsalesaccount',
        component: AccountShopSalesAccount
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
      component: Wchat,
      children: [{
        path: 'appletconfig.html',
        name: 'appletConfig',
        component: WchatAppletConfig
      }, {
        path: 'config.html',
        name: 'config',
        component: WchatConfig
      }, {
        path: 'menu.html',
        name: 'menu',
        component: WchatMenu
      }, {
        path: 'weixinqrcodetemplate.html',
        name: 'qrcodeTemplate',
        component: WchatQrcodeTemplate
      }, {
        path: 'replayconfig.html',
        name: 'replayConfig',
        component: WchatReplayConfig
      }, {
        path: 'materialmessage.html',
        name: 'materialMessage',
        component: WchatMaterialMessage
      }, {
        path: 'shareconfig.html',
        name: 'shareConfig',
        component: WchatShareConfig
      }, {
        path: 'keyconcernconfig.html',
        name: 'keyConcernConfig',
        component: WchatKeyConcernConfig
      }, {
        path: 'fansmessagemanage.html',
        name: 'fansMessageManage',
        component: WchatFansMessageManage
      }]
    }, {
      path: '/menu',
      name: 'menu',
      component: Wchat,
      children: [{
        path: 'addonmenu.html',
        name: 'addonMenu',
        component: MenuAddonMenu
      }]
    }, {
      path: '/member',
      name: 'member',
      component: Wchat,
      children: [{
        path: 'weixinfanslist.html',
        name: 'weixinFansList',
        component: MemberWeixinFansList
      }]
    }, {
      path: '/commission',
      name: 'commission',
      component: Commission,
      children: [{
        path: 'userAccountList.html',
        name: 'userAccountList',
        component: CommissionUserAccountList
      }, {
        path: 'distributionList.html',
        name: 'distributionList',
        component: CommissionDistributionList
      }, {
        path: 'partnerList.html',
        name: 'partnerList',
        component: CommissionPartnerList
      }, {
        path: 'regionAgentList.html',
        name: 'regionAgentList',
        component: CommissionRegionAgentList
      }, {
        path: 'partnerGlobalList.html',
        name: 'partnerGlobalList',
        component: CommissionPartnerGlobalList
      }, {
        path: 'userCommissionWithdrawList.html',
        name: 'userCommissionWithdrawList',
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
        component: ConfigTemplate,
        children: [{
          path: '/',
          redirect: 'pc.html'
        }, {
          path: 'pc.html',
          name: '电脑端模板',
          component: ConfigTemplatePc
        }, {
          path: 'fixed.html',
          name: '手机端模板',
          component: ConfigTemplateFixed
        }, {
          path: 'wapCustom',
          name: '手机端自定义模板',
          component: BaseRouter,
          children: [{
            path: '/',
            redirect: 'list.html'
          }, {
            path: 'list.html',
            name: '自定义模板列表',
            component: ConfigTemplateWapCustomList
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
        component: ConfigHelp,
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
        component: CmsArticle,
        children: [
          {
            path: '/',
            redirect: 'list.html'
          }, {
            path: 'list.html',
            name: '文章列表',
            component: CmsArticleList
          }, {
            path: 'edit.html',
            name: '编辑文章',
            component: CmsArticleEdit
          }, {
            path: 'classList.html',
            name: '文章分类',
            component: CmsArticleClassList
          }
        ]
      }, {
        path: 'ads',
        name: '广告管理',
        component: ConfigAds,
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
            }, {
              path: 'list.html',
              name: '编辑广告位',
              component: ConfigAdsPositionEdit
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
        component: DistributionPromoter,
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
        component: DistributionThreeLevelDistribution,
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
        component: DistributionRegionalAgent,
        children: [{
          path: '/',
          redirect: 'config.html'
        }, {
          path: 'config.html',
          name: '基本设置',
          component: DistributionRegionalAgentConfig
        }, {
          path: 'promoterList.html',
          name: '人员管理',
          component: DistributionRegionalAgentPromoterList
        }]
      }, {
        path: 'shareholderDividends',
        name: '股东分红',
        component: DistributionShareholderDividends,
        children: [{
          path: '/',
          redirect: 'config.html'
        }, {
          path: 'config.html',
          name: '基本设置',
          component: DistributionShareholderDividendsConfig
        }, {
          path: 'partnerList.html',
          name: '人员管理',
          component: DistributionShareholderDividendsPartnerList
        }, {
          path: 'addPartnerLevel.html',
          name: '添加股东等级',
          component: DistributionShareholderDividendsAddPartnerLevel
        }]
      }, {
        path: 'globalBonusPool',
        name: '全球分红',
        component: DistributionGlobalBonusPool,
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
          },
          {
            path: 'merchantService.html',
            name: '商家服务',
            component: SettingBaseMerchantService
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
        component: SettingAuth,
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
        component: SettingDatabase,
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
        component: SettingDelivery,
        children: [{
          path: '/',
          redirect: 'express'
        }, {
          path: 'express',
          name: '物流配送',
          component: SettingDeliveryExpress,
          children: [{
            path: '/',
            redirect: 'expressCompany.html'
          }, {
            path: 'expressCompany.html',
            name: '物流公司',
            component: SettingDeliveryExpressCompany
          }, {
            path: 'editExpressCompany.html',
            name: '地区管理',
            component: SettingDeliveryExpressCompanyEdit
          }, {
            path: 'SellerAddress.html',
            name: '商家地址',
            component: SettingDeliveryExpressSellerAddress
          }, {
            path: 'editExpressCompany.html',
            name: '货到付款地区管理',
            component: SettingDeliveryExpress
          }, {
            path: 'expressMessage.html',
            name: '物流跟踪设置',
            component: SettingDeliveryExpressMessage
          }]
        }, {
          path: 'pickuppoint',
          name: '门店自提',
          component: SettingDeliveryPickuppoint,
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
            path: 'auditor.html',
            name: '门店审核人员管理',
            component: SettingDeliveryPickuppointAuditor
          }, {
            path: 'edit.html',
            name: '添加门店',
            component: SettingDeliveryPickuppointEdit
          }]
        }, {
          path: 'local',
          name: '本地配送',
          component: SettingDeliveryLocal,
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
          }, {
            path: 'area.html',
            name: '配送地区',
            component: SettingDeliveryLocalArea
          }
          ]
        }]
      }, {
        path: 'verification',
        name: '核销设置',
        component: SettingVerification,
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
