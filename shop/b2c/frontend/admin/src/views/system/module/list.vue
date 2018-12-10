<template>
  <div>
    <el-row :gutter="8">
      <el-col :span="12">
        <el-button type="primary" size="small" @click="$router.push('edit.html')">添加模块</el-button>
      </el-col>

    </el-row>

    <br>

    <el-table :data="tableData" border style="width: 100%">

      <el-table-column
        width="35">
        <template slot-scope="scope">
          <div class="click-icon">
            <el-tooltip effect="dark" content="展开" placement="top">
              <i v-if="scope.row.level !== 2" v-show="isNotCollapse(scope.row.id)" class="el-icon el-icon-arrow-right" @click="collapseChange(scope.row.id, true)" />
            </el-tooltip>

            <el-tooltip effect="dark" content="收起" placement="top">
              <i v-if="scope.row.level !== 2" v-show="isCollapse(scope.row.id)" class="el-icon el-icon-arrow-down" @click="collapseChange(scope.row.id, false)" />
            </el-tooltip>
          </div>
        </template>
      </el-table-column>

      <el-table-column label="模块名">
        <template slot-scope="scope">
          <div v-if="scope.row.level === 2" >

            <el-row :gutter="1">
              <el-col :span="2">
                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
              </el-col>
              <el-col :span="2">
                |——
              </el-col>
              <el-col :span="20">
                <el-input v-model="scope.row.name" size="mini" @blur="saveModule" />
              </el-col>
            </el-row>
          </div>
          <div v-else-if="scope.row.level === 1" >
            <el-row :gutter="8">
              <el-col :span="2">
                |——
              </el-col>
              <el-col :span="22">
                <el-input v-model="scope.row.name" size="mini" @blur="saveModule" />
              </el-col>
            </el-row>
          </div>
          <div v-else>
            <el-row :gutter="8">
              <el-col :span="24">
                <el-input v-model="scope.row.name" size="mini" @blur="saveModule" />
              </el-col>
            </el-row>
          </div>

        </template>
      </el-table-column>

      <el-table-column
        label="是否是菜单"
        width="100">
        <template slot-scope="scope">
          <span>{{ scope.row.isShow ? '是' : '否' }}</span>
        </template>
      </el-table-column>

      <el-table-column
        prop="sort"
        label="排序"
        width="50" />

      <el-table-column
        label="操作"
        fixed="right"
        width="180">
        <template slot-scope="scope">
          <el-button size="mini" @click="handleEdit(scope.$index, scope.row)">修改</el-button>
          <el-button size="mini" @click="handleDelete(scope.row.id)">删除</el-button>
        </template>
      </el-table-column>
    </el-table>

  </div>
</template>

<script>
import { fetchList, del } from '@/api/system/module'

export default {
  name: 'ModuleList',
  data () {
    return {
      searchKeyword: '',
      collapseList: [],
      moduleList: []
    }
  },
  computed: {
    tableData () {
      var result = []
      // sort
      for (let i = 0; i < this.moduleList.length; i++) {
        var cursorItem = this.moduleList[i]
        var find = result.find(item => cursorItem.id === item.id)

        // if 没有添加到 result
        //    if 是顶层分类(cursorItem.level === 0)
        //    elseif 父分类 isCollapse
        //    elseif 父分类 在result
        if (!find &&
          (cursorItem.level === 0 || this.isCollapse(cursorItem.parentId)) &&
          (cursorItem.level === 0 || result.find(item => item.id === cursorItem.parentId))) {
          console.log('unfind tableData', cursorItem.name, result.length)
          var addItem = cursorItem
          result.push(addItem)
          console.log('result.push 0 tableData', addItem.name, result.length)
          this.findChildCategroy(addItem.id)
            .filter(item => this.isCollapse(item.parentId))
            .forEach(item => {
              result.push(item)
              console.log('result.push 1 tableData', item.name, result.length)

              this.findChildCategroy(item.id)
                .filter(childItem => this.isCollapse(childItem.parentId))
                .forEach(childItem => {
                  result.push(childItem)
                  console.log('result.push 2 tableData', childItem.name, result.length)
                })
            })
        } else {
          console.log('find tableData', cursorItem.name)
        }
      }

      //
      for (let i = result.length - 1; i >= 0; i--) {
        if (result.findIndex(item => item.id === result[i].id) !== i) {
          result.splice(i, 1)
        }
      }

      return result
    }
  },
  created () {
    this.loadData()
  },
  methods: {
    loadData () {
      fetchList().then(response => {
        if (response.code === 0) {
          this.moduleList = response.data.items
        }
      })
    },
    handleEdit (index, item) {
      this.$router.push({ path: 'edit.html', query: { id: item.id }})
    },
    handleDelete (id) {
      del([id]).then(response => {
        if (response.code === 0) {
          this.loadData()
        }
      })
    },
    saveModule (category) {
      this.$message.success('操作成功')
    },
    addChildCategory (parent) {
      if (parent.level !== 2) {
        this.moduleList.push({ parentId: parent.id, level: (parent.level | 0) + 1, id: new Date().getTime() })
      }
    },
    findChildCategroy (id) {
      return this.moduleList.filter(item => item.parentId === id)
    },
    collapseChange (id, bool) {
      if (bool) {
        if (this.isNotCollapse(id)) {
          this.collapseList.push(id)
        }
      } else if (this.isCollapse(id)) {
        var removeIndex = this.collapseList.findIndex((item) => item === id)
        this.collapseList.splice(removeIndex, 1)
      }
    },
    isCollapse (id) {
      return this.collapseList.includes(id)
    },
    isNotCollapse (id) {
      return !this.isCollapse(id)
    }

  }
}
</script>

<style lang="scss" scoped>
.click-icon {
  :hover {
    cursor: pointer;
  }
}
</style>
