<template>
  <div>
    <el-row :gutter="8">
      <el-col :span="12">
        <el-button type="danger" size="small">批量删除</el-button>
        <el-button type="primary" size="small" @click="$router.push('typeList.html')">添加活动</el-button>
      </el-col>

      <el-col :span="10">
        <el-input size="small" v-model="searchKeyword" placeholder="请输入活动名称"></el-input>
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
        label="活动名称">
      </el-table-column>

      <el-table-column
        prop="type"
        label="游戏类型"
        width="120">
      </el-table-column>

      <el-table-column
        prop="memberLevel"
        label="参与的会员"
        width="95">
      </el-table-column>

      <el-table-column
        prop="deductIntegral"
        label="参与扣除积分"
        width="105">
      </el-table-column>

      <el-table-column
        label="活动状态"
        width="80">
        <template slot-scope="scope">
          <span v-if="scope.row.status === 1">未开始</span>
          <span v-if="scope.row.status === 2">已开始</span>
          <span v-if="scope.row.status === 3">已结束</span>
          <span v-if="scope.row.status === 4">已关闭</span>
        </template>
      </el-table-column>

      <el-table-column label="有效时间"
        width="210">
        <template slot-scope="scope">
          开始时间：{{scope.row.startDate}}
          <br>
          结束时间：{{scope.row.endDate}}
        </template>
      </el-table-column>

      <el-table-column label="操作" fixed="right"
          width="190">
          <template slot-scope="scope">
              <el-button size="mini" @click="handleEdit(scope.$index, scope.row)">编辑</el-button>
              <el-button size="mini" @click="handleEdit(scope.$index, scope.row)">奖项列表</el-button>
              <br/>
              <el-button size="mini" class="margin-top-5" @click="handleEdit(scope.$index, scope.row)" v-if="scope.row.status !== 2">删除</el-button>
              <el-button size="mini" class="margin-top-5" @click="handleEdit(scope.$index, scope.row)" v-if="scope.row.status === 2">关闭</el-button>
              <el-button size="mini" class="margin-top-5" @click="handleEdit(scope.$index, scope.row)" v-if="scope.row.status !== 1">获奖记录</el-button>
              <br/>
              <el-button size="mini" class="margin-top-5" @click="handleEdit(scope.$index, scope.row)" v-if="scope.row.status === 2">推广链接</el-button>
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
        deductIntegral: 20,
        memberLevel: '铜牌会员',
        name: '平图案',
        type: '刮刮卡',
        status: 3,
        startDate: '2018-07-26 15:33:18',
        endDate: '2018-07-31 15:33:20'
      }, {
        deductIntegral: 11,
        memberLevel: '所有用户',
        name: 'aa',
        type: '幸运砸蛋',
        status: 2,
        startDate: '2018-08-01 18:45:23',
        endDate: '2018-10-31 18:45:27'
      }, {
        deductIntegral: 1,
        memberLevel: '所有用户',
        name: '啊啊',
        type: '幸运大抽奖',
        status: 4,
        startDate: '2018-09-03 20:39:05',
        endDate: '2018-09-30 20:39:07'
      }, {
        deductIntegral: 1,
        memberLevel: '所有用户',
        name: '活动A',
        type: '刮刮卡',
        status: 1,
        startDate: '2018-09-20 02:39:20',
        endDate: '2018-09-29 02:39:26'
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

.margin-top-5 {
  margin-top:5px;
}
</style>
