<template>
  <section class="ns-base-section">
    <el-tabs v-model="activeName" @tab-click="handleClick">
      <el-tab-pane label="全部" :name="0"></el-tab-pane>
      <el-tab-pane label="待付款" :name="1"></el-tab-pane>
      <el-tab-pane label="待发货" :name="2"></el-tab-pane>
      <!-- <el-tab-pane label="待提货" :name="3"></el-tab-pane> -->
      <el-tab-pane label="已发货" :name="4"></el-tab-pane>
      <el-tab-pane label="已收货" :name="5"></el-tab-pane>
      <el-tab-pane label="已完成" :name="6"></el-tab-pane>
      <el-tab-pane label="已关闭" :name="7"></el-tab-pane>
      <el-tab-pane label="退款中" :name="8"></el-tab-pane>
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

    <el-dialog title="备注信息" size="small" :visible.sync="dialogUpdateMemosFormVisible">
      <el-form ref="updateMemosForm" size="small" :model="updateMemosForm" label-width="100px" >

        <el-form-item label="备注">
          <el-input type="textarea" rows="3" v-model="updateMemosForm.memos" >
          </el-input>
        </el-form-item>

      </el-form>
      <div slot="footer" class="dialog-footer">
        <el-button size="small" @click="dialogUpdateMemosFormVisible = false">取 消</el-button>
        <el-button size="small" type="primary" @click="updateMemos()">保 存</el-button>
      </div>
    </el-dialog>

        <div class="ns-main">

            <div>
                <table class="table-class" id="ajax-orderlist">
                    <colgroup>
                        <col width="2%">
                        <col width="34%">
                        <col width="14%">
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
                            <th>订单金额</th>
                            <th>收货信息</th>
                            <th>买家</th>
                            <th>交易状态</th>
                            <th>配送方式</th>
                            <th>操作</th>
                        </tr>
                    </thead>
                    <tbody id="ajax-orderlist">
                        <tr>
                            <td rowspan="1"><i class="checkbox-common"><input id="153511783179241000" type="checkbox" value="501" name="sub"></i></td>
                            <td>
                                <div style="font-size: 12px;color: #126AE4;margin-bottom:5px;"><span>订单编号：2018082421370001</span>&nbsp;<span>下单时间：2018-08-24 21:37:11</span></div>
                                <div class="product-img"><img src="/upload/goods/20180718/faf7a70e656bf2dadea2e1e6ceff2f714.jpg"></div>
                                <div class="product-infor"><a href="http://b2c.niuteam.cn/goods/goodsinfo?goodsid=150" target="_blank" style="color:#333;">TV1233213</a>
                                    <p class="specification" style="margin-bottom: 0px;"><span style="color:#8e8c8c;font-size:12px;">5.0 </span></p>
                                </div>
                            </td>
                            <td>
                                <div class="cell" style="display: inline-block;"><span>0.08元</span></div>
                                <div class="cell" style="display: inline-block;float:right;">1件</div>
                            </td>
                            <td rowspan="1" style="text-align:center">
                                <div class="cell"><b class="netprice" style="color: #FF6600;font-size: 14px;font-weight: normal;">0.00</b><br><span class="expressfee">(含配送费:0.00元)</span><br><span class="expressfee">积分兑换</span></div>
                            </td>
                            <td rowspan="1" style="text-align:center">
                                <div style="text-align:left;"><span class="expressfee">1</span><br><span class="expressfee">13333333333</span><br><span class="expressfee">台湾省&nbsp;台湾省&nbsp;台北&nbsp;2</span></div>
                            </td>
                            <td rowspan="1" style="text-align:center">
                                <div class="cell">nicemb<br><i class="fa fa-television" style="color:#666;"><i></i></i>
                                </div>
                            </td>
                            <td rowspan="1">
                                <div class="business-status" style="text-align:center">待发货<br></div>
                            </td>
                            <td rowspan="1">
                                <div class="business-status" style="text-align:center">物流配送<br></div>
                            </td>
                            <td rowspan="1" style="text-align:center;">
                              <a style="display:block;margin-bottom:5px;" href="/order/orderdetail?order_id=501">订单详情</a>
                              <a style="display:block;margin-bottom:5px;color:green" href="javascript:operation('delivery',501)">发货</a>
                              <a style="display:block;margin-bottom:5px;color:#666666" href="javascript:operation('seller_memo',501)">备注</a>
                              <a style="display:block;margin-bottom:5px;color:#51A351" href="javascript:operation('update_address',501)">修改地址</a></td>
                        </tr>
                        <tr style="height:10px;">
                            <td style="border-bottom:solid #E1E6F0;border-width:0 0 1px 0;" colspan="10"></td>
                        </tr>
                        <tr>
                            <td rowspan="1"><i class="checkbox-common"><input id="153507958148351000" type="checkbox" value="498" name="sub"></i></td>
                            <td>
                                <div style="font-size: 12px;color: #126AE4;margin-bottom:5px;"><span>订单编号：2018082410590001</span>&nbsp;<span>下单时间：2018-08-24 10:59:41</span></div>
                                <div class="product-img"><img src="/upload/goods/1499339583754.jpg"></div>
                                <div class="product-infor"><a href="http://b2c.niuteam.cn/goods/goodsinfo?goodsid=31" target="_blank" style="color:#333;">蓝斯顿 智能楼宇对讲系统设备直按小高层刷卡门禁门铃套装高清</a></div>
                            </td>
                            <td>
                                <div class="cell" style="display: inline-block;"><span>388.00元</span></div>
                                <div class="cell" style="display: inline-block;float:right;">1件</div>
                            </td>
                            <td rowspan="1" style="text-align:center">
                                <div class="cell"><b class="netprice" style="color: #FF6600;font-size: 14px;font-weight: normal;">388.00</b><br><span class="expressfee">(含配送费:0.00元)</span><br><span class="expressfee">在线支付</span></div>
                            </td>
                            <td rowspan="1" style="text-align:center">
                                <div style="text-align:left;"><span class="expressfee">shshhs</span><br><span class="expressfee">13999998888</span><br><span class="expressfee">海南省&nbsp;海口市&nbsp;琼山区&nbsp;sjjssj</span></div>
                            </td>
                            <td rowspan="1" style="text-align:center">
                                <div class="cell">123456<br><i class="fa fa-television" style="color:#666;"><i></i></i>
                                </div>
                            </td>
                            <td rowspan="1">
                                <div class="business-status" style="text-align:center">已关闭<br></div>
                            </td>
                            <td rowspan="1">
                                <div class="business-status" style="text-align:center">物流配送<br></div>
                            </td>
                            <td rowspan="1" style="text-align:center;"><a style="display:block;margin-bottom:5px;" href="/order/orderdetail?order_id=498">订单详情</a><a style="display:block;margin-bottom:5px;color:#666666" href="javascript:operation('seller_memo',498)">备注</a>
                                <a
                                    style="display:block;margin-bottom:5px;color:#ff0000" href="javascript:operation('delete_order',498)">删除订单</a>
                            </td>
                        </tr>
                        <tr style="height:10px;">
                            <td style="border-bottom:solid #E1E6F0;border-width:0 0 1px 0;" colspan="10"></td>
                        </tr>
                        <tr>
                            <td rowspan="1"><i class="checkbox-common"><input id="153507893765281000" type="checkbox" value="497" name="sub"></i></td>
                            <td>
                                <div style="font-size: 12px;color: #126AE4;margin-bottom:5px;"><span>订单编号：2018082410480001</span>&nbsp;<span>下单时间：2018-08-24 10:48:57</span></div>
                                <div class="product-img"><img src="/upload/goods/14993421471174.jpg"></div>
                                <div class="product-infor"><a href="http://b2c.niuteam.cn/goods/goodsinfo?goodsid=49" target="_blank" style="color:#333;">14.1英寸轻薄刀锋四核笔记本电脑手提固态商务学生游戏上网本分期</a></div>
                            </td>
                            <td>
                                <div class="cell" style="display: inline-block;"><span>56.00元</span></div>
                                <div class="cell" style="display: inline-block;float:right;">2件</div>
                            </td>
                            <td rowspan="1" style="text-align:center">
                                <div class="cell"><b class="netprice" style="color: #FF6600;font-size: 14px;font-weight: normal;">112.00</b><br><span class="expressfee">(含配送费:0.00元)</span><br><span class="expressfee">在线支付</span></div>
                            </td>
                            <td rowspan="1" style="text-align:center">
                                <div style="text-align:left;"><span class="expressfee">张小三</span><br><span class="expressfee">18516940875</span><br><span class="expressfee">广东省&nbsp;河源市&nbsp;紫金县&nbsp;xxx</span></div>
                            </td>
                            <td rowspan="1" style="text-align:center">
                                <div class="cell">zhangxiaosan<br><i class="fa fa-television" style="color:#666;"><i></i></i>
                                </div>
                            </td>
                            <td rowspan="1">
                                <div class="business-status" style="text-align:center">已关闭<br></div>
                            </td>
                            <td rowspan="1">
                                <div class="business-status" style="text-align:center">物流配送<br></div>
                            </td>
                            <td rowspan="1" style="text-align:center;"><a style="display:block;margin-bottom:5px;" href="/order/orderdetail?order_id=497">订单详情</a><a style="display:block;margin-bottom:5px;color:#666666" href="javascript:operation('seller_memo',497)">备注</a>
                                <a
                                    style="display:block;margin-bottom:5px;color:#ff0000" href="javascript:operation('delete_order',497)">删除订单</a>
                            </td>
                        </tr>
                        <tr style="height:10px;">
                            <td style="border-bottom:solid #E1E6F0;border-width:0 0 1px 0;" colspan="10"></td>
                        </tr>
                        <tr>
                            <td rowspan="1"><i class="checkbox-common"><input id="153499539832621000" type="checkbox" value="496" name="sub"></i></td>
                            <td>
                                <div style="font-size: 12px;color: #126AE4;margin-bottom:5px;"><span>订单编号：2018082311270001</span>&nbsp;<span>下单时间：2018-08-23 11:27:56</span></div>
                                <div class="product-img"><img src="/upload/goods/20180621/33dd99ec699ecc94cbd7d5a9582155224.jpg"></div>
                                <div class="product-infor"><a href="http://b2c.niuteam.cn/goods/goodsinfo?goodsid=99" target="_blank" style="color:#333;">技师</a>
                                    <p class="specification" style="margin-bottom: 0px;"><span style="color:#8e8c8c;font-size:12px;">计划 3天一次 1 1分钟 </span></p>
                                </div>
                            </td>
                            <td>
                                <div class="cell" style="display: inline-block;"><span>2.30元</span></div>
                                <div class="cell" style="display: inline-block;float:right;">4件</div>
                            </td>
                            <td rowspan="1" style="text-align:center">
                                <div class="cell"><b class="netprice" style="color: #FF6600;font-size: 14px;font-weight: normal;">9.20</b><br><span class="expressfee">(含配送费:0.00元)</span><br><span class="expressfee">线下支付</span></div>
                            </td>
                            <td rowspan="1" style="text-align:center">
                                <div style="text-align:left;"><span class="expressfee">于河</span><br><span class="expressfee">15910776603</span><br><span class="expressfee">台湾省&nbsp;台湾省&nbsp;台北&nbsp;1</span></div>
                            </td>
                            <td rowspan="1" style="text-align:center">
                                <div class="cell">yuhe<br><i class="fa fa-television" style="color:#666;"><i></i></i>
                                </div>
                            </td>
                            <td rowspan="1">
                                <div class="business-status" style="text-align:center">已完成<br></div>
                            </td>
                            <td rowspan="1">
                                <div class="business-status" style="text-align:center">物流配送<br></div>
                            </td>
                            <td rowspan="1" style="text-align:center;"><a style="display:block;margin-bottom:5px;" href="/order/orderdetail?order_id=496">订单详情</a><a style="display:block;margin-bottom:5px;color:#666666" href="javascript:operation('seller_memo',496)">备注</a>
                                <a
                                    style="display:block;margin-bottom:5px;color:#666666" href="javascript:operation('logistics',496)">查看物流</a>
                            </td>
                        </tr>
                        <tr style="height:10px;">
                            <td style="border-bottom:solid #E1E6F0;border-width:0 0 1px 0;" colspan="10"></td>
                        </tr>
                        <tr>
                            <td rowspan="2"><i class="checkbox-common"><input id="153494435093621000" type="checkbox" value="494" name="sub"></i></td>
                            <td>
                                <div style="font-size: 12px;color: #126AE4;margin-bottom:5px;"><span>订单编号：2018082221250001</span>&nbsp;<span>下单时间：2018-08-22 21:25:50</span></div>
                                <div class="product-img"><img src="/upload/goods/20180606/f78763d028645bc1b4322e47b55c45fc4.jpg"></div>
                                <div class="product-infor"><a href="http://b2c.niuteam.cn/goods/goodsinfo?goodsid=75" target="_blank" style="color:#333;">美国Elta MD无油防晒霜 全身脸部清爽痘皮敏感肌隔离防晒乳 SPF45-副本</a>
                                    <p class="specification" style="margin-bottom: 0px;"><span style="color:#8e8c8c;font-size:12px;">11 </span></p>
                                </div>
                            </td>
                            <td>
                                <div class="cell" style="display: inline-block;"><span>100.00元</span></div>
                                <div class="cell" style="display: inline-block;float:right;">1件</div>
                            </td>
                            <td rowspan="2" style="text-align:center">
                                <div class="cell"><b class="netprice" style="color: #FF6600;font-size: 14px;font-weight: normal;">198.00</b><br><span class="expressfee">(含配送费:0.00元)</span><br><span class="expressfee">在线支付</span></div>
                            </td>
                            <td rowspan="2" style="text-align:center">
                                <div style="text-align:left;"><span class="expressfee">小徐</span><br><span class="expressfee">13076910220</span><br><span class="expressfee">广东省&nbsp;深圳市&nbsp;罗湖区&nbsp;test</span></div>
                            </td>
                            <td rowspan="2" style="text-align:center">
                                <div class="cell">xyf<br><i class="fa fa-mobile fa-2x" style="color:#666;"><i></i></i>
                                </div>
                            </td>
                            <td rowspan="2">
                                <div class="business-status" style="text-align:center">已关闭<br></div>
                            </td>
                            <td rowspan="2">
                                <div class="business-status" style="text-align:center">物流配送<br></div>
                            </td>
                            <td rowspan="2" style="text-align:center;"><a style="display:block;margin-bottom:5px;" href="/order/orderdetail?order_id=494">订单详情</a><a style="display:block;margin-bottom:5px;color:#666666" href="javascript:operation('seller_memo',494)">备注</a>
                                <a
                                    style="display:block;margin-bottom:5px;color:#ff0000" href="javascript:operation('delete_order',494)">删除订单</a>
                            </td>
                        </tr>
                        <tr calss="js-child-order">
                            <td colspan="1">
                                <div class="product-img"><img src="/upload/goods/1499339438694.jpg"></div>
                                <div class="product-infor"><a class="name" href="http://b2c.niuteam.cn/goods/goodsinfo?goodsid=30" target="_blank" style="color:#333;">浴霸智能开关 触摸86型卫生间风暖通用防水4四五合一5开开关面板</a></div>
                            </td>
                            <td style="border-left:0px solid #fff;">
                                <div class="cell" style="display: inline-block;"><span>108.00元</span></div>
                                <div class="cell" style="display: inline-block;float:right">1件</div>
                            </td>
                        </tr>
                        <tr style="height:10px;">
                            <td style="border-bottom:solid #E1E6F0;border-width:0 0 1px 0;" colspan="10"></td>
                        </tr>
                        <tr>
                            <td rowspan="1"><i class="checkbox-common"><input id="153491065237601000" type="checkbox" value="493" name="sub"></i></td>
                            <td>
                                <div style="font-size: 12px;color: #126AE4;margin-bottom:5px;"><span>订单编号：2018082212040001</span>&nbsp;<span>下单时间：2018-08-22 12:04:12</span></div>
                                <div class="product-img"><img src="/upload/goods/20180718/faf7a70e656bf2dadea2e1e6ceff2f714.jpg"></div>
                                <div class="product-infor"><a href="http://b2c.niuteam.cn/goods/goodsinfo?goodsid=152" target="_blank" style="color:#333;">TV1233213-副本</a>
                                    <p class="specification" style="margin-bottom: 0px;"><span style="color:#8e8c8c;font-size:12px;">5.0 </span></p>
                                </div>
                            </td>
                            <td>
                                <div class="cell" style="display: inline-block;"><span>8.00元</span></div>
                                <div class="cell" style="display: inline-block;float:right;">1件</div>
                            </td>
                            <td rowspan="1" style="text-align:center">
                                <div class="cell"><b class="netprice" style="color: #FF6600;font-size: 14px;font-weight: normal;">8.00</b><br><span class="expressfee">(含配送费:0.00元)</span><br><span class="expressfee">在线支付</span></div>
                            </td>
                            <td rowspan="1" style="text-align:center">
                                <div style="text-align:left;"><span class="expressfee">刘</span><br><span class="expressfee">15625862457</span><br><span class="expressfee">四川省&nbsp;广安市&nbsp;广安区&nbsp;爱与语言</span></div>
                            </td>
                            <td rowspan="1" style="text-align:center">
                                <div class="cell">lxj<br><i class="fa fa-television" style="color:#666;"><i></i></i>
                                </div>
                            </td>
                            <td rowspan="1">
                                <div class="business-status" style="text-align:center">已关闭<br></div>
                            </td>
                            <td rowspan="1">
                                <div class="business-status" style="text-align:center">物流配送<br></div>
                            </td>
                            <td rowspan="1" style="text-align:center;"><a style="display:block;margin-bottom:5px;" href="/order/orderdetail?order_id=493">订单详情</a><a style="display:block;margin-bottom:5px;color:#666666" href="javascript:operation('seller_memo',493)">备注</a>
                                <a
                                    style="display:block;margin-bottom:5px;color:#ff0000" href="javascript:operation('delete_order',493)">删除订单</a>
                            </td>
                        </tr>
                        <tr style="height:10px;">
                            <td style="border-bottom:solid #E1E6F0;border-width:0 0 1px 0;" colspan="10"></td>
                        </tr>
                        <tr>
                            <td rowspan="1"><i class="checkbox-common"><input id="153490294686961000" type="checkbox" value="492" name="sub"></i></td>
                            <td>
                                <div style="font-size: 12px;color: #126AE4;margin-bottom:5px;"><span>订单编号：2018082209550001</span>&nbsp;<span>下单时间：2018-08-22 09:55:46</span></div>
                                <div class="product-img"><img src="/upload/goods/20180606/b067908b43d62fd1d10dd3272515001c4.jpg"></div>
                                <div class="product-infor"><a href="http://b2c.niuteam.cn/goods/goodsinfo?goodsid=72" target="_blank" style="color:#333;">20180606【正宗三华李】+果实饱满 现摘现发+1份2斤装（±0.2）</a></div>
                            </td>
                            <td>
                                <div class="cell" style="display: inline-block;"><span>14.22元</span></div>
                                <div class="cell" style="display: inline-block;float:right;">2件</div>
                            </td>
                            <td rowspan="1" style="text-align:center">
                                <div class="cell"><b class="netprice" style="color: #FF6600;font-size: 14px;font-weight: normal;">28.44</b><br><span class="expressfee">(含配送费:0.00元)</span><br><span class="expressfee">在线支付</span></div>
                            </td>
                            <td rowspan="1" style="text-align:center">
                                <div style="text-align:left;"><span class="expressfee">xss</span><br><span class="expressfee">15067160000</span><br><span class="expressfee">广东省&nbsp;阳江市&nbsp;阳西县&nbsp;&amp;lt;script&amp;gt;alert(1)&amp;lt;/script&amp;gt;</span></div>
                            </td>
                            <td rowspan="1" style="text-align:center">
                                <div class="cell">admin<br><i class="fa fa-mobile fa-2x" style="color:#666;"><i></i></i>
                                </div>
                            </td>
                            <td rowspan="1">
                                <div class="business-status" style="text-align:center">已关闭<br></div>
                            </td>
                            <td rowspan="1">
                                <div class="business-status" style="text-align:center">物流配送<br></div>
                            </td>
                            <td rowspan="1" style="text-align:center;"><a style="display:block;margin-bottom:5px;" href="/order/orderdetail?order_id=492">订单详情</a><a style="display:block;margin-bottom:5px;color:#666666" href="javascript:operation('seller_memo',492)">备注</a>
                                <a
                                    style="display:block;margin-bottom:5px;color:#ff0000" href="javascript:operation('delete_order',492)">删除订单</a>
                            </td>
                        </tr>
                        <tr style="height:10px;">
                            <td style="border-bottom:solid #E1E6F0;border-width:0 0 1px 0;" colspan="10"></td>
                        </tr>
                        <tr>
                            <td rowspan="1"><i class="checkbox-common"><input id="153485695547641000" type="checkbox" value="491" name="sub"></i></td>
                            <td>
                                <div style="font-size: 12px;color: #126AE4;margin-bottom:5px;"><span>订单编号：2018082121090001</span>&nbsp;<span>下单时间：2018-08-21 21:09:15</span></div>
                                <div class="product-img"><img src="/upload/goods/20180609/8fae147e6438e98450112f0a6c39022f4.jpg"></div>
                                <div class="product-infor"><a href="http://b2c.niuteam.cn/goods/goodsinfo?goodsid=77" target="_blank" style="color:#333;">212313132</a>
                                    <p class="specification" style="margin-bottom: 0px;"><span style="color:#8e8c8c;font-size:12px;">玫瑰金 </span></p>
                                    <p class="specification"><span style="color:#8e8c8c;font-size:12px;">编码&nbsp;&nbsp;5</span></p>
                                </div>
                            </td>
                            <td>
                                <div class="cell" style="display: inline-block;"><span>5.00元</span></div>
                                <div class="cell" style="display: inline-block;float:right;">5件</div>
                            </td>
                            <td rowspan="1" style="text-align:center">
                                <div class="cell"><b class="netprice" style="color: #FF6600;font-size: 14px;font-weight: normal;">15.00</b><br><span class="expressfee">(含配送费:0.00元)</span><br><span class="expressfee">余额支付</span></div>
                            </td>
                            <td rowspan="1" style="text-align:center">
                                <div style="text-align:left;"><span class="expressfee">爱仕达奥所</span><br><span class="expressfee">13267033002</span><br><span class="expressfee">广东省&nbsp;汕头市&nbsp;潮阳区&nbsp;奥术大师大啊</span></div>
                            </td>
                            <td rowspan="1" style="text-align:center">
                                <div class="cell">1218853252<br><i class="fa fa-television" style="color:#666;"><i></i></i>
                                </div>
                            </td>
                            <td rowspan="1">
                                <div class="business-status" style="text-align:center">已完成<br></div>
                            </td>
                            <td rowspan="1">
                                <div class="business-status" style="text-align:center">物流配送<br></div>
                            </td>
                            <td rowspan="1" style="text-align:center;"><a style="display:block;margin-bottom:5px;" href="/order/orderdetail?order_id=491">订单详情</a><a style="display:block;margin-bottom:5px;color:#666666" href="javascript:operation('seller_memo',491)">备注</a>
                                <a
                                    style="display:block;margin-bottom:5px;color:#666666" href="javascript:operation('logistics',491)">查看物流</a>
                            </td>
                        </tr>
                        <tr>
                            <td colspan="10" class="seller_memo">卖家备注：22</td>
                        </tr>
                        <tr style="height:10px;">
                            <td style="border-bottom:solid #E1E6F0;border-width:0 0 1px 0;" colspan="10"></td>
                        </tr>
                        <tr>
                            <td rowspan="2"><i class="checkbox-common"><input id="153484140168321000" type="checkbox" value="490" name="sub"></i></td>
                            <td>
                                <div style="font-size: 12px;color: #126AE4;margin-bottom:5px;"><span>订单编号：2018082116500001</span>&nbsp;<span>下单时间：2018-08-21 16:50:01</span></div>
                                <div class="product-img"><img src="/upload/goods/20180606/b067908b43d62fd1d10dd3272515001c4.jpg"></div>
                                <div class="product-infor"><a href="http://b2c.niuteam.cn/goods/goodsinfo?goodsid=72" target="_blank" style="color:#333;">20180606【正宗三华李】+果实饱满 现摘现发+1份2斤装（±0.2）</a></div>
                            </td>
                            <td>
                                <div class="cell" style="display: inline-block;"><span>14.22元</span></div>
                                <div class="cell" style="display: inline-block;float:right;">1件</div>
                            </td>
                            <td rowspan="2" style="text-align:center">
                                <div class="cell"><b class="netprice" style="color: #FF6600;font-size: 14px;font-weight: normal;">9014.22</b><br><span class="expressfee">(含配送费:0.00元)</span><br><span class="expressfee">在线支付</span></div>
                            </td>
                            <td rowspan="2" style="text-align:center">
                                <div style="text-align:left;"><span class="expressfee">xss</span><br><span class="expressfee">15067160000</span><br><span class="expressfee">广东省&nbsp;阳江市&nbsp;阳西县&nbsp;&amp;lt;script&amp;gt;alert(1)&amp;lt;/script&amp;gt;</span></div>
                            </td>
                            <td rowspan="2" style="text-align:center">
                                <div class="cell">admin<br><i class="fa fa-mobile fa-2x" style="color:#666;"><i></i></i>
                                </div>
                            </td>
                            <td rowspan="2">
                                <div class="business-status" style="text-align:center">已关闭<br></div>
                            </td>
                            <td rowspan="2">
                                <div class="business-status" style="text-align:center">物流配送<br></div>
                            </td>
                            <td rowspan="2" style="text-align:center;"><a style="display:block;margin-bottom:5px;" href="/order/orderdetail?order_id=490">订单详情</a><a style="display:block;margin-bottom:5px;color:#666666" href="javascript:operation('seller_memo',490)">备注</a>
                                <a
                                    style="display:block;margin-bottom:5px;color:#ff0000" href="javascript:operation('delete_order',490)">删除订单</a>
                            </td>
                        </tr>
                        <tr calss="js-child-order">
                            <td colspan="1">
                                <div class="product-img"><img src="/upload/goods/20180625/908c9f2b78566462059c81560e5dede94.jpg"></div>
                                <div class="product-infor"><a class="name" href="http://b2c.niuteam.cn/goods/goodsinfo?goodsid=114" target="_blank" style="color:#333;">让人特然</a></div>
                            </td>
                            <td style="border-left:0px solid #fff;">
                                <div class="cell" style="display: inline-block;"><span>9000.00元</span></div>
                                <div class="cell" style="display: inline-block;float:right">1件</div>
                            </td>
                        </tr>
                        <tr>
                            <td colspan="10" class="seller_memo">卖家备注：sssskkkkk</td>
                        </tr>
                        <tr style="height:10px;">
                            <td style="border-bottom:solid #E1E6F0;border-width:0 0 1px 0;" colspan="10"></td>
                        </tr>
                        <tr>
                            <td rowspan="1"><i class="checkbox-common"><input id="153475181415701000" type="checkbox" value="489" name="sub"></i></td>
                            <td>
                                <div style="font-size: 12px;color: #126AE4;margin-bottom:5px;"><span>订单编号：2018082015560001</span>&nbsp;<span>下单时间：2018-08-20 15:56:44</span></div>
                                <div class="product-img"><img src="/upload/common/182dd78a77a2f295ff76237dcf7524e94.asp"></div>
                                <div class="product-infor"><a href="http://b2c.niuteam.cn/goods/goodsinfo?goodsid=186" target="_blank" style="color:#333;">11111112</a></div>
                            </td>
                            <td>
                                <div class="cell" style="display: inline-block;"><span>810.00元</span></div>
                                <div class="cell" style="display: inline-block;float:right;">1件</div>
                            </td>
                            <td rowspan="1" style="text-align:center">
                                <div class="cell"><b class="netprice" style="color: #FF6600;font-size: 14px;font-weight: normal;">810.00</b><br><span class="expressfee">(含配送费:0.00元)</span><br><span class="expressfee">线下支付</span></div>
                            </td>
                            <td rowspan="1" style="text-align:center">
                                <div style="text-align:left;"><span class="expressfee">123</span><br><span class="expressfee">15878907890</span><br><span class="expressfee">海南省&nbsp;海口市&nbsp;秀英区&nbsp;123</span></div>
                            </td>
                            <td rowspan="1" style="text-align:center">
                                <div class="cell">admin<br><i class="fa fa-television" style="color:#666;"><i></i></i>
                                </div>
                            </td>
                            <td rowspan="1">
                                <div class="business-status" style="text-align:center">已完成<br></div>
                            </td>
                            <td rowspan="1">
                                <div class="business-status" style="text-align:center">物流配送<br></div>
                            </td>
                            <td rowspan="1" style="text-align:center;"><a style="display:block;margin-bottom:5px;" href="/order/orderdetail?order_id=489">订单详情</a><a style="display:block;margin-bottom:5px;color:#666666" href="javascript:operation('seller_memo',489)">备注</a>
                                <a
                                    style="display:block;margin-bottom:5px;color:#666666" href="javascript:operation('logistics',489)">查看物流</a>
                            </td>
                        </tr>
                        <tr style="height:10px;">
                            <td style="border-bottom:solid #E1E6F0;border-width:0 0 1px 0;" colspan="10"></td>
                        </tr>
                        <tr>
                            <td rowspan="1"><i class="checkbox-common"><input id="153474944519901000" type="checkbox" value="488" name="sub"></i></td>
                            <td>
                                <div style="font-size: 12px;color: #126AE4;margin-bottom:5px;"><span>订单编号：2018082015170001</span>&nbsp;<span>下单时间：2018-08-20 15:17:25</span></div>
                                <div class="product-img"><img src="/upload/goods/20180606/86aa78290cda8fdf59dca5694caa32284.jpg"></div>
                                <div class="product-infor"><a href="http://b2c.niuteam.cn/goods/goodsinfo?goodsid=73" target="_blank" style="color:#333;">宝格丽（BVLGARI） 宝格丽大吉岭茶男士淡香水浓情版 100ml</a></div>
                            </td>
                            <td>
                                <div class="cell" style="display: inline-block;"><span>489.78元</span></div>
                                <div class="cell" style="display: inline-block;float:right;">1件</div>
                            </td>
                            <td rowspan="1" style="text-align:center">
                                <div class="cell"><b class="netprice" style="color: #FF6600;font-size: 14px;font-weight: normal;">489.78</b><br><span class="expressfee">(含配送费:0.00元)</span><br><span class="expressfee">在线支付</span></div>
                            </td>
                            <td rowspan="1" style="text-align:center">
                                <div style="text-align:left;"><span class="expressfee">123</span><br><span class="expressfee">15878907890</span><br><span class="expressfee">海南省&nbsp;海口市&nbsp;秀英区&nbsp;123</span></div>
                            </td>
                            <td rowspan="1" style="text-align:center">
                                <div class="cell">admin<br><i class="fa fa-television" style="color:#666;"><i></i></i>
                                </div>
                            </td>
                            <td rowspan="1">
                                <div class="business-status" style="text-align:center">已关闭<br></div>
                            </td>
                            <td rowspan="1">
                                <div class="business-status" style="text-align:center">物流配送<br></div>
                            </td>
                            <td rowspan="1" style="text-align:center;"><a style="display:block;margin-bottom:5px;" href="/order/orderdetail?order_id=488">订单详情</a><a style="display:block;margin-bottom:5px;color:#666666" href="javascript:operation('seller_memo',488)">备注</a>
                                <a
                                    style="display:block;margin-bottom:5px;color:#ff0000" href="javascript:operation('delete_order',488)">删除订单</a>
                            </td>
                        </tr>
                        <tr style="height:10px;">
                            <td style="border-bottom:solid #E1E6F0;border-width:0 0 1px 0;" colspan="10"></td>
                        </tr>
                        <tr>
                            <td rowspan="1"><i class="checkbox-common"><input id="153472397572781000" type="checkbox" value="487" name="sub"></i></td>
                            <td>
                                <div style="font-size: 12px;color: #126AE4;margin-bottom:5px;"><span>订单编号：2018082008120001</span>&nbsp;<span>下单时间：2018-08-20 08:12:55</span></div>
                                <div class="product-img"><img src="/upload/goods/20180606/f78763d028645bc1b4322e47b55c45fc4.jpg"></div>
                                <div class="product-infor"><a href="http://b2c.niuteam.cn/goods/goodsinfo?goodsid=75" target="_blank" style="color:#333;">美国Elta MD无油防晒霜 全身脸部清爽痘皮敏感肌隔离防晒乳 SPF45-副本</a>
                                    <p class="specification" style="margin-bottom: 0px;"><span style="color:#8e8c8c;font-size:12px;">11 </span></p>
                                </div>
                            </td>
                            <td>
                                <div class="cell" style="display: inline-block;"><span>100.00元</span></div>
                                <div class="cell" style="display: inline-block;float:right;">1件</div>
                            </td>
                            <td rowspan="1" style="text-align:center">
                                <div class="cell"><b class="netprice" style="color: #FF6600;font-size: 14px;font-weight: normal;">100.00</b><br><span class="expressfee">(含配送费:0.00元)</span><br><span class="expressfee">在线支付</span></div>
                            </td>
                            <td rowspan="1" style="text-align:center">
                                <div style="text-align:left;"><span class="expressfee">1</span><br><span class="expressfee">13612121212</span><br><span class="expressfee">青海省&nbsp;海东地区&nbsp;平安县&nbsp;123123123</span></div>
                            </td>
                            <td rowspan="1" style="text-align:center">
                                <div class="cell">chenhao0427<br><i class="fa fa-television" style="color:#666;"><i></i></i>
                                </div>
                            </td>
                            <td rowspan="1">
                                <div class="business-status" style="text-align:center">已关闭<br></div>
                            </td>
                            <td rowspan="1">
                                <div class="business-status" style="text-align:center">物流配送<br></div>
                            </td>
                            <td rowspan="1" style="text-align:center;"><a style="display:block;margin-bottom:5px;" href="/order/orderdetail?order_id=487">订单详情</a><a style="display:block;margin-bottom:5px;color:#666666" href="javascript:operation('seller_memo',487)">备注</a>
                                <a
                                    style="display:block;margin-bottom:5px;color:#ff0000" href="javascript:operation('delete_order',487)">删除订单</a>
                            </td>
                        </tr>
                        <tr style="height:10px;">
                            <td style="border-bottom:solid #E1E6F0;border-width:0 0 1px 0;" colspan="10"></td>
                        </tr>
                        <tr>
                            <td rowspan="1"><i class="checkbox-common"><input id="153456078418791000" type="checkbox" value="486" name="sub"></i></td>
                            <td>
                                <div style="font-size: 12px;color: #126AE4;margin-bottom:5px;"><span>订单编号：2018081810530001</span>&nbsp;<span>下单时间：2018-08-18 10:53:04</span></div>
                                <div class="product-img"><img src="/upload/goods/20180606/f78763d028645bc1b4322e47b55c45fc4.jpg"></div>
                                <div class="product-infor"><a href="http://b2c.niuteam.cn/goods/goodsinfo?goodsid=75" target="_blank" style="color:#333;">美国Elta MD无油防晒霜 全身脸部清爽痘皮敏感肌隔离防晒乳 SPF45-副本</a>
                                    <p class="specification" style="margin-bottom: 0px;"><span style="color:#8e8c8c;font-size:12px;">22 </span></p>
                                </div>
                            </td>
                            <td>
                                <div class="cell" style="display: inline-block;"><span>200.00元</span></div>
                                <div class="cell" style="display: inline-block;float:right;">1件</div>
                            </td>
                            <td rowspan="1" style="text-align:center">
                                <div class="cell"><b class="netprice" style="color: #FF6600;font-size: 14px;font-weight: normal;">190.00</b><br><span class="expressfee">(含配送费:0.00元)</span><br><span class="expressfee">余额支付</span></div>
                            </td>
                            <td rowspan="1" style="text-align:center">
                                <div style="text-align:left;"><span class="expressfee">等人方</span><br><span class="expressfee">13131313131</span><br><span class="expressfee">广东省&nbsp;阳江市&nbsp;阳西县&nbsp;双方各是的法规单方事故</span></div>
                            </td>
                            <td rowspan="1" style="text-align:center">
                                <div class="cell">3452101<br><i class="fa fa-television" style="color:#666;"><i></i></i>
                                </div>
                            </td>
                            <td rowspan="1">
                                <div class="business-status" style="text-align:center">已完成<br></div>
                            </td>
                            <td rowspan="1">
                                <div class="business-status" style="text-align:center">物流配送<br></div>
                            </td>
                            <td rowspan="1" style="text-align:center;"><a style="display:block;margin-bottom:5px;" href="/order/orderdetail?order_id=486">订单详情</a><a style="display:block;margin-bottom:5px;color:#666666" href="javascript:operation('seller_memo',486)">备注</a>
                                <a
                                    style="display:block;margin-bottom:5px;color:#666666" href="javascript:operation('logistics',486)">查看物流</a>
                            </td>
                        </tr>
                        <tr style="height:10px;">
                            <td style="border-bottom:solid #E1E6F0;border-width:0 0 1px 0;" colspan="10"></td>
                        </tr>
                        <tr>
                            <td rowspan="1"><i class="checkbox-common"><input id="153449557171121000" type="checkbox" value="484" name="sub"></i></td>
                            <td>
                                <div style="font-size: 12px;color: #126AE4;margin-bottom:5px;"><span>订单编号：2018081716460001</span>&nbsp;<span>下单时间：2018-08-17 16:46:11</span></div>
                                <div class="product-img"><img src="/upload/goods/1499339583754.jpg"></div>
                                <div class="product-infor"><a href="http://b2c.niuteam.cn/goods/goodsinfo?goodsid=31" target="_blank" style="color:#333;">蓝斯顿 智能楼宇对讲系统设备直按小高层刷卡门禁门铃套装高清</a></div>
                            </td>
                            <td>
                                <div class="cell" style="display: inline-block;"><span>100.00元</span></div>
                                <div class="cell" style="display: inline-block;float:right;">1件</div>
                            </td>
                            <td rowspan="1" style="text-align:center">
                                <div class="cell"><b class="netprice" style="color: #FF6600;font-size: 14px;font-weight: normal;">100.00</b><br><span class="expressfee">(含配送费:0.00元)</span><br><span class="expressfee">在线支付</span></div>
                            </td>
                            <td rowspan="1" style="text-align:center">
                                <div style="text-align:left;"><span class="expressfee">测试</span><br><span class="expressfee">13965425983</span><br><span class="expressfee">北京市&nbsp;北京市&nbsp;东城区&nbsp;1111122</span></div>
                            </td>
                            <td rowspan="1" style="text-align:center">
                                <div class="cell">niushop1<br><i class="fa fa-television" style="color:#666;"><i></i></i>
                                </div>
                            </td>
                            <td rowspan="1">
                                <div class="business-status" style="text-align:center">已关闭<br></div>
                            </td>
                            <td rowspan="1">
                                <div class="business-status" style="text-align:center">物流配送<br></div>
                            </td>
                            <td rowspan="1" style="text-align:center;"><a style="display:block;margin-bottom:5px;" href="/order/orderdetail?order_id=484">订单详情</a><a style="display:block;margin-bottom:5px;color:#666666" href="javascript:operation('seller_memo',484)">备注</a>
                                <a
                                    style="display:block;margin-bottom:5px;color:#ff0000" href="javascript:operation('delete_order',484)">删除订单</a>
                            </td>
                        </tr>
                    </tbody>
                </table>
            </div>

            <div id="orderAction">

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
                                    </colgroup>
                                    <colgroup>
                                    </colgroup>
                                    <tbody></tbody>
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
                                    </colgroup>
                                    <colgroup>
                                    </colgroup>
                                    <tbody></tbody>
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
                                    <colgroup></colgroup>
                                    <colgroup>
                                    </colgroup>
                                    <tbody></tbody>
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
                                                    <option value="34">台湾省</option>
                                                    <option value="19">广东省</option>

                                                </select>
                                            </div>
                                            <div class="selectric">
                                                <span class="selectric-label">请选择省</span><button class="selectric-button">▾</button>
                                            </div>
                                        <div class="selectric-items" tabindex="-1">
                                            <div class="selectric-scroll">
                                                <ul>
                                                    <li data-index="0" class="selected" title="请选择省">请选择省</li>
                                                    <li data-index="1" class="" title="台湾省">台湾省</li>
                                                    <li data-index="2" class="" title="广东省">广东省</li>
                                                    <li data-index="3" class="" title="广西壮族自治区">广西壮族自治区</li>
                                                    <li data-index="4" class="" title="海南省">海南省</li>
                                                    <li data-index="5" class="" title="重庆市">重庆市</li>
                                                    <li data-index="6" class="" title="四川省">四川省</li>
                                                    <li data-index="7" class="" title="贵州省">贵州省</li>
                                                    <li data-index="8" class="" title="云南省">云南省</li>
                                                    <li data-index="9" class="" title="西藏自治区">西藏自治区</li>
                                                    <li data-index="10" class="" title="陕西省">陕西省</li>
                                                    <li data-index="11" class="" title="甘肃省">甘肃省</li>
                                                    <li data-index="12" class="" title="青海省">青海省</li>
                                                    <li data-index="13" class="" title="宁夏回族自治区">宁夏回族自治区</li>
                                                    <li data-index="14" class="" title="新疆维吾尔自治区">新疆维吾尔自治区</li>
                                                    <li data-index="15" class="" title="香港特别行政区">香港特别行政区</li>
                                                    <li data-index="16" class="" title="澳门特别行政区">澳门特别行政区</li>
                                                    <li data-index="17" class="" title="湖南省">湖南省</li>
                                                    <li data-index="18" class="" title="湖北省">湖北省</li>
                                                    <li data-index="19" class="" title="天津市">天津市</li>
                                                    <li data-index="20" class="" title="河北省">河北省</li>
                                                    <li data-index="21" class="" title="山西省">山西省</li>
                                                    <li data-index="22" class="" title="内蒙古自治区">内蒙古自治区</li>
                                                    <li data-index="23" class="" title="辽宁省">辽宁省</li>
                                                    <li data-index="24" class="" title="吉林省">吉林省</li>
                                                    <li data-index="25" class="" title="黑龙江省">黑龙江省</li>
                                                    <li data-index="26" class="" title="上海市">上海市</li>
                                                    <li data-index="27" class="" title="江苏省">江苏省</li>
                                                    <li data-index="28" class="" title="浙江省">浙江省</li>
                                                    <li data-index="29" class="" title="安徽省">安徽省</li>
                                                    <li data-index="30" class="" title="福建省">福建省</li>
                                                    <li data-index="31" class="" title="江西省">江西省</li>
                                                    <li data-index="32" class="" title="山东省">山东省</li>
                                                    <li data-index="33" class="" title="河南省">河南省</li>
                                                    <li data-index="34" class="last" title="北京市">北京市</li>
                                                </ul>
                                            </div>
                                        </div>
                                        <input class="selectric-input" tabindex="0"/>
                                        </div>
                                    </div>
                                            <select name="city" id="seleAreaThird" onchange="getSelCity();" class="select-common harf">

                                        <option value="-1">请选择市</option>
                                            </select>
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

            <!-- 打印发货单 -->
            <div id="prite-send" class="modal hide fade" data-backdrop="static" role="dialog" tabindex="-1" aria-labelledby="myModalLabel" aria-hidden="true" style="margin-left:-536px;border-radius: 0;">
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
                                <tbody>
                                    <tr style="background: #F2F6FC;">
                                        <th>订单编号</th>
                                        <th>商品名称</th>
                                        <th>快递公司</th>
                                        <th>运单号</th>
                                    </tr>
                                </tbody>
                            </table>
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
            </div>

            <!-- 打印出库单 -->
            <div id="print-billOfSales" class="modal hide fade" role="dialog" tabindex="-1" aria-labelledby="myModalLabel" aria-hidden="true" style="margin-left:-536px;border-radius: 0;" data-backdrop="static">
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
                                <tbody>
                                    <tr style="background: #F2F6FC;border-bottom:1px solid #ddd">
                                        <th>商品名称</th>
                                        <th>sku名称</th>
                                        <th style="text-align: center;">出库量</th>
                                        <th style="text-align: center;">库存量</th>
                                        <th>商品编码</th>
                                        <th style="text-align: center;">订单号</th>
                                    </tr>
                                </tbody>
                            </table>
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
            </div>

            <!-- 打印快递单-->
            <div id="prite-send-express" class="modal hide fade" role="dialog" tabindex="-1" aria-labelledby="myModalLabel" aria-hidden="true" style="margin-left:-536px;border-radius: 0;" data-backdrop="static">
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
                                <tbody>
                                    <tr style="background: #F2F6FC;">
                                        <th style="width: 17.5%">订单编号</th>
                                        <th style="width: 28%">商品名称</th>
                                        <th style="width: 6%">已发货</th>
                                        <th style="width: 6%">已打印</th>
                                        <th style="width: 15%">快递公司</th>
                                        <th style="width: 18%">运单号</th>
                                    </tr>
                                </tbody>
                            </table>
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
            </div>

            <!-- 批量发货 -->
            <div id="not-shipped-order-list" role="dialog" class="modal hide fade" tabindex="-1" aria-labelledby="myModalLabel" aria-hidden="true" data-backdrop="static" style="margin-left:-536px;border-radius: 0;">
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
                                <tbody>
                                    <tr style="background: #F2F6FC;">
                                        <th style="width: 17.5%">订单编号</th>
                                        <th style="width: 32.5%">商品名称</th>
                                        <th style="width: 15%">快递公司</th>
                                        <th style="width: 18%">运单号</th>
                                    </tr>
                                </tbody>
                            </table>
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
            </div>

            <div class="modal fade hide" id="confirmRefund" tabindex="-1" aria-labelledby="确认退款" aria-hidden="true" data-backdrop="static" style="width: 650px; overflow: overlay;top:50%;">
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
                        <div class="modal-footer">
                            <!-- 温馨提示 -->
                            <div class="refunds-block js-not-configured-prompt"></div>
                            <input type="hidden" id="confirm_order_id">
                            <input type="hidden" id="confirm_order_goods_id">
                            <input type="hidden" id="refund_require_money">
                            <button class="btn-common js-confirm-refund-ok disabled">确认</button>
                            <button class="btn" data-dismiss="modal" aria-hidden="true">取消</button>
                        </div>
                    </div>
                </div>
            </div>

            <div class="modal hide fade" tabindex="-1" aria-labelledby="退款操作提醒" aria-hidden="true" data-backdrop="static" id="refundOperationReminder" style="width:600px;top: 50%;">
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
                        <div class="modal-footer">
                            <!-- 温馨提示 -->
                            <button class="btn-common disabled" id="countdown_refund_confirm">确定</button>
                            <button class="btn" data-dismiss="modal" aria-hidden="true">取消</button>
                        </div>
                    </div>
                </div>
            </div>

            <div class="modal hide fade" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true" id="refuseRefund" style="width:300px;">
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
            </div>

            <div class="modal hide fade" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true" id="confirm_receipt" style="width:400px;">
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
            </div>
        </div>
  </section>
</template>

<script>
require('@/assets/style/table.scss')
require('@/assets/style/order/list.scss')

export default {
  name: 'orderList',
  data () {
    return {
      dialogUpdateMemosFormVisible: false,
      moreQueryPopoverVisible: false,
      queryForm: {},
      updateMemosForm: {},
      orderList: [{
        orderNo: '2018082421370001',
        createDate: '2018-08-24 21:37:11',
        goodsList: [{
          name: 'TV1233213',
          number: '1',
          price: '0.08'
        }],
        payPrices: '0.00',
        paymentType: '物流配送',
        receiver: '1',
        receiverMobile: '13333333333',
        receiverAddress: '台湾省&nbsp;台湾省&nbsp;台北&nbsp;2',
        username: 'nicemb',
        order_from: 'https://open.weixin.qq.com/',
        status: 2
      }, {
        orderNo: '2018082410590001',
        createDate: '2018-08-24 10:59:41',
        goodsList: [{
          name: '蓝斯顿 智能楼宇对讲系统设备直按小高层刷卡门禁门铃套装高清',
          number: '1',
          price: '388.00'
        }],
        payPrices: '388.00',
        paymentType: '物流配送',
        receiver: 'shshhs',
        receiverMobile: '13999998888',
        receiverAddress: '海南省&nbsp;海口市&nbsp;琼山区&nbsp;sjjssj',
        username: '123456',
        order_from: 'https://open.weixin.qq.com/',
        status: 6
      }, {
        orderNo: '2018082410480001',
        createDate: '2018-08-24 10:48:57',
        goodsList: [{
          name: '14.1英寸轻薄刀锋四核笔记本电脑手提固态商务学生游戏上网本分期',
          number: '2',
          price: '56.00'
        }],
        payPrices: '112.00',
        paymentType: '物流配送',
        receiver: '张小三',
        receiverMobile: '18516940875',
        receiverAddress: '广东省&nbsp;河源市&nbsp;紫金县&nbsp;xxx',
        username: 'zhangxiaosan',
        order_from: 'https://open.weixin.qq.com/',
        status: 6
      }, {
        orderNo: '2018082311270001',
        createDate: '2018-08-23 11:27:56',
        goodsList: [{
          name: '技师',
          number: '4',
          price: '2.30'
        }],
        payPrices: '9.20',
        paymentType: '物流配送',
        receiver: '于河',
        receiverMobile: '15910776603',
        receiverAddress: '台湾省&nbsp;台湾省&nbsp;台北&nbsp;1',
        username: 'yuhe',
        order_from: 'https://open.weixin.qq.com/',
        status: 5
      }, {
        orderNo: '2018082221250001',
        createDate: '2018-08-22 21:25:50',
        goodsList: [{
          name: '美国Elta MD无油防晒霜 全身脸部清爽痘皮敏感肌隔离防晒乳 SPF45-副本',
          number: '1',
          price: '100.00'
        }],
        payPrices: '198.00',
        paymentType: '物流配送',
        receiver: '小徐',
        receiverMobile: '13076910220',
        receiverAddress: '广东省&nbsp;深圳市&nbsp;罗湖区&nbsp;test',
        username: 'xyf',
        order_from: 'https://open.weixin.qq.com/',
        status: 6
      }, {
        orderNo: '2018082212040001',
        createDate: '2018-08-22 12:04:12',
        goodsList: [{
          name: 'TV1233213-副本',
          number: '1',
          price: '8.00'
        }],
        payPrices: '8.00',
        paymentType: '物流配送',
        receiver: '刘',
        receiverMobile: '15625862457',
        receiverAddress: '四川省&nbsp;广安市&nbsp;广安区&nbsp;爱与语言',
        username: 'lxj',
        order_from: 'https://open.weixin.qq.com/',
        status: 6
      }, {
        orderNo: '2018082209550001',
        createDate: '2018-08-22 09:55:46',
        goodsList: [{
          name: '20180606【正宗三华李】+果实饱满 现摘现发+1份2斤装（±0.2）',
          number: '2',
          price: '14.22'
        }],
        payPrices: '28.44',
        paymentType: '物流配送',
        receiver: 'xss',
        receiverMobile: '15067160000',
        receiverAddress: '广东省&nbsp;阳江市&nbsp;阳西县&nbsp;&amp;lt;script&amp;gt;alert(1)&amp;lt;/script&amp;gt;',
        username: 'admin',
        order_from: 'https://open.weixin.qq.com/',
        status: 6
      }, {
        orderNo: '2018082121090001',
        createDate: '2018-08-21 21:09:15',
        goodsList: [{
          name: '212313132',
          number: '5',
          price: '5.00'
        }],
        payPrices: '15.00',
        paymentType: '物流配送',
        receiver: '爱仕达奥所',
        receiverMobile: '13267033002',
        receiverAddress: '广东省&nbsp;汕头市&nbsp;潮阳区&nbsp;奥术大师大啊',
        username: '1218853252',
        order_from: 'https://open.weixin.qq.com/',
        status: 5
      }, {
        orderNo: '2018082116500001',
        createDate: '2018-08-21 16:50:01',
        goodsList: [{
          name: '20180606【正宗三华李】+果实饱满 现摘现发+1份2斤装（±0.2）',
          number: '1',
          price: '14.22'
        }],
        payPrices: '9014.22',
        paymentType: '物流配送',
        receiver: 'xss',
        receiverMobile: '15067160000',
        receiverAddress: '广东省&nbsp;阳江市&nbsp;阳西县&nbsp;&amp;lt;script&amp;gt;alert(1)&amp;lt;/script&amp;gt;',
        username: 'admin',
        order_from: 'https://open.weixin.qq.com/',
        status: 6
      }, {
        orderNo: '2018082015560001',
        createDate: '2018-08-20 15:56:44',
        goodsList: [{
          name: '11111112',
          number: '1',
          price: '810.00'
        }],
        payPrices: '810.00',
        paymentType: '物流配送',
        receiver: '123',
        receiverMobile: '15878907890',
        receiverAddress: '海南省&nbsp;海口市&nbsp;秀英区&nbsp;123',
        username: 'admin',
        order_from: 'https://open.weixin.qq.com/',
        status: 5
      }, {
        orderNo: '2018082015170001',
        createDate: '2018-08-20 15:17:25',
        goodsList: [{
          name: '宝格丽（BVLGARI） 宝格丽大吉岭茶男士淡香水浓情版 100ml',
          number: '1',
          price: '489.78'
        }],
        payPrices: '489.78',
        paymentType: '物流配送',
        receiver: '123',
        receiverMobile: '15878907890',
        receiverAddress: '海南省&nbsp;海口市&nbsp;秀英区&nbsp;123',
        username: 'admin',
        order_from: 'https://open.weixin.qq.com/',
        status: 6
      }, {
        orderNo: '2018082008120001',
        createDate: '2018-08-20 08:12:55',
        goodsList: [{
          name: '美国Elta MD无油防晒霜 全身脸部清爽痘皮敏感肌隔离防晒乳 SPF45-副本',
          number: '1',
          price: '100.00'
        }],
        payPrices: '100.00',
        paymentType: '物流配送',
        receiver: '1',
        receiverMobile: '13612121212',
        receiverAddress: '青海省&nbsp;海东地区&nbsp;平安县&nbsp;123123123',
        username: 'chenhao0427',
        order_from: 'https://open.weixin.qq.com/',
        status: 6
      }, {
        orderNo: '2018081810530001',
        createDate: '2018-08-18 10:53:04',
        goodsList: [
          {
            name: '美国Elta MD无油防晒霜 全身脸部清爽痘皮敏感肌隔离防晒乳 SPF45-副本',
            number: '1',
            price: '200.00'
          }, {
            name: '浴霸智能开关 触摸86型卫生间风暖通用防水4四五合一5开开关面板',
            price: '108.00',
            number: '1'
          }
        ],
        payPrices: '190.00',
        paymentType: '物流配送',
        receiver: '等人方',
        receiverMobile: '13131313131',
        receiverAddress: '广东省&nbsp;阳江市&nbsp;阳西县&nbsp;双方各是的法规单方事故',
        username: '3452101',
        order_from: 'https://open.weixin.qq.com/',
        status: 5
      }, {
        orderNo: '2018081716460001',
        createDate: '2018-08-17 16:46:11',
        goodsList: [{
          name: '蓝斯顿 智能楼宇对讲系统设备直按小高层刷卡门禁门铃套装高清',
          number: '1',
          price: '100.00'
        }],
        payPrices: '100.00',
        paymentType: '物流配送',
        receiver: '测试',
        receiverMobile: '13965425983',
        receiverAddress: '北京市&nbsp;北京市&nbsp;东城区&nbsp;1111122',
        username: 'niushop1',
        order_from: 'https://open.weixin.qq.com/',
        status: 6
      }],
      datePickerOptions: {
        shortcuts: [{
          text: '最近一周',
          onClick (picker) {
            const end = new Date()
            const start = new Date()
            start.setTime(start.getTime() - 3600 * 1000 * 24 * 7)
            picker.$emit('pick', [start, end])
          }
        }, {
          text: '最近一个月',
          onClick (picker) {
            const end = new Date()
            const start = new Date()
            start.setTime(start.getTime() - 3600 * 1000 * 24 * 30)
            picker.$emit('pick', [start, end])
          }
        }, {
          text: '最近三个月',
          onClick (picker) {
            const end = new Date()
            const start = new Date()
            start.setTime(start.getTime() - 3600 * 1000 * 24 * 90)
            picker.$emit('pick', [start, end])
          }
        }]
      }
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
              console.log('duplicate', goods)
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
    updateMemos () {
      this.updateMemosForm.order.memos = this.updateMemosForm.memos
      this.dialogUpdateMemosFormVisible = false
    },
    showUpdateMemosDialog (order) {
      this.updateMemosForm.order = order
      this.updateMemosForm.memos = order.memos
      this.dialogUpdateMemosFormVisible = true
    },
    search () {

    },
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
          console.log('duplicate', row.duplicate)
          return {
            rowspan: 0,
            colspan: 0
          }
        } else if (row.multirow) {
          console.log('multirow', row.multirow)
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
