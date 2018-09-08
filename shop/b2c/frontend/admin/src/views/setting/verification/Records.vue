<template>
    <div>
      <el-row :gutter="8">
        <el-col :span="12">
        </el-col>

        <el-col :span="10"><el-input size="small" v-model="searchKeyword" placeholder="输入虚拟商品名称"></el-input></el-col>
        <el-col :span="2">
          <el-button type="primary" size="small" @click="search">查询</el-button>
        </el-col>
      </el-row>

      <br/>

        <el-table border :data="tableData" style="width: 100%">

          <el-table-column
              prop="goods"
              label="虚拟商品">
            </el-table-column>

          <el-table-column
              prop="possessor"
              label="商品所有人"
              width="120">
            </el-table-column>

          <el-table-column
              prop="verifier"
              label="核销员"
              width="120">
            </el-table-column>

          <el-table-column
              prop="count"
              label="核销次数/次"
              width="100">
            </el-table-column>

            <el-table-column
                      label="核销状态"
                      width="100">
                <template slot-scope="scope">
                    <span v-show="scope.row.status===1">已使用</span>
                </template>
            </el-table-column>

            <el-table-column
              prop="notes"
              label="备注">
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
        goods: '321',
        possessor: 'aoeuaoeu',
        verifier: 'aoeuaoeu',
        count: 1,
        status: 1,
        notes: '虚拟商品核销'
      }]
    }
  },
  methods: {
    search () {
      console.log('search', this.searchKeyword)
    }
  }
}
</script>

<style lang="scss" scoped>

</style>
