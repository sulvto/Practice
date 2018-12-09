<template>

  <div>

    <el-row :gutter="8">
      <el-col :span="12">
        <el-button type="danger" size="small">批量删除</el-button>
      </el-col>

      <el-col :span="12">
        <el-form :inline="true" :model="queryForm" size="small" >
          <el-form-item label="评价时间">
            <el-date-picker
              v-model="queryForm.orderDateRange"
              :picker-options="datePickerOptions"
              type="daterange"
              align="right"
              unlink-panels
              range-separator="至"
              start-placeholder="开始日期"
              end-placeholder="结束日期" />
          </el-form-item>
          <el-form-item>
            <el-popover
              v-model="moreQueryPopoverVisible"
              placement="bottom"
              width="400"
              trigger="click">
              <el-form
                ref="editForm"
                :model="queryForm"
                label-width="100px"
                size="small"
                label-position="right">
                <el-form-item label="评价用户">
                  <el-input v-model="queryForm.username" placeholder="请输入用户名称" />
                </el-form-item>

                <el-form-item label="评价类型">
                  <el-select v-model="queryForm.type" clearable placeholder="请选择">
                    <el-option label="好评" value="1" />
                    <el-option label="中评" value="2" />
                    <el-option label="差评" value="3" />
                  </el-select>
                </el-form-item>

                <el-form-item>
                  <el-button type="primary" @click="moreQueryPopoverVisible = false">确定</el-button>
                </el-form-item>
              </el-form>
              <el-button slot="reference" icon="el-icon-arrow-down" size="small" />
            </el-popover>
            <el-button type="primary" size="small" @click="search">查询</el-button>
          </el-form-item>
        </el-form>
      </el-col>
    </el-row>

    <el-table :data="tableData" border style="width: 100%">
      <el-table-column
        type="selection"
        width="35" />

      <el-table-column
        label="商品">
        <template slot-scope="scope">
          <a href="http://b2c.niuteam.cn/goods/goodsinfo?goodsid=75" target="_blank">
            <span style="margin-right:5px;width:60px;float:left;">
              <img src="http://b2c.niuteam.cn/upload/goods/20180606/f1c9c846cdd1f65df52deed3ec4cd2c5.jpg" style="width:60px;height:60px;">
            </span>
            <span>美国Elta MD无油防晒霜 全身脸部清爽痘皮敏感肌隔离防晒乳 SPF45-副本</span>
          </a>
        </template>
      </el-table-column>

      <el-table-column
        label="评价信息"
        width="180">
        <template slot-scope="scope">
          <span class="pro-code">评价用户： {{ scope.row.username }}</span>
          <br>
          <span class="pro-code">用户评价： 差评</span>
          <br>
          <span class="pro-code">用户评分： {{ scope.row.rate }}分</span>
        </template>
      </el-table-column>

      <el-table-column
        label="评价时间"
        width="180">
        <template slot-scope="scope">
          <span class="pro-code">评价时间：{{ scope.row.createDate }}</span>
        </template>
      </el-table-column>

      <el-table-column
        label="操作"
        fixed="right"
        width="180">
        <template slot-scope="scope">
          <el-button size="mini" @click="handleEdit(scope.$index, scope.row)">隐藏</el-button>
          <el-button size="mini" @click="handleEdit(scope.$index, scope.row)">显示</el-button>
          <el-button size="mini" @click="handleDelete(scope.$index, scope.row)">删除</el-button>
        </template>
      </el-table-column>
    </el-table>

    <!-- <tr><td colspan="4" style="background: white;"><p><span class="content-left">评价内容:</span><span class="evaluate_content content">111</span></p></td><td style="background: white;"><div class="bs-docs-example tooltip-demo" style="text-align: center;"><a href="javascript:;" data-placement="bottom" data-original-title="回复"><span class="edit" onclick="replyevaluate(16,this)"><i class="icon-edit" style="width: initial;"></i>回复</span></a></div></td></tr> -->

    <!-- <tr><td colspan="4" style="background: white;"><p><span class="content-left">追评内容:</span><span class="evaluate_content content">111</span></p><p><span class="content-left">追评回复:</span> <span class="evaluate_reply content">123456</span></p></td><td style="background: white;"><div style="text-align: center;"><a href="javascript:;" data-placement="bottom" data-original-title="回复"><span class="edit" onclick="replyevaluateAgain(16,this)"><i class="icon-edit" style="width: initial;"></i>回复</span></a></div></td></tr> -->
  </div>

</template>

<script>
require('@/assets/style/table.scss')

export default {
  name: 'CommentList',
  data () {
    return {
      queryForm: {},
      datePickerOptions: {
        shortcuts: [{
          text: '最近一周',
          onClick (picker) {
            const end = new Date()
            const start = new Date()
            start.setTime(start.getTime() - 3600 * 1000 * 24 * 7)
            picker.$emit('pick', [start, end])
          }
        }, {
          text: '最近一个月',
          onClick (picker) {
            const end = new Date()
            const start = new Date()
            start.setTime(start.getTime() - 3600 * 1000 * 24 * 30)
            picker.$emit('pick', [start, end])
          }
        }, {
          text: '最近三个月',
          onClick (picker) {
            const end = new Date()
            const start = new Date()
            start.setTime(start.getTime() - 3600 * 1000 * 24 * 90)
            picker.$emit('pick', [start, end])
          }
        }]
      },
      tableData: [
        {
          goodsId: 75,
          goodsName: '美国Elta MD无油防晒霜 全身脸部清爽痘皮敏感肌隔离防晒乳 SPF45-副本',
          username: '3452101',
          commment: '差评',
          rate: 1,
          createDate: '2018-08-18 10:55:16'
        }, {
          goodsId: 161,
          goodsName: 'TV1233213-副本',
          username: 'zhuzhu',
          commment: '好评',
          rate: 5,
          createDate: '2018-08-09 17:41:29'
        }, {
          goodsId: 110,
          goodsName: '撒旦撒旦撒旦撒旦',
          username: 'wzz246513',
          commment: '好评',
          rate: 5,
          createDate: '2018-08-06 14:02:02'
        }, {
          goodsId: 73,
          goodsName: '宝格丽（BVLGARI） 宝格丽大吉岭茶男士淡香水浓情版 100ml',
          username: 'niushop',
          commment: '好评',
          rate: 5,
          createDate: '2018-08-06 10:42:28'
        }, {
          goodsId: 72,
          goodsName: '20180606【正宗三华李】+果实饱满 现摘现发+1份2斤装（±0.2）',
          username: '111aaa',
          commment: '好评',
          rate: 5,
          createDate: '2018-08-02 15:44:36'
        }, {
          goodsId: 54,
          goodsName: 'home指纹识别 苹果6s按键贴iphone7plus按键贴5s手机配件可爱卡通',
          username: '111aaa',
          commment: '好评',
          rate: 5,
          createDate: '2018-08-02 15:44:36'
        }, {
          goodsId: 51,
          goodsName: '古尚古 懒人手机支架 手机通用指环创意卡扣粘贴式全金属卡通配件',
          username: '111aaa',
          commment: '好评',
          rate: 5,
          createDate: '2018-08-02 15:44:36'
        }, {
          goodsId: 111,
          goodsName: '测试',
          username: 'admin',
          commment: '好评',
          rate: 5,
          createDate: '2018-07-06 15:12:28'
        }, {
          goodsId: 75,
          goodsName: '美国Elta MD无油防晒霜 全身脸部清爽痘皮敏感肌隔离防晒乳 SPF45-副本',
          username: 'admin',
          commment: '好评',
          rate: 5,
          createDate: '2018-06-25 16:00:01'
        }, {
          goodsId: 78,
          goodsName: '456',
          username: 'admin',
          commment: '好评',
          rate: 5,
          createDate: '2018-06-13 10:06:35'
        }
      ]
    }
  }
}
</script>
