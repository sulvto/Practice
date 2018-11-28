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
        prop="description"
        label="描述">
      </el-table-column>

      <el-table-column
        prop="number"
        label="数量"
        width="120">
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
        username: 'cqinter',
        category: '签到',
        number: '0.00',
        date: '2018-08-24 23:53:52',
        description: '签到赠送积分'
      }, {
        username: '123123',
        category: '签到',
        number: '0.00',
        date: '2018-08-24 10:28:51',
        description: '签到赠送积分'
      }, {
        username: 'yaodayizi',
        category: '注册',
        number: '100.00',
        date: '2018-08-23 16:18:11',
        description: '注册会员赠送积分'
      }, {
        username: 'weibin123',
        category: '注册',
        number: '100.00',
        date: '2018-08-22 19:45:33',
        description: '注册会员赠送积分'
      }, {
        username: 's51983',
        category: '注册',
        number: '100.00',
        date: '2018-08-21 17:30:40',
        description: '注册会员赠送积分'
      }, {
        username: '123123',
        category: '注册',
        number: '100.00',
        date: '2018-08-21 14:26:48',
        description: '注册会员赠送积分'
      }, {
        username: 'admin123',
        category: '调整',
        number: '11111.00',
        date: '2018-08-21 09:29:10',
        description: ''
      }, {
        username: 'huge',
        category: '评论',
        number: '0.00',
        date: '2018-08-20 10:56:07',
        description: '评论赠送积分'
      }, {
        username: 'mingbolang',
        category: '注册',
        number: '100.00',
        date: '2018-08-20 08:26:57',
        description: '注册会员赠送积分'
      }, {
        username: 'dagege',
        category: '注册',
        number: '100.00',
        date: '2018-08-17 21:57:00',
        description: '注册会员赠送积分'
      }, {
        username: 'hnxzhl',
        category: '注册',
        number: '100.00',
        date: '2018-08-17 21:51:16',
        description: '注册会员赠送积分'
      }, {
        username: 'afc',
        category: '注册',
        number: '100.00',
        date: '2018-08-17 11:01:58',
        description: '注册会员赠送积分'
      }, {
        username: 'qpchina',
        category: '商城订单',
        number: '1.00',
        date: '2018-08-14 16:44:16',
        description: '商城订单完成支付赠送积分,订单号：2018081416440001【订单号：<a href="/order/orderdetail?order_id=109">2018081416440001</a>】'
      }, {
        username: 'qpchina',
        category: '商城订单',
        number: '1.00',
        date: '2018-08-14 16:40:27',
        description: '商城订单完成支付赠送积分,订单号：2018081416400002【订单号：<a href="/order/orderdetail?order_id=108">2018081416400002</a>】'
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

.bg-purple-dark {
  background: #99a9bf;
}
.bg-purple {
  background: #d3dce6;
}
.bg-purple-light {
  background: #e5e9f2;
}
.grid-content {
  border-radius: 4px;
  min-height: 36px;
}
.row-bg {
  padding: 10px 0;
  background-color: #f9fafc;
}
</style>
