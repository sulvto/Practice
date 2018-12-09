<template>
  <el-form ref="pickuppointFrom" :rules="rules" :model="pickuppointFrom" label-width="110px" size="small" label-position="right">

    <el-form-item label="门店名称" prop="name">
      <el-input v-model="pickuppointFrom.name"/>
    </el-form-item>

    <el-form-item label="门店地址" prop="address" required>
      <el-select v-model="pickuppointFrom.province" placeholder="请选择省">
        <el-option v-for="provinceListItem in provinceList" :key="provinceListItem.id" :label="provinceListItem.name" :value="provinceListItem.id" />
      </el-select>
      <el-select v-model="pickuppointFrom.city" placeholder="请选择市">
        <el-option v-for="citysItem in citys[pickuppointFrom.province]" :key="citysItem.id" :label="citysItem.name" :value="citysItem.id" />
      </el-select>
      <el-select v-model="pickuppointFrom.area" placeholder="请选择区/县">
        <el-option v-for="areasItem in areas[pickuppointFrom.city]" :key="areasItem.id" :label="areasItem.name" :value="areasItem.id" />
      </el-select>
    </el-form-item>

    <el-form-item label="详细地址" prop="detailAddress">
      <el-input v-model="pickuppointFrom.detailAddress" type="textarea" />
    </el-form-item>

    <el-form-item label="门店联系人">
      <el-input v-model="pickuppointFrom.contact"/>
    </el-form-item>

    <el-form-item label="门店电话" prop="tel">
      <el-input v-model="pickuppointFrom.tel"/>
    </el-form-item>

    <el-form-item>
      <el-button type="primary" @click="submitForm('pickuppointFrom')">保存</el-button>
      <el-button type="info" @click="$router.back()">返回</el-button>
    </el-form-item>
  </el-form>
</template>

<script>
import axios from 'axios'

export default {
  name: 'PickuppointEdit',
  data () {
    return {
      provinceList: null,
      citys: null,
      areas: null,
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
  },
  mounted () {
    console.log('mounted')

    if (!this.areas) {
      axios.get('/static/china_regions/area.json')
        .then(response => {
          if (response.status === 200) {
            this.areas = response.data
          }
        })
        .catch(error => {
          console.log(error)
        })
    }

    if (!this.citys) {
      axios.get('/static/china_regions/city.json')
        .then(response => {
          if (response.status === 200) {
            this.citys = response.data
          }
        })
        .catch(error => {
          console.log(error)
        })
    }

    if (!this.provinceList) {
      axios.get('/static/china_regions/province.json')
        .then(response => {
          if (response.status === 200) {
            this.provinceList = response.data
          }
        })
        .catch(error => {
          console.log(error)
        })
    }
  }
}
</script>

<style lang="scss" scoped>

</style>
