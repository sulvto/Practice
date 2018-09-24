                    <!-- <th align="left">
                        <nav class="order-nav">
                            <ul class="nav-ul">
                                <button class="btn-common" onclick="pintuanFinish(0, this)">全部</button>
                                <button class="btn-common-white" onclick="pintuanFinish(1, this)">未成团</button>
                                <button class="btn-common-white" onclick="pintuanFinish(2, this)">成团</button>
                                <button class="btn-common-white" onclick="pintuanFinish(-1, this)">失败</button>
                            </ul>
                        </nav>
                    </th> -->
                    <!-- <th>
                        创建时间：
                        <input type="text" id="startDate" class="input-common middle" placeholder="请选择开始日期" onclick="WdatePicker()">
                        &nbsp;-&nbsp;
                        <input type="text" id="endDate" placeholder="请选择结束日期" class="input-common middle" onclick="WdatePicker()">
                        团长名：<input id="group_name" class="input-common middle" type="text" value="">
                        <button onclick="searchData()" class="btn-common">搜索</button>
                    </th> -->
<template>
    <div>

    <el-row>
        <el-button type="danger" size="small">全部</el-button>
        <el-button type="primary" size="small">￼未成团</el-button>
        <el-button type="primary" size="small">￼成团</el-button>
        <el-button type="primary" size="small">￼失败</el-button>
    </el-row>

    <br/>

    <el-table border :data="tableData" style="width: 100%">

      <el-table-column prop="group_name" label="团长" width="120"></el-table-column>
      <el-table-column prop="user_tel" label="联系方式" width="120"></el-table-column>
      <el-table-column prop="tuangou_money" label="价格" width="120"></el-table-column>
      <el-table-column  label="成团" width="120">
          <template slot-scope="scope">
                {{scope.row.status}}} <br/>
        已参团人数：{{scope.row.real_num}}
        团购总人数：{{scope.row.tuangou_num}}
                </template>
    </el-table-column>
    <el-table-column prop="tuangou_type_name" label="拼团模式" width="120"></el-table-column>
    <el-table-column label="商品" width="120">
        <template slot-scope="scope">
                <a :href="scope.row.productLink" target="_brank">{{scope.row.productName}}</a>
                </template>
    </el-table-column>
    <el-table-column prop="status" label="状态" width="120"></el-table-column>
    <el-table-column label="时间" width="120">
          <template slot-scope="scope">
                开团时间：<br/>
{{scope.row.startDate}}}
截团时间：<br/>
{{scope.row.stopDate}}}
                </template>
    </el-table-column>

            <el-table-column label="操作"
                width="180">
                <template slot-scope="scope">
                    <el-button size="mini" @click="handleEdit(scope.$index, scope.row)">关闭首页推荐</el-button>
                    <el-button size="mini" @click="handleEdit(scope.$index, scope.row)">开启首页推荐</el-button>
                    <el-button size="mini" @click="handleEdit(scope.$index, scope.row)">拼团完成</el-button>
                    <el-button size="mini" @click="handleEdit(scope.$index, scope.row)">退款</el-button>
                    <el-button size="mini" @click="handleEdit(scope.$index, scope.row)">查看拼团订单</el-button>
                </template>
            </el-table-column>
        </el-table>
  </div>
</template>

<script>
// 失败 进行中 成功 已退款
export default {
  name: 'pintuanList',
  data () {
    return {
      tableData: [
        {
          logo: '/admin/images/wchat.png',
          name: '微信登录',
          status: true,
          tooltip: '使用该功能需申请微信开放平台网站应用',
          link: 'https://open.weixin.qq.com/'
        },
        {
          logo: '/admin/images/qq.png',
          name: 'QQ登录',
          status: false,
          tooltip: '使用该功能需申请QQ互联',
          link: 'https://connect.qq.com/'
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
