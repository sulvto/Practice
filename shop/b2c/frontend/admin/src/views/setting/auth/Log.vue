<template>
  <div>
    <el-row :gutter="8">
      <el-col :span="10">
        <el-button type="danger" size="small">批量删除</el-button>
      </el-col>

      <el-col :span="8">
        <span>操作时间</span>
        <el-date-picker style="width: 280px;" size="small"
          v-model="searchDateRange"
          type="daterange"
          align="right"
          unlink-panels
          range-separator="至"
          start-placeholder="开始日期"
          end-placeholder="结束日期">
        </el-date-picker>
      </el-col>

      <el-col :span="4">
        <el-input size="small" v-model="searchKeyword" placeholder="请输入用户名"></el-input>
      </el-col>
      <el-col :span="2">
        <el-button type="primary" size="small" @click="search">查询</el-button>
      </el-col>
    </el-row>

    <br/>

    <el-table border :data="tableData" style="width: 100%">
      <el-table-column
        type="selection"
        width="35">
      </el-table-column>

      <el-table-column
            prop="username"
            label="操作用户"
            width="120">
          </el-table-column>
      <el-table-column
            prop="operation"
            label="操作"
            width="120">
          </el-table-column>
      <el-table-column
            prop="ip"
            label="IP"
            width="120">
          </el-table-column>

      <el-table-column label="操作详情">
          <template slot-scope="scope">
            访问地址：
            <span style="color:red;">{{scope.row.url}}</span>
            <br>
            操作描述：
            <span style="color:blue;">{{scope.row.description}}</span>
          </template>
      </el-table-column>

      <el-table-column
            prop="date"
            label="时间"
            width="140">
          </el-table-column>

      <el-table-column label="操作" fixed="right"
          width="180">
          <template slot-scope="scope">
              <el-button size="mini" @click="handleEdit(scope.$index, scope.row)">删除</el-button>
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
      searchDateRange: [],
      searchKeyword: '',
      tableData: [{
        username: 'admin',
        operation: '用户/用户登录',
        date: '2018-09-08 13:23:05',
        ip: '222.211.233.73',
        url: 'http://showfx.niuteam.cn/admin/login/login',
        description: ''
      }, {
        username: 'admin',
        operation: '用户/用户登录',
        date: '2018-09-08 13:13:55',
        ip: '116.232.109.91',
        url: 'http://showfx.niuteam.cn/admin/login/login',
        description: ''
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

</style>
