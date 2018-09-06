<template>
    <div>
        <el-row>
            <el-button type="danger" size="small">批量删除</el-button>
            <el-button type="primary" size="small">添加路由规则</el-button>
        </el-row>
    
        <el-table border :data="tableData" style="width: 100%">

            <el-table-column
      prop="rank"
      label="排行"
      width="120">
    </el-table-column>


         <el-table-column
      prop="name"
      label="商品名称"
      width="120">
    </el-table-column>

         <el-table-column
      prop="sales"
      label="销售量"
      width="120">
    </el-table-column>
        </el-table>
  </div>
</template>

<script>
    export default {
        name: "shopGoodsSalesRank",
        data() {
            return {
                tableData: [{
                    rank: 1,
                    name: 'ertgewr',
                    sales: 20,
                },{
                    rank: 2,
                    name: 'xxxxx33',
                    sales: 8,
                },{
                    rank: 3,
                    name: '旅游双肩包女欧洲站2016新款立体蝴蝶轻便时尚百搭欧美高档背包潮',
                    sales:6,
                },{
                    rank: 4,
                    name: '真皮女包2017夏新款单肩斜跨包H扣鳄鱼纹时尚潮流百搭女士小方包',
                    sales:5,
                },{
                    rank: 5,
                    name: 'Skyworth/创维 55V9E 55吋4K超高清智能网络平板LED液晶电视机 60',
                    sales: 5,
                },{
                    rank: 1,
                    name: '测试商品',
                    sales: 4,
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
   
</style>
