<template>
    <div>
        <el-row>
            <el-button type="primary" size="small">添加商品类型</el-button>
        </el-row>

        <el-table border :data="tableData" style="width: 100%">

 <el-table-column
      prop="name"
      label="类型名称"
      width="120">
    </el-table-column>

 <el-table-column
      prop="tags"
      label="属性标签"
      width="120">
    </el-table-column>

    <el-table-column
        label="启用"
        width="180">
        <template slot-scope="scope">
            <el-switch v-model="scope.row.isEnable">
            </el-switch>
        </template>
    </el-table-column>

 <el-table-column
      prop="sort"
      label="排序"
      width="120">
    </el-table-column>

            <el-table-column label="操作"
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
  name: 'attributeList',
  data () {
    return {
      tableData: [
        {
          id: '1',
          name: '女装',
          isEnable: true,
          tags: '尺码,颜色',
          sort: '22'
        },
        {
          id: '1',
          name: '男装',
          isEnable: true,
          tags: '尺码,颜色',
          sort: '22'
        },
        {
          id: '1',
          name: '箱包',
          isEnable: true,
          tags: '颜色',
          sort: '22'
        },
        {
          id: '1',
          name: '电视',
          isEnable: true,
          tags: '尺寸,颜色',
          sort: '22'
        },
        {
          id: '1',
          name: '笔记本',
          isEnable: true,
          tags: '颜色,屏幕尺寸,重量',
          sort: '22'
        }
      ]
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
