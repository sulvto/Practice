
<template>
  <div>
    <el-row :gutter="8">
      <el-col :span="12">
        <el-button type="primary" size="small" @click="addClass">添加分类</el-button>
      </el-col>

      <el-col :span="10">
      </el-col>
      <el-col :span="2">
      </el-col>
    </el-row>

    <br/>

    <el-table border :data="tableData" style="width: 100%">

      <el-table-column
        label="分类名称">
        <template slot-scope="scope">
          <span style="color: #ccc;" v-show="scope.row.parentId">|——</span>
          <span class="table-pay">{{scope.row.name}}</span>
        </template>
      </el-table-column>

      <el-table-column
        prop="sort"
        label="排序">
      </el-table-column>

      <el-table-column label="操作" fixed="right"
          width="180">
          <template slot-scope="scope">
              <el-button size="mini" @click="updateClass(scope.$index, scope.row)">修改</el-button>
              <el-button size="mini" @click="deleteClass(scope.$index, scope.row)">删除</el-button>
          </template>
      </el-table-column>
    </el-table>

    <!-- 添加（or修改）分类 -->
    <el-dialog :title="dialogClassFormTitle" size="small"  :visible.sync="dialogClassFormVisible">
      <el-form ref="classForm" :rules="classFormRules" :model="classForm" label-width="100px" >

        <el-form-item label="分类名称" prop="name">
          <el-input v-model="classForm.name" auto-complete="off" placeholder="请输入分类名称"></el-input>
        </el-form-item>

        <el-form-item label="上级分类" >
          <el-select v-model="classForm.parentId" clearable placeholder="顶级分类">
            <el-option
              v-for="item in topClassList"
              :key="item.id"
              :label="item.name"
              :value="item.id">
            </el-option>
          </el-select>

        </el-form-item>
          <el-form-item label="排序" >
          <el-input v-model="classForm.sort" type="number"></el-input>
        </el-form-item>
      </el-form>
      <div slot="footer" class="dialog-footer">
        <el-button @click="dialogClassFormVisible = false">取 消</el-button>
        <el-button type="primary" @click="submitForm('classForm')">保 存</el-button>
      </div>
    </el-dialog>

  </div>
</template>

<script>
export default {
  name: 'classList',
  data () {
    return {
      DIALOG_CLASS_FORM_TITLE_ADD: '添加分类',
      DIALOG_CLASS_FORM_TITLE_UPDATE: '修改分类',
      dialogClassFormTitle: '添加分类',
      dialogClassFormVisible: false,
      classForm: {},
      classFormRules: {
        name: [
          { required: true, message: '请输入分类名称', trigger: 'blur' }
        ]
      },
      classList: [{
        id: 1,
        name: '新闻',
        sort: 1
      }, {
        id: 2,
        name: '新闻2',
        sort: 1,
        parentId: 1
      }]
    }
  },
  computed: {
    topClassList () {
      return this.tableData.filter(item => !item.parentId)
    },
    tableData () {
      var result = []
      // sort
      for (let i = 0; i < this.classList.length; i++) {
        var find = result.find(item => this.classList[i].id === item.id)
        if (!find) {
          var addItem = this.classList[i]
          result.push(addItem)
          this.classList
            .filter(item => item.parentId === addItem.id)
            .forEach(item => result.push(item))
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
    updateClass (index, row) {
      // FIXME: 取消dialog后已修改的数据属性需要恢复
      this.classForm = row
      this.dialogClassFormVisible = true
    },
    addClass () {
      this.classForm = {id: new Date().getTime()}
      this.dialogClassFormVisible = true
    },
    deleteClass (index, data) {
      let removeIndex = this.classList.findIndex(item => item.id === data.id)
      if (removeIndex !== -1) {
        this.classList.splice(removeIndex, 1)
      }
    },
    submitForm (formName) {
      var that = this
      this.$refs.classForm.validate((valid) => {
        if (valid) {
          that.$message.success('保存成功')
          that.classList.push(this.classForm)
          that.dialogClassFormVisible = false
          console.log('classList ', that.classList)
        } else {
          that.$message.error('请输入分类名称')
          return false
        }
      })
    }
  }
}
</script>

<style lang="scss" scoped>
</style>
