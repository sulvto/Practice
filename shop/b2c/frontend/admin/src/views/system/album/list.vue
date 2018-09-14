<template>

    <section class="ns-base-section">
    <el-row :gutter="8">
      <el-col :span="12">
        <el-button type="warning" size="small">创建相册</el-button>
        <el-button type="primary" size="small">上传图片</el-button>
      </el-col>

      <el-col :span="10">
        <el-input size="small" v-model="searchKeyword" placeholder="请输入相册名称"></el-input>
      </el-col>
      <el-col :span="2">
        <el-button type="primary" size="small" @click="search">查询</el-button>
      </el-col>
    </el-row>

    <br/>

      <el-row >
        <el-col :span="4" v-for="(image, index) in imageList" :key="image.name" :offset="index % 5 ? 1 : 0" style="margin-bottom: 10px">
          <el-card :body-style="{ padding: '0px' }" >
            <img src="@/assets/img/hamburger.png" class="image" @mouseover="showImageOperationButtomChange(index, true)" @mouseout="showImageOperationButtomChange(index, false)">
            <div style="padding: 12px;" @mouseover="showImageOperationButtomChange(index, true)" @mouseout="showImageOperationButtomChange(index, false)">
              <span>{{ image.name + ' ' + index }}</span>

              <div v-show="!_showImageOperationButtom(index)" >
                <p class="hint">{{ '共' + image.count + '张' }}</p>
              </div>
              <div v-show="_showImageOperationButtom(index)" style="margin: 5px 0 0;">
                  <el-button type="primary" size="mini" >编辑</el-button>
                  <el-button type="danger" size="mini" >删除</el-button>
              </div>
            </div>
          </el-card>
        </el-col>
      </el-row>

        <div class="ns-main">
            <table class="mytable">
                <tbody>
                    <tr>
                        <th style="text-align:left;">
                            <button class="btn-common-delete btn-small" data-toggle="modal" data-target="#addalbum">创建相册</button>
                            <button class="btn-common btn-small" id="open_uploader" style="position: relative;">上传图片<input type="file" id="fileupload" class="input-file" name="file_upload" multiple="multiple" style="left: 0;height: 30px !important;"></button>
                        </th>
                        <th>
                            <input type="text" id="search_text" placeholder="请输入相册名称" class="input-common">
                            <input type="button" onclick="searchData()" value="搜索" class="btn-common">
                        </th>
                    </tr>
                </tbody>
            </table>
            <ul id="albumList"><li style="border-width:0 1px 1px 1px;"><dl><dt><div class="covers"><a href="/system/albumpicturelist?album_id=40"><img src="/public/admin/images/album/album_cover_default.png"></a></div><h3><a href="/system/albumpicturelist?album_id=40&amp;&amp;album_name=111">111</a></h3></dt><dd class="date">共0张</dd><dd class="buttons"><span title="编辑相册"><a href="javascript:void(0);" onclick="editBoxShow(40);"><i class="fa fa-pencil fa-fw"></i>编辑</a></span><a href="javascript:void(0)" title="删除相册" onclick="deleteAlbumClass(40)"><i class="fa fa-remove"></i>删除</a></dd></dl></li><li style="border-width:0 1px 1px 0;"><dl><dt><div class="covers"><a href="/system/albumpicturelist?album_id=39"><img src="/upload/goods/20180816/1534394995.jpg"></a></div><h3><a href="/system/albumpicturelist?album_id=39&amp;&amp;album_name=我">我</a></h3></dt><dd class="date">共1张</dd><dd class="buttons"><span title="编辑相册"><a href="javascript:void(0);" onclick="editBoxShow(39);"><i class="fa fa-pencil fa-fw"></i>编辑</a></span><a href="javascript:void(0)" title="删除相册" onclick="deleteAlbumClass(39)"><i class="fa fa-remove"></i>删除</a></dd></dl></li><li style="border-width:0 1px 1px 0;"><dl><dt><div class="covers"><a href="/system/albumpicturelist?album_id=38"><img src="/public/admin/images/album/album_cover_default.png"></a></div><h3><a href="/system/albumpicturelist?album_id=38&amp;&amp;album_name=222">222</a></h3></dt><dd class="date">共0张</dd><dd class="buttons"><span title="编辑相册"><a href="javascript:void(0);" onclick="editBoxShow(38);"><i class="fa fa-pencil fa-fw"></i>编辑</a></span><a href="javascript:void(0)" title="删除相册" onclick="deleteAlbumClass(38)"><i class="fa fa-remove"></i>删除</a></dd></dl></li><li style="border-width:0 1px 1px 0;"><dl><dt><div class="covers"><a href="/system/albumpicturelist?album_id=37"><img src="/public/admin/images/album/album_cover_default.png"></a></div><h3><a href="/system/albumpicturelist?album_id=37&amp;&amp;album_name=11">11</a></h3></dt><dd class="date">共1张</dd><dd class="buttons"><span title="编辑相册"><a href="javascript:void(0);" onclick="editBoxShow(37);"><i class="fa fa-pencil fa-fw"></i>编辑</a></span><a href="javascript:void(0)" title="删除相册" onclick="deleteAlbumClass(37)"><i class="fa fa-remove"></i>删除</a></dd></dl></li><li style="border-width:0 1px 1px 0;"><dl><dt><div class="covers"><a href="/system/albumpicturelist?album_id=36"><img src="/public/admin/images/album/album_cover_default.png"></a></div><h3><a href="/system/albumpicturelist?album_id=36&amp;&amp;album_name=afafa">afafa</a></h3></dt><dd class="date">共0张</dd><dd class="buttons"><span title="编辑相册"><a href="javascript:void(0);" onclick="editBoxShow(36);"><i class="fa fa-pencil fa-fw"></i>编辑</a></span><a href="javascript:void(0)" title="删除相册" onclick="deleteAlbumClass(36)"><i class="fa fa-remove"></i>删除</a></dd></dl></li><li style="border-width:0 1px 1px 1px;"><dl><dt><div class="covers"><a href="/system/albumpicturelist?album_id=35"><img src="/public/admin/images/album/album_cover_default.png"></a></div><h3><a href="/system/albumpicturelist?album_id=35&amp;&amp;album_name=name">name</a></h3></dt><dd class="date">共2张</dd><dd class="buttons"><span title="编辑相册"><a href="javascript:void(0);" onclick="editBoxShow(35);"><i class="fa fa-pencil fa-fw"></i>编辑</a></span><a href="javascript:void(0)" title="删除相册" onclick="deleteAlbumClass(35)"><i class="fa fa-remove"></i>删除</a></dd></dl></li><li style="border-width:0 1px 1px 0;"><dl><dt><div class="covers"><a href="/system/albumpicturelist?album_id=34"><img src="/upload/goods/20180701/418a42dccfbe0287c4510b3abac75aa4.jpg"></a></div><h3><a href="/system/albumpicturelist?album_id=34&amp;&amp;album_name=logo">logo</a></h3></dt><dd class="date">共17张</dd><dd class="buttons"><span title="编辑相册"><a href="javascript:void(0);" onclick="editBoxShow(34);"><i class="fa fa-pencil fa-fw"></i>编辑</a></span><a href="javascript:void(0)" title="删除相册" onclick="deleteAlbumClass(34)"><i class="fa fa-remove"></i>删除</a></dd></dl></li><li style="border-width:0 1px 1px 0;"><dl><dt><div class="covers"><a href="/system/albumpicturelist?album_id=30"><img src="/upload/goods/20180731/8f993af222e74df10933a62b191f9fe1.jpg"></a></div><h3><a href="/system/albumpicturelist?album_id=30&amp;&amp;album_name=默认相册">默认相册</a></h3></dt><dd class="date">共288张</dd><dd class="buttons"><span title="编辑相册"><a href="javascript:void(0);" onclick="editBoxShow(30);"><i class="fa fa-pencil fa-fw"></i>编辑</a></span></dd></dl></li></ul>

            <!-- 相册创建  -->
            <div class="modal fade hide" id="addalbum" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
                <div class="modal-dialog">
                    <div class="modal-content">
                        <div class="modal-header">
                            <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
                            <h3>相册创建</h3>
                        </div>
                        <div class="modal-body">
                            <div class="dislog-style">
                                <div class="set-style">
                                    <dl>
                                        <dt>相册名称：</dt>
                                        <dd>
                                            <input type="text" class="input-common" id="album_name">
                                            <p class="error">请输入相册名称</p>
                                        </dd>
                                    </dl>
                                    <dl>
                                        <dt>排序：</dt>
                                        <dd>
                                            <input type="number" class="input-common harf" id="sort" onkeyup="this.value=this.value.replace(/\D/gi,&quot;&quot;)">
                                        </dd>
                                    </dl>
                                </div>
                            </div>
                        </div>
                        <div class="modal-footer">
                            <button type="button" class="btn-common btn-big" onclick="addAlbumClass();">保存</button>
                            <button type="button" class="btn btn-big" data-dismiss="modal">关闭</button>
                        </div>
                    </div>
                </div>
            </div>

            <!-- 相册编辑  -->
            <div class="modal fade hide" id="editalbum" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
                <div class="modal-dialog">
                    <div class="modal-content">
                        <div class="modal-header">
                            <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
                            <h3>相册编辑</h3>
                        </div>
                        <div class="modal-body">
                            <div class="dislog-style">
                                <input type="hidden" id="editAlbum_id" class="input-common">
                                <ul>
                                    <li>
                                        <span>相册名称：</span>
                                        <input type="text" class="input-common" id="edit_album_name">
                                        <span style="width: inherit;color: red;display:none;">请输入相册名称</span>
                                    </li>
                                    <li>
                                        <span>排序：</span>
                                        <input type="text" class="input-common" id="edit_sort" onkeyup="this.value=this.value.replace(/\D/gi,&quot;&quot;)">
                                    </li>
                                </ul>
                            </div>
                        </div>
                        <div class="modal-footer">
                            <button type="button" class="btn-common btn-big" onclick="updateAlbumClass();">保存</button>
                            <button type="button" class="btn btn-big" data-dismiss="modal">关闭</button>
                        </div>
                    </div>
                </div>
            </div>
        </div>

    </section>

</template>

<script>
export default {
  name: 'list',
  data () {
    return {
      showImageOperationButtom: {},
      searchKeyword: '',
      imageList: [{
        name: '默认相册',
        count: 101,
        sort: 1
      }, {
        name: '颜色',
        count: 12,
        sort: 1
      }, {
        name: 'awsdqefqa',
        count: 2,
        sort: 1
      }, {
        name: 'asdqww',
        count: 345,
        sort: 1
      }, {
        name: 'asfqw',
        count: 45,
        sort: 1
      }, {
        name: 'adwqwfe',
        count: 56,
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
    },
    search () {
      console.log('search', this.searchKeyword)
    },
    showImageOperationButtomChange (index, bool) {
      console.log('showImageOperationButtomChange', bool)
      this.showImageOperationButtom[index] = bool
      console.log(this.showImageOperationButtom)
    },
    _showImageOperationButtom (index) {
      return this.showImageOperationButtom[index]
    }

  },
  created () {
    // this.imageList.forEach(imageListItem => this.showImageOperationButtom[index] = false)
    console.log(this.showImageOperationButtom)
  }
}
</script>

<style lang="scss" scoped>
.hint {
  font-size: 14px;
  line-height: 18px;
  color: #999999;
  margin: 10px 0 0;
}
</style>
