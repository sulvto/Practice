<template>
  <div>
    <el-row :gutter="8">
      <el-col :span="12">
        <el-button type="danger" size="small">批量删除</el-button>
        <el-button type="primary" size="small" @click="$router.push('edit.html')">添加友情链接</el-button>
      </el-col>

      <el-col :span="10">
        <el-input v-model="searchKeyword" size="small" placeholder="请输入物流公司名称或编号" />
      </el-col>

      <el-col :span="2">
        <el-button type="primary" size="small" @click="search">查询</el-button>
      </el-col>
    </el-row>

    <br>

    <el-table :data="tableData" border style="width: 100%">
      <el-table-column
        type="selection"
        width="35" />

      <el-table-column
        prop="name"
        label="链接名称"
        width="120" />
      <el-table-column
        prop="link"
        label="链接地址" />
      <el-table-column
        label="是否打开新窗口"
        width="120">
        <template slot-scope="scope">
          <el-switch v-model="scope.row.isBlank" />
        </template>
      </el-table-column>
      <el-table-column
        label="是否显示"
        width="120">
        <template slot-scope="scope">
          <el-switch v-model="scope.row.isShow" />
        </template>
      </el-table-column>

      <el-table-column
        prop="sort"
        label="排序"
        width="180" />

      <el-table-column
        label="操作"
        fixed="right"
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
  name: 'List',
  data () {
    return {
      searchKeyword: '',
      tableData: [{
        name: 'baidu',
        link: 'baidu.com',
        isBlank: true,
        isShow: true,
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
