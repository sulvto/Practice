<template>
  <div>
    <el-row :gutter="8" type="flex" justify="space-between">
      <el-col :xs="4" :sm="4" :md="4" :lg="4" :xl="4">
        <el-button type="danger" size="small">批量删除</el-button>
        <el-button type="primary" size="small" @click="addMember()">添加会员</el-button>
      </el-col>
      <el-col :xs="8" :sm="8" :md="8" :lg="8" :xl="10">
        &emsp;
      </el-col>
      <el-col :xs="4" :sm="4" :md="4" :lg="4" :xl="3">
        <el-select size="small" v-model="queryForm.select" clearable placeholder="请选择会员等级">
          <el-option label="普通会员" :value="1"></el-option>
          <el-option label="铜牌会员" :value="2"></el-option>
          <el-option label="银牌会员" :value="3"></el-option>
          <el-option label="金牌会员" :value="4"></el-option>
          <el-option label="至尊会员" :value="5"></el-option>
        </el-select>
      </el-col>
      <el-col :xs="4" :sm="4" :md="4" :lg="4" :xl="4">
        <el-input size="small" v-model="queryForm.searchKeyword" placeholder="输入手机号/邮箱/会员昵称"></el-input>
      </el-col>
      <el-col :xs="4" :sm="4" :md="4" :lg="4" :xl="3">
        <el-button type="primary" size="small" @click="search">查询</el-button>
        <el-button type="primary" size="small" >导出数据</el-button>
      </el-col>
    </el-row>

    <br/>

    <el-table border :data="tableData" style="width: 100%">
      <el-table-column
        type="selection"
        width="35">
      </el-table-column>

      <el-table-column label="会员">
        <template slot-scope="scope">
          <img src="@/assets/img/419b57e5802bd1f3b8fdedb81fdb5fce_360_360.png" class="head-portrait">
          <div style="float:left;">
            <label class="member-info">用户名：<span>{{scope.row.username}}</span></label>
            <label class="member-info">昵称: <span>{{scope.row.nickname}}</span></label>
            <label class="member-info"><span>手机：{{scope.row.phoneNumber ? scope.row.phoneNumber : '--' }}</span></label>
            <label class="member-info"><span>邮箱：{{scope.row.email ? scope.row.email : '--' }}</span></label>
          </div>
        </template>
      </el-table-column>

      <el-table-column
        prop="level"
        label="会员等级"
        width="80">
      </el-table-column>

      <el-table-column
        prop="promoterNo"
        label="推广员编号"
        width="100">
      </el-table-column>

      <el-table-column
        prop="integral"
        label="积分"
        width="80">
      </el-table-column>

      <el-table-column
        prop="accountBalance"
        label="账户余额"
        width="80">
      </el-table-column>

      <el-table-column
        label="注册&amp;登录"
        width="210">
        <template slot-scope="scope">
          注册时间 : {{scope.row.registrationDate}}<br>
          最后登录 : {{scope.row.lastLoginDate}}
        </template>
      </el-table-column>

      <el-table-column
          label="状态"
          width="70">
        <template slot-scope="scope">
          <el-tag type="success" v-if="scope.row.status === 1">正常</el-tag>
          <el-tag type="danger" v-else-if="scope.row.status === 2">锁定</el-tag>
        </template>
      </el-table-column>

      <el-table-column label="操作" fixed="right"
          width="240">
          <template slot-scope="scope">
            <div class="center-block">
              <el-button size="mini" @click="handleEdit(scope.$index, scope.row)">账户明细</el-button>
              <br>
              <el-button class="margin-top-5" size="mini" @click="dialogRechargeIntegralFormVisible = true">积分调整</el-button>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
              <el-button class="margin-top-5" size="mini" @click="dialogRechargeBalanceFormVisible = true">余额调整</el-button>
              <br>
              <el-button class="margin-top-5" size="mini" @click="handleEdit(scope.$index, scope.row)">查看足迹</el-button>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
              <el-button class="margin-top-5" size="mini" @click="resetPassword(scope.row)">重置密码</el-button>
              <br>
              <el-button class="margin-top-5" v-if="scope.row.status === 1" size="mini" @click="handleEdit(scope.$index, scope.row)">锁定</el-button>
              <el-button class="margin-top-5" v-else-if="scope.row.status === 2" size="mini" @click="handleEdit(scope.$index, scope.row)">解锁</el-button>
              <el-button class="margin-top-5" size="mini" @click="modifyMember(scope.row)">修改</el-button>
              <el-button class="margin-top-5" size="mini" @click="handleDelete(scope.$index, scope.row)">删除</el-button>
            </div>
          </template>
      </el-table-column>
    </el-table>

    <el-dialog :title="dialogEditUserFormTitle" size="small" :visible.sync="dialogEditUserFormVisible">
      <el-form ref="editUserForm" :rules="editUserFormRules" size="small" :model="editUserForm" label-width="100px" >

        <el-form-item label="用户名" prop="username">
          <el-input v-model="editUserForm.username" ></el-input>
        </el-form-item>

        <el-form-item label="登录密码" prop="password" v-if="!editUserForm.oldEditUser">
          <el-input type="password" v-model="editUserForm.password" ></el-input>
        </el-form-item>

        <el-form-item label="昵称">
          <el-input v-model="editUserForm.nickname" ></el-input>
        </el-form-item>

        <el-form-item label="会员等级">
          <el-select v-model="editUserForm.level" placeholder="请选择会员等级">
            <el-option label="普通会员" :value="1"></el-option>
            <el-option label="铜牌会员" :value="2"></el-option>
            <el-option label="银牌会员" :value="3"></el-option>
            <el-option label="金牌会员" :value="4"></el-option>
            <el-option label="至尊会员" :value="5"></el-option>
          </el-select>
        </el-form-item>

        <el-form-item label="手机号码">
          <el-input v-model="editUserForm.phoneNumber" ></el-input>
        </el-form-item>

        <el-form-item label="邮箱地址">
          <el-input v-model="editUserForm.email" ></el-input>
        </el-form-item>

        <el-form-item label="性别">
          <el-radio-group v-model="editUserForm.gender">
            <el-radio :label="1">男</el-radio>
            <el-radio :label="2">女</el-radio>
            <el-radio :label="3">保密</el-radio>
          </el-radio-group>
        </el-form-item>

        <el-form-item label="账户状态">
          <el-radio-group v-model="editUserForm.status">
            <el-radio :label="1">正常</el-radio>
            <el-radio :label="2">锁定</el-radio>
          </el-radio-group>
        </el-form-item>

      </el-form>
      <div slot="footer" class="dialog-footer">
        <el-button size="small" @click="dialogEditUserFormVisible = false">取 消</el-button>
        <el-button size="small" type="primary" @click="saveEditUserForm('classForm')">保 存</el-button>
      </div>
    </el-dialog>

    <el-dialog title="重置密码" size="small" :visible.sync="dialogResetPasswordFormVisible">
      <el-form ref="resetPasswordForm" size="small" :model="resetPasswordForm" label-width="100px" >

      <el-form-item label="密码" prop="password" >
        <el-input type="password" v-model="resetPasswordForm.password" ></el-input>
      </el-form-item>

      </el-form>
      <div slot="footer" class="dialog-footer">
        <el-button size="small" @click="dialogResetPasswordFormVisible = false">取 消</el-button>
        <el-button size="small" type="primary" @click="dialogResetPasswordFormVisible = false">保 存</el-button>
      </div>
    </el-dialog>

    <el-dialog title="调整余额" size="small" :visible.sync="dialogRechargeBalanceFormVisible">
      <el-form ref="rechargeBalanceForm" size="small" :model="rechargeBalanceForm" label-width="100px" >

      <el-form-item label="当前余额" >
        {{ rechargeBalanceForm.currentBalance }}
      </el-form-item>

      <el-form-item label="调整金额">
        <el-input type="number" v-model="rechargeBalanceForm.balance" min="-9999" max="9999">
          <template slot="append">
                  元
          </template>
        </el-input>
        <p class="hint">增加或减少</p>
      </el-form-item>

      <el-form-item label="备注">
        <el-input type="textarea" v-model="rechargeBalanceForm.notes" ></el-input>
      </el-form-item>

      </el-form>
      <div slot="footer" class="dialog-footer">
        <el-button size="small" @click="dialogRechargeBalanceFormVisible = false">取 消</el-button>
        <el-button size="small" type="primary" @click="dialogRechargeBalanceFormVisible = false">保 存</el-button>
      </div>
    </el-dialog>

    <el-dialog title="调整积分" size="small" :visible.sync="dialogRechargeIntegralFormVisible">
      <el-form ref="rechargeIntegralForm" size="small" :model="rechargeIntegralForm" label-width="100px" >

      <el-form-item label="当前积分" >
        {{ rechargeIntegralForm.currentIntegral }}
      </el-form-item>

      <el-form-item label="调整积分">
        <el-input type="number" v-model="rechargeIntegralForm.integral" >
          <template slot="append">
                  分
          </template>
        </el-input>
        <p class="hint">输入负数表示为减少</p>
      </el-form-item>

      <el-form-item label="备注">
        <el-input type="textarea" v-model="rechargeIntegralForm.notes" ></el-input>
      </el-form-item>

      </el-form>
      <div slot="footer" class="dialog-footer">
        <el-button size="small" @click="dialogRechargeIntegralFormVisible = false">取 消</el-button>
        <el-button size="small" type="primary" @click="dialogRechargeIntegralFormVisible = false">保 存</el-button>
      </div>
    </el-dialog>

      <!-- 修改会员上级编号-->
      <div class="modal fade hide" id="modify_pre_promoter" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">

        <div class="modal-dialog">
          <div class="modal-content">
            <div class="modal-header">
              <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
              <h4 class="modal-title" id="myModalLabel">上级编号</h4>
            </div>
            <div class="modal-body">
              <div class="modal-infp-style">
                <table class="modal-tab">
                  <tbody>
                    <tr>
                      <td style="width:20%">上级编号</td>
                      <td colspan="3"><input type="text" id="modify_pre_member" class="input-common"></td>
                    </tr>
                  </tbody>
                </table>
              </div>
            </div>

            <div class="modal-footer">
              <input type="hidden" id="modify_promoter_userid">
              <button class="btn btn-primary" onclick="modify_promoter()">保存</button>
              <button class="btn" data-dismiss="modal">关闭</button>
            </div>
          </div>
        </div>

      </div>

  </div>
</template>

<script>
export default {
  name: 'list',
  data () {
    return {
      DIALOG_EDITUSERFORM_TITLE_ADD: '添加会员',
      DIALOG_EDITUSERFORM_TITLE_MODIFY: '编辑会员',
      dialogRechargeBalanceFormVisible: false,
      rechargeBalanceForm: {},
      dialogRechargeIntegralFormVisible: false,
      rechargeIntegralForm: {},
      dialogEditUserFormTitle: '',
      dialogEditUserFormVisible: false,
      dialogResetPasswordFormVisible: false,
      resetPasswordForm: {},
      editUserForm: {},
      editUserFormRules: {
        username: [
          { required: true, message: '请输入用户名', trigger: 'blur' }
        ],
        password: [
          { required: true, message: '请输入用户密码', trigger: 'blur' },
          { min: 6, max: 8, message: '长度在 6 到 8 个字符', trigger: 'blur' }
        ]
      },
      queryForm: {},
      tableData: [{
        username: 'yaodayizi',
        nickname: 'yaodayizi',
        phoneNumber: '',
        level: '铜牌会员',
        integral: '100',
        accountBalance: '¥3500.00',
        email: '',
        status: 1,
        lastLoginDate: '2018-08-23 16:46:56',
        registrationDate: '2018-08-23 16:18:11',
        promoterNo: ''
      }, {
        username: 'weibin123',
        nickname: 'weibin123',
        phoneNumber: '',
        level: '铜牌会员',
        integral: '100',
        accountBalance: '¥0.00',
        email: '',
        status: 1,
        lastLoginDate: '2018-08-22 19:45:33',
        registrationDate: '2018-08-22 19:45:33',
        promoterNo: ''
      }, {
        username: 's51983',
        nickname: 's51983',
        phoneNumber: '',
        level: '普通会员',
        integral: '100',
        accountBalance: '¥0.00',
        email: '',
        status: 1,
        lastLoginDate: '2018-08-21 17:30:40',
        registrationDate: '2018-08-21 17:30:40',
        promoterNo: ''
      }, {
        username: '123123',
        nickname: '123123',
        phoneNumber: '',
        level: '铜牌会员',
        integral: '100',
        accountBalance: '¥0.00',
        email: '',
        status: 1,
        lastLoginDate: '2018-08-24 10:27:27',
        registrationDate: '2018-08-21 14:26:48',
        promoterNo: ''
      }, {
        username: 'admin123',
        nickname: 'admin123',
        phoneNumber: '',
        level: '金牌会员',
        integral: '11111',
        accountBalance: '¥0.00',
        email: '',
        status: 1,
        lastLoginDate: '2018-08-21 09:29:26',
        registrationDate: '2018-08-21 09:29:03',
        promoterNo: ''
      }, {
        username: 'test001',
        nickname: 'test001',
        phoneNumber: '',
        level: '普通会员',
        integral: '0',
        accountBalance: '¥0.00',
        email: '',
        status: 1,
        lastLoginDate: '2018-08-24 12:24:09',
        registrationDate: '2018-08-20 11:24:09',
        promoterNo: ''
      }, {
        username: 'mingbolang',
        nickname: 'mingbolang',
        phoneNumber: '',
        level: '普通会员',
        integral: '100',
        accountBalance: '¥0.00',
        email: '',
        status: 1,
        lastLoginDate: '2018-08-20 08:37:47',
        registrationDate: '2018-08-20 08:26:57',
        promoterNo: ''
      }, {
        username: 'dagege',
        nickname: 'dagege',
        phoneNumber: '',
        level: '普通会员',
        integral: '100',
        accountBalance: '¥0.00',
        email: '',
        status: 1,
        lastLoginDate: '2018-08-17 21:57:00',
        registrationDate: '2018-08-17 21:57:00',
        promoterNo: ''
      }, {
        username: 'hnxzhl',
        nickname: 'hnxzhl',
        phoneNumber: '',
        level: '普通会员',
        integral: '100',
        accountBalance: '¥0.00',
        email: '',
        status: 1,
        lastLoginDate: '2018-08-18 21:26:21',
        registrationDate: '2018-08-17 21:51:16',
        promoterNo: ''
      }, {
        username: 'afc',
        nickname: 'afc',
        phoneNumber: '',
        level: '普通会员',
        integral: '100',
        accountBalance: '¥0.00',
        email: '',
        status: 2,
        lastLoginDate: '2018-08-17 11:06:44',
        registrationDate: '2018-08-17 11:01:58',
        promoterNo: ''
      }, {
        username: 'admin111',
        nickname: 'admin111',
        phoneNumber: '',
        level: '普通会员',
        integral: '100',
        accountBalance: '¥0.00',
        email: '',
        status: 1,
        lastLoginDate: '2018-08-14 15:22:57',
        registrationDate: '2018-08-14 15:22:57',
        promoterNo: ''
      }, {
        username: '11112222',
        nickname: '11112222',
        phoneNumber: '',
        level: '普通会员',
        integral: '100',
        accountBalance: '¥0.00',
        email: '',
        status: 1,
        lastLoginDate: '2018-08-13 14:25:32',
        registrationDate: '2018-08-13 14:25:32',
        promoterNo: ''
      }, {
        username: 'test12345',
        nickname: 'test12345',
        phoneNumber: '',
        level: '普通会员',
        integral: '100',
        accountBalance: '¥0.00',
        email: '',
        status: 1,
        lastLoginDate: '2018-08-11 14:26:25',
        registrationDate: '2018-08-11 14:26:25',
        promoterNo: ''
      }, {
        username: 'niushopdemo',
        nickname: 'niushopdemo',
        phoneNumber: '',
        level: '普通会员',
        integral: '100',
        accountBalance: '¥0.00',
        email: '',
        status: 1,
        lastLoginDate: '2018-08-10 20:43:10',
        registrationDate: '2018-08-10 20:43:10',
        promoterNo: ''
      }]
    }
  },
  methods: {
    addMember () {
      this.dialogEditUserFormTitle = this.DIALOG_EDITUSERFORM_TITLE_ADD
      this.editUserForm = {}
      this.dialogEditUserFormVisible = true
    },
    modifyMember (member) {
      this.dialogEditUserFormTitle = this.DIALOG_EDITUSERFORM_TITLE_MODIFY
      this.editUserForm = Object.assign({}, member)
      this.editUserForm.oldEditUser = member
      this.dialogEditUserFormVisible = true
    },
    saveEditUserForm () {
      // Modify member
      if (this.editUserForm.oldEditUser) {
        let oldEditUser = this.editUserForm.oldEditUser
        delete this.editUserForm.oldEditUser
        Object.assign(oldEditUser, this.editUserForm)
      } else {
        // Add member
        this.tableData.push(this.editUserForm)
      }
      this.dialogEditUserFormVisible = false
    },
    resetPassword (member) {
      this.dialogResetPasswordFormVisible = true
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
.hint {
  font-size: 12px;
  line-height: 16px;
  color: #999999;
  margin: 10px 0 0;
}

label.member-info {
  float:none;
  width:100%;
  display: block;
  margin-bottom: 5px;
}

.head-portrait {
  margin-top: 20px;
  width: 60px;
  height: 60px;
  float: left;
  padding-right: 10px;
}

.margin-top-5 {
  margin-top: 5px;
}
</style>
