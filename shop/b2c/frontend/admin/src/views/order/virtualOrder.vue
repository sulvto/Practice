<template>

  <section class="ns-base-section">
    <el-tabs v-model="activeName" @tab-click="handleClick">
      <el-tab-pane label="全部" name="first">用户管理</el-tab-pane>
      <el-tab-pane label="待付款" name="second">配置管理</el-tab-pane>
      <el-tab-pane label="已付款" name="third">角色管理</el-tab-pane>
      <el-tab-pane label="已完成" name="fourth">定时任务补偿</el-tab-pane>
      <el-tab-pane label="已关闭" name="first">用户管理</el-tab-pane>
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
        prop="receiverMobile"
        label="联系方式"
        width="120">
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

  <table class="mytable select">
    <tbody><tr>
      <th align="left">
        <button onclick="dataExcel()" class="btn-common">导出数据</button>
        <a class="btn-common-white" id="PrintOrder" href="javascript:;">
          <i class="fa fa-print"></i>
          <span>打印订单</span>
        </a>
              </th>
      <th>
        <span>下单时间：</span>
        <input type="text" id="startDate" class="input-common middle" placeholder="请选择开始日期" onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm:ss'})">
        &nbsp;-&nbsp;
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
            <dt>买家联系方式：</dt>
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
              </select></div><div class="selectric"><span class="selectric-label">全部</span><button class="selectric-button">▾</button></div><div class="selectric-items" tabindex="-1"><div class="selectric-scroll"><ul><li data-index="0" class="selected" title="全部">全部</li><li data-index="1" class="" title="微信">微信</li><li data-index="2" class="" title="支付宝">支付宝</li><li data-index="3" class="last" title="线下支付">线下支付</li></ul></div></div><input class="selectric-input" tabindex="0"></div>
            </dd>
          </dl>
          <dl>
            <dt></dt>
            <dd><button onclick="searchData()" class="btn-common">搜索</button></dd>
          </dl>
        </div>

    </th>
  </tr></tbody></table>

  <table class="table-class" id="ajax-orderlist">
    <colgroup>
      <col width="2%">
      <col width="34%">
      <col width="14%">
      <col width="10%">
      <col width="10%">
      <col width="10%">
      <col width="10%">
      <col width="10%">
    </colgroup>
    <thead>
      <tr align="center">
        <th>
          <i class="checkbox-common"><input type="checkbox" onclick="CheckAll(this)" id="check"></i>
        </th>
        <th>商品信息</th>
        <th>商品清单</th>
        <th>买家</th>
        <th>联系方式</th>
        <th>订单金额</th>
        <th>交易状态</th>
        <th>操作</th>
      </tr>
    </thead>
    <tbody><tr><td><i class="checkbox-common"><input id="153440570973211000" type="checkbox" value="477" name="sub"></i></td><td><div style="font-size: 12px;color: #126AE4;margin-bottom:5px;"><span>订单编号：2018081615480001</span>&nbsp;<span>下单时间：2018-08-16 15:48:29</span></div><div class="product-img"><img src="/upload/goods/20180815/34d501f33db8ea7937181396c8a21d734.png"></div><div class="product-infor"><a href="http://b2c.niuteam.cn/goods/goodsinfo?goodsid=179" target="_blank" style="color:#333;">11111111111_test</a></div></td><td><div class="cell" style="display: inline-block;"><span>135.00元</span></div><div class="cell" style="display: inline-block;float:right;">1件</div></td><td rowspan="1" style="text-align:center"><div class="cell">niushop1<br><i class="fa fa-television" style="color:#666;"><i></i></i></div></td><td rowspan="1" style="text-align:center"><div><span class="expressfee">13999999999</span></div></td><td rowspan="1" style="text-align:center"><div class="cell"><b class="netprice" style="color:#666;">￥135.00</b><br><span class="expressfee">余额支付</span></div></td><td rowspan="1"><div class="business-status" style="text-align:center">已完成<br></div></td><td rowspan="1" style="text-align:center;"><a style="display:block;margin-bottom:5px;" href="/order/virtualorderdetail?order_id=477">订单详情</a><a style="display:block;margin-bottom:5px;color:#666666" href="javascript:operation('seller_memo',477)">备注</a></td></tr><tr style="height:10px;"><td style="border-bottom:solid #E1E6F0;border-width:0 0 1px 0;" colspan="10"></td></tr><tr><td><i class="checkbox-common"><input id="153372199821321000" type="checkbox" value="459" name="sub"></i></td><td><div style="font-size: 12px;color: #126AE4;margin-bottom:5px;"><span>订单编号：2018080817530001</span>&nbsp;<span>下单时间：2018-08-08 17:53:18</span></div><div class="product-img"><img src="/upload/goods/20180714/c54d7aff1631ec696e11fb1208e0bac04.png"></div><div class="product-infor"><a href="http://b2c.niuteam.cn/goods/goodsinfo?goodsid=139" target="_blank" style="color:#333;">as</a></div></td><td><div class="cell" style="display: inline-block;"><span>10.00元</span></div><div class="cell" style="display: inline-block;float:right;">1件</div></td><td rowspan="1" style="text-align:center"><div class="cell">1058100209@qq.com<br><i class="fa fa-television" style="color:#666;"><i></i></i></div></td><td rowspan="1" style="text-align:center"><div><span class="expressfee">13431035040</span></div></td><td rowspan="1" style="text-align:center"><div class="cell"><b class="netprice" style="color:#666;">￥10.00</b><br><span class="expressfee">在线支付</span></div></td><td rowspan="1"><div class="business-status" style="text-align:center">已关闭<br></div></td><td rowspan="1" style="text-align:center;"><a style="display:block;margin-bottom:5px;" href="/order/virtualorderdetail?order_id=459">订单详情</a><a style="display:block;margin-bottom:5px;color:#666666" href="javascript:operation('seller_memo',459)">备注</a><a style="display:block;margin-bottom:5px;color:#ff0000" href="javascript:operation('delete_order',459)">删除订单</a></td></tr><tr style="height:10px;"><td style="border-bottom:solid #E1E6F0;border-width:0 0 1px 0;" colspan="10"></td></tr><tr><td><i class="checkbox-common"><input id="153372022938761000" type="checkbox" value="456" name="sub"></i></td><td><div style="font-size: 12px;color: #126AE4;margin-bottom:5px;"><span>订单编号：2018080817230001</span>&nbsp;<span>下单时间：2018-08-08 17:23:49</span></div><div class="product-img"><img src="/upload/goods/20180714/c54d7aff1631ec696e11fb1208e0bac04.png"></div><div class="product-infor"><a href="http://b2c.niuteam.cn/goods/goodsinfo?goodsid=141" target="_blank" style="color:#333;">222221-副本</a></div></td><td><div class="cell" style="display: inline-block;"><span>89.10元</span></div><div class="cell" style="display: inline-block;float:right;">1件</div></td><td rowspan="1" style="text-align:center"><div class="cell">niushop1<br><i class="fa fa-mobile fa-2x" style="color:#666;"><i></i></i></div></td><td rowspan="1" style="text-align:center"><div><span class="expressfee">13851316352</span></div></td><td rowspan="1" style="text-align:center"><div class="cell"><b class="netprice" style="color:#666;">￥89.10</b><br><span class="expressfee">余额支付</span></div></td><td rowspan="1"><div class="business-status" style="text-align:center">undefined<br></div></td><td rowspan="1" style="text-align:center;"><a style="display:block;margin-bottom:5px;" href="/order/virtualorderdetail?order_id=456">订单详情</a></td></tr><tr style="height:10px;"><td style="border-bottom:solid #E1E6F0;border-width:0 0 1px 0;" colspan="10"></td></tr><tr><td><i class="checkbox-common"><input id="153370951268191000" type="checkbox" value="453" name="sub"></i></td><td><div style="font-size: 12px;color: #126AE4;margin-bottom:5px;"><span>订单编号：2018080814250001</span>&nbsp;<span>下单时间：2018-08-08 14:25:12</span></div><div class="product-img"><img src="/upload/goods/20180725/bcfe9e8cc1367c8d07d8b343691f36a84.png"></div><div class="product-infor"><a href="http://b2c.niuteam.cn/goods/goodsinfo?goodsid=159" target="_blank" style="color:#333;">充值 卡</a></div></td><td><div class="cell" style="display: inline-block;"><span>100.00元</span></div><div class="cell" style="display: inline-block;float:right;">1件</div></td><td rowspan="1" style="text-align:center"><div class="cell">lychun<br><i class="fa fa-television" style="color:#666;"><i></i></i></div></td><td rowspan="1" style="text-align:center"><div><span class="expressfee">13122217776</span></div></td><td rowspan="1" style="text-align:center"><div class="cell"><b class="netprice" style="color:#666;">￥100.00</b><br><span class="expressfee">余额支付</span></div></td><td rowspan="1"><div class="business-status" style="text-align:center">已完成<br></div></td><td rowspan="1" style="text-align:center;"><a style="display:block;margin-bottom:5px;" href="/order/virtualorderdetail?order_id=453">订单详情</a><a style="display:block;margin-bottom:5px;color:#666666" href="javascript:operation('seller_memo',453)">备注</a></td></tr><tr style="height:10px;"><td style="border-bottom:solid #E1E6F0;border-width:0 0 1px 0;" colspan="10"></td></tr><tr><td><i class="checkbox-common"><input id="153353527227721000" type="checkbox" value="444" name="sub"></i></td><td><div style="font-size: 12px;color: #126AE4;margin-bottom:5px;"><span>订单编号：2018080614000002</span>&nbsp;<span>下单时间：2018-08-06 14:00:45</span></div><div class="product-img"><img src="/upload/goods/20180623/50576edc851e894af51d3633c8f5a8224.jpeg"></div><div class="product-infor"><a href="http://b2c.niuteam.cn/goods/goodsinfo?goodsid=110" target="_blank" style="color:#333;">撒旦撒旦撒旦撒旦</a></div></td><td><div class="cell" style="display: inline-block;"><span>20.00元</span></div><div class="cell" style="display: inline-block;float:right;">1件</div></td><td rowspan="1" style="text-align:center"><div class="cell">wzz246513<br><i class="fa fa-mobile fa-2x" style="color:#666;"><i></i></i></div></td><td rowspan="1" style="text-align:center"><div><span class="expressfee">13146101332</span></div></td><td rowspan="1" style="text-align:center"><div class="cell"><b class="netprice" style="color:#666;">￥20.00</b><br><span class="expressfee">线下支付</span></div></td><td rowspan="1"><div class="business-status" style="text-align:center">已完成<br></div></td><td rowspan="1" style="text-align:center;"><a style="display:block;margin-bottom:5px;" href="/order/virtualorderdetail?order_id=444">订单详情</a><a style="display:block;margin-bottom:5px;color:#666666" href="javascript:operation('seller_memo',444)">备注</a></td></tr><tr style="height:10px;"><td style="border-bottom:solid #E1E6F0;border-width:0 0 1px 0;" colspan="10"></td></tr><tr><td><i class="checkbox-common"><input id="153352222118881000" type="checkbox" value="440" name="sub"></i></td><td><div style="font-size: 12px;color: #126AE4;margin-bottom:5px;"><span>订单编号：2018080610230002</span>&nbsp;<span>下单时间：2018-08-06 10:23:41</span></div><div class="product-img"><img src="/upload/goods/20180725/bcfe9e8cc1367c8d07d8b343691f36a84.png"></div><div class="product-infor"><a href="http://b2c.niuteam.cn/goods/goodsinfo?goodsid=159" target="_blank" style="color:#333;">充值 卡</a></div></td><td><div class="cell" style="display: inline-block;"><span>90.00元</span></div><div class="cell" style="display: inline-block;float:right;">1件</div></td><td rowspan="1" style="text-align:center"><div class="cell">niushop1<br><i class="fa fa-television" style="color:#666;"><i></i></i></div></td><td rowspan="1" style="text-align:center"><div><span class="expressfee">18018018018</span></div></td><td rowspan="1" style="text-align:center"><div class="cell"><b class="netprice" style="color:#666;">￥90.00</b><br><span class="expressfee">在线支付</span></div></td><td rowspan="1"><div class="business-status" style="text-align:center">已关闭<br></div></td><td rowspan="1" style="text-align:center;"><a style="display:block;margin-bottom:5px;" href="/order/virtualorderdetail?order_id=440">订单详情</a><a style="display:block;margin-bottom:5px;color:#666666" href="javascript:operation('seller_memo',440)">备注</a><a style="display:block;margin-bottom:5px;color:#ff0000" href="javascript:operation('delete_order',440)">删除订单</a></td></tr><tr style="height:10px;"><td style="border-bottom:solid #E1E6F0;border-width:0 0 1px 0;" colspan="10"></td></tr><tr><td><i class="checkbox-common"><input id="153337384571411000" type="checkbox" value="434" name="sub"></i></td><td><div style="font-size: 12px;color: #126AE4;margin-bottom:5px;"><span>订单编号：2018080417080001</span>&nbsp;<span>下单时间：2018-08-04 17:08:38</span></div><div class="product-img"><img src="/upload/goods/20180725/bcfe9e8cc1367c8d07d8b343691f36a84.png"></div><div class="product-infor"><a href="http://b2c.niuteam.cn/goods/goodsinfo?goodsid=159" target="_blank" style="color:#333;">充值 卡</a></div></td><td><div class="cell" style="display: inline-block;"><span>100.00元</span></div><div class="cell" style="display: inline-block;float:right;">1件</div><div class="cell" style="display: inline-block;"><span>(调价：-99.99元)</span></div></td><td rowspan="1" style="text-align:center"><div class="cell">ilouju<br><i class="fa fa-weixin" style="color:#666;"><i></i></i></div></td><td rowspan="1" style="text-align:center"><div><span class="expressfee">13096999999</span></div></td><td rowspan="1" style="text-align:center"><div class="cell"><b class="netprice" style="color:#666;">￥0.01</b><br><span class="expressfee">线下支付</span></div></td><td rowspan="1"><div class="business-status" style="text-align:center">已完成<br></div></td><td rowspan="1" style="text-align:center;"><a style="display:block;margin-bottom:5px;" href="/order/virtualorderdetail?order_id=434">订单详情</a><a style="display:block;margin-bottom:5px;color:#666666" href="javascript:operation('seller_memo',434)">备注</a></td></tr><tr style="height:10px;"><td style="border-bottom:solid #E1E6F0;border-width:0 0 1px 0;" colspan="10"></td></tr><tr><td><i class="checkbox-common"><input id="153310546235771000" type="checkbox" value="413" name="sub"></i></td><td><div style="font-size: 12px;color: #126AE4;margin-bottom:5px;"><span>订单编号：2018080114370002</span>&nbsp;<span>下单时间：2018-08-01 14:37:42</span></div><div class="product-img"><img src="/upload/goods/20180714/c54d7aff1631ec696e11fb1208e0bac04.png"></div><div class="product-infor"><a href="http://b2c.niuteam.cn/goods/goodsinfo?goodsid=141" target="_blank" style="color:#333;">222221-副本</a></div></td><td><div class="cell" style="display: inline-block;"><span>89.10元</span></div><div class="cell" style="display: inline-block;float:right;">1件</div></td><td rowspan="1" style="text-align:center"><div class="cell">niushop1<br><i class="fa fa-television" style="color:#666;"><i></i></i></div></td><td rowspan="1" style="text-align:center"><div><span class="expressfee">18212341234</span></div></td><td rowspan="1" style="text-align:center"><div class="cell"><b class="netprice" style="color:#666;">￥89.10</b><br><span class="expressfee">余额支付</span></div></td><td rowspan="1"><div class="business-status" style="text-align:center">undefined<br></div></td><td rowspan="1" style="text-align:center;"><a style="display:block;margin-bottom:5px;" href="/order/virtualorderdetail?order_id=413">订单详情</a></td></tr><tr style="height:10px;"><td style="border-bottom:solid #E1E6F0;border-width:0 0 1px 0;" colspan="10"></td></tr><tr><td><i class="checkbox-common"><input id="153251293495451000" type="checkbox" value="398" name="sub"></i></td><td><div style="font-size: 12px;color: #126AE4;margin-bottom:5px;"><span>订单编号：2018072518020001</span>&nbsp;<span>下单时间：2018-07-25 18:02:14</span></div><div class="product-img"><img src="/upload/goods/14993428741404.jpg"></div><div class="product-infor"><a href="http://b2c.niuteam.cn/goods/goodsinfo?goodsid=86" target="_blank" style="color:#333;">视频下载</a></div></td><td><div class="cell" style="display: inline-block;"><span>100.00元</span></div><div class="cell" style="display: inline-block;float:right;">1件</div></td><td rowspan="1" style="text-align:center"><div class="cell">fenglian100<br><i class="fa fa-television" style="color:#666;"><i></i></i></div></td><td rowspan="1" style="text-align:center"><div><span class="expressfee">15159518777</span></div></td><td rowspan="1" style="text-align:center"><div class="cell"><b class="netprice" style="color:#666;">￥100.00</b><br><span class="expressfee">在线支付</span></div></td><td rowspan="1"><div class="business-status" style="text-align:center">已关闭<br></div></td><td rowspan="1" style="text-align:center;"><a style="display:block;margin-bottom:5px;" href="/order/virtualorderdetail?order_id=398">订单详情</a><a style="display:block;margin-bottom:5px;color:#666666" href="javascript:operation('seller_memo',398)">备注</a><a style="display:block;margin-bottom:5px;color:#ff0000" href="javascript:operation('delete_order',398)">删除订单</a></td></tr><tr style="height:10px;"><td style="border-bottom:solid #E1E6F0;border-width:0 0 1px 0;" colspan="10"></td></tr><tr><td><i class="checkbox-common"><input id="153196630621811000" type="checkbox" value="357" name="sub"></i></td><td><div style="font-size: 12px;color: #126AE4;margin-bottom:5px;"><span>订单编号：2018071910110001</span>&nbsp;<span>下单时间：2018-07-19 10:11:25</span></div><div class="product-img"><img src="/upload/goods/20180718/1b39ba1e861f577e3fcd34f54dbeadae4.jpg"></div><div class="product-infor"><a href="http://b2c.niuteam.cn/goods/goodsinfo?goodsid=153" target="_blank" style="color:#333;">AAA3213</a></div></td><td><div class="cell" style="display: inline-block;"><span>5.00元</span></div><div class="cell" style="display: inline-block;float:right;">1件</div></td><td rowspan="1" style="text-align:center"><div class="cell">ares11<br><i class="fa fa-mobile fa-2x" style="color:#666;"><i></i></i></div></td><td rowspan="1" style="text-align:center"><div><span class="expressfee">18936946991</span></div></td><td rowspan="1" style="text-align:center"><div class="cell"><b class="netprice" style="color:#666;">￥5.00</b><br><span class="expressfee">在线支付</span></div></td><td rowspan="1"><div class="business-status" style="text-align:center">已关闭<br></div></td><td rowspan="1" style="text-align:center;"><a style="display:block;margin-bottom:5px;" href="/order/virtualorderdetail?order_id=357">订单详情</a><a style="display:block;margin-bottom:5px;color:#666666" href="javascript:operation('seller_memo',357)">备注</a><a style="display:block;margin-bottom:5px;color:#ff0000" href="javascript:operation('delete_order',357)">删除订单</a></td></tr><tr style="height:10px;"><td style="border-bottom:solid #E1E6F0;border-width:0 0 1px 0;" colspan="10"></td></tr><tr><td><i class="checkbox-common"><input id="153193387921181000" type="checkbox" value="354" name="sub"></i></td><td><div style="font-size: 12px;color: #126AE4;margin-bottom:5px;"><span>订单编号：2018071901110001</span>&nbsp;<span>下单时间：2018-07-19 01:11:19</span></div><div class="product-img"><img src="/upload/goods/20180718/1b39ba1e861f577e3fcd34f54dbeadae4.jpg"></div><div class="product-infor"><a href="http://b2c.niuteam.cn/goods/goodsinfo?goodsid=153" target="_blank" style="color:#333;">AAA3213</a></div></td><td><div class="cell" style="display: inline-block;"><span>4.50元</span></div><div class="cell" style="display: inline-block;float:right;">1件</div></td><td rowspan="1" style="text-align:center"><div class="cell">niushop1<br><i class="fa fa-television" style="color:#666;"><i></i></i></div></td><td rowspan="1" style="text-align:center"><div><span class="expressfee">18618342234</span></div></td><td rowspan="1" style="text-align:center"><div class="cell"><b class="netprice" style="color:#666;">￥2.50</b><br><span class="expressfee">余额支付</span></div></td><td rowspan="1"><div class="business-status" style="text-align:center">已完成<br></div></td><td rowspan="1" style="text-align:center;"><a style="display:block;margin-bottom:5px;" href="/order/virtualorderdetail?order_id=354">订单详情</a><a style="display:block;margin-bottom:5px;color:#666666" href="javascript:operation('seller_memo',354)">备注</a></td></tr><tr style="height:10px;"><td style="border-bottom:solid #E1E6F0;border-width:0 0 1px 0;" colspan="10"></td></tr><tr><td><i class="checkbox-common"><input id="153193362979761000" type="checkbox" value="353" name="sub"></i></td><td><div style="font-size: 12px;color: #126AE4;margin-bottom:5px;"><span>订单编号：2018071901070001</span>&nbsp;<span>下单时间：2018-07-19 01:07:09</span></div><div class="product-img"><img src="/upload/goods/20180714/15944de900d8591a9b58a310578828c14.jpg"></div><div class="product-infor"><a href="http://b2c.niuteam.cn/goods/goodsinfo?goodsid=149" target="_blank" style="color:#333;">123</a></div></td><td><div class="cell" style="display: inline-block;"><span>4.50元</span></div><div class="cell" style="display: inline-block;float:right;">1件</div></td><td rowspan="1" style="text-align:center"><div class="cell">niushop1<br><i class="fa fa-television" style="color:#666;"><i></i></i></div></td><td rowspan="1" style="text-align:center"><div><span class="expressfee">18618342234</span></div></td><td rowspan="1" style="text-align:center"><div class="cell"><b class="netprice" style="color:#666;">￥2.50</b><br><span class="expressfee">余额支付</span></div></td><td rowspan="1"><div class="business-status" style="text-align:center">已完成<br></div></td><td rowspan="1" style="text-align:center;"><a style="display:block;margin-bottom:5px;" href="/order/virtualorderdetail?order_id=353">订单详情</a><a style="display:block;margin-bottom:5px;color:#666666" href="javascript:operation('seller_memo',353)">备注</a></td></tr><tr style="height:10px;"><td style="border-bottom:solid #E1E6F0;border-width:0 0 1px 0;" colspan="10"></td></tr><tr><td><i class="checkbox-common"><input id="153193339984751000" type="checkbox" value="352" name="sub"></i></td><td><div style="font-size: 12px;color: #126AE4;margin-bottom:5px;"><span>订单编号：2018071901030001</span>&nbsp;<span>下单时间：2018-07-19 01:03:19</span></div><div class="product-img"><img src="/upload/goods/20180714/15944de900d8591a9b58a310578828c14.jpg"></div><div class="product-infor"><a href="http://b2c.niuteam.cn/goods/goodsinfo?goodsid=149" target="_blank" style="color:#333;">123</a></div></td><td><div class="cell" style="display: inline-block;"><span>4.50元</span></div><div class="cell" style="display: inline-block;float:right;">1件</div></td><td rowspan="1" style="text-align:center"><div class="cell">niushop1<br><i class="fa fa-television" style="color:#666;"><i></i></i></div></td><td rowspan="1" style="text-align:center"><div><span class="expressfee">18618342234</span></div></td><td rowspan="1" style="text-align:center"><div class="cell"><b class="netprice" style="color:#666;">￥2.50</b><br><span class="expressfee">余额支付</span></div></td><td rowspan="1"><div class="business-status" style="text-align:center">已完成<br></div></td><td rowspan="1" style="text-align:center;"><a style="display:block;margin-bottom:5px;" href="/order/virtualorderdetail?order_id=352">订单详情</a><a style="display:block;margin-bottom:5px;color:#666666" href="javascript:operation('seller_memo',352)">备注</a></td></tr><tr style="height:10px;"><td style="border-bottom:solid #E1E6F0;border-width:0 0 1px 0;" colspan="10"></td></tr><tr><td><i class="checkbox-common"><input id="153190463425391000" type="checkbox" value="349" name="sub"></i></td><td><div style="font-size: 12px;color: #126AE4;margin-bottom:5px;"><span>订单编号：2018071817030001</span>&nbsp;<span>下单时间：2018-07-18 17:03:54</span></div><div class="product-img"><img src="/upload/goods/20180718/1b39ba1e861f577e3fcd34f54dbeadae4.jpg"></div><div class="product-infor"><a href="http://b2c.niuteam.cn/goods/goodsinfo?goodsid=153" target="_blank" style="color:#333;">AAA3213</a></div></td><td><div class="cell" style="display: inline-block;"><span>4.50元</span></div><div class="cell" style="display: inline-block;float:right;">1件</div></td><td rowspan="1" style="text-align:center"><div class="cell">niushop1<br><i class="fa fa-television" style="color:#666;"><i></i></i></div></td><td rowspan="1" style="text-align:center"><div><span class="expressfee">13265478965</span></div></td><td rowspan="1" style="text-align:center"><div class="cell"><b class="netprice" style="color:#666;">￥4.50</b><br><span class="expressfee">余额支付</span></div></td><td rowspan="1"><div class="business-status" style="text-align:center">已完成<br></div></td><td rowspan="1" style="text-align:center;"><a style="display:block;margin-bottom:5px;" href="/order/virtualorderdetail?order_id=349">订单详情</a><a style="display:block;margin-bottom:5px;color:#666666" href="javascript:operation('seller_memo',349)">备注</a></td></tr></tbody>
  </table>
    </div>

  </section>

</template>

<script>
require('@/assets/style/table.scss')
require('@/assets/style/order/list.scss')

export default {
  name: 'virtualOrder',
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
