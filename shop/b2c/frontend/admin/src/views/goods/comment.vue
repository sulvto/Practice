  <template>

  <section class="ns-base-section">

    <div style="position:relative;margin:0;">
      <!-- 面包屑导航 -->
            <div class="breadcrumb-nav">
        <a href="http://b2c.niuteam.cn/admin.html">单商户B2C</a>
                  <i class="fa fa-angle-right"></i>
          <a href="/goods/goodslist.html">商品</a>
                  <i class="fa fa-angle-right"></i>
          <!-- 需要加跳转链接用这个：http://b2c.niuteam.cn/admin/goods/goodscomment -->
          <a href="javascript:;" style="color:#999;">商品评价</a>
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
                  <p>相关教程：<a href="http://bbs.niushop.com.cn/forum.php?mod=viewthread&amp;tid=2311&amp;extra=page%3D2" target="_blank">http://bbs.niushop.com.cn/forum.php?mod=viewthread&amp;tid=2311&amp;extra=page%3D2</a></p>
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
    <th width="9%" style="text-align:left;">
      <button class="btn-common-delete btn-small" onclick="batchDelete()">批量删除</button>
    </th>
    <th style="line-height:33px;">
      评价时间：
      <input type="text" id="startDate" class="middle input-common" placeholder="请选择开始日期" onclick="WdatePicker()">
      &nbsp;-&nbsp;
      <input type="text" id="endDate" placeholder="请选择结束日期" class="middle input-common" onclick="WdatePicker()">

      <button class="btn-common-white more-search"><i class="fa fa-chevron-down"></i></button>
      <button class="btn-common" onclick="LoadingInfo(1)">搜索</button>
      <!-- 更多搜索 -->
      <div class="more-search-container">
        <dl>
          <dt>评价用户：</dt>
          <dd><input id="member_name" class="middle input-common" type="text" placeholder="请输入用户名称"></dd>
        </dl>
        <dl>
          <dt>评价类型：</dt>
          <dd>
            <div class="selectric-wrapper selectric-select-common selectric-middle" style="width: 150px;"><div class="selectric-hide-select"><select id="explain_type" class="select-common middle" tabindex="-1">
              <option value="">全部</option>
              <option value="1">好评</option>
              <option value="2">中评</option>
              <option value="3">差评</option>
            </select></div><div class="selectric"><span class="selectric-label">全部</span><button class="selectric-button">▾</button></div><div class="selectric-items" tabindex="-1"><div class="selectric-scroll"><ul><li data-index="0" class="selected" title="全部">全部</li><li data-index="1" class="" title="好评">好评</li><li data-index="2" class="" title="中评">中评</li><li data-index="3" class="last" title="差评">差评</li></ul></div></div><input class="selectric-input" tabindex="0"></div>
          </dd>
        </dl>
        <dl>
          <dt></dt>
          <dd><button class="btn-common" onclick="LoadingInfo(1)">完成</button></dd>
        </dl>
      </div>
    </th>
  </tr>
  </tbody></table>
  <table class="table-class">
  <colgroup>
    <col style="width: 2%;">
    <col style="width: 14%;">
    <col style="width: 30%;">
    <col style="width: 19%;">
    <col style="width: 25%;">
    <col style="width: 10%;">
  </colgroup>
  <tbody>
    <tr class="table-title" style="background: white; z-index: 10; border: 1px solid #E3E3E3;">
      <th style="text-align: center;">
        <i class="checkbox-common"><input onclick="CheckAll(this)" type="checkbox"></i>
        <!-- <span style="display: inline-block; margin-left: 0px; margin-right: 10px; font-weight: 400;">全选</span> -->
      </th>
      <th colspan="2" style="text-align: left;padding-left: 35px;">商品</th>
      <th style="text-align: left;">评价信息</th>
      <th colspan="1" style="text-align: center;">评价时间</th>
      <th style=" text-align: center;">操作</th>
    </tr>
  </tbody>
  <tbody id="productTbody" style="border: 0;"><tr class="tr-title"><td style="text-align:center;" rowspan="3"><i class="checkbox-common"><input value="17" name="sub" type="checkbox"></i></td><td colspan="2" style="padding-left:35px;border-left:1px solid #e5e5e5;"><div class="pro-code"><a href="http://b2c.niuteam.cn/goods/goodsinfo?goodsid=75" target="_blank"><span style="margin-right:5px;width:60px;float:left;"><img src="/upload/goods/20180606/f1c9c846cdd1f65df52deed3ec4cd2c5.jpg" style="width:60px;height:60px;"></span><span>美国Elta MD无油防晒霜 全身脸部清爽痘皮敏感肌隔离防晒乳 SPF45-副本</span></a></div></td><td><span class="pro-code">评价用户： 3452101</span><br><span class="pro-code">用户评价： 差评</span><br><span class="pro-code">用户评分： 1分</span></td><td align="center"><span class="pro-code">评价时间：2018-08-18 10:55:16</span></td><td style="text-align:center;"><a href="javascript:;" title="点击隐藏" onclick="setEvaluteShowStatuAjax(17);">隐藏</a><a href="javascript:void(0)" data-placement="bottom" onclick="deleteEvaluate(17)" data-original-title="删除"><span class="del" style="display: inline-block;"><i class="icon-trash" style="width: initial;"></i>删除</span></a></td></tr><tr><td colspan="4" style="background: white;"><p><span class="content-left">评价内容:</span><span class="evaluate_content content">不好用啊  夏促不卖了</span></p></td><td style="background: white;"><div class="bs-docs-example tooltip-demo" style="text-align: center;"><a href="javascript:;" data-placement="bottom" data-original-title="回复"><span class="edit" onclick="replyevaluate(17,this)"><i class="icon-edit" style="width: initial;"></i>回复</span></a></div></td></tr><tr><td colspan="4" style="background: white;"><p><span class="content-left">追评内容:</span><span class="evaluate_content content">超级不好用</span></p></td><td style="background: white;"><div style="text-align: center;"><a href="javascript:;" data-placement="bottom" data-original-title="回复"><span class="edit" onclick="replyevaluateAgain(17,this)"><i class="icon-edit" style="width: initial;"></i>回复</span></a></div></td></tr><tr class="tr-title"><td style="text-align:center;" rowspan="3"><i class="checkbox-common"><input value="16" name="sub" type="checkbox"></i></td><td colspan="2" style="padding-left:35px;border-left:1px solid #e5e5e5;"><div class="pro-code"><a href="http://b2c.niuteam.cn/goods/goodsinfo?goodsid=161" target="_blank"><span style="margin-right:5px;width:60px;float:left;"><img src="/upload/goods/20180718/7770f4e1848a6abef1c58a5dfdcb2290.jpg" style="width:60px;height:60px;"></span><span>TV1233213-副本</span></a></div></td><td><span class="pro-code">评价用户： zhuzhu</span><br><span class="pro-code">用户评价： 好评</span><br><span class="pro-code">用户评分： 5分</span></td><td align="center"><span class="pro-code">评价时间：2018-08-09 17:41:29</span></td><td style="text-align:center;"><a href="javascript:;" title="点击显示" onclick="setEvaluteShowStatuAjax(16);">显示</a><a href="javascript:void(0)" data-placement="bottom" onclick="deleteEvaluate(16)" data-original-title="删除"><span class="del" style="display: inline-block;"><i class="icon-trash" style="width: initial;"></i>删除</span></a></td></tr><tr><td colspan="4" style="background: white;"><p><span class="content-left">评价内容:</span><span class="evaluate_content content">111</span></p></td><td style="background: white;"><div class="bs-docs-example tooltip-demo" style="text-align: center;"><a href="javascript:;" data-placement="bottom" data-original-title="回复"><span class="edit" onclick="replyevaluate(16,this)"><i class="icon-edit" style="width: initial;"></i>回复</span></a></div></td></tr><tr><td colspan="4" style="background: white;"><p><span class="content-left">追评内容:</span><span class="evaluate_content content">111</span></p><p><span class="content-left">追评回复:</span> <span class="evaluate_reply content">123456</span></p></td><td style="background: white;"><div style="text-align: center;"><a href="javascript:;" data-placement="bottom" data-original-title="回复"><span class="edit" onclick="replyevaluateAgain(16,this)"><i class="icon-edit" style="width: initial;"></i>回复</span></a></div></td></tr><tr class="tr-title"><td style="text-align:center;" rowspan="2"><i class="checkbox-common"><input value="15" name="sub" type="checkbox"></i></td><td colspan="2" style="padding-left:35px;border-left:1px solid #e5e5e5;"><div class="pro-code"><a href="http://b2c.niuteam.cn/goods/goodsinfo?goodsid=110" target="_blank"><span style="margin-right:5px;width:60px;float:left;"><img src="/upload/goods/20180623/f3c82770a89161bfef44d156e73647d9.jpeg" style="width:60px;height:60px;"></span><span>撒旦撒旦撒旦撒旦</span></a></div></td><td><span class="pro-code">评价用户： wzz246513</span><br><span class="pro-code">用户评价： 好评</span><br><span class="pro-code">用户评分： 5分</span></td><td align="center"><span class="pro-code">评价时间：2018-08-06 14:02:02</span></td><td style="text-align:center;"><a href="javascript:;" title="点击隐藏" onclick="setEvaluteShowStatuAjax(15);">隐藏</a><a href="javascript:void(0)" data-placement="bottom" onclick="deleteEvaluate(15)" data-original-title="删除"><span class="del" style="display: inline-block;"><i class="icon-trash" style="width: initial;"></i>删除</span></a></td></tr><tr><td colspan="4" style="background: white;"><p><span class="content-left">评价内容:</span><span class="evaluate_content content">1111111111111</span></p><p><span class="content-left">回复内容:</span> <span class="evaluate_reply content">谢谢请的评价，好平啊</span></p></td><td style="background: white;"><div class="bs-docs-example tooltip-demo" style="text-align: center;"><a href="javascript:;" data-placement="bottom" data-original-title="回复"><span class="edit" onclick="replyevaluate(15,this)"><i class="icon-edit" style="width: initial;"></i>回复</span></a></div></td></tr><tr class="tr-title"><td style="text-align:center;" rowspan="2"><i class="checkbox-common"><input value="14" name="sub" type="checkbox"></i></td><td colspan="2" style="padding-left:35px;border-left:1px solid #e5e5e5;"><div class="pro-code"><a href="http://b2c.niuteam.cn/goods/goodsinfo?goodsid=73" target="_blank"><span style="margin-right:5px;width:60px;float:left;"><img src="/upload/goods/20180606/3f4f7b96dd4d77b2ce6029c7ee91943a.jpg" style="width:60px;height:60px;"></span><span>宝格丽（BVLGARI） 宝格丽大吉岭茶男士淡香水浓情版 100ml</span></a></div></td><td><span class="pro-code">评价用户： niushop</span><br><span class="pro-code">用户评价： 好评</span><br><span class="pro-code">用户评分： 5分</span></td><td align="center"><span class="pro-code">评价时间：2018-08-06 10:42:28</span></td><td style="text-align:center;"><a href="javascript:;" title="点击隐藏" onclick="setEvaluteShowStatuAjax(14);">隐藏</a><a href="javascript:void(0)" data-placement="bottom" onclick="deleteEvaluate(14)" data-original-title="删除"><span class="del" style="display: inline-block;"><i class="icon-trash" style="width: initial;"></i>删除</span></a></td></tr><tr><td colspan="4" style="background: white;"><p><span class="content-left">评价内容:</span><span class="evaluate_content content">123浅色的</span></p></td><td style="background: white;"><div class="bs-docs-example tooltip-demo" style="text-align: center;"><a href="javascript:;" data-placement="bottom" data-original-title="回复"><span class="edit" onclick="replyevaluate(14,this)"><i class="icon-edit" style="width: initial;"></i>回复</span></a></div></td></tr><tr class="tr-title"><td style="text-align:center;" rowspan="2"><i class="checkbox-common"><input value="11" name="sub" type="checkbox"></i></td><td colspan="2" style="padding-left:35px;border-left:1px solid #e5e5e5;"><div class="pro-code"><a href="http://b2c.niuteam.cn/goods/goodsinfo?goodsid=72" target="_blank"><span style="margin-right:5px;width:60px;float:left;"><img src="/upload/goods/20180606/ec88992ca6673fe705cff0b9d1f68a29.jpg" style="width:60px;height:60px;"></span><span>20180606【正宗三华李】+果实饱满 现摘现发+1份2斤装（±0.2）</span></a></div></td><td><span class="pro-code">评价用户： 111aaa</span><br><span class="pro-code">用户评价： 好评</span><br><span class="pro-code">用户评分： 5分</span></td><td align="center"><span class="pro-code">评价时间：2018-08-02 15:44:36</span></td><td style="text-align:center;"><a href="javascript:;" title="点击隐藏" onclick="setEvaluteShowStatuAjax(11);">隐藏</a><a href="javascript:void(0)" data-placement="bottom" onclick="deleteEvaluate(11)" data-original-title="删除"><span class="del" style="display: inline-block;"><i class="icon-trash" style="width: initial;"></i>删除</span></a></td></tr><tr><td colspan="4" style="background: white;"><p><span class="content-left">评价内容:</span><span class="evaluate_content content">123123</span></p><p><span class="content-left">回复内容:</span> <span class="evaluate_reply content">asdqdasd</span></p></td><td style="background: white;"><div class="bs-docs-example tooltip-demo" style="text-align: center;"><a href="javascript:;" data-placement="bottom" data-original-title="回复"><span class="edit" onclick="replyevaluate(11,this)"><i class="icon-edit" style="width: initial;"></i>回复</span></a></div></td></tr><tr class="tr-title"><td style="text-align:center;" rowspan="2"><i class="checkbox-common"><input value="12" name="sub" type="checkbox"></i></td><td colspan="2" style="padding-left:35px;border-left:1px solid #e5e5e5;"><div class="pro-code"><a href="http://b2c.niuteam.cn/goods/goodsinfo?goodsid=54" target="_blank"><span style="margin-right:5px;width:60px;float:left;"><img src="/upload/goods/1401499342874.jpg" style="width:60px;height:60px;"></span><span>home指纹识别 苹果6s按键贴iphone7plus按键贴5s手机配件可爱卡通</span></a></div></td><td><span class="pro-code">评价用户： 111aaa</span><br><span class="pro-code">用户评价： 好评</span><br><span class="pro-code">用户评分： 5分</span></td><td align="center"><span class="pro-code">评价时间：2018-08-02 15:44:36</span></td><td style="text-align:center;"><a href="javascript:;" title="点击隐藏" onclick="setEvaluteShowStatuAjax(12);">隐藏</a><a href="javascript:void(0)" data-placement="bottom" onclick="deleteEvaluate(12)" data-original-title="删除"><span class="del" style="display: inline-block;"><i class="icon-trash" style="width: initial;"></i>删除</span></a></td></tr><tr><td colspan="4" style="background: white;"><p><span class="content-left">评价内容:</span><span class="evaluate_content content">123123</span></p></td><td style="background: white;"><div class="bs-docs-example tooltip-demo" style="text-align: center;"><a href="javascript:;" data-placement="bottom" data-original-title="回复"><span class="edit" onclick="replyevaluate(12,this)"><i class="icon-edit" style="width: initial;"></i>回复</span></a></div></td></tr><tr class="tr-title"><td style="text-align:center;" rowspan="2"><i class="checkbox-common"><input value="13" name="sub" type="checkbox"></i></td><td colspan="2" style="padding-left:35px;border-left:1px solid #e5e5e5;"><div class="pro-code"><a href="http://b2c.niuteam.cn/goods/goodsinfo?goodsid=51" target="_blank"><span style="margin-right:5px;width:60px;float:left;"><img src="/upload/goods/1301499342509.jpg" style="width:60px;height:60px;"></span><span>古尚古 懒人手机支架 手机通用指环创意卡扣粘贴式全金属卡通配件</span></a></div></td><td><span class="pro-code">评价用户： 111aaa</span><br><span class="pro-code">用户评价： 好评</span><br><span class="pro-code">用户评分： 5分</span></td><td align="center"><span class="pro-code">评价时间：2018-08-02 15:44:36</span></td><td style="text-align:center;"><a href="javascript:;" title="点击隐藏" onclick="setEvaluteShowStatuAjax(13);">隐藏</a><a href="javascript:void(0)" data-placement="bottom" onclick="deleteEvaluate(13)" data-original-title="删除"><span class="del" style="display: inline-block;"><i class="icon-trash" style="width: initial;"></i>删除</span></a></td></tr><tr><td colspan="4" style="background: white;"><p><span class="content-left">评价内容:</span><span class="evaluate_content content">123123</span></p></td><td style="background: white;"><div class="bs-docs-example tooltip-demo" style="text-align: center;"><a href="javascript:;" data-placement="bottom" data-original-title="回复"><span class="edit" onclick="replyevaluate(13,this)"><i class="icon-edit" style="width: initial;"></i>回复</span></a></div></td></tr><tr class="tr-title"><td style="text-align:center;" rowspan="2"><i class="checkbox-common"><input value="10" name="sub" type="checkbox"></i></td><td colspan="2" style="padding-left:35px;border-left:1px solid #e5e5e5;"><div class="pro-code"><a href="http://b2c.niuteam.cn/goods/goodsinfo?goodsid=111" target="_blank"><span style="margin-right:5px;width:60px;float:left;"><img src="/upload/goods/20180622/245eb75dfb11d86cb201ebf185f60f2c.JPG" style="width:60px;height:60px;"></span><span>测试</span></a></div></td><td><span class="pro-code">评价用户： admin</span><br><span class="pro-code">用户评价： 好评</span><br><span class="pro-code">用户评分： 5分</span></td><td align="center"><span class="pro-code">评价时间：2018-07-06 15:12:28</span></td><td style="text-align:center;"><a href="javascript:;" title="点击隐藏" onclick="setEvaluteShowStatuAjax(10);">隐藏</a><a href="javascript:void(0)" data-placement="bottom" onclick="deleteEvaluate(10)" data-original-title="删除"><span class="del" style="display: inline-block;"><i class="icon-trash" style="width: initial;"></i>删除</span></a></td></tr><tr><td colspan="4" style="background: white;"><p><span class="content-left">评价内容:</span><span class="evaluate_content content">4</span></p><p><span class="content-left">回复内容:</span> <span class="evaluate_reply content">321</span></p></td><td style="background: white;"><div class="bs-docs-example tooltip-demo" style="text-align: center;"><a href="javascript:;" data-placement="bottom" data-original-title="回复"><span class="edit" onclick="replyevaluate(10,this)"><i class="icon-edit" style="width: initial;"></i>回复</span></a></div></td></tr><tr class="tr-title"><td style="text-align:center;" rowspan="2"><i class="checkbox-common"><input value="9" name="sub" type="checkbox"></i></td><td colspan="2" style="padding-left:35px;border-left:1px solid #e5e5e5;"><div class="pro-code"><a href="http://b2c.niuteam.cn/goods/goodsinfo?goodsid=75" target="_blank"><span style="margin-right:5px;width:60px;float:left;"><img src="/upload/goods/20180606/f1c9c846cdd1f65df52deed3ec4cd2c5.jpg" style="width:60px;height:60px;"></span><span>美国Elta MD无油防晒霜 全身脸部清爽痘皮敏感肌隔离防晒乳 SPF45-副本</span></a></div></td><td><span class="pro-code">评价用户： admin</span><br><span class="pro-code">用户评价： 好评</span><br><span class="pro-code">用户评分： 5分</span></td><td align="center"><span class="pro-code">评价时间：2018-06-25 16:00:01</span></td><td style="text-align:center;"><a href="javascript:;" title="点击隐藏" onclick="setEvaluteShowStatuAjax(9);">隐藏</a><a href="javascript:void(0)" data-placement="bottom" onclick="deleteEvaluate(9)" data-original-title="删除"><span class="del" style="display: inline-block;"><i class="icon-trash" style="width: initial;"></i>删除</span></a></td></tr><tr><td colspan="4" style="background: white;"><p><span class="content-left">评价内容:</span><span class="evaluate_content content">请问</span></p></td><td style="background: white;"><div class="bs-docs-example tooltip-demo" style="text-align: center;"><a href="javascript:;" data-placement="bottom" data-original-title="回复"><span class="edit" onclick="replyevaluate(9,this)"><i class="icon-edit" style="width: initial;"></i>回复</span></a></div></td></tr><tr class="tr-title"><td style="text-align:center;" rowspan="3"><i class="checkbox-common"><input value="8" name="sub" type="checkbox"></i></td><td colspan="2" style="padding-left:35px;border-left:1px solid #e5e5e5;"><div class="pro-code"><a href="http://b2c.niuteam.cn/goods/goodsinfo?goodsid=78" target="_blank"><span style="margin-right:5px;width:60px;float:left;"><img src="/upload/goods/20180609/dd30e9ce6a6f94bb999c76eb9a193dce.png" style="width:60px;height:60px;"></span><span>456</span></a></div></td><td><span class="pro-code">评价用户： admin</span><br><span class="pro-code">用户评价： 好评</span><br><span class="pro-code">用户评分： 5分</span></td><td align="center"><span class="pro-code">评价时间：2018-06-13 10:06:35</span></td><td style="text-align:center;"><a href="javascript:;" title="点击隐藏" onclick="setEvaluteShowStatuAjax(8);">隐藏</a><a href="javascript:void(0)" data-placement="bottom" onclick="deleteEvaluate(8)" data-original-title="删除"><span class="del" style="display: inline-block;"><i class="icon-trash" style="width: initial;"></i>删除</span></a></td></tr><tr><td colspan="4" style="background: white;"><p><span class="content-left">评价内容:</span><span class="evaluate_content content">111</span></p><p><span class="content-left">回复内容:</span> <span class="evaluate_reply content">321321</span></p></td><td style="background: white;"><div class="bs-docs-example tooltip-demo" style="text-align: center;"><a href="javascript:;" data-placement="bottom" data-original-title="回复"><span class="edit" onclick="replyevaluate(8,this)"><i class="icon-edit" style="width: initial;"></i>回复</span></a></div></td></tr><tr><td colspan="4" style="background: white;"><p><span class="content-left">追评内容:</span><span class="evaluate_content content">323223</span><span class="evaluate_content" style="margin-left: 65px; margin-top: 5px;display:block;"><img src="/upload/common/1529777957.jpg" alt="" style="max-height:60px;margin-right:10px;"><img src="/upload/common/1529777960.jpg" alt="" style="max-height:60px;margin-right:10px;"><img src="/upload/common/1529777965.jpg" alt="" style="max-height:60px;margin-right:10px;"></span></p></td><td style="background: white;"><div style="text-align: center;"><a href="javascript:;" data-placement="bottom" data-original-title="回复"><span class="edit" onclick="replyevaluateAgain(8,this)"><i class="icon-edit" style="width: initial;"></i>回复</span></a></div></td></tr></tbody>
  </table>
  <input type="hidden" id="type">
  <input type="hidden" id="replyType">
  <div class="modal fade hide" id="evaluate" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
  <div class="modal-dialog">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
        <h3>评价回复</h3>
      </div>
      <div class="modal-body">
        <div class="modal-infp-style">
          <!-- <table>
            <tr>
              <td id="myModaltype"><b>评价内容：</b></td>
              <td id="evaluate_content"></td>
            </tr>
            <tr>
              <td id="reply">回复内容：</td>
              <td><textarea id="evaluate_reply" style="margin-top: 5px;" class="input-common"></textarea></td>
            </tr>
          </table> -->

          <div class="set-style">
            <dl>
              <dt id="myModaltype">评价内容：</dt>
              <dd id="evaluate_content">
              </dd>
            </dl>
            <dl>
              <dt id="reply">回复内容：</dt>
              <dd>
                <textarea id="evaluate_reply" class="textarea-common"></textarea>
              </dd>
            </dl>
          </div>
        </div>
      </div>

      <div class="modal-footer">
        <input type="hidden" id="evaluate_id">
        <button type="button" class="btn-common btn-big" onclick="replyevaluateAjax()">保存</button>
        <button type="button" class="btn btn-big" data-dismiss="modal">关闭</button>
      </div>
    </div>
  </div>
  </div>

    </div>

  </section>

</template>

<script>
require('@/assets/style/table.scss')

export default {
  name: 'commentList',
  components: {}
}
</script>
