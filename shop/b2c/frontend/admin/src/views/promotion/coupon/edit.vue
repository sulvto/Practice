<template>
  <el-form ref="form" :rules="coupontFromRules" :model="coupontFrom" label-width="130px" size="mini" label-position="right">

    <el-form-item label="名称" prop="name" required>
      <el-input v-model="coupontFrom.name" value="满88元减2元" />
      <p class="hint">10个字以内</p>
    </el-form-item>

    <el-form-item label="面额" required>
      <el-input v-model="coupontFrom.denomination" type="number" min="0" >
        <template slot="append">
          元
        </template>
      </el-input>
    </el-form-item>

    <el-form-item label="发放数量" required>
      <el-input v-model="coupontFrom.number" type="number" min="0" >
        <template slot="append">
          份
        </template>
      </el-input>
    </el-form-item>

    <el-form-item label="补发数量" required>
      <el-input v-model="coupontFrom.repair" type="number" min="0" >
        <template slot="append">
          份
        </template>
      </el-input>
    </el-form-item>

    <el-form-item label="已发放数量">
      <p>102份</p>
    </el-form-item>

    <el-form-item label="每人最大领取数" required>
      <el-input v-model="coupontFrom.maxFetch" type="number" min="1">
        <template slot="append">
          份
        </template>
      </el-input>
      <p class="hint">输入0表示无限制</p>
    </el-form-item>

    <el-form-item label="满多少元使用">
      <el-input v-model="coupontFrom.atLeast" type="number" min="0">
        <template slot="append">
          元
        </template>
      </el-input>
    </el-form-item>

    <!-- <el-form-item label="领取人等级">
        <el-input type="number"  v-model="coupontFrom.needUserLevel" >
            <template slot="append">
                    级
                </template>
        </el-input>
    </el-form-item> -->

    <el-form-item label="有效时间" required>
      <el-radio-group v-model="coupontFrom.termOfValidityType">
        <el-radio :label="1">固定日期</el-radio>
        <el-radio :label="2">领到券当日开始N天内有效</el-radio>
      </el-radio-group>
      <div v-show="coupontFrom.termOfValidityType === 1" class="margin-top-10" >
        <el-date-picker
          v-model="coupontFrom.dateRange"
          :picker-options="pickerOptions"
          type="datetimerange"
          range-separator="至"
          start-placeholder="开始日期"
          end-placeholder="结束日期"
          align="right" />
      </div>
      <div v-show="coupontFrom.termOfValidityType === 2" class="margin-top-10" >
        <el-input v-model="coupontFrom.fixedDays" type="number" style="width:300px" min="1" max="365">
          <template slot="prepend">领取之日起</template>
          <template slot="append">天内有效</template>
        </el-input>
      </div>

      <p class="hint">生效前买家可以领取但不能使用</p>
    </el-form-item>

    <el-form-item label="是否允许首页显示">
      <el-switch v-model="coupontFrom.isShow" active-text="开" inactive-text="关" />
    </el-form-item>

    <el-form-item label="参与商品">
      <el-radio-group v-model="coupontFrom.isAll">
        <el-radio :label="1">全部</el-radio>
        <el-radio :label="0">部分</el-radio>
      </el-radio-group>
    </el-form-item>

    <el-form-item v-show="!coupontFrom.isAll" label="选择商品" >
      <el-button type="primary" @click="submitForm('editForm')">选择商品</el-button>
    </el-form-item>

    <el-form-item v-show="!coupontFrom.isAll">
      <SimpleGoodsTable :table-data="coupontFrom.goodsList"/>
    </el-form-item>

    <el-form-item>
      <el-button type="primary" @click="submitForm('coupontFrom')">保存</el-button>
      <el-button type="info" @click="$router.back()">返回</el-button>
    </el-form-item>
  </el-form>
</template>

<script>
export default {
  name: 'CoupontEdit',
  data () {
    return {
      coupontFrom: {},
      coupontFromRules: {
        name: [
          { required: true, message: '请输入活动名称', trigger: 'blur' },
          { min: 1, max: 10, message: '长度在 1 到 10 个字符', trigger: 'blur' }
        ],
        fixedDays: [
          { min: 1, max: 365, message: '生效天数必须在1到365内', trigger: 'blur' }
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

.margin-top-10 {
  margin-top: 10px;
}
</style>
