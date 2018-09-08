<template>

  <section class="ns-base-section">

    <div style="position:relative;margin:0;">
      <!-- 面包屑导航 -->
            <div class="breadcrumb-nav">
        <a href="http://b2c.niuteam.cn/admin.html">单商户B2C</a>
                  <i class="fa fa-angle-right"></i>
          <a href="/order/orderlist.html">订单</a>
                  <i class="fa fa-angle-right"></i>
          <!-- 需要加跳转链接用这个：http://b2c.niuteam.cn/admin/order/virtualorderlist -->
          <a href="javascript:;" style="color:#999;">虚拟订单</a>
              </div>
            <!-- 三级导航菜单 -->

                <nav class="ns-third-menu">
          <ul>
                        <li class="selected" onclick="location.href='/order/virtualorderlist.html';">全部</li>
                          <li onclick="location.href='/order/virtualorderlist.html?status=0';">待付款</li>
                          <li onclick="location.href='/order/virtualorderlist.html?status=6';">已付款</li>
                          <li onclick="location.href='/order/virtualorderlist.html?status=4';">已完成</li>
                          <li onclick="location.href='/order/virtualorderlist.html?status=5';">已关闭</li>
                      </ul>
        </nav>

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
  components: {}
}
</script>
