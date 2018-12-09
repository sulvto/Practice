<template>

  <section class="ns-base-section">

    <el-row :gutter="20">
      <el-col :span="6">
        <el-button type="primary" size="medium" @click="location.href='/extend/addhooks.html';">添加钩子</el-button>
      </el-col>
    </el-row>

    <br>

    <el-table
      :data="tableData"
      border
      style="width: 100%">
      <el-table-column
        fixed
        prop="name"
        label="名称"
        width="150" />
      <el-table-column
        prop="id"
        label="标识"
        width="120" />
      <el-table-column
        prop="stattus"
        label="状态"
        width="120" />
      <el-table-column
        prop="author"
        label="作者"
        width="120" />
      <el-table-column
        prop="version"
        label="版本"
        width="120" />
      <el-table-column
        prop="description"
        label="描述"
        width="300" />
      <el-table-column
        fixed="right"
        label="操作">
        <template slot-scope="scope">
          <el-button type="text" size="small" @click="handleClick(scope.row)" >设置</el-button>
          <el-button type="text" size="small">详情</el-button>
          <el-button type="text" size="small">禁用</el-button>
          <el-button type="text" size="small">卸载</el-button>
        </template>
      </el-table-column>
    </el-table>

    <div class="ns-main">

      <!-- 模态框（Modal） -->
      <div v-show="false" class="modal fade hide" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true" style="width:700px;left:45%;top:30%;">
        <div class="modal-dialog">
          <div class="modal-content">
            <div class="modal-header">
              <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
              <h3>插件详情</h3>
            </div>
            <div class="set-style">
              <dl>
                <dt>详情：</dt>
                <dd>
                  <div id="content" style="min-width:400px;min-height:100px;">
                    &emsp;
                  </div>
                </dd>
              </dl>
            </div>
          </div>
        </div>
      </div>

    </div>

  </section>
</template>

<script>
export default {
  name: 'OnlineUpdate',
  data () {
    return {
      tableData: [
        {
          name: '微信模板消息',
          id: 'wxtemplatemsg',
          status: '启用',
          author: 'niushop',
          version: '1.0',
          description: '微信模板消息'
        }
      ]
    }
  }
}
</script>
