
	<!--	<li data-statu="1">未使用</li>
		<li data-statu="2">已使用</li>
		<li data-statu="3">已过期</li>
-->

<template>
    <div>
        <el-row>
            <el-button type="primary" size="small">添加优惠券</el-button>
        </el-row>
   <el-table border :data="tableData" style="width: 100%">
        <el-table-column prop="name" label="优惠券名称" width="120"> </el-table-column>
        <el-table-column prop="receiveUser" label="领取人" width="120"> </el-table-column>
        <el-table-column prop="code" label="优惠券编码" width="120"> </el-table-column>
        <el-table-column prop="type" label="面额" width="120"> </el-table-column>
        <el-table-column prop="obtainWay" label="获取方式" width="120"> </el-table-column>
        <el-table-column prop="status" label="状态" width="120"> </el-table-column>
        <el-table-column prop="receiveDate" label="领取时间" width="120"> </el-table-column>
        <el-table-column prop="useDate" label="使用时间" width="120"> </el-table-column>
        </el-table>
  </div>
</template>

<script>
    export default {
        name: "couponyGrantList",
        data() {
            return {
                tableData: [{
                    name:"满88元减2元",
                    receiveUser:"fscmdl",
                    code:"1533206833698",
                    money: '2.0',
                    obtainWay: '首页领取',
                    status: "未领用",
                    receiveDate: '',
                    useDate: ''
                }]
            }
        },
        methods: {
            handleEdit(index, row) {
                console.log(index, row);
            },
            handleDelete(index, row) {
                console.log(index, row);
            }
        }
    }
</script>

<style lang="scss" scoped>
    .table-logo {
        width: 75px;
        float: left;
    }
    
    .table-pay {
        display: inline-block;
        width: 120px;
        overflow: hidden;
        margin-top: 7px;
    }
    
    .table-desc {
        display: inline-block;
    }
</style>