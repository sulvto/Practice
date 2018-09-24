<template>
  <div>
    <el-row :gutter="8">
      <el-col :span="6">
        &nbsp;
      </el-col>

      <el-col :span="18">
        <el-form :inline="true" :model="queryForm" size="small" >
          <el-form-item label="下单时间">
            <el-date-picker
              v-model="queryForm.orderDateRange"
              type="daterange"
              align="right"
              unlink-panels
              range-separator="至"
              start-placeholder="开始日期"
              end-placeholder="结束日期"
              :picker-options="datePickerOptions">
            </el-date-picker>
          </el-form-item>

          <el-form-item label="订单编号">
            <el-input v-model="queryForm.orderNo"></el-input>
          </el-form-item>

          <el-form-item>
            <el-button type="primary" size="small" @click="search">查询</el-button>
          </el-form-item>
        </el-form>
      </el-col>
    </el-row>

    <el-table border :data="tableData" style="width: 100%">

      <el-table-column
        prop="orderNo"
        label="订单编号">
      </el-table-column>

      <el-table-column
        prop="username"
        label="用户名"
        width="150">
      </el-table-column>

      <el-table-column
        prop="amount"
        label="开票金额"
        width="120">
      </el-table-column>

      <el-table-column
        prop="title"
        label="抬头">
      </el-table-column>

      <el-table-column
        prop="content"
        label="发票内容">
      </el-table-column>

      <el-table-column
        prop="taxpayerIdentificationNumber"
        label="纳税人识别号"
        width="120">
      </el-table-column>

      <el-table-column
        prop="createDate"
        label="创建时间"
        width="140">
      </el-table-column>

      <el-table-column
        label="操作"
        fixed="right"
        width="80">
      </el-table-column>
    </el-table>
  </div>
</template>

<script>
export default {
  name: 'invoiceList',
  data () {
    return {
      searchKeyword: '',
      queryForm: {},
      datePickerOptions: {
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
      tableData: [
        {
          orderNo: '2018060510540001',
          amount: '20919.71',
          username: 'admin',
          title: '423423',
          content: '恩都是多',
          createDate: '2018-06-05 10:54:04',
          taxpayerIdentificationNumber: '34423'
        }
      ]
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
</style>
