<template>
  <div>
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
            <el-button type="primary" size="small" @click="search">查询</el-button>
          </el-form-item>
        </el-form>
      </el-col>
    </el-row>

    <el-table :data="tableData" border style="width: 100%">
      <el-table-column
        type="selection"
        width="35" />

      <el-table-column
        label="商品信息"
        width="350">
        <template slot-scope="scope">
          <div style="font-size: 12px;color: #126AE4;margin-bottom:5px;">
            <span>订单编号：{{ scope.row.orderNo }}</span>&nbsp;
            <span>下单时间：{{ scope.row.createDate }}</span>
          </div>
          <div class="product-img">
            <img src="@/assets/img/goods/14993422181194.jpg">
          </div>
          <div class="product-infor">
            <a href="http://showfx.niuteam.cn/index.php?s=/goods/goodsinfo&amp;goodsid=57" target="_blank" style="color:#333;">
              {{ scope.row.goodsName }}
            </a>
            <p class="specification" style="margin-bottom: 0px;">
              <span style="color:#8e8c8c;font-size:12px;">5.0 3G </span>
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
            {{ scope.row.number }}件
          </div>
        </template>
      </el-table-column>

      <el-table-column
        label="订单金额"
        width="100">
        <template slot-scope="scope">
          <div style="text-align:center">
            <b class="netprice" style="color: #FF6600;font-size: 14px;font-weight: normal;">
              {{ scope.row.payPrices }}
            </b>
            <br>
            <span class="expressfee">{{ scope.row.paymentType }}</span>
          </div>
        </template>
      </el-table-column>

      <el-table-column
        label="收货信息"
        width="180">
        <template slot-scope="scope">
          <div style="text-align:left;">
            <span class="expressfee">{{ scope.row.receiver }}</span>
            <br>
            <span class="expressfee">{{ scope.row.receiverMobile }}</span>
            <br>
            <span class="expressfee">{{ scope.row.receiverAddress }}</span>
          </div>
        </template>
      </el-table-column>

      <el-table-column
        label="买家"
        width="100">
        <template slot-scope="scope">
          <div style="text-align:center">
            {{ scope.row.username }}
            <br>
            <!-- scope.row.order_from -->
            <i class="fa fa-television" style="color:#666;" />
          </div>
        </template>
      </el-table-column>

      <el-table-column
        label="交易状态"
        width="120">
        <template slot-scope="scope">
          <a href="/order/ordercustomerdetail?id=10&itemid=497" style="margin:5px 0 10px 0;display:block;">
            {{ scope.row.status }}
          </a>
        </template>
      </el-table-column>

      <el-table-column
        label="操作"
        fixed="right"
        width="100">
        <template slot-scope="scope">
          <el-button size="mini" @click="handleEdit(scope.$index, scope.row)">订单详情</el-button>
        </template>
      </el-table-column>
    </el-table>

  </div>
</template>

<script>
export default {
  name: 'CustomerServiceList',
  data () {
    return {
      searchKeyword: '',
      queryForm: {},
      datePickerOptions: {
        shortcuts: [{
          text: '最近一周',
          onClick (picker) {
            const end = new Date()
            const start = new Date()
            start.setTime(start.getTime() - 3600 * 1000 * 24 * 7)
            picker.$emit('pick', [start, end])
          }
        }, {
          text: '最近一个月',
          onClick (picker) {
            const end = new Date()
            const start = new Date()
            start.setTime(start.getTime() - 3600 * 1000 * 24 * 30)
            picker.$emit('pick', [start, end])
          }
        }, {
          text: '最近三个月',
          onClick (picker) {
            const end = new Date()
            const start = new Date()
            start.setTime(start.getTime() - 3600 * 1000 * 24 * 90)
            picker.$emit('pick', [start, end])
          }
        }]
      },
      tableData: [{
        orderNo: '2018080913460001',
        createDate: '2018-08-09 14:19:10',
        goodsPrices: '0.00',
        number: '1',
        goodsName: 'TV1233213-副本',
        payPrices: '0.00',
        paymentType: '积分兑换',
        receiver: '李黑帅',
        receiverMobile: '18702335693',
        receiverAddress: '广东省&nbsp;深圳市&nbsp;宝安区&nbsp;锦华大厦',
        username: 'zhuzhu',
        order_from: 'https://open.weixin.qq.com/',
        status: '退款已成功'
      }, {
        orderNo: '2018080610270001',
        createDate: '2018-08-06 11:40:47',
        goodsPrices: '489.78',
        number: '1',
        goodsName: '宝格丽（BVLGARI） 宝格丽大吉岭茶男士淡香水浓情版 100ml',
        payPrices: '489.78',
        paymentType: '余额支付',
        receiver: '11111',
        receiverMobile: '13111111111',
        receiverAddress: '广东省&nbsp;广州市&nbsp;东山区&nbsp;21313123',
        username: 'niushop1',
        order_from: 'https://open.weixin.qq.com/',
        status: '退款申请不通过'
      }, {
        orderNo: '2018072511070001',
        createDate: '2018-08-03 14:26:04',
        goodsPrices: '5299.20',
        number: '1',
        goodsName: 'Lenovo/联想Yoga BOOK WiFi平板二合一超薄笔记本电脑yoga book',
        payPrices: '5299.20',
        paymentType: '线下支付',
        receiver: '123',
        receiverMobile: '15878907890',
        receiverAddress: '海南省&nbsp;海口市&nbsp;秀英区&nbsp;123',
        username: 'admin',
        order_from: 'https://open.weixin.qq.com/',
        status: '等待买家退货'
      }, {
        orderNo: '2018072511070001',
        createDate: '2018-08-02 17:39:28',
        goodsPrices: '1132.20',
        number: '1',
        goodsName: '正品现货送电源64G卡蓝牙Huawei/华为 Mate 9全网通智能手机mate9',
        payPrices: '1132.20',
        paymentType: '线下支付',
        receiver: '123',
        receiverMobile: '15878907890',
        receiverAddress: '海南省&nbsp;海口市&nbsp;秀英区&nbsp;123',
        username: 'admin',
        order_from: 'https://open.weixin.qq.com/',
        status: '退款申请不通过'
      }, {
        orderNo: '2018080215420001',
        createDate: '2018-08-02 16:46:51',
        goodsPrices: '26.10',
        number: '1',
        goodsName: 'home指纹识别 苹果6s按键贴iphone7plus按键贴5s手机配件可爱卡通',
        payPrices: '26.10',
        paymentType: '余额支付',
        receiver: '123',
        receiverMobile: '18770015555',
        receiverAddress: '海南省&nbsp;海口市&nbsp;龙华区&nbsp;12333',
        username: '111',
        order_from: 'https://open.weixin.qq.com/',
        status: '等待买家退货'
      }, {
        orderNo: '2018080215420001',
        createDate: '2018-08-02 16:46:29',
        goodsPrices: '14.22',
        number: '1',
        goodsName: '20180606【正宗三华李】+果实饱满 现摘现发+1份2斤装（±0.2）',
        payPrices: '14.22',
        paymentType: '余额支付',
        receiver: '123',
        receiverMobile: '18770015555',
        receiverAddress: '海南省&nbsp;海口市&nbsp;龙华区&nbsp;12333',
        username: '111',
        order_from: 'https://open.weixin.qq.com/',
        status: '等待买家退货'
      }, {
        orderNo: '2018061310020001',
        createDate: '2018-06-13 10:10:23',
        goodsPrices: '228.00',
        number: '1',
        goodsName: '456',
        payPrices: '228.00',
        paymentType: '线下支付',
        receiver: '123',
        receiverMobile: '15878907890',
        receiverAddress: '海南省&nbsp;海口市&nbsp;秀英区&nbsp;123',
        username: 'admin',
        order_from: 'https://open.weixin.qq.com/',
        status: '等待买家退货'
      }, {
        orderNo: '2018060412040001',
        createDate: '2018-06-04 12:05:48',
        goodsPrices: '12.45',
        number: '1',
        goodsName: '宏辉果蔬 苹果 烟台红富士 12个 单果约75mm 总重约2.1kg 新鲜水果',
        payPrices: '12.45',
        paymentType: '线下支付',
        receiver: 'mimi',
        receiverMobile: '15347200202',
        receiverAddress: '湖北省&nbsp;恩施土家族苗族自治州&nbsp;宣恩县&nbsp;不知道',
        username: 'bjbaidu',
        order_from: 'https://open.weixin.qq.com/',
        status: '等待买家退货'
      }, {
        orderNo: '2018053112040001',
        createDate: '2018-05-31 12:20:29',
        goodsPrices: '5410.00',
        number: '1',
        goodsName: 'Asus/华硕 X540 X540LJ4005 酷睿i3轻薄独显15.6寸手提笔记本电脑',
        payPrices: '4410.00',
        paymentType: '线下支付',
        receiver: '测试',
        receiverMobile: '13939000000',
        receiverAddress: '陕西省&nbsp;安康市&nbsp;旬阳县&nbsp;11111111',
        username: 'dodo123',
        order_from: 'https://open.weixin.qq.com/',
        status: '退款已成功'
      }, {
        orderNo: '2018052711040001',
        createDate: '2018-05-27 11:55:39',
        goodsPrices: '130.00',
        number: '1',
        goodsName: '可乐多',
        payPrices: '130.00',
        paymentType: '线下支付',
        receiver: '李强',
        receiverMobile: '15011745643',
        receiverAddress: '广东省&nbsp;广州市&nbsp;东山区&nbsp;天天89号',
        username: '小强',
        order_from: 'https://open.weixin.qq.com/',
        status: '退款已成功'
      }]
    }
  },
  methods: {
    handleEdit (index, row) {
      console.log(index, row)
    },
    handleDelete (index, row) {
      console.log(index, row)
    },
    search () {
      console.log('search', this.searchKeyword)
    }

  }
}
</script>

<style lang="scss" scoped>
.table-logo {
  width: 75px;
  float: left;
}

.table-pay {
  display: inline-block;
  width: 120px;
  overflow: hidden;
  margin-top: 7px;
}

.table-desc {
  display: inline-block;
}
</style>
