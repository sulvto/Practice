<template>
  <div>
    <el-row :gutter="8">
      <el-col :span="12">
        <el-button type="primary" size="small" @click="$router.push('edit.html')">添加广告</el-button>
        <el-button type="primary" size="small">PC端</el-button>
        <el-button type="primary" size="small">手机端</el-button>
      </el-col>

      <el-col :span="10">
      </el-col>
      <el-col :span="2">
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
        label="名称">
      </el-table-column>

      <el-table-column
        prop="position"
        label="所属广告位">
      </el-table-column>

      <el-table-column
        prop="link"
        label="链接地址"
        width="120">
      </el-table-column>

      <el-table-column
          label="排序"
          width="80">
        <template slot-scope="scope">
          <el-input type="number" size="small" v-model="scope.row.sort" >
          </el-input>
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
        name: '广告栏一图片1',
        position: '商城首页中部推荐广告位',
        sort: 1,
        link: 'javascript:;',
        type: 'pc'
      }, {
        name: '推荐楼层1楼——轮播图1',
        position: '推荐楼层1楼——轮播图广告位',
        sort: 1,
        link: '#'
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
