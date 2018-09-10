<template>
  <section class="ns-base-section">

    <div class="ns-main">

  <table class="mytable">
  <tbody><tr>
    <th>
      审核状态：
      <div class="selectric-wrapper selectric-select-common selectric-middle" style="width: 150px;"><div class="selectric-hide-select"><select id="is_audit" class="select-common middle" tabindex="-1">
        <option value="">全部</option>
        <option value="0">审核中</option>
        <option value="-1">已拒绝</option>
        <option value="1">已通过</option>
      </select></div><div class="selectric"><span class="selectric-label">全部</span><button class="selectric-button">▾</button></div><div class="selectric-items" tabindex="-1"><div class="selectric-scroll"><ul><li data-index="0" class="selected" title="全部">全部</li><li data-index="1" class="" title="审核中">审核中</li><li data-index="2" class="" title="已拒绝">已拒绝</li><li data-index="3" class="last" title="已通过">已通过</li></ul></div></div><input class="selectric-input" tabindex="0"></div>
      用户姓名：<input id="userName" class="input-common middle" type="text" value="">
      <button onclick="searchData()" value="搜索" class="btn-common">搜索</button>
    </th>
  </tr>
  </tbody></table>
  <div class="mod-table">
  <div class="mod-table-head">
    <div class="con style0list">
      <table class="table-class">
        <colgroup>
          <col style="width: 5%;">
          <col style="width: 15%;">
          <col style="width: 10%;">
          <col style="width: 12%;">
          <col style="width: 12%;">
          <col style="width: 8%;">
          <col style="width: 13%;">
          <col style="width: 25%;">
        </colgroup>
        <thead>
          <tr>
            <th><label style="margin-left: 5px;"> <input type="checkbox" onclick="CheckAll(this)"></label></th>
            <th>推广员</th>
            <th>股东等级</th>
            <th>手机号</th>
            <th>上级股东名称</th>
            <th>状态</th>
            <th>申请时间</th>
            <th>操作</th>
          </tr>
        </thead>

        <tbody><tr align="center"><td><div class="cell"><label><input name="sub" type="checkbox" value="3"></label></div></td><td>wanglei<br>FX000087</td><td>初级股东</td><td></td><td></td><td>审核中</td><td>2018-09-07 10:46:37</td><td>&nbsp;&nbsp;<a href="javascript:void(0);" onclick="audit(3,1,110);">通过</a>&nbsp;&nbsp;<a href="javascript:void(0);" onclick="audit(3,-1,110);">拒绝</a></td></tr><tr align="center"><td><div class="cell"><label><input name="sub" type="checkbox" value="2"></label></div></td><td>yyy<br>FX000079</td><td>中级股东</td><td></td><td></td><td>已通过</td><td>2018-09-01 18:27:39</td><td><a href="javascript:void(0);" onclick="modifyPartnerLock(2,1)">冻结</a>&nbsp;&nbsp;<a href="javascript:void(0);" onclick="showPartnerLevelBox(100,8)">修改等级</a></td></tr><tr align="center"><td><div class="cell"><label><input name="sub" type="checkbox" value="1"></label></div></td><td>admin<br>FX000003</td><td>初级股东</td><td></td><td></td><td>已通过</td><td>2018-08-10 23:12:29</td><td><a href="javascript:void(0);" onclick="modifyPartnerLock(1,1)">冻结</a>&nbsp;&nbsp;<a href="javascript:void(0);" onclick="showPartnerLevelBox(3,7)">修改等级</a></td></tr></tbody>
      </table>
    </div>
  </div>
  </div>

  <!-- 修改股东用户等级（Modal）开始 -->
  <div class="modal hide" id="editPartnerLevel" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true" style="width:800px;">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
                <h3 class="modal-title" id="myModalLabel">商品分销设定</h3>
            </div>

            <div class="modal-body">
              <div class="set-style">
                <input type="hidden" id="uid" value="">
                <dl>
            <dt>用户等级:</dt>
            <dd>
              <p>
                <select id="level_id">
                                    <option value="7">初级股东</option>
                                    <option value="8">中级股东</option>
                                  </select>
              </p>
            </dd>
          </dl>
        </div>
      </div>
      <div class="modal-footer">
        <button type="button" class="btn-common btn-big" onclick="modifyPartnerLevelNum();">修改</button>
        <button type="button" class="btn-common-cancle btn-big" data-dismiss="modal">关闭</button>
      </div>
    </div><!-- /.modal-content -->
  </div><!-- /.modal -->
  </div>

  <!-- 修改上级（Modal）开始 -->
  <div class="modal hide" id="editParent" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
                <h3 class="modal-title" id="myModalLabel">股东上级修改</h3>
            </div>
            <div class="modal-body">
              <div class="modal-div">
                <input type="hidden" id="partner_id" value="">
                <input type="hidden" id="shop_id" value="">
                <dl class="modal-dl">
                  <dt>上级股东编号:</dt>
                  <dd>
                    <input type="text" id="parent_no" value="">
                    <span id="ever_parent_promoter"></span>
                  </dd>
                </dl>
              </div>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn-common btn-big" onclick="modifyPromoterParent();">修改</button>
                <button type="button" class="btn-common-cancle btn-big" data-dismiss="modal">关闭</button>
            </div>
        </div><!-- /.modal-content -->
    </div><!-- /.modal -->
  </div>

    </div>

  </section>
</template>
