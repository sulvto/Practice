<template>
    <div>
        <el-row>
        <el-button type="primary" size="small" @click="$router.push('edit.html')">添加商品类型</el-button>
        </el-row>

    <br/>

        <el-table border :data="tableData" style="width: 100%">

 <el-table-column
      prop="name"
      label="类型名称">
    </el-table-column>

 <el-table-column
      label="属性标签">
      <template slot-scope="scope">
          {{ scope.row.attributeList.map(attributeItem => attributeItem.name).join(',') }}
      </template>
    </el-table-column>

    <el-table-column
        label="启用"
        width="80">
        <template slot-scope="scope">
            <el-switch v-model="scope.row.isEnable">
            </el-switch>
        </template>
    </el-table-column>

 <el-table-column
      prop="sort"
      label="排序"
      width="80">
    </el-table-column>

      <el-table-column label="操作" fixed="right" width="180">
                <template slot-scope="scope">
                    <el-button size="mini" @click="handleEdit(scope.$index, scope.row)">修改</el-button>
                    <el-button size="mini" @click="handleEdit(scope.$index, scope.row)">删除</el-button>
                </template>
            </el-table-column>
        </el-table>
  </div>
</template>

<script>
export default {
  name: 'attributeList',
  data () {
    return {
      tableData: [
        {
          id: '1',
          name: '女装',
          isEnable: true,
          attributeList: [
            {
              name: '尺码'
            }, {
              name: '颜色'
            }
          ],
          sort: '22'
        },
        {
          id: '1',
          name: '男装',
          isEnable: true,
          attributeList: [
            {
              name: '尺码'
            }, {
              name: '颜色'
            }
          ],
          sort: '22'
        },
        {
          id: '1',
          name: '箱包',
          isEnable: true,
          attributeList: [
            {
              name: '颜色'
            }
          ],
          sort: '22'
        },
        {
          id: '1',
          name: '电视',
          isEnable: true,
          attributeList: [
            {
              name: '尺寸'
            }, {
              name: '颜色'
            }
          ],
          sort: '22'
        },
        {
          id: '1',
          name: '笔记本',
          isEnable: true,
          attributeList: [
            {
              name: '颜色'
            }, {
              name: '屏幕尺寸'
            }, {
              name: '重量'
            }
          ],
          sort: '22'
        }
      ]
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

</style>
