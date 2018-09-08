<template>
  <section class="ns-base-section">



    <div style="position:relative;margin:0;">
      <!-- 面包屑导航 -->
            <div class="breadcrumb-nav">
        <a href="http://showfx.niuteam.cn/admin.html"></a>
                  <i class="fa fa-angle-right"></i>
          <a href="http://showfx.niuteam.cn/admin/promotion/coupontypelist.html">营销</a>
                  <i class="fa fa-angle-right"></i>
          <!-- 需要加跳转链接用这个：http://showfx.niuteam.cn/admin/tuangou/tuangouList -->
          <a href="javascript:;" style="color:#999;">拼团设置</a>
              </div>
            <!-- 三级导航菜单 -->

                <nav class="ns-third-menu">
          <ul>
                        <li onclick="location.href='http://showfx.niuteam.cn/admin/tuangou/pintuanlist.html';">拼团列表</li>
                          <li class="selected" onclick="location.href='http://showfx.niuteam.cn/admin/tuangou/tuangouList.html';">拼团设置</li>
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

    <table class="mytable">
    <tbody><tr>
    <th style="line-height:33px;">
      创建时间：
      <input type="text" id="startDate" class="input-common middle" placeholder="请选择开始日期" onclick="WdatePicker()">
      &nbsp;-&nbsp;
      <input type="text" id="endDate" placeholder="请选择结束日期" class="input-common middle" onclick="WdatePicker()">
      商品名：<input id="goods_name" class="input-common middle" type="text" value="">
      <button class="btn-common" onclick="searchData()">搜索</button>
    </th>
    </tr>
    </tbody></table>
    <div id="myTabContent" class="tab-content">
    <div class="tab-pane active">
    <table class="table-class" border="0">
      <colgroup>
        <col style="width: 2%;">
        <col style="width: 24%;">
        <col style="width: 9%;">
        <col style="width: 9%;">
        <col style="width: 10%;">
        <col style="width: 10%;">
        <col style="width: 10%;">
        <col style="width: 16%;">
        <col style="width: 10%;">
      </colgroup>
      <tbody>
        <tr class="table-title">
          <th>
            <i class="checkbox-common">
              <input onclick="CheckAll(this)" type="checkbox" id="chek_all">
            </i>
          </th>
          <th>商品名称</th>
          <th align="right">单价(元)</th>
          <th align="right">活动价(元)</th>
          <th>是否拼团</th>
          <th>拼团类型</th>
          <th>拼团价格</th>
          <th>创建时间</th>
          <th>操作</th>
        </tr>
      </tbody>
      <tbody id="productTbody" style="border: 0;"><tr><td align="center"><i class="checkbox-common"><input value="79" name="sub" data-state="1" type="checkbox"></i></td><td colspan="1"><div><a class="a-pro-view-img" href="http://showfx.niuteam.cn/goods/goodsinfo?goodsid=79" target="_blank" style="height:70px;line-height:70px;text-align:center;"><img class="thumbnail-img" src="/upload/goods/20180904/ff9d6c769dd2f7c69c63e98f67b618374.png"></a></div><div class="div-pro-view-name"><div class="goods-name">商品名称：<a target="_blank" href="http://showfx.niuteam.cn/wap/Goods/goodsDetail?id=79">dfa</a></div><div>商家编码：</div></div></td><td align="right">100.00</td><td align="right">100.00</td><td style="text-align:center;">未启用</td><td style="text-align:center;">--</td><td style="text-align:center;">--</td><td align="center">2018-09-04 10:45:13</td><td style="text-align:center;"><a style="width:100%; " href="javascript:void(0);" onclick="showUpdateGoodsPintuan(79)"><span class="edit">拼团设定</span></a><a style="display: block;margin-right: 0;" href="javascript:void(0);" onclick="modifyGoodsPintuan(79,'open')"><span class="edit">开启拼团</span></a></td></tr><tr><td align="center"><i class="checkbox-common"><input value="78" name="sub" data-state="0" type="checkbox"></i></td><td colspan="1"><div><a class="a-pro-view-img" href="http://showfx.niuteam.cn/goods/goodsinfo?goodsid=78" target="_blank" style="height:70px;line-height:70px;text-align:center;"><img class="thumbnail-img" src="/upload/goods/20180901/c9d91eda9b2e48c4959c8725073dc4d84.png"></a></div><div class="div-pro-view-name"><div class="goods-name">商品名称：<a target="_blank" href="http://showfx.niuteam.cn/wap/Goods/goodsDetail?id=78">测试商品-副本</a></div><div>商家编码：</div></div></td><td align="right">100.00</td><td align="right">100.00</td><td style="text-align:center;">未启用</td><td style="text-align:center;">--</td><td style="text-align:center;">--</td><td align="center">2018-09-04 10:00:11</td><td style="text-align:center;"><a style="width:100%; " href="javascript:void(0);" onclick="showUpdateGoodsPintuan(78)"><span class="edit">拼团设定</span></a><a style="display: block;margin-right: 0;" href="javascript:void(0);" onclick="modifyGoodsPintuan(78,'open')"><span class="edit">开启拼团</span></a></td></tr><tr><td align="center"><i class="checkbox-common"><input value="77" name="sub" data-state="0" type="checkbox"></i></td><td colspan="1"><div><a class="a-pro-view-img" href="http://showfx.niuteam.cn/goods/goodsinfo?goodsid=77" target="_blank" style="height:70px;line-height:70px;text-align:center;"><img class="thumbnail-img" src="/upload/goods_sku/32fc4da4eb65a4567ee6cf4302057c7f4.jpg"></a></div><div class="div-pro-view-name"><div class="goods-name">商品名称：<a target="_blank" href="http://showfx.niuteam.cn/wap/Goods/goodsDetail?id=77">OSA欧莎2018春秋装 名媛小香风圆领格子高腰流苏两件套包臀裙套装</a></div><div>商家编码：1009090110</div></div></td><td align="right">0.00</td><td align="right">0.00</td><td style="text-align:center;">已启用</td><td style="text-align:center;">阶梯团</td><td style="text-align:center;"></td><td align="center">2018-09-03 20:19:05</td><td style="text-align:center;"><a style="width:100%; " href="javascript:void(0);" onclick="showUpdateGoodsPintuan(77)"><span class="edit">拼团设定</span></a><a style="display: block;margin-right: 0; " href="javascript:void(0);" onclick="modifyGoodsPintuan(77,'off')"><span class="edit">关闭拼团</span></a></td></tr><tr><td align="center"><i class="checkbox-common"><input value="76" name="sub" data-state="1" type="checkbox"></i></td><td colspan="1"><div><a class="a-pro-view-img" href="http://showfx.niuteam.cn/goods/goodsinfo?goodsid=76" target="_blank" style="height:70px;line-height:70px;text-align:center;"><img class="thumbnail-img" src="/upload/goods/20180901/c9d91eda9b2e48c4959c8725073dc4d84.png"></a></div><div class="div-pro-view-name"><div class="goods-name">商品名称：<a target="_blank" href="http://showfx.niuteam.cn/wap/Goods/goodsDetail?id=76">测试商品</a></div><div>商家编码：</div></div></td><td align="right">100.00</td><td align="right">100.00</td><td style="text-align:center;">已启用</td><td style="text-align:center;">秒杀团</td><td style="text-align:center;"></td><td align="center">2018-09-01 18:11:47</td><td style="text-align:center;"><a style="width:100%; " href="javascript:void(0);" onclick="showUpdateGoodsPintuan(76)"><span class="edit">拼团设定</span></a><a style="display: block;margin-right: 0; " href="javascript:void(0);" onclick="modifyGoodsPintuan(76,'off')"><span class="edit">关闭拼团</span></a></td></tr><tr><td align="center"><i class="checkbox-common"><input value="74" name="sub" data-state="0" type="checkbox"></i></td><td colspan="1"><div><a class="a-pro-view-img" href="http://showfx.niuteam.cn/goods/goodsinfo?goodsid=74" target="_blank" style="height:70px;line-height:70px;text-align:center;"><img class="thumbnail-img" src="/upload/goods/20180719/95cf73c127d0a1ff3543f7fcb0874f274.png"></a></div><div class="div-pro-view-name"><div class="goods-name">商品名称：<a target="_blank" href="http://showfx.niuteam.cn/wap/Goods/goodsDetail?id=74">8.10测试</a></div><div>商家编码：</div></div></td><td align="right">100.00</td><td align="right">100.00</td><td style="text-align:center;">已启用</td><td style="text-align:center;">秒杀团</td><td style="text-align:center;"></td><td align="center">2018-08-10 16:15:56</td><td style="text-align:center;"><a style="width:100%; " href="javascript:void(0);" onclick="showUpdateGoodsPintuan(74)"><span class="edit">拼团设定</span></a><a style="display: block;margin-right: 0; " href="javascript:void(0);" onclick="modifyGoodsPintuan(74,'off')"><span class="edit">关闭拼团</span></a></td></tr><tr><td align="center"><i class="checkbox-common"><input value="73" name="sub" data-state="0" type="checkbox"></i></td><td colspan="1"><div><a class="a-pro-view-img" href="http://showfx.niuteam.cn/goods/goodsinfo?goodsid=73" target="_blank" style="height:70px;line-height:70px;text-align:center;"><img class="thumbnail-img" src="/upload/goods/20180711/3b658c4f23120aa70f6f98a937971f814.jpg"></a></div><div class="div-pro-view-name"><div class="goods-name">商品名称：<a target="_blank" href="http://showfx.niuteam.cn/wap/Goods/goodsDetail?id=73">测试商品</a></div><div>商家编码：</div></div></td><td align="right">88.00</td><td align="right">88.00</td><td style="text-align:center;">已启用</td><td style="text-align:center;">佣金团</td><td style="text-align:center;"></td><td align="center">2018-08-08 11:46:50</td><td style="text-align:center;"><a style="width:100%; " href="javascript:void(0);" onclick="showUpdateGoodsPintuan(73)"><span class="edit">拼团设定</span></a><a style="display: block;margin-right: 0; " href="javascript:void(0);" onclick="modifyGoodsPintuan(73,'off')"><span class="edit">关闭拼团</span></a></td></tr><tr><td align="center"><i class="checkbox-common"><input value="71" name="sub" data-state="1" type="checkbox"></i></td><td colspan="1"><div><a class="a-pro-view-img" href="http://showfx.niuteam.cn/goods/goodsinfo?goodsid=71" target="_blank" style="height:70px;line-height:70px;text-align:center;"><img class="thumbnail-img" src="/upload/goods/14993418601114.jpg"></a></div><div class="div-pro-view-name"><div class="goods-name">商品名称：<a target="_blank" href="http://showfx.niuteam.cn/wap/Goods/goodsDetail?id=71">Lenovo/联想Yoga BOOK WiFi平板二合一超薄笔记本电脑yoga book-副本</a></div><div>商家编码：</div></div></td><td align="right">0.00</td><td align="right">0.00</td><td style="text-align:center;">已启用</td><td style="text-align:center;">秒杀团</td><td style="text-align:center;"></td><td align="center">2018-07-11 16:24:37</td><td style="text-align:center;"><a style="width:100%; " href="javascript:void(0);" onclick="showUpdateGoodsPintuan(71)"><span class="edit">拼团设定</span></a><a style="display: block;margin-right: 0; " href="javascript:void(0);" onclick="modifyGoodsPintuan(71,'off')"><span class="edit">关闭拼团</span></a></td></tr><tr><td align="center"><i class="checkbox-common"><input value="69" name="sub" data-state="1" type="checkbox"></i></td><td colspan="1"><div><a class="a-pro-view-img" href="http://showfx.niuteam.cn/goods/goodsinfo?goodsid=69" target="_blank" style="height:70px;line-height:70px;text-align:center;"><img class="thumbnail-img" src="/upload/goods/20180705/12c1f79313f569cab48b5c38b69a1d9f4.jpg"></a></div><div class="div-pro-view-name"><div class="goods-name">商品名称：<a target="_blank" href="http://showfx.niuteam.cn/wap/Goods/goodsDetail?id=69">澳大利亚丁戈树红标经典红葡萄酒750ml-副本</a></div><div>商家编码：</div></div></td><td align="right">1000.00</td><td align="right">1000.00</td><td style="text-align:center;">未启用</td><td style="text-align:center;">--</td><td style="text-align:center;">--</td><td align="center">2018-07-11 14:42:51</td><td style="text-align:center;"><a style="width:100%; " href="javascript:void(0);" onclick="showUpdateGoodsPintuan(69)"><span class="edit">拼团设定</span></a><a style="display: block;margin-right: 0;" href="javascript:void(0);" onclick="modifyGoodsPintuan(69,'open')"><span class="edit">开启拼团</span></a></td></tr><tr><td align="center"><i class="checkbox-common"><input value="66" name="sub" data-state="1" type="checkbox"></i></td><td colspan="1"><div><a class="a-pro-view-img" href="http://showfx.niuteam.cn/goods/goodsinfo?goodsid=66" target="_blank" style="height:70px;line-height:70px;text-align:center;"><img class="thumbnail-img" src="/upload/goods/20180705/12c1f79313f569cab48b5c38b69a1d9f4.jpg"></a></div><div class="div-pro-view-name"><div class="goods-name">商品名称：<a target="_blank" href="http://showfx.niuteam.cn/wap/Goods/goodsDetail?id=66">澳大利亚丁戈树红标经典红葡萄酒750ml-副本</a></div><div>商家编码：</div></div></td><td align="right">1000.00</td><td align="right">1000.00</td><td style="text-align:center;">未启用</td><td style="text-align:center;">--</td><td style="text-align:center;">--</td><td align="center">2018-07-11 09:27:40</td><td style="text-align:center;"><a style="width:100%; " href="javascript:void(0);" onclick="showUpdateGoodsPintuan(66)"><span class="edit">拼团设定</span></a><a style="display: block;margin-right: 0;" href="javascript:void(0);" onclick="modifyGoodsPintuan(66,'open')"><span class="edit">开启拼团</span></a></td></tr><tr><td align="center"><i class="checkbox-common"><input value="62" name="sub" data-state="1" type="checkbox"></i></td><td colspan="1"><div><a class="a-pro-view-img" href="http://showfx.niuteam.cn/goods/goodsinfo?goodsid=62" target="_blank" style="height:70px;line-height:70px;text-align:center;"><img class="thumbnail-img" src="/upload/goods/20180705/12c1f79313f569cab48b5c38b69a1d9f4.jpg"></a></div><div class="div-pro-view-name"><div class="goods-name">商品名称：<a target="_blank" href="http://showfx.niuteam.cn/wap/Goods/goodsDetail?id=62">test123澳大利亚丁戈树红标经典红葡萄酒750ml</a></div><div>商家编码：</div></div></td><td align="right">0.00</td><td align="right">0.00</td><td style="text-align:center;">已启用</td><td style="text-align:center;">秒杀团</td><td style="text-align:center;"></td><td align="center">2018-07-05 15:44:04</td><td style="text-align:center;"><a style="width:100%; " href="javascript:void(0);" onclick="showUpdateGoodsPintuan(62)"><span class="edit">拼团设定</span></a><a style="display: block;margin-right: 0; " href="javascript:void(0);" onclick="modifyGoodsPintuan(62,'off')"><span class="edit">关闭拼团</span></a></td></tr><tr><td align="center"><i class="checkbox-common"><input value="61" name="sub" data-state="1" type="checkbox"></i></td><td colspan="1"><div><a class="a-pro-view-img" href="http://showfx.niuteam.cn/goods/goodsinfo?goodsid=61" target="_blank" style="height:70px;line-height:70px;text-align:center;"><img class="thumbnail-img" src="/upload/goods/14993425091304.jpg"></a></div><div class="div-pro-view-name"><div class="goods-name">商品名称：<a target="_blank" href="http://showfx.niuteam.cn/wap/Goods/goodsDetail?id=61">古尚古 懒人手机支架 手机通用指环创意卡扣粘贴式全金属卡通配件-副本</a></div><div>商家编码：</div></div></td><td align="right">15.00</td><td align="right">15.00</td><td style="text-align:center;">未启用</td><td style="text-align:center;">--</td><td style="text-align:center;">--</td><td align="center">2018-07-05 15:09:56</td><td style="text-align:center;"><a style="width:100%; " href="javascript:void(0);" onclick="showUpdateGoodsPintuan(61)"><span class="edit">拼团设定</span></a><a style="display: block;margin-right: 0;" href="javascript:void(0);" onclick="modifyGoodsPintuan(61,'open')"><span class="edit">开启拼团</span></a></td></tr><tr><td align="center"><i class="checkbox-common"><input value="60" name="sub" data-state="1" type="checkbox"></i></td><td colspan="1"><div><a class="a-pro-view-img" href="http://showfx.niuteam.cn/goods/goodsinfo?goodsid=60" target="_blank" style="height:70px;line-height:70px;text-align:center;"><img class="thumbnail-img" src="/upload/goods/14993421471174.jpg"></a></div><div class="div-pro-view-name"><div class="goods-name">商品名称：<a target="_blank" href="http://showfx.niuteam.cn/wap/Goods/goodsDetail?id=60">14.1英寸轻薄刀锋四核笔记本电脑手提固态商务学生游戏上网本分期-副本</a></div><div>商家编码：</div></div></td><td align="right">5600.00</td><td align="right">5600.00</td><td style="text-align:center;">未启用</td><td style="text-align:center;">--</td><td style="text-align:center;">--</td><td align="center">2018-07-05 15:08:56</td><td style="text-align:center;"><a style="width:100%; " href="javascript:void(0);" onclick="showUpdateGoodsPintuan(60)"><span class="edit">拼团设定</span></a><a style="display: block;margin-right: 0;" href="javascript:void(0);" onclick="modifyGoodsPintuan(60,'open')"><span class="edit">开启拼团</span></a></td></tr><tr><td align="center"><i class="checkbox-common"><input value="59" name="sub" data-state="1" type="checkbox"></i></td><td colspan="1"><div><a class="a-pro-view-img" href="http://showfx.niuteam.cn/goods/goodsinfo?goodsid=59" target="_blank" style="height:70px;line-height:70px;text-align:center;"><img class="thumbnail-img" src="/upload/goods/14993430961454.jpg"></a></div><div class="div-pro-view-name"><div class="goods-name">商品名称：<a target="_blank" href="http://showfx.niuteam.cn/wap/Goods/goodsDetail?id=59">钻石金属 闪钻镶卡通指环扣懒人防摔折叠粘贴式手机配件支架批发-副本</a></div><div>商家编码：</div></div></td><td align="right">42.00</td><td align="right">42.00</td><td style="text-align:center;">未启用</td><td style="text-align:center;">--</td><td style="text-align:center;">--</td><td align="center">2018-07-05 15:08:45</td><td style="text-align:center;"><a style="width:100%; " href="javascript:void(0);" onclick="showUpdateGoodsPintuan(59)"><span class="edit">拼团设定</span></a><a style="display: block;margin-right: 0;" href="javascript:void(0);" onclick="modifyGoodsPintuan(59,'open')"><span class="edit">开启拼团</span></a></td></tr><tr><td align="center"><i class="checkbox-common"><input value="56" name="sub" data-state="1" type="checkbox"></i></td><td colspan="1"><div><a class="a-pro-view-img" href="http://showfx.niuteam.cn/goods/goodsinfo?goodsid=56" target="_blank" style="height:70px;line-height:70px;text-align:center;"><img class="thumbnail-img" src="/upload/goods/14993430961454.jpg"></a></div><div class="div-pro-view-name"><div class="goods-name">商品名称：<a target="_blank" href="http://showfx.niuteam.cn/wap/Goods/goodsDetail?id=56">钻石金属 闪钻镶卡通指环扣懒人防摔折叠粘贴式手机配件支架批发</a></div><div>商家编码：</div></div></td><td align="right">42.00</td><td align="right">42.00</td><td style="text-align:center;">已启用</td><td style="text-align:center;">秒杀团</td><td style="text-align:center;"></td><td align="center">2017-07-06 20:11:49</td><td style="text-align:center;"><a style="width:100%; " href="javascript:void(0);" onclick="showUpdateGoodsPintuan(56)"><span class="edit">拼团设定</span></a><a style="display: block;margin-right: 0; " href="javascript:void(0);" onclick="modifyGoodsPintuan(56,'off')"><span class="edit">关闭拼团</span></a></td></tr></tbody>
    </table>
    </div>
    </div>
    <!-- 此部分以下是弹出框内容 -->
    <div class="modal fade hide" id="editGoodsCommissionRate" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true" style="width:800px;">
    <div class="modal-dialog">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
        <h4 class="modal-title" id="myModalLabel">商品拼团设定</h4>
      </div>
      <div class="modal-body">
        <div class="set-style">
          <input type="hidden" id="distribution_type" value="">
          <input type="hidden" id="distribution_condition" value="">
          <dl>
            <dt>是否开启:</dt>
            <dd>

                <input id="is_open" type="checkbox" class="checkbox" simpleswitch="0" result="false" style="display: none;"><div class="Switch Switch_FlatRadius" id="Switch0"><span class="switch-open">是</span><span class="switch-close">否</span></div>


              <!-- <label class="radio inline normal">
                <i class="radio-common selected">
                  <input name="is_open" class="is_open1" id="is_open" type="radio" value="1" checked="checked" />
                </i>
                <span>立即开启</span>
              </label>
              <label class="radio inline normal">
                <i class="radio-common">
                  <input name="is_open" class="is_open0" id="is_open" type="radio" value="0"/>
                </i>
                <span>暂不开启</span>
              </label> -->
              <p class="error">请选择是否启用</p>
            </dd>
          </dl>
          <dl>
            <dt>是否推荐:</dt>
            <dd>

                <input id="is_show" type="checkbox" class="checkbox" simpleswitch="1" result="false" style="display: none;"><div class="Switch Switch_FlatRadius" id="Switch1"><span class="switch-open">是</span><span class="switch-close">否</span></div>


              <!-- <label class="radio inline normal">
                <i class="radio-common selected">
                  <input name="is_show" class="is_show1" id="is_show" type="radio" value="1" checked="checked" />
                </i>
                <span>推荐</span>
              </label>
              <label class="radio inline normal">
                <i class="radio-common">
                  <input name="is_show" class="is_show0" id="is_show" type="radio" value="0"/>
                </i>
                <span>不推荐</span>
              </label> -->
              <p class="error">请选择是否推荐</p>
            </dd>
          </dl>
          <dl>
            <dt>团购金额:</dt>
            <dd>
              <p><input id="tuangou_money" type="number" min="0" placeholder="" value="" class="input-common harf"><em class="unit">元</em><span class="error">&nbsp;&nbsp;请输入团购金额</span></p>
            </dd>
          </dl>
          <dl>
            <dt>团购人数:</dt>
            <dd>
              <p><input id="tuangou_num" type="number" min="1" placeholder="" value="" class="input-common harf"><em class="unit">人</em><span class="error">&nbsp;&nbsp;请输入团购人数</span></p>
            </dd>
          </dl>
          <dl>
            <dt>团购有效期:</dt>
            <dd>
              <p><input id="tuangou_time" type="number" min="1" placeholder="" value="" class="input-common harf"><em class="unit">小时</em>&nbsp;&nbsp;<span class="error">请输入团购有效期</span></p>
            </dd>
          </dl>
          <dl>
            <dt>团购类型:</dt>
            <dd>
              <div class="selectric-wrapper selectric-select-common" style="width: 250px;"><div class="selectric-hide-select"><select id="type_val" class="select-common" onchange="tuangou_type()" tabindex="-1">
                <option value="0">请选择团购类型</option>
                                  <option class="type1" value="1">秒杀团</option>
                                  <option class="type2" value="2">佣金团</option>
                                  <option class="type3" value="3">阶梯团</option>
                              </select></div><div class="selectric"><span class="selectric-label">请选择团购类型</span><button class="selectric-button">▾</button></div><div class="selectric-items" tabindex="-1"><div class="selectric-scroll"><ul><li data-index="0" class="selected" title="请选择团购类型">请选择团购类型</li><li data-index="1" class="type1" title="秒杀团">秒杀团</li><li data-index="2" class="type2" title="佣金团">佣金团</li><li data-index="3" class="type3 last" title="阶梯团">阶梯团</li></ul></div></div><input class="selectric-input" tabindex="0"></div><span class="error">请输入团购类型</span>
                         
            </dd>
          </dl>
          <dl style="display:none" id="commission_show">
            <dt>团长佣金:</dt>
            <dd>
              <p><input id="colonel_commission" type="number" min="0" placeholder="" value="" class="input-common harf"><em class="unit">元</em></p>
              <p class="error">请输入团长佣金</p>
            </dd>
          </dl>
          <dl style="display:none" id="coupon_show">
            <dt>团长优惠券:</dt>
            <dd>
              <p><input id="colonel_coupon" type="number" min="0" placeholder="" value="" class="input-common"></p>
              <p class="error">请输入团长优惠券</p>
            </dd>
          </dl>
          <dl style="display:none" id="point_show">
            <dt>团长积分:</dt>
            <dd>
              <p><input name="" id="colonel_point" type="number" min="0" class="input-common harf"><em class="unit">积分</em></p>
              <p class="error">请输入团长积分</p>
            </dd>
          </dl>
          <dl>
            <dt>团购内容:</dt>
            <dd>
              <p>
                <textarea name="" id="colonel_content" cols="30" rows="10" class="textarea-common"></textarea>
              </p><p class="error">请输入团购信息内容</p>
            </dd>
          </dl>
          <input id="goods_id" type="hidden" value="">
          <input id="tuangou_id" type="hidden" value="">
        </div>
      </div>
      <div class="modal-footer">
        <button type="button" class="btn-common" onclick="updateGoodsPintuan();">修改</button>
        <button type="button" class="btn-common" data-dismiss="modal">关闭</button>
      </div>
    </div>
    </div>
    </div>
    </div>

  </section>
</template>
