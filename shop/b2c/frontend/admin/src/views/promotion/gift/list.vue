<!-- <th width="20%" style="text-align:left;"><button class="btn-common btn-small" onclick="location.href='/promotion/addgift.html';" style="margin:0 5px 0 0 !important;">添加赠品</button> -->
<!-- <button class="btn-common-delete btn-small" onclick="batchDelete()" style="margin:0 5px 0 0 !important;">批量删除</button> -->

<template>
  <div>

    <!-- 模态框（Modal） -->
    <div v-show="false" class="modal fade hide" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
      <div class="modal-dialog">
        <div class="modal-content">
          <div class="modal-header">
            <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
            <h3>赠品详情</h3>
          </div>
          <div class="modal-body">
            <div class="modal-infp-style">
              <table>
                <tbody>
                  <tr>
                    <td>活动名称</td>
                    <td data-id="gift_name" />
                  </tr>
                  <tr>
                    <td>有效期</td>
                    <td data-id="time" />
                  </tr>
                  <tr>
                    <td>领取有效期</td>
                    <td data-id="days" />
                  </tr>
                  <tr>
                    <td>领取限制</td>
                    <td data-id="max_num" />
                  </tr>
                  <tr>
                    <td colspan="2">赠品</td>
                  </tr>
                  <tr id="goods_list">
                    <td>&emsp;</td>
                    <td>商品名称</td>
                  </tr>
                </tbody>
              </table>
            </div>
          </div>
          <div class="modal-footer">
            <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
          </div>
        </div>
      </div>
    </div>
    <el-row :gutter="8">
      <el-col :span="12">
        <el-button type="danger" size="small">批量删除</el-button>
        <el-button type="primary" size="small" @click="$router.push('edit.html')">添加赠品</el-button>
      </el-col>

      <el-col :span="10">
        <el-input v-model="searchKeyword" size="small" placeholder="请输入赠品名称" />
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
        prop="name"
        label="活动名称" />

      <el-table-column
        label="活动状态"
        width="120">
        <template slot-scope="scope">
          <span v-if="scope.row.status === 1">进行中</span>
          <span v-if="scope.row.status === 2">已关闭</span>
          <span v-if="scope.row.status === 3">已结束</span>
        </template>
      </el-table-column>

      <el-table-column
        label="已赠送"
        width="120">
        <template slot-scope="scope">-</template>
      </el-table-column>

      <el-table-column
        label="已领取"
        width="120">
        <template slot-scope="scope">-</template>
      </el-table-column>

      <el-table-column
        label="有效时间"
        width="210">
        <template slot-scope="scope">
          开始时间：{{ scope.row.startDate }}
          <br>
          结束时间：{{ scope.row.endDate }}
        </template>
      </el-table-column>

      <el-table-column
        label="操作"
        width="220">
        <template slot-scope="scope">
          <el-button size="mini" @click="handleEdit(scope.$index, scope.row)">编辑</el-button>
          <el-button size="mini" @click="handleEdit(scope.$index, scope.row)">详情</el-button>
          <el-button v-if="scope.row.status !== 1" size="mini" @click="handleEdit(scope.$index, scope.row)">删除</el-button>
          <el-button size="mini" class="margin-top-5" @click="$router.push('records.html?id=' + scope.row.id)">发放记录</el-button>
        </template>
      </el-table-column>
    </el-table>
  </div>
</template>

<script>
export default {
  name: 'GiftList',
  data () {
    return {
      searchKeyword: '',
      tableData: [{
        id: '1',
        startDate: '2018-08-20 10:32:19',
        endDate: '2018-08-31 10:32:21',
        name: 's',
        status: 3
      }, {
        id: '2',
        startDate: '2018-08-09 14:20:34',
        endDate: '2018-08-29 14:20:35',
        name: 'eqweqe',
        status: 3
      }, {
        id: '3',
        startDate: '2018-05-01 00:00:00',
        endDate: '2019-06-21 00:00:00',
        name: '132',
        status: 1
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
