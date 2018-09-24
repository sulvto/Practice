<template>

  <section class="ns-base-section">

    <div class="ns-main">

  <table class="mytable">
  <tbody><tr>
    <th width="20%" style="text-align: left;">
      <button class="btn-common btn-small" onclick="location.href='/promotion/adddiscount.html';" style="margin:0 5px 0 0 !important;">添加限时折扣</button>
      <button class="btn-common-delete btn-small" onclick="batchDelete()" style="margin:0 5px 0 0 !important;">批量删除</button>
    </th>
    <th width="10%">
      <input type="text" id="search_text" placeholder="请输入活动名称" class="input-common">
      <input type="button" onclick="searchData()" value="搜索" class="btn-common">
    </th>
  </tr>
  </tbody></table>
  <table class="table-class">
  <colgroup>
  <col style="width: 2%;">
  <col style="width: 54%;">
  <col style="width: 8%;">
  <col style="width: 20%;">
  <col style="width: 16%;">
  </colgroup>
  <thead>
    <tr align="center">
      <th><i class="checkbox-common"><input type="checkbox" onclick="CheckAll(this)"></i></th>
      <th align="left">活动名称</th>
      <th>活动状态</th>
      <th>有效时间</th>
      <th>操作</th>
    </tr>
  </thead>
  <tbody><tr align="center"><td><div class="cell"><i class="checkbox-common disabled"><input name="sub_use" type="checkbox" value="1" disabled=""></i></div></td><td align="left">222222</td><td>活动中</td><td>开始时间：2018-07-17 18:14:06<br>结束时间：2018-08-31 18:14:09</td><td><a href="javascript:void(0);" onclick="closeDiscount(1)">关闭</a>&nbsp;<a href="javascript:void(0);" onclick="discountInfo(1)">详情</a>&nbsp;</td></tr></tbody>
  </table>

  <!-- 模态框（Modal） -->
  <div class="modal fade hide" id="discountInfo" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog">
      <div class="modal-content">
        <div class="modal-header">
          <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
          <h3>限时折扣详情</h3>
        </div>
        <div class="modal-body">
          <div class="modal-infp-style">
            <table>
              <tbody><tr>
                <td style="width:60px;">活动名称</td>
                <td colspan="3" id="discount_name"></td>
              </tr>
              <tr>
                <td>有效期</td>
                <td colspan="3" id="time"></td>
              </tr>
              <tr>
                <td>活动状态</td>
                <td colspan="3" id="status"></td>
              </tr>
              <tr>
                <td colspan="3">商品列表</td>
              </tr>
              <tr id="goods_list"></tr>
            </tbody></table>
          </div>
        </div>
        <div class="modal-footer">
          <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
        </div>
      </div>
    </div>
  </div>

    </div>

  </section>

</template>
<template>
  <div>
    <el-tabs v-model="activeName" @tab-click="handleClick">
      <el-tab-pane label="全部" name="first">全部</el-tab-pane>
      <el-tab-pane label="未发布" name="second">未发布</el-tab-pane>
      <el-tab-pane label="进行中" name="third">进行中</el-tab-pane>
      <el-tab-pane label="已关闭" name="fourth">已关闭</el-tab-pane>
      <el-tab-pane label="已结束" name="fourth">已结束</el-tab-pane>
    </el-tabs>

    <el-row :gutter="8">
      <el-col :span="12">
        <el-button type="danger" size="small">批量删除</el-button>
        <el-button type="primary" size="small" @click="$router.push('edit.html')">添加限时折扣</el-button>
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
          label="活动状态"
          width="180">
        <template slot-scope="scope">
          <span v-if="scope.row.status === 1">未发布</span>
          <span v-if="scope.row.status === 2">进行中</span>
          <span v-if="scope.row.status === 3">已关闭</span>
          <span v-if="scope.row.status === 4">已结束</span>
        </template>
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

      <el-table-column label="操作" fixed="right"
          width="220">
          <template slot-scope="scope">
              <el-button size="mini" @click="handleEdit(scope.$index, scope.row)" v-if="scope.row.status !== 2">修改</el-button>
                            <el-button size="mini" @click="handleEdit(scope.$index, scope.row)" v-if="scope.row.status === 2">关闭</el-button>
                            <el-button size="mini" @click="handleEdit(scope.$index, scope.row)">详情</el-button>
              <el-button size="mini" @click="handleDelete(scope.$index, scope.row)" v-if="scope.row.status === 3 || scope.row.status === 4">删除</el-button>
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
        name: '222222',
        status: 2,
        startDate: '2018-07-17 18:14:06',
        endDate: '2018-08-31 18:14:09'
      }, {
        name: 'asd',
        status: 1,
        startDate: '2018-09-19 21:11:12',
        endDate: '2018-09-21 21:11:12'
      }, {
        name: '限时折扣活动',
        status: 3,
        startDate: '2018-09-05 09:49:47',
        endDate: '2018-09-07 09:49:47'
      }, {
        name: '限时折扣',
        status: 4,
        startDate: '2018-09-05 09:49:47',
        endDate: '2018-09-07 09:49:47'
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
</style>
