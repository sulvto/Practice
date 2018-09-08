<template>

  <section class="ns-base-section" style="">

    <div style="position:relative;margin:0;">
      <!-- 面包屑导航 -->
            <div class="breadcrumb-nav">
        <a href="index.html">大鵬系統</a>
                  <i class="fa fa-angle-right"></i>
          <a href="/promotion/coupontypelist.html">营销</a>
                  <i class="fa fa-angle-right"></i>
          <!-- 需要加跳转链接用这个：http://showfx.niuteam.cn/admin/promotion/updatetopic -->
          <a href="javascript:;" style="color:#999;">修改专题活动</a>
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
                  <p class="function-prompts"></p>
                </div>
              </div>
            </div>
          </li>
        </ul>
      </div>
    </div>

    <div class="ns-main" style="">

  <div class="space-10"></div>
  <div class="set-style" style="">
  <h4>专题活动信息</h4>
  <dl>
    <dt><span style="color:red;">*</span>&nbsp;&nbsp;专题名称：</dt>
    <dd><input type="text" id="topic_name" value="@A" class="input-common long"><p class="error" style="display: none;">请输入专题名称</p></dd>

  </dl>
  <dl>
    <dt>关键字：</dt>
    <dd>
      <input type="text" id="keyword" maxlength="500" class="input-common" value="11">
      <p class="error" style="display: none;">请输入关键字</p>
    </dd>
  </dl>
  <dl>
    <dt>描述：</dt>
    <dd>
      <!-- <input type="text" id="desc" maxlength="500" class="input-common" value=""/> -->
      <textarea name="store_zy" rows="2" id="desc" class="textarea-common">upload/ueditor/image/20180810/1533881615274606.jpg</textarea>
      <p class="error" style="display: none;">请输入专题描述</p>
    </dd>
  </dl>
  <dl>
    <dt><span style="color:red;">*</span>&nbsp;&nbsp;图像：</dt>
    <dd>
        <div class="upload-btn-common">
          <div>
            <input class="input-file" name="file_upload" id="uploadpicture" type="file" onchange="imgUpload(this);" title="上传">
            <input type="hidden" id="picture_img" value="upload/common/1533095180.jpg">
          </div>

          <input type="text" id="text_picture_img" class="input-common" readonly="readonly" value="upload/common/1533095180.jpg">
          <em>上传</em>
          <img id="preview_picture_img" src="/public/static/blue/img/upload-common-select.png" data-src="/upload/common/1533095180.jpg" data-html="true" data-container="body" data-placement="top" data-trigger="manual" data-original-title="" title="">
        </div>
        <p class="error" style="display: none;">请上传图像图片</p>
        <p class="hint">专题活动列表中单独专题背景,<i class="important-note">建议使用宽580像素-高300像素</i></p>

    </dd>
  </dl>
  <dl>
    <dt><span style="color:red;">*</span>&nbsp;&nbsp;条幅：</dt>
    <dd>
        <div class="upload-btn-common">
          <div>
            <input class="input-file" name="file_upload" id="uploadscroll" type="file" onchange="imgUpload(this);" title="上传">
            <input type="hidden" id="scroll_img" value="upload/common/1533095182.jpg">
          </div>

          <input type="text" id="text_scroll_img" class="input-common" readonly="readonly" value="upload/common/1533095182.jpg">
          <em>上传</em>
          <img id="preview_scroll_img" src="/public/static/blue/img/upload-common-select.png" data-src="/upload/common/1533095182.jpg" data-html="true" data-container="body" data-placement="top" data-trigger="manual" data-original-title="" title="">
        </div>
        <p class="error" style="display: none;">请上传条幅图片</p>
        <p class="hint"><i class="important-note">专题商品列表中的头部展示</i></p>

    </dd>
  </dl>
  <dl>
    <dt>背景图：</dt>
    <dd>
        <div class="upload-btn-common">
          <div>
            <input class="input-file" name="file_upload" id="uploadbackground" type="file" onchange="imgUpload(this);" title="上传">
            <input type="hidden" id="background_img" value="">
          </div>

          <input type="text" id="text_background_img" class="input-common" readonly="readonly" value="">
          <em>上传</em>
          <img id="preview_background_img" src="/public/static/blue/img/upload-common-select.png" data-src="" data-html="true" data-container="body" data-placement="top" data-trigger="manual" data-original-title="" title="">
        </div>
        <p class="error" style="display: none;">请上传图片</p>
        <p class="hint"><i class="important-note">专题商品列表中背景图</i></p>
    </dd>
  </dl>
  <dl>
    <dt>背景色：</dt>
    <dd>
      <input type="color" id="background_color" maxlength="10" class="input-common-color" value="#000000">
      <p class="error" style="display: none;">请输入专题名称</p>
    </dd>
  </dl>
  <dl>
    <dt><span style="color:red;">*</span>&nbsp;&nbsp;有效时间：</dt>
    <dd>
      <input class="input-medium input-common harf" type="text" id="start_time" value="2018-08-01 11:46:46" style="width:250px;" onclick="WdatePicker({skin:'twoer',dateFmt:'yyyy-MM-dd HH:mm:ss'})">
      <span class="mlr5">至</span>
      <input class="input-medium input-common harf" size="15" type="text" id="end_time" value="2018-08-14 11:46:49" style="width:250px;" onclick="WdatePicker({skin:'twoer',dateFmt:'yyyy-MM-dd HH:mm:ss'})">
      <p class="error" style="display: none;">请输入活动有效期</p>
    </dd>
  </dl>

  <h4>高级设置</h4>

  <dl>
    <dt>是否显示头部：</dt>
    <dd><input id="is_head" type="checkbox" class="checkbox" checked="checked" simpleswitch="0" result="true" style="display: none;"><div class="Switch Switch_FlatRadius On" id="Switch0"><span class="switch-open">是</span><span class="switch-close">否</span></div></dd>
  </dl>
  <dl>
  <dt>是否显示底部：</dt>
    <dd><input id="is_foot" type="checkbox" class="checkbox" checked="checked" simpleswitch="1" result="true" style="display: none;"><div class="Switch Switch_FlatRadius On" id="Switch1"><span class="switch-open">是</span><span class="switch-close">否</span></div></dd>
  </dl>
  <h4>选择活动商品：</h4>

  <!-- 所有决定商品弹框内容的条件和存放商品id的隐藏域 -->
  <span id="goods-condition">
    <input type="hidden" name="type" value="2">
    <input type="hidden" name="stock" value="1">
    <input type="hidden" name="goods_type" value="1,2">
    <input type="hidden" name="is_have_sku" value="1">
    <input type="hidden" name="state" value="1">
    <input type="hidden" id="goods_id_array" value="3,4,5,6,7,8,9,10">
    <input type="hidden" id="range_type" value="0">
    <input type="hidden" id="is_show_select" value="0">
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
      <tbody>
                <tr><td style="text-align:left;">男OVERSIZE宽松ins同款衬衫防晒夏季白衬衣外套</td><td class="goods_price">198.00</td><td>1400</td><td></td><td><label for=""><i class="fa fa-times" aria-hidden="true fa-2x" onclick="cancelSelect(10,this)"></i></label></td></tr>
                <tr><td style="text-align:left;">DOMO男士高端衬衣潮男雅痞英伦风大尖领湖蓝红色波点衬衣个性达人</td><td class="goods_price">986.00</td><td>1110</td><td></td><td><label for=""><i class="fa fa-times" aria-hidden="true fa-2x" onclick="cancelSelect(9,this)"></i></label></td></tr>
                <tr><td style="text-align:left;">小鹿要飞背带牛仔裤女春夏季2017新款宽松高腰短裤小清新背带裤裙</td><td class="goods_price">188.00</td><td>1000</td><td></td><td><label for=""><i class="fa fa-times" aria-hidden="true fa-2x" onclick="cancelSelect(8,this)"></i></label></td></tr>
                <tr><td style="text-align:left;">简约气质百搭复古 浅灰铜氨丝 吊带连衣裙</td><td class="goods_price">178.00</td><td>1000</td><td></td><td><label for=""><i class="fa fa-times" aria-hidden="true fa-2x" onclick="cancelSelect(7,this)"></i></label></td></tr>
                <tr><td style="text-align:left;">夏欧美性感气质名媛女高腰修身显瘦黑色不规则吊带背心无袖连衣裙</td><td class="goods_price">188.00</td><td>1000</td><td></td><td><label for=""><i class="fa fa-times" aria-hidden="true fa-2x" onclick="cancelSelect(6,this)"></i></label></td></tr>
                <tr><td style="text-align:left;">定制韩版宽松蝙蝠袖中长款套头卫衣胸前系带连衣裙</td><td class="goods_price">485.00</td><td>999</td><td></td><td><label for=""><i class="fa fa-times" aria-hidden="true fa-2x" onclick="cancelSelect(5,this)"></i></label></td></tr>
                <tr><td style="text-align:left;">2017夏装新款名媛修身性感一字肩绣花时尚喇叭袖连衣裙短袖包臀裙</td><td class="goods_price">399.00</td><td>1000</td><td></td><td><label for=""><i class="fa fa-times" aria-hidden="true fa-2x" onclick="cancelSelect(4,this)"></i></label></td></tr>
                <tr><td style="text-align:left;">上衣女夏2017新款枣红色韩版灯笼袖压褶方领宽松半袖百搭雪纺衫</td><td class="goods_price">169.00</td><td>74999</td><td></td><td><label for=""><i class="fa fa-times" aria-hidden="true fa-2x" onclick="cancelSelect(3,this)"></i></label></td></tr></tbody>
    </table>
  </dd>
  </dl>

  <h4>模板设置</h4>
  <dl>
      <dt>电脑端：</dt>
      <dd>
        template/shop/blue/Goods/&nbsp;<input type="text" class="input-common harf" name="" id="pc_topic_template" value="promotionTopicGoods" style="width: 80px;" onkeyup="value=value.replace(/[^\w\.\/]/ig,'')">&nbsp;.html
        <p class="hint">用户自定义模板必须存放在template/shop/blue/Goods/下，模板名只能由英文组成</p>
      </dd>
    </dl>
    <dl>
      <dt>手机端：</dt>
      <dd>
        template/wap/default_new/Goods/&nbsp;<input type="text" class="input-common harf" name="" id="wap_topic_template" value="promotionTopicGoods" style="width: 80px;" onkeyup="value=value.replace(/[^\w\.\/]/ig,'')">&nbsp;.html
        <p class="hint">用户自定义模板必须存放在template/wap/default_new/Goods/下，模板名只能由英文组成</p>
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
  <input type="hidden" id="topic_id" value="1">

    </div>

  </section>
</template>
