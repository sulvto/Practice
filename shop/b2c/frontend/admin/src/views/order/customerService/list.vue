<template>

  <section class="ns-base-section">

    <div style="position:relative;margin:0;">
      <!-- 面包屑导航 -->
            <div class="breadcrumb-nav">
        <a href="http://b2c.niuteam.cn/admin.html">单商户B2C</a>
                  <i class="fa fa-angle-right"></i>
          <a href="/order/orderlist.html">订单</a>
                  <i class="fa fa-angle-right"></i>
          <!-- 需要加跳转链接用这个：http://b2c.niuteam.cn/admin/Order/customerServiceList -->
          <a href="javascript:;" style="color:#999;">售后服务</a>
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
                                    <h4>操作提示</h4>
                  <p>售后服务</p>
                  <hr>
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

  <div>
  <table class="mytable select">
    <tbody><tr>
      <th align="left">
        <button onclick="dataExcel()" class="btn-common">导出数据</button>

        <a class="btn-common-white" id="PrintOrder" href="javascript:;">
          <i class="fa fa-print"></i>
          <span>打印订单</span>
        </a>
      </th>
      <th style="position: relative;">
        <span>下单时间：</span>
        <input type="text" id="startDate" class="input-common middle" placeholder="请选择开始日期" onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm:ss'})">
        &nbsp;-&nbsp;
        <input type="text" id="endDate" placeholder="请选择结束日期" class="input-common middle" onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm:ss'})">
        <button onclick="searchData()" class="btn-common">搜索</button>
      </th>
    </tr>
  </tbody></table>

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
        <th>操作</th>
      </tr>
    </thead>
    <tbody><tr><td rowspan="1"><i class="checkbox-common"><input id="undefined" type="checkbox" value="463" name="sub"></i></td><td><div style="font-size: 12px;color: #126AE4;margin-bottom:5px;"><span>订单编号：2018080913460001</span>&nbsp;<span>下单时间：2018-08-09 14:19:10</span></div><div class="product-img"><img src="/upload/goods/20180718/faf7a70e656bf2dadea2e1e6ceff2f714.jpg"></div><div class="product-infor"><a href="http://b2c.niuteam.cn/goods/goodsinfo?goodsid=161" target="_blank" style="color:#333;">TV1233213-副本</a><p class="specification" style="margin-bottom: 0px;"><span style="color:#8e8c8c;font-size:12px;">5.0 3G </span></p></div></td><td><div class="cell" style="display: inline-block;"><span>0.00元</span></div><div class="cell" style="display: inline-block;float:right;">1件</div><a href="/order/ordercustomerdetail?id=10&amp;itemid=497" style="margin:5px 0 10px 0;display:block;">退款已成功</a></td><td rowspan="1" style="text-align:center"><div class="cell"><b class="netprice" style="color: #FF6600;font-size: 14px;font-weight: normal;">0.00</b><br><span class="expressfee">积分兑换</span></div></td><td rowspan="1" style="text-align:center"><div style="text-align:left;"><span class="expressfee">李黑帅</span><br><span class="expressfee">18702335693</span><br><span class="expressfee">广东省&nbsp;深圳市&nbsp;宝安区&nbsp;锦华大厦</span></div></td><td rowspan="1" style="text-align:center"><div class="cell">zhuzhu<br><i class="fa fa-television" style="color:#666;"><i></i></i></div></td><td rowspan="1"><div class="business-status" style="text-align:center">退款已成功<br></div></td><td rowspan="1" style="text-align:center;"><a style="display:block;margin-bottom:5px;" href="/order/orderdetail?order_id=463">订单详情</a></td></tr><tr><td rowspan="1"><i class="checkbox-common"><input id="undefined" type="checkbox" value="441" name="sub"></i></td><td><div style="font-size: 12px;color: #126AE4;margin-bottom:5px;"><span>订单编号：2018080610270001</span>&nbsp;<span>下单时间：2018-08-06 11:40:47</span></div><div class="product-img"><img src="/upload/goods/20180606/86aa78290cda8fdf59dca5694caa32284.jpg"></div><div class="product-infor"><a href="http://b2c.niuteam.cn/goods/goodsinfo?goodsid=73" target="_blank" style="color:#333;">宝格丽（BVLGARI） 宝格丽大吉岭茶男士淡香水浓情版 100ml</a></div></td><td><div class="cell" style="display: inline-block;"><span>489.78元</span></div><div class="cell" style="display: inline-block;float:right;">1件</div><a href="/order/ordercustomerdetail?id=9&amp;itemid=471" style="margin:5px 0 10px 0;display:block;">退款申请不通过</a></td><td rowspan="1" style="text-align:center"><div class="cell"><b class="netprice" style="color: #FF6600;font-size: 14px;font-weight: normal;">489.78</b><br><span class="expressfee">余额支付</span></div></td><td rowspan="1" style="text-align:center"><div style="text-align:left;"><span class="expressfee">11111</span><br><span class="expressfee">13111111111</span><br><span class="expressfee">广东省&nbsp;广州市&nbsp;东山区&nbsp;21313123</span></div></td><td rowspan="1" style="text-align:center"><div class="cell">niushop1<br><i class="fa fa-television" style="color:#666;"><i></i></i></div></td><td rowspan="1"><div class="business-status" style="text-align:center">退款申请不通过<br></div></td><td rowspan="1" style="text-align:center;"><a style="display:block;margin-bottom:5px;" href="/order/orderdetail?order_id=441">订单详情</a></td></tr><tr><td rowspan="1"><i class="checkbox-common"><input id="undefined" type="checkbox" value="396" name="sub"></i></td><td><div style="font-size: 12px;color: #126AE4;margin-bottom:5px;"><span>订单编号：2018072511070001</span>&nbsp;<span>下单时间：2018-08-03 14:26:04</span></div><div class="product-img"><img src="/upload/goods/14993418601114.jpg"></div><div class="product-infor"><a href="http://b2c.niuteam.cn/goods/goodsinfo?goodsid=46" target="_blank" style="color:#333;">Lenovo/联想Yoga BOOK WiFi平板二合一超薄笔记本电脑yoga book</a></div></td><td><div class="cell" style="display: inline-block;"><span>5299.20元</span></div><div class="cell" style="display: inline-block;float:right;">1件</div><a href="/order/ordercustomerdetail?id=8&amp;itemid=422" style="margin:5px 0 10px 0;display:block;">等待买家退货</a></td><td rowspan="1" style="text-align:center"><div class="cell"><b class="netprice" style="color: #FF6600;font-size: 14px;font-weight: normal;">5299.20</b><br><span class="expressfee">线下支付</span></div></td><td rowspan="1" style="text-align:center"><div style="text-align:left;"><span class="expressfee">123</span><br><span class="expressfee">15878907890</span><br><span class="expressfee">海南省&nbsp;海口市&nbsp;秀英区&nbsp;123</span></div></td><td rowspan="1" style="text-align:center"><div class="cell">admin<br><i class="fa fa-television" style="color:#666;"><i></i></i></div></td><td rowspan="1"><div class="business-status" style="text-align:center">等待买家退货<br></div></td><td rowspan="1" style="text-align:center;"><a style="display:block;margin-bottom:5px;" href="/order/orderdetail?order_id=396">订单详情</a></td></tr><tr><td rowspan="1"><i class="checkbox-common"><input id="undefined" type="checkbox" value="396" name="sub"></i></td><td><div style="font-size: 12px;color: #126AE4;margin-bottom:5px;"><span>订单编号：2018072511070001</span>&nbsp;<span>下单时间：2018-08-02 17:39:28</span></div><div class="product-img"><img src="/upload/goods/14993414301044.jpg"></div><div class="product-infor"><a href="http://b2c.niuteam.cn/goods/goodsinfo?goodsid=44" target="_blank" style="color:#333;">正品现货送电源64G卡蓝牙Huawei/华为 Mate 9全网通智能手机mate9</a></div></td><td><div class="cell" style="display: inline-block;"><span>1132.20元</span></div><div class="cell" style="display: inline-block;float:right;">1件</div><a href="/order/ordercustomerdetail?id=7&amp;itemid=420" style="margin:5px 0 10px 0;display:block;">退款申请不通过</a></td><td rowspan="1" style="text-align:center"><div class="cell"><b class="netprice" style="color: #FF6600;font-size: 14px;font-weight: normal;">1132.20</b><br><span class="expressfee">线下支付</span></div></td><td rowspan="1" style="text-align:center"><div style="text-align:left;"><span class="expressfee">123</span><br><span class="expressfee">15878907890</span><br><span class="expressfee">海南省&nbsp;海口市&nbsp;秀英区&nbsp;123</span></div></td><td rowspan="1" style="text-align:center"><div class="cell">admin<br><i class="fa fa-television" style="color:#666;"><i></i></i></div></td><td rowspan="1"><div class="business-status" style="text-align:center">退款申请不通过<br></div></td><td rowspan="1" style="text-align:center;"><a style="display:block;margin-bottom:5px;" href="/order/orderdetail?order_id=396">订单详情</a></td></tr><tr><td rowspan="1"><i class="checkbox-common"><input id="undefined" type="checkbox" value="424" name="sub"></i></td><td><div style="font-size: 12px;color: #126AE4;margin-bottom:5px;"><span>订单编号：2018080215420001</span>&nbsp;<span>下单时间：2018-08-02 16:46:51</span></div><div class="product-img"><img src="/upload/goods/14993428741404.jpg"></div><div class="product-infor"><a href="http://b2c.niuteam.cn/goods/goodsinfo?goodsid=54" target="_blank" style="color:#333;">home指纹识别 苹果6s按键贴iphone7plus按键贴5s手机配件可爱卡通</a><p class="specification" style="margin-bottom: 0px;"><span style="color:#8e8c8c;font-size:12px;">粉色 </span></p></div></td><td><div class="cell" style="display: inline-block;"><span>26.10元</span></div><div class="cell" style="display: inline-block;float:right;">1件</div><a href="/order/ordercustomerdetail?id=6&amp;itemid=453" style="margin:5px 0 10px 0;display:block;">等待买家退货</a></td><td rowspan="1" style="text-align:center"><div class="cell"><b class="netprice" style="color: #FF6600;font-size: 14px;font-weight: normal;">26.10</b><br><span class="expressfee">余额支付</span></div></td><td rowspan="1" style="text-align:center"><div style="text-align:left;"><span class="expressfee">123</span><br><span class="expressfee">18770015555</span><br><span>121</span><br><span class="expressfee">海南省&nbsp;海口市&nbsp;龙华区&nbsp;12333</span></div></td><td rowspan="1" style="text-align:center"><div class="cell">111<br><i class="fa fa-television" style="color:#666;"><i></i></i></div></td><td rowspan="1"><div class="business-status" style="text-align:center">等待买家退货<br></div></td><td rowspan="1" style="text-align:center;"><a style="display:block;margin-bottom:5px;" href="/order/orderdetail?order_id=424">订单详情</a></td></tr><tr><td rowspan="1"><i class="checkbox-common"><input id="undefined" type="checkbox" value="424" name="sub"></i></td><td><div style="font-size: 12px;color: #126AE4;margin-bottom:5px;"><span>订单编号：2018080215420001</span>&nbsp;<span>下单时间：2018-08-02 16:46:29</span></div><div class="product-img"><img src="/upload/goods/20180606/b067908b43d62fd1d10dd3272515001c4.jpg"></div><div class="product-infor"><a href="http://b2c.niuteam.cn/goods/goodsinfo?goodsid=72" target="_blank" style="color:#333;">20180606【正宗三华李】+果实饱满 现摘现发+1份2斤装（±0.2）</a></div></td><td><div class="cell" style="display: inline-block;"><span>14.22元</span></div><div class="cell" style="display: inline-block;float:right;">1件</div><a href="/order/ordercustomerdetail?id=5&amp;itemid=452" style="margin:5px 0 10px 0;display:block;">等待买家退货</a></td><td rowspan="1" style="text-align:center"><div class="cell"><b class="netprice" style="color: #FF6600;font-size: 14px;font-weight: normal;">14.22</b><br><span class="expressfee">余额支付</span></div></td><td rowspan="1" style="text-align:center"><div style="text-align:left;"><span class="expressfee">123</span><br><span class="expressfee">18770015555</span><br><span>121</span><br><span class="expressfee">海南省&nbsp;海口市&nbsp;龙华区&nbsp;12333</span></div></td><td rowspan="1" style="text-align:center"><div class="cell">111<br><i class="fa fa-television" style="color:#666;"><i></i></i></div></td><td rowspan="1"><div class="business-status" style="text-align:center">等待买家退货<br></div></td><td rowspan="1" style="text-align:center;"><a style="display:block;margin-bottom:5px;" href="/order/orderdetail?order_id=424">订单详情</a></td></tr><tr><td rowspan="1"><i class="checkbox-common"><input id="undefined" type="checkbox" value="185" name="sub"></i></td><td><div style="font-size: 12px;color: #126AE4;margin-bottom:5px;"><span>订单编号：2018061310020001</span>&nbsp;<span>下单时间：2018-06-13 10:10:23</span></div><div class="product-img"><img src="/upload/goods/20180609/2e237a9ea4a110ddbd3192be7f977c064.png"></div><div class="product-infor"><a href="http://b2c.niuteam.cn/goods/goodsinfo?goodsid=78" target="_blank" style="color:#333;">456</a><p class="specification" style="margin-bottom: 0px;"><span style="color:#8e8c8c;font-size:12px;">蓝色 </span></p></div></td><td><div class="cell" style="display: inline-block;"><span>228.00元</span></div><div class="cell" style="display: inline-block;float:right;">1件</div><a href="/order/ordercustomerdetail?id=4&amp;itemid=212" style="margin:5px 0 10px 0;display:block;">等待买家退货</a></td><td rowspan="1" style="text-align:center"><div class="cell"><b class="netprice" style="color: #FF6600;font-size: 14px;font-weight: normal;">228.00</b><br><span class="expressfee">线下支付</span></div></td><td rowspan="1" style="text-align:center"><div style="text-align:left;"><span class="expressfee">123</span><br><span class="expressfee">15878907890</span><br><span class="expressfee">海南省&nbsp;海口市&nbsp;秀英区&nbsp;123</span></div></td><td rowspan="1" style="text-align:center"><div class="cell">admin<br><i class="fa fa-television" style="color:#666;"><i></i></i></div></td><td rowspan="1"><div class="business-status" style="text-align:center">等待买家退货<br></div></td><td rowspan="1" style="text-align:center;"><a style="display:block;margin-bottom:5px;" href="/order/orderdetail?order_id=185">订单详情</a></td></tr><tr><td rowspan="1"><i class="checkbox-common"><input id="undefined" type="checkbox" value="113" name="sub"></i></td><td><div style="font-size: 12px;color: #126AE4;margin-bottom:5px;"><span>订单编号：2018060412040001</span>&nbsp;<span>下单时间：2018-06-04 12:05:48</span></div><div class="product-img"><img src="/upload/goods/149933176944.jpg"></div><div class="product-infor"><a href="http://b2c.niuteam.cn/goods/goodsinfo?goodsid=2" target="_blank" style="color:#333;">宏辉果蔬 苹果 烟台红富士 12个 单果约75mm 总重约2.1kg 新鲜水果</a></div></td><td><div class="cell" style="display: inline-block;"><span>12.45元</span></div><div class="cell" style="display: inline-block;float:right;">1件</div><a href="/order/ordercustomerdetail?id=3&amp;itemid=130" style="margin:5px 0 10px 0;display:block;">等待买家退货</a></td><td rowspan="1" style="text-align:center"><div class="cell"><b class="netprice" style="color: #FF6600;font-size: 14px;font-weight: normal;">12.45</b><br><span class="expressfee">线下支付</span></div></td><td rowspan="1" style="text-align:center"><div style="text-align:left;"><span class="expressfee">mimi</span><br><span class="expressfee">15347200202</span><br><span class="expressfee">湖北省&nbsp;恩施土家族苗族自治州&nbsp;宣恩县&nbsp;不知道</span></div></td><td rowspan="1" style="text-align:center"><div class="cell">bjbaidu<br><i class="fa fa-television" style="color:#666;"><i></i></i></div></td><td rowspan="1"><div class="business-status" style="text-align:center">等待买家退货<br></div></td><td rowspan="1" style="text-align:center;"><a style="display:block;margin-bottom:5px;" href="/order/orderdetail?order_id=113">订单详情</a></td></tr><tr><td rowspan="1"><i class="checkbox-common"><input id="undefined" type="checkbox" value="63" name="sub"></i></td><td><div style="font-size: 12px;color: #126AE4;margin-bottom:5px;"><span>订单编号：2018053112040001</span>&nbsp;<span>下单时间：2018-05-31 12:20:29</span></div><div class="product-img"><img src="/upload/goods/14993420691164.jpg"></div><div class="product-infor"><a href="http://b2c.niuteam.cn/goods/goodsinfo?goodsid=48" target="_blank" style="color:#333;">Asus/华硕 X540 X540LJ4005 酷睿i3轻薄独显15.6寸手提笔记本电脑</a><p class="specification" style="margin-bottom: 0px;"><span style="color:#8e8c8c;font-size:12px;">玫瑰金 </span></p></div></td><td><div class="cell" style="display: inline-block;"><span>5410.00元</span></div><div class="cell" style="display: inline-block;float:right;">1件</div><a href="/order/ordercustomerdetail?id=2&amp;itemid=73" style="margin:5px 0 10px 0;display:block;">退款已成功</a></td><td rowspan="1" style="text-align:center"><div class="cell"><b class="netprice" style="color: #FF6600;font-size: 14px;font-weight: normal;">4410.00</b><br><span class="expressfee">线下支付</span></div></td><td rowspan="1" style="text-align:center"><div style="text-align:left;"><span class="expressfee">测试</span><br><span class="expressfee">13939000000</span><br><span class="expressfee">陕西省&nbsp;安康市&nbsp;旬阳县&nbsp;11111111</span></div></td><td rowspan="1" style="text-align:center"><div class="cell">dodo123<br><i class="fa fa-television" style="color:#666;"><i></i></i></div></td><td rowspan="1"><div class="business-status" style="text-align:center">退款已成功<br></div></td><td rowspan="1" style="text-align:center;"><a style="display:block;margin-bottom:5px;" href="/order/orderdetail?order_id=63">订单详情</a></td></tr><tr><td rowspan="1"><i class="checkbox-common"><input id="undefined" type="checkbox" value="6" name="sub"></i></td><td><div style="font-size: 12px;color: #126AE4;margin-bottom:5px;"><span>订单编号：2018052711040001</span>&nbsp;<span>下单时间：2018-05-27 11:55:39</span></div><div class="product-img"><img src="/upload/goods/14993428741404.jpg"></div><div class="product-infor"><a href="http://b2c.niuteam.cn/goods/goodsinfo?goodsid=59" target="_blank" style="color:#333;">可乐多</a></div></td><td><div class="cell" style="display: inline-block;"><span>130.00元</span></div><div class="cell" style="display: inline-block;float:right;">1件</div><a href="/order/ordercustomerdetail?id=1&amp;itemid=6" style="margin:5px 0 10px 0;display:block;">退款已成功</a></td><td rowspan="1" style="text-align:center"><div class="cell"><b class="netprice" style="color: #FF6600;font-size: 14px;font-weight: normal;">130.00</b><br><span class="expressfee">线下支付</span></div></td><td rowspan="1" style="text-align:center"><div style="text-align:left;"><span class="expressfee">李强</span><br><span class="expressfee">15011745643</span><br><span class="expressfee">广东省&nbsp;广州市&nbsp;东山区&nbsp;天天89号</span></div></td><td rowspan="1" style="text-align:center"><div class="cell">小强<br><i class="fa fa-television" style="color:#666;"><i></i></i></div></td><td rowspan="1"><div class="business-status" style="text-align:center">退款已成功<br></div></td><td rowspan="1" style="text-align:center;"><a style="display:block;margin-bottom:5px;" href="/order/orderdetail?order_id=6">订单详情</a></td></tr></tbody>
  </table>
  </div>

    </div>

  </section>

</template>
