<template>
  <div>
    <el-row :gutter="8">
      <el-col :span="12">
        <el-button type="danger" size="small">批量删除</el-button>
        <el-button type="primary" size="small" @click="$router.push('edit.html')">添加规格</el-button>
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
        label="规格名称">
      </el-table-column>

      <el-table-column
        label="规格属性">
        <template slot-scope="scope">
            {{ scope.row.values.join(',') }}
        </template>
      </el-table-column>

      <el-table-column
          label="启用"
          width="80">
        <template slot-scope="scope">
            <el-switch v-model="scope.row.isEnable">
            </el-switch>
        </template>
      </el-table-column>

      <el-table-column
          label="是否参与筛选"
          width="110">
        <template slot-scope="scope">
          <div class="center-block" >
            <el-switch v-model="scope.row.status">
            </el-switch>
          </div>
        </template>
      </el-table-column>

      <el-table-column
        label="排序"
        width="70">
        <template slot-scope="scope">
          <el-input class="disable-input-spinner-button" type="number" v-model="scope.row.sort" size="small"></el-input>
        </template>
      </el-table-column>

      <el-table-column label="操作" fixed="right"
        width="180">
        <template slot-scope="scope">
          <el-button size="mini" @click="handleEdit(scope.$index, scope.row)">修改</el-button>
          <el-button size="mini" @click="handleDelete(scope.$index, scope.row)">删除</el-button>
        </template>
      </el-table-column>
    </el-table>

    <br/>

        <el-pagination
          class="center-block"
          @size-change="handleSizeChange"
          @current-change="handleCurrentChange"
          :current-page="currentPage4"
          :page-sizes="[5, 10, 20, 50]"
          :page-size="10"
          layout="total, sizes, prev, pager, next, jumper"
          :total="400">
        </el-pagination>

  </div>
</template>

<script>
export default {
  name: 'list',
  data () {
    return {
      searchKeyword: '',
      tableData: [{
        name: '颜色',
        values: ['玫瑰金', '黑色', '土豪金'],
        isEnable: true,
        sort: 1
      }, {
        name: '手机尺寸',
        values: ['4.5寸', '5.0寸', '5.5寸'],
        isEnable: true,
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
