<template>
  <div>
    <el-row :gutter="8">
      <el-col :span="12">
        <el-button type="danger" size="small">批量删除</el-button>
        <el-button type="primary" size="small" @click="$router.push('edit.html')">添加专题</el-button>
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
        prop="title"
        label="标题">
      </el-table-column>

      <el-table-column
        prop="status"
        label="状态">
      </el-table-column>

      <el-table-column
        prop="createDate"
        label="创建时间">
      </el-table-column>

      <el-table-column
        prop="publishDate"
        label="发布时间">
      </el-table-column>

      <el-table-column label="操作" fixed="right"
          width="250">
          <template slot-scope="scope">
              <el-button size="mini" @click="handleEdit(scope.$index, scope.row)">预览</el-button>
              <el-button size="mini" @click="handleEdit(scope.$index, scope.row)">修改</el-button>
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
      searchKeyword: '',
      tableData: [{
        title: 'BEATI BLUE',
        status: '已发布',
        createDate: '2018-08-10 14:08:56',
        publishDate: '2018-08-10 14:08:56'
      }, {
        title: '又一专题',
        status: '未发布',
        createDate: '2018-08-20 14:00:48',
        publishDate: ''
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
