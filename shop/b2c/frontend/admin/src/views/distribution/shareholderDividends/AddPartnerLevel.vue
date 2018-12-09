<template>
  <section class="ns-base-section">
    <div class="ns-main">
      <div class="set-style">
        <dl>
          <dt>等级名称：</dt>
          <dd>
            <p>
              <input name id="level_name" class="input-common" type="text" value>
            </p>
            <p class="error">请输入股东等级名称</p>
          </dd>
        </dl>
        <dl>
          <dt>申请最低消费：</dt>
          <dd>
            <p>
              <input
                name
                id="level_money"
                class="input-common harf"
                type="text"
                value
                onkeyup="javascript:CheckInputIntFloat(this);"
              >
              <em class="unit" style="position: relative;top: -1px;">元</em>
            </p>
            <p class="error">请输入申请股东所需最低消费</p>
          </dd>
        </dl>
        <dl>
          <dt>股东分红佣金比率：</dt>
          <dd>
            <p>
              <input
                name
                id="commission_rate"
                type="text"
                value
                class="input-common harf"
                onkeyup="javascript:CheckInputIntFloat(this);"
              >
              <em class="unit" style="position: relative;top: -1px;">%</em>
            </p>
            <p class="error">请输入本店销售佣金比率</p>
          </dd>
        </dl>
        <dl>
          <dt>全球分红分值:</dt>
          <dd>
            <p>
              <input
                name
                id="global_value"
                type="text"
                value
                onkeyup="javascript:CheckInputIntFloat(this);"
              >&nbsp;%
            </p>
            <p class="error">请输入本店销售佣金比率</p>
          </dd>
        </dl>
        <dl>
          <dt>全球分红权重:</dt>
          <dd>
            <p>
              <input
                name
                id="global_weight"
                type="text"
                value
                onkeyup="javascript:CheckInputIntFloat(this);"
              >&nbsp;%
            </p>
            <p class="error">请输入给上级的佣金比率</p>
          </dd>
        </dl>
        <dl>
          <dt></dt>
          <dd>
            <button class="btn-common btn-big" onclick="addPartherLevel();">提交</button>
          </dd>
        </dl>
      </div>
    </div>
  </section>
</template>
