<template>
  <el-form ref="configForm" :rules="rules" :model="configForm" label-width="120px" size="small" label-position="right">

    <el-form-item label="起送消费金额" prop="basicOrderMoney">
      <el-input type="number"  v-model="configForm.basicOrderMoney" >
        <template slot="append">
                元
        </template>
      </el-input>
    </el-form-item>

    <el-form-item label="起送配送费用" prop="basicFreight">
      <el-input type="number"  v-model="configForm.basicFreight" >
        <template slot="append">
                元
        </template>
      </el-input>
    </el-form-item>

    <el-form-item label="配送时间">
      <el-row >
      <span>上午：</span>
      <el-time-select
        placeholder="起始时间"
        v-model="configForm.amStartTime"
        :picker-options="{
          start: '00:00',
          step: '00:15',
          end: '12:30'
        }">
      </el-time-select>
      <span>至</span>
      <el-time-select
        placeholder="结束时间"
        v-model="configForm.amEndTime"
        :picker-options="{
          start: '00:00',
          step: '00:15',
          end: '12:30',
          minTime: configForm.amStartTime
        }">
      </el-time-select>
        </el-row >
      <el-row class="margin-top-10">
        <span>下午：</span>

        <el-time-select
          placeholder="起始时间"
          v-model="configForm.pmStartTime"
          :picker-options="{
            start: '12:30',
            step: '00:15',
            end: '23:59'
          }">
        </el-time-select>
        <span>至</span>
        <el-time-select
          placeholder="结束时间"
          v-model="configForm.pmEndTime"
          :picker-options="{
            start: '12:30',
            step: '00:15',
            end: '23:59',
            minTime: configForm.pmStartTime
          }">
        </el-time-select>
      </el-row>
        <p class="hint">配送时间可单独设置上午或下午，若起始时间与结束时间均未设置，则默认为该时间段不提供配送服务。</p>
    </el-form-item>

    <el-form-item label="优惠配送金额">
      <el-input style="width: 180px;" v-model="editDiscountPrice.orderMoney" placeholder="消费金额"></el-input>
        <el-input style="width: 180px;" v-model="editDiscountPrice.freight" placeholder="配送费用"></el-input>
        <el-button type="success" icon="el-icon-plus" circle @click="addDiscountPrice"></el-button>

      <div class="margin-top-10" v-for="(discountPrice, index) in configForm.discountPriceList" :key="discountPrice.orderMoney">
        <el-input style="width: 180px;" v-model="discountPrice.orderMoney" placeholder="消费金额"></el-input>
        <el-input style="width: 180px;" v-model="discountPrice.freight" placeholder="配送费用"></el-input>
        <el-button type="danger" icon="el-icon-delete" circle @click="removeDiscountPrice(index)"></el-button>
      </div>
    </el-form-item>

    <el-form-item>
      <el-button type="primary" @click="submitForm('configForm')">保存</el-button>
      <el-button type="info" @click="$router.back()">返回</el-button>
    </el-form-item>
  </el-form>
</template>

<script>
export default {
  name: 'config',
  data () {
    return {
      pickerOptions: {
        start: '00:00',
        step: '00:15',
        end: '12:30'
      },
      value5: [],
      editDiscountPrice: {},
      configForm: {
        amDateRange: [],
        pmDateRange: [],
        discountPriceList: []
      },
      rules: {
        basicOrderMoney: [
          { required: true, message: '请输入起送消费金额', trigger: 'blur' }
        ],
        basicFreight: [
          { required: true, message: '请输入起送配送费用', trigger: 'blur' }
        ]
      }
    }
  },
  methods: {
    addDiscountPrice () {
      if (this.editDiscountPrice.orderMoney && this.editDiscountPrice.freight) {
        this.configForm.discountPriceList.push(this.editDiscountPrice)
        this.editDiscountPrice = {}
      } else {
        this.$message.error('请输入消费金额和优惠配送费用')
      }
    },
    removeDiscountPrice (index) {
      console.log('removeDiscountPrice', index)
      this.configForm.discountPriceList.splice(index, 1)
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
