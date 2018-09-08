<template>
    <el-form ref="form" :model="webConfigFrom" label-width="140px" size="mini" label-position="right">

        <h4>网站基础设置</h4>
        <el-form-item label="网站名称">
            <el-input v-model="webConfigFrom.siteTitle"></el-input>
        </el-form-item>

        <el-form-item label="官方网址">
            <el-input v-model="webConfigFrom.siteUrl"></el-input>
        </el-form-item>

        <el-form-item label="网站关键字">
            <el-input v-model="webConfigFrom.siteKeyword"></el-input>
            <p class="hint">关键字最多可输入50字，请用","进行分隔，例如”男装,女装,童装”</p>

        </el-form-item>

        <el-form-item label="网站描述">
            <el-input type="textarea" v-model="webConfigFrom.description"></el-input>
            <p class="hint">用于网站搜索引擎的优化，关键字之间请用英文逗号分隔</p>

        </el-form-item>

        <el-form-item label="网站弹出框标题">
            <el-input v-model="webConfigFrom.sitePopupTitle"></el-input>
            <p class="hint">网站弹出框标题，最大不超过15个字符</p>

        </el-form-item>

        <el-form-item label="网站logo">

            <el-upload action="https://jsonplaceholder.typicode.com/posts/" :on-preview="handlePreview" :on-remove="handleRemove" :file-list="fileList2" list-type="picture">
                <el-button size="small" type="primary">点击上传</el-button>
                <div slot="tip" class="el-upload__tip">
                    <p class="hint">
                        <span>建议使用<i class="important-note">宽120</i>像素-<i class="important-note">高120</i>像素内的<i class="important-note">JPG</i>或<i class="important-note">PNG</i>正方形图片</span>
                    </p>
                </div>
            </el-upload>
        </el-form-item>

        <el-form-item label="网站微信分享logo">

            <el-upload action="https://jsonplaceholder.typicode.com/posts/" :on-preview="handlePreview" :on-remove="handleRemove" :file-list="fileList2" list-type="picture">
                <el-button size="small" type="primary">点击上传</el-button>
                <div slot="tip" class="el-upload__tip">
                    <p class="hint">
                        <span>建议使用<i class="important-note">宽120</i>像素-<i class="important-note">高120</i>像素内的<i class="important-note">JPG</i>或<i class="important-note">PNG</i>正方形图片</span>
                    </p>
                </div>
            </el-upload>
        </el-form-item>

        <el-form-item label="网站二维码">

            <el-upload action="https://jsonplaceholder.typicode.com/posts/" :on-preview="handlePreview" :on-remove="handleRemove" :file-list="fileList2" list-type="picture">
                <el-button size="small" type="primary">点击上传</el-button>
                <div slot="tip" class="el-upload__tip">
                    <p class="hint">
                        <span>建议使用<i class="important-note">宽120</i>像素-<i class="important-note">高120</i>像素内的<i class="important-note">JPG</i>或<i class="important-note">PNG</i>正方形图片</span>
                    </p>
                </div>
            </el-upload>
        </el-form-item>

        <el-form-item label="网站公众号二维码">

            <el-upload action="https://jsonplaceholder.typicode.com/posts/" :on-preview="handlePreview" :on-remove="handleRemove" :file-list="fileList2" list-type="picture">
                <el-button size="small" type="primary">点击上传</el-button>
                <div slot="tip" class="el-upload__tip">
                    <p class="hint">
                        <span>建议使用<i class="important-note">宽120</i>像素-<i class="important-note">高120</i>像素内的<i class="important-note">JPG</i>或<i class="important-note">PNG</i>正方形图片</span>
                    </p>
                </div>
            </el-upload>
        </el-form-item>

        <h4>网站联系设置</h4>

        <el-form-item label="网站联系方式">
            <el-input v-model="webConfigFrom.siteContactPhone"></el-input>
        </el-form-item>

        <el-form-item label="网站邮箱">
            <el-input v-model="webConfigFrom.siteContactEmail"></el-input>
        </el-form-item>

        <el-form-item label="网站QQ号">
            <el-input v-model="webConfigFrom.siteContactQQ"></el-input>
        </el-form-item>

        <el-form-item label="网站微信号">
            <el-input v-model="webConfigFrom.siteContactWchat"></el-input>
        </el-form-item>

        <el-form-item label="联系地址">
            <el-input v-model="webConfigFrom.siteContactAddress"></el-input>
        </el-form-item>

        <h4>备案与统计设置</h4>

        <el-form-item label="网站ICP备案号">
            <el-input v-model="webConfigFrom.siteIPC"></el-input>
        </el-form-item>

        <el-form-item label="网站公安备案">
            <el-input v-model="webConfigFrom.siteGovRecord" max="30"></el-input>
        </el-form-item>

        <el-form-item label="网站公安备案链接">
            <el-input v-model="webConfigFrom.siteGovRecordLink" max="200"></el-input>
        </el-form-item>

        <el-form-item label="商城第三方统计代码">
            <el-input type="textarea" v-model="webConfigFrom.sitePartyCountCode">
            </el-input>
            <p class="hint">页面底部可以显示第三方统计</p>
        </el-form-item>

        <el-form-item>
            <el-button type="primary" @click="submitForm('webConfigFrom')">保存</el-button>
        </el-form-item>
    </el-form>
</template>

<script>
export default {
  name: 'webConfig',
  methods: {
    submitForm () {},
    handlePreview () {},
    handleRemove () {}
  },
  data () {
    return {
      fileList2: [],
      webConfigFrom: {
        waterPosition: [],
        passwordComplexity: []
      }
    }
  }
}
</script>

<style lang="scss" scoped>
.hint {
  font-size: 12px;
  line-height: 16px;
  color: #999999;
  margin: 10px 0 0;
}

.important-note {
  color: #ff6600;
  font-style: normal;
}
</style>
