<template>

  <section class="ns-base-section">
    <el-row type="flex" justify="space-between">
      <el-col :xs="8" :sm="6" :md="4" :lg="3" :xl="2">
        &emsp;
      </el-col>

      <el-col :xs="2" :sm="4" :md="6" :lg="8" :xl="13">
        &emsp;
      </el-col>

      <el-col :xs="6" :sm="8" :md="10" :lg="10" :xl="7">
        <el-form :inline="true" :model="queryForm" size="small" >
          <el-form-item label="提现时间">
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
        </el-form>
      </el-col>

      <el-col :xs="8" :sm="6" :md="4" :lg="3" :xl="2">
        <el-popover
          v-model="moreQueryPopoverVisible"
          placement="bottom"
          width="400"
          trigger="click">
          <el-form ref="editForm" :model="queryForm" label-width="100px" size="small" label-position="right">
            <el-form-item label="会员账号">
              <el-input v-model="queryForm.username" />
            </el-form-item>

            <el-form-item label="手机号">
              <el-input v-model="queryForm.phoneNumber" />
            </el-form-item>

            <el-form-item>
              <el-button type="primary" @click="moreQueryPopoverVisible = false">确定</el-button>
            </el-form-item>
          </el-form>
          <el-button slot="reference" icon="el-icon-arrow-down" size="small" />
        </el-popover>

        <el-button type="primary" size="small" @click="search">查询</el-button>
      </el-col>
    </el-row>

    <el-table
      :data="tableData"
      border
      style="width: 100%">
      <el-table-column
        type="selection"
        width="35" />

      <el-table-column
        label="会员账号"
        width="350">
        <template slot-scope="scope">
          TODO:
        </template>
      </el-table-column>

      <el-table-column
        label="手机号"
        width="120">
        <template slot-scope="scope">
          TODO:
        </template>
      </el-table-column>

      <el-table-column
        label="提现流水号"
        width="180" />

      <el-table-column
        label="提现银行"
        width="180" />

      <el-table-column
        label="提现账户"
        width="180" />

      <el-table-column
        label="账户姓名"
        width="180" />

      <el-table-column
        label="提现金额"
        width="180" />

      <el-table-column
        label="状态"
        width="180" />

      <el-table-column
        label="提现日期"
        width="180" />

      <el-table-column
        label="操作"
        fixed="right"
        width="100">
        <template slot-scope="scope">
          <el-button size="mini" @click="handleEdit(scope.$index, scope.row)">订单详情</el-button>
        </template>
      </el-table-column>
    </el-table>

    <div class="ns-main">

      <!-- 通过提现申请 -->
      <!-- <div class="modal fade hide" id="agree" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
        <div class="modal-dialog">
          <div class="modal-content">
            <div class="modal-header">
              <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
              <h3>通过提现申请</h3>
            </div>
            <div class="modal-body">
              <div class="modal-infp-style">
                <table>
                  <tbody>
                    <tr>
                      <td>转账类型</td>
                      <td>
                        <div class="selectric-wrapper selectric-select-common" style="width: 250px;"><div class="selectric-hide-select"><select onchange="choose()" id="choose-type" class="select-common" tabindex="-1">
                          <option value="1">线下转账</option>
                          <option value="2">线上转账</option>
                        </select></div><div class="selectric"><span class="selectric-label">线下转账</span><button class="selectric-button">▾</button></div><div class="selectric-items" tabindex="-1"><div class="selectric-scroll"><ul><li data-index="0" class="selected" title="线下转账">线下转账</li><li data-index="1" class="last" title="线上转账">线上转账</li></ul></div></div><input class="selectric-input" tabindex="0"></div>
                      </td>
                    </tr>
                    <tr class="type-two">
                      <td>转账方式</td>
                      <td>
                        <div class="selectric-wrapper selectric-select-common" style="width: 250px;"><div class="selectric-hide-select"><select id="online_type" class="select-common" tabindex="-1">
                          <option value="1">微信转账</option>
                          <option value="2">支付宝转账</option>

                        </select></div><div class="selectric"><span class="selectric-label">微信转账</span><button class="selectric-button">▾</button></div><div class="selectric-items" tabindex="-1"><div class="selectric-scroll"><ul><li data-index="0" class="selected" title="微信转账">微信转账</li><li data-index="1" class="last" title="支付宝转账">支付宝转账</li></ul></div></div><input class="selectric-input" tabindex="0"></div>
                      </td>
                    </tr>
                    <tr class="type-one">
                      <td>转账银行</td>
                      <td>
                        <input type="text" name="transfer_name" id="transfer_name" class="input-common">
                      </td>
                    </tr>
                    <tr class="type-one">
                      <td>银行账户</td>
                      <td>
                        <input type="text" name="transfer_account_no" id="transfer_account_no" class="input-common">
                      </td>
                    </tr>
                    <tr class="type-one">
                      <td>交易流水</td>
                      <td>
                        <input type="text" name="transfer_no" id="transfer_no" class="input-common">
                      </td>
                    </tr>
                    <tr>
                      <td>转账金额</td>
                      <td><input type="text" name="transfer_money" id="transfer_money" placeholder="请输入转账金额" value="" onkeyup="this.value=this.value.replace(/[^\d+(\.\d+)?]/g,'')" class="input-common">
                        <input type="hidden" name="post-id" id="post-id" value="">
                      </td>
                    </tr>
                    <tr>
                      <td>备注</td>
                      <td><textarea name="transfer_remark" id="transfer_remark" class="textarea-common"></textarea></td>
                    </tr>
                </tbody></table>
              </div>
            </div>
            <div class="modal-footer">
              <button class="btn-common btn-big" onclick="audit()">确定</button>
              <button class="btn-common-cancle btn-big" data-dismiss="modal">关闭</button>
            </div>
          </div>
        </div>
      </div> -->

      <!-- 拒绝提现申请 -->
      <!-- <div class="modal fade hide" id="recharge_balance" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
      <input type="hidden" id="balance_id">
      <div class="modal-dialog">
        <div class="modal-content">
          <div class="modal-header">
            <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
            <h3>拒绝提现申请</h3>
          </div>
          <div class="modal-body">
            <div class="modal-infp-style">
              <table>
                <tbody><tr>
                  <td>备注</td>
                  <td colspan="3" id="time"><textarea id="remark" class="textarea-common"></textarea></td>
                </tr>
              </tbody></table>
            </div>
          </div>
          <div class="modal-footer">
            <button class="btn-common btn-big" onclick="refusetrue()">确定</button>
            <button class="btn-common-cancle btn-big" data-dismiss="modal">关闭</button>
          </div>
        </div>
      </div>
      </div> -->

      <!-- 提现详情模态框（Modal） -->
      <!-- <div class="modal fade hide" id="details" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
      <div class="modal-dialog">
        <div class="modal-content">
          <div class="modal-header">
            <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
            <h3>提现详情</h3>
          </div>
          <div class="modal-body">
            <div class="modal-infp-style">
              <table>
                <tbody><tr>
                  <td>会员</td>
                  <td colspan="4" id="real_name"></td>
                  <td>手机号</td>
                  <td colspan="4" id="mobile"></td>
                </tr>
                <tr>
                  <td>提现流水号</td>
                  <td colspan="4" id="withdraw_no"></td>
                  <td>提现银行</td>
                  <td colspan="4" id="bank_name"></td>
                </tr>
                <tr>
                  <td>提现账户</td>
                  <td colspan="4" id="account_number"></td>
                  <td>账户姓名</td>
                  <td colspan="4" id="realname"></td>
                </tr>
                <tr>
                  <td>提现金额</td>
                  <td colspan="4" id="cash"></td>
                  <td>提现日期</td>
                  <td colspan="4" id="ask_for_date"></td>
                </tr>
                <tr>
                  <td>状态</td>
                  <td colspan="4" id="status"></td>
                  <td>备注</td>
                  <td colspan="4" id="memo"></td>
                </tr>
              </tbody></table>
            </div>
          </div>
          <div class="modal-footer">
            <button type="button" class="btn btn-big" data-dismiss="modal">关闭</button>
          </div>
        </div>
      </div>
      </div> -->
    </div>

  </section>
</template>

<script>
export default {
  name: 'List',
  data () {
    return {
      searchKeyword: '',
      queryForm: {},
      tableData: [{
        logo: '/admin/images/wchat.png',
        name: '微信登录',
        status: true,
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

</style>
