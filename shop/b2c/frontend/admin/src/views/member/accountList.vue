<template>
  <div>
    <el-row type="flex" justify="space-between">
      <el-col :xs="8" :sm="6" :md="4" :lg="3" :xl="2">
      </el-col>

      <el-col :xs="2" :sm="4" :md="6" :lg="8" :xl="13">

      </el-col>

      <el-col :xs="6" :sm="8" :md="10" :lg="10" :xl="7">
        <el-form ref="editForm" :model="queryForm" label-width="100px" size="small" label-position="right">
          <el-form-item label="发生时间">
            <el-date-picker
              v-model="queryForm.dateRange"
              size="small"
              type="daterange"
              align="right"
              unlink-panels
              range-separator="至"
              start-placeholder="开始日期"
              end-placeholder="结束日期"
              :picker-options="pickerOptions">
            </el-date-picker>
          </el-form-item>
        </el-form>
      </el-col>

      <el-col :xs="8" :sm="6" :md="4" :lg="3" :xl="2">
        <el-popover
          placement="bottom"
          width="400"
          trigger="click"
          v-model="moreQueryPopoverVisible">
          <el-form ref="editForm" :model="queryForm" label-width="100px" size="small" label-position="right">
            <el-form-item label="会员昵称">
              <el-input v-model="queryForm.username"></el-input>
            </el-form-item>

            <el-form-item label="发生类别">
              <el-select v-model="queryForm.category" clearable placeholder="请选择">
                <el-option label="商城订单" :value="1"></el-option>
                <el-option label="订单退还" :value="2"></el-option>
                <el-option label="兑换" :value="3"></el-option>
                <el-option label="充值" :value="4"></el-option>
                <el-option label="签到" :value="5"></el-option>
                <el-option label="分享" :value="6"></el-option>
                <el-option label="注册" :value="7"></el-option>
                <el-option label="提现" :value="8"></el-option>
                <el-option label="提现退还" :value="9"></el-option>
                <el-option label="调整" :value="10"></el-option>
                <el-option label="参与营销游戏消耗积分" :value="11"></el-option>
                <el-option label="点赞" :value="12"></el-option>
                <el-option label="评论" :value="13"></el-option>
              </el-select>
            </el-form-item>

            <el-form-item>
              <el-button type="primary" @click="moreQueryPopoverVisible = false">确定</el-button>
            </el-form-item>
          </el-form>
          <el-button slot="reference" icon="el-icon-arrow-down" size="small" ></el-button>
        </el-popover>
        <el-button type="primary" size="small" @click="search">查询</el-button>
      </el-col>
    </el-row>

    <el-table border :data="tableData" style="width: 100%">

      <el-table-column
        prop="username"
        label="会员昵称">
      </el-table-column>

      <el-table-column
        prop="category"
        label="类别"
        width="120">
      </el-table-column>

      <el-table-column
          label="描述">
        <template slot-scope="scope">
            {{scope.row.description}}
        </template>
      </el-table-column>

      <el-table-column
          label="金额"
          width="180">
        <template slot-scope="scope">
            <span>{{(scope.row.type ? '+' : '-') + scope.row.number }}</span>
        </template>
      </el-table-column>

      <el-table-column
          prop="date"
          label="时间"
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
