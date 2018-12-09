<template>
  <el-form ref="editForm" :rules="rules" :model="editForm" label-width="140px" size="small" label-position="right">

    <el-form-item label="活动名称" prop="name" required>
      <el-input v-model="editForm.name" />
    </el-form-item>

    <el-form-item label="活动有效期" required>
      <el-date-picker
        v-model="editForm.dateRange"
        type="datetimerange"
        range-separator="至"
        start-placeholder="开始日期"
        end-placeholder="结束日期" />
    </el-form-item>

    <el-form-item label="首刀比例">
      <el-input v-model="editForm.minFirstCutRate" type="number" style="width:200px" />
      -
      <el-input v-model="editForm.maxFirstCutRate" type="number" style="width:200px" />
      %
    </el-form-item>

    <el-form-item label="至少需要砍的次数" required>
      <el-input v-model="editForm.minNumber" type="number" >
        <template slot="append">
          次
        </template>
      </el-input>
    </el-form-item>

    <el-form-item label="可砍到的最低比例" required>
      <el-input v-model="editForm.minRate" type="number" >
        <template slot="append">
          %
        </template>
      </el-input>
    </el-form-item>

    <el-form-item label="选择商品">
      <el-button type="primary" @click="submitForm('editForm')">选择商品</el-button>
    </el-form-item>

    <el-form-item>
      <SimpleGoodsTable :table-data="editForm.goodsList" />
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
  name: 'Edit',
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
          { min: 1, max: 10, message: '长度在 1 到 10 个字符', trigger: 'blur' }
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
