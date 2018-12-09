<template>
  <el-dialog :visible.sync="show" title="优惠券详情" size="small" width="30%" >
    <el-table
      :show-header="false"
      :data="couponDetailData"
      border
      style="width: 100%">

      <el-table-column
        prop="key"
        width="180" />

      <el-table-column
        prop="value" />
    </el-table>
    <div slot="footer" class="dialog-footer">
      <el-button size="small" @click="show = false">关 闭</el-button>
    </div>
  </el-dialog>
</template>

<script>
export default {
  props: {
    show: {
      type: Boolean,
      default: false
    },
    couponDetailData: {
      type: Array,
      default: null
    }
  }
}
</script>

<style lang="scss" scoped>
</style>
