<template>
  <div>

    <!-- <h4>操作提示</h4>
                  <p>相关教程：<a href="http://bbs.niushop.com.cn/forum.php?mod=viewthread&amp;tid=2325&amp;extra=page%3D2" target="_blank">http://bbs.niushop.com.cn/forum.php?mod=viewthread&amp;tid=2325&amp;extra=page%3D2</a></p>
                  <hr>
                                    <h4>功能提示</h4>
                  <p class="function-prompts">
  1、符合以下任何一种条件的订单即为有效订单：a）采用在线支付方式支付并且已付款；b）采用货到付款方式支付并且交易已完成<br>
  2、以下列表为从昨天开始最近30天有效订单中的所有商品数据<br>
  3、近30天下单商品数：从昨天开始最近30天有效订单的某商品总销量<br>
  4、近30天下单金额：从昨天开始最近30天有效订单的某商品总销售额
  </p> -->
    <!-- <li class="selected" onclick="location.href='/account/shopGoodsSalesList.html';">商品分析</li> -->
    <!-- <li onclick="location.href='/account/bestSellerGoods.html';">热卖商品</li> -->

    <el-row :gutter="8">
      <el-col :span="12" />

      <el-col :span="10">
        <el-input v-model="searchKeyword" size="small" placeholder="请输入商品名称" />
      </el-col>
      <el-col :span="2">
        <el-button type="primary" size="small" @click="search">查询</el-button>
      </el-col>
    </el-row>

    <br>

    <el-table :data="tableData" border style="width: 100%">

      <el-table-column
        prop="name"
        label="商品名称"
        width="120" />

      <el-table-column
        prop="price"
        label="价格"
        width="120" />

      <el-table-column
        prop="sales_count"
        label="近30天下单商品数"
        width="120" />

      <el-table-column
        prop="amount"
        label="近30天下单金额"
        width="120" />

    </el-table>
  </div>

</template>

<script>
export default {
  name: 'List',
  data () {
    return {
      searchKeyword: '',
      tableData: [{
        name: '11111',
        price: '111.00',
        sales_count: 0,
        amount: 0
      }, {
        name: 'xxxxx33',
        price: '0.00',
        sales_count: 10,
        amount: 7.92
      }, {
        name: '8.10测试',
        price: '100.00',
        sales_count: 0,
        amount: 0
      }, {
        name: '测试商品',
        price: '88.00',
        sales_count: 5,
        amount: 288
      }, {
        name: 'Lenovo/联想Yoga BOOK WiFi平板二合一超薄笔记本电脑yoga book-副本',
        price: '0.00',
        sales_count: 0,
        amount: 0
      }, {
        name: '澳大利亚丁戈树红标经典红葡萄酒750ml-副本',
        price: '1000.00',
        sales_count: 0,
        amount: 0
      }, {
        name: '澳大利亚丁戈树红标经典红葡萄酒750ml-副本',
        price: '1000.00',
        sales_count: 0,
        amount: 0
      }, {
        name: 'yuyyyy-副本',
        price: '1.00',
        sales_count: 0,
        amount: 0
      }, {
        name: 'yuyyyy',
        price: '1.00',
        sales_count: 3,
        amount: 3
      }, {
        name: 'test123澳大利亚丁戈树红标经典红葡萄酒750ml',
        price: '0.00',
        sales_count: 0,
        amount: 0
      }, {
        name: '古尚古 懒人手机支架 手机通用指环创意卡扣粘贴式全金属卡通配件-副本',
        price: '15.00',
        sales_count: 0,
        amount: 0
      }, {
        name: '14.1英寸轻薄刀锋四核笔记本电脑手提固态商务学生游戏上网本分期-副本',
        price: '5600.00',
        sales_count: 0,
        amount: 0
      }, {
        name: '钻石金属 闪钻镶卡通指环扣懒人防摔折叠粘贴式手机配件支架批发-副本',
        price: '42.00',
        sales_count: 0,
        amount: 0
      }, {
        name: 'ertgewr',
        price: '100.00',
        sales_count: 19,
        amount: 2472
      }]
    }
  },
  methods: {
    search () {
      console.log('search', this.searchKeyword)
    }
  }
}
</script>

<style lang="scss" scoped>

</style>
