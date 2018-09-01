import Vue from 'vue'
import Router from 'vue-router'
import Index from './views/index.vue'

import Goods from './views/goods/app.vue'
import GoodsList from './views/goods/list.vue'
import GoodsAdd from './views/goods/add.vue'
import GoodsCategoryList from './views/goods/category/list.vue'
import GoodsCategoryEdit from './views/goods/category/edit.vue'
import GoodsBrandList from './views/goods/brand/list.vue'
import GoodsBrandEdit from './views/goods/brand/edit.vue'
import GoodsLabelList from './views/goods/label/list.vue'
import GoodsLabelEdit from './views/goods/label/edit.vue'
import GoodsSpecList from './views/goods/spec/list.vue'
import GoodsSpecEdit from './views/goods/spec/edit.vue'
import SupplierList from './views/supplier/list.vue'
import SupplierEdit from './views/supplier/edit.vue'
import GoodsAttributeList from './views/goods/attribute/list.vue'
import GoodsAttributeEdit from './views/goods/attribute/edit.vue'
import GoodsComment from './views/goods/comment.vue'

import SystemAlbumList from './views/system/album/list.vue'
import SystemAlbumPictureList from './views/system/album/picturelist.vue'
import SaleserviceConsult from './views/saleservice/consult.vue'


import Order from './views/order/app.vue'
import OrderList from './views/order/orderList.vue'
import VirtualOrder from './views/order/virtualOrder.vue'
import BargainOrder from './views/order/bargainOrder.vue'
import OrderInvoiceList from './views/order/invoiceList.vue'
import OrderCustomerServiceList from './views/order/customerService/list.vue'
import OrderCustomerServiceDetail from './views/order/customerService/detail.vue'

import PintuanList from './views/tuangou/list.vue'
import PintuanOrderList from './views/tuangou/orderList.vue'

import OrderPresellList from './views/orderPresell/lsit.vue'
import OrderPresellDetail from './views/orderPresell/detail.vue'




Vue.use(Router)

export default new Router({
  mode: 'history',
  base: process.env.BASE_URL,
  routes: [{
      path: '/',
      name: 'index',
      component: Index
    },
    {
      path: '/index.html',
      name: 'index',
      component: Index
    },
    {
      path: '/goods',
      name: 'goods',
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
        }
      ]
    },
    {
      path: '/order',
      name: 'order',
      component: Order,
      children: [{
        path: 'orderlist.html',
        name: 'orderList',
        component: OrderList
      },{
        path: 'virtualorder.html',
        name: 'virtualOrder',
        component: VirtualOrder
      },{
        path: 'bargainorder.html',
        name: 'bargainOrder',
        component: BargainOrder
      },{
        path: 'invoicelist.html',
        name: 'invoiceList',
        component: OrderInvoiceList
      },{
        path: 'customerservicelist.html',
        name: 'customerServiceList',
        component: OrderCustomerServiceList
      },{
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
      },{
        path: 'pintuanlist.html',
        name: 'pintuanList',
        component: PintuanList
      }]
    },
    {
      path: '/orderpresell',
      name: 'orderPresell',
      component: Order,
      children: [{
        path: 'orderpreselllist.html',
        name: 'orderPresellList',
        component: OrderPresellList
      },{
        path: 'orderpreselldetail.html',
        name: 'orderPresellDetail',
        component: OrderPresellDetail
      }]
    },
    // {
    //   path: '/about',
    //   name: 'about',
    //   // route level code-splitting
    //   // this generates a separate chunk (about.[hash].js) for this route
    //   // which is lazy-loaded when the route is visited.
    //   component: () =>
    //     import( /* webpackChunkName: "about" */ './views/About.vue')
    // }
  ]
})