<template>

  <section class="ns-base-section">

    <div style="position:relative;margin:0;">
      <!-- 面包屑导航 -->
            <div class="breadcrumb-nav">
        <a href="index.html">大鵬系統</a>
                  <i class="fa fa-angle-right"></i>
          <a href="/promotion/coupontypelist.html">营销</a>
                  <i class="fa fa-angle-right"></i>
          <!-- 需要加跳转链接用这个：http://showfx.niuteam.cn/admin/promotion/coupontypelist -->
          <a href="javascript:;" style="color:#999;">优惠券</a>
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
                  <p>相关教程：<a href="http://bbs.niushop.com.cn/forum.php?mod=viewthread&amp;tid=2315&amp;extra=page%3D2" target="_blank">http://bbs.niushop.com.cn/forum.php?mod=viewthread&amp;tid=2315&amp;extra=page%3D2</a></p>
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

  <table class="mytable">
  <tbody><tr>
    <th width="20%" style="text-align:left;"><button class="btn-common btn-small" onclick="location.href='/promotion/addcoupontype.html';" style="margin:0 5px 0 0 !important;">添加优惠券</button></th>
    <th width="10%">
      <input type="text" id="search_text" placeholder="请输入优惠券名称" class="input-common">
      <input type="button" onclick="searchData()" value="搜索" class="btn-common">
    </th>
  </tr>
  </tbody></table>
  <table class="table-class">
    <colgroup>
    <col style="width: 2%;">
    <col style="width: 42%;">
    <col style="width: 10%;">
    <col style="width: 10%;">
    <col style="width: 20%;">
    <col style="width: 16%;">
    </colgroup>
  <thead>
    <tr align="center">
      <th>
        <!-- <i class="checkbox-common"><input type="checkbox" onclick="CheckAll(this)"></i> -->
      </th>
      <th class="align_left">优惠券名称</th>
      <th class="align_right">面额</th>
      <th class="align_right">发放数量<span class="row-20"></span></th>
      <th>有效时间</th>
      <th>操作</th>
    </tr>
  </thead>
  <tbody><tr align="center"><td></td><td class="align_left">123</td><td class="align_right">1.00</td><td class="align_right">1<span class="row-20"></span></td><td>开始时间：2018-08-22 19:07:31<br>结束时间：2018-08-28 19:07:39</td><td><a href="/Promotion/updateCouponType?coupon_type_id=3">编辑</a><a href="javascript:void(0);" onclick="couponTypeInfo(3)">详情</a><a href="javascript:;" onclick="deletecouponType(3);">删除</a><br><a href="/wap/goods/getCoupon?coupon_type_id=3" target="_blank">推广链接</a><a href="/Promotion/couponGrantLog?coupon_type_id=3">发放记录</a></td></tr><tr align="center"><td></td><td class="align_left">满150元减5元</td><td class="align_right">5.00</td><td class="align_right">1000<span class="row-20"></span></td><td>开始时间：2018-08-01 18:45:23<br>结束时间：2018-08-31 18:45:27</td><td><a href="/Promotion/updateCouponType?coupon_type_id=2">编辑</a><a href="javascript:void(0);" onclick="couponTypeInfo(2)">详情</a><a href="javascript:;" onclick="deletecouponType(2);">删除</a><br><a href="/wap/goods/getCoupon?coupon_type_id=2" target="_blank">推广链接</a><a href="/Promotion/couponGrantLog?coupon_type_id=2">发放记录</a></td></tr><tr align="center"><td></td><td class="align_left">满88元减2元</td><td class="align_right">2.00</td><td class="align_right">102<span class="row-20"></span></td><td>开始时间：2018-07-04 18:44:44<br>结束时间：2018-08-31 14:50:04</td><td><a href="/Promotion/updateCouponType?coupon_type_id=1">编辑</a><a href="javascript:void(0);" onclick="couponTypeInfo(1)">详情</a><a href="javascript:;" onclick="deletecouponType(1);">删除</a><br><a href="/wap/goods/getCoupon?coupon_type_id=1" target="_blank">推广链接</a><a href="/Promotion/couponGrantLog?coupon_type_id=1">发放记录</a></td></tr></tbody>
  </table>

  <!-- 模态框（Modal） -->
  <div class="modal fade hide" id="coupon_info" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
  <div class="modal-dialog">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
        <h3>优惠券详情</h3>
      </div>
      <div class="modal-body">
        <div class="modal-infp-style">
          <table>
            <tbody><tr>
              <td>类型名</td>
              <td id="coupon_name"></td>
            </tr>
            <tr>
              <td>面额</td>
              <td id="money"></td>
            </tr>
            <tr>
              <td>发放数量</td>
              <td id="count"></td>
            </tr>
            <tr>
              <td>每人最大领取数</td>
              <td id="max_fetch"></td>
            </tr>
            <tr>
              <td>满多少元使用</td>
              <td id="at_least"></td>
            </tr>
            <tr style="display:none;">
              <td>领取人等级</td>
              <td id="need_user_level"></td>
            </tr>
            <tr>
              <td>有效时间</td>
              <td id="time"></td>
            </tr>
          </tbody></table>
        </div>
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
      </div>
    </div>
  </div>
  </div>

    </div>

  </section>
</template>
