<template>
  <div>
    <table>
      <colgroup>
        <col style="width: 15%">
        <col style="width: 85%;">
      </colgroup>

      <tr align="left" style="border-bottom: 1px solid #E3E3E3;">
        <th>省</th>
        <th>市</th>
      </tr>
      <tr v-for="province in provinces" :key="province.id">
        <td>{{ province.name }}</td>
        <td>
          <el-checkbox-group v-model="selectedCities[province.id]" @change="handleCheckedCitiesChange2">
            <el-checkbox v-for="city in cities[province.id]" :key="city.id" :label="city.id" @change="handleCheckedCitiesChange"> {{ city.name }} </el-checkbox>
          </el-checkbox-group>
        </td>
      </tr>
    </table>
  </div>
</template>

<script>
import axios from 'axios'

export default {
  name: 'DeliveryLocalArea',
  data () {
    return {
      areas: [],
      cities: [],
      provinces: [],
      selectedCities: null
    }
  },
  created () {
    this.loadRegionData()
  },
  methods: {
    getJSON (url) {
      return new Promise((resolve, reject) => {
        axios.get(url)
          .then(response => {
            if (response.status === 200) {
              resolve(response.data)
            } else {
              reject()
            }
          }).catch(reject)
      })
    },
    loadRegionData () {
      this.getJSON('/static/china_regions/city.json')
        .then((data) => {
          this.cities = data

          return this.getJSON('/static/china_regions/province.json')
        })
        .then((data) => {
          this.provinces = data

          this.initselectedCities()

          return this.getJSON('/static/china_regions/area.json')
        })
        .then((data) => {
          this.areas = data
        })
    },
    initselectedCities () {
      this.selectedCities = null
      var init = {}
      this.provinces.forEach(item => {
        init[item.id] = []
      })

      this.selectedCities = init
    },
    handleCheckedCitiesChange () {
      console.log('handleCheckedCitiesChange', this.selectedCities)
    },
    handleCheckedCitiesChange2 () {
      console.log('handleCheckedCitiesChange2')
    }
  }
}
</script>

<style lang="scss" scoped>
label.el-checkbox {
  margin-left: 0px;
  width: 230px;
}

.table th, .table td {
  padding: 8px;
  line-height: 20px;
  text-align: left;
  vertical-align: top;
  border-top: 1px solid #dddddd;
}
</style>
