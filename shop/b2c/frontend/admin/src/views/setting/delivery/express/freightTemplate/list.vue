<template>
  <section class="ns-base-section">

    <div style="position:relative;margin:0;">
      <!-- 面包屑导航 -->
            <div class="breadcrumb-nav">
        <a href="http://showfx.niuteam.cn/admin.html"></a>
                  <i class="fa fa-angle-right"></i>
          <a href="http://showfx.niuteam.cn/admin/config/webconfig.html">设置</a>
                  <i class="fa fa-angle-right"></i>
          <!-- 需要加跳转链接用这个：http://showfx.niuteam.cn/admin/express/freighttemplatelist -->
          <a href="javascript:;" style="color:#999;">运费模板列表</a>
              </div>
            <!-- 三级导航菜单 -->

      <div class="right-side-operation">
        <ul>

  <!-- 					style="display:none;" style="display:block;" -->
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

    <!-- 操作提示 -->

  <!-- 		 -->
    <div class="ns-warm-prompt" style="display:none;">
      <div class="alert alert-info">
        <button type="button" class="close">×</button>
        <h4>

        </h4>
      </div>
    </div>


    <div class="ns-main">

  <div class="options-btn">
  <button class="btn-common-delete" onclick="batchDelete()" style="margin:0 !important;">批量删除</button>
  <button class="btn-common" onclick="location.href='http://showfx.niuteam.cn/admin/express/freighttemplateedit.html?co_id=4';">添加模板</button>
  </div>
  <table class="list">
  <colgroup>
    <col style="width: 10%;">
    <col style="width: 20%;">
    <col style="width: 20%;">
    <col style="width: 20%;">
    <col style="width: 20%;">
    <col style="width: 10%;">
  </colgroup>
  <tbody><tr class="head">
  <td colspan="6">
        <input type="checkbox" value="12" name="sub" id="12">
        <label for="12">565656</label>
    <div>
      <a href="http://showfx.niuteam.cn/admin/express/freighttemplateedit.html?shipping_fee_id=12&amp;co_id=4">编辑</a>
            <a href="javascript:;" onclick="freightTemplateDelete(12)">删除</a>
          </div>
  </td>
  </tr>
  <tr class="address">
  <td colspan="6">
      <span>广东省</span>
        <button data-msg="<header>
            <span>565656</span>
            <i>x</i>
        </header>
        <article style='margin-top:40px;overflow: auto;height: 360px;'>
                <div>
          <h3>广东省</h3>
          <ul>
                      <li>东莞市</li>
                    </ul>
        </div>
                </article>
        ">查看详情</button>
    </td>
  </tr>

  <tr>
  <td align="center">按件数</td>
  <td class="info">
    <label>首件(件)：</label>
    <span>3</span>
  </td>
  <td class="info">
    <label>首件运费(元)：</label>
    <span>3.00</span>
  </td>
  <td class="info">
    <label>续件(件)：</label>
    <span>1</span>
  </td>
  <td class="info">
    <label>续件运费(元)：</label>
    <span>1.00</span>
  </td>
  <td align="center">
          <span class="status-enable">启用</span>
      </td>
  </tr>

  <tr>
  <td align="center">按重量</td>
  <td class="info">
    <label>首重(kg)：</label>
    <span>0.00</span>
  </td>
  <td class="info">
    <label>首重运费(元)：</label>
    <span>0.00</span>
  </td>
  <td class="info">
    <label>续重(kg)：</label>
    <span>0.00</span>
  </td>
  <td class="info">
    <label>续重运费(元)：</label>
    <span>0.00</span>
  </td>
  <td align="center">
          <span class="status-close">停用</span>
      </td>
  </tr>

  <tr>
  <td align="center">按体积</td>
  <td class="info">
    <label>首体积量(m³)：</label>
    <span>0.00</span>
  </td>
  <td class="info">
    <label>首体积运费(元)：</label>
    <span>0.00</span>
  </td>
  <td class="info">
    <label>续体积量(m³)：</label>
    <span>0.00</span>
  </td>
  <td class="info">
    <label>续体积运费(元)：</label>
    <span>0.00</span>
  </td>
  <td align="center">
          <span class="status-close">停用</span>
      </td>
  </tr>

  <tr class="head">
  <td colspan="6">
        <input type="checkbox" value="3" name="sub" id="3">
        <label for="3">百世快递</label>
    <div>
      <a href="http://showfx.niuteam.cn/admin/express/freighttemplateedit.html?shipping_fee_id=3&amp;co_id=4">编辑</a>
            <a href="javascript:;" onclick="freightTemplateDelete(3)">删除</a>
          </div>
  </td>
  </tr>
  <tr class="address">
  <td colspan="6">
      <span>宁夏回族自治区</span>
        <span>湖北省</span>
        <span>湖南省</span>
        <span>广东省</span>
        <span>广西壮族自治区</span>
        <span>海南省</span>
        <span>重庆市</span>
        <span>四川省</span>
        <span>贵州省</span>
        <span>云南省</span>
        <span>陕西省</span>
        <span>甘肃省</span>
        <span>青海省</span>
        <span>河南省</span>
        <span>山东省</span>
        <span>江西省</span>
        <span>天津市</span>
        <span>河北省</span>
        <span>山西省</span>
        <span>内蒙古自治区</span>
        <span>辽宁省</span>
        <span>吉林省</span>
        <span>黑龙江省</span>
        <span>上海市</span>
        <span>江苏省</span>
        <span>浙江省</span>
        <span>安徽省</span>
        <span>福建省</span>
        <span>北京市</span>

    </td>
  </tr>

  <tr>
  <td align="center">按件数</td>
  <td class="info">
    <label>首件(件)：</label>
    <span>0</span>
  </td>
  <td class="info">
    <label>首件运费(元)：</label>
    <span>0.00</span>
  </td>
  <td class="info">
    <label>续件(件)：</label>
    <span>0</span>
  </td>
  <td class="info">
    <label>续件运费(元)：</label>
    <span>0.00</span>
  </td>
  <td align="center">
          <span class="status-close">停用</span>
      </td>
  </tr>

  <tr>
  <td align="center">按重量</td>
  <td class="info">
    <label>首重(kg)：</label>
    <span>1.00</span>
  </td>
  <td class="info">
    <label>首重运费(元)：</label>
    <span>0.00</span>
  </td>
  <td class="info">
    <label>续重(kg)：</label>
    <span>1.00</span>
  </td>
  <td class="info">
    <label>续重运费(元)：</label>
    <span>0.00</span>
  </td>
  <td align="center">
          <span class="status-enable">启用</span>
      </td>
  </tr>

  <tr>
  <td align="center">按体积</td>
  <td class="info">
    <label>首体积量(m³)：</label>
    <span>0.00</span>
  </td>
  <td class="info">
    <label>首体积运费(元)：</label>
    <span>0.00</span>
  </td>
  <td class="info">
    <label>续体积量(m³)：</label>
    <span>0.00</span>
  </td>
  <td class="info">
    <label>续体积运费(元)：</label>
    <span>0.00</span>
  </td>
  <td align="center">
          <span class="status-close">停用</span>
      </td>
  </tr>

  <input type="hidden" id="pagecount" value="1">
  <input type="hidden" id="totalcount" value="2">
  <input type="hidden" id="data_length" value="2">
  </tbody>
  </table>
  <div class="mask-layer"></div>
  <div class="mask-address-info" style="top: -48.5px; left: 425.5px;"></div>
  <input type="hidden" id="hidden_co_id" value="4">

  <div class="page" id="turn-ul" style="">
  <div class="pagination">
    <ul>
      <li class="according-number">每页显示<input type="text" class="input-medium" id="showNumber" value="14" data-default="14" autocomplete="off">条</li>
      <li><a id="beginPage" class="page-disable" style="border: 1px solid #dddddd;">首页</a></li>
      <li><a id="prevPage" class="page-disable">上一页</a></li>
      <li id="pageNumber"><a onclick="JumpForPage(this)" class="currentPage">1</a></li>
      <li id="JslastPage"></li>
      <li><a id="nextPage" class="page-disable">下一页</a></li>
      <li><a id="lastPage" class="page-disable">末页</a></li>
      <li class="total-data" data-total-count="2">共2条</li>
      <!-- <li class="page-count">共0页</li> -->
      <li class="according-number">
        跳<input type="text" class="input-medium" id="skipPage" data-curr-page="1">页
      </li>
    </ul>
  </div>
  </div>
  <input type="hidden" id="page_count" value="1">
  <input type="hidden" id="page_size" value="2">
    </div>

  </section>
</template>
