<template>
  <div>
    <el-row :gutter="8">
      <el-col :span="12">
        <el-button type="danger" size="small">批量删除</el-button>
        <el-button type="primary" size="small" @click="$router.push('edit.html')">添加组合套餐</el-button>
      </el-col>

      <el-col :span="10">
        <el-input size="small" v-model="searchKeyword" placeholder="请输入組合套餐名称"></el-input>
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
        prop="name"
        label="组合套餐名称">
      </el-table-column>

      <el-table-column
        prop="price"
        label="组合套餐价格"
        width="120">
      </el-table-column>

      <el-table-column
          prop="status"
          label="状态"
          width="100">
      </el-table-column>

      <el-table-column
        prop="createDate"
        label="创建时间"
        width="140">
      </el-table-column>

      <el-table-column label="操作" fixed="right"
          width="180">
          <template slot-scope="scope">
              <el-button size="mini" @click="handleEdit(scope.$index, scope.row)">编辑</el-button>
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
        name: '推荐套餐',
        price: '500.00',
        status: '已上架',
        createDate: '2018-07-03 18:04:02'
      }, {
        name: '组合套餐',
        price: '400.00',
        status: '已下架',
        createDate: '2018-07-08 21:54:00'
      }, {
        name: '情侣',
        price: '600.00',
        status: '已上架',
        createDate: '2018-07-31 15:59:33'
      }, {
        name: '123',
        price: '2000.00',
        status: '已上架',
        createDate: '2018-08-01 11:16:33'
      }, {
        name: 'hjkhkhjk',
        price: '1053.00',
        status: '已上架',
        createDate: '2018-08-02 12:58:31'
      }, {
        name: '10000',
        price: '500.00',
        status: '已下架',
        createDate: '2018-08-10 14:06:34'
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
