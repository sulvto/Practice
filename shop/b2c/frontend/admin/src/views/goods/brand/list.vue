<template>
    <section class="ns-base-section">
    
    
    
        <div style="position:relative;margin:0;">
            <!-- 面包屑导航 -->
            <div class="breadcrumb-nav">
                <a href="http://b2c.niuteam.cn/admin.html">单商户B2C</a>
                <i class="fa fa-angle-right"></i>
                <a href="http://b2c.niuteam.cn/admin/goods/goodslist.html">商品</a>
                <i class="fa fa-angle-right"></i>
                <!-- 需要加跳转链接用这个：http://b2c.niuteam.cn/admin/goods/goodsbrandlist -->
                <a href="javascript:;" style="color:#999;">商品品牌</a>
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
                                    <h4>操作提示</h4>
                                    <p>相关教程：<a href="http://bbs.niushop.com.cn/forum.php?mod=viewthread&amp;tid=2304&amp;extra=page%3D3" target="_blank">http://bbs.niushop.com.cn/forum.php?mod=viewthread&amp;tid=2304&amp;extra=page%3D3</a></p>
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
    
        <!-- 操作提示 -->
    
        <!-- 		 -->
        <div class="ns-warm-prompt" style="display:none;">
            <div class="alert alert-info">
                <button type="button" class="close">×</button>
                <h4>
                    <!-- 					{1block name="alert_info"} -->
                    <!-- 					<i class="fa fa-info-circle"></i> -->
                    <!-- 					<span class="operating-hints">操作提示</span> -->
                    <!-- 						 -->
                    <!-- 						<span>相关教程：<a href="http://bbs.niushop.com.cn/forum.php?mod=viewthread&tid=2304&extra=page%3D3" target="_blank">http://bbs.niushop.com.cn/forum.php?mod=viewthread&tid=2304&extra=page%3D3</a></span> -->
                    <!-- 						 -->
                    <!-- 					{1/block} -->
                </h4>
            </div>
        </div>
    
    
        <div class="ns-main">
    
            <table class="mytable">
                <tbody>
                    <tr>
                        <th width="30%" style="text-align: left;">
                            <button class="btn-common-delete" onclick="batchDelete()" style="margin:0 5px 0 0 !important;">批量删除</button>
                            <button class="btn-common" onclick="addBrand()" style="margin:0 5px 0 0 !important;">添加品牌</button>
                        </th>
                        <th width="20%">
                            <input type="text" id="search_text" placeholder="输入品牌名称" class="input-common">
                            <input type="button" onclick="LoadingInfo(1)" value="搜索" class="btn-common">
                        </th>
                    </tr>
                </tbody>
            </table>
            <table class="table-class">
                <colgroup>
                    <col style="width: 2%;">
                    <col style="width: 21%;">
                    <col style="width: 26%;">
                    <col style="width: 21%;">
                    <col style="width: 10%;">
                    <col style="width: 10%;">
                    <col style="width: 10%;">
                </colgroup>
                <thead>
                    <tr>
                        <th>
                            <i class="checkbox-common">
    					<input type="checkbox" onclick="CheckAll(this)">
    				</i>
                        </th>
                        <th align="left">品牌名称</th>
                        <th>图片</th>
                        <th>品牌首字母</th>
                        <th>是否推荐</th>
                        <th>排序</th>
                        <th>操作</th>
                    </tr>
                </thead>
                <tbody>
                    <tr align="center">
                        <td><i class="checkbox-common"><input name="sub" type="checkbox" value="2"></i></td>
                        <td align="left">小米</td>
                        <td></td>
                        <td>x</td>
                        <td>
                            <a href="javascript:;" class="is_visible" is_visible="1" onclick="updatetype(2, this)"><img src="/public/admin/images/checked.png" alt="" width="15"></a>
                        </td>
                        <td style="text-align: center;"><input type="number" onchange="updatesort(2,this)" class="sort input-common input-common-sort" name="categorySort" value="1"></td>
                        <td><a href="http://b2c.niuteam.cn/admin/goods/updategoodsbrand?brand_id=2">修改</a> <a href="javascript:delBrand(2)">删除</a></td>
                    </tr>
                    <tr align="center">
                        <td><i class="checkbox-common"><input name="sub" type="checkbox" value="4"></i></td>
                        <td align="left">索尼</td>
                        <td></td>
                        <td>S</td>
                        <td>
                            <a href="javascript:;" class="is_visible" is_visible="1" onclick="updatetype(4, this)"><img src="/public/admin/images/checked.png" alt="" width="15"></a>
                        </td>
                        <td style="text-align: center;"><input type="number" onchange="updatesort(4,this)" class="sort input-common input-common-sort" name="categorySort" value="1"></td>
                        <td><a href="http://b2c.niuteam.cn/admin/goods/updategoodsbrand?brand_id=4">修改</a> <a href="javascript:delBrand(4)">删除</a></td>
                    </tr>
                    <tr align="center">
                        <td><i class="checkbox-common"><input name="sub" type="checkbox" value="5"></i></td>
                        <td align="left">三星</td>
                        <td></td>
                        <td>S</td>
                        <td>
                            <a href="javascript:;" class="is_visible" is_visible="1" onclick="updatetype(5, this)"><img src="/public/admin/images/checked.png" alt="" width="15"></a>
                        </td>
                        <td style="text-align: center;"><input type="number" onchange="updatesort(5,this)" class="sort input-common input-common-sort" name="categorySort" value="1"></td>
                        <td><a href="http://b2c.niuteam.cn/admin/goods/updategoodsbrand?brand_id=5">修改</a> <a href="javascript:delBrand(5)">删除</a></td>
                    </tr>
                </tbody>
            </table>
    
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
                        <li class="total-data" data-total-count="3">共3条</li>
                        <!-- <li class="page-count">共0页</li> -->
                        <li class="according-number">
                            跳<input type="text" class="input-medium" id="skipPage" data-curr-page="1">页
                        </li>
                    </ul>
                </div>
            </div>
            <input type="hidden" id="page_count" value="1">
            <input type="hidden" id="page_size" value="3">
    
        </div>
    
    </section>
</template>


<script>
require("@/assets/style/table.scss");

export default {
  name: "brandList",
  components: {}
};
</script>