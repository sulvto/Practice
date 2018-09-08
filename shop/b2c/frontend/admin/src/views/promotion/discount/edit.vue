<template>
    <section class="ns-base-section">

    <div style="position:relative;margin:0;">
      <!-- 面包屑导航 -->
            <div class="breadcrumb-nav">
        <a href="index.html">黑马商城</a>
                  <i class="fa fa-angle-right"></i>
          <a href="/promotion/coupontypelist.html">营销</a>
                  <i class="fa fa-angle-right"></i>
          <!-- 需要加跳转链接用这个：http://showfx.niuteam.cn/admin/promotion/updatediscount -->
          <a href="javascript:;" style="color:#999;">修改限时折扣</a>
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
                  <p>修改限时折扣</p>
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
    <dt>活动名称：</dt>
    <dd><input type="text" id="discount_name" maxlength="10" value="222222" class="input-common"><p class="error" style="display: none;">请输入活动名称</p></dd>

  </dl>
  <dl>
    <dt>活动有效期：</dt>
    <dd>
      <input class="input-medium input-common harf" type="text" id="start_time" value="2018-07-17 18:14:06" style="width:250px;" onclick="WdatePicker({skin:'twoer',dateFmt:'yyyy-MM-dd HH:mm:ss'})">
      <span class="mlr5">-</span>
      <input class="input-medium input-common harf" size="15" type="text" id="end_time" value="2018-08-31 18:14:09" style="width:250px;" onclick="WdatePicker({skin:'twoer',dateFmt:'yyyy-MM-dd HH:mm:ss'})">
      <p class="error" style="display: none;">请输入活动有效期</p>
      <p class="error" style="display: none;">活动结束时间不能小于当前时间</p>
      <p class="error" style="display: none;">活动结束时间不能小于开始时间</p>
    </dd>
  </dl>
  <dl>
    <dt>价格保留方式：</dt>
    <dd>
      <label class="radio inline normal decimal_reservation_number">
        <i class="checkbox-common selected">
          <input type="checkbox" name="decimal-reservation-number" value="0" checked="">
        </i>
        <span>抹去角和分</span>
      </label>
      <label class="radio inline normal decimal_reservation_number">
        <i class="checkbox-common  ">
          <input type="checkbox" name="decimal-reservation-number" value="1">
        </i>
        <span>抹去分</span>
      </label>
    </dd>
  </dl>
  <!-- 所有决定商品弹框内容的条件和存放商品id的隐藏域 -->
  <span id="goods-condition">
    <input type="hidden" name="type" value="2">
    <input type="hidden" name="stock" value="1">
    <input type="hidden" name="goods_type" value="1,2">
    <input type="hidden" name="is_have_sku" value="1">
    <input type="hidden" name="state" value="1">
    <input type="hidden" id="goods_id_array" value="62">
    <input type="hidden" id="range_type" value="0">
    <input type="hidden" id="is_show_select" value="0">
    <input type="hidden" id="action" value="discount">
    <input type="hidden" id="selected_data" value="{&quot;62&quot;:&quot;9.99&quot;}">
  </span>

  <!-- 切换全部与部分 -->
  <dl style="display:none;" id="select-box">
  <dt>参与商品：</dt>
  <dd>
    <div class="total" id="is_all">
      <label for="navigationtype1" class="in">
        <i class="radio-common">
          <input type="radio" value="1" name="range_type" checked="checked" id="navigationtype1">
        </i>
        <span>全部</span>
      </label>
      <label for="navigationtype2" class="out">
        <i class="radio-common selected">
          <input type="radio" value="0" name="range_type" id="navigationtype2">
        </i>
        <span>部分</span>
      </label>
    </div>
  </dd>
  </dl>
  <!-- 弹框按钮 -->
  <dl class="js-select-goods" style="">
  <dt>选择商品：</dt>
  <dd>
    <button class="btn-common" onclick="open_Goods_Select_List()">选择商品</button><span class="select-tip"></span>
    <p class="error" style="display: none;"></p>
  </dd>
  </dl>
  <!-- 已选择商品的列表 -->
  <dl>
  <dd class="goods-list" style="width: 100%; margin-left: 0px;">
    <table class="table-class">
      <colgroup>
        <col width="40%">
        <col width="20%">
        <col width="10%">
        <col width="15%">
        <col width="10%">
      </colgroup>
      <thead>
        <tr>
          <th>商品名称</th>
          <th>价格</th>
          <th>库存</th>
          <th id="action-th">折扣</th>
          <th>操作</th>
        </tr>
      </thead>
      <tbody><tr><td style="text-align:left;">test123澳大利亚丁戈树红标经典红葡萄酒750ml</td><td class="goods_price">0.00</td><td>0</td><td><input type="number" name="discount" class="input-common short" onchange="discount(this);" goodsid="62" value="9.99"><em class="unit">折</em></td><td><label for=""><i class="fa fa-times" aria-hidden="true fa-2x" onclick="cancelSelect(62,this)"></i></label></td></tr></tbody>
    </table>
  </dd>
  </dl>

  <dl>
    <dt></dt>
    <dd>
      <button class="btn-common btn-big" onclick="updateDiscount();">保存</button>
      <button class="btn-common-cancle btn-big" onclick="javascript:history.back(-1);">返回</button>
    </dd>
  </dl>
  </div>
  <input type="hidden" id="discount_id" value="1">

    </div>
  </section>
</template>
