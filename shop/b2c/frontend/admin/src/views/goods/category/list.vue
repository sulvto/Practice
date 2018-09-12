<template>
  <div>
    <el-row :gutter="8">
      <el-col :span="12">
        <el-button type="primary" size="small" @click="$router.push('edit.html')">添加商品分类</el-button>
      </el-col>

      <el-col :span="10">
      </el-col>
      <el-col :span="2">
      </el-col>
    </el-row>

    <br/>

    <el-table border :data="tableData" style="width: 100%">

      <el-table-column
        width="35">
        <template slot-scope="scope">
          <div class="click-icon">
            <el-tooltip effect="dark" content="展开" placement="top">
              <i class="el-icon el-icon-arrow-right" @click="collapseChange(scope.row.id, true)" v-if="scope.row.level !== 2" v-show="isNotCollapse(scope.row.id)"></i>
            </el-tooltip>

            <el-tooltip effect="dark" content="收起" placement="top">
              <i class="el-icon el-icon-arrow-down" @click="collapseChange(scope.row.id, false)" v-if="scope.row.level !== 2" v-show="isCollapse(scope.row.id)"></i>
            </el-tooltip>
          </div>
        </template>
      </el-table-column>

      <el-table-column label="分类名称">
        <template slot-scope="scope">
          <div v-if="scope.row.level === 2" >

            <el-row :gutter="1">
                <el-col :span="2">
                  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                </el-col>
                <el-col :span="2">
                  |——
                </el-col>
                  <el-col :span="19">
                                        <el-input size="mini" v-model="scope.row.name" @blur="saveCategory"></el-input>
                </el-col>
                <el-col :span="1" class="click-icon">
                  &nbsp;
                </el-col>
              </el-row>
          </div>
          <div v-else-if="scope.row.level === 1" >
            <el-row :gutter="8">
                <el-col :span="2">
                  |——
                </el-col>
                <el-col :span="21">
                  <el-input size="mini" v-model="scope.row.name" @blur="saveCategory"></el-input>
                </el-col>
                <el-col :span="1" class="click-icon">
                  <el-tooltip effect="dark" content="添加子分类" placement="top">
                    <i class=" el-icon el-icon-circle-plus" @click="collapseChange(scope.row.id, true), addChildCategory(scope.row)" v-if="scope.row.level !== 2" ></i>
                  </el-tooltip>
                </el-col>
              </el-row>
          </div>
          <div v-else>
              <el-row :gutter="8">
                <el-col :span="23">
                  <el-input size="mini" v-model="scope.row.name" @blur="saveCategory"></el-input>
                </el-col>
                <el-col :span="1" class="click-icon">
                  <el-tooltip effect="dark" content="添加子分类" placement="top">
                    <i class=" el-icon el-icon-circle-plus" @click="collapseChange(scope.row.id, true), addChildCategory(scope.row)" v-if="scope.row.level !== 2" ></i>
                  </el-tooltip>
                </el-col>
              </el-row>
          </div>

        </template>
      </el-table-column>

      <el-table-column
        label="商品分类简称"
        width="120">
        <template slot-scope="scope">
          <el-input size="mini" v-model="scope.row.abbreviate" @blur="saveCategory"></el-input>
        </template>
      </el-table-column>

      <el-table-column
            prop="relationCategory"
          label="关联类型"
          width="80">
      </el-table-column>

      <el-table-column
          label="是否显示"
          width="80">
        <template slot-scope="scope">
            <span>{{ scope.row.isShow ? '是' : '否' }}</span>
        </template>
      </el-table-column>

      <el-table-column
          prop="sort"
          label="排序"
          width="50">
      </el-table-column>

      <el-table-column label="操作" fixed="right"
          width="180">
          <template slot-scope="scope">
              <el-button size="mini" @click="handleEdit(scope.$index, scope.row)">修改</el-button>
              <el-button size="mini" @click="deleteCategory(scope.row.id)">删除</el-button>
          </template>
      </el-table-column>
    </el-table>

  </div>
</template>

<script>
export default {
  name: 'categroyList',
  data () {
    return {
      searchKeyword: '',
      collapseList: [],
      categroyList: [
        {
          id: 1,
          name: '家用电器',
          level: 0,
          abbreviate: '家电',
          relationCategory: '女装',
          isShow: true,
          sort: 1
        }, {
          id: 2,
          name: '手机/运营商/数码',
          level: 0,
          abbreviate: '通讯',
          relationCategory: '',
          isShow: true,
          sort: 1
        }, {
          id: 3,
          name: '电脑/办公',
          level: 0,
          abbreviate: '电脑',
          relationCategory: '',
          isShow: true,
          sort: 1
        }, {
          id: 4,
          name: '家居/家具/家装/厨具',
          level: 0,
          abbreviate: '家居',
          relationCategory: '',
          isShow: true,
          sort: 1
        }, {
          id: 5,
          name: '男装/女装/童装/内衣',
          level: 0,
          abbreviate: '衣服',
          relationCategory: '',
          isShow: true,
          sort: 1
        }, {
          id: 6,
          name: '美妆个护/宠物',
          level: 0,
          abbreviate: '美妆',
          relationCategory: '',
          isShow: true,
          sort: 1
        }, {
          id: 7,
          name: '女鞋/箱包/钟表/珠宝',
          level: 0,
          abbreviate: '配饰',
          relationCategory: '',
          isShow: true,
          sort: 1
        }, {
          id: 8,
          name: '男鞋/运动/户外',
          level: 0,
          abbreviate: '运动',
          relationCategory: '',
          isShow: true,
          sort: 1
        }, {
          id: 9,
          name: '汽车/汽车用品',
          level: 0,
          abbreviate: '汽车',
          relationCategory: '',
          isShow: true,
          sort: 1
        }, {
          id: 10,
          name: '母婴/玩具用品',
          level: 0,
          abbreviate: '母婴',
          relationCategory: '',
          isShow: true,
          sort: 1
        }, {
          id: 11,
          name: '食品/酒类/生鲜/特产',
          level: 0,
          abbreviate: '食品生鲜',
          relationCategory: '',
          isShow: true,
          sort: 1
        }, {
          id: 12,
          name: '礼品鲜花/农资绿植',
          level: 0,
          abbreviate: '礼品农资',
          relationCategory: '',
          isShow: true,
          sort: 1
        }, {
          id: 13,
          name: '电视',
          level: 1,
          parentId: 1,
          abbreviate: '电视',
          relationCategory: '',
          isShow: true,
          sort: 1
        }, {
          id: 14,
          name: '空调',
          level: 1,
          parentId: 1,
          abbreviate: '空调',
          relationCategory: '',
          isShow: true,
          sort: 1
        }, {
          id: 15,
          name: '洗衣机',
          level: 1,
          parentId: 1,
          abbreviate: '洗衣机',
          relationCategory: '',
          isShow: true,
          sort: 1
        }, {
          id: 16,
          name: '智能家居',
          level: 1,
          parentId: 1,
          abbreviate: '智能家居',
          relationCategory: '',
          isShow: true,
          sort: 1
        }, {
          id: 17,
          name: '曲面电视',
          level: 2,
          parentId: 13,
          abbreviate: '曲面电视',
          relationCategory: '',
          isShow: true,
          sort: 1
        }, {
          id: 18,
          name: '超薄电视',
          level: 2,
          parentId: 13,
          abbreviate: '超薄电视',
          relationCategory: '',
          isShow: true,
          sort: 1
        }, {
          id: 19,
          name: 'HDR电视',
          level: 2,
          parentId: 13,
          abbreviate: 'HDR电视',
          relationCategory: '',
          isShow: true,
          sort: 1
        }, {
          id: 20,
          name: '电脑整机',
          level: 1,
          parentId: 3,
          abbreviate: '电脑整机',
          relationCategory: '',
          isShow: true,
          sort: 1
        }, {
          id: 21,
          name: '电脑配件',
          level: 1,
          parentId: 3,
          abbreviate: '电脑配件',
          relationCategory: '',
          isShow: true,
          sort: 1
        }, {
          id: 22,
          name: '外设产品',
          level: 1,
          parentId: 3,
          abbreviate: '外设产品',
          relationCategory: '',
          isShow: true,
          sort: 1
        }, {
          id: 23,
          name: '鼠标',
          level: 2,
          parentId: 22,
          abbreviate: '鼠标',
          relationCategory: '',
          isShow: true,
          sort: 1
        }, {
          id: 24,
          name: '键盘',
          level: 2,
          parentId: 22,
          abbreviate: '键盘',
          relationCategory: '',
          isShow: true,
          sort: 1
        }, {
          id: 25,
          name: '键鼠套装',
          level: 2,
          parentId: 22,
          abbreviate: '键鼠套装',
          relationCategory: '',
          isShow: true,
          sort: 1
        }
      ]
    }
  },
  computed: {
    tableData () {
      var result = []
      // sort
      for (let i = 0; i < this.categroyList.length; i++) {
        let cursorItem = this.categroyList[i]
        let find = result.find(item => cursorItem.id === item.id)

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
  methods: {

    handleEdit (index, row) {
      console.log(index, row)
    },
    deleteCategory (id) {
      let deleteIndex = this.categroyList.findIndex(item => item.id === id)
      if (deleteIndex !== -1) {
        this.categroyList.splice(deleteIndex, 1)
      }
    },
    saveCategory (category) {
      this.$message.success('操作成功')
    },
    addChildCategory (parent) {
      if (parent.level !== 2) {
        this.categroyList.push({parentId: parent.id, level: (parent.level | 0) + 1, id: new Date().getTime()})
      }
    },
    findChildCategroy (id) {
      return this.categroyList.filter(item => item.parentId === id)
    },
    collapseChange (id, bool) {
      if (bool) {
        if (this.isNotCollapse(id)) {
          this.collapseList.push(id)
        }
      } else if (this.isCollapse(id)) {
        let removeIndex = this.collapseList.findIndex((item) => item === id)
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
