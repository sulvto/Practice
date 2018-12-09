<template>

  <section class="ns-base-section">
    <el-tabs v-model="activeName" @tab-click="handleClick">
      <el-tab-pane label="全部" name="first" />
      <el-tab-pane label="待付款" name="second" />
      <el-tab-pane label="待成团" name="third" />
      <el-tab-pane label="待发货" name="fourth" />
      <el-tab-pane label="已发货" name="first" />
      <el-tab-pane label="已收货" name="third" />
      <el-tab-pane label="已完成" name="fourth" />
      <el-tab-pane label="已关闭" name="first" />
      <el-tab-pane label="退款中" name="first" />
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
              end-placeholder="结束日期" />
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
        label="收货信息"
        width="120">
        <template slot-scope="scope">
          <div style="text-align:center">
            <div style="text-align:left;"><span class="expressfee">1</span><br><span class="expressfee">13333333333</span><br><span class="expressfee">台湾省&nbsp;台湾省&nbsp;台北&nbsp;2</span></div>
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
        label="操作"
        fixed="right"
        width="100">
        <template slot-scope="scope">
          <el-button size="mini" @click="handleEdit(scope.$index, scope.row)">订单详情</el-button>
          <br>
          <el-button v-if="scope.row.status === 3" size="mini" @click="showUpdateMemosDialog(scope.row)">提货</el-button>
          <el-button v-if="scope.row.status === 2" size="mini" @click="showUpdateMemosDialog(scope.row)">发货</el-button>

          <el-button size="mini" @click="showUpdateMemosDialog(scope.row)">备注</el-button>
          <br>
          <el-button v-if="scope.row.status === 2" size="mini" @click="showUpdateMemosDialog(scope.row)" >修改地址</el-button>
          <el-button v-if="scope.row.status === 7" size="mini" @click="showUpdateMemosDialog(scope.row)" >删除订单</el-button>
          <el-button v-if="scope.row.status === 6" size="mini" @click="showUpdateMemosDialog(scope.row)" >查看物流</el-button>
        </template>
      </el-table-column>
    </el-table>

    <div style="position:relative;margin:0;">
      <!-- 面包屑导航 -->
      <div class="breadcrumb-nav">
        <a href="index.html">大鵬系統</a>
        <i class="fa fa-angle-right" />
        <a href="/order/orderlist.html">订单</a>
        <i class="fa fa-angle-right" />
        <!-- 需要加跳转链接用这个：http://showfx.niuteam.cn/admin/tuangou/pintuanOrderList -->
        <a href="javascript:;" style="color:#999;">拼团订单</a>
      </div>
      <!-- 三级导航菜单 -->

      <nav class="ns-third-menu">
        <ul>
          <li class="selected" onclick="location.href='/tuangou/pintuanOrderList.html';">全部</li>
          <li onclick="location.href='/tuangou/pintuanOrderList.html?status=0';">待付款</li>
          <li onclick="location.href='/tuangou/pintuanOrderList.html?status=6';">待成团</li>
          <li onclick="location.href='/tuangou/pintuanOrderList.html?status=1';">待发货</li>
          <li onclick="location.href='/tuangou/pintuanOrderList.html?status=2';">已发货</li>
          <li onclick="location.href='/tuangou/pintuanOrderList.html?status=3';">已收货</li>
          <li onclick="location.href='/tuangou/pintuanOrderList.html?status=4';">已完成</li>
          <li onclick="location.href='/tuangou/pintuanOrderList.html?status=5';">已关闭</li>
          <li onclick="location.href='/tuangou/pintuanOrderList.html?status=-1';">退款中</li>
        </ul>
      </nav>

    </div>

    <div class="ns-main">

      <table class="mytable">
        <tbody><tr>
          <th align="left">
            <button class="btn-common" onclick="dataExcel()">导出数据</button>
            <a class="btn-common-white" data-id="PrintOrder" href="javascript:;">
              <i class="fa fa-print" />
              <span>打印订单</span>
            </a>
          </th>
          <th>
            <span>下单时间：</span>
            <input type="text" data-id="startDate" class="input-common middle" placeholder="请选择开始日期" onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm:ss'})">
            &nbsp;-&nbsp;
            <input type="text" data-id="endDate" placeholder="请选择结束日期" class="input-common middle" onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm:ss'})">
            <button class="btn-common-white more-search"><i class="fa fa-chevron-down" /></button>
            <button class="btn-common" onclick="searchData()">搜索</button>

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
                  <div class="selectric-wrapper selectric-select-common selectric-middle" style="width: 150px;"><div class="selectric-hide-select"><select id="payment_type" class="select-common middle" tabindex="-1">
                    <option value="">全部</option>
                    <option value="1">微信</option>
                    <option value="2">支付宝</option>
                    <option value="10">线下支付</option>
                    <option value="4">货到付款</option>
                  </select></div><div class="selectric"><span class="selectric-label">全部</span><button class="selectric-button">▾</button></div><div class="selectric-items" tabindex="-1"><div class="selectric-scroll"><ul><li data-index="0" class="selected" title="全部">全部</li><li data-index="1" class="" title="微信">微信</li><li data-index="2" class="" title="支付宝">支付宝</li><li data-index="3" class="" title="线下支付">线下支付</li><li data-index="4" class="last" title="货到付款">货到付款</li></ul></div></div><input class="selectric-input" tabindex="0"></div>
                </dd>
              </dl>
              <dl>
                <dt>配送方式：</dt>
                <dd>
                  <div class="selectric-wrapper selectric-select-common selectric-middle" style="width: 150px;"><div class="selectric-hide-select"><select id="shipping_type" class="select-common middle" tabindex="-1">
                    <option value="0">全部</option>
                    <option value="1">物流配送</option>
                    <option value="2">买家自提</option>
                    <option value="3">本地配送</option>
                  </select></div><div class="selectric"><span class="selectric-label">全部</span><button class="selectric-button">▾</button></div><div class="selectric-items" tabindex="-1"><div class="selectric-scroll"><ul><li data-index="0" class="selected" title="全部">全部</li><li data-index="1" class="" title="物流配送">物流配送</li><li data-index="2" class="" title="买家自提">买家自提</li><li data-index="3" class="last" title="本地配送">本地配送</li></ul></div></div><input class="selectric-input" tabindex="0"></div>
                </dd>
              </dl>
              <dl>
                <dd>
                  <button class="btn-common" onclick="searchData()">搜索</button>
                </dd>
              </dl>
            </div>
          </th>
        </tr>
      </tbody></table>

      <table class="table-class" data-id="ajax-orderlist">
        <colgroup>
          <col width="2%">
          <col width="24%">
          <col width="14%">
          <col width="10%">
          <col width="10%">
          <col width="10%">
          <col width="10%">
          <col width="10%">
          <col width="10%">
        </colgroup>
        <thead>
          <tr align="center">
            <th>
              <i class="checkbox-common"><input type="checkbox" onclick="CheckAll(this)" data-id="check"></i>
            </th>
            <th>商品信息</th>
            <th>商品清单</th>
            <th>买家</th>
            <th>收货信息</th>
            <th>订单金额</th>
            <th>交易状态</th>
            <th>配送方式</th>
            <th>操作</th>
          </tr>
        </thead>
        <!-- TODO: tbody -->
        <!-- <tbody><tr><td rowspan="1"><i class="checkbox-common"><input id="153391505337401000" type="checkbox" value="99" name="sub"></i></td><td><div style="font-size: 12px;color: #126AE4;margin-bottom:5px;"><span>订单编号：2018081023300001</span>&nbsp;<span>下单时间：2018-08-10 23:30:53</span></div><div class="product-img"><img src="/upload/goods/20180705/12c1f79313f569cab48b5c38b69a1d9f4.jpg"></div><div class="product-infor"><a href="/goods/goodsinfo?goodsid=70" target="_blank" style="color:#333;">澳大利亚丁戈树红标经典红葡萄酒750ml-副本</a></div></td><td><div class="cell" style="display: inline-block;"><span>123.00元</span></div><div class="cell" style="display: inline-block;float:right;">1件</div></td><td rowspan="1" style="text-align:center"><div class="cell">admin<br><i class="fa fa-mobile fa-2x" style="color:#666;"><i></i></i></div></td><td rowspan="1" style="text-align:center"><div style="text-align:left;"><span class="expressfee">1</span><br><span class="expressfee">18632515845</span><br><span class="expressfee">四川省&nbsp;成都市&nbsp;邛崃市&nbsp;44</span></div></td><td rowspan="1" style="text-align:center"><div class="cell"><b class="netprice" style="color: #FF6600;font-size: 14px;font-weight: normal;">123.00</b><br><span class="expressfee">(含配送费:0.00元)</span><br><span class="expressfee">在线支付</span></div></td><td rowspan="1"><div class="business-status" style="text-align:center">已关闭<br></div></td><td rowspan="1"><div class="business-status" style="text-align:center">物流配送<br></div></td><td rowspan="1" style="text-align:center;"><a style="display:block;margin-bottom:5px;" href="/order/orderdetail?order_id=99">订单详情</a><a style="display:block;margin-bottom:5px;color:#666666" href="javascript:operation('seller_memo',99)">备注</a><a style="display:block;margin-bottom:5px;color:#ff0000" href="javascript:operation('delete_order',99)">删除订单</a></td></tr><tr style="height:10px;"><td style="border-bottom:solid #E1E6F0;border-width:0 0 1px 0;" colspan="10"></td></tr><tr><td rowspan="1"><i class="checkbox-common"><input id="153370051064881000" type="checkbox" value="94" name="sub"></i></td><td><div style="font-size: 12px;color: #126AE4;margin-bottom:5px;"><span>订单编号：2018080811490001</span>&nbsp;<span>下单时间：2018-08-08 11:49:18</span></div><div class="product-img"><img src="/upload/goods/20180711/3b658c4f23120aa70f6f98a937971f814.jpg"></div><div class="product-infor"><a href="/goods/goodsinfo?goodsid=73" target="_blank" style="color:#333;">测试商品</a></div></td><td><div class="cell" style="display: inline-block;"><span>50.00元</span></div><div class="cell" style="display: inline-block;float:right;">4件</div></td><td rowspan="1" style="text-align:center"><div class="cell">admin<br><i class="fa fa-mobile fa-2x" style="color:#666;"><i></i></i></div></td><td rowspan="1" style="text-align:center"><div style="text-align:left;"><span class="expressfee">1</span><br><span class="expressfee">18632515845</span><br><span class="expressfee">四川省&nbsp;成都市&nbsp;邛崃市&nbsp;44</span></div></td><td rowspan="1" style="text-align:center"><div class="cell"><b class="netprice" style="color: #FF6600;font-size: 14px;font-weight: normal;">200.00</b><br><span class="expressfee">(含配送费:0.00元)</span><br><span class="expressfee">线下支付</span></div></td><td rowspan="1"><div class="business-status" style="text-align:center">待发货<br></div></td><td rowspan="1"><div class="business-status" style="text-align:center">物流配送<br></div></td><td rowspan="1" style="text-align:center;"><a style="display:block;margin-bottom:5px;" href="/order/orderdetail?order_id=94">订单详情</a><a style="display:block;margin-bottom:5px;color:green" href="javascript:operation('delivery',94)">发货</a><a style="display:block;margin-bottom:5px;color:#666666" href="javascript:operation('seller_memo',94)">备注</a><a style="display:block;margin-bottom:5px;color:#51A351" href="javascript:operation('update_address',94)">修改地址</a></td></tr><tr style="height:10px;"><td style="border-bottom:solid #E1E6F0;border-width:0 0 1px 0;" colspan="10"></td></tr><tr><td rowspan="1"><i class="checkbox-common"><input id="153179796429741000" type="checkbox" value="20" name="sub"></i></td><td><div style="font-size: 12px;color: #126AE4;margin-bottom:5px;"><span>订单编号：2018071711240001</span>&nbsp;<span>下单时间：2018-07-17 11:24:52</span></div><div class="product-img"><img src="/upload/goods/14993430961454.jpg"></div><div class="product-infor"><a href="/goods/goodsinfo?goodsid=56" target="_blank" style="color:#333;">钻石金属 闪钻镶卡通指环扣懒人防摔折叠粘贴式手机配件支架批发</a><p class="specification" style="margin-bottom: 0px;"><span style="color:#8e8c8c;font-size:12px;">白色 </span></p></div></td><td><div class="cell" style="display: inline-block;"><span>20.00元</span></div><div class="cell" style="display: inline-block;float:right;">1件</div></td><td rowspan="1" style="text-align:center"><div class="cell">cqinter<br><i class="fa fa-mobile fa-2x" style="color:#666;"><i></i></i></div></td><td rowspan="1" style="text-align:center"><div style="text-align:left;"><span class="expressfee">测试</span><br><span class="expressfee">15802353600</span><br><span class="expressfee">广东省&nbsp;梅州市&nbsp;梅县&nbsp;yatai shang</span></div></td><td rowspan="1" style="text-align:center"><div class="cell"><b class="netprice" style="color: #FF6600;font-size: 14px;font-weight: normal;">20.00</b><br><span class="expressfee">(含配送费:0.00元)</span><br><span class="expressfee">线下支付</span></div></td><td rowspan="1"><div class="business-status" style="text-align:center">待发货<br></div></td><td rowspan="1"><div class="business-status" style="text-align:center">物流配送<br></div></td><td rowspan="1" style="text-align:center;"><a style="display:block;margin-bottom:5px;" href="/order/orderdetail?order_id=20">订单详情</a><a style="display:block;margin-bottom:5px;color:green" href="javascript:operation('delivery',20)">发货</a><a style="display:block;margin-bottom:5px;color:#666666" href="javascript:operation('seller_memo',20)">备注</a><a style="display:block;margin-bottom:5px;color:#51A351" href="javascript:operation('update_address',20)">修改地址</a></td></tr><tr><td colspan="10" class="seller_memo">卖家备注：111</td></tr><tr style="height:10px;"><td style="border-bottom:solid #E1E6F0;border-width:0 0 1px 0;" colspan="10"></td></tr><tr><td rowspan="1"><i class="checkbox-common"><input id="153179219287991000" type="checkbox" value="18" name="sub"></i></td><td><div style="font-size: 12px;color: #126AE4;margin-bottom:5px;"><span>订单编号：2018071709230001</span>&nbsp;<span>下单时间：2018-07-17 09:23:11</span></div><div class="product-img"><img src="/upload/goods/20180705/12c1f79313f569cab48b5c38b69a1d9f4.jpg"></div><div class="product-infor"><a href="/goods/goodsinfo?goodsid=62" target="_blank" style="color:#333;">澳大利亚丁戈树红标经典红葡萄酒750ml</a></div></td><td><div class="cell" style="display: inline-block;"><span>100.00元</span></div><div class="cell" style="display: inline-block;float:right;">1件</div><a href="/order/orderrefunddetail?itemid=19" style="margin:5px 0 10px 0;display:block;">等待卖家确认退款</a><a style="display:block;margin-bottom:5px;color:#4CAF50;text-align:center;" href="javascript:refundOperation('confirm_refund',18,19,100.00)">确认退款</a></td><td rowspan="1" style="text-align:center"><div class="cell">cqinter<br><i class="fa fa-mobile fa-2x" style="color:#666;"><i></i></i></div></td><td rowspan="1" style="text-align:center"><div style="text-align:left;"><span class="expressfee">test</span><br><span class="expressfee">15802353600</span><br><span class="expressfee">广东省&nbsp;梅州市&nbsp;梅县&nbsp;yatai shang</span></div></td><td rowspan="1" style="text-align:center"><div class="cell"><b class="netprice" style="color: #FF6600;font-size: 14px;font-weight: normal;">100.00</b><br><span class="expressfee">(含配送费:0.00元)</span><br><span class="expressfee">线下支付</span></div></td><td rowspan="1"><div class="business-status" style="text-align:center">退款中<br></div></td><td rowspan="1"><div class="business-status" style="text-align:center">物流配送<br></div></td><td rowspan="1" style="text-align:center;"><a style="display:block;margin-bottom:5px;" href="/order/orderdetail?order_id=18">订单详情</a><a style="display:block;margin-bottom:5px;color:#666666" href="javascript:operation('seller_memo',18)">备注</a></td></tr><tr style="height:10px;"><td style="border-bottom:solid #E1E6F0;border-width:0 0 1px 0;" colspan="10"></td></tr><tr><td rowspan="1"><i class="checkbox-common"><input id="153175206896361000" type="checkbox" value="16" name="sub"></i></td><td><div style="font-size: 12px;color: #126AE4;margin-bottom:5px;"><span>订单编号：2018071622410001</span>&nbsp;<span>下单时间：2018-07-16 22:41:08</span></div><div class="product-img"><img src="/upload/goods/20180705/12c1f79313f569cab48b5c38b69a1d9f4.jpg"></div><div class="product-infor"><a href="/goods/goodsinfo?goodsid=62" target="_blank" style="color:#333;">澳大利亚丁戈树红标经典红葡萄酒750ml</a></div></td><td><div class="cell" style="display: inline-block;"><span>100.00元</span></div><div class="cell" style="display: inline-block;float:right;">1件</div></td><td rowspan="1" style="text-align:center"><div class="cell">xcx<br><i class="fa fa-weixin" style="color:#666;"><i></i></i></div></td><td rowspan="1" style="text-align:center"><div style="text-align:left;"><span class="expressfee">滚滚滚</span><br><span class="expressfee">18900412345</span><br><span class="expressfee">广东省&nbsp;河源市&nbsp;龙川县&nbsp;刚刚发的回家</span></div></td><td rowspan="1" style="text-align:center"><div class="cell"><b class="netprice" style="color: #FF6600;font-size: 14px;font-weight: normal;">100.00</b><br><span class="expressfee">(含配送费:0.00元)</span><br><span class="expressfee">在线支付</span></div></td><td rowspan="1"><div class="business-status" style="text-align:center">已关闭<br></div></td><td rowspan="1"><div class="business-status" style="text-align:center">物流配送<br></div></td><td rowspan="1" style="text-align:center;"><a style="display:block;margin-bottom:5px;" href="/order/orderdetail?order_id=16">订单详情</a><a style="display:block;margin-bottom:5px;color:#666666" href="javascript:operation('seller_memo',16)">备注</a><a style="display:block;margin-bottom:5px;color:#ff0000" href="javascript:operation('delete_order',16)">删除订单</a></td></tr><tr style="height:10px;"><td style="border-bottom:solid #E1E6F0;border-width:0 0 1px 0;" colspan="10"></td></tr><tr><td rowspan="1"><i class="checkbox-common"><input id="153174864996451000" type="checkbox" value="15" name="sub"></i></td><td><div style="font-size: 12px;color: #126AE4;margin-bottom:5px;"><span>订单编号：2018071621440001</span>&nbsp;<span>下单时间：2018-07-16 21:44:09</span></div><div class="product-img"><img src="/upload/goods/20180705/12c1f79313f569cab48b5c38b69a1d9f4.jpg"></div><div class="product-infor"><a href="/goods/goodsinfo?goodsid=62" target="_blank" style="color:#333;">澳大利亚丁戈树红标经典红葡萄酒750ml</a></div></td><td><div class="cell" style="display: inline-block;"><span>100.00元</span></div><div class="cell" style="display: inline-block;float:right;">2件</div></td><td rowspan="1" style="text-align:center"><div class="cell">xcx<br><i class="fa fa-weixin" style="color:#666;"><i></i></i></div></td><td rowspan="1" style="text-align:center"><div style="text-align:left;"><span class="expressfee">滚滚滚</span><br><span class="expressfee">18900412345</span><br><span class="expressfee">广东省&nbsp;河源市&nbsp;龙川县&nbsp;刚刚发的回家</span></div></td><td rowspan="1" style="text-align:center"><div class="cell"><b class="netprice" style="color: #FF6600;font-size: 14px;font-weight: normal;">200.00</b><br><span class="expressfee">(含配送费:0.00元)</span><br><span class="expressfee">在线支付</span></div></td><td rowspan="1"><div class="business-status" style="text-align:center">已关闭<br></div></td><td rowspan="1"><div class="business-status" style="text-align:center">买家自提<br></div></td><td rowspan="1" style="text-align:center;"><a style="display:block;margin-bottom:5px;" href="/order/orderdetail?order_id=15">订单详情</a><a style="display:block;margin-bottom:5px;color:#666666" href="javascript:operation('seller_memo',15)">备注</a><a style="display:block;margin-bottom:5px;color:#ff0000" href="javascript:operation('delete_order',15)">删除订单</a></td></tr><tr style="height:10px;"><td style="border-bottom:solid #E1E6F0;border-width:0 0 1px 0;" colspan="10"></td></tr><tr><td rowspan="1"><i class="checkbox-common"><input id="153174151659401000" type="checkbox" value="14" name="sub"></i></td><td><div style="font-size: 12px;color: #126AE4;margin-bottom:5px;"><span>订单编号：2018071619450001</span>&nbsp;<span>下单时间：2018-07-16 19:45:16</span></div><div class="product-img"><img src="/upload/goods/20180705/12c1f79313f569cab48b5c38b69a1d9f4.jpg"></div><div class="product-infor"><a href="/goods/goodsinfo?goodsid=62" target="_blank" style="color:#333;">澳大利亚丁戈树红标经典红葡萄酒750ml</a></div></td><td><div class="cell" style="display: inline-block;"><span>100.00元</span></div><div class="cell" style="display: inline-block;float:right;">1件</div></td><td rowspan="1" style="text-align:center"><div class="cell">xcx<br><i class="fa fa-weixin" style="color:#666;"><i></i></i></div></td><td rowspan="1" style="text-align:center"><div style="text-align:left;"><span class="expressfee">滚滚滚</span><br><span class="expressfee">18900412345</span><br><span class="expressfee">广东省&nbsp;河源市&nbsp;龙川县&nbsp;刚刚发的回家</span></div></td><td rowspan="1" style="text-align:center"><div class="cell"><b class="netprice" style="color: #FF6600;font-size: 14px;font-weight: normal;">100.00</b><br><span class="expressfee">(含配送费:0.00元)</span><br><span class="expressfee">在线支付</span></div></td><td rowspan="1"><div class="business-status" style="text-align:center">已关闭<br></div></td><td rowspan="1"><div class="business-status" style="text-align:center">物流配送<br></div></td><td rowspan="1" style="text-align:center;"><a style="display:block;margin-bottom:5px;" href="/order/orderdetail?order_id=14">订单详情</a><a style="display:block;margin-bottom:5px;color:#666666" href="javascript:operation('seller_memo',14)">备注</a><a style="display:block;margin-bottom:5px;color:#ff0000" href="javascript:operation('delete_order',14)">删除订单</a></td></tr></tbody> -->
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
                  <div class="editprice-tiptxt">涨价或减价<i class="icon-tip" />
                    <p class="text-tip">-表示减价<i class="icon-down-pic" /></p>
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
            <!-- <tbody id="OrderCommodity"></tbody> -->
          </table>
          <ul class="edit-price-amountpay">
            <li>
              <span class="amountpay-label">商品总价：</span>
              <span class="amountpay-price" data-id="goodsmoney" />元&nbsp;&nbsp;&nbsp;
              <span class="amountpay-label">商品优惠：</span>
              <span class="amountpay-price" data-id="discountmoney" />元&nbsp;&nbsp;&nbsp;
              <span class="amountpay-label">运费：</span>
              <span class="amountpay-price" data-id="modifiedFreight" />元
            </li>
            <li>
              <div>
                实收款： <span class="amountpay-price reality-price" data-id="changeTotal" />元
                <input type="hidden" data-id="hiedchangeTotal">
              </div>
            </li>
          </ul>
        </div>
        <div class="modal-footer">
          <button class="btn-common btn-big" onclick="updPrice()" data-id="butSubmit">保存</button>
          <button class="btn-common-cancle btn-big" data-dismiss="modal" aria-hidden="true">关闭</button>
        </div>
      </div>

      <div class="modal hide fade" data-id="Delivery" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true" style="left:32%">
        <div class="modal-dialog">
          <div class="modal-content">
            <div class="modal-header">
              <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
              <h3>商品发货</h3>
            </div>
            <div class="modal-body">

              <!-- 主要内容 -->

              <div style="padding: 0 0 10px 0;">待发货(<span id="no_shipping_num"/>)，已选<span id="checkedbox">0</span></div>
              <table class="table-class" style="margin-bottom:10px;">
                <thead>
                  <tr>
                    <th>
                      <i class="checkbox-common"><input type="checkbox" data-id="inlineCheckbox1" onclick="deliveryCheckAll(this)"></i>
                    </th>
                    <!-- <th></th> -->
                    <th>商品</th>
                    <th>数量</th>
                    <th>物流 | 单号</th>
                    <th>状态</th>
                  </tr>
                </thead>
                <!-- <colgroup>
                  <col style="width: 5%;">
                  <col style="width: 10%;">
                  <col style="width: 40%;">
                  <col style="width: 10%;">
                  <col style="width: 20%;">
                  <col style="width: 15%;">
                </colgroup><colgroup>
                </colgroup><tbody></tbody> -->
              </table>
              <div>
                <div style="margin-bottom:5px;">发货方式：</div>
                <label class="checkbox-inline" style="float:left;margin-right:30px;">
                  <i class="radio-common">
                    <input type="radio" name="shipping_type" data-id="shipping_type0" value="0">
                  </i>
                  <span>无需物流</span>
                </label>
                <label class="checkbox-inline" style="float:left;">
                  <i class="radio-common selected">
                    <input type="radio" name="shipping_type" data-id="shipping_type1" value="1" checked="checked">
                  </i>
                  <span>需要物流</span>
                </label>
              </div>
              <!-- <div style="clear:both;"></div> -->
              <div class="form-group" data-id="express_input" style="margin:5px 0 10px 0;">
                <!-- <select class="form-control" data-id="divlogistics_express_company"></select> -->
                <input type="text" data-id="divlogistics_express_no" class="input-common" placeholder="请填写快递单号" style="vertical-align:2px;">
              </div>
              <!-- <div id="receiver_info" style="clear:both;"></div> -->
            </div>
            <div class="modal-footer">
              <input type="hidden" data-id="o2o_delivery_order_id">
              <button class="btn-common btn-big" onclick="orderDeliverySubmit()">保存</button>
              <button class="btn-common-cancle btn-big" data-dismiss="modal">关闭</button>
            </div>
          </div>
        </div>
      </div>

      <!--  本地配送模态框 -->
      <div class="modal hide fade" data-id="o2o_Delivery" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true" style="left:32%">
        <div class="modal-dialog">
          <div class="modal-content">
            <div class="modal-header">
              <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
              <h3>商品发货</h3>
            </div>
            <div class="modal-body">

              <!--  主要内容 -->

              <div>待发货(<span id="o2o_shipping_num"/>)</div>
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
                <!-- <tbody></tbody> -->
              </table>
              <div>
                <div style="margin-bottom:5px;">配送人员：</div>
              </div>
              <div style="clear:both;" />
              <div class="form-group" data-id="express_input">
                <!-- <select class="form-control input-lg" data-id="o2o_delivery_user"></select> -->
                <input type="text" data-id="o2o_delivery_no" class="input-common" placeholder="请填写配送单号" style="vertical-align:2px;">
              </div>
              <!-- <div id="receiver_info"></div> -->
              <div>
                <div style="margin-bottom:5px;">备注：</div>
                <!-- <textarea class="remark textarea-common" style=" width: 440px;height: 80px;" maxlength="500"></textarea> -->
              </div>
            </div>

            <div class="modal-footer">
              <input type="hidden" data-id="delivery_order_id">
              <button class="btn-common btn-big" onclick="o2oDeliverySubmit()">提交更改</button>
              <button class="btn-common-cancle btn-big" data-dismiss="modal">关闭</button>
            </div>
          </div>
        </div>
      </div>

      <!--  自提模态 -->

      <div class="modal hide fade" data-id="pickup" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true" style="margin-left:-365px; width: 700px;">
        <div class="modal-dialog">
          <div class="modal-content">
            <div class="modal-header">
              <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
              <h3>商品提货</h3>
            </div>
            <div class="modal-body">

              <!-- 主要内容 -->
              <table class="table table-hover" style="margin-bottom:10px;">
                <!-- <thead></thead>
                <colgroup></colgroup><colgroup>
                </colgroup><tbody></tbody> -->
              </table>

              <div class="form-group">
                <div class="pick_title"><span class="required">*</span>提货人：</div>
                <div class="col-lg-4"><input type="text" data-id="pickup_name" class="form-control input-common" placeholder="请填写提货人姓名"></div>
              </div>
              <div class="form-group">
                <div class="pick_title"><span class="required">*</span>提货人手机号：</div>
                <div class="col-lg-4"><input type="text" data-id="pickup_mobile" class="form-control input-common" placeholder="请填写提货人手机号"></div>
              </div>
              <div class="form-group">
                <div class="pick_title">备注：</div>
                <!-- <div class="col-lg-2"><textarea id="pickup_desc" class="textarea-common"></textarea></div> -->
              </div>

            </div>

            <div class="modal-footer">
              <input type="hidden" data-id="pickup_order_id">
              <button class="btn-common btn-big" onclick="orderPickupSubmit(pickup_order_id)">确认提货</button>
              <button class="btn-common-cancle btn-big" data-dismiss="modal">关闭</button>
            </div>
          </div>
        </div>
      </div>
      <!--   修改收货地址模态 -->

      <div class="modal hide fade" data-id="update_address" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true" style="margin-left:-365px; width: 700px;">
        <div class="modal-dialog">
          <div class="modal-content">
            <div class="modal-header">
              <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
              <h3>修改收货地址</h3>
            </div>
            <div class="modal-body">
              <div class="form-group">
                <div class="pick_title"><span class="required">*</span>收货人：</div>
                <div class="col-lg-4"><input type="text" data-id="receiver_name" class="form-control input-common" style="width:350px;margin-bottom:10px !important;"></div>
              </div>
              <div class="form-group">
                <div class="pick_title"><span class="required">*</span>收货人手机号：</div>
                <div class="col-lg-4"><input type="text" data-id="receiver_mobile" class="form-control input-common" style="width:350px;margin-bottom:10px !important;"></div>
              </div>
              <div class="form-group">
                <div class="pick_title">收货人固定电话：</div>
                <div class="col-lg-4"><input type="text" data-id="fixed_telephone" class="form-control input-common" style="width:350px;margin-bottom:10px !important;"></div>
              </div>
              <div class="form-group">
                <div class="pick_title">收货人邮编：</div>
                <div class="col-lg-4"><input type="text" data-id="receiver_zip" class="form-control input-common" style="width:350px;margin-bottom:10px !important;" maxlength="6" onkeyup="this.value=this.value.replace(/\D/g,'')"></div>
              </div>
              <div class="form-group" style="width:100%;margin-bottom: 10px;">
                <div class="pick_title"><span class="required">*</span>收货地址：</div>
                <div class="address_choice">
                  <div class="selectric-wrapper selectric-select-common selectric-harf" style="width: 125px;"><div class="selectric-hide-select"><select name="province" data-id="seleAreaNext" onchange="GetProvince();" class="select-common harf" tabindex="-1">

                  <option value="-1">请选择省</option><option value="35">hai</option><option value="20">广西壮族自治区</option><option value="21">海南省</option><option value="22">重庆市</option><option value="23">四川省</option><option value="24">贵州省</option><option value="25">云南省</option><option value="26">西藏自治区</option><option value="27">陕西省</option><option value="28">甘肃省</option><option value="29">青海省</option><option value="30">宁夏回族自治区</option><option value="31">新疆维吾尔自治区</option><option value="32">香港特别行政区</option><option value="33">澳门特别行政区</option><option value="34">台湾省</option><option value="19">广东省</option><option value="18">湖南省</option><option value="17">湖北省</option><option value="2">天津市</option><option value="3">河北省</option><option value="4">山西省</option><option value="5">内蒙古自治区</option><option value="6">辽宁省</option><option value="7">吉林省</option><option value="8">黑龙江省</option><option value="9">上海市</option><option value="10">江苏省</option><option value="11">浙江省</option><option value="12">安徽省</option><option value="13">福建省</option><option value="14">江西省</option><option value="15">山东省</option><option value="16">河南省</option><option value="1">北京市</option></select></div><div class="selectric"><span class="selectric-label">请选择省</span><button class="selectric-button">▾</button></div><div class="selectric-items" tabindex="-1"><div class="selectric-scroll"><ul><li data-index="0" class="selected" title="请选择省">请选择省</li><li data-index="1" class="" title="hai">hai</li><li data-index="2" class="" title="广西壮族自治区">广西壮族自治区</li><li data-index="3" class="" title="海南省">海南省</li><li data-index="4" class="" title="重庆市">重庆市</li><li data-index="5" class="" title="四川省">四川省</li><li data-index="6" class="" title="贵州省">贵州省</li><li data-index="7" class="" title="云南省">云南省</li><li data-index="8" class="" title="西藏自治区">西藏自治区</li><li data-index="9" class="" title="陕西省">陕西省</li><li data-index="10" class="" title="甘肃省">甘肃省</li><li data-index="11" class="" title="青海省">青海省</li><li data-index="12" class="" title="宁夏回族自治区">宁夏回族自治区</li><li data-index="13" class="" title="新疆维吾尔自治区">新疆维吾尔自治区</li><li data-index="14" class="" title="香港特别行政区">香港特别行政区</li><li data-index="15" class="" title="澳门特别行政区">澳门特别行政区</li><li data-index="16" class="" title="台湾省">台湾省</li><li data-index="17" class="" title="广东省">广东省</li><li data-index="18" class="" title="湖南省">湖南省</li><li data-index="19" class="" title="湖北省">湖北省</li><li data-index="20" class="" title="天津市">天津市</li><li data-index="21" class="" title="河北省">河北省</li><li data-index="22" class="" title="山西省">山西省</li><li data-index="23" class="" title="内蒙古自治区">内蒙古自治区</li><li data-index="24" class="" title="辽宁省">辽宁省</li><li data-index="25" class="" title="吉林省">吉林省</li><li data-index="26" class="" title="黑龙江省">黑龙江省</li><li data-index="27" class="" title="上海市">上海市</li><li data-index="28" class="" title="江苏省">江苏省</li><li data-index="29" class="" title="浙江省">浙江省</li><li data-index="30" class="" title="安徽省">安徽省</li><li data-index="31" class="" title="福建省">福建省</li><li data-index="32" class="" title="江西省">江西省</li><li data-index="33" class="" title="山东省">山东省</li><li data-index="34" class="" title="河南省">河南省</li><li data-index="35" class="last" title="北京市">北京市</li></ul></div></div><input class="selectric-input" tabindex="0"></div>
                  <select name="city" data-id="seleAreaThird" onchange="getSelCity();" class="select-common harf">

                  <option value="-1">请选择市</option></select>
                  <select name="district" data-id="seleAreaFouth" class="select-common harf">
                    <option value="-1">请选择区/县</option>
                  </select>
                  <input type="hidden" data-id="provinceid" value="-1">
                  <input type="hidden" data-id="cityid">
                  <input type="hidden" data-id="districtid">
                </div>
              </div>
              <div class="form-group">
                <div class="pick_title"><span class="required">*</span>详细地址：</div>
                <div class="col-lg-4"><input type="text" data-id="address_detail" class="form-control input-common" style="width:350px"></div>
              </div>
            </div>

            <div class="modal-footer">
              <input type="hidden" data-id="update_address_id">
              <button type="button" class="btn-common btn-big" onclick="updateAddressSubmit(update_address_id)">修改</button>
              <button type="button" class="btn-common-white btn-big" data-dismiss="modal">关闭</button>
            </div>
          </div>
        </div>
      </div>

      <!--   模态框（Modal） -->

      <div class="modal fade hide" data-id="Memobox" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true" style="width:700px;left:45%;top:30%;">
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
                    <!-- <textarea rows="3" cols="20" data-id="memo" class="textarea-common"></textarea> -->
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

      <!--    修改运单号 -->

      <div class="modal hide fade" data-id="update_express" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true" style="width: 700px; left: 45%; top: 30%; display: none;">
        <div class="modal-dialog">
          <div class="modal-content">
            <div class="modal-header">
              <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
              <h3>修改运单号</h3>
            </div>
            <div class="modal-body">
              <div style="margin-bottom:5px;">发货方式：</div>
              <label class="checkbox-inline" style="float:left;margin-right:30px;"><input type="radio" name="shipping_type_update" data-id="shipping_type2" value="0"> 无需物流</label>
              <label class="checkbox-inline" style="float:left;"><input type="radio" name="shipping_type_update" data-id="shipping_type3" value="1" checked="checked"> 需要物流</label>

              <!-- <div style="clear:both;"></div> -->
              <div class="form-group" data-id="update_express_input">
                <!-- <select class="form-control input-lg" data-id="update_divlogistics_express_company" style="margin-bottom:5px;margin-right:15px;float:left;"></select> -->
                <div class="col-lg-2"><input type="text" data-id="update_divlogistics_express_no" class="form-control" placeholder="请填写快递单号" style="height:19px;"></div>
              </div>
              <!-- <div id="receiver_infos"></div> -->
            </div>
          </div>

          <div class="modal-footer">
            <input type="hidden" data-id="order_goods_express_id">
            <button class="btn-common btn-big" onclick="updateExpressAjax()">提交更改</button>
            <button class="btn-common-cancle btn-big" data-dismiss="modal">关闭</button>
          </div>
        </div>
      </div>

      <!--    打印发货单 -->

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
                <!-- <tbody id="InvoiceList"></tbody> -->
              </table>
            </div>
          </div>
          <form class="form-horizontal" style="display: none;">
            <div class="control-group">
              <label class="control-label" for="deliveryShopInfo"><span class="color-red">*</span>发件人</label>
              <div class="controls">
                <!-- <select id="deliveryShopInfo" class="input-large"></select> -->
                <span class="help-block" style="display: none;">请输入选择发件人</span>
              </div>
            </div>
            <div class="control-group">
              <!-- <label class="control-label"></label> -->
              <div class="controls">
                <!-- <label class="checkbox"></label> -->
              </div>
            </div>
          </form>
        </div>
        <!-- <a id="invoicePrintingURL" style="display: none;" target="_blank"></a> -->
        <div class="modal-footer">
          <button class="btn-common" data-id="invoicePrinPreview" aria-hidden="true">打印预览</button>
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
                <!-- <tbody id="billOfSales"></tbody> -->
              </table>
            </div>
          </div>
          <form class="form-horizontal" style="display: none;">
            <div class="control-group">
              <label class="control-label" for="deliveryShop"><span class="color-red">*</span>发件人</label>
              <div class="controls">
                <!-- <select id="deliveryShop" class="input-large"></select> -->
                <span class="help-block" style="display: none;">请输入选择发件人</span>
              </div>
            </div>
            <div class="control-group">
              <!-- <label class="control-label"></label> -->
              <div class="controls">
                <!-- <label class="checkbox"></label> -->
              </div>
            </div>
          </form>
        </div>
        <!-- <a id="invoicePrintingURL" style="display: none;" target="_blank"></a> -->
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
                  <option value="4">百世快递</option>
                  <option value="5">邮政快递</option>
                  <option value="6">顺丰快递</option>
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
                <!-- <tbody id="InvoiceList-express" colspan="3">
                </tbody> -->
              </table>
            </div>
          </div>
        </div>
        <!-- <a id="invoicePrintingURL" style="display: none;" target="_blank"></a> -->
        <div class="modal-footer">
          <span class="tips">提示：<span style="color: #777;">选中的订单项运单号可实现自增,已发货的订单可修改快递公司和运单号</span></span>
          <button class="btn-common" data-id="expressPrinPreview" aria-hidden="true">打印预览</button>
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
                  <option value="4">百世快递</option>
                  <option value="5">邮政快递</option>
                  <option value="6">顺丰快递</option>
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
                <!-- <tbody id="notShippedOrderList">

                </tbody> -->
              </table>
            </div>
          </div>
        </div>
        <div class="modal-footer">
          <button class="btn-common" data-id="confirm_delivery" aria-hidden="true">确认发货</button>
          <button class="btn-common-cancle btn-big" data-dismiss="modal" aria-hidden="true">关闭</button>
        </div>
      </div>

      <div class="modal fade hide" data-id="confirmRefund" tabindex="-1" aria-labelledby="确认退款" aria-hidden="true" data-backdrop="static" style="width: 650px; overflow: overlay;top:50%;">
        <div class="modal-dialog">
          <div class="modal-content">
            <div class="modal-header">
              <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
              <h3>确认退款</h3>
            </div>
            <div class="modal-body">

              <div class="refunds-block">
                <label>退款金额：</label>
                <input type="text" data-id="refund_money_input" class="input-common" placeholder="请填写退款金额">
                <span class="operating-hint">请输入退款金额</span>
              </div>
              <div class="refunds-block">
                <label>退款方式：</label>
                <!-- <select id="refund_way_select" class="select-common"></select> -->
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

              <!-- <div class="refunds-block js-not-configured-prompt"></div> -->
              <input type="hidden" data-id="confirm_order_id">
              <input type="hidden" data-id="confirm_order_goods_id">
              <input type="hidden" data-id="refund_require_money">
              <button class="btn-common js-confirm-refund-ok disabled">确认</button>
              <button class="btn" data-dismiss="modal" aria-hidden="true">取消</button>
            </div>
          </div>
        </div>
      </div>
      <div class="modal hide fade" tabindex="-1" aria-labelledby="退款操作提醒" aria-hidden="true" data-backdrop="static" data-id="refundOperationReminder" style="width:600px;top: 50%;">
        <div class="modal-dialog">
          <div class="modal-content">
            <div class="modal-header">
              <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
              <h3>退款操作提醒</h3>
            </div>
            <div class="modal-body">
              <!-- <div class="js-confirmation"></div> -->
              <label>备注：</label>
              <!-- <textarea rows="4" placeholder="退款备注，最多可输入200个字符。(如果不填，系统将会自动添加默认退款备注，格式为：订单编号:201710180000031，退款方式为:[微信支付]，退款金额:0.00元，退款余额:0.00元)" data-id="refund-remark"></textarea> -->
              <!-- <div class="refunds-block js-confirmation-prompt"></div>
              <div style="clear: both;"></div> -->
            </div>
            <div class="modal-footer">

              <!-- 温馨提示 -->

              <button class="btn-common disabled" data-id="countdown_refund_confirm">确定</button>
              <button class="btn" data-dismiss="modal" aria-hidden="true">取消</button>
            </div>
          </div>
        </div>
      </div>
      <div class="modal hide fade" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true" data-id="refuseRefund" style="width:300px;">
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
              <input type="hidden" data-id="refuse_order_id">
              <input type="hidden" data-id="refuse_order_goods_id">
              <button class="btn-common" onclick="refuseRefundType(1)">拒绝本次</button>
              <button class="btn" onclick="refuseRefundType(2)">永久拒绝</button>
            </div>
          </div>
        </div>
      </div>
      <div class="modal hide fade" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true" data-id="agreeRefund" style="width:300px;">
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
              <input type="hidden" data-id="agreee_order_id">
              <input type="hidden" data-id="agree_order_goods_id">
              <button class="btn-common" onclick="agreeRefund()">同意</button>
              <button class="btn" data-dismiss="modal" aria-hidden="true">取消</button>
            </div>
          </div>
        </div>
      </div>
      <div class="modal hide fade" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true" data-id="confirm_receipt" style="width:400px;">
        <div class="modal-dialog">
          <div class="modal-content">
            <div class="modal-header">
              <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
              <h3>确认收货</h3>
            </div>
            <div class="modal-body">
              <div style="height: 35px;line-height: 35px;">
                物流公司：
                <!-- <span id="logistics_company"></span> -->
              </div>
              <div style="height: 35px;line-height: 35px;">
                物流单号：
                <!-- <span id="logistics_number"></span> -->
              </div>
              <div style="height: 35px;line-height: 35px;">
                是否入库：
                <label for="no" style="display: inline-block;font-weight: normal;">否</label>
                <input type="radio" name="isStorage" data-id="no" style="margin-top: -2px;" checked="">
                <label for="yes" style="display: inline-block;font-weight: normal;margin-left: 15px;">
                  是
                </label>
                <input type="radio" name="isStorage" data-id="yes" style="margin-top: -2px;margin-left: 5px;">
              </div>
              <div id="storage_num" style="display: none;">
                入库件数：
                <input type="number">
              </div>
            </div>
            <div class="modal-footer">
              <input type="hidden" data-id="hide_order_id">
              <input type="hidden" data-id="hide_order_goods_id">
              <input type="hidden" data-id="hide_receipt_goods_id">
              <input type="hidden" data-id="hide_receipt_sku_id">
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

export default {
  name: 'PintuanOrderList',
  data () {
    return {
      queryForm: {},
      orderList: [],
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
