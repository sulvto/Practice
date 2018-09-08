<template>
  <section class="ns-base-section">

    <!-- <div class="popover-content">
    <div>
    <h4>操作提示</h4>
    <p>商家服务</p>
    <hr>
    <h4>功能提示</h4>
    <p class="function-prompts">
    </p><p style="margin: 0;">添加成功后，商家服务将会在商品详情中展示</p>
    <p></p>
    </div>
    </div> -->

    <div class="ns-main">

      <div class="service-guarantee">
        <table class="table-class">
          <colgroup>
            <col width="20%">
            <col width="30%">
            <col width="50%">
          </colgroup>
          <tbody><tr>
            <th>图标</th>
            <th>标题</th>
            <th>描述</th>
          </tr>
              <tr data-flag="0">
            <td align="center">
              <div class="shop_service_item">
                <input class="input-file" name="file_upload" id="uploadImg0" type="file" onchange="imgUpload(this);" style="cursor: pointer;width: 30px;margin-top: 12px;margin-left: 62px;" title=" ">
                <input type="hidden" id="logo0" value="" class="sg-pic">
                          <img id="imglogo0" src="/public/static/blue/img/goods_sku_add.png" style="cursor: pointer;width:28px;height:28px;">
                        </div>
            </td>
            <td align="center">
              <input type="text" placeholder="请输入商家服务标题" class="input-common sg-title" value="">
            </td>
            <td align="center">
              <input type="text" placeholder="请输入商家服务描述" class="input-common sg-describe" value="">
            </td>
          </tr>
              <tr data-flag="1">
            <td align="center">
              <div class="shop_service_item">
                <input class="input-file" name="file_upload" id="uploadImg1" type="file" onchange="imgUpload(this);" style="cursor: pointer;width: 30px;margin-top: 12px;margin-left: 62px;" title=" ">
                <input type="hidden" id="logo1" value="" class="sg-pic">
                          <img id="imglogo1" src="/public/static/blue/img/goods_sku_add.png" style="cursor: pointer;width:28px;height:28px;">
                        </div>
            </td>
            <td align="center">
              <input type="text" placeholder="请输入商家服务标题" class="input-common sg-title" value="">
            </td>
            <td align="center">
              <input type="text" placeholder="请输入商家服务描述" class="input-common sg-describe" value="">
            </td>
          </tr>
              <tr data-flag="2">
            <td align="center">
              <div class="shop_service_item">
                <input class="input-file" name="file_upload" id="uploadImg2" type="file" onchange="imgUpload(this);" style="cursor: pointer;width: 30px;margin-top: 12px;margin-left: 62px;" title=" ">
                <input type="hidden" id="logo2" value="" class="sg-pic">
                          <img id="imglogo2" src="/public/static/blue/img/goods_sku_add.png" style="cursor: pointer;width:28px;height:28px;">
                        </div>
            </td>
            <td align="center">
              <input type="text" placeholder="请输入商家服务标题" class="input-common sg-title" value="">
            </td>
            <td align="center">
              <input type="text" placeholder="请输入商家服务描述" class="input-common sg-describe" value="">
            </td>
          </tr>
              <tr data-flag="3">
            <td align="center">
              <div class="shop_service_item">
                <input class="input-file" name="file_upload" id="uploadImg3" type="file" onchange="imgUpload(this);" style="cursor: pointer;width: 30px;margin-top: 12px;margin-left: 62px;" title=" ">
                <input type="hidden" id="logo3" value="" class="sg-pic">
                          <img id="imglogo3" src="/public/static/blue/img/goods_sku_add.png" style="cursor: pointer;width:28px;height:28px;">
                        </div>
            </td>
            <td align="center">
              <input type="text" placeholder="请输入商家服务标题" class="input-common sg-title" value="">
            </td>
            <td align="center">
              <input type="text" placeholder="请输入商家服务描述" class="input-common sg-describe" value="">
            </td>
          </tr>
              <tr data-flag="4">
            <td align="center">
              <div class="shop_service_item">
                <input class="input-file" name="file_upload" id="uploadImg4" type="file" onchange="imgUpload(this);" style="cursor: pointer;width: 30px;margin-top: 12px;margin-left: 62px;" title=" ">
                <input type="hidden" id="logo4" value="" class="sg-pic">
                          <img id="imglogo4" src="/public/static/blue/img/goods_sku_add.png" style="cursor: pointer;width:28px;height:28px;">
                        </div>
            </td>
            <td align="center">
              <input type="text" placeholder="请输入商家服务标题" class="input-common sg-title" value="">
            </td>
            <td align="center">
              <input type="text" placeholder="请输入商家服务描述" class="input-common sg-describe" value="">
            </td>
          </tr>
              <tr data-flag="5">
            <td align="center">
              <div class="shop_service_item">
                <input class="input-file" name="file_upload" id="uploadImg5" type="file" onchange="imgUpload(this);" style="cursor: pointer;width: 30px;margin-top: 12px;margin-left: 62px;" title=" ">
                <input type="hidden" id="logo5" value="" class="sg-pic">
                          <img id="imglogo5" src="/public/static/blue/img/goods_sku_add.png" style="cursor: pointer;width:28px;height:28px;">
                        </div>
            </td>
            <td align="center">
              <input type="text" placeholder="请输入商家服务标题" class="input-common sg-title" value="">
            </td>
            <td align="center">
              <input type="text" placeholder="请输入商家服务描述" class="input-common sg-describe" value="">
            </td>
          </tr>
              <tr>
            <td align="center"><button class="btn-common btn-big" onclick="save()">保存</button></td>
            <td colspan="2"></td>
          </tr>
        </tbody></table>
      </div>

    </div>

  </section>
</template>
