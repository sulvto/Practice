<template>

    <section class="ns-base-section">
        <div style="position:relative;margin:0;">
            <!-- 面包屑导航 -->
            <div class="breadcrumb-nav">
                <a href="http://b2c.niuteam.cn/admin.html">单商户B2C</a>
                <i class="fa fa-angle-right"></i>
                <a href="/goods/goodslist.html">商品</a>
                <i class="fa fa-angle-right"></i>
                <!-- 需要加跳转链接用这个：http://b2c.niuteam.cn/admin/system/albumlist -->
                <a href="javascript:;" style="color:#999;">相册管理</a>
            </div>

            <!-- 三级导航菜单 -->
            <div class="right-side-operation">
                <ul>

                    <div class="upload-con" id="uploader" style="display:none;overflow:auto;height:350px;width:185px;">
                        <div class="js-file-msg"></div>
                        <div class="upload-pmgressbar js-file-loading"></div>
                        <div class="upload-txt"><span>支持Jpg、Png格式，大小不超过1024KB的图片上传；浏览文件时可以按住ctrl或shift键多选。</span></div>
                    </div>

                    <li>
                        <a class="js-open-warmp-prompt" href="javascript:;" data-menu-desc=""><i class="fa fa-question-circle"></i>&nbsp;提示</a>
                        <div class="popover">
                            <div class="arrow"></div>
                            <div class="popover-content">
                                <div>
                                    <h4>操作提示</h4>
                                    <p>相关教程：<a href="http://bbs.niushop.com.cn/forum.php?mod=viewthread&amp;tid=2312&amp;extra=page%3D2" target="_blank">http://bbs.niushop.com.cn/forum.php?mod=viewthread&amp;tid=2312&amp;extra=page%3D2</a></p>
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
                        <th style="text-align:left;">
                            <button class="btn-common-delete btn-small" data-toggle="modal" data-target="#addalbum">创建相册</button>
                            <button class="btn-common btn-small" id="open_uploader" style="position: relative;">上传图片<input type="file" id="fileupload" class="input-file" name="file_upload" multiple="multiple" style="left: 0;height: 30px !important;"></button>
                        </th>
                        <th>
                            <input type="text" id="search_text" placeholder="请输入相册名称" class="input-common">
                            <input type="button" onclick="searchData()" value="搜索" class="btn-common">
                        </th>
                    </tr>
                </tbody>
            </table>
            <ul id="albumList"><li style="border-width:0 1px 1px 1px;"><dl><dt><div class="covers"><a href="/system/albumpicturelist?album_id=40"><img src="/public/admin/images/album/album_cover_default.png"></a></div><h3><a href="/system/albumpicturelist?album_id=40&amp;&amp;album_name=111">111</a></h3></dt><dd class="date">共0张</dd><dd class="buttons"><span title="编辑相册"><a href="javascript:void(0);" onclick="editBoxShow(40);"><i class="fa fa-pencil fa-fw"></i>编辑</a></span><a href="javascript:void(0)" title="删除相册" onclick="deleteAlbumClass(40)"><i class="fa fa-remove"></i>删除</a></dd></dl></li><li style="border-width:0 1px 1px 0;"><dl><dt><div class="covers"><a href="/system/albumpicturelist?album_id=39"><img src="/upload/goods/20180816/1534394995.jpg"></a></div><h3><a href="/system/albumpicturelist?album_id=39&amp;&amp;album_name=我">我</a></h3></dt><dd class="date">共1张</dd><dd class="buttons"><span title="编辑相册"><a href="javascript:void(0);" onclick="editBoxShow(39);"><i class="fa fa-pencil fa-fw"></i>编辑</a></span><a href="javascript:void(0)" title="删除相册" onclick="deleteAlbumClass(39)"><i class="fa fa-remove"></i>删除</a></dd></dl></li><li style="border-width:0 1px 1px 0;"><dl><dt><div class="covers"><a href="/system/albumpicturelist?album_id=38"><img src="/public/admin/images/album/album_cover_default.png"></a></div><h3><a href="/system/albumpicturelist?album_id=38&amp;&amp;album_name=222">222</a></h3></dt><dd class="date">共0张</dd><dd class="buttons"><span title="编辑相册"><a href="javascript:void(0);" onclick="editBoxShow(38);"><i class="fa fa-pencil fa-fw"></i>编辑</a></span><a href="javascript:void(0)" title="删除相册" onclick="deleteAlbumClass(38)"><i class="fa fa-remove"></i>删除</a></dd></dl></li><li style="border-width:0 1px 1px 0;"><dl><dt><div class="covers"><a href="/system/albumpicturelist?album_id=37"><img src="/public/admin/images/album/album_cover_default.png"></a></div><h3><a href="/system/albumpicturelist?album_id=37&amp;&amp;album_name=11">11</a></h3></dt><dd class="date">共1张</dd><dd class="buttons"><span title="编辑相册"><a href="javascript:void(0);" onclick="editBoxShow(37);"><i class="fa fa-pencil fa-fw"></i>编辑</a></span><a href="javascript:void(0)" title="删除相册" onclick="deleteAlbumClass(37)"><i class="fa fa-remove"></i>删除</a></dd></dl></li><li style="border-width:0 1px 1px 0;"><dl><dt><div class="covers"><a href="/system/albumpicturelist?album_id=36"><img src="/public/admin/images/album/album_cover_default.png"></a></div><h3><a href="/system/albumpicturelist?album_id=36&amp;&amp;album_name=afafa">afafa</a></h3></dt><dd class="date">共0张</dd><dd class="buttons"><span title="编辑相册"><a href="javascript:void(0);" onclick="editBoxShow(36);"><i class="fa fa-pencil fa-fw"></i>编辑</a></span><a href="javascript:void(0)" title="删除相册" onclick="deleteAlbumClass(36)"><i class="fa fa-remove"></i>删除</a></dd></dl></li><li style="border-width:0 1px 1px 1px;"><dl><dt><div class="covers"><a href="/system/albumpicturelist?album_id=35"><img src="/public/admin/images/album/album_cover_default.png"></a></div><h3><a href="/system/albumpicturelist?album_id=35&amp;&amp;album_name=name">name</a></h3></dt><dd class="date">共2张</dd><dd class="buttons"><span title="编辑相册"><a href="javascript:void(0);" onclick="editBoxShow(35);"><i class="fa fa-pencil fa-fw"></i>编辑</a></span><a href="javascript:void(0)" title="删除相册" onclick="deleteAlbumClass(35)"><i class="fa fa-remove"></i>删除</a></dd></dl></li><li style="border-width:0 1px 1px 0;"><dl><dt><div class="covers"><a href="/system/albumpicturelist?album_id=34"><img src="/upload/goods/20180701/418a42dccfbe0287c4510b3abac75aa4.jpg"></a></div><h3><a href="/system/albumpicturelist?album_id=34&amp;&amp;album_name=logo">logo</a></h3></dt><dd class="date">共17张</dd><dd class="buttons"><span title="编辑相册"><a href="javascript:void(0);" onclick="editBoxShow(34);"><i class="fa fa-pencil fa-fw"></i>编辑</a></span><a href="javascript:void(0)" title="删除相册" onclick="deleteAlbumClass(34)"><i class="fa fa-remove"></i>删除</a></dd></dl></li><li style="border-width:0 1px 1px 0;"><dl><dt><div class="covers"><a href="/system/albumpicturelist?album_id=30"><img src="/upload/goods/20180731/8f993af222e74df10933a62b191f9fe1.jpg"></a></div><h3><a href="/system/albumpicturelist?album_id=30&amp;&amp;album_name=默认相册">默认相册</a></h3></dt><dd class="date">共288张</dd><dd class="buttons"><span title="编辑相册"><a href="javascript:void(0);" onclick="editBoxShow(30);"><i class="fa fa-pencil fa-fw"></i>编辑</a></span></dd></dl></li></ul>

            <!-- 相册创建  -->
            <div class="modal fade hide" id="addalbum" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
                <div class="modal-dialog">
                    <div class="modal-content">
                        <div class="modal-header">
                            <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
                            <h3>相册创建</h3>
                        </div>
                        <div class="modal-body">
                            <div class="dislog-style">
                                <div class="set-style">
                                    <dl>
                                        <dt>相册名称：</dt>
                                        <dd>
                                            <input type="text" class="input-common" id="album_name">
                                            <p class="error">请输入相册名称</p>
                                        </dd>
                                    </dl>
                                    <dl>
                                        <dt>排序：</dt>
                                        <dd>
                                            <input type="number" class="input-common harf" id="sort" onkeyup="this.value=this.value.replace(/\D/gi,&quot;&quot;)">
                                        </dd>
                                    </dl>
                                </div>
                            </div>
                        </div>
                        <div class="modal-footer">
                            <button type="button" class="btn-common btn-big" onclick="addAlbumClass();">保存</button>
                            <button type="button" class="btn btn-big" data-dismiss="modal">关闭</button>
                        </div>
                    </div>
                </div>
            </div>

            <!-- 相册编辑  -->
            <div class="modal fade hide" id="editalbum" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
                <div class="modal-dialog">
                    <div class="modal-content">
                        <div class="modal-header">
                            <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
                            <h3>相册编辑</h3>
                        </div>
                        <div class="modal-body">
                            <div class="dislog-style">
                                <input type="hidden" id="editAlbum_id" class="input-common">
                                <ul>
                                    <li>
                                        <span>相册名称：</span>
                                        <input type="text" class="input-common" id="edit_album_name">
                                        <span style="width: inherit;color: red;display:none;">请输入相册名称</span>
                                    </li>
                                    <li>
                                        <span>排序：</span>
                                        <input type="text" class="input-common" id="edit_sort" onkeyup="this.value=this.value.replace(/\D/gi,&quot;&quot;)">
                                    </li>
                                </ul>
                            </div>
                        </div>
                        <div class="modal-footer">
                            <button type="button" class="btn-common btn-big" onclick="updateAlbumClass();">保存</button>
                            <button type="button" class="btn btn-big" data-dismiss="modal">关闭</button>
                        </div>
                    </div>
                </div>
            </div>
        </div>

    </section>

</template>
