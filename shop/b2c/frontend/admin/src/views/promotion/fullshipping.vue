<template>

  <section class="ns-base-section">

    <div style="position:relative;margin:0;">
      <!-- 面包屑导航 -->
            <div class="breadcrumb-nav">
        <a href="index.html">大鵬系統</a>
                  <i class="fa fa-angle-right"></i>
          <a href="/promotion/coupontypelist.html">营销</a>
                  <i class="fa fa-angle-right"></i>
          <!-- 需要加跳转链接用这个：http://showfx.niuteam.cn/admin/promotion/fullshipping -->
          <a href="javascript:;" style="color:#999;">满额包邮</a>
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
                  <p>相关教程：<a href="http://bbs.niushop.com.cn/forum.php?mod=viewthread&amp;tid=2320&amp;extra=page%3D2" target="_blank">http://bbs.niushop.com.cn/forum.php?mod=viewthread&amp;tid=2320&amp;extra=page%3D2</a></p>
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

  <div class="space-10"></div>
  <div class="set-style">
  <dl>
    <dt>满额包邮：</dt>
    <dd>
        <input type="checkbox" id="manebaoyouResult" class="checkbox" simpleswitch="0" result="false" style="display: none;">
        <div class="Switch Switch_FlatRadius" id="Switch0">
          <span class="switch-open">是</span><span class="switch-close">否</span></div>
    </dd>
  </dl>
  <dl>
    <dt>包邮所需订单金额：</dt>
    <dd>
      <div>
        <input id="full_mail_money" class="input-mini input-common harf" type="number" min="0.01" step="0.01" value="0.00"><em class="unit">元</em>
        <span id="full_mail" class="help-inline ml15" style="display: none;color:red;">请输入包邮所需订单金额</span>
      </div>
      <p class="hint">请设定数字参数，全场包邮请填写0</p>
    </dd>
  </dl>
  <dl>
    <dt>设置不包邮地区：</dt>
    <dd>
      <div>
        <span class="js-region-info region-info"></span>
        <a class="Js_select_city btn-common" style="line-height: 20px;display: inline-block;" data-flag="0" href="javascript:;">指定地区城市</a>
      </div>
    </dd>
  </dl>
  <dl>
    <dt></dt>
    <dd>
      <button class="btn-common btn-big" onclick="SavepointConfig();">保存</button>
    </dd>
  </dl>
  </div>

  <div class="modal fade hide" id="select-region" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true" style="top: 17.5px;">
  <div class="modal-dialog">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
        <h3>批量处理</h3>
      </div>
      <div class="modal-body">
        <div class="cont">
          <div class="selectSub dialog-areas">
            <ul class="js-regions">
              <li>
                <div class="dcity clearfix">
                  <!-- 大类 -->
                  <div class="ecity gcity">
                    <span class="group-label">
                      <i class="checkbox-common"><input id="first_region_0" data-first-index="0" value="9,10,11,12,14," type="checkbox"></i>
                      <label for="first_region_0" title="华东">华东</label>
                    </span>
                  </div>

                  <!-- 省 -->
                  <div class="province-list">

                      <div class="ecity">
                      <span class="gareas">

                        <i class="checkbox-common"><input data-second-parent-index="0" data-province-id="9" id="second_region_0_9" type="checkbox" data-province-name="上海市" value="9"></i>
                        <label for="second_region_0_9" title="上海市">上海市</label>
                        <img class="drop-down" src="/public/admin/images/freight_city_drop_down.gif" data-level="province">

                        <!-- 市 -->
                        <div class="citys" id="citys_9">
                                                      <span class="areas">
                              <i class="checkbox-common"><input data-third-parent-index="0" data-province-id="9" data-city-id="73" value="73" id="third_0_73" type="checkbox"></i>
                              <label for="third_0_73" title="上海市">上海市</label>
                            </span>
                                                  </div>
                      </span>
                    </div>
                                        <div class="ecity">
                      <span class="gareas">

                        <i class="checkbox-common"><input data-second-parent-index="0" data-province-id="10" id="second_region_0_10" type="checkbox" data-province-name="江苏省" value="10"></i>
                        <label for="second_region_0_10" title="江苏省">江苏省</label>
                        <img class="drop-down" src="/public/admin/images/freight_city_drop_down.gif" data-level="province">

                        <!-- 市 -->
                        <div class="citys" id="citys_10">
                                        <span class="areas">
                              <i class="checkbox-common"><input data-third-parent-index="0" data-province-id="10" data-city-id="74" value="74" id="third_0_74" type="checkbox"></i>
                              <label for="third_0_74" title="南京市">南京市</label>
                            </span>
                                                      <span class="areas">
                              <i class="checkbox-common"><input data-third-parent-index="0" data-province-id="10" data-city-id="85" value="85" id="third_0_85" type="checkbox"></i>
                              <label for="third_0_85" title="泰州市">泰州市</label>
                            </span>
                                                      <span class="areas">
                              <i class="checkbox-common"><input data-third-parent-index="0" data-province-id="10" data-city-id="84" value="84" id="third_0_84" type="checkbox"></i>
                              <label for="third_0_84" title="镇江市">镇江市</label>
                            </span>
                                                      <span class="areas">
                              <i class="checkbox-common"><input data-third-parent-index="0" data-province-id="10" data-city-id="83" value="83" id="third_0_83" type="checkbox"></i>
                              <label for="third_0_83" title="扬州市">扬州市</label>
                            </span>
                                                      <span class="areas">
                              <i class="checkbox-common"><input data-third-parent-index="0" data-province-id="10" data-city-id="82" value="82" id="third_0_82" type="checkbox"></i>
                              <label for="third_0_82" title="盐城市">盐城市</label>
                            </span>
                                                      <span class="areas">
                              <i class="checkbox-common"><input data-third-parent-index="0" data-province-id="10" data-city-id="81" value="81" id="third_0_81" type="checkbox"></i>
                              <label for="third_0_81" title="淮安市">淮安市</label>
                            </span>
                                                      <span class="areas">
                              <i class="checkbox-common"><input data-third-parent-index="0" data-province-id="10" data-city-id="80" value="80" id="third_0_80" type="checkbox"></i>
                              <label for="third_0_80" title="连云港市">连云港市</label>
                            </span>
                                                      <span class="areas">
                              <i class="checkbox-common"><input data-third-parent-index="0" data-province-id="10" data-city-id="79" value="79" id="third_0_79" type="checkbox"></i>
                              <label for="third_0_79" title="南通市">南通市</label>
                            </span>
                                                      <span class="areas">
                              <i class="checkbox-common"><input data-third-parent-index="0" data-province-id="10" data-city-id="78" value="78" id="third_0_78" type="checkbox"></i>
                              <label for="third_0_78" title="苏州市">苏州市</label>
                            </span>
                                                      <span class="areas">
                              <i class="checkbox-common"><input data-third-parent-index="0" data-province-id="10" data-city-id="77" value="77" id="third_0_77" type="checkbox"></i>
                              <label for="third_0_77" title="常州市">常州市</label>
                            </span>
                                                      <span class="areas">
                              <i class="checkbox-common"><input data-third-parent-index="0" data-province-id="10" data-city-id="76" value="76" id="third_0_76" type="checkbox"></i>
                              <label for="third_0_76" title="徐州市">徐州市</label>
                            </span>
                                                      <span class="areas">
                              <i class="checkbox-common"><input data-third-parent-index="0" data-province-id="10" data-city-id="75" value="75" id="third_0_75" type="checkbox"></i>
                              <label for="third_0_75" title="无锡市">无锡市</label>
                            </span>
                                                      <span class="areas">
                              <i class="checkbox-common"><input data-third-parent-index="0" data-province-id="10" data-city-id="86" value="86" id="third_0_86" type="checkbox"></i>
                              <label for="third_0_86" title="宿迁市">宿迁市</label>
                            </span>
                                                  </div>
                      </span>
                    </div>
                                        <div class="ecity">
                      <span class="gareas">

                        <i class="checkbox-common"><input data-second-parent-index="0" data-province-id="11" id="second_region_0_11" type="checkbox" data-province-name="浙江省" value="11"></i>
                        <label for="second_region_0_11" title="浙江省">浙江省</label>
                        <img class="drop-down" src="/public/admin/images/freight_city_drop_down.gif" data-level="province">

                        <!-- 市 -->
                        <div class="citys" id="citys_11">
                                    <span class="areas">
                              <i class="checkbox-common"><input data-third-parent-index="0" data-province-id="11" data-city-id="87" value="87" id="third_0_87" type="checkbox"></i>
                              <label for="third_0_87" title="杭州市">杭州市</label>
                            </span>
                                                      <span class="areas">
                              <i class="checkbox-common"><input data-third-parent-index="0" data-province-id="11" data-city-id="96" value="96" id="third_0_96" type="checkbox"></i>
                              <label for="third_0_96" title="台州市">台州市</label>
                            </span>
                                                      <span class="areas">
                              <i class="checkbox-common"><input data-third-parent-index="0" data-province-id="11" data-city-id="95" value="95" id="third_0_95" type="checkbox"></i>
                              <label for="third_0_95" title="舟山市">舟山市</label>
                            </span>
                                                      <span class="areas">
                              <i class="checkbox-common"><input data-third-parent-index="0" data-province-id="11" data-city-id="94" value="94" id="third_0_94" type="checkbox"></i>
                              <label for="third_0_94" title="衢州市">衢州市</label>
                            </span>
                                                      <span class="areas">
                              <i class="checkbox-common"><input data-third-parent-index="0" data-province-id="11" data-city-id="93" value="93" id="third_0_93" type="checkbox"></i>
                              <label for="third_0_93" title="金华市">金华市</label>
                            </span>
                                                      <span class="areas">
                              <i class="checkbox-common"><input data-third-parent-index="0" data-province-id="11" data-city-id="92" value="92" id="third_0_92" type="checkbox"></i>
                              <label for="third_0_92" title="绍兴市">绍兴市</label>
                            </span>
                                                      <span class="areas">
                              <i class="checkbox-common"><input data-third-parent-index="0" data-province-id="11" data-city-id="91" value="91" id="third_0_91" type="checkbox"></i>
                              <label for="third_0_91" title="湖州市">湖州市</label>
                            </span>
                                                      <span class="areas">
                              <i class="checkbox-common"><input data-third-parent-index="0" data-province-id="11" data-city-id="90" value="90" id="third_0_90" type="checkbox"></i>
                              <label for="third_0_90" title="嘉兴市">嘉兴市</label>
                            </span>
                                                      <span class="areas">
                              <i class="checkbox-common"><input data-third-parent-index="0" data-province-id="11" data-city-id="89" value="89" id="third_0_89" type="checkbox"></i>
                              <label for="third_0_89" title="温州市">温州市</label>
                            </span>
                                                      <span class="areas">
                              <i class="checkbox-common"><input data-third-parent-index="0" data-province-id="11" data-city-id="88" value="88" id="third_0_88" type="checkbox"></i>
                              <label for="third_0_88" title="宁波市">宁波市</label>
                            </span>
                                                      <span class="areas">
                              <i class="checkbox-common"><input data-third-parent-index="0" data-province-id="11" data-city-id="97" value="97" id="third_0_97" type="checkbox"></i>
                              <label for="third_0_97" title="丽水市">丽水市</label>
                            </span>
                                                  </div>
                      </span>
                    </div>
                                        <div class="ecity">
                      <span class="gareas">

                        <i class="checkbox-common"><input data-second-parent-index="0" data-province-id="12" id="second_region_0_12" type="checkbox" data-province-name="安徽省" value="12"></i>
                        <label for="second_region_0_12" title="安徽省">安徽省</label>
                        <img class="drop-down" src="/public/admin/images/freight_city_drop_down.gif" data-level="province">

                        <!-- 市 -->
                        <div class="citys" id="citys_12">
                                                      <span class="areas">
                              <i class="checkbox-common"><input data-third-parent-index="0" data-province-id="12" data-city-id="98" value="98" id="third_0_98" type="checkbox"></i>
                              <label for="third_0_98" title="合肥市">合肥市</label>
                            </span>
                                                      <span class="areas">
                              <i class="checkbox-common"><input data-third-parent-index="0" data-province-id="12" data-city-id="113" value="113" id="third_0_113" type="checkbox"></i>
                              <label for="third_0_113" title="池州市">池州市</label>
                            </span>
                                                      <span class="areas">
                              <i class="checkbox-common"><input data-third-parent-index="0" data-province-id="12" data-city-id="112" value="112" id="third_0_112" type="checkbox"></i>
                              <label for="third_0_112" title="亳州市">亳州市</label>
                            </span>
                                                      <span class="areas">
                              <i class="checkbox-common"><input data-third-parent-index="0" data-province-id="12" data-city-id="111" value="111" id="third_0_111" type="checkbox"></i>
                              <label for="third_0_111" title="六安市">六安市</label>
                            </span>
                                                      <span class="areas">
                              <i class="checkbox-common"><input data-third-parent-index="0" data-province-id="12" data-city-id="110" value="110" id="third_0_110" type="checkbox"></i>
                              <label for="third_0_110" title="巢湖市">巢湖市</label>
                            </span>
                                                      <span class="areas">
                              <i class="checkbox-common"><input data-third-parent-index="0" data-province-id="12" data-city-id="109" value="109" id="third_0_109" type="checkbox"></i>
                              <label for="third_0_109" title="宿州市">宿州市</label>
                            </span>
                                                      <span class="areas">
                              <i class="checkbox-common"><input data-third-parent-index="0" data-province-id="12" data-city-id="108" value="108" id="third_0_108" type="checkbox"></i>
                              <label for="third_0_108" title="阜阳市">阜阳市</label>
                            </span>
                                                      <span class="areas">
                              <i class="checkbox-common"><input data-third-parent-index="0" data-province-id="12" data-city-id="107" value="107" id="third_0_107" type="checkbox"></i>
                              <label for="third_0_107" title="滁州市">滁州市</label>
                            </span>
                                                      <span class="areas">
                              <i class="checkbox-common"><input data-third-parent-index="0" data-province-id="12" data-city-id="106" value="106" id="third_0_106" type="checkbox"></i>
                              <label for="third_0_106" title="黄山市">黄山市</label>
                            </span>
                                                      <span class="areas">
                              <i class="checkbox-common"><input data-third-parent-index="0" data-province-id="12" data-city-id="105" value="105" id="third_0_105" type="checkbox"></i>
                              <label for="third_0_105" title="安庆市">安庆市</label>
                            </span>
                                                      <span class="areas">
                              <i class="checkbox-common"><input data-third-parent-index="0" data-province-id="12" data-city-id="104" value="104" id="third_0_104" type="checkbox"></i>
                              <label for="third_0_104" title="铜陵市">铜陵市</label>
                            </span>
                                                      <span class="areas">
                              <i class="checkbox-common"><input data-third-parent-index="0" data-province-id="12" data-city-id="103" value="103" id="third_0_103" type="checkbox"></i>
                              <label for="third_0_103" title="淮北市">淮北市</label>
                            </span>
                                                      <span class="areas">
                              <i class="checkbox-common"><input data-third-parent-index="0" data-province-id="12" data-city-id="102" value="102" id="third_0_102" type="checkbox"></i>
                              <label for="third_0_102" title="马鞍山市">马鞍山市</label>
                            </span>
                                                      <span class="areas">
                              <i class="checkbox-common"><input data-third-parent-index="0" data-province-id="12" data-city-id="101" value="101" id="third_0_101" type="checkbox"></i>
                              <label for="third_0_101" title="淮南市">淮南市</label>
                            </span>
                                                      <span class="areas">
                              <i class="checkbox-common"><input data-third-parent-index="0" data-province-id="12" data-city-id="100" value="100" id="third_0_100" type="checkbox"></i>
                              <label for="third_0_100" title="蚌埠市">蚌埠市</label>
                            </span>
                                                      <span class="areas">
                              <i class="checkbox-common"><input data-third-parent-index="0" data-province-id="12" data-city-id="99" value="99" id="third_0_99" type="checkbox"></i>
                              <label for="third_0_99" title="芜湖市">芜湖市</label>
                            </span>
                                                      <span class="areas">
                              <i class="checkbox-common"><input data-third-parent-index="0" data-province-id="12" data-city-id="114" value="114" id="third_0_114" type="checkbox"></i>
                              <label for="third_0_114" title="宣城市">宣城市</label>
                            </span>
                                                  </div>
                      </span>
                    </div>
                                        <div class="ecity">
                      <span class="gareas">

                        <i class="checkbox-common"><input data-second-parent-index="0" data-province-id="14" id="second_region_0_14" type="checkbox" data-province-name="江西省" value="14"></i>
                        <label for="second_region_0_14" title="江西省">江西省</label>
                        <img class="drop-down" src="/public/admin/images/freight_city_drop_down.gif" data-level="province">

                        <!-- 市 -->
                        <div class="citys" id="citys_14">
                                                      <span class="areas">
                              <i class="checkbox-common"><input data-third-parent-index="0" data-province-id="14" data-city-id="124" value="124" id="third_0_124" type="checkbox"></i>
                              <label for="third_0_124" title="南昌市">南昌市</label>
                            </span>
                                                      <span class="areas">
                              <i class="checkbox-common"><input data-third-parent-index="0" data-province-id="14" data-city-id="133" value="133" id="third_0_133" type="checkbox"></i>
                              <label for="third_0_133" title="抚州市">抚州市</label>
                            </span>
                                                      <span class="areas">
                              <i class="checkbox-common"><input data-third-parent-index="0" data-province-id="14" data-city-id="132" value="132" id="third_0_132" type="checkbox"></i>
                              <label for="third_0_132" title="宜春市">宜春市</label>
                            </span>
                                                      <span class="areas">
                              <i class="checkbox-common"><input data-third-parent-index="0" data-province-id="14" data-city-id="131" value="131" id="third_0_131" type="checkbox"></i>
                              <label for="third_0_131" title="吉安市">吉安市</label>
                            </span>
                                                      <span class="areas">
                              <i class="checkbox-common"><input data-third-parent-index="0" data-province-id="14" data-city-id="130" value="130" id="third_0_130" type="checkbox"></i>
                              <label for="third_0_130" title="赣州市">赣州市</label>
                            </span>
                                                      <span class="areas">
                              <i class="checkbox-common"><input data-third-parent-index="0" data-province-id="14" data-city-id="129" value="129" id="third_0_129" type="checkbox"></i>
                              <label for="third_0_129" title="鹰潭市">鹰潭市</label>
                            </span>
                                                      <span class="areas">
                              <i class="checkbox-common"><input data-third-parent-index="0" data-province-id="14" data-city-id="128" value="128" id="third_0_128" type="checkbox"></i>
                              <label for="third_0_128" title="新余市">新余市</label>
                            </span>
                                                      <span class="areas">
                              <i class="checkbox-common"><input data-third-parent-index="0" data-province-id="14" data-city-id="127" value="127" id="third_0_127" type="checkbox"></i>
                              <label for="third_0_127" title="九江市">九江市</label>
                            </span>
                                                      <span class="areas">
                              <i class="checkbox-common"><input data-third-parent-index="0" data-province-id="14" data-city-id="126" value="126" id="third_0_126" type="checkbox"></i>
                              <label for="third_0_126" title="萍乡市">萍乡市</label>
                            </span>
                                                      <span class="areas">
                              <i class="checkbox-common"><input data-third-parent-index="0" data-province-id="14" data-city-id="125" value="125" id="third_0_125" type="checkbox"></i>
                              <label for="third_0_125" title="景德镇市">景德镇市</label>
                            </span>
                                                      <span class="areas">
                              <i class="checkbox-common"><input data-third-parent-index="0" data-province-id="14" data-city-id="134" value="134" id="third_0_134" type="checkbox"></i>
                              <label for="third_0_134" title="上饶市">上饶市</label>
                            </span>
                                                  </div>
                      </span>
                    </div>

                  </div>
                </div>
              </li>
                            <li>
                <div class="dcity clearfix">
                  <!-- 大类 -->
                  <div class="ecity gcity">
                    <span class="group-label">
                      <i class="checkbox-common"><input id="first_region_1" data-first-index="1" value="2,3,4,5,15,1," type="checkbox"></i>
                      <label for="first_region_1" title="华北">华北</label>
                    </span>
                  </div>

                  <!-- 省 -->
                  <div class="province-list">

                                        <div class="ecity">
                      <span class="gareas">

                        <i class="checkbox-common"><input data-second-parent-index="1" data-province-id="2" id="second_region_1_2" type="checkbox" data-province-name="天津市" value="2"></i>
                        <label for="second_region_1_2" title="天津市">天津市</label>
                        <img class="drop-down" src="/public/admin/images/freight_city_drop_down.gif" data-level="province">

                        <!-- 市 -->
                        <div class="citys" id="citys_2">
                                                      <span class="areas">
                              <i class="checkbox-common"><input data-third-parent-index="1" data-province-id="2" data-city-id="2" value="2" id="third_1_2" type="checkbox"></i>
                              <label for="third_1_2" title="天津市">天津市</label>
                            </span>
                                                  </div>
                      </span>
                    </div>
                                        <div class="ecity">
                      <span class="gareas">

                        <i class="checkbox-common"><input data-second-parent-index="1" data-province-id="3" id="second_region_1_3" type="checkbox" data-province-name="河北省" value="3"></i>
                        <label for="second_region_1_3" title="河北省">河北省</label>
                        <img class="drop-down" src="/public/admin/images/freight_city_drop_down.gif" data-level="province">

                        <!-- 市 -->
                        <!-- <div class="citys" id="citys_3"> -->
                                                      <!-- <span class="areas">
                              <i class="checkbox-common"><input data-third-parent-index="1" data-province-id="3" data-city-id="3" value="3" id="third_1_3" type="checkbox"></i>
                              <label for="third_1_3" title="石家庄市">石家庄市</label>
                            </span>
                                                      <span class="areas">
                              <i class="checkbox-common"><input data-third-parent-index="1" data-province-id="3" data-city-id="12" value="12" id="third_1_12" type="checkbox"></i>
                              <label for="third_1_12" title="廊坊市">廊坊市</label>
                            </span>
                                                      <span class="areas">
                              <i class="checkbox-common"><input data-third-parent-index="1" data-province-id="3" data-city-id="11" value="11" id="third_1_11" type="checkbox"></i>
                              <label for="third_1_11" title="沧州市">沧州市</label>
                            </span>
                                                      <span class="areas">
                              <i class="checkbox-common"><input data-third-parent-index="1" data-province-id="3" data-city-id="10" value="10" id="third_1_10" type="checkbox"></i>
                              <label for="third_1_10" title="承德市">承德市</label>
                            </span>
                                                      <span class="areas">
                              <i class="checkbox-common"><input data-third-parent-index="1" data-province-id="3" data-city-id="9" value="9" id="third_1_9" type="checkbox"></i>
                              <label for="third_1_9" title="张家口市">张家口市</label>
                            </span>
                                                      <span class="areas">
                              <i class="checkbox-common"><input data-third-parent-index="1" data-province-id="3" data-city-id="8" value="8" id="third_1_8" type="checkbox"></i>
                              <label for="third_1_8" title="保定市">保定市</label>
                            </span>
                                                      <span class="areas">
                              <i class="checkbox-common"><input data-third-parent-index="1" data-province-id="3" data-city-id="7" value="7" id="third_1_7" type="checkbox"></i>
                              <label for="third_1_7" title="邢台市">邢台市</label>
                            </span>
                                                      <span class="areas">
                              <i class="checkbox-common"><input data-third-parent-index="1" data-province-id="3" data-city-id="6" value="6" id="third_1_6" type="checkbox"></i>
                              <label for="third_1_6" title="邯郸市">邯郸市</label>
                            </span>
                                                      <span class="areas">
                              <i class="checkbox-common"><input data-third-parent-index="1" data-province-id="3" data-city-id="5" value="5" id="third_1_5" type="checkbox"></i>
                              <label for="third_1_5" title="秦皇岛市">秦皇岛市</label>
                            </span>
                                                      <span class="areas">
                              <i class="checkbox-common"><input data-third-parent-index="1" data-province-id="3" data-city-id="4" value="4" id="third_1_4" type="checkbox"></i>
                              <label for="third_1_4" title="唐山市">唐山市</label>
                            </span>
                                                      <span class="areas">
                              <i class="checkbox-common"><input data-third-parent-index="1" data-province-id="3" data-city-id="13" value="13" id="third_1_13" type="checkbox"></i>
                              <label for="third_1_13" title="衡水市">衡水市</label>
                            </span> -->
                              <!-- </div> -->
                      </span>
                    </div>
                                        <div class="ecity">
                      <span class="gareas">

                        <i class="checkbox-common"><input data-second-parent-index="1" data-province-id="4" id="second_region_1_4" type="checkbox" data-province-name="山西省" value="4"></i>
                        <label for="second_region_1_4" title="山西省">山西省</label>
                        <img class="drop-down" src="/public/admin/images/freight_city_drop_down.gif" data-level="province">

                        <!-- 市 -->
                        <!-- <div class="citys" id="citys_4"> -->
                                                      <!-- <span class="areas">
                              <i class="checkbox-common"><input data-third-parent-index="1" data-province-id="4" data-city-id="14" value="14" id="third_1_14" type="checkbox"></i>
                              <label for="third_1_14" title="太原市">太原市</label>
                            </span>
                                                      <span class="areas">
                              <i class="checkbox-common"><input data-third-parent-index="1" data-province-id="4" data-city-id="23" value="23" id="third_1_23" type="checkbox"></i>
                              <label for="third_1_23" title="临汾市">临汾市</label>
                            </span>
                                                      <span class="areas">
                              <i class="checkbox-common"><input data-third-parent-index="1" data-province-id="4" data-city-id="22" value="22" id="third_1_22" type="checkbox"></i>
                              <label for="third_1_22" title="忻州市">忻州市</label>
                            </span>
                                                      <span class="areas">
                              <i class="checkbox-common"><input data-third-parent-index="1" data-province-id="4" data-city-id="21" value="21" id="third_1_21" type="checkbox"></i>
                              <label for="third_1_21" title="运城市">运城市</label>
                            </span>
                                                      <span class="areas">
                              <i class="checkbox-common"><input data-third-parent-index="1" data-province-id="4" data-city-id="20" value="20" id="third_1_20" type="checkbox"></i>
                              <label for="third_1_20" title="晋中市">晋中市</label>
                            </span>
                                                      <span class="areas">
                              <i class="checkbox-common"><input data-third-parent-index="1" data-province-id="4" data-city-id="19" value="19" id="third_1_19" type="checkbox"></i>
                              <label for="third_1_19" title="朔州市">朔州市</label>
                            </span>
                                                      <span class="areas">
                              <i class="checkbox-common"><input data-third-parent-index="1" data-province-id="4" data-city-id="18" value="18" id="third_1_18" type="checkbox"></i>
                              <label for="third_1_18" title="晋城市">晋城市</label>
                            </span>
                                                      <span class="areas">
                              <i class="checkbox-common"><input data-third-parent-index="1" data-province-id="4" data-city-id="17" value="17" id="third_1_17" type="checkbox"></i>
                              <label for="third_1_17" title="长治市">长治市</label>
                            </span>
                                                      <span class="areas">
                              <i class="checkbox-common"><input data-third-parent-index="1" data-province-id="4" data-city-id="16" value="16" id="third_1_16" type="checkbox"></i>
                              <label for="third_1_16" title="阳泉市">阳泉市</label>
                            </span>
                                                      <span class="areas">
                              <i class="checkbox-common"><input data-third-parent-index="1" data-province-id="4" data-city-id="15" value="15" id="third_1_15" type="checkbox"></i>
                              <label for="third_1_15" title="大同市">大同市</label>
                            </span>
                                                      <span class="areas">
                              <i class="checkbox-common"><input data-third-parent-index="1" data-province-id="4" data-city-id="24" value="24" id="third_1_24" type="checkbox"></i>
                              <label for="third_1_24" title="吕梁市">吕梁市</label>
                            </span> -->
                                                <!-- </div> -->
                      </span>
                    </div>
                                        <div class="ecity">
                      <span class="gareas">

                        <i class="checkbox-common"><input data-second-parent-index="1" data-province-id="5" id="second_region_1_5" type="checkbox" data-province-name="内蒙古自治区" value="5"></i>
                        <label for="second_region_1_5" title="内蒙古自治区">内蒙古自治区</label>
                        <img class="drop-down" src="/public/admin/images/freight_city_drop_down.gif" data-level="province">

                        <!-- 市 -->
                        <!-- <div class="citys" id="citys_5"> -->
                                                      <!-- <span class="areas">
                              <i class="checkbox-common"><input data-third-parent-index="1" data-province-id="5" data-city-id="25" value="25" id="third_1_25" type="checkbox"></i>
                              <label for="third_1_25" title="呼和浩特市">呼和浩特市</label>
                            </span>
                                                      <span class="areas">
                              <i class="checkbox-common"><input data-third-parent-index="1" data-province-id="5" data-city-id="35" value="35" id="third_1_35" type="checkbox"></i>
                              <label for="third_1_35" title="锡林郭勒盟">锡林郭勒盟</label>
                            </span>
                                                      <span class="areas">
                              <i class="checkbox-common"><input data-third-parent-index="1" data-province-id="5" data-city-id="34" value="34" id="third_1_34" type="checkbox"></i>
                              <label for="third_1_34" title="兴安盟">兴安盟</label>
                            </span>
                                                      <span class="areas">
                              <i class="checkbox-common"><input data-third-parent-index="1" data-province-id="5" data-city-id="33" value="33" id="third_1_33" type="checkbox"></i>
                              <label for="third_1_33" title="乌兰察布市">乌兰察布市</label>
                            </span>
                                                      <span class="areas">
                              <i class="checkbox-common"><input data-third-parent-index="1" data-province-id="5" data-city-id="32" value="32" id="third_1_32" type="checkbox"></i>
                              <label for="third_1_32" title="巴彦淖尔市">巴彦淖尔市</label>
                            </span>
                                                      <span class="areas">
                              <i class="checkbox-common"><input data-third-parent-index="1" data-province-id="5" data-city-id="31" value="31" id="third_1_31" type="checkbox"></i>
                              <label for="third_1_31" title="呼伦贝尔市">呼伦贝尔市</label>
                            </span>
                                                      <span class="areas">
                              <i class="checkbox-common"><input data-third-parent-index="1" data-province-id="5" data-city-id="30" value="30" id="third_1_30" type="checkbox"></i>
                              <label for="third_1_30" title="鄂尔多斯市">鄂尔多斯市</label>
                            </span>
                                                      <span class="areas">
                              <i class="checkbox-common"><input data-third-parent-index="1" data-province-id="5" data-city-id="29" value="29" id="third_1_29" type="checkbox"></i>
                              <label for="third_1_29" title="通辽市">通辽市</label>
                            </span>
                                                      <span class="areas">
                              <i class="checkbox-common"><input data-third-parent-index="1" data-province-id="5" data-city-id="28" value="28" id="third_1_28" type="checkbox"></i>
                              <label for="third_1_28" title="赤峰市">赤峰市</label>
                            </span>
                                                      <span class="areas">
                              <i class="checkbox-common"><input data-third-parent-index="1" data-province-id="5" data-city-id="27" value="27" id="third_1_27" type="checkbox"></i>
                              <label for="third_1_27" title="乌海市">乌海市</label>
                            </span>
                                                      <span class="areas">
                              <i class="checkbox-common"><input data-third-parent-index="1" data-province-id="5" data-city-id="26" value="26" id="third_1_26" type="checkbox"></i>
                              <label for="third_1_26" title="包头市">包头市</label>
                            </span>
                                                      <span class="areas">
                              <i class="checkbox-common"><input data-third-parent-index="1" data-province-id="5" data-city-id="36" value="36" id="third_1_36" type="checkbox"></i>
                              <label for="third_1_36" title="阿拉善盟">阿拉善盟</label>
                            </span> -->
                        <!-- </div> -->
                      </span>
                    </div>
                                        <div class="ecity">
                      <span class="gareas">

                        <i class="checkbox-common"><input data-second-parent-index="1" data-province-id="15" id="second_region_1_15" type="checkbox" data-province-name="山东省" value="15"></i>
                        <label for="second_region_1_15" title="山东省">山东省</label>
                        <img class="drop-down" src="/public/admin/images/freight_city_drop_down.gif" data-level="province">

                        <!-- 市 -->
                        <!-- <div class="citys" id="citys_15"> -->
                                                      <!-- <span class="areas">
                              <i class="checkbox-common"><input data-third-parent-index="1" data-province-id="15" data-city-id="135" value="135" id="third_1_135" type="checkbox"></i>
                              <label for="third_1_135" title="济南市">济南市</label>
                            </span>
                                                      <span class="areas">
                              <i class="checkbox-common"><input data-third-parent-index="1" data-province-id="15" data-city-id="150" value="150" id="third_1_150" type="checkbox"></i>
                              <label for="third_1_150" title="滨州市">滨州市</label>
                            </span>
                                                      <span class="areas">
                              <i class="checkbox-common"><input data-third-parent-index="1" data-province-id="15" data-city-id="149" value="149" id="third_1_149" type="checkbox"></i>
                              <label for="third_1_149" title="聊城市">聊城市</label>
                            </span>
                                                      <span class="areas">
                              <i class="checkbox-common"><input data-third-parent-index="1" data-province-id="15" data-city-id="148" value="148" id="third_1_148" type="checkbox"></i>
                              <label for="third_1_148" title="德州市">德州市</label>
                            </span>
                                                      <span class="areas">
                              <i class="checkbox-common"><input data-third-parent-index="1" data-province-id="15" data-city-id="147" value="147" id="third_1_147" type="checkbox"></i>
                              <label for="third_1_147" title="临沂市">临沂市</label>
                            </span>
                                                      <span class="areas">
                              <i class="checkbox-common"><input data-third-parent-index="1" data-province-id="15" data-city-id="146" value="146" id="third_1_146" type="checkbox"></i>
                              <label for="third_1_146" title="莱芜市">莱芜市</label>
                            </span>
                                                      <span class="areas">
                              <i class="checkbox-common"><input data-third-parent-index="1" data-province-id="15" data-city-id="145" value="145" id="third_1_145" type="checkbox"></i>
                              <label for="third_1_145" title="日照市">日照市</label>
                            </span>
                                                      <span class="areas">
                              <i class="checkbox-common"><input data-third-parent-index="1" data-province-id="15" data-city-id="144" value="144" id="third_1_144" type="checkbox"></i>
                              <label for="third_1_144" title="威海市">威海市</label>
                            </span>
                                                      <span class="areas">
                              <i class="checkbox-common"><input data-third-parent-index="1" data-province-id="15" data-city-id="143" value="143" id="third_1_143" type="checkbox"></i>
                              <label for="third_1_143" title="泰安市">泰安市</label>
                            </span>
                                                      <span class="areas">
                              <i class="checkbox-common"><input data-third-parent-index="1" data-province-id="15" data-city-id="142" value="142" id="third_1_142" type="checkbox"></i>
                              <label for="third_1_142" title="济宁市">济宁市</label>
                            </span>
                                                      <span class="areas">
                              <i class="checkbox-common"><input data-third-parent-index="1" data-province-id="15" data-city-id="141" value="141" id="third_1_141" type="checkbox"></i>
                              <label for="third_1_141" title="潍坊市">潍坊市</label>
                            </span>
                                                      <span class="areas">
                              <i class="checkbox-common"><input data-third-parent-index="1" data-province-id="15" data-city-id="140" value="140" id="third_1_140" type="checkbox"></i>
                              <label for="third_1_140" title="烟台市">烟台市</label>
                            </span>
                                                      <span class="areas">
                              <i class="checkbox-common"><input data-third-parent-index="1" data-province-id="15" data-city-id="139" value="139" id="third_1_139" type="checkbox"></i>
                              <label for="third_1_139" title="东营市">东营市</label>
                            </span>
                                                      <span class="areas">
                              <i class="checkbox-common"><input data-third-parent-index="1" data-province-id="15" data-city-id="138" value="138" id="third_1_138" type="checkbox"></i>
                              <label for="third_1_138" title="枣庄市">枣庄市</label>
                            </span>
                                                      <span class="areas">
                              <i class="checkbox-common"><input data-third-parent-index="1" data-province-id="15" data-city-id="137" value="137" id="third_1_137" type="checkbox"></i>
                              <label for="third_1_137" title="淄博市">淄博市</label>
                            </span>
                                                      <span class="areas">
                              <i class="checkbox-common"><input data-third-parent-index="1" data-province-id="15" data-city-id="136" value="136" id="third_1_136" type="checkbox"></i>
                              <label for="third_1_136" title="青岛市">青岛市</label>
                            </span>
                                                      <span class="areas">
                              <i class="checkbox-common"><input data-third-parent-index="1" data-province-id="15" data-city-id="151" value="151" id="third_1_151" type="checkbox"></i>
                              <label for="third_1_151" title="荷泽市">荷泽市</label>
                            </span>
                                                  </div> -->
                      </span>
                    </div>
                                        <div class="ecity">
                      <span class="gareas">

                        <i class="checkbox-common"><input data-second-parent-index="1" data-province-id="1" id="second_region_1_1" type="checkbox" data-province-name="北京市" value="1"></i>
                        <label for="second_region_1_1" title="北京市">北京市</label>
                        <img class="drop-down" src="/public/admin/images/freight_city_drop_down.gif" data-level="province">

                        <!-- 市 -->
                        <div class="citys" id="citys_1">
                                                      <span class="areas">
                              <i class="checkbox-common"><input data-third-parent-index="1" data-province-id="1" data-city-id="1" value="1" id="third_1_1" type="checkbox"></i>
                              <label for="third_1_1" title="北京市">北京市</label>
                            </span>
                                                  </div>
                      </span>
                    </div>

                  </div>
                </div>
              </li>

              </ul>
          </div>
        </div>
      </div>
      <div class="modal-footer">
        <button class="btn-common btn-big js-confirm">保存</button>
        <button class="btn-common-cancle btn-big" data-dismiss="modal">关闭</button>
      </div>
    </div>
  </div>
  </div>

    </div>

  </section>

</template>
