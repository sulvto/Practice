<template>

  <section class="ns-base-section">

    <div style="position:relative;margin:0;">
      <!-- 面包屑导航 -->
            <div class="breadcrumb-nav">
        <a href="index.html">大鵬系統</a>
                  <i class="fa fa-angle-right"></i>
          <a href="/config/usernotice.html">网站</a>
                  <i class="fa fa-angle-right"></i>
          <!-- 需要加跳转链接用这个：http://showfx.niuteam.cn/admin/cms/topiclist -->
          <a href="javascript:;" style="color:#999;">专题列表</a>
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
                  <p>相关教程：<a href="http://bbs.niushop.com.cn/forum.php?mod=viewthread&amp;tid=2379&amp;extra=page%3D1" target="_blank">http://bbs.niushop.com.cn/forum.php?mod=viewthread&amp;tid=2379&amp;extra=page%3D1</a></p>
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

  <div class="options-btn">
  <button class="btn-common-delete" onclick="batchDelete()">批量删除</button>
  <button class="btn-common" onclick="location.href='/cms/addtopic.html';">添加专题</button>
  </div>
  <table class="table-class">
    <colgroup>
      <col style="width: 2%">
      <col style="width: 5%;">
      <col style="width: 61%;">
      <col style="width: 7%;">
      <col style="width: 15%;">
      <col style="width: 15%">
    </colgroup>
  <thead>
    <tr align="center">
      <th><i class="checkbox-common"><input id="ckall" type="checkbox" onclick="CheckAll(this)"></i></th>
      <th>排序</th>
      <th align="left">标题</th>
      <th>状态</th>
      <th>发布时间</th>
      <th>操作</th>
    </tr>
  </thead>
  <tbody><tr align="center"><td><i class="checkbox-common"><input name="sub" type="checkbox" value="1"></i></td><td align="left" class="tal" title="BEATI BLUE">BEATI BLUE</td><td>已发布</td><td>2018-08-10 14:08:56</td><td><a target="_blank" href="/topic/detail?topic_id=1">预览</a><a href="/cms/updatetopic?id=1">修改</a><a style="cursor: pointer;" onclick="deleteTopic(1)">删除</a></td> </tr><tr align="center"><td><i class="checkbox-common"><input name="sub" type="checkbox" value="2"></i></td><td align="left" class="tal" title="又一专题">又一专题</td><td>未发布</td><td>2018-08-20 14:00:48</td><td><a target="_blank" href="/topic/detail?topic_id=2">预览</a><a href="/cms/updatetopic?id=2">修改</a><a style="cursor: pointer;" onclick="deleteTopic(2)">删除</a></td> </tr></tbody>
  </table>
    </div>

  </section>
</template>
