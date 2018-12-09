<template>
  <div>
    <el-row :gutter="8">
      <el-col :span="12">
        <el-button type="danger" size="small">批量删除</el-button>
        <el-button type="primary" size="small" @click="$router.push('edit.html')">添加供货商</el-button>
      </el-col>

      <el-col :span="10">
        <el-input v-model="searchKeyword" size="small" placeholder="请输入供货商名称" />
      </el-col>
      <el-col :span="2">
        <el-button type="primary" size="small" @click="search">查询</el-button>
      </el-col>
    </el-row>

    <br>

    <el-table
      :data="tableData"
      border
      style="width: 100%">
      <el-table-column
        type="selection"
        width="35" />

      <el-table-column
        prop="name"
        label="供货商名称"
        width="120" />

      <el-table-column
        prop="contacts"
        label="联系人"
        width="120"/>

      <el-table-column
        prop="contactNumber"
        label="联系电话"
        width="120"/>

      <el-table-column
        prop="address"
        label="联系地址"
        width="120"/>

      <el-table-column
        prop="description"
        label="供货商描述"
        width="120"/>

      <el-table-column
        label="操作"
        fixed="right"
        width="180">
        <template slot-scope="scope">
          <el-button size="mini" @click="handleEdit(scope.$index, scope.row)">修改</el-button>
          <el-button size="mini" @click="handleEdit(scope.$index, scope.row)">删除</el-button>
        </template>
      </el-table-column>
    </el-table>
  </div>
</template>

<script>
export default {
  name: 'SupplierList',
  data () {
    return {
      searchKeyword: '',
      tableData: [{
        name: 'test',
        contacts: '王浚凯',
        contactNumber: 13562621901,
        description: '',
        address: '地址在那儿？'
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
