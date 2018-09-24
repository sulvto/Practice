<template>
  <section class="ns-base-section">
    <el-tabs v-model="activeName" @tab-click="handleClick">
      <el-tab-pane label="全部" name="first"></el-tab-pane>
      <el-tab-pane label="预售中" name="second"></el-tab-pane>
      <el-tab-pane label="待发货" name="third"></el-tab-pane>
      <el-tab-pane label="已发货" name="fourth"></el-tab-pane>
      <el-tab-pane label="已收货" name="first"></el-tab-pane>
      <el-tab-pane label="已完成" name="third"></el-tab-pane>
      <el-tab-pane label="已关闭" name="fourth"></el-tab-pane>
      <el-tab-pane label="退款中" name="first"></el-tab-pane>
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
              type="daterange"
              align="right"
              unlink-panels
              range-separator="至"
              start-placeholder="开始日期"
              end-placeholder="结束日期"
              :picker-options="datePickerOptions">
            </el-date-picker>
          </el-form-item>
          <el-form-item>
            <el-popover
              placement="bottom"
              width="400"
              trigger="click"
              v-model="moreQueryPopoverVisible">
              <el-form ref="editForm" :model="queryForm" label-width="100px" size="small" label-position="right">
                <el-form-item label="订单编号">
                  <el-input v-model="queryForm.orderNo"></el-input>
                </el-form-item>

                <el-form-item label="收货人姓名">
                  <el-input v-model="queryForm.receiver"></el-input>
                </el-form-item>

                <el-form-item label="收货人手机号">
                  <el-input v-model="queryForm.receiverMobile"></el-input>
                </el-form-item>

                <el-form-item label="支付方式">
                  <el-select v-model="queryForm.paymentType" clearable placeholder="请选择">
                    <el-option label="微信" :value="1"></el-option>
                    <el-option label="支付宝" :value="2"></el-option>
                    <el-option label="线下支付" :value="3"></el-option>
                    <el-option label="货到付款" :value="4"></el-option>
                  </el-select>
                </el-form-item>

                <el-form-item label="配送方式">
                  <el-select v-model="queryForm.shippingType" clearable placeholder="请选择">
                    <el-option label="物流配送" :value="1"></el-option>
                    <el-option label="买家自提" :value="2"></el-option>
                    <el-option label="本地配送" :value="3"></el-option>
                  </el-select>
                </el-form-item>

                <el-form-item>
                  <el-button type="primary" @click="moreQueryPopoverVisible = false">确定</el-button>
                </el-form-item>
              </el-form>
              <el-button slot="reference" icon="el-icon-arrow-down" size="small" ></el-button>
            </el-popover>
            <el-button type="primary" size="small" @click="search">查询</el-button>
          </el-form-item>
        </el-form>
      </el-col>
    </el-row>

    <el-table border
      :data="tableData"
      :span-method="objectSpanMethod"
      style="width: 100%">
      <el-table-column
        type="selection"
        width="35">
      </el-table-column>

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
        </template>
      </el-table-column>

      <!-- TODO: 预定金 -->

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
            <div style="text-align:left;"><span class="expressfee">1</span><br><span class="expressfee">13333333333</span><br><span class="expressfee">台湾省&nbsp;台湾省&nbsp;台北&nbsp;2</span></div>
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
            <i class="fa fa-television" style="color:#666;"></i>
          </div>
        </template>
      </el-table-column>

      <el-table-column
        prop="status"
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
        label="配送方式"
        width="180">
        <template slot-scope="scope">
          <div class="business-status" style="text-align:center">物流配送<br></div>
        </template>
      </el-table-column>

      <el-table-column
        label="操作" fixed="right"
          width="100">
          <template slot-scope="scope">
              <el-button size="mini" @click="handleEdit(scope.$index, scope.row)">订单详情</el-button>
              <br>
              <el-button size="mini" @click="showUpdateMemosDialog(scope.row)" v-if="scope.row.status === 3">提货</el-button>
              <el-button size="mini" @click="showUpdateMemosDialog(scope.row)" v-if="scope.row.status === 2">发货</el-button>

              <el-button size="mini" @click="showUpdateMemosDialog(scope.row)">备注</el-button>
              <br/>
              <el-button size="mini" @click="showUpdateMemosDialog(scope.row)" v-if="scope.row.status === 2">修改地址</el-button>
              <el-button size="mini" @click="showUpdateMemosDialog(scope.row)" v-if="scope.row.status === 7">删除订单</el-button>
              <el-button size="mini" @click="showUpdateMemosDialog(scope.row)" v-if="scope.row.status === 6">查看物流</el-button>
          </template>
      </el-table-column>
    </el-table>

    <div class="ns-main">

      <input type="hidden" id="order_id">
      <input type="hidden" id="print_select_ids">
      <input type="hidden" id="order_status" value="">
      <div>
        <table class="mytable select">
          <tbody>
            <tr>
              <th align="left">
                <button onclick="dataExcel()" class="btn-common">导出数据</button>

                <a class="btn-common-white" id="PrintOrder" href="javascript:;">
                  <i class="fa fa-print"></i>
                  <span>打印订单</span>
                </a>
              </th>
              <th style="position: relative;">
                <span>下单时间：</span>
                <input type="text" id="startDate" class="input-common middle" placeholder="请选择开始日期" onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm:ss'})"> &nbsp;-&nbsp;
                <input type="text" id="endDate" placeholder="请选择结束日期" class="input-common middle" onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm:ss'})">
                <button class="btn-common-white more-search"><i class="fa fa-chevron-down"></i></button>
                <button onclick="searchData()" class="btn-common">搜索</button>

                <!-- 更多搜索 -->
                <div class="more-search-container">
                  <dl>
                    <dt>订单编号：</dt>
                    <dd>
                      <input id="orderNo" class="input-common middle" type="text">
                    </dd>
                  </dl>
                  <dl>
                    <dt>收货人姓名：</dt>
                    <dd>
                      <input id="userName" class="input-common middle" type="text">
                    </dd>
                  </dl>
                  <dl>
                    <dt>收货人手机号：</dt>
                    <dd>
                      <input id="receiverMobile" class="input-common middle" type="text">
                    </dd>
                  </dl>
                  <dl>
                    <dt>支付方式：</dt>
                    <dd>
                      <div class="selectric-wrapper selectric-select-common selectric-middle" style="width: 150px;">
                        <div class="selectric-hide-select"><select id="payment_type" class="select-common middle" tabindex="-1">
                  <option value="">全部</option>
                  <option value="1">微信</option>
                  <option value="2">支付宝</option>
                  <option value="10">线下支付</option>
                  <option value="4">货到付款</option>
                </select></div>
                        <div class="selectric"><span class="selectric-label">全部</span><button class="selectric-button">▾</button></div>
                        <div class="selectric-items" tabindex="-1">
                          <div class="selectric-scroll">
                            <ul>
                              <li data-index="0" class="selected" title="全部">全部</li>
                              <li data-index="1" class="" title="微信">微信</li>
                              <li data-index="2" class="" title="支付宝">支付宝</li>
                              <li data-index="3" class="" title="线下支付">线下支付</li>
                              <li data-index="4" class="last" title="货到付款">货到付款</li>
                            </ul>
                          </div>
                        </div><input class="selectric-input" tabindex="0"></div>
                    </dd>
                  </dl>
                  <dl>
                    <dt>配送方式：</dt>
                    <dd>
                      <div class="selectric-wrapper selectric-select-common selectric-middle" style="width: 150px;">
                        <div class="selectric-hide-select"><select id="shipping_type" class="select-common middle" tabindex="-1">
                  <option value="0">全部</option>
                  <option value="1">物流配送</option>
                  <option value="2">买家自提</option>
                  <option value="3">本地配送</option>
                </select></div>
                        <div class="selectric"><span class="selectric-label">全部</span><button class="selectric-button">▾</button></div>
                        <div class="selectric-items" tabindex="-1">
                          <div class="selectric-scroll">
                            <ul>
                              <li data-index="0" class="selected" title="全部">全部</li>
                              <li data-index="1" class="" title="物流配送">物流配送</li>
                              <li data-index="2" class="" title="买家自提">买家自提</li>
                              <li data-index="3" class="last" title="本地配送">本地配送</li>
                            </ul>
                          </div>
                        </div><input class="selectric-input" tabindex="0"></div>
                    </dd>
                  </dl>
                  <dl>
                    <dt></dt>
                    <dd><button onclick="searchData()" class="btn-common">搜索</button></dd>
                  </dl>
                </div>
              </th>
            </tr>
          </tbody>
        </table>

        <table class="table-class" id="ajax-orderlist">
          <colgroup>
            <col width="2%">
            <col width="34%">
            <col width="12%">
            <col width="5%">
            <col width="10%">
            <col width="10%">
            <col width="6%">
            <col width="7%">
            <col width="7%">
            <col width="10%">
          </colgroup>
          <thead>
            <tr align="center">
              <th>
                <i class="checkbox-common">
              <input type="checkbox" onclick="CheckAll(this)" id="check">
            </i>
              </th>
              <th>商品信息</th>
              <th>商品清单</th>
              <th>预定金</th>
              <th>订单金额</th>
              <th>收货信息</th>
              <th>买家</th>
              <th>交易状态</th>
              <th>配送方式</th>
              <th>操作</th>
            </tr>
          </thead>
          <tbody>
            <tr>
              <td rowspan="1"><i class="checkbox-common"><input id="153261213838371001" type="checkbox" value="62" name="sub"></i></td>
              <td>
                <div style="font-size: 12px;color: #126AE4;margin-bottom:5px;"><span>订单编号：2018072621350002</span>&nbsp;<span>下单时间：2018-07-26 21:35:38</span></div>
                <div class="product-img"><img src="/upload/goods/14993429751434.jpg"></div>
                <div class="product-infor"><a href="/goods/goodsinfo?goodsid=75" target="_blank" style="color:#333;">21312312</a>
                  <p class="specification" style="margin-bottom: 0px;"><span style="color:#8e8c8c;font-size:12px;">24GB </span></p>
                </div>
              </td>
              <td>
                <div class="cell" style="display: inline-block;"><span>3.96元</span></div>
                <div class="cell" style="display: inline-block;float:right;">1件</div>
              </td>
              <td rowspan="1" style="text-align:center">1.00</td>
              <td rowspan="1" style="text-align:center">
                <div class="cell"><b class="netprice" style="color: #FF6600;font-size: 14px;font-weight: normal;">3.96</b><br><span class="expressfee">(含配送费:0.00元)</span><br><span class="expressfee">在线支付</span></div>
              </td>
              <td rowspan="1" style="text-align:center">
                <div style="text-align:left;"><span class="expressfee">test</span><br><span class="expressfee">15802353600</span><br><span class="expressfee">广东省&nbsp;梅州市&nbsp;梅县&nbsp;yatai shang</span></div>
              </td>
              <td rowspan="1" style="text-align:center">
                <div class="cell">cqinter<br><i class="fa fa-mobile fa-2x" style="color:#666;"><i></i></i>
                </div>
              </td>
              <td rowspan="1">
                <div class="business-status" style="text-align:center">已关闭<br></div>
              </td>
              <td rowspan="1">
                <div class="business-status" style="text-align:center">物流配送<br></div>
              </td>
              <td rowspan="1" style="text-align:center;"><a style="display:block;margin-bottom:5px;" href="/Orderpresell/orderDetail?order_id=62">订单详情</a><a style="display:block;margin-bottom:5px;color:#666666" href="javascript:operation('seller_memo',62)">备注</a><a style="display:block;margin-bottom:5px;color:#ff0000"
                    href="javascript:operation('delete_order',62)">删除订单</a></td>
            </tr>
            <tr style="height:10px;">
              <td style="border-bottom:solid #E1E6F0;border-width:0 0 1px 0;" colspan="10"></td>
            </tr>
            <tr>
              <td rowspan="1"><i class="checkbox-common"><input id="153261210111331001" type="checkbox" value="61" name="sub"></i></td>
              <td>
                <div style="font-size: 12px;color: #126AE4;margin-bottom:5px;"><span>订单编号：2018072621350001</span>&nbsp;<span>下单时间：2018-07-26 21:35:01</span></div>
                <div class="product-img"><img src="/upload/goods/14993429751434.jpg"></div>
                <div class="product-infor"><a href="/goods/goodsinfo?goodsid=75" target="_blank" style="color:#333;">21312312</a>
                  <p class="specification" style="margin-bottom: 0px;"><span style="color:#8e8c8c;font-size:12px;">24GB </span></p>
                </div>
              </td>
              <td>
                <div class="cell" style="display: inline-block;"><span>3.96元</span></div>
                <div class="cell" style="display: inline-block;float:right;">1件</div>
              </td>
              <td rowspan="1" style="text-align:center">100.00</td>
              <td rowspan="1" style="text-align:center">
                <div class="cell"><b class="netprice" style="color: #FF6600;font-size: 14px;font-weight: normal;">3.96</b><br><span class="expressfee">(含配送费:0.00元)</span><br><span class="expressfee">在线支付</span></div>
              </td>
              <td rowspan="1" style="text-align:center">
                <div style="text-align:left;"><span class="expressfee">test</span><br><span class="expressfee">15802353600</span><br><span class="expressfee">广东省&nbsp;梅州市&nbsp;梅县&nbsp;yatai shang</span></div>
              </td>
              <td rowspan="1" style="text-align:center">
                <div class="cell">cqinter<br><i class="fa fa-mobile fa-2x" style="color:#666;"><i></i></i>
                </div>
              </td>
              <td rowspan="1">
                <div class="business-status" style="text-align:center">已关闭<br></div>
              </td>
              <td rowspan="1">
                <div class="business-status" style="text-align:center">物流配送<br></div>
              </td>
              <td rowspan="1" style="text-align:center;"><a style="display:block;margin-bottom:5px;" href="/Orderpresell/orderDetail?order_id=61">订单详情</a><a style="display:block;margin-bottom:5px;color:#666666" href="javascript:operation('seller_memo',61)">备注</a><a style="display:block;margin-bottom:5px;color:#ff0000"
                    href="javascript:operation('delete_order',61)">删除订单</a></td>
            </tr>
          </tbody>
        </table>
      </div>
    </div>

  </section>
</template>

<script>
require('@/assets/style/table.scss')
require('@/assets/style/order/list.scss')

export default {
  name: 'orderPreshellList',
  data () {
    return {
      queryForm: {},
      orderList: []
    }
  },
  computed: {
    tableData () {
      let result = []
      this.orderList.forEach(orderListItem => {
        let goods = this.copyOrderGoodsInfo(orderListItem, 0)
        if (orderListItem.goodsList.length > 1) {
          goods.multirow = true
          result.push(Object.assign(goods, orderListItem))

          orderListItem.goodsList.forEach((goodsListItem, index) => {
            if (index > 0) {
              let goods = this.copyOrderGoodsInfo(orderListItem, index)
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
      let result = {}
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
  },
  components: {}
}
</script>
