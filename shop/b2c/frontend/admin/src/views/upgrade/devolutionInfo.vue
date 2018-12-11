<template>

  <div>

    <el-card class="box-card">
      <div slot="header" class="clearfix">
        <span>授权信息</span>
      </div>
      <div class="text item">
        授&nbsp;&nbsp;权&nbsp;码：
        <el-button size="mini" type="primary" round>重新绑定</el-button>
      </div>

      <div class="text item">站点URL：
      </div>

      <div class="text item">授权时间：
      </div>

      <div class="text item">
        当前版本：
        <el-button size="mini" type="warning" round>旗舰版2.6</el-button>
      </div>

      <div class="text item">
        最新版本：
        <el-button size="mini" type="info" round>V2.2</el-button>
      </div>

      <div class="text item">
        授权状态：
        <el-button size="mini" type="danger" round>未授权</el-button>
      </div>
    </el-card>
    <!-- <div class="ns-main">

      <div class="modal fade hide" id="bind_user" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true" style="width:400px;left:56%" v-show="false">

        <div class="modal-dialog">
          <div class="modal-content">
            <div class="modal-header">
              <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
              <h3>云平台绑定</h3>
            </div>
            <div class="modal-body">
              <div class="modal-infp-style" style="height:165px;width:320px;margin:auto;">
                <table class="modal-tab" style="width: 100%;">
                  <tbody>
                    <tr>
                      <td colspan="2" style="text-align:left">输入Niushop官方授权码完成绑定
                        <a style="float:right;color:#00C0FF;" href="http://www.niushop.com.cn/authorization.html" target="_blank">授权</a>
                      </td>
                    </tr>
                    <tr>
                      <td>授权码：</td>
                      <td>
                        <input id="authorization_code" type="text" class="input-common">
                      </td>
                    </tr>
                  </tbody>
                </table>
              </div>
            </div>

            <div class="modal-footer">
              <input type="hidden" id="modify_username_hidden">
              <button class="btn-common" onclick="binding()" id="butSubmit">绑定</button>
            </div>
          </div>
        </div>
      </div>
    </div> -->

  </div>
</template>
