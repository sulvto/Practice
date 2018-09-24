<template>
  <el-form ref="editForm" :rules="rules" :model="editForm" label-width="100px" size="small" label-position="right">
    <h4>活动信息</h4>

    <el-form-item label="活动名称" prop="name" required>
      <el-input v-model="editForm.name" max="10"></el-input>
    </el-form-item>

    <el-form-item label="生效时间" required>
      <el-date-picker
        v-model="editForm.dateRange"
        type="datetimerange"
        :picker-options="pickerOptions"
        range-separator="至"
        start-placeholder="开始日期"
        end-placeholder="结束日期"
        align="right">
      </el-date-picker>
    </el-form-item>

    <h4>优惠设置</h4>

    <el-form-item label="优惠方式">
      <el-radio-group v-model="editForm.type">
        <el-radio :label="1">普通优惠</el-radio>
        <el-radio :label="2">多级优惠</el-radio>
      </el-radio-group>
      <p class="hint">（每级优惠不累积叠加）</p>
    </el-form-item>

    <el-form-item label="优惠条件">

      <el-table border :data="editForm.conditions" style="width: 100%">
        <el-table-column
          label="层级"
          width="80">
          <template slot-scope="scope">
          {{ scope.$index + 1 }}
          </template>
        </el-table-column>

        <el-table-column label="优惠门槛">
          <template slot-scope="scope">
            满
            <el-input type="number" style="width:200px" v-model="scope.row.basePrice" >
              <template slot="append">
                元
              </template>
            </el-input>
          </template>
        </el-table-column>

        <el-table-column
            label="优惠方式（可多选）">
          <template slot-scope="scope">
            <div class="my-checkbox-group">
              <el-checkbox-group v-model="scope.row.way">

                <el-checkbox :label="1">
                  <span v-if="!scope.row.way.includes(1)">减现金</span>
                  <div v-else>
                    减
                    <el-input type="number" size="mini" min="0" style="width:200px" v-model="scope.row.discount" >
                      <template slot="append">
                        元
                      </template>
                    </el-input>
                  </div>
                </el-checkbox>

                <el-checkbox :label="2">免邮</el-checkbox>

                <el-checkbox :label="3">
                  <span v-if="!scope.row.way.includes(3)">送积分</span>
                  <div v-else>
                    送
                    <el-input type="number" size="mini" min="0" style="width:200px" v-model="scope.row.giveIntegral" >
                      <template slot="append">
                        分
                      </template>
                    </el-input>
                  </div>
                </el-checkbox>

                <el-checkbox :label="4">
                  <span v-if="!scope.row.way.includes(4)">送优惠券</span>
                  <div v-else>
                    送
                    <el-select size="mini" v-model="scope.row.giveCoupon" placeholder="请选择">
                      <el-option label="选择1" value="1"></el-option>
                      <el-option label="选择2" value="2"></el-option>
                    </el-select>
                    <el-button size="mini">刷新</el-button>
                    <el-button size="mini">创建</el-button>
                  </div>
                </el-checkbox>

                <el-checkbox :label="5">
                  <span v-if="!scope.row.way.includes(5)">送赠品</span>
                  <div v-else>
                    送
                    <el-select size="mini" v-model="scope.row.giveGift" placeholder="请选择">
                      <el-option label="选择1" value="1"></el-option>
                      <el-option label="选择2" value="2"></el-option>
                    </el-select>
                    <el-button size="mini">刷新</el-button>
                    <el-button size="mini">创建</el-button>
                  </div>
                </el-checkbox>
              </el-checkbox-group>
            </div>
          </template>
        </el-table-column>

        <el-table-column label="操作" fixed="right"
            width="80">
            <template slot-scope="scope">
                <el-button size="mini" @click="editForm.conditions.splice(scope.$index, 1)">删除</el-button>
            </template>
        </el-table-column>
      </el-table>
      <div v-show="editForm.type === 2">
        <el-button size="mini">新增一级优惠</el-button>
        <span class="hint">最多可设置五个层级</span>
      </div>
    </el-form-item>

    <h4>选择活动商品</h4>

    <el-form-item label="参与商品">
      <el-radio-group v-model="editForm.isAll">
          <el-radio :label="true">全部</el-radio>
          <el-radio :label="false">部分</el-radio>
      </el-radio-group>
    </el-form-item>

    <el-form-item label="选择商品" v-show="!editForm.isAll">
      <el-button type="primary" @click="submitForm('editForm')">选择商品</el-button>
    </el-form-item>

    <el-form-item v-show="!editForm.isAll">
      <SimpleGoodsTable :tableData="editForm.goodsList"/>
    </el-form-item>

    <el-form-item>
      <el-button type="primary" @click="submitForm('editForm')">保存</el-button>
      <el-button type="info" @click="$router.back()">返回</el-button>
    </el-form-item>
  </el-form>
</template>

<script>
import SimpleGoodsTable from '@/components/SimpleGoodsTable.vue'

export default {
  name: 'edit',
  data () {
    return {
      editForm: {
        conditions: [{
          id: 1,
          way: [1]
        }]
      },
      rules: {
        name: [
          { required: true, message: '请输入活动名称', trigger: 'blur' },
          { min: 1, max: 10, message: '长度在 1 到 10 个字符', trigger: 'blur' }
        ]
      },
      pickerOptions: {
        shortcuts: [{
          text: '最近一周',
          onClick (picker) {
            const end = new Date()
            const start = new Date()
            end.setTime(start.getTime() + 3600 * 1000 * 24 * 7)
            picker.$emit('pick', [start, end])
          }
        }, {
          text: '最近一个月',
          onClick (picker) {
            const end = new Date()
            const start = new Date()
            end.setTime(start.getTime() + 3600 * 1000 * 24 * 30)
            picker.$emit('pick', [start, end])
          }
        }, {
          text: '最近三个月',
          onClick (picker) {
            const end = new Date()
            const start = new Date()
            end.setTime(start.getTime() + 3600 * 1000 * 24 * 90)
            picker.$emit('pick', [start, end])
          }
        }]
      }
    }
  },
  methods: {
    submitForm () {
      console.log('submitForm', this.editForm)
    }
  },
  components: {
    SimpleGoodsTable
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

.my-checkbox-group {
  width: 80px;
  .el-checkbox+.el-checkbox {
    margin-left: 0px;
  }
}
</style>
