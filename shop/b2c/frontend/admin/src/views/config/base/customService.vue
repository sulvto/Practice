
		
				
							
	
<template>

				<!-- TODO <div> -->
																		<!-- <h4>功能提示</h4> -->
									<!-- <p class="function-prompts">
	</p><p class="function-prompts">
		</p><ul>
			<li>当前客服仅适用于以下三种链接</li>
			<li>1.美洽
				<br>链接地址：<a href="http://www.meiqia.com" target="_brank">www.meiqia.com</a>
				使用教程：<a href="http://www.niushop.com.cn/document.html?class_id=20&amp;dir_id=63&amp;id=122" target="_blank">http://www.niushop.com.cn/document.html?class_id=20&amp;dir_id=63&amp;id=122</a>
			</li>
			<li>2.KF5
				<br>链接地址：<a href="http://www.kf5.com" target="_brank">www.kf5.com</a>
				使用教程：<a href="http://www.niushop.com.cn/document.html?class_id=20&amp;dir_id=63&amp;id=123" target="_blank">http://www.niushop.com.cn/document.html?class_id=20&amp;dir_id=63&amp;id=123</a></li>
			<li>3.QQ(qq客服需填写当前客服的qq号码)<br><br></li>
		</ul>
	<p></p> -->
<!-- <p></p>
								</div> -->
		
	<!-- <dl>
		<dt>提现手续费比例:</dt>
		<dd>
			<input id="poundage" type="number" min="0.00" step="0.01"  value="" />&nbsp;%<span class="withdraw_rule" id="verification_poundage">提现手续费不能为空</span>
			<p class="hint">为0表示不收手续费</p>
		</dd>
	</dl> -->
	
<!-- 	<dl> -->
<!-- 		<dt>是否启用</dt> -->
<!-- 		<dd> -->
<!-- 			<div class="controls"> -->
<!-- 				<label class="radio inline"><input type="radio" name="enable" value="1" checked="checked" id="enableYes">启用</label>  -->
<!-- 				<label class="radio inline"><input type="radio" name="enable" value="0" checked="checked" id="enableNo">禁用</label> -->
<!-- 				<input type="hidden" id="is_open" value="0"> -->
<!-- 			</div> -->
<!-- 			<p class="hint">是否启用提现设置</p> -->
<!-- 		</dd> -->
<!-- 	</dl> -->


        <el-form ref="form" :model="customServiceConfigFrom" label-width="100px" size="mini" label-position="right">
            

            <el-form-item label="启用"> 
                  <el-radio-group v-model="customServiceConfigFrom.customServiceType" size="mini">
                    <el-radio-button label="美洽" value="meiqia"></el-radio-button>
                    <el-radio-button label="kf5" value="kf5"></el-radio-button>
                    <el-radio-button label="qq" value="qq"></el-radio-button>
                </el-radio-group>
            </el-form-item>

            <el-form-item label="美洽客服链接">
                <el-input v-model="customServiceConfigFrom.meiqiaServiceAddress" :disabled="customServiceConfigFrom.customServiceType!=='meiqia'"></el-input>    
            </el-form-item>

            <el-form-item label="kf5客服链接">
                <el-input v-model="customServiceConfigFrom.kf5ServiceAddress" :disabled="customServiceConfigFrom.customServiceType!=='kf5'"></el-input>
            </el-form-item>

            <el-form-item label="QQ客服" >
                <el-input v-model="customServiceConfigFrom.qqServiceNumber" :disabled="customServiceConfigFrom.customServiceType!=='qq'"></el-input>
            </el-form-item>

            <el-form-item>
                <el-button type="primary" @click="submitForm('customServiceConfigFrom')">保存</el-button>
            </el-form-item>
        </el-form>
</template>

<script>
    export default {
        name: "customService",
        methods:{
            submitForm() {

            }
        },
        data() {
            return {
                customServiceConfigFrom: {
                    customServiceType:'qq'
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

