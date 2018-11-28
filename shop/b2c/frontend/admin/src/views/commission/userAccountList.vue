<template>
 <div>
   <el-form :inline="true" :model="queryForm" size="small" >

    <el-form-item label="用户名称">
      <el-input v-model="queryForm.username" placeholder="用户名称"></el-input>
    </el-form-item>

    <el-form-item label="角色">
      <el-select v-model="queryForm.role" placeholder="角色">
        <el-option label="全部" value="0"></el-option>
        <el-option label="推广员" value="1"></el-option>
        <el-option label="股东" value="2"></el-option>
        <el-option label="代理" value="3"></el-option>
      </el-select>
    </el-form-item>

    <el-form-item>
      <el-button type="primary" @click="search">查询</el-button>
    </el-form-item>
  </el-form>

    <el-table border :data="tableData" style="width: 100%">
      <el-table-column
        prop="username"
        label="用户名称"
        width="120">
      </el-table-column>

      <el-table-column
        label="是否是推广员"
        width="110">
        <template slot-scope="scope">
          <i class="el-icon-error" v-if="!scope.row.isPromoter"></i>
          <i class="el-icon-success" v-if="scope.row.isPromoter"></i>
        </template>

      </el-table-column>

      <el-table-column
        prop="isShareholder"
        label="是否是股东"
        width="100">
        <template slot-scope="scope">
          <i class="el-icon-error" v-if="!scope.row.isShareholder"></i>
          <i class="el-icon-success" v-if="scope.row.isShareholder"></i>
        </template>
      </el-table-column>

      <el-table-column
        prop="isAgent"
        label="是否是代理"
        width="100">
        <template slot-scope="scope">
          <i class="el-icon-error" v-if="!scope.row.isAgent"></i>
          <i class="el-icon-success" v-if="scope.row.isAgent"></i>
        </template>
      </el-table-column>

      <el-table-column
        label="总佣金"
        width="120">
        <template slot-scope="scope">
          <span class="color-red">{{scope.row.commissionCount}}</span>
        </template>
      </el-table-column>

      <el-table-column
        label="可提现佣金"
        width="120">
        <template slot-scope="scope">
          <span class="color-green">{{scope.row.canWithdrawCommissionCount}}</span>
        </template>
      </el-table-column>

      <el-table-column
        label="已提现佣金"
        width="120">
        <template slot-scope="scope">
          <span class="color-blue">{{scope.row.withdrawCommissionCount}}</span>
        </template>
      </el-table-column>

      <el-table-column
        prop="distributionCommissionCount"
        label="分销佣金"
        width="120">
      </el-table-column>

      <el-table-column
        prop="shareholderDividendCount"
        label="股东分红"
        width="120">
      </el-table-column>

      <el-table-column
        prop="globalDividendCount"
        label="股东全球分红"
        width="120">
      </el-table-column>

      <el-table-column
        prop="agentCommissionCount"
        label="区域代理佣金"
        width="120">
      </el-table-column>

      <el-table-column label="操作" fixed="right"
          width="200">
          <template slot-scope="scope">
              <el-button size="mini" @click="handleEdit(scope.$index, scope.row)" v-if="scope.row.isPromoter">账户详情</el-button>
              <el-button size="mini" @click="handleEdit(scope.$index, scope.row)" v-if="scope.row.isPromoter">分销佣金</el-button>

              <div v-if="scope.row.isShareholder" class="margin-top-5">
                <el-button size="mini" @click="handleEdit(scope.$index, scope.row)" >股东分红</el-button>
                <el-button size="mini" @click="handleEdit(scope.$index, scope.row)" >全球分红</el-button>
              </div>

              <div v-if="scope.row.isAgent" class="margin-top-5">
                <el-button size="mini" @click="handleEdit(scope.$index, scope.row)" >代理佣金</el-button>
              </div>
          </template>
      </el-table-column>
    </el-table>
  </div>
</template>

<script>
export default {
  name: 'list',
  data () {
    return {
      searchKeyword: '',
      queryForm: {},
      tableData: [{
        username: 'sudo',
        isPromoter: true,
        isShareholder: false,
        isAgent: false,
        commissionCount: '74.54',
        canWithdrawCommissionCount: '74.54',
        withdrawCommissionCount: '0.00',
        distributionCommissionCount: '74.54',
        shareholderDividendCount: '0.00',
        globalDividendCount: '0.00',
        agentCommissionCount: '0.000'
      }, {
        username: 'Dannychan',
        isPromoter: true,
        isShareholder: false,
        isAgent: false,
        commissionCount: '2.60',
        canWithdrawCommissionCount: '2.60',
        withdrawCommissionCount: '0.00',
        distributionCommissionCount: '2.60',
        shareholderDividendCount: '0.00',
        globalDividendCount: '0.00',
        agentCommissionCount: '0.00'
      }, {
        username: 'yyy',
        isPromoter: true,
        isShareholder: true,
        isAgent: true,
        commissionCount: '4283.54',
        canWithdrawCommissionCount: '4283.54',
        withdrawCommissionCount: '0.00',
        distributionCommissionCount: '900.00',
        shareholderDividendCount: '33.75',
        globalDividendCount: '3347.33',
        agentCommissionCount: '2.46'
      }, {
        username: 'mingbolang',
        isPromoter: true,
        isShareholder: false,
        isAgent: true,
        commissionCount: '0.00',
        canWithdrawCommissionCount: '0.00',
        withdrawCommissionCount: '0.00',
        distributionCommissionCount: '0.00',
        shareholderDividendCount: '0.00',
        globalDividendCount: '0.00',
        agentCommissionCount: '0.00'
      }, {
        username: 'admin',
        isPromoter: true,
        isShareholder: true,
        isAgent: false,
        commissionCount: '1751.61',
        canWithdrawCommissionCount: '1751.61',
        withdrawCommissionCount: '0.00',
        distributionCommissionCount: '71.94',
        shareholderDividendCount: '0.00',
        globalDividendCount: '1679.67',
        agentCommissionCount: '0.00'
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
.color-red {
  color: #f85606;
}
.color-green {
  color: #22c522;
}
.color-blue {
  color: #27a9e3;
}
.el-icon-success {
  color: #468847;
}
.margin-top-5 {
  margin-top: 5px;
}
</style>
