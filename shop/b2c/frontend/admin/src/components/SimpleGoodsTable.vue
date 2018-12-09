<template>
  <el-table :data="tableData" border style="width: 100%">

    <el-table-column
      prop="name"
      label="商品名称" />

    <el-table-column
      prop="price"
      label="价格"
      width="120" />

    <el-table-column
      prop="stock"
      label="库存"
      width="120" />

    <el-table-column
      label="操作"
      fixed="right"
      width="180">
      <template slot-scope="scope">
        <el-button size="mini" @click="handleDelete(scope.$index, scope.row)">删除</el-button>
      </template>
    </el-table-column>
  </el-table>
</template>

<script>
export default {
  name: 'SimpleGoodsTable',
  props: {
    tableData: {
      type: Array,
      default: null
    }
  },
  data () {
    return {
    }
  },
  methods: {
    handleDelete (index) {
      this.tableData.splice(index, 1)
    }
  }
}
</script>
