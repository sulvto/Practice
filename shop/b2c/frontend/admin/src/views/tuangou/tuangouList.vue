<template>
  <div>

    <el-row :gutter="8">
      <el-col :xs="7" :sm="7" :md="7" :lg="7" :xl="12">
        &emsp;
      </el-col>

      <el-col :xs="17" :sm="17" :md="17" :lg="17" :xl="12">
        <el-form :inline="true" :model="queryForm" size="small" >
          <el-form-item label="创建时间">
            <el-date-picker
              v-model="queryForm.orderDateRange"
              :picker-options="datePickerOptions"
              type="daterange"
              align="right"
              unlink-panels
              range-separator="-"
              start-placeholder="开始日期"
              end-placeholder="结束日期" />
          </el-form-item>
          <el-form-item label="团长名">
            <el-input v-model="queryForm.group_name" placeholder="团长名" />
          </el-form-item>
          <el-form-item>
            <el-button type="primary" @click="onSubmit">查询</el-button>
          </el-form-item>
        </el-form>
      </el-col>
    </el-row>

    <el-table :data="tableData" border style="width: 100%">
      <el-table-column
        type="selection"
        width="35" />

      <el-table-column prop="goods_name" label="商品名称" >
        <template slot-scope="scope">
          <!-- TODO: a img -->
          商品名称：{{ scope.row.goods_name }}
          <br>
          商品编码：{{ scope.row.seller_no }}
        </template>
      </el-table-column>

      <el-table-column prop="price" label="单价(元)" width="100" />

      <el-table-column label="活动价(元)" width="100">
        <template slot-scope="scope">
          {{ scope.row.activity_price }}元
        </template>
      </el-table-column>

      <el-table-column label="是否拼团" width="100">
        <template slot-scope="scope">
          <!-- 1: 未启用, 2: 已启用 -->
          {{ scope.row.status === 1 ? '未启用' : '已启用' }}
          <br>
        </template>
      </el-table-column>
      <el-table-column label="拼团类型" width="120">
        <template slot-scope="scope">
          {{ (scope.row.type || '--') }}
          <br>
        </template>
      </el-table-column>
      <el-table-column prop="pintuan_price" label="拼团价格" width="100" />
      <el-table-column prop="create_date" label="创建时间" width="140" />
      <el-table-column label="操作" width="200">
        <template slot-scope="scope">
          <el-button size="mini" @click="handleEdit(scope.$index, scope.row)">拼团设定</el-button>
          <el-button v-if="scope.row.status === 1" size="mini" @click="handleEdit(scope.$index, scope.row)">开启拼团</el-button>
          <el-button v-if="scope.row.status === 2" size="mini" @click="handleEdit(scope.$index, scope.row)">关闭拼团</el-button>

        </template>
      </el-table-column>
    </el-table>

    <!-- 此部分以下是弹出框内容 -->
    <div id="editGoodsCommissionRate" class="modal fade hide" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true" style="width:800px;">
      <div class="modal-dialog">
        <div class="modal-content">
          <div class="modal-header">
            <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
            <h4 class="modal-title" data-id="myModalLabel">商品拼团设定</h4>
          </div>
          <div class="modal-body">
            <div class="set-style">
              <input type="hidden" data-id="distribution_type" value="">
              <input type="hidden" data-id="distribution_condition" value="">
              <dlt>
                <dt>是否开启:</dt>
                <dd>

                  <input id="is_open" type="checkbox" class="checkbox" simpleswitch="0" result="false" style="display: none;"><div class="Switch Switch_FlatRadius" data-id="Switch0"><span class="switch-open">是</span><span class="switch-close">否</span></div>

                  <!-- <label class="radio inline normal">
                    <i class="radio-common selected">
                      <input name="is_open" class="is_open1" id="is_open" type="radio" value="1" checked="checked" />
                    </i>
                    <span>立即开启</span>
                  </label>
                  <label class="radio inline normal">
                    <i class="radio-common">
                      <input name="is_open" class="is_open0" id="is_open" type="radio" value="0"/>
                    </i>
                    <span>暂不开启</span>
                  </label> -->
                  <p class="error">请选择是否启用</p>
                </dd>
              </dlt>
              <dl>
                <dt>是否推荐:</dt>
                <dd>

                  <input id="is_show" type="checkbox" class="checkbox" simpleswitch="1" result="false" style="display: none;"><div class="Switch Switch_FlatRadius" data-id="Switch1"><span class="switch-open">是</span><span class="switch-close">否</span></div>

                  <!-- <label class="radio inline normal">
                    <i class="radio-common selected">
                      <input name="is_show" class="is_show1" id="is_show" type="radio" value="1" checked="checked" />
                    </i>
                    <span>推荐</span>
                  </label>
                  <label class="radio inline normal">
                    <i class="radio-common">
                      <input name="is_show" class="is_show0" id="is_show" type="radio" value="0"/>
                    </i>
                    <span>不推荐</span>
                  </label> -->
                  <p class="error">请选择是否推荐</p>
                </dd>
              </dl>
              <dl>
                <dt>团购金额:</dt>
                <dd>
                  <p><input id="tuangou_money" type="number" min="0" placeholder="" value="" class="input-common harf"><em class="unit">元</em><span class="error">&nbsp;&nbsp;请输入团购金额</span></p>
                </dd>
              </dl>
              <dl>
                <dt>团购人数:</dt>
                <dd>
                  <p><input id="tuangou_num" type="number" min="1" placeholder="" value="" class="input-common harf"><em class="unit">人</em><span class="error">&nbsp;&nbsp;请输入团购人数</span></p>
                </dd>
              </dl>
              <dl>
                <dt>团购有效期:</dt>
                <dd>
                  <p><input id="tuangou_time" type="number" min="1" placeholder="" value="" class="input-common harf"><em class="unit">小时</em>&nbsp;&nbsp;<span class="error">请输入团购有效期</span></p>
                </dd>
              </dl>
              <dl>
                <dt>团购类型:</dt>
                <dd>
                  <div class="selectric-wrapper selectric-select-common" style="width: 250px;">
                    <div class="selectric-hide-select">
                      <select id="type_val" class="select-common" onchange="tuangou_type()" tabindex="-1">
                        <option value="0">请选择团购类型</option>
                        <option class="type1" value="1">秒杀团</option>
                        <option class="type2" value="2">佣金团</option>
                        <option class="type3" value="3">阶梯团</option>
                      </select>
                    </div>
                  <div class="selectric"><span class="selectric-label">请选择团购类型</span><button class="selectric-button">▾</button></div><div class="selectric-items" tabindex="-1"><div class="selectric-scroll"><ul><li data-index="0" class="selected" title="请选择团购类型">请选择团购类型</li><li data-index="1" class="type1" title="秒杀团">秒杀团</li><li data-index="2" class="type2" title="佣金团">佣金团</li><li data-index="3" class="type3 last" title="阶梯团">阶梯团</li></ul></div></div><input class="selectric-input" tabindex="0"></div><span class="error">请输入团购类型</span>

                </dd>
              </dl>
              <dl style="display:none" data-id="commission_show">
                <dt>团长佣金:</dt>
                <dd>
                  <p><input id="colonel_commission" type="number" min="0" placeholder="" value="" class="input-common harf"><em class="unit">元</em></p>
                  <p class="error">请输入团长佣金</p>
                </dd>
              </dl>
              <dl style="display:none" data-id="coupon_show">
                <dt>团长优惠券:</dt>
                <dd>
                  <p><input id="colonel_coupon" type="number" min="0" placeholder="" value="" class="input-common"></p>
                  <p class="error">请输入团长优惠券</p>
                </dd>
              </dl>
              <dl style="display:none" data-id="point_show">
                <dt>团长积分:</dt>
                <dd>
                  <p><input name="" data-id="colonel_point" type="number" min="0" class="input-common harf"><em class="unit">积分</em></p>
                  <p class="error">请输入团长积分</p>
                </dd>
              </dl>
              <dl>
                <dt>团购内容:</dt>
                <dd>
                  <p>
                    <textarea name="" data-id="colonel_content" cols="30" rows="10" class="textarea-common" />
                  </p><p class="error">请输入团购信息内容</p>
                </dd>
              </dl>
              <input id="goods_id" type="hidden" value="">
              <input id="tuangou_id" type="hidden" value="">
            </div>
          </div>
          <div class="modal-footer">
            <button type="button" class="btn-common" onclick="updateGoodsPintuan();">修改</button>
            <button type="button" class="btn-common" data-dismiss="modal">关闭</button>
          </div>
        </div>
      </div>
    </div>

  </div>
</template>

<script>
// 失败 进行中 成功 已退款
export default {
  name: 'TuangouList',
  data () {
    return {
      queryForm: {},
      tableData: [
        {
          goods_name: 'dfa',
          seller_no: '',
          price: '100.00',
          activity_price: '100.00',
          pintuan_price: '--',
          create_date: '2018-09-04 10:45:13',
          status: 1

        }, {
          goods_name: '测试商品-副本',
          seller_no: '',
          price: '100.00',
          activity_price: '100.00',
          pintuan_price: '--',
          create_date: '2018-09-04 10:00:11',
          status: 1
        }, {
          goods_name: 'OSA欧莎2018春秋装 名媛小香风圆领格子高腰流苏两件套包臀裙套装',
          seller_no: '1009090110',
          price: '0.00',
          activity_price: '0.00',
          pintuan_price: '',
          create_date: '2018-09-03 20:19:05',
          status: 2,
          type: '阶梯团'
        }, {
          goods_name: '测试商品',
          seller_no: '',
          price: '100.00',
          activity_price: '100.00',
          pintuan_price: '',
          create_date: '2018-09-01 18:11:47',
          status: 2,
          type: '秒杀团'
        }, {
          goods_name: '8.10测试',
          seller_no: '',
          price: '100.00',
          activity_price: '100.00',
          pintuan_price: '',
          create_date: '2018-08-10 16:15:56',
          status: 2,
          type: '秒杀团'
        }, {
          goods_name: '测试商品',
          seller_no: '',
          price: '88.00',
          activity_price: '88.00',
          pintuan_price: '',
          create_date: '2018-08-08 11:46:50',
          status: 2,
          type: '佣金团'
        }, {
          goods_name: 'Lenovo/联想Yoga BOOK WiFi平板二合一超薄笔记本电脑yoga book-副本',
          seller_no: '',
          price: '0.00',
          activity_price: '0.00',
          pintuan_price: '',
          create_date: '2018-07-11 16:24:37',
          status: 2,
          type: '秒杀团'
        }, {
          goods_name: '澳大利亚丁戈树红标经典红葡萄酒750ml-副本',
          seller_no: '',
          price: '1000.00',
          activity_price: '1000.00',
          pintuan_price: '--',
          create_date: '2018-07-11 14:42:51',
          status: 1
        }, {
          goods_name: '澳大利亚丁戈树红标经典红葡萄酒750ml-副本',
          seller_no: '',
          price: '1000.00',
          activity_price: '1000.00',
          pintuan_price: '--',
          create_date: '2018-07-11 09:27:40',
          status: 1
        }, {
          goods_name: 'test123澳大利亚丁戈树红标经典红葡萄酒750ml',
          seller_no: '',
          price: '0.00',
          activity_price: '0.00',
          pintuan_price: '',
          create_date: '2018-07-05 15:44:04',
          status: 2,
          type: '秒杀团'
        }, {
          goods_name: '古尚古 懒人手机支架 手机通用指环创意卡扣粘贴式全金属卡通配件-副本',
          seller_no: '',
          price: '15.00',
          activity_price: '15.00',
          pintuan_price: '--',
          create_date: '2018-07-05 15:09:56',
          status: 1
        }, {
          goods_name: '14.1英寸轻薄刀锋四核笔记本电脑手提固态商务学生游戏上网本分期-副本',
          seller_no: '',
          price: '5600.00',
          activity_price: '5600.00',
          pintuan_price: '--',
          create_date: '2018-07-05 15:08:56',
          status: 1
        }, {
          goods_name: '钻石金属 闪钻镶卡通指环扣懒人防摔折叠粘贴式手机配件支架批发-副本',
          seller_no: '',
          price: '42.00',
          activity_price: '42.00',
          pintuan_price: '--',
          create_date: '2018-07-05 15:08:45',
          status: 1
        }, {
          goods_name: '钻石金属 闪钻镶卡通指环扣懒人防摔折叠粘贴式手机配件支架批发',
          seller_no: '',
          price: '42.00',
          activity_price: '42.00',
          pintuan_price: '',
          create_date: '2017-07-06 20:11:49',
          status: 2,
          type: '秒杀团'
        }
      ]
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
</style>
