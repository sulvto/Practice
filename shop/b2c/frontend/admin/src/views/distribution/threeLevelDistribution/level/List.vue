<template>
  <section class="ns-base-section">

    <div class="ns-main">

  <div class="options-btn">
  <button class="btn-common btn-small" onclick="location.href='http://showfx.niuteam.cn/admin/distribution/addpromoterlevel.html';">添加</button>
  </div>
  <div class="mod-table">
  <div class="mod-table-head">
    <div class="con style0list">
      <table class="table-class">
        <colgroup>
          <col style="width: 5%;">
          <col style="width: 10%;">
          <col style="width: 10%;">
          <col style="width: 15%;">
          <col style="width: 15%;">
          <col style="width: 15%;">
          <col style="width: 15%;">
          <col style="width: 15%;">
        </colgroup>
        <thead>
          <tr>
            <th><label style="margin-left: 5px;"> <input type="checkbox" onclick="CheckAll(this)"></label></th>
            <th>等级名称</th>
            <th>升级条件</th>
            <th>店内销售佣金比率</th>
            <th>给上级的佣金比率</th>
            <th>给上上级的佣金比率</th>
            <th>创建时间</th>
            <th>操作</th>
          </tr>
        </thead>
        <colgroup>
          <col style="width: 5%;">
          <col style="width: 15%;">
          <col style="width: 10%;">
          <col style="width: 10%;">
          <col style="width: 15%;">
          <col style="width: 15%;">
          <col style="width: 15%;">
          <col style="width: 15%;">
        </colgroup>
        <tbody><tr align="center"><td><div class="cell"><label><input name="sub" type="checkbox" value="4"></label></div></td><td>高级分销商</td><td>0.00元</td><td>80.00</td><td>15.00</td><td>5.00</td><td>2018-07-02 17:34:26</td><td><a href="http://showfx.niuteam.cn/admin/distribution/updatepromoterlevel?level_id=4">修改</a>&nbsp;&nbsp;<a href="javascript:void(0);" onclick="deleteBox(4);">删除</a></td> </tr><tr align="center"><td><div class="cell"><label><input name="sub" type="checkbox" value="5"></label></div></td><td>中级分销商</td><td>0.00元</td><td>70.00</td><td>20.00</td><td>10.00</td><td>2018-07-02 18:07:24</td><td><a href="http://showfx.niuteam.cn/admin/distribution/updatepromoterlevel?level_id=5">修改</a>&nbsp;&nbsp;<a href="javascript:void(0);" onclick="deleteBox(5);">删除</a></td> </tr><tr align="center"><td><div class="cell"><label><input name="sub" type="checkbox" value="6"></label></div></td><td>初级分销商</td><td>0.00元</td><td>60.00</td><td>25.00</td><td>15.00</td><td>2018-07-02 18:07:55</td><td><a href="http://showfx.niuteam.cn/admin/distribution/updatepromoterlevel?level_id=6">修改</a>&nbsp;&nbsp;<a href="javascript:void(0);" onclick="deleteBox(6);">删除</a></td> </tr><tr align="center"><td><div class="cell"><label><input name="sub" type="checkbox" value="9"></label></div></td><td>ds</td><td>100.00元</td><td>1.00</td><td>1.00</td><td>1.00</td><td>2018-07-23 13:47:08</td><td><a href="http://showfx.niuteam.cn/admin/distribution/updatepromoterlevel?level_id=9">修改</a>&nbsp;&nbsp;<a href="javascript:void(0);" onclick="deleteBox(9);">删除</a></td> </tr><tr align="center"><td><div class="cell"><label><input name="sub" type="checkbox" value="11"></label></div></td><td>二级分销</td><td>3000.00元</td><td>40.00</td><td>30.00</td><td>20.00</td><td>2018-07-24 14:40:39</td><td><a href="http://showfx.niuteam.cn/admin/distribution/updatepromoterlevel?level_id=11">修改</a>&nbsp;&nbsp;<a href="javascript:void(0);" onclick="deleteBox(11);">删除</a></td> </tr></tbody>
      </table>
    </div>
  </div>
  </div>

    </div>

  </section>
</template>

<template>
  <div>
    <el-row :gutter="8">
      <el-col :span="12">
        <el-button type="primary" size="small" @click="$router.push('edit.html')">添加</el-button>
      </el-col>

      <el-col :span="10">
        </el-col>
      <el-col :span="2">
      </el-col>
    </el-row>

    <br/>

    <el-table border :data="tableData" style="width: 100%">
      <el-table-column
            prop="name"
            label="等级名称">
          </el-table-column>

      <el-table-column
            label="升级条件"
            width="120">
          <template slot-scope="scope">
              {{scope.row.upgradConditions}}元
          </template>
          </el-table-column>

      <el-table-column
            prop="lavel_0"
            label="店内销售佣金比率"
            width="120">
          </el-table-column>

      <el-table-column
            prop="lavel_1"
            label="给上级的佣金比率"
            width="120">
          </el-table-column>

      <el-table-column
            prop="lavel_2"
            label="给上上级的佣金比率"
            width="120">
          </el-table-column>

      <el-table-column
            prop="createDate"
            label="创建时间"
            width="140">
          </el-table-column>

      <el-table-column label="操作" fixed="right"
          width="180">
          <template slot-scope="scope">
              <el-button size="mini" @click="handleEdit(scope.$index, scope.row)">修改</el-button>
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
      searchKeyword: '',
      tableData: [{
        upgradConditions: '3000.00',
        name: '二级分销',
        lavel_0: '40.00',
        lavel_1: '30.00',
        lavel_2: '20.00',
        createDate: '2018-07-24 14:40:39'
      }, {
        upgradConditions: '0.00',
        name: '初级分销商',
        lavel_0: '60.00',
        lavel_1: '25.00',
        lavel_2: '15.00',
        createDate: '2018-07-02 18:07:55'
      }, {
        upgradConditions: '0.00',
        name: '中级分销商',
        lavel_0: '70.00',
        lavel_1: '20.00',
        lavel_2: '10.00',
        createDate: '2018-07-02 18:07:24'
      }, {
        upgradConditions: '0.00',
        name: '高级分销商',
        lavel_0: '80.00',
        lavel_1: '15.00',
        lavel_2: '5.00',
        createDate: '2018-07-02 17:34:26'
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
