	<!-- <dl> -->
		<!-- <dt><span style="color:red;">*</span>&nbsp;&nbsp;有效时间：</dt> -->
		<!-- <dd>
			<div>
				<label class="radio inline normal">
					<i class="radio-common  selected "><input type="radio" value="0" name="term_of_validity_type" checked=""></i>
					<span>固定日期</span>
				</label>
				<label class="radio inline normal">
					<i class="radio-common "><input type="radio" value="1" name="term_of_validity_type"></i>
					<span>领到券当日开始N天内有效</span>
				</label>
			</div> -->
			<!-- 固定日期 -->
			<!-- <div class="fixed_time mTop">
				<div class="mTop">
					<span>生效时间：</span>
					<input class="input-medium input-common harf" type="text" id="start_time" style="width:250px;" onclick="WdatePicker({skin:'twoer',dateFmt:'yyyy-MM-dd HH:mm:ss'})" value="2018-07-04 18:44:44">
				</div>
				<div class="mTop">
					<span>过期时间：</span>
					<input class="input-medium input-common harf" size="15" type="text" id="end_time" style="width:250px;" onclick="WdatePicker({skin:'twoer',dateFmt:'yyyy-MM-dd HH:mm:ss'})" value="2018-08-31 14:50:04">
				</div>
				<p class="error">请输入有效时间</p>
				<p class="hint">生效前买家可以领取但不能使用</p>
			</div> -->
			<!-- 相对时间 -->
			<!-- <div class="relative_time mTop" style="display: none;">
				<p>领取之日起<input type="number" min="1" max="365" id="fixed_term" class="input-common short" style="margin:0 5px!important;display: inline-block;" value="1">天内有效</p>
				<span class="error">生效天数必须在1到365内</span>
			</div>
		</dd>
	</dl> -->

<!-- 已选择商品的列表 -->
<!-- <dl>
	<dd class="goods-list" style="width:100%;display:none;margin-left: 0;">
		<table class="table-class">
			<colgroup>
				<col width="40%">
				<col width="20%">
				<col width="10%">
				<col width="15%">
				<col width="10%">
			</colgroup>
			<thead>
				<tr>
					<th>商品名称</th>
					<th>价格</th>
					<th>库存</th>
					<th id="action-th"></th>
					<th>操作</th>
				</tr>
			</thead>
			<tbody></tbody>
		</table>
	</dd>
</dl> -->

<template>
        <el-form ref="form" :model="coupontTypeFrom" label-width="100px" size="mini" label-position="right">

            <el-form-item label="名称">
                <el-input v-model="coupontTypeFrom.name" value="满88元减2元"></el-input>
                <p class="hint">10个字以内</p>
            </el-form-item>

            <el-form-item label="面额">
                <el-input type="number"  v-model="coupontTypeFrom.money" >
                    <template slot="append">
                            元
                        </template>
                </el-input>
            </el-form-item>

            <el-form-item label="补发数量">
                <el-input type="number"  v-model="coupontTypeFrom.repairCount" >
                    <template slot="append">
                            份
                        </template>
                </el-input>
            </el-form-item>

            <el-form-item label="已发放数量">
                <p>102份</p>
            </el-form-item>

            <el-form-item label="每人最大领取数">
                <el-input type="number"  v-model="coupontTypeFrom.maxFetch" >
                    <template slot="append">
                            份
                        </template>
                </el-input>
                	<p class="hint">输入0表示无限制</p>
            </el-form-item>

            <el-form-item label="满多少元使用">
                <el-input type="number"  v-model="coupontTypeFrom.atLeast" >
                    <template slot="append">
                            份
                        </template>
                </el-input>
            </el-form-item>

            <el-form-item label="领取人等级">
                <el-input type="number"  v-model="coupontTypeFrom.needUserLevel" >
                    <template slot="append">
                            级
                        </template>
                </el-input>
            </el-form-item>

            <el-form-item label="有效时间">
                <el-radio-group v-model="coupontTypeFrom.termOfValidityType">
                    <el-radio label="固定日期"></el-radio>
                    <el-radio label="领到券当日开始N天内有效"></el-radio>
                </el-radio-group>
            </el-form-item>
            <!-- TODO: 有效时间？ -->

            <el-form-item label="是否允许首页显示">
                <el-switch  active-text="开" inactive-text="关" v-model="coupontTypeFrom.isShow"></el-switch>
            </el-form-item>

            <el-form-item label="参与商品">
                <el-radio-group v-model="coupontTypeFrom.isAll">
                    <el-radio label="全部"></el-radio>
                    <el-radio label="部分"></el-radio>
                </el-radio-group>
            </el-form-item>
            <!-- TODO:  部分？选择参与商品            -->

            <el-form-item>
                <el-button type="primary" @click="submitForm('coupontTypeFrom')">保存</el-button>
                <el-button type="info" @click="$router.back()">返回</el-button>
            </el-form-item>
        </el-form>
</template>

<script>
    export default {
        name: "coupontTypeEdit",
        data() {
            return {
                coupontTypeFrom: {}
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

