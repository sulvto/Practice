  <template>
    <section class="ns-base-section">

      <div style="position:relative;margin:0;">
        <!-- 面包屑导航 -->
              <div class="breadcrumb-nav">
          <a href="index.html">大鵬系統</a>
                    <i class="fa fa-angle-right"></i>
            <a href="/wchat/config.html">微信</a>
                    <i class="fa fa-angle-right"></i>
            <!-- 需要加跳转链接用这个：http://showfx.niuteam.cn/admin/wchat/shareconfig -->
            <a href="javascript:;" style="color:#999;">分享内容设置</a>
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
                    <p>相关教程：<a href="http://bbs.niushop.com.cn/forum.php?mod=viewthread&amp;tid=2332&amp;extra=page%3D2" target="_blank">http://bbs.niushop.com.cn/forum.php?mod=viewthread&amp;tid=2332&amp;extra=page%3D2</a></p>
                    <hr>
                                      <h4>功能提示</h4>
                    <p class="function-prompts">
      <strong>提示：</strong>设置分享内容，设置方法如下：<br>
      点击下方的“编辑”按钮，在出现的对话框中填写您想要的内容，如果想要取消，点击“取消”按钮，如果需要保存点击保存即可。
      </p>
                  </div>
                </div>
              </div>
            </li>
          </ul>
        </div>
      </div>

      <div class="ns-main">

        <!-- <div id="DialogLayer"></div> -->
        <div class="space-10"></div>
        <div class="main share">
        <div class="card">
        <h3 class="title">
          <span>推广二维码</span>
          <a href="javascript:void(0)" class="edit" id="codeEdit" style="display: block;">编辑</a>
          <a href="javascript:void(0)" class="edit" id="codeCancel" style="display: none;">取消</a>
        </h3>
        <h4 class="pro-title"><span>分享二维码</span></h4>
        <dl>
          <dt><span class="img">个人头像</span></dt>
          <dd>
            <p class="price" style="margin:5px 0;">
              <span class="text" id="qrcode_one" style="display: inline;"></span>
              <input class="input-common w60 middle" type="text" value="" placeholder="请输入分享标题" style="display: none;" id="Qrcode_param_1">
            </p>
            <p class="advertisiment">
              <span class="text" id="qrcode_two" style="display: block;"></span>
              <input class="input-medium input-common middle" type="text" value="" style="display: none;" id="Qrcode_param_2">
            </p>
            <p class="hot"><span>收藏热度：</span><span class="star">★★★★★</span></p>
          </dd>
        </dl>
        </div>
        <div class="product">
        <h3 class="title">
          <span>商品设置</span>
          <a href="javascript:void(0)" class="edit" id="proEdit" style="display: block;">编辑</a>
          <a href="javascript:void(0)" class="edit" id="proCancel" style="display: none;">取消</a>
        </h3>
        <h4 class="pro-title"><span>商品分享</span></h4>
        <dl>
          <dt><span class="img">商品图片</span></dt>
          <dd style="padding-left:10px;">
            <p class="price">
              <span class="text" id="pricespan" style="display: inline;">花王纸尿裤280</span>
              <input class="w60 input-common middle" type="text" value="花王纸尿裤280" placeholder="价格标题" style="display: none;" id="PriceDesc">
              <span class="number"><!-- ￥0.00 --></span>
            </p>
            <p class="advertisiment">
              <span class="text" id="descspan" style="display: block;">花王纸尿裤280</span>
              <input class="input-medium input-common middle" type="text" value="花王纸尿裤280" style="display: none;" id="ProductDesc">
            </p>
            <p class="hot"><span>收藏热度：</span><span class="star">★★★★★</span></p>
          </dd>
        </dl>
        </div>
        <div class="store">
        <h3 class="title">
          <span>店铺设置</span>
          <a href="javascript:void(0)" class="edit" id="storeEdit" style="display: block;">编辑</a>
          <a href="javascript:void(0)" class="edit" id="storeCancel" style="display: none;">取消</a>
        </h3>
        <h4 class="store-title">
          <span class="text pre" id="opendescspan" style="display: inline-block;"></span>
          <input type="text" class="input-medium input-common middle" value="" placeholder="请输入欢迎语" style="display: none;">
          <span class="storeName" id="shopName">**店</span>
        </h4>
        <dl>
          <dt><span class="img">店铺Logo</span></dt>
          <dd>
            <p class="price">
              <span class="text advertisiment" id="openremarkspan1" style="display: block;"></span>
              <input id="txtOpenRemark" class="input-medium input-common middle" type="text" value="" placeholder="请输入分享标题" style="display: none;">
            </p>
            <p class="more">
              <span class="text" id="openremarkspan2" style="display: block;"></span>
              <input class="input-medium input-common middle" type="text" value="" style="display: none;">
            </p>
            <p class="hot"><span>收藏热度：</span><span class="star">★★★★★</span></p>
          </dd>
        </dl>
        </div>
      </div>

      <p class="button" style="display: none;" id="btnBut">
      <button class="btn-common btn-big" id="btnSave" type="button">保存</button>
      </p>

    </div>

  </section>
</template>
