<template>
  <el-table border
    :data="tableData"
    style="width: 100%">
    <el-table-column
      label="支付方式">
      <template slot-scope="scope">

        <div class="table-logo"><img :src="scope.row.logo"></div>
				<span class="table-pay">{{scope.row.name}}</span><br>
				<span class="table-desc">{{scope.row.description}}
				</span>
      </template>
    </el-table-column>
    <el-table-column
      label="状态"
      width="180">
      <template slot-scope="scope">
        <el-switch v-model="scope.row.status">
        </el-switch>
      </template>
    </el-table-column>
    <el-table-column label="操作"
      width="180">
      <template slot-scope="scope">
          							<!-- <a href="/config/payconfig.html?type=wchat">配置</a> -->
							<!-- <a href="/config/payaliconfig.html">配置</a> -->
							<!-- <a href="/config/unionpayconfig.html">配置</a> -->

        <el-button
          size="mini"
          @click="$router.push(scope.row.configLink)">配置</el-button>
      </template>
    </el-table-column>
  </el-table>
</template>

<script>
  export default {
    data() {
      return {
        tableData: [{
          logo: '/admin/images/pay.png',
          name: '支付宝支付',
          status: true,
          description: '该系统支持即时到账接口',
          configLink:'/config/paymentConfig/aliPay.html'
        },{
          logo: '/admin/images/wchat.png',
          name: '微信支付',
          status: false,
          description: '该系统支持微信网页支付和扫码支付',
          configLink:'/config/paymentConfig/wchatPay.html'
        },{
          logo: '/admin/images/unionpay.png',
          name: '银联卡支付',
          status: false,
          description: '该系统支持即时到账接口',
          configLink:'/config/paymentConfig/unionPay.html'
        }]
      }
    },
    methods: {
      handleEdit(index, row) {
        console.log(index, row);
      },
      handleDelete(index, row) {
        console.log(index, row);
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
