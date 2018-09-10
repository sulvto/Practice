<template>
  <div>
    <el-row :gutter="8">
      <el-col :span="12">
      </el-col>

      <el-col :span="10"><el-input size="small" v-model="searchKeyword" placeholder="请输入物流公司名称或编号"></el-input></el-col>
      <el-col :span="2">
        <el-button type="primary" size="small" @click="search">查询</el-button>
      </el-col>
    </el-row>

    <br/>

    <el-table border :data="tableData" style="width: 100%">

      <el-table-column
            prop="username"
            label="账号">
          </el-table-column>

      <el-table-column
            prop="level"
            label="等级"
            width="120">
          </el-table-column>

      <el-table-column
            prop="shopName"
            label="店铺名称">
          </el-table-column>

      <el-table-column
            prop="phoneNumber"
            label="手机号"
            width="120">
          </el-table-column>

      <el-table-column
            prop="salesCount"
            label="销售总额"
            width="120">
          </el-table-column>

      <el-table-column
            prop="upper"
            label="上级推广员">
          </el-table-column>

      <el-table-column
            prop="applicationDate"
            label="申请时间"
            width="140">
          </el-table-column>

      <el-table-column
          label="状态"
          width="80">
          <template slot-scope="scope">
            <el-tag v-show="scope.row.status==1" type="success">审核中</el-tag>
            <el-tag v-show="scope.row.status==2" type="warning">已拒绝</el-tag>
          </template>
      </el-table-column>

      <el-table-column label="操作" fixed="right"
          width="180">
          <template slot-scope="scope">
            <el-button size="mini" @click="handleEdit(scope.$index, scope.row)" v-show="scope.row.status==1">通过</el-button>
            <el-button size="mini" @click="handleEdit(scope.$index, scope.row)" v-show="scope.row.status==1">拒绝</el-button>
            <el-button size="mini" @click="handleEdit(scope.$index, scope.row)" v-show="scope.row.status==2">删除</el-button>
          </template>
      </el-table-column>
    </el-table>

    <br/>
  </div>
</template>

<script>

export default {
  name: 'list',
  data () {
    return {
      searchKeyword: '',
      tableData: [{
        level: '中级分销商',
        username: 'test1112',
        phoneNumber: '12345678901',
        shopName: 'test1112',
        salesCount: 0,
        upper: '',
        applicationDate: '2018-09-06 20:29:01',
        status: 1
      }, {
        level: '高级分销商',
        username: 'dagege',
        phoneNumber: '',
        shopName: 'dagege',
        salesCount: 0,
        upper: '',
        applicationDate: '2018-09-06 20:29:01',
        status: 1
      }, {
        level: '中级分销商',
        username: 'xxx',
        phoneNumber: '',
        shopName: 'xxx',
        salesCount: 0,
        upper: 'ccc',
        applicationDate: '2018-07-30 14:21:56',
        status: 2
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

  },
  components: {
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
