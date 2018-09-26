<template>
  <div>
    <el-tabs v-model="currentType">
      <el-tab-pane v-for="o in 3" :key="o" :label="typeName[o]" :name="o">
      </el-tab-pane>
    </el-tabs>

    <el-row :gutter="8">
      <el-col :span="12">
        <el-button v-if="currentType === 1" type="primary" size="small" @click="addMedia()">添加文本消息</el-button>
        <el-button v-if="currentType === 2" type="primary" size="small" @click="addMedia()">添加单图文消息</el-button>
        <el-button v-if="currentType === 3" type="primary" size="small" @click="addMedia()">添加多图文消息</el-button>
      </el-col>

      <el-col :span="10">
        <el-input size="small" v-model="searchKeyword" placeholder="请输入消息名称"></el-input>
      </el-col>
      <el-col :span="2">
        <el-button type="primary" size="small" @click="search">查询</el-button>
      </el-col>
    </el-row>

    <br/>

    <el-table border :data="tableData" style="width: 100%">
      <el-table-column label="标题">
        <template slot-scope="scope">
          <el-tag>{{ typeName[scope.row.type] }}</el-tag>
          <span>{{ scope.row.content }}
          </span>
        </template>
      </el-table-column>

      <el-table-column
        prop="createDate"
        label="创建时间"
        width="140">
      </el-table-column>

      <el-table-column label="操作" fixed="right"
          width="180">
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
  name: 'materialMessage',
  data () {
    return {
      currentType: 1,
      typeName: {
        1: '文本',
        2: '单图文',
        3: '多图文'
      },
      list: [
        {
          content: '文本',
          createDate: '2018-08-06 02:44:12',
          type: 1
        }, {
          content: 'aaaaaaaaaa',
          createDate: '2018-08-06 02:44:12',
          type: 2
        }, {
          content: 'asdsf',
          createDate: '2018-08-06 02:44:12',
          type: 3
        }, {
          content: '阿斯顿',
          createDate: '2018-08-06 02:44:12',
          type: 1
        }, {
          content: '阿的和',
          createDate: '2018-08-06 02:44:12',
          type: 2
        }, {
          content: '阿的阿斯顿和',
          createDate: '2018-08-06 02:44:12',
          type: 2
        }, {
          content: '阿的三四三和',
          createDate: '2018-08-06 02:44:12',
          type: 3
        }, {
          content: '阿啊啊啊啊啊',
          createDate: '2018-08-06 02:44:12',
          type: 2
        }, {
          content: '啦啦啦理论',
          createDate: '2018-08-06 02:44:12',
          type: 1
        }
      ]
    }
  },
  methods: {
    addMedia () {
      this.$router.push('addMedia.html?type=' + this.currentType)
    }
  },
  computed: {
    tableData () {
      let that = this
      return this.list.filter(item => item.type === that.currentType)
    }
  }
}
</script>
