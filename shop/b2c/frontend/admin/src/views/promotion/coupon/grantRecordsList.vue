<template>
  <div>

    <el-tabs v-model="tabActiveName" @tab-click="switchTab">
      <el-tab-pane label="全部" name="first"></el-tab-pane>
      <el-tab-pane label="未使用" name="second"></el-tab-pane>
      <el-tab-pane label="已使用" name="third"></el-tab-pane>
      <el-tab-pane label="已过期" name="fourth"></el-tab-pane>
    </el-tabs>

    <el-row>
        <el-button type="primary" size="small">添加优惠券</el-button>
    </el-row>

    <br/>

    <el-table border :data="tableData" style="width: 100%">
      <el-table-column prop="name" label="优惠券名称" > </el-table-column>
      <el-table-column prop="receiveUser" label="领取人" > </el-table-column>
      <el-table-column prop="code" label="优惠券编码" width="120"> </el-table-column>
      <el-table-column prop="type" label="面额" width="120"> </el-table-column>
      <el-table-column prop="obtainWay" label="获取方式" width="120"> </el-table-column>
      <el-table-column prop="status" label="状态" width="120"> </el-table-column>
      <el-table-column prop="receiveDate" label="领取时间" width="140"> </el-table-column>
      <el-table-column prop="useDate" label="使用时间" width="140"> </el-table-column>
    </el-table>
  </div>
</template>

<script>
export default {
  name: 'couponyGrantList',
  data () {
    return {
      tabActiveName: 'first',
      tableData: [{
        name: '满88元减2元',
        receiveUser: 'fscmdl',
        code: '1533206833698',
        money: '2.0',
        obtainWay: '首页领取',
        status: '未领用',
        receiveDate: '2018-08-01 11:46:46',
        useDate: '2018-08-14 11:46:49'
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
    switchTab () {
    }
  }
}
</script>

<style lang="scss" scoped>
</style>
