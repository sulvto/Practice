<template>
  <section class="ns-base-section">

    <div class="ns-main">

  <div class="set-style">

  <p style="font-size:14px;color:#FFF;padding-top:5px;padding-bottom:5px;line-height:20px;height:20px;padding-left:10px;background-color:#28b779;">上次发放时间:1536128939  发放分红:5000.00</p>
  <input type="hidden" id="last_time" value="2018-09-05">
  <div style="height:200px;border:1px solid #EBEBEB;margin-bottom:10px;">
    <div style="float:left;width:50%;height:200px;text-align:center;">
      <h1 style="color:#939694;padding-top:15px;" id="total_amount">0</h1>
      <h5 style="color:#939694;">当前奖金池总额</h5>
      <div class="date-style">
      <input class="input-common" style="width: 35%;" type="text" value="2018-09-05" id="start_time" placeholder="请选择开始时间" onclick="WdatePicker()">&nbsp;&nbsp;-&nbsp;&nbsp;<input placeholder="请选择结束时间" onclick="WdatePicker()" style="width:35%;" type="text" value="2018-09-09" id="end_time" class="input-common">
      </div>
      <div style="margin:10px  auto;width:80%;margin-top:10px;line-height:30px;text-align:center;border:1px solid #00C0FF;" onclick="settlementAmount();">
      <span style="color:#00C0FF;font-size:12px;">结算统计</span>
      </div>
    </div>
    <div style="float:right;width:50%;height:200px;text-align:center;">
      <h1 style="color:#FF8B12;padding-top:15px;" id="put_money">100</h1>
      <h5 style="color:#939694;">发放金额</h5>
      <div class="date-style">
      <input type="text" value="" id="global_money" style="width: 78%;" onkeyup="showThisValue(this);" class="input-common">
      </div>
      <div style="margin:10px  auto;width:80%;margin-top:10px;line-height:30px;text-align:center;background:#00C0FF;border:1px solid #00C0FF;" onclick="globalBonusPoolPut();">
      <span style="color:#fff;font-size:12px;">发放分红</span>
      </div>
    </div>
  </div>
  <table class="table-class">
    <thead>
      <tr>
        <th>分红身份</th>
        <th>人数</th>
        <th>总分值</th>
      </tr>
    </thead>

    <tbody>
            <tr align="center">
        <td><span>初级股东:</span></td>
        <td><span>2</span></td>
        <td><span>1000</span></td>
      </tr>
            <tr align="center">
        <td><span>中级股东:</span></td>
        <td><span>1</span></td>
        <td><span>1000</span></td>
      </tr>

    </tbody>
  </table>
  </div>
  <input type="hidden" value="1" id="hidden_is_global_enable">
  <div id="dialog"></div>
    </div>

  </section>
</template>
