<template>
  <div>
    <el-row :gutter="8">
      <el-col :span="12">
        <el-button type="primary" size="small" @click="$router.push('edit.html')">添加帮助类型</el-button>
      </el-col>

      <el-col :span="10">
      </el-col>
      <el-col :span="2">
      </el-col>
    </el-row>

    <br/>

    <el-table border :data="tableData" style="width: 100%">
      <el-table-column
        label="类型名称">
        <template slot-scope="scope">
          <el-input v-model="scope.row.name" style="width: 250px;" size="small"></el-input>
        </template>
      </el-table-column>

      <el-table-column
        label="排序"
        width="120">
        <template slot-scope="scope">
          <el-input type="number" v-model="scope.row.sort" style="width: 80px;" size="small"></el-input>
        </template>
      </el-table-column>

      <el-table-column label="操作" fixed="right"
          width="80">
          <template slot-scope="scope">
              <el-button size="mini" @click="handleDelete(scope.$index, scope.row)">删除</el-button>
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
      tableData: [{
        name: '新手上路',
        sort: 0
      }, {
        name: '配送与支付',
        sort: 2
      }, {
        name: '会员中心',
        sort: 3
      }, {
        name: '服务保证',
        sort: 4
      }, {
        name: '联系我们',
        sort: 5
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
