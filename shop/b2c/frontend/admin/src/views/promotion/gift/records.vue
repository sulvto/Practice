<!-- <h4>操作提示</h4> -->
<!-- <p>赠品发放记录</p> -->

<template>
  <div>
    <el-row :gutter="8">
      <el-col :span="10" :offset="12">
        <el-input size="small" v-model="searchKeyword" placeholder="请输入活动名称"></el-input>
      </el-col>
      <el-col :span="2">
        <el-button type="primary" size="small" @click="search">查询</el-button>
      </el-col>
    </el-row>

    <br/>

    <el-table border :data="tableData" style="width: 100%">

      <el-table-column
        prop="name"
        label="赠品名称">
      </el-table-column>

      <el-table-column
        label="发放商品信息">
        <template slot-scope="scope">
            <img :src="scope.row.goodsImg" />
            <span>{{scope.row.goodsName}}</span>
        </template>
      </el-table-column>

      <el-table-column
        prop="type"
        label="发放类型"
        width="120">
      </el-table-column>

      <el-table-column
        prop="username"
        label="发放用户">
      </el-table-column>

      <el-table-column
        prop="date"
        label="发放时间"
        width="180">
      </el-table-column>

      <el-table-column
        prop="notes"
        label="备注"
        width="380">
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
        date: '2018-07-09 12:19:01',
        name: 'namename',
        goodsImg: '/admin/images/wchat.png',
        goodsName: '12313434545565',
        notes: '使用该功能需申请微信开放平台网站应用',
        type: '游戏'
      }, {
        date: '2018-07-09 12:19:01',
        name: 'aaaaa',
        goodsImg: '/admin/images/wchat.png',
        goodsName: '12313434545565',
        notes: '使用该功能需申请微信开放平台网站应用',
        type: '游戏'
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
