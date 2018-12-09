<template>
  <section class="ns-base-section">
    <div class="ns-main">

      <div class="mb10" />
      <article class="custom-resolution">
        <button class="btn-common" data-width="320">320*0</button>
        <button class="btn-common" data-width="375">375*0</button>
        <button class="btn-common" data-width="425">425*0</button>
        <button class="btn-common" data-width="768">768*0</button>
        <button class="btn-common" data-width="1024">1024*0</button>
      </article>
      <article class="custom-template">
        <header data-custom-flag="CustomTemplateName" data-is-show="1">
          <img src="/public/static/wapCustomTemplate/images/titlebar.png">
          <h4 title="模板名称" data-custom-template-name="模板名称" style="margin: 0px 0px 0px -30px;">模板名称</h4>
        </header>
        <div class="custom-main" />
        <div class="caret-up" />
        <div class="plug-in">
          <h4>添加内容</h4>
          <ul>
            <li data-control-name="GoodsSearch" data-class-name="control-search draggable-element">商品搜索</li>
            <li data-control-name="GoodsList" data-class-name="control-goods-list draggable-element">商品列表</li>
            <li data-control-name="Title" data-class-name="control-title draggable-element">标题</li>
            <li data-control-name="TextNavigation" data-class-name="control-text-navigation draggable-element">文本导航</li>
            <li data-control-name="Notice" data-class-name="control-notice draggable-element">公告</li>
            <li data-control-name="ImgAd" data-class-name="control-img-ad carousel draggable-element" data-additional-attr="id='carouselImgAd'">图片广告</li>
            <li data-control-name="NavHyBrid" data-class-name="control-nav-img draggable-element">图文导航</li>
            <li data-control-name="GoodsClassify" data-class-name="control-goods-classify draggable-element">商品分类</li>
            <li data-control-name="Footer" data-class-name="control-footer draggable-element">底部菜单</li>
            <!-- 用户可以自己写代码，右侧出来一个富文本编辑器  -->
            <li data-control-name="RichText" data-class-name="control-rich-text draggable-element">富文本</li>
            <li data-control-name="CustomModule" data-class-name="control-custom-module draggable-element">自定义模块</li>
            <li data-control-name="AuxiliaryLine" data-class-name="control-auxiliary-line draggable-element">辅助线</li>
            <li data-control-name="AuxiliaryBlank" data-class-name="control-auxiliary-blank draggable-element">辅助空白</li>
            <li data-control-name="Coupons" data-class-name="control-coupons draggable-element">优惠券</li>
            <li data-control-name="Video" data-class-name="control-video draggable-element">视频</li>
            <li data-control-name="Audio" data-class-name="control-audio draggable-element">音频</li>
            <li data-control-name="ShowCase" data-class-name="control-show-case draggable-element">橱窗</li>
          </ul>
        </div>
        <div style="text-align:center;padding:10px;">
          <button class="btn-common btn-big js-save">保存</button>
          <button class="btn-common-cancle btn-big" onclick="javascript:history.back(-1);">返回</button>
        </div>
      </article>
      <div class="js-mask-btn" style="display:none;position: fixed; bottom: 0; left: 0; z-index: 10000; width: 100%; margin: 0;background-color: rgba(204, 204, 204, 0.701961);text-align: center;">
        <button class="btn-common btn-big js-save" style="margin: 12px auto !important;">保存</button>
      </div>
    </div>

  </section>
</template>
