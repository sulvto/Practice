																		<!-- <h4>操作提示</h4> -->
									<!-- <p>获奖记录</p> -->
<template>
  <div>
    <el-tabs v-model="tabActiveName" @tab-click="switchTab">
      <el-tab-pane label="全部" name="first"></el-tab-pane>
      <el-tab-pane label="中奖的" name="second"></el-tab-pane>
      <el-tab-pane label="未中奖" name="third"></el-tab-pane>
    </el-tabs>

    <el-row :gutter="8">
      <el-col :span="12">
      </el-col>

      <el-col :span="10">
        <el-input size="small" v-model="searchKeyword" placeholder="请输入会员昵称"></el-input>
      </el-col>
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
        label="获奖信息">
      </el-table-column>

      <el-table-column
        prop="type"
        label="消耗积分"
        width="120">
      </el-table-column>

      <el-table-column
        prop="info"
        label="参与时间"
        width="140">
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
        info: '【cqinter】未中奖',
        data: '2018-07-30 18:23:04'
      }, {
        info: '【cqinter】获得10，奖励赠品【上衣女夏2017新款枣红色韩版灯笼袖压褶方领宽松半袖百搭雪纺衫】',
        data: '2018-07-30 18:23:09'
      }, {
        info: '【cqinter】获得10，奖励￥5.00余额红包',
        data: '2018-07-30 18:23:11'
      }, {
        info: '【cqinter】获得10，奖励20积分',
        data: '2018-07-30 18:23:22'
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
