<template>
  <el-form ref="form" :model="shopConfigFrom" label-width="100px" size="mini" label-position="right">
    <h4>基础设置</h4>

    <el-form-item label="自动收货时间">
      <el-input type="number" min="1" step="1"  v-model="shopConfigFrom.autoDelineryTime" >
          <template slot="append">
                  天
              </template>
      </el-input>
      <p class="hint">订单多长时间后自动收货，单位为/天(注：若为0，则订单不会自动收货)</p>
    </el-form-item>

    <el-form-item label="订单自动关闭时间">
      <el-input type="number" min="1" step="1"  v-model="shopConfigFrom.buyCloseTime" >
        <template slot="append">
                分钟
        </template>
      </el-input>
        <p class="hint">订单开始后多长时间未付款自动关闭，单位为/分钟(注：不填写或0订单将不会自动关闭)</p>
    </el-form-item>

    <el-form-item label="是否开启余额支付">
      <el-switch  active-text="是" inactive-text="否" v-model="shopConfigFrom.balancePay"></el-switch>
      <p class="hint">是否启用余额支付功能</p>
    </el-form-item>

    <el-form-item label="是否开启货到付款">
      <el-switch  active-text="是" inactive-text="否" v-model="shopConfigFrom.deliveryPay"></el-switch>
      <p class="hint">是否开启货到付款功能</p>
    </el-form-item>

    <el-form-item label="订单完成时间">
      <el-select v-model="shopConfigFrom.orderDeliveryCompleteTime" placeholder="请选择">
        <el-option label="立即" value="0"></el-option>
        <el-option label="1天" value="1"></el-option>
        <el-option label="2天" value="2"></el-option>
        <el-option label="3天" value="3"></el-option>
        <el-option label="4天" value="4"></el-option>
        <el-option label="5天" value="5"></el-option>
        <el-option label="6天" value="6"></el-option>
        <el-option label="7天" value="7"></el-option>
      </el-select>
      <p class="hint">收货后，多少时间订单自动完成，单位为/天</p>
    </el-form-item>

      <el-form-item label="购物返积分设置">
        <el-select v-model="shopConfigFrom.shoppingBackPoints" placeholder="请选择">
          <el-option label="订单已完成" value="1"></el-option>
          <el-option label="已收货" value="2"></el-option>
          <el-option label="支付完成" value="3"></el-option>
        </el-select>
      <p class="hint">在什么时间将购物返积分添加到会员账户</p>
    </el-form-item>

    <el-form-item label="是否显示购买记录">
      <el-switch  active-text="是" inactive-text="否" v-model="shopConfigFrom.showBuyRecord"></el-switch>
      <p class="hint">是否显示购买记录</p>
    </el-form-item>

    <el-form-item label="是否开启虚拟商品">
      <el-switch  active-text="是" inactive-text="否" v-model="shopConfigFrom.isOpenVirtualGoods"></el-switch>
      <p class="hint">是否开启虚拟商品</p>
    </el-form-item>

    <el-form-item label="系统默认评价设置">
      <el-input type="number" min="1" step="1"  v-model="shopConfigFrom.evaluateDay" >
        <template slot="append">
                天
        </template>
      </el-input>
        <p cl ass="hint">订单完成达到设置天数后，用户仍未进行评价，则系统进行默认评价</p>
    </el-form-item>

    <el-form-item label="默认评价语">
      <el-input type="textarea" v-model="shopConfigFrom.evaluate"></el-input>
    </el-form-item>

    <h4>配送设置</h4>

    <el-form-item label="是否开启买家自提">
      <el-switch  active-text="是" inactive-text="否" v-model="shopConfigFrom.isOpenBuyerSelfLifting"></el-switch>
      <p class="hint">是否启用买家自提</p>
    </el-form-item>

    <el-form-item label="是否开启商家配送">
      <el-switch  active-text="是" inactive-text="否" v-model="shopConfigFrom.isOpenSellerDispatching"></el-switch>
      <p class="hint">是否启用商家配送</p>
    </el-form-item>

    <el-form-item label="是否开启本地配送">
      <el-switch  active-text="是" inactive-text="否" v-model="shopConfigFrom.isOpenLocalDelivery"></el-switch>
      <p class="hint">是否开启本地配送</p>
    </el-form-item>

    <el-form-item label="是否允许选择物流">
      <el-switch  active-text="是" inactive-text="否" v-model="shopConfigFrom.isOpenExpressCompaySelect"></el-switch>
      <p class="hint">是否允许用户选择物流</p>
    </el-form-item>

    <el-form-item label="开启指定配送时间">
      <el-switch  active-text="是" inactive-text="否" v-model="shopConfigFrom.isOpenDesignatedDeliveryTime"></el-switch>
      <p class="hint">是否开启指定配送时间</p>
    </el-form-item>

    <el-form-item label="设定配送时间段">
      <el-select v-model="shopConfigFrom.designatedDeliveryDate" placeholder="请选择">
        <el-option label="00" value="00"></el-option>
        <el-option label="01" value="01"></el-option>
        <el-option label="02" value="02"></el-option>
        <el-option label="03" value="03"></el-option>
        <el-option label="04" value="04"></el-option>
        <el-option label="05" value="05"></el-option>
        <el-option label="06" value="06"></el-option>
        <el-option label="07" value="07"></el-option>
        <el-option label="08" value="08"></el-option>
        <el-option label="09" value="09"></el-option>
        <el-option label="10" value="10"></el-option>
        <el-option label="11" value="11"></el-option>
        <el-option label="12" value="12"></el-option>
        <el-option label="13" value="13"></el-option>
        <el-option label="14" value="14"></el-option>
        <el-option label="15" value="15"></el-option>
        <el-option label="16" value="16"></el-option>
        <el-option label="17" value="17"></el-option>
        <el-option label="18" value="18"></el-option>
        <el-option label="19" value="19"></el-option>
        <el-option label="20" value="20"></el-option>
        <el-option label="21" value="21"></el-option>
        <el-option label="22" value="22"></el-option>
        <el-option label="23" value="23"></el-option>
    </el-select>

    <el-select v-model="shopConfigFrom.select" placeholder="请选择">
      <el-option label="00" value="00"></el-option>
      <el-option label="01" value="01"></el-option>
      <el-option label="02" value="02"></el-option>
      <el-option label="03" value="03"></el-option>
      <el-option label="04" value="04"></el-option>
      <el-option label="05" value="05"></el-option>
      <el-option label="06" value="06"></el-option>
      <el-option label="07" value="07"></el-option>
      <el-option label="08" value="08"></el-option>
      <el-option label="09" value="09"></el-option>
      <el-option label="10" value="10"></el-option>
      <el-option label="11" value="11"></el-option>
      <el-option label="12" value="12"></el-option>
      <el-option label="13" value="13"></el-option>
      <el-option label="14" value="14"></el-option>
      <el-option label="15" value="15"></el-option>
      <el-option label="16" value="16"></el-option>
      <el-option label="17" value="17"></el-option>
      <el-option label="18" value="18"></el-option>
      <el-option label="19" value="19"></el-option>
      <el-option label="20" value="20"></el-option>
      <el-option label="21" value="21"></el-option>
      <el-option label="22" value="22"></el-option>
      <el-option label="23" value="23"></el-option>
    </el-select>
    <p class="hint">商家设定配送时间段</p>
<!-- TODO: -->
<!-- <span start="09" end="08" class="time-slot-item">09:00-08:00<i class="del" onclick="delTimeSlotItem(this)">×</i></span> -->
    </el-form-item>

    <h4>发票设置</h4>

    <el-form-item label="发票税率">
        <el-input type="number" min="0.00" step="0.01"  v-model="shopConfigFrom.invoiceTax" >
          <template slot="append">
                  %
            </template>
        </el-input>
        <p class="hint">设置开发票的税率，单位为%</p>
    </el-form-item>

    <el-form-item label="发票内容">
      <el-input type="textarea" v-model="shopConfigFrom.invoiceContent"></el-input>
      <p class="hint">客户要求开发票时可以选择的内容，逗号分格代表一个选项，例如：办公用品,明细</p>
    </el-form-item>

    <el-form-item>
      <el-button type="primary" @click="submitForm('shopConfigFrom')">保存</el-button>
      <el-button type="info" @click="$router.back()">返回</el-button>
    </el-form-item>
  </el-form>
</template>

<script>
export default {
  name: 'shopConfig',
  data () {
    return {
      shopConfigFrom: {}
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
