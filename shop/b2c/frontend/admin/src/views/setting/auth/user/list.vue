<template>
  <div>
    <el-row :gutter="8">
      <el-col :span="12">
        <el-button type="primary" size="small" @click="$router.push('userEdit.html')">添加用户</el-button>
      </el-col>

      <el-col :span="10"><el-input v-model="searchKeyword" size="small" placeholder="请输入用户名" /></el-col>
      <el-col :span="2">
        <el-button type="primary" size="small" @click="onSearch">查询</el-button>
      </el-col>
    </el-row>

    <br>

    <el-table :data="tableData" border style="width: 100%">
      <el-table-column label="用户头像" width="80">
        <template slot-scope="scope">
          <img :src="scope.row.portrait" class="head-portrait" >
        </template>
      </el-table-column>

      <el-table-column
        prop="username"
        label="登录账号" />

      <el-table-column
        prop="phoneNumber"
        label="手机号"
        width="120" />

      <el-table-column
        prop="email"
        label="邮箱" />

      <el-table-column
        prop="group"
        label="所属用户组"
        width="120" />

      <el-table-column
        label="状态"
        width="68">
        <template slot-scope="scope">
          <el-tag v-show="scope.row.status===1" type="success">正常</el-tag>
          <el-tag v-show="scope.row.status===2" type="error">锁定</el-tag>
        </template>
      </el-table-column>

      <el-table-column
        label="操作"
        fixed="right"
        width="380">

        <!-- 管理员用户不可进行操作 -->
        <template slot-scope="scope">
          <el-button size="mini" @click="handleEdit(scope.$index, scope.row)">修改</el-button>
          <el-button v-show="scope.row.status!==2" size="mini" @click="handleEdit(scope.$index, scope.row)">锁定</el-button>
          <el-button v-show="scope.row.status===2" size="mini" @click="handleEdit(scope.$index, scope.row)">解锁</el-button>
          <el-button size="mini" @click="handleEdit(scope.$index, scope.row)">删除</el-button>
          <el-button size="mini" @click="handleEdit(scope.$index, scope.row)">重置密码</el-button>
        </template>
      </el-table-column>
    </el-table>
  </div>
</template>

<script>
import DefaultUserPortrait from '@/assets/img/default_user_portrait.gif'

export default {
  name: 'UserList',
  data () {
    return {
      tableData: [{
        portrait: DefaultUserPortrait,
        phoneNumber: '',
        username: 'admin',
        status: 1,
        group: '管理员组',
        email: 'sulvto@gmail.com'
      }, {
        portrait: DefaultUserPortrait,
        phoneNumber: '',
        username: 'admin1',
        status: 1,
        group: '管理员组',
        email: ''
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
.head-portrait {
  width: 30px;
  height: 30px;
  border-radius: 50%;
}
</style>
