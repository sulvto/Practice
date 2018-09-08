<template>

    <section class="ns-base-section">

        <div style="position:relative;margin:0;">
            <!-- 面包屑导航 -->
            <div class="breadcrumb-nav">
                <a href="http://b2c.niuteam.cn/admin.html">单商户B2C</a>
                <i class="fa fa-angle-right"></i>
                <a href="/goods/goodslist.html">商品</a>
                <i class="fa fa-angle-right"></i>
                <!-- 需要加跳转链接用这个：http://b2c.niuteam.cn/admin/system/albumpicturelist -->
                <a href="javascript:;" style="color:#999;">图片管理</a>
            </div>
            <!-- 三级导航菜单 -->
            <nav class="ns-third-menu">
                <ul>
                    <li onclick="location.href='/System/albumList.html';">相册</li>
                    <li class="selected" onclick="location.href='/System/albumPictureList.html?album_id=36';">图片</li>
                </ul>
            </nav>

            <div class="right-side-operation">
                <ul>
                    <div class="upload-con" id="uploader" style="display:none;overflow:auto;height:350px;width:185px;">
                        <div class="js-file-msg"></div>
                        <div class="upload-pmgressbar js-file-loading"></div>
                        <div class="upload-txt"><span>支持Jpg、Png格式，大小不超过1024KB的图片上传；浏览文件时可以按住ctrl或shift键多选。</span>
                        </div>
                    </div>

                    <li>
                        <a class="js-open-warmp-prompt" href="javascript:;" data-menu-desc=""><i class="fa fa-question-circle"></i>&nbsp;提示</a>
                        <div class="popover">
                            <div class="arrow"></div>
                            <div class="popover-content">
                                <div>
                                    <h4>操作提示</h4>
                                    <p>sfgsdf</p>
                                    <hr>
                                    <h4>功能提示</h4>
                                    <p class="function-prompts">注：在使用‘替换上传’功能时，请保持图片的扩展名与被替换图片相同。</p>
                                </div>
                            </div>
                        </div>
                    </li>
                </ul>
            </div>
        </div>

        <div class="ns-main">

            <input type="hidden" id="album_id" value="36">
            <dl class="album-intro">
                <dt class="album-name">afafa</dt>
                <dd class="album-covers">
                    <img src="/public/admin/images/album/album_cover_default.png" id="album_cover">
                </dd>
                <dd class="album-info"></dd>
            </dl>
            <table class="search-form">
                <tbody>
                    <tr>
                        <th style="text-align: left;">
                            <span style="position: relative;">
                                <button class="btn-common-delete" id="open_uploader">上传图片</button>
                                <input type="file" id="fileupload" class="input-file" name="file_upload" multiple="multiple">
                            </span>
                            <button class="btn-common" onclick="checkAll()">全选</button>
                            <button class="btn-common" onclick="uncheckAll()">取消</button>
                            <button class="btn-common" onclick="switchAll()">反选</button>
                            <button class="btn-common" onclick="submit_form('del')">删除</button>
                            <button class="btn-common" onclick="submit_form('changealbum')">转移相册</button>
                        </th>
                        <th>
                            <span>排序方式：</span>
                            <div class="selectric-wrapper selectric-select-common selectric-middle" style="width: 150px;"><div class="selectric-hide-select"><select id="is_use" onchange="LoadingInfo(1);" class="select-common middle" tabindex="-1">
                                <option value="0">全部</option>
                                <option value="1">未使用</option>
                            </select></div><div class="selectric"><span class="selectric-label">全部</span><button class="selectric-button">▾</button></div><div class="selectric-items" tabindex="-1"><div class="selectric-scroll"><ul><li data-index="0" class="selected" title="全部">全部</li><li data-index="1" class="last" title="未使用">未使用</li></ul></div></div><input class="selectric-input" tabindex="0"></div>
                        </th>
                    </tr>
                </tbody>
            </table>
            <div class="ncsc-picture-list">
                <ul id="albumList">暂无符合条件的数据记录</ul>
            </div>
    <!-- 相册转移  -->
            <div class="modal fade hide" id="change_album_class" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
                <div class="modal-dialog">
                    <div class="modal-content">
                        <div class="modal-header">
                            <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
                            <h3>相册转移</h3>
                        </div>
                        <div class="modal-body">
                            <div class="dislog-style">
                                <input type="hidden" id="change_pic_id">
                                <ul>
                                    <li>
                                        <span>选择相册：</span>
                                        <select style="display: none;" id="change_album_id"><option value="40">111</option><option value="39">我</option><option value="38">222</option><option value="37">11</option><option value="36">afafa</option><option value="35">name</option><option value="34">logo</option><option value="30">默认相册</option></select><div tabindex="0" class="searchable-select"><span class="searchable-select-caret"></span><div class="searchable-select-holder">111</div><div class="searchable-select-dropdown searchable-select-hide"><input type="text" class="searchable-select-input"><div class="searchable-scroll"><div class="searchable-has-privious searchable-select-hide">...</div><div class="searchable-select-items"><div class="searchable-select-item selected hover" data-value="40">111</div><div class="searchable-select-item" data-value="39">我</div><div class="searchable-select-item" data-value="38">222</div><div class="searchable-select-item" data-value="37">11</div><div class="searchable-select-item" data-value="36">afafa</div><div class="searchable-select-item" data-value="35">name</div><div class="searchable-select-item" data-value="34">logo</div><div class="searchable-select-item" data-value="30">默认相册</div></div><div class="searchable-has-next searchable-select-hide">...</div></div></div></div>
                                        <input type="text" id="selected_album_class" style="padding:0;margin:0;opacity: 0;position: absolute;">
                                    </li>
                                </ul>
                            </div>
                        </div>
                        <div class="modal-footer">
                            <button type="button" class="btn-common btn-big" onclick="changeAlbumClass();">修改</button>
                            <button type="button" class="btn btn-big" data-dismiss="modal">关闭</button>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </section>
</template>
