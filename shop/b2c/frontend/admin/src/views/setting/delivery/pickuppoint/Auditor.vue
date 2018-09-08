<template>
  <section class="ns-base-section">

    <div style="position:relative;margin:0;">
            <!-- 面包屑导航 -->
            <div class="breadcrumb-nav">
                <a href="index.html">零基础学IT就来</a>
            </div>
            <!-- 三级导航菜单 -->

            <nav class="ns-third-menu">
                <ul>
                    <li onclick="location.href='/express/expresscompany.html';">物流配送</li>
                    <li class="selected" onclick="location.href='/shop/pickuppointlist.html';">门店自提</li>
                    <li onclick="location.href='/distribution/distributionuserlist.html';">本地配送</li>
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

            <div class="space-10"></div>
            <div class="ncsc-form-goods">
                <nav class="goods-nav">
                    <ul>
                        <li><a href="/shop/pickuppointlist.html" child_id="1">门店管理</a></li>
                        <li><a href="/shop/pickuppointfreight.html" child_id="3">门店运费</a></li>
                        <li class="selected"><a href="/shop/pickupAuditorList.html" child_id="4">门店审核人员管理</a></li>
                    </ul>
                </nav>
                <div class="mod-table">
                    <div class="mod-table-head">
                        <table class="mytable">
                            <tbody>
                                <tr>
                                <td width="20%" style="text-align: left;padding-top: 0;">
                                    <button style="margin:0 5px 0 0 !important;" class="btn-common-delete btn-small" onclick="batchDelete()">批量删除</button>
                                </td>
                            </tr>
                            </tbody>
                        </table>

                        <div class="con style0list">
                            <table class="table-class" id="personList">
                                <colgroup>
                                    <col style="width: 2%;">
                                    <col style="width: 42%;">
                                    <col style="width: 30%;">
                                    <col style="width: 16%;">
                                    <col style="width: 10%;">
                                </colgroup>
                                <thead>
                                    <tr align="center">
                                        <th><i class="checkbox-common"><input type="checkbox" onclick="CheckAll(this)"></i></th>
                                        <th align="left">审核人员昵称</th>
                                        <th align="left">所属门店</th>
                                        <th>创建时间</th>
                                        <th>操作</th>
                                    </tr>
                                </thead>
                                <tbody><tr align="center"><td colspan="4">暂无符合条件的数据记录</td></tr></tbody>
                            </table>
                        </div>
                    </div>
                </div>
            </div>

    </div>

  </section>
</template>
