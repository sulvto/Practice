<template>
  <div>

    <el-form :inline="true" :model="queryForm" size="small" >

      <el-form-item label="用户姓名">
        <el-input size="small" v-model="queryForm.username" ></el-input>
      </el-form-item>

      <el-form-item label="手机号">
        <el-input size="small" v-model="queryForm.phoneNumber" ></el-input>
      </el-form-item>

      <el-form-item>
        <el-button type="primary" @click="search">查询</el-button>
      </el-form-item>
    </el-form>

    <el-table border :data="tableData" style="width: 100%">
      <el-table-column
        prop="shareholder"
        label="股东">
      </el-table-column>

      <el-table-column
        prop="receiveDividendsStartDate"
        label="分红开始时间"
        width="140">
      </el-table-column>

      <el-table-column
        prop="receiveDividendsEndDate"
        label="分红结束时间"
        width="140">
      </el-table-column>

      <el-table-column
        prop="receiveDividendsAmountCount"
        label="分红总金额"
        width="120">
      </el-table-column>

      <el-table-column
        prop="shopValue"
        label="店铺总分值"
        width="100">
      </el-table-column>

      <el-table-column
        prop="shareholderValue"
        label="股东分值"
        width="100">
      </el-table-column>

      <el-table-column
        prop="dividendCommissionRatio"
        label="分红佣金比率"
        width="120">
      </el-table-column>

      <el-table-column
        prop="dividendAmount"
        label="分红金额"
        width="120">
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
  name: 'partnerGlobalList',
  data () {
    return {
      queryForm: {
      },
      tableData: [{
        shareholder: 'undefined',
        receiveDividendsStartDate: '2018-07-17 00:00:00',
        receiveDividendsEndDate: '2018-08-11 00:00:00',
        receiveDividendsAmountCount: '1.00',
        shopValue: '100',
        shareholderValue: '100',
        dividendCommissionRatio: '1.00%',
        dividendAmount: '1.00',
        completionDate: '2018-08-11 01:04:04'
      }, {
        shareholder: 'undefined',
        receiveDividendsStartDate: '2018-08-11 00:00:00',
        receiveDividendsEndDate: '2018-08-20 00:00:00',
        receiveDividendsAmountCount: '5.00',
        shopValue: '100',
        shareholderValue: '100',
        dividendCommissionRatio: '1.00%',
        dividendAmount: '5.00',
        completionDate: '2018-08-20 10:08:02'
      }, {
        shareholder: 'undefined',
        receiveDividendsStartDate: '2018-08-20 00:00:00',
        receiveDividendsEndDate: '2018-09-03 00:00:00',
        receiveDividendsAmountCount: '21.00',
        shopValue: '1500',
        shareholderValue: '500',
        dividendCommissionRatio: '0.33%',
        dividendAmount: '7.00',
        completionDate: '2018-09-03 01:13:34'
      }, {
        shareholder: 'undefined',
        receiveDividendsStartDate: '2018-08-20 00:00:00',
        receiveDividendsEndDate: '2018-09-03 00:00:00',
        receiveDividendsAmountCount: '21.00',
        shopValue: '1500',
        shareholderValue: '1000',
        dividendCommissionRatio: '0.67%',
        dividendAmount: '14.00',
        completionDate: '2018-09-03 01:13:34'
      }, {
        shareholder: 'undefined',
        receiveDividendsStartDate: '2018-09-03 00:00:00',
        receiveDividendsEndDate: '2018-09-05 00:00:00',
        receiveDividendsAmountCount: '5000.00',
        shopValue: '1500',
        shareholderValue: '500',
        dividendCommissionRatio: '0.33%',
        dividendAmount: '1666.67',
        completionDate: '2018-09-05 14:28:59'
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
