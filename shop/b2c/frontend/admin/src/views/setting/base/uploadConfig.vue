<template>
    <el-form ref="form" :model="uploadConfigFrom" label-width="140px" size="mini" label-position="right">
        <h4>上传方式设置</h4>

        <el-form-item label="保存方式">
            <el-select v-model="uploadConfigFrom.visitMode" placeholder="请选择">
                <el-option label="本地" value="local"></el-option>
                <el-option label="七牛" value="qiniu"></el-option>
            </el-select>
            <p v-show="uploadConfigFrom.visitMode === 'qiniu'" class="hint qiniu-hint" >七牛云构建了基于容器的计算平台，并基于容器平台构建了功能丰富且开放性的智能媒体云平台。</p>
            <p v-show="uploadConfigFrom.visitMode === 'qiniu'" class="hint qiniu-hint" >您只需考虑怎么处理数据，而无需考虑数据的规模和系统性能。</p>
        </el-form-item>

    <div v-show="uploadConfigFrom.visitMode === 'qiniu'">

        <el-form-item label="Accesskey">
            <el-input v-model="uploadConfigFrom.accesskey"></el-input>
                                        <p class="hint">用于签名的公钥</p>
        </el-form-item>

        <el-form-item label="Secretkey">
            <el-input v-model="uploadConfigFrom.secretkey"></el-input>
                                        <p class="hint">用于签名的私钥</p>
        </el-form-item>

        <el-form-item label="Bucket">
            <el-input v-model="uploadConfigFrom.bucket"></el-input>
                                        <p class="hint">请保证bucket为可公共读取的</p>
        </el-form-item>

        <el-form-item label="Url">
            <el-input v-model="uploadConfigFrom.url"></el-input>
            <p class="hint">七牛支持用户自定义访问域名。注：url开头加<i class="important-note">http://</i>或<i class="important-note">https://</i>，结尾不加 ‘<i class="important-note">/</i>’，例：http://abc.com</p>
        </el-form-item>

    </div>
        <h4>默认图片设置</h4>

        <el-form-item label="默认商品图片">

          <el-upload
            action="https://jsonplaceholder.typicode.com/posts/"
            :on-preview="handlePreview"
            :on-remove="handleRemove"
            :file-list="fileList2"
            list-type="picture">
            <el-button size="small" type="primary">点击上传</el-button>
            <div slot="tip" class="el-upload__tip"> <p class="hint">
                                      <span>建议使用<i class="important-note">宽120</i>像素-<i class="important-note">高120</i>像素内的<i class="important-note">JPG</i>或<i class="important-note">PNG</i>正方形图片</span>
                                  </p></div>
          </el-upload>
        </el-form-item>

        <el-form-item label="默认会员头像">

          <el-upload
            action="https://jsonplaceholder.typicode.com/posts/"
            :on-preview="handlePreview"
            :on-remove="handleRemove"
            :file-list="fileList2"
            list-type="picture">
            <el-button size="small" type="primary">点击上传</el-button>
            <div slot="tip" class="el-upload__tip"> <p class="hint">
                                      <span>建议使用<i class="important-note">宽120</i>像素-<i class="important-note">高120</i>像素内的<i class="important-note">JPG</i>或<i class="important-note">PNG</i>正方形图片</span>
                                  </p></div>
          </el-upload>
        </el-form-item>

      <el-form-item label="默认文章缩略图">

          <el-upload
            action="https://jsonplaceholder.typicode.com/posts/"
            :on-preview="handlePreview"
            :on-remove="handleRemove"
            :file-list="fileList2"
            list-type="picture">
            <el-button size="small" type="primary">点击上传</el-button>
            <div slot="tip" class="el-upload__tip"> <p class="hint">
                                      <span>建议使用<i class="important-note">宽120</i>像素-<i class="important-note">高120</i>像素内的<i class="important-note">JPG</i>或<i class="important-note">PNG</i>正方形图片</span>
                                  </p></div>
          </el-upload>
        </el-form-item>

                <h4>上传参数设置</h4>

  <el-form-item label="商品图片添加水印">
                <el-switch active-text="是" inactive-text="否" v-model="uploadConfigFrom.watermark"></el-switch>
        </el-form-item>

      <el-form-item label="水印图片">

        <el-upload
          action="https://jsonplaceholder.typicode.com/posts/"
          :on-preview="handlePreview"
          :on-remove="handleRemove"
          :file-list="fileList2"
          list-type="picture">
          <el-button size="small" type="primary">点击上传</el-button>
          <div slot="tip" class="el-upload__tip"> <p class="hint">
                              <span>建议使用<i class="important-note">宽120</i>像素-<i class="important-note">高120</i>像素内的<i class="important-note">JPG</i>或<i class="important-note">PNG</i>正方形图片</span>
                          </p></div>
        </el-upload>
        </el-form-item>

        <el-form-item label="水印透明度" >
            <el-slider v-model="uploadConfigFrom.transparency">
                <template slot="append">%</template>
            </el-slider>

         <p class="hint">水印的透明度，可选值为0-100。当设置为100时则为不透明。</p>
       </el-form-item>

        <el-form-item label="水印位置">
                <el-checkbox-group v-model="uploadConfigFrom.waterPosition">
                    <el-checkbox label="左上角"  value="1"></el-checkbox>
                    <el-checkbox label="右上角"  value="2"></el-checkbox>
                    <el-checkbox label="居中"  value="3"></el-checkbox>
                    <el-checkbox label="左下角"  value="4"></el-checkbox>
                    <el-checkbox label="右下角"  value="5"></el-checkbox>
                </el-checkbox-group>
                <p class="hint">请选择水印位置</p>

            </el-form-item>

       <el-form-item label="支持格式后缀">
         <el-input type="textarea"  v-model="uploadConfigFrom.fileFormat">
        </el-input>
         <p class="hint">支持上传文件格式后缀(后缀之间以,隔开)。</p>
       </el-form-item>

   <el-form-item label="文件大小限制">
         <el-input-number  v-model="uploadConfigFrom.fileSizeLimit">
        </el-input-number>
         <p class="hint">注意考虑php.ini的配置(0为不限制)</p>
       </el-form-item>

      <el-form-item label="裁剪设置">
          <el-checkbox-group v-model="uploadConfigFrom.passwordComplexity">
              <el-checkbox label="缩放后填充" value="1"></el-checkbox>
              <el-checkbox label="居中裁剪" value="2"></el-checkbox>
              <el-checkbox label="左上角裁剪" value="3"></el-checkbox>
              <el-checkbox label="右下角裁剪" value="4"></el-checkbox>
              <el-checkbox label="固定尺寸缩放" value="5"></el-checkbox>
          </el-checkbox-group>
          <p class="hint">请选择图片裁剪类型</p>

      </el-form-item>

      <el-form-item>
          <el-button type="primary" @click="submitForm('uploadConfigFrom')">保存</el-button>
      </el-form-item>
    </el-form>
</template>

<script>
export default {
  name: 'uploadConfig',
  methods: {
    handlePreview () {},
    handleRemove () {}
  },
  data () {
    return {
      fileList2: [],
      uploadConfigFrom: {
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
