<template>
  <div>
    <el-row :gutter="8">
      <el-col :span="12">
        <el-button type="danger" size="small">批量删除</el-button>
        <el-button type="primary" size="small" @click="$router.push('edit.html')">添加商品标签</el-button>
      </el-col>

      <el-col :span="10">
      </el-col>
      <el-col :span="2">
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
        label="标签名称">
      </el-table-column>

     <el-table-column prop="sort" label="排序" width="180">
      </el-table-column>

      <el-table-column label="操作" fixed="right"
          width="180">
          <template slot-scope="scope">
              <el-button size="mini" @click="handleEdit(scope.$index, scope.row)">修改</el-button>
              <el-button size="mini" @click="handleDelete(scope.$index, scope.row)">删除</el-button>
          </template>
      </el-table-column>
    </el-table>
  </div>
</template>

<script>
export default {
  name: 'labelList',
  data () {
    return {
      searchKeyword: '',
      tableData: [{
        name: 'hot',
        sort: 1
      }, {
        name: '牛逼的标签',
        sort: 1
      }, {
        name: 'ok',
        sort: 1
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
