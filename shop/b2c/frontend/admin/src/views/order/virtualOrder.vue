<template>

  <div>
    <el-tabs v-model="activeName" @tab-click="handleClick">
      <el-tab-pane label="全部" name="first">用户管理</el-tab-pane>
      <el-tab-pane label="待付款" name="second">配置管理</el-tab-pane>
      <el-tab-pane label="已付款" name="third">角色管理</el-tab-pane>
      <el-tab-pane label="已完成" name="fourth">定时任务补偿</el-tab-pane>
      <el-tab-pane label="已关闭" name="first">用户管理</el-tab-pane>
    </el-tabs>

    <el-row :gutter="8">
      <el-col :span="12">
        <el-button type="primary" size="small">导出数据</el-button>
        <el-button size="small">打印订单</el-button>
      </el-col>

      <el-col :span="12">
        <el-form :inline="true" :model="queryForm" size="small" >
          <el-form-item label="下单时间">
            <el-date-picker
              v-model="queryForm.orderDateRange"
              :picker-options="datePickerOptions"
              type="daterange"
              align="right"
              unlink-panels
              range-separator="至"
              start-placeholder="开始日期"
              end-placeholder="结束日期" />
          </el-form-item>
          <el-form-item>
            <el-popover
              v-model="moreQueryPopoverVisible"
              placement="bottom"
              width="400"
              trigger="click">
              <el-form ref="editForm" :model="queryForm" label-width="100px" size="small" label-position="right">
                <el-form-item label="订单编号">
                  <el-input v-model="queryForm.orderNo" />
                </el-form-item>

                <el-form-item label="收货人手机号">
                  <el-input v-model="queryForm.receiverMobile" />
                </el-form-item>

                <el-form-item label="支付方式">
                  <el-select v-model="queryForm.paymentType" clearable placeholder="请选择">
                    <el-option :value="1" label="微信" />
                    <el-option :value="2" label="支付宝" />
                    <el-option :value="3" label="线下支付" />
                    <el-option :value="4" label="货到付款" />
                  </el-select>
                </el-form-item>

                <el-form-item>
                  <el-button type="primary" @click="moreQueryPopoverVisible = false">确定</el-button>
                </el-form-item>
              </el-form>
              <el-button slot="reference" icon="el-icon-arrow-down" size="small" />
            </el-popover>
            <el-button type="primary" size="small" @click="search">查询</el-button>
          </el-form-item>
        </el-form>
      </el-col>
    </el-row>

    <el-table
      :data="tableData"
      :span-method="objectSpanMethod"
      border
      style="width: 100%">
      <el-table-column
        type="selection"
        width="35" />

      <el-table-column
        label="商品信息"
        width="350">
        <template slot-scope="scope">
          <div v-show="!scope.row.duplicate" style="font-size: 12px;color: #126AE4;margin-bottom:5px;">
            <span>订单编号：{{ scope.row.orderNo }}</span>&nbsp;
            <span>下单时间：{{ scope.row.createDate }}</span>
          </div>
          <div class="product-img"><img src="@/assets/img/goods/1499338515654.jpg"></div>
          <div class="product-infor">
            <a href="http://b2c.niuteam.cn/goods/goodsinfo?goodsid=150" target="_blank" style="color:#333;">
              {{ scope.row.goodsName }}
            </a>
            <p class="specification" style="margin-bottom: 0px;">
              <span style="color:#8e8c8c;font-size:12px;">5.0 </span>
            </p>
          </div>
        </template>
      </el-table-column>

      <el-table-column
        label="商品清单"
        width="120">
        <template slot-scope="scope">
          <div style="display: inline-block;">
            <span>{{ scope.row.goodsPrices }}元</span>
          </div>
          <div style="display: inline-block;float:right;">
            {{ scope.row.goodsNumber }}件
          </div>
        </template>
      </el-table-column>

      <el-table-column
        label="买家"
        width="120">
        <template slot-scope="scope">
          <div class="cell">
            {{ scope.row.buyer }}
            <br>
            <!-- TODO: melibe pc -->
            <i class="fa fa-television" style="color:#666;" />
          </div>
        </template>
      </el-table-column>

      <el-table-column
        prop="contact"
        label="联系方式"
        width="120" />

      <el-table-column
        label="订单金额"
        width="120">
        <template slot-scope="scope">
          <div style="text-align:center">
            <b class="netprice" style="color: #FF6600;font-size: 14px;font-weight: normal;">0.00</b>
            <br>
            <span class="expressfee">(含配送费:0.00元)</span>
            <br>
            <span class="expressfee">积分兑换</span>
          </div>
        </template>
      </el-table-column>

      <el-table-column
        label="交易状态"
        width="180">
        <template slot-scope="scope">
          <div class="business-status" style="text-align:center">
            <span v-if="scope.row.status === 1">待付款</span>
            <span v-if="scope.row.status === 2">待发货</span>
            <span v-if="scope.row.status === 3">待提货</span>
            <span v-if="scope.row.status === 4">已发货</span>
            <span v-if="scope.row.status === 5">已收货</span>
            <span v-if="scope.row.status === 6">已完成</span>
            <span v-if="scope.row.status === 7">已关闭</span>
            <span v-if="scope.row.status === 8">退款中</span>
          </div>

        </template>
      </el-table-column>

      <el-table-column
        label="操作"
        fixed="right"
        width="100">
        <template slot-scope="scope">
          <el-button size="mini" @click="handleEdit(scope.$index, scope.row)">订单详情</el-button>
          <br>
          <el-button v-if="scope.row.status === 3" size="mini" @click="showUpdateMemosDialog(scope.row)" >提货</el-button>
          <el-button v-if="scope.row.status === 2" size="mini" @click="showUpdateMemosDialog(scope.row)" >发货</el-button>

          <el-button size="mini" @click="showUpdateMemosDialog(scope.row)">备注</el-button>
          <br>
          <el-button v-if="scope.row.status === 2" size="mini" @click="showUpdateMemosDialog(scope.row)" >修改地址</el-button>
          <el-button v-if="scope.row.status === 7" size="mini" @click="showUpdateMemosDialog(scope.row)" >删除订单</el-button>
          <el-button v-if="scope.row.status === 6" size="mini" @click="showUpdateMemosDialog(scope.row)" >查看物流</el-button>
        </template>
      </el-table-column>
    </el-table>

  </div>

</template>

<script>
require('@/assets/style/table.scss')
require('@/assets/style/order/list.scss')

export default {
  name: 'VirtualOrder',
  data () {
    return {
      queryForm: {},
      orderList: [
        {
          id: '179',
          orderNo: '2018081615480001',
          createDate: '2018-08-16 15:48:29',
          status: 6,
          goodsName: '11111111111_test',
          goodsPrices: 135.00,
          number: 1,
          buyer: 'niushop1',
          buyType: 'television',
          contact: '13999999999',
          orderPrice: 135.00,
          payType: '余额支付'
        },
        {
          id: '139',
          orderNo: '2018080817530001',
          createDate: '2018-08-08 17:53:18',
          status: 7,
          goodsName: 'as',
          goodsPrices: 10.00,
          number: 1,
          buyer: '1058100209@qq.com',
          buyType: 'television',
          contact: '13431035040',
          orderPrice: 10.00,
          payType: '在线支付'
        },
        {
          id: '141',
          orderNo: '2018080817230001',
          createDate: '2018-08-08 17:23:49',
          status: 0,
          goodsName: '222221-副本',
          goodsPrices: 89.10,
          number: 1,
          buyer: 'niushop1',
          buyType: 'mobile fa-2x',
          contact: '13851316352',
          orderPrice: 89.10,
          payType: '余额支付'
        },
        {
          id: '159',
          orderNo: '2018080814250001',
          createDate: '2018-08-08 14:25:12',
          status: 6,
          goodsName: '充值 卡',
          goodsPrices: 100.00,
          number: 1,
          buyer: 'lychun',
          buyType: 'television',
          contact: '13122217776',
          orderPrice: 100.00,
          payType: '余额支付'
        },
        {
          id: '110',
          orderNo: '2018080614000002',
          createDate: '2018-08-06 14:00:45',
          status: 6,
          goodsName: '撒旦撒旦撒旦撒旦',
          goodsPrices: 20.00,
          number: 1,
          buyer: 'wzz246513',
          buyType: 'mobile fa-2x',
          contact: '13146101332',
          orderPrice: 20.00,
          payType: '线下支付'
        },
        {
          id: '159',
          orderNo: '2018080610230002',
          createDate: '2018-08-06 10:23:41',
          status: 7,
          goodsName: '充值 卡',
          goodsPrices: 90.00,
          number: 1,
          buyer: 'niushop1',
          buyType: 'television',
          contact: '18018018018',
          orderPrice: 90.00,
          payType: '在线支付'
        },
        {
          id: '159',
          orderNo: '2018080417080001',
          createDate: '2018-08-04 17:08:38',
          status: 6,
          goodsName: '充值 卡',
          goodsPrices: 100.00,
          number: 1,
          buyer: 'ilouju',
          buyType: 'weixin',
          contact: '13096999999',
          orderPrice: 0.01,
          payType: '线下支付'
        },
        {
          id: '141',
          orderNo: '2018080114370002',
          createDate: '2018-08-01 14:37:42',
          status: 0,
          goodsName: '222221-副本',
          goodsPrices: 89.10,
          number: 1,
          buyer: 'niushop1',
          buyType: 'television',
          contact: '18212341234',
          orderPrice: 89.10,
          payType: '余额支付'
        },
        {
          id: '86',
          orderNo: '2018072518020001',
          createDate: '2018-07-25 18:02:14',
          status: 7,
          goodsName: '视频下载',
          goodsPrices: 100.00,
          number: 1,
          buyer: 'fenglian100',
          buyType: 'television',
          contact: '15159518777',
          orderPrice: 100.00,
          payType: '在线支付'
        },
        {
          id: '153',
          orderNo: '2018071910110001',
          createDate: '2018-07-19 10:11:25',
          status: 7,
          goodsName: 'AAA3213',
          goodsPrices: 5.00,
          number: 1,
          buyer: 'ares11',
          buyType: 'mobile fa-2x',
          contact: '18936946991',
          orderPrice: 5.00,
          payType: '在线支付'
        },
        {
          id: '153',
          orderNo: '2018071901110001',
          createDate: '2018-07-19 01:11:19',
          status: 6,
          goodsName: 'AAA3213',
          goodsPrices: 4.50,
          number: 1,
          buyer: 'niushop1',
          buyType: 'television',
          contact: '18618342234',
          orderPrice: 2.50,
          payType: '余额支付'
        },
        {
          id: '149',
          orderNo: '2018071901070001',
          createDate: '2018-07-19 01:07:09',
          status: 6,
          goodsName: '123',
          goodsPrices: 4.50,
          number: 1,
          buyer: 'niushop1',
          buyType: 'television',
          contact: '18618342234',
          orderPrice: 2.50,
          payType: '余额支付'
        },
        {
          id: '149',
          orderNo: '2018071901030001',
          createDate: '2018-07-19 01:03:19',
          status: 6,
          goodsName: '123',
          goodsPrices: 4.50,
          number: 1,
          buyer: 'niushop1',
          buyType: 'television',
          contact: '18618342234',
          orderPrice: 2.50,
          payType: '余额支付'
        },
        {
          id: '153',
          orderNo: '2018071817030001',
          createDate: '2018-07-18 17:03:54',
          status: 6,
          goodsName: 'AAA3213',
          goodsPrices: 4.50,
          number: 1,
          buyer: 'niushop1',
          buyType: 'television',
          contact: '13265478965',
          orderPrice: 4.50,
          payType: '余额支付'
        }
      ]
    }
  },
  computed: {
    tableData () {
      var result = []
      this.orderList.forEach(orderListItem => {
        var goods = this.copyOrderGoodsInfo(orderListItem, 0)
        if (orderListItem.goodsList.length > 1) {
          goods.multirow = true
          result.push(Object.assign(goods, orderListItem))

          orderListItem.goodsList.forEach((goodsListItem, index) => {
            if (index > 0) {
              var goods = this.copyOrderGoodsInfo(orderListItem, index)
              goods.duplicate = true
              console.log('duplicate', goods)
              result.push(Object.assign(goods, orderListItem))
            }
          })
        } else {
          result.push(Object.assign(goods, orderListItem))
        }
      })
      return result
    }
  },

  methods: {
    copyOrderGoodsInfo ({ goodsList = [] }, index) {
      var result = {}
      result.goodsName = goodsList[index].name
      result.goodsNumber = goodsList[index].number
      result.goodsPrices = goodsList[index].price
      return result
    },
    objectSpanMethod ({ row, column, rowIndex, columnIndex }) {
      if (columnIndex === 0 || columnIndex > 2) {
        if (row.duplicate) {
          console.log('duplicate', row.duplicate)
          return {
            rowspan: 0,
            colspan: 0
          }
        } else if (row.multirow) {
          console.log('multirow', row.multirow)
          return {
            rowspan: row.goodsList.length,
            colspan: 1
          }
        } else {
          return {
            rowspan: 1,
            colspan: 1
          }
        }
      }
    }
  }
}
</script>
