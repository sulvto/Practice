<template>

  <section class="ns-base-section">

    <div style="position:relative;margin:0;">
      <!-- 面包屑导航 -->
            <div class="breadcrumb-nav">
        <a href="index.html">大鵬系統</a>
                  <i class="fa fa-angle-right"></i>
          <a href="/promotion/coupontypelist.html">营销</a>
                  <i class="fa fa-angle-right"></i>
          <!-- 需要加跳转链接用这个：http://showfx.niuteam.cn/admin/Promotion/updatePromotionGame -->
          <a href="javascript:;" style="color:#999;">修改互动游戏</a>
              </div>
            <!-- 三级导航菜单 -->

      <div class="right-side-operation">
        <ul>
          <li>
            <a class="js-open-warmp-prompt" href="javascript:;" data-menu-desc=""><i class="fa fa-question-circle"></i>&nbsp;提示</a>
            <div class="popover">
              <div class="arrow"></div>
              <div class="popover-content">
                <div>
                                    <h4>操作提示</h4>
                  <p>修改互动游戏</p>
                  <hr>
                                    <h4>功能提示</h4>
                  <p class="function-prompts"></p>
                </div>
              </div>
            </div>
          </li>
        </ul>
      </div>
    </div>

    <div class="ns-main">

      <div class="promotion-game-main">
      <nav class="option-nav">
        <ul>
          <li class="selected" data-option="create-promotion"><a href="javascript:;">创建活动</a></li>
          <li data-option="winning-setting"><a href="javascript:;">中奖设置</a></li>
          <li data-option="award-setting"><a href="javascript:;">奖励设置</a></li>
          <li data-option="create-promotion"><a href="javascript:;">完成</a></li>
        </ul>
      </nav>

      <div class="game-container">
        <!-- 活动缩略图 -->
        <div class="game-thumbnail">
          <img src="/public/admin/images/games/promotion_game_guaguale.png">
        </div>
        <div class="game-info">
          <!-- 创建活动 start -->
          <div id="create-promotion" class="create-promotion info-content-height">
            <h4 class="option-title">创建活动</h4>
            <dl>
              <dt><span class="require">*</span>活动名称：</dt>
              <dd>
                <input class="input-common" id="game_name" data-switch="game_name" value="平图案" placeholder="填写活动名称">
                <p class="err-msg">活动名称不可为空</p>
              </dd>
            </dl>
            <!-- 开始时间 -->
            <dl>
              <dt><span class="require">*</span>开始时间：</dt>
              <dd>
                <input class="input-common" type="datetime" id="start_time" data-switch="start_time" value="2018-07-26 15:33:18" onclick="WdatePicker({skin:'twoer',dateFmt:'yyyy-MM-dd HH:mm:ss'})">
                <p class="err-msg"></p>
              </dd>
            </dl>
            <!-- 结束时间 -->
            <dl>
              <dt><span class="require">*</span>结束时间：</dt>
              <dd>
                <input class="input-common" type="datetime" id="end_time" data-switch="end_time" value="2018-07-31 15:33:20" onclick="WdatePicker({skin:'twoer',dateFmt:'yyyy-MM-dd HH:mm:ss'})">
                <p class="err-msg"></p>
              </dd>
            </dl>
            <dl>
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
            </dl>
            <dl>
              <dt>活动说明：</dt>
              <dd>
                <textarea class="textarea-common" rows="3" id="remark"></textarea>
              </dd>
            </dl>
            <h4 class="option-title">参与条件</h4>
            <dl>
              <dt>参与的用户：</dt>
              <dd>
                <div class="selectric-wrapper selectric-select-common" style="width: 250px;"><div class="selectric-hide-select"><select name="member_level" id="member_level" data-switch="member_level" class="select-common" tabindex="-1">
                  <option value="0">全部会员</option>
                                  <option value="47" selected="selected">普通会员</option>
                                    <option value="48">铜牌会员</option>
                                    <option value="49">银牌会员</option>
                                    <option value="50">金牌会员</option>
                                    <option value="51">至尊会员</option>
                                </select></div><div class="selectric"><span class="selectric-label">普通会员</span><button class="selectric-button">▾</button></div><div class="selectric-items" tabindex="-1"><div class="selectric-scroll"><ul><li data-index="0" class="" title="全部会员">全部会员</li><li data-index="1" class="selected" title="普通会员">普通会员</li><li data-index="2" class="" title="铜牌会员">铜牌会员</li><li data-index="3" class="" title="银牌会员">银牌会员</li><li data-index="4" class="" title="金牌会员">金牌会员</li><li data-index="5" class="last" title="至尊会员">至尊会员</li></ul></div></div><input class="selectric-input" tabindex="0"></div>
                <p class="ini">默认所有用户都能参与活动。</p>
              </dd>
            </dl>
            <dl>
              <dt><span class="require">*</span>消耗积分：</dt>
              <dd>
                <input type="number" id="points" data-switch="points" class="input-common harf" value="20"><em class="unit">分</em>
                <p class="ini">用户每次参与需要消耗积分</p>
                <p class="err-msg"></p>
              </dd>
            </dl>
            <dl>
              <dt>限制类型：</dt>
              <dd>
                <label class="radio inline normal">
                  <i class="radio-common selected">
                    <input type="radio" name="join_type" value="0" checked="">
                  </i>
                  <span>活动全过程</span>
                </label>
                <label class="radio inline normal">
                  <i class="radio-common ">
                    <input type="radio" name="join_type" value="1">
                  </i>
                  <span>每天</span>
                </label>
              </dd>
            </dl>
            <dl>
              <dt>参与次数：</dt>
              <dd>
                <input type="number" id="join_frequency" class="input-common harf" value="0"><em class="unit">次</em>
                <p class="ini">0为不限制次数</p>
              </dd>
            </dl>
          </div>
          <!-- 创建活动 end -->
          <!-- 中奖设置 start -->
          <div id="winning-setting" class="winning-setting info-content-height" style="display: none;">
            <h4 class="option-title">中奖设置</h4>
            <dl>
              <dt><span class="require">*</span>中奖率：</dt>
              <dd>
                <input type="number" id="winning_rate" class="input-common harf" placeholder="0-100" value="100.00"><em class="unit">%</em>
                <p class="ini">会员中奖的概率 在0到100之间进行取值</p>
                <p class="err-msg"></p>
              </dd>
            </dl>
            <dl>
              <dt>未中奖说明：</dt>
              <dd>
                <textarea class="textarea-common" id="no_winning_des" placeholder="哎呀！真可惜没有中奖" rows="3">哎呀！真可惜没有中奖</textarea>
              </dd>
            </dl>
            <dl>
              <dt>中奖名单：</dt>
              <dd>
                <label class="radio inline normal">
                  <i class="radio-common selected">
                    <input type="radio" name="winning_list_display" value="1" checked="">
                  </i>
                  <span>显示</span>
                </label>
                <label class="radio inline normal">
                  <i class="radio-common ">
                    <input type="radio" name="winning_list_display" value="0">
                  </i>
                  <span>不显示</span>
                </label>
              </dd>
            </dl>
            <dl>
              <dt>限制类型：</dt>
              <dd>
                <label class="radio inline normal">
                  <i class="radio-common selected">
                    <input type="radio" name="winning_type" value="0" checked="">
                  </i>
                  <span>活动全过程</span>
                </label>
                <label class="radio inline normal">
                  <i class="radio-common ">
                    <input type="radio" name="winning_type" value="1">
                  </i>
                  <span>每天</span>
                </label>
              </dd>
            </dl>
            <dl>
              <dt>中奖次数：</dt>
              <dd>
                <input type="number" name="" class="input-common harf" id="winning_max" value="0"><em class="unit">次</em>
                <p class="ini">0为不限制次数</p>
              </dd>
            </dl>
          </div>
          <!-- 中奖设置 end -->
          <!-- 奖励设置 start -->
          <div id="award-setting" class="award-setting info-content-height" style="display: none;">
            <h4 class="option-title">奖励设置</h4>
            <p class="info-tip">等级设置的奖品数量越多，则该等级中奖率越高。例如：设置一等奖 10个，二等奖20个，则中二等奖概率高于一等奖</p>
            <div class="award-container">
              <table class="table-class">
                <colgroup>
                  <col style="width:30%;">
                  <col style="width:15%;">
                  <col style="width:15%;">
                  <col style="width:20%;">
                  <col style="width:20%;">
                </colgroup>
                <tbody><tr>
                  <th>奖励等级</th>
                  <th>奖品类型</th>
                  <th>奖励说明</th>
                  <th>奖品数量(个)</th>
                  <th>操作</th>
                </tr>
                </tbody><tbody id="games_rule">
                                  <tr data-sort="0">
                      <td name="rule_name">10</td>
                      <td name="rule_type_name">
                            送优惠
                            <input type="hidden" name="rule_type" value="2">
                      </td>
                      <td name="rule_text">满150元减5元
                        <input type="hidden" name="rule_value" value="2"></td>
                      <td name="rule_num">10</td>
                      <td>
                        <a href="javascript:;" onclick="setRule(this)">编辑</a>&nbsp;&nbsp;&nbsp;
                        <a href="javascript:;" onclick="delRule(this)">删除</a>
                      </td>
                    </tr>
                                  <tr data-sort="1">
                      <td name="rule_name">10</td>
                      <td name="rule_type_name">
                          赠品
                        <input type="hidden" name="rule_type" value="4">
                      </td>
                      <td name="rule_text">
                        132
                        <input type="hidden" name="rule_value" value="1"></td>
                      <td name="rule_num">5</td>
                      <td>
                        <a href="javascript:;" onclick="setRule(this)">编辑</a>&nbsp;&nbsp;&nbsp;
                        <a href="javascript:;" onclick="delRule(this)">删除</a>
                      </td>
                    </tr>
                                  <tr data-sort="2">
                      <td name="rule_name">10</td>
                      <td name="rule_type_name">
                                              红包
                        <input type="hidden" name="rule_type" value="3">
                      </td>
                      <td name="rule_text">5余额红包
                        <input type="hidden" name="rule_value" value="5.00">
                        </td>

                      <td name="rule_num">15</td>
                      <td>
                        <a href="javascript:;" onclick="setRule(this)">编辑</a>&nbsp;&nbsp;&nbsp;
                        <a href="javascript:;" onclick="delRule(this)">删除</a>
                      </td>
                    </tr>
              </tbody>
              </table>
              <div style="margin-top: 10px;" class="add_rule">
                <dl>
                  <dt>奖励等级：</dt>
                  <dd>
                    <input type="text" id="rule_name" class="input-common" placeholder="请填写奖励等级">
                    <p class="err-msg"></p>
                  </dd>
                </dl>
                <dl>
                  <dt>奖品类型：</dt>
                  <dd>
                    <label class="radio inline normal">
                      <i class="radio-common selected">
                        <input type="radio" checked="checked" id="rule_type_1" name="rule_type" value="1">
                      </i>
                      <span>积分</span>
                    </label>
                    <label class="radio inline normal">
                      <i class="radio-common">
                        <input type="radio" id="rule_type_2" name="rule_type" value="2">
                      </i>
                      <span>优惠券</span>
                    </label>
                    <label class="radio inline normal">
                      <i class="radio-common">
                        <input type="radio" id="rule_type_3" name="rule_type" value="3">
                      </i>
                      <span>红包</span>
                    </label>
                    <label class="radio inline normal">
                      <i class="radio-common">
                        <input type="radio" id="rule_type_4" name="rule_type" value="4">
                      </i>
                      <span>赠品</span>
                    </label>
                  </dd>
                </dl>
                <dl class="rule_type1">
                  <dt>赠送积分：</dt>
                  <dd>
                    <input type="number" id="rule_points" class="input-common harf" placeholder="请填写积分数"><em class="unit">分</em>
                    <p class="err-msg"></p>
                  </dd>
                </dl>
                <dl style="display: none;" class="rule_type2">
                  <dt>优惠劵：</dt>
                  <dd>
                    <div class="selectric-wrapper selectric-select-common" style="width: 250px;"><div class="selectric-hide-select"><select name="coupon_type_id" id="coupon_type_id" class="select-common" tabindex="-1">
                      <option value="0">请选择优惠劵</option>
                                          <option value="1">满88元减2元</option>
                                          <option value="2">满150元减5元</option>
                                          <option value="3">123</option>
                                      </select></div><div class="selectric"><span class="selectric-label">请选择优惠劵</span><button class="selectric-button">▾</button></div><div class="selectric-items" tabindex="-1"><div class="selectric-scroll"><ul><li data-index="0" class="selected" title="请选择优惠劵">请选择优惠劵</li><li data-index="1" class="" title="满88元减2元">满88元减2元</li><li data-index="2" class="" title="满150元减5元">满150元减5元</li><li data-index="3" class="last" title="123">123</li></ul></div></div><input class="selectric-input" tabindex="0"></div>
                    <p class="err-msg"></p>
                  </dd>
                </dl>
                <dl style="display: none;" class="rule_type3">
                  <dt>奖励红包：</dt>
                  <dd>
                    <input type="number" id="rule_hongbao" data-switch="rule_hongbao" class="input-common harf" placeholder="请填写红包数"><em class="unit">元</em>
                    <p class="err-msg"></p>
                  </dd>
                </dl>
                <dl style="display: none;" class="rule_type4">
                  <dt>奖励赠品：</dt>
                  <dd>
                    <div class="selectric-wrapper selectric-select-common" style="width: 250px;"><div class="selectric-hide-select"><select name="gift_id" id="gift_id" class="select-common" tabindex="-1">
                      <option value="0">请选择赠品</option>
                                          <option value="5">s</option>
                                          <option value="3">eqweqe</option>
                                          <option value="1">132</option>
                                      </select></div><div class="selectric"><span class="selectric-label">请选择赠品</span><button class="selectric-button">▾</button></div><div class="selectric-items" tabindex="-1"><div class="selectric-scroll"><ul><li data-index="0" class="selected" title="请选择赠品">请选择赠品</li><li data-index="1" class="" title="s">s</li><li data-index="2" class="" title="eqweqe">eqweqe</li><li data-index="3" class="last" title="132">132</li></ul></div></div><input class="selectric-input" tabindex="0"></div>
                    <p class="err-msg"></p>
                  </dd>
                </dl>
                <dl>
                  <dt>奖品数量：</dt>
                  <dd>
                    <input type="number" id="rule_num" class="input-common harf"><em class="unit">个</em>
                    <p class="err-msg"></p>
                  </dd>
                </dl>
                <dl>
                  <dt></dt>
                  <dd><button class="btn-common rule_a" data-type="add" style="line-height: 20px;">添加奖励</button></dd>
                </dl>
              </div>
            </div>
          </div>
          <!-- 奖励设置 end -->

          <!-- 底部按钮区域 start -->
          <div style="clear: both;"></div>
          <div class="bottom_button">
            <dl>
              <dt></dt>
              <dd style="line-height: 30px;">
                <button class="btn-common upper" style="display: none;">上一步</button>
                <button class="btn-common next">下一步</button>
                <button class="btn-common complete" style="display: none;">完成</button>
              </dd>
            </dl>
          </div>
          <!-- 底部按钮区域 start -->
        </div>
      </div>
      </div>
    </div>

  </section>
</template>
