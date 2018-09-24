<template>

    <el-dialog title="设置商品折扣" size="small" :visible.sync="dialogSetMemberDiscountFormVisible">
      <el-form ref="setMemberDiscountForm" size="small" :model="setMemberDiscountForm" label-width="100px" >

        <el-form-item label="黄金会员">
          <el-input type="number" min="0" max="100" step="1" v-model="setMemberDiscountForm.salePrice" >
            <template slot="append">
                %
            </template>
          </el-input>
        </el-form-item>

        <el-form-item label="价格保留方式">
          <el-radio-group v-model="setMemberDiscountForm.priceRetentionMethod">
            <el-radio :label="1">抹去角和分</el-radio>
            <el-radio :label="0">抹去分</el-radio>
          </el-radio-group>
        </el-form-item>

      </el-form>
      <div slot="footer" class="dialog-footer">
        <el-button size="small" @click="dialogSetMemberDiscountFormVisible = false">取 消</el-button>
        <el-button size="small" type="primary" @click="submitForm('classForm')">保 存</el-button>
      </div>
    </el-dialog>
</template>
