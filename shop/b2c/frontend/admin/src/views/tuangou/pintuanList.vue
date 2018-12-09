                    <!-- <th align="left">
                        <nav class="order-nav">
                            <ul class="nav-ul">
                                <button class="btn-common" onclick="pintuanFinish(0, this)">全部</button>
                                <button class="btn-common-white" onclick="pintuanFinish(1, this)">未成团</button>
                                <button class="btn-common-white" onclick="pintuanFinish(2, this)">成团</button>
                                <button class="btn-common-white" onclick="pintuanFinish(-1, this)">失败</button>
                            </ul>
                        </nav>
                    </th> -->
                    <!-- <th>
                        创建时间：
                        <input type="text" id="startDate" class="input-common middle" placeholder="请选择开始日期" onclick="WdatePicker()">
                        &nbsp;-&nbsp;
                        <input type="text" id="endDate" placeholder="请选择结束日期" class="input-common middle" onclick="WdatePicker()">
                        团长名：<input id="group_name" class="input-common middle" type="text" value="">
                        <button onclick="searchData()" class="btn-common">搜索</button>
                    </th> -->
<template>
  <div>

    <el-row :gutter="8">
      <el-col :xs="7" :sm="7" :md="7" :lg="7" :xl="12">
        <el-button type="primary" size="small">全部</el-button>
        <el-button size="small">￼未成团</el-button>
        <el-button size="small">￼成团</el-button>
        <el-button size="small">￼失败</el-button>
      </el-col>

      <el-col :xs="17" :sm="17" :md="17" :lg="17" :xl="12">
        <el-form :inline="true" :model="queryForm" size="small" >
          <el-form-item label="创建时间">
            <el-date-picker
              v-model="queryForm.orderDateRange"
              :picker-options="datePickerOptions"
              type="daterange"
              align="right"
              unlink-panels
              range-separator="-"
              start-placeholder="开始日期"
              end-placeholder="结束日期"/>
          </el-form-item>
          <el-form-item label="团长名">
            <el-input v-model="queryForm.group_name" placeholder="团长名" />
          </el-form-item>
          <el-form-item>
            <el-button type="primary" @click="onSubmit">查询</el-button>
          </el-form-item>
        </el-form>
      </el-col>
    </el-row>

    <el-table :data="tableData" border style="width: 100%">

      <el-table-column
        type="selection"
        width="35" />

      <el-table-column prop="group_name" label="团长" />
      <el-table-column prop="user_tel" label="联系方式" />
      <el-table-column label="价格">
        <template slot-scope="scope">
          {{ scope.row.tuangou_money }}元
        </template>
      </el-table-column>
      <el-table-column label="成团">
        <template slot-scope="scope">
          {{ scope.row.status }} <br>
          已参团人数：{{ scope.row.real_num }} <br>
          团购总人数：{{ scope.row.tuangou_num }}
        </template>
      </el-table-column>
      <el-table-column prop="tuangou_type_name" label="拼团模式" width="120" />
      <el-table-column label="商品">
        <template slot-scope="scope">
          <a :href="scope.row.productLink" target="_brank">{{ scope.row.productName }}</a>
        </template>
      </el-table-column>
      <el-table-column prop="status" label="状态" />
      <el-table-column label="时间">
        <template slot-scope="scope">
          开团时间：
          <br>
          {{ scope.row.startDate }}
          <br>
          截团时间：
          <br>
          {{ scope.row.stopDate }}
        </template>
      </el-table-column>

      <el-table-column label="操作">
        <template slot-scope="scope">
          <el-button size="mini" @click="handleEdit(scope.$index, scope.row)">关闭首页推荐</el-button>
          <br>
          <el-button size="mini" @click="handleEdit(scope.$index, scope.row)">开启首页推荐</el-button>
          <br>
          <el-button size="mini" @click="handleEdit(scope.$index, scope.row)">拼团完成</el-button>
          <br>
          <el-button size="mini" @click="handleEdit(scope.$index, scope.row)">退款</el-button>
          <br>
          <el-button size="mini" @click="handleEdit(scope.$index, scope.row)">查看拼团订单</el-button>
        </template>
      </el-table-column>
    </el-table>
  </div>
</template>

<script>
// 失败 进行中 成功 已退款
export default {
  name: 'PintuanList',
  data () {
    return {
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
          logo: '/admin/images/wchat.png',
          group_name: 'admin',
          user_tel: '18927728163',
          tuangou_money: '888.00',
          status: '成功',
          productLink: 'http://baidu.com',
          productName: '测试一下',
          startDate: '2018-11-14 00:29:46',
          stopDate: '2018-11-14 00:29:50'
        }, {
          logo: '/admin/images/qq.png',
          group_name: 'admin',
          user_tel: '18927728163',
          tuangou_money: '66.00',
          status: '失败',
          productLink: 'http://baidu.com',
          productName: '测试一下',
          startDate: '2018-11-14 00:29:46',
          stopDate: '2018-11-14 00:29:50'
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
