<template>
  <div>

    <el-form :inline="true" :model="queryForm" size="small" >
      <el-form-item label="下单时间">
        <el-date-picker
          v-model="queryForm.orderDateRange"
          type="daterange"
          align="right"
          style="width:220px"
          unlink-panels
          range-separator="至"
          start-placeholder="开始日期"
          end-placeholder="结束日期"
          :picker-options="datePickerOptions">
        </el-date-picker>
      </el-form-item>

      <el-form-item label="买家名称">
        <el-input size="small" style="width:190px" v-model="queryForm.buyer" ></el-input>
      </el-form-item>

      <el-form-item label="订单编号">
        <el-input size="small" style="width:190px" v-model="queryForm.orderNo" ></el-input>
      </el-form-item>

      <el-form-item label="订单状态">
        <el-select
          v-model="queryForm.role"
          style="width:100px"
          placeholder="订单状态">
          <el-option label="全部" value="0"></el-option>
          <el-option label="待付款" value="1"></el-option>
          <el-option label="待发货" value="2"></el-option>
          <el-option label="待收货" value="3"></el-option>
          <el-option label="已收货" value="4"></el-option>
          <el-option label="交易成功" value="5"></el-option>
          <el-option label="已关闭" value="6"></el-option>
          <el-option label="退款中" value="-1"></el-option>
          <el-option label="已退款" value="-2"></el-option>
        </el-select>
      </el-form-item>

      <el-form-item>
        <el-button type="primary" @click="search">查询</el-button>
      </el-form-item>
    </el-form>

    <el-table border :data="tableData" style="width: 100%">
      <el-table-column
        prop="orderNo"
        label="订单号">
      </el-table-column>

      <el-table-column
        prop="amount"
        label="订单金额"
        width="120">
      </el-table-column>

      <el-table-column
        prop="status"
        label="订单状态"
        width="120">
      </el-table-column>

      <el-table-column
        prop="commission"
        label="佣金"
        width="120">
      </el-table-column>

      <el-table-column
        prop="buyer"
        label="买家"
        width="120">
      </el-table-column>

      <el-table-column
        prop="createDate"
        label="创建时间"
        width="140">
      </el-table-column>

      <el-table-column
        prop="completionDate"
        label="完成时间"
        width="140">
      </el-table-column>
    </el-table>
  </div>
</template>

<script>
export default {
  name: 'partnerList',
  data () {
    return {
      queryForm: {
        orderDateRange: []
      },
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
        orderNo: '2018091109350001',
        amount: '1534.10',
        status: '已关闭',
        commission: '0',
        buyer: 'dx4177542',
        createDate: '2018-09-11 09:35:12',
        completionDate: ''
      }, {
        orderNo: '2018091109330001',
        amount: '3146.40',
        status: '已关闭',
        commission: '0',
        buyer: 'dx4177542',
        createDate: '2018-09-11 09:33:14',
        completionDate: ''
      }, {
        orderNo: '2018090811110001',
        amount: '904.10',
        status: '备货中',
        commission: '0',
        buyer: 'aaaeee',
        createDate: '2018-09-08 11:11:46',
        completionDate: ''
      }, {
        orderNo: '2018090317500001',
        amount: '2156.40',
        status: '已完成',
        commission: '0',
        buyer: 'admin',
        createDate: '2018-09-03 17:50:20',
        completionDate: '2018-09-03 17:51:54'
      }, {
        orderNo: '2018090317250002',
        amount: '500.00',
        status: '待发货',
        commission: '35',
        buyer: 'wowo121wo',
        createDate: '2018-09-03 17:25:21',
        completionDate: ''
      }]
    }
  },
  methods: {
    search () {
      console.log('search', this.searchKeyword)
    }

  }
}
</script>

<style lang="scss" scoped>

</style>
