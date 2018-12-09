<template>

  <section class="ns-base-section">
    <el-tabs v-model="activeName" @tab-click="handleClick">
      <el-tab-pane label="全部" name="first">用户管理</el-tab-pane>
      <el-tab-pane label="待付款" name="second">配置管理</el-tab-pane>
      <el-tab-pane label="待发货" name="third">角色管理</el-tab-pane>
      <el-tab-pane label="已发货" name="fourth">定时任务补偿</el-tab-pane>
      <el-tab-pane label="已收货" name="first">用户管理</el-tab-pane>
      <el-tab-pane label="已完成" name="third">角色管理</el-tab-pane>
      <el-tab-pane label="已关闭" name="fourth">定时任务补偿</el-tab-pane>
      <el-tab-pane label="退款中" name="first">用户管理</el-tab-pane>
    </el-tabs>

    <el-row :gutter="8">
      <el-col :span="12">
        <el-button type="primary" size="small">导出数据</el-button>
        <el-button size="small">打印订单</el-button>
      </el-col>

      <el-col :span="12">
        <el-form :inline="true" :model="queryForm" size="small" >
          <el-form-item label="下单时间">
            <el-date-picker
              v-model="queryForm.orderDateRange"
              :picker-options="datePickerOptions"
              type="daterange"
              align="right"
              unlink-panels
              range-separator="至"
              start-placeholder="开始日期"
              end-placeholder="结束日期"/>
          </el-form-item>
          <el-form-item>
            <el-popover
              v-model="moreQueryPopoverVisible"
              placement="bottom"
              width="400"
              trigger="click">
              <el-form ref="editForm" :model="queryForm" label-width="100px" size="small" label-position="right">
                <el-form-item label="订单编号">
                  <el-input v-model="queryForm.orderNo" />
                </el-form-item>

                <el-form-item label="收货人姓名">
                  <el-input v-model="queryForm.receiver" />
                </el-form-item>

                <el-form-item label="收货人手机号">
                  <el-input v-model="queryForm.receiverMobile" />
                </el-form-item>

                <el-form-item label="支付方式">
                  <el-select v-model="queryForm.paymentType" clearable placeholder="请选择">
                    <el-option :value="1" label="微信" />
                    <el-option :value="2" label="支付宝" />
                    <el-option :value="3" label="线下支付" />
                    <el-option :value="4" label="货到付款" />
                  </el-select>
                </el-form-item>

                <el-form-item label="配送方式">
                  <el-select v-model="queryForm.shippingType" clearable placeholder="请选择">
                    <el-option :value="1" label="物流配送" />
                    <el-option :value="2" label="买家自提" />
                    <el-option :value="3" label="本地配送" />
                  </el-select>
                </el-form-item>

                <el-form-item>
                  <el-button type="primary" @click="moreQueryPopoverVisible = false">确定</el-button>
                </el-form-item>
              </el-form>
              <el-button slot="reference" icon="el-icon-arrow-down" size="small" />
            </el-popover>
            <el-button type="primary" size="small" @click="search">查询</el-button>
          </el-form-item>
        </el-form>
      </el-col>
    </el-row>

    <el-table
      :data="tableData"
      :span-method="objectSpanMethod"
      border
      style="width: 100%">
      <el-table-column
        type="selection"
        width="35" />

      <el-table-column
        label="商品信息"
        width="350">
        <template slot-scope="scope">
          <div v-show="!scope.row.duplicate" style="font-size: 12px;color: #126AE4;margin-bottom:5px;">
            <span>订单编号：{{ scope.row.orderNo }}</span>&nbsp;
            <span>下单时间：{{ scope.row.createDate }}</span>
          </div>
          <div class="product-img"><img src="@/assets/img/goods/1499338515654.jpg"></div>
          <div class="product-infor">
            <a href="http://b2c.niuteam.cn/goods/goodsinfo?goodsid=150" target="_blank" style="color:#333;">
              {{ scope.row.goodsName }}
            </a>
            <p class="specification" style="margin-bottom: 0px;"><span style="color:#8e8c8c;font-size:12px;">5.0 </span></p>
          </div>
        </template>
      </el-table-column>

      <el-table-column
        label="商品清单"
        width="120">
        <template slot-scope="scope">
          <div style="display: inline-block;">
            <span>{{ scope.row.goodsPrices }}元</span>
          </div>
          <div style="display: inline-block;float:right;">
            {{ scope.row.goodsNumber }}件
          </div>
          <!-- TODO: 退款 -->
          <!-- <a href="/order/orderrefunddetail?itemid=347" style="margin:5px 0 10px 0;display:block;">退款已成功</a> -->
        </template>
      </el-table-column>

      <el-table-column
        label="订单金额"
        width="120">
        <template slot-scope="scope">
          <div style="text-align:center">
            <b class="netprice" style="color: #FF6600;font-size: 14px;font-weight: normal;">0.00</b>
            <br>
            <span class="expressfee">(含配送费:0.00元)</span>
            <br>
            <span class="expressfee">积分兑换</span>
          </div>
        </template>
      </el-table-column>

      <el-table-column
        label="收货信息"
        width="120">
        <template slot-scope="scope">
          <div style="text-align:center">
            <div style="text-align:left;">
              <span class="expressfee">1</span>
              <br>
              <span class="expressfee">13333333333</span>
              <br>
              <span class="expressfee">台湾省&nbsp;台湾省&nbsp;台北&nbsp;2</span>
            </div>
          </div>
        </template>
      </el-table-column>

      <el-table-column
        label="买家"
        width="120">
        <template slot-scope="scope">
          <div class="cell">
            nicemb
            <br>
            <!-- TODO: melibe pc -->
            <i class="fa fa-television" style="color:#666;" />
          </div>
        </template>
      </el-table-column>

      <el-table-column
        label="交易状态"
        width="180">
        <template slot-scope="scope">
          <div class="business-status" style="text-align:center">
            <span v-if="scope.row.status === 1">待付款</span>
            <span v-if="scope.row.status === 2">待发货</span>
            <span v-if="scope.row.status === 3">待提货</span>
            <span v-if="scope.row.status === 4">已发货</span>
            <span v-if="scope.row.status === 5">已收货</span>
            <span v-if="scope.row.status === 6">已完成</span>
            <span v-if="scope.row.status === 7">已关闭</span>
            <span v-if="scope.row.status === 8">退款中</span>
          </div>

        </template>
      </el-table-column>

      <el-table-column
        prop="expressType"
        label="配送方式"
        width="180" />

      <el-table-column
        label="操作"
        fixed="right"
        width="100">
        <template slot-scope="scope">
          <el-button size="mini" @click="handleEdit(scope.$index, scope.row)">订单详情</el-button>
          <br>
          <el-button v-if="scope.row.status === 3" size="mini" @click="showUpdateMemosDialog(scope.row)" >提货</el-button>
          <el-button v-if="scope.row.status === 2" size="mini" @click="showUpdateMemosDialog(scope.row)" >发货</el-button>

          <el-button size="mini" @click="showUpdateMemosDialog(scope.row)">备注</el-button>
          <br>
          <el-button v-if="scope.row.status === 2" size="mini" @click="showUpdateMemosDialog(scope.row)" >修改地址</el-button>
          <el-button v-if="scope.row.status === 7" size="mini" @click="showUpdateMemosDialog(scope.row)" >删除订单</el-button>
          <el-button v-if="scope.row.status === 6" size="mini" @click="showUpdateMemosDialog(scope.row)" >查看物流</el-button>
        </template>
      </el-table-column>
    </el-table>

  <!-- <div id="orderAction"> -->

  <!-- 模态框（Modal） -->
  <!-- <div id="edit-price" class="modal hide fade" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true" style="width: 650px;overflow: overlay;">
  <div class="modal-header">
    <button type="button" class="close" data-dismiss="modal" aria-hidden="true" style="margin-right: 10px;">×</button>
    <h3 id="H1">修改价格</h3>
  </div>
  <div class="modal-body">
    <table class="table table-striped table-main table-order-header">
      <colgroup>
        <col style="width: 40%;">
        <col style="width: 20%;">
        <col style="width: 25%;">
        <col style="width: 15%;">
      </colgroup>
      <tbody>
        <tr>
          <td>商品信息</td>
          <td>商品清单</td>
          <td>
            <div class="editprice-tiptxt">涨价或减价<i class="icon-tip"></i>
              <p class="text-tip">-表示减价<i class="icon-down-pic"></i></p>
            </div>
          </td>
          <td>邮费</td>
        </tr>
      </tbody>
    </table>
    <table class="table table-bordered table-order-list">
      <colgroup>
        <col style="width: 40%;">
        <col style="width: 20%;">
        <col style="width: 25%;">
        <col style="width: 15%;">
      </colgroup>
      <tbody id="OrderCommodity"></tbody>
    </table>
    <ul class="edit-price-amountpay">
      <li>
        <span class="amountpay-label">商品总价：</span>
        <span class="amountpay-price" id="goodsmoney"></span>元&nbsp;&nbsp;&nbsp;
        <span class="amountpay-label">商品优惠：</span>
        <span class="amountpay-price" id="discountmoney"></span>元&nbsp;&nbsp;&nbsp;
        <span class="amountpay-label">运费：</span>
        <span class="amountpay-price" id="modifiedFreight"></span>元
      </li>
      <li>
        <div>
          实收款： <span class="amountpay-price reality-price" id="changeTotal"></span>元
          <input type="hidden" id="hiedchangeTotal">
        </div>
      </li>
    </ul>
  </div>
  <div class="modal-footer">
    <button class="btn-common btn-big" onclick="updPrice()" id="butSubmit">保存</button>
    <button class="btn-common-cancle btn-big" data-dismiss="modal" aria-hidden="true">关闭</button>
  </div>
  </div> -->

  <!-- <div class="modal hide fade" id="Delivery" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true" style="left:32%">
  <div class="modal-dialog">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
        <h3>商品发货</h3>
      </div>
      <div class="modal-body"> -->
  <!-- 主要内容 -->
  <!-- <div style="padding: 0 0 10px 0;">待发货(<span id="no_shipping_num"></span>)，已选<span id="checkedbox">0</span></div>
        <table class="table-class" style="margin-bottom:10px;">
          <thead>
            <tr>
              <th>
                <i class="checkbox-common"><input type="checkbox" id="inlineCheckbox1" onclick="deliveryCheckAll(this)"></i>
              </th>
              <th></th>
              <th>商品</th>
              <th>数量</th>
              <th>物流 | 单号</th>
              <th>状态</th>
            </tr>
          </thead>
          <colgroup>
            <col style="width: 5%;">
            <col style="width: 10%;">
            <col style="width: 40%;">
            <col style="width: 10%;">
            <col style="width: 20%;">
            <col style="width: 15%;">
          </colgroup><colgroup>
          </colgroup><tbody></tbody>
        </table>
        <div>
          <div style="margin-bottom:5px;">发货方式：</div>
          <label class="checkbox-inline" style="float:left;margin-right:30px;">
            <i class="radio-common">
              <input type="radio" name="shipping_type" id="shipping_type0" value="0">
            </i>
            <span>无需物流</span>
          </label>
          <label class="checkbox-inline" style="float:left;">
            <i class="radio-common selected">
              <input type="radio" name="shipping_type" id="shipping_type1" value="1" checked="checked">
            </i>
            <span>需要物流</span>
          </label>
        </div>
        <div style="clear:both;"></div>
        <div class="form-group" id="express_input" style="margin:5px 0 10px 0;">
          <select class="form-control" id="divlogistics_express_company"></select>
          <input type="text" id="divlogistics_express_no" class="input-common" placeholder="请填写快递单号" style="vertical-align:2px;">
        </div>
        <div id="receiver_info" style="clear:both;"></div>
      </div>

      <div class="modal-footer">
        <input type="hidden" id="o2o_delivery_order_id">
        <button class="btn-common btn-big" onclick="orderDeliverySubmit()">保存</button>
        <button class="btn-common-cancle btn-big" data-dismiss="modal">关闭</button>
      </div>
    </div>
  </div>
  </div> -->

  <!-- 本地配送模态框 -->
  <!-- <div class="modal hide fade" id="o2o_Delivery" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true" style="left:32%">
  <div class="modal-dialog">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
        <h3>商品发货</h3>
      </div>
      <div class="modal-body"> -->
  <!-- 主要内容 -->
  <!-- <div>待发货(<span id="o2o_shipping_num"></span>)</div>
        <table class="table table-hover" style="margin-bottom:10px;">
          <thead>
            <tr>
              <td>商品</td>
              <td>数量</td>
            </tr>
          </thead>
          <colgroup>
            <col style="width: 60%;">
            <col style="width: 40%;">
          </colgroup><colgroup>
          </colgroup><tbody></tbody>
        </table>
        <div>
          <div style="margin-bottom:5px;">配送人员：</div>
        </div>
        <div style="clear:both;"></div>
        <div class="form-group" id="express_input">
          <select class="form-control input-lg" id="o2o_delivery_user"></select>
          <input type="text" id="o2o_delivery_no" class="input-common" placeholder="请填写配送单号" style="vertical-align:2px;">
        </div>
        <div id="receiver_info"></div>
        <div>
          <div style="margin-bottom:5px;">备注：</div>
          <textarea class="remark textarea-common" style=" width: 440px;height: 80px;" maxlength="500"></textarea>
        </div>
      </div>

      <div class="modal-footer">
        <input type="hidden" id="delivery_order_id">
        <button class="btn-common btn-big" onclick="o2oDeliverySubmit()">提交更改</button>
        <button class="btn-common-cancle btn-big" data-dismiss="modal">关闭</button>
      </div>
    </div>
  </div>
  </div> -->

  <!-- 自提模态 -->
  <!-- <div class="modal hide fade" id="pickup" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true" style="margin-left:-365px; width: 700px;">
  <div class="modal-dialog">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
        <h3>商品提货</h3>
      </div>
      <div class="modal-body"> -->
  <!-- 主要内容 -->
  <!-- <table class="table table-hover" style="margin-bottom:10px;">
          <thead></thead>
          <colgroup></colgroup><colgroup>
          </colgroup><tbody></tbody>
        </table>

        <div class="form-group">
          <div class="pick_title"><span class="required">*</span>提货人：</div>
          <div class="col-lg-4"><input type="text" id="pickup_name" class="form-control input-common" placeholder="请填写提货人姓名"></div>
        </div>
        <div class="form-group">
          <div class="pick_title"><span class="required">*</span>提货人手机号：</div>
          <div class="col-lg-4"><input type="text" id="pickup_mobile" class="form-control input-common" placeholder="请填写提货人手机号"></div>
        </div>
        <div class="form-group">
          <div class="pick_title">备注：</div>
          <div class="col-lg-2"><textarea id="pickup_desc" class="textarea-common"></textarea></div>
        </div>

      </div>

      <div class="modal-footer">
        <input type="hidden" id="pickup_order_id">
        <button class="btn-common btn-big" onclick="orderPickupSubmit(pickup_order_id)">确认提货</button>
        <button class="btn-common-cancle btn-big" data-dismiss="modal">关闭</button>
      </div>
    </div>
  </div>
  </div> -->
  <!-- 修改收货地址模态 -->
  <!-- <div class="modal hide fade" id="update_address" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true" style="margin-left:-365px; width: 700px;">
  <div class="modal-dialog">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
        <h3>修改收货地址</h3>
      </div>
      <div class="modal-body">
        <div class="form-group">
          <div class="pick_title"><span class="required">*</span>收货人：</div>
          <div class="col-lg-4"><input type="text" id="receiver_name" class="form-control input-common" style="width:350px;margin-bottom:10px !important;"></div>
        </div>
        <div class="form-group">
          <div class="pick_title"><span class="required">*</span>收货人手机号：</div>
          <div class="col-lg-4"><input type="text" id="receiver_mobile" class="form-control input-common" style="width:350px;margin-bottom:10px !important;"></div>
        </div>
        <div class="form-group">
          <div class="pick_title">收货人固定电话：</div>
          <div class="col-lg-4"><input type="text" id="fixed_telephone" class="form-control input-common" style="width:350px;margin-bottom:10px !important;"></div>
        </div>
        <div class="form-group">
          <div class="pick_title">收货人邮编：</div>
          <div class="col-lg-4"><input type="text" id="receiver_zip" class="form-control input-common" style="width:350px;margin-bottom:10px !important;" maxlength="6" onkeyup="this.value=this.value.replace(/\D/g,'')"></div>
        </div>
        <div class="form-group" style="width:100%;margin-bottom: 10px;">
          <div class="pick_title"><span class="required">*</span>收货地址：</div>
          <div class="address_choice">
            <div class="selectric-wrapper selectric-select-common selectric-harf" style="width: 125px;"><div class="selectric-hide-select"><select name="province" id="seleAreaNext" onchange="GetProvince();" class="select-common harf" tabindex="-1">

            <option value="-1">请选择省</option>
                        <option value="34">台湾省</option>
                        </select>
                        </div>
                        <div class="selectric">
                            <span class="selectric-label">请选择省</span>
                            <button class="selectric-button">▾</button></div>
                            <div class="selectric-items" tabindex="-1">
                            </div>
                        </div>
                        <input class="selectric-input" tabindex="0"></div>
            <select name="city" id="seleAreaThird" onchange="getSelCity();" class="select-common harf">

            <option value="-1">请选择市</option></select>
            <select name="district" id="seleAreaFouth" class="select-common harf">
              <option value="-1">请选择区/县</option>
            </select>
            <input type="hidden" id="provinceid" value="-1">
            <input type="hidden" id="cityid">
            <input type="hidden" id="districtid">
          </div>
        </div>
        <div class="form-group">
          <div class="pick_title"><span class="required">*</span>详细地址：</div>
          <div class="col-lg-4"><input type="text" id="address_detail" class="form-control input-common" style="width:350px"></div>
        </div>
      </div>

      <div class="modal-footer">
        <input type="hidden" id="update_address_id">
        <button type="button" class="btn-common btn-big" onclick="updateAddressSubmit(update_address_id)">修改</button>
        <button type="button" class="btn-common-white btn-big" data-dismiss="modal">关闭</button>
      </div>
    </div>
  </div>
  </div> -->

  <!-- 模态框（Modal） -->
  <!-- <div class="modal fade hide" id="Memobox" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true" style="width:700px;left:45%;top:30%;">
  <div class="modal-dialog">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
        <h3>备注信息</h3>
      </div>
      <div class="set-style">
        <dl>
          <dt><span class="required">*</span>备注:</dt>
          <dd>
            <p>
              <textarea rows="3" cols="20" id="memo" class="textarea-common"></textarea>
            </p>
            <p class="error">请输入备注</p>
          </dd>
        </dl>
      </div>
      <div class="modal-footer">
        <button type="button" class="btn-common btn-big" onclick="addMemoAjax()">保存</button>
        <button class="btn-common-cancle btn-big" data-dismiss="modal">关闭</button>
      </div>
    </div>
  </div>
  </div> -->

  <!-- 修改运单号 -->
  <!-- <div class="modal hide fade" id="update_express" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true" style="width: 700px; left: 45%; top: 30%; display: none;">
  <div class="modal-dialog">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
        <h3>修改运单号</h3>
      </div>
        <div class="modal-body">
          <div style="margin-bottom:5px;">发货方式：</div>
          <label class="checkbox-inline" style="float:left;margin-right:30px;"><input type="radio" name="shipping_type_update" id="shipping_type2" value="0"> 无需物流</label>
          <label class="checkbox-inline" style="float:left;"><input type="radio" name="shipping_type_update" id="shipping_type3" value="1" checked="checked"> 需要物流</label>

          <div style="clear:both;"></div>
          <div class="form-group" id="update_express_input">
            <select class="form-control input-lg" id="update_divlogistics_express_company" style="margin-bottom:5px;margin-right:15px;float:left;"></select>
            <div class="col-lg-2"><input type="text" id="update_divlogistics_express_no" class="form-control" placeholder="请填写快递单号" style="height:19px;"></div>
          </div>
          <div id="receiver_infos"></div>
        </div>
      </div>

      <div class="modal-footer">
        <input type="hidden" id="order_goods_express_id">
        <button class="btn-common btn-big" onclick="updateExpressAjax()">提交更改</button>
        <button class="btn-common-cancle btn-big" data-dismiss="modal">关闭</button>
      </div>
    </div>
  </div> -->

  <!-- 打印发货单 -->
  <!-- <div id="prite-send" class="modal hide fade" data-backdrop="static" role="dialog" tabindex="-1" aria-labelledby="myModalLabel" aria-hidden="true" style="margin-left:-536px;border-radius: 0;">
  <div class="modal-header">
    <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
    <h3>打印发货单</h3>
  </div>
  <div class="modal-body" style="height: 282px; overflow: auto;">
    <div class="ordercontent">
      <div class="data-body-head">
        <table class="table table-border-row header-table" style="margin-bottom: 0;">
          <colgroup>
            <col style="width: 25%">
            <col style="width: 37%">
            <col style="width: 18%">
            <col style="width: 20%">
          </colgroup>
          <tbody><tr style="background: #F2F6FC;">
            <th>订单编号</th>
            <th>商品名称</th>
            <th>快递公司</th>
            <th>运单号</th>
          </tr>
        </tbody></table>
      </div>
      <div class="data-table-body" style="height: 240px;">
        <table class="table table-border-row" style="margin-bottom: 0;">
          <colgroup>
            <col style="width: 25%">
            <col style="width: 37%">
            <col style="width: 18%">
            <col style="width: 20%">
          </colgroup>
          <tbody id="InvoiceList"></tbody>
        </table>
      </div>
    </div>
    <form class="form-horizontal" style="display: none;">
      <div class="control-group">
        <label class="control-label" for="deliveryShopInfo"><span class="color-red">*</span>发件人</label>
        <div class="controls">
          <select id="deliveryShopInfo" class="input-large"></select>
          <span class="help-block" style="display: none;">请输入选择发件人</span>
        </div>
      </div>
      <div class="control-group">
        <label class="control-label"></label>
        <div class="controls">
          <label class="checkbox"></label>
        </div>
      </div>
    </form>
  </div>
  <a id="invoicePrintingURL" style="display: none;" target="_blank"></a>
  <div class="modal-footer">
    <button class="btn-common" id="invoicePrinPreview" aria-hidden="true">打印预览</button>
    <button class="btn-common-cancle btn-big" data-dismiss="modal" aria-hidden="true">关闭</button>
  </div>
  </div> -->

  <!-- 打印出库单 -->
  <!-- <div id="print-billOfSales" class="modal hide fade" role="dialog" tabindex="-1" aria-labelledby="myModalLabel" aria-hidden="true" style="margin-left:-536px;border-radius: 0;" data-backdrop="static">
  <div class="modal-header">
    <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
    <h3>打印出库单</h3>
  </div>
  <div class="modal-body" style="height: 282px; overflow: auto;">
    <div class="ordercontent">
      <div class="data-body-head">
        <table class="table table-border-row header-table" style="margin-bottom: 0;">
          <colgroup>
            <col style="width: 29%">
            <col style="width: 15%">
            <col style="width: 8%">
            <col style="width: 8%">
            <col style="width: 15%">
            <col style="width: 15%">
          </colgroup>
          <tbody><tr style="background: #F2F6FC;border-bottom:1px solid #ddd">
            <th>商品名称</th>
            <th>sku名称</th>
            <th style="text-align: center;">出库量</th>
            <th style="text-align: center;">库存量</th>
            <th>商品编码</th>
            <th style="text-align: center;">订单号</th>
          </tr>
        </tbody></table>
      </div>
      <div class="data-table-body" style="height: 240px;">
        <table class="body-table">
          <colgroup>
            <col style="width: 29%">
            <col style="width: 15%">
            <col style="width: 8%">
            <col style="width: 8%">
            <col style="width: 15%">
            <col style="width: 15%">
          </colgroup>
          <tbody id="billOfSales"></tbody>
        </table>
      </div>
    </div>
    <form class="form-horizontal" style="display: none;">
      <div class="control-group">
        <label class="control-label" for="deliveryShop"><span class="color-red">*</span>发件人</label>
        <div class="controls">
          <select id="deliveryShop" class="input-large"></select>
          <span class="help-block" style="display: none;">请输入选择发件人</span>
        </div>
      </div>
      <div class="control-group">
        <label class="control-label"></label>
        <div class="controls">
          <label class="checkbox"></label>
        </div>
      </div>
    </form>
  </div>
  <a id="invoicePrintingURL" style="display: none;" target="_blank"></a>
  <div class="modal-footer">
    <button class="btn-common" onclick="printpreviewOfInvoice();" aria-hidden="true">打印预览</button>
    <button class="btn-common-cancle btn-big" data-dismiss="modal" aria-hidden="true">关闭</button>
  </div>
  </div> -->

  <!-- 打印快递单-->
  <!-- <div id="prite-send-express" class="modal hide fade" role="dialog" tabindex="-1" aria-labelledby="myModalLabel" aria-hidden="true" style="margin-left:-536px;border-radius: 0;" data-backdrop="static">
  <div class="modal-header">
    <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
    <h3>打印快递单</h3>
  </div>
  <div class="modal-body" style="height: 282px; overflow: auto;">
    <form class="form-horizontal">
      <div class="control-group">
        <label class="control-label" for="express_select"><span class="color-red">*</span>选择快递</label>
        <div class="controls">
          <select id="express_select" class="select-common">
                    <option value="4">顺丰</option>
                    <option value="5">cccc</option>
                    <option value="6">中通快递</option>
                    </select>
          <span class="help-block" style="display: none;">请选择快递</span>
        </div>
        <span><a href="/express/expresscompany.html" class="goToConfigure" style="text-decoration: underline;">前去配置</a></span>
      </div>
    </form>
    <div class="ordercontent">
      <div class="data-body-head">
        <table class="table table-border-row header-table" style="margin-bottom: 0;border: 1px solid #ddd;border-bottom: 0;">
          <tbody><tr style="background: #F2F6FC;">
            <th style="width: 17.5%">订单编号</th>
            <th style="width: 28%">商品名称</th>
            <th style="width: 6%">已发货</th>
            <th style="width: 6%">已打印</th>
            <th style="width: 15%">快递公司</th>
            <th style="width: 18%">运单号</th>
          </tr>
        </tbody></table>
      </div>
      <div class="data-table-body">
        <table class="table table-border-row body-table">
          <tbody id="InvoiceList-express" colspan="3">

          </tbody>
        </table>
      </div>
    </div>
  </div>
  <a id="invoicePrintingURL" style="display: none;" target="_blank"></a>
  <div class="modal-footer">
    <span class="tips">提示：<span style="color: #777;">选中的订单项运单号可实现自增,已发货的订单可修改快递公司和运单号</span></span>
    <button class="btn-common" id="expressPrinPreview" aria-hidden="true">打印预览</button>
    <button class="btn-common-cancle btn-big" data-dismiss="modal" aria-hidden="true">关闭</button>
  </div>
  </div> -->

  <!-- 批量发货 -->
  <!-- <div id="not-shipped-order-list" role="dialog" class="modal hide fade" tabindex="-1" aria-labelledby="myModalLabel" aria-hidden="true" data-backdrop="static" style="margin-left:-536px;border-radius: 0;">
  <div class="modal-header">
    <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
    <h3>批量发货</h3>
  </div>
  <div class="modal-body" style="height: 282px; overflow: auto;">
    <form class="form-horizontal">
      <div class="control-group">
        <label class="control-label" for="express_select"><span class="color-red">*</span>选择快递</label>
        <div class="controls">
          <select id="express_select_shipping" class="select-common">
                    <option value="4">顺丰</option>
                    <option value="5">cccc</option>
                    <option value="6">中通快递</option>
                    </select>
          <span class="help-block" style="display: none;">请选择快递</span>
        </div>
        <span><a href="/express/expresscompany.html" class="goToConfigure" style="text-decoration: underline;">前去配置</a></span>
      </div>
    </form>
    <div class="ordercontent">
      <div class="data-body-head">
        <table class="table table-border-row header-table">
          <tbody><tr style="background: #F2F6FC;">
            <th style="width: 17.5%">订单编号</th>
            <th style="width: 32.5%">商品名称</th>
            <th style="width: 15%">快递公司</th>
            <th style="width: 18%">运单号</th>
          </tr>
        </tbody></table>
      </div>
      <div class="data-table-body">
        <table class="table table-border-row body-table">
          <tbody id="notShippedOrderList">

          </tbody>
        </table>
      </div>
    </div>
  </div>
  <div class="modal-footer">
    <button class="btn-common" id="confirm_delivery" aria-hidden="true">确认发货</button>
    <button class="btn-common-cancle btn-big" data-dismiss="modal" aria-hidden="true">关闭</button>
  </div>
  </div> -->

  <!-- <div class="modal fade hide" id="confirmRefund" tabindex="-1" aria-labelledby="确认退款" aria-hidden="true" data-backdrop="static" style="width: 650px; overflow: overlay;top:50%;">
  <div class="modal-dialog">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
        <h3>确认退款</h3>
      </div>
      <div class="modal-body">

        <div class="refunds-block">
          <label>退款金额：</label>
          <input type="text" id="refund_money_input" class="input-common" placeholder="请填写退款金额">
          <span class="operating-hint">请输入退款金额</span>
        </div>
        <div class="refunds-block">
          <label>退款方式：</label>
          <select id="refund_way_select" class="select-common"></select>
        </div>
        <div class="refunds-block">
          <label class="w130">买家申请退款金额：</label>
          <span id="apply_money">0.00元</span>
        </div>
        <div class="refunds-block">
          <label class="w130">买家实际付款金额：</label>
          <span id="pay_money">0.00元</span>
        </div>
        <div class="refunds-block" style="display:none;">
          <label class="w130">自动退还余额：</label>
          <span id="balance_refund">0.00元</span>
        </div>

      </div>
      <div class="modal-footer"> -->
  <!-- 温馨提示 -->
  <!-- <div class="refunds-block js-not-configured-prompt"></div>
        <input type="hidden" id="confirm_order_id">
        <input type="hidden" id="confirm_order_goods_id">
        <input type="hidden" id="refund_require_money">
        <button class="btn-common js-confirm-refund-ok disabled">确认</button>
        <button class="btn" data-dismiss="modal" aria-hidden="true">取消</button>
      </div>
    </div>
  </div>
  </div> -->
  <!-- <div class="modal hide fade" tabindex="-1" aria-labelledby="退款操作提醒" aria-hidden="true" data-backdrop="static" id="refundOperationReminder" style="width:600px;top: 50%;">
  <div class="modal-dialog">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
        <h3>退款操作提醒</h3>
      </div>
      <div class="modal-body">
        <div class="js-confirmation"></div>

        <label>备注：</label>
        <textarea rows="4" placeholder="退款备注，最多可输入200个字符。(如果不填，系统将会自动添加默认退款备注，格式为：订单编号:201710180000031，退款方式为:[微信支付]，退款金额:0.00元，退款余额:0.00元)" id="refund-remark"></textarea>
        <div class="refunds-block js-confirmation-prompt"></div>
        <div style="clear: both;"></div>
      </div>
      <div class="modal-footer"> -->
  <!-- 温馨提示 -->
  <!-- <button class="btn-common disabled" id="countdown_refund_confirm">确定</button>
        <button class="btn" data-dismiss="modal" aria-hidden="true">取消</button>
      </div>
    </div>
  </div>
  </div> -->
  <!-- <div class="modal hide fade" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true" id="refuseRefund" style="width:300px;">
  <div class="modal-dialog">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
        <h3>拒绝退款</h3>
      </div>
      <div class="modal-body">
        <p>您可以拒绝本次退款或者永久拒绝</p>
      </div>
      <div class="modal-footer">
        <input type="hidden" id="refuse_order_id">
        <input type="hidden" id="refuse_order_goods_id">
        <button class="btn-common" onclick="refuseRefundType(1)">拒绝本次</button>
        <button class="btn" onclick="refuseRefundType(2)">永久拒绝</button>
      </div>
    </div>
  </div>
  </div>
  <div class="modal hide fade" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true" id="agreeRefund" style="width:300px;">
  <div class="modal-dialog">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
        <h3>同意退款</h3>
      </div>
      <div class="modal-body">
        <p>确定要同意退款吗？</p>
      </div>
      <div class="modal-footer">
        <input type="hidden" id="agreee_order_id">
        <input type="hidden" id="agree_order_goods_id">
        <button class="btn-common" onclick="agreeRefund()">同意</button>
        <button class="btn" data-dismiss="modal" aria-hidden="true">取消</button>
      </div>
    </div>
  </div>
  </div> -->
  <!-- <div class="modal hide fade" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true" id="confirm_receipt" style="width:400px;">
  <div class="modal-dialog">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
        <h3>确认收货</h3>
      </div>
      <div class="modal-body">
        <div style="height: 35px;line-height: 35px;">
          物流公司：<span id="logistics_company"></span>
        </div>
        <div style="height: 35px;line-height: 35px;">
          物流单号：<span id="logistics_number"></span>
        </div>
        <div style="height: 35px;line-height: 35px;">
          是否入库：
          <label for="no" style="display: inline-block;font-weight: normal;">否</label>
          <input type="radio" name="isStorage" id="no" style="margin-top: -2px;" checked="">
          <label for="yes" style="display: inline-block;font-weight: normal;margin-left: 15px;">是</label><input type="radio" name="isStorage" id="yes" style="margin-top: -2px;margin-left: 5px;">
        </div>
        <div id="storage_num" style="display: none;">
          入库件数：<input type="number">
        </div>
      </div>
      <div class="modal-footer">
        <input type="hidden" id="hide_order_id">
        <input type="hidden" id="hide_order_goods_id">
        <input type="hidden" id="hide_receipt_goods_id">
        <input type="hidden" id="hide_receipt_sku_id">
        <button class="btn" onclick="confirm_receipt()">同意</button>
        <button class="btn" onclick="cancel_receipt()">取消</button>
      </div>
    </div>
  </div>
  </div> -->

  <!-- </div> -->

  </section>
</template>

<script>
require('@/assets/style/table.scss')
require('@/assets/style/order/list.scss')

export default {
  name: 'BargainOrder',
  data () {
    return {
      queryForm: {},
      orderList: [{
        id: '30',
        orderNo: '2018071214490001',
        createDate: '2018-07-12 14:49:11',
        status: 7,
        goodsName: '浴霸智能开关 触摸86型卫生间风暖通用防水4四五合一5开开关面板',
        goodsPrices: 180.00,
        number: 1,
        buyer: 'admin',
        buyType: 'mobile',
        express_name: '22222222',
        express_tel: '14725698564',
        express_address: '广西壮族自治区 河池市 大化瑶族自治县 22',
        orderPrice: 144.00,
        expressType: '物流配送'
      }, {
        id: '77',
        orderNo: '2018062010330001',
        createDate: '2018-06-20 10:33:07',
        status: 7,
        goodsName: '212313132',
        goodsPrices: 5.00,
        number: 1,
        buyer: 'cqinter',
        buyType: 'mobile',
        express_name: 'cqinter',
        express_tel: '18696529503',
        express_address: '四川省 巴中市 通江县 dddd',
        orderPrice: 0.50,
        expressType: '物流配送'
      }]
    }
  },
  computed: {
    tableData () {
      var result = []
      this.orderList.forEach(orderListItem => {
        var goods = this.copyOrderGoodsInfo(orderListItem, 0)
        if (orderListItem.goodsList.length > 1) {
          goods.multirow = true
          result.push(Object.assign(goods, orderListItem))

          orderListItem.goodsList.forEach((goodsListItem, index) => {
            if (index > 0) {
              var goods = this.copyOrderGoodsInfo(orderListItem, index)
              goods.duplicate = true
              result.push(Object.assign(goods, orderListItem))
            }
          })
        } else {
          result.push(Object.assign(goods, orderListItem))
        }
      })
      return result
    }
  },

  methods: {
    copyOrderGoodsInfo ({ goodsList = [] }, index) {
      var result = {}
      result.goodsName = goodsList[index].name
      result.goodsNumber = goodsList[index].number
      result.goodsPrices = goodsList[index].price
      return result
    },
    objectSpanMethod ({ row, column, rowIndex, columnIndex }) {
      if (columnIndex === 0 || columnIndex > 2) {
        if (row.duplicate) {
          return {
            rowspan: 0,
            colspan: 0
          }
        } else if (row.multirow) {
          return {
            rowspan: row.goodsList.length,
            colspan: 1
          }
        } else {
          return {
            rowspan: 1,
            colspan: 1
          }
        }
      }
    }
  }
}
</script>
