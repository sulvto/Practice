<template>
  <div></div>
</template>

<script>

import TestModal from '@/components/TestModal.vue'

export default {
  watch: {
    show (newValue, oldValue) {
      console.log(newValue ? 'show' : 'high')
      console.log(this.$slots.content[0])

      if (newValue) {
        const h = this.$createElement
        this.$msgbox({
          title: '消息',
          message: h(TestModal),
          showCancelButton: true,
          confirmButtonText: '确定',
          cancelButtonText: '取消',
          beforeClose: (action, instance, done) => {
            if (action === 'confirm') {
              instance.confirmButtonLoading = true
              instance.confirmButtonText = '执行中...'
              setTimeout(() => {
                done()
                setTimeout(() => {
                  instance.confirmButtonLoading = false
                }, 300)
              }, 3000)
            } else {
              done()
            }
          }
        }).then(action => {
          this.$message({
            type: 'info',
            message: 'action: ' + action
          })
        })
      } else {

      }
    }
  },
  data () {
    return {
    }
  },
  props: {
    show: Boolean
  },
  created () {
  }
}
</script>
