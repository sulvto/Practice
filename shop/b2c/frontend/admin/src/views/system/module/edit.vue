<template>
  <el-form ref="editForm" :rules="rules" :model="editForm" label-width="100px" size="small" label-position="right">

    <el-form-item label="模块名" prop="name">
      <el-input v-model="editForm.name" />
    </el-form-item>

    <el-form-item label="上级菜单">
      <el-cascader
        :options="moduleCascaderOptions"
        :clearable="true"
        :change-on-select="true"
        expand-trigger="hover"
        @change="moduleCascaderOptionsChange"/>
    </el-form-item>

    <el-form-item label="控制器名" prop="controllerName">
      <el-input v-model="editForm.controllerName" />
    </el-form-item>

    <el-form-item label="方法名" prop="methodName">
      <el-input v-model="editForm.methodName" />
    </el-form-item>

    <el-form-item label="URL" prop="url">
      <el-input v-model="editForm.url" type="url" />
    </el-form-item>

    <el-form-item label="是否是菜单">
      <el-switch v-model="editForm.isMenu" active-text="是" inactive-text="否" />
    </el-form-item>

    <el-form-item label="是否控制权限">
      <el-switch v-model="editForm.controllerPermission" active-text="开" inactive-text="关" />
    </el-form-item>

    <el-form-item label="是否开发者模式可见">
      <el-switch v-model="editForm.developerMode" active-text="是" inactive-text="否" />
    </el-form-item>

    <el-form-item label="排序">
      <el-input v-model="editForm.sort" type="number" />
    </el-form-item>

    <!-- TODO： 图片 -->

    <el-form-item label="描述">
      <el-input v-model="editForm.description" type="textarea" />
    </el-form-item>

    <el-form-item>
      <el-button type="primary" @click="submitForm('editForm')">保存</el-button>
      <el-button type="info" @click="$router.back()">返回</el-button>
    </el-form-item>
  </el-form>
</template>

<script>
import { fetchList, fetchById, save } from '@/api/system/module'

export default {
  name: 'Edit',
  data () {
    return {
      moduleList: [],
      editForm: {},
      rules: {
        name: [
          { required: true, message: '请输入模块名', trigger: 'blur' }
        ],
        url: [
          { required: true, message: '请输入url地址', trigger: 'blur' }
        ],
        methodName: [
          { required: true, message: '请输入方法名', trigger: 'blur' }
        ],
        controllerName: [
          { required: true, message: '请输入控制器名', trigger: 'blur' }
        ]
      }
    }
  },
  computed: {
    moduleCascaderOptions () {
      var result = [{
        label: '顶级菜单',
        value: null
      }]

      // add root
      this.moduleList
        .filter(moduleListItem => moduleListItem.level === 0)
        .forEach(moduleListItem => result.push({ label: moduleListItem.name, value: moduleListItem.id }))

      // find children
      result.forEach(rootItem => {
        var children = this.moduleList
          .filter(moduleListItem => moduleListItem.level === 1)
          // rootItem.value => id
          .filter(moduleListItem => moduleListItem.parentId === rootItem.value)
          .map(moduleListItem => {
            return { label: moduleListItem.name, value: moduleListItem.id }
          })

        if (children.length > 0) {
          rootItem.children = children
        }
      })

      return result
    }
  },
  created () {
    this.id = this.$route.query.id
    this.loadModuleList()
    this.loadFormData()
  },
  methods: {
    loadModuleList () {
      fetchList().then(response => {
        if (response.code === 0) {
          this.moduleList = response.data.items
        }
      })
    },
    loadFormData () {
      if (this.id) {
        fetchById(this.id).then(response => {
          if (response.code === 0) {
            this.editForm = response.data
            // TODO: moduleCascader 默认值
          }
        })
      }
    },
    submitForm () {
      this.$refs.editForm.validate((valid) => {
        if (valid) {
          save(this.editForm).then(response => {
            // TODO: back 跳转到 list
            this.$router.push('/system/module/list.html')
          })
        } else {
          console.log('error submit!!')
          return false
        }
      })
      console.log('submitForm', this.editForm)
    },
    moduleCascaderOptionsChange (select) {
      if (select.length > 0) {
        this.editForm.parentId = select[select.length - 1]
        this.editForm.level = this.editForm.parentId ? (select.length > 1 ? 2 : 1) : 0
      } else {
        this.editForm.parentId = null
        this.editForm.level = 0
      }
    }
  }
}
</script>

<style lang="scss" scoped>
.hint {
  font-size: 12px;
  line-height: 16px;
  color: #999999;
  margin: 10px 0 0;
}

.important-note {
  color: #ff6600;
  font-style: normal;
}
</style>
