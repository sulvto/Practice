<!-- <span>发生时间：</span>
<input type="text" id="startDate" placeholder="请选择开始日期" class="input-medium input-common middle" onclick="WdatePicker()">
&nbsp;-&nbsp;
<input type="text" id="endDate" placeholder="请选择结束日期" class="input-medium input-common middle" onclick="WdatePicker()"> -->
<!-- 更多搜索按钮 -->
<!-- <button class="btn-common-white more-search"><i class="fa fa-chevron-down"></i></button>
<button type="button" onclick="searchData()" value="搜索" class="btn-common">搜索</button> -->
<!-- 更多搜索下拉框 -->
<!-- <div class="more-search-container">
<dl>
<dt>会员昵称：</dt>
<dd>
<input type="text" id="search_text" placeholder="请输入会员昵称" class="input-common  middle">
</dd>
</dl>
<dl>
<dt>发生类别：</dt>
<dd>
<div class="selectric-wrapper selectric-select-common selectric-middle" style="width: 150px;"><div class="selectric-hide-select"><select id="form_type" class="select-common middle" tabindex="-1">
<option value="">全部</option>
<option value="1">商城订单</option>
<option value="2">订单退还</option>
<option value="3">兑换</option>
<option value="4">充值</option>
<option value="5">签到</option>
<option value="6">分享</option>
<option value="7">注册</option>
<option value="8">提现</option>
<option value="9">提现退还</option>
<option value="10">调整</option>
<option value="11">参与营销游戏消耗积分</option>
<option value="19">点赞</option>
<option value="20">评论</option>
</select></div><div class="selectric"><span class="selectric-label">全部</span><button class="selectric-button">▾</button></div><div class="selectric-items" tabindex="-1"><div class="selectric-scroll"><ul><li data-index="0" class="selected" title="全部">全部</li><li data-index="1" class="" title="商城订单">商城订单</li><li data-index="2" class="" title="订单退还">订单退还</li><li data-index="3" class="" title="兑换">兑换</li><li data-index="4" class="" title="充值">充值</li><li data-index="5" class="" title="签到">签到</li><li data-index="6" class="" title="分享">分享</li><li data-index="7" class="" title="注册">注册</li><li data-index="8" class="" title="提现">提现</li><li data-index="9" class="" title="提现退还">提现退还</li><li data-index="10" class="" title="调整">调整</li><li data-index="11" class="" title="参与营销游戏消耗积分">参与营销游戏消耗积分</li><li data-index="12" class="" title="点赞">点赞</li><li data-index="13" class="last" title="评论">评论</li></ul></div></div><input class="selectric-input" tabindex="0"></div>
</dd>
</dl>
<dl>
<dt></dt>
<dd><button onclick="searchData()" class="btn-common">搜索</button></dd>
</dl>
</div> -->

<template>
  <div>
    <el-row :gutter="8">
      <el-col :span="12">
      </el-col>

      <el-col :span="10">
        <el-input size="small" v-model="searchKeyword" placeholder="请输入物流公司名称或编号"></el-input>
      </el-col>
      <el-col :span="2">
        <el-button type="primary" size="small" @click="search">查询</el-button>
      </el-col>
    </el-row>

    <br/>

    <el-table border :data="tableData" style="width: 100%">

      <el-table-column
        prop="username"
        label="会员昵称">
      </el-table-column>

      <el-table-column
        prop="category"
        label="类别"
        width="120">
      </el-table-column>

      <el-table-column
          label="描述"
          width="180">
        <template slot-scope="scope">
            {{scope.row.description}}
        </template>
      </el-table-column>

      <el-table-column
          label="金额"
          width="180">
        <template slot-scope="scope">
            <span>{{(scope.row.type ? '+' : '-') + scope.row.number }}</span>
        </template>
      </el-table-column>

      <el-table-column
          prop="date"
          label="时间"
          width="140">
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
        username: 'xxx',
        category: '调整',
        description: '',
        type: 1,
        number: '9999.00',
        date: '2018-09-01 18:15:14'
      }, {
        username: 'ymeng22',
        category: '商城订单',
        description: '商城订单',
        type: 0,
        number: '90.00',
        date: '2018-07-31 09:26:00'
      }, {
        username: 'cqinter',
        category: '参与营销游戏消耗积分',
        description: '参与【平图案】营销游戏，获得【10】作为奖励，赠送5.00余额红包',
        type: 1,
        number: '5.00',
        date: '2018-07-30 18:23:04'
      }, {
        username: 'ymeng22',
        category: '调整',
        description: '',
        type: 1,
        number: '1000.00',
        date: '2018-07-30 14:11:14'
      }, {
        username: 'huge',
        category: '订单退还',
        description: '订单退款【订单号：2018072415090001】',
        type: 1,
        number: '330.00',
        date: '2018-07-24 15:20:19'
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

</style>
