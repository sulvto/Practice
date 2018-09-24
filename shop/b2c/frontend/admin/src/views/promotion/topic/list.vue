<template>
  <div>
    <el-tabs v-model="tabActiveName" @tab-click="handleClick">
      <el-tab-pane label="全部" name="first"></el-tab-pane>
      <el-tab-pane label="进行中" name="second"></el-tab-pane>
      <el-tab-pane label="已关闭" name="third"></el-tab-pane>
      <el-tab-pane label="已结束" name="fourth"></el-tab-pane>
    </el-tabs>

    <el-row :gutter="8">
      <el-col :span="12">
        <el-button type="danger" size="small">批量删除</el-button>
        <el-button type="primary" size="small" @click="$router.push('edit.html')">添加专题活动</el-button>
      </el-col>

      <el-col :span="10">
        <el-input size="small" v-model="searchKeyword" placeholder="请输入专题活动名称"></el-input>
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
        label="活动名称">
      </el-table-column>

      <el-table-column
        label="图像"
        width="120">
        <template slot-scope="scope">
            <img src="http://showfx.niuteam.cn/upload/common/1533095180.jpg">
        </template>
      </el-table-column>

      <el-table-column
          label="活动状态"
          width="180">
        <template slot-scope="scope">
            <span v-if="scope.row.status === 1">进行中</span>
            <span v-if="scope.row.status === 2">已关闭</span>
            <span v-if="scope.row.status === 3">已结束</span>
        </template>
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
          width="300">
          <template slot-scope="scope">
              <el-button size="mini" @click="handleEdit(scope.$index, scope.row)">预览</el-button>
              <el-button size="mini" @click="handleEdit(scope.$index, scope.row)">编辑</el-button>
              <el-button size="mini" @click="showTopicDetailDialog(scope.row)">详情</el-button>
              <el-button size="mini" @click="handleDelete(scope.$index, scope.row)">删除</el-button>
          </template>
      </el-table-column>
    </el-table>

    <el-dialog title="设置商品折扣" size="small" :visible.sync="dialogTopicDetailVisible">
      <el-form size="small" :model="topicDetail" label-width="100px" >

        <el-form-item label="活动名称">
          {{ topicDetail.name }}
        </el-form-item>

        <el-form-item label="关键字">
          {{ topicDetail.keyword }}
        </el-form-item>

        <el-form-item label="描述">
          {{ topicDetail.description }}
        </el-form-item>

        <el-form-item label="图像">
          img
        </el-form-item>

        <el-form-item label="条幅">
          img
        </el-form-item>

        <el-form-item label="背景图">
          img
        </el-form-item>

        <el-form-item label="有效期">
          {{ topicDetail.startDate }} 至 {{ topicDetail.endDate }}
        </el-form-item>

        <el-form-item label="活动状态">
          <span v-if="topicDetail.status === 1">进行中</span>
          <span v-if="topicDetail.status === 2">已关闭</span>
          <span v-if="topicDetail.status === 3">已结束</span>
        </el-form-item>

        <el-form-item label="商品列表">
          商品列表
        </el-form-item>
      </el-form>
      <div slot="footer" class="dialog-footer">
        <el-button size="small" @click="dialogTopicDetailVisible = false">取 消</el-button>
      </div>
    </el-dialog>

  </div>
</template>

<script>
export default {
  name: 'list',
  data () {
    return {
      searchKeyword: '',
      tabActiveName: 'first',
      dialogTopicDetailVisible: false,
      topicDetail: {},
      tableData: [{
        name: '@A',
        status: 3,
        startDate: '2018-08-01 11:46:46',
        endDate: '2018-08-14 11:46:49'
      }]
    }
  },
  methods: {
    showTopicDetailDialog (topic) {
      this.topicDetail = topic
      this.dialogTopicDetailVisible = true
    },
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
