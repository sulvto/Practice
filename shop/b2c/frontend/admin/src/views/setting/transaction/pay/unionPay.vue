<template>
    <el-form ref="form" :model="unionPayConfigFrom" label-width="140px" size="mini" label-position="right">
       
           <el-form-item label="商户号">
         <el-input   v-model="unionPayConfigFrom.merchantNumber">
        </el-input>
        </el-form-item>

       <el-form-item label="签名证书秘钥">
         <el-input   v-model="unionPayConfigFrom.signCertSecretkey">
        </el-input>
       </el-form-item>

       <el-form-item label="证书路径">
         <el-input   v-model="unionPayConfigFrom.certsPath">
        </el-input>
       </el-form-item>

       <el-form-item label="日志路径">
         <el-input   v-model="unionPayConfigFrom.logPath">
        </el-input>
       </el-form-item>

       <el-form-item label="手续费">
         <el-input type="number"  v-model="unionPayConfigFrom.serviceCharge" >
              <template slot="append">
                    倍
                </template>
        </el-input>
       </el-form-item>

     <el-form-item label="是否启用支付">
                <el-switch active-text="是" inactive-text="否" v-model="unionPayConfigFrom.isUse"></el-switch>
        </el-form-item>

     <el-form-item label="是否启用退款">
                <el-switch active-text="是" inactive-text="否" v-model="unionPayConfigFrom.canRefund"></el-switch>
			<p class="hint">开启银联卡支付才可以进行后续操作</p>
        </el-form-item>

        <el-form-item>
            <el-button type="primary" @click="submitForm('unionPayConfigFrom')">保存</el-button>
            <el-button type="info" @click="$router.back()">返回</el-button>
        </el-form-item>
    </el-form>
</template>

<script>
    export default {
        name: "unionPayConfig",
        methods : {

            handlePreview() {

            },
            handleRemove() {

            }
        },
        data() {
            return {
                unionPayConfigFrom: {
                }
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

