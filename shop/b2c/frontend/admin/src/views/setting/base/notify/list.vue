<template>
  <el-table border
    :data="tableData"
    style="width: 100%">
    <el-table-column
      label="通知类型">
      <template slot-scope="scope">

        <div class="table-logo"><img :src="scope.row.logo"></div>
				<span class="table-pay">{{scope.row.name}}</span><br>
				<span class="table-desc">提示：{{scope.row.tooltip}} 
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
      width="400">
      <template slot-scope="scope">
          	<!-- <td style="text-align: center;">
			
											<span><a href="/config/messageconfig.html?type=sms">配置</a></span>
										<span><a href="/config/notifytemplate.html?type=sms">模板</a></span>
											 <span class="is_close_136"><a href="javascript:;" onclick="setIsUse(136,0);">关闭</a></span>
											
					<br>
										<span><a href="/config/businessnotifytemplate.html?type=sms">商家通知</a></span>
					<span><a href="/config/notifylist.html?type=1">通知记录</a></span>
								</td> -->
        <el-button
          size="mini"
          @click="handleEdit(scope.$index, scope.row)">配置</el-button>
          <el-button
          size="mini"
          @click="handleEdit(scope.$index, scope.row)">模板</el-button>
          <el-button
          size="mini"
          @click="handleEdit(scope.$index, scope.row)">关闭</el-button>
          <el-button
          size="mini"
          @click="handleEdit(scope.$index, scope.row)">商家通知</el-button>
          <el-button
          size="mini"
          @click="handleEdit(scope.$index, scope.row)">通知记录</el-button>
      </template>
    </el-table-column>
  </el-table>
</template>

<script>
  export default {
    data() {
      return {
        tableData: [{
          logo: '/admin/images/mail.png',
          name: '邮件通知',
          status: true,
          tooltip: '使用该功能需开启php-sockets扩展'
        },{
          logo: '/admin/images/ali.png',
          name: '短信通知',
          status: false,
          tooltip: '使用该功能需开通阿里云短信业务'
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
