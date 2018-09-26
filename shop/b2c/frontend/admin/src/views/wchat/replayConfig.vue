<template>
  <div>
    <el-tabs v-model="activeTabName">
      <el-tab-pane label="关注时回复" name="1">
        <!-- 关注时回复 -->
        <div id="type1">
            <p class="step_0" style="display:block;">您还未设置回复内容，
                <a href="javascript:;" onclick="showMaterial()">我要马上设置</a>
                。
            </p>

            <div class="step_1" style="display:none;">
            <!-- 样式模板 -->
                        <div class="media-button">
                    <a class="" href="javascript:;" onclick="showMaterial()">修改</a>
                    <a class="" href="javascript:;" onclick="delReply()">删除</a>
                </div>
            </div>
        </div>
      </el-tab-pane>
      <el-tab-pane label="关键字回复" name="2">
        <el-row :gutter="8">
          <el-col :span="12">
            <el-button type="primary" size="small" @click="$router.push('editKeywordReplay.html')">添加关键词回复</el-button>
          </el-col>

          <el-col :span="10">
          </el-col>
          <el-col :span="2">
          </el-col>
        </el-row>

        <br/>

        <el-table border :data="tableData" style="width: 100%">
          <el-table-column
            type="selection"
            width="35">
          </el-table-column>

          <el-table-column
            prop="keyword"
            label="关键字">
          </el-table-column>

          <el-table-column
            prop="type"
            label="匹配类型"
            width="120">
          </el-table-column>

          <el-table-column label="操作" fixed="right"
              width="180">
              <template slot-scope="scope">
                  <el-button size="mini" @click="handleEdit(scope.$index, scope.row)">修改</el-button>
                  <el-button size="mini" @click="handleDelete(scope.$index, scope.row)">删除</el-button>
              </template>
          </el-table-column>
        </el-table>
      </el-tab-pane>
      <el-tab-pane label="默认回复" name="3">
        <div id="type3">
          <p class="step_0" style="display:none;">您还未设置回复内容，
            <a href="javascript:;" onclick="showMaterial()">我要马上设置。</a>
          </p>

          <el-card class="box-card">
            <div style="padding: 14px;">
              <p>的士速递所</p>
              <div class="bottom clearfix">
                <el-button type="text" class="button">修改</el-button>
                <el-button type="text" class="button">删除</el-button>
              </div>
            </div>
          </el-card>
        </div>
      </el-tab-pane>
    </el-tabs>

    <div class="dialog_wrp media align_edge ui-draggable" style="display:none;width: 960px; margin-left: -480px; margin-top: -313.5px;" id="dialog_media">
              <div class="dialog">
                  <div class="dialog_hd">
                      <h3>选择素材</h3>
                      <a href="javascript:;" onclick="closeMaterial()" class="icon16_opr closed pop_closed">关闭</a>
                  </div>
                  <div class="dialog_bd">
                      <div class="dialog_media_container appmsg_media_dialog">
                          <div class="sub_title_bar in_dialog">
                              <div class="search_bar js-btn-media">
                                  <button class="btn-common-white btn-big btn_primary" value="1" href="javascript:;" onclick="checkBtn(this)"> 文本 </button>
                                  <button class="btn-common-white btn-big" value="2" href="javascript:;" onclick="checkBtn(this)"> 单图文 </button>
                                  <button class="btn-common-white btn-big" href="javascript:;" value="3" onclick="checkBtn(this)"> 多图文 </button>
                              </div>
                              <div class="appmsg_create tr" id="add_message_btn">
                                  <a target="_blank" href="/wchat/addmedia.html?type=1"><button class="btn-common"><i class="icon14_common add_white"></i><span>新建文本消息</span></button></a>
                              </div>
                          </div>
                          <div class="dialog_media_inner" style="overflow:auto;">
                              <div class="table_wrp user_list">
                                  <table class="table" cellspacing="0">
                                      <tbody class="tbody" id="materia_data"><tr><td class="table_cell"><ul class="mater"><li><span class="btn_primary">文本 1 </span><a href="#">sdfsaf</a></li></ul></td><td>2018-08-06 02:44:12</td><td class="table_cell user_opr tr"><a class="btn remark js_msgSenderRemark" onclick="selectedMaterial(3)">选取</a></td></tr></tbody>
                                  </table>
                              </div>
                          </div>
                      </div>
                  </div>
              </div>
          </div>

  </div>
</template>

<script>
export default {
  name: 'replayConfig',
  data () {
    return {
      activeTabName: '1',
      tableData: [
        {
          keyword: '发的不发达',
          type: '模糊匹配'
        }
      ]
    }
  },
  methods: {
    handleEdit (index, row) {
      console.log(index, row)
    },
    handleDelete (index, row) {
      console.log(index, row)
    }
  }
}
</script>
<style lang="scss" scoped>
.box-card {
  width: 200px;
}
</style>
