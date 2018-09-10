
<!-- 广告添加  -->
<!-- <div class="modal fade hide" id="add_adv" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true"> -->
<!-- <div class="modal-dialog"> -->
<!-- <div class="modal-content"> -->
<!-- <div class="modal-header"> -->
<!-- <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button> -->
<!-- <h3 class="modal-title" id="myModalLabel">广告添加</h3> -->
<!-- </div> -->
<!-- <div class="modal-body"> -->
<!-- <div class="set-style"> -->
<!-- <dl> -->
<!-- <dt>主标题：</dt> -->
<!-- <dd> -->
<!-- <p> <input id="title" type="text" value="" class="input-common"> </p> -->
<!-- <p class="error">请输入标题</p> -->
<!-- </dd> -->
<!-- </dl> -->
<!-- <dl> -->
<!-- <dt>副标题：</dt> -->
<!-- <dd> -->
<!-- <p> <input id="subtitle" type="text" value="" class="input-common"> </p> -->
<!-- <p class="error">请输入副标题</p> -->
<!-- </dd> -->
<!-- </dl> -->
<!-- <dl> -->
<!-- <dt>图片：</dt> -->
<!-- <dd> -->
<!-- <div class="upload-btn-common"> -->
<!--   <div> -->
<!--     <input class="input-file" name="file_upload" id="uploadAdv" type="file" onchange="imgUpload(this);" title="上传"> -->
<!--     <input type="hidden" id="adv" value=""> -->
<!--   </div> -->
<!-- -->
<!--   <input type="text" id="text_adv" class="input-common" readonly="readonly" value=""> -->
<!--   <em>上传</em> -->
<!--   <img id="preview_adv" src="/public/static/blue/img/upload-common-select.png" data-src="" data-html="true" data-container="body" data-placement="top" data-trigger="manual" data-original-title="" title=""> -->
<!-- </div> -->
<!-- </dd> -->
<!-- </dl> -->
<!-- <dl> -->
<!-- <dt>背景色：</dt> -->
<!-- <dd> -->
<!-- <input id="background" type="color" value="#000000" class="input-common-color"> -->
<!-- </dd> -->
<!-- </dl> -->
<!-- <dl> -->
<!-- <dt>链接地址：</dt> -->
<!-- <dd> -->
<!-- <p> <input id="url" type="text" value="" class="input-common"> </p> -->
<!-- <p class="error">请输入链接地址</p> -->
<!-- </dd> -->
<!-- </dl> -->
<!-- </div> -->
<!-- <input type="hidden" id="id" value=""> -->
<!-- </div> -->
<!-- <div class="modal-footer"> -->
<!--    <button type="button" class="btn-common btn-big" onclick="addGoodsAdv();">保存</button> -->
<!--    <button type="button" class="btn btn-big" data-dismiss="modal">关闭</button> -->
<!-- </div> -->
<!-- </div> -->
<!-- </div> -->
<!-- </div> -->
<template>
    <div>

        <el-table border :data="tableData" style="width: 100%">

            <el-table-column
                prop="name"
                label="分类名称">
                </el-table-column>
            <el-table-column
                prop="alias"
                label="别名">
                </el-table-column>
            <el-table-column
                prop="abbr"
                label="简称"
                width="120">
            </el-table-column>

            <el-table-column
                prop="sortBy"
                label="商品排序"
                width="120">
            </el-table-column>

            <el-table-column
                label="颜色"
                width="80">
              <template slot-scope="scope">
                <el-color-picker v-model="scope.row.color"></el-color-picker>
              </template>
            </el-table-column>

            <el-table-column
                label="是否显示"
                width="80">
                <template slot-scope="scope">
                    <el-switch v-model="scope.row.isShow">
                    </el-switch>
                </template>
                </el-table-column>
            <el-table-column
                label="品牌显示"
                width="80">
              <template slot-scope="scope">
                <el-switch v-model="scope.row.showBrand">
                </el-switch>
              </template>
            </el-table-column>

            <el-table-column
                label="下级分类显示"
                width="110">
                <template slot-scope="scope">
                  <el-switch v-model="scope.row.show">
                  </el-switch>
                </template>
            </el-table-column>

            <el-table-column
                prop="sort"
                label="排序"
                width="80">
                </el-table-column>

            <el-table-column label="广告图" fixed="right"
                width="120">
                <template slot-scope="scope">
                    <!-- <a href="/config/loginconfig.html?type=qq">配置</a> -->
                    <el-button size="mini" @click="handleEdit(scope.$index, scope.row)">编辑广告
</el-button>
                    <br/>
                    <el-button size="mini" @click="handleEdit(scope.$index, scope.row)">删除广告</el-button>
                    <br/>
                    <el-button size="mini" @click="handleEdit(scope.$index, scope.row)">添加广告</el-button>
                </template>
            </el-table-column>
        </el-table>
  </div>
</template>

<script>

// <select class="floor_goods_sort_type select-common harf" onchange="setGoodsCategoryField(this, 3);"><option value="0">默认排序</option><option value="1" selected="">按发布时间排序</option><option value="2">按销量排序</option><option value="3">按排序号排序</option><option value="4">按人气排序</option></select>

export default {
  name: 'goodsCategoryBlock',
  data () {
    return {
      tableData: [{
        id: '1',
        name: '家用电器',
        alias: '家用电器',
        abbr: '家用电器',
        sortBy: '使用该功能需申请微信开放平台网站应用',
        color: '#9e529e',
        show: true,
        showBrand: false,
        sort: 1
      }, {
        id: '1',
        name: '手机/运营商/数码',
        alias: '手机/运营商/数码',
        abbr: '',
        sortBy: '使用该功能需申请微信开放平台网站应用',
        color: '#9e529e',
        show: true,
        showBrand: false,
        sort: 1
      }, {
        id: '1',
        name: '电脑/办公',
        alias: '电脑/办公',
        abbr: '',
        sortBy: '使用该功能需申请微信开放平台网站应用',
        color: '#9e529e',
        show: true,
        showBrand: false,
        sort: 1
      }, {
        id: '1',
        name: '家居/家具/家装/厨具',
        alias: '家居/家具/家装/厨具',
        abbr: '',
        sortBy: '使用该功能需申请微信开放平台网站应用',
        color: '#9e529e',
        show: true,
        showBrand: false,
        sort: 1
      }, {
        id: '1',
        name: '男装/女装/童装/内衣',
        alias: '男装/女装/童装/内衣',
        abbr: '',
        sortBy: '使用该功能需申请微信开放平台网站应用',
        color: '#9e529e',
        show: true,
        showBrand: false,
        sort: 1
      }, {
        id: '1',
        name: '美妆个护/宠物',
        alias: '美妆个护/宠物',
        abbr: '',
        sortBy: '使用该功能需申请微信开放平台网站应用',
        color: '#9e529e',
        show: true,
        showBrand: false,
        sort: 1
      }, {
        id: '1',
        name: '女鞋/箱包/钟表/珠宝',
        alias: '女鞋/箱包/钟表/珠宝',
        abbr: '',
        sortBy: '使用该功能需申请微信开放平台网站应用',
        color: '#9e529e',
        show: true,
        showBrand: false,
        sort: 1
      }, {
        id: '1',
        name: '男鞋/运动/户外',
        alias: '男鞋/运动/户外',
        abbr: '',
        sortBy: '使用该功能需申请微信开放平台网站应用',
        color: '#9e529e',
        show: true,
        showBrand: false,
        sort: 1
      }, {
        id: '1',
        name: '汽车/汽车用品',
        alias: '汽车/汽车用品',
        abbr: '',
        sortBy: '使用该功能需申请微信开放平台网站应用',
        color: '#9e529e',
        show: true,
        showBrand: false,
        sort: 1
      }, {
        id: '1',
        name: '母婴/玩具用品',
        alias: '母婴/玩具用品',
        abbr: '',
        sortBy: '使用该功能需申请微信开放平台网站应用',
        color: '#9e529e',
        show: true,
        showBrand: false,
        sort: 1
      }, {
        id: '1',
        name: '食品/酒类/生鲜/特产',
        alias: '食品/酒类/生鲜/特产',
        abbr: '',
        sortBy: '使用该功能需申请微信开放平台网站应用',
        color: '#9e529e',
        show: true,
        showBrand: false,
        sort: 1
      }, {
        id: '1',
        name: '礼品鲜花/农资绿植',
        alias: '礼品鲜花/农资绿植',
        abbr: '礼品鲜花',
        sortBy: '使用该功能需申请微信开放平台网站应用',
        color: '#9e529e',
        show: true,
        showBrand: false,
        sort: 1
      }]
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
.table-logo {
    width: 75px;
    float: left;
}

.table-pay {
    display: inline-block;
    width: 120px;
    overflow: hidden;
    margin-top: 7px;
}

.table-desc {
    display: inline-block;
}
</style>
