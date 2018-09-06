<template>
        <el-form ref="form" :model="seoConfigFrom" label-width="100px" size="mini" label-position="right">
            <el-form-item label="版权logo">
                <el-upload
                    class="upload-demo"
                    ref="upload"
                    action="https://jsonplaceholder.typicode.com/posts/"
                    :on-preview="handlePreview"
                    :on-remove="handleRemove"
                    :file-list="fileList"
                    :auto-upload="false">
                    <el-button slot="trigger" size="small" type="primary">选取文件</el-button>
                    <el-button style="margin-left: 10px;" size="small" type="success" @click="submitUpload">上传到服务器</el-button>
                    <div slot="tip" class="el-upload__tip">只能上传jpg/png文件，且不超过500kb</div>
                </el-upload>
            <p>
				<span>建议使用<i class="important-note">宽280</i>像素-<i class="important-note">高50</i>像素内的<i class="important-note">GIF</i>或<i class="important-note">PNG</i>透明图片</span>
			</p>

				<!-- <img id="preview_logo" src="/public/static/blue/img/upload-common-select.png" data-html="true" data-container="body" data-placement="top" data-trigger="manual"> -->

            </el-form-item>


            <el-form-item label="公司名称">
                <el-input v-model="seoConfigFrom.Keywords"></el-input>    
            </el-form-item>

            <el-form-item label="版权链接">
                <el-input v-model="seoConfigFrom.description"></el-input>
            </el-form-item>

            <el-form-item label="版权信息">
                <el-input type="textarea" v-model="seoConfigFrom.htmlContent"></el-input>
            </el-form-item>

            <el-form-item>
                <el-button type="primary" @click="submitForm('ruleForm')">保存</el-button>
            </el-form-item>
        </el-form>
</template>

<script>
    export default {
        name: "copyrightInfo",
        methods:{
            handlePreview() {

            },
            handleRemove() {

            },
            submitUpload() {

            },
            submitForm() {

            }
        },
        data() {
            return {
                fileList: [],
                seoConfigFrom: {}
            };
        }
    };
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

