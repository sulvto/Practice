<template>

  <section class="ns-base-section">

    <div style="position:relative;margin:0;">
      <!-- 面包屑导航 -->
            <div class="breadcrumb-nav">
        <a href="index.html">大鵬系統</a>
                  <i class="fa fa-angle-right"></i>
          <a href="/wchat/config.html">微信</a>
                  <i class="fa fa-angle-right"></i>
          <!-- 需要加跳转链接用这个：http://showfx.niuteam.cn/admin/wchat/materialmessage -->
          <a href="javascript:;" style="color:#999;">消息素材管理</a>
              </div>
            <!-- 三级导航菜单 -->

                <nav class="ns-third-menu">
          <ul>
                        <li class="selected" onclick="location.href='/wchat/materialMessage.html?type=1';">文本</li>
                          <li onclick="location.href='/wchat/materialMessage.html?type=2';">单图文</li>
                          <li onclick="location.href='/wchat/materialMessage.html?type=3';">多图文</li>
                      </ul>
        </nav>

      <div class="right-side-operation">
        <ul>
          <li>
            <a class="js-open-warmp-prompt" href="javascript:;" data-menu-desc=""><i class="fa fa-question-circle"></i>&nbsp;提示</a>
            <div class="popover">
              <div class="arrow"></div>
              <div class="popover-content">
                <div>
                                    <h4>操作提示</h4>
                  <p>相关教程：<a href="http://bbs.niushop.com.cn/forum.php?mod=viewthread&amp;tid=2330&amp;extra=page%3D2" target="_blank">http://bbs.niushop.com.cn/forum.php?mod=viewthread&amp;tid=2330&amp;extra=page%3D2</a></p>
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

  <table class="mytable">
  <tbody><tr>
  <th width="20%" style="text-align: left;">
        <button class="btn-common btn-small" style="margin:0 5px 0 0 !important;" onclick="location.href='/wchat/addmedia.html?type=1';">添加文本消息</button>
      </th>
  <th width="10%">
    <input type="text" id="search_text" placeholder="请输入消息名称" class="input-common">
    <button onclick="searchData()" value="搜索" class="btn-common">搜索</button>
  </th>
  </tr>
  </tbody></table>
  <table class="table-class">
  <colgroup>
    <col style="width: 74%;">
    <col style="width: 16%;">
    <col style="width: 10%;">
  </colgroup>
  <thead>
    <tr align="center">
      <th style="text-align:left;">标题</th>
      <th>创建时间</th>
      <th>操作</th>
    </tr>
  </thead>
  <tbody><tr align="center"><td style="text-align:left;"><ul class="mater"><li><span class="type_name">文本  </span><a href="#">sdfsaf</a></li></ul></td><td>2018-08-06 02:44:12</td><td><a href="/wchat/updatemedia?media_id=3">修改</a>&nbsp;&nbsp; <a href="javascript:void(0);" onclick="deleteWeixinMedia(3)">删除</a></td></tr></tbody>
  </table>

    </div>

  </section>
</template>

<script>
export default {
  name: 'materialMessage',
  data () {
    return {}
  },
  methods: {}
}
</script>
