<template>
  <div>
    <el-row :gutter="8">
      <el-col :span="12">
        <el-button type="danger" size="small">批量删除</el-button>
        <el-button type="primary" size="small" @click="$router.push('edit.html')">添加团购活动</el-button>
      </el-col>

      <el-col :span="10">
        <el-input size="small" v-model="searchKeyword" placeholder="请输入活动名称"></el-input>
      </el-col>
      <el-col :span="2">
        <el-button type="primary" size="small" @click="search">查询</el-button>
      </el-col>
    </el-row>

    <br/>

    <el-table border :data="tableData" style="width: 100%">
      <el-table-column
        type="selection"
        width="35">
      </el-table-column>

      <el-table-column
        prop="name"
        label="活动名称"
        width="120">
      </el-table-column>

      <el-table-column label="商品名称">
        <template slot-scope="scope">
          <a :href="'/goods/goodsinfo?goodsid=' + scope.row.goodsId" target="_blank">{{ scope.row.goodsName }}</a>
        </template>
      </el-table-column>

      <el-table-column
        prop="maxNumber"
        label="最大购买量"
        width="120">
      </el-table-column>

      <el-table-column
        prop="minNumber"
        label="最小购买量"
        width="120">
      </el-table-column>

      <el-table-column
          label="有效时间"
          width="210">
        <template slot-scope="scope">
          开始时间：{{ scope.row.startDate }}
          <br>
          结束时间：{{ scope.row.endDate }}
        </template>
      </el-table-column>

      <el-table-column label="操作" fixed="right"
          width="180">
          <template slot-scope="scope">
              <el-button size="mini" @click="handleEdit(scope.$index, scope.row)">编辑</el-button>
              <el-button size="mini" @click="handleDelete(scope.$index, scope.row)">删除</el-button>
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
      searchKeyword: '',
      tableData: [{
        name: '活动名称',
        goodsName: 'DOMO男士高端衬衣潮男雅痞英伦风大尖领湖蓝红色波点衬衣个性达人',
        goodsId: '9',
        maxNumber: 111,
        minNumber: 1,
        startDate: '2018-07-02 10:46:53',
        endDate: '2018-07-27 10:46:50'
      }, {
        name: '团购名称',
        goodsName: '夏欧美性感气质名媛女高腰修身显瘦黑色不规则吊带背心无袖连衣裙',
        goodsId: '6',
        maxNumber: 10,
        minNumber: 1,
        startDate: '2018-09-05 00:57:51',
        endDate: '2018-09-20 00:57:47'
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
