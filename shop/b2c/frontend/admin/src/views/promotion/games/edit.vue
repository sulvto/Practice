<template>

  <div class="ns-base-section">
    <el-steps :space="400" :active="step" finish-status="success">
      <el-step title="创建活动"></el-step>
      <el-step title="中奖设置"></el-step>
      <el-step title="奖励设置"></el-step>
      <el-step title="完成"></el-step>
    </el-steps>

    <div class="promotion-game-main">
            <div class="game-container">
        <!-- 活动缩略图 -->
        <div class="game-thumbnail">
          <img src="@/assets/img/games/promotion_game_guaguale.png">
        </div>
        <div class="game-info">
          <!-- 创建活动 start -->
          <div v-show="step === 1" >
            <el-form ref="editForm" :rules="rules" :model="editForm" label-width="100px" size="small" label-position="right">

              <h4 class="option-title">创建活动</h4>

              <el-form-item label="活动名称" required>
                <el-input v-model="editForm.name" placeholder="填写活动名称"></el-input>
              </el-form-item>

              <el-form-item label="有效时间" required>
                <el-date-picker
                  v-model="editForm.dateRange"
                  type="datetimerange"
                  :picker-options="pickerOptions"
                  range-separator="至"
                  start-placeholder="开始时间"
                  end-placeholder="结束时间"
                  align="right">
                </el-date-picker>
              </el-form-item>

              <el-form-item label="活动说明" >
                <el-input type="textarea" v-model="editForm.introduction"></el-input>
              </el-form-item>

              <h4 class="option-title">参与条件</h4>

              <el-form-item label="参与的用户" >
                <el-select v-model="editForm.needMemberLevel" clearable>
                  <el-option label="普通会员" value="1"></el-option>
                  <el-option label="铜牌会员" value="2"></el-option>
                  <el-option label="银牌会员" value="3"></el-option>
                  <el-option label="金牌会员" value="4"></el-option>
                  <el-option label="至尊会员" value="5"></el-option>
                </el-select>
                <p class="ini">默认所有用户都能参与活动。</p>
              </el-form-item>

              <el-form-item label="消耗积分" required>
                <el-input type="number" min="1" v-model="editForm.deductIntegral" >
                  <template slot="append">
                    分
                  </template>
                </el-input>
                <p class="ini">用户每次参与需要消耗积分</p>
              </el-form-item>

              <el-form-item label="限制类型">
                <el-radio-group v-model="editForm.joinType">
                  <el-radio label="1">活动全过程</el-radio>
                  <el-radio label="2">每天</el-radio>
                </el-radio-group>
              </el-form-item>

              <el-form-item label="参与次数">
                <el-input type="number" min="0" v-model="editForm.joinFrequency" >
                  <template slot="append">
                    次
                  </template>
                </el-input>
                <p class="ini">0为不限制次数</p>
              </el-form-item>
            </el-form>

            <!-- <dl>
              <dt>活动图片：</dt>
              <dd>
                <div class="upload-btn-common">
                  <div>
                    <input class="input-file" name="file_upload" id="uploadImg" type="file" onchange="imgUpload(this);" title="上传">
                    <input type="hidden" id="logo" value="">
                  </div>
                  <input type="text" id="text_logo" class="input-common" readonly="readonly" value="">
                  <em>上传</em>

                  <img id="preview_logo" src="/public/static/blue/img/upload-common-select.png" data-html="true" data-container="body" data-placement="top" data-trigger="manual">
                </div>
                <p class="ini">上传活动图片后，才会在首页显示</p>
              </dd>
            </dl> -->

          </div>
          <!-- 创建活动 end -->

          <!-- 中奖设置 start -->
          <div v-show="step === 2">
            <el-form ref="editForm" :rules="rules" :model="editForm" label-width="100px" size="small" label-position="right">
              <h4 class="option-title">中奖设置</h4>

              <el-form-item label="中奖率" required>
                <el-input type="number" min="0" max="100" v-model="editForm.winningRate" placeholder="0-100">
                  <template slot="append">
                    %
                  </template>
                </el-input>
                <p class="ini">会员中奖的概率 在0到100之间进行取值</p>
              </el-form-item>

              <el-form-item label="未中奖说明" >
                <el-input type="textarea" v-model="editForm.noWinningInfo" placeholder="哎呀！真可惜没有中奖" value="哎呀！真可惜没有中奖"></el-input>
              </el-form-item>

              <el-form-item label="中奖名单">
                <el-radio-group v-model="editForm.showWinningList">
                  <el-radio :label="true">显示</el-radio>
                  <el-radio :label="false">不显示</el-radio>
                </el-radio-group>
              </el-form-item>

              <el-form-item label="限制类型">
                <el-radio-group v-model="editForm.winningType">
                  <el-radio label="1">活动全过程</el-radio>
                  <el-radio label="2">每天</el-radio>
                </el-radio-group>
              </el-form-item>

              <el-form-item label="中奖次数">
                <el-input type="number" min="0" v-model="editForm.winningLimit" >
                  <template slot="append">
                    次
                  </template>
                </el-input>
                <p class="ini">0为不限制次数</p>
              </el-form-item>
            </el-form>
          </div>
          <!-- 中奖设置 end -->

          <!-- 奖励设置 start -->
          <div v-show="step === 3">
            <h4 class="option-title">奖励设置</h4>
            <p class="info-tip">等级设置的奖品数量越多，则该等级中奖率越高。例如：设置一等奖 10个，二等奖20个，则中二等奖概率高于一等奖</p>

            <div class="award-container">

              <el-table border :data="editForm.rules" style="width: 100%">

                <el-table-column
                  prop="name"
                  label="奖励等级">
                </el-table-column>

                <el-table-column
                  label="奖品类型">
                  <template slot-scope="scope">
                      <span v-show="scope.row.awardType === 1">积分</span>
                      <span v-show="scope.row.awardType === 2">优惠券</span>
                      <span v-show="scope.row.awardType === 3">红包</span>
                      <span v-show="scope.row.awardType === 4">赠品</span>
                  </template>
                </el-table-column>

                <el-table-column
                  label="奖励说明"
                  width="120">
                  <template slot-scope="scope">
                    <span v-show="scope.row.awardType === 1">
                      {{ scope.row.integral }}积分
                    </span>
                    <span v-show="scope.row.awardType === 2">
                      {{ scope.row.coupon }}
                    </span>
                    <span v-show="scope.row.awardType === 3">
                      {{ scope.row.hongbao }}元红包
                    </span>
                    <span v-show="scope.row.awardType === 4">
                      {{ scope.row.gift }}
                    </span>
                  </template>
                </el-table-column>

                <el-table-column
                    prop="number"
                    label="奖品数量(个)">
                </el-table-column>

                <el-table-column
                  label="操作"
                  fixed="right"
                  width="150">
                    <template slot-scope="scope">
                        <el-button size="mini" @click="handleEdit(scope.$index, scope.row)">编辑</el-button>
                        <el-button size="mini" @click="handleDelete(scope.$index, scope.row)">删除</el-button>
                    </template>
                </el-table-column>
              </el-table>

              <div style="margin-top: 10px;">
                <el-form ref="ruleForm" :model="ruleForm" label-width="100px" size="small" label-position="right">
                  <el-form-item label="奖励等级" >
                    <el-input v-model="ruleForm.name" placeholder="请填写奖励等级"></el-input>
                  </el-form-item>

                  <el-form-item label="奖品类型">
                    <el-radio-group v-model="ruleForm.awardType">
                      <el-radio :label="1">积分</el-radio>
                      <el-radio :label="2">优惠券</el-radio>
                      <el-radio :label="3">红包</el-radio>
                      <el-radio :label="4">赠品</el-radio>
                    </el-radio-group>
                  </el-form-item>

                  <el-form-item label="赠送积分" v-show="ruleForm.awardType === 1">
                    <el-input type="number" min="0" v-model="ruleForm.integral" >
                      <template slot="append">
                        分
                      </template>
                    </el-input>
                  </el-form-item>

                  <el-form-item label="优惠劵"  v-show="ruleForm.awardType === 2">
                    <el-select v-model="ruleForm.coupon" placeholder="请选择">
                      <el-option label="选择1" value="1"></el-option>
                      <el-option label="选择2" value="2"></el-option>
                    </el-select>
                  </el-form-item>

                  <el-form-item label="奖励红包" v-show="ruleForm.awardType === 3">
                    <el-input type="number" min="0" v-model="ruleForm.hongbao" >
                      <template slot="append">
                        元
                      </template>
                    </el-input>
                  </el-form-item>

                  <el-form-item label="奖励赠品" v-show="ruleForm.awardType === 4">
                    <el-select v-model="ruleForm.gift" placeholder="请选择">
                      <el-option label="选择1" value="1"></el-option>
                      <el-option label="选择2" value="2"></el-option>
                    </el-select>
                  </el-form-item>

                  <el-form-item label="奖品数量">
                    <el-input type="number" min="0" v-model="ruleForm.number" >
                      <template slot="append">
                        个
                      </template>
                    </el-input>
                  </el-form-item>

                  <el-form-item>
                    <el-button type="primary" @click="saveRule()">添加奖励</el-button>
                  </el-form-item>

                </el-form>

              </div>
            </div>
            <br/>
          </div>
          <!-- 奖励设置 end -->

          <el-button size="small" v-show="step > 1" @click="step--">上一步</el-button>
          <el-button size="small" v-show="step < 3" @click="step++">下一步</el-button>
          <el-button size="small" v-show="step === 3" @click="done()">完成</el-button>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
export default {
  name: 'gameEdit',
  data () {
    return {
      step: 1,
      editForm: {
        rules: []
      },
      ruleForm: {},
      pickerOptions: {
        shortcuts: [{
          text: '最近一周',
          onClick (picker) {
            const end = new Date()
            const start = new Date()
            end.setTime(start.getTime() + 3600 * 1000 * 24 * 7)
            picker.$emit('pick', [start, end])
          }
        }, {
          text: '最近一个月',
          onClick (picker) {
            const end = new Date()
            const start = new Date()
            end.setTime(start.getTime() + 3600 * 1000 * 24 * 30)
            picker.$emit('pick', [start, end])
          }
        }, {
          text: '最近三个月',
          onClick (picker) {
            const end = new Date()
            const start = new Date()
            end.setTime(start.getTime() + 3600 * 1000 * 24 * 90)
            picker.$emit('pick', [start, end])
          }
        }]
      }
    }
  },
  methods: {
    done () {

    },
    saveRule () {
      this.editForm.rules.push(Object.assign({}, this.ruleForm))
      this.ruleForm = {}
    }
  }
}
</script>

<style lang="scss" scoped>

.promotion-game-main .game-container {
  width: 920px;
  margin: 10px 0 0 6px;
  border: 1px solid #e5e5e5;
  overflow: hidden;
  .game-thumbnail {
    width: 310px;
    min-height: 680;
    padding:15px 10px;
    display: inline-block;
    float: left;
    box-sizing: border-box;
  }

  /*活动信息信息*/
  .game-info {
    padding: 15px 10px;
    width: 590px;
    min-height: 650px;
    float: left;
    background: #f4f5f9;

    .award-container {
      padding: 15px;
      background: #fff;
    }

    h4.option-title {
      color: #666;
      font-size: 16px;
      padding-left: 5px;
      margin: 0;
      border-left: 2px solid #126AE4;
    }

    p.ini {
      color: #999;
      line-height: 2;
      margin: 0;
      font-size: 12px;
    }

    p.info-tip {
      margin: 10px 0;
      color: #999;
    }
  }
}

</style>
