<template>
  <section class="ns-base-section">
  <div class="ns-main">

  <div class="space-10"></div>
  <div class="ncsc-form-goods">
  <nav class="goods-nav">
  <ul>
                <li><a href="/express/expresscompany.html" child_id="1">物流公司</a></li>
                  <li class="selected"><a href="/config/areamanagement.html" child_id="2">地区管理</a></li>
                    <li><a href="/order/returnsetting.html" child_id="3">商家地址</a></li>
                    <li><a href="/config/distributionareamanagement.html" child_id="4">货到付款地区管理</a></li>
                    <li><a href="/config/expressmessage.html" child_id="5">物流跟踪设置</a></li>

  </ul>
  </nav>
  <!-- 基础设置 -->

  <div class="mod-table">
  <div class="mod-table-head">
  <!-- 地区表格 -->
  <div class="options-btn">
  <button class="btn-common" onclick="addProvince()">添加一级地区</button>
  </div>
  <table class="table-class">
  <colgroup>
    <col style="width: 2%">
    <col style="width: 53%;">
    <col style="width: 20%;">
    <col style="width: 10%;">
    <col style="width: 5%;">
    <col style="width: 10%;">
  </colgroup>
  <thead>
    <tr align="center">
      <th></th>
      <th align="left">名称</th>
      <th align="left">所属区域</th>
      <th align="left">添加子地区</th>
      <th>排序</th>
      <th>操作</th>
    </tr>
  </thead>
  </table>
  </div>
  </div>
  </div>

  <!-- 地区父级id隐藏域 -->
  <input type="hidden" id="pid" value="0" class="">
  <!-- 弹框类型控制隐藏域 -->
  <input type="hidden" id="type" class="">
  <input type="hidden" id="event" class="">
  <!-- 地区添加与修改模态框 -->
  <div class="modal fade hide" id="evaluate" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
  <div class="modal-dialog">
  <div class="modal-content">
    <div class="modal-header">
      <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
      <h3>添加子地区</h3>
    </div>
    <div class="modal-body">
      <table class="table-class">
        <tbody><tr id="superiorRegionTr">
          <td id="myModaltype" align="right">上级地区：</td>
          <td><input type="text" id="superiorRegion" disabled="disabled" superiorregionid="" class="input-common"></td>
        </tr>
        <tr>
          <td align="right"><span style="color:red;margin-right:10px;">*</span>地区名称：</td>
          <td><input type="text" id="regionName" style="margin-bottom: 5px;" class="input-common"></td>
        </tr>
        <tr class="js-area-select">
          <td align="right">所属区域：</td>
          <td>
            <div class="selectric-wrapper selectric-select-common" style="width: 250px;"><div class="selectric-hide-select"><select id="area_select" class="select-common" tabindex="-1">
                              <option value="1">华东</option>
                              <option value="2">华北</option>
                              <option value="3">华南</option>
                              <option value="4">华中</option>
                              <option value="5">东北</option>
                              <option value="6">西北</option>
                              <option value="7">西南</option>
                              <option value="8">港澳台</option>
                            </select></div><div class="selectric"><span class="selectric-label">华东</span><button class="selectric-button">▾</button></div><div class="selectric-items" tabindex="-1"><div class="selectric-scroll"><ul><li data-index="0" class="selected" title="华东">华东</li><li data-index="1" class="" title="华北">华北</li><li data-index="2" class="" title="华南">华南</li><li data-index="3" class="" title="华中">华中</li><li data-index="4" class="" title="东北">东北</li><li data-index="5" class="" title="西北">西北</li><li data-index="6" class="" title="西南">西南</li><li data-index="7" class="last" title="港澳台">港澳台</li></ul></div></div><input class="selectric-input" tabindex="0"></div>
          </td>
        </tr>
        <tr id="zipcode">
          <td align="right">邮政编码：</td>
          <td><input type="text" id="zipcodeVal" maxlength="6" onkeyup="this.value=this.value.replace(/\D/g,'')" class="input-common"></td>
        </tr>
        <tr>
          <td align="right">排序：</td>
          <td><input type="number" id="regionSort" onkeyup="this.value=this.value.replace(/\D/g,'')" class="input-common harf"></td>
        </tr>
      </tbody></table>
    </div>
    <div class="modal-footer">
      <input type="hidden" id="evaluate_id">
      <button type="button" class="btn-common btn-big" onclick="addOrUpdateAjax()">保存</button>
      <button type="button" class="btn-common-cancle btn-big" data-dismiss="modal">关闭</button>
    </div>
  </div>
  </div>
  </div>

  <div class="page" id="turn-ul" style="display: none;">
  <div class="pagination">
  <ul>
    <li class="according-number">每页显示<input type="text" class="input-medium" id="showNumber" value="14" data-default="14" autocomplete="off">条</li>
    <li><a id="beginPage" class="page-disable" style="border: 1px solid #dddddd;">首页</a></li>
    <li><a id="prevPage" class="page-disable">上一页</a></li>
    <li id="pageNumber"></li>
    <li id="JslastPage">

    </li>
    <li><a id="nextPage">下一页</a></li>
    <li><a id="lastPage">末页</a></li>
    <li class="total-data">共0条</li>
    <!-- <li class="page-count">共0页</li> -->
    <li class="according-number">
      跳<input type="text" class="input-medium" id="skipPage" data-curr-page="1">页
    </li>
  </ul>
  </div>
  </div>
  <input type="hidden" id="page_count" class="">
  <input type="hidden" id="page_size" class="">
  </div>

  </section>

</template>
