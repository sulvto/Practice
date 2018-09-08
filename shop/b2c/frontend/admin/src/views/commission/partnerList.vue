<template>

  <section class="ns-base-section">

    <div style="position:relative;margin:0;">
      <!-- 面包屑导航 -->
            <div class="breadcrumb-nav">
        <a href="index.html">大鵬系統</a>
                  <i class="fa fa-angle-right"></i>
          <a href="/Commission/userAccountList.html">佣金</a>
                  <i class="fa fa-angle-right"></i>
          <!-- 需要加跳转链接用这个：http://showfx.niuteam.cn/admin/Commission/commissionPartnerList -->
          <a href="javascript:;" style="color:#999;">股东分红</a>
              </div>
            <!-- 三级导航菜单 -->

      <div class="right-side-operation">
        <ul>

          <li>
            <a class="nscs-table-handle_green" href="javascript:;" onclick="addBrand()">
              <i class="fa fa-plus-circle"></i>
              &nbsp;添加品牌
            </a>
          </li>

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

  <table class="mytable">
  <tbody><tr>
    <th style="line-height:33px;">
      下单时间：
      <input type="text" id="startDate" class="input-common middle" placeholder="请选择开始日期" onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm:ss'})">
      &nbsp;-&nbsp;
      <input type="text" id="endDate" placeholder="请选择结束日期" class="input-common middle" onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm:ss'})">
      <!-- 更多搜索 -->
      <button class="btn-common-white more-search"><i class="fa fa-chevron-down"></i></button>
      <div class="more-search-container">
        <dl>
          <dt>买家名称：</dt>
          <dd>
            <input id="userName" class="input-common middle" type="text" value="">
          </dd>
        </dl>
        <dl>
          <dt>订单编号：</dt>
          <dd>
            <input id="orderNo" class="input-common middle" type="text" value="">
          </dd>
        </dl>
        <dl>
          <dt>订单状态：</dt>
          <dd>
            <div class="selectric-wrapper selectric-select-common selectric-middle" style="width: 150px;"><div class="selectric-hide-select"><select id="order_status" class="select-common middle" tabindex="-1">
              <option value="">全部</option>
              <option value="0">待付款</option>
              <option value="1">待发货</option>
              <option value="2">待收货</option>
              <option value="3">已收货</option>
              <option value="4">交易成功</option>
              <option value="5">已关闭</option>
              <option value="-1">退款中</option>
              <option value="-2">已退款</option>
            </select></div><div class="selectric"><span class="selectric-label">全部</span><button class="selectric-button">▾</button></div><div class="selectric-items" tabindex="-1"><div class="selectric-scroll"><ul><li data-index="0" class="selected" title="全部">全部</li><li data-index="1" class="" title="待付款">待付款</li><li data-index="2" class="" title="待发货">待发货</li><li data-index="3" class="" title="待收货">待收货</li><li data-index="4" class="" title="已收货">已收货</li><li data-index="5" class="" title="交易成功">交易成功</li><li data-index="6" class="" title="已关闭">已关闭</li><li data-index="7" class="" title="退款中">退款中</li><li data-index="8" class="last" title="已退款">已退款</li></ul></div></div><input class="selectric-input" tabindex="0"></div>
          </dd>
        </dl>
        <dl>
          <dt></dt>
          <dd>
            <button onclick="searchData()" class="btn-common">完成</button>
          </dd>
        </dl>
      </div>
      <button onclick="searchData()" value="搜索" class="btn-common">搜索</button>
    </th>
  </tr>
  </tbody></table>
  <div class="mod-table">
  <div class="mod-table-head">
    <div class="con style0list">
      <table class="table-class">
        <colgroup>
          <col style="width: 20%;">
          <col style="width: 15%;">
          <col style="width: 10%;">
          <col style="width: 10%;">
          <col style="width: 11%;">
          <col style="width: 17%;">
          <col style="width: 17%;">

        </colgroup>
        <thead>
          <tr>
            <th>订单号</th>
            <th>订单金额</th>
            <th>订单状态</th>
            <th>佣金</th>
            <th>买家</th>
            <th>创建时间</th>
            <th>完成时间</th>
          </tr>
        </thead>
        <colgroup>
          <col style="width: 20%;">
          <col style="width: 15%;">
          <col style="width: 10%;">
          <col style="width: 10%;">
          <col style="width: 11%;">
          <col style="width: 17%;">
          <col style="width: 17%;">
        </colgroup>
        <tbody id="tbody"><tr align="center" data-show="1" style="cursor:pointer;" onclick="showOrHideAccordion(&quot;accordiondata0&quot;,this);"><td>2018082410290001</td><td>2228.28</td><td>已关闭</td><td>0</td><td>123123</td><td>2018-08-24 10:29:56</td><td></td></tr><tr class="collapse" style="display:none;" id="accordiondata0"><td colspan="8" style="padding:10px;background-color:#E0E0E0;"><table class="panel-table table-class"><colgroup><col style="width: 35%;"><col style="width: 15%;"><col style="width: 10%;"><col style="width: 14%;"><col style="width: 10%;"><col style="width: 8%;"><col style="width: 8%;"></colgroup><tbody><tr class="title-tr"><td>商品</td><td>商品清单</td><td>商品利润</td><td>商品股东分红比率</td><td>股东佣金比例</td><td>佣金金额</td><td>收益人</td></tr><tr calss="no-rightborder"><td style="border-right:0;" rowspan="1"><div class="product-img"><img src="/upload/goods/1499340287854.jpg"></div><div class="product-infor"><a class="name" href="/wap/Goods/goodsDetail?id=36" target="_blank">Xiaomi/小米 小米电视3s 55英寸 4k壁挂智能液晶平板电视机50 60</a><p class="specification"><span></span></p></div></td><td style="border-left:0px solid #fff;border-right:1px solid #E3E3E3;" rowspan="1"><div class="cell" style="display: inline-block;"><span>2228.28元</span></div><div class="cell" style="display: inline-block;float:right">1件</div></td><td>0.00</td><td>0.00%</td><td>0.00%</td><td>0.00</td><td></td></tr></tbody></table></td></tr><tr align="center" data-show="1" style="cursor:pointer;" onclick="showOrHideAccordion(&quot;accordiondata1&quot;,this);"><td>2018082117310001</td><td>6826.70</td><td>已发货</td><td>0</td><td>s51983</td><td>2018-08-21 17:31:36</td><td></td></tr><tr class="collapse" style="display:none;" id="accordiondata1"><td colspan="8" style="padding:10px;background-color:#E0E0E0;"><table class="panel-table table-class"><colgroup><col style="width: 35%;"><col style="width: 15%;"><col style="width: 10%;"><col style="width: 14%;"><col style="width: 10%;"><col style="width: 8%;"><col style="width: 8%;"></colgroup><tbody><tr class="title-tr"><td>商品</td><td>商品清单</td><td>商品利润</td><td>商品股东分红比率</td><td>股东佣金比例</td><td>佣金金额</td><td>收益人</td></tr><tr calss="no-rightborder"><td style="border-right:0;" rowspan="1"><div class="product-img"><img src="/upload/goods/1499340950904.jpg"></div><div class="product-infor"><a class="name" href="/wap/Goods/goodsDetail?id=39" target="_blank">Apple/苹果 iPhone 7苹果7手机4.7寸7代港版 国行 美版三网4G现货</a><p class="specification"><span></span></p></div></td><td style="border-left:0px solid #fff;border-right:1px solid #E3E3E3;" rowspan="1"><div class="cell" style="display: inline-block;"><span>4273.10元</span></div><div class="cell" style="display: inline-block;float:right">1件</div></td><td>0.00</td><td>0.00%</td><td>0.00%</td><td>0.00</td><td></td></tr><tr calss="no-rightborder"><td style="border-right:0;" rowspan="1"><div class="product-img"><img src="/upload/goods/1499341070954.jpg"></div><div class="product-infor"><a class="name" href="/wap/Goods/goodsDetail?id=40" target="_blank">现货Huawei/华为 Mate 9 双卡全网通4g 全新正品 智能手机 mate9</a><p class="specification"><span></span></p></div></td><td style="border-left:0px solid #fff;border-right:1px solid #E3E3E3;" rowspan="1"><div class="cell" style="display: inline-block;"><span>2553.60元</span></div><div class="cell" style="display: inline-block;float:right">1件</div></td><td>0.00</td><td>0.00%</td><td>0.00%</td><td>0.00</td><td></td></tr></tbody></table></td></tr><tr align="center" data-show="1" style="cursor:pointer;" onclick="showOrHideAccordion(&quot;accordiondata2&quot;,this);"><td>2018082115080001</td><td>284.05</td><td>已完成</td><td>0</td><td>wocesi</td><td>2018-08-21 15:08:32</td><td>2018-08-21 15:12:50</td></tr><tr class="collapse" style="display:none;" id="accordiondata2"><td colspan="8" style="padding:10px;background-color:#E0E0E0;"><table class="panel-table table-class"><colgroup><col style="width: 35%;"><col style="width: 15%;"><col style="width: 10%;"><col style="width: 14%;"><col style="width: 10%;"><col style="width: 8%;"><col style="width: 8%;"></colgroup><tbody><tr class="title-tr"><td>商品</td><td>商品清单</td><td>商品利润</td><td>商品股东分红比率</td><td>股东佣金比例</td><td>佣金金额</td><td>收益人</td></tr><tr calss="no-rightborder"><td style="border-right:0;" rowspan="1"><div class="product-img"><img src="/upload/goods/1499337616564.jpg"></div><div class="product-infor"><a class="name" href="/wap/Goods/goodsDetail?id=24" target="_blank">小狗家用吸尘器大功率小型桶式静音地毯商用强力手持式D-807</a><p class="specification"><span></span></p></div></td><td style="border-left:0px solid #fff;border-right:1px solid #E3E3E3;" rowspan="1"><div class="cell" style="display: inline-block;"><span>284.05元</span></div><div class="cell" style="display: inline-block;float:right">1件</div></td><td>0.00</td><td>0.00%</td><td>0.00%</td><td>0.00</td><td></td></tr></tbody></table></td></tr><tr align="center" data-show="1" style="cursor:pointer;" onclick="showOrHideAccordion(&quot;accordiondata3&quot;,this);"><td>2018082015590001</td><td>90.00</td><td>已完成</td><td>0</td><td>wocesi2</td><td>2018-08-20 15:59:58</td><td>2018-08-20 16:03:01</td></tr><tr class="collapse" style="display:none;" id="accordiondata3"><td colspan="8" style="padding:10px;background-color:#E0E0E0;"><table class="panel-table table-class"><colgroup><col style="width: 35%;"><col style="width: 15%;"><col style="width: 10%;"><col style="width: 14%;"><col style="width: 10%;"><col style="width: 8%;"><col style="width: 8%;"></colgroup><tbody><tr class="title-tr"><td>商品</td><td>商品清单</td><td>商品利润</td><td>商品股东分红比率</td><td>股东佣金比例</td><td>佣金金额</td><td>收益人</td></tr><tr calss="no-rightborder"><td style="border-right:0;" rowspan="1"><div class="product-img"><img src="/upload/goods/14993422181194.jpg"></div><div class="product-infor"><a class="name" href="/wap/Goods/goodsDetail?id=57" target="_blank">ertgewr</a><p class="specification"><span></span></p></div></td><td style="border-left:0px solid #fff;border-right:1px solid #E3E3E3;" rowspan="1"><div class="cell" style="display: inline-block;"><span>90.00元</span></div><div class="cell" style="display: inline-block;float:right">1件</div></td><td>0.00</td><td>0.00%</td><td>0.00%</td><td>0.00</td><td></td></tr></tbody></table></td></tr><tr align="center" data-show="1" style="cursor:pointer;" onclick="showOrHideAccordion(&quot;accordiondata4&quot;,this);"><td>2018082010550001</td><td>150.10</td><td>已完成</td><td>0</td><td>huge</td><td>2018-08-20 10:55:04</td><td>2018-08-20 10:55:59</td></tr><tr class="collapse" style="display:none;" id="accordiondata4"><td colspan="8" style="padding:10px;background-color:#E0E0E0;"><table class="panel-table table-class"><colgroup><col style="width: 35%;"><col style="width: 15%;"><col style="width: 10%;"><col style="width: 14%;"><col style="width: 10%;"><col style="width: 8%;"><col style="width: 8%;"></colgroup><tbody><tr class="title-tr"><td>商品</td><td>商品清单</td><td>商品利润</td><td>商品股东分红比率</td><td>股东佣金比例</td><td>佣金金额</td><td>收益人</td></tr><tr calss="no-rightborder"><td style="border-right:0;" rowspan="1"><div class="product-img"><img src="/upload/goods/1499335523274.jpg"></div><div class="product-infor"><a class="name" href="/wap/Goods/goodsDetail?id=12" target="_blank">西西里男装 夏季潮流男士日系纯色宽松T韩版不规则短袖圆领t恤</a><p class="specification"><span></span></p></div></td><td style="border-left:0px solid #fff;border-right:1px solid #E3E3E3;" rowspan="1"><div class="cell" style="display: inline-block;"><span>150.10元</span></div><div class="cell" style="display: inline-block;float:right">1件</div></td><td>0.00</td><td>0.00%</td><td>0.00%</td><td>0.00</td><td></td></tr></tbody></table></td></tr><tr align="center" data-show="1" style="cursor:pointer;" onclick="showOrHideAccordion(&quot;accordiondata5&quot;,this);"><td>2018081817240001</td><td>169.10</td><td>已完成</td><td>0</td><td>wocesi</td><td>2018-08-18 17:24:21</td><td>2018-08-18 17:31:21</td></tr><tr class="collapse" style="display:none;" id="accordiondata5"><td colspan="8" style="padding:10px;background-color:#E0E0E0;"><table class="panel-table table-class"><colgroup><col style="width: 35%;"><col style="width: 15%;"><col style="width: 10%;"><col style="width: 14%;"><col style="width: 10%;"><col style="width: 8%;"><col style="width: 8%;"></colgroup><tbody><tr class="title-tr"><td>商品</td><td>商品清单</td><td>商品利润</td><td>商品股东分红比率</td><td>股东佣金比例</td><td>佣金金额</td><td>收益人</td></tr><tr calss="no-rightborder"><td style="border-right:0;" rowspan="1"><div class="product-img"><img src="/upload/goods/1499336749404.jpg"></div><div class="product-infor"><a class="name" href="/wap/Goods/goodsDetail?id=19" target="_blank">真皮女包2017夏新款单肩斜跨包H扣鳄鱼纹时尚潮流百搭女士小方包</a><p class="specification"><span></span></p></div></td><td style="border-left:0px solid #fff;border-right:1px solid #E3E3E3;" rowspan="1"><div class="cell" style="display: inline-block;"><span>169.10元</span></div><div class="cell" style="display: inline-block;float:right">1件</div></td><td>0.00</td><td>0.00%</td><td>0.00%</td><td>0.00</td><td></td></tr></tbody></table></td></tr><tr align="center" data-show="1" style="cursor:pointer;" onclick="showOrHideAccordion(&quot;accordiondata6&quot;,this);"><td>2018081513000001</td><td>4888.00</td><td>已关闭</td><td>0</td><td>admin</td><td>2018-08-15 13:00:40</td><td></td></tr><tr class="collapse" style="display:none;" id="accordiondata6"><td colspan="8" style="padding:10px;background-color:#E0E0E0;"><table class="panel-table table-class"><colgroup><col style="width: 35%;"><col style="width: 15%;"><col style="width: 10%;"><col style="width: 14%;"><col style="width: 10%;"><col style="width: 8%;"><col style="width: 8%;"></colgroup><tbody><tr class="title-tr"><td>商品</td><td>商品清单</td><td>商品利润</td><td>商品股东分红比率</td><td>股东佣金比例</td><td>佣金金额</td><td>收益人</td></tr><tr calss="no-rightborder"><td style="border-right:0;" rowspan="1"><div class="product-img"><img src="/upload/goods/20180705/12c1f79313f569cab48b5c38b69a1d9f4.jpg"></div><div class="product-infor"><a class="name" href="/wap/Goods/goodsDetail?id=70" target="_blank">澳大利亚丁戈树红标经典红葡萄酒750ml-副本</a><p class="specification"><span></span></p></div></td><td style="border-left:0px solid #fff;border-right:1px solid #E3E3E3;" rowspan="1"><div class="cell" style="display: inline-block;"><span>900.00元</span></div><div class="cell" style="display: inline-block;float:right">1件</div></td><td>0.00</td><td>0.00%</td><td>0.00%</td><td>0.00</td><td></td></tr><tr calss="no-rightborder"><td style="border-right:0;" rowspan="1"><div class="product-img"><img src="/upload/goods/1499340182834.jpg"></div><div class="product-infor"><a class="name" href="/wap/Goods/goodsDetail?id=35" target="_blank">Sharp/夏普 LCD-70SU665A 70英寸高清4K网络智能液晶平板电视机65</a><p class="specification"><span></span></p></div></td><td style="border-left:0px solid #fff;border-right:1px solid #E3E3E3;" rowspan="1"><div class="cell" style="display: inline-block;"><span>3990.00元</span></div><div class="cell" style="display: inline-block;float:right">1件</div></td><td>0.00</td><td>0.00%</td><td>0.00%</td><td>0.00</td><td></td></tr></tbody></table></td></tr><tr align="center" data-show="1" style="cursor:pointer;" onclick="showOrHideAccordion(&quot;accordiondata7&quot;,this);"><td>2018081422230001</td><td>934.70</td><td>已关闭</td><td>0</td><td>ceshi1</td><td>2018-08-14 22:23:22</td><td></td></tr><tr class="collapse" style="display:none;" id="accordiondata7"><td colspan="8" style="padding:10px;background-color:#E0E0E0;"><table class="panel-table table-class"><colgroup><col style="width: 35%;"><col style="width: 15%;"><col style="width: 10%;"><col style="width: 14%;"><col style="width: 10%;"><col style="width: 8%;"><col style="width: 8%;"></colgroup><tbody><tr class="title-tr"><td>商品</td><td>商品清单</td><td>商品利润</td><td>商品股东分红比率</td><td>股东佣金比例</td><td>佣金金额</td><td>收益人</td></tr><tr calss="no-rightborder"><td style="border-right:0;" rowspan="1"><div class="product-img"><img src="/upload/goods/1499334986194.jpg"></div><div class="product-infor"><a class="name" href="/wap/Goods/goodsDetail?id=9" target="_blank">DOMO男士高端衬衣潮男雅痞英伦风大尖领湖蓝红色波点衬衣个性达人</a><p class="specification"><span></span></p></div></td><td style="border-left:0px solid #fff;border-right:1px solid #E3E3E3;" rowspan="1"><div class="cell" style="display: inline-block;"><span>936.70元</span></div><div class="cell" style="display: inline-block;float:right">1件</div></td><td>0.00</td><td>0.00%</td><td>0.00%</td><td>0.00</td><td></td></tr></tbody></table></td></tr><tr align="center" data-show="1" style="cursor:pointer;" onclick="showOrHideAccordion(&quot;accordiondata8&quot;,this);"><td>2018081422140001</td><td>936.70</td><td>已关闭</td><td>0</td><td>ceshi1</td><td>2018-08-14 22:14:46</td><td></td></tr><tr class="collapse" style="display:none;" id="accordiondata8"><td colspan="8" style="padding:10px;background-color:#E0E0E0;"><table class="panel-table table-class"><colgroup><col style="width: 35%;"><col style="width: 15%;"><col style="width: 10%;"><col style="width: 14%;"><col style="width: 10%;"><col style="width: 8%;"><col style="width: 8%;"></colgroup><tbody><tr class="title-tr"><td>商品</td><td>商品清单</td><td>商品利润</td><td>商品股东分红比率</td><td>股东佣金比例</td><td>佣金金额</td><td>收益人</td></tr><tr calss="no-rightborder"><td style="border-right:0;" rowspan="1"><div class="product-img"><img src="/upload/goods/1499334986194.jpg"></div><div class="product-infor"><a class="name" href="/wap/Goods/goodsDetail?id=9" target="_blank">DOMO男士高端衬衣潮男雅痞英伦风大尖领湖蓝红色波点衬衣个性达人</a><p class="specification"><span></span></p></div></td><td style="border-left:0px solid #fff;border-right:1px solid #E3E3E3;" rowspan="1"><div class="cell" style="display: inline-block;"><span>936.70元</span></div><div class="cell" style="display: inline-block;float:right">1件</div></td><td>0.00</td><td>0.00%</td><td>0.00%</td><td>0.00</td><td></td></tr></tbody></table></td></tr><tr align="center" data-show="1" style="cursor:pointer;" onclick="showOrHideAccordion(&quot;accordiondata9&quot;,this);"><td>2018081416440001</td><td>0.00</td><td>已完成</td><td>0</td><td>qpchina</td><td>2018-08-14 16:44:16</td><td>2018-08-14 16:44:16</td></tr><tr class="collapse" style="display:none;" id="accordiondata9"><td colspan="8" style="padding:10px;background-color:#E0E0E0;"><table class="panel-table table-class"><colgroup><col style="width: 35%;"><col style="width: 15%;"><col style="width: 10%;"><col style="width: 14%;"><col style="width: 10%;"><col style="width: 8%;"><col style="width: 8%;"></colgroup><tbody><tr class="title-tr"><td>商品</td><td>商品清单</td><td>商品利润</td><td>商品股东分红比率</td><td>股东佣金比例</td><td>佣金金额</td><td>收益人</td></tr><tr calss="no-rightborder"><td style="border-right:0;" rowspan="1"><div class="product-img"><img src="/upload/goods/20180814/906faf346903afc2e8e0536bde8e5ebf4.jpg"></div><div class="product-infor"><a class="name" href="/wap/Goods/goodsDetail?id=75" target="_blank">xxxxx</a><p class="specification"><span></span></p></div></td><td style="border-left:0px solid #fff;border-right:1px solid #E3E3E3;" rowspan="1"><div class="cell" style="display: inline-block;"><span>0.00元</span></div><div class="cell" style="display: inline-block;float:right">1件</div></td><td>0.00</td><td>0.00%</td><td>0.00%</td><td>0.00</td><td></td></tr></tbody></table></td></tr><tr align="center" data-show="1" style="cursor:pointer;" onclick="showOrHideAccordion(&quot;accordiondata10&quot;,this);"><td>2018081416400002</td><td>0.00</td><td>已完成</td><td>0</td><td>qpchina</td><td>2018-08-14 16:40:27</td><td>2018-08-14 16:40:27</td></tr><tr class="collapse" style="display:none;" id="accordiondata10"><td colspan="8" style="padding:10px;background-color:#E0E0E0;"><table class="panel-table table-class"><colgroup><col style="width: 35%;"><col style="width: 15%;"><col style="width: 10%;"><col style="width: 14%;"><col style="width: 10%;"><col style="width: 8%;"><col style="width: 8%;"></colgroup><tbody><tr class="title-tr"><td>商品</td><td>商品清单</td><td>商品利润</td><td>商品股东分红比率</td><td>股东佣金比例</td><td>佣金金额</td><td>收益人</td></tr><tr calss="no-rightborder"><td style="border-right:0;" rowspan="1"><div class="product-img"><img src="/upload/goods/20180814/906faf346903afc2e8e0536bde8e5ebf4.jpg"></div><div class="product-infor"><a class="name" href="/wap/Goods/goodsDetail?id=75" target="_blank">xxxxx</a><p class="specification"><span></span></p></div></td><td style="border-left:0px solid #fff;border-right:1px solid #E3E3E3;" rowspan="1"><div class="cell" style="display: inline-block;"><span>0.00元</span></div><div class="cell" style="display: inline-block;float:right">1件</div></td><td>0.00</td><td>0.00%</td><td>0.00%</td><td>0.00</td><td></td></tr></tbody></table></td></tr><tr align="center" data-show="1" style="cursor:pointer;" onclick="showOrHideAccordion(&quot;accordiondata11&quot;,this);"><td>2018081416400001</td><td>0.00</td><td>已完成</td><td>0</td><td>qpchina</td><td>2018-08-14 16:40:16</td><td>2018-08-14 16:40:16</td></tr><tr class="collapse" style="display:none;" id="accordiondata11"><td colspan="8" style="padding:10px;background-color:#E0E0E0;"><table class="panel-table table-class"><colgroup><col style="width: 35%;"><col style="width: 15%;"><col style="width: 10%;"><col style="width: 14%;"><col style="width: 10%;"><col style="width: 8%;"><col style="width: 8%;"></colgroup><tbody><tr class="title-tr"><td>商品</td><td>商品清单</td><td>商品利润</td><td>商品股东分红比率</td><td>股东佣金比例</td><td>佣金金额</td><td>收益人</td></tr><tr calss="no-rightborder"><td style="border-right:0;" rowspan="1"><div class="product-img"><img src="/upload/goods/20180814/906faf346903afc2e8e0536bde8e5ebf4.jpg"></div><div class="product-infor"><a class="name" href="/wap/Goods/goodsDetail?id=75" target="_blank">xxxxx</a><p class="specification"><span></span></p></div></td><td style="border-left:0px solid #fff;border-right:1px solid #E3E3E3;" rowspan="1"><div class="cell" style="display: inline-block;"><span>0.00元</span></div><div class="cell" style="display: inline-block;float:right">1件</div></td><td>0.00</td><td>0.00%</td><td>0.00%</td><td>0.00</td><td></td></tr></tbody></table></td></tr><tr align="center" data-show="1" style="cursor:pointer;" onclick="showOrHideAccordion(&quot;accordiondata12&quot;,this);"><td>2018081416390003</td><td>0.00</td><td>已完成</td><td>0</td><td>qpchina</td><td>2018-08-14 16:39:45</td><td>2018-08-14 16:39:45</td></tr><tr class="collapse" style="display:none;" id="accordiondata12"><td colspan="8" style="padding:10px;background-color:#E0E0E0;"><table class="panel-table table-class"><colgroup><col style="width: 35%;"><col style="width: 15%;"><col style="width: 10%;"><col style="width: 14%;"><col style="width: 10%;"><col style="width: 8%;"><col style="width: 8%;"></colgroup><tbody><tr class="title-tr"><td>商品</td><td>商品清单</td><td>商品利润</td><td>商品股东分红比率</td><td>股东佣金比例</td><td>佣金金额</td><td>收益人</td></tr><tr calss="no-rightborder"><td style="border-right:0;" rowspan="1"><div class="product-img"><img src="/upload/goods/20180814/906faf346903afc2e8e0536bde8e5ebf4.jpg"></div><div class="product-infor"><a class="name" href="/wap/Goods/goodsDetail?id=75" target="_blank">xxxxx</a><p class="specification"><span></span></p></div></td><td style="border-left:0px solid #fff;border-right:1px solid #E3E3E3;" rowspan="1"><div class="cell" style="display: inline-block;"><span>0.00元</span></div><div class="cell" style="display: inline-block;float:right">1件</div></td><td>0.00</td><td>0.00%</td><td>0.00%</td><td>0.00</td><td></td></tr></tbody></table></td></tr><tr align="center" data-show="1" style="cursor:pointer;" onclick="showOrHideAccordion(&quot;accordiondata13&quot;,this);"><td>2018081416390002</td><td>0.00</td><td>已完成</td><td>0</td><td>qpchina</td><td>2018-08-14 16:39:36</td><td>2018-08-14 16:39:36</td></tr><tr class="collapse" style="display:none;" id="accordiondata13"><td colspan="8" style="padding:10px;background-color:#E0E0E0;"><table class="panel-table table-class"><colgroup><col style="width: 35%;"><col style="width: 15%;"><col style="width: 10%;"><col style="width: 14%;"><col style="width: 10%;"><col style="width: 8%;"><col style="width: 8%;"></colgroup><tbody><tr class="title-tr"><td>商品</td><td>商品清单</td><td>商品利润</td><td>商品股东分红比率</td><td>股东佣金比例</td><td>佣金金额</td><td>收益人</td></tr><tr calss="no-rightborder"><td style="border-right:0;" rowspan="1"><div class="product-img"><img src="/upload/goods/20180814/906faf346903afc2e8e0536bde8e5ebf4.jpg"></div><div class="product-infor"><a class="name" href="/wap/Goods/goodsDetail?id=75" target="_blank">xxxxx</a><p class="specification"><span></span></p></div></td><td style="border-left:0px solid #fff;border-right:1px solid #E3E3E3;" rowspan="1"><div class="cell" style="display: inline-block;"><span>0.00元</span></div><div class="cell" style="display: inline-block;float:right">1件</div></td><td>0.00</td><td>0.00%</td><td>0.00%</td><td>0.00</td><td></td></tr></tbody></table></td></tr></tbody>
      </table>
    </div>
  </div>
  </div>
    </div>

  </section>
</template>
