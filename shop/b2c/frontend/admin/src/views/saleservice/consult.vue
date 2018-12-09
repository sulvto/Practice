<template>

  <div>
    <el-tabs v-model="activeName" @tab-click="handleClick">
      <el-tab-pane :name="0" label="全部咨询" />
      <el-tab-pane :name="1" label="未回复咨询" />
      <el-tab-pane :name="2" label="已回复咨询" />
    </el-tabs>

    <el-row :gutter="8">
      <el-col :span="12">
        <el-button type="danger" size="small">批量删除</el-button>
      </el-col>

      <el-col :span="12">
        <el-form :inline="true" :model="queryForm" size="small" >
          <el-form-item label="咨询时间">
            <el-date-picker
              v-model="queryForm.orderDateRange"
              :picker-options="datePickerOptions"
              type="daterange"
              align="right"
              unlink-panels
              range-separator="至"
              start-placeholder="开始日期"
              end-placeholder="结束日期" />
          </el-form-item>
          <el-form-item>
            <el-popover
              v-model="moreQueryPopoverVisible"
              placement="bottom"
              width="400"
              trigger="click">
              <el-form ref="editForm" :model="queryForm" label-width="100px" size="small" label-position="right">
                <el-form-item label="商品名称">
                  <el-input v-model="queryForm.goodsName" />
                </el-form-item>

                <el-form-item label="咨询类型">
                  <el-select v-model="queryForm.type" clearable placeholder="请选择">
                    <el-option label="商品咨询" value="1" />
                    <el-option label="支付问题" value="2" />
                    <el-option label="发票及保修" value="2" />
                  </el-select>
                </el-form-item>

                <el-form-item>
                  <el-button type="primary" @click="moreQueryPopoverVisible = false">确定</el-button>
                </el-form-item>
              </el-form>
              <el-button slot="reference" icon="el-icon-arrow-down" size="small" />
            </el-popover>
            <el-button type="primary" size="small" @click="search">查询</el-button>
          </el-form-item>
        </el-form>
      </el-col>
    </el-row>

    <br>

    <el-table :data="tableData" border style="width: 100%">
      <el-table-column
        type="selection"
        width="35" />

      <el-table-column label="商品">
        <template slot-scope="scope">
          <div>
            <a href="http://b2c.niuteam.cn/goods/goodsinfo?goodsid=27" target="_blank">Haier/海尔 BCD-206STPA 206升三门冷藏家用节能小冰箱 软冷冻</a>
          </div>
        </template>
      </el-table-column>

      <el-table-column
        prop="username"
        label="咨询用户"
        width="120" />

      <el-table-column
        prop="date"
        label="咨询时间"
        width="140" />

      <el-table-column
        label="咨询内容"
        width="180">
        <template slot-scope="scope">
          咨询内容: {{ scope.row.consultContent }}
          <br>
          回复内容: {{ scope.row.replyContent }}
        </template>
      </el-table-column>

      <el-table-column
        label="操作"
        fixed="right"
        width="180">
        <template slot-scope="scope">
          <el-button size="mini" @click="showReplyConsultDialog(scope.row)">回复</el-button>
          <el-button size="mini" @click="handleDelete(scope.$index, scope.row)">删除</el-button>
        </template>
      </el-table-column>
    </el-table>

    <el-dialog :visible.sync="dialogReplyConsultFormVisible" title="设置商品折扣" size="small" >
      <el-form ref="replyConsultForm" :model="replyConsultForm" size="small" label-width="100px" >

        <el-form-item label="咨询内容">
          {{ replyConsultForm.consultContent }}
        </el-form-item>

        <el-form-item label="咨询内容">
          <el-input v-model="replyConsultForm.replyContent" type="textarea" />
        </el-form-item>

      </el-form>
      <div slot="footer" class="dialog-footer">
        <el-button size="small" @click="dialogReplyConsultFormVisible = false">取 消</el-button>
        <el-button size="small" type="primary" @click="saveReplyConsult">保 存</el-button>
      </div>
    </el-dialog>
  </div>
</template>

<script>
export default {
  name: 'Consult',
  data () {
    return {
      searchKeyword: '',
      dialogReplyConsultFormVisible: false,
      moreQueryPopoverVisible: false,
      replyConsultForm: {},
      queryForm: {},
      tableData: [{
        goodsName: 'Haier/海尔 BCD-206STPA 206升三门冷藏家用节能小冰箱 软冷冻',
        username: 'thy',
        date: '2018-09-17 10:20:26',
        consultContent: 'ddd'
      }, {
        goodsName: 'Haier/海尔 BCD-206STPA 206升三门冷藏家用节能小冰箱 软冷冻',
        username: 'admin',
        date: '2018-09-17 10:20:26',
        consultContent: 'aaaaaaaaaaaa'
      }],
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
      }
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
    },
    showReplyConsultDialog (consult) {
      this.replyConsultForm.consult = consult
      this.replyConsultForm.consultContent = consult.consultContent
      this.replyConsultForm.replyContent = consult.replyContent
      this.dialogReplyConsultFormVisible = true
    },
    saveReplyConsult () {
      this.replyConsultForm.consult.replyContent = this.replyConsultForm.replyContent
      console.log(this.tableData)
      this.dialogReplyConsultFormVisible = false
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
