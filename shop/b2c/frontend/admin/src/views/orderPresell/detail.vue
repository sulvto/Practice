<template>

  <section class="ns-base-section">

    <div style="position:relative;margin:0;">
      <!-- 面包屑导航 -->
            <div class="breadcrumb-nav">
        <a href="index.html">大鵬系統</a>
                  <i class="fa fa-angle-right"></i>
          <a href="/order/orderlist.html">订单</a>
                  <i class="fa fa-angle-right"></i>
          <!-- 需要加跳转链接用这个：http://showfx.niuteam.cn/admin/presellOrder/orderDetail -->
          <a href="javascript:;" style="color:#999;">订单详情</a>
              </div>
            <!-- 三级导航菜单 -->

      <div class="right-side-operation">
        <ul>
          <li>
            <a class="js-open-warmp-prompt" href="javascript:;" data-menu-desc=""><i class="fa fa-question-circle"></i>&nbsp;提示</a>
            <div class="popover">
              <div class="arrow"></div>
              <div class="popover-content">
                <div>
                                    <h4>功能提示</h4>
                  <p class="function-prompts"></p>
                </div>
              </div>
            </div>
          </li>

        </ul>
      </div>
    </div>

    <div class="ns-main">

  <div class="space-10"></div>
  <div class="mod-table">
  <div class="step-region clearfix">
  <div class="info-region">
    <div class="info-div">订单信息<span class="secured-title">担保交易</span></div>
    <table class="info-table">
    <tbody>
      <tr><th>订单编号：</th><td>2018072621350002</td></tr>
      <tr><th>订单交易号：</th><td>153261213838371001</td></tr>
      <tr style="display: table-row;"><th>订单类型：</th><td>预售订单</td></tr>
      <tr><th>付款方式：</th><td>在线支付</td></tr>
      <tr><th>买家：</th><td><span>cqinter</span></td></tr>
      <tr><th>买家IP：</th><td><span>125.85.41.148</span></td></tr>
    </tbody>
    </table>
    <div class="dashed-line"></div>
    <table class="info-table">
      <tbody>

                <tr><th>配送方式：</th><td>物流配送&nbsp;&nbsp;</td></tr>
                      <!-- 只有物流配送才有配送时间 -->
          <tr>
            <th>配送时间：</th>
                        <td>工作日、双休日与节假日均可送货</td>
                      </tr>
                    <!-- 物流 -->
          <tr>
            <th>收货信息：</th>
            <td>
              <p>test，15802353600， 广东省&nbsp;梅州市&nbsp;梅县&nbsp;yatai shang&nbsp;</p>
            </td>
          </tr>
                  <tr>
          <th>买家留言：</th>
                    <td>此订单没有留言</td>
                  </tr>
      </tbody>
    </table>
  </div>
  <div class="state-region">
    <div style="padding: 0px 0px 30px 40px;">
      <div class="state-title"><span class="icon info">!</span>订单状态：已关闭</div>
      <div class="state-action">
              <button class="zent-btn zent-btn-primary test-send-goods" onclick="operation('seller_memo',62)">备注</button>
              <button class="zent-btn zent-btn-primary test-send-goods" onclick="operation('delete_order',62)">删除订单</button>
            </div>
    </div>
    <div class="state-remind-region">
      <div class="dashed-line"></div>
      <div class="state-remind"><div class="tixing">大鵬系統提醒：</div>
        <ul><li>如果无法发货，请及时与买家联系并说明情况后进行退款；</li>
        <li>买家申请退款后，须征得买家同意后再发货，否则买家有权拒收货物；</li>
        <li>买家付款后超过7天仍未发货，将有权申请客服介入发起退款维权；</li></ul>
      </div>
    </div>
  </div>
  </div>
  <table class="ui-table ui-table-simple goods-table order-detail-goods-table">
  <thead>
    <tr>
      <th style="width:8%;">商品图</th>
      <th class="cell-10" style="width:30%;">商品</th>
      <th style="width:8%;">价格(元)</th>
      <th style="width:8%;">预售金(元)</th>
      <th style="width:8%;">尾款(元)</th>
      <th style="width:8%;">数量</th>
      <th style="width:10%;">调整金额(元)</th>
      <th class="cell-13" style="width:10%;">小计(元)</th>
      <th style="width:15%;">配送状态</th>
    </tr>
  </thead>
  <tbody>
  <!-- 待发货商品 -->
        <tr class="test-item">
        <td class="td-goods-image" rowspan="1">
          <div class="ui-centered-image" style="width: 48px; height: 48px;">
            <img src="/upload/goods/14993429751434.jpg" style="max-width: 48px; max-height: 48px;">
          </div>
        </td>
        <td class="cell-10" style="width:200px;">
          <a href="/goods/goodsinfo.html?goodsid=75" target="_blank">21312312</a>
          <p class="c-gray">24GB </p>
                  </td>
        <td>3.96</td>
        <td>1.00</td>
        <td>2.96</td>
        <td>1</td>
        <td>0.00</td>
        <td><p>3.96</p></td>
        <td>
          <p>待发货</p>
                  </td>
      </tr>
      <tr><td colspan="9"></td></tr>
      <!-- 已发货 -->
    </tbody>
  <tfoot>
    <tr>
      <td colspan="9" class="text-right">
        <span>商品总金额：￥3.96，</span>

        <span> 还需支付尾款：<b class="real-pay c-red">￥2.96</b></span>
        <span>（含运费 ￥0.00）</span>
      </td>
    </tr>
  </tfoot>
  </table>

  <table class="ui-table ui-table-simple goods-table order-detail-goods-table" style="border-top:none;">
  <thead>
    <tr>
      <th>订单日志</th>
    </tr>
  </thead>
  <tbody>
    </tbody>
  </table>

  <div class="order_spec">
  <a href="/order/orderdetail.html?order_id=118"><span>下一单</span></a><a href="/order/orderdetail.html?order_id=60"><span>上一单</span></a>
  </div>

  </div>
  <input type="hidden" id="order_id" value="62" class="">

  <!-- 模态框（Modal） -->
  <div id="edit-price" class="modal hide fade" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true" style="width: 650px;overflow: overlay;">
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
  </div>

  <div class="modal hide fade" id="Delivery" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true" style="left:32%">
  <div class="modal-dialog">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
        <h3>商品发货</h3>
      </div>
      <div class="modal-body">
        <!-- 主要内容 -->
        <div style="padding: 0 0 10px 0;">待发货(<span id="no_shipping_num"></span>)，已选<span id="checkedbox">0</span></div>
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
  </div>

  <!-- 本地配送模态框 -->
  <div class="modal hide fade" id="o2o_Delivery" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true" style="left:32%">
  <div class="modal-dialog">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
        <h3>商品发货</h3>
      </div>
      <div class="modal-body">
        <!-- 主要内容 -->
        <div>待发货(<span id="o2o_shipping_num"></span>)</div>
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
  </div>

  <!-- 自提模态 -->
  <div class="modal hide fade" id="pickup" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true" style="margin-left:-365px; width: 700px;">
  <div class="modal-dialog">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
        <h3>商品提货</h3>
      </div>
      <div class="modal-body">
        <!-- 主要内容 -->
        <table class="table table-hover" style="margin-bottom:10px;">
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
  </div>
  <!-- 修改收货地址模态 -->
  <div class="modal hide fade" id="update_address" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true" style="margin-left:-365px; width: 700px;">
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
            <div class="selectric-wrapper selectric-select-common selectric-harf" style="width: 125px;">
                            <div class="selectric-hide-select">

                                <select name="province" id="seleAreaNext" onchange="GetProvince();" class="select-common harf" tabindex="-1">

            <option value="-1">请选择省</option>
                        <option value="35">hai</option>
                        <option value="20">广西壮族自治区</option>

                        </select>
                        </div>
            <div class="selectric-wrapper selectric-select-common selectric-harf" style="width: 125px;"><div class="selectric-hide-select"><select name="city" id="seleAreaThird" onchange="getSelCity();" class="select-common harf" tabindex="-1">

            <option value="-1">请选择市</option></select></div><div class="selectric"><span class="selectric-label">请选择市</span><button class="selectric-button">▾</button></div><div class="selectric-items" tabindex="-1"><div class="selectric-scroll"><ul><li data-index="0" class="last selected" title="请选择市">请选择市</li></ul></div></div><input class="selectric-input" tabindex="0"></div>
            <div class="selectric-wrapper selectric-select-common selectric-harf" style="width: 125px;">
                            <div class="selectric-hide-select">
                                <select name="district" id="seleAreaFouth" class="select-common harf" tabindex="-1">
              <option value="-1">请选择区/县</option>
            </select>
                        </div>
                        <div class="selectric">
                            <span class="selectric-label">请选择区/县</span>
                            <button class="selectric-button">▾</button></div><div class="selectric-items" tabindex="-1"><div class="selectric-scroll"><ul><li data-index="0" class="last selected" title="请选择区/县">请选择区/县</li></ul></div></div><input class="selectric-input" tabindex="0"></div>
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
  </div>

  <!-- 模态框（Modal） -->
  <div class="modal fade hide" id="Memobox" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true" style="width:700px;left:45%;top:30%;">
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
  </div>

  <!-- 修改运单号 -->
  <div class="modal hide fade" id="update_express" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true" style="width: 700px; left: 45%; top: 30%; display: none;">
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
  </div>
  </div>

    </div>
  </section>
</template>
