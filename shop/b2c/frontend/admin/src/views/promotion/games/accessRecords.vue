<template>
  <div>
    <el-tabs v-model="tabActiveName" @tab-click="switchTab">
      <el-tab-pane label="全部" name="first" />
      <el-tab-pane label="中奖的" name="second" />
      <el-tab-pane label="未中奖" name="third" />
    </el-tabs>

    <el-row :gutter="8">
      <el-col :span="10" :offset="12">
        <el-input v-model="searchKeyword" size="small" placeholder="请输入会员昵称" />
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
        prop="info"
        label="获奖信息" />

      <el-table-column
        prop="type"
        label="消耗积分"
        width="120" />

      <el-table-column
        prop="date"
        label="参与时间"
        width="240" />
    </el-table>
  </div>
</template>

<script>
export default {
  name: 'AccessRecords',
  data () {
    return {
      searchKeyword: '',
      tableData: [{
        info: '【cqinter】未中奖',
        date: '2018-07-30 18:23:04'
      }, {
        info: '【cqinter】获得10，奖励赠品【上衣女夏2017新款枣红色韩版灯笼袖压褶方领宽松半袖百搭雪纺衫】',
        date: '2018-07-30 18:23:09'
      }, {
        info: '【cqinter】获得10，奖励￥5.00余额红包',
        date: '2018-07-30 18:23:11'
      }, {
        info: '【cqinter】获得10，奖励20积分',
        date: '2018-07-30 18:23:22'
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
