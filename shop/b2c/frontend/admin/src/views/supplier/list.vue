<template>

    <section class="ns-base-section">

        <div style="position:relative;margin:0;">
            <!-- 面包屑导航 -->
            <div class="breadcrumb-nav">
                <a href="http://b2c.niuteam.cn/admin.html">单商户B2C</a>
                <i class="fa fa-angle-right"></i>
                <a href="/goods/goodslist.html">商品</a>
                <i class="fa fa-angle-right"></i>
                <!-- 需要加跳转链接用这个：http://b2c.niuteam.cn/admin/member/supplierlist -->
                <a href="javascript:;" style="color:#999;">供货商</a>
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
                                    <p>相关教程：<a href="http://bbs.niushop.com.cn/forum.php?mod=viewthread&amp;tid=2308&amp;extra=page%3D2" target="_blank">http://bbs.niushop.com.cn/forum.php?mod=viewthread&amp;tid=2308&amp;extra=page%3D2</a></p>
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
                <tbody>
                    <tr>
                        <th width="20%" style="text-align: left;">
                            <button class="btn-common-delete btn-small" onclick="batchDelete()" style="margin:0 5px 0 0 !important;">批量删除</button>
                            <button class="btn-common btn-small" onclick="location.href='/Member/addsupplier.html';" style="margin:0 5px 0 0 !important;">添加供货商</button>
                        </th>
                        <th width="20%">
                            <input type="text" id="search_text" placeholder="输入代理商名称" class="input-common">
                            <input type="button" onclick="LoadingInfo(1)" value="搜索" class="btn-common">
                        </th>
                    </tr>
                </tbody>
            </table>
            <table class="table-class">
                <colgroup>
                    <col width="2%">
                    <col width="17%">
                    <col width="17%">
                    <col width="17%">
                    <col width="17%">
                    <col width="20%">
                    <col width="10%">
                </colgroup>
                <thead>
                    <tr align="center">
                        <th><i class="checkbox-common"><input type="checkbox" onclick="CheckAll(this)"></i></th>
                        <th align="left">供货商名称</th>
                        <th align="left">联系人</th>
                        <th align="left">联系电话</th>
                        <th align="left">联系地址</th>
                        <th align="left">供货商描述</th>
                        <th>操作</th>
                    </tr>
                </thead>
                <tbody><tr><td style="text-align:center;"><i class="checkbox-common"><input name="sub" type="checkbox" value="1"></i></td><td align="left">小米供货商</td><td align="left">xm</td><td>11111</td><td align="left">1111</td><td align="left">奥术大师大多</td><td align="center"> <a href="/Member/updatesupplier?supplier_id=1">修改</a>&nbsp;&nbsp;&nbsp;<a href="javascript:deleteSupplier(1);">删除</a></td></tr><tr><td style="text-align:center;"><i class="checkbox-common"><input name="sub" type="checkbox" value="2"></i></td><td align="left">三星供货商</td><td align="left">sx</td><td>23333</td><td align="left">3333</td><td align="left"></td><td align="center"> <a href="/Member/updatesupplier?supplier_id=2">修改</a>&nbsp;&nbsp;&nbsp;<a href="javascript:deleteSupplier(2);">删除</a></td></tr></tbody>
            </table>
        </div>

    </section>

</template>
