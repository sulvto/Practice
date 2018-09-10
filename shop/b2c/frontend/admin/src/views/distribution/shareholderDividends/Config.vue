<template>
  <div>
    <el-row :gutter="8">
      <el-col :span="12">
        <el-button type="default" size="small" @click="$router.push('addPartnerLevel.html')">添加股东等级</el-button>
        <el-button type="primary" size="small">关闭股东分红(开启中)</el-button>
        <el-button type="primary" size="small">开启股东分红(关闭中)</el-button>
      </el-col>

      <el-col :span="10">
      </el-col>
      <el-col :span="2">
      </el-col>
    </el-row>

    <br/>

    <el-table border :data="tableData" style="width: 100%">

      <el-table-column
            prop="name"
            label="等级名称"
            width="120">
          </el-table-column>

      <el-table-column label="申请最低消费">
          <template slot-scope="scope">

              <div class="table-logo"><img :src="scope.row.logo"></div>
              <span class="table-pay">{{scope.row.name}}</span><br>
              <span class="table-desc">提示：{{scope.row.tooltip}} 链接：<a :href="scope.row.link" target="_brank">{{scope.row.link}}</a>
              </span>
          </template>
      </el-table-column>

      <el-table-column label="股东分红佣金比率">
          <template slot-scope="scope">

              <div class="table-logo"><img :src="scope.row.logo"></div>
              <span class="table-pay">{{scope.row.name}}</span><br>
              <span class="table-desc">提示：{{scope.row.tooltip}} 链接：<a :href="scope.row.link" target="_brank">{{scope.row.link}}</a>
              </span>
          </template>
      </el-table-column>

      <el-table-column
            prop="createDate"
            label="创建时间"
            width="120">
          </el-table-column>

      <el-table-column label="操作" fixed="right"
          width="180">
          <template slot-scope="scope">
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
        logo: '/admin/images/wchat.png',
        name: '初级股东',
        status: true,
        tooltip: '使用该功能需申请微信开放平台网站应用',
        link: 'https://open.weixin.qq.com/'
      }, {
        logo: '/admin/images/qq.png',
        name: '中级股东',
        status: false,
        tooltip: '使用该功能需申请QQ互联',
        link: 'https://connect.qq.com/'
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
