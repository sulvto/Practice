<template>

  <section class="ns-base-section">
    <el-table
      :data="tableData"
      border
      style="width: 100%">
      <el-table-column
        fixed
        prop="date"
        label="更新状态"
        width="150" />
      <el-table-column
        prop="name"
        label="更新名称"
        width="120" />
      <el-table-column
        prop="province"
        label="更新包版本"
        width="120" />
      <el-table-column
        prop="city"
        label="系统当前版本"
        width="120" />
      <el-table-column
        prop="address"
        label="发布时间"
        width="300" />
      <el-table-column
        prop="zip"
        label="更新时间"
        width="120" />
      <el-table-column
        fixed="right"
        label="操作">
        <template slot-scope="scope">
          <el-button type="text" size="small" @click="handleClick(scope.row)">查看</el-button>
          <el-button type="text" size="small">编辑</el-button>
        </template>
      </el-table-column>
    </el-table>

    <!-- <div class='ns-main'>

        <div class='modal fade hide' id='up_patch' tabindex='-1' role='dialog' aria-labelledby='myModalLabel' aria-hidden='true' v-show='false'>

            <div class='modal-dialog'>
                <div class='modal-content'>
                    <div class='modal-header'>
                        <button type='button' class='close' data-dismiss='modal' aria-hidden='true'>×</button>
                        <h3>在线升级</h3>
                    </div>
                    <div class='modal-body'>
                        <div class='modal-infp-style' style='height:70px;'>
                            <table class='modal-tab'>
                                <tbody><tr>
                                    <td style='width:70%'>是否备份数据库</td>
                                    <td>
                                        <input id='is_backup' type='checkbox' class='checkbox' simpleswitch='0' result='false' style='display: none;'><div class='Switch Switch_FlatRadius' id='Switch0'><span class='switch-open'>是</span><span class='switch-close'>否</span></div>
                                    </td>
                                </tr>
                            </tbody></table>
                        </div>
                    </div>
                    <div class='modal-footer'>
                        <input type='hidden' id='modify_username_hidden'>
                        <button class='btn-common' onclick='upPatch()' id='butSubmit'>升级</button>
                        <button type='button' class='btn btn-default' data-dismiss='modal'>关闭</button>
                    </div>
                </div>
            </div>

    </div>
    <div id='back_patch' style='background:#f5f5f5;display:none;margin:auto;z-index:10;height:100%;width:100%'>
      <div style='height:200px;width:200px;background:#000;opacity: 0.65;text-align:center;margin: auto;'>
        <span>正在备份</span>
      </div>
    </div>
    <form action='http://showfx.niuteam.cn/admin/upgrade/upgradePatch.html' method='post' id='fpForm'>
      <input type='hidden' id='patch_obj' name='upgradePatch_detail'>
    </form>

    </div> -->

  </section>
</template>

<script>
export default {
  name: 'OnlineUpdate',
  data () {
    return {
      tableData: [
        {
          date: '2016-05-03',
          name: '王小虎',
          province: '上海',
          city: '普陀区',
          address: '上海市普陀区金沙江路 1518 弄',
          zip: 200333
        },
        {
          date: '2016-05-02',
          name: '王小虎',
          province: '上海',
          city: '普陀区',
          address: '上海市普陀区金沙江路 1518 弄',
          zip: 200333
        },
        {
          date: '2016-05-04',
          name: '王小虎',
          province: '上海',
          city: '普陀区',
          address: '上海市普陀区金沙江路 1518 弄',
          zip: 200333
        },
        {
          date: '2016-05-01',
          name: '王小虎',
          province: '上海',
          city: '普陀区',
          address: '上海市普陀区金沙江路 1518 弄',
          zip: 200333
        },
        {
          date: '2016-05-08',
          name: '王小虎',
          province: '上海',
          city: '普陀区',
          address: '上海市普陀区金沙江路 1518 弄',
          zip: 200333
        },
        {
          date: '2016-05-06',
          name: '王小虎',
          province: '上海',
          city: '普陀区',
          address: '上海市普陀区金沙江路 1518 弄',
          zip: 200333
        },
        {
          date: '2016-05-07',
          name: '王小虎',
          province: '上海',
          city: '普陀区',
          address: '上海市普陀区金沙江路 1518 弄',
          zip: 200333
        }
      ]
    }
  }
}
</script>

<style lang='scss'>
</style>
