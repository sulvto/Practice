<template>
  <div>
    <el-row :gutter="8">
      <el-col :span="12">
        <el-button type="primary" size="small">关闭区域代理(开启中)</el-button>
        <el-button type="primary" size="small">开启区域代理(关闭中)</el-button>
      </el-col>

      <el-col :span="10">
      </el-col>
      <el-col :span="2">
        <el-button type="primary" size="small" @click="search">保存</el-button>
      </el-col>
    </el-row>

    <br/>

    <el-table border :data="tableData" style="width: 100%">

      <el-table-column prop="name" label="代理级别">
      </el-table-column>

      <el-table-column
            label="各级奖励比例"
            width="120">
             <template slot-scope="scope">
              <el-input type="number"  v-model="scope.row.reward" >
                <template slot="append">
                        %
                </template>
              </el-input>
          </template>
          </el-table-column>

      <el-table-column
          label="升级条件"
          width="180">
            <template slot-scope="scope">
              <el-input type="number"  v-model="scope.row.upgradeCondition" >
                <template slot="append">
                        %
                </template>
              </el-input>
          </template>
          <template slot-scope="scope">

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
      config: {},
      tableData: [{
        name: '省级代理',
        reward: 10,
        upgradeCondition: 10
      }, {
        name: '市级代理',
        reward: 10,
        upgradeCondition: 10
      }, {
        name: '区级代理',
        reward: 10,
        upgradeCondition: 10
      }]
    }
  },
  methods: {
    handleEdit (index, row) {
      console.log(index, row)
    },
    handleDelete (index, row) {
      console.log(index, row)
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
