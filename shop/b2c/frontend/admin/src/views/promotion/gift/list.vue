<!-- <th width="20%" style="text-align:left;"><button class="btn-common btn-small" onclick="location.href='/promotion/addgift.html';" style="margin:0 5px 0 0 !important;">添加赠品</button> -->
<!-- <button class="btn-common-delete btn-small" onclick="batchDelete()" style="margin:0 5px 0 0 !important;">批量删除</button> -->

<template>
  <div>

<!-- 模态框（Modal） -->
    <div class="modal fade hide" id="giftInfo" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
      <div class="modal-dialog">
        <div class="modal-content">
          <div class="modal-header">
            <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
            <h3>赠品详情</h3>
          </div>
          <div class="modal-body">
            <div class="modal-infp-style">
              <table>
                <tbody><tr>
                  <td>活动名称</td>
                  <td id="gift_name"></td>
                </tr>
                <tr>
                  <td>有效期</td>
                  <td id="time"></td>
                </tr>
                <tr>
                  <td>领取有效期</td>
                  <td id="days"></td>
                </tr>
                <tr>
                  <td>领取限制</td>
                  <td id="max_num"></td>
                </tr>
                <tr>
                  <td colspan="2">赠品</td>
                </tr>
                <tr id="goods_list">
                  <td></td>
                  <td>商品名称</td>
                </tr>
              </tbody></table>
            </div>
          </div>
          <div class="modal-footer">
            <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
          </div>
        </div>
      </div>
    </div>
    <el-row>
        <el-button type="danger" size="small">批量删除</el-button>
        <el-button type="primary" size="small">添加赠品</el-button>
    </el-row>

    <el-table border :data="tableData" style="width: 100%">

      <el-table-column
            prop="name"
            label="活动名称"
            width="120">
          </el-table-column>

      <el-table-column
            prop="status"
            label="活动状态"
            width="120">
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
<el-table-column label="有效时间">
            <template slot-scope="scope">

                <span class="table-pay">{{scope.row.startTime}}</span><br>
                <span class="table-desc">提示：{{scope.row.stopTime}} </span>
            </template>
        </el-table-column>

        <el-table-column label="操作"
            width="180">
            <template slot-scope="scope">
                <!-- <a href="/config/loginconfig.html?type=qq">配置</a> -->
                <el-button size="mini" @click="handleEdit(scope.$index, scope.row)">配置</el-button>
            </template>
        </el-table-column>
    </el-table>
  </div>
</template>

<script>
export default {
  name: 'giftList',
  data () {
    return {
      tableData: [{
        id: '1',
        startTime: '2018-08-20 10:32:19',
        stopTime: '2018-08-31 10:32:21',
        name: 's',
        status: '已结束'
      }, {
        id: '2',
        startTime: '2018-08-09 14:20:34',
        stopTime: '2018-08-29 14:20:35',
        name: 'eqweqe',
        status: '已结束'
      }, {
        id: '3',
        startTime: '2018-05-01 00:00:00',
        stopTime: '2019-06-21 00:00:00',
        name: '132',
        status: '进行中'
      }]
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
