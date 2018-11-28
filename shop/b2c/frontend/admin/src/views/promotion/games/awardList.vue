<template>
  <div>

    <el-table border :data="tableData" style="width: 100%">

      <el-table-column
        prop="name"
        label="游戏活动名称">
      </el-table-column>

      <el-table-column
        prop="level"
        label="奖励规则等级">
      </el-table-column>

      <el-table-column
        prop="award"
        label="奖励">
      </el-table-column>

      <el-table-column
        label="剩余奖品数/总奖品数">
        <template slot-scope="scope">
          {{scope.row.rest}}/{{scope.row.total}}
        </template>
      </el-table-column>

      <el-table-column
        label="操作">
          <template slot-scope="scope">
            <el-button size="mini" @click="handleEdit(scope.$index, scope.row)">编辑游戏活动</el-button>
          </template>
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
        name: '平图案',
        level: '10',
        award: '奖励 赠品',
        total: 10,
        rest: 1
      }, {
        name: '平图案',
        level: '10',
        award: '奖励 优惠券',
        total: 5,
        rest: 1
      }, {
        name: '平图案',
        level: '10',
        award: '奖励 ￥5.00余额红包',
        total: 15,
        rest: 1
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
