<template>
  <section class="ns-base-section">
    <div class="ns-main">

  <table class="mytable">
  <tbody><tr>
    <td style="text-align:left;"><button style="margin:0 5px 0 0 !important;" class="btn-common btn-small" onclick="location.href='/system/addshopadvposition.html';">添加广告位</button>
    <button style="margin:0 5px 0 0 !important;" class="btn-common btn-small button_active" data-ad-type="1">PC端</button>
    <button style="margin:0 5px 0 0 !important;" class="btn-common btn-small" data-ad-type="2">手机端</button>
    </td>
    <td style="line-height:33px;">
      <span>广告位名称：</span>
      <input id="ap_name" class="input-common middle" type="text" placeholder="请输入广告位名称">
      <span>广告展示方式：</span>
      <div class="selectric-wrapper selectric-select-common selectric-middle" style="width: 150px;"><div class="selectric-hide-select"><select id="ap_display" class="select-common middle" tabindex="-1">
        <option value="">全部</option>
        <option value="0">幻灯片</option>
        <option value="1">多广告展示</option>
        <option value="2">单广告展示</option>
      </select></div><div class="selectric"><span class="selectric-label">全部</span><button class="selectric-button">▾</button></div><div class="selectric-items" tabindex="-1"><div class="selectric-scroll"><ul><li data-index="0" class="selected" title="全部">全部</li><li data-index="1" class="" title="幻灯片">幻灯片</li><li data-index="2" class="" title="多广告展示">多广告展示</li><li data-index="3" class="last" title="单广告展示">单广告展示</li></ul></div></div><input class="selectric-input" tabindex="0"></div>
      <input type="button" onclick="LoadingInfo(1)" value="搜索" class="btn-common">
    </td>
  </tr>
  </tbody></table>
  <table class="table-class">
  <colgroup>
    <col style="width: 3%;">
    <col style="width: 16%;">
    <col style="width: 9%;">
    <col style="width: 10%;">
    <col style="width: 9%;">
    <col style="width: 8%;">
    <col style="width: 9%;">
    <col style="width: 8%;">
    <col style="width: 10%;">
    <col style="width: 22%;">
  </colgroup>
  <thead>
    <tr>
      <th><i class="checkbox-common"><input type="checkbox" onclick="CheckAll(this)"></i></th>
      <th align="left">名称</th>
      <th>类别</th>
      <th>展示方式</th>
      <th>宽度/字数</th>
      <th>高度</th>
      <th>是否启用</th>
      <th>位置类型</th>
      <th>关键字</th>
      <th>操作</th>
    </tr>
  </thead>
  <tbody id="list"><tr align="center"><td><i class="checkbox-common"><input type="checkbox" name="sub" value="1051"></i></td><td align="left">商城首页最顶部广告位</td><td class="center">图片</td><td>单广告展示</td><td class="center">1000</td><td class="center">1000</td><td class="center"><a href="javascript:;" onclick="setPlatformAdvPositionUse(this,1051,1,1);" class="" data-toggle="class"><img src="/public/admin/images/un_checked.png" alt="" width="15"></a></td><td class="center"><i class="fa fa-television" title="PC端"></i></td><td></td><td class="center"><a href="/system/updateshopadvposition?ap_id=1051"> 编辑</a> &nbsp;</td></tr><tr align="center"><td><i class="checkbox-common"><input type="checkbox" name="sub" value="1052"></i></td><td align="left">商城首页logo右侧小广告</td><td class="center">图片</td><td>单广告展示</td><td class="center">170</td><td class="center">90</td><td class="center"><a href="javascript:;" onclick="setPlatformAdvPositionUse(this,1052,0,1);" class="active" data-toggle="class"><img src="/public/admin/images/checked.png" alt="" width="15"></a></td><td class="center"><i class="fa fa-television" title="PC端"></i></td><td></td><td class="center"><a href="/system/updateshopadvposition?ap_id=1052"> 编辑</a> &nbsp;</td></tr><tr align="center"><td><i class="checkbox-common"><input type="checkbox" name="sub" value="1053"></i></td><td align="left">商城首页滚动图广告位</td><td class="center">图片</td><td>单广告展示</td><td class="center">800</td><td class="center">443</td><td class="center"><a href="javascript:;" onclick="setPlatformAdvPositionUse(this,1053,0,1);" class="active" data-toggle="class"><img src="/public/admin/images/checked.png" alt="" width="15"></a></td><td class="center"><i class="fa fa-television" title="PC端"></i></td><td></td><td class="center"><a href="/system/updateshopadvposition?ap_id=1053"> 编辑</a> &nbsp;</td></tr><tr align="center"><td><i class="checkbox-common"><input type="checkbox" name="sub" value="1054"></i></td><td align="left">商城首页中部推荐广告位</td><td class="center">图片</td><td>单广告展示</td><td class="center">291</td><td class="center">150</td><td class="center"><a href="javascript:;" onclick="setPlatformAdvPositionUse(this,1054,0,1);" class="active" data-toggle="class"><img src="/public/admin/images/checked.png" alt="" width="15"></a></td><td class="center"><i class="fa fa-television" title="PC端"></i></td><td></td><td class="center"><a href="/system/updateshopadvposition?ap_id=1054"> 编辑</a> &nbsp;</td></tr><tr align="center"><td><i class="checkbox-common"><input type="checkbox" name="sub" value="1056"></i></td><td align="left">商城限时折扣轮播广告位</td><td class="center">图片</td><td>单广告展示</td><td class="center">1903</td><td class="center">443</td><td class="center"><a href="javascript:;" onclick="setPlatformAdvPositionUse(this,1056,0,1);" class="active" data-toggle="class"><img src="/public/admin/images/checked.png" alt="" width="15"></a></td><td class="center"><i class="fa fa-television" title="PC端"></i></td><td></td><td class="center"><a href="/system/updateshopadvposition?ap_id=1056"> 编辑</a> &nbsp;</td></tr><tr align="center"><td><i class="checkbox-common"><input type="checkbox" name="sub" value="1057"></i></td><td align="left">推荐楼层1楼——单图广告位</td><td class="center">图片</td><td>单广告展示</td><td class="center">210</td><td class="center">485</td><td class="center"><a href="javascript:;" onclick="setPlatformAdvPositionUse(this,1057,0,0);" class="active" data-toggle="class"><img src="/public/admin/images/checked.png" alt="" width="15"></a></td><td class="center"><i class="fa fa-television" title="PC端"></i></td><td></td><td class="center"><a href="/system/updateshopadvposition?ap_id=1057"> 编辑</a> &nbsp;<a href="javascript:delShopAdvPosition(1057);"> 删除</a> &nbsp;</td></tr><tr align="center"><td><i class="checkbox-common"><input type="checkbox" name="sub" value="1058"></i></td><td align="left">推荐楼层1楼——轮播图广告位</td><td class="center">图片</td><td>幻灯片</td><td class="center">390</td><td class="center">485</td><td class="center"><a href="javascript:;" onclick="setPlatformAdvPositionUse(this,1058,0,0);" class="active" data-toggle="class"><img src="/public/admin/images/checked.png" alt="" width="15"></a></td><td class="center"><i class="fa fa-television" title="PC端"></i></td><td></td><td class="center"><a href="/system/updateshopadvposition?ap_id=1058"> 编辑</a> &nbsp;<a href="javascript:delShopAdvPosition(1058);"> 删除</a> &nbsp;</td></tr><tr align="center"><td><i class="checkbox-common"><input type="checkbox" name="sub" value="1059"></i></td><td align="left">推荐楼层1楼——多图广告位</td><td class="center">图片</td><td>多广告展示</td><td class="center">202</td><td class="center">300</td><td class="center"><a href="javascript:;" onclick="setPlatformAdvPositionUse(this,1059,0,0);" class="active" data-toggle="class"><img src="/public/admin/images/checked.png" alt="" width="15"></a></td><td class="center"><i class="fa fa-television" title="PC端"></i></td><td></td><td class="center"><a href="/system/updateshopadvposition?ap_id=1059"> 编辑</a> &nbsp;<a href="javascript:delShopAdvPosition(1059);"> 删除</a> &nbsp;</td></tr><tr align="center"><td><i class="checkbox-common"><input type="checkbox" name="sub" value="1060"></i></td><td align="left">推荐楼层2楼——单图广告位</td><td class="center">图片</td><td>单广告展示</td><td class="center">210</td><td class="center">485</td><td class="center"><a href="javascript:;" onclick="setPlatformAdvPositionUse(this,1060,0,0);" class="active" data-toggle="class"><img src="/public/admin/images/checked.png" alt="" width="15"></a></td><td class="center"><i class="fa fa-television" title="PC端"></i></td><td></td><td class="center"><a href="/system/updateshopadvposition?ap_id=1060"> 编辑</a> &nbsp;<a href="javascript:delShopAdvPosition(1060);"> 删除</a> &nbsp;</td></tr><tr align="center"><td><i class="checkbox-common"><input type="checkbox" name="sub" value="1061"></i></td><td align="left">推荐楼层2楼——轮播图广告位</td><td class="center">图片</td><td>幻灯片</td><td class="center">390</td><td class="center">485</td><td class="center"><a href="javascript:;" onclick="setPlatformAdvPositionUse(this,1061,0,0);" class="active" data-toggle="class"><img src="/public/admin/images/checked.png" alt="" width="15"></a></td><td class="center"><i class="fa fa-television" title="PC端"></i></td><td></td><td class="center"><a href="/system/updateshopadvposition?ap_id=1061"> 编辑</a> &nbsp;<a href="javascript:delShopAdvPosition(1061);"> 删除</a> &nbsp;</td></tr><tr align="center"><td><i class="checkbox-common"><input type="checkbox" name="sub" value="1062"></i></td><td align="left">推荐楼层2楼——多图广告位</td><td class="center">图片</td><td>多广告展示</td><td class="center">202</td><td class="center">300</td><td class="center"><a href="javascript:;" onclick="setPlatformAdvPositionUse(this,1062,0,0);" class="active" data-toggle="class"><img src="/public/admin/images/checked.png" alt="" width="15"></a></td><td class="center"><i class="fa fa-television" title="PC端"></i></td><td></td><td class="center"><a href="/system/updateshopadvposition?ap_id=1062"> 编辑</a> &nbsp;<a href="javascript:delShopAdvPosition(1062);"> 删除</a> &nbsp;</td></tr><tr align="center"><td><i class="checkbox-common"><input type="checkbox" name="sub" value="1063"></i></td><td align="left">推荐楼层3楼——单图广告位</td><td class="center">图片</td><td>单广告展示</td><td class="center">210</td><td class="center">485</td><td class="center"><a href="javascript:;" onclick="setPlatformAdvPositionUse(this,1063,0,0);" class="active" data-toggle="class"><img src="/public/admin/images/checked.png" alt="" width="15"></a></td><td class="center"><i class="fa fa-television" title="PC端"></i></td><td></td><td class="center"><a href="/system/updateshopadvposition?ap_id=1063"> 编辑</a> &nbsp;<a href="javascript:delShopAdvPosition(1063);"> 删除</a> &nbsp;</td></tr><tr align="center"><td><i class="checkbox-common"><input type="checkbox" name="sub" value="1064"></i></td><td align="left">推荐楼层4楼——单图广告位</td><td class="center">图片</td><td>单广告展示</td><td class="center">210</td><td class="center">485</td><td class="center"><a href="javascript:;" onclick="setPlatformAdvPositionUse(this,1064,0,0);" class="active" data-toggle="class"><img src="/public/admin/images/checked.png" alt="" width="15"></a></td><td class="center"><i class="fa fa-television" title="PC端"></i></td><td></td><td class="center"><a href="/system/updateshopadvposition?ap_id=1064"> 编辑</a> &nbsp;<a href="javascript:delShopAdvPosition(1064);"> 删除</a> &nbsp;</td></tr><tr align="center"><td><i class="checkbox-common"><input type="checkbox" name="sub" value="1067"></i></td><td align="left">推荐楼层3楼——轮播图广告位</td><td class="center">图片</td><td>幻灯片</td><td class="center">390</td><td class="center">485</td><td class="center"><a href="javascript:;" onclick="setPlatformAdvPositionUse(this,1067,0,0);" class="active" data-toggle="class"><img src="/public/admin/images/checked.png" alt="" width="15"></a></td><td class="center"><i class="fa fa-television" title="PC端"></i></td><td></td><td class="center"><a href="/system/updateshopadvposition?ap_id=1067"> 编辑</a> &nbsp;<a href="javascript:delShopAdvPosition(1067);"> 删除</a> &nbsp;</td></tr></tbody>
  </table>
  <input type="hidden" id="ad_type" value="1">

  <div class="page" id="turn-ul" style="">
  <div class="pagination">
    <ul>
      <li class="according-number">每页显示<input type="text" class="input-medium" id="showNumber" value="14" data-default="14" autocomplete="off">条</li>
      <li><a id="beginPage" class="page-disable" style="border: 1px solid #dddddd;">首页</a></li>
      <li><a id="prevPage" class="page-disable">上一页</a></li>
      <li id="pageNumber"><a onclick="JumpForPage(this)" class="currentPage">1</a><a onclick="JumpForPage(this)">2</a></li>
      <li id="JslastPage"></li>
      <li><a id="nextPage">下一页</a></li>
      <li><a id="lastPage">末页</a></li>
      <li class="total-data" data-total-count="25">共25条</li>
      <!-- <li class="page-count">共0页</li> -->
      <li class="according-number">
        跳<input type="text" class="input-medium" id="skipPage" data-curr-page="1">页
      </li>
    </ul>
  </div>
  </div>
  <input type="hidden" id="page_count" value="2">
  <input type="hidden" id="page_size" value="14">
    </div>

  </section>
</template>
