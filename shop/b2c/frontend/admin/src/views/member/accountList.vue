<template>
  <div>
    <el-row type="flex" justify="space-between">
      <el-col :xs="8" :sm="6" :md="4" :lg="3" :xl="2">
        &emsp;
      </el-col>

      <el-col :xs="2" :sm="4" :md="6" :lg="8" :xl="13">
        &emsp;
      </el-col>

      <el-col :xs="6" :sm="8" :md="10" :lg="10" :xl="7">
        <el-form ref="editForm" :model="queryForm" label-width="100px" size="small" label-position="right">
          <el-form-item label="发生时间">
            <el-date-picker
              v-model="queryForm.dateRange"
              :picker-options="pickerOptions"
              size="small"
              type="daterange"
              align="right"
              unlink-panels
              range-separator="至"
              start-placeholder="开始日期"
              end-placeholder="结束日期"/>
          </el-form-item>
        </el-form>
      </el-col>

      <el-col :xs="8" :sm="6" :md="4" :lg="3" :xl="2">
        <el-popover
          v-model="moreQueryPopoverVisible"
          placement="bottom"
          width="400"
          trigger="click">
          <el-form ref="editForm" :model="queryForm" label-width="100px" size="small" label-position="right">
            <el-form-item label="会员昵称">
              <el-input v-model="queryForm.username" />
            </el-form-item>

            <el-form-item label="发生类别">
              <el-select v-model="queryForm.category" clearable placeholder="请选择">
                <el-option :value="1" label="商城订单" />
                <el-option :value="2" label="订单退还" />
                <el-option :value="3" label="兑换" />
                <el-option :value="4" label="充值" />
                <el-option :value="5" label="签到" />
                <el-option :value="6" label="分享" />
                <el-option :value="7" label="注册" />
                <el-option :value="8" label="提现" />
                <el-option :value="9" label="提现退还" />
                <el-option :value="10" label="调整" />
                <el-option :value="11" label="参与营销游戏消耗积分" />
                <el-option :value="12" label="点赞" />
                <el-option :value="13" label="评论" />
              </el-select>
            </el-form-item>

            <el-form-item>
              <el-button type="primary" @click="moreQueryPopoverVisible = false">确定</el-button>
            </el-form-item>
          </el-form>
          <el-button slot="reference" icon="el-icon-arrow-down" size="small" />
        </el-popover>
        <el-button type="primary" size="small" @click="search">查询</el-button>
      </el-col>
    </el-row>

    <el-table :data="tableData" border style="width: 100%">

      <el-table-column
        prop="username"
        label="会员昵称" />

      <el-table-column
        prop="category"
        label="类别"
        width="120" />

      <el-table-column
        label="描述">
        <template slot-scope="scope">
          {{ scope.row.description }}
        </template>
      </el-table-column>

      <el-table-column
        label="金额"
        width="180">
        <template slot-scope="scope">
          <span>{{ (scope.row.type ? '+' : '-') + scope.row.number }}</span>
        </template>
      </el-table-column>

      <el-table-column
        prop="date"
        label="时间"
        width="140" />

    </el-table>
  </div>
</template>

<script>
export default {
  name: 'List',
  data () {
    return {
      searchKeyword: '',
      pickerOptions: {
        shortcuts: [{
          text: '最近一周',
          onClick (picker) {
            const end = new Date()
            const start = new Date()
            start.setTime(start.getTime() - 3600 * 1000 * 24 * 7)
            picker.$emit('pick', [start, end])
          }
        }, {
          text: '最近一个月',
          onClick (picker) {
            const end = new Date()
            const start = new Date()
            start.setTime(start.getTime() - 3600 * 1000 * 24 * 30)
            picker.$emit('pick', [start, end])
          }
        }, {
          text: '最近三个月',
          onClick (picker) {
            const end = new Date()
            const start = new Date()
            start.setTime(start.getTime() - 3600 * 1000 * 24 * 90)
            picker.$emit('pick', [start, end])
          }
        }]
      },
      moreQueryPopoverVisible: false,
      queryForm: {},
      tableData: [{
        username: 'xxx',
        category: '调整',
        description: '',
        type: 1,
        number: '9999.00',
        date: '2018-09-01 18:15:14'
      }, {
        username: 'ymeng22',
        category: '商城订单',
        description: '商城订单',
        type: 0,
        number: '90.00',
        date: '2018-07-31 09:26:00'
      }, {
        username: 'cqinter',
        category: '参与营销游戏消耗积分',
        description: '参与【平图案】营销游戏，获得【10】作为奖励，赠送5.00余额红包',
        type: 1,
        number: '5.00',
        date: '2018-07-30 18:23:04'
      }, {
        username: 'ymeng22',
        category: '调整',
        description: '',
        type: 1,
        number: '1000.00',
        date: '2018-07-30 14:11:14'
      }, {
        username: 'huge',
        category: '订单退还',
        description: '订单退款【订单号：2018072415090001】',
        type: 1,
        number: '330.00',
        date: '2018-07-24 15:20:19'
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
