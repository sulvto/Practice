<template>
  <section class="ns-base-section">
<div>
  <el-tabs v-model="selectedStatus" >
    <el-tab-pane label="出售中" :name="1">
    </el-tab-pane>
    <el-tab-pane label="已下架" :name="2">
    </el-tab-pane>
    <el-tab-pane label="库存预警" :name="3">
    </el-tab-pane>
    <el-tab-pane label="回收站" :name="4">
    </el-tab-pane>
  </el-tabs>

    <el-row :gutter="4">
      <el-col :span="14">
        <el-button type="danger" size="small">批量删除</el-button>
        <el-button size="small">上架</el-button>
        <el-button size="small">下架</el-button>
        <el-popover
          title="标题"
          placement="bottom"
          popper-class="popover-checkbox-group"
          width="80"
          style="min-width: unset;"
          trigger="click"
          v-model="seleteRecommendTypesPopoverVisible">
          <el-checkbox-group v-model="updateRecommendTypes">
            <el-checkbox label="热卖"></el-checkbox>
            <el-checkbox label="精品"></el-checkbox>
            <el-checkbox label="新品"></el-checkbox>
          </el-checkbox-group>
          <br/>
          <el-button type="primary" size="mini" @click="seleteRecommendTypesPopoverVisible = false">确定</el-button>
          <el-button slot="reference" size="small">推荐</el-button>
        </el-popover>

        <el-popover
          popper-class="popover-checkbox-group"
          title="修改商品标签"
          placement="bottom"
          width="100"
          trigger="click"
          v-model="seleteTagsPopoverVisible">
          <el-checkbox-group v-model="updateTags">
            <el-checkbox label="hot"></el-checkbox>
            <el-checkbox label="火火火"></el-checkbox>
            <el-checkbox label="明星同款"></el-checkbox>
          </el-checkbox-group>
          <br/>
          <el-button type="primary" size="mini" @click="seleteTagsPopoverVisible = false">确定</el-button>
          <el-button slot="reference" size="small">商品标签</el-button>
        </el-popover>
        <el-button size="small">更新二维码</el-button>
        <el-button size="small" @click="dialogBatchProcessingFormVisible = true">批量处理</el-button>
        <el-button size="small" @click="dialogSetMemberDiscountFormVisible = true">设置折扣</el-button>
      </el-col>

      <el-col :span="7">
        <el-input size="small" v-model="queryForm.goodsName" placeholder="要搜索的商品名称"></el-input>
      </el-col>
      <el-col :span="1">
        <el-popover
          placement="bottom"
          width="400"
          trigger="click"
          v-model="moreQueryPopoverVisible">
          <el-form ref="editForm" :model="queryForm" label-width="100px" size="small" label-position="right">
            <el-form-item label="商品编码">
              <el-input v-model="queryForm.goodsCode"></el-input>
            </el-form-item>

            <el-form-item label="供货商">
              <el-select v-model="queryForm.supplierId" clearable placeholder="请选择">
                <el-option label="小米供货商" :value="1"></el-option>
                <el-option label="三星供货商" :value="2"></el-option>
              </el-select>
            </el-form-item>

            <el-form-item label="商品类型">
              <el-select v-model="queryForm.goodsType" clearable placeholder="请选择">
                <el-option label="实物商品" :value="1"></el-option>
                <el-option label="虚拟商品" :value="2"></el-option>
              </el-select>
            </el-form-item>

            <el-form-item label="商品标签">
              <el-select v-model="queryForm.labels" multiple clearable placeholder="请选择">
                <el-option label="hot" :value="1"></el-option>
                <el-option label="牛逼的标签" :value="2"></el-option>
              </el-select>
            </el-form-item>

            <el-form-item>
              <el-button type="primary" @click="moreQueryPopoverVisible = false">确定</el-button>
            </el-form-item>
          </el-form>
          <el-button slot="reference" icon="el-icon-arrow-down" size="small" ></el-button>
        </el-popover>
      </el-col>
      <el-col :span="2">
        <el-button type="primary" size="small" @click="search">查询</el-button>
      </el-col>
    </el-row>

    <br/>

    <el-table border :data="goodsList" style="width: 100%" @selection-change="handleSelectionChange">
      <el-table-column
        type="selection"
        width="35">
      </el-table-column>

      <el-table-column
        label="商品名称">
        <template slot-scope="scope">
          <div class="pro-code">
            <span>商家编码：{{ scope.row.shopNo }}</span>
            <span class="pro-code" style="margin-left:10px;">
              创建时间：{{ scope.row.createDate }}
              <span class="div-flag-style" style="display: inline-block;margin:0 20px;position:relative">
                <i class="icon iconfont icon-qrcode" ></i>
                <div class="QRcode" style="display: none; position: absolute;width:110px;top:28px;left:0;z-index:10;" id="qrcode">
                  <p><img src="http://showfx.niuteam.cn/upload/goods_qrcode/goods_qrcode_157.png" style="width:110px;"></p>
                </div>
              </span>
            </span>
          </div>
          <div style="width:450px;">
            <a class="a-pro-view-img" href="http://b2c.niuteam.cn/goods/goodsinfo?goodsid=157" target="_blank" style="height:70px;line-height:70px;text-align:center;"><img class="thumbnail-img" src="http://pc7mzzjqj.bkt.clouddn.com/upload/goods/20180724/1ba75c9b575740a0db4e6dd8aca893a14.jpg"></a>
            <div class="div-pro-view-name">
              <div class="editGoodsIntroduction" ondblclick="editGoodsInfo(this)"><a target="_blank" style="word-break:break-all;" href="http://b2c.niuteam.cn/goods/goodsinfo?goodsid=157">{{ scope.row.name }}</a></div><input class="js-update-goods-name input-common" style="width:350px!important;" data-goods-id="157" data-up-type="goods_name"
                  type="text" value="1"><br>
              <div class="editGoodsIntroduction" ondblclick="editGoodsInfo(this)"><span style="color:#999;font-size:12px;display:block;height:25px;overflow:hidden;text-decoration: none;">1</span></div><input data-goods-id="157" data-up-type="introduction" class="js-update-introduction input-common" style="width:350px!important;"
                  type="text" maxlength="60" value="1">

              <div style="position: relative;margin-left: 75px;">
                <i v-for="tag in scope.row.tags" :key="tag" style="color:#999;font-size:12px;margin-top:5px;padding:1px 4px;border-radius:3px;display:inline-block;color:#FFF;background-color:#FF6600;text-decoration: none;height:16px;line-height: 16px;overflow:hidden;margin-right:5px;text-align:center;font-style:normal;">{{ tag }}</i>
              </div>
            </div>
          </div>
        </template>
      </el-table-column>

      <el-table-column
        prop="price"
        label="价格(元)"
        width="80">
      </el-table-column>

      <el-table-column
        prop="totalStock"
        label="总库存"
        width="80">
      </el-table-column>

      <el-table-column
        prop="totalSales"
        label="销量"
        width="80">
      </el-table-column>

      <el-table-column
        prop="type"
        label="实物类型"
        width="80">
      </el-table-column>

      <el-table-column
        label="排序"
        width="80">
        <template slot-scope="scope">
          <el-input class="disable-input-spinner-button" type="number" size="small" v-model="scope.row.sort" >
          </el-input>
        </template>
      </el-table-column>

      <!-- 实物类型 -->
      <el-table-column label="操作" fixed="right"
          width="200">
          <template slot-scope="scope">
              <el-button size="mini" @click="handleEdit(scope.$index, scope.row)">编辑</el-button>
              <el-button size="mini" @click="handleEdit(scope.$index, scope.row)">复制</el-button>
              <el-button size="mini" @click="handleDelete(scope.$index, scope.row)">删除</el-button>
              <br/>
              <el-button class="margin-top-5" size="mini" @click="handleDelete(scope.$index, scope.row)">下架</el-button>
              <br/>
              <el-button class="margin-top-5" size="mini" @click="handleDelete(scope.$index, scope.row)">设置会员折扣</el-button>
              <br/>
              <el-button class="margin-top-5" size="mini" v-if="scope.row.type >= 20" @click="handleDelete(scope.$index, scope.row)">虚拟商品管理</el-button>
          </template>
      </el-table-column>
    </el-table>

    <el-dialog title="批量处理" size="small" :visible.sync="dialogBatchProcessingFormVisible">
      <el-form ref="batchProcessingForm" size="small" :model="batchProcessingForm" label-width="80px" >

        <el-alert type="success" :closable="false" description="1、如果未设置任何选择，则商品保持原状不变。"></el-alert>
        <el-alert type="success" :closable="false" description="2、设置商品库存，将作用于所选商品的所有规格项。"></el-alert>
        <br/>

        <el-form-item label="商品分类">
          <el-select class="width-180" v-model="batchProcessingForm.categroyLevel0" clearable placeholder="请选择一级分类">
            <el-option
              v-for="item in categroyLevel_0"
              :key="item.id"
              :label="item.name"
              :value="item.id">
            </el-option>
          </el-select>
          <el-select class="width-180" v-model="batchProcessingForm.categroyLevel1" clearable placeholder="请选择二级分类">
            <el-option
              v-for="item in categroyLevel_1(batchProcessingForm.categroyLevel0)"
              :key="item.id"
              :label="item.name"
              :value="item.id">
            </el-option>
          </el-select>
          <el-select class="width-180" v-model="batchProcessingForm.categroyLevel2" clearable placeholder="请选择三级分类">
            <el-option
              v-for="item in categroyLevel_2(batchProcessingForm.categroyLevel1)"
              :key="item.id"
              :label="item.name"
              :value="item.id">
            </el-option>
          </el-select>
        </el-form-item>

        <el-form-item label="销售价">
          <el-radio-group v-model="batchProcessingForm.salePriceOption">
            <el-radio :label="1">增加</el-radio>
            <el-radio :label="0">减少</el-radio>
          </el-radio-group>
          &emsp;&emsp;
          <el-input class="disable-input-spinner-button width-180" type="number" value="0" v-model="batchProcessingForm.salePrice" ></el-input>

          <span class="info">销售价增加N元或减少N元</span>

        </el-form-item>

        <el-form-item label="市场价">
          <el-radio-group v-model="batchProcessingForm.marketPriceOption">
            <el-radio :label="1">增加</el-radio>
            <el-radio :label="0">减少</el-radio>
          </el-radio-group>
          &emsp;&emsp;
          <el-input class="disable-input-spinner-button width-180" type="number" value="0" v-model="batchProcessingForm.marketPrice" ></el-input>

          <span class="info">市场价增加N元或减少N元</span>

        </el-form-item>

        <el-form-item label="成本价">
          <el-radio-group v-model="batchProcessingForm.costPriceOption">
            <el-radio :label="1">增加</el-radio>
            <el-radio :label="0">减少</el-radio>
          </el-radio-group>
          &emsp;&emsp;
          <el-input class="disable-input-spinner-button width-180" type="number" value="0" v-model="batchProcessingForm.costPrice" ></el-input>

          <span class="info">成本价增加N元或减少N元</span>
        </el-form-item>

        <el-form-item label="库存">
          <el-radio-group v-model="batchProcessingForm.stockOption">
            <el-radio :label="1">增加</el-radio>
            <el-radio :label="0">减少</el-radio>
          </el-radio-group>
          &emsp;&emsp;
          <el-input class="disable-input-spinner-button width-180" type="number" value="0" v-model="batchProcessingForm.stock" ></el-input>

          <span class="info">库存增加N件或减少N件</span>
        </el-form-item>

        <el-form-item label="商品品牌">
          <el-select v-model="batchProcessingForm.brand" clearable filterable placeholder="请选择">
            <el-option
              v-for="item in brandList"
              :key="item.id"
              :label="item.name"
              :value="item.id">
            </el-option>
          </el-select>

        </el-form-item>

      </el-form>
      <div slot="footer" class="dialog-footer">
        <el-button size="small" @click="dialogBatchProcessingFormVisible = false">取 消</el-button>
        <el-button size="small" type="primary" @click="submitForm('classForm')">保 存</el-button>
      </div>
    </el-dialog>

    <el-dialog title="设置商品折扣" size="small" :visible.sync="dialogSetMemberDiscountFormVisible">
      <el-form ref="setMemberDiscountForm" size="small" :model="setMemberDiscountForm" label-width="100px" >

        <el-form-item label="黄金会员">
          <el-input type="number" min="0" max="100" step="1" v-model="setMemberDiscountForm.salePrice" >
            <template slot="append">
                %
            </template>
          </el-input>
        </el-form-item>

        <el-form-item label="价格保留方式">
          <el-radio-group v-model="setMemberDiscountForm.priceRetentionMethod">
            <el-radio :label="1">抹去角和分</el-radio>
            <el-radio :label="0">抹去分</el-radio>
          </el-radio-group>
        </el-form-item>

      </el-form>
      <div slot="footer" class="dialog-footer">
        <el-button size="small" @click="dialogSetMemberDiscountFormVisible = false">取 消</el-button>
        <el-button size="small" type="primary" @click="submitForm('classForm')">保 存</el-button>
      </div>
    </el-dialog>

  </div>

    <!-- 操作提示 -->

    <div class="ns-main">

      <div class="js-mask-category" style="display:none;background: rgba(0,0,0,0);position:fixed;width:100%;height:100%;top:0;left:0;right:0;bottom:0;z-index:90;"></div>
      <table class="mytable">
        <tbody>
          <tr>

            <th style="position: relative;">

              商品分类：
              <div style="display: inline-block;position: relative;">
                <input type="text" placeholder="请选择商品分类" @click="showCategory=!showCategory" class="input-common middle">
                <div class="goodsCategory one" v-show="showCategory">
                  <ul>
                    <li class="js-category-one" category_id="3">
                      <span>养护设备</span>
                      <i class="fa fa-angle-right fa-lg"></i>
                    </li>
                    <li class="js-category-one" category_id="4">
                      <span>工程设备</span>
                      <i class="fa fa-angle-right fa-lg"></i>
                    </li>
                    <li class="js-category-one" category_id="5">
                      <span>环卫设备</span>
                      <i class="fa fa-angle-right fa-lg"></i>
                    </li>
                    <li class="js-category-one" category_id="146">
                      <span>服装</span>
                      <i class="fa fa-angle-right fa-lg"></i>
                    </li>
                    <li class="js-category-one" category_id="6">
                      <span>配件专区</span>
                      <i class="fa fa-angle-right fa-lg"></i>
                    </li>
                    <li class="js-category-one" category_id="7">
                      <span>女鞋/箱包/钟表/珠宝</span>
                      <i class="fa fa-angle-right fa-lg"></i>
                    </li>
                    <li class="js-category-one" category_id="8">
                      <span>男鞋/运动/户外</span>
                      <i class="fa fa-angle-right fa-lg"></i>
                    </li>
                    <li class="js-category-one" category_id="2">
                      <span>混凝土设</span>
                      <i class="fa fa-angle-right fa-lg"></i>
                    </li>
                    <li class="js-category-one" category_id="9">
                      <span>汽车/汽车用品</span>
                      <i class="fa fa-angle-right fa-lg"></i>
                    </li>
                    <li class="js-category-one" category_id="10">
                      <span>母婴/玩具用品</span>
                      <i class="fa fa-angle-right fa-lg"></i>
                    </li>
                    <li class="js-category-one" category_id="11">
                      <span>食品/酒类/生鲜/特产</span>
                      <i class="fa fa-angle-right fa-lg"></i>
                    </li>
                  </ul>
                </div>
                <div class="goodsCategory two" style="border-left:0;">
                  <ul id="goodsCategoryTwo"></ul>
                </div>
                <div class="goodsCategory three">
                  <ul id="goodsCategoryThree"></ul>
                </div>
                <div class="selectGoodsCategory">
                  <a href="javascript:;" id="confirmSelect" style="float:right;">确认选择</a>
                </div>
                <input type="hidden" id="category_id_1">
                <input type="hidden" id="category_id_2">
                <input type="hidden" id="category_id_3">
              </div>

              <span class="interval"></span>
              <span>商品名称：</span>
              <input id="goods_name" class="input-medium input-common middle" type="text" value="" placeholder="要搜索的商品名称">
              <span class="interval"></span>
              <button class="btn-common-white more-search"><i class="fa fa-chevron-down"></i></button>
              <span class="interval"></span>
              <button onclick="searchData()" class="btn-common">搜索</button>

              <!-- 更多搜索 -->
              <div class="more-search-container">
                <dl>
                  <dt>商品编码：</dt>
                  <dd>
                    <input id="goods_code" class="input-medium input-common middle" type="text" placeholder="要搜索的商品编码">
                  </dd>
                </dl>
                <dl>
                  <dt>供货商：</dt>
                  <dd>
                    <div class="selectric-wrapper selectric-select-common selectric-middle" style="width: 150px;">
                      <div class="selectric-hide-select"><select id="supplier_id" class="select-common middle" tabindex="-1">
                  <option value="">全部</option>
                                <option value="1">小米供货商</option>
                                <option value="2">三星供货商</option>
                              </select></div>
                      <div class="selectric"><span class="selectric-label">全部</span><button class="selectric-button">▾</button></div>
                      <div class="selectric-items" tabindex="-1">
                        <div class="selectric-scroll">
                          <ul>
                            <li data-index="0" class="selected" title="全部">全部</li>
                            <li data-index="1" class="" title="小米供货商">小米供货商</li>
                            <li data-index="2" class="last" title="三星供货商">三星供货商</li>
                          </ul>
                        </div>
                      </div><input class="selectric-input" tabindex="0"></div>
                  </dd>
                </dl>
                <dl>
                  <dt>上下架：</dt>
                  <dd>
                    <select id="state" class="select-common middle" >
                    <option value="" >全部</option>
                    <option value="1" >上架</option>
                    <option value="0" >下架</option>
                    </select>
                  </dd>
                </dl>
                <dl>
                  <dt>商品类型：</dt>
                  <dd>
                    <div class="selectric-wrapper selectric-select-common selectric-middle" style="width: 150px;">
                      <div class="selectric-hide-select"><select id="goods_type" class="select-common middle" tabindex="-1">
                  <option value="all">全部</option>
                  <option value="1">实物商品</option>
                  <option value="0">虚拟商品</option>
                </select></div>
                      <div class="selectric"><span class="selectric-label">全部</span><button class="selectric-button">▾</button></div>
                      <div class="selectric-items" tabindex="-1">
                        <div class="selectric-scroll">
                          <ul>
                            <li data-index="0" class="selected" title="全部">全部</li>
                            <li data-index="1" class="" title="实物商品">实物商品</li>
                            <li data-index="2" class="last" title="虚拟商品">虚拟商品</li>
                          </ul>
                        </div>
                      </div><input class="selectric-input" tabindex="0"></div>
                  </dd>
                </dl>
                <dl>
                  <dt>商品标签：</dt>
                  <dd>
                    <input type="text" placeholder="请选择商品标签" id="selectGoodsLabel" onfocus="selectGoodsLabel();" is_show="false" data-html="true" class="input-common middle" title="<h6 class='edit-group-title'>选择商品标签</h6>" data-container="body" data-placement="bottom" data-trigger="manual"
                        data-content=""></dd>
                </dl>
                <dl>
                  <dt></dt>
                  <dd>
                    <a href="javascript:;" onclick="searchData()" class="btn-common">完成</a>
                  </dd>
                </dl>
              </div>
            </th>
          </tr>
        </tbody>
      </table>
      <div id="myTabContent" class="tab-content">
        <div class="tab-pane active">
          <table class="table-class">
            <colgroup>
              <col style="width: 2%;">
              <col style="width: 25%;">
              <col style="width: 15%;">

              <col style="width: 15%;">
              <col style="width: 11%;">
              <col style="width: 11%;">
              <col style="width: 4%;">
              <col style="width: 15%;">
            </colgroup>
            <thead>
              <tr>
                <th>
                  <i class="checkbox-common">
                  <input onclick="CheckAll(this)" type="checkbox" id="chek_all">
                </i>
                </th>
                <th align="left">商品名称</th>
                <th class="goods-fields-sort" data-field="price" style="text-align: right;">价格(元)<span class="desc"></span></th>
                <th class="goods-fields-sort" data-field="stock" style="text-align: right;">总库存<span class="desc"></span></th>
                <th class="goods-fields-sort" data-field="sales" style="text-align: right;">销量<span class="desc"></span></th>
                <th>实物类型</th>
                <th class="goods-fields-sort" data-field="sort" style="text-align: center;">排序<span class="desc"></span></th>
                <th>操作</th>
              </tr>
            </thead>
            <tbody id="productTbody" style="border: 0;">

              <tr class="tr-title">
                <td class="td-155" style="border-bottom:0;"></td>
                <td colspan="9" style="border-bottom:0;">
                  <div style="display: inline-block; width: 100%;font-size:12px;color:#666;" class="pro-code"><span>商家编码：</span><span class="pro-code" style="margin-left:10px;">创建时间：2018-07-20 12:22:10<span class="div-flag-style" style="display: inline-block;margin:0 20px;position:relative"><i class="icon-qrcode" style="background: none; color: #555; font-size: 20px; margin-right: 0;"></i><div class="QRcode" style="display: none; position: absolute;width:110px;top:28px;left:0;z-index:10;" id="qrcode"><p><img src="/upload/goods_qrcode/goods_qrcode_155.png" style="width:110px;"></p></div></span></span>
                  </div>
                </td>
              </tr>
              <tr>
                <td align="center"><i class="checkbox-common"><input value="155" name="sub" data-state="1" type="checkbox"></i></td>
                <td colspan="1">
                  <div style="width:450px;">
                    <a class="a-pro-view-img" href="http://b2c.niuteam.cn/goods/goodsinfo?goodsid=155" target="_blank" style="height:70px;line-height:70px;text-align:center;"><img class="thumbnail-img" src="/upload/goods/149933394894.jpg"></a>
                    <div class="div-pro-view-name">
                      <div class="editGoodsIntroduction" ondblclick="editGoodsInfo(this)"><a target="_blank" style="word-break:break-all;" href="http://b2c.niuteam.cn/goods/goodsinfo?goodsid=155">5555 123</a></div><input class="js-update-goods-name input-common" style="width:350px!important;" data-goods-id="155" data-up-type="goods_name"
                          type="text" value="5555 123"><br>
                      <div style="position: relative;margin-left: 75px;"><i style="color:#999;font-size:12px;margin-top:5px;padding:1px 4px;border-radius:3px;display:inline-block;color:#FFF;background-color:#FF6600;text-decoration: none;height:16px;line-height: 16px;overflow:hidden;margin-right:5px;text-align:center;font-style:normal;">热卖</i>
                        <i style="color:#999;font-size:12px;margin-top:5px;padding:1px 4px;border-radius:3px;display:inline-block;color:#FFF;background-color:#FF6600;text-decoration: none;height:16px;line-height: 16px;overflow:hidden;margin-right:5px;text-align:center;font-style:normal;">活动</i>
                        <i
                            style="color:#999;font-size:12px;margin-top:5px;padding:1px 4px;border-radius:3px;display:inline-block;color:#FFF;background-color:#FF6600;text-decoration: none;height:16px;line-height: 16px;overflow:hidden;margin-right:5px;text-align:center;font-style:normal;">新品lll</i>
                      </div>
                    </div>
                  </div>
                </td>
                <td style="text-align: right;">
                  <div><span class="price-numble" id="moreChangePrice155" style="color:#FF6600;">10.00</span></div>
                </td>
                <td style="text-align: right;">
                  <div class="cell"><span class="pro-stock" style="color: #666;" id="moreChangeStock155">0</span></div>
                </td>
                <td style="text-align: right;">
                  <div class="cell"><span class="pro-stock" style="color: #666;" id="moreChangeStock155">1</span></div>
                </td>
                <td style="text-align: center;"><span>实物类</span></td>
                <td style="text-align: center;">
                  <div class="cell"><input class="input-common input-common-sort" goods_id="155" value="0" onchange="changeSort(this)" type="number" title="排序号数值越大，商城商品列表显示越靠前"></div>
                </td>
                <td>
                  <div class="bs-docs-example tooltip-demo" style="text-align: center;"><a href="/goods/addgoods?step=2&amp;goodsId=155" title="编辑商品">编辑</a><a href="javascript:copyGoodsDetail(155);" title="复制商品">复制</a><a href="javascript:deleteGoods(155)" title="删除商品">删除</a><br><a href="javascript:modifyGoodsOnline(155,'offline')">下架</a><br>
                    <a href="javascript:showMemberDiscount(155)">设置会员折扣</a>
                  </div>
                </td>
              </tr>
              <tr class="tr-title">
                <td class="td-154" style="border-bottom:0;"></td>
                <td colspan="9" style="border-bottom:0;">
                  <div style="display: inline-block; width: 100%;font-size:12px;color:#666;" class="pro-code"><span>商家编码：</span><span class="pro-code" style="margin-left:10px;">创建时间：2018-07-18 17:32:08<span class="div-flag-style" style="display: inline-block;margin:0 20px;position:relative"><i class="icon-qrcode" style="background: none; color: #555; font-size: 20px; margin-right: 0;"></i><div class="QRcode" style="display: none; position: absolute;width:110px;top:28px;left:0;z-index:10;" id="qrcode"><p><img src="/upload/goods_qrcode/goods_qrcode_154.png" style="width:110px;"></p></div></span></span>
                  </div>
                </td>
              </tr>
              <tr>
                <td align="center"><i class="checkbox-common"><input value="154" name="sub" data-state="1" type="checkbox"></i></td>
                <td colspan="1">
                  <div style="width:450px;">
                    <a class="a-pro-view-img" href="http://b2c.niuteam.cn/goods/goodsinfo?goodsid=154" target="_blank" style="height:70px;line-height:70px;text-align:center;"><img class="thumbnail-img" src="/upload/goods/20180718/1b39ba1e861f577e3fcd34f54dbeadae4.jpg"></a>
                    <div class="div-pro-view-name">
                      <div class="editGoodsIntroduction" ondblclick="editGoodsInfo(this)"><a target="_blank" style="word-break:break-all;" href="http://b2c.niuteam.cn/goods/goodsinfo?goodsid=154">AAA3213-副本</a></div><input class="js-update-goods-name input-common" style="width:350px!important;" data-goods-id="154" data-up-type="goods_name"
                          type="text" value="AAA3213-副本"><br>
                      <div class="editGoodsIntroduction" ondblclick="editGoodsInfo(this)"><span style="color:#999;font-size:12px;display:block;height:25px;overflow:hidden;text-decoration: none;">123123213123123</span></div><input data-goods-id="154" data-up-type="introduction" class="js-update-introduction input-common" style="width:350px!important;"
                          type="text" maxlength="60" value="123123213123123">
                      <div style="position: relative;margin-left: 75px;"><i style="color:#999;font-size:12px;margin-top:5px;padding:1px 4px;border-radius:3px;display:inline-block;color:#FFF;background-color:#FF6600;text-decoration: none;height:16px;line-height: 16px;overflow:hidden;margin-right:5px;text-align:center;font-style:normal;">新品lll</i>
                        <i style="color:#999;font-size:12px;margin-top:5px;padding:1px 4px;border-radius:3px;display:inline-block;color:#FFF;background-color:#FF6600;text-decoration: none;height:16px;line-height: 16px;overflow:hidden;margin-right:5px;text-align:center;font-style:normal;">活动</i>
                        <i
                            style="color:#999;font-size:12px;margin-top:5px;padding:1px 4px;border-radius:3px;display:inline-block;color:#FFF;background-color:#FF6600;text-decoration: none;height:16px;line-height: 16px;overflow:hidden;margin-right:5px;text-align:center;font-style:normal;">热卖</i>
                      </div>
                    </div>
                  </div>
                </td>
                <td style="text-align: right;">
                  <div><span class="price-numble" id="moreChangePrice154" style="color:#FF6600;">5.00</span></div>
                </td>
                <td style="text-align: right;">
                  <div class="cell"><span class="pro-stock" style="color: #666;" id="moreChangeStock154">22</span></div>
                </td>
                <td style="text-align: right;">
                  <div class="cell"><span class="pro-stock" style="color: #666;" id="moreChangeStock154">0</span></div>
                </td>
                <td style="text-align: center;"><span>虚拟类</span></td>
                <td style="text-align: center;">
                  <div class="cell"><input class="input-common input-common-sort" goods_id="154" value="0" onchange="changeSort(this)" type="number" title="排序号数值越大，商城商品列表显示越靠前"></div>
                </td>
                <td>
                  <div class="bs-docs-example tooltip-demo" style="text-align: center;"><a href="/goods/addgoods?step=2&amp;goodsId=154" title="编辑商品">编辑</a><a href="javascript:copyGoodsDetail(154);" title="复制商品">复制</a><a href="javascript:deleteGoods(154)" title="删除商品">删除</a><br><a href="javascript:modifyGoodsOnline(154,'offline')">下架</a><br>
                    <a href="javascript:showMemberDiscount(154)">设置会员折扣</a><br><a href="/goods/virtualGoodsList?goods_id=154" title="虚拟商品管理" target="_blank">虚拟商品管理</a></div>
                </td>
              </tr>
              <tr class="tr-title">
                <td class="td-152" style="border-bottom:0;"></td>
                <td colspan="9" style="border-bottom:0;">
                  <div style="display: inline-block; width: 100%;font-size:12px;color:#666;" class="pro-code"><span>商家编码：</span><span class="pro-code" style="margin-left:10px;">创建时间：2018-07-18 16:27:52<span class="div-flag-style" style="display: inline-block;margin:0 20px;position:relative"><i class="icon-qrcode" style="background: none; color: #555; font-size: 20px; margin-right: 0;"></i><div class="QRcode" style="display: none; position: absolute;width:110px;top:28px;left:0;z-index:10;" id="qrcode"><p><img src="/upload/goods_qrcode/goods_qrcode_152.png" style="width:110px;"></p></div></span></span>
                  </div>
                </td>
              </tr>
              <tr>
                <td align="center"><i class="checkbox-common"><input value="152" name="sub" data-state="1" type="checkbox"></i></td>
                <td colspan="1">
                  <div style="width:450px;">
                    <a class="a-pro-view-img" href="http://b2c.niuteam.cn/goods/goodsinfo?goodsid=152" target="_blank" style="height:70px;line-height:70px;text-align:center;"><img class="thumbnail-img" src="/upload/goods/20180718/faf7a70e656bf2dadea2e1e6ceff2f714.jpg"></a>
                    <div class="div-pro-view-name">
                      <div class="editGoodsIntroduction" ondblclick="editGoodsInfo(this)"><a target="_blank" style="word-break:break-all;" href="http://b2c.niuteam.cn/goods/goodsinfo?goodsid=152">TV1233213-副本</a></div><input class="js-update-goods-name input-common" style="width:350px!important;" data-goods-id="152" data-up-type="goods_name"
                          type="text" value="TV1233213-副本"><br>
                      <div style="position: relative;margin-left: 75px;"><i style="color:#999;font-size:12px;margin-top:5px;padding:1px 4px;border-radius:3px;display:inline-block;color:#FFF;background-color:#FF6600;text-decoration: none;height:16px;line-height: 16px;overflow:hidden;margin-right:5px;text-align:center;font-style:normal;">新品lll</i>
                        <i style="color:#999;font-size:12px;margin-top:5px;padding:1px 4px;border-radius:3px;display:inline-block;color:#FFF;background-color:#FF6600;text-decoration: none;height:16px;line-height: 16px;overflow:hidden;margin-right:5px;text-align:center;font-style:normal;">活动</i>
                        <i
                            style="color:#999;font-size:12px;margin-top:5px;padding:1px 4px;border-radius:3px;display:inline-block;color:#FFF;background-color:#FF6600;text-decoration: none;height:16px;line-height: 16px;overflow:hidden;margin-right:5px;text-align:center;font-style:normal;">热卖</i>
                      </div>
                    </div>
                  </div>
                </td>
                <td style="text-align: right;">
                  <div><span class="price-numble" id="moreChangePrice152" style="color:#FF6600;">5.00</span></div>
                </td>
                <td style="text-align: right;">
                  <div class="cell"><span class="pro-stock" style="color: #666;" id="moreChangeStock152">263</span></div>
                </td>
                <td style="text-align: right;">
                  <div class="cell"><span class="pro-stock" style="color: #666;" id="moreChangeStock152">1</span></div>
                </td>
                <td style="text-align: center;"><span>实物类</span></td>
                <td style="text-align: center;">
                  <div class="cell"><input class="input-common input-common-sort" goods_id="152" value="20" onchange="changeSort(this)" type="number" title="排序号数值越大，商城商品列表显示越靠前"></div>
                </td>
                <td>
                  <div class="bs-docs-example tooltip-demo" style="text-align: center;"><a href="/goods/addgoods?step=2&amp;goodsId=152" title="编辑商品">编辑</a><a href="javascript:copyGoodsDetail(152);" title="复制商品">复制</a><a href="javascript:deleteGoods(152)" title="删除商品">删除</a><br><a href="javascript:modifyGoodsOnline(152,'offline')">下架</a><br>
                    <a href="javascript:showMemberDiscount(152)">设置会员折扣</a>
                  </div>
                </td>
              </tr>
              <tr class="tr-title">
                <td class="td-151" style="border-bottom:0;"></td>
                <td colspan="9" style="border-bottom:0;">
                  <div style="display: inline-block; width: 100%;font-size:12px;color:#666;" class="pro-code"><span>商家编码：</span><span class="pro-code" style="margin-left:10px;">创建时间：2018-07-18 16:27:45<span class="div-flag-style" style="display: inline-block;margin:0 20px;position:relative"><i class="icon-qrcode" style="background: none; color: #555; font-size: 20px; margin-right: 0;"></i><div class="QRcode" style="display: none; position: absolute;width:110px;top:28px;left:0;z-index:10;" id="qrcode"><p><img src="/upload/goods_qrcode/goods_qrcode_151.png" style="width:110px;"></p></div></span></span>
                  </div>
                </td>
              </tr>
              <tr>
                <td align="center"><i class="checkbox-common"><input value="151" name="sub" data-state="1" type="checkbox"></i></td>
                <td colspan="1">
                  <div style="width:450px;">
                    <a class="a-pro-view-img" href="http://b2c.niuteam.cn/goods/goodsinfo?goodsid=151" target="_blank" style="height:70px;line-height:70px;text-align:center;"><img class="thumbnail-img" src="/upload/goods/20180718/faf7a70e656bf2dadea2e1e6ceff2f714.jpg"></a>
                    <div class="div-pro-view-name">
                      <div class="editGoodsIntroduction" ondblclick="editGoodsInfo(this)"><a target="_blank" style="word-break:break-all;" href="http://b2c.niuteam.cn/goods/goodsinfo?goodsid=151">TV1233213-副本</a></div><input class="js-update-goods-name input-common" style="width:350px!important;" data-goods-id="151" data-up-type="goods_name"
                          type="text" value="TV1233213-副本"><br>
                      <div style="position: relative;margin-left: 75px;"><i style="color:#999;font-size:12px;margin-top:5px;padding:1px 4px;border-radius:3px;display:inline-block;color:#FFF;background-color:#FF6600;text-decoration: none;height:16px;line-height: 16px;overflow:hidden;margin-right:5px;text-align:center;font-style:normal;">新品lll</i>
                        <i style="color:#999;font-size:12px;margin-top:5px;padding:1px 4px;border-radius:3px;display:inline-block;color:#FFF;background-color:#FF6600;text-decoration: none;height:16px;line-height: 16px;overflow:hidden;margin-right:5px;text-align:center;font-style:normal;">活动</i>
                        <i
                            style="color:#999;font-size:12px;margin-top:5px;padding:1px 4px;border-radius:3px;display:inline-block;color:#FFF;background-color:#FF6600;text-decoration: none;height:16px;line-height: 16px;overflow:hidden;margin-right:5px;text-align:center;font-style:normal;">热卖</i>
                      </div>
                    </div>
                  </div>
                </td>
                <td style="text-align: right;">
                  <div><span class="price-numble" id="moreChangePrice151" style="color:#FF6600;">5.00</span></div>
                </td>
                <td style="text-align: right;">
                  <div class="cell"><span class="pro-stock" style="color: #666;" id="moreChangeStock151">264</span></div>
                </td>
                <td style="text-align: right;">
                  <div class="cell"><span class="pro-stock" style="color: #666;" id="moreChangeStock151">0</span></div>
                </td>
                <td style="text-align: center;"><span>实物类</span></td>
                <td style="text-align: center;">
                  <div class="cell"><input class="input-common input-common-sort" goods_id="151" value="2" onchange="changeSort(this)" type="number" title="排序号数值越大，商城商品列表显示越靠前"></div>
                </td>
                <td>
                  <div class="bs-docs-example tooltip-demo" style="text-align: center;"><a href="/goods/addgoods?step=2&amp;goodsId=151" title="编辑商品">编辑</a><a href="javascript:copyGoodsDetail(151);" title="复制商品">复制</a><a href="javascript:deleteGoods(151)" title="删除商品">删除</a><br><a href="javascript:modifyGoodsOnline(151,'offline')">下架</a><br>
                    <a href="javascript:showMemberDiscount(151)">设置会员折扣</a>
                  </div>
                </td>
              </tr>
              <tr class="tr-title">
                <td class="td-150" style="border-bottom:0;"></td>
                <td colspan="9" style="border-bottom:0;">
                  <div style="display: inline-block; width: 100%;font-size:12px;color:#666;" class="pro-code"><span>商家编码：</span><span class="pro-code" style="margin-left:10px;">创建时间：2018-07-18 15:55:05<span class="div-flag-style" style="display: inline-block;margin:0 20px;position:relative"><i class="icon-qrcode" style="background: none; color: #555; font-size: 20px; margin-right: 0;"></i><div class="QRcode" style="display: none; position: absolute;width:110px;top:28px;left:0;z-index:10;" id="qrcode"><p><img src="/upload/goods_qrcode/goods_qrcode_150.png" style="width:110px;"></p></div></span></span>
                  </div>
                </td>
              </tr>
              <tr>
                <td align="center"><i class="checkbox-common"><input value="150" name="sub" data-state="1" type="checkbox"></i></td>
                <td colspan="1">
                  <div style="width:450px;">
                    <a class="a-pro-view-img" href="http://b2c.niuteam.cn/goods/goodsinfo?goodsid=150" target="_blank" style="height:70px;line-height:70px;text-align:center;"><img class="thumbnail-img" src="/upload/goods/20180718/faf7a70e656bf2dadea2e1e6ceff2f714.jpg"></a>
                    <div class="div-pro-view-name">
                      <div class="editGoodsIntroduction" ondblclick="editGoodsInfo(this)"><a target="_blank" style="word-break:break-all;" href="http://b2c.niuteam.cn/goods/goodsinfo?goodsid=150">TV1233213</a></div><input class="js-update-goods-name input-common" style="width:350px!important;" data-goods-id="150" data-up-type="goods_name"
                          type="text" value="TV1233213"><br>
                      <div class="editGoodsIntroduction" ondblclick="editGoodsInfo(this)"><span style="color:#999;font-size:12px;display:block;height:25px;overflow:hidden;text-decoration: none;">321AAAAAAA</span></div><input data-goods-id="150" data-up-type="introduction" class="js-update-introduction input-common" style="width:350px!important;"
                          type="text" maxlength="60" value="321AAAAAAA">
                      <div style="position: relative;margin-left: 75px;"><i style="color:#999;font-size:12px;margin-top:5px;padding:1px 4px;border-radius:3px;display:inline-block;color:#FFF;background-color:#FF6600;text-decoration: none;height:16px;line-height: 16px;overflow:hidden;margin-right:5px;text-align:center;font-style:normal;">新品lll</i>
                        <i style="color:#999;font-size:12px;margin-top:5px;padding:1px 4px;border-radius:3px;display:inline-block;color:#FFF;background-color:#FF6600;text-decoration: none;height:16px;line-height: 16px;overflow:hidden;margin-right:5px;text-align:center;font-style:normal;">活动</i>
                        <i
                            style="color:#999;font-size:12px;margin-top:5px;padding:1px 4px;border-radius:3px;display:inline-block;color:#FFF;background-color:#FF6600;text-decoration: none;height:16px;line-height: 16px;overflow:hidden;margin-right:5px;text-align:center;font-style:normal;">热卖</i>
                      </div>
                    </div>
                  </div>
                </td>
                <td style="text-align: right;">
                  <div><span class="price-numble" id="moreChangePrice150" style="color:#FF6600;">5.00</span></div>
                </td>
                <td style="text-align: right;">
                  <div class="cell"><span class="pro-stock" style="color: #666;" id="moreChangeStock150">262</span></div>
                </td>
                <td style="text-align: right;">
                  <div class="cell"><span class="pro-stock" style="color: #666;" id="moreChangeStock150">2</span></div>
                </td>
                <td style="text-align: center;"><span>实物类</span></td>
                <td style="text-align: center;">
                  <div class="cell"><input class="input-common input-common-sort" goods_id="150" value="2" onchange="changeSort(this)" type="number" title="排序号数值越大，商城商品列表显示越靠前"></div>
                </td>
                <td>
                  <div class="bs-docs-example tooltip-demo" style="text-align: center;"><a href="/goods/addgoods?step=2&amp;goodsId=150" title="编辑商品">编辑</a><a href="javascript:copyGoodsDetail(150);" title="复制商品">复制</a><a href="javascript:deleteGoods(150)" title="删除商品">删除</a><br><a href="javascript:modifyGoodsOnline(150,'offline')">下架</a><br>
                    <a href="javascript:showMemberDiscount(150)">设置会员折扣</a>
                  </div>
                </td>
              </tr>
              <tr class="tr-title">
                <td class="td-149" style="border-bottom:0;"></td>
                <td colspan="9" style="border-bottom:0;">
                  <div style="display: inline-block; width: 100%;font-size:12px;color:#666;" class="pro-code"><span>商家编码：</span><span class="pro-code" style="margin-left:10px;">创建时间：2018-07-17 19:18:38<span class="div-flag-style" style="display: inline-block;margin:0 20px;position:relative"><i class="icon-qrcode" style="background: none; color: #555; font-size: 20px; margin-right: 0;"></i><div class="QRcode" style="display: none; position: absolute;width:110px;top:28px;left:0;z-index:10;" id="qrcode"><p><img src="/upload/goods_qrcode/goods_qrcode_149.png" style="width:110px;"></p></div></span></span>
                  </div>
                </td>
              </tr>
              <tr>
                <td align="center"><i class="checkbox-common"><input value="149" name="sub" data-state="1" type="checkbox"></i></td>
                <td colspan="1">
                  <div style="width:450px;">
                    <a class="a-pro-view-img" href="http://b2c.niuteam.cn/goods/goodsinfo?goodsid=149" target="_blank" style="height:70px;line-height:70px;text-align:center;"><img class="thumbnail-img" src="/upload/goods/20180714/15944de900d8591a9b58a310578828c14.jpg"></a>
                    <div class="div-pro-view-name">
                      <div class="editGoodsIntroduction" ondblclick="editGoodsInfo(this)"><a target="_blank" style="word-break:break-all;" href="http://b2c.niuteam.cn/goods/goodsinfo?goodsid=149">123</a></div><input class="js-update-goods-name input-common" style="width:350px!important;" data-goods-id="149" data-up-type="goods_name"
                          type="text" value="123"><br>
                      <div style="position: relative;margin-left: 75px;"><i style="color:#999;font-size:12px;margin-top:5px;padding:1px 4px;border-radius:3px;display:inline-block;color:#FFF;background-color:#FF6600;text-decoration: none;height:16px;line-height: 16px;overflow:hidden;margin-right:5px;text-align:center;font-style:normal;">新品lll</i>
                        <i style="color:#999;font-size:12px;margin-top:5px;padding:1px 4px;border-radius:3px;display:inline-block;color:#FFF;background-color:#FF6600;text-decoration: none;height:16px;line-height: 16px;overflow:hidden;margin-right:5px;text-align:center;font-style:normal;">活动</i>
                        <i
                            style="color:#999;font-size:12px;margin-top:5px;padding:1px 4px;border-radius:3px;display:inline-block;color:#FFF;background-color:#FF6600;text-decoration: none;height:16px;line-height: 16px;overflow:hidden;margin-right:5px;text-align:center;font-style:normal;">热卖</i>
                      </div>
                    </div>
                  </div>
                </td>
                <td style="text-align: right;">
                  <div><span class="price-numble" id="moreChangePrice149" style="color:#FF6600;">5.00</span></div>
                </td>
                <td style="text-align: right;">
                  <div class="cell"><span class="pro-stock" style="color: #666;" id="moreChangeStock149">23</span></div>
                </td>
                <td style="text-align: right;">
                  <div class="cell"><span class="pro-stock" style="color: #666;" id="moreChangeStock149">3</span></div>
                </td>
                <td style="text-align: center;"><span>虚拟类</span></td>
                <td style="text-align: center;">
                  <div class="cell"><input class="input-common input-common-sort" goods_id="149" value="0" onchange="changeSort(this)" type="number" title="排序号数值越大，商城商品列表显示越靠前"></div>
                </td>
                <td>
                  <div class="bs-docs-example tooltip-demo" style="text-align: center;"><a href="/goods/addgoods?step=2&amp;goodsId=149" title="编辑商品">编辑</a><a href="javascript:copyGoodsDetail(149);" title="复制商品">复制</a><a href="javascript:deleteGoods(149)" title="删除商品">删除</a><br><a href="javascript:modifyGoodsOnline(149,'offline')">下架</a><br>
                    <a href="javascript:showMemberDiscount(149)">设置会员折扣</a><br><a href="/goods/virtualGoodsList?goods_id=149" title="虚拟商品管理" target="_blank">虚拟商品管理</a></div>
                </td>
              </tr>
              <tr class="tr-title">
                <td class="td-148" style="border-bottom:0;"></td>
                <td colspan="9" style="border-bottom:0;">
                  <div style="display: inline-block; width: 100%;font-size:12px;color:#666;" class="pro-code"><span>商家编码：</span><span class="pro-code" style="margin-left:10px;">创建时间：2018-07-16 23:10:49<span class="div-flag-style" style="display: inline-block;margin:0 20px;position:relative"><i class="icon-qrcode" style="background: none; color: #555; font-size: 20px; margin-right: 0;"></i><div class="QRcode" style="display: none; position: absolute;width:110px;top:28px;left:0;z-index:10;" id="qrcode"><p><img src="/upload/goods_qrcode/goods_qrcode_148.png" style="width:110px;"></p></div></span></span>
                  </div>
                </td>
              </tr>
              <tr>
                <td align="center"><i class="checkbox-common"><input value="148" name="sub" data-state="1" type="checkbox"></i></td>
                <td colspan="1">
                  <div style="width:450px;">
                    <a class="a-pro-view-img" href="http://b2c.niuteam.cn/goods/goodsinfo?goodsid=148" target="_blank" style="height:70px;line-height:70px;text-align:center;"><img class="thumbnail-img" src="/upload/goods/20180716/bb7a0c87be73d8429f762610cab168c24.JPG"></a>
                    <div class="div-pro-view-name">
                      <div class="editGoodsIntroduction" ondblclick="editGoodsInfo(this)"><a target="_blank" style="word-break:break-all;" href="http://b2c.niuteam.cn/goods/goodsinfo?goodsid=148">闻气味</a></div><input class="js-update-goods-name input-common" style="width:350px!important;" data-goods-id="148" data-up-type="goods_name"
                          type="text" value="闻气味"><br>
                      <div style="position: relative;margin-left: 75px;"><i style="color:#999;font-size:12px;margin-top:5px;padding:1px 4px;border-radius:3px;display:inline-block;color:#FFF;background-color:#FF6600;text-decoration: none;height:16px;line-height: 16px;overflow:hidden;margin-right:5px;text-align:center;font-style:normal;">新品lll</i>
                        <i style="color:#999;font-size:12px;margin-top:5px;padding:1px 4px;border-radius:3px;display:inline-block;color:#FFF;background-color:#FF6600;text-decoration: none;height:16px;line-height: 16px;overflow:hidden;margin-right:5px;text-align:center;font-style:normal;">活动</i>
                        <i
                            style="color:#999;font-size:12px;margin-top:5px;padding:1px 4px;border-radius:3px;display:inline-block;color:#FFF;background-color:#FF6600;text-decoration: none;height:16px;line-height: 16px;overflow:hidden;margin-right:5px;text-align:center;font-style:normal;">热卖</i>
                      </div>
                    </div>
                  </div>
                </td>
                <td style="text-align: right;">
                  <div><span class="price-numble" id="moreChangePrice148" style="color:#FF6600;">11.00</span></div>
                </td>
                <td style="text-align: right;">
                  <div class="cell"><span class="pro-stock" style="color: #666;" id="moreChangeStock148">53</span></div>
                </td>
                <td style="text-align: right;">
                  <div class="cell"><span class="pro-stock" style="color: #666;" id="moreChangeStock148">2</span></div>
                </td>
                <td style="text-align: center;"><span>实物类</span></td>
                <td style="text-align: center;">
                  <div class="cell"><input class="input-common input-common-sort" goods_id="148" value="0" onchange="changeSort(this)" type="number" title="排序号数值越大，商城商品列表显示越靠前"></div>
                </td>
                <td>
                  <div class="bs-docs-example tooltip-demo" style="text-align: center;"><a href="/goods/addgoods?step=2&amp;goodsId=148" title="编辑商品">编辑</a><a href="javascript:copyGoodsDetail(148);" title="复制商品">复制</a><a href="javascript:deleteGoods(148)" title="删除商品">删除</a><br><a href="javascript:modifyGoodsOnline(148,'offline')">下架</a><br>
                    <a href="javascript:showMemberDiscount(148)">设置会员折扣</a>
                  </div>
                </td>
              </tr>
              <tr class="tr-title">
                <td class="td-147" style="border-bottom:0;"></td>
                <td colspan="9" style="border-bottom:0;">
                  <div style="display: inline-block; width: 100%;font-size:12px;color:#666;" class="pro-code"><span>商家编码：</span><span class="pro-code" style="margin-left:10px;">创建时间：2018-07-16 23:01:55<span class="div-flag-style" style="display: inline-block;margin:0 20px;position:relative"><i class="icon-qrcode" style="background: none; color: #555; font-size: 20px; margin-right: 0;"></i><div class="QRcode" style="display: none; position: absolute;width:110px;top:28px;left:0;z-index:10;" id="qrcode"><p><img src="/upload/goods_qrcode/goods_qrcode_147.png" style="width:110px;"></p></div></span></span>
                  </div>
                </td>
              </tr>
              <tr>
                <td align="center"><i class="checkbox-common"><input value="147" name="sub" data-state="1" type="checkbox"></i></td>
                <td colspan="1">
                  <div style="width:450px;">
                    <a class="a-pro-view-img" href="http://b2c.niuteam.cn/goods/goodsinfo?goodsid=147" target="_blank" style="height:70px;line-height:70px;text-align:center;"><img class="thumbnail-img" src="/upload/goods/20180716/56b45a461f19569dd7bc467a14be1f874.JPG"></a>
                    <div class="div-pro-view-name">
                      <div class="editGoodsIntroduction" ondblclick="editGoodsInfo(this)"><a target="_blank" style="word-break:break-all;" href="http://b2c.niuteam.cn/goods/goodsinfo?goodsid=147">微波炉五件套</a></div><input class="js-update-goods-name input-common" style="width:350px!important;" data-goods-id="147" data-up-type="goods_name"
                          type="text" value="微波炉五件套"><br>
                      <div style="position: relative;margin-left: 75px;"><i style="color:#999;font-size:12px;margin-top:5px;padding:1px 4px;border-radius:3px;display:inline-block;color:#FFF;background-color:#FF6600;text-decoration: none;height:16px;line-height: 16px;overflow:hidden;margin-right:5px;text-align:center;font-style:normal;">热卖</i>
                        <i style="color:#999;font-size:12px;margin-top:5px;padding:1px 4px;border-radius:3px;display:inline-block;color:#FFF;background-color:#FF6600;text-decoration: none;height:16px;line-height: 16px;overflow:hidden;margin-right:5px;text-align:center;font-style:normal;">活动</i>
                        <i
                            style="color:#999;font-size:12px;margin-top:5px;padding:1px 4px;border-radius:3px;display:inline-block;color:#FFF;background-color:#FF6600;text-decoration: none;height:16px;line-height: 16px;overflow:hidden;margin-right:5px;text-align:center;font-style:normal;">新品lll</i>
                      </div>
                    </div>
                  </div>
                </td>
                <td style="text-align: right;">
                  <div><span class="price-numble" id="moreChangePrice147" style="color:#FF6600;">1.00</span></div>
                </td>
                <td style="text-align: right;">
                  <div class="cell"><span class="pro-stock" style="color: #666;" id="moreChangeStock147">55</span></div>
                </td>
                <td style="text-align: right;">
                  <div class="cell"><span class="pro-stock" style="color: #666;" id="moreChangeStock147">0</span></div>
                </td>
                <td style="text-align: center;"><span>实物类</span></td>
                <td style="text-align: center;">
                  <div class="cell"><input class="input-common input-common-sort" goods_id="147" value="0" onchange="changeSort(this)" type="number" title="排序号数值越大，商城商品列表显示越靠前"></div>
                </td>
                <td>
                  <div class="bs-docs-example tooltip-demo" style="text-align: center;"><a href="/goods/addgoods?step=2&amp;goodsId=147" title="编辑商品">编辑</a><a href="javascript:copyGoodsDetail(147);" title="复制商品">复制</a><a href="javascript:deleteGoods(147)" title="删除商品">删除</a><br><a href="javascript:modifyGoodsOnline(147,'offline')">下架</a><br>
                    <a href="javascript:showMemberDiscount(147)">设置会员折扣</a>
                  </div>
                </td>
              </tr>
              <tr class="tr-title">
                <td class="td-143" style="border-bottom:0;"></td>
                <td colspan="9" style="border-bottom:0;">
                  <div style="display: inline-block; width: 100%;font-size:12px;color:#666;" class="pro-code"><span>商家编码：123465456</span><span class="pro-code" style="margin-left:10px;">创建时间：2018-07-16 16:39:20<span class="div-flag-style" style="display: inline-block;margin:0 20px;position:relative"><i class="icon-qrcode" style="background: none; color: #555; font-size: 20px; margin-right: 0;"></i><div class="QRcode" style="display: none; position: absolute;width:110px;top:28px;left:0;z-index:10;" id="qrcode"><p><img src="/upload/goods_qrcode/goods_qrcode_143.png" style="width:110px;"></p></div></span></span>
                  </div>
                </td>
              </tr>
              <tr>
                <td align="center"><i class="checkbox-common"><input value="143" name="sub" data-state="1" type="checkbox"></i></td>
                <td colspan="1">
                  <div style="width:450px;">
                    <a class="a-pro-view-img" href="http://b2c.niuteam.cn/goods/goodsinfo?goodsid=143" target="_blank" style="height:70px;line-height:70px;text-align:center;"><img class="thumbnail-img" src="/upload/goods/20180706/37f55c761deeedd480bca9084b364d7c4.jpg"></a>
                    <div class="div-pro-view-name">
                      <div class="editGoodsIntroduction" ondblclick="editGoodsInfo(this)"><a target="_blank" style="word-break:break-all;" href="http://b2c.niuteam.cn/goods/goodsinfo?goodsid=143">1111</a></div><input class="js-update-goods-name input-common" style="width:350px!important;" data-goods-id="143" data-up-type="goods_name"
                          type="text" value="1111"><br>
                      <div style="position: relative;margin-left: 75px;"></div>
                    </div>
                  </div>
                </td>
                <td style="text-align: right;">
                  <div><span class="price-numble" id="moreChangePrice143" style="color:#FF6600;">1.00</span></div>
                </td>
                <td style="text-align: right;">
                  <div class="cell"><span class="pro-stock" style="color: #666;" id="moreChangeStock143">300</span></div>
                </td>
                <td style="text-align: right;">
                  <div class="cell"><span class="pro-stock" style="color: #666;" id="moreChangeStock143">0</span></div>
                </td>
                <td style="text-align: center;"><span>实物类</span></td>
                <td style="text-align: center;">
                  <div class="cell"><input class="input-common input-common-sort" goods_id="143" value="111" onchange="changeSort(this)" type="number" title="排序号数值越大，商城商品列表显示越靠前"></div>
                </td>
                <td>
                  <div class="bs-docs-example tooltip-demo" style="text-align: center;"><a href="/goods/addgoods?step=2&amp;goodsId=143" title="编辑商品">编辑</a><a href="javascript:copyGoodsDetail(143);" title="复制商品">复制</a><a href="javascript:deleteGoods(143)" title="删除商品">删除</a><br><a href="javascript:modifyGoodsOnline(143,'offline')">下架</a><br>
                    <a href="javascript:showMemberDiscount(143)">设置会员折扣</a>
                  </div>
                </td>
              </tr>
              <tr class="tr-title">
                <td class="td-141" style="border-bottom:0;"></td>
                <td colspan="9" style="border-bottom:0;">
                  <div style="display: inline-block; width: 100%;font-size:12px;color:#666;" class="pro-code"><span>商家编码：</span><span class="pro-code" style="margin-left:10px;">创建时间：2018-07-15 23:43:28<span class="div-flag-style" style="display: inline-block;margin:0 20px;position:relative"><i class="icon-qrcode" style="background: none; color: #555; font-size: 20px; margin-right: 0;"></i><div class="QRcode" style="display: none; position: absolute;width:110px;top:28px;left:0;z-index:10;" id="qrcode"><p><img src="/upload/goods_qrcode/goods_qrcode_141.png" style="width:110px;"></p></div></span></span>
                  </div>
                </td>
              </tr>
              <tr>
                <td align="center"><i class="checkbox-common"><input value="141" name="sub" data-state="1" type="checkbox"></i></td>
                <td colspan="1">
                  <div style="width:450px;">
                    <a class="a-pro-view-img" href="http://b2c.niuteam.cn/goods/goodsinfo?goodsid=141" target="_blank" style="height:70px;line-height:70px;text-align:center;"><img class="thumbnail-img" src="/upload/goods/20180714/c54d7aff1631ec696e11fb1208e0bac04.png"></a>
                    <div class="div-pro-view-name">
                      <div class="editGoodsIntroduction" ondblclick="editGoodsInfo(this)"><a target="_blank" style="word-break:break-all;" href="http://b2c.niuteam.cn/goods/goodsinfo?goodsid=141">222221-副本</a></div><input class="js-update-goods-name input-common" style="width:350px!important;" data-goods-id="141" data-up-type="goods_name"
                          type="text" value="222221-副本"><br>
                      <div style="position: relative;margin-left: 75px;"></div>
                    </div>
                  </div>
                </td>
                <td style="text-align: right;">
                  <div><span class="price-numble" id="moreChangePrice141" style="color:#FF6600;">99.00</span></div>
                </td>
                <td style="text-align: right;">
                  <div class="cell"><span class="pro-stock" style="color: #666;" id="moreChangeStock141">99996</span></div>
                </td>
                <td style="text-align: right;">
                  <div class="cell"><span class="pro-stock" style="color: #666;" id="moreChangeStock141">2</span></div>
                </td>
                <td style="text-align: center;"><span>虚拟类</span></td>
                <td style="text-align: center;">
                  <div class="cell"><input class="input-common input-common-sort" goods_id="141" value="0" onchange="changeSort(this)" type="number" title="排序号数值越大，商城商品列表显示越靠前"></div>
                </td>
                <td>
                  <div class="bs-docs-example tooltip-demo" style="text-align: center;"><a href="/goods/addgoods?step=2&amp;goodsId=141" title="编辑商品">编辑</a><a href="javascript:copyGoodsDetail(141);" title="复制商品">复制</a><a href="javascript:deleteGoods(141)" title="删除商品">删除</a><br><a href="javascript:modifyGoodsOnline(141,'offline')">下架</a><br>
                    <a href="javascript:showMemberDiscount(141)">设置会员折扣</a><br><a href="/goods/virtualGoodsList?goods_id=141" title="虚拟商品管理" target="_blank">虚拟商品管理</a></div>
                </td>
              </tr>
              <tr class="tr-title">
                <td class="td-139" style="border-bottom:0;"></td>
                <td colspan="9" style="border-bottom:0;">
                  <div style="display: inline-block; width: 100%;font-size:12px;color:#666;" class="pro-code"><span>商家编码：</span><span class="pro-code" style="margin-left:10px;">创建时间：2018-07-14 15:26:53<span class="div-flag-style" style="display: inline-block;margin:0 20px;position:relative"><i class="icon-qrcode" style="background: none; color: #555; font-size: 20px; margin-right: 0;"></i><div class="QRcode" style="display: none; position: absolute;width:110px;top:28px;left:0;z-index:10;" id="qrcode"><p><img src="/upload/goods_qrcode/goods_qrcode_139.png" style="width:110px;"></p></div></span></span>
                  </div>
                </td>
              </tr>
              <tr>
                <td align="center"><i class="checkbox-common"><input value="139" name="sub" data-state="1" type="checkbox"></i></td>
                <td colspan="1">
                  <div style="width:450px;">
                    <a class="a-pro-view-img" href="http://b2c.niuteam.cn/goods/goodsinfo?goodsid=139" target="_blank" style="height:70px;line-height:70px;text-align:center;"><img class="thumbnail-img" src="/upload/goods/20180714/c54d7aff1631ec696e11fb1208e0bac04.png"></a>
                    <div class="div-pro-view-name">
                      <div class="editGoodsIntroduction" ondblclick="editGoodsInfo(this)"><a target="_blank" style="word-break:break-all;" href="http://b2c.niuteam.cn/goods/goodsinfo?goodsid=139">as</a></div><input class="js-update-goods-name input-common" style="width:350px!important;" data-goods-id="139" data-up-type="goods_name"
                          type="text" value="as"><br>
                      <div style="position: relative;margin-left: 75px;"></div>
                    </div>
                  </div>
                </td>
                <td style="text-align: right;">
                  <div><span class="price-numble" id="moreChangePrice139" style="color:#FF6600;">10.00</span></div>
                </td>
                <td style="text-align: right;">
                  <div class="cell"><span class="pro-stock" style="color: #666;" id="moreChangeStock139">221</span></div>
                </td>
                <td style="text-align: right;">
                  <div class="cell"><span class="pro-stock" style="color: #666;" id="moreChangeStock139">1</span></div>
                </td>
                <td style="text-align: center;"><span>虚拟类</span></td>
                <td style="text-align: center;">
                  <div class="cell"><input class="input-common input-common-sort" goods_id="139" value="0" onchange="changeSort(this)" type="number" title="排序号数值越大，商城商品列表显示越靠前"></div>
                </td>
                <td>
                  <div class="bs-docs-example tooltip-demo" style="text-align: center;"><a href="/goods/addgoods?step=2&amp;goodsId=139" title="编辑商品">编辑</a><a href="javascript:copyGoodsDetail(139);" title="复制商品">复制</a><a href="javascript:deleteGoods(139)" title="删除商品">删除</a><br><a href="javascript:modifyGoodsOnline(139,'offline')">下架</a><br>
                    <a href="javascript:showMemberDiscount(139)">设置会员折扣</a><br><a href="/goods/virtualGoodsList?goods_id=139" title="虚拟商品管理" target="_blank">虚拟商品管理</a></div>
                </td>
              </tr>
              <tr class="tr-title">
                <td class="td-136" style="border-bottom:0;"></td>
                <td colspan="9" style="border-bottom:0;">
                  <div style="display: inline-block; width: 100%;font-size:12px;color:#666;" class="pro-code"><span>商家编码：</span><span class="pro-code" style="margin-left:10px;">创建时间：2018-07-10 21:50:10<span class="div-flag-style" style="display: inline-block;margin:0 20px;position:relative"><i class="icon-qrcode" style="background: none; color: #555; font-size: 20px; margin-right: 0;"></i><div class="QRcode" style="display: none; position: absolute;width:110px;top:28px;left:0;z-index:10;" id="qrcode"><p><img src="/upload/goods_qrcode/goods_qrcode_136.png" style="width:110px;"></p></div></span></span>
                  </div>
                </td>
              </tr>
              <tr>
                <td align="center"><i class="checkbox-common"><input value="136" name="sub" data-state="1" type="checkbox"></i></td>
                <td colspan="1">
                  <div style="width:450px;">
                    <a class="a-pro-view-img" href="http://b2c.niuteam.cn/goods/goodsinfo?goodsid=136" target="_blank" style="height:70px;line-height:70px;text-align:center;"><img class="thumbnail-img" src="/upload/goods/20180706/37f55c761deeedd480bca9084b364d7c4.jpg"></a>
                    <div class="div-pro-view-name">
                      <div class="editGoodsIntroduction" ondblclick="editGoodsInfo(this)"><a target="_blank" style="word-break:break-all;" href="http://b2c.niuteam.cn/goods/goodsinfo?goodsid=136">werwer</a></div><input class="js-update-goods-name input-common" style="width:350px!important;" data-goods-id="136" data-up-type="goods_name"
                          type="text" value="werwer"><br>
                      <div style="position: relative;margin-left: 75px;"></div>
                    </div>
                  </div>
                </td>
                <td style="text-align: right;">
                  <div><span class="price-numble" id="moreChangePrice136" style="color:#FF6600;">0.00</span></div>
                </td>
                <td style="text-align: right;">
                  <div class="cell"><span class="pro-stock" style="color: #666;" id="moreChangeStock136">0</span></div>
                </td>
                <td style="text-align: right;">
                  <div class="cell"><span class="pro-stock" style="color: #666;" id="moreChangeStock136">0</span></div>
                </td>
                <td style="text-align: center;"><span>实物类</span></td>
                <td style="text-align: center;">
                  <div class="cell"><input class="input-common input-common-sort" goods_id="136" value="0" onchange="changeSort(this)" type="number" title="排序号数值越大，商城商品列表显示越靠前"></div>
                </td>
                <td>
                  <div class="bs-docs-example tooltip-demo" style="text-align: center;"><a href="/goods/addgoods?step=2&amp;goodsId=136" title="编辑商品">编辑</a><a href="javascript:copyGoodsDetail(136);" title="复制商品">复制</a><a href="javascript:deleteGoods(136)" title="删除商品">删除</a><br><a href="javascript:modifyGoodsOnline(136,'offline')">下架</a><br>
                    <a href="javascript:showMemberDiscount(136)">设置会员折扣</a>
                  </div>
                </td>
              </tr>
              <tr class="tr-title">
                <td class="td-135" style="border-bottom:0;"></td>
                <td colspan="9" style="border-bottom:0;">
                  <div style="display: inline-block; width: 100%;font-size:12px;color:#666;" class="pro-code"><span>商家编码：</span><span class="pro-code" style="margin-left:10px;">创建时间：2018-07-10 14:25:48<span class="div-flag-style" style="display: inline-block;margin:0 20px;position:relative"><i class="icon-qrcode" style="background: none; color: #555; font-size: 20px; margin-right: 0;"></i><div class="QRcode" style="display: none; position: absolute;width:110px;top:28px;left:0;z-index:10;" id="qrcode"><p><img src="/upload/goods_qrcode/goods_qrcode_135.png" style="width:110px;"></p></div></span></span>
                  </div>
                </td>
              </tr>
              <tr>
                <td align="center"><i class="checkbox-common"><input value="135" name="sub" data-state="1" type="checkbox"></i></td>
                <td colspan="1">
                  <div style="width:450px;">
                    <a class="a-pro-view-img" href="http://b2c.niuteam.cn/goods/goodsinfo?goodsid=135" target="_blank" style="height:70px;line-height:70px;text-align:center;"><img class="thumbnail-img" src="/upload/goods/20180710/0f3fdc0c7b1dd84f7fd9bd7bc04a66f24.png"></a>
                    <div class="div-pro-view-name">
                      <div class="editGoodsIntroduction" ondblclick="editGoodsInfo(this)"><a target="_blank" style="word-break:break-all;" href="http://b2c.niuteam.cn/goods/goodsinfo?goodsid=135">测试发布一个积分兑换商品</a></div><input class="js-update-goods-name input-common" style="width:350px!important;" data-goods-id="135" data-up-type="goods_name"
                          type="text" value="测试发布一个积分兑换商品"><br>
                      <div style="position: relative;margin-left: 75px;"></div>
                    </div>
                  </div>
                </td>
                <td style="text-align: right;">
                  <div><span class="price-numble" id="moreChangePrice135" style="color:#FF6600;">0.00</span></div>
                </td>
                <td style="text-align: right;">
                  <div class="cell"><span class="pro-stock" style="color: #666;" id="moreChangeStock135">8</span></div>
                </td>
                <td style="text-align: right;">
                  <div class="cell"><span class="pro-stock" style="color: #666;" id="moreChangeStock135">2</span></div>
                </td>
                <td style="text-align: center;"><span>虚拟类</span></td>
                <td style="text-align: center;">
                  <div class="cell"><input class="input-common input-common-sort" goods_id="135" value="0" onchange="changeSort(this)" type="number" title="排序号数值越大，商城商品列表显示越靠前"></div>
                </td>
                <td>
                  <div class="bs-docs-example tooltip-demo" style="text-align: center;"><a href="/goods/addgoods?step=2&amp;goodsId=135" title="编辑商品">编辑</a><a href="javascript:copyGoodsDetail(135);" title="复制商品">复制</a><a href="javascript:deleteGoods(135)" title="删除商品">删除</a><br><a href="javascript:modifyGoodsOnline(135,'offline')">下架</a><br>
                    <a href="javascript:showMemberDiscount(135)">设置会员折扣</a><br><a href="/goods/virtualGoodsList?goods_id=135" title="虚拟商品管理" target="_blank">虚拟商品管理</a></div>
                </td>
              </tr>
            </tbody>
          </table>
        </div>
        <input type="hidden" id="state" value="">
        <input type="hidden" id="selectGoodsLabelId">
        <input type="hidden" id="stock_warning" value="0">
      </div>
      <input type="hidden" id="hidden_sort_rule" class="">

      <div class="modal fade hide" id="set_member_discount" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
        <div class="modal-dialog">
          <div class="modal-content">
            <div class="modal-header">
              <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
              <h3>设置商品折扣</h3>
            </div>
            <div class="modal-body" id="member_discount">
              <dl>
                <dt>黄金会员</dt>
                <dd>
                  <input class="input-common harf" type="number" data-level-id="47" maxlength="3"><em class="unit">%</em>
                </dd>
              </dl>
              <dl>
                <dt>白银会员</dt>
                <dd>
                  <input class="input-common harf" type="number" data-level-id="48" maxlength="3"><em class="unit">%</em>
                </dd>
              </dl>
              <dl>
                <dt>青铜会员</dt>
                <dd>
                  <input class="input-common harf" type="number" data-level-id="49" maxlength="3"><em class="unit">%</em>
                </dd>
              </dl>
              <dl>
                <dt>钻石卡</dt>
                <dd>
                  <input class="input-common harf" type="number" data-level-id="50" maxlength="3"><em class="unit">%</em>
                </dd>
              </dl>
              <dl>
                <dt>vip会员等级</dt>
                <dd>
                  <input class="input-common harf" type="number" data-level-id="51" maxlength="3"><em class="unit">%</em>
                </dd>
              </dl>
              <dl>
                <dt>价格保留方式</dt>
                <dd>
                  <label class="radio inline normal decimal_reservation_number">
                  <i class="checkbox-common">
                    <input type="checkbox" name="decimal-reservation-number" value="0">
                  </i>
                  <span>抹去角和分</span>
                </label>
                  <label class="radio inline normal decimal_reservation_number">
                  <i class="checkbox-common">
                    <input type="checkbox" name="decimal-reservation-number" value="1">
                  </i>
                  <span>抹去分</span>
                </label>
                </dd>
              </dl>
            </div>
            <div class="modal-footer">
              <button class="btn-common btn-big" onclick="save_goods_discount();">保存</button>
              <button class="btn-common-cancle btn-big" data-dismiss="modal">关闭</button>
            </div>
          </div>
        </div>
      </div>
    </div>

  </section>
</template>

<script>

export default {
  name: 'goodsList',

  data () {
    return {
      dialogSetMemberDiscountFormVisible: false,
      dialogBatchProcessingFormVisible: false,
      moreQueryPopoverVisible: false,
      seleteRecommendTypesPopoverVisible: false,
      seleteTagsPopoverVisible: false,
      batchProcessingForm: {},
      setMemberDiscountForm: {},
      updateRecommendTypes: [],
      updateTags: [],
      brandList: [
        {
          id: 1,
          name: '娃哈哈',
          images: ''
        }, {
          id: 2,
          name: '娃哈哈1',
          images: ''
        }, {
          id: 3,
          name: '娃哈哈2',
          images: ''
        }, {
          id: 4,
          name: '娃哈哈3',
          images: ''
        }, {
          id: 5,
          name: '小米',
          images: ''
        }, {
          id: 6,
          name: '三星',
          images: ''
        }, {
          id: 7,
          name: '索尼',
          images: ''
        }
      ],
      categroyList: [
        {
          id: 1,
          name: '家用电器',
          level: 0,
          abbreviate: '家电',
          relationCategory: '女装',
          isShow: true,
          sort: 1
        }, {
          id: 2,
          name: '手机/运营商/数码',
          level: 0,
          abbreviate: '通讯',
          relationCategory: '',
          isShow: true,
          sort: 1
        }, {
          id: 3,
          name: '电脑/办公',
          level: 0,
          abbreviate: '电脑',
          relationCategory: '',
          isShow: true,
          sort: 1
        }, {
          id: 4,
          name: '家居/家具/家装/厨具',
          level: 0,
          abbreviate: '家居',
          relationCategory: '',
          isShow: true,
          sort: 1
        }, {
          id: 5,
          name: '男装/女装/童装/内衣',
          level: 0,
          abbreviate: '衣服',
          relationCategory: '',
          isShow: true,
          sort: 1
        }, {
          id: 6,
          name: '美妆个护/宠物',
          level: 0,
          abbreviate: '美妆',
          relationCategory: '',
          isShow: true,
          sort: 1
        }, {
          id: 7,
          name: '女鞋/箱包/钟表/珠宝',
          level: 0,
          abbreviate: '配饰',
          relationCategory: '',
          isShow: true,
          sort: 1
        }, {
          id: 8,
          name: '男鞋/运动/户外',
          level: 0,
          abbreviate: '运动',
          relationCategory: '',
          isShow: true,
          sort: 1
        }, {
          id: 9,
          name: '汽车/汽车用品',
          level: 0,
          abbreviate: '汽车',
          relationCategory: '',
          isShow: true,
          sort: 1
        }, {
          id: 10,
          name: '母婴/玩具用品',
          level: 0,
          abbreviate: '母婴',
          relationCategory: '',
          isShow: true,
          sort: 1
        }, {
          id: 11,
          name: '食品/酒类/生鲜/特产',
          level: 0,
          abbreviate: '食品生鲜',
          relationCategory: '',
          isShow: true,
          sort: 1
        }, {
          id: 12,
          name: '礼品鲜花/农资绿植',
          level: 0,
          abbreviate: '礼品农资',
          relationCategory: '',
          isShow: true,
          sort: 1
        }, {
          id: 13,
          name: '电视',
          level: 1,
          parentId: 1,
          abbreviate: '电视',
          relationCategory: '',
          isShow: true,
          sort: 1
        }, {
          id: 14,
          name: '空调',
          level: 1,
          parentId: 1,
          abbreviate: '空调',
          relationCategory: '',
          isShow: true,
          sort: 1
        }, {
          id: 15,
          name: '洗衣机',
          level: 1,
          parentId: 1,
          abbreviate: '洗衣机',
          relationCategory: '',
          isShow: true,
          sort: 1
        }, {
          id: 16,
          name: '智能家居',
          level: 1,
          parentId: 1,
          abbreviate: '智能家居',
          relationCategory: '',
          isShow: true,
          sort: 1
        }, {
          id: 17,
          name: '曲面电视',
          level: 2,
          parentId: 13,
          abbreviate: '曲面电视',
          relationCategory: '',
          isShow: true,
          sort: 1
        }, {
          id: 18,
          name: '超薄电视',
          level: 2,
          parentId: 13,
          abbreviate: '超薄电视',
          relationCategory: '',
          isShow: true,
          sort: 1
        }, {
          id: 19,
          name: 'HDR电视',
          level: 2,
          parentId: 13,
          abbreviate: 'HDR电视',
          relationCategory: '',
          isShow: true,
          sort: 1
        }, {
          id: 20,
          name: '电脑整机',
          level: 1,
          parentId: 3,
          abbreviate: '电脑整机',
          relationCategory: '',
          isShow: true,
          sort: 1
        }, {
          id: 21,
          name: '电脑配件',
          level: 1,
          parentId: 3,
          abbreviate: '电脑配件',
          relationCategory: '',
          isShow: true,
          sort: 1
        }, {
          id: 22,
          name: '外设产品',
          level: 1,
          parentId: 3,
          abbreviate: '外设产品',
          relationCategory: '',
          isShow: true,
          sort: 1
        }, {
          id: 23,
          name: '鼠标',
          level: 2,
          parentId: 22,
          abbreviate: '鼠标',
          relationCategory: '',
          isShow: true,
          sort: 1
        }, {
          id: 24,
          name: '键盘',
          level: 2,
          parentId: 22,
          abbreviate: '键盘',
          relationCategory: '',
          isShow: true,
          sort: 1
        }, {
          id: 25,
          name: '键鼠套装',
          level: 2,
          parentId: 22,
          abbreviate: '键鼠套装',
          relationCategory: '',
          isShow: true,
          sort: 1
        }
      ],
      queryForm: {
        labels: []
      },
      selectedStatus: 1,
      goodsList: [{
        type: 10,
        goodsCode: '',
        name: '澳大利亚丁戈树红标经典红葡萄酒750ml',
        createDate: '2018-07-05 15:44:04',
        price: '0.00',
        totalStock: 1,
        totalSales: 1,
        sort: 1,
        tags: ['top', '热卖']
      }],
      showCategory: false,
      goodsTableSelection: []
    }
  },

  computed: {
    categroyLevel_0 () {
      return this.categroyList.filter(categroyListItem => categroyListItem.level === 0)
    }
  },

  methods: {
    handleSelectionChange (val) {
      this.goodsTableSelection = val
    },
    categroyLevel_1 (parentId) {
      return this.categroyList
        .filter(categroyListItem => categroyListItem.level === 1)
        .filter(categroyListItem => categroyListItem.parentId === parentId)
    },
    categroyLevel_2 (parentId) {
      return this.categroyList
        .filter(categroyListItem => categroyListItem.level === 2)
        .filter(categroyListItem => categroyListItem.parentId === parentId)
    }
  },

  components: {}
}
</script>

<style lang="scss" scoped>
#productTbody {
  td {
    padding: 5px;
    font-size: 12px;
  }
  td:first-child {
    border-left: 1px solid #e1e6f0;
  }
  td:last-child {
    border-right: 1px solid #e1e6f0;
  }
  tr:last-child td {
    border-bottom: 1px solid #e1e6f0;
  }
}

.tr-title td {
  border-top: 1px solid #e1e6f0;
}

.a-pro-view-img {
  float: left;
}

.thumbnail-img {
  width: 60px;
  margin-right: 10px;
  height: 60px;
}

.cell i {
  display: block;
}

.remodal-bg.with-red-theme.remodal-is-opening,
.remodal-bg.with-red-theme.remodal-is-opened {
  filter: none;
}

.remodal-overlay.with-red-theme {
  background-color: #f44336;
}

.remodal.with-red-theme {
  background: #fff;
}

input[type="radio"],
input[type="checkbox"] {
  margin: -1px 5px 0 0;
}

.edit-group {
  border-bottom: 1px solid #ebebeb;
  margin-bottom: 10px;
  label {
    font-weight: normal;
  }
}

.edit-group-title {
  height: 15px;
  line-height: 15px;
  width: 140px;
  margin-top: 3px;
  margin-bottom: 3px;
  color: #126ae4;
}

.edit-group-button {
  border-color: #3283fa;
  border: 1px solid #bbb;
  height: 26px;
  line-height: 24px;
  padding: 0 5px;
}

.group-button-bg {
  background: #3283fa;
  color: #fff;
}

.div-pro-view-name {
  width: 100%;
  min-height: 60px;
}

i.hot,
i.recommend,
i.new {
  font-size: 12px;
  margin-right: 5px;
  font-style: normal;
  color: #fff;
  background-color: #ff6600;
  border-radius: 2px;
  padding: 1px 4px;
  position: relative;
  top: -5px;
}

.icon-qrcode:before {
  content: "\f029";
}

[class^="icon-"]:before,
[class*=" icon-"]:before {
  text-decoration: inherit;
  display: inline-block;
  speak: none;
}

[class^="icon-"],
[class*=" icon-"] {
  font-family: FontAwesome;
  font-weight: normal;
  font-style: normal;
  text-decoration: inherit;
  -webkit-font-smoothing: antialiased;
}

input[type="number"] {
  -moz-appearance: textfield;
}

input[type="number"]::-webkit-inner-spin-button,
input[type="number"]::-webkit-outer-spin-button {
  -webkit-appearance: none;
  margin: 0;
}

input,
textarea,
.uneditable-input {
  width: 147px;
}

.table th,
.table td {
  vertical-align: middle;
}

.recommendBox {
  width: 360px;
  display: inline-block;
  float: right;
}

.introduction_box {
  width: 360px;
  display: inline-block;
  float: right;
}

.tab-content {
  overflow: visible;
}

.editGoodsIntroduction {
  display: inline-block;
  border: 1px dashed #fff;
  padding: 0;
  width: 350px;
  line-height: 25px;
  max-height: 60px;
  overflow: hidden;
  text-overflow: ellipsis;
  height: 25px;
}

.editGoodsIntroduction:hover {
  border-color: #ddd;
  cursor: pointer;
}

.editGoodsIntroduction+input {
  display: inline-block;
  padding: 0 5px;
  width: 350px;
  line-height: 25px;
  height: 25px;
  background: #eef7ff;
  display: none;
  margin: 0 0 10px !important;
}

.editGoodsIntroduction>a {
  margin-left: 0 !important;
}

.goods-fields-sort {
  cursor: pointer;
  span {
    background: url("/public/admin/images/goods_sort.png") no-repeat;
    width: 20px;
    height: 20px;
    display: inline-block;
    margin-left: 5px;
    vertical-align: middle;
    position: absolute;
  }
  span.asc {
    background-position: 0 5px;
  }
  span.selected.asc {
    background-position: -30px 5px;
  }
  span.desc {
    background-position: 0 -24px;
  }
  span.selected.desc {
    background-position: -30px -24px;
  }
}

.more-search {
  line-height: 20px;
  background: #fff;
  outline: none;
}

.interval {
  width: 2px;
  display: inline-block;
}

.ns-main {
  margin-top: 0;
}

.btn-common-white,
.btn-common {
  outline: none;
  line-height: 20px;
  display: inline-block;
}

@media screen and (max-width: 1260px) {
  a.btn-common {
    margin-bottom: 5px !important;
  }
}

.goodsCategory {
  width: 148px;
  height: 300px;
  border: 1px solid #cccccc;
  position: absolute;
  z-index: 100;
  background: #fff;
  right: 0;
  display: none;
  overflow-y: auto;
  top: 31px;
  ul {
    height: 280px;
    margin-top: -2px;
    margin-left: 0;
    li {
      text-align: left;
      padding: 0 10px;
      line-height: 30px;
      i {
        float: right;
        line-height: 30px;
      }
      span {
        width: 110px;
        display: inline-block;
        white-space: nowrap;
        text-overflow: ellipsis;
        overflow: hidden;
        vertical-align: middle;
        font-size: 12px;
      }
    }
    li:hover {
      cursor: pointer;
    }
    li:hover,
    li.selected {
      background: #0059d6;
      color: #fff;
    }
  }
}

.goodsCategory::-webkit-scrollbar {
  width: 3px;
}

.goodsCategory::-webkit-scrollbar-track {
  -webkit-box-shadow: inset 0 0 6px rgba(0, 0, 0, 0.3);
  border-radius: 10px;
  background-color: #fff;
}

.goodsCategory::-webkit-scrollbar-thumb {
  height: 20px;
  border-radius: 10px;
  -webkit-box-shadow: inset 0 0 6px rgba(0, 0, 0, 0.3);
  background-color: #ccc;
}

.two {
  left: 150px;
  border-left: 0;
}

.three {
  left: 299px;
  width: 148px;
  border-left: 0;
}

.selectGoodsCategory {
  width: 218px;
  height: 45px;
  border: 1px solid #cccccc;
  position: absolute;
  z-index: 100;
  left: 0;
  margin-top: 299px;
  border-collapse: collapse;
  background: #fff;
  display: none;
  a {
    display: block;
    height: 30px;
    width: 100px;
    text-align: center;
    color: #fff;
    line-height: 30px;
    margin: 8px;
    background: #126ae4;
    text-decoration: none;
  }
}

.el-button+.el-button {
  margin-left: 0px;
}

.margin-top-5 {
  margin-top: 5px;
}

.width-180 {
  width: 180px;
}

.info {
  font-size: 14px;
  line-height: 16px;
  color: #999999;
  margin: 10px 0 0;
}

</style>
