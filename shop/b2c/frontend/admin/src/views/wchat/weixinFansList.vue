<template>
  <div>
    <el-row :gutter="8">
      <el-col :span="12">
        <el-button type="primary" size="small">更新粉丝列表</el-button>
      </el-col>

      <el-col :span="10">
        <el-input size="small" v-model="searchKeyword" placeholder="请输入粉丝名称"></el-input>
      </el-col>
      <el-col :span="2">
        <el-button type="primary" size="small" @click="search">查询</el-button>
      </el-col>
    </el-row>

    <br/>

    <el-table border :data="tableData" style="width: 100%">

      <el-table-column label="粉丝头像">
        <template slot-scope="scope">
          <!-- <img /> -->
        </template>
      </el-table-column>

      <el-table-column
        prop="name"
        label="粉丝名称">
      </el-table-column>

      <el-table-column
        prop="address"
        label="地址">
      </el-table-column>

      <el-table-column
        prop="status"
        label="关注状态"
        width="120">
      </el-table-column>

      <el-table-column
        prop="followDate"
          label="关注时间"
          width="140">
      </el-table-column>

      <el-table-column label="备注"
          width="180">
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
      tableData: [{
        address: '中国北京',
        name: '微信登录',
        status: '已关注',
        followDate: '2018-07-09 12:19:01'
      }, {
        address: '中国四川南充',
        name: 'mama',
        status: '已关注',
        followDate: '2018-10-19 15:12:15'
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
