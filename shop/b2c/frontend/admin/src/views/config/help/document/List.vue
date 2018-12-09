<template>
  <div>
    <el-row :gutter="8">
      <el-col :span="12">
        <el-button type="danger" size="small">批量删除</el-button>
        <el-button type="primary" size="small" @click="$router.push('edit.html')">添加帮助内容</el-button>
      </el-col>

      <el-col :span="10" />
      <el-col :span="2" />
    </el-row>

    <br>

    <el-table :data="tableData" border style="width: 100%">
      <el-table-column
        type="selection"
        width="35" />

      <el-table-column
        label="标题">
        <template slot-scope="scope">
          <el-input v-model="scope.row.title" size="small" />
        </template>
      </el-table-column>

      <el-table-column
        prop="classify"
        label="分类"
        width="180" />

      <el-table-column
        label="排序"
        width="120">
        <template slot-scope="scope">
          <el-input v-model="scope.row.sort" type="number" style="width: 80px;" size="small" />
        </template>
      </el-table-column>

      <el-table-column
        label="操作"
        fixed="right"
        width="250">
        <template slot-scope="scope">
          <el-button size="mini" @click="handleDelete(scope.$index, scope.row)">预览</el-button>
          <el-button size="mini" @click="handleEdit(scope.$index, scope.row)">修改</el-button>
          <el-button size="mini" @click="handleDelete(scope.$index, scope.row)">删除</el-button>
        </template>
      </el-table-column>
    </el-table>
  </div>
</template>

<script>
export default {
  name: 'List',
  data () {
    return {
      searchKeyword: '',
      tableData: [{
        title: '微信登录',
        classify: 'true',
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
