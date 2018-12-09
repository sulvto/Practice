<template>
  <el-form ref="editForm" :rules="rules" :model="editForm" label-width="100px" size="small" label-position="right">

    <el-form-item label="组合套餐名称" required>
      <el-input v-model="editForm.name" />
    </el-form-item>

    <el-form-item label="组合套餐价格" required>
      <el-input v-model="editForm.price" type="number" min="0" >
        <template slot="append">
          元
        </template>
      </el-input>
    </el-form-item>

    <el-form-item label="原价">
      {{ editForm.goodsList.length > 1 ? (editForm.goodsList.map(goodsListItem => goodsListItem.price).reduce((price1, price2) => price1 + price2)) : 0.00 }}元
    </el-form-item>

    <el-form-item label="节省价">
      {{ editForm.goodsList.length > 1 ? (editForm.goodsList.map(goodsListItem => goodsListItem.price).reduce((price1, price2) => price1 + price2) - editForm.price) : 0.00 }}元
    </el-form-item>

    <el-form-item label="是否上架">
      <el-switch v-model="editForm.shelvesUp" active-text="是" inactive-text="否" />
    </el-form-item>

    <el-form-item label="选择商品">
      <el-button type="primary" @click="submitForm('editForm')">选择商品</el-button>
      <p class="hint">组合套餐商品不能少于两种不能多于六种</p>
    </el-form-item>

    <el-form-item>
      <SimpleGoodsTable :table-data="editForm.goodsList"/>
    </el-form-item>

    <el-form-item>
      <el-button type="primary" @click="submitForm('editForm')">保存</el-button>
      <el-button type="info" @click="$router.back()">返回</el-button>
    </el-form-item>
  </el-form>
</template>

<script>
import SimpleGoodsTable from '@/components/SimpleGoodsTable.vue'

export default {
  name: 'CombopackageEdit',
  components: {
    SimpleGoodsTable
  },
  data () {
    return {
      editForm: {
        goodsList: []
      },
      rules: {
        name: [
          { required: true, message: '请输入活动名称', trigger: 'blur' },
          { min: 3, max: 5, message: '长度在 3 到 5 个字符', trigger: 'blur' }
        ]
      }
    }
  },
  methods: {
    submitForm () {
      console.log('submitForm', this.editForm)
    }
  }
}
</script>

<style lang="scss" scoped>
.hint {
  font-size: 12px;
  line-height: 16px;
  color: #999999;
  margin: 10px 0 0;
}

.important-note {
  color: #ff6600;
  font-style: normal;
}
</style>
