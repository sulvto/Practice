<template>
  <div>
    <script id="container" name="content" type="text/plain">

    </script>
  </div>
</template>

<script>
import '@/assets/ueditor/ueditor.all.min.js'
import '@/assets/ueditor/ueditor.config.js'
import '@/assets/ueditor/ueditor.parse.min.js'
import '@/assets/ueditor/lang/zh-cn/zh-cn.js'

export default {
  name: 'UEditor',
  data () {
    return {
      editor: null
    }
  },
  props : {
    content: String,
    config: Object
  },
  mounted () {
    this.editor = UE.getEditor('container', this.config)
    this.editor.ready(() => {
      this.editor.setContent(this.content)
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

