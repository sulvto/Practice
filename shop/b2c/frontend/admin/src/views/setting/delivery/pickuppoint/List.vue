  <!-- 添加审核人员 -->
<!-- <div class="modal fade hide" id="addVerificationPerson" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true"> -->
<!--                <div class="modal-dialog"> -->
<!--                    <div class="modal-content"> -->
<!--                        <div class="modal-header"> -->
<!--                            <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button> -->
<!--                            <h3>添加门店审核人员</h3> -->
<!--                        </div> -->
<!--                        <div class="modal-body"> -->
<!--                            <div class="modal-infp-style"> -->
<!--                                <table class="mytable"> -->
<!--                                    <tbody> -->
<!--                                        <tr> -->
<!--                                            <td> -->
<!--                                                <input id="user_info" class="input-common" type="text" placeholder="输入手机号/邮箱/会员昵称"> -->
<!--                                                <input type="button" onclick="selectMember();" value="搜索" class="btn-common"> -->
<!--                                            </td> -->
<!--                                        </tr> -->
<!--                                    </tbody> -->
<!--                                </table> -->
<!--                                <table class="table-class" id="member_list"> -->
<!--                                    <colgroup> -->
<!--                                        <col style="width: 2%;"> -->
<!--                                        <col style="width: 29%;"> -->
<!--                                        <col style="width: 29%;"> -->
<!--                                        <col style="width: 30%;"> -->
<!--                                        <col style="width: 10%;"> -->
<!--                                    </colgroup> -->
<!--                                    <thead> -->
<!--                                        <tr><th><i class="checkbox-common"><input type="checkbox" onclick="CheckPerSonAll(this)"></i></th> -->
<!--                                        <th align="left">会员昵称</th> -->
<!--                                        <th>会员邮箱</th> -->
<!--                                        <th>会员手机</th> -->
<!--                                        <th>状态</th> -->
<!--                                    </tr></thead> -->
<!--                                    <tbody></tbody> -->
<!--                                </table> -->
<!--                            </div> -->
<!--                        </div> -->
<!-- -->
<!--                        <div class="modal-footer"> -->
<!--                            <button class="btn-common btn-big" onclick="addPickupAuditor()">保存</button> -->
<!--                            <button class="btn-common-cancle btn-big" data-dismiss="modal">关闭</button> -->
<!--                        </div> -->
<!--                    </div> -->
<!--                </div> -->
<!--            </div> -->
<template>
  <div>
    <el-row :gutter="8">
        <el-col :span="12">
          <el-button type="danger" size="small">批量删除</el-button>
          <el-button type="primary" size="small" @click="$router.push('edit.html')">添加门店</el-button>
        </el-col>

        <el-col :span="10"><el-input size="small" v-model="searchKeyword" placeholder="请输入门店名称"></el-input></el-col>
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
        label="门店名称"
        width="120">
      </el-table-column>

    <el-table-column
        prop="address"
        label="地址"
        width="300">
      </el-table-column>

    <el-table-column
        prop="contact"
        label="联系人"
        width="80">
      </el-table-column>

    <el-table-column
        prop="tel"
        label="联系电话"
        width="100">
      </el-table-column>

    <el-table-column
        prop="publishDate"
        label="发布时间"
        width="140">
      </el-table-column>

      <el-table-column label="操作" >
          <template slot-scope="scope">
            <el-button size="mini" @click="handleEdit(scope.$index, scope.row)">删除</el-button>
            <el-button size="mini" @click="handleEdit(scope.$index, scope.row)">修改</el-button>
            <el-button size="mini" @click="handleEdit(scope.$index, scope.row)">添加审核人员</el-button>
          </template>
      </el-table-column>
        </el-table>
  </div>
</template>

<script>
export default {
  name: 'pickuppointList',
  data () {
    return {
      searchKeyword: '',
      tableData: [{
        name: '11',
        contact: true,
        tel: 123333333,
        address: '重庆市/重庆市/云阳县/111',
        publishDate: '2018-07-13 10:18:04'
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
      console.log('search :', this.searchKeyword)
    }
  }
}
</script>

<style lang="scss" scoped>

</style>
