<template>
  <div>

    <el-row :gutter="8">
      <el-col :span="12">
        <el-button type="danger" size="small">批量删除</el-button>
        <el-button type="primary" size="small">添加文章</el-button>
      </el-col>

      <el-col :span="10">
        <el-input v-model="searchKeyword" size="small" placeholder="请输入文章标题或分类名称" />
      </el-col>
      <el-col :span="2">
        <el-button type="primary" size="small" @click="search">查询</el-button>
      </el-col>
    </el-row>

    <br>

    <el-table :data="tableData" border style="width: 100%">
      <el-table-column
        type="selection"
        width="35" />

      <el-table-column
        prop="title"
        label="标题" />

      <el-table-column
        prop="type"
        label="分类" />

      <el-table-column
        label="点击量 / 评论量"
        width="120">
        <template slot-scope="scope">
          {{ scope.row.clickCount }} / {{ scope.row.commentCount }}
        </template>
      </el-table-column>

      <el-table-column
        prop="status"
        label="状态"
        width="120" />

      <el-table-column
        prop="publishDate"
        label="发布时间"
        width="140" />

      <el-table-column
        prop="sort"
        label="排序"
        width="120" />

      <el-table-column
        label="操作"
        width="250">
        <template slot-scope="scope">
          <!-- <a href="/config/loginconfig.html?type=qq">配置</a> -->
          <el-button size="mini" @click="handleEdit(scope.$index, scope.row)">预览</el-button>
          <el-button size="mini" @click="handleEdit(scope.$index, scope.row)">修改</el-button>
          <el-button size="mini" @click="handleEdit(scope.$index, scope.row)">删除</el-button>
        </template>
      </el-table-column>
    </el-table>
  </div>
</template>

<script>
export default {
  name: 'ArticleList',
  data () {
    return {
      tableData: [{
        id: '1',
        title: '新闻',
        type: '新闻1',
        clickCount: '56',
        commentCount: '0',
        status: '已发布',
        publishDate: '2018-07-18 14:09:46',
        sort: '22'
      }, {
        id: '2',
        title: 'rewqrewqrqew',
        type: '新闻1',
        clickCount: '4356',
        commentCount: '4312',
        status: '已发布',
        publishDate: '2018-08-06 10:11:56',
        sort: '33'
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
