<template>
  <el-table border
    :data="tableData"
    style="width: 100%">
    <el-table-column
      label="第三方登录">
      <template slot-scope="scope">

        <div class="table-logo"><img :src="scope.row.logo"></div>
				<span class="table-pay">{{scope.row.name}}</span><br>
				<span class="table-desc">提示：{{scope.row.tooltip}} 链接：<a :href="scope.row.link" target="_brank">{{scope.row.link}}</a>
				</span>
      </template>
    </el-table-column>
    <el-table-column
      label="状态"
      width="180">
      <template slot-scope="scope">
        <el-switch v-model="scope.row.status">
        </el-switch>
      </template>
    </el-table-column>
    <el-table-column label="操作"
      width="180">
      <template slot-scope="scope">
          <!-- <a href="/config/loginconfig.html?type=qq">配置</a> -->
        <el-button
          size="mini"
          @click="handleEdit(scope.$index, scope.row)">配置</el-button>
      </template>
    </el-table-column>
  </el-table>
</template>

<script>
  export default {
    data() {
      return {
        tableData: [{
          logo: '/admin/images/wchat.png',
          name: '微信登录',
          status: true,
          tooltip: '使用该功能需申请微信开放平台网站应用',
          link:'https://open.weixin.qq.com/'
        },{
          logo: '/admin/images/qq.png',
          name: 'QQ登录',
          status: false,
          tooltip: '使用该功能需申请QQ互联',
          link:'https://connect.qq.com/'
        }]
      }
    },
    methods: {
      handleEdit(index, row) {
        console.log(index, row);
      },
      handleDelete(index, row) {
        console.log(index, row);
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
