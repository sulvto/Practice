<!-- <template>

  <section class="ns-base-section">

    <div style="position:relative;margin:0;">

    <div class="ns-main">

  <table class="mytable">
  <tbody><tr>
    <th width="20%" style="text-align:left;"><button class="btn-common btn-small" onclick="location.href='/promotion/addcoupontype.html';" style="margin:0 5px 0 0 !important;">添加优惠券</button></th>
    <th width="10%">
      <input type="text" id="search_text" placeholder="请输入优惠券名称" class="input-common">
      <input type="button" onclick="searchData()" value="搜索" class="btn-common">
    </th>
  </tr>
  </tbody></table>
  <table class="table-class">
    <colgroup>
    <col style="width: 2%;">
    <col style="width: 42%;">
    <col style="width: 10%;">
    <col style="width: 10%;">
    <col style="width: 20%;">
    <col style="width: 16%;">
    </colgroup>
  <thead>
    <tr align="center">
      <th>

      </th>
      <th class="align_left">优惠券名称</th>
      <th class="align_right">面额</th>
      <th class="align_right">发放数量<span class="row-20"></span></th>
      <th>有效时间</th>
      <th>操作</th>
    </tr>
  </thead>
  <tbody><tr align="center"><td></td><td class="align_left">123</td><td class="align_right">1.00</td><td class="align_right">1<span class="row-20"></span></td><td>开始时间：2018-08-22 19:07:31<br>结束时间：2018-08-28 19:07:39</td><td><a href="/Promotion/updateCouponType?coupon_type_id=3">编辑</a><a href="javascript:void(0);" onclick="couponTypeInfo(3)">详情</a><a href="javascript:;" onclick="deletecouponType(3);">删除</a><br><a href="/wap/goods/getCoupon?coupon_type_id=3" target="_blank">推广链接</a><a href="/Promotion/couponGrantLog?coupon_type_id=3">发放记录</a></td></tr><tr align="center"><td></td><td class="align_left">满150元减5元</td><td class="align_right">5.00</td><td class="align_right">1000<span class="row-20"></span></td><td>开始时间：2018-08-01 18:45:23<br>结束时间：2018-08-31 18:45:27</td><td><a href="/Promotion/updateCouponType?coupon_type_id=2">编辑</a><a href="javascript:void(0);" onclick="couponTypeInfo(2)">详情</a><a href="javascript:;" onclick="deletecouponType(2);">删除</a><br><a href="/wap/goods/getCoupon?coupon_type_id=2" target="_blank">推广链接</a><a href="/Promotion/couponGrantLog?coupon_type_id=2">发放记录</a></td></tr><tr align="center"><td></td><td class="align_left">满88元减2元</td><td class="align_right">2.00</td><td class="align_right">102<span class="row-20"></span></td><td>开始时间：2018-07-04 18:44:44<br>结束时间：2018-08-31 14:50:04</td><td><a href="/Promotion/updateCouponType?coupon_type_id=1">编辑</a><a href="javascript:void(0);" onclick="couponTypeInfo(1)">详情</a><a href="javascript:;" onclick="deletecouponType(1);">删除</a><br><a href="/wap/goods/getCoupon?coupon_type_id=1" target="_blank">推广链接</a><a href="/Promotion/couponGrantLog?coupon_type_id=1">发放记录</a></td></tr></tbody>
  </table>

    </div>

  </section>
</template>
-->

  <!-- 模态框（Modal） -->
<!--
  <div class="modal fade hide" id="coupon_info" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
  <div class="modal-dialog">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
        <h3>优惠券详情</h3>
      </div>
      <div class="modal-body">
        <div class="modal-infp-style">
          <table>
            <tbody><tr>
              <td>类型名</td>
              <td id="coupon_name"></td>
            </tr>
            <tr>
              <td>面额</td>
              <td id="money"></td>
            </tr>
            <tr>
              <td>发放数量</td>
              <td id="count"></td>
            </tr>
            <tr>
              <td>每人最大领取数</td>
              <td id="max_fetch"></td>
            </tr>
            <tr>
              <td>满多少元使用</td>
              <td id="at_least"></td>
            </tr>
            <tr style="display:none;">
              <td>领取人等级</td>
              <td id="need_user_level"></td>
            </tr>
            <tr>
              <td>有效时间</td>
              <td id="time"></td>
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
  -->

<template>
  <div>
    <el-row :gutter="8">
      <el-col :span="12">
        <el-button type="primary" size="small" @click="$router.push('edit.html')">添加优惠券</el-button>
      </el-col>

      <el-col :span="10">
        <el-input size="small" v-model="searchKeyword" placeholder="请输入优惠券名称"></el-input>
      </el-col>
      <el-col :span="2">
        <el-button type="primary" size="small" @click="search">查询</el-button>
      </el-col>
    </el-row>

    <br/>

    <el-table border :data="tableData" style="width: 100%">

      <el-table-column
        prop="name"
        label="优惠券名称">
      </el-table-column>

      <el-table-column
        prop="denomination"
        label="面额"
        width="120">
      </el-table-column>

      <el-table-column
        prop="number"
        label="发放数量"
        width="80">
      </el-table-column>

      <el-table-column label="有效时间"
        width="210">
        <template slot-scope="scope">
          <div v-if="scope.row.termOfValidityType === 1">
            开始时间：{{scope.row.startDate}}
            <br>
            结束时间：{{scope.row.endDate}}
          </div>
          <div v-if="scope.row.termOfValidityType === 2">
            领取之日起{{ scope.row.fixedDays }}天内有效
          </div>
        </template>
      </el-table-column>

      <el-table-column label="操作" fixed="right"
          width="250">
          <template slot-scope="scope">
              <!-- <a href="/config/loginconfig.html?type=qq">配置</a> -->
              <el-button size="mini" @click="handleEdit(scope.$index, scope.row)">编辑</el-button>
              <el-button size="mini" @click="handleEdit(scope.$index, scope.row)">详情</el-button>
              <el-button size="mini" @click="handleEdit(scope.$index, scope.row)">删除</el-button>
              <el-button size="mini" class="margin-top-5" @click="handleEdit(scope.$index, scope.row)">推广链接</el-button>
              <el-button size="mini" class="margin-top-5" @click="handleEdit(scope.$index, scope.row)">发放记录</el-button>
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
        denomination: 1000.00,
        name: '滿5000送1000',
        number: 999,
        termOfValidityType: 1,
        startDate: '2018-09-12 10:47:51',
        endDate: '2018-09-30 10:47:55'
      }, {
        denomination: 5.00,
        name: '满150元减5元',
        number: 1000,
        termOfValidityType: 1,
        startDate: '2018-08-01 18:45:23',
        endDate: '2018-10-31 18:45:27'
      }, {
        denomination: 2.00,
        name: '满88元减2元',
        number: 110,
        termOfValidityType: 2,
        fixedDays: 1
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

.margin-top-5 {
  margin-top:5px;
}
</style>
