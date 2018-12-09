<template>
  <!-- <h4>功能提示</h4>
  <p class="function-prompts">
    1、符合以下任何一种条件的订单即为有效订单：a）采用在线支付方式支付并且已付款；b）采用货到付款方式支付并且交易已完成<br> 2、图表展示了符合搜索条件的有效订单中的下单总金额和下单商品总数排名前30位的商品
  </p> -->

  <div>
    <el-row :gutter="8">
      <el-col :span="12" />

      <el-col :span="10">
        <el-form :inline="true" :model="queryForm" size="small" >
          <el-form-item label="商品分类">
            <el-cascader
              v-model="queryForm.goodsCategory"
              :options="goodsCategory"
              expand-trigger="hover"
              @change="handleChangeGoodsCategory" />
          </el-form-item>
          <el-form-item label="统计方式">
            <el-select v-model="queryForm.select" placeholder="请选择">
              <el-option label="按照天统计" value="1" />
              <el-option label="按照周统计" value="2" />
              <el-option label="按照月统计" value="3" />
            </el-select>
          </el-form-item>
        </el-form>

      </el-col>
      <el-col :span="2">
        <el-button type="primary" size="small" @click="search">查询</el-button>
      </el-col>
    </el-row>

    <br>

    <!-- TODO: 下单金额 下单商品数 -->
    <!-- 热卖商品top30 -->

  </div>
</template>

<script>
export default {
  data () {
    return {
      goodsCategory: [{
        value: 'zhinan',
        label: '指南',
        children: [{
          value: 'shejiyuanze',
          label: '设计原则'
        }, {
          value: 'daohang',
          label: '导航',
          children: [{
            value: 'cexiangdaohang',
            label: '侧向导航'
          }, {
            value: 'dingbudaohang',
            label: '顶部导航'
          }]
        }]
      }]
    }
  }
}
</script>
