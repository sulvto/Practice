<template>

  <section class="ns-base-section">

    <div style="position:relative;margin:0;">
      <!-- 面包屑导航 -->
            <div class="breadcrumb-nav">
        <a href="index.html">大鵬系統</a>
                  <i class="fa fa-angle-right"></i>
          <a href="/promotion/coupontypelist.html">营销</a>
                  <i class="fa fa-angle-right"></i>
          <!-- 需要加跳转链接用这个：http://showfx.niuteam.cn/admin/promotion/combopackagepromotionlist -->
          <a href="javascript:;" style="color:#999;">组合套餐</a>
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
                  <p>相关教程：<a href="http://bbs.niushop.com.cn/forum.php?mod=viewthread&amp;tid=2319&amp;extra=page%3D2" target="_blank">http://bbs.niushop.com.cn/forum.php?mod=viewthread&amp;tid=2319&amp;extra=page%3D2</a></p>
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
    <th width="20%" style="text-align:left;">
      <button class="btn-common btn-small" onclick="location.href='/promotion/combopackagepromotionEdit.html';" style="margin:0 5px 0 0 !important;">添加组合套餐</button>
      <button class="btn-common-delete" onclick="batchDelete();">批量删除</button>
    </th>
    <th width="10%">
      <input type="text" id="search_text" placeholder="请输入組合套餐名称" class="input-common">
      <input type="button" onclick="searchData()" value="搜索" class="btn-common">
    </th>
  </tr>
  </tbody></table>
  <table class="table-class">
  <colgroup>
  <col style="width: 2%;">
  <col style="width: 44%;">
  <col style="width: 10%;">
  <col style="width: 8%;">
  <col style="width: 20%;">
  <col style="width: 16%;">
  </colgroup>
  <thead>
    <tr align="center">
      <th><i class="checkbox-common"><input type="checkbox" onclick="CheckAll(this)"></i></th>
      <th align="left">组合套餐名称</th>

      <th align="right">组合套餐价格</th>
      <th>状态</th>
      <th>创建时间</th>
      <th>操作</th>
    </tr>
  </thead>
  <tbody><tr align="center"><td><i class="checkbox-common"><input name="sub" type="checkbox" value="1"></i></td><td style="text-align:left;">推荐套餐</td><td style="text-align:right;">500.00</td><td>已上架</td><td>2018-07-03 18:04:02</td><td><a href="/promotion/comboPackagePromotionEdit?id=1">编辑</a><a href="javascript:;" onclick="delete_combo_package(1);">删除</a></td></tr><tr align="center"><td><i class="checkbox-common"><input name="sub" type="checkbox" value="2"></i></td><td style="text-align:left;">组合套餐</td><td style="text-align:right;">400.00</td><td>已下架</td><td>2018-07-08 21:54:00</td><td><a href="/promotion/comboPackagePromotionEdit?id=2">编辑</a><a href="javascript:;" onclick="delete_combo_package(2);">删除</a></td></tr><tr align="center"><td><i class="checkbox-common"><input name="sub" type="checkbox" value="3"></i></td><td style="text-align:left;">情侣</td><td style="text-align:right;">600.00</td><td>已上架</td><td>2018-07-31 15:59:33</td><td><a href="/promotion/comboPackagePromotionEdit?id=3">编辑</a><a href="javascript:;" onclick="delete_combo_package(3);">删除</a></td></tr><tr align="center"><td><i class="checkbox-common"><input name="sub" type="checkbox" value="4"></i></td><td style="text-align:left;">123</td><td style="text-align:right;">2000.00</td><td>已上架</td><td>2018-08-01 11:16:33</td><td><a href="/promotion/comboPackagePromotionEdit?id=4">编辑</a><a href="javascript:;" onclick="delete_combo_package(4);">删除</a></td></tr><tr align="center"><td><i class="checkbox-common"><input name="sub" type="checkbox" value="5"></i></td><td style="text-align:left;">hjkhkhjk</td><td style="text-align:right;">1053.00</td><td>已上架</td><td>2018-08-02 12:58:31</td><td><a href="/promotion/comboPackagePromotionEdit?id=5">编辑</a><a href="javascript:;" onclick="delete_combo_package(5);">删除</a></td></tr><tr align="center"><td><i class="checkbox-common"><input name="sub" type="checkbox" value="6"></i></td><td style="text-align:left;">10000</td><td style="text-align:right;">500.00</td><td>已下架</td><td>2018-08-10 14:06:34</td><td><a href="/promotion/comboPackagePromotionEdit?id=6">编辑</a><a href="javascript:;" onclick="delete_combo_package(6);">删除</a></td></tr></tbody>
  </table>

    </div>

  </section>

</template>
