<template>

  <section class="ns-base-section">

    <div style="position:relative;margin:0;">
      <!-- 面包屑导航 -->
            <div class="breadcrumb-nav">
        <a href="index.html">大鵬系統</a>
                  <i class="fa fa-angle-right"></i>
          <a href="/config/usernotice.html">网站</a>
                  <i class="fa fa-angle-right"></i>
          <!-- 需要加跳转链接用这个：http://showfx.niuteam.cn/admin/config/helpdocument -->
          <a href="javascript:;" style="color:#999;">帮助内容</a>
              </div>
            <!-- 三级导航菜单 -->

                <nav class="ns-third-menu">
          <ul>
                        <li class="selected" onclick="location.href='/config/helpdocument.html';">帮助内容</li>
                          <li onclick="location.href='/config/helpclass.html';">帮助类型</li>
                      </ul>
        </nav>

      <div class="right-side-operation">
        <ul>
          <li>
            <a class="js-open-warmp-prompt" href="javascript:;" data-menu-desc=""><i class="fa fa-question-circle"></i>&nbsp;提示</a>
            <div class="popover">
              <div class="arrow"></div>
              <div class="popover-content">
                <div>
                                    <h4>操作提示</h4>
                  <p>相关教程：<a href="http://bbs.niushop.com.cn/forum.php?mod=viewthread&amp;tid=2380&amp;extra=page%3D1" target="_blank">http://bbs.niushop.com.cn/forum.php?mod=viewthread&amp;tid=2380&amp;extra=page%3D1</a></p>
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

  <div class="options-btn">
  <button class="btn-common-delete" onclick="batchDelete()">批量删除</button>
  <button class="btn-common" onclick="location.href='/config/adddocument.html';">添加帮助内容</button>
  </div>
  <table class="table-class">
  <colgroup>
    <col style="width: 2%">
    <col style="width: 60%;">
    <col style="width: 19%;">
    <col style="width: 4%;">
    <col style="width: 15%">
  </colgroup>
  <thead>
    <tr align="center">
      <th><i class="checkbox-common"><input type="checkbox" onclick="CheckAll(this)"></i></th>
      <th align="left">标题</th>
      <th>分类</th>
      <th>排序</th>
      <th>操作</th>
    </tr>
  </thead>
  <tbody id="linkList"><tr align="center"><td><i class="checkbox-common"><input name="sub" type="checkbox" value="1"></i></td><td align="left"><input type="text" id="title0" value="购物流程" onchange="updateDocument(1,0,1)" class="input-common"></td><td>新手上路</td><td><input type="number" min="0" value="0" class="num input-common input-common-sort" onchange="updateDocument(1,0,1)" id="sort0"></td><td><a href="/config/updatedocument?id=1">修改</a>&nbsp;&nbsp;<a href="javascript:help_delete(1)">删除</a>&nbsp;&nbsp;<a href="/helpcenter/index?id=1&amp;class_id=1" target="_blank">预览</a></td></tr><tr align="center"><td><i class="checkbox-common"><input name="sub" type="checkbox" value="17"></i></td><td align="left"><input type="text" id="title1" value="用户注册协议" onchange="updateDocument(17,1,6)" class="input-common"></td><td>-</td><td><input type="number" min="0" value="0" class="num input-common input-common-sort" onchange="updateDocument(17,1,6)" id="sort1"></td><td><a href="/config/updatedocument?id=17">修改</a>&nbsp;&nbsp;<a href="javascript:help_delete(17)">删除</a>&nbsp;&nbsp;<a href="/helpcenter/index?id=17&amp;class_id=6" target="_blank">预览</a></td></tr><tr align="center"><td><i class="checkbox-common"><input name="sub" type="checkbox" value="3"></i></td><td align="left"><input type="text" id="title2" value="售后流程" onchange="updateDocument(3,2,3)" class="input-common"></td><td>会员中心</td><td><input type="number" min="0" value="1" class="num input-common input-common-sort" onchange="updateDocument(3,2,3)" id="sort2"></td><td><a href="/config/updatedocument?id=3">修改</a>&nbsp;&nbsp;<a href="javascript:help_delete(3)">删除</a>&nbsp;&nbsp;<a href="/helpcenter/index?id=3&amp;class_id=3" target="_blank">预览</a></td></tr><tr align="center"><td><i class="checkbox-common"><input name="sub" type="checkbox" value="13"></i></td><td align="left"><input type="text" id="title3" value="订购方式" onchange="updateDocument(13,3,13)" class="input-common"></td><td>-</td><td><input type="number" min="0" value="2" class="num input-common input-common-sort" onchange="updateDocument(13,3,13)" id="sort3"></td><td><a href="/config/updatedocument?id=13">修改</a>&nbsp;&nbsp;<a href="javascript:help_delete(13)">删除</a>&nbsp;&nbsp;<a href="/helpcenter/index?id=13&amp;class_id=13" target="_blank">预览</a></td></tr><tr align="center"><td><i class="checkbox-common"><input name="sub" type="checkbox" value="7"></i></td><td align="left"><input type="text" id="title4" value="货到付款区域" onchange="updateDocument(7,4,2)" class="input-common"></td><td>配送与支付</td><td><input type="number" min="0" value="3" class="num input-common input-common-sort" onchange="updateDocument(7,4,2)" id="sort4"></td><td><a href="/config/updatedocument?id=7">修改</a>&nbsp;&nbsp;<a href="javascript:help_delete(7)">删除</a>&nbsp;&nbsp;<a href="/helpcenter/index?id=7&amp;class_id=2" target="_blank">预览</a></td></tr><tr align="center"><td><i class="checkbox-common"><input name="sub" type="checkbox" value="8"></i></td><td align="left"><input type="text" id="title5" value="配送支付智能查询" onchange="updateDocument(8,5,2)" class="input-common"></td><td>配送与支付</td><td><input type="number" min="0" value="4" class="num input-common input-common-sort" onchange="updateDocument(8,5,2)" id="sort5"></td><td><a href="/config/updatedocument?id=8">修改</a>&nbsp;&nbsp;<a href="javascript:help_delete(8)">删除</a>&nbsp;&nbsp;<a href="/helpcenter/index?id=8&amp;class_id=2" target="_blank">预览</a></td></tr><tr align="center"><td><i class="checkbox-common"><input name="sub" type="checkbox" value="2"></i></td><td align="left"><input type="text" id="title6" value="支付方式说明" onchange="updateDocument(2,6,2)" class="input-common"></td><td>配送与支付</td><td><input type="number" min="0" value="5" class="num input-common input-common-sort" onchange="updateDocument(2,6,2)" id="sort6"></td><td><a href="/config/updatedocument?id=2">修改</a>&nbsp;&nbsp;<a href="javascript:help_delete(2)">删除</a>&nbsp;&nbsp;<a href="/helpcenter/index?id=2&amp;class_id=2" target="_blank">预览</a></td></tr><tr align="center"><td><i class="checkbox-common"><input name="sub" type="checkbox" value="5"></i></td><td align="left"><input type="text" id="title7" value="资金管理" onchange="updateDocument(5,7,3)" class="input-common"></td><td>会员中心</td><td><input type="number" min="0" value="6" class="num input-common input-common-sort" onchange="updateDocument(5,7,3)" id="sort7"></td><td><a href="/config/updatedocument?id=5">修改</a>&nbsp;&nbsp;<a href="javascript:help_delete(5)">删除</a>&nbsp;&nbsp;<a href="/helpcenter/index?id=5&amp;class_id=3" target="_blank">预览</a></td></tr><tr align="center"><td><i class="checkbox-common"><input name="sub" type="checkbox" value="6"></i></td><td align="left"><input type="text" id="title8" value="我的收藏" onchange="updateDocument(6,8,3)" class="input-common"></td><td>会员中心</td><td><input type="number" min="0" value="7" class="num input-common input-common-sort" onchange="updateDocument(6,8,3)" id="sort8"></td><td><a href="/config/updatedocument?id=6">修改</a>&nbsp;&nbsp;<a href="javascript:help_delete(6)">删除</a>&nbsp;&nbsp;<a href="/helpcenter/index?id=6&amp;class_id=3" target="_blank">预览</a></td></tr><tr align="center"><td><i class="checkbox-common"><input name="sub" type="checkbox" value="14"></i></td><td align="left"><input type="text" id="title9" value="我的订单" onchange="updateDocument(14,9,3)" class="input-common"></td><td>会员中心</td><td><input type="number" min="0" value="8" class="num input-common input-common-sort" onchange="updateDocument(14,9,3)" id="sort9"></td><td><a href="/config/updatedocument?id=14">修改</a>&nbsp;&nbsp;<a href="javascript:help_delete(14)">删除</a>&nbsp;&nbsp;<a href="/helpcenter/index?id=14&amp;class_id=3" target="_blank">预览</a></td></tr><tr align="center"><td><i class="checkbox-common"><input name="sub" type="checkbox" value="9"></i></td><td align="left"><input type="text" id="title10" value="退换货原则" onchange="updateDocument(9,10,4)" class="input-common"></td><td>服务保证</td><td><input type="number" min="0" value="9" class="num input-common input-common-sort" onchange="updateDocument(9,10,4)" id="sort10"></td><td><a href="/config/updatedocument?id=9">修改</a>&nbsp;&nbsp;<a href="javascript:help_delete(9)">删除</a>&nbsp;&nbsp;<a href="/helpcenter/index?id=9&amp;class_id=4" target="_blank">预览</a></td></tr><tr align="center"><td><i class="checkbox-common"><input name="sub" type="checkbox" value="10"></i></td><td align="left"><input type="text" id="title11" value="售后服务保证" onchange="updateDocument(10,11,4)" class="input-common"></td><td>服务保证</td><td><input type="number" min="0" value="9" class="num input-common input-common-sort" onchange="updateDocument(10,11,4)" id="sort11"></td><td><a href="/config/updatedocument?id=10">修改</a>&nbsp;&nbsp;<a href="javascript:help_delete(10)">删除</a>&nbsp;&nbsp;<a href="/helpcenter/index?id=10&amp;class_id=4" target="_blank">预览</a></td></tr><tr align="center"><td><i class="checkbox-common"><input name="sub" type="checkbox" value="11"></i></td><td align="left"><input type="text" id="title12" value="产品质量保证" onchange="updateDocument(11,12,4)" class="input-common"></td><td>服务保证</td><td><input type="number" min="0" value="10" class="num input-common input-common-sort" onchange="updateDocument(11,12,4)" id="sort12"></td><td><a href="/config/updatedocument?id=11">修改</a>&nbsp;&nbsp;<a href="javascript:help_delete(11)">删除</a>&nbsp;&nbsp;<a href="/helpcenter/index?id=11&amp;class_id=4" target="_blank">预览</a></td></tr><tr align="center"><td><i class="checkbox-common"><input name="sub" type="checkbox" value="12"></i></td><td align="left"><input type="text" id="title13" value="网站故障报告" onchange="updateDocument(12,13,5)" class="input-common"></td><td>联系我们</td><td><input type="number" min="0" value="11" class="num input-common input-common-sort" onchange="updateDocument(12,13,5)" id="sort13"></td><td><a href="/config/updatedocument?id=12">修改</a>&nbsp;&nbsp;<a href="javascript:help_delete(12)">删除</a>&nbsp;&nbsp;<a href="/helpcenter/index?id=12&amp;class_id=5" target="_blank">预览</a></td></tr></tbody>
  </table>
    </div>

  </section>

</template>
