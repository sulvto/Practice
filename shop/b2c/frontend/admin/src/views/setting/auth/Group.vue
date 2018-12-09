  <!-- 添加权限 -->

  <!--
  <div class="modal fade hide" id="add_user" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true" style="width: 850px;">
  <div class="modal-dialog">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
        <h3 class="modal-title" id="myModalLabel">用户组添加</h3>
      </div>
      <div class="modal-body">
        <div class="content scroll">
    <div>
      <div class="mod-form">
        <div class="con style0alert b10">
          <ul class="list-ul">
            <li class="list-li">
              <span class="star">*</span><span class="user-group-name">用户组名称 </span><input type="text" value="" name="RoleName" id="RoleName" class="input-common">
              <span class="prompt"></span>
            </li>
            <li class="list-li">
              <div class="float-l w100"><span class="star">*</span>权限 </div>
              <div class="overflow">
                <ul id="AllMenuConetnt">
                  <li id="contentPaltForm">
                    <label>
                      <i class="checkbox-common">
                      <input id="Add01" name="import" style="margin: -1px 0 0;" dir="title" type="checkbox" onclick="AllCheckBoxClick(event);">
                      </i>
                      <span>平台</span>
                    </label>
                    <div class="mod-table l30">
                      <div class="mod-table-main">
                        <div class="con style0line" style="padding-left: 9px;">
                          <table class="table table-hover">
                            <colgroup>
                              <col style="width: 10%;">
                              <col style="width: 90%;">
                            </colgroup>
                            <tbody id="platFormContent">
                                                            <tr class="tr-Current">
                                <td>
                                  <div>
                                    <label>
                                      <i class="checkbox-common">
                                        <input type="checkbox" name="add_per" dir="parent" id="149" value="149" onclick="AllCheckBoxClick(event);">
                                      </i>
                                      &nbsp;商品
                                    </label>
                                  </div>
                                </td>
                              <td>
                                                              <ul class="second">
                                  <li style="margin-right:10px;">
                                    <div class="cell">
                                      <label class="w120">
                                        <i class="checkbox-common">
                                        <input type="checkbox" name="add_per" dir="son" id="151" value="151" onclick="AllCheckBoxClick(event);">&nbsp;
                                        </i>
                                        <span style="font-weight:normal;color:#000;">商品发布</span>
                                      </label>
                                    </div>
                                  </li>
                                                                  </ul>
                                                              <ul class="second">
                                  <li style="margin-right:10px;">
                                    <div class="cell">
                                      <label class="w120">
                                        <i class="checkbox-common">
                                        <input type="checkbox" name="add_per" dir="son" id="419" value="419" onclick="AllCheckBoxClick(event);">&nbsp;
                                        </i>
                                        <span style="font-weight:normal;color:#000;">商品分类</span>
                                      </label>
                                    </div>
                                  </li>

                                  <li>
                                    <div class="cell">
                                      <label class="w120">
                                        <i class="checkbox-common left-10">
                                        <input type="checkbox" name="add_per" dir="sonson" id="421" value="421" onclick="AllCheckBoxClick(event);">&nbsp;
                                        </i>
                                        <span style="font-weight:normal;color:#666;">修改商品分类</span>
                                      </label>
                                    </div>
                                  </li>

                                  <li>
                                    <div class="cell">
                                      <label class="w120">
                                        <i class="checkbox-common left-10">
                                        <input type="checkbox" name="add_per" dir="sonson" id="420" value="420" onclick="AllCheckBoxClick(event);">&nbsp;
                                        </i>
                                        <span style="font-weight:normal;color:#666;">添加商品分类</span>
                                      </label>
                                    </div>
                                  </li>

                                  <li>
                                    <div class="cell">
                                      <label class="w120">
                                        <i class="checkbox-common left-10">
                                        <input type="checkbox" name="add_per" dir="sonson" id="422" value="422" onclick="AllCheckBoxClick(event);">&nbsp;
                                        </i>
                                        <span style="font-weight:normal;color:#666;">删除商品分类</span>
                                      </label>
                                    </div>
                                  </li>
                                                                  </ul>
                                                              <ul class="second">
                                  <li style="margin-right:10px;">
                                    <div class="cell">
                                      <label class="w120">
                                        <i class="checkbox-common">
                                        <input type="checkbox" name="add_per" dir="son" id="423" value="423" onclick="AllCheckBoxClick(event);">&nbsp;
                                        </i>
                                        <span style="font-weight:normal;color:#000;">商品品牌</span>
                                      </label>
                                    </div>
                                  </li>

                                  <li>
                                    <div class="cell">
                                      <label class="w120">
                                        <i class="checkbox-common left-10">
                                        <input type="checkbox" name="add_per" dir="sonson" id="424" value="424" onclick="AllCheckBoxClick(event);">&nbsp;
                                        </i>
                                        <span style="font-weight:normal;color:#666;">添加商品品牌</span>
                                      </label>
                                    </div>
                                  </li>

                                  <li>
                                    <div class="cell">
                                      <label class="w120">
                                        <i class="checkbox-common left-10">
                                        <input type="checkbox" name="add_per" dir="sonson" id="425" value="425" onclick="AllCheckBoxClick(event);">&nbsp;
                                        </i>
                                        <span style="font-weight:normal;color:#666;">修改商品品牌</span>
                                      </label>
                                    </div>
                                  </li>
                                                                  </ul>
                                                              <ul class="second">
                                  <li style="margin-right:10px;">
                                    <div class="cell">
                                      <label class="w120">
                                        <i class="checkbox-common">
                                        <input type="checkbox" name="add_per" dir="son" id="171" value="171" onclick="AllCheckBoxClick(event);">&nbsp;
                                        </i>
                                        <span style="font-weight:normal;color:#000;">商品标签</span>
                                      </label>
                                    </div>
                                  </li>

                                  <li>
                                    <div class="cell">
                                      <label class="w120">
                                        <i class="checkbox-common left-10">
                                        <input type="checkbox" name="add_per" dir="sonson" id="210" value="210" onclick="AllCheckBoxClick(event);">&nbsp;
                                        </i>
                                        <span style="font-weight:normal;color:#666;">修改商品标签</span>
                                      </label>
                                    </div>
                                  </li>

                                  <li>
                                    <div class="cell">
                                      <label class="w120">
                                        <i class="checkbox-common left-10">
                                        <input type="checkbox" name="add_per" dir="sonson" id="172" value="172" onclick="AllCheckBoxClick(event);">&nbsp;
                                        </i>
                                        <span style="font-weight:normal;color:#666;">添加商品标签</span>
                                      </label>
                                    </div>
                                  </li>
                                                                  </ul>
                                                              <ul class="second">
                                  <li style="margin-right:10px;">
                                    <div class="cell">
                                      <label class="w120">
                                        <i class="checkbox-common">
                                        <input type="checkbox" name="add_per" dir="son" id="479" value="479" onclick="AllCheckBoxClick(event);">&nbsp;
                                        </i>
                                        <span style="font-weight:normal;color:#000;">商品规格</span>
                                      </label>
                                    </div>
                                  </li>

                                  <li>
                                    <div class="cell">
                                      <label class="w120">
                                        <i class="checkbox-common left-10">
                                        <input type="checkbox" name="add_per" dir="sonson" id="481" value="481" onclick="AllCheckBoxClick(event);">&nbsp;
                                        </i>
                                        <span style="font-weight:normal;color:#666;">修改商品规格</span>
                                      </label>
                                    </div>
                                  </li>

                                  <li>
                                    <div class="cell">
                                      <label class="w120">
                                        <i class="checkbox-common left-10">
                                        <input type="checkbox" name="add_per" dir="sonson" id="480" value="480" onclick="AllCheckBoxClick(event);">&nbsp;
                                        </i>
                                        <span style="font-weight:normal;color:#666;">添加商品规格</span>
                                      </label>
                                    </div>
                                  </li>
                                                                  </ul>
                                                              <ul class="second">
                                  <li style="margin-right:10px;">
                                    <div class="cell">
                                      <label class="w120">
                                        <i class="checkbox-common">
                                        <input type="checkbox" name="add_per" dir="son" id="10001" value="10001" onclick="AllCheckBoxClick(event);">&nbsp;
                                        </i>
                                        <span style="font-weight:normal;color:#000;">供货商</span>
                                      </label>
                                    </div>
                                  </li>

                                  <li>
                                    <div class="cell">
                                      <label class="w120">
                                        <i class="checkbox-common left-10">
                                        <input type="checkbox" name="add_per" dir="sonson" id="10002" value="10002" onclick="AllCheckBoxClick(event);">&nbsp;
                                        </i>
                                        <span style="font-weight:normal;color:#666;">添加供货商</span>
                                      </label>
                                    </div>
                                  </li>

                                  <li>
                                    <div class="cell">
                                      <label class="w120">
                                        <i class="checkbox-common left-10">
                                        <input type="checkbox" name="add_per" dir="sonson" id="10003" value="10003" onclick="AllCheckBoxClick(event);">&nbsp;
                                        </i>
                                        <span style="font-weight:normal;color:#666;">修改供货商</span>
                                      </label>
                                    </div>
                                  </li>
                                                                  </ul>
                                                              <ul class="second">
                                  <li style="margin-right:10px;">
                                    <div class="cell">
                                      <label class="w120">
                                        <i class="checkbox-common">
                                        <input type="checkbox" name="add_per" dir="son" id="482" value="482" onclick="AllCheckBoxClick(event);">&nbsp;
                                        </i>
                                        <span style="font-weight:normal;color:#000;">商品类型</span>
                                      </label>
                                    </div>
                                  </li>

                                  <li>
                                    <div class="cell">
                                      <label class="w120">
                                        <i class="checkbox-common left-10">
                                        <input type="checkbox" name="add_per" dir="sonson" id="484" value="484" onclick="AllCheckBoxClick(event);">&nbsp;
                                        </i>
                                        <span style="font-weight:normal;color:#666;">添加商品类型</span>
                                      </label>
                                    </div>
                                  </li>

                                  <li>
                                    <div class="cell">
                                      <label class="w120">
                                        <i class="checkbox-common left-10">
                                        <input type="checkbox" name="add_per" dir="sonson" id="485" value="485" onclick="AllCheckBoxClick(event);">&nbsp;
                                        </i>
                                        <span style="font-weight:normal;color:#666;">修改商品类型</span>
                                      </label>
                                    </div>
                                  </li>
                                                                  </ul>
                                                              <ul class="second">
                                  <li style="margin-right:10px;">
                                    <div class="cell">
                                      <label class="w120">
                                        <i class="checkbox-common">
                                        <input type="checkbox" name="add_per" dir="son" id="334" value="334" onclick="AllCheckBoxClick(event);">&nbsp;
                                        </i>
                                        <span style="font-weight:normal;color:#000;">咨询管理</span>
                                      </label>
                                    </div>
                                  </li>
                                                                  </ul>
                                                              <ul class="second">
                                  <li style="margin-right:10px;">
                                    <div class="cell">
                                      <label class="w120">
                                        <i class="checkbox-common">
                                        <input type="checkbox" name="add_per" dir="son" id="478" value="478" onclick="AllCheckBoxClick(event);">&nbsp;
                                        </i>
                                        <span style="font-weight:normal;color:#000;">商品评价</span>
                                      </label>
                                    </div>
                                  </li>
                                                                  </ul>
                                                              <ul class="second">
                                  <li style="margin-right:10px;">
                                    <div class="cell">
                                      <label class="w120">
                                        <i class="checkbox-common">
                                        <input type="checkbox" name="add_per" dir="son" id="139" value="139" onclick="AllCheckBoxClick(event);">&nbsp;
                                        </i>
                                        <span style="font-weight:normal;color:#000;">相册管理</span>
                                      </label>
                                    </div>
                                  </li>

                                  <li>
                                    <div class="cell">
                                      <label class="w120">
                                        <i class="checkbox-common left-10">
                                        <input type="checkbox" name="add_per" dir="sonson" id="169" value="169" onclick="AllCheckBoxClick(event);">&nbsp;
                                        </i>
                                        <span style="font-weight:normal;color:#666;">图片管理</span>
                                      </label>
                                    </div>
                                  </li>
                                                                  </ul>
                                                            </td>
                            </tr>
                                                          <tr class="tr-Current">
                                <td>
                                  <div>
                                    <label>
                                      <i class="checkbox-common">
                                        <input type="checkbox" name="add_per" dir="parent" id="184" value="184" onclick="AllCheckBoxClick(event);">
                                      </i>
                                      &nbsp;订单
                                    </label>
                                  </div>
                                </td>
                              <td>
                                                              <ul class="second">
                                  <li style="margin-right:10px;">
                                    <div class="cell">
                                      <label class="w120">
                                        <i class="checkbox-common">
                                        <input type="checkbox" name="add_per" dir="son" id="185" value="185" onclick="AllCheckBoxClick(event);">&nbsp;
                                        </i>
                                        <span style="font-weight:normal;color:#000;">订单列表</span>
                                      </label>
                                    </div>
                                  </li>

                                  <li>
                                    <div class="cell">
                                      <label class="w120">
                                        <i class="checkbox-common left-10">
                                        <input type="checkbox" name="add_per" dir="sonson" id="190" value="190" onclick="AllCheckBoxClick(event);">&nbsp;
                                        </i>
                                        <span style="font-weight:normal;color:#666;">订单详情</span>
                                      </label>
                                    </div>
                                  </li>

                                  <li>
                                    <div class="cell">
                                      <label class="w120">
                                        <i class="checkbox-common left-10">
                                        <input type="checkbox" name="add_per" dir="sonson" id="194" value="194" onclick="AllCheckBoxClick(event);">&nbsp;
                                        </i>
                                        <span style="font-weight:normal;color:#666;">退款详情</span>
                                      </label>
                                    </div>
                                  </li>
                                                                  </ul>
                                                              <ul class="second">
                                  <li style="margin-right:10px;">
                                    <div class="cell">
                                      <label class="w120">
                                        <i class="checkbox-common">
                                        <input type="checkbox" name="add_per" dir="son" id="11039" value="11039" onclick="AllCheckBoxClick(event);">&nbsp;
                                        </i>
                                        <span style="font-weight:normal;color:#000;">虚拟订单</span>
                                      </label>
                                    </div>
                                  </li>

                                  <li>
                                    <div class="cell">
                                      <label class="w120">
                                        <i class="checkbox-common left-10">
                                        <input type="checkbox" name="add_per" dir="sonson" id="11040" value="11040" onclick="AllCheckBoxClick(event);">&nbsp;
                                        </i>
                                        <span style="font-weight:normal;color:#666;">虚拟订单详情</span>
                                      </label>
                                    </div>
                                  </li>
                                                                  </ul>
                                                              <ul class="second">
                                  <li style="margin-right:10px;">
                                    <div class="cell">
                                      <label class="w120">
                                        <i class="checkbox-common">
                                        <input type="checkbox" name="add_per" dir="son" id="11045" value="11045" onclick="AllCheckBoxClick(event);">&nbsp;
                                        </i>
                                        <span style="font-weight:normal;color:#000;">拼团订单</span>
                                      </label>
                                    </div>
                                  </li>

                                  <li>
                                    <div class="cell">
                                      <label class="w120">
                                        <i class="checkbox-common left-10">
                                        <input type="checkbox" name="add_per" dir="sonson" id="11046" value="11046" onclick="AllCheckBoxClick(event);">&nbsp;
                                        </i>
                                        <span style="font-weight:normal;color:#666;">拼团订单详情</span>
                                      </label>
                                    </div>
                                  </li>
                                                                  </ul>
                                                              <ul class="second">
                                  <li style="margin-right:10px;">
                                    <div class="cell">
                                      <label class="w120">
                                        <i class="checkbox-common">
                                        <input type="checkbox" name="add_per" dir="son" id="11089" value="11089" onclick="AllCheckBoxClick(event);">&nbsp;
                                        </i>
                                        <span style="font-weight:normal;color:#000;">预售订单</span>
                                      </label>
                                    </div>
                                  </li>

                                  <li>
                                    <div class="cell">
                                      <label class="w120">
                                        <i class="checkbox-common left-10">
                                        <input type="checkbox" name="add_per" dir="sonson" id="11093" value="11093" onclick="AllCheckBoxClick(event);">&nbsp;
                                        </i>
                                        <span style="font-weight:normal;color:#666;">订单详情</span>
                                      </label>
                                    </div>
                                  </li>
                                                                  </ul>
                                                              <ul class="second">
                                  <li style="margin-right:10px;">
                                    <div class="cell">
                                      <label class="w120">
                                        <i class="checkbox-common">
                                        <input type="checkbox" name="add_per" dir="son" id="11102" value="11102" onclick="AllCheckBoxClick(event);">&nbsp;
                                        </i>
                                        <span style="font-weight:normal;color:#000;">砍价订单</span>
                                      </label>
                                    </div>
                                  </li>

                                  <li>
                                    <div class="cell">
                                      <label class="w120">
                                        <i class="checkbox-common left-10">
                                        <input type="checkbox" name="add_per" dir="sonson" id="11103" value="11103" onclick="AllCheckBoxClick(event);">&nbsp;
                                        </i>
                                        <span style="font-weight:normal;color:#666;">订单详情</span>
                                      </label>
                                    </div>
                                  </li>
                                                                  </ul>
                                                              <ul class="second">
                                  <li style="margin-right:10px;">
                                    <div class="cell">
                                      <label class="w120">
                                        <i class="checkbox-common">
                                        <input type="checkbox" name="add_per" dir="son" id="11079" value="11079" onclick="AllCheckBoxClick(event);">&nbsp;
                                        </i>
                                        <span style="font-weight:normal;color:#000;">发票管理</span>
                                      </label>
                                    </div>
                                  </li>
                                                                  </ul>
                                                              <ul class="second">
                                  <li style="margin-right:10px;">
                                    <div class="cell">
                                      <label class="w120">
                                        <i class="checkbox-common">
                                        <input type="checkbox" name="add_per" dir="son" id="11085" value="11085" onclick="AllCheckBoxClick(event);">&nbsp;
                                        </i>
                                        <span style="font-weight:normal;color:#000;">售后服务</span>
                                      </label>
                                    </div>
                                  </li>

                                  <li>
                                    <div class="cell">
                                      <label class="w120">
                                        <i class="checkbox-common left-10">
                                        <input type="checkbox" name="add_per" dir="sonson" id="11086" value="11086" onclick="AllCheckBoxClick(event);">&nbsp;
                                        </i>
                                        <span style="font-weight:normal;color:#666;">售后详情</span>
                                      </label>
                                    </div>
                                  </li>
                                                                  </ul>
                                                            </td>
                            </tr>
                              <tr class="tr-Current">
                                <td>
                                  <div>
                                    <label>
                                      <i class="checkbox-common">
                                        <input type="checkbox" name="add_per" dir="parent" id="179" value="179" onclick="AllCheckBoxClick(event);">
                                      </i>
                                      &nbsp;营销
                                    </label>
                                  </div>
                                </td>
                              <td>
                                                              <ul class="second">
                                  <li style="margin-right:10px;">
                                    <div class="cell">
                                      <label class="w120">
                                        <i class="checkbox-common">
                                        <input type="checkbox" name="add_per" dir="son" id="180" value="180" onclick="AllCheckBoxClick(event);">&nbsp;
                                        </i>
                                        <span style="font-weight:normal;color:#000;">优惠券</span>
                                      </label>
                                    </div>
                                  </li>

                                  <li>
                                    <div class="cell">
                                      <label class="w120">
                                        <i class="checkbox-common left-10">
                                        <input type="checkbox" name="add_per" dir="sonson" id="11088" value="11088" onclick="AllCheckBoxClick(event);">&nbsp;
                                        </i>
                                        <span style="font-weight:normal;color:#666;">优惠券发放记录</span>
                                      </label>
                                    </div>
                                  </li>

                                  <li>
                                    <div class="cell">
                                      <label class="w120">
                                        <i class="checkbox-common left-10">
                                        <input type="checkbox" name="add_per" dir="sonson" id="186" value="186" onclick="AllCheckBoxClick(event);">&nbsp;
                                        </i>
                                        <span style="font-weight:normal;color:#666;">添加优惠券</span>
                                      </label>
                                    </div>
                                  </li>

                                  <li>
                                    <div class="cell">
                                      <label class="w120">
                                        <i class="checkbox-common left-10">
                                        <input type="checkbox" name="add_per" dir="sonson" id="187" value="187" onclick="AllCheckBoxClick(event);">&nbsp;
                                        </i>
                                        <span style="font-weight:normal;color:#666;">修改优惠券</span>
                                      </label>
                                    </div>
                                  </li>
                                                                  </ul>
                                                              <ul class="second">
                                  <li style="margin-right:10px;">
                                    <div class="cell">
                                      <label class="w120">
                                        <i class="checkbox-common">
                                        <input type="checkbox" name="add_per" dir="son" id="446" value="446" onclick="AllCheckBoxClick(event);">&nbsp;
                                        </i>
                                        <span style="font-weight:normal;color:#000;">积分管理</span>
                                      </label>
                                    </div>
                                  </li>
                                                                  </ul>
                                                              <ul class="second">
                                  <li style="margin-right:10px;">
                                    <div class="cell">
                                      <label class="w120">
                                        <i class="checkbox-common">
                                        <input type="checkbox" name="add_per" dir="son" id="195" value="195" onclick="AllCheckBoxClick(event);">&nbsp;
                                        </i>
                                        <span style="font-weight:normal;color:#000;">赠品</span>
                                      </label>
                                    </div>
                                  </li>

                                  <li>
                                    <div class="cell">
                                      <label class="w120">
                                        <i class="checkbox-common left-10">
                                        <input type="checkbox" name="add_per" dir="sonson" id="11060" value="11060" onclick="AllCheckBoxClick(event);">&nbsp;
                                        </i>
                                        <span style="font-weight:normal;color:#666;">赠品发放记录</span>
                                      </label>
                                    </div>
                                  </li>

                                  <li>
                                    <div class="cell">
                                      <label class="w120">
                                        <i class="checkbox-common left-10">
                                        <input type="checkbox" name="add_per" dir="sonson" id="196" value="196" onclick="AllCheckBoxClick(event);">&nbsp;
                                        </i>
                                        <span style="font-weight:normal;color:#666;">添加赠品</span>
                                      </label>
                                    </div>
                                  </li>

                                  <li>
                                    <div class="cell">
                                      <label class="w120">
                                        <i class="checkbox-common left-10">
                                        <input type="checkbox" name="add_per" dir="sonson" id="197" value="197" onclick="AllCheckBoxClick(event);">&nbsp;
                                        </i>
                                        <span style="font-weight:normal;color:#666;">修改赠品</span>
                                      </label>
                                    </div>
                                  </li>
                                                                  </ul>
                                                              <ul class="second">
                                  <li style="margin-right:10px;">
                                    <div class="cell">
                                      <label class="w120">
                                        <i class="checkbox-common">
                                        <input type="checkbox" name="add_per" dir="son" id="198" value="198" onclick="AllCheckBoxClick(event);">&nbsp;
                                        </i>
                                        <span style="font-weight:normal;color:#000;">满减送</span>
                                      </label>
                                    </div>
                                  </li>

                                  <li>
                                    <div class="cell">
                                      <label class="w120">
                                        <i class="checkbox-common left-10">
                                        <input type="checkbox" name="add_per" dir="sonson" id="199" value="199" onclick="AllCheckBoxClick(event);">&nbsp;
                                        </i>
                                        <span style="font-weight:normal;color:#666;">添加满减满送</span>
                                      </label>
                                    </div>
                                  </li>

                                  <li>
                                    <div class="cell">
                                      <label class="w120">
                                        <i class="checkbox-common left-10">
                                        <input type="checkbox" name="add_per" dir="sonson" id="200" value="200" onclick="AllCheckBoxClick(event);">&nbsp;
                                        </i>
                                        <span style="font-weight:normal;color:#666;">编辑满减送</span>
                                      </label>
                                    </div>
                                  </li>
                                                                  </ul>
                                                              <ul class="second">
                                  <li style="margin-right:10px;">
                                    <div class="cell">
                                      <label class="w120">
                                        <i class="checkbox-common">
                                        <input type="checkbox" name="add_per" dir="son" id="11098" value="11098" onclick="AllCheckBoxClick(event);">&nbsp;
                                        </i>
                                        <span style="font-weight:normal;color:#000;">砍价活动</span>
                                      </label>
                                    </div>
                                  </li>

                                  <li>
                                    <div class="cell">
                                      <label class="w120">
                                        <i class="checkbox-common left-10">
                                        <input type="checkbox" name="add_per" dir="sonson" id="11099" value="11099" onclick="AllCheckBoxClick(event);">&nbsp;
                                        </i>
                                        <span style="font-weight:normal;color:#666;">砍价配置</span>
                                      </label>
                                    </div>
                                  </li>

                                  <li>
                                    <div class="cell">
                                      <label class="w120">
                                        <i class="checkbox-common left-10">
                                        <input type="checkbox" name="add_per" dir="sonson" id="11100" value="11100" onclick="AllCheckBoxClick(event);">&nbsp;
                                        </i>
                                        <span style="font-weight:normal;color:#666;">添加活动</span>
                                      </label>
                                    </div>
                                  </li>

                                  <li>
                                    <div class="cell">
                                      <label class="w120">
                                        <i class="checkbox-common left-10">
                                        <input type="checkbox" name="add_per" dir="sonson" id="11101" value="11101" onclick="AllCheckBoxClick(event);">&nbsp;
                                        </i>
                                        <span style="font-weight:normal;color:#666;">修改活动</span>
                                      </label>
                                    </div>
                                  </li>
                                                                  </ul>
                                                              <ul class="second">
                                  <li style="margin-right:10px;">
                                    <div class="cell">
                                      <label class="w120">
                                        <i class="checkbox-common">
                                        <input type="checkbox" name="add_per" dir="son" id="201" value="201" onclick="AllCheckBoxClick(event);">&nbsp;
                                        </i>
                                        <span style="font-weight:normal;color:#000;">限时折扣</span>
                                      </label>
                                    </div>
                                  </li>

                                  <li>
                                    <div class="cell">
                                      <label class="w120">
                                        <i class="checkbox-common left-10">
                                        <input type="checkbox" name="add_per" dir="sonson" id="202" value="202" onclick="AllCheckBoxClick(event);">&nbsp;
                                        </i>
                                        <span style="font-weight:normal;color:#666;">添加限时折扣</span>
                                      </label>
                                    </div>
                                  </li>

                                  <li>
                                    <div class="cell">
                                      <label class="w120">
                                        <i class="checkbox-common left-10">
                                        <input type="checkbox" name="add_per" dir="sonson" id="203" value="203" onclick="AllCheckBoxClick(event);">&nbsp;
                                        </i>
                                        <span style="font-weight:normal;color:#666;">修改限时折扣</span>
                                      </label>
                                    </div>
                                  </li>
                                                                  </ul>
                                                              <ul class="second">
                                  <li style="margin-right:10px;">
                                    <div class="cell">
                                      <label class="w120">
                                        <i class="checkbox-common">
                                        <input type="checkbox" name="add_per" dir="son" id="11041" value="11041" onclick="AllCheckBoxClick(event);">&nbsp;
                                        </i>
                                        <span style="font-weight:normal;color:#000;">组合套餐</span>
                                      </label>
                                    </div>
                                  </li>

                                  <li>
                                    <div class="cell">
                                      <label class="w120">
                                        <i class="checkbox-common left-10">
                                        <input type="checkbox" name="add_per" dir="sonson" id="11042" value="11042" onclick="AllCheckBoxClick(event);">&nbsp;
                                        </i>
                                        <span style="font-weight:normal;color:#666;">编辑组合套餐</span>
                                      </label>
                                    </div>
                                  </li>
                                                                  </ul>
                                                              <ul class="second">
                                  <li style="margin-right:10px;">
                                    <div class="cell">
                                      <label class="w120">
                                        <i class="checkbox-common">
                                        <input type="checkbox" name="add_per" dir="son" id="469" value="469" onclick="AllCheckBoxClick(event);">&nbsp;
                                        </i>
                                        <span style="font-weight:normal;color:#000;">满额包邮</span>
                                      </label>
                                    </div>
                                  </li>
                                                                  </ul>
                                                              <ul class="second">
                                  <li style="margin-right:10px;">
                                    <div class="cell">
                                      <label class="w120">
                                        <i class="checkbox-common">
                                        <input type="checkbox" name="add_per" dir="son" id="11057" value="11057" onclick="AllCheckBoxClick(event);">&nbsp;
                                        </i>
                                        <span style="font-weight:normal;color:#000;">奖励规则</span>
                                      </label>
                                    </div>
                                  </li>
                                                                  </ul>
                                                              <ul class="second">
                                  <li style="margin-right:10px;">
                                    <div class="cell">
                                      <label class="w120">
                                        <i class="checkbox-common">
                                        <input type="checkbox" name="add_per" dir="son" id="11061" value="11061" onclick="AllCheckBoxClick(event);">&nbsp;
                                        </i>
                                        <span style="font-weight:normal;color:#000;">互动游戏</span>
                                      </label>
                                    </div>
                                  </li>

                                  <li>
                                    <div class="cell">
                                      <label class="w120">
                                        <i class="checkbox-common left-10">
                                        <input type="checkbox" name="add_per" dir="sonson" id="11062" value="11062" onclick="AllCheckBoxClick(event);">&nbsp;
                                        </i>
                                        <span style="font-weight:normal;color:#666;">添加活动</span>
                                      </label>
                                    </div>
                                  </li>

                                  <li>
                                    <div class="cell">
                                      <label class="w120">
                                        <i class="checkbox-common left-10">
                                        <input type="checkbox" name="add_per" dir="sonson" id="11063" value="11063" onclick="AllCheckBoxClick(event);">&nbsp;
                                        </i>
                                        <span style="font-weight:normal;color:#666;">活动类型</span>
                                      </label>
                                    </div>
                                  </li>

                                  <li>
                                    <div class="cell">
                                      <label class="w120">
                                        <i class="checkbox-common left-10">
                                        <input type="checkbox" name="add_per" dir="sonson" id="11064" value="11064" onclick="AllCheckBoxClick(event);">&nbsp;
                                        </i>
                                        <span style="font-weight:normal;color:#666;">修改互动游戏</span>
                                      </label>
                                    </div>
                                  </li>

                                  <li>
                                    <div class="cell">
                                      <label class="w120">
                                        <i class="checkbox-common left-10">
                                        <input type="checkbox" name="add_per" dir="sonson" id="11065" value="11065" onclick="AllCheckBoxClick(event);">&nbsp;
                                        </i>
                                        <span style="font-weight:normal;color:#666;">游戏奖项</span>
                                      </label>
                                    </div>
                                  </li>

                                  <li>
                                    <div class="cell">
                                      <label class="w120">
                                        <i class="checkbox-common left-10">
                                        <input type="checkbox" name="add_per" dir="sonson" id="11066" value="11066" onclick="AllCheckBoxClick(event);">&nbsp;
                                        </i>
                                        <span style="font-weight:normal;color:#666;">获奖记录</span>
                                      </label>
                                    </div>
                                  </li>
                                                                  </ul>
                                                              <ul class="second">
                                  <li style="margin-right:10px;">
                                    <div class="cell">
                                      <label class="w120">
                                        <i class="checkbox-common">
                                        <input type="checkbox" name="add_per" dir="son" id="11068" value="11068" onclick="AllCheckBoxClick(event);">&nbsp;
                                        </i>
                                        <span style="font-weight:normal;color:#000;">团购</span>
                                      </label>
                                    </div>
                                  </li>

                                  <li>
                                    <div class="cell">
                                      <label class="w120">
                                        <i class="checkbox-common left-10">
                                        <input type="checkbox" name="add_per" dir="sonson" id="11069" value="11069" onclick="AllCheckBoxClick(event);">&nbsp;
                                        </i>
                                        <span style="font-weight:normal;color:#666;">添加团购活动</span>
                                      </label>
                                    </div>
                                  </li>

                                  <li>
                                    <div class="cell">
                                      <label class="w120">
                                        <i class="checkbox-common left-10">
                                        <input type="checkbox" name="add_per" dir="sonson" id="11070" value="11070" onclick="AllCheckBoxClick(event);">&nbsp;
                                        </i>
                                        <span style="font-weight:normal;color:#666;">修改团购活动</span>
                                      </label>
                                    </div>
                                  </li>
                                                                  </ul>
                                                              <ul class="second">
                                  <li style="margin-right:10px;">
                                    <div class="cell">
                                      <label class="w120">
                                        <i class="checkbox-common">
                                        <input type="checkbox" name="add_per" dir="son" id="11043" value="11043" onclick="AllCheckBoxClick(event);">&nbsp;
                                        </i>
                                        <span style="font-weight:normal;color:#000;">拼团</span>
                                      </label>
                                    </div>
                                  </li>

                                  <li>
                                    <div class="cell">
                                      <label class="w120">
                                        <i class="checkbox-common left-10">
                                        <input type="checkbox" name="add_per" dir="sonson" id="11044" value="11044" onclick="AllCheckBoxClick(event);">&nbsp;
                                        </i>
                                        <span style="font-weight:normal;color:#666;">拼团设置</span>
                                      </label>
                                    </div>
                                  </li>

                                  <li>
                                    <div class="cell">
                                      <label class="w120">
                                        <i class="checkbox-common left-10">
                                        <input type="checkbox" name="add_per" dir="sonson" id="11047" value="11047" onclick="AllCheckBoxClick(event);">&nbsp;
                                        </i>
                                        <span style="font-weight:normal;color:#666;">拼团列表</span>
                                      </label>
                                    </div>
                                  </li>
                                                                  </ul>
                                                              <ul class="second">
                                  <li style="margin-right:10px;">
                                    <div class="cell">
                                      <label class="w120">
                                        <i class="checkbox-common">
                                        <input type="checkbox" name="add_per" dir="son" id="11090" value="11090" onclick="AllCheckBoxClick(event);">&nbsp;
                                        </i>
                                        <span style="font-weight:normal;color:#000;">专题活动</span>
                                      </label>
                                    </div>
                                  </li>

                                  <li>
                                    <div class="cell">
                                      <label class="w120">
                                        <i class="checkbox-common left-10">
                                        <input type="checkbox" name="add_per" dir="sonson" id="11091" value="11091" onclick="AllCheckBoxClick(event);">&nbsp;
                                        </i>
                                        <span style="font-weight:normal;color:#666;">添加专题活动</span>
                                      </label>
                                    </div>
                                  </li>

                                  <li>
                                    <div class="cell">
                                      <label class="w120">
                                        <i class="checkbox-common left-10">
                                        <input type="checkbox" name="add_per" dir="sonson" id="11092" value="11092" onclick="AllCheckBoxClick(event);">&nbsp;
                                        </i>
                                        <span style="font-weight:normal;color:#666;">修改专题活动</span>
                                      </label>
                                    </div>
                                  </li>
                                                                  </ul>
                                                            </td>
                            </tr>
                                                          <tr class="tr-Current">
                                <td>
                                  <div>
                                    <label>
                                      <i class="checkbox-common">
                                        <input type="checkbox" name="add_per" dir="parent" id="137" value="137" onclick="AllCheckBoxClick(event);">
                                      </i>
                                      &nbsp;会员
                                    </label>
                                  </div>
                                </td>
                              <td>
                                                              <ul class="second">
                                  <li style="margin-right:10px;">
                                    <div class="cell">
                                      <label class="w120">
                                        <i class="checkbox-common">
                                        <input type="checkbox" name="add_per" dir="son" id="145" value="145" onclick="AllCheckBoxClick(event);">&nbsp;
                                        </i>
                                        <span style="font-weight:normal;color:#000;">会员列表</span>
                                      </label>
                                    </div>
                                  </li>

                                  <li>
                                    <div class="cell">
                                      <label class="w120">
                                        <i class="checkbox-common left-10">
                                        <input type="checkbox" name="add_per" dir="sonson" id="11067" value="11067" onclick="AllCheckBoxClick(event);">&nbsp;
                                        </i>
                                        <span style="font-weight:normal;color:#666;">会员足迹</span>
                                      </label>
                                    </div>
                                  </li>

                                  <li>
                                    <div class="cell">
                                      <label class="w120">
                                        <i class="checkbox-common left-10">
                                        <input type="checkbox" name="add_per" dir="sonson" id="11073" value="11073" onclick="AllCheckBoxClick(event);">&nbsp;
                                        </i>
                                        <span style="font-weight:normal;color:#666;">会员余额明细</span>
                                      </label>
                                    </div>
                                  </li>

                                  <li>
                                    <div class="cell">
                                      <label class="w120">
                                        <i class="checkbox-common left-10">
                                        <input type="checkbox" name="add_per" dir="sonson" id="497" value="497" onclick="AllCheckBoxClick(event);">&nbsp;
                                        </i>
                                        <span style="font-weight:normal;color:#666;">会员积分明细</span>
                                      </label>
                                    </div>
                                  </li>

                                  <li>
                                    <div class="cell">
                                      <label class="w120">
                                        <i class="checkbox-common left-10">
                                        <input type="checkbox" name="add_per" dir="sonson" id="498" value="498" onclick="AllCheckBoxClick(event);">&nbsp;
                                        </i>
                                        <span style="font-weight:normal;color:#666;">会员余额明细</span>
                                      </label>
                                    </div>
                                  </li>
                                                                  </ul>
                                                              <ul class="second">
                                  <li style="margin-right:10px;">
                                    <div class="cell">
                                      <label class="w120">
                                        <i class="checkbox-common">
                                        <input type="checkbox" name="add_per" dir="son" id="488" value="488" onclick="AllCheckBoxClick(event);">&nbsp;
                                        </i>
                                        <span style="font-weight:normal;color:#000;">会员等级</span>
                                      </label>
                                    </div>
                                  </li>

                                  <li>
                                    <div class="cell">
                                      <label class="w120">
                                        <i class="checkbox-common left-10">
                                        <input type="checkbox" name="add_per" dir="sonson" id="490" value="490" onclick="AllCheckBoxClick(event);">&nbsp;
                                        </i>
                                        <span style="font-weight:normal;color:#666;">修改等级</span>
                                      </label>
                                    </div>
                                  </li>

                                  <li>
                                    <div class="cell">
                                      <label class="w120">
                                        <i class="checkbox-common left-10">
                                        <input type="checkbox" name="add_per" dir="sonson" id="489" value="489" onclick="AllCheckBoxClick(event);">&nbsp;
                                        </i>
                                        <span style="font-weight:normal;color:#666;">添加等级</span>
                                      </label>
                                    </div>
                                  </li>
                                                                  </ul>
                                                              <ul class="second">
                                  <li style="margin-right:10px;">
                                    <div class="cell">
                                      <label class="w120">
                                        <i class="checkbox-common">
                                        <input type="checkbox" name="add_per" dir="son" id="504" value="504" onclick="AllCheckBoxClick(event);">&nbsp;
                                        </i>
                                        <span style="font-weight:normal;color:#000;">会员提现</span>
                                      </label>
                                    </div>
                                  </li>
                                                                  </ul>
                                                              <ul class="second">
                                  <li style="margin-right:10px;">
                                    <div class="cell">
                                      <label class="w120">
                                        <i class="checkbox-common">
                                        <input type="checkbox" name="add_per" dir="son" id="509" value="509" onclick="AllCheckBoxClick(event);">&nbsp;
                                        </i>
                                        <span style="font-weight:normal;color:#000;">积分管理</span>
                                      </label>
                                    </div>
                                  </li>
                                                                  </ul>
                                                              <ul class="second">
                                  <li style="margin-right:10px;">
                                    <div class="cell">
                                      <label class="w120">
                                        <i class="checkbox-common">
                                        <input type="checkbox" name="add_per" dir="son" id="510" value="510" onclick="AllCheckBoxClick(event);">&nbsp;
                                        </i>
                                        <span style="font-weight:normal;color:#000;">余额管理</span>
                                      </label>
                                    </div>
                                  </li>
                                                                  </ul>
                                                            </td>
                            </tr>
                                                          <tr class="tr-Current">
                                <td>
                                  <div>
                                    <label>
                                      <i class="checkbox-common">
                                        <input type="checkbox" name="add_per" dir="parent" id="409" value="409" onclick="AllCheckBoxClick(event);">
                                      </i>
                                      &nbsp;数据
                                    </label>
                                  </div>
                                </td>
                              <td>
                                                              <ul class="second">
                                  <li style="margin-right:10px;">
                                    <div class="cell">
                                      <label class="w120">
                                        <i class="checkbox-common">
                                        <input type="checkbox" name="add_per" dir="son" id="459" value="459" onclick="AllCheckBoxClick(event);">&nbsp;
                                        </i>
                                        <span style="font-weight:normal;color:#000;">销售概况</span>
                                      </label>
                                    </div>
                                  </li>
                                                                  </ul>
                                                              <ul class="second">
                                  <li style="margin-right:10px;">
                                    <div class="cell">
                                      <label class="w120">
                                        <i class="checkbox-common">
                                        <input type="checkbox" name="add_per" dir="son" id="463" value="463" onclick="AllCheckBoxClick(event);">&nbsp;
                                        </i>
                                        <span style="font-weight:normal;color:#000;">商品分析</span>
                                      </label>
                                    </div>
                                  </li>

                                  <li>
                                    <div class="cell">
                                      <label class="w120">
                                        <i class="checkbox-common left-10">
                                        <input type="checkbox" name="add_per" dir="sonson" id="460" value="460" onclick="AllCheckBoxClick(event);">&nbsp;
                                        </i>
                                        <span style="font-weight:normal;color:#666;">热卖商品</span>
                                      </label>
                                    </div>
                                  </li>
                                                                  </ul>
                                                              <ul class="second">
                                  <li style="margin-right:10px;">
                                    <div class="cell">
                                      <label class="w120">
                                        <i class="checkbox-common">
                                        <input type="checkbox" name="add_per" dir="son" id="461" value="461" onclick="AllCheckBoxClick(event);">&nbsp;
                                        </i>
                                        <span style="font-weight:normal;color:#000;">同行热卖</span>
                                      </label>
                                    </div>
                                  </li>
                                                                  </ul>
                                                              <ul class="second">
                                  <li style="margin-right:10px;">
                                    <div class="cell">
                                      <label class="w120">
                                        <i class="checkbox-common">
                                        <input type="checkbox" name="add_per" dir="son" id="462" value="462" onclick="AllCheckBoxClick(event);">&nbsp;
                                        </i>
                                        <span style="font-weight:normal;color:#000;">运营报告</span>
                                      </label>
                                    </div>
                                  </li>
                                                                  </ul>
                                                              <ul class="second">
                                  <li style="margin-right:10px;">
                                    <div class="cell">
                                      <label class="w120">
                                        <i class="checkbox-common">
                                        <input type="checkbox" name="add_per" dir="son" id="454" value="454" onclick="AllCheckBoxClick(event);">&nbsp;
                                        </i>
                                        <span style="font-weight:normal;color:#000;">销售统计</span>
                                      </label>
                                    </div>
                                  </li>

                                  <li>
                                    <div class="cell">
                                      <label class="w120">
                                        <i class="checkbox-common left-10">
                                        <input type="checkbox" name="add_per" dir="sonson" id="457" value="457" onclick="AllCheckBoxClick(event);">&nbsp;
                                        </i>
                                        <span style="font-weight:normal;color:#666;">销售明细</span>
                                      </label>
                                    </div>
                                  </li>
                                                                  </ul>
                                                              <ul class="second">
                                  <li style="margin-right:10px;">
                                    <div class="cell">
                                      <label class="w120">
                                        <i class="checkbox-common">
                                        <input type="checkbox" name="add_per" dir="son" id="403" value="403" onclick="AllCheckBoxClick(event);">&nbsp;
                                        </i>
                                        <span style="font-weight:normal;color:#000;">销售排行</span>
                                      </label>
                                    </div>
                                  </li>

                                  <li>
                                    <div class="cell">
                                      <label class="w120">
                                        <i class="checkbox-common left-10">
                                        <input type="checkbox" name="add_per" dir="sonson" id="405" value="405" onclick="AllCheckBoxClick(event);">&nbsp;
                                        </i>
                                        <span style="font-weight:normal;color:#666;">商品销售统计</span>
                                      </label>
                                    </div>
                                  </li>
                                </ul>
                            </td>
                            </tr>
                              <tr class="tr-Current">
                                <td>
                                  <div>
                                    <label>
                                      <i class="checkbox-common">
                                        <input type="checkbox" name="add_per" dir="parent" id="335" value="335" onclick="AllCheckBoxClick(event);">
                                      </i>
                                      &nbsp;微信
                                    </label>
                                  </div>
                                </td>
                              <td>
                                                              <ul class="second">
                                  <li style="margin-right:10px;">
                                    <div class="cell">
                                      <label class="w120">
                                        <i class="checkbox-common">
                                        <input type="checkbox" name="add_per" dir="son" id="11071" value="11071" onclick="AllCheckBoxClick(event);">&nbsp;
                                        </i>
                                        <span style="font-weight:normal;color:#000;">微信小程序管理</span>
                                      </label>
                                    </div>
                                  </li>
                                                                  </ul>
                                                              <ul class="second">
                                  <li style="margin-right:10px;">
                                    <div class="cell">
                                      <label class="w120">
                                        <i class="checkbox-common">
                                        <input type="checkbox" name="add_per" dir="son" id="336" value="336" onclick="AllCheckBoxClick(event);">&nbsp;
                                        </i>
                                        <span style="font-weight:normal;color:#000;">公众号管理</span>
                                      </label>
                                    </div>
                                  </li>
                                                                  </ul>
                                                              <ul class="second">
                                  <li style="margin-right:10px;">
                                    <div class="cell">
                                      <label class="w120">
                                        <i class="checkbox-common">
                                        <input type="checkbox" name="add_per" dir="son" id="339" value="339" onclick="AllCheckBoxClick(event);">&nbsp;
                                        </i>
                                        <span style="font-weight:normal;color:#000;">微信菜单管理</span>
                                      </label>
                                    </div>
                                  </li>
                                                                  </ul>
                                                              <ul class="second">
                                  <li style="margin-right:10px;">
                                    <div class="cell">
                                      <label class="w120">
                                        <i class="checkbox-common">
                                        <input type="checkbox" name="add_per" dir="son" id="340" value="340" onclick="AllCheckBoxClick(event);">&nbsp;
                                        </i>
                                        <span style="font-weight:normal;color:#000;">推广二维码管理</span>
                                      </label>
                                    </div>
                                  </li>

                                  <li>
                                    <div class="cell">
                                      <label class="w120">
                                        <i class="checkbox-common left-10">
                                        <input type="checkbox" name="add_per" dir="sonson" id="358" value="358" onclick="AllCheckBoxClick(event);">&nbsp;
                                        </i>
                                        <span style="font-weight:normal;color:#666;">自定义推广二维码</span>
                                      </label>
                                    </div>
                                  </li>
                                                                  </ul>
                                                              <ul class="second">
                                  <li style="margin-right:10px;">
                                    <div class="cell">
                                      <label class="w120">
                                        <i class="checkbox-common">
                                        <input type="checkbox" name="add_per" dir="son" id="341" value="341" onclick="AllCheckBoxClick(event);">&nbsp;
                                        </i>
                                        <span style="font-weight:normal;color:#000;">回复设置</span>
                                      </label>
                                    </div>
                                  </li>

                                  <li>
                                    <div class="cell">
                                      <label class="w120">
                                        <i class="checkbox-common left-10">
                                        <input type="checkbox" name="add_per" dir="sonson" id="359" value="359" onclick="AllCheckBoxClick(event);">&nbsp;
                                        </i>
                                        <span style="font-weight:normal;color:#666;">添加回复</span>
                                      </label>
                                    </div>
                                  </li>
                                                                  </ul>
                                                              <ul class="second">
                                  <li style="margin-right:10px;">
                                    <div class="cell">
                                      <label class="w120">
                                        <i class="checkbox-common">
                                        <input type="checkbox" name="add_per" dir="son" id="342" value="342" onclick="AllCheckBoxClick(event);">&nbsp;
                                        </i>
                                        <span style="font-weight:normal;color:#000;">消息素材管理</span>
                                      </label>
                                    </div>
                                  </li>

                                  <li>
                                    <div class="cell">
                                      <label class="w120">
                                        <i class="checkbox-common left-10">
                                        <input type="checkbox" name="add_per" dir="sonson" id="450" value="450" onclick="AllCheckBoxClick(event);">&nbsp;
                                        </i>
                                        <span style="font-weight:normal;color:#666;">修改消息素材</span>
                                      </label>
                                    </div>
                                  </li>

                                  <li>
                                    <div class="cell">
                                      <label class="w120">
                                        <i class="checkbox-common left-10">
                                        <input type="checkbox" name="add_per" dir="sonson" id="451" value="451" onclick="AllCheckBoxClick(event);">&nbsp;
                                        </i>
                                        <span style="font-weight:normal;color:#666;">添加消息素材</span>
                                      </label>
                                    </div>
                                  </li>
                                                                  </ul>
                                                              <ul class="second">
                                  <li style="margin-right:10px;">
                                    <div class="cell">
                                      <label class="w120">
                                        <i class="checkbox-common">
                                        <input type="checkbox" name="add_per" dir="son" id="361" value="361" onclick="AllCheckBoxClick(event);">&nbsp;
                                        </i>
                                        <span style="font-weight:normal;color:#000;">一键关注设置</span>
                                      </label>
                                    </div>
                                  </li>
                                                                  </ul>
                                                              <ul class="second">
                                  <li style="margin-right:10px;">
                                    <div class="cell">
                                      <label class="w120">
                                        <i class="checkbox-common">
                                        <input type="checkbox" name="add_per" dir="son" id="343" value="343" onclick="AllCheckBoxClick(event);">&nbsp;
                                        </i>
                                        <span style="font-weight:normal;color:#000;">分享内容设置</span>
                                      </label>
                                    </div>
                                  </li>
                                                                  </ul>
                                                              <ul class="second">
                                  <li style="margin-right:10px;">
                                    <div class="cell">
                                      <label class="w120">
                                        <i class="checkbox-common">
                                        <input type="checkbox" name="add_per" dir="son" id="11104" value="11104" onclick="AllCheckBoxClick(event);">&nbsp;
                                        </i>
                                        <span style="font-weight:normal;color:#000;">模板消息设置</span>
                                      </label>
                                    </div>
                                  </li>
                                                                  </ul>
                                                              <ul class="second">
                                  <li style="margin-right:10px;">
                                    <div class="cell">
                                      <label class="w120">
                                        <i class="checkbox-common">
                                        <input type="checkbox" name="add_per" dir="son" id="447" value="447" onclick="AllCheckBoxClick(event);">&nbsp;
                                        </i>
                                        <span style="font-weight:normal;color:#000;">粉丝列表</span>
                                      </label>
                                    </div>
                                  </li>
                                                                  </ul>
                                                              <ul class="second">
                                  <li style="margin-right:10px;">
                                    <div class="cell">
                                      <label class="w120">
                                        <i class="checkbox-common">
                                        <input type="checkbox" name="add_per" dir="son" id="11058" value="11058" onclick="AllCheckBoxClick(event);">&nbsp;
                                        </i>
                                        <span style="font-weight:normal;color:#000;">一键关注设置</span>
                                      </label>
                                    </div>
                                  </li>
                                                                  </ul>
                                                              <ul class="second">
                                  <li style="margin-right:10px;">
                                    <div class="cell">
                                      <label class="w120">
                                        <i class="checkbox-common">
                                        <input type="checkbox" name="add_per" dir="son" id="11082" value="11082" onclick="AllCheckBoxClick(event);">&nbsp;
                                        </i>
                                        <span style="font-weight:normal;color:#000;">客服管理</span>
                                      </label>
                                    </div>
                                  </li>
                                    </ul>
                              </td>
                            </tr>
                            <tr class="tr-Current">
                                <td>
                                  <div>
                                    <label>
                                      <i class="checkbox-common">
                                        <input type="checkbox" name="add_per" dir="parent" id="1001" value="1001" onclick="AllCheckBoxClick(event);">
                                      </i>
                                      &nbsp;佣金
                                    </label>
                                  </div>
                                </td>
                              <td>
                                                              <ul class="second">
                                  <li style="margin-right:10px;">
                                    <div class="cell">
                                      <label class="w120">
                                        <i class="checkbox-common">
                                        <input type="checkbox" name="add_per" dir="son" id="1002" value="1002" onclick="AllCheckBoxClick(event);">&nbsp;
                                        </i>
                                        <span style="font-weight:normal;color:#000;">推广员佣金</span>
                                      </label>
                                    </div>
                                  </li>
                                                                  </ul>
                                                              <ul class="second">
                                  <li style="margin-right:10px;">
                                    <div class="cell">
                                      <label class="w120">
                                        <i class="checkbox-common">
                                        <input type="checkbox" name="add_per" dir="son" id="1003" value="1003" onclick="AllCheckBoxClick(event);">&nbsp;
                                        </i>
                                        <span style="font-weight:normal;color:#000;">三级分销</span>
                                      </label>
                                    </div>
                                  </li>
                                                                  </ul>
                                                              <ul class="second">
                                  <li style="margin-right:10px;">
                                    <div class="cell">
                                      <label class="w120">
                                        <i class="checkbox-common">
                                        <input type="checkbox" name="add_per" dir="son" id="1004" value="1004" onclick="AllCheckBoxClick(event);">&nbsp;
                                        </i>
                                        <span style="font-weight:normal;color:#000;">股东分红</span>
                                      </label>
                                    </div>
                                  </li>
                                                                  </ul>
                                                              <ul class="second">
                                  <li style="margin-right:10px;">
                                    <div class="cell">
                                      <label class="w120">
                                        <i class="checkbox-common">
                                        <input type="checkbox" name="add_per" dir="son" id="1005" value="1005" onclick="AllCheckBoxClick(event);">&nbsp;
                                        </i>
                                        <span style="font-weight:normal;color:#000;">区域代理</span>
                                      </label>
                                    </div>
                                  </li>
                                                                  </ul>
                                                              <ul class="second">
                                  <li style="margin-right:10px;">
                                    <div class="cell">
                                      <label class="w120">
                                        <i class="checkbox-common">
                                        <input type="checkbox" name="add_per" dir="son" id="1006" value="1006" onclick="AllCheckBoxClick(event);">&nbsp;
                                        </i>
                                        <span style="font-weight:normal;color:#000;">全球分红</span>
                                      </label>
                                    </div>
                                  </li>
                                </ul>
                                <ul class="second">
                                  <li style="margin-right:10px;">
                                    <div class="cell">
                                      <label class="w120">
                                        <i class="checkbox-common">
                                        <input type="checkbox" name="add_per" dir="son" id="1007" value="1007" onclick="AllCheckBoxClick(event);">&nbsp;
                                        </i>
                                        <span style="font-weight:normal;color:#000;">会员提现</span>
                                      </label>
                                    </div>
                                  </li>
                                    </ul>
                              </td>
                            </tr>
                              <tr class="tr-Current">
                                <td>
                                  <div>
                                    <label>
                                      <i class="checkbox-common">
                                        <input type="checkbox" name="add_per" dir="parent" id="477" value="477" onclick="AllCheckBoxClick(event);">
                                      </i>
                                      &nbsp;网站
                                    </label>
                                  </div>
                                </td>
                              <td>
                                                              <ul class="second">
                                  <li style="margin-right:10px;">
                                    <div class="cell">
                                      <label class="w120">
                                        <i class="checkbox-common">
                                        <input type="checkbox" name="add_per" dir="son" id="445" value="445" onclick="AllCheckBoxClick(event);">&nbsp;
                                        </i>
                                        <span style="font-weight:normal;color:#000;">首页公告</span>
                                      </label>
                                    </div>
                                  </li>

                                  <li>
                                    <div class="cell">
                                      <label class="w120">
                                        <i class="checkbox-common left-10">
                                        <input type="checkbox" name="add_per" dir="sonson" id="11029" value="11029" onclick="AllCheckBoxClick(event);">&nbsp;
                                        </i>
                                        <span style="font-weight:normal;color:#666;">添加首页公告</span>
                                      </label>
                                    </div>
                                  </li>

                                  <li>
                                    <div class="cell">
                                      <label class="w120">
                                        <i class="checkbox-common left-10">
                                        <input type="checkbox" name="add_per" dir="sonson" id="11030" value="11030" onclick="AllCheckBoxClick(event);">&nbsp;
                                        </i>
                                        <span style="font-weight:normal;color:#666;">公告编辑</span>
                                      </label>
                                    </div>
                                  </li>
                                    </ul>
                                <ul class="second">
                                  <li style="margin-right:10px;">
                                    <div class="cell">
                                      <label class="w120">
                                        <i class="checkbox-common">
                                          <input type="checkbox" name="add_per" dir="son" id="427" value="427" onclick="AllCheckBoxClick(event);">
                                          &nbsp;
                                        </i>
                                        <span style="font-weight:normal;color:#000;">导航管理</span>
                                      </label>
                                    </div>
                                  </li>
                                                                  </ul>
                                                              <ul class="second">
                                  <li style="margin-right:10px;">
                                    <div class="cell">
                                      <label class="w120">
                                        <i class="checkbox-common">
                                        <input type="checkbox" name="add_per" dir="son" id="11023" value="11023" onclick="AllCheckBoxClick(event);">&nbsp;
                                        </i>
                                        <span style="font-weight:normal;color:#000;">商品楼层</span>
                                      </label>
                                    </div>
                                  </li>
                                                                  </ul>
                                                              <ul class="second">
                                  <li style="margin-right:10px;">
                                    <div class="cell">
                                      <label class="w120">
                                        <i class="checkbox-common">
                                        <input type="checkbox" name="add_per" dir="son" id="10007" value="10007" onclick="AllCheckBoxClick(event);">&nbsp;
                                        </i>
                                        <span style="font-weight:normal;color:#000;">店铺装修</span>
                                      </label>
                                    </div>
                                  </li>

                                  <li>
                                    <div class="cell">
                                      <label class="w120">
                                        <i class="checkbox-common left-10">
                                        <input type="checkbox" name="add_per" dir="sonson" id="394" value="394" onclick="AllCheckBoxClick(event);">&nbsp;
                                        </i>
                                        <span style="font-weight:normal;color:#666;">添加楼层</span>
                                      </label>
                                    </div>
                                  </li>

                                  <li>
                                    <div class="cell">
                                      <label class="w120">
                                        <i class="checkbox-common left-10">
                                        <input type="checkbox" name="add_per" dir="sonson" id="395" value="395" onclick="AllCheckBoxClick(event);">&nbsp;
                                        </i>
                                        <span style="font-weight:normal;color:#666;">楼层编辑</span>
                                      </label>
                                    </div>
                                  </li>

                                  <li>
                                    <div class="cell">
                                      <label class="w120">
                                        <i class="checkbox-common left-10">
                                        <input type="checkbox" name="add_per" dir="sonson" id="11024" value="11024" onclick="AllCheckBoxClick(event);">&nbsp;
                                        </i>
                                        <span style="font-weight:normal;color:#666;">电脑端模板</span>
                                      </label>
                                    </div>
                                  </li>

                                  <li>
                                    <div class="cell">
                                      <label class="w120">
                                        <i class="checkbox-common left-10">
                                        <input type="checkbox" name="add_per" dir="sonson" id="11021" value="11021" onclick="AllCheckBoxClick(event);">&nbsp;
                                        </i>
                                        <span style="font-weight:normal;color:#666;">手机端模板</span>
                                      </label>
                                    </div>
                                  </li>

                                  <li>
                                    <div class="cell">
                                      <label class="w120">
                                        <i class="checkbox-common left-10">
                                        <input type="checkbox" name="add_per" dir="sonson" id="11048" value="11048" onclick="AllCheckBoxClick(event);">&nbsp;
                                        </i>
                                        <span style="font-weight:normal;color:#666;">手机端自定义模板</span>
                                      </label>
                                    </div>
                                  </li>

                                  <li>
                                    <div class="cell">
                                      <label class="w120">
                                        <i class="checkbox-common left-10">
                                        <input type="checkbox" name="add_per" dir="sonson" id="11049" value="11049" onclick="AllCheckBoxClick(event);">&nbsp;
                                        </i>
                                        <span style="font-weight:normal;color:#666;">自定义模板编辑</span>
                                      </label>
                                    </div>
                                  </li>

                                  <li>
                                    <div class="cell">
                                      <label class="w120">
                                        <i class="checkbox-common left-10">
                                        <input type="checkbox" name="add_per" dir="sonson" id="390" value="390" onclick="AllCheckBoxClick(event);">&nbsp;
                                        </i>
                                        <span style="font-weight:normal;color:#666;">促销版块</span>
                                      </label>
                                    </div>
                                  </li>

                                  <li>
                                    <div class="cell">
                                      <label class="w120">
                                        <i class="checkbox-common left-10">
                                        <input type="checkbox" name="add_per" dir="sonson" id="392" value="392" onclick="AllCheckBoxClick(event);">&nbsp;
                                        </i>
                                        <span style="font-weight:normal;color:#666;">首页楼层</span>
                                      </label>
                                    </div>
                                  </li>
                                                                  </ul>
                                                              <ul class="second">
                                  <li style="margin-right:10px;">
                                    <div class="cell">
                                      <label class="w120">
                                        <i class="checkbox-common">
                                        <input type="checkbox" name="add_per" dir="son" id="10008" value="10008" onclick="AllCheckBoxClick(event);">&nbsp;
                                        </i>
                                        <span style="font-weight:normal;color:#000;">搜索</span>
                                      </label>
                                    </div>
                                  </li>

                                  <li>
                                    <div class="cell">
                                      <label class="w120">
                                        <i class="checkbox-common left-10">
                                        <input type="checkbox" name="add_per" dir="sonson" id="11018" value="11018" onclick="AllCheckBoxClick(event);">&nbsp;
                                        </i>
                                        <span style="font-weight:normal;color:#666;">手机模板</span>
                                      </label>
                                    </div>
                                  </li>

                                  <li>
                                    <div class="cell">
                                      <label class="w120">
                                        <i class="checkbox-common left-10">
                                        <input type="checkbox" name="add_per" dir="sonson" id="474" value="474" onclick="AllCheckBoxClick(event);">&nbsp;
                                        </i>
                                        <span style="font-weight:normal;color:#666;">首页公告</span>
                                      </label>
                                    </div>
                                  </li>

                                  <li>
                                    <div class="cell">
                                      <label class="w120">
                                        <i class="checkbox-common left-10">
                                        <input type="checkbox" name="add_per" dir="sonson" id="10009" value="10009" onclick="AllCheckBoxClick(event);">&nbsp;
                                        </i>
                                        <span style="font-weight:normal;color:#666;">促销版块</span>
                                      </label>
                                    </div>
                                  </li>
                                                                  </ul>
                                                              <ul class="second">
                                  <li style="margin-right:10px;">
                                    <div class="cell">
                                      <label class="w120">
                                        <i class="checkbox-common">
                                        <input type="checkbox" name="add_per" dir="son" id="381" value="381" onclick="AllCheckBoxClick(event);">&nbsp;
                                        </i>
                                        <span style="font-weight:normal;color:#000;">广告管理</span>
                                      </label>
                                    </div>
                                  </li>

                                  <li>
                                    <div class="cell">
                                      <label class="w120">
                                        <i class="checkbox-common left-10">
                                        <input type="checkbox" name="add_per" dir="sonson" id="11036" value="11036" onclick="AllCheckBoxClick(event);">&nbsp;
                                        </i>
                                        <span style="font-weight:normal;color:#666;">广告位管理</span>
                                      </label>
                                    </div>
                                  </li>

                                  <li>
                                    <div class="cell">
                                      <label class="w120">
                                        <i class="checkbox-common left-10">
                                        <input type="checkbox" name="add_per" dir="sonson" id="382" value="382" onclick="AllCheckBoxClick(event);">&nbsp;
                                        </i>
                                        <span style="font-weight:normal;color:#666;">广告管理</span>
                                      </label>
                                    </div>
                                  </li>

                                  <li>
                                    <div class="cell">
                                      <label class="w120">
                                        <i class="checkbox-common left-10">
                                        <input type="checkbox" name="add_per" dir="sonson" id="383" value="383" onclick="AllCheckBoxClick(event);">&nbsp;
                                        </i>
                                        <span style="font-weight:normal;color:#666;">添加广告位</span>
                                      </label>
                                    </div>
                                  </li>

                                  <li>
                                    <div class="cell">
                                      <label class="w120">
                                        <i class="checkbox-common left-10">
                                        <input type="checkbox" name="add_per" dir="sonson" id="387" value="387" onclick="AllCheckBoxClick(event);">&nbsp;
                                        </i>
                                        <span style="font-weight:normal;color:#666;">广告位编辑</span>
                                      </label>
                                    </div>
                                  </li>

                                  <li>
                                    <div class="cell">
                                      <label class="w120">
                                        <i class="checkbox-common left-10">
                                        <input type="checkbox" name="add_per" dir="sonson" id="388" value="388" onclick="AllCheckBoxClick(event);">&nbsp;
                                        </i>
                                        <span style="font-weight:normal;color:#666;">添加广告</span>
                                      </label>
                                    </div>
                                  </li>

                                  <li>
                                    <div class="cell">
                                      <label class="w120">
                                        <i class="checkbox-common left-10">
                                        <input type="checkbox" name="add_per" dir="sonson" id="389" value="389" onclick="AllCheckBoxClick(event);">&nbsp;
                                        </i>
                                        <span style="font-weight:normal;color:#666;">广告编辑</span>
                                      </label>
                                    </div>
                                  </li>
                                                                  </ul>
                                                              <ul class="second">
                                  <li style="margin-right:10px;">
                                    <div class="cell">
                                      <label class="w120">
                                        <i class="checkbox-common">
                                        <input type="checkbox" name="add_per" dir="son" id="431" value="431" onclick="AllCheckBoxClick(event);">&nbsp;
                                        </i>
                                        <span style="font-weight:normal;color:#000;">文章管理</span>
                                      </label>
                                    </div>
                                  </li>

                                  <li>
                                    <div class="cell">
                                      <label class="w120">
                                        <i class="checkbox-common left-10">
                                        <input type="checkbox" name="add_per" dir="sonson" id="432" value="432" onclick="AllCheckBoxClick(event);">&nbsp;
                                        </i>
                                        <span style="font-weight:normal;color:#666;">文章列表</span>
                                      </label>
                                    </div>
                                  </li>

                                  <li>
                                    <div class="cell">
                                      <label class="w120">
                                        <i class="checkbox-common left-10">
                                        <input type="checkbox" name="add_per" dir="sonson" id="433" value="433" onclick="AllCheckBoxClick(event);">&nbsp;
                                        </i>
                                        <span style="font-weight:normal;color:#666;">文章分类</span>
                                      </label>
                                    </div>
                                  </li>

                                  <li>
                                    <div class="cell">
                                      <label class="w120">
                                        <i class="checkbox-common left-10">
                                        <input type="checkbox" name="add_per" dir="sonson" id="455" value="455" onclick="AllCheckBoxClick(event);">&nbsp;
                                        </i>
                                        <span style="font-weight:normal;color:#666;">修改文章</span>
                                      </label>
                                    </div>
                                  </li>

                                  <li>
                                    <div class="cell">
                                      <label class="w120">
                                        <i class="checkbox-common left-10">
                                        <input type="checkbox" name="add_per" dir="sonson" id="434" value="434" onclick="AllCheckBoxClick(event);">&nbsp;
                                        </i>
                                        <span style="font-weight:normal;color:#666;">评论列表</span>
                                      </label>
                                    </div>
                                  </li>

                                  <li>
                                    <div class="cell">
                                      <label class="w120">
                                        <i class="checkbox-common left-10">
                                        <input type="checkbox" name="add_per" dir="sonson" id="452" value="452" onclick="AllCheckBoxClick(event);">&nbsp;
                                        </i>
                                        <span style="font-weight:normal;color:#666;">添加文章</span>
                                      </label>
                                    </div>
                                  </li>
                                                                  </ul>
                                                              <ul class="second">
                                  <li style="margin-right:10px;">
                                    <div class="cell">
                                      <label class="w120">
                                        <i class="checkbox-common">
                                        <input type="checkbox" name="add_per" dir="son" id="491" value="491" onclick="AllCheckBoxClick(event);">&nbsp;
                                        </i>
                                        <span style="font-weight:normal;color:#000;">专题列表</span>
                                      </label>
                                    </div>
                                  </li>

                                  <li>
                                    <div class="cell">
                                      <label class="w120">
                                        <i class="checkbox-common left-10">
                                        <input type="checkbox" name="add_per" dir="sonson" id="492" value="492" onclick="AllCheckBoxClick(event);">&nbsp;
                                        </i>
                                        <span style="font-weight:normal;color:#666;">添加专题</span>
                                      </label>
                                    </div>
                                  </li>

                                  <li>
                                    <div class="cell">
                                      <label class="w120">
                                        <i class="checkbox-common left-10">
                                        <input type="checkbox" name="add_per" dir="sonson" id="493" value="493" onclick="AllCheckBoxClick(event);">&nbsp;
                                        </i>
                                        <span style="font-weight:normal;color:#666;">修改专题</span>
                                      </label>
                                    </div>
                                  </li>
                                                                  </ul>
                                                              <ul class="second">
                                  <li style="margin-right:10px;">
                                    <div class="cell">
                                      <label class="w120">
                                        <i class="checkbox-common">
                                        <input type="checkbox" name="add_per" dir="son" id="530" value="530" onclick="AllCheckBoxClick(event);">&nbsp;
                                        </i>
                                        <span style="font-weight:normal;color:#000;">站点帮助</span>
                                      </label>
                                    </div>
                                  </li>

                                  <li>
                                    <div class="cell">
                                      <label class="w120">
                                        <i class="checkbox-common left-10">
                                        <input type="checkbox" name="add_per" dir="sonson" id="442" value="442" onclick="AllCheckBoxClick(event);">&nbsp;
                                        </i>
                                        <span style="font-weight:normal;color:#666;">添加帮助类型</span>
                                      </label>
                                    </div>
                                  </li>

                                  <li>
                                    <div class="cell">
                                      <label class="w120">
                                        <i class="checkbox-common left-10">
                                        <input type="checkbox" name="add_per" dir="sonson" id="443" value="443" onclick="AllCheckBoxClick(event);">&nbsp;
                                        </i>
                                        <span style="font-weight:normal;color:#666;">修改帮助内容</span>
                                      </label>
                                    </div>
                                  </li>

                                  <li>
                                    <div class="cell">
                                      <label class="w120">
                                        <i class="checkbox-common left-10">
                                        <input type="checkbox" name="add_per" dir="sonson" id="444" value="444" onclick="AllCheckBoxClick(event);">&nbsp;
                                        </i>
                                        <span style="font-weight:normal;color:#666;">添加帮助内容</span>
                                      </label>
                                    </div>
                                  </li>

                                  <li>
                                    <div class="cell">
                                      <label class="w120">
                                        <i class="checkbox-common left-10">
                                        <input type="checkbox" name="add_per" dir="sonson" id="440" value="440" onclick="AllCheckBoxClick(event);">&nbsp;
                                        </i>
                                        <span style="font-weight:normal;color:#666;">帮助类型</span>
                                      </label>
                                    </div>
                                  </li>

                                  <li>
                                    <div class="cell">
                                      <label class="w120">
                                        <i class="checkbox-common left-10">
                                        <input type="checkbox" name="add_per" dir="sonson" id="441" value="441" onclick="AllCheckBoxClick(event);">&nbsp;
                                        </i>
                                        <span style="font-weight:normal;color:#666;">帮助内容</span>
                                      </label>
                                    </div>
                                  </li>
                                                                  </ul>
                                                              <ul class="second">
                                  <li style="margin-right:10px;">
                                    <div class="cell">
                                      <label class="w120">
                                        <i class="checkbox-common">
                                        <input type="checkbox" name="add_per" dir="son" id="430" value="430" onclick="AllCheckBoxClick(event);">&nbsp;
                                        </i>
                                        <span style="font-weight:normal;color:#000;">友情链接</span>
                                      </label>
                                    </div>
                                  </li>

                                  <li>
                                    <div class="cell">
                                      <label class="w120">
                                        <i class="checkbox-common left-10">
                                        <input type="checkbox" name="add_per" dir="sonson" id="436" value="436" onclick="AllCheckBoxClick(event);">&nbsp;
                                        </i>
                                        <span style="font-weight:normal;color:#666;">添加友情链接</span>
                                      </label>
                                    </div>
                                  </li>

                                  <li>
                                    <div class="cell">
                                      <label class="w120">
                                        <i class="checkbox-common left-10">
                                        <input type="checkbox" name="add_per" dir="sonson" id="437" value="437" onclick="AllCheckBoxClick(event);">&nbsp;
                                        </i>
                                        <span style="font-weight:normal;color:#666;">编辑友情链接</span>
                                      </label>
                                    </div>
                                  </li>
                                                                  </ul>
                                                            </td>
                            </tr>
                                                          <tr class="tr-Current">
                                <td>
                                  <div>
                                    <label>
                                      <i class="checkbox-common">
                                        <input type="checkbox" name="add_per" dir="parent" id="1008" value="1008" onclick="AllCheckBoxClick(event);">
                                      </i>
                                      &nbsp;分销
                                    </label>
                                  </div>
                                </td>
                              <td>
                                                              <ul class="second">
                                  <li style="margin-right:10px;">
                                    <div class="cell">
                                      <label class="w120">
                                        <i class="checkbox-common">
                                        <input type="checkbox" name="add_per" dir="son" id="1009" value="1009" onclick="AllCheckBoxClick(event);">&nbsp;
                                        </i>
                                        <span style="font-weight:normal;color:#000;">推广员管理</span>
                                      </label>
                                    </div>
                                  </li>

                                  <li>
                                    <div class="cell">
                                      <label class="w120">
                                        <i class="checkbox-common left-10">
                                        <input type="checkbox" name="add_per" dir="sonson" id="1010" value="1010" onclick="AllCheckBoxClick(event);">&nbsp;
                                        </i>
                                        <span style="font-weight:normal;color:#666;">修改推广员父级</span>
                                      </label>
                                    </div>
                                  </li>

                                  <li>
                                    <div class="cell">
                                      <label class="w120">
                                        <i class="checkbox-common left-10">
                                        <input type="checkbox" name="add_per" dir="sonson" id="1011" value="1011" onclick="AllCheckBoxClick(event);">&nbsp;
                                        </i>
                                        <span style="font-weight:normal;color:#666;">推广员</span>
                                      </label>
                                    </div>
                                  </li>

                                  <li>
                                    <div class="cell">
                                      <label class="w120">
                                        <i class="checkbox-common left-10">
                                        <input type="checkbox" name="add_per" dir="sonson" id="1012" value="1012" onclick="AllCheckBoxClick(event);">&nbsp;
                                        </i>
                                        <span style="font-weight:normal;color:#666;">待审核</span>
                                      </label>
                                    </div>
                                  </li>
                                                                  </ul>
                                                              <ul class="second">
                                  <li style="margin-right:10px;">
                                    <div class="cell">
                                      <label class="w120">
                                        <i class="checkbox-common">
                                        <input type="checkbox" name="add_per" dir="son" id="1013" value="1013" onclick="AllCheckBoxClick(event);">&nbsp;
                                        </i>
                                        <span style="font-weight:normal;color:#000;">商品分销</span>
                                      </label>
                                    </div>
                                  </li>

                                  <li>
                                    <div class="cell">
                                      <label class="w120">
                                        <i class="checkbox-common left-10">
                                        <input type="checkbox" name="add_per" dir="sonson" id="1014" value="1014" onclick="AllCheckBoxClick(event);">&nbsp;
                                        </i>
                                        <span style="font-weight:normal;color:#666;">商品分销修改</span>
                                      </label>
                                    </div>
                                  </li>
                                                                  </ul>
                                                              <ul class="second">
                                  <li style="margin-right:10px;">
                                    <div class="cell">
                                      <label class="w120">
                                        <i class="checkbox-common">
                                        <input type="checkbox" name="add_per" dir="son" id="1015" value="1015" onclick="AllCheckBoxClick(event);">&nbsp;
                                        </i>
                                        <span style="font-weight:normal;color:#000;">三级分销</span>
                                      </label>
                                    </div>
                                  </li>

                                  <li>
                                    <div class="cell">
                                      <label class="w120">
                                        <i class="checkbox-common left-10">
                                        <input type="checkbox" name="add_per" dir="sonson" id="1016" value="1016" onclick="AllCheckBoxClick(event);">&nbsp;
                                        </i>
                                        <span style="font-weight:normal;color:#666;">推广员等级修改</span>
                                      </label>
                                    </div>
                                  </li>

                                  <li>
                                    <div class="cell">
                                      <label class="w120">
                                        <i class="checkbox-common left-10">
                                        <input type="checkbox" name="add_per" dir="sonson" id="1017" value="1017" onclick="AllCheckBoxClick(event);">&nbsp;
                                        </i>
                                        <span style="font-weight:normal;color:#666;">基本设置</span>
                                      </label>
                                    </div>
                                  </li>

                                  <li>
                                    <div class="cell">
                                      <label class="w120">
                                        <i class="checkbox-common left-10">
                                        <input type="checkbox" name="add_per" dir="sonson" id="1018" value="1018" onclick="AllCheckBoxClick(event);">&nbsp;
                                        </i>
                                        <span style="font-weight:normal;color:#666;">推广员等级添加</span>
                                      </label>
                                    </div>
                                  </li>

                                  <li>
                                    <div class="cell">
                                      <label class="w120">
                                        <i class="checkbox-common left-10">
                                        <input type="checkbox" name="add_per" dir="sonson" id="1019" value="1019" onclick="AllCheckBoxClick(event);">&nbsp;
                                        </i>
                                        <span style="font-weight:normal;color:#666;">推广员等级</span>
                                      </label>
                                    </div>
                                  </li>
                              </ul>
                                <ul class="second">
                                  <li style="margin-right:10px;">
                                    <div class="cell">
                                      <label class="w120">
                                        <i class="checkbox-common">
                                        <input type="checkbox" name="add_per" dir="son" id="1020" value="1020" onclick="AllCheckBoxClick(event);">&nbsp;
                                        </i>
                                        <span style="font-weight:normal;color:#000;">区域代理</span>
                                      </label>
                                    </div>
                                  </li>

                                  <li>
                                    <div class="cell">
                                      <label class="w120">
                                        <i class="checkbox-common left-10">
                                        <input type="checkbox" name="add_per" dir="sonson" id="1036" value="1036" onclick="AllCheckBoxClick(event);">&nbsp;
                                        </i>
                                        <span style="font-weight:normal;color:#666;">人员管理</span>
                                      </label>
                                    </div>
                                  </li>

                                  <li>
                                    <div class="cell">
                                      <label class="w120">
                                        <i class="checkbox-common left-10">
                                        <input type="checkbox" name="add_per" dir="sonson" id="1021" value="1021" onclick="AllCheckBoxClick(event);">&nbsp;
                                        </i>
                                        <span style="font-weight:normal;color:#666;">区域代理配置</span>
                                      </label>
                                    </div>
                                  </li>

                                  <li>
                                    <div class="cell">
                                      <label class="w120">
                                        <i class="checkbox-common left-10">
                                        <input type="checkbox" name="add_per" dir="sonson" id="1022" value="1022" onclick="AllCheckBoxClick(event);">&nbsp;
                                        </i>
                                        <span style="font-weight:normal;color:#666;">用户管理</span>
                                      </label>
                                    </div>
                                  </li>
                                                                  </ul>
                                                              <ul class="second">
                                  <li style="margin-right:10px;">
                                    <div class="cell">
                                      <label class="w120">
                                        <i class="checkbox-common">
                                        <input type="checkbox" name="add_per" dir="son" id="1023" value="1023" onclick="AllCheckBoxClick(event);">&nbsp;
                                        </i>
                                        <span style="font-weight:normal;color:#000;">股东分红</span>
                                      </label>
                                    </div>
                                  </li>

                                  <li>
                                    <div class="cell">
                                      <label class="w120">
                                        <i class="checkbox-common left-10">
                                        <input type="checkbox" name="add_per" dir="sonson" id="1025" value="1025" onclick="AllCheckBoxClick(event);">&nbsp;
                                        </i>
                                        <span style="font-weight:normal;color:#666;">基本设置</span>
                                      </label>
                                    </div>
                                  </li>

                                  <li>
                                    <div class="cell">
                                      <label class="w120">
                                        <i class="checkbox-common left-10">
                                        <input type="checkbox" name="add_per" dir="sonson" id="1027" value="1027" onclick="AllCheckBoxClick(event);">&nbsp;
                                        </i>
                                        <span style="font-weight:normal;color:#666;">股东等级</span>
                                      </label>
                                    </div>
                                  </li>

                                  <li>
                                    <div class="cell">
                                      <label class="w120">
                                        <i class="checkbox-common left-10">
                                        <input type="checkbox" name="add_per" dir="sonson" id="1028" value="1028" onclick="AllCheckBoxClick(event);">&nbsp;
                                        </i>
                                        <span style="font-weight:normal;color:#666;">人员管理</span>
                                      </label>
                                    </div>
                                  </li>
                                </ul>
                                <ul class="second">
                                  <li style="margin-right:10px;">
                                    <div class="cell">
                                      <label class="w120">
                                        <i class="checkbox-common">
                                        <input type="checkbox" name="add_per" dir="son" id="1029" value="1029" onclick="AllCheckBoxClick(event);">&nbsp;
                                        </i>
                                        <span style="font-weight:normal;color:#000;">全球分红</span>
                                      </label>
                                    </div>
                                  </li>

                                  <li>
                                    <div class="cell">
                                      <label class="w120">
                                        <i class="checkbox-common left-10">
                                        <input type="checkbox" name="add_per" dir="sonson" id="1030" value="1030" onclick="AllCheckBoxClick(event);">&nbsp;
                                        </i>
                                        <span style="font-weight:normal;color:#666;">基本设置</span>
                                      </label>
                                    </div>
                                  </li>

                                  <li>
                                    <div class="cell">
                                      <label class="w120">
                                        <i class="checkbox-common left-10">
                                        <input type="checkbox" name="add_per" dir="sonson" id="1031" value="1031" onclick="AllCheckBoxClick(event);">&nbsp;
                                        </i>
                                        <span style="font-weight:normal;color:#666;">分红设置</span>
                                      </label>
                                    </div>
                                  </li>

                                  <li>
                                    <div class="cell">
                                      <label class="w120">
                                        <i class="checkbox-common left-10">
                                        <input type="checkbox" name="add_per" dir="sonson" id="1033" value="1033" onclick="AllCheckBoxClick(event);">&nbsp;
                                        </i>
                                        <span style="font-weight:normal;color:#666;">分红设置</span>
                                      </label>
                                    </div>
                                  </li>

                                  <li>
                                    <div class="cell">
                                      <label class="w120">
                                        <i class="checkbox-common left-10">
                                        <input type="checkbox" name="add_per" dir="sonson" id="1034" value="1034" onclick="AllCheckBoxClick(event);">&nbsp;
                                        </i>
                                        <span style="font-weight:normal;color:#666;">发放分红</span>
                                      </label>
                                    </div>
                                  </li>

                                  <li>
                                    <div class="cell">
                                      <label class="w120">
                                        <i class="checkbox-common left-10">
                                        <input type="checkbox" name="add_per" dir="sonson" id="1035" value="1035" onclick="AllCheckBoxClick(event);">&nbsp;
                                        </i>
                                        <span style="font-weight:normal;color:#666;">发放记录</span>
                                      </label>
                                    </div>
                                  </li>
                                  </ul>
                            </td>
                            </tr>
                              <tr class="tr-Current">
                                <td>
                                  <div>
                                    <label>
                                      <i class="checkbox-common">
                                        <input type="checkbox" name="add_per" dir="parent" id="218" value="218" onclick="AllCheckBoxClick(event);">
                                      </i>
                                      &nbsp;设置
                                    </label>
                                  </div>
                                </td>
                              <td>
                                                              <ul class="second">
                                  <li style="margin-right:10px;">
                                    <div class="cell">
                                      <label class="w120">
                                        <i class="checkbox-common">
                                        <input type="checkbox" name="add_per" dir="son" id="528" value="528" onclick="AllCheckBoxClick(event);">&nbsp;
                                        </i>
                                        <span style="font-weight:normal;color:#000;">基础设置</span>
                                      </label>
                                    </div>
                                  </li>

                                  <li>
                                    <div class="cell">
                                      <label class="w120">
                                        <i class="checkbox-common left-10">
                                        <input type="checkbox" name="add_per" dir="sonson" id="11059" value="11059" onclick="AllCheckBoxClick(event);">&nbsp;
                                        </i>
                                        <span style="font-weight:normal;color:#666;">商家服务</span>
                                      </label>
                                    </div>
                                  </li>

                                  <li>
                                    <div class="cell">
                                      <label class="w120">
                                        <i class="checkbox-common left-10">
                                        <input type="checkbox" name="add_per" dir="sonson" id="11074" value="11074" onclick="AllCheckBoxClick(event);">&nbsp;
                                        </i>
                                        <span style="font-weight:normal;color:#666;">通知记录</span>
                                      </label>
                                    </div>
                                  </li>

                                  <li>
                                    <div class="cell">
                                      <label class="w120">
                                        <i class="checkbox-common left-10">
                                        <input type="checkbox" name="add_per" dir="sonson" id="11051" value="11051" onclick="AllCheckBoxClick(event);">&nbsp;
                                        </i>
                                        <span style="font-weight:normal;color:#666;">运营</span>
                                      </label>
                                    </div>
                                  </li>

                                  <li>
                                    <div class="cell">
                                      <label class="w120">
                                        <i class="checkbox-common left-10">
                                        <input type="checkbox" name="add_per" dir="sonson" id="418" value="418" onclick="AllCheckBoxClick(event);">&nbsp;
                                        </i>
                                        <span style="font-weight:normal;color:#666;">网站设置</span>
                                      </label>
                                    </div>
                                  </li>

                                  <li>
                                    <div class="cell">
                                      <label class="w120">
                                        <i class="checkbox-common left-10">
                                        <input type="checkbox" name="add_per" dir="sonson" id="499" value="499" onclick="AllCheckBoxClick(event);">&nbsp;
                                        </i>
                                        <span style="font-weight:normal;color:#666;">seo设置</span>
                                      </label>
                                    </div>
                                  </li>

                                  <li>
                                    <div class="cell">
                                      <label class="w120">
                                        <i class="checkbox-common left-10">
                                        <input type="checkbox" name="add_per" dir="sonson" id="11017" value="11017" onclick="AllCheckBoxClick(event);">&nbsp;
                                        </i>
                                        <span style="font-weight:normal;color:#666;">版权</span>
                                      </label>
                                    </div>
                                  </li>

                                  <li>
                                    <div class="cell">
                                      <label class="w120">
                                        <i class="checkbox-common left-10">
                                        <input type="checkbox" name="add_per" dir="sonson" id="527" value="527" onclick="AllCheckBoxClick(event);">&nbsp;
                                        </i>
                                        <span style="font-weight:normal;color:#666;">注册与访问</span>
                                      </label>
                                    </div>
                                  </li>

                                  <li>
                                    <div class="cell">
                                      <label class="w120">
                                        <i class="checkbox-common left-10">
                                        <input type="checkbox" name="add_per" dir="sonson" id="11031" value="11031" onclick="AllCheckBoxClick(event);">&nbsp;
                                        </i>
                                        <span style="font-weight:normal;color:#666;">上传设置</span>
                                      </label>
                                    </div>
                                  </li>

                                  <li>
                                    <div class="cell">
                                      <label class="w120">
                                        <i class="checkbox-common left-10">
                                        <input type="checkbox" name="add_per" dir="sonson" id="11033" value="11033" onclick="AllCheckBoxClick(event);">&nbsp;
                                        </i>
                                        <span style="font-weight:normal;color:#666;">伪静态路由</span>
                                      </label>
                                    </div>
                                  </li>

                                  <li>
                                    <div class="cell">
                                      <label class="w120">
                                        <i class="checkbox-common left-10">
                                        <input type="checkbox" name="add_per" dir="sonson" id="456" value="456" onclick="AllCheckBoxClick(event);">&nbsp;
                                        </i>
                                        <span style="font-weight:normal;color:#666;">第三方登录</span>
                                      </label>
                                    </div>
                                  </li>

                                  <li>
                                    <div class="cell">
                                      <label class="w120">
                                        <i class="checkbox-common left-10">
                                        <input type="checkbox" name="add_per" dir="sonson" id="439" value="439" onclick="AllCheckBoxClick(event);">&nbsp;
                                        </i>
                                        <span style="font-weight:normal;color:#666;">通知系统</span>
                                      </label>
                                    </div>
                                  </li>

                                  <li>
                                    <div class="cell">
                                      <label class="w120">
                                        <i class="checkbox-common left-10">
                                        <input type="checkbox" name="add_per" dir="sonson" id="11019" value="11019" onclick="AllCheckBoxClick(event);">&nbsp;
                                        </i>
                                        <span style="font-weight:normal;color:#666;">客服</span>
                                      </label>
                                    </div>
                                  </li>
                                                                  </ul>
                                                              <ul class="second">
                                  <li style="margin-right:10px;">
                                    <div class="cell">
                                      <label class="w120">
                                        <i class="checkbox-common">
                                        <input type="checkbox" name="add_per" dir="son" id="11050" value="11050" onclick="AllCheckBoxClick(event);">&nbsp;
                                        </i>
                                        <span style="font-weight:normal;color:#000;">交易设置</span>
                                      </label>
                                    </div>
                                  </li>

                                  <li>
                                    <div class="cell">
                                      <label class="w120">
                                        <i class="checkbox-common left-10">
                                        <input type="checkbox" name="add_per" dir="sonson" id="494" value="494" onclick="AllCheckBoxClick(event);">&nbsp;
                                        </i>
                                        <span style="font-weight:normal;color:#666;">购物设置</span>
                                      </label>
                                    </div>
                                  </li>

                                  <li>
                                    <div class="cell">
                                      <label class="w120">
                                        <i class="checkbox-common left-10">
                                        <input type="checkbox" name="add_per" dir="sonson" id="221" value="221" onclick="AllCheckBoxClick(event);">&nbsp;
                                        </i>
                                        <span style="font-weight:normal;color:#666;">支付配置</span>
                                      </label>
                                    </div>
                                  </li>

                                  <li>
                                    <div class="cell">
                                      <label class="w120">
                                        <i class="checkbox-common left-10">
                                        <input type="checkbox" name="add_per" dir="sonson" id="11072" value="11072" onclick="AllCheckBoxClick(event);">&nbsp;
                                        </i>
                                        <span style="font-weight:normal;color:#666;">银联卡支付</span>
                                      </label>
                                    </div>
                                  </li>

                                  <li>
                                    <div class="cell">
                                      <label class="w120">
                                        <i class="checkbox-common left-10">
                                        <input type="checkbox" name="add_per" dir="sonson" id="503" value="503" onclick="AllCheckBoxClick(event);">&nbsp;
                                        </i>
                                        <span style="font-weight:normal;color:#666;">会员提现设置</span>
                                      </label>
                                    </div>
                                  </li>

                                  <li>
                                    <div class="cell">
                                      <label class="w120">
                                        <i class="checkbox-common left-10">
                                        <input type="checkbox" name="add_per" dir="sonson" id="11056" value="11056" onclick="AllCheckBoxClick(event);">&nbsp;
                                        </i>
                                        <span style="font-weight:normal;color:#666;">转账配置</span>
                                      </label>
                                    </div>
                                  </li>
                                                                  </ul>
                                                              <ul class="second">
                                  <li style="margin-right:10px;">
                                    <div class="cell">
                                      <label class="w120">
                                        <i class="checkbox-common">
                                        <input type="checkbox" name="add_per" dir="son" id="529" value="529" onclick="AllCheckBoxClick(event);">&nbsp;
                                        </i>
                                        <span style="font-weight:normal;color:#000;">配送管理</span>
                                      </label>
                                    </div>
                                  </li>

                                  <li>
                                    <div class="cell">
                                      <label class="w120">
                                        <i class="checkbox-common left-10">
                                        <input type="checkbox" name="add_per" dir="sonson" id="521" value="521" onclick="AllCheckBoxClick(event);">&nbsp;
                                        </i>
                                        <span style="font-weight:normal;color:#666;">添加自提点</span>
                                      </label>
                                    </div>
                                  </li>

                                  <li>
                                    <div class="cell">
                                      <label class="w120">
                                        <i class="checkbox-common left-10">
                                        <input type="checkbox" name="add_per" dir="sonson" id="522" value="522" onclick="AllCheckBoxClick(event);">&nbsp;
                                        </i>
                                        <span style="font-weight:normal;color:#666;">修改自提点</span>
                                      </label>
                                    </div>
                                  </li>

                                  <li>
                                    <div class="cell">
                                      <label class="w120">
                                        <i class="checkbox-common left-10">
                                        <input type="checkbox" name="add_per" dir="sonson" id="525" value="525" onclick="AllCheckBoxClick(event);">&nbsp;
                                        </i>
                                        <span style="font-weight:normal;color:#666;">运费模板列表</span>
                                      </label>
                                    </div>
                                  </li>

                                  <li>
                                    <div class="cell">
                                      <label class="w120">
                                        <i class="checkbox-common left-10">
                                        <input type="checkbox" name="add_per" dir="sonson" id="11075" value="11075" onclick="AllCheckBoxClick(event);">&nbsp;
                                        </i>
                                        <span style="font-weight:normal;color:#666;">配送费用</span>
                                      </label>
                                    </div>
                                  </li>

                                  <li>
                                    <div class="cell">
                                      <label class="w120">
                                        <i class="checkbox-common left-10">
                                        <input type="checkbox" name="add_per" dir="sonson" id="11076" value="11076" onclick="AllCheckBoxClick(event);">&nbsp;
                                        </i>
                                        <span style="font-weight:normal;color:#666;">配送人员</span>
                                      </label>
                                    </div>
                                  </li>

                                  <li>
                                    <div class="cell">
                                      <label class="w120">
                                        <i class="checkbox-common left-10">
                                        <input type="checkbox" name="add_per" dir="sonson" id="11077" value="11077" onclick="AllCheckBoxClick(event);">&nbsp;
                                        </i>
                                        <span style="font-weight:normal;color:#666;">配送地区</span>
                                      </label>
                                    </div>
                                  </li>

                                  <li>
                                    <div class="cell">
                                      <label class="w120">
                                        <i class="checkbox-common left-10">
                                        <input type="checkbox" name="add_per" dir="sonson" id="11087" value="11087" onclick="AllCheckBoxClick(event);">&nbsp;
                                        </i>
                                        <span style="font-weight:normal;color:#666;">门店管理</span>
                                      </label>
                                    </div>
                                  </li>

                                  <li>
                                    <div class="cell">
                                      <label class="w120">
                                        <i class="checkbox-common left-10">
                                        <input type="checkbox" name="add_per" dir="sonson" id="487" value="487" onclick="AllCheckBoxClick(event);">&nbsp;
                                        </i>
                                        <span style="font-weight:normal;color:#666;">模板编辑</span>
                                      </label>
                                    </div>
                                  </li>

                                  <li>
                                    <div class="cell">
                                      <label class="w120">
                                        <i class="checkbox-common left-10">
                                        <input type="checkbox" name="add_per" dir="sonson" id="191" value="191" onclick="AllCheckBoxClick(event);">&nbsp;
                                        </i>
                                        <span style="font-weight:normal;color:#666;">添加物流公司</span>
                                      </label>
                                    </div>
                                  </li>

                                  <li>
                                    <div class="cell">
                                      <label class="w120">
                                        <i class="checkbox-common left-10">
                                        <input type="checkbox" name="add_per" dir="sonson" id="472" value="472" onclick="AllCheckBoxClick(event);">&nbsp;
                                        </i>
                                        <span style="font-weight:normal;color:#666;">添加或修改</span>
                                      </label>
                                    </div>
                                  </li>

                                  <li>
                                    <div class="cell">
                                      <label class="w120">
                                        <i class="checkbox-common left-10">
                                        <input type="checkbox" name="add_per" dir="sonson" id="526" value="526" onclick="AllCheckBoxClick(event);">&nbsp;
                                        </i>
                                        <span style="font-weight:normal;color:#666;">编辑运费模板</span>
                                      </label>
                                    </div>
                                  </li>

                                  <li>
                                    <div class="cell">
                                      <label class="w120">
                                        <i class="checkbox-common left-10">
                                        <input type="checkbox" name="add_per" dir="sonson" id="192" value="192" onclick="AllCheckBoxClick(event);">&nbsp;
                                        </i>
                                        <span style="font-weight:normal;color:#666;">物流公司修改</span>
                                      </label>
                                    </div>
                                  </li>

                                  <li>
                                    <div class="cell">
                                      <label class="w120">
                                        <i class="checkbox-common left-10">
                                        <input type="checkbox" name="add_per" dir="sonson" id="11016" value="11016" onclick="AllCheckBoxClick(event);">&nbsp;
                                        </i>
                                        <span style="font-weight:normal;color:#666;">自提点运费</span>
                                      </label>
                                    </div>
                                  </li>

                                  <li>
                                    <div class="cell">
                                      <label class="w120">
                                        <i class="checkbox-common left-10">
                                        <input type="checkbox" name="add_per" dir="sonson" id="11080" value="11080" onclick="AllCheckBoxClick(event);">&nbsp;
                                        </i>
                                        <span style="font-weight:normal;color:#666;">本地配送地区管理</span>
                                      </label>
                                    </div>
                                  </li>

                                  <li>
                                    <div class="cell">
                                      <label class="w120">
                                        <i class="checkbox-common left-10">
                                        <input type="checkbox" name="add_per" dir="sonson" id="519" value="519" onclick="AllCheckBoxClick(event);">&nbsp;
                                        </i>
                                        <span style="font-weight:normal;color:#666;">货到付款地区管理</span>
                                      </label>
                                    </div>
                                  </li>

                                  <li>
                                    <div class="cell">
                                      <label class="w120">
                                        <i class="checkbox-common left-10">
                                        <input type="checkbox" name="add_per" dir="sonson" id="486" value="486" onclick="AllCheckBoxClick(event);">&nbsp;
                                        </i>
                                        <span style="font-weight:normal;color:#666;">地区管理</span>
                                      </label>
                                    </div>
                                  </li>

                                  <li>
                                    <div class="cell">
                                      <label class="w120">
                                        <i class="checkbox-common left-10">
                                        <input type="checkbox" name="add_per" dir="sonson" id="189" value="189" onclick="AllCheckBoxClick(event);">&nbsp;
                                        </i>
                                        <span style="font-weight:normal;color:#666;">物流公司</span>
                                      </label>
                                    </div>
                                  </li>

                                  <li>
                                    <div class="cell">
                                      <label class="w120">
                                        <i class="checkbox-common left-10">
                                        <input type="checkbox" name="add_per" dir="sonson" id="471" value="471" onclick="AllCheckBoxClick(event);">&nbsp;
                                        </i>
                                        <span style="font-weight:normal;color:#666;">商家地址</span>
                                      </label>
                                    </div>
                                  </li>

                                  <li>
                                    <div class="cell">
                                      <label class="w120">
                                        <i class="checkbox-common left-10">
                                        <input type="checkbox" name="add_per" dir="sonson" id="520" value="520" onclick="AllCheckBoxClick(event);">&nbsp;
                                        </i>
                                        <span style="font-weight:normal;color:#666;">自提点管理</span>
                                      </label>
                                    </div>
                                  </li>

                                  <li>
                                    <div class="cell">
                                      <label class="w120">
                                        <i class="checkbox-common left-10">
                                        <input type="checkbox" name="add_per" dir="sonson" id="523" value="523" onclick="AllCheckBoxClick(event);">&nbsp;
                                        </i>
                                        <span style="font-weight:normal;color:#666;">物流跟踪设置</span>
                                      </label>
                                    </div>
                                  </li>
                                                                  </ul>
                                                              <ul class="second">
                                  <li style="margin-right:10px;">
                                    <div class="cell">
                                      <label class="w120">
                                        <i class="checkbox-common">
                                        <input type="checkbox" name="add_per" dir="son" id="11026" value="11026" onclick="AllCheckBoxClick(event);">&nbsp;
                                        </i>
                                        <span style="font-weight:normal;color:#000;">数据库管理</span>
                                      </label>
                                    </div>
                                  </li>

                                  <li>
                                    <div class="cell">
                                      <label class="w120">
                                        <i class="checkbox-common left-10">
                                        <input type="checkbox" name="add_per" dir="sonson" id="11027" value="11027" onclick="AllCheckBoxClick(event);">&nbsp;
                                        </i>
                                        <span style="font-weight:normal;color:#666;">数据库恢复</span>
                                      </label>
                                    </div>
                                  </li>

                                  <li>
                                    <div class="cell">
                                      <label class="w120">
                                        <i class="checkbox-common left-10">
                                        <input type="checkbox" name="add_per" dir="sonson" id="11028" value="11028" onclick="AllCheckBoxClick(event);">&nbsp;
                                        </i>
                                        <span style="font-weight:normal;color:#666;">SQL执行与导入</span>
                                      </label>
                                    </div>
                                  </li>
                                                                  </ul>
                                                              <ul class="second">
                                  <li style="margin-right:10px;">
                                    <div class="cell">
                                      <label class="w120">
                                        <i class="checkbox-common">
                                        <input type="checkbox" name="add_per" dir="son" id="126" value="126" onclick="AllCheckBoxClick(event);">&nbsp;
                                        </i>
                                        <span style="font-weight:normal;color:#000;">管理员列表</span>
                                      </label>
                                    </div>
                                  </li>

                                  <li>
                                    <div class="cell">
                                      <label class="w120">
                                        <i class="checkbox-common left-10">
                                        <input type="checkbox" name="add_per" dir="sonson" id="127" value="127" onclick="AllCheckBoxClick(event);">&nbsp;
                                        </i>
                                        <span style="font-weight:normal;color:#666;">用户列表</span>
                                      </label>
                                    </div>
                                  </li>

                                  <li>
                                    <div class="cell">
                                      <label class="w120">
                                        <i class="checkbox-common left-10">
                                        <input type="checkbox" name="add_per" dir="sonson" id="128" value="128" onclick="AllCheckBoxClick(event);">&nbsp;
                                        </i>
                                        <span style="font-weight:normal;color:#666;">权限组</span>
                                      </label>
                                    </div>
                                  </li>

                                  <li>
                                    <div class="cell">
                                      <label class="w120">
                                        <i class="checkbox-common left-10">
                                        <input type="checkbox" name="add_per" dir="sonson" id="11078" value="11078" onclick="AllCheckBoxClick(event);">&nbsp;
                                        </i>
                                        <span style="font-weight:normal;color:#666;">操作日志</span>
                                      </label>
                                    </div>
                                  </li>

                                  <li>
                                    <div class="cell">
                                      <label class="w120">
                                        <i class="checkbox-common left-10">
                                        <input type="checkbox" name="add_per" dir="sonson" id="11055" value="11055" onclick="AllCheckBoxClick(event);">&nbsp;
                                        </i>
                                        <span style="font-weight:normal;color:#666;">用户操作日志</span>
                                      </label>
                                    </div>
                                  </li>
                                                                  </ul>
                                                              <ul class="second">
                                  <li style="margin-right:10px;">
                                    <div class="cell">
                                      <label class="w120">
                                        <i class="checkbox-common">
                                        <input type="checkbox" name="add_per" dir="son" id="11094" value="11094" onclick="AllCheckBoxClick(event);">&nbsp;
                                        </i>
                                        <span style="font-weight:normal;color:#000;">核销设置</span>
                                      </label>
                                    </div>
                                  </li>

                                  <li>
                                    <div class="cell">
                                      <label class="w120">
                                        <i class="checkbox-common left-10">
                                        <input type="checkbox" name="add_per" dir="sonson" id="11095" value="11095" onclick="AllCheckBoxClick(event);">&nbsp;
                                        </i>
                                        <span style="font-weight:normal;color:#666;">核销人员</span>
                                      </label>
                                    </div>
                                  </li>

                                  <li>
                                    <div class="cell">
                                      <label class="w120">
                                        <i class="checkbox-common left-10">
                                        <input type="checkbox" name="add_per" dir="sonson" id="11096" value="11096" onclick="AllCheckBoxClick(event);">&nbsp;
                                        </i>
                                        <span style="font-weight:normal;color:#666;">核销记录</span>
                                      </label>
                                    </div>
                                  </li>
                                                                  </ul>
                                                            </td>
                            </tr>
                            <tr class="tr-Current">
                                <td>
                                  <div>
                                    <label>
                                      <i class="checkbox-common">
                                        <input type="checkbox" name="add_per" dir="parent" id="120" value="120" onclick="AllCheckBoxClick(event);">
                                      </i>
                                      &nbsp;系统
                                    </label>
                                  </div>
                                </td>
                              <td>
                            <ul class="second">
                              <li style="margin-right:10px;">
                                <div class="cell">
                                  <label class="w120">
                                    <i class="checkbox-common">
                                    <input type="checkbox" name="add_per" dir="son" id="524" value="524" onclick="AllCheckBoxClick(event);">&nbsp;
                                    </i>
                                    <span style="font-weight:normal;color:#000;">在线更新</span>
                                  </label>
                                </div>
                              </li>

                                  <li>
                                    <div class="cell">
                                      <label class="w120">
                                        <i class="checkbox-common left-10">
                                        <input type="checkbox" name="add_per" dir="sonson" id="11032" value="11032" onclick="AllCheckBoxClick(event);">&nbsp;
                                        </i>
                                        <span style="font-weight:normal;color:#666;">系统更新</span>
                                      </label>
                                    </div>
                                  </li>
                                </ul>
                                  <ul class="second">
                                  <li style="margin-right:10px;">
                                    <div class="cell">
                                      <label class="w120">
                                        <i class="checkbox-common">
                                        <input type="checkbox" name="add_per" dir="son" id="10010" value="10010" onclick="AllCheckBoxClick(event);">&nbsp;
                                        </i>
                                        <span style="font-weight:normal;color:#000;">授权信息</span>
                                      </label>
                                    </div>
                                  </li>
                                                                  </ul>
                                                              <ul class="second">
                                  <li style="margin-right:10px;">
                                    <div class="cell">
                                      <label class="w120">
                                        <i class="checkbox-common">
                                        <input type="checkbox" name="add_per" dir="son" id="11009" value="11009" onclick="AllCheckBoxClick(event);">&nbsp;
                                        </i>
                                        <span style="font-weight:normal;color:#000;">插件管理</span>
                                      </label>
                                    </div>
                                  </li>
                                                                  </ul>
                                                              <ul class="second">
                                  <li style="margin-right:10px;">
                                    <div class="cell">
                                      <label class="w120">
                                        <i class="checkbox-common">
                                        <input type="checkbox" name="add_per" dir="son" id="11010" value="11010" onclick="AllCheckBoxClick(event);">&nbsp;
                                        </i>
                                        <span style="font-weight:normal;color:#000;">钩子管理</span>
                                      </label>
                                    </div>
                                  </li>

                                  <li>
                                    <div class="cell">
                                      <label class="w120">
                                        <i class="checkbox-common left-10">
                                        <input type="checkbox" name="add_per" dir="sonson" id="11012" value="11012" onclick="AllCheckBoxClick(event);">&nbsp;
                                        </i>
                                        <span style="font-weight:normal;color:#666;">添加钩子</span>
                                      </label>
                                    </div>
                                  </li>

                                  <li>
                                    <div class="cell">
                                      <label class="w120">
                                        <i class="checkbox-common left-10">
                                        <input type="checkbox" name="add_per" dir="sonson" id="11013" value="11013" onclick="AllCheckBoxClick(event);">&nbsp;
                                        </i>
                                        <span style="font-weight:normal;color:#666;">修改钩子</span>
                                      </label>
                                    </div>
                                  </li>
                                                                  </ul>
                                                            </td>
                            </tr>
                                                        </tbody>
                          </table>
                        </div>
                      </div>
                    </div>
                  </li>
                </ul>
              </div>
              <div class="float-l">
                <span class="prompt"></span>
              </div>
            </li>
          </ul>
        </div>
      </div>
      <button class="submit01-alert" style="display: none" id="addSubmit" type="submit">保存</button>
    </div>
  </div>
      </div>
      <div class="modal-footer">
        <button type="button" class="btn-common btn-big" onclick="btn()">保存</button>
        <button type="button" class="btn-common-cancle btn-big" data-dismiss="modal" onclick="roleClose()">关闭</button>
      </div>
    </div>
  </div>
  </div>

  -->

  <!-- 修改权限 -->
  <!--
  <div class="modal fade hide" id="update_user" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true" style="width: 850px;">
  <div class="modal-dialog">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
        <h3 class="modal-title" id="myModalLabel">用户组设置</h3>
      </div>
      <div class="modal-body">
        <div class="content scroll">
    <div>
      <div class="mod-form ">
        <div class="con style0alert b10">
          <ul class="list-ul">
            <li class="list-li">
              <span class="star">*</span>用户组名称
              <input type="text" name="EditRoleName" id="EditRoleName" class="input-common">
              <span class="prompt"></span></li>
            <li class="list-li">
              <div class="float-l w100">
                <span class="star">*</span>权限
              </div>
              <div class="overflow">
                <ul id="EditAllMenuConetnt">
                  <li id="EditcontentPaltForm">
                    <i class="checkbox-common">
                    <input id="Edit01" name="import" dir="top" type="checkbox" style="margin: -1px 0 0;" onclick="EditAllCheckBoxClick(event);">
                    </i>
                    <span for="Edit01"> 平台</span>
                    <div class="mod-table l30">
                      <div class="mod-table-main" style="padding-left: 9px;">
                        <div class="con style0line">
                          <table class="table table-hover">
                            <colgroup>
                              <col style="width: 10%;">
                              <col style="width: 90%;">
                            </colgroup>
                            <tbody id="EditplatFormContent">
                                                            <tr class="tr-Current">
                                <td>
                                  <div>
                                    <label>
                                      <i class="checkbox-common">
                                      <input type="checkbox" name="permiss" dir="parent" id="149" value="149" onclick="AllCheckBoxClick(event);"></i>&nbsp;商品
                                    </label>
                                  </div>
                                </td>
                                <td>
                                                                  <ul class="second">
                                    <li style="margin-right:10px;">
                                      <div class="cell">
                                        <label class="w120">
                                          <i class="checkbox-common">
                                          <input type="checkbox" name="permiss" dir="son" id="151" value="151" onclick="AllCheckBoxClick(event);">&nbsp;
                                          </i>
                                          <span style="font-weight:normal;color:#000;">商品发布</span>
                                        </label>
                                      </div>
                                    </li>
                                                                      </ul>
                                                                  <ul class="second">
                                    <li style="margin-right:10px;">
                                      <div class="cell">
                                        <label class="w120">
                                          <i class="checkbox-common">
                                          <input type="checkbox" name="permiss" dir="son" id="419" value="419" onclick="AllCheckBoxClick(event);">&nbsp;
                                          </i>
                                          <span style="font-weight:normal;color:#000;">商品分类</span>
                                        </label>
                                      </div>
                                    </li>

                                    <li>
                                      <div class="cell">
                                        <label class="w120">
                                          <i class="checkbox-common left-10">
                                          <input type="checkbox" name="permiss" dir="sonson" id="421" value="421" onclick="AllCheckBoxClick(event);">&nbsp;
                                          </i>
                                          <span style="font-weight:normal;color:#666;">修改商品分类</span>
                                        </label>
                                      </div>
                                    </li>

                                    <li>
                                      <div class="cell">
                                        <label class="w120">
                                          <i class="checkbox-common left-10">
                                          <input type="checkbox" name="permiss" dir="sonson" id="420" value="420" onclick="AllCheckBoxClick(event);">&nbsp;
                                          </i>
                                          <span style="font-weight:normal;color:#666;">添加商品分类</span>
                                        </label>
                                      </div>
                                    </li>

                                    <li>
                                      <div class="cell">
                                        <label class="w120">
                                          <i class="checkbox-common left-10">
                                          <input type="checkbox" name="permiss" dir="sonson" id="422" value="422" onclick="AllCheckBoxClick(event);">&nbsp;
                                          </i>
                                          <span style="font-weight:normal;color:#666;">删除商品分类</span>
                                        </label>
                                      </div>
                                    </li>
                                                                      </ul>
                                                                  <ul class="second">
                                    <li style="margin-right:10px;">
                                      <div class="cell">
                                        <label class="w120">
                                          <i class="checkbox-common">
                                          <input type="checkbox" name="permiss" dir="son" id="423" value="423" onclick="AllCheckBoxClick(event);">&nbsp;
                                          </i>
                                          <span style="font-weight:normal;color:#000;">商品品牌</span>
                                        </label>
                                      </div>
                                    </li>

                                    <li>
                                      <div class="cell">
                                        <label class="w120">
                                          <i class="checkbox-common left-10">
                                          <input type="checkbox" name="permiss" dir="sonson" id="424" value="424" onclick="AllCheckBoxClick(event);">&nbsp;
                                          </i>
                                          <span style="font-weight:normal;color:#666;">添加商品品牌</span>
                                        </label>
                                      </div>
                                    </li>

                                    <li>
                                      <div class="cell">
                                        <label class="w120">
                                          <i class="checkbox-common left-10">
                                          <input type="checkbox" name="permiss" dir="sonson" id="425" value="425" onclick="AllCheckBoxClick(event);">&nbsp;
                                          </i>
                                          <span style="font-weight:normal;color:#666;">修改商品品牌</span>
                                        </label>
                                      </div>
                                    </li>
                                                                      </ul>
                                                                  <ul class="second">
                                    <li style="margin-right:10px;">
                                      <div class="cell">
                                        <label class="w120">
                                          <i class="checkbox-common">
                                          <input type="checkbox" name="permiss" dir="son" id="171" value="171" onclick="AllCheckBoxClick(event);">&nbsp;
                                          </i>
                                          <span style="font-weight:normal;color:#000;">商品标签</span>
                                        </label>
                                      </div>
                                    </li>

                                    <li>
                                      <div class="cell">
                                        <label class="w120">
                                          <i class="checkbox-common left-10">
                                          <input type="checkbox" name="permiss" dir="sonson" id="210" value="210" onclick="AllCheckBoxClick(event);">&nbsp;
                                          </i>
                                          <span style="font-weight:normal;color:#666;">修改商品标签</span>
                                        </label>
                                      </div>
                                    </li>

                                    <li>
                                      <div class="cell">
                                        <label class="w120">
                                          <i class="checkbox-common left-10">
                                          <input type="checkbox" name="permiss" dir="sonson" id="172" value="172" onclick="AllCheckBoxClick(event);">&nbsp;
                                          </i>
                                          <span style="font-weight:normal;color:#666;">添加商品标签</span>
                                        </label>
                                      </div>
                                    </li>
                                                                      </ul>
                                                                  <ul class="second">
                                    <li style="margin-right:10px;">
                                      <div class="cell">
                                        <label class="w120">
                                          <i class="checkbox-common">
                                          <input type="checkbox" name="permiss" dir="son" id="479" value="479" onclick="AllCheckBoxClick(event);">&nbsp;
                                          </i>
                                          <span style="font-weight:normal;color:#000;">商品规格</span>
                                        </label>
                                      </div>
                                    </li>

                                    <li>
                                      <div class="cell">
                                        <label class="w120">
                                          <i class="checkbox-common left-10">
                                          <input type="checkbox" name="permiss" dir="sonson" id="481" value="481" onclick="AllCheckBoxClick(event);">&nbsp;
                                          </i>
                                          <span style="font-weight:normal;color:#666;">修改商品规格</span>
                                        </label>
                                      </div>
                                    </li>

                                    <li>
                                      <div class="cell">
                                        <label class="w120">
                                          <i class="checkbox-common left-10">
                                          <input type="checkbox" name="permiss" dir="sonson" id="480" value="480" onclick="AllCheckBoxClick(event);">&nbsp;
                                          </i>
                                          <span style="font-weight:normal;color:#666;">添加商品规格</span>
                                        </label>
                                      </div>
                                    </li>
                                                                      </ul>
                                                                  <ul class="second">
                                    <li style="margin-right:10px;">
                                      <div class="cell">
                                        <label class="w120">
                                          <i class="checkbox-common">
                                          <input type="checkbox" name="permiss" dir="son" id="10001" value="10001" onclick="AllCheckBoxClick(event);">&nbsp;
                                          </i>
                                          <span style="font-weight:normal;color:#000;">供货商</span>
                                        </label>
                                      </div>
                                    </li>

                                    <li>
                                      <div class="cell">
                                        <label class="w120">
                                          <i class="checkbox-common left-10">
                                          <input type="checkbox" name="permiss" dir="sonson" id="10002" value="10002" onclick="AllCheckBoxClick(event);">&nbsp;
                                          </i>
                                          <span style="font-weight:normal;color:#666;">添加供货商</span>
                                        </label>
                                      </div>
                                    </li>

                                    <li>
                                      <div class="cell">
                                        <label class="w120">
                                          <i class="checkbox-common left-10">
                                          <input type="checkbox" name="permiss" dir="sonson" id="10003" value="10003" onclick="AllCheckBoxClick(event);">&nbsp;
                                          </i>
                                          <span style="font-weight:normal;color:#666;">修改供货商</span>
                                        </label>
                                      </div>
                                    </li>
                                                                      </ul>
                                                                  <ul class="second">
                                    <li style="margin-right:10px;">
                                      <div class="cell">
                                        <label class="w120">
                                          <i class="checkbox-common">
                                          <input type="checkbox" name="permiss" dir="son" id="482" value="482" onclick="AllCheckBoxClick(event);">&nbsp;
                                          </i>
                                          <span style="font-weight:normal;color:#000;">商品类型</span>
                                        </label>
                                      </div>
                                    </li>

                                    <li>
                                      <div class="cell">
                                        <label class="w120">
                                          <i class="checkbox-common left-10">
                                          <input type="checkbox" name="permiss" dir="sonson" id="484" value="484" onclick="AllCheckBoxClick(event);">&nbsp;
                                          </i>
                                          <span style="font-weight:normal;color:#666;">添加商品类型</span>
                                        </label>
                                      </div>
                                    </li>

                                    <li>
                                      <div class="cell">
                                        <label class="w120">
                                          <i class="checkbox-common left-10">
                                          <input type="checkbox" name="permiss" dir="sonson" id="485" value="485" onclick="AllCheckBoxClick(event);">&nbsp;
                                          </i>
                                          <span style="font-weight:normal;color:#666;">修改商品类型</span>
                                        </label>
                                      </div>
                                    </li>
                                                                      </ul>
                                                                  <ul class="second">
                                    <li style="margin-right:10px;">
                                      <div class="cell">
                                        <label class="w120">
                                          <i class="checkbox-common">
                                          <input type="checkbox" name="permiss" dir="son" id="334" value="334" onclick="AllCheckBoxClick(event);">&nbsp;
                                          </i>
                                          <span style="font-weight:normal;color:#000;">咨询管理</span>
                                        </label>
                                      </div>
                                    </li>
                                                                      </ul>
                                                                  <ul class="second">
                                    <li style="margin-right:10px;">
                                      <div class="cell">
                                        <label class="w120">
                                          <i class="checkbox-common">
                                          <input type="checkbox" name="permiss" dir="son" id="478" value="478" onclick="AllCheckBoxClick(event);">&nbsp;
                                          </i>
                                          <span style="font-weight:normal;color:#000;">商品评价</span>
                                        </label>
                                      </div>
                                    </li>
                                                                      </ul>
                                                                  <ul class="second">
                                    <li style="margin-right:10px;">
                                      <div class="cell">
                                        <label class="w120">
                                          <i class="checkbox-common">
                                          <input type="checkbox" name="permiss" dir="son" id="139" value="139" onclick="AllCheckBoxClick(event);">&nbsp;
                                          </i>
                                          <span style="font-weight:normal;color:#000;">相册管理</span>
                                        </label>
                                      </div>
                                    </li>

                                    <li>
                                      <div class="cell">
                                        <label class="w120">
                                          <i class="checkbox-common left-10">
                                          <input type="checkbox" name="permiss" dir="sonson" id="169" value="169" onclick="AllCheckBoxClick(event);">&nbsp;
                                          </i>
                                          <span style="font-weight:normal;color:#666;">图片管理</span>
                                        </label>
                                      </div>
                                    </li>
                                                                      </ul>
                                                                </td>
                              </tr>
                                                            <tr class="tr-Current">
                                <td>
                                  <div>
                                    <label>
                                      <i class="checkbox-common">
                                      <input type="checkbox" name="permiss" dir="parent" id="184" value="184" onclick="AllCheckBoxClick(event);"></i>&nbsp;订单
                                    </label>
                                  </div>
                                </td>
                                <td>
                                                                  <ul class="second">
                                    <li style="margin-right:10px;">
                                      <div class="cell">
                                        <label class="w120">
                                          <i class="checkbox-common">
                                          <input type="checkbox" name="permiss" dir="son" id="185" value="185" onclick="AllCheckBoxClick(event);">&nbsp;
                                          </i>
                                          <span style="font-weight:normal;color:#000;">订单列表</span>
                                        </label>
                                      </div>
                                    </li>

                                    <li>
                                      <div class="cell">
                                        <label class="w120">
                                          <i class="checkbox-common left-10">
                                          <input type="checkbox" name="permiss" dir="sonson" id="190" value="190" onclick="AllCheckBoxClick(event);">&nbsp;
                                          </i>
                                          <span style="font-weight:normal;color:#666;">订单详情</span>
                                        </label>
                                      </div>
                                    </li>

                                    <li>
                                      <div class="cell">
                                        <label class="w120">
                                          <i class="checkbox-common left-10">
                                          <input type="checkbox" name="permiss" dir="sonson" id="194" value="194" onclick="AllCheckBoxClick(event);">&nbsp;
                                          </i>
                                          <span style="font-weight:normal;color:#666;">退款详情</span>
                                        </label>
                                      </div>
                                    </li>
                                                                      </ul>
                                                                  <ul class="second">
                                    <li style="margin-right:10px;">
                                      <div class="cell">
                                        <label class="w120">
                                          <i class="checkbox-common">
                                          <input type="checkbox" name="permiss" dir="son" id="11039" value="11039" onclick="AllCheckBoxClick(event);">&nbsp;
                                          </i>
                                          <span style="font-weight:normal;color:#000;">虚拟订单</span>
                                        </label>
                                      </div>
                                    </li>

                                    <li>
                                      <div class="cell">
                                        <label class="w120">
                                          <i class="checkbox-common left-10">
                                          <input type="checkbox" name="permiss" dir="sonson" id="11040" value="11040" onclick="AllCheckBoxClick(event);">&nbsp;
                                          </i>
                                          <span style="font-weight:normal;color:#666;">虚拟订单详情</span>
                                        </label>
                                      </div>
                                    </li>
                                                                      </ul>
                                                                  <ul class="second">
                                    <li style="margin-right:10px;">
                                      <div class="cell">
                                        <label class="w120">
                                          <i class="checkbox-common">
                                          <input type="checkbox" name="permiss" dir="son" id="11045" value="11045" onclick="AllCheckBoxClick(event);">&nbsp;
                                          </i>
                                          <span style="font-weight:normal;color:#000;">拼团订单</span>
                                        </label>
                                      </div>
                                    </li>

                                    <li>
                                      <div class="cell">
                                        <label class="w120">
                                          <i class="checkbox-common left-10">
                                          <input type="checkbox" name="permiss" dir="sonson" id="11046" value="11046" onclick="AllCheckBoxClick(event);">&nbsp;
                                          </i>
                                          <span style="font-weight:normal;color:#666;">拼团订单详情</span>
                                        </label>
                                      </div>
                                    </li>
                                                                      </ul>
                                                                  <ul class="second">
                                    <li style="margin-right:10px;">
                                      <div class="cell">
                                        <label class="w120">
                                          <i class="checkbox-common">
                                          <input type="checkbox" name="permiss" dir="son" id="11089" value="11089" onclick="AllCheckBoxClick(event);">&nbsp;
                                          </i>
                                          <span style="font-weight:normal;color:#000;">预售订单</span>
                                        </label>
                                      </div>
                                    </li>

                                    <li>
                                      <div class="cell">
                                        <label class="w120">
                                          <i class="checkbox-common left-10">
                                          <input type="checkbox" name="permiss" dir="sonson" id="11093" value="11093" onclick="AllCheckBoxClick(event);">&nbsp;
                                          </i>
                                          <span style="font-weight:normal;color:#666;">订单详情</span>
                                        </label>
                                      </div>
                                    </li>
                                                                      </ul>
                                                                  <ul class="second">
                                    <li style="margin-right:10px;">
                                      <div class="cell">
                                        <label class="w120">
                                          <i class="checkbox-common">
                                          <input type="checkbox" name="permiss" dir="son" id="11102" value="11102" onclick="AllCheckBoxClick(event);">&nbsp;
                                          </i>
                                          <span style="font-weight:normal;color:#000;">砍价订单</span>
                                        </label>
                                      </div>
                                    </li>

                                    <li>
                                      <div class="cell">
                                        <label class="w120">
                                          <i class="checkbox-common left-10">
                                          <input type="checkbox" name="permiss" dir="sonson" id="11103" value="11103" onclick="AllCheckBoxClick(event);">&nbsp;
                                          </i>
                                          <span style="font-weight:normal;color:#666;">订单详情</span>
                                        </label>
                                      </div>
                                    </li>
                                                                      </ul>
                                                                  <ul class="second">
                                    <li style="margin-right:10px;">
                                      <div class="cell">
                                        <label class="w120">
                                          <i class="checkbox-common">
                                          <input type="checkbox" name="permiss" dir="son" id="11079" value="11079" onclick="AllCheckBoxClick(event);">&nbsp;
                                          </i>
                                          <span style="font-weight:normal;color:#000;">发票管理</span>
                                        </label>
                                      </div>
                                    </li>
                                                                      </ul>
                                                                  <ul class="second">
                                    <li style="margin-right:10px;">
                                      <div class="cell">
                                        <label class="w120">
                                          <i class="checkbox-common">
                                          <input type="checkbox" name="permiss" dir="son" id="11085" value="11085" onclick="AllCheckBoxClick(event);">&nbsp;
                                          </i>
                                          <span style="font-weight:normal;color:#000;">售后服务</span>
                                        </label>
                                      </div>
                                    </li>

                                    <li>
                                      <div class="cell">
                                        <label class="w120">
                                          <i class="checkbox-common left-10">
                                          <input type="checkbox" name="permiss" dir="sonson" id="11086" value="11086" onclick="AllCheckBoxClick(event);">&nbsp;
                                          </i>
                                          <span style="font-weight:normal;color:#666;">售后详情</span>
                                        </label>
                                      </div>
                                    </li>
                                                                      </ul>
                                                                </td>
                              </tr>
                                                            <tr class="tr-Current">
                                <td>
                                  <div>
                                    <label>
                                      <i class="checkbox-common">
                                      <input type="checkbox" name="permiss" dir="parent" id="179" value="179" onclick="AllCheckBoxClick(event);"></i>&nbsp;营销
                                    </label>
                                  </div>
                                </td>
                                <td>
                                                                  <ul class="second">
                                    <li style="margin-right:10px;">
                                      <div class="cell">
                                        <label class="w120">
                                          <i class="checkbox-common">
                                          <input type="checkbox" name="permiss" dir="son" id="180" value="180" onclick="AllCheckBoxClick(event);">&nbsp;
                                          </i>
                                          <span style="font-weight:normal;color:#000;">优惠券</span>
                                        </label>
                                      </div>
                                    </li>

                                    <li>
                                      <div class="cell">
                                        <label class="w120">
                                          <i class="checkbox-common left-10">
                                          <input type="checkbox" name="permiss" dir="sonson" id="11088" value="11088" onclick="AllCheckBoxClick(event);">&nbsp;
                                          </i>
                                          <span style="font-weight:normal;color:#666;">优惠券发放记录</span>
                                        </label>
                                      </div>
                                    </li>

                                    <li>
                                      <div class="cell">
                                        <label class="w120">
                                          <i class="checkbox-common left-10">
                                          <input type="checkbox" name="permiss" dir="sonson" id="186" value="186" onclick="AllCheckBoxClick(event);">&nbsp;
                                          </i>
                                          <span style="font-weight:normal;color:#666;">添加优惠券</span>
                                        </label>
                                      </div>
                                    </li>

                                    <li>
                                      <div class="cell">
                                        <label class="w120">
                                          <i class="checkbox-common left-10">
                                          <input type="checkbox" name="permiss" dir="sonson" id="187" value="187" onclick="AllCheckBoxClick(event);">&nbsp;
                                          </i>
                                          <span style="font-weight:normal;color:#666;">修改优惠券</span>
                                        </label>
                                      </div>
                                    </li>
                                                                      </ul>
                                                                  <ul class="second">
                                    <li style="margin-right:10px;">
                                      <div class="cell">
                                        <label class="w120">
                                          <i class="checkbox-common">
                                          <input type="checkbox" name="permiss" dir="son" id="446" value="446" onclick="AllCheckBoxClick(event);">&nbsp;
                                          </i>
                                          <span style="font-weight:normal;color:#000;">积分管理</span>
                                        </label>
                                      </div>
                                    </li>
                                                                      </ul>
                                                                  <ul class="second">
                                    <li style="margin-right:10px;">
                                      <div class="cell">
                                        <label class="w120">
                                          <i class="checkbox-common">
                                          <input type="checkbox" name="permiss" dir="son" id="195" value="195" onclick="AllCheckBoxClick(event);">&nbsp;
                                          </i>
                                          <span style="font-weight:normal;color:#000;">赠品</span>
                                        </label>
                                      </div>
                                    </li>

                                    <li>
                                      <div class="cell">
                                        <label class="w120">
                                          <i class="checkbox-common left-10">
                                          <input type="checkbox" name="permiss" dir="sonson" id="11060" value="11060" onclick="AllCheckBoxClick(event);">&nbsp;
                                          </i>
                                          <span style="font-weight:normal;color:#666;">赠品发放记录</span>
                                        </label>
                                      </div>
                                    </li>

                                    <li>
                                      <div class="cell">
                                        <label class="w120">
                                          <i class="checkbox-common left-10">
                                          <input type="checkbox" name="permiss" dir="sonson" id="196" value="196" onclick="AllCheckBoxClick(event);">&nbsp;
                                          </i>
                                          <span style="font-weight:normal;color:#666;">添加赠品</span>
                                        </label>
                                      </div>
                                    </li>

                                    <li>
                                      <div class="cell">
                                        <label class="w120">
                                          <i class="checkbox-common left-10">
                                          <input type="checkbox" name="permiss" dir="sonson" id="197" value="197" onclick="AllCheckBoxClick(event);">&nbsp;
                                          </i>
                                          <span style="font-weight:normal;color:#666;">修改赠品</span>
                                        </label>
                                      </div>
                                    </li>
                                                                      </ul>
                                                                  <ul class="second">
                                    <li style="margin-right:10px;">
                                      <div class="cell">
                                        <label class="w120">
                                          <i class="checkbox-common">
                                          <input type="checkbox" name="permiss" dir="son" id="198" value="198" onclick="AllCheckBoxClick(event);">&nbsp;
                                          </i>
                                          <span style="font-weight:normal;color:#000;">满减送</span>
                                        </label>
                                      </div>
                                    </li>

                                    <li>
                                      <div class="cell">
                                        <label class="w120">
                                          <i class="checkbox-common left-10">
                                          <input type="checkbox" name="permiss" dir="sonson" id="199" value="199" onclick="AllCheckBoxClick(event);">&nbsp;
                                          </i>
                                          <span style="font-weight:normal;color:#666;">添加满减满送</span>
                                        </label>
                                      </div>
                                    </li>

                                    <li>
                                      <div class="cell">
                                        <label class="w120">
                                          <i class="checkbox-common left-10">
                                          <input type="checkbox" name="permiss" dir="sonson" id="200" value="200" onclick="AllCheckBoxClick(event);">&nbsp;
                                          </i>
                                          <span style="font-weight:normal;color:#666;">编辑满减送</span>
                                        </label>
                                      </div>
                                    </li>
                                                                      </ul>
                                                                  <ul class="second">
                                    <li style="margin-right:10px;">
                                      <div class="cell">
                                        <label class="w120">
                                          <i class="checkbox-common">
                                          <input type="checkbox" name="permiss" dir="son" id="11098" value="11098" onclick="AllCheckBoxClick(event);">&nbsp;
                                          </i>
                                          <span style="font-weight:normal;color:#000;">砍价活动</span>
                                        </label>
                                      </div>
                                    </li>

                                    <li>
                                      <div class="cell">
                                        <label class="w120">
                                          <i class="checkbox-common left-10">
                                          <input type="checkbox" name="permiss" dir="sonson" id="11099" value="11099" onclick="AllCheckBoxClick(event);">&nbsp;
                                          </i>
                                          <span style="font-weight:normal;color:#666;">砍价配置</span>
                                        </label>
                                      </div>
                                    </li>

                                    <li>
                                      <div class="cell">
                                        <label class="w120">
                                          <i class="checkbox-common left-10">
                                          <input type="checkbox" name="permiss" dir="sonson" id="11100" value="11100" onclick="AllCheckBoxClick(event);">&nbsp;
                                          </i>
                                          <span style="font-weight:normal;color:#666;">添加活动</span>
                                        </label>
                                      </div>
                                    </li>

                                    <li>
                                      <div class="cell">
                                        <label class="w120">
                                          <i class="checkbox-common left-10">
                                          <input type="checkbox" name="permiss" dir="sonson" id="11101" value="11101" onclick="AllCheckBoxClick(event);">&nbsp;
                                          </i>
                                          <span style="font-weight:normal;color:#666;">修改活动</span>
                                        </label>
                                      </div>
                                    </li>
                                                                      </ul>
                                                                  <ul class="second">
                                    <li style="margin-right:10px;">
                                      <div class="cell">
                                        <label class="w120">
                                          <i class="checkbox-common">
                                          <input type="checkbox" name="permiss" dir="son" id="201" value="201" onclick="AllCheckBoxClick(event);">&nbsp;
                                          </i>
                                          <span style="font-weight:normal;color:#000;">限时折扣</span>
                                        </label>
                                      </div>
                                    </li>

                                    <li>
                                      <div class="cell">
                                        <label class="w120">
                                          <i class="checkbox-common left-10">
                                          <input type="checkbox" name="permiss" dir="sonson" id="202" value="202" onclick="AllCheckBoxClick(event);">&nbsp;
                                          </i>
                                          <span style="font-weight:normal;color:#666;">添加限时折扣</span>
                                        </label>
                                      </div>
                                    </li>

                                    <li>
                                      <div class="cell">
                                        <label class="w120">
                                          <i class="checkbox-common left-10">
                                          <input type="checkbox" name="permiss" dir="sonson" id="203" value="203" onclick="AllCheckBoxClick(event);">&nbsp;
                                          </i>
                                          <span style="font-weight:normal;color:#666;">修改限时折扣</span>
                                        </label>
                                      </div>
                                    </li>
                                                                      </ul>
                                                                  <ul class="second">
                                    <li style="margin-right:10px;">
                                      <div class="cell">
                                        <label class="w120">
                                          <i class="checkbox-common">
                                          <input type="checkbox" name="permiss" dir="son" id="11041" value="11041" onclick="AllCheckBoxClick(event);">&nbsp;
                                          </i>
                                          <span style="font-weight:normal;color:#000;">组合套餐</span>
                                        </label>
                                      </div>
                                    </li>

                                    <li>
                                      <div class="cell">
                                        <label class="w120">
                                          <i class="checkbox-common left-10">
                                          <input type="checkbox" name="permiss" dir="sonson" id="11042" value="11042" onclick="AllCheckBoxClick(event);">&nbsp;
                                          </i>
                                          <span style="font-weight:normal;color:#666;">编辑组合套餐</span>
                                        </label>
                                      </div>
                                    </li>
                                                                      </ul>
                                                                  <ul class="second">
                                    <li style="margin-right:10px;">
                                      <div class="cell">
                                        <label class="w120">
                                          <i class="checkbox-common">
                                          <input type="checkbox" name="permiss" dir="son" id="469" value="469" onclick="AllCheckBoxClick(event);">&nbsp;
                                          </i>
                                          <span style="font-weight:normal;color:#000;">满额包邮</span>
                                        </label>
                                      </div>
                                    </li>
                                                                      </ul>
                                                                  <ul class="second">
                                    <li style="margin-right:10px;">
                                      <div class="cell">
                                        <label class="w120">
                                          <i class="checkbox-common">
                                          <input type="checkbox" name="permiss" dir="son" id="11057" value="11057" onclick="AllCheckBoxClick(event);">&nbsp;
                                          </i>
                                          <span style="font-weight:normal;color:#000;">奖励规则</span>
                                        </label>
                                      </div>
                                    </li>
                                                                      </ul>
                                                                  <ul class="second">
                                    <li style="margin-right:10px;">
                                      <div class="cell">
                                        <label class="w120">
                                          <i class="checkbox-common">
                                          <input type="checkbox" name="permiss" dir="son" id="11061" value="11061" onclick="AllCheckBoxClick(event);">&nbsp;
                                          </i>
                                          <span style="font-weight:normal;color:#000;">互动游戏</span>
                                        </label>
                                      </div>
                                    </li>

                                    <li>
                                      <div class="cell">
                                        <label class="w120">
                                          <i class="checkbox-common left-10">
                                          <input type="checkbox" name="permiss" dir="sonson" id="11062" value="11062" onclick="AllCheckBoxClick(event);">&nbsp;
                                          </i>
                                          <span style="font-weight:normal;color:#666;">添加活动</span>
                                        </label>
                                      </div>
                                    </li>

                                    <li>
                                      <div class="cell">
                                        <label class="w120">
                                          <i class="checkbox-common left-10">
                                          <input type="checkbox" name="permiss" dir="sonson" id="11063" value="11063" onclick="AllCheckBoxClick(event);">&nbsp;
                                          </i>
                                          <span style="font-weight:normal;color:#666;">活动类型</span>
                                        </label>
                                      </div>
                                    </li>

                                    <li>
                                      <div class="cell">
                                        <label class="w120">
                                          <i class="checkbox-common left-10">
                                          <input type="checkbox" name="permiss" dir="sonson" id="11064" value="11064" onclick="AllCheckBoxClick(event);">&nbsp;
                                          </i>
                                          <span style="font-weight:normal;color:#666;">修改互动游戏</span>
                                        </label>
                                      </div>
                                    </li>

                                    <li>
                                      <div class="cell">
                                        <label class="w120">
                                          <i class="checkbox-common left-10">
                                          <input type="checkbox" name="permiss" dir="sonson" id="11065" value="11065" onclick="AllCheckBoxClick(event);">&nbsp;
                                          </i>
                                          <span style="font-weight:normal;color:#666;">游戏奖项</span>
                                        </label>
                                      </div>
                                    </li>

                                    <li>
                                      <div class="cell">
                                        <label class="w120">
                                          <i class="checkbox-common left-10">
                                          <input type="checkbox" name="permiss" dir="sonson" id="11066" value="11066" onclick="AllCheckBoxClick(event);">&nbsp;
                                          </i>
                                          <span style="font-weight:normal;color:#666;">获奖记录</span>
                                        </label>
                                      </div>
                                    </li>
                                                                      </ul>
                                                                  <ul class="second">
                                    <li style="margin-right:10px;">
                                      <div class="cell">
                                        <label class="w120">
                                          <i class="checkbox-common">
                                          <input type="checkbox" name="permiss" dir="son" id="11068" value="11068" onclick="AllCheckBoxClick(event);">&nbsp;
                                          </i>
                                          <span style="font-weight:normal;color:#000;">团购</span>
                                        </label>
                                      </div>
                                    </li>

                                    <li>
                                      <div class="cell">
                                        <label class="w120">
                                          <i class="checkbox-common left-10">
                                          <input type="checkbox" name="permiss" dir="sonson" id="11069" value="11069" onclick="AllCheckBoxClick(event);">&nbsp;
                                          </i>
                                          <span style="font-weight:normal;color:#666;">添加团购活动</span>
                                        </label>
                                      </div>
                                    </li>

                                    <li>
                                      <div class="cell">
                                        <label class="w120">
                                          <i class="checkbox-common left-10">
                                          <input type="checkbox" name="permiss" dir="sonson" id="11070" value="11070" onclick="AllCheckBoxClick(event);">&nbsp;
                                          </i>
                                          <span style="font-weight:normal;color:#666;">修改团购活动</span>
                                        </label>
                                      </div>
                                    </li>
                                                                      </ul>
                                                                  <ul class="second">
                                    <li style="margin-right:10px;">
                                      <div class="cell">
                                        <label class="w120">
                                          <i class="checkbox-common">
                                          <input type="checkbox" name="permiss" dir="son" id="11043" value="11043" onclick="AllCheckBoxClick(event);">&nbsp;
                                          </i>
                                          <span style="font-weight:normal;color:#000;">拼团</span>
                                        </label>
                                      </div>
                                    </li>

                                    <li>
                                      <div class="cell">
                                        <label class="w120">
                                          <i class="checkbox-common left-10">
                                          <input type="checkbox" name="permiss" dir="sonson" id="11044" value="11044" onclick="AllCheckBoxClick(event);">&nbsp;
                                          </i>
                                          <span style="font-weight:normal;color:#666;">拼团设置</span>
                                        </label>
                                      </div>
                                    </li>

                                    <li>
                                      <div class="cell">
                                        <label class="w120">
                                          <i class="checkbox-common left-10">
                                          <input type="checkbox" name="permiss" dir="sonson" id="11047" value="11047" onclick="AllCheckBoxClick(event);">&nbsp;
                                          </i>
                                          <span style="font-weight:normal;color:#666;">拼团列表</span>
                                        </label>
                                      </div>
                                    </li>
                                                                      </ul>
                                                                  <ul class="second">
                                    <li style="margin-right:10px;">
                                      <div class="cell">
                                        <label class="w120">
                                          <i class="checkbox-common">
                                          <input type="checkbox" name="permiss" dir="son" id="11090" value="11090" onclick="AllCheckBoxClick(event);">&nbsp;
                                          </i>
                                          <span style="font-weight:normal;color:#000;">专题活动</span>
                                        </label>
                                      </div>
                                    </li>

                                    <li>
                                      <div class="cell">
                                        <label class="w120">
                                          <i class="checkbox-common left-10">
                                          <input type="checkbox" name="permiss" dir="sonson" id="11091" value="11091" onclick="AllCheckBoxClick(event);">&nbsp;
                                          </i>
                                          <span style="font-weight:normal;color:#666;">添加专题活动</span>
                                        </label>
                                      </div>
                                    </li>

                                    <li>
                                      <div class="cell">
                                        <label class="w120">
                                          <i class="checkbox-common left-10">
                                          <input type="checkbox" name="permiss" dir="sonson" id="11092" value="11092" onclick="AllCheckBoxClick(event);">&nbsp;
                                          </i>
                                          <span style="font-weight:normal;color:#666;">修改专题活动</span>
                                        </label>
                                      </div>
                                    </li>
                                                                      </ul>
                                                                </td>
                              </tr>
                                                            <tr class="tr-Current">
                                <td>
                                  <div>
                                    <label>
                                      <i class="checkbox-common">
                                      <input type="checkbox" name="permiss" dir="parent" id="137" value="137" onclick="AllCheckBoxClick(event);"></i>&nbsp;会员
                                    </label>
                                  </div>
                                </td>
                                <td>
                                                                  <ul class="second">
                                    <li style="margin-right:10px;">
                                      <div class="cell">
                                        <label class="w120">
                                          <i class="checkbox-common">
                                          <input type="checkbox" name="permiss" dir="son" id="145" value="145" onclick="AllCheckBoxClick(event);">&nbsp;
                                          </i>
                                          <span style="font-weight:normal;color:#000;">会员列表</span>
                                        </label>
                                      </div>
                                    </li>

                                    <li>
                                      <div class="cell">
                                        <label class="w120">
                                          <i class="checkbox-common left-10">
                                          <input type="checkbox" name="permiss" dir="sonson" id="11067" value="11067" onclick="AllCheckBoxClick(event);">&nbsp;
                                          </i>
                                          <span style="font-weight:normal;color:#666;">会员足迹</span>
                                        </label>
                                      </div>
                                    </li>

                                    <li>
                                      <div class="cell">
                                        <label class="w120">
                                          <i class="checkbox-common left-10">
                                          <input type="checkbox" name="permiss" dir="sonson" id="11073" value="11073" onclick="AllCheckBoxClick(event);">&nbsp;
                                          </i>
                                          <span style="font-weight:normal;color:#666;">会员余额明细</span>
                                        </label>
                                      </div>
                                    </li>

                                    <li>
                                      <div class="cell">
                                        <label class="w120">
                                          <i class="checkbox-common left-10">
                                          <input type="checkbox" name="permiss" dir="sonson" id="497" value="497" onclick="AllCheckBoxClick(event);">&nbsp;
                                          </i>
                                          <span style="font-weight:normal;color:#666;">会员积分明细</span>
                                        </label>
                                      </div>
                                    </li>

                                    <li>
                                      <div class="cell">
                                        <label class="w120">
                                          <i class="checkbox-common left-10">
                                          <input type="checkbox" name="permiss" dir="sonson" id="498" value="498" onclick="AllCheckBoxClick(event);">&nbsp;
                                          </i>
                                          <span style="font-weight:normal;color:#666;">会员余额明细</span>
                                        </label>
                                      </div>
                                    </li>
                                                                      </ul>
                                                                  <ul class="second">
                                    <li style="margin-right:10px;">
                                      <div class="cell">
                                        <label class="w120">
                                          <i class="checkbox-common">
                                          <input type="checkbox" name="permiss" dir="son" id="488" value="488" onclick="AllCheckBoxClick(event);">&nbsp;
                                          </i>
                                          <span style="font-weight:normal;color:#000;">会员等级</span>
                                        </label>
                                      </div>
                                    </li>

                                    <li>
                                      <div class="cell">
                                        <label class="w120">
                                          <i class="checkbox-common left-10">
                                          <input type="checkbox" name="permiss" dir="sonson" id="490" value="490" onclick="AllCheckBoxClick(event);">&nbsp;
                                          </i>
                                          <span style="font-weight:normal;color:#666;">修改等级</span>
                                        </label>
                                      </div>
                                    </li>

                                    <li>
                                      <div class="cell">
                                        <label class="w120">
                                          <i class="checkbox-common left-10">
                                          <input type="checkbox" name="permiss" dir="sonson" id="489" value="489" onclick="AllCheckBoxClick(event);">&nbsp;
                                          </i>
                                          <span style="font-weight:normal;color:#666;">添加等级</span>
                                        </label>
                                      </div>
                                    </li>
                                                                      </ul>
                                                                  <ul class="second">
                                    <li style="margin-right:10px;">
                                      <div class="cell">
                                        <label class="w120">
                                          <i class="checkbox-common">
                                          <input type="checkbox" name="permiss" dir="son" id="504" value="504" onclick="AllCheckBoxClick(event);">&nbsp;
                                          </i>
                                          <span style="font-weight:normal;color:#000;">会员提现</span>
                                        </label>
                                      </div>
                                    </li>
                                                                      </ul>
                                                                  <ul class="second">
                                    <li style="margin-right:10px;">
                                      <div class="cell">
                                        <label class="w120">
                                          <i class="checkbox-common">
                                          <input type="checkbox" name="permiss" dir="son" id="509" value="509" onclick="AllCheckBoxClick(event);">&nbsp;
                                          </i>
                                          <span style="font-weight:normal;color:#000;">积分管理</span>
                                        </label>
                                      </div>
                                    </li>
                                                                      </ul>
                                                                  <ul class="second">
                                    <li style="margin-right:10px;">
                                      <div class="cell">
                                        <label class="w120">
                                          <i class="checkbox-common">
                                          <input type="checkbox" name="permiss" dir="son" id="510" value="510" onclick="AllCheckBoxClick(event);">&nbsp;
                                          </i>
                                          <span style="font-weight:normal;color:#000;">余额管理</span>
                                        </label>
                                      </div>
                                    </li>
                                                                      </ul>
                                                                </td>
                              </tr>
                                                            <tr class="tr-Current">
                                <td>
                                  <div>
                                    <label>
                                      <i class="checkbox-common">
                                      <input type="checkbox" name="permiss" dir="parent" id="409" value="409" onclick="AllCheckBoxClick(event);"></i>&nbsp;数据
                                    </label>
                                  </div>
                                </td>
                                <td>
                                                                  <ul class="second">
                                    <li style="margin-right:10px;">
                                      <div class="cell">
                                        <label class="w120">
                                          <i class="checkbox-common">
                                          <input type="checkbox" name="permiss" dir="son" id="459" value="459" onclick="AllCheckBoxClick(event);">&nbsp;
                                          </i>
                                          <span style="font-weight:normal;color:#000;">销售概况</span>
                                        </label>
                                      </div>
                                    </li>
                                                                      </ul>
                                                                  <ul class="second">
                                    <li style="margin-right:10px;">
                                      <div class="cell">
                                        <label class="w120">
                                          <i class="checkbox-common">
                                          <input type="checkbox" name="permiss" dir="son" id="463" value="463" onclick="AllCheckBoxClick(event);">&nbsp;
                                          </i>
                                          <span style="font-weight:normal;color:#000;">商品分析</span>
                                        </label>
                                      </div>
                                    </li>

                                    <li>
                                      <div class="cell">
                                        <label class="w120">
                                          <i class="checkbox-common left-10">
                                          <input type="checkbox" name="permiss" dir="sonson" id="460" value="460" onclick="AllCheckBoxClick(event);">&nbsp;
                                          </i>
                                          <span style="font-weight:normal;color:#666;">热卖商品</span>
                                        </label>
                                      </div>
                                    </li>
                                                                      </ul>
                                                                  <ul class="second">
                                    <li style="margin-right:10px;">
                                      <div class="cell">
                                        <label class="w120">
                                          <i class="checkbox-common">
                                          <input type="checkbox" name="permiss" dir="son" id="461" value="461" onclick="AllCheckBoxClick(event);">&nbsp;
                                          </i>
                                          <span style="font-weight:normal;color:#000;">同行热卖</span>
                                        </label>
                                      </div>
                                    </li>
                                                                      </ul>
                                                                  <ul class="second">
                                    <li style="margin-right:10px;">
                                      <div class="cell">
                                        <label class="w120">
                                          <i class="checkbox-common">
                                          <input type="checkbox" name="permiss" dir="son" id="462" value="462" onclick="AllCheckBoxClick(event);">&nbsp;
                                          </i>
                                          <span style="font-weight:normal;color:#000;">运营报告</span>
                                        </label>
                                      </div>
                                    </li>
                                                                      </ul>
                                                                  <ul class="second">
                                    <li style="margin-right:10px;">
                                      <div class="cell">
                                        <label class="w120">
                                          <i class="checkbox-common">
                                          <input type="checkbox" name="permiss" dir="son" id="454" value="454" onclick="AllCheckBoxClick(event);">&nbsp;
                                          </i>
                                          <span style="font-weight:normal;color:#000;">销售统计</span>
                                        </label>
                                      </div>
                                    </li>

                                    <li>
                                      <div class="cell">
                                        <label class="w120">
                                          <i class="checkbox-common left-10">
                                          <input type="checkbox" name="permiss" dir="sonson" id="457" value="457" onclick="AllCheckBoxClick(event);">&nbsp;
                                          </i>
                                          <span style="font-weight:normal;color:#666;">销售明细</span>
                                        </label>
                                      </div>
                                    </li>
                                                                      </ul>
                                                                  <ul class="second">
                                    <li style="margin-right:10px;">
                                      <div class="cell">
                                        <label class="w120">
                                          <i class="checkbox-common">
                                          <input type="checkbox" name="permiss" dir="son" id="403" value="403" onclick="AllCheckBoxClick(event);">&nbsp;
                                          </i>
                                          <span style="font-weight:normal;color:#000;">销售排行</span>
                                        </label>
                                      </div>
                                    </li>

                                    <li>
                                      <div class="cell">
                                        <label class="w120">
                                          <i class="checkbox-common left-10">
                                          <input type="checkbox" name="permiss" dir="sonson" id="405" value="405" onclick="AllCheckBoxClick(event);">&nbsp;
                                          </i>
                                          <span style="font-weight:normal;color:#666;">商品销售统计</span>
                                        </label>
                                      </div>
                                    </li>
                                                                      </ul>
                                                                </td>
                              </tr>
                                                            <tr class="tr-Current">
                                <td>
                                  <div>
                                    <label>
                                      <i class="checkbox-common">
                                      <input type="checkbox" name="permiss" dir="parent" id="335" value="335" onclick="AllCheckBoxClick(event);"></i>&nbsp;微信
                                    </label>
                                  </div>
                                </td>
                                <td>
                                                                  <ul class="second">
                                    <li style="margin-right:10px;">
                                      <div class="cell">
                                        <label class="w120">
                                          <i class="checkbox-common">
                                          <input type="checkbox" name="permiss" dir="son" id="11071" value="11071" onclick="AllCheckBoxClick(event);">&nbsp;
                                          </i>
                                          <span style="font-weight:normal;color:#000;">微信小程序管理</span>
                                        </label>
                                      </div>
                                    </li>
                                                                      </ul>
                                                                  <ul class="second">
                                    <li style="margin-right:10px;">
                                      <div class="cell">
                                        <label class="w120">
                                          <i class="checkbox-common">
                                          <input type="checkbox" name="permiss" dir="son" id="336" value="336" onclick="AllCheckBoxClick(event);">&nbsp;
                                          </i>
                                          <span style="font-weight:normal;color:#000;">公众号管理</span>
                                        </label>
                                      </div>
                                    </li>
                                                                      </ul>
                                                                  <ul class="second">
                                    <li style="margin-right:10px;">
                                      <div class="cell">
                                        <label class="w120">
                                          <i class="checkbox-common">
                                          <input type="checkbox" name="permiss" dir="son" id="339" value="339" onclick="AllCheckBoxClick(event);">&nbsp;
                                          </i>
                                          <span style="font-weight:normal;color:#000;">微信菜单管理</span>
                                        </label>
                                      </div>
                                    </li>
                                                                      </ul>
                                                                  <ul class="second">
                                    <li style="margin-right:10px;">
                                      <div class="cell">
                                        <label class="w120">
                                          <i class="checkbox-common">
                                          <input type="checkbox" name="permiss" dir="son" id="340" value="340" onclick="AllCheckBoxClick(event);">&nbsp;
                                          </i>
                                          <span style="font-weight:normal;color:#000;">推广二维码管理</span>
                                        </label>
                                      </div>
                                    </li>

                                    <li>
                                      <div class="cell">
                                        <label class="w120">
                                          <i class="checkbox-common left-10">
                                          <input type="checkbox" name="permiss" dir="sonson" id="358" value="358" onclick="AllCheckBoxClick(event);">&nbsp;
                                          </i>
                                          <span style="font-weight:normal;color:#666;">自定义推广二维码</span>
                                        </label>
                                      </div>
                                    </li>
                                                                      </ul>
                                                                  <ul class="second">
                                    <li style="margin-right:10px;">
                                      <div class="cell">
                                        <label class="w120">
                                          <i class="checkbox-common">
                                          <input type="checkbox" name="permiss" dir="son" id="341" value="341" onclick="AllCheckBoxClick(event);">&nbsp;
                                          </i>
                                          <span style="font-weight:normal;color:#000;">回复设置</span>
                                        </label>
                                      </div>
                                    </li>

                                    <li>
                                      <div class="cell">
                                        <label class="w120">
                                          <i class="checkbox-common left-10">
                                          <input type="checkbox" name="permiss" dir="sonson" id="359" value="359" onclick="AllCheckBoxClick(event);">&nbsp;
                                          </i>
                                          <span style="font-weight:normal;color:#666;">添加回复</span>
                                        </label>
                                      </div>
                                    </li>
                                                                      </ul>
                                                                  <ul class="second">
                                    <li style="margin-right:10px;">
                                      <div class="cell">
                                        <label class="w120">
                                          <i class="checkbox-common">
                                          <input type="checkbox" name="permiss" dir="son" id="342" value="342" onclick="AllCheckBoxClick(event);">&nbsp;
                                          </i>
                                          <span style="font-weight:normal;color:#000;">消息素材管理</span>
                                        </label>
                                      </div>
                                    </li>

                                    <li>
                                      <div class="cell">
                                        <label class="w120">
                                          <i class="checkbox-common left-10">
                                          <input type="checkbox" name="permiss" dir="sonson" id="450" value="450" onclick="AllCheckBoxClick(event);">&nbsp;
                                          </i>
                                          <span style="font-weight:normal;color:#666;">修改消息素材</span>
                                        </label>
                                      </div>
                                    </li>

                                    <li>
                                      <div class="cell">
                                        <label class="w120">
                                          <i class="checkbox-common left-10">
                                          <input type="checkbox" name="permiss" dir="sonson" id="451" value="451" onclick="AllCheckBoxClick(event);">&nbsp;
                                          </i>
                                          <span style="font-weight:normal;color:#666;">添加消息素材</span>
                                        </label>
                                      </div>
                                    </li>
                                                                      </ul>
                                                                  <ul class="second">
                                    <li style="margin-right:10px;">
                                      <div class="cell">
                                        <label class="w120">
                                          <i class="checkbox-common">
                                          <input type="checkbox" name="permiss" dir="son" id="361" value="361" onclick="AllCheckBoxClick(event);">&nbsp;
                                          </i>
                                          <span style="font-weight:normal;color:#000;">一键关注设置</span>
                                        </label>
                                      </div>
                                    </li>
                                                                      </ul>
                                                                  <ul class="second">
                                    <li style="margin-right:10px;">
                                      <div class="cell">
                                        <label class="w120">
                                          <i class="checkbox-common">
                                          <input type="checkbox" name="permiss" dir="son" id="343" value="343" onclick="AllCheckBoxClick(event);">&nbsp;
                                          </i>
                                          <span style="font-weight:normal;color:#000;">分享内容设置</span>
                                        </label>
                                      </div>
                                    </li>
                                                                      </ul>
                                                                  <ul class="second">
                                    <li style="margin-right:10px;">
                                      <div class="cell">
                                        <label class="w120">
                                          <i class="checkbox-common">
                                          <input type="checkbox" name="permiss" dir="son" id="11104" value="11104" onclick="AllCheckBoxClick(event);">&nbsp;
                                          </i>
                                          <span style="font-weight:normal;color:#000;">模板消息设置</span>
                                        </label>
                                      </div>
                                    </li>
                                                                      </ul>
                                                                  <ul class="second">
                                    <li style="margin-right:10px;">
                                      <div class="cell">
                                        <label class="w120">
                                          <i class="checkbox-common">
                                          <input type="checkbox" name="permiss" dir="son" id="447" value="447" onclick="AllCheckBoxClick(event);">&nbsp;
                                          </i>
                                          <span style="font-weight:normal;color:#000;">粉丝列表</span>
                                        </label>
                                      </div>
                                    </li>
                                                                      </ul>
                                                                  <ul class="second">
                                    <li style="margin-right:10px;">
                                      <div class="cell">
                                        <label class="w120">
                                          <i class="checkbox-common">
                                          <input type="checkbox" name="permiss" dir="son" id="11058" value="11058" onclick="AllCheckBoxClick(event);">&nbsp;
                                          </i>
                                          <span style="font-weight:normal;color:#000;">一键关注设置</span>
                                        </label>
                                      </div>
                                    </li>
                                                                      </ul>
                                                                  <ul class="second">
                                    <li style="margin-right:10px;">
                                      <div class="cell">
                                        <label class="w120">
                                          <i class="checkbox-common">
                                          <input type="checkbox" name="permiss" dir="son" id="11082" value="11082" onclick="AllCheckBoxClick(event);">&nbsp;
                                          </i>
                                          <span style="font-weight:normal;color:#000;">客服管理</span>
                                        </label>
                                      </div>
                                    </li>
                                                                      </ul>
                                                                </td>
                              </tr>
                                                            <tr class="tr-Current">
                                <td>
                                  <div>
                                    <label>
                                      <i class="checkbox-common">
                                      <input type="checkbox" name="permiss" dir="parent" id="1001" value="1001" onclick="AllCheckBoxClick(event);"></i>&nbsp;佣金
                                    </label>
                                  </div>
                                </td>
                                <td>
                                                                  <ul class="second">
                                    <li style="margin-right:10px;">
                                      <div class="cell">
                                        <label class="w120">
                                          <i class="checkbox-common">
                                          <input type="checkbox" name="permiss" dir="son" id="1002" value="1002" onclick="AllCheckBoxClick(event);">&nbsp;
                                          </i>
                                          <span style="font-weight:normal;color:#000;">推广员佣金</span>
                                        </label>
                                      </div>
                                    </li>
                                                                      </ul>
                                                                  <ul class="second">
                                    <li style="margin-right:10px;">
                                      <div class="cell">
                                        <label class="w120">
                                          <i class="checkbox-common">
                                          <input type="checkbox" name="permiss" dir="son" id="1003" value="1003" onclick="AllCheckBoxClick(event);">&nbsp;
                                          </i>
                                          <span style="font-weight:normal;color:#000;">三级分销</span>
                                        </label>
                                      </div>
                                    </li>
                                                                      </ul>
                                                                  <ul class="second">
                                    <li style="margin-right:10px;">
                                      <div class="cell">
                                        <label class="w120">
                                          <i class="checkbox-common">
                                          <input type="checkbox" name="permiss" dir="son" id="1004" value="1004" onclick="AllCheckBoxClick(event);">&nbsp;
                                          </i>
                                          <span style="font-weight:normal;color:#000;">股东分红</span>
                                        </label>
                                      </div>
                                    </li>
                                                                      </ul>
                                                                  <ul class="second">
                                    <li style="margin-right:10px;">
                                      <div class="cell">
                                        <label class="w120">
                                          <i class="checkbox-common">
                                          <input type="checkbox" name="permiss" dir="son" id="1005" value="1005" onclick="AllCheckBoxClick(event);">&nbsp;
                                          </i>
                                          <span style="font-weight:normal;color:#000;">区域代理</span>
                                        </label>
                                      </div>
                                    </li>
                                                                      </ul>
                                                                  <ul class="second">
                                    <li style="margin-right:10px;">
                                      <div class="cell">
                                        <label class="w120">
                                          <i class="checkbox-common">
                                          <input type="checkbox" name="permiss" dir="son" id="1006" value="1006" onclick="AllCheckBoxClick(event);">&nbsp;
                                          </i>
                                          <span style="font-weight:normal;color:#000;">全球分红</span>
                                        </label>
                                      </div>
                                    </li>
                                                                      </ul>
                                                                  <ul class="second">
                                    <li style="margin-right:10px;">
                                      <div class="cell">
                                        <label class="w120">
                                          <i class="checkbox-common">
                                          <input type="checkbox" name="permiss" dir="son" id="1007" value="1007" onclick="AllCheckBoxClick(event);">&nbsp;
                                          </i>
                                          <span style="font-weight:normal;color:#000;">会员提现</span>
                                        </label>
                                      </div>
                                    </li>
                                                                      </ul>
                                                                </td>
                              </tr>
                                                            <tr class="tr-Current">
                                <td>
                                  <div>
                                    <label>
                                      <i class="checkbox-common">
                                      <input type="checkbox" name="permiss" dir="parent" id="477" value="477" onclick="AllCheckBoxClick(event);"></i>&nbsp;网站
                                    </label>
                                  </div>
                                </td>
                                <td>
                                                                  <ul class="second">
                                    <li style="margin-right:10px;">
                                      <div class="cell">
                                        <label class="w120">
                                          <i class="checkbox-common">
                                          <input type="checkbox" name="permiss" dir="son" id="445" value="445" onclick="AllCheckBoxClick(event);">&nbsp;
                                          </i>
                                          <span style="font-weight:normal;color:#000;">首页公告</span>
                                        </label>
                                      </div>
                                    </li>

                                    <li>
                                      <div class="cell">
                                        <label class="w120">
                                          <i class="checkbox-common left-10">
                                          <input type="checkbox" name="permiss" dir="sonson" id="11029" value="11029" onclick="AllCheckBoxClick(event);">&nbsp;
                                          </i>
                                          <span style="font-weight:normal;color:#666;">添加首页公告</span>
                                        </label>
                                      </div>
                                    </li>

                                    <li>
                                      <div class="cell">
                                        <label class="w120">
                                          <i class="checkbox-common left-10">
                                          <input type="checkbox" name="permiss" dir="sonson" id="11030" value="11030" onclick="AllCheckBoxClick(event);">&nbsp;
                                          </i>
                                          <span style="font-weight:normal;color:#666;">公告编辑</span>
                                        </label>
                                      </div>
                                    </li>
                                                                      </ul>
                                                                  <ul class="second">
                                    <li style="margin-right:10px;">
                                      <div class="cell">
                                        <label class="w120">
                                          <i class="checkbox-common">
                                          <input type="checkbox" name="permiss" dir="son" id="427" value="427" onclick="AllCheckBoxClick(event);">&nbsp;
                                          </i>
                                          <span style="font-weight:normal;color:#000;">导航管理</span>
                                        </label>
                                      </div>
                                    </li>
                                                                      </ul>
                                                                  <ul class="second">
                                    <li style="margin-right:10px;">
                                      <div class="cell">
                                        <label class="w120">
                                          <i class="checkbox-common">
                                          <input type="checkbox" name="permiss" dir="son" id="11023" value="11023" onclick="AllCheckBoxClick(event);">&nbsp;
                                          </i>
                                          <span style="font-weight:normal;color:#000;">商品楼层</span>
                                        </label>
                                      </div>
                                    </li>
                                                                      </ul>
                                                                  <ul class="second">
                                    <li style="margin-right:10px;">
                                      <div class="cell">
                                        <label class="w120">
                                          <i class="checkbox-common">
                                          <input type="checkbox" name="permiss" dir="son" id="10007" value="10007" onclick="AllCheckBoxClick(event);">&nbsp;
                                          </i>
                                          <span style="font-weight:normal;color:#000;">店铺装修</span>
                                        </label>
                                      </div>
                                    </li>

                                    <li>
                                      <div class="cell">
                                        <label class="w120">
                                          <i class="checkbox-common left-10">
                                          <input type="checkbox" name="permiss" dir="sonson" id="394" value="394" onclick="AllCheckBoxClick(event);">&nbsp;
                                          </i>
                                          <span style="font-weight:normal;color:#666;">添加楼层</span>
                                        </label>
                                      </div>
                                    </li>

                                    <li>
                                      <div class="cell">
                                        <label class="w120">
                                          <i class="checkbox-common left-10">
                                          <input type="checkbox" name="permiss" dir="sonson" id="395" value="395" onclick="AllCheckBoxClick(event);">&nbsp;
                                          </i>
                                          <span style="font-weight:normal;color:#666;">楼层编辑</span>
                                        </label>
                                      </div>
                                    </li>

                                    <li>
                                      <div class="cell">
                                        <label class="w120">
                                          <i class="checkbox-common left-10">
                                          <input type="checkbox" name="permiss" dir="sonson" id="11024" value="11024" onclick="AllCheckBoxClick(event);">&nbsp;
                                          </i>
                                          <span style="font-weight:normal;color:#666;">电脑端模板</span>
                                        </label>
                                      </div>
                                    </li>

                                    <li>
                                      <div class="cell">
                                        <label class="w120">
                                          <i class="checkbox-common left-10">
                                          <input type="checkbox" name="permiss" dir="sonson" id="11021" value="11021" onclick="AllCheckBoxClick(event);">&nbsp;
                                          </i>
                                          <span style="font-weight:normal;color:#666;">手机端模板</span>
                                        </label>
                                      </div>
                                    </li>

                                    <li>
                                      <div class="cell">
                                        <label class="w120">
                                          <i class="checkbox-common left-10">
                                          <input type="checkbox" name="permiss" dir="sonson" id="11048" value="11048" onclick="AllCheckBoxClick(event);">&nbsp;
                                          </i>
                                          <span style="font-weight:normal;color:#666;">手机端自定义模板</span>
                                        </label>
                                      </div>
                                    </li>

                                    <li>
                                      <div class="cell">
                                        <label class="w120">
                                          <i class="checkbox-common left-10">
                                          <input type="checkbox" name="permiss" dir="sonson" id="11049" value="11049" onclick="AllCheckBoxClick(event);">&nbsp;
                                          </i>
                                          <span style="font-weight:normal;color:#666;">自定义模板编辑</span>
                                        </label>
                                      </div>
                                    </li>

                                    <li>
                                      <div class="cell">
                                        <label class="w120">
                                          <i class="checkbox-common left-10">
                                          <input type="checkbox" name="permiss" dir="sonson" id="390" value="390" onclick="AllCheckBoxClick(event);">&nbsp;
                                          </i>
                                          <span style="font-weight:normal;color:#666;">促销版块</span>
                                        </label>
                                      </div>
                                    </li>

                                    <li>
                                      <div class="cell">
                                        <label class="w120">
                                          <i class="checkbox-common left-10">
                                          <input type="checkbox" name="permiss" dir="sonson" id="392" value="392" onclick="AllCheckBoxClick(event);">&nbsp;
                                          </i>
                                          <span style="font-weight:normal;color:#666;">首页楼层</span>
                                        </label>
                                      </div>
                                    </li>
                                                                      </ul>
                                                                  <ul class="second">
                                    <li style="margin-right:10px;">
                                      <div class="cell">
                                        <label class="w120">
                                          <i class="checkbox-common">
                                          <input type="checkbox" name="permiss" dir="son" id="10008" value="10008" onclick="AllCheckBoxClick(event);">&nbsp;
                                          </i>
                                          <span style="font-weight:normal;color:#000;">搜索</span>
                                        </label>
                                      </div>
                                    </li>

                                    <li>
                                      <div class="cell">
                                        <label class="w120">
                                          <i class="checkbox-common left-10">
                                          <input type="checkbox" name="permiss" dir="sonson" id="11018" value="11018" onclick="AllCheckBoxClick(event);">&nbsp;
                                          </i>
                                          <span style="font-weight:normal;color:#666;">手机模板</span>
                                        </label>
                                      </div>
                                    </li>

                                    <li>
                                      <div class="cell">
                                        <label class="w120">
                                          <i class="checkbox-common left-10">
                                          <input type="checkbox" name="permiss" dir="sonson" id="474" value="474" onclick="AllCheckBoxClick(event);">&nbsp;
                                          </i>
                                          <span style="font-weight:normal;color:#666;">首页公告</span>
                                        </label>
                                      </div>
                                    </li>

                                    <li>
                                      <div class="cell">
                                        <label class="w120">
                                          <i class="checkbox-common left-10">
                                          <input type="checkbox" name="permiss" dir="sonson" id="10009" value="10009" onclick="AllCheckBoxClick(event);">&nbsp;
                                          </i>
                                          <span style="font-weight:normal;color:#666;">促销版块</span>
                                        </label>
                                      </div>
                                    </li>
                                                                      </ul>
                                                                  <ul class="second">
                                    <li style="margin-right:10px;">
                                      <div class="cell">
                                        <label class="w120">
                                          <i class="checkbox-common">
                                          <input type="checkbox" name="permiss" dir="son" id="381" value="381" onclick="AllCheckBoxClick(event);">&nbsp;
                                          </i>
                                          <span style="font-weight:normal;color:#000;">广告管理</span>
                                        </label>
                                      </div>
                                    </li>

                                    <li>
                                      <div class="cell">
                                        <label class="w120">
                                          <i class="checkbox-common left-10">
                                          <input type="checkbox" name="permiss" dir="sonson" id="11036" value="11036" onclick="AllCheckBoxClick(event);">&nbsp;
                                          </i>
                                          <span style="font-weight:normal;color:#666;">广告位管理</span>
                                        </label>
                                      </div>
                                    </li>

                                    <li>
                                      <div class="cell">
                                        <label class="w120">
                                          <i class="checkbox-common left-10">
                                          <input type="checkbox" name="permiss" dir="sonson" id="382" value="382" onclick="AllCheckBoxClick(event);">&nbsp;
                                          </i>
                                          <span style="font-weight:normal;color:#666;">广告管理</span>
                                        </label>
                                      </div>
                                    </li>

                                    <li>
                                      <div class="cell">
                                        <label class="w120">
                                          <i class="checkbox-common left-10">
                                          <input type="checkbox" name="permiss" dir="sonson" id="383" value="383" onclick="AllCheckBoxClick(event);">&nbsp;
                                          </i>
                                          <span style="font-weight:normal;color:#666;">添加广告位</span>
                                        </label>
                                      </div>
                                    </li>

                                    <li>
                                      <div class="cell">
                                        <label class="w120">
                                          <i class="checkbox-common left-10">
                                          <input type="checkbox" name="permiss" dir="sonson" id="387" value="387" onclick="AllCheckBoxClick(event);">&nbsp;
                                          </i>
                                          <span style="font-weight:normal;color:#666;">广告位编辑</span>
                                        </label>
                                      </div>
                                    </li>

                                    <li>
                                      <div class="cell">
                                        <label class="w120">
                                          <i class="checkbox-common left-10">
                                          <input type="checkbox" name="permiss" dir="sonson" id="388" value="388" onclick="AllCheckBoxClick(event);">&nbsp;
                                          </i>
                                          <span style="font-weight:normal;color:#666;">添加广告</span>
                                        </label>
                                      </div>
                                    </li>

                                    <li>
                                      <div class="cell">
                                        <label class="w120">
                                          <i class="checkbox-common left-10">
                                          <input type="checkbox" name="permiss" dir="sonson" id="389" value="389" onclick="AllCheckBoxClick(event);">&nbsp;
                                          </i>
                                          <span style="font-weight:normal;color:#666;">广告编辑</span>
                                        </label>
                                      </div>
                                    </li>
                                                                      </ul>
                                                                  <ul class="second">
                                    <li style="margin-right:10px;">
                                      <div class="cell">
                                        <label class="w120">
                                          <i class="checkbox-common">
                                          <input type="checkbox" name="permiss" dir="son" id="431" value="431" onclick="AllCheckBoxClick(event);">&nbsp;
                                          </i>
                                          <span style="font-weight:normal;color:#000;">文章管理</span>
                                        </label>
                                      </div>
                                    </li>

                                    <li>
                                      <div class="cell">
                                        <label class="w120">
                                          <i class="checkbox-common left-10">
                                          <input type="checkbox" name="permiss" dir="sonson" id="432" value="432" onclick="AllCheckBoxClick(event);">&nbsp;
                                          </i>
                                          <span style="font-weight:normal;color:#666;">文章列表</span>
                                        </label>
                                      </div>
                                    </li>

                                    <li>
                                      <div class="cell">
                                        <label class="w120">
                                          <i class="checkbox-common left-10">
                                          <input type="checkbox" name="permiss" dir="sonson" id="433" value="433" onclick="AllCheckBoxClick(event);">&nbsp;
                                          </i>
                                          <span style="font-weight:normal;color:#666;">文章分类</span>
                                        </label>
                                      </div>
                                    </li>

                                    <li>
                                      <div class="cell">
                                        <label class="w120">
                                          <i class="checkbox-common left-10">
                                          <input type="checkbox" name="permiss" dir="sonson" id="455" value="455" onclick="AllCheckBoxClick(event);">&nbsp;
                                          </i>
                                          <span style="font-weight:normal;color:#666;">修改文章</span>
                                        </label>
                                      </div>
                                    </li>

                                    <li>
                                      <div class="cell">
                                        <label class="w120">
                                          <i class="checkbox-common left-10">
                                          <input type="checkbox" name="permiss" dir="sonson" id="434" value="434" onclick="AllCheckBoxClick(event);">&nbsp;
                                          </i>
                                          <span style="font-weight:normal;color:#666;">评论列表</span>
                                        </label>
                                      </div>
                                    </li>

                                    <li>
                                      <div class="cell">
                                        <label class="w120">
                                          <i class="checkbox-common left-10">
                                          <input type="checkbox" name="permiss" dir="sonson" id="452" value="452" onclick="AllCheckBoxClick(event);">&nbsp;
                                          </i>
                                          <span style="font-weight:normal;color:#666;">添加文章</span>
                                        </label>
                                      </div>
                                    </li>
                                                                      </ul>
                                                                  <ul class="second">
                                    <li style="margin-right:10px;">
                                      <div class="cell">
                                        <label class="w120">
                                          <i class="checkbox-common">
                                          <input type="checkbox" name="permiss" dir="son" id="491" value="491" onclick="AllCheckBoxClick(event);">&nbsp;
                                          </i>
                                          <span style="font-weight:normal;color:#000;">专题列表</span>
                                        </label>
                                      </div>
                                    </li>

                                    <li>
                                      <div class="cell">
                                        <label class="w120">
                                          <i class="checkbox-common left-10">
                                          <input type="checkbox" name="permiss" dir="sonson" id="492" value="492" onclick="AllCheckBoxClick(event);">&nbsp;
                                          </i>
                                          <span style="font-weight:normal;color:#666;">添加专题</span>
                                        </label>
                                      </div>
                                    </li>

                                    <li>
                                      <div class="cell">
                                        <label class="w120">
                                          <i class="checkbox-common left-10">
                                          <input type="checkbox" name="permiss" dir="sonson" id="493" value="493" onclick="AllCheckBoxClick(event);">&nbsp;
                                          </i>
                                          <span style="font-weight:normal;color:#666;">修改专题</span>
                                        </label>
                                      </div>
                                    </li>
                                                                      </ul>
                                                                  <ul class="second">
                                    <li style="margin-right:10px;">
                                      <div class="cell">
                                        <label class="w120">
                                          <i class="checkbox-common">
                                          <input type="checkbox" name="permiss" dir="son" id="530" value="530" onclick="AllCheckBoxClick(event);">&nbsp;
                                          </i>
                                          <span style="font-weight:normal;color:#000;">站点帮助</span>
                                        </label>
                                      </div>
                                    </li>

                                    <li>
                                      <div class="cell">
                                        <label class="w120">
                                          <i class="checkbox-common left-10">
                                          <input type="checkbox" name="permiss" dir="sonson" id="442" value="442" onclick="AllCheckBoxClick(event);">&nbsp;
                                          </i>
                                          <span style="font-weight:normal;color:#666;">添加帮助类型</span>
                                        </label>
                                      </div>
                                    </li>

                                    <li>
                                      <div class="cell">
                                        <label class="w120">
                                          <i class="checkbox-common left-10">
                                          <input type="checkbox" name="permiss" dir="sonson" id="443" value="443" onclick="AllCheckBoxClick(event);">&nbsp;
                                          </i>
                                          <span style="font-weight:normal;color:#666;">修改帮助内容</span>
                                        </label>
                                      </div>
                                    </li>

                                    <li>
                                      <div class="cell">
                                        <label class="w120">
                                          <i class="checkbox-common left-10">
                                          <input type="checkbox" name="permiss" dir="sonson" id="444" value="444" onclick="AllCheckBoxClick(event);">&nbsp;
                                          </i>
                                          <span style="font-weight:normal;color:#666;">添加帮助内容</span>
                                        </label>
                                      </div>
                                    </li>

                                    <li>
                                      <div class="cell">
                                        <label class="w120">
                                          <i class="checkbox-common left-10">
                                          <input type="checkbox" name="permiss" dir="sonson" id="440" value="440" onclick="AllCheckBoxClick(event);">&nbsp;
                                          </i>
                                          <span style="font-weight:normal;color:#666;">帮助类型</span>
                                        </label>
                                      </div>
                                    </li>

                                    <li>
                                      <div class="cell">
                                        <label class="w120">
                                          <i class="checkbox-common left-10">
                                          <input type="checkbox" name="permiss" dir="sonson" id="441" value="441" onclick="AllCheckBoxClick(event);">&nbsp;
                                          </i>
                                          <span style="font-weight:normal;color:#666;">帮助内容</span>
                                        </label>
                                      </div>
                                    </li>
                                                                      </ul>
                                                                  <ul class="second">
                                    <li style="margin-right:10px;">
                                      <div class="cell">
                                        <label class="w120">
                                          <i class="checkbox-common">
                                          <input type="checkbox" name="permiss" dir="son" id="430" value="430" onclick="AllCheckBoxClick(event);">&nbsp;
                                          </i>
                                          <span style="font-weight:normal;color:#000;">友情链接</span>
                                        </label>
                                      </div>
                                    </li>

                                    <li>
                                      <div class="cell">
                                        <label class="w120">
                                          <i class="checkbox-common left-10">
                                          <input type="checkbox" name="permiss" dir="sonson" id="436" value="436" onclick="AllCheckBoxClick(event);">&nbsp;
                                          </i>
                                          <span style="font-weight:normal;color:#666;">添加友情链接</span>
                                        </label>
                                      </div>
                                    </li>

                                    <li>
                                      <div class="cell">
                                        <label class="w120">
                                          <i class="checkbox-common left-10">
                                          <input type="checkbox" name="permiss" dir="sonson" id="437" value="437" onclick="AllCheckBoxClick(event);">&nbsp;
                                          </i>
                                          <span style="font-weight:normal;color:#666;">编辑友情链接</span>
                                        </label>
                                      </div>
                                    </li>
                                                                      </ul>
                                                                </td>
                              </tr>
                                                            <tr class="tr-Current">
                                <td>
                                  <div>
                                    <label>
                                      <i class="checkbox-common">
                                      <input type="checkbox" name="permiss" dir="parent" id="1008" value="1008" onclick="AllCheckBoxClick(event);"></i>&nbsp;分销
                                    </label>
                                  </div>
                                </td>
                                <td>
                                                                  <ul class="second">
                                    <li style="margin-right:10px;">
                                      <div class="cell">
                                        <label class="w120">
                                          <i class="checkbox-common">
                                          <input type="checkbox" name="permiss" dir="son" id="1009" value="1009" onclick="AllCheckBoxClick(event);">&nbsp;
                                          </i>
                                          <span style="font-weight:normal;color:#000;">推广员管理</span>
                                        </label>
                                      </div>
                                    </li>

                                    <li>
                                      <div class="cell">
                                        <label class="w120">
                                          <i class="checkbox-common left-10">
                                          <input type="checkbox" name="permiss" dir="sonson" id="1010" value="1010" onclick="AllCheckBoxClick(event);">&nbsp;
                                          </i>
                                          <span style="font-weight:normal;color:#666;">修改推广员父级</span>
                                        </label>
                                      </div>
                                    </li>

                                    <li>
                                      <div class="cell">
                                        <label class="w120">
                                          <i class="checkbox-common left-10">
                                          <input type="checkbox" name="permiss" dir="sonson" id="1011" value="1011" onclick="AllCheckBoxClick(event);">&nbsp;
                                          </i>
                                          <span style="font-weight:normal;color:#666;">推广员</span>
                                        </label>
                                      </div>
                                    </li>

                                    <li>
                                      <div class="cell">
                                        <label class="w120">
                                          <i class="checkbox-common left-10">
                                          <input type="checkbox" name="permiss" dir="sonson" id="1012" value="1012" onclick="AllCheckBoxClick(event);">&nbsp;
                                          </i>
                                          <span style="font-weight:normal;color:#666;">待审核</span>
                                        </label>
                                      </div>
                                    </li>
                                                                      </ul>
                                                                  <ul class="second">
                                    <li style="margin-right:10px;">
                                      <div class="cell">
                                        <label class="w120">
                                          <i class="checkbox-common">
                                          <input type="checkbox" name="permiss" dir="son" id="1013" value="1013" onclick="AllCheckBoxClick(event);">&nbsp;
                                          </i>
                                          <span style="font-weight:normal;color:#000;">商品分销</span>
                                        </label>
                                      </div>
                                    </li>

                                    <li>
                                      <div class="cell">
                                        <label class="w120">
                                          <i class="checkbox-common left-10">
                                          <input type="checkbox" name="permiss" dir="sonson" id="1014" value="1014" onclick="AllCheckBoxClick(event);">&nbsp;
                                          </i>
                                          <span style="font-weight:normal;color:#666;">商品分销修改</span>
                                        </label>
                                      </div>
                                    </li>
                                                                      </ul>
                                                                  <ul class="second">
                                    <li style="margin-right:10px;">
                                      <div class="cell">
                                        <label class="w120">
                                          <i class="checkbox-common">
                                          <input type="checkbox" name="permiss" dir="son" id="1015" value="1015" onclick="AllCheckBoxClick(event);">&nbsp;
                                          </i>
                                          <span style="font-weight:normal;color:#000;">三级分销</span>
                                        </label>
                                      </div>
                                    </li>

                                    <li>
                                      <div class="cell">
                                        <label class="w120">
                                          <i class="checkbox-common left-10">
                                          <input type="checkbox" name="permiss" dir="sonson" id="1016" value="1016" onclick="AllCheckBoxClick(event);">&nbsp;
                                          </i>
                                          <span style="font-weight:normal;color:#666;">推广员等级修改</span>
                                        </label>
                                      </div>
                                    </li>

                                    <li>
                                      <div class="cell">
                                        <label class="w120">
                                          <i class="checkbox-common left-10">
                                          <input type="checkbox" name="permiss" dir="sonson" id="1017" value="1017" onclick="AllCheckBoxClick(event);">&nbsp;
                                          </i>
                                          <span style="font-weight:normal;color:#666;">基本设置</span>
                                        </label>
                                      </div>
                                    </li>

                                    <li>
                                      <div class="cell">
                                        <label class="w120">
                                          <i class="checkbox-common left-10">
                                          <input type="checkbox" name="permiss" dir="sonson" id="1018" value="1018" onclick="AllCheckBoxClick(event);">&nbsp;
                                          </i>
                                          <span style="font-weight:normal;color:#666;">推广员等级添加</span>
                                        </label>
                                      </div>
                                    </li>

                                    <li>
                                      <div class="cell">
                                        <label class="w120">
                                          <i class="checkbox-common left-10">
                                          <input type="checkbox" name="permiss" dir="sonson" id="1019" value="1019" onclick="AllCheckBoxClick(event);">&nbsp;
                                          </i>
                                          <span style="font-weight:normal;color:#666;">推广员等级</span>
                                        </label>
                                      </div>
                                    </li>
                                                                      </ul>
                                                                  <ul class="second">
                                    <li style="margin-right:10px;">
                                      <div class="cell">
                                        <label class="w120">
                                          <i class="checkbox-common">
                                          <input type="checkbox" name="permiss" dir="son" id="1020" value="1020" onclick="AllCheckBoxClick(event);">&nbsp;
                                          </i>
                                          <span style="font-weight:normal;color:#000;">区域代理</span>
                                        </label>
                                      </div>
                                    </li>

                                    <li>
                                      <div class="cell">
                                        <label class="w120">
                                          <i class="checkbox-common left-10">
                                          <input type="checkbox" name="permiss" dir="sonson" id="1036" value="1036" onclick="AllCheckBoxClick(event);">&nbsp;
                                          </i>
                                          <span style="font-weight:normal;color:#666;">人员管理</span>
                                        </label>
                                      </div>
                                    </li>

                                    <li>
                                      <div class="cell">
                                        <label class="w120">
                                          <i class="checkbox-common left-10">
                                          <input type="checkbox" name="permiss" dir="sonson" id="1021" value="1021" onclick="AllCheckBoxClick(event);">&nbsp;
                                          </i>
                                          <span style="font-weight:normal;color:#666;">区域代理配置</span>
                                        </label>
                                      </div>
                                    </li>

                                    <li>
                                      <div class="cell">
                                        <label class="w120">
                                          <i class="checkbox-common left-10">
                                          <input type="checkbox" name="permiss" dir="sonson" id="1022" value="1022" onclick="AllCheckBoxClick(event);">&nbsp;
                                          </i>
                                          <span style="font-weight:normal;color:#666;">用户管理</span>
                                        </label>
                                      </div>
                                    </li>
                                                                      </ul>
                                                                  <ul class="second">
                                    <li style="margin-right:10px;">
                                      <div class="cell">
                                        <label class="w120">
                                          <i class="checkbox-common">
                                          <input type="checkbox" name="permiss" dir="son" id="1023" value="1023" onclick="AllCheckBoxClick(event);">&nbsp;
                                          </i>
                                          <span style="font-weight:normal;color:#000;">股东分红</span>
                                        </label>
                                      </div>
                                    </li>

                                    <li>
                                      <div class="cell">
                                        <label class="w120">
                                          <i class="checkbox-common left-10">
                                          <input type="checkbox" name="permiss" dir="sonson" id="1025" value="1025" onclick="AllCheckBoxClick(event);">&nbsp;
                                          </i>
                                          <span style="font-weight:normal;color:#666;">基本设置</span>
                                        </label>
                                      </div>
                                    </li>

                                    <li>
                                      <div class="cell">
                                        <label class="w120">
                                          <i class="checkbox-common left-10">
                                          <input type="checkbox" name="permiss" dir="sonson" id="1027" value="1027" onclick="AllCheckBoxClick(event);">&nbsp;
                                          </i>
                                          <span style="font-weight:normal;color:#666;">股东等级</span>
                                        </label>
                                      </div>
                                    </li>

                                    <li>
                                      <div class="cell">
                                        <label class="w120">
                                          <i class="checkbox-common left-10">
                                          <input type="checkbox" name="permiss" dir="sonson" id="1028" value="1028" onclick="AllCheckBoxClick(event);">&nbsp;
                                          </i>
                                          <span style="font-weight:normal;color:#666;">人员管理</span>
                                        </label>
                                      </div>
                                    </li>
                                                                      </ul>
                                                                  <ul class="second">
                                    <li style="margin-right:10px;">
                                      <div class="cell">
                                        <label class="w120">
                                          <i class="checkbox-common">
                                          <input type="checkbox" name="permiss" dir="son" id="1029" value="1029" onclick="AllCheckBoxClick(event);">&nbsp;
                                          </i>
                                          <span style="font-weight:normal;color:#000;">全球分红</span>
                                        </label>
                                      </div>
                                    </li>

                                    <li>
                                      <div class="cell">
                                        <label class="w120">
                                          <i class="checkbox-common left-10">
                                          <input type="checkbox" name="permiss" dir="sonson" id="1030" value="1030" onclick="AllCheckBoxClick(event);">&nbsp;
                                          </i>
                                          <span style="font-weight:normal;color:#666;">基本设置</span>
                                        </label>
                                      </div>
                                    </li>

                                    <li>
                                      <div class="cell">
                                        <label class="w120">
                                          <i class="checkbox-common left-10">
                                          <input type="checkbox" name="permiss" dir="sonson" id="1031" value="1031" onclick="AllCheckBoxClick(event);">&nbsp;
                                          </i>
                                          <span style="font-weight:normal;color:#666;">分红设置</span>
                                        </label>
                                      </div>
                                    </li>

                                    <li>
                                      <div class="cell">
                                        <label class="w120">
                                          <i class="checkbox-common left-10">
                                          <input type="checkbox" name="permiss" dir="sonson" id="1033" value="1033" onclick="AllCheckBoxClick(event);">&nbsp;
                                          </i>
                                          <span style="font-weight:normal;color:#666;">分红设置</span>
                                        </label>
                                      </div>
                                    </li>

                                    <li>
                                      <div class="cell">
                                        <label class="w120">
                                          <i class="checkbox-common left-10">
                                          <input type="checkbox" name="permiss" dir="sonson" id="1034" value="1034" onclick="AllCheckBoxClick(event);">&nbsp;
                                          </i>
                                          <span style="font-weight:normal;color:#666;">发放分红</span>
                                        </label>
                                      </div>
                                    </li>

                                    <li>
                                      <div class="cell">
                                        <label class="w120">
                                          <i class="checkbox-common left-10">
                                          <input type="checkbox" name="permiss" dir="sonson" id="1035" value="1035" onclick="AllCheckBoxClick(event);">&nbsp;
                                          </i>
                                          <span style="font-weight:normal;color:#666;">发放记录</span>
                                        </label>
                                      </div>
                                    </li>
                                                                      </ul>
                                                                </td>
                              </tr>
                                                            <tr class="tr-Current">
                                <td>
                                  <div>
                                    <label>
                                      <i class="checkbox-common">
                                      <input type="checkbox" name="permiss" dir="parent" id="218" value="218" onclick="AllCheckBoxClick(event);"></i>&nbsp;设置
                                    </label>
                                  </div>
                                </td>
                                <td>
                                                                  <ul class="second">
                                    <li style="margin-right:10px;">
                                      <div class="cell">
                                        <label class="w120">
                                          <i class="checkbox-common">
                                          <input type="checkbox" name="permiss" dir="son" id="528" value="528" onclick="AllCheckBoxClick(event);">&nbsp;
                                          </i>
                                          <span style="font-weight:normal;color:#000;">基础设置</span>
                                        </label>
                                      </div>
                                    </li>

                                    <li>
                                      <div class="cell">
                                        <label class="w120">
                                          <i class="checkbox-common left-10">
                                          <input type="checkbox" name="permiss" dir="sonson" id="11059" value="11059" onclick="AllCheckBoxClick(event);">&nbsp;
                                          </i>
                                          <span style="font-weight:normal;color:#666;">商家服务</span>
                                        </label>
                                      </div>
                                    </li>

                                    <li>
                                      <div class="cell">
                                        <label class="w120">
                                          <i class="checkbox-common left-10">
                                          <input type="checkbox" name="permiss" dir="sonson" id="11074" value="11074" onclick="AllCheckBoxClick(event);">&nbsp;
                                          </i>
                                          <span style="font-weight:normal;color:#666;">通知记录</span>
                                        </label>
                                      </div>
                                    </li>

                                    <li>
                                      <div class="cell">
                                        <label class="w120">
                                          <i class="checkbox-common left-10">
                                          <input type="checkbox" name="permiss" dir="sonson" id="11051" value="11051" onclick="AllCheckBoxClick(event);">&nbsp;
                                          </i>
                                          <span style="font-weight:normal;color:#666;">运营</span>
                                        </label>
                                      </div>
                                    </li>

                                    <li>
                                      <div class="cell">
                                        <label class="w120">
                                          <i class="checkbox-common left-10">
                                          <input type="checkbox" name="permiss" dir="sonson" id="418" value="418" onclick="AllCheckBoxClick(event);">&nbsp;
                                          </i>
                                          <span style="font-weight:normal;color:#666;">网站设置</span>
                                        </label>
                                      </div>
                                    </li>

                                    <li>
                                      <div class="cell">
                                        <label class="w120">
                                          <i class="checkbox-common left-10">
                                          <input type="checkbox" name="permiss" dir="sonson" id="499" value="499" onclick="AllCheckBoxClick(event);">&nbsp;
                                          </i>
                                          <span style="font-weight:normal;color:#666;">seo设置</span>
                                        </label>
                                      </div>
                                    </li>

                                    <li>
                                      <div class="cell">
                                        <label class="w120">
                                          <i class="checkbox-common left-10">
                                          <input type="checkbox" name="permiss" dir="sonson" id="11017" value="11017" onclick="AllCheckBoxClick(event);">&nbsp;
                                          </i>
                                          <span style="font-weight:normal;color:#666;">版权</span>
                                        </label>
                                      </div>
                                    </li>

                                    <li>
                                      <div class="cell">
                                        <label class="w120">
                                          <i class="checkbox-common left-10">
                                          <input type="checkbox" name="permiss" dir="sonson" id="527" value="527" onclick="AllCheckBoxClick(event);">&nbsp;
                                          </i>
                                          <span style="font-weight:normal;color:#666;">注册与访问</span>
                                        </label>
                                      </div>
                                    </li>

                                    <li>
                                      <div class="cell">
                                        <label class="w120">
                                          <i class="checkbox-common left-10">
                                          <input type="checkbox" name="permiss" dir="sonson" id="11031" value="11031" onclick="AllCheckBoxClick(event);">&nbsp;
                                          </i>
                                          <span style="font-weight:normal;color:#666;">上传设置</span>
                                        </label>
                                      </div>
                                    </li>

                                    <li>
                                      <div class="cell">
                                        <label class="w120">
                                          <i class="checkbox-common left-10">
                                          <input type="checkbox" name="permiss" dir="sonson" id="11033" value="11033" onclick="AllCheckBoxClick(event);">&nbsp;
                                          </i>
                                          <span style="font-weight:normal;color:#666;">伪静态路由</span>
                                        </label>
                                      </div>
                                    </li>

                                    <li>
                                      <div class="cell">
                                        <label class="w120">
                                          <i class="checkbox-common left-10">
                                          <input type="checkbox" name="permiss" dir="sonson" id="456" value="456" onclick="AllCheckBoxClick(event);">&nbsp;
                                          </i>
                                          <span style="font-weight:normal;color:#666;">第三方登录</span>
                                        </label>
                                      </div>
                                    </li>

                                    <li>
                                      <div class="cell">
                                        <label class="w120">
                                          <i class="checkbox-common left-10">
                                          <input type="checkbox" name="permiss" dir="sonson" id="439" value="439" onclick="AllCheckBoxClick(event);">&nbsp;
                                          </i>
                                          <span style="font-weight:normal;color:#666;">通知系统</span>
                                        </label>
                                      </div>
                                    </li>

                                    <li>
                                      <div class="cell">
                                        <label class="w120">
                                          <i class="checkbox-common left-10">
                                          <input type="checkbox" name="permiss" dir="sonson" id="11019" value="11019" onclick="AllCheckBoxClick(event);">&nbsp;
                                          </i>
                                          <span style="font-weight:normal;color:#666;">客服</span>
                                        </label>
                                      </div>
                                    </li>
                                                                      </ul>
                                                                  <ul class="second">
                                    <li style="margin-right:10px;">
                                      <div class="cell">
                                        <label class="w120">
                                          <i class="checkbox-common">
                                          <input type="checkbox" name="permiss" dir="son" id="11050" value="11050" onclick="AllCheckBoxClick(event);">&nbsp;
                                          </i>
                                          <span style="font-weight:normal;color:#000;">交易设置</span>
                                        </label>
                                      </div>
                                    </li>

                                    <li>
                                      <div class="cell">
                                        <label class="w120">
                                          <i class="checkbox-common left-10">
                                          <input type="checkbox" name="permiss" dir="sonson" id="494" value="494" onclick="AllCheckBoxClick(event);">&nbsp;
                                          </i>
                                          <span style="font-weight:normal;color:#666;">购物设置</span>
                                        </label>
                                      </div>
                                    </li>

                                    <li>
                                      <div class="cell">
                                        <label class="w120">
                                          <i class="checkbox-common left-10">
                                          <input type="checkbox" name="permiss" dir="sonson" id="221" value="221" onclick="AllCheckBoxClick(event);">&nbsp;
                                          </i>
                                          <span style="font-weight:normal;color:#666;">支付配置</span>
                                        </label>
                                      </div>
                                    </li>

                                    <li>
                                      <div class="cell">
                                        <label class="w120">
                                          <i class="checkbox-common left-10">
                                          <input type="checkbox" name="permiss" dir="sonson" id="11072" value="11072" onclick="AllCheckBoxClick(event);">&nbsp;
                                          </i>
                                          <span style="font-weight:normal;color:#666;">银联卡支付</span>
                                        </label>
                                      </div>
                                    </li>

                                    <li>
                                      <div class="cell">
                                        <label class="w120">
                                          <i class="checkbox-common left-10">
                                          <input type="checkbox" name="permiss" dir="sonson" id="503" value="503" onclick="AllCheckBoxClick(event);">&nbsp;
                                          </i>
                                          <span style="font-weight:normal;color:#666;">会员提现设置</span>
                                        </label>
                                      </div>
                                    </li>

                                    <li>
                                      <div class="cell">
                                        <label class="w120">
                                          <i class="checkbox-common left-10">
                                          <input type="checkbox" name="permiss" dir="sonson" id="11056" value="11056" onclick="AllCheckBoxClick(event);">&nbsp;
                                          </i>
                                          <span style="font-weight:normal;color:#666;">转账配置</span>
                                        </label>
                                      </div>
                                    </li>
                                                                      </ul>
                                                                  <ul class="second">
                                    <li style="margin-right:10px;">
                                      <div class="cell">
                                        <label class="w120">
                                          <i class="checkbox-common">
                                          <input type="checkbox" name="permiss" dir="son" id="529" value="529" onclick="AllCheckBoxClick(event);">&nbsp;
                                          </i>
                                          <span style="font-weight:normal;color:#000;">配送管理</span>
                                        </label>
                                      </div>
                                    </li>

                                    <li>
                                      <div class="cell">
                                        <label class="w120">
                                          <i class="checkbox-common left-10">
                                          <input type="checkbox" name="permiss" dir="sonson" id="521" value="521" onclick="AllCheckBoxClick(event);">&nbsp;
                                          </i>
                                          <span style="font-weight:normal;color:#666;">添加自提点</span>
                                        </label>
                                      </div>
                                    </li>

                                    <li>
                                      <div class="cell">
                                        <label class="w120">
                                          <i class="checkbox-common left-10">
                                          <input type="checkbox" name="permiss" dir="sonson" id="522" value="522" onclick="AllCheckBoxClick(event);">&nbsp;
                                          </i>
                                          <span style="font-weight:normal;color:#666;">修改自提点</span>
                                        </label>
                                      </div>
                                    </li>

                                    <li>
                                      <div class="cell">
                                        <label class="w120">
                                          <i class="checkbox-common left-10">
                                          <input type="checkbox" name="permiss" dir="sonson" id="525" value="525" onclick="AllCheckBoxClick(event);">&nbsp;
                                          </i>
                                          <span style="font-weight:normal;color:#666;">运费模板列表</span>
                                        </label>
                                      </div>
                                    </li>

                                    <li>
                                      <div class="cell">
                                        <label class="w120">
                                          <i class="checkbox-common left-10">
                                          <input type="checkbox" name="permiss" dir="sonson" id="11075" value="11075" onclick="AllCheckBoxClick(event);">&nbsp;
                                          </i>
                                          <span style="font-weight:normal;color:#666;">配送费用</span>
                                        </label>
                                      </div>
                                    </li>

                                    <li>
                                      <div class="cell">
                                        <label class="w120">
                                          <i class="checkbox-common left-10">
                                          <input type="checkbox" name="permiss" dir="sonson" id="11076" value="11076" onclick="AllCheckBoxClick(event);">&nbsp;
                                          </i>
                                          <span style="font-weight:normal;color:#666;">配送人员</span>
                                        </label>
                                      </div>
                                    </li>

                                    <li>
                                      <div class="cell">
                                        <label class="w120">
                                          <i class="checkbox-common left-10">
                                          <input type="checkbox" name="permiss" dir="sonson" id="11077" value="11077" onclick="AllCheckBoxClick(event);">&nbsp;
                                          </i>
                                          <span style="font-weight:normal;color:#666;">配送地区</span>
                                        </label>
                                      </div>
                                    </li>

                                    <li>
                                      <div class="cell">
                                        <label class="w120">
                                          <i class="checkbox-common left-10">
                                          <input type="checkbox" name="permiss" dir="sonson" id="11087" value="11087" onclick="AllCheckBoxClick(event);">&nbsp;
                                          </i>
                                          <span style="font-weight:normal;color:#666;">门店管理</span>
                                        </label>
                                      </div>
                                    </li>

                                    <li>
                                      <div class="cell">
                                        <label class="w120">
                                          <i class="checkbox-common left-10">
                                          <input type="checkbox" name="permiss" dir="sonson" id="487" value="487" onclick="AllCheckBoxClick(event);">&nbsp;
                                          </i>
                                          <span style="font-weight:normal;color:#666;">模板编辑</span>
                                        </label>
                                      </div>
                                    </li>

                                    <li>
                                      <div class="cell">
                                        <label class="w120">
                                          <i class="checkbox-common left-10">
                                          <input type="checkbox" name="permiss" dir="sonson" id="191" value="191" onclick="AllCheckBoxClick(event);">&nbsp;
                                          </i>
                                          <span style="font-weight:normal;color:#666;">添加物流公司</span>
                                        </label>
                                      </div>
                                    </li>

                                    <li>
                                      <div class="cell">
                                        <label class="w120">
                                          <i class="checkbox-common left-10">
                                          <input type="checkbox" name="permiss" dir="sonson" id="472" value="472" onclick="AllCheckBoxClick(event);">&nbsp;
                                          </i>
                                          <span style="font-weight:normal;color:#666;">添加或修改</span>
                                        </label>
                                      </div>
                                    </li>

                                    <li>
                                      <div class="cell">
                                        <label class="w120">
                                          <i class="checkbox-common left-10">
                                          <input type="checkbox" name="permiss" dir="sonson" id="526" value="526" onclick="AllCheckBoxClick(event);">&nbsp;
                                          </i>
                                          <span style="font-weight:normal;color:#666;">编辑运费模板</span>
                                        </label>
                                      </div>
                                    </li>

                                    <li>
                                      <div class="cell">
                                        <label class="w120">
                                          <i class="checkbox-common left-10">
                                          <input type="checkbox" name="permiss" dir="sonson" id="192" value="192" onclick="AllCheckBoxClick(event);">&nbsp;
                                          </i>
                                          <span style="font-weight:normal;color:#666;">物流公司修改</span>
                                        </label>
                                      </div>
                                    </li>

                                    <li>
                                      <div class="cell">
                                        <label class="w120">
                                          <i class="checkbox-common left-10">
                                          <input type="checkbox" name="permiss" dir="sonson" id="11016" value="11016" onclick="AllCheckBoxClick(event);">&nbsp;
                                          </i>
                                          <span style="font-weight:normal;color:#666;">自提点运费</span>
                                        </label>
                                      </div>
                                    </li>

                                    <li>
                                      <div class="cell">
                                        <label class="w120">
                                          <i class="checkbox-common left-10">
                                          <input type="checkbox" name="permiss" dir="sonson" id="11080" value="11080" onclick="AllCheckBoxClick(event);">&nbsp;
                                          </i>
                                          <span style="font-weight:normal;color:#666;">本地配送地区管理</span>
                                        </label>
                                      </div>
                                    </li>

                                    <li>
                                      <div class="cell">
                                        <label class="w120">
                                          <i class="checkbox-common left-10">
                                          <input type="checkbox" name="permiss" dir="sonson" id="519" value="519" onclick="AllCheckBoxClick(event);">&nbsp;
                                          </i>
                                          <span style="font-weight:normal;color:#666;">货到付款地区管理</span>
                                        </label>
                                      </div>
                                    </li>

                                    <li>
                                      <div class="cell">
                                        <label class="w120">
                                          <i class="checkbox-common left-10">
                                          <input type="checkbox" name="permiss" dir="sonson" id="486" value="486" onclick="AllCheckBoxClick(event);">&nbsp;
                                          </i>
                                          <span style="font-weight:normal;color:#666;">地区管理</span>
                                        </label>
                                      </div>
                                    </li>

                                    <li>
                                      <div class="cell">
                                        <label class="w120">
                                          <i class="checkbox-common left-10">
                                          <input type="checkbox" name="permiss" dir="sonson" id="189" value="189" onclick="AllCheckBoxClick(event);">&nbsp;
                                          </i>
                                          <span style="font-weight:normal;color:#666;">物流公司</span>
                                        </label>
                                      </div>
                                    </li>

                                    <li>
                                      <div class="cell">
                                        <label class="w120">
                                          <i class="checkbox-common left-10">
                                          <input type="checkbox" name="permiss" dir="sonson" id="471" value="471" onclick="AllCheckBoxClick(event);">&nbsp;
                                          </i>
                                          <span style="font-weight:normal;color:#666;">商家地址</span>
                                        </label>
                                      </div>
                                    </li>

                                    <li>
                                      <div class="cell">
                                        <label class="w120">
                                          <i class="checkbox-common left-10">
                                          <input type="checkbox" name="permiss" dir="sonson" id="520" value="520" onclick="AllCheckBoxClick(event);">&nbsp;
                                          </i>
                                          <span style="font-weight:normal;color:#666;">自提点管理</span>
                                        </label>
                                      </div>
                                    </li>

                                    <li>
                                      <div class="cell">
                                        <label class="w120">
                                          <i class="checkbox-common left-10">
                                          <input type="checkbox" name="permiss" dir="sonson" id="523" value="523" onclick="AllCheckBoxClick(event);">&nbsp;
                                          </i>
                                          <span style="font-weight:normal;color:#666;">物流跟踪设置</span>
                                        </label>
                                      </div>
                                    </li>
                                                                      </ul>
                                                                  <ul class="second">
                                    <li style="margin-right:10px;">
                                      <div class="cell">
                                        <label class="w120">
                                          <i class="checkbox-common">
                                          <input type="checkbox" name="permiss" dir="son" id="11026" value="11026" onclick="AllCheckBoxClick(event);">&nbsp;
                                          </i>
                                          <span style="font-weight:normal;color:#000;">数据库管理</span>
                                        </label>
                                      </div>
                                    </li>

                                    <li>
                                      <div class="cell">
                                        <label class="w120">
                                          <i class="checkbox-common left-10">
                                          <input type="checkbox" name="permiss" dir="sonson" id="11027" value="11027" onclick="AllCheckBoxClick(event);">&nbsp;
                                          </i>
                                          <span style="font-weight:normal;color:#666;">数据库恢复</span>
                                        </label>
                                      </div>
                                    </li>

                                    <li>
                                      <div class="cell">
                                        <label class="w120">
                                          <i class="checkbox-common left-10">
                                          <input type="checkbox" name="permiss" dir="sonson" id="11028" value="11028" onclick="AllCheckBoxClick(event);">&nbsp;
                                          </i>
                                          <span style="font-weight:normal;color:#666;">SQL执行与导入</span>
                                        </label>
                                      </div>
                                    </li>
                                                                      </ul>
                                                                  <ul class="second">
                                    <li style="margin-right:10px;">
                                      <div class="cell">
                                        <label class="w120">
                                          <i class="checkbox-common">
                                          <input type="checkbox" name="permiss" dir="son" id="126" value="126" onclick="AllCheckBoxClick(event);">&nbsp;
                                          </i>
                                          <span style="font-weight:normal;color:#000;">管理员列表</span>
                                        </label>
                                      </div>
                                    </li>

                                    <li>
                                      <div class="cell">
                                        <label class="w120">
                                          <i class="checkbox-common left-10">
                                          <input type="checkbox" name="permiss" dir="sonson" id="127" value="127" onclick="AllCheckBoxClick(event);">&nbsp;
                                          </i>
                                          <span style="font-weight:normal;color:#666;">用户列表</span>
                                        </label>
                                      </div>
                                    </li>

                                    <li>
                                      <div class="cell">
                                        <label class="w120">
                                          <i class="checkbox-common left-10">
                                          <input type="checkbox" name="permiss" dir="sonson" id="128" value="128" onclick="AllCheckBoxClick(event);">&nbsp;
                                          </i>
                                          <span style="font-weight:normal;color:#666;">权限组</span>
                                        </label>
                                      </div>
                                    </li>

                                    <li>
                                      <div class="cell">
                                        <label class="w120">
                                          <i class="checkbox-common left-10">
                                          <input type="checkbox" name="permiss" dir="sonson" id="11078" value="11078" onclick="AllCheckBoxClick(event);">&nbsp;
                                          </i>
                                          <span style="font-weight:normal;color:#666;">操作日志</span>
                                        </label>
                                      </div>
                                    </li>

                                    <li>
                                      <div class="cell">
                                        <label class="w120">
                                          <i class="checkbox-common left-10">
                                          <input type="checkbox" name="permiss" dir="sonson" id="11055" value="11055" onclick="AllCheckBoxClick(event);">&nbsp;
                                          </i>
                                          <span style="font-weight:normal;color:#666;">用户操作日志</span>
                                        </label>
                                      </div>
                                    </li>
                                                                      </ul>
                                                                  <ul class="second">
                                    <li style="margin-right:10px;">
                                      <div class="cell">
                                        <label class="w120">
                                          <i class="checkbox-common">
                                          <input type="checkbox" name="permiss" dir="son" id="11094" value="11094" onclick="AllCheckBoxClick(event);">&nbsp;
                                          </i>
                                          <span style="font-weight:normal;color:#000;">核销设置</span>
                                        </label>
                                      </div>
                                    </li>

                                    <li>
                                      <div class="cell">
                                        <label class="w120">
                                          <i class="checkbox-common left-10">
                                          <input type="checkbox" name="permiss" dir="sonson" id="11095" value="11095" onclick="AllCheckBoxClick(event);">&nbsp;
                                          </i>
                                          <span style="font-weight:normal;color:#666;">核销人员</span>
                                        </label>
                                      </div>
                                    </li>

                                    <li>
                                      <div class="cell">
                                        <label class="w120">
                                          <i class="checkbox-common left-10">
                                          <input type="checkbox" name="permiss" dir="sonson" id="11096" value="11096" onclick="AllCheckBoxClick(event);">&nbsp;
                                          </i>
                                          <span style="font-weight:normal;color:#666;">核销记录</span>
                                        </label>
                                      </div>
                                    </li>
                                                                      </ul>
                                                                </td>
                              </tr>
                                                            <tr class="tr-Current">
                                <td>
                                  <div>
                                    <label>
                                      <i class="checkbox-common">
                                      <input type="checkbox" name="permiss" dir="parent" id="120" value="120" onclick="AllCheckBoxClick(event);"></i>&nbsp;系统
                                    </label>
                                  </div>
                                </td>
                                <td>
                                                                  <ul class="second">
                                    <li style="margin-right:10px;">
                                      <div class="cell">
                                        <label class="w120">
                                          <i class="checkbox-common">
                                          <input type="checkbox" name="permiss" dir="son" id="524" value="524" onclick="AllCheckBoxClick(event);">&nbsp;
                                          </i>
                                          <span style="font-weight:normal;color:#000;">在线更新</span>
                                        </label>
                                      </div>
                                    </li>

                                    <li>
                                      <div class="cell">
                                        <label class="w120">
                                          <i class="checkbox-common left-10">
                                          <input type="checkbox" name="permiss" dir="sonson" id="11032" value="11032" onclick="AllCheckBoxClick(event);">&nbsp;
                                          </i>
                                          <span style="font-weight:normal;color:#666;">系统更新</span>
                                        </label>
                                      </div>
                                    </li>
                                                                      </ul>
                                                                  <ul class="second">
                                    <li style="margin-right:10px;">
                                      <div class="cell">
                                        <label class="w120">
                                          <i class="checkbox-common">
                                          <input type="checkbox" name="permiss" dir="son" id="10010" value="10010" onclick="AllCheckBoxClick(event);">&nbsp;
                                          </i>
                                          <span style="font-weight:normal;color:#000;">授权信息</span>
                                        </label>
                                      </div>
                                    </li>
                                                                      </ul>
                                                                  <ul class="second">
                                    <li style="margin-right:10px;">
                                      <div class="cell">
                                        <label class="w120">
                                          <i class="checkbox-common">
                                          <input type="checkbox" name="permiss" dir="son" id="11009" value="11009" onclick="AllCheckBoxClick(event);">&nbsp;
                                          </i>
                                          <span style="font-weight:normal;color:#000;">插件管理</span>
                                        </label>
                                      </div>
                                    </li>
                                                                      </ul>
                                                                  <ul class="second">
                                    <li style="margin-right:10px;">
                                      <div class="cell">
                                        <label class="w120">
                                          <i class="checkbox-common">
                                          <input type="checkbox" name="permiss" dir="son" id="11010" value="11010" onclick="AllCheckBoxClick(event);">&nbsp;
                                          </i>
                                          <span style="font-weight:normal;color:#000;">钩子管理</span>
                                        </label>
                                      </div>
                                    </li>

                                    <li>
                                      <div class="cell">
                                        <label class="w120">
                                          <i class="checkbox-common left-10">
                                          <input type="checkbox" name="permiss" dir="sonson" id="11012" value="11012" onclick="AllCheckBoxClick(event);">&nbsp;
                                          </i>
                                          <span style="font-weight:normal;color:#666;">添加钩子</span>
                                        </label>
                                      </div>
                                    </li>

                                    <li>
                                      <div class="cell">
                                        <label class="w120">
                                          <i class="checkbox-common left-10">
                                          <input type="checkbox" name="permiss" dir="sonson" id="11013" value="11013" onclick="AllCheckBoxClick(event);">&nbsp;
                                          </i>
                                          <span style="font-weight:normal;color:#666;">修改钩子</span>
                                        </label>
                                      </div>
                                    </li>
                                                                      </ul>
                                                                </td>
                              </tr>
                                                          </tbody>
                          </table>
                        </div>
                      </div>
                    </div>
                  </li>
                </ul>
              </div>
              <div class="float-l">
                <span class="prompt"></span>
              </div>
            </li>
          </ul>
        </div>
      </div>
      <button type="submit" id="EditSubmit" style="display: none" class="submit01">保存</button>
      <input type="hidden" id="currentRoleID" name="EditRoleID">
      <input type="hidden" name="EditsendCheckDatas" id="EditsendCheckDatas">
    </div>
  </div>
      </div>
      <div class="modal-footer">
        <button type="button" class="btn-common btn-big" onclick="Editbtn()">保存</button>
        <button type="button" class="btn-common-cancle btn-big" data-dismiss="modal" onclick="btnCancel()">关闭</button>
      </div>
    </div>
  </div>
  </div>
  -->

<template>
  <div>
    <el-row :gutter="8">
      <el-col :span="12">
        <el-button type="primary" size="small" >添加用户组</el-button>
      </el-col>

    </el-row>

    <br>

    <el-table :data="tableData" border style="width: 100%">
      <el-table-column
        prop="name"
        label="用户组" />

      <el-table-column
        label="是否是管理员组"
        width="120">
        <template slot-scope="scope">
          {{ scope.row.isAdmin?'是':'否' }}
        </template>
      </el-table-column>

      <el-table-column
        label="操作"
        fixed="right"
        width="380">
        <!-- 管理员用户不可进行操作 -->
        <template slot-scope="scope">
          <el-button v-show="scope.row.isAdmin" size="mini" @click="handleEdit(scope.$index, scope.row)">修改</el-button>
          <el-button v-show="scope.row.isAdmin" size="mini" @click="handleEdit(scope.$index, scope.row)">删除</el-button>
        </template>
      </el-table-column>
    </el-table>
  </div>
</template>

<script>

export default {
  name: 'Group',
  data () {
    return {
      tableData: [{
        name: '管理员组',
        isAdmin: true
      }, {
        name: '客服组',
        isAdmin: false
      }, {
        name: '美工-店铺装修',
        isAdmin: false
      }]
    }
  },
  methods: {
    handleEdit (index, row) {
      console.log(index, row)
    },
    handleDelete (index, row) {
      console.log(index, row)
    }
  }
}
</script>

<style lang="scss" scoped>

</style>
