<template>
  <div>
    <el-row :gutter="8">
      <el-col :span="12">
        <el-button type="primary" size="small" @click="$router.push('edit.html')">添加等级</el-button>
      </el-col>

    </el-row>

    <br>

    <el-table :data="tableData" border style="width: 100%">

      <el-table-column
        prop="name"
        label="等级名称" />

      <el-table-column
        prop="upgradeCondition"
        label="升级条件"
        width="200" />

      <el-table-column
        prop="discount"
        label="折扣率（%）"
        width="120" />

      <el-table-column
        label="操作"
        fixed="right"
        width="180">
        <template slot-scope="scope">
          <el-button size="mini" @click="handleEdit(scope.$index, scope.row)">修改</el-button>
          <el-button v-if="!scope.row.isDefault" size="mini" @click="handleDelete(scope.$index, scope.row)">删除</el-button>
        </template>
      </el-table-column>
    </el-table>
  </div>
</template>

<script>
export default {
  name: 'MemberLevelList',
  data () {
    return {
      searchKeyword: '',
      tableData: [{
        isDefault: true,
        name: '普通会员',
        upgradeCondition: '累计积分满200分',
        discount: '95'
      }, {
        name: '铜牌会员',
        upgradeCondition: '累计积分满0分',
        discount: '93'
      }, {
        name: '银牌会员',
        upgradeCondition: '累计积分满1500分',
        discount: '92'
      }, {
        name: '金牌会员',
        upgradeCondition: '累计积分满3000分',
        discount: '88'
      }, {
        name: '至尊会员',
        upgradeCondition: '消费额度满20000元',
        discount: '60'
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
</style>
