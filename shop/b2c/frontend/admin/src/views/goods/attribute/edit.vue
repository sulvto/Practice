<template>
  <div>
    <el-form ref="editForm" :rules="rules" :model="editForm" label-width="100px" size="small" label-position="right">

      <el-form-item label="类型名称" prop="name">
        <el-input v-model="editForm.name"></el-input>
      </el-form-item>

      <el-form-item label="属性排序">
        <el-input type="number" v-model="editForm.sort"></el-input>
      </el-form-item>

      <el-form-item label="是否启用">
        <el-switch  active-text="是" inactive-text="否" v-model="editForm.isVisible"></el-switch>
      </el-form-item>

      <el-form-item label="关联规格">
        <el-button size="mini" @click="dialogSelectSpecVisible = true">添加</el-button>
      </el-form-item>

      <el-form-item label="关联品牌">
        <el-button size="mini" @click="showBrandSelectDialog()">添加</el-button>
      </el-form-item>

      <el-form-item label="属性">
        <el-button size="mini" @click="addAttribute()">添加</el-button>
      </el-form-item>

      <el-form-item>
        <el-table border :data="editForm.attributeList" style="width: 100%">

          <el-table-column
            label="排序"
            width="90">
            <template slot-scope="scope">
              <el-input type="number" size="mini" v-model="scope.row.sort" ></el-input>
            </template>
          </el-table-column>

          <el-table-column
            label="属性名称">
            <template slot-scope="scope">
              <el-input size="mini" v-model="scope.row.name" ></el-input>
            </template>
          </el-table-column>

          <el-table-column
            label="所属类型"
            width="110">
            <template slot-scope="scope">
              <el-select v-model="scope.row.type" placeholder="请选择">
                <el-option label="输入框" :value="1"></el-option>
                <el-option label="单选框" :value="2"></el-option>
                <el-option label="复选框" :value="3"></el-option>
              </el-select>
            </template>
          </el-table-column>

          <el-table-column
            label="是否筛选"
            width="80">
            <template slot-scope="scope">
              <el-switch v-model="scope.row.isSearch">
              </el-switch>
            </template>
          </el-table-column>

          <el-table-column
            label="属性值"
            width="250">
            <template slot-scope="scope">
              {{ scope.row.values.toString() }}
            </template>
          </el-table-column>

          <el-table-column label="操作" fixed="right"
            width="190">
            <template slot-scope="scope">
              <el-button size="mini" v-show="scope.row.type === 2 || scope.row.type === 3" @click="showEditAttributeDialog(scope.row)">编辑属性值</el-button>
              <el-button size="mini" @click="removeAttribute(scope.$index)">删除</el-button>
            </template>
          </el-table-column>
        </el-table>
      </el-form-item>

      <el-form-item>
        <el-button type="primary" @click="submitForm('editForm')">保存</el-button>
        <el-button type="info" @click="$router.back()">返回</el-button>
      </el-form-item>
    </el-form>

    <el-dialog title="规格关联设置" :visible.sync="dialogSelectSpecVisible">
       <el-table border :data="specList">
        <el-table-column
          type="selection"
          width="35">
        </el-table-column>
        <el-table-column prop="name" label="规格" width="150"></el-table-column>
        <el-table-column prop="description" label="描述" ></el-table-column>
      </el-table>
      <div slot="footer" class="dialog-footer">
        <el-button size="small" @click="dialogSelectSpecVisible = false">取 消</el-button>
        <el-button size="small" type="primary" @click="dialogSelectSpecVisible = false">确 定</el-button>
      </div>
    </el-dialog>

    <el-dialog title="关联品牌设置" :visible.sync="dialogSelectBrandVisible">
      <div style="max-height: 300px; overflow-y: auto;">
        <el-row>
          <el-col :span="4" v-for="(brand, index) in brandList" :key="brand.name" :offset="index % 5 ? 1 : 0" style="margin-bottom: 10px">
            <el-card :body-style="{ padding: '0px', height: '144px' }">
              <img src="@/assets/img/hamburger.png" style="width: 103.91px; height: 100px">
              <div>
                <el-button style="width: 100%" v-if="isNotBrandSelected(brand)" @click="brandSelectChange(brand, true)">{{ brand.name }}</el-button>
                <el-button style="width: 100%" type="success" v-if="isBrandSelected(brand)" @click="brandSelectChange(brand, false)">{{ brand.name }}</el-button>
              </div>
            </el-card>
          </el-col>
        </el-row>
      </div>
      <div slot="footer" class="dialog-footer">

        <el-button size="small" type="success" v-if="isBrandSelectedAll()" @click="brandUnSelectAll">全 选</el-button>
        <el-button size="small" v-if="isNotBrandSelectedAll()" @click="brandSelectAll">全 选</el-button>

        <el-button size="small" @click="dialogSelectBrandVisible = false">取 消</el-button>
        <el-button size="small" type="primary" @click="saveBrandSelected()">确 定</el-button>
      </div>
    </el-dialog>

    <el-dialog title="编辑属性值" :visible.sync="dialogEditAttributeVisible">
      <el-form :model="editAttributeForm" label-width="100px">
        <el-form-item label="属性值">
          <el-input type="textarea" v-model="editAttributeForm.value" auto-complete="off"></el-input>
          <p class="hint">一行为一个属性值，多个属性值用换行输入</p>
        </el-form-item>
      </el-form>
      <div slot="footer" class="dialog-footer">
        <el-button size="small" @click="dialogEditAttributeVisible = false">取 消</el-button>
        <el-button size="small" type="primary" @click="saveAttributeValues()">确 定</el-button>
      </div>
    </el-dialog>

  </div>
</template>

<script>
export default {
  name: 'edit',
  data () {
    return {
      editAttributeForm: {},
      dialogEditAttributeVisible: false,
      dialogSelectSpecVisible: false,
      brandSelectedList: [],
      dialogSelectBrandVisible: false,
      specList: [
        {
          name: '手机尺寸',
          description: ''
        }, {
          name: '尺码',
          description: ''
        }, {
          name: '颜色',
          description: ''
        }
      ],
      brandList: [
        {
          name: '娃哈哈',
          images: ''
        }, {
          name: '娃哈哈1',
          images: ''
        }, {
          name: '娃哈哈2',
          images: ''
        }, {
          name: '娃哈哈3',
          images: ''
        }, {
          name: '小米',
          images: ''
        }, {
          name: '三星',
          images: ''
        }, {
          name: '索尼',
          images: ''
        }
      ],
      editForm: {
        relatedBrands: [],
        attributeList: []
      },
      rules: {
        name: [
          { required: true, message: '请输入类型名称', trigger: 'blur' }
        ]
      }
    }
  },

  methods: {
    submitForm () {
      console.log('submitForm', this.editForm)
    },

    showEditAttributeDialog (attribute) {
      this.editAttributeForm.value = attribute.values.join('\n')
      this.editAttributeForm.attribute = attribute
      this.dialogEditAttributeVisible = true
    },
    saveAttributeValues () {
      this.editAttributeForm.attribute.values = this.editAttributeForm.value
        .split('\n')
        .map(string => string.trim())
        .filter(string => string.length > 0)
      this.dialogEditAttributeVisible = false
    },

    isNotBrandSelected (brand) {
      return this.brandSelectedList.findIndex(item => item.name === brand.name) === -1
    },

    isBrandSelected (brand) {
      return !this.isNotBrandSelected(brand)
    },

    isBrandSelectedAll () {
      return this.brandSelectedList.length === this.brandList.length
    },

    isNotBrandSelectedAll () {
      return this.brandSelectedList.length !== this.brandList.length
    },

    brandSelectAll () {
      this.brandList.forEach(brandItem => this.brandSelectChange(brandItem, true))
    },

    brandUnSelectAll () {
      this.brandList.forEach(brandItem => this.brandSelectChange(brandItem, false))
    },

    brandSelectChange (brand, bool) {
      let index = this.brandSelectedList.findIndex(item => item.name === brand.name)
      // add
      if (bool && index === -1) {
        this.brandSelectedList.push(brand)
      } else if (bool) {
        // no change
      } else if (index !== -1) {
        // remove
        this.brandSelectedList.splice(index, 1)
      }
    },

    saveBrandSelected () {
      this.editForm.relatedBrands = []
      this.brandSelectedList.forEach(brandItem => this.editForm.relatedBrands.push(brandItem))
      this.dialogSelectBrandVisible = false
    },

    showBrandSelectDialog () {
      this.brandSelectedList = []
      this.editForm.relatedBrands.forEach(brandItem => this.brandSelectedList.push(brandItem))
      this.dialogSelectBrandVisible = true
    },

    addAttribute () {
      this.editForm.attributeList.push({id: new Date().getTime(), values: []})
    },

    removeAttribute (index) {
      this.editForm.attributeList.splice(index, 1)
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
