<template>

    <div>
      <el-button type="primary" size="small" @click="$router.push('qrcode.html')">添加自定义模板</el-button>

      <ul>
        <li v-for="(templateListItem, index) in templateList" :key="templateListItem.img" style="opacity: 1;height:auto;position:relative;width:19%;float:left;margin-right:1%;margin-top:10px;margin-bottom:10px;" @mouseover="showByIndex = index" @mouseout="showByIndex = null">
            <img :src="templateListItem.img" :class="{true: 'default-template-img', false: 'template-img'}[templateListItem.isDefault]">
            <div class="check" v-show="showByIndex === index" >
              <div v-if="templateListItem.isDefault">
                <div class="button" onclick="modifyWeixinQrcode(1)" style="margin-top:75%;cursor:pointer;">
                  <span>编辑</span>
                </div>
              </div>
              <div v-else>
                <div class="button" style="margin-top:50%;cursor:pointer;" @click="setTemplateDefault(templateListItem)">
                  <span >设为默认</span>
                </div>
                <div class="button" style="cursor:pointer;" @click="deleteTemplate(templateListItem.id)">
                  <span>删除</span>
                </div>
                <div class="button" onclick="modifyWeixinQrcode(1)" style="cursor:pointer;">
                  <span>编辑</span>
                </div>
              </div>
            </div>

            <div v-if="templateListItem.isDefault">
              <img src="/static/images/check_qrcode1.png" class="qrcode_img" style="position:absolute;top:0px;leftt:1px;">
            </div>
        </li>
      </ul>
    </div>
</template>

<script>
export default {
  name: 'list',
  data () {
    return {
      showByIndex: null,
      searchKeyword: '',
      templateList: [{
        id: 1,
        img: '/static/images/qrcode_bg/template_bg_img.png',
        isDefault: true,
        name: '微信登录',
        status: true,
        nickFontColor: '使用该功能需申请微信开放平台网站应用',
        nockFontSize: '',
        isShowLogo: false,
        headerLeft: '10px',
        headerTop: '10px',
        nameLeft: '10px',
        nameTop: '10px',
        logoLeft: '10px',
        logoTop: '10px',
        codeLeft: '10px',
        codeTop: '10px'
      }, {
        id: 2,
        img: '/static/images/promote_qrcode_template/qrcode_template_2_0.png',
        isDefault: false,
        name: '微信登录',
        status: true,
        nickFontColor: '使用该功能需申请微信开放平台网站应用',
        nockFontSize: '',
        isShowLogo: false,
        headerLeft: '10px',
        headerTop: '10px',
        nameLeft: '10px',
        nameTop: '10px',
        logoLeft: '10px',
        logoTop: '10px',
        codeLeft: '10px',
        codeTop: '10px'
      }, {
        id: 3,
        img: '/static/images/promote_qrcode_template/qrcode_template_3_0.png',
        isDefault: false,
        name: 'QQ登录',
        status: false,
        nickFontColor: '使用该功能需申请QQ互联',
        nockFontSize: '',
        isShowLogo: false,
        headerLeft: '10px',
        headerTop: '10px',
        nameLeft: '10px',
        nameTop: '10px',
        logoLeft: '10px',
        logoTop: '10px',
        codeLeft: '10px',
        codeTop: '10px'
      }]
    }
  },
  methods: {
    edit (index, row) {
      console.log(index, row)
    },
    setTemplateDefault (templateListItem) {
      this.templateList.forEach(templateList => {
        templateList.isDefault = false
      })
      templateListItem.isDefault = true
    },
    deleteTemplate (id) {
      let deleteId = this.templateList.findIndex(templateListItem => templateListItem.id === id)
      this.templateList.splice(deleteId, 1)
    },
    search () {
      console.log('search', this.searchKeyword)
    }

  },
  created () {
  }
}
</script>

<style lang="scss" scoped>

ul {
  margin: 0;
  padding: 0;
  list-style-type: none;
}

.check {
  position: absolute;
  bottom: 0px;
  width: 100%;
  height: 100%;
  right: -1px;
  background-color: rgba(0,0,0,0.8);
  div.button {
    width: 60%;
    height: 30px;
    margin-left: 20%;
    border: 1px solid #fff;
    margin-top: 10%;
    text-align: center;

    &:hover {
      background: #126AE4;
      border: 1px solid #126AE4;
    }
    span {
      font-size: 15px;
      color: #fff;
      line-height: 30px;
    }
  }
}

.default-template-img {
  border:1px solid #00C0FF;
}

.template-img {
  border:1px solid #eee;
}

</style>
