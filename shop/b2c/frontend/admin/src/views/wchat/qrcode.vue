<template>
  <section class="ns-base-section">
    <div class="ns-main">

      <div class="table">
        <div class="l qrcode" data-id="dragBlock" @mousedown="dragBlockDown" @mouseup="dragBlockUp">
          <img id="imgLogo">
          <img id="header" :style="{ left: headerLeft + 'px', top: headerTop + 'px' }" src="/static/images/icon-header.png" ondragstart="return false;" @mousemove="dragBlockMousemove">
          <img id="logo" :style="{ left: logoLeft + 'px', top: logoTop + 'px' }" src="/static/images/default_img_url/logo.png" ondragstart="return false;" @mousemove="dragBlockMousemove">
          <img id="code" :style="{ left: codeLeft + 'px', top: codeTop + 'px' }" src="/static/images/template_qrcode.png" ondragstart="return false;" @mousemove="dragBlockMousemove">
          <span id="name" :style="{ left: nameLeft + 'px', top: nameTop + 'px' }" style="color:#2B2B2B;font-size:23px;" ondragstart="return false;" @mousemove="dragBlockMousemove">昵称</span>
        </div>
        <div class="r form">

          <div class="set-style">
            <dl>
              <dt>背景图片:</dt>

              <dd>
                <div class="upload-btn-common">
                  <div>
                    <input class="input-file" name="file_upload" data-id="uploadImg" type="file" onchange="imgUpload(this);" title="上传">
                    <input type="hidden" data-id="Logo" value="">
                  </div>
                  <input type="text" data-id="text_Logo" class="input-common" readonly="readonly" value="">
                  <em>上传</em>

                  <img id="preview_Logo" src="/static/blue/img/upload-common-select.png" data-html="true" data-container="body" data-placement="top" data-trigger="manual">

                </div>
                <p class="hint">背景图必须是<i class="important-note">640*1138</i>的<i class="important-note">png</i>图像；点击下方"保存"按钮后生效。</p>
              </dd>
            </dl>
            <dl>
              <dt>昵称文本颜色:</dt>
              <dd>
                <input id="nick_font_color" type="color" value="#2B2B2B" class="input-common-color">
                <p class="error">请输入昵称文本颜色</p>
              </dd>
            </dl>
            <dl>
              <dt>昵称字体大小:</dt>
              <dd>
                <input id="nick_font_size" type="number" min="10" max="36" step="1" size="4" value="23" class="input-common harf"><em class="unit">PX</em>
                <p class="hint">字体大小的单位为像素（px）</p>
                <p class="error">请输入昵称字体大小</p>
              </dd>
            </dl>
            <dl>
              <dt>是否显示logo:</dt>
              <dd>
                <input id="is_logo_show" type="checkbox" class="checkbox" checked="" simpleswitch="0" result="true" style="display: none;"><div class="Switch Switch_FlatRadius On" data-id="Switch0"><span class="switch-open">是</span><span class="switch-close">否</span></div>
              </dd>
            </dl>
            <dl>
              <dd>
                <button class="btn-common btn-big" onclick="save();">保存</button>
                <button class="btn-common-cancle btn-big" onclick="javascript:history.back(-1);">返回</button>
              </dd>
            </dl>
          </div>
        </div>
      </div>

    </div>

  </section>
</template>

<script>
export default {
  name: 'Qrcode',
  data () {
    return {
      dragActive: false,
      blockWidth: 320,
      blockHeight: 569,
      blockPageX: 0,
      blockPageY: 0,
      blockOffsetLeft: 0,
      blockOffsetTop: 0,
      logoLeft: 10,
      logoTop: 10,
      logoLeftOnDragBlockDown: 0,
      logoTopOnDragBlockDown: 0,
      codeLeft: 70,
      codeTop: 300,
      codeLeftOnDragBlockDown: 0,
      codeTopOnDragBlockDown: 0,
      nameLeft: 150,
      nameTop: 120,
      nameLeftOnDragBlockDown: 0,
      nameTopOnDragBlockDown: 0,
      headerLeft: 120,
      headerTop: 100,
      headerLeftOnDragBlockDown: 0,
      headerTopOnDragBlockDown: 0,
      editForm: {},
      rules: {
        name: [
          { required: true, message: '请输入活动名称', trigger: 'blur' },
          { min: 3, max: 5, message: '长度在 3 到 5 个字符', trigger: 'blur' }
        ]
      }
    }
  },
  methods: {
    dragBlockDown (event) {
      this.dragActive = true
      this.blockPageX = event.pageX
      this.blockPageY = event.pageY
      this.logoLeftOnDragBlockDown = this.logoLeft
      this.logoTopOnDragBlockDown = this.logoTop
      this.nameLeftOnDragBlockDown = this.nameLeft
      this.nameTopOnDragBlockDown = this.nameTop
      this.codeLeftOnDragBlockDown = this.codeLeft
      this.codeTopOnDragBlockDown = this.codeTop
      this.headerLeftOnDragBlockDown = this.headerLeft
      this.headerTopOnDragBlockDown = this.headerTop
      console.log(event)
      this.blockOffsetLeft = event.target.offsetLeft
      this.blockOffsetTop = event.target.offsetTop
      console.log('dragBlockDown', this.blockPageX, this.blockPageY, this.blockOffsetLeft, this.blockOffsetTop)
    },
    dragBlockUp () {
      this.dragActive = false
    },
    dragBlockMousemove (event) {
      if (this.dragActive) {
        switch (event.target.id) {
          case 'logo':
            this.dragLogo(event)
            break
          case 'header':
            this.dragHeader(event)
            break
          case 'code':
            this.dragCode(event)
            break
          case 'name':
            this.dragName(event)
            break
        }
      }
    },
    dragLogo (event) {
      var logoTargetWidth = event.target.width
      var logoTargetHeight = event.target.height

      console.log('dragLogo page', event.pageX, event.pageY, event)
      console.log('dragLogo', this.logoLeftOnDragBlockDown, this.logoTopOnDragBlockDown)
      console.log('dragLogo event.target.width', event.target.width)
      console.log('dragLogo event.target.height', event.target.height)
      console.log('dragLogo blockPage', this.blockPageX, this.blockPageY)
      console.log('this.blockPageX - this.blockOffsetLeft', this.blockPageX - this.blockOffsetLeft)
      console.log('this.blockPageY - this.blockOffsetTop', this.blockPageY - this.blockOffsetTop)
      this.logoLeft = event.pageX - this.blockOffsetLeft - (this.blockPageX - this.blockOffsetLeft) + this.logoLeftOnDragBlockDown
      this.logoTop = event.pageY - this.blockOffsetTop - (this.blockPageY - this.blockOffsetTop) + this.logoTopOnDragBlockDown

      if (this.logoLeft < 0) {
        this.logoLeft = 0
      }
      if (this.logoLeft > (this.blockWidth - logoTargetWidth)) {
        this.logoLeft = this.blockWidth - logoTargetWidth
      }
      if (this.logoTop < -5) {
        this.logoTop = -5
      }
      if (this.logoTop > (this.blockHeight - logoTargetHeight)) {
        this.logoTop = this.blockHeight - logoTargetHeight
      }
      console.log('dragLogo', this.logoLeft, this.logoTop)
    },
    dragHeader (event) {
      var headerTargetWidth = event.target.width
      var headerTargetHeight = event.target.height

      this.headerLeft = event.pageX - this.blockOffsetLeft - (this.blockPageX - this.blockOffsetLeft) + this.headerLeftOnDragBlockDown
      this.headerTop = event.pageY - this.blockOffsetTop - (this.blockPageY - this.blockOffsetTop) + this.headerTopOnDragBlockDown

      if (this.headerLeft < 0) {
        this.headerLeft = 0
      }
      if (this.headerLeft > (this.blockWidth - headerTargetWidth)) {
        this.headerLeft = this.blockWidth - headerTargetWidth
      }
      if (this.headerTop < -5) {
        this.headerTop = -5
      }
      if (this.headerTop > (this.blockHeight - headerTargetHeight)) {
        this.headerTop = this.blockHeight - headerTargetHeight
      }
    },
    dragCode (event) {
      var codeTargetWidth = event.target.width
      var codeTargetHeight = event.target.height

      this.codeLeft = event.pageX - this.blockOffsetLeft - (this.blockPageX - this.blockOffsetLeft) + this.codeLeftOnDragBlockDown
      this.codeTop = event.pageY - this.blockOffsetTop - (this.blockPageY - this.blockOffsetTop) + this.codeTopOnDragBlockDown

      if (this.codeLeft < 0) {
        this.codeLeft = 0
      }
      if (this.codeLeft > (this.blockWidth - codeTargetWidth)) {
        this.codeLeft = this.blockWidth - codeTargetWidth
      }
      if (this.codeTop < -5) {
        this.codeTop = -5
      }
      if (this.codeTop > (this.blockHeight - codeTargetHeight)) {
        this.codeTop = this.blockHeight - codeTargetHeight
      }
    },
    dragName (event) {
      var nameTargetHeight = event.target.clientHeight

      this.nameLeft = event.pageX - this.blockOffsetLeft - (this.blockPageX - this.blockOffsetLeft) + this.nameLeftOnDragBlockDown
      this.nameTop = event.pageY - this.blockOffsetTop - (this.blockPageY - this.blockOffsetTop) + this.nameTopOnDragBlockDown

      if (this.nameLeft < 0) {
        this.nameLeft = 0
      }
      if (this.nameLeft > (this.blockWidth - 25)) {
        this.nameLeft = this.blockWidth - 25
      }
      if (this.nameTop < -5) {
        this.nameTop = -5
      }
      if (this.nameTop > (this.blockHeight - nameTargetHeight)) {
        this.nameTop = this.blockHeight - nameTargetHeight
      }
    },
    submitForm () {
      console.log('submitForm', this.editForm)
    }
  }
}
</script>

<style lang="scss" scoped>

.qrcode {
  width: 320px;
  height: 569px;
  margin-right: 25px;
  background: #f5f5f5;
  position: relative;
}

#imgLogo{max-width:320px;max-height:569px;}
#header{width:45px;height:45px;position:absolute;left:59px;top:15px;cursor:move;}
#logo{width:143px;position:absolute;left:60px;top:210px;cursor:move;}
#code{width:144px;height:144px;position:absolute;left:70px;top:300px;cursor:move;}
#name{position:absolute;left:128px;top:23px;font-size:14px;color:#000;cursor:move;}
</style>
