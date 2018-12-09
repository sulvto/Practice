<!-- 添加会员 -->

<!--       <div class="modal hide fade" id="add_update_distribution_user" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true" style="margin-left:-365px; width: 550px;">
<div class="modal-dialog">
<div class="modal-content">
<div class="modal-header">
<button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
<h3>配送人信息</h3>
</div>
<div class="modal-body">
<div class="form-group clear">
<div class="pick_title"><span class="required">*</span>姓名：</div>
<div class="col-lg-4"><input type="text" id="name" class="input-common" style="width:350px"></div>
</div>
<div class="form-group clear">
<div class="pick_title"><span class="required">*</span>电话：</div>
<div class="col-lg-4"><input type="text" id="mobile" class="input-common" style="width:350px"></div>
</div>
<div class="form-group clear">
<div class="pick_title">备注：</div>
<div class="col-lg-4"><textarea name="remark" rows="3" id="remark" class="textarea-common" style="width:350px"></textarea></div>
</div>
</div>

<div class="modal-footer">
<input type="hidden" id="id">
<button type="button" class="btn-common btn-big" onclick="addUpdateDistributionAjax()">确定</button>
<button type="button" class="btn-common-cancle btn-big" data-dismiss="modal">关闭</button>
</div>
</div>
</div>
</div> -->

<template>
  <div>
    <el-row :gutter="8">
      <el-col :span="12">
        <el-button type="danger" size="small">批量删除</el-button>
        <el-button type="primary" size="small">添加配送人员</el-button>
      </el-col>

      <el-col :span="10"><el-input v-model="searchKeyword" size="small" placeholder="请输入配送人姓名" /></el-col>
      <el-col :span="2">
        <el-button type="primary" size="small" @click="onSearch">查询</el-button>
      </el-col>
    </el-row>

    <br>

    <el-table :data="tableData" style="width: 100%" border >
      <el-table-column
        type="selection"
        width="35" />

      <el-table-column
        prop="name"
        label="姓名"
        width="120" />

      <el-table-column
        prop="tel"
        label="电话"
        width="180" />

      <el-table-column
        prop="notes"
        label="备注" />

      <el-table-column
        label="操作"
        width="180">
        <template slot-scope="scope">
          <!-- <a href="/config/loginconfig.html?type=qq">配置</a> -->
          <el-button size="mini" @click="handleEdit(scope.$index, scope.row)">修改</el-button>
          <el-button size="mini" @click="handleEdit(scope.$index, scope.row)">删除</el-button>
        </template>
      </el-table-column>
    </el-table>
  </div>
</template>

<script>
export default {
  name: 'UserList',
  data () {
    return {
      tableData: [{
        name: '微信登录',
        tel: '微信登录微信登录',
        notes: '微信登录微信登录微信登录'
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
</style>
