<template>

  <div>

    <el-row :gutter="20">
      <el-col :span="6">
        <el-button type="primary" size="medium" @click="location.href='/extend/addhooks.html';">添加钩子</el-button>
      </el-col>
    </el-row>

    <br>

    <el-table
      :data="tableData"
      border
      style="width: 100%">
      <el-table-column
        fixed
        prop="name"
        label="名称"
        width="300" />
      <el-table-column
        prop="type"
        label="类型"
        width="120" />
      <el-table-column
        prop="description"
        label="描述"
        width="300" />
      <el-table-column
        fixed="right"
        label="操作">
        <template slot-scope="scope">
          <el-button type="text" size="small" @click="handleClick(scope.row)" >修改</el-button>
          <el-button type="text" size="small">删除</el-button>
        </template>
      </el-table-column>
    </el-table>
  </div>
</template>

<script>
export default {
  name: 'HooksList',
  data () {
    return {
      tableData: [
        {
          id: 10,
          name: 'orderGoodsConfirmRefundSuccess',
          type: '控制器',
          description: '订单退款结果通知'
        },
        {
          id: 12,
          name: 'orderGoodsRefundAskforSuccess',
          type: '控制器',
          description: '订单退款申请通知'
        },
        {
          id: 13,
          name: 'orderOffLinePaySuccess',
          type: '控制器',
          description: '订单线下支付成功通知'
        },
        {
          id: 14,
          name: 'orderOnLinePaySuccess',
          type: '控制器',
          description: '订单线上支付成功通知'
        },
        {
          id: 15,
          name: 'memberBalanceRechargeSuccess',
          type: '控制器',
          description: '余额充值成功通知'
        },
        {
          id: 16,
          name: 'orderDistributionSuccess',
          type: '控制器',
          description: '订单完成发放佣金'
        },
        {
          id: 17,
          name: 'promoterAuditAgreeSuccess',
          type: '控制器',
          description: '推广员申请审核通过'
        },
        { id: 18, name: 'ww', type: '视图', description: '' },
        {
          id: 19,
          name: 'goodsAttributeDeleteSuccess',
          type: '视图',
          description: '商品类型删除成功'
        },
        {
          id: 20,
          name: 'goodsAttributeSaveSuccess',
          type: '控制器',
          description: '商品类型保存成功'
        },
        {
          id: 21,
          name: 'goodsSpecDeleteSuccess',
          type: '控制器',
          description: '商品规格删除成功'
        },
        {
          id: 22,
          name: 'goodsSpecSaveSuccess',
          type: '控制器',
          description: '商品规格保存成功'
        },
        {
          id: 23,
          name: 'goodsGroupDeleteSuccess',
          type: '控制器',
          description: '商品分组删除成功'
        },
        {
          id: 24,
          name: 'goodsGroupSaveSuccess',
          type: '控制器',
          description: '商品分组保存成功'
        }
      ]
    }
  }
}
</script>
