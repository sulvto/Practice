<template>
  <div>
    <el-row :gutter="8">
      <el-col :span="12">
      </el-col>

      <el-col :span="10"><el-input size="small" v-model="searchKeyword" placeholder="请输入物流公司名称或编号"></el-input></el-col>
      <el-col :span="2">
        <el-button type="primary" size="small" @click="search">查询</el-button>
      </el-col>
    </el-row>

    <br/>

    <el-table border :data="tableData" style="width: 100%">

      <el-table-column
            label="编号"
            width="110">
            <template slot-scope="scope">
              <img src="/public/static/images/default_user_portrait.gif" class="head-portrait">
              <span>{{scope.row.no}}</span>
            </template>
          </el-table-column>

      <el-table-column
            prop="username"
            label="姓名"
            width="120">
          </el-table-column>

      <el-table-column
            prop="level"
            label="等级"
            width="100">
          </el-table-column>

      <el-table-column
            prop="shopName"
            label="店铺名称"
            width="100">
          </el-table-column>

      <el-table-column
            label="团队"
            width="100">
        <template slot-scope="scope">
          推广员数: {{scope.row.promoterCount}}
          <br>
          粉丝数: {{scope.row.fansCount}}
        </template>
      </el-table-column>

      <el-table-column
            prop="salesCount"
            label="销售总额"
            width="100">
          </el-table-column>

      <el-table-column
            prop="upper"
            label="上级推广员"
            width="120">
          </el-table-column>

      <el-table-column
          label="状态"
          width="80">
          <template slot-scope="scope">
            <el-tag v-show="scope.row.status==3" type="success">已审核</el-tag>
          </template>
      </el-table-column>

      <el-table-column
            prop="applicationDate"
            label="申请时间"
            width="140">
          </el-table-column>

      <el-table-column label="操作" fixed="right"
          width="200">
          <template slot-scope="scope">
              <el-button size="mini" @click="handleEdit(scope.$index, scope.row)">账户详情</el-button>
              <el-button size="mini" @click="updataUpper(scope.row)">修改上级</el-button>
              <br/>
              <el-button class="margin-top-5" size="mini" @click="handleEdit(scope.$index, scope.row)">冻结店铺</el-button>
              <el-button class="margin-top-5" size="mini" @click="handleEdit(scope.$index, scope.row)">修改等级</el-button>
              <br/>
              <el-button class="margin-top-5" size="mini" @click="handleEdit(scope.$index, scope.row)">我的团队</el-button>
              <el-button class="margin-top-5" size="mini" @click="updataShopName(scope.row)">修改店铺</el-button>
          </template>

      </el-table-column>
    </el-table>
<div v-if="false">

  <!-- 修改用户上级（Modal）开始 -->
  <div class="modal fade hide" id="editParent" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
                <h3 class="modal-title" id="myModalLabel">推广员上级修改</h3>
            </div>
            <div class="modal-body">
              <div class="modal-div">
                <input type="hidden" id="promoter_id" value="">
                <dl class="modal-dl">
                  <dt>上级推广员编号:</dt>
                  <dd>
                    <input type="text" id="parent_promoter" value="">
                    <span id="ever_parent_promoter"></span>
                  </dd>
                </dl>
              </div>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn-common btn-big" onclick="modifyPromoterParent();">修改</button>
                <button type="button" class="btn-common-cancle btn-big" data-dismiss="modal">关闭</button>
            </div>
        </div><!-- /.modal-content -->
    </div><!-- /.modal -->
  </div>
  <div class="modal fade hide" id="editLevel" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
                <h3 class="modal-title" id="myModalLabel">推广员等级修改</h3>
            </div>
            <div class="modal-body">
              <div class="modal-div">
                <input type="hidden" id="level_promoter_id" value="">
                <dl class="modal-dl">
                  <dt>推广员等级:</dt>
                  <dd>
                    <select id="level_id">
                                          <option value="4">一级分销</option>
                                    <option value="5">三级分销</option>
                                    <option value="6">12</option>
                                    <option value="9">ds</option>
                                    <option value="11">二级分销</option>
                                    </select>
                  </dd>
                </dl>
              </div>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn-common btn-big" onclick="modifyPromoterLevel();">修改</button>
                <button type="button" class="btn-common-cancle btn-big" data-dismiss="modal">关闭</button>
            </div>
        </div><!-- /.modal-content -->
    </div><!-- /.modal -->
  </div>
  <!-- 修改用户上级（Modal）结束 -->

  <!--修改店铺名称  -->
  <div class="modal fade hide" id="editShopName" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
                <h3 class="modal-title" id="myModalLabel">店铺名称修改</h3>
            </div>
            <div class="modal-body">
              <div class="modal-div">
                <input type="hidden" id="shop_promoter_id" value="">
                <dl class="modal-dl">

                  <dt>店铺名称：</dt>
                  <dd>
                    <input type="text" id="shop_name" value="">
                  </dd>

                </dl>
              </div>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn-common btn-big" onclick="modifyShopName();">修改</button>
                <button type="button" class="btn-common-cancle btn-big" data-dismiss="modal">关闭</button>
            </div>
        </div><!-- /.modal-content -->
    </div><!-- /.modal -->
  </div>

  <!--我的团队显示 -->

  <div class="modal fade hide" id="myTeam" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true" style="width:60%;left:35%">

  <div class="modal-dialog">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
        <h3 class="modal-title" id="myModalLabel">我的团队
          <input type="button" onclick="dataExcel()" value="导出数据" class="btn-common" style="float: right;margin-right:50px!important">
        </h3>
      </div>
      <div class="modal-body" style="min-height: 360px;">
        <div class="modal-infp-style" style="height: 600px; overflow: auto;">
          <table class="modal-tab table-class">
            <thead>
              <tr align="center">
                <th>编号</th>
                <th>昵称</th>
                <th>等级</th>
                <th>店铺名称</th>
                <th>角色</th>
                <th>申请时间</th>
              </tr>
            </thead>
            <colgroup>
              <col style="width: 8%;">
              <col style="width: 12%;">
              <col style="width: 10%;">
              <col style="width: 8%;">
              <col style="width: 7%;">
              <col style="width: 16%;">
            </colgroup>
            <tbody id="my_team_list"></tbody>
          </table>
        </div>
      </div>

      <input type="hidden" value="" id="hidden_promoter_id">
      <div class="modal-footer">
        <button type="button" class="btn-common-cancle btn-big" data-dismiss="modal">关闭</button>
      </div>
    </div>
  </div>

  </div>
</div>
  </div>
</template>

<script>
export default {
  name: 'list',
  data () {
    return {
      searchKeyword: '',
      tableData: [{
        no: 'FX000087',
        username: 'wanglei',
        shopName: 'nike',
        upper: 'aaa',
        level: '中级分销商',
        salesCount: 0,
        status: 3,
        promoterCount: 1,
        fansCount: 0,
        applicationDate: '2018-09-07 10:35:37'
      }, {
        no: 'FX000088',
        username: 'bigapple',
        shopName: 'bigapple',
        upper: '',
        level: '中级分销商',
        salesCount: 0,
        status: 3,
        promoterCount: 1,
        fansCount: 0,
        applicationDate: '2018-09-06 20:29:01'
      }, {
        no: 'FX000086',
        username: '345345',
        shopName: '对的',
        upper: 'aaa',
        level: '中级分销商',
        salesCount: 0,
        status: 3,
        promoterCount: 1,
        fansCount: 1,
        applicationDate: '2018-09-06 20:26:42'
      }, {
        no: 'FX000082',
        username: 'ccc',
        shopName: 'ccc',
        upper: 'bbb',
        level: '初级分销商',
        salesCount: 100,
        status: 3,
        promoterCount: 1,
        fansCount: 1,
        applicationDate: '2018-09-01 18:37:46'
      }, {
        no: 'FX000081',
        username: 'bbb',
        shopName: 'bbb',
        upper: 'aaa',
        level: '中级分销商',
        salesCount: 0,
        status: 3,
        promoterCount: 2,
        fansCount: 1,
        applicationDate: '2018-09-01 18:35:44'
      }, {
        no: 'FX000080',
        username: 'aaa',
        shopName: 'aaa',
        upper: 'yyy',
        level: '高级分销商',
        salesCount: 0,
        status: 3,
        promoterCount: 4,
        fansCount: 1,
        applicationDate: '2018-09-01 18:34:06'
      }, {
        no: 'FX000079',
        username: 'yyy',
        shopName: 'yyy',
        upper: 'aaa',
        level: '二级分销',
        salesCount: 18000,
        status: 3,
        promoterCount: 5,
        fansCount: 1,
        applicationDate: '2018-09-01 18:27:14'
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
    },
    updataShopName (data) {
      this.$prompt('店铺名称', '修改店铺名称', {
        confirmButtonText: '确定',
        cancelButtonText: '取消',
        inputValue: data.shopName
      }).then(({ value }) => {
        this.$message({
          type: 'success',
          message: '店铺名称: ' + value
        })
      })
    }
  }
}
</script>

<style lang="scss" scoped>

.margin-top-5 {
  margin-top: 5px;
}
</style>
