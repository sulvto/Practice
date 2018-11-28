<template>
    <el-dialog title="优惠券详情" size="small" width="30%" :visible.sync="show">
      <el-table
        border
        :show-header="false"
        :data="couponDetailData"
        style="width: 100%">
        <el-table-column
          prop="key"
          width="180">
        </el-table-column>
        <el-table-column
          prop="value">
        </el-table-column>
      </el-table>
      <div slot="footer" class="dialog-footer">
        <el-button size="small" @click="show = false">关 闭</el-button>
      </div>
    </el-dialog>
</template>

<script>
export default {
  props: {
    show: Boolean,
    couponDetailData: Array
  }
}
</script>

<style lang="scss" scoped>
</style>
