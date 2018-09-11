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
        label="推广员">
        <template slot-scope="scope">
         {{ scope.row.promoter + ' (' + scope.row.promoterShopName + ' ' + scope.row.promoterNo }}
        </template>
      </el-table-column>

      <el-table-column
        prop="phoneNumber"
        label="手机号"
        width="140">
      </el-table-column>

      <el-table-column
        prop="withdrawNo"
        label="提现流水号"
        width="140">
      </el-table-column>

      <el-table-column
        prop="bankName"
        label="提现银行"
        width="120">
      </el-table-column>

      <el-table-column
        prop="accountName"
        label="提现账户"
        width="100">
      </el-table-column>

      <el-table-column
        prop="realname"
        label="账户姓名"
        width="100">
      </el-table-column>

      <el-table-column
        prop="amount"
        label="提现金额"
        width="120">
      </el-table-column>

      <el-table-column
        prop="date"
        label="提现日期"
        width="140">
      </el-table-column>

      <el-table-column
        label="状态"
        width="120">
        <template slot-scope="scope">
          <span v-if="scope.row.status === 1">审核中</span>
          <span v-if="scope.row.status === 2">已通过</span>
          <span v-if="scope.row.status === 3">已拒绝</span>
        </template>
      </el-table-column>

      <el-table-column label="操作" fixed="right"
          width="180">
          <template slot-scope="scope">
              <!-- <a href="/config/loginconfig.html?type=qq">配置</a> -->
              <el-button size="mini" @click="handleEdit(scope.$index, scope.row)" v-if="scope.roe.status === 1" >通过</el-button>
              <el-button size="mini" @click="handleEdit(scope.$index, scope.row)" v-if="scope.roe.status === 1" >拒绝</el-button>
              <el-button size="mini" @click="handleEdit(scope.$index, scope.row)" v-else>详情</el-button>
          </template>
      </el-table-column>
    </el-table>
  </div>
</template>

<script>
export default {
  name: 'userCommissionWithdrawList',
  data () {
    return {
      queryForm: {
      },
      tableData: []
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
