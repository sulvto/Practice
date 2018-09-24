<template>
  <div>
    <script id="ueditor_container" name="content" type="text/plain">

    </script>
  </div>
</template>

<script>
require('@/../static/ueditor/ueditor.config.js')
require('@/../static/ueditor/ueditor.all.min.js')
require('@/../static/ueditor/ueditor.parse.min.js')
require('@/../static/ueditor/lang/zh-cn/zh-cn.js')

export default {
  name: 'UEditor',
  data () {
    return {
      editor: null,
      defaultConfig: {
        BaseUrl: '',
        UEDITOR_HOME_URL: '/static/ueditor/',
        zIndex: 999
      }
    }
  },
  props: {
    content: String,
    config: Object
  },
  mounted () {
    this.editor = window.UE.getEditor('ueditor_container', Object.assign(this.config, this.defaultConfig))
    this.editor.ready(() => {
      this.editor.setContent(this.content)
      this.editor.focus()
    })
  },
  methods: {
    getContent () {
      return this.editor.getContent()
    }
  },
  destroyed () {
    this.editor.destroy()
  }
}
</script>
