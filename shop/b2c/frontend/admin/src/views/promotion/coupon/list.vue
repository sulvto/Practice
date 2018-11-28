<template>
  <div>
    <el-row :gutter="8">
      <el-col :span="12">
        <el-button type="primary" size="small" @click="$router.push('edit.html')">添加优惠券</el-button>
      </el-col>

      <el-col :span="10">
        <el-input size="small" v-model="searchKeyword" placeholder="请输入优惠券名称"></el-input>
      </el-col>
      <el-col :span="2">
        <el-button type="primary" size="small" @click="search">查询</el-button>
      </el-col>
    </el-row>

    <br/>

    <el-table border :data="tableData" style="width: 100%">

      <el-table-column
        prop="name"
        label="优惠券名称">
      </el-table-column>

      <el-table-column
        prop="denomination"
        label="面额"
        width="120">
      </el-table-column>

      <el-table-column
        prop="number"
        label="发放数量"
        width="80">
      </el-table-column>

      <el-table-column label="有效时间"
        width="210">
        <template slot-scope="scope">
          <div v-if="scope.row.termOfValidityType === 1">
            开始时间：{{scope.row.startDate}}
            <br>
            结束时间：{{scope.row.endDate}}
          </div>
          <div v-if="scope.row.termOfValidityType === 2">
            领取之日起{{ scope.row.fixedDays }}天内有效
          </div>
        </template>
      </el-table-column>

      <el-table-column label="操作" fixed="right"
          width="250">
          <template slot-scope="scope">
              <!-- <a href="/config/loginconfig.html?type=qq">配置</a> -->
              <el-button size="mini" @click="handleEdit(scope.$index, scope.row)">编辑</el-button>
              <el-button size="mini" @click="showCouponDetail(scope.row)">详情</el-button>
              <el-button size="mini" @click="handleEdit(scope.$index, scope.row)">删除</el-button>
              <el-button size="mini" class="margin-top-5" @click="handleEdit(scope.$index, scope.row)">推广链接</el-button>
              <el-button size="mini" class="margin-top-5" @click="$router.push('grantRecords.html')">发放记录</el-button>
          </template>
      </el-table-column>
    </el-table>

    <DialogCouponDetail :show='dialogCouponDetailVisible' :couponDetailData='dialogCouponDetailData'></DialogCouponDetail>
  </div>
</template>

<script>
import DialogCouponDetail from '@/components/DialogCouponDetail.vue'

export default {
  name: 'list',
  data () {
    return {
      dialogCouponDetailVisible: false,
      dialogCouponDetailData: [],
      searchKeyword: '',
      tableData: [{
        denomination: 1000.00,
        name: '滿5000送1000',
        number: 999,
        termOfValidityType: 1,
        startDate: '2018-09-12 10:47:51',
        endDate: '2018-09-30 10:47:55',
        max: 1,
        count: 1000
      }, {
        denomination: 5.00,
        name: '满150元减5元',
        number: 1000,
        termOfValidityType: 1,
        startDate: '2018-08-01 18:45:23',
        endDate: '2018-10-31 18:45:27',
        max: 3,
        count: 200
      }, {
        denomination: 2.00,
        name: '满88元减2元',
        number: 110,
        termOfValidityType: 2,
        fixedDays: 1,
        max: 10,
        count: 100
      }]
    }
  },
  methods: {
    showCouponDetail (couponItem) {
      this.dialogCouponDetailData = []

      this.dialogCouponDetailData.push({
        key: '类型名',
        value: couponItem.name
      })

      this.dialogCouponDetailData.push({
        key: '面额',
        value: couponItem.denomination + '元'
      })

      this.dialogCouponDetailData.push({
        key: '发放数量',
        value: couponItem.number
      })

      this.dialogCouponDetailData.push({
        key: '每人最大领取数',
        value: couponItem.max + '次'
      })

      this.dialogCouponDetailData.push({
        key: '满多少元使用',
        value: couponItem.count + '元'
      })

      if (couponItem.termOfValidityType === 1) {
        this.dialogCouponDetailData.push({
          key: '有效时间',
          value: couponItem.startDate + '到' + couponItem.endDate
        })
      }

      this.dialogCouponDetailVisible = true
    },
    handleEdit (index, row) {
      console.log(index, row)
    },
    handleDelete (index, row) {
      console.log(index, row)
    },
    search () {
      console.log('search', this.searchKeyword)
    }
  },
  computed: {
  },
  components: {
    DialogCouponDetail
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

.margin-top-5 {
  margin-top:5px;
}
</style>
