<template>
  <section class="ns-base-section" style="">

    <div style="position:relative;margin:0;">
      <!-- 面包屑导航 -->
            <div class="breadcrumb-nav">
        <a href="index.html">零基础学IT就来</a>
                  <i class="fa fa-angle-right"></i>
          <a href="/config/usernotice.html">网站</a>
                  <i class="fa fa-angle-right"></i>
          <!-- 需要加跳转链接用这个：http://showfx.niuteam.cn/admin/cms/addarticle -->
          <a href="javascript:;" style="color:#999;">添加文章</a>
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
                                    <h4>功能提示</h4>
                  <p class="function-prompts"></p>
                </div>
              </div>
            </div>
          </li>

        </ul>
      </div>
    </div>

    <div class="ns-main" style="">

  <div class="set-style" style="">
  <h4>常规信息</h4>
  <dl>
    <dt><span class="required">*</span>文章标题：</dt>
    <dd>
      <input id="title" class="input-common long" type="text" name="title" maxlength="200">
      <p class="error">请输入文章标题</p>
    </dd>
  </dl>
  <dl>
    <dt>文章短标题：</dt>
    <dd>
      <input id="short_title" class="input-common" type="text">
      <p class="error"></p>
    </dd>
  </dl>
  <dl>
    <dt>文章标签：</dt>
    <dd>
      <input id="tag" class="input-common" type="text">
      <p class="error"></p>
    </dd>
  </dl>
  <dl>
    <dt>文章标题图片：</dt>
    <dd>
      <div class="upload-btn-common">
        <div>
          <input class="input-file" name="file_upload" id="uploadTitleImg" type="file" onchange="imgUpload(this);" title="上传">
          <input type="hidden" id="title_img" value="">
        </div>

        <input type="text" id="text_title_img" class="input-common" readonly="readonly" value="">
        <em>上传</em>
        <img id="preview_title_img" src="/public/static/blue/img/upload-common-select.png" data-src="" data-html="true" data-container="body" data-placement="top" data-trigger="manual" data-original-title="" title="">
      </div>
      <p class="hint">
        建议使用<i class="important-note">宽200</i>像素-<i class="important-note">高60</i>像素内的<i class="important-note">GIF</i>或<i class="important-note">PNG</i>透明图片
      </p>
      <p class="error">请上传图片</p>
    </dd>
  </dl>
  <dl>
    <dt>文章作者：</dt>
    <dd>
      <input id="author" class="input-common" type="text" name="author">
      <p class="error"></p>
    </dd>
  </dl>
  <dl>
    <dt>文章来源：</dt>
    <dd>
      <input id="source" class="input-common long" type="text">
      <p class="error"></p>
    </dd>
  </dl>
  <dl>
    <dt>文章来源链接：</dt>
    <dd>
      <input id="url" class="input-common" type="text">
      <p class="error"></p>
    </dd>
  </dl>
  <dl>
    <dt><span class="required">*</span>文章分类：</dt>
    <dd>
      <div class="selectric-wrapper selectric-select-common" style="width: 250px;"><div class="selectric-hide-select"><select id="class_id" class="select-common" tabindex="-1">
        <option value="0">请选择</option>
                  <option value="1">新闻1</option>
                      <option value="2">&nbsp;&nbsp;&nbsp;&nbsp;2</option>
                  </select></div><div class="selectric"><span class="selectric-label">请选择</span><button class="selectric-button">▾</button></div><div class="selectric-items" tabindex="-1"><div class="selectric-scroll"><ul><li data-index="0" class="selected" title="请选择">请选择</li><li data-index="1" class="" title="新闻1">新闻1</li><li data-index="2" class="last" title="&nbsp;&nbsp;&nbsp;&nbsp;2">&nbsp;&nbsp;&nbsp;&nbsp;2</li></ul></div></div><input class="selectric-input" tabindex="0"></div>
      <p class="error">请选择分类</p>
    </dd>
  </dl>
  <dl>
    <dt>文章关键字：</dt>
    <dd>
      <input id="keyword" type="text" class="input-common">
      <p class="error"></p>
    </dd>
  </dl>
  <dl>
    <dt>文章摘要：</dt>
    <dd>
      <textarea id="summary" rows="10" cols="10" class="textarea-common"></textarea>
      <p class="error"></p>
    </dd>
  </dl>
  <h4>文章内容</h4>
  <dl style="">
    <dt>文章内容：</dt>
    <dd style="">
    </dd>
  </dl>
  <dl>
    <dt>文章附件：</dt>
    <dd>
      <div class="upload-btn-common">
        <div>
          <input class="input-file" name="file_upload" id="uploadAttachment" type="file" onchange="imgUpload(this);" title="上传" only-type=".zip">
          <input type="hidden" id="attachment" value="">
        </div>

        <input type="text" id="text_attachment" class="input-common" readonly="readonly" value="">
        <em>上传</em>
      </div>
      <p class="hint">上传附件类型必须是<i class="important-note">zip</i>格式</p>
      <p class="error"></p>
    </dd>
  </dl>
  <dl class="hide">
    <dt>相关文章：</dt>
    <dd>
      <input id="article_id_array" class="input-common" type="text">
      <p class="hint"></p>
      <p class="error"></p>
    </dd>
  </dl>
  <h4>文章阐述</h4>
  <dl>
    <dt>是否推荐：</dt>
    <dd>
        <input id="commend_flag" type="checkbox" onchange="setIntegralAjax();" class="checkbox" simpleswitch="0" result="false" style="display: none;"><div class="Switch Switch_FlatRadius" id="Switch0"><span class="switch-open">是</span><span class="switch-close">否</span></div>
      <p class="error"></p>
    </dd>
  </dl>
  <dl>
    <dt>是否允许评论：</dt>
    <dd>
        <input id="comment_flag" type="checkbox" class="checkbox" simpleswitch="1" result="false" style="display: none;"><div class="Switch Switch_FlatRadius" id="Switch1"><span class="switch-open">是</span><span class="switch-close">否</span></div>
      <p class="error"></p>
    </dd>
  </dl>
  <dl>
    <dt>文章排序：</dt>
    <dd>
      <input id="sort" type="number" class="input-common harf" min="0" onkeyup="value=value.replace(/[^\d+(\.\d+)?]/g,'')">
      <p class="error"></p>
    </dd>
  </dl>
  <dl>
    <dt>文章点击量：</dt>
    <dd>
      <input id="click" type="number" class="input-common harf" min="0" onkeyup="value=value.replace(/[^\d+(\.\d+)?]/g,'')"><em class="unit">次</em>
      <p class="error"></p>
    </dd>
  </dl>
  <dl>
    <dt>文章评论数：</dt>
    <dd>
      <input id="comment_count" class="input-common harf" type="number" min="0" onkeyup="value=value.replace(/[^\d+(\.\d+)?]/g,'')"><em class="unit">次</em>
      <p class="error"></p>
    </dd>
  </dl>
  <dl>
    <dt>文章分享数：</dt>
    <dd>
      <input id="share_count" class="input-common harf" type="number" min="0" onkeyup="value=value.replace(/[^\d+(\.\d+)?]/g,'')"><em class="unit">次</em>
      <p class="error"></p>
    </dd>
  </dl>
  <dl>
    <dt></dt>
    <dd>
      <button class="btn-common btn-big" onclick="save(1)">保存</button>
      <!-- <button class="btn-common btn-big" onclick="save(2)" >保存并预览</button> -->
      <button class="btn-common-cancle btn-big" onclick="javascript:history.back(-1);">返回</button>
    </dd>
  </dl>
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
  <input type="hidden" id="page_count">
  <input type="hidden" id="page_size">
    </div>

  </section>
</template>
