<template>

      <el-row :gutter="20">
  <el-col :span="6">  <el-button type="primary" size="medium" @click="location.href='/extend/addhooks.html';">添加钩子</el-button>
<div class="grid-content bg-purple"></div></el-col>
  <el-col :span="6"><div class="grid-content bg-purple"></div></el-col>
  <el-col :span="6"><div class="grid-content bg-purple"></div></el-col>
  <el-col :span="6"><div class="grid-content bg-purple"></div></el-col>
</el-row>

 <el-table
    :data="tableData"
    border
    style="width: 100%">
    <el-table-column
      fixed
      prop="date"
      label="更新状态"
      width="150">
    </el-table-column>
    <el-table-column
      prop="name"
      label="更新名称"
      width="120">
    </el-table-column>
    <el-table-column
      prop="province"
      label="更新包版本"
      width="120">
    </el-table-column>
    <el-table-column
      prop="city"
      label="系统当前版本"
      width="120">
    </el-table-column>
    <el-table-column
      prop="address"
      label="发布时间"
      width="300">
    </el-table-column>
    <el-table-column
      prop="zip"
      label="更新时间"
      width="120">
    </el-table-column>
    <el-table-column
      fixed="right"
      label="操作">
      <template slot-scope="scope">
        <el-button @click="handleClick(scope.row)" type="text" size="small">查看</el-button>
        <el-button type="text" size="small">编辑</el-button>
      </template>
    </el-table-column>
  </el-table>


</template>

<script>
    
    export default {
        name: "onlineUpdate",
        data() {
            return {
                  tableData4: [{
          date: '2016-05-03',
          name: '王小虎',
          province: '上海',
          city: '普陀区',
          address: '上海市普陀区金沙江路 1518 弄',
          zip: 200333
        }]
            }
        },
        components: {
        }
    };
</script>