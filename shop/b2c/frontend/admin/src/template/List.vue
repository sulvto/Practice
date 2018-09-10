<template>
  <div>
    <el-row :gutter="8">
      <el-col :span="12">
        <el-button type="danger" size="small">批量删除</el-button>
        <el-button type="primary" size="small">添加物流公司</el-button>
      </el-col>

      <el-col :span="10">
        <el-input size="small" v-model="searchKeyword" placeholder="请输入物流公司名称或编号"></el-input>
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

      <el-table-column label="第三方登录">
        <template slot-scope="scope">
          <div class="table-logo"><img :src="scope.row.logo"></div>
          <span class="table-pay">{{scope.row.name}}</span><br>
          <span class="table-desc">提示：{{scope.row.tooltip}} 链接：<a :href="scope.row.link" target="_brank">{{scope.row.link}}</a>
          </span>
        </template>
      </el-table-column>

      <el-table-column
        prop="type"
        label="类型"
        width="120">
      </el-table-column>

      <el-table-column
          label="状态"
          width="180">
        <template slot-scope="scope">
            <el-switch v-model="scope.row.status">
            </el-switch>
        </template>
      </el-table-column>

      <el-table-column label="操作" fixed="right"
          width="180">
          <template slot-scope="scope">
              <!-- <a href="/config/loginconfig.html?type=qq">配置</a> -->
              <el-button size="mini" @click="handleEdit(scope.$index, scope.row)">配置</el-button>
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
        name: '微信登录',
        status: true,
        tooltip: '使用该功能需申请微信开放平台网站应用',
        link: 'https://open.weixin.qq.com/'
      }, {
        logo: '/admin/images/qq.png',
        name: 'QQ登录',
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
