<template>
  <div>
    <el-row :gutter="8">
      <el-col :span="12">

        <el-button type="primary" size="small">开启分销</el-button>
        <el-button type="default" size="small">关闭分销</el-button>
        <el-button type="default" size="small">分销设定(总)</el-button>
        <el-button type="default" size="small">分销设定(分组)</el-button>
      </el-col>

      <el-col :span="10"><el-input v-model="searchKeyword" size="small" placeholder="请输入物流公司名称或编号" /></el-col>
      <el-col :span="2">
        <el-button type="primary" size="small" @click="search">查询</el-button>
      </el-col>
    </el-row>

    <br>

    <el-table :data="tableData" border style="width: 100%">
      <el-table-column
        type="selection"
        width="35" />

      <el-table-column
        label="商品名称"
        width="350">
        <template slot-scope="scope">
          商家编码: <span >{{ scope.row.shopNo }}</span>
          创建时间: <span>{{ scope.row.createDate }}</span>
          <br>
          <img class="thumbnail-img" src="http://showfx.niuteam.cn/upload/goods_sku/32fc4da4eb65a4567ee6cf4302057c7f4.jpg">
          <a :href="scope.row.goodsLink" target="_blank">{{ scope.row.goodsName }}</a>
          <br>
          <i style="color:#999;font-size:12px;margin-top:5px;padding:1px 2px;border-radius:3px;display:inline-block;color:#FFF;background-color:#de533c;text-decoration: none;height:16px;line-height: 16px;overflow:hidden;margin-right:5px;text-align:center;font-style:normal;">hot</i>
        </template>
      </el-table-column>

      <el-table-column
        prop="type"
        label="价格(元)"
        width="120">

        <template slot-scope="scope">
          单    价: <span >{{ scope.row.unitPrice }}</span>
          <br>
          活动价: <span style="color:red;">{{ scope.row.huodongPrice }}</span>
        </template>
      </el-table-column>

      <el-table-column
        prop="type"
        label="三级分销比率"
        width="120" />

      <el-table-column
        prop="type"
        label="股东分红比率"
        width="120" />

      <el-table-column
        prop="type"
        label="全球分红比率"
        width="120" />

      <el-table-column
        prop="type"
        label="区域代理比率"
        width="120" />

      <el-table-column
        label="是否分销"
        width="180">
        <template slot-scope="scope">
          <span v-show="scope.row.isOpen">已启用</span>
          <span v-show="!scope.row.isOpen">未启用</span>
        </template>
      </el-table-column>

      <el-table-column
        label="操作"
        fixed="right"
        width="100">
        <template slot-scope="scope">
          <!-- <a href="/config/loginconfig.html?type=qq">配置</a> -->
          <el-button size="mini" @click="handleEdit(scope.$index, scope.row)">分销设定</el-button>
          <br>
          <el-button v-show="!scope.row.isOpen" size="mini" class="margin-top-5" @click="handleEdit(scope.$index, scope.row)">开启分销</el-button>
          <el-button v-show="scope.row.isOpen" size="mini" class="margin-top-5" @click="handleEdit(scope.$index, scope.row)">关闭分销</el-button>
        </template>
      </el-table-column>
    </el-table>

    <div v-if="false">
      <!-- TODO: 此部分以下是弹出框内容 -->
      <!-- 此部分以下是弹出框内容 -->
      <!-- 修改用户上级（Modal）开始 -->
      <div class="modal fade hide" data-id="editGoodsCommissionRate" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true" style="width:400px;">
        <div class="modal-dialog">
          <div class="modal-content">
            <div class="modal-header">
              <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
              <h4 class="modal-title" data-id="myModalLabel">商品分销设定</h4>
            </div>
            <div class="modal-body">
              <div class="set-style">
                <input type="hidden" data-id="distribution_type" value="">
                <input type="hidden" data-id="distribution_condition" value="">
                <dl>
                  <dt>分销佣金比率：</dt>
                  <dd>
                    <p><input name="" data-id="distribution_commission_rate" type="text" class="input-common harf" value="" onkeyup="javascript:CheckInputIntFloat(this);"><em class="unit">%</em></p>
                    <p class="error">请输入等级名称</p>
                  </dd>
                </dl>
                <dl>
                  <dt>股东分红佣金比率：</dt>
                  <dd>
                    <p><input name="" data-id="partner_commission_rate" type="text" value="" class="input-common harf" onkeyup="javascript:CheckInputIntFloat(this);"><em class="unit">%</em></p>
                    <p class="error">请输入升级条件</p>
                  </dd>
                </dl>
                <dl>
                  <dt>股东全球分红比率：</dt>
                  <dd>
                    <p><input name="" data-id="global_commission_rate" type="text" value="" class="input-common harf" onkeyup="javascript:CheckInputIntFloat(this);"><em class="unit">%</em></p>
                    <p class="error">请输入本店销售佣金比率</p>
                  </dd>
                </dl>
                <dl style="display:none;">
                  <dt>分销团队分红佣金比率：</dt>
                  <dd>
                    <p><input name="" data-id="distribution_team_commission_rate" type="text" class="input-common harf" value="" onkeyup="javascript:CheckInputIntFloat(this);"><em class="unit">%</em></p>
                    <p class="error">请输入给上级的佣金比率</p>
                  </dd>
                </dl>
                <dl style="display:none;">
                  <dt>股东团队分红佣金比率：</dt>
                  <dd>
                    <p><input name="" data-id="partner_team_commission_rate" type="text" class="input-common harf" value="" onkeyup="javascript:CheckInputIntFloat(this);"><em class="unit">%</em></p>
                    <p class="error">请输入给上上级的佣金比率</p>
                  </dd>
                </dl>

                <dl>
                  <dt>区域代理分红佣金比率：</dt>
                  <dd>
                    <p><input name="" data-id="regionagent_commission_rate" type="text" class="input-common harf" value="" onkeyup="javascript:CheckInputIntFloat(this);"><em class="unit">%</em></p>
                    <p class="error">请输入给上上级的佣金比率</p>
                  </dd>
                </dl>
                <dl style="display:none;">
                  <dt>渠道代理分红佣金比率：</dt>
                  <dd>
                    <p><input name="" data-id="channelagent_commission_rate" type="text" class="input-common harf" value="" onkeyup="javascript:CheckInputIntFloat(this);"><em class="unit">%</em></p>
                    <p class="error">请输入给上上级的佣金比率</p>
                  </dd>
                </dl>
              </div>
            </div>
            <div class="modal-footer">
              <button type="button" class="btn-common btn-big" onclick="updateGoodsCommissionRate();">修改</button>
              <button type="button" class="btn-common-cancle btn-big" data-dismiss="modal">关闭</button>
            </div>
          </div><!-- /.modal-content -->
        </div><!-- /.modal -->
      </div>
    </div>
  </div>
</template>

<script>
export default {
  name: 'List',
  data () {
    return {
      searchKeyword: '',
      tableData: [{
        shopNo: '1009090110',
        goodsName: 'OSA欧莎2018春秋装 名媛小香风圆领格子高腰流苏两件套包臀裙套装',
        goodsLink: 'http://showfx.niuteam.cn/goods/goodsinfo.html?goodsid=77',
        createDate: '2018-09-05 14:12:53',
        unitPrice: 0.00,
        huodongPrice: 100.00,
        isOpen: true,
        tooltip: '使用该功能需申请微信开放平台网站应用',
        link: 'https://open.weixin.qq.com/'
      }, {
        logo: '/admin/images/qq.png',
        name: 'QQ登录',
        status: false,
        tooltip: '使用该功能需申请QQ互联',
        link: 'https://connect.qq.com/'
      }]
    }
  },
  methods: {
    handleEdit (index, row) {
      console.log(index, row)
    },
    handleDelete (index, row) {
      console.log(index, row)
    },
    search () {
      console.log('search', this.searchKeyword)
    }

  }
}
</script>

<style lang="scss" scoped>

.thumbnail-img {
  width: 60px;
  margin-right: 10px;
  height: 60px;
}

.margin-top-5 {
  margin-top: 5px;
}
</style>
