<!-- TODO: 门店地址 -->
<!-- <dt><span style="color:red;">*</span>&nbsp;&nbsp;门店地址：</dt>
<dd>

<div class="selectric-wrapper selectric-select-common" style="width: 250px;"><div class="selectric-hide-select"><select name="province" id="seleAreaNext" onchange="GetProvince();getSelCity();" class="select-common" tabindex="-1">

<option value="-1">请选择省</option><option value="35">hai</option><option value="20">广西壮族自治区</option><option value="21">海南省</option><option value="22">重庆市</option><option value="23">四川省</option><option value="24">贵州省</option><option value="25">云南省</option><option value="26">西藏自治区</option><option value="27">陕西省</option><option value="28">甘肃省</option><option value="29">青海省</option><option value="30">宁夏回族自治区</option><option value="31">新疆维吾尔自治区</option><option value="32">香港特别行政区</option><option value="33">澳门特别行政区</option><option value="34">台湾省</option><option value="19">广东省</option><option value="18">湖南省</option><option value="17">湖北省</option><option value="2">天津市</option><option value="3">河北省</option><option value="4">山西省</option><option value="5">内蒙古自治区</option><option value="6">辽宁省</option><option value="7">吉林省</option><option value="8">黑龙江省</option><option value="9">上海市</option><option value="10">江苏省</option><option value="11">浙江省</option><option value="12">安徽省</option><option value="13">福建省</option><option value="14">江西省</option><option value="15">山东省</option><option value="16">河南省</option><option value="1">北京市</option></select></div><div class="selectric"><span class="selectric-label">请选择省</span><button class="selectric-button">▾</button></div><div class="selectric-items" tabindex="-1"><div class="selectric-scroll"><ul><li data-index="0" class="selected" title="请选择省">请选择省</li><li data-index="1" class="" title="hai">hai</li><li data-index="2" class="" title="广西壮族自治区">广西壮族自治区</li><li data-index="3" class="" title="海南省">海南省</li><li data-index="4" class="" title="重庆市">重庆市</li><li data-index="5" class="" title="四川省">四川省</li><li data-index="6" class="" title="贵州省">贵州省</li><li data-index="7" class="" title="云南省">云南省</li><li data-index="8" class="" title="西藏自治区">西藏自治区</li><li data-index="9" class="" title="陕西省">陕西省</li><li data-index="10" class="" title="甘肃省">甘肃省</li><li data-index="11" class="" title="青海省">青海省</li><li data-index="12" class="" title="宁夏回族自治区">宁夏回族自治区</li><li data-index="13" class="" title="新疆维吾尔自治区">新疆维吾尔自治区</li><li data-index="14" class="" title="香港特别行政区">香港特别行政区</li><li data-index="15" class="" title="澳门特别行政区">澳门特别行政区</li><li data-index="16" class="" title="台湾省">台湾省</li><li data-index="17" class="" title="广东省">广东省</li><li data-index="18" class="" title="湖南省">湖南省</li><li data-index="19" class="" title="湖北省">湖北省</li><li data-index="20" class="" title="天津市">天津市</li><li data-index="21" class="" title="河北省">河北省</li><li data-index="22" class="" title="山西省">山西省</li><li data-index="23" class="" title="内蒙古自治区">内蒙古自治区</li><li data-index="24" class="" title="辽宁省">辽宁省</li><li data-index="25" class="" title="吉林省">吉林省</li><li data-index="26" class="" title="黑龙江省">黑龙江省</li><li data-index="27" class="" title="上海市">上海市</li><li data-index="28" class="" title="江苏省">江苏省</li><li data-index="29" class="" title="浙江省">浙江省</li><li data-index="30" class="" title="安徽省">安徽省</li><li data-index="31" class="" title="福建省">福建省</li><li data-index="32" class="" title="江西省">江西省</li><li data-index="33" class="" title="山东省">山东省</li><li data-index="34" class="" title="河南省">河南省</li><li data-index="35" class="last" title="北京市">北京市</li></ul></div></div><input class="selectric-input" tabindex="0"></div>
<div class="selectric-wrapper selectric-select-common" style="width: 250px;"><div class="selectric-hide-select"><select name="city" id="seleAreaThird" onchange="getSelCity();" class="select-common" tabindex="-1">
<option value="">请选择市</option>
</select></div><div class="selectric"><span class="selectric-label">请选择市</span><button class="selectric-button">▾</button></div><div class="selectric-items" tabindex="-1"><div class="selectric-scroll"><ul><li data-index="0" class="last selected" title="请选择市">请选择市</li></ul></div></div><input class="selectric-input" tabindex="0"></div>
<div class="selectric-wrapper selectric-select-common" style="width: 250px;"><div class="selectric-hide-select"><select name="district" id="seleAreaFouth" class="select-common" tabindex="-1">
<option value="-1">请选择区/县</option>
</select></div><div class="selectric"><span class="selectric-label">请选择区/县</span><button class="selectric-button">▾</button></div><div class="selectric-items" tabindex="-1"><div class="selectric-scroll"><ul><li data-index="0" class="last selected" title="请选择区/县">请选择区/县</li></ul></div></div><input class="selectric-input" tabindex="0"></div>

<p class="error">请选择门店完整地址</p>
</dd> -->
<template>
  <el-form ref="pickuppointFrom" :rules="rules" :model="pickuppointFrom" label-width="110px" size="small" label-position="right">

    <el-form-item label="门店名称" prop="name">
      <el-input v-model="pickuppointFrom.name"></el-input>
    </el-form-item>

    <el-form-item label="门店地址" prop="address">
      <el-input v-model="pickuppointFrom.address"></el-input>
    </el-form-item>

    <el-form-item label="详细地址" prop="detailAddress">
      <el-input type="textarea" v-model="pickuppointFrom.detailAddress"></el-input>
    </el-form-item>

    <el-form-item label="门店联系人">
      <el-input v-model="pickuppointFrom.contact"></el-input>
    </el-form-item>

    <el-form-item label="门店电话" prop="tel">
      <el-input v-model="pickuppointFrom.tel"></el-input>
    </el-form-item>

    <el-form-item>
      <el-button type="primary" @click="submitForm('pickuppointFrom')">保存</el-button>
      <el-button type="info" @click="$router.back()">返回</el-button>
    </el-form-item>
  </el-form>
</template>

<script>
export default {
  name: 'pickuppointEdit',
  data () {
    return {
      pickuppointFrom: {},
      rules: {
        name: [
          { required: true, message: '门店名称不能为空', trigger: 'blur' }
        ],
        address: [
          { required: true, message: '请选择门店完整地址', trigger: 'blur' }
        ],
        detailAddress: [
          { required: true, message: '详细地址不能为空', trigger: 'blur' }
        ],
        tel: [
          { required: true, message: '门店电话不能为空', trigger: 'blur' }
        ]
      }
    }
  }
}
</script>

<style lang="scss" scoped>

</style>
