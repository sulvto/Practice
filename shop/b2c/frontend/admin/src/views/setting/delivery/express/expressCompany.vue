<template>
  <div>
    <el-row :gutter="8">
        <el-col :span="12">
          <el-button type="danger" size="small">批量删除</el-button>
          <el-button type="primary" size="small" @click="$router.push('editExpressCompany.html')">添加物流公司</el-button>
        </el-col>

        <el-col :span="10"><el-input size="small" v-model="searchKeyword" placeholder="请输入物流公司名称或编号"></el-input></el-col>
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
        label="物流公司"
        width="120">
      </el-table-column>

    <el-table-column
        prop="no"
        label="物流编号"
        width="120">
      </el-table-column>

    <el-table-column
        prop="tel"
        label="联系电话"
        width="150">
      </el-table-column>

    <el-table-column
        label="是否默认"
        width="80">
         <template slot-scope="scope">
            <span v-show="scope.row.isDefault">是</span>
            <span v-show="!scope.row.isDefault">否</span>
          </template>
      </el-table-column>

    <el-table-column
        label="是否启用"
        width="80">
        <template slot-scope="scope">
          <el-tag type="success" v-show="scope.row.isEnable">启用</el-tag>
          <el-tag type="danger" v-show="!scope.row.isEnable">未启用</el-tag>
        </template>
      </el-table-column>

    <el-table-column
        prop="sort"
        label="排序"
        width="50">
      </el-table-column>

      <el-table-column label="操作" >
          <template slot-scope="scope">
              <el-button size="mini" @click="handleEdit(scope.$index, scope.row)">打印模板</el-button>
              <el-button size="mini" @click="handleEdit(scope.$index, scope.row)">修改</el-button>
              <el-button size="mini" @click="handleEdit(scope.$index, scope.row)">运费模板</el-button>
              <el-button size="mini" @click="handleEdit(scope.$index, scope.row)">删除</el-button>
          </template>
      </el-table-column>
        </el-table>
  </div>
</template>

<script>
export default {
  name: 'expressCompanyList',
  data () {
    return {
      searchKeyword: '',
      tableData: [{
        logo: '/admin/images/wchat.png',
        name: '百世快递',
        status: true,
        tel: 123333333,
        isEnable: true,
        isDefault: true,
        sort: 1,
        no: 'BST'
      }, {
        logo: '/admin/images/wchat.png',
        name: '邮政快递',
        status: true,
        tel: 123333333,
        isEnable: true,
        isDefault: false,
        sort: 1,
        no: 'EMS'
      }, {
        logo: '/admin/images/wchat.png',
        name: '顺丰快递',
        status: true,
        tel: 123333333,
        isEnable: true,
        isDefault: false,
        sort: 1,
        no: 'SF'
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
      console.log('search :', this.searchKeyword)
    }
  }
}
</script>

<style lang="scss" scoped>

</style>
