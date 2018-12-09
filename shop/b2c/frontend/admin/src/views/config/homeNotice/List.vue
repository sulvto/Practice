<template>
  <div>
    <el-row :gutter="8">
      <el-col :span="12">
        <el-button type="danger" size="small">批量删除</el-button>
        <el-button type="primary" size="small" @click="$router.push('edit.html')">添加首页公告</el-button>
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
        prop="title"
        label="公告标题" />

      <el-table-column
        prop="createDate"
        label="创建时间"
        width="140" />

      <el-table-column
        prop="sort"
        label="排序"
        width="80" />

      <el-table-column
        label="操作"
        fixed="right"
        width="180">
        <template slot-scope="scope">
          <!-- <a href="/config/loginconfig.html?type=qq">配置</a> -->
          <el-button size="mini" @click="handleEdit(scope.$index, scope.row)">修改</el-button>
          <el-button size="mini" @click="handleEdit(scope.$index, scope.row)">删除</el-button>
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
      tableData: [{
        title: '骚货吃俺老孙一棒',
        createDate: '2018-09-03 15:16:28',
        sort: 0
      }, {
        title: 'test',
        createDate: '2018-09-02 12:07:29',
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
