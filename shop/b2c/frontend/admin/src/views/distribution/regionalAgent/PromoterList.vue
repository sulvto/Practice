<template>
  <section class="ns-base-section">

    <div class="ns-main">

  <table class="mytable">
  <tbody><tr>
    <th>
      申请时间：
      <input type="text" id="startDate" class="input-common middle" placeholder="请选择开始日期" onclick="WdatePicker()">
      &nbsp;-&nbsp;
      <input type="text" id="endDate" placeholder="请选择结束日期" class="input-common middle" onclick="WdatePicker()">
      用户姓名：<input id="userName" class="input-common middle" type="text" value="">
      代理类型：
      <div class="selectric-wrapper selectric-select-common selectric-middle" style="width: 150px;"><div class="selectric-hide-select"><select id="agent_type" class="select-common middle" tabindex="-1">
        <option value="0">默认</option>
        <option value="1">省代理</option>
        <option value="2">市代理</option>
        <option value="3">区代理</option>
      </select></div><div class="selectric"><span class="selectric-label">默认</span><button class="selectric-button">▾</button></div><div class="selectric-items" tabindex="-1"><div class="selectric-scroll"><ul><li data-index="0" class="selected" title="默认">默认</li><li data-index="1" class="" title="省代理">省代理</li><li data-index="2" class="" title="市代理">市代理</li><li data-index="3" class="last" title="区代理">区代理</li></ul></div></div><input class="selectric-input" tabindex="0"></div>
      状态：
      <div class="selectric-wrapper selectric-select-common selectric-middle" style="width: 150px;"><div class="selectric-hide-select"><select id="is_audit" class="select-common middle" tabindex="-1">
        <option value="10">--选择状态--</option>
        <option value="0">待审核</option>
        <option value="1">通过</option>
        <option value="-1">审核未通过</option>
        <option value="2">取消</option>
      </select></div><div class="selectric"><span class="selectric-label">--选择状态--</span><button class="selectric-button">▾</button></div><div class="selectric-items" tabindex="-1"><div class="selectric-scroll"><ul><li data-index="0" class="selected" title="--选择状态--">--选择状态--</li><li data-index="1" class="" title="待审核">待审核</li><li data-index="2" class="" title="通过">通过</li><li data-index="3" class="" title="审核未通过">审核未通过</li><li data-index="4" class="last" title="取消">取消</li></ul></div></div><input class="selectric-input" tabindex="0"></div>
      <button onclick="searchData()" value="搜索" class="btn-common">搜索</button>
    </th>
  </tr>
  </tbody></table>
  <div class="mod-table">
  <div class="mod-table-head">
    <div class="con style0list">
      <table class="table-class">
        <colgroup>
          <col style="width: 3%;">
          <col style="width: 7%;">
          <col style="width: 7%;">
          <col style="width: 10%;">
          <col style="width: 10%;">
          <col style="width: 10%;">
          <col style="width: 10%;">
          <col style="width: 10%;">
          <col style="width: 7%;">
          <col style="width: 15%;">
          <col style="width: 10%;">

        </colgroup>
        <thead>
          <tr>
            <th><label style="margin-left: 5px;"> <input type="checkbox" onclick="CheckAll(this)"></label></th>
            <th>会员信息</th>
            <th>手机号</th>
            <th>代理类型</th>
            <th>代理省份</th>
            <th>代理市</th>
            <th>代理区县</th>
            <th>联系地址</th>
            <th>状态</th>
            <th>申请时间</th>
            <th>操作</th>
          </tr>
        </thead>
        <colgroup>
          <col style="width: 3%;">
          <col style="width: 7%;">
          <col style="width: 7%;">
          <col style="width: 10%;">
          <col style="width: 10%;">
          <col style="width: 10%;">
          <col style="width: 10%;">
          <col style="width: 7%;">
          <col style="width: 15%;">
          <col style="width: 10%;">
        </colgroup>
        <tbody><tr align="center"><td><div class="cell"><label><input name="sub" type="checkbox" value="4"></label></div></td><td>bbb<br>FX000081</td><td></td><td>市代</td><td>海南省</td><td>海口市</td><td></td><td>广东省中山市请选择区/县</td><td>通过</td><td>2018-09-01 18:36:50</td><td><a href="javascript:void(0);" onclick="promoterEdit(4,21,232,0, 2);">修改</a> <a href="javascript:void(0);" onclick="removeRegionAgent(4);">取消资格</a> </td></tr><tr align="center"><td><div class="cell"><label><input name="sub" type="checkbox" value="3"></label></div></td><td>yyy<br>FX000079</td><td></td><td>省代</td><td>四川省</td><td></td><td></td><td>广东省请选择市选择区/县</td><td>通过</td><td>2018-09-01 18:30:49</td><td><a href="javascript:void(0);" onclick="promoterEdit(3,23,0,0, 1);">修改</a> <a href="javascript:void(0);" onclick="removeRegionAgent(3);">取消资格</a> </td></tr><tr align="center"><td><div class="cell"><label><input name="sub" type="checkbox" value="2"></label></div></td><td>mingbolang<br>FX000072</td><td></td><td>区县代理</td><td>广西壮族自治区</td><td>河池市</td><td>都安瑶族自治县</td><td>广东省东莞市万江区</td><td>通过</td><td>2018-08-20 08:47:45</td><td><a href="javascript:void(0);" onclick="promoterEdit(2,20,229,1961, 3);">修改</a> <a href="javascript:void(0);" onclick="removeRegionAgent(2);">取消资格</a> </td></tr><tr align="center"><td><div class="cell"><label><input name="sub" type="checkbox" value="1"></label></div></td><td>mingbolang<br>FX000072</td><td></td><td>区县代理</td><td></td><td></td><td></td><td>广东省广州市增城市</td><td>审核未通过</td><td>2018-08-20 08:43:50</td><td></td></tr></tbody>
      </table>
    </div>
  </div>
  </div>

  <!-- 审核区域代理 -->
  <div class="modal hide" id="editArea" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
                <h4 class="modal-title" id="myModalLabel">分配代理区域</h4>
            </div>
            <div class="modal-body">
              <div class="modal-div">
                <input type="hidden" id="region_agent_id" value="">
                <dl class="modal-dl">
                  <dt>省:</dt>
                  <dd>
                    <select id="province">
                      <option value="0">--请选择省--</option>
                    <option value=" 35">hai</option><option value=" 20">广西壮族自治区</option><option value=" 21">海南省</option><option value=" 22">重庆市</option><option value=" 23">四川省</option><option value=" 24">贵州省</option><option value=" 25">云南省</option><option value=" 26">西藏自治区</option><option value=" 27">陕西省</option><option value=" 28">甘肃省</option><option value=" 29">青海省</option><option value=" 30">宁夏回族自治区</option><option value=" 31">新疆维吾尔自治区</option><option value=" 32">香港特别行政区</option><option value=" 33">澳门特别行政区</option><option value=" 34">台湾省</option><option value=" 19">广东省</option><option value=" 18">湖南省</option><option value=" 17">湖北省</option><option value=" 2">天津市</option><option value=" 3">河北省</option><option value=" 4">山西省</option><option value=" 5">内蒙古自治区</option><option value=" 6">辽宁省</option><option value=" 7">吉林省</option><option value=" 8">黑龙江省</option><option value=" 9">上海市</option><option value=" 10">江苏省</option><option value=" 11">浙江省</option><option value=" 12">安徽省</option><option value=" 13">福建省</option><option value=" 14">江西省</option><option value=" 15">山东省</option><option value=" 16">河南省</option><option value=" 1">北京市</option></select>
                  </dd>
                </dl>
          <dl class="modal-dl" id="city_box">
                  <dt>市:</dt>
                  <dd>
                    <select id="city">
                      <option value="0">--请选择市--</option>

                    </select>
                  </dd>
                </dl>
                <dl class="modal-dl" id="district_box">
                  <dt>县:</dt>
                  <dd>
                    <select id="district">
                      <option value="0">--请选择县--</option>
                    </select>
                  </dd>
                </dl>
              </div>
              <input type="hidden" value="" id="agent_type">
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-primary" onclick="regionSure();">提交</button>
                <button type="button" class="btn" data-dismiss="modal">关闭</button>
            </div>
        </div><!-- /.modal-content -->
    </div><!-- /.modal -->
  </div>
    </div>
  </section>
</template>
