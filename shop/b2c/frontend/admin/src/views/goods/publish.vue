<template>

  <section class="ns-base-section" style="">
    <el-tabs type="border-card">
      <el-tab-pane label="基础设置">

          <!-- 基础设置 -->
        <h4>商品类型</h4>
        <div class="center-block">
          <el-radio-group v-model="editForm.type" style="padding-left: 30px!important;" >
            <el-radio :label="10" border>实物商品（物流发货）</el-radio>
            <el-radio :label="20" border>网上服务（虚拟商品）</el-radio>
            <el-radio :label="21" border>网盘下载（虚拟商品）</el-radio>
            <el-radio :label="22" border>点卡（虚拟商品）</el-radio>
            <el-radio :label="23" border>网站下载（虚拟商品）</el-radio>
          </el-radio-group>
        </div>
        <el-form ref="editForm" :rules="rules" :model="editForm" label-width="120px" size="small" label-position="right">

          <h4>基础信息</h4>

          <el-form-item label="商品名称" prop="name">
            <el-input v-model="editForm.name" placeholder="请输入商品名称，不能超过60个字符"></el-input>
          </el-form-item>

          <el-form-item label="商品分类">
            <el-input v-model="editForm.class">
              <el-button slot="append" >选择</el-button>
            </el-input>
          </el-form-item>

          <!-- TODO: 添加分类 -->
          <!-- <dl>
            <dt>扩展分类：</dt>
            <dd id="extend_name_category_box">
                        <div class="extend-name-category-box"></div>
                      <div class="clear">
                <button class="select-button" onclick="addExtentCategoryBox();"><i class="fa fa-plus-square"></i>&nbsp;添加</button>
              </div>
            </dd>
          </dl> -->

          <el-form-item label="扩展分类">
            <el-input v-model="editForm.extendedClass">
            </el-input>
          </el-form-item>

          <el-form-item label="网盘地址" v-show="editForm.type === 21">
            <el-input v-model="editForm.cloudAddress" placeholder="请输入网盘地址">
            </el-input>
          </el-form-item>

          <el-form-item label="网盘密码" v-show="editForm.type === 21">
            <el-input v-model="editForm.cloudPassword" placeholder="请输入网盘密码">
            </el-input>
          </el-form-item>

          <el-form-item label="卡密库存" v-show="editForm.type === 22">
            <span style="font-weight: bold;color: #FF5722;">0件</span>
          </el-form-item>

          <el-form-item label="添加卡密" v-show="editForm.type === 22">
            <span style="font-weight: bold;color: #FF5722;">导入格式为卡号+空格+密码(可跟上附加内容)，一行一组，如AAAAA BBBBB</span><br>
            <el-input type="textarea" v-model="editForm.cardPassword" >
            </el-input>
          </el-form-item>

          <el-form-item label="上传文件" v-show="editForm.type === 23">
            <el-input v-model="editForm.downloadResources">
              <el-button slot="append">上传</el-button>
            </el-input>
            <p class="hint">上传附件类型必须是<i class="important-note">zip</i>格式</p>
          </el-form-item>

          <el-form-item label="解压密码" v-show="editForm.type === 23">
            <el-input v-model="editForm.unzipPassword" placeholder="请输入解压密码">
            </el-input>
          </el-form-item>

          <el-form-item label="有效期/天" v-show="editForm.type === 20 || editForm.type === 21 || editForm.type === 22 || editForm.type === 23">
            <el-input type="number" v-model="editForm.validityPeriod" placeholder="请输入有效期">
              <el-button slot="append">天</el-button>
            </el-input>
            <p class="hint notice">输入0表示不限制</p>
          </el-form-item>

          <el-form-item label="限制使用次数" v-show="editForm.type === 20 || editForm.type === 22">
            <span style="color: #FF5722;font-weight: bold;" >1次</span>
          </el-form-item>

          <el-form-item label="限制使用次数" v-show="editForm.type === 21 || editForm.type === 23">
            <span style="color: #FF5722;font-weight: bold;" >不限制</span>
          </el-form-item>

          <el-form-item label="商品促销语">
            <el-input v-model="editForm.introduction" placeholder="请输入促销语，不能超过100个字符">
            </el-input>
          </el-form-item>

          <el-form-item label="关键词">
            <el-input v-model="editForm.keywords" placeholder="商品关键词用于SEO搜索">
            </el-input>
          </el-form-item>

          <el-form-item label="商品单位">
            <el-input v-model="editForm.unit" placeholder="请输入商品单位，不能超过10个字符">
            </el-input>
          </el-form-item>

          <el-form-item label="商品标签">
            <el-select filterable v-model="editForm.tags" multiple placeholder="请选择商品标签">
              <el-option label="热卖" value="1"></el-option>
              <el-option label="活动" value="2"></el-option>
            </el-select>
          </el-form-item>

          <el-form-item label="商品品牌">
            <el-select filterable v-model="editForm.tags" multiple placeholder="请选择商品品牌">
              <el-option label="小米" value="1"></el-option>
              <el-option label="索尼" value="2"></el-option>
              <el-option label="三星" value="3"></el-option>
            </el-select>
            <p class="hint">可输入品牌名或品牌首字母来搜索品牌</p>
          </el-form-item>

          <el-form-item label="商品品牌">
            <el-select filterable v-model="editForm.brands" multiple placeholder="请选择商品品牌">
              <el-option label="小米" value="1"></el-option>
              <el-option label="索尼" value="2"></el-option>
              <el-option label="三星" value="3"></el-option>
            </el-select>
            <p class="hint">可输入品牌名或品牌首字母来搜索品牌</p>
          </el-form-item>

          <el-form-item label="供货商">
            <el-select filterable v-model="editForm.suppliers" multiple placeholder="请选择供货商">
              <el-option label="小米供货商" value="1"></el-option>
              <el-option label="三星供货商" value="2"></el-option>
            </el-select>
          </el-form-item>

          <el-form-item label="基础销量" >
            <el-input type="number" v-model="editForm.basicSales" placeholder="0">
              <el-button slot="append">件</el-button>
            </el-input>
          </el-form-item>

          <el-form-item label="基础点击数" >
            <el-input type="number" v-model="editForm.basicPraise" placeholder="0">
              <el-button slot="append">次</el-button>
            </el-input>
            <span class="help-inline">基础点击数必须是数字，且不能为负数</span>
          </el-form-item>

          <el-form-item label="基础分享数" >
            <el-input type="number" v-model="editForm.basicShare" placeholder="0">
              <el-button slot="append">次</el-button>
            </el-input>
            <span class="help-inline">基础点击数必须是数字，且不能为负数</span>
          </el-form-item>

          <el-form-item label="商家编码" >
            <el-input type="number" v-model="editForm.productCodeA" placeholder="请输入商家编码，不能超过40个字符">
            </el-input>
            <span class="help-inline">基础点击数必须是数字，且不能为负数</span>
          </el-form-item>

          <el-form-item label="生产日期" >
            <el-date-picker
              v-model="editForm.productionDate"
              type="date"
              placeholder="选择日期">
            </el-date-picker>
          </el-form-item>

          <el-form-item label="保质期天数" >
            <el-input type="number" v-model="editForm.shelfLife" placeholder="0">
              <el-button slot="append">天</el-button>
            </el-input>
            <span class="help-inline">请输入保质期天数，必须是整数</span>
          </el-form-item>

          <el-form-item label="总库存" prop="totalStock">
            <el-input type="number" v-model="editForm.totalStock" placeholder="0">
              <el-button slot="append">件</el-button>
            </el-input>
            <span class="help-inline">请输入总库存数量，必须是大于0的整数</span>
          </el-form-item>

          <el-form-item label="库存预警" prop="minStockLaram">
            <el-input type="number" v-model="editForm.minStockLaram" placeholder="0">
              <el-button slot="append">件</el-button>
            </el-input>
            <p class="hint">设置最低库存预警值。当库存低于预警值时商家中心商品列表页库存列红字提醒。<br>0为不预警。</p>
          </el-form-item>

          <el-form-item label="库存显示" required>
            <el-switch  active-text="是" inactive-text="否" v-model="editForm.isShowStock"></el-switch>
          </el-form-item>

          <el-form-item label="是否上架" required>
            <el-radio-group v-model="editForm.shelves">
              <el-radio label="1">立刻上架</el-radio>
              <el-radio label="0">放入仓库</el-radio>
            </el-radio-group>
          </el-form-item>

          <el-form-item label="商品所在地" >
            <el-select filterable v-model="editForm.province" placeholder="请选择省">
              <el-option label="小米供货商" value="1"></el-option>
              <el-option label="三星供货商" value="2"></el-option>
            </el-select>
            <el-select filterable v-model="editForm.city" placeholder="请选择市">
              <el-option label="小米供货商" value="1"></el-option>
              <el-option label="三星供货商" value="2"></el-option>
            </el-select>
          </el-form-item>

          <h4>购买信息</h4>

          <el-form-item label="市场价格" >
            <el-input type="number" v-model="editForm.productMarketPrice" placeholder="0.00" min="0">
              <el-button slot="append">元</el-button>
            </el-input>
            <span class="help-inline">商品市场价格必须是数字，且不能为负数</span>
          </el-form-item>

          <el-form-item label="销售价格" required>
            <el-input type="number" v-model="editForm.productSalePrice" placeholder="0.00" min="0">
              <el-button slot="append">元</el-button>
            </el-input>
            <span class="help-inline">商品销售价不能为空，且不能为负数</span>
          </el-form-item>

          <el-form-item label="成本价格">
            <el-input type="number" v-model="editForm.productCostPrice" placeholder="0.00" min="0">
              <el-button slot="append">元</el-button>
            </el-input>
            <span class="help-inline">商品成本必须是数字，且不能为负数</span>
          </el-form-item>

          <dl>
            <dt>阶梯优惠：</dt>
            <dd>
              <p class="hint notice">设置商品阶梯优惠，当购买数量达到所设数量时，商品单价 = 商品销售价 - 优惠价格</p>
              <div class="ladder_preference_content">
                <div>
                  <span class="label-title">数量</span><span class="label-title" style="margin-left: 30px;">优惠价格</span>
                </div>
                          <div id="ladder_preference"></div>
              </div>
              <div class="add_ladder_preference"><i class="fa fa-plus" aria-hidden="true"></i></div>
            </dd>
          </dl>

          <el-form-item label="运费" required>
            <el-radio-group v-model="editForm.fare">
              <el-radio :label="0" value="0">免邮</el-radio>
              <el-radio :label="1" value="1">买家承担运费</el-radio>
            </el-radio-group>
          </el-form-item>

          <el-form-item label="计价方式" v-show="editForm.fare === 1" required>
            <el-radio-group v-model="editForm.shippingTeeType">
              <el-radio :label="1">计件</el-radio>
              <el-radio :label="2">体积</el-radio>
              <el-radio :label="3">重量</el-radio>
            </el-radio-group>
          </el-form-item>

          <el-form-item label="商品重量" v-show="editForm.fare === 1" required>
            <el-input type="number" v-model="editForm.goodsWeight" placeholder="0.00" min="0">
              <el-button slot="append">公斤</el-button>
            </el-input>
              <span class="help-inline">商品重量必须大于0</span>
          </el-form-item>

          <el-form-item label="商品体积" v-show="editForm.fare === 1" required>
            <el-input type="number" v-model="editForm.goodsVolume" placeholder="0" min="0">
              <el-button slot="append">立方米</el-button>
            </el-input>
              <span class="help-inline">商品体积必须大于0</span>
          </el-form-item>

          <el-form-item label="物流公司" v-show="editForm.fare === 1" >
            <el-select filterable v-model="editForm.expressCompany" placeholder="请选择物流公司">
              <el-option label="顺丰" value="1"></el-option>
              <el-option label="ccc" value="2"></el-option>
              <el-option label="中通快递" value="3"></el-option>
            </el-select>
          </el-form-item>

          <el-form-item label="每人限购" required>
            <el-input type="number" v-model="editForm.purchaseLimit" placeholder="0" min="0">
              <el-button slot="append">件</el-button>
            </el-input>
              <span class="help-inline">输入0表示不限购</span>
          </el-form-item>

          <el-form-item label="最少购买数" required>
            <el-input type="number" v-model="editForm.minBuy" placeholder="0" min="1">
              <el-button slot="append">件</el-button>
            </el-input>
              <span class="help-inline">最少购买数必须是大于0的整数</span>
          </el-form-item>

          <!-- 预售设置 -->
          <div id="presell_set" v-show="editForm.type === 10">
            <h4>预售设置</h4>
            <el-form-item label="是否支持预售" required>
              <el-switch  active-text="是" inactive-text="否" v-model="editForm.openPresell"></el-switch>
            </el-form-item>

            <div v-show="editForm.openPresell">

              <el-form-item label="预售金额">
                <el-input type="number" v-model="editForm.presellPrice" placeholder="0.00" min="0">
                  <el-button slot="append">元</el-button>
                </el-input>
                <span class="help-inline">预售金额必须是数字，且不能为负数</span>
              </el-form-item>

              <el-form-item label="预售发货方式" required>
                <el-radio-group v-model="editForm.presellDeliveryType">
                  <el-radio :label="1">按照预售发货时间</el-radio>
                  <el-radio :label="2">按照预售发货天数</el-radio>
                </el-radio-group>
              </el-form-item>

              <el-form-item label="预售发货时间" v-show="editForm.presellDeliveryType === 1">
                  <el-date-picker
                    v-model="editForm.presellTime"
                    type="datetime"
                    placeholder="选择日期时间">
                  </el-date-picker>
                  开始发货
              </el-form-item>

              <el-form-item label="预售发货时间" v-show="editForm.presellDeliveryType === 2">
                <el-input type="number" v-model="editForm.presellDay" min="0">
                  <el-button slot="prepend">付款成功</el-button>
                  <el-button slot="append">天后发货</el-button>
                </el-input>
              </el-form-item>
            </div>
          </div>

          <h4>积分设置</h4>

          <el-form-item label="最大可使用积分">
            <el-input type="number" v-model="editForm.maxUsePoint" >
              <el-button slot="append">分</el-button>
            </el-input>
                <p class="hint">设置购买时积分抵现最大可使用积分数，0为不可使用 </p>
          </el-form-item>

          <el-form-item label="积分兑换设置">
            <el-radio-group v-model="editForm.integralSelect">
              <el-radio label="1">非积分兑换</el-radio>
              <el-radio label="2">积分加现金购买</el-radio>
              <el-radio label="3">积分兑换或直接购买</el-radio>
              <el-radio label="4">只支持积分兑换</el-radio>
            </el-radio-group>
          </el-form-item>

          <el-form-item label="兑换所需积分">
            <el-input type="number" v-model="editForm.integrationAvailableUse" >
              <el-button slot="append">分</el-button>
            </el-input>
          </el-form-item>

          <el-form-item label="购买赠送积分">
            <el-radio-group v-model="editForm.integralGiveType">
              <el-radio :label="1">赠送固定积分</el-radio>
              <el-radio :label="2">按比率赠送积分</el-radio>
            </el-radio-group>
          </el-form-item>

          <el-form-item>
            <el-input type="number" v-show="editForm.integralGiveType === 1" v-model="editForm.integrationAvailableGive" placeholder="0" min="0">
              <el-button slot="append">分</el-button>
            </el-input>

            <el-input type="number" v-show="editForm.integralGiveType === 2" v-model="editForm.integrationAvailableGiveRatio" placeholder="0" min="0">
              <el-button slot="append">%</el-button>
            </el-input>
          </el-form-item>

          <h4>折扣设置</h4>

          <!-- TODO: 这里还有其他会员 -->
          <el-form-item label="黄金会员">
            <el-input type="number" v-model="editForm.integrationAvailableGiveRatio" placeholder="0" min="0">
              <el-button slot="append">%</el-button>
            </el-input>
          </el-form-item>

          <el-form-item label="价格保留方式">
            <el-radio-group v-model="editForm.priceRetentionMethod">
              <el-radio :label="1">抹去角和分</el-radio>
              <el-radio :label="2">抹去分</el-radio>
            </el-radio-group>
          </el-form-item>
        </el-form>
      </el-tab-pane>

      <el-tab-pane label="商品属性">
        <el-form ref="editForm" :rules="rules" :model="editForm" label-width="120px" size="small" label-position="right">
          <h4>基础信息</h4>

          <el-form-item label="商品类型">
            <el-select filterable v-model="editForm.goodsType" clearable placeholder="请选择商品类型">
              <el-option label="美体专区" value="1"></el-option>
              <el-option label="铁皮石斛" value="2"></el-option>
              <el-option label="闲逛逛" value="3"></el-option>
            </el-select>
            <p class="hint">可输入品牌名或品牌首字母来搜索品牌</p>
          </el-form-item>

          <h4 v-show="editForm.goodsType">商品属性：</h4>
          <!-- TODO: 商品属性表 -->
        </el-form>
      </el-tab-pane>

      <el-tab-pane label="商品规格">
          <!-- 商品规格 -->
          <nav>
            <button class="btn-common-white js-open-edit-sku-popup">编辑规格</button>
            <button class="btn-common-white js-clear-goods-sku">清空规格</button>
          </nav>
          <div style="padding:10px;line-height: 30px;display: none;">
            <table class="goods-sku js-goods-sku"></table>
          </div>

          <div class="volume-set-sku-info">
            <span>批量设置：</span>
            <a href="javascript:;" data-tag="sku-price">销售价格</a>
            <a href="javascript:;" data-tag="market-price">市场价格</a>
            <a href="javascript:;" data-tag="cost-price">成本价格</a>
            <a href="javascript:;" data-tag="stock-num">库存</a>
            <input type="text" class="input-common middle">
            <button class="btn-common">确定</button>
            <button class="btn-common-cancle">取消</button>
          </div>

          <div class="goods-sku-list">
            <table class="table-class">
              <colgroup>
                <col width="50%">
                <col width="10%">
                <col width="10%">
                <col width="10%">
                <col width="10%">
                <col width="10%">
              </colgroup>
              <thead>
                <tr>
                  <th align="left">商品规格</th>
                  <th>
                    <span>销售价格</span>
                    <input type="text" class="input-common short" />
                    <a href="javascript:;" style="float:right;">编辑</a>
                  </th>
                  <th>
                    <span>市场价格</span>
                    <a href="javascript:;" style="float:right;">编辑</a>
                  </th>
                  <th>
                    <span>成本价格</span>
                    <a href="javascript:;" style="float:right;">编辑</a>
                  </th>
                  <th>
                    <span>库存</span>
                    <a href="javascript:;" style="float:right;">编辑</a>
                  </th>
                  <th>
                    <span>商家编码</span>
                    <a href="javascript:;" style="float:right;">编辑</a>
                  </th>
                </tr>
              </thead>
              <tbody></tbody>
            </table>
          </div>

      </el-tab-pane>

      <el-tab-pane label="媒体设置">

        <!-- 图片视频设置 -->
          <div class="goods-photos">
            <h4>商品图片</h4>
            <dl>
              <dt>图片上传：</dt>
              <dd>
                <!-- （第一张图片将作为商品主图，支持同时上传多张图片,多张图片之间可随意调整位置；支持jpg、gif、png格式上传或从图片空间中选择，建议使用尺寸800x800像素以上、大小不超过1M的正方形图片，上传后的图片将会自动保存在图片空间的默认分类中。） -->

                <div id="goods_picture_box" class="controls">
                  <div class="goodspic-uplaod">
                    <div class="img-box" style="min-height:160px;">
                                      <div class="upload-thumb" id="default_uploadimg">
                        <img src="/public/admin/images/album/default_goods_image_240.gif">
                      </div>
                                    </div>
                    <div class="clear"></div>
                    <span class="img-error">最少需要一张图片作为商品主图</span>
                    <p class="hint">第一张图片将作为商品主图,支持同时上传多张图片,多张图片之间可随意调整位置；支持jpg、gif、png格式上传或从图片空间中选择，建议使用尺寸800x800像素以上、大小不超过1M的正方形图片，上传后的图片将会自动保存在图片空间的默认分类中。</p>
                    <div class="handle" style="margin-top: 5px;">
                      <div class="ncsc-upload-btn" style="margin-left:0;">
                        <a href="javascript:void(0);">
                          <span>
                            <input style="cursor:pointer;font-size:0;" type="file" id="fileupload" hidefocus="true" class="input-file" name="file_upload" multiple="multiple">
                          </span>
                          <p>图片上传</p>
                        </a>
                      </div>
                      <a class="ncsc-btn mt5" id="img_box" nctype="show_image" href="javascript:void(0);">从图片空间选择</a>
                    </div>
                  </div>
                </div>
                <span class="help-inline">最少需要一张图片作为商品主图</span>
              </dd>
            </dl>
          </div>

            <div class="goods-video">
              <h4>展示视频</h4>
              <dl>
                <dt>视频上传：</dt>
                <dd style="padding:0;">
                  <div class="goodspic-uplaod" style="overflow: hidden;position:relative;">

                    <div class="video-thumb">
                                      <video id="my-video" class="video-js vjs-big-play-centered" controls="" poster="/public/static/blue/img/goods_video_upload_bg.png" preload="auto">
                          <p class="vjs-no-js">To view this video please enable JavaScript, and consider upgrading to a web browser that</p>
                        </video>
                        <span class="del-video hide" onclick="del_video()"></span>
                                  </div>
                    <input class="input-file" name="file_upload" id="videoupload" type="file" onchange="fileUpload_video(this);" title="视频上传" style="position: absolute;left: 0;width: 290px;height: 140px;opacity: 0;cursor: pointer;z-index:10;">
                  </div>
                </dd>
              </dl>

              <dl>
                <dt>输入网址：</dt>
                <dd>
                  <input type="text" id="video_url" class="input-common" style="width: 290px !important;" placeholder="在此输入外链视频地址">
                  <span style="display: block;margin-top: 5px;">注意事项：</span>
                  <ul style="color:#FF6600;">
                    <li>1、检查upload文件夹是否有读写权限。</li>
                    <li>2、PHP默认上传限制为2MB，需要在php.ini配置文件中修改“post_max_size”和“upload_max_filesize”的大小。</li>
                    <li>3、视频支持手动输入外链视频地址或者上传本地视频文件</li>
                    <li>4、必须上传.mp4视频格式</li>
                    <li>5、视频文件大小不能超过500MB</li>
                  </ul>
                </dd>
              </dl>
            </div>

            <div class="goods-sku-picture">
              <h4>规格图片</h4>
              <dl class="sku-picture-dl">
                <dt>规格名列表：</dt>
                <dd>
                  <div class="sku-picture-div"></div>
                </dd>
              </dl>
              <dl class="sku-picture-dl-box">
                <dt>规格值列表：</dt>
                <dd>
                  <div class="sku-picture-box"></div>
                </dd>
              </dl>
            </div>

      </el-tab-pane>

      <el-tab-pane label="商品详情">
        <!-- 详情设置 -->

          <div class="controls" id="discripContainer" style="">
            <textarea id="tareaProductDiscrip" name="discripArea" style="height: 500px; width: 800px; display: none;"></textarea>

            <span class="help-inline">请填写商品描述</span>
          </div>

      </el-tab-pane>

      <el-tab-pane label="模板设置">
        <el-form ref="editForm" :model="editForm" label-width="120px" size="small" label-position="right">

          <!-- 模板设置 -->
          <h4>模板设置</h4>

          <el-form-item label="电脑端">
            <el-input v-model="editForm.pcCustomTemplate" >
              <el-button slot="prepend">template/shop/blue/Goods/</el-button>
              <el-button slot="append">.html</el-button>
            </el-input>
            <p class="hint">用户自定义模板必须存放在template/shop/blue/Goods/下，模板名只能由英文组成</p>
          </el-form-item>

          <el-form-item label="手机端">
            <el-input v-model="editForm.wapCustomTemplate" >
              <el-button slot="prepend">template/wap/default_new/Goods/</el-button>
              <el-button slot="append">.html</el-button>
            </el-input>
            <p class="hint">用户自定义模板必须存放在template/wap/default_new/Goods/下，模板名只能由英文组成</p>
          </el-form-item>

        </el-form>
      </el-tab-pane>
    </el-tabs>

    <div class="ns-main" style="">

      <div class="edit-sku-popup-mask-layer"></div>
      <div class="edit-sku-popup">
        <header>
          <h3>选择规格</h3>
          <span>×</span>
        </header>
        <div class="edit-sku-popup-body">
          <aside>
            <p>选择规格 [可多选]</p>
            <div class="js-attr-block">
              <div class="selectric-wrapper selectric-select-common selectric-attr-search" style="width: 250px;"><div class="selectric-hide-select"><select id="search_attr_id" class="select-common attr-search" onchange="getAttrSearchSelected(this);" tabindex="-1">
                <option value="0" selected="selected">全部</option>
                            <option value="16">美体专区</option>
                            <option value="17">铁皮石斛</option>
                            <option value="18">闲逛逛</option>
                        </select></div><div class="selectric"><span class="selectric-label">全部</span><button class="selectric-button">▾</button></div><div class="selectric-items" tabindex="-1"><div class="selectric-scroll"><ul><li data-index="0" class="selected" title="全部">全部</li><li data-index="1" class="" title="美体专区">美体专区</li><li data-index="2" class="" title="铁皮石斛">铁皮石斛</li><li data-index="3" class="last" title="闲逛逛">闲逛逛</li></ul></div></div><input class="selectric-input" tabindex="0"></div>
            </div>
            <!-- 原始规格 -->
            <div class="original-sku">
              <ul class="original-sku-list">
                <li class="add-sku" style="display: none;"></li>
              </ul>
            </div>
            <p class="title">当前已选规格</p>
            <!-- 已选规格 -->
            <div class="current-selected-sku">
              <ul class="js-sku-list-popup">
                <li class="add-sku">
                  <input type="text" class="input-common" placeholder="输入新规格名称">
                  <i class="fa fa-plus"></i>
                  <strong>添加新规格</strong>
                </li>
              </ul>
            </div>
          </aside>
          <article>
            <p>选择规格值 [可多选]</p>
            <div class="sku-value">

              <p class="empty-info">请选择左侧规格列表</p>

              <div class="sku-value-list">
                <label>
                  <i class="checkbox-common">
                    <input class="margin-small-right" id="checkAll" type="checkbox">
                  </i>
                  <span>全选</span>
                </label>
                <div class="add-sku-value-input">
                  <input type="text" class="input-common" placeholder="输入规格值名称(回车保存)">
                </div>
                <ul></ul>
              </div>

            </div>
            <div class="sku-display-mode">
              <header>
                <label>规格值展示方式</label>
                <span>指定规格值在前台的展示方式</span>
              </header>
              <p class="empty-info">请选择上方的规格值</p>
              <nav>
                <ul>
                  <li data-spec-show-type="1">
                    <label class="line-label">
                      <span>文字（编辑不会改变原始规格）</span>
                    </label>
                  </li>
                  <li data-spec-show-type="2">
                    <label class="line-label">
                      <i class="radio-common">
                        <input type="radio" name="show_type" id="show_type2" value="2">
                      </i>
                      <span>颜色</span>
                    </label>
                  </li>
                  <li data-spec-show-type="3">
                    <label class="line-label">
                      <i class="radio-common">
                        <input type="radio" name="show_type" id="show_type3" value="3">
                      </i>
                      <span>图片</span>
                    </label>
                  </li>
                </ul>
              </nav>
              <ul></ul>
            </div>
          </article>
        </div>

        <footer>
          <span class="box-spec-bottom">注意：改变规格会删除现有的有的商品规格数据，并生成新的规格数据。</span>
          <button class="btn-common btn-big btn-top">生成</button>
          <button class="btn-common-cancle btn-big btn-bottom">取消</button>
        </footer>
      </div>

      <div class="point-card-inventory-management-popup">
        <div class="point-card-inventory-management-body">
        </div>
        <footer>
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
        </footer>
      </div>

      <div class="btn-submit ncsc-form-goods" style="text-align: left; width: 1189px;">
        <dl>
          <dt></dt>
          <dd style="padding: 0;">

            <button class="btn-common" id="btnSave" type="button" onclick="SubmitProductInfo(0,'http://b2c.niuteam.cn/admin','http://b2c.niuteam.cn')">保存</button>
            <button class="btn-common" id="btnSavePreview" type="button" onclick="SubmitProductInfo(1,'http://b2c.niuteam.cn/admin','http://b2c.niuteam.cn')">保存并预览</button>
          </dd>
        </dl>
      </div>
    </div>

  </section>

</template>

<script>

import typeSelectedImage from '@/assets/img/type_selected.png'

export default {
  name: 'goodsAdd',
  data () {
    return {
      selectedIconBackground: typeSelectedImage,
      editForm: {
        type: 10
      },
      rules: {
        name: [
          { required: true, message: '请输入商品名称', trigger: 'blur' },
          { min: 1, max: 60, message: '不能超过60个字符', trigger: 'blur' }
        ],
        keywords: [
          { min: 0, max: 40, message: '不能超过40个字符', trigger: 'blur' }
        ],
        unit: [
          { min: 0, max: 10, message: '不能超过10个字符', trigger: 'blur' }
        ],
        basicSales: [
          { min: 0, message: '基础销量必须是数字，且不能为负数', trigger: 'blur' }
        ],
        productCodeA: [
          { min: 0, max: 40, message: '不能超过40个字符', trigger: 'blur' }
        ],
        totalStock: [
          { min: 1, step: 1, message: '必须是大于0的整数', trigger: 'blur' }
        ],
        minStockLaram: [
          { min: 1, step: 1, message: '必须是大于0的整数', trigger: 'blur' }
        ]
      }
    }
  },
  components: {
  }
}
</script>

<style lang="scss">
h4 {
    border-left: 2px solid #126AE4;
    padding-left: 5px;
    font-size: 14px;
    color: #333333;
    margin: 15px 0 10px 10px;
}

.goods_type_select  {
  line-height: 1!important;
  padding-left: 60px!important;

  dl {
    dd {
      font-size: 12px;
      line-height: 30px;
      vertical-align: top;
      letter-spacing: normal;
      word-spacing: normal;
      display: inline-block;
      width: 80%;
      padding: 8px 0;
      border-left: solid 1px #e5e5e5;
      display: inline;
      min-height: 30px;
      margin: 0;
      line-height: 1;
    }
  }

  .goods_type_item {
    display: inline-block;
    width: 120px;
    height: 40px;
    border: 1px solid #ddd;
    margin-right: 10px;
    padding: 8px 0;
    position: relative;
    border-radius: 2px;

    .type_name {
      font-size: 14px;
      color: #333;
      text-align: center;
      margin: 0;
      line-height: 20px;
    }

    .type_desc {
      font-style: 14px;
      color: #aaa;
      text-align: center;
      margin: 0;
      line-height: 20px;
    }

    input[type='radio'] {
      opacity: 0;
    }

    i.selected-icon {
      position: absolute;
      width: 36px;
      height: 26px;
      bottom: 0;
      right: 0;
      display: none;
      background-size: 26px 20px;
    }

    :hover {
      cursor: pointer;
    }
  }

  .goods_type_item.selected {
    border-color: #0059d6;
    i.selected-icon {
      display: inline-block;
    }
  }
}

.hint {
  font-size: 12px;
  line-height: 16px;
  color: #999999;
  margin: 10px 0 0;
}

.hint.notice {
  color: #FF8400;
}

.center-block {
  text-align: center
}
</style>
