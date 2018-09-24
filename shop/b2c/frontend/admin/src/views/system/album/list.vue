<template>

  <div>
    <el-row :gutter="8">
      <el-col :span="12">
        <el-button type="warning" size="small" @click="createAlbum">创建相册</el-button>
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
      <el-col :span="3" v-for="(albumListItem, index) in albumList" :key="albumListItem.name" :offset="index % 6 ? 1 : 0" style="margin-bottom: 20px">
        <el-card :body-style="{ padding: '0px', width: '160px' }" style="width: 160px;">
          <div class="covers">
            <img v-if="albumListItem.cover" src="@/assets/img/hamburger.png" class="image" @click="toAlbum(albumListItem)">
            <img v-else src="@/assets/img/album_cover_default.png" class="image" @click="toAlbum(albumListItem)">
          </div>
          <div style="padding: 12px;font-height:14px" >
            <span style="line-height: 20px;" @click="toAlbum(albumListItem)">{{ albumListItem.name }}</span>
            <span class="hint">{{ '共' + albumListItem.count + '张' }}</span>
            <div style="margin-top: 5px">
              <el-button type="primary" size="mini" :disabled="albumListItem.isDefault" @click="editAlbum(albumListItem)">编辑</el-button>
              <el-button type="danger" size="mini" :disabled="albumListItem.isDefault">删除</el-button>
            </div>
          </div>
        </el-card>
      </el-col>
    </el-row>

    <el-pagination
      class="center-block"
      @size-change="handleSizeChange"
      @current-change="handleCurrentChange"
      :current-page="currentPage4"
      :page-sizes="[5, 10, 20, 50]"
      :page-size="10"
      layout="total, sizes, prev, pager, next, jumper"
      :total="400">
    </el-pagination>

    <el-dialog :title="dialogAlbumFormTitle" size="small" :visible.sync="dialogAlbumFormVisible">
      <el-form ref="albumForm" :rules="albumFormRules" size="small" :model="albumForm" label-width="100px" >

        <el-form-item label="相册名称" prop="name">
          <el-input v-model="albumForm.name" >
          </el-input>
        </el-form-item>

        <el-form-item label="排序">
          <el-input type="number" v-model="albumForm.sort" >
          </el-input>
        </el-form-item>

      </el-form>
      <div slot="footer" class="dialog-footer">
        <el-button size="small" @click="dialogAlbumFormVisible = false">取 消</el-button>
        <el-button size="small" type="primary" @click="saveAlbumForm()">保 存</el-button>
      </div>
    </el-dialog>

  </div>

</template>

<script>
export default {
  name: 'list',
  data () {
    return {
      DIALOG_TITLE_ALBUMFORM_NEW: '相册创建',
      DIALOG_TITLE_ALBUMFORM_UPDATE: '相册编辑',
      dialogAlbumFormTitle: '',
      dialogAlbumFormVisible: false,
      searchKeyword: '',
      albumForm: {},
      albumFormRules: {
        name: [
          { required: true, message: '请输入相册名称', trigger: 'blur' }
        ]
      },
      albumList: [{
        isDefault: true,
        cover: true,
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
      }, {
        name: 'adwqwfe',
        count: 56,
        sort: 1
      }, {
        name: 'adwqwfe',
        count: 56,
        sort: 1
      }, {
        name: 'adwqwfe',
        count: 56,
        sort: 1
      }, {
        name: 'adwqwfe',
        count: 56,
        sort: 1
      }, {
        name: 'adwqwfe',
        count: 56,
        sort: 1
      }, {
        name: 'adwqwfe',
        count: 56,
        sort: 1
      }]
    }
  },
  methods: {
    createAlbum () {
      this.dialogAlbumFormTitle = this.DIALOG_TITLE_ALBUMFORM_NEW
      this.albumForm = {}
      this.dialogAlbumFormVisible = true
    },
    editAlbum (album) {
      this.dialogAlbumFormTitle = this.DIALOG_TITLE_ALBUMFORM_UPDATE
      this.albumForm = Object.assign({}, album)
      this.albumForm.oldAlbumObject = album
      this.dialogAlbumFormVisible = true
    },
    saveAlbumForm () {
      // editAlbum
      if (this.albumForm.oldAlbumObject) {
        let oldAlbumObject = this.albumForm.oldAlbumObject
        delete this.albumForm.oldAlbumObject
        Object.assign(oldAlbumObject, this.albumForm)
      } else {
        this.albumForm.count = 0
        this.albumList.push(this.albumForm)
      }
      this.dialogAlbumFormVisible = false
    },
    deleteAlbum (index, row) {
      console.log(index, row)
    },
    toAlbum (album) {
      console.log('toAlbum', album)
    }

  },
  created () {
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
.covers {
  height: 160px;
  width: 160px;
  border: solid 1px #FAFAFA;
  text-align: center;
  img {
    max-width: 160px;
    max-height: 160px;
  }
}
</style>
