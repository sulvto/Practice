<template>
  <div>
    <el-row :gutter="8">
      <el-col :span="12">
        <el-button type="primary" size="small">关闭全球分红(开启中)</el-button>
        <el-button type="primary" size="small">开启全球分红(关闭中)</el-button>
      </el-col>

    </el-row>

    <br>

    <el-table :data="tableData" border style="width: 100%">

      <el-table-column
        prop="shopId"
        label="店铺Id"
        width="120" />

      <el-table-column
        prop="startDate"
        label="分红开始时间"
        width="140" />

      <el-table-column
        prop="endDate"
        label="分红结束时间"
        width="140" />

      <el-table-column
        prop="count"
        label="分红总金额"
        width="120" />

      <el-table-column
        prop="createDate"
        label="创建时间"
        width="140" />

      <el-table-column
        label="操作"
        fixed="right"
        width="180">
        <template slot-scope="scope">
          <!-- <a href="/config/loginconfig.html?type=qq">配置</a> -->
          <el-button size="mini" @click="handleEdit(scope.$index, scope.row)">查看</el-button>
        </template>
      </el-table-column>
    </el-table>
  </div>
</template>

<script>
export default {
  name: 'Records',
  data () {
    return {
      searchKeyword: '',
      tableData: [{
        shopId: '0',
        startDate: '2017-07-01 00:00:00',
        endDate: '2018-07-17 00:00:00',
        createDate: '2018-07-17 10:09:09',
        count: '100.00'
      }, {
        shopId: '0',
        startDate: '2018-07-17 00:00:00',
        endDate: '2018-08-11 00:00:00',
        createDate: '2018-08-11 01:04:04',
        count: '1.00'
      }, {
        shopId: '0',
        startDate: '2018-08-11 00:00:00',
        endDate: '2018-08-20 00:00:00',
        createDate: '2018-08-20 10:08:02',
        count: '5.00'
      }, {
        shopId: '0',
        startDate: '2018-08-20 00:00:00',
        endDate: '2018-09-03 00:00:00',
        createDate: '2018-09-03 01:13:34',
        count: '21.00'
      }, {
        shopId: '0',
        startDate: '2018-09-03 00:00:00',
        endDate: '2018-09-05 00:00:00',
        createDate: '2018-09-05 14:28:59',
        count: '5000.00'
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
