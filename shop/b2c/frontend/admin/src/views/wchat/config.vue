<template>
  <section class="ns-base-section">

    <div style="position:relative;margin:0;">
      <!-- 面包屑导航 -->
            <div class="breadcrumb-nav">
        <a href="index.html">大鵬系統</a>
                  <i class="fa fa-angle-right"></i>
          <a href="/wchat/config.html">微信</a>
                  <i class="fa fa-angle-right"></i>
          <!-- 需要加跳转链接用这个：http://showfx.niuteam.cn/admin/wchat/config -->
          <a href="javascript:;" style="color:#999;">公众号管理</a>
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
                  <p>相关教程：<a href="http://bbs.niushop.com.cn/forum.php?mod=viewthread&amp;tid=2326&amp;extra=page%3D2" target="_blank">http://bbs.niushop.com.cn/forum.php?mod=viewthread&amp;tid=2326&amp;extra=page%3D2</a></p>
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

    <div class="set-style">
    <h4>微信公众号设置<span class="muted">（选填，用于配置自定义菜单）</span></h4>

    <dl>
    <dt>APPID：</dt>
    <dd>
      <input class="span2 input-common" id="appid" placeholder="AppID" value="1224324" type="text" style="width:220px;">
      <span class="help-inline" id="appiderror" style="color:red;"></span>
    </dd>
    </dl>
    <dl>
    <dt>APP密钥：</dt>
    <dd>
      <input class="span2 input-common" id="appsecret" type="text" placeholder="Appsecret" value="2341324324" style="width:220px;">
      <span class="help-inline" id="appsecreterror" style="color:red;"></span>
      <p class="hint">
        <span>AppID以及Appsecret来自于您申请开发接口时提供的账号和密码，且公众号为已认证服务号</span>
      </p>
    </dd>
    </dl>

    <h4>服务器配置<span class="muted">（用于接收用户消息）</span></h4>
    <dl>
    <dt>URL：</dt>
    <dd>
      <input type="text" class="input-commmon" style="background-color: white; box-shadow: none; border: none;border-radius:0;min-width: 450px;display: inline-block;" readonly="readonly" id="empowerUrl" value="http://showfx.niuteam.cn/wap/wchat/relateWeixin.html">
      <button onclick="JScopy('empowerUrl')" type="button" class="btn-common-white btn-big">复制</button>
    </dd>
    </dl>

    <dl>
    <dt>Token：</dt>
    <dd>
      <input type="text" class="input-common" style="background-color: white; min-width: 458px;display: inline-block;" id="empowerToken" value="TOKEN12312312312312312" maxlength="32" onkeyup="value=value.replace(/[^\w\.\/]/ig,'')" onpaste="return false">
      <button onclick="JScopy('empowerToken')" type="button" class="btn-common-white btn-big">复制</button><span class="help-inline" id="tokenerror" style="color:red;"></span>
      <p class="muted" style="margin-top: 5px;">Token必须为英文或数字，长度为3-32字符。如不填写则默认为“TOKEN”。</p>
    </dd>
    </dl>

    <h4>配置说明</h4>
    <dl>
    <dt></dt>
    <dd>
      <p>请将以上URL及Token填到微信公众平台中，以完成绑定。</p>
    </dd>
    </dl>

    <dl>
    <dt></dt>
    <dd>
      <p><span class="text">设置业务域名</span><span class="muted">（设置业务域名，用户在相应域名上进行输入时不再出现防欺诈盗号等安全提示）</span></p>
      <p><a href="https://mp.weixin.qq.com/" target="_blank">登录微信公众平台</a>点击公众号设置&gt;功能设置&gt;业务域名设置，一次填写：</p>
      <p class="text-success">
        <span class="muted">域名1：</span>
        showfx.niuteam.cn
      </p>
      <p class="titlestep mt30">
        <a href="https://mp.weixin.qq.com/" target="_blank">登录微信公众平台</a>点击公众号设置&gt;开发者中心&gt;网页授权获取用户基本信息&gt;修改：
      </p>
      <p class="text-success">
        <span class="muted">填写授权回调页面域名：</span>
        showfx.niuteam.cn
      </p>
      <p>业务域名设置完毕！</p>
    </dd>
    </dl>
    <dl>
    <dt></dt>
    <dd>
      <button class="btn-common btn-big" onclick="save();">保存</button>
      <input type="hidden" id="IsChange" value="true">
    </dd>
    </dl>
    </div>

    </div>

  </section>
</template>
