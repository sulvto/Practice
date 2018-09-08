<template>
  <section class="ns-base-section">

    <div style="position:relative;margin:0;">
      <!-- 面包屑导航 -->
      <div class="breadcrumb-nav">
        <a href="index.html">大鵬系統</a>
        <i class="fa fa-angle-right"></i>
        <a href="/promotion/coupontypelist.html">营销</a>
        <i class="fa fa-angle-right"></i>
        <!-- 需要加跳转链接用这个：http://showfx.niuteam.cn/admin/promotion/combopackagepromotionedit -->
        <a href="javascript:;" style="color:#999;">编辑组合套餐</a>
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
                  <h4>功能提示</h4>
                  <p class="function-prompts">
                  </p>
                  <p>只有实物商品才能参与组合套餐活动！</p>
                  <p>商品原价与节省价仅作为参考，不参与实际计算！</p>
                  <p>商品价格取得是商品sku价格中的最低价格！参与套餐售卖的的商品sku价格不要相差太大。</p>
                  <p style="color: red;margin:0;">注：在组合商品发布之后，切勿修改商品价格。</p>
                  <p></p>
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
          <dt>组合套餐名称：</dt>
          <dd><input type="text" id="combo_package_name" class="input-common" maxlength="90" value="hjkhkhjk">
            <p class="error" style="display: none;">请输入组合套餐名称</p>
          </dd>
        </dl>
        <dl>
          <dt>组合套餐价格：</dt>
          <dd><input type="number" id="combo_package_price" class="input-common harf" value="1053.00"><em class="unit">元</em>
            <p class="error" style="display: none;">请输入组合套餐价格</p>
          </dd>
        </dl>
        <dl>
          <dt>原价：</dt>
          <dd><span id="original_price">1053.00</span>元</dd>
        </dl>
        <dl>
          <dt>节省价：</dt>
          <dd><span id="save_the_price">0.00</span>元</dd>
        </dl>
        <dl>
          <dt>是否上架：</dt>
          <dd>
            <input id="is_shelves" type="checkbox" class="checkbox" checked="" simpleswitch="0" result="true" style="display: none;">
            <div class="Switch Switch_FlatRadius On" id="Switch0"><span class="switch-open">是</span><span class="switch-close">否</span></div>
            <i class="radio-common selected">
              <input type="radio" name="status" class="input-common" checked="checked" id="shelves_up" value="1"/>
            </i>
        <label class="label-inline-block" for="shelves_up" >上架</label>
        <i class="radio-common">
          <input type="radio" name="status" class="input-common" id="shelver_down" value="0"  />
        </i>
        <label class="label-inline-block" for="shelver_down">下架</label>

          </dd>
        </dl>
        <!-- 所有决定商品弹框内容的条件和存放商品id的隐藏域 -->
        <span id="goods-condition">
      <input type="hidden" name="type" value="2">
      <input type="hidden" name="stock" value="1">
      <input type="hidden" name="goods_type" value="1">
      <input type="hidden" name="is_have_sku" value="1">
      <input type="hidden" name="state" value="1">
      <input type="hidden" id="goods_id_array" value="3,4,5">
      <input type="hidden" id="range_type" value="0">
      <input type="hidden" id="is_show_select" value="0">
      <input type="hidden" id="action" value="package">
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
            <button class="btn-common" onclick="open_Goods_Select_List()">选择商品</button><span class="select-tip">组合套餐商品不能少于两种不能多于六种</span>
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
                  <th id="action-th"></th>
                  <th>操作</th>
                </tr>
              </thead>
              <tbody>
                <tr>
                  <td style="text-align:left;">定制韩版宽松蝙蝠袖中长款套头卫衣胸前系带连衣裙</td>
                  <td class="goods_price">485.00</td>
                  <td>999</td>
                  <td></td>
                  <td><label for=""><i class="fa fa-times" aria-hidden="true fa-2x" onclick="cancelSelect(5,this)"></i></label></td>
                </tr>
                <tr>
                  <td style="text-align:left;">2017夏装新款名媛修身性感一字肩绣花时尚喇叭袖连衣裙短袖包臀裙</td>
                  <td class="goods_price">399.00</td>
                  <td>1000</td>
                  <td></td>
                  <td><label for=""><i class="fa fa-times" aria-hidden="true fa-2x" onclick="cancelSelect(4,this)"></i></label></td>
                </tr>
                <tr>
                  <td style="text-align:left;">上衣女夏2017新款枣红色韩版灯笼袖压褶方领宽松半袖百搭雪纺衫</td>
                  <td class="goods_price">169.00</td>
                  <td>74999</td>
                  <td></td>
                  <td><label for=""><i class="fa fa-times" aria-hidden="true fa-2x" onclick="cancelSelect(3,this)"></i></label></td>
                </tr>
              </tbody>
            </table>
          </dd>
        </dl>

        <dl>
          <dt></dt>
          <dd>
            <button class="btn-common btn-big" onclick="save();">保存</button>
            <button class="btn-common btn-big" onclick="click_reset();">重置</button>
          </dd>
        </dl>
      </div>
    </div>
  </section>
</template>
