<!-- <div class="popover-content"> -->
<!-- <div> -->
<!-- <h4>操作提示</h4> -->
<!-- <p>模板消息插件菜单</p> -->
<!-- <hr> -->
<!-- <h4>功能提示</h4> -->
<!-- <p class="function-prompts"> -->
<!-- <strong>提示：</strong>如果，请查看是否是由于以下原因造成：<br> -->
<!-- 1、是否添加了”模板消息“功能插件。添加方法：在微信公众平台的左侧菜单点击”添加功能插件“按钮，在右侧点击”模板消息“，再点击”申请“，填写”申请开通模板消息接口“表单，点击”提交“，等待审核通过即可。<br> -->
<!-- 2、在微信公众平台的“模板库”里点击“修改行业”，弹出层里面的“主营行业”全部选择“消费品”，”副营行业“全部选择”其它“;<br> -->
<!-- 3、在微信公众平台里”我的模板“最多添加15个，如果多于15个，请删除不用的模板。 -->
<!-- </p> -->
<!-- </div> -->
<!-- </div>  -->

<!-- <div class="mb10"> -->
<!-- <div class="tiphelp-info"> -->
<!-- <strong>提示：</strong>如果，请查看是否是由于以下原因造成：<br> -->
<!-- 1、是否添加了”模板消息“功能插件。添加方法：在微信公众平台的左侧菜单点击”添加功能插件“按钮，在右侧点击”模板消息“，再点击”申请“，填写”申请开通模板消息接口“表单，点击”提交“，等待审核通过即可。<br> -->
<!-- 2、在微信公众平台的“模板库”里点击“修改行业”，弹出层里面的“主营行业”全部选择“消费品”，”副营行业“全部选择”其它“;<br> -->
<!-- 3、在微信公众平台里”我的模板“最多添加15个，如果多于15个，请删除不用的模板。 -->
<!-- </div> -->
<!-- </div> -->
<template>
    <div>
        <el-row>
            <el-button type="danger" size="small">批量删除</el-button>
            <el-button type="primary" size="small">添加路由规则</el-button>
        </el-row>

        <el-table border :data="tableData" style="width: 100%">
            <el-table-column label="第三方登录">
                <template slot-scope="scope">

                    <div class="table-logo"><img :src="scope.row.logo"></div>
                    <span class="table-pay">{{scope.row.name}}</span><br>
                    <span class="table-desc">提示：{{scope.row.tooltip}} 链接：<a :href="scope.row.link" target="_brank">{{scope.row.link}}</a>
                    </span>
                </template>
            </el-table-column>

            <el-table-column
                  prop="number"
                  label="编号"
                  width="120">
                </el-table-column>

            <el-table-column
                  prop="title"
                  label="标题"
                  width="120">
                </el-table-column>
            <el-table-column
                  label="内容示例"
                  width="120">
                      <template slot-scope="scope">
                      <div class="example-txt">
                        {{scope.row.contentExample}}
                      </div>
                                      </template>
                </el-table-column>
            <el-table-column
                  prop="templateId"
                  label="模板ID"
                  width="120">
                </el-table-column>

            <el-table-column
                label="是否启用"
                width="180">
                <template slot-scope="scope">
                    <el-switch v-model="scope.row.isOpen">
                    </el-switch>
                </template>
            </el-table-column>

        </el-table>
  </div>
</template>

<script>
export default {
  name: 'addonMenu',
  data () {
    return {
      tableData: [{
        number: 'OPENTM203347141',
        title: '会员注册成功通知',
        contentExample: '恭喜，您已成功注册为会员！<br>姓名：何某某<br>联系方式：187xxxxxxxx<br>店铺类型：普通店铺 <br>恭喜，您已成为会员，您将享受会员所有权利！',
        templateId: 0,
        isOpen: true
      }, {
        number: 'OPENTM200444240',
        title: '订单提交成功通知',
        contentExample: '亲！您已成功创建订单，点击进入完成付款。<br>姓名：何某某<br>联系方式：187xxxxxxxx<br>店铺类型：普通店铺 <br>感谢您的支持，我们将为您提供更好的服务。',
        templateId: 0,
        isOpen: true
      }, {
        number: 'OPENTM201541214',
        title: '订单发货通知',
        contentExample: '亲，你的订单已发货<br>姓名：何某某<br>联系方式：187xxxxxxxx<br>店铺类型：普通店铺 <br>请关注订单,注意查收',
        templateId: 0,
        isOpen: true
      }, {
        number: 'OPENTM200444326',
        title: '订单付款成功通知',
        contentExample: '亲！您的订单已成功付款。<br>姓名：何某某<br>联系方式：187xxxxxxxx<br>店铺类型：普通店铺 <br>',
        templateId: 0,
        isOpen: true
      }, {
        number: 'OPENTM207103254',
        title: '退款申请',
        contentExample: '您已申请退款，我们将尽快处理您提交的退款申请。您可以在“退换货”中查看退款进度<br>姓名：何某某<br>联系方式：187xxxxxxxx<br>店铺类型：普通店铺 <br>如您的退款有疑问，请联系我们的客服人员，帮助您解决处理！',
        templateId: 0,
        isOpen: true
      }, {
        number: 'OPENTM205986235',
        title: '退款结果通知',
        contentExample: '亲，您的退款已处理。<br>姓名：何某某<br>联系方式：187xxxxxxxx<br>店铺类型：普通店铺 <br>如您还有疑问，请与客服人员联系。',
        templateId: 0,
        isOpen: true
      }, {
        number: 'OPENTM207292959',
        title: '提现申请提醒',
        contentExample: '亲，您的提现申请已提交<br>姓名：何某某<br>联系方式：187xxxxxxxx<br>店铺类型：普通店铺 <br>我们将在1到3个工作日内处理完毕，请耐心等待。',
        templateId: 0,
        isOpen: true
      }, {
        number: 'OPENTM400094285',
        title: '提现审核结果通知',
        contentExample: '亲，您提现申请已通过<br>姓名：何某某<br>联系方式：187xxxxxxxx<br>店铺类型：普通店铺 <br>我们将在1到3个工作日内处理完毕，请耐心等待。',
        templateId: 0,
        isOpen: true
      }, {
        number: 'OPENTM409846856',
        title: '申请通过通知',
        contentExample: '您的推广员申请已经通过<br>姓名：何某某<br>联系方式：187xxxxxxxx<br>店铺类型：普通店铺 <br>如您还有疑问，请与客服人员联系。',
        templateId: 0,
        isOpen: true
      }, {
        number: 'OPENTM409846856',
        title: '下级申请通过通知',
        contentExample: '您的下级推广员申请已经通过<br>姓名：何某某<br>联系方式：187xxxxxxxx<br>店铺类型：普通店铺 <br>如您还有疑问，请与客服人员联系。',
        templateId: 0,
        isOpen: true
      }, {
        number: 'OPENTM409846856',
        title: '下下级申请通过通知',
        contentExample: '您的下下级推广员申请已经通过<br>姓名：何某某<br>联系方式：187xxxxxxxx<br>店铺类型：普通店铺 <br>如您还有疑问，请与客服人员联系。',
        templateId: 0,
        isOpen: true
      }, {
        number: 'OPENTM201010537',
        title: '本店分销订单提成通知',
        contentExample: '亲，您已成功分销出一笔订单，继续努力哦<br>姓名：何某某<br>联系方式：187xxxxxxxx<br>店铺类型：普通店铺 <br>',
        templateId: 0,
        isOpen: true
      }, {
        number: 'OPENTM201010537',
        title: '下级分店分销订单提成通知',
        contentExample: '亲，您的下级推广员成功分销出一笔订单，继续努力哦<br>姓名：何某某<br>联系方式：187xxxxxxxx<br>店铺类型：普通店铺 <br>',
        templateId: 0,
        isOpen: true
      }, {
        number: 'OPENTM201010537',
        title: '下下级分店分销订单提成通知',
        contentExample: '亲，您的下下级推广员成功分销出一笔订单，继续努力哦<br>姓名：何某某<br>联系方式：187xxxxxxxx<br>店铺类型：普通店铺 <br>',
        templateId: 0,
        isOpen: true
      }]
    }
  },
  methods: {
    handleEdit (index, row) {
      console.log(index, row)
    },
    handleDelete (index, row) {
      console.log(index, row)
    }
  }
}
</script>

<style lang="scss" scoped>
  .table-logo {
      width: 75px;
      float: left;
  }

  .table-pay {
      display: inline-block;
      width: 120px;
      overflow: hidden;
      margin-top: 7px;
  }

  .table-desc {
      display: inline-block;
  }
</style>
