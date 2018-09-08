<template>
  <section class="ns-base-section">

      <div style="position:relative;margin:0;">
          <!-- 面包屑导航 -->
          <div class="breadcrumb-nav">
              <a href="http://b2c.niuteam.cn/admin.html">单商户B2C</a>
              <i class="fa fa-angle-right"></i>
              <a href="/goods/goodslist.html">商品</a>
              <i class="fa fa-angle-right"></i>
              <!-- 需要加跳转链接用这个：http://b2c.niuteam.cn/admin/goods/goodsbrandlist -->
              <a href="javascript:;" style="color:#999;">商品品牌</a>
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
                                  <p>相关教程：<a href="http://bbs.niushop.com.cn/forum.php?mod=viewthread&amp;tid=2304&amp;extra=page%3D3" target="_blank">http://bbs.niushop.com.cn/forum.php?mod=viewthread&amp;tid=2304&amp;extra=page%3D3</a></p>
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
              <tbody>
                  <tr>
                      <th width="30%" style="text-align: left;">
                          <button class="btn-common-delete" onclick="batchDelete()" style="margin:0 5px 0 0 !important;">批量删除</button>
                          <button class="btn-common" onclick="addBrand()" style="margin:0 5px 0 0 !important;">添加品牌</button>
                      </th>
                      <th width="20%">
                          <input type="text" id="search_text" placeholder="输入品牌名称" class="input-common">
                          <input type="button" onclick="LoadingInfo(1)" value="搜索" class="btn-common">
                      </th>
                  </tr>
              </tbody>
          </table>
          <table class="table-class">
              <colgroup>
                  <col style="width: 2%;">
                  <col style="width: 21%;">
                  <col style="width: 26%;">
                  <col style="width: 21%;">
                  <col style="width: 10%;">
                  <col style="width: 10%;">
                  <col style="width: 10%;">
              </colgroup>
              <thead>
                  <tr>
                      <th>
                          <i class="checkbox-common">
            <input type="checkbox" onclick="CheckAll(this)">
          </i>
                      </th>
                      <th align="left">品牌名称</th>
                      <th>图片</th>
                      <th>品牌首字母</th>
                      <th>是否推荐</th>
                      <th>排序</th>
                      <th>操作</th>
                  </tr>
              </thead>
              <tbody>
                  <tr align="center">
                      <td><i class="checkbox-common"><input name="sub" type="checkbox" value="2"></i></td>
                      <td align="left">小米</td>
                      <td></td>
                      <td>x</td>
                      <td>
                          <a href="javascript:;" class="is_visible" is_visible="1" onclick="updatetype(2, this)"><img src="/public/admin/images/checked.png" alt="" width="15"></a>
                      </td>
                      <td style="text-align: center;"><input type="number" onchange="updatesort(2,this)" class="sort input-common input-common-sort" name="categorySort" value="1"></td>
                      <td><a href="/goods/updategoodsbrand?brand_id=2">修改</a> <a href="javascript:delBrand(2)">删除</a></td>
                  </tr>
                  <tr align="center">
                      <td><i class="checkbox-common"><input name="sub" type="checkbox" value="4"></i></td>
                      <td align="left">索尼</td>
                      <td></td>
                      <td>S</td>
                      <td>
                          <a href="javascript:;" class="is_visible" is_visible="1" onclick="updatetype(4, this)"><img src="/public/admin/images/checked.png" alt="" width="15"></a>
                      </td>
                      <td style="text-align: center;"><input type="number" onchange="updatesort(4,this)" class="sort input-common input-common-sort" name="categorySort" value="1"></td>
                      <td><a href="/goods/updategoodsbrand?brand_id=4">修改</a> <a href="javascript:delBrand(4)">删除</a></td>
                  </tr>
                  <tr align="center">
                      <td><i class="checkbox-common"><input name="sub" type="checkbox" value="5"></i></td>
                      <td align="left">三星</td>
                      <td></td>
                      <td>S</td>
                      <td>
                          <a href="javascript:;" class="is_visible" is_visible="1" onclick="updatetype(5, this)"><img src="/public/admin/images/checked.png" alt="" width="15"></a>
                      </td>
                      <td style="text-align: center;"><input type="number" onchange="updatesort(5,this)" class="sort input-common input-common-sort" name="categorySort" value="1"></td>
                      <td><a href="/goods/updategoodsbrand?brand_id=5">修改</a> <a href="javascript:delBrand(5)">删除</a></td>
                  </tr>
              </tbody>
          </table>
      </div>

  </section>
</template>

<script>
require('@/assets/style/table.scss')

export default {
  name: 'brandList',
  components: {}
}
</script>
