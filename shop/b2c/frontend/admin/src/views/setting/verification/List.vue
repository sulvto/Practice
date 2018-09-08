  <!-- 添加会员 -->
  <!-- <div class="modal fade hide" id="addVerificationPerson" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">

  <div class="modal-dialog">
      <div class="modal-content">
          <div class="modal-header">
              <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
              <h3>添加核销人员</h3>
          </div>
          <div class="modal-body">
              <div class="modal-infp-style">
                  <table class="mytable">
                      <tbody>
                          <tr>
                              <td>
                                  <input id="user_info" class="input-common" type="text" placeholder="输入手机号/邮箱/会员昵称">
                                  <input type="button" onclick="selectMember();" value="搜索" class="btn-common">
                              </td>
                          </tr>
                      </tbody>
                  </table>
                  <table class="table-class" id="member_list">
                      <colgroup>
                          <col style="width: 2%;">
                          <col style="width: 29%;">
                          <col style="width: 29%;">
                          <col style="width: 30%;">
                          <col style="width: 10%;">
                      </colgroup>
                      <thead>
                          <tr><th><i class="checkbox-common"><input type="checkbox" onclick="CheckPerSonAll(this)"></i></th>
                          <th align="left">会员昵称</th>
                          <th>会员邮箱</th>
                          <th>会员手机</th>
                          <th>状态</th>
                      </tr></thead>
                      <tbody></tbody>
                  </table>
              </div>
          </div>

          <div class="modal-footer">
              <button class="btn-common btn-big" onclick="addVerificationPerson()">保存</button>
              <button class="btn-common-cancle btn-big" data-dismiss="modal">关闭</button>
          </div>
      </div>
  </div>
  </div> -->
<template>
    <div>
      <el-row :gutter="8">
        <el-col :span="12">
          <el-button type="primary" size="small">添加核销人员</el-button>
        </el-col>

        <el-col :span="10">
          </el-col>
        <el-col :span="2">
        </el-col>
      </el-row>

      <br/>

        <el-table border :data="tableData" style="width: 100%">
            <el-table-column
      prop="username"
      label="核销人员昵称">
    </el-table-column>

 <el-table-column
      prop="createDate"
      label="创建时间"
      width="140">
    </el-table-column>

            <el-table-column label="操作" fixed="right"
                width="180">
                <template slot-scope="scope">
                    <el-button size="mini" @click="handleDelete(scope.$index, scope.row)">删除</el-button>
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
      tableData: [{
        username: 'sudo',
        createDate: '2018-07-11 01:03:33'
      }, {
        username: 'cqinter',
        createDate: '2018-07-12 14:00:03'
      }, {
        username: 'aoeuaoeu',
        createDate: '2018-07-23 22:06:21'
      }]
    }
  },
  methods: {
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
