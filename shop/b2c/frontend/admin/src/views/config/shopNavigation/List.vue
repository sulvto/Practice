<template>
  <div>
    <el-tabs v-model="tabName" @tab-click="handleClick">
      <el-tab-pane label="PC端" name="pc" />
      <el-tab-pane label="手机端" name="mobile" />
    </el-tabs>
    <el-row :gutter="8">
      <el-col :span="12">
        <el-button type="danger" size="small">批量删除</el-button>
        <el-button type="primary" size="small" @click="$router.push('edit.html')">添加导航栏</el-button>
      </el-col>

      <el-col :span="10" />
      <el-col :span="2" />
    </el-row>

    <br>

    <el-table :data="tableData" border style="width: 100%">
      <el-table-column
        type="selection"
        width="35" />

      <el-table-column
        prop="name"
        label="导航名称" />

      <el-table-column
        prop="link"
        label="链接地址" />

      <el-table-column
        prop="type"
        label="所属类型"
        width="80" />

      <el-table-column
        label="是否显示"
        width="80">
        <template slot-scope="scope">
          {{ scope.row.isShow ? '是' : '否' }}
        </template>
      </el-table-column>

      <el-table-column
        prop="createDate"
        label="创建时间"
        width="140" />
      <el-table-column
        prop="sort"
        label="排序"
        width="50" />

      <el-table-column
        label="操作"
        fixed="right"
        width="155">
        <template slot-scope="scope">
          <el-button size="mini" @click="handleEdit(scope.$index, scope.row)">修改</el-button>
          <el-button size="mini" @click="handleDelete(scope.$index, scope.row)">删除</el-button>
        </template>
      </el-table-column>
    </el-table>
  </div>
</template>

<script>
export default {
  name: 'Edit',
  data () {
    return {
      TAB_PC: 'pc',
      TAB_MOBILE: 'mobile',
      tabName: 'pc',
      tableData: [
        {
          name: '领券中心',
          link: 'http://showfx.niuteam.cn/goods/couponlist',
          type: 'pc',
          createDate: '2018-07-20 16:44:39',
          isShow: true,
          sort: 0
        }, {
          name: '111',
          link: 'http://showfx.niuteam.cn/goods/promotionZone',
          type: 'pc',
          createDate: '2018-08-10 14:17:49',
          isShow: true,
          sort: 0
        }, {
          name: '积分中心',
          link: 'http://showfx.niuteam.cn/goods/integralcenter',
          type: 'pc',
          createDate: '2018-09-05 09:13:26',
          isShow: true,
          sort: 0
        }, {
          name: '首页',
          link: 'http://showfx.niuteam.cn/index',
          type: 'pc',
          createDate: '2018-09-05 09:23:37',
          isShow: true,
          sort: 0
        }, {
          name: '限时折扣',
          link: 'http://showfx.niuteam.cn/index/discount',
          type: 'pc',
          createDate: '2018-09-05 09:23:48',
          isShow: true,
          sort: 0
        }, {
          name: '品牌列表',
          link: 'http://showfx.niuteam.cn/goods/brandlist',
          type: 'pc',
          createDate: '2018-09-05 09:24:00',
          isShow: true,
          sort: 0
        }, {
          name: '标签专区',
          link: 'http://showfx.niuteam.cn/goods/promotionZone',
          type: 'pc',
          createDate: '2018-09-05 10:04:34',
          isShow: true,
          sort: 0
        }
      ]
    }
  },
  watch: {
    tabName (newValue, oldValue) {
      console.log('TAB:', newValue)
    }
  },
  methods: {
    handleClick () {
      console.log(arguments, this.tabName)
    }
  }
}
</script>

<style lang="scss" scoped>
</style>
