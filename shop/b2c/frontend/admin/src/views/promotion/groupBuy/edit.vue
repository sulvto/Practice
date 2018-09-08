<template>

  <section class="ns-base-section">

    <div style="position:relative;margin:0;">
      <!-- 面包屑导航 -->
            <div class="breadcrumb-nav">
        <a href="index.html">大鵬系統</a>
                  <i class="fa fa-angle-right"></i>
          <a href="/promotion/coupontypelist.html">营销</a>
                  <i class="fa fa-angle-right"></i>
          <!-- 需要加跳转链接用这个：http://showfx.niuteam.cn/admin/Promotion/updateGroupBuy -->
          <a href="javascript:;" style="color:#999;">修改团购活动</a>
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
                  <p>修改团购活动</p>
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
        <dt><span style="color:red;">*</span>&nbsp;&nbsp;活动名称：</dt>
        <dd>
          <input type="text" id="group_name" class="input-common" value="1">
          <p class="error" style="display: none;">请输入活动名称</p>
        </dd>
      </dl>
      <dl>
        <dt>
          <span style="color:red;">*</span>
          &nbsp;&nbsp;活动时间：
        </dt>
        <dd>
          <input class="input-medium input-common harf" type="text" id="start_time" style="width:250px;" onclick="WdatePicker({skin:'twoer',dateFmt:'yyyy-MM-dd HH:mm:ss'})" value="2018-07-02 10:46:53" placeholder="请选择开始时间">
          <span class="mlr5">-</span>
          <input class="input-medium input-common harf" size="15" type="text" id="end_time" style="width:250px;" onclick="WdatePicker({skin:'twoer',dateFmt:'yyyy-MM-dd HH:mm:ss'})" value="2018-07-27 10:46:50" placeholder="请选择结束时间">
          <p class="error" style="display: none;">请输入有效时间</p>
        </dd>
      </dl>
      <dl>
        <dt><span style="color:red;">*</span>&nbsp;&nbsp;最大购买量：</dt>
        <dd>
          <input class="input-mini w70 input-common harf" onkeyup="value=value.replace(/\D/g,'')" type="number" id="max_num" value="111">
          <em class="unit">件</em>
          <p class="error" style="display: none;">请输入最大购买量</p>
        </dd>
      </dl>
      <dl>
        <dt>
          <span style="color:red;">*</span>
          &nbsp;&nbsp;最小购买量：
        </dt>
        <dd>
          <input class="input-mini w70 input-common" onkeyup="value=value.replace(/\D/g,'')" type="text" id="min_num" value="1">
          <span class="help-inline">个</span>
          <p class="error">请输入最小购买量</p>
        </dd>
      </dl>
        <dl>
        <dt><span style="color:red;">*</span>&nbsp;&nbsp;价格阶梯：</dt>
        <dd>
          <span class="help-inline">最小购买</span> <input class="input-common harf" onkeyup="value=value.replace(/[^\d+(\.\d+)?]/g,'')" type="text" data="num" value="1"><em class="unit top">件</em><br>
          <span class="help-inline">购买价格</span> <input class="input-common harf" onkeyup="this.value=this.value.replace(/\D/gi,&quot;&quot;)" type="text" data="price" value="150.00"><em class="unit top">元</em>
          <p class="error" style="display: none;"></p>
        </dd>
      </dl>
        <dl>
        <dt>活动说明：</dt>
        <dd>
          <textarea name="store_zy" rows="2" id="remark" class="textarea-common">dd</textarea>
          <p class="error" style="display: none;">请输入活动说明</p>
        </dd>
      </dl>
      <!-- 所有决定商品弹框内容的条件和存放商品id的隐藏域 -->
      <span id="goods-condition">
        <input type="hidden" name="type" value="1">
        <input type="hidden" name="stock" value="1">
        <input type="hidden" name="goods_type" value="1,2">
        <input type="hidden" name="is_have_sku" value="1">
        <input type="hidden" name="state" value="1">
        <input type="hidden" id="goods_id_array" value="9">
        <input type="hidden" id="range_type" value="0">
        <input type="hidden" id="is_show_select" value="0">
        <input type="hidden" id="action" value="">
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
              <th id="action-th"></th>
              <th>操作</th>
            </tr>
          </thead>
          <tbody><tr><td style="text-align:left;">DOMO男士高端衬衣潮男雅痞英伦风大尖领湖蓝红色波点衬衣个性达人</td><td class="goods_price">986.00</td><td>1110</td><td></td><td><label for=""><i class="fa fa-times" aria-hidden="true fa-2x" onclick="cancelSelect(9,this)"></i></label></td></tr></tbody>
        </table>
      </dd>
      </dl>

      <dl>
        <dt></dt>
        <dd>
          <button class="btn-common btn-big" onclick="updateGroupBuy();">保存</button>
          <button class="btn-common-cancle btn-big" onclick="javascript:history.back(-1);">返回</button>
        </dd>
      </dl>
      </div>
  <input type="hidden" id="group_id" value="1">
    </div>

  </section>
</template>
