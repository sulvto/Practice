<template>
    <div>
        <el-row>
            <el-button type="danger" size="small">批量删除</el-button>
            <el-button type="primary" size="small" >添加路由规则</el-button>
        </el-row>
        
        <el-table border :data="tableData" style="width: 100%">
            <el-table-column prop="rule" label="伪静态路由规则">
    
            </el-table-column>
            <el-table-column prop="address" label="路由地址">
            </el-table-column>
            <el-table-column prop="module" label="路由模块">
            </el-table-column>
            <el-table-column prop="introduction" label="简介">
            </el-table-column>
            <el-table-column label="是否开启" width="180">
                <template slot-scope="scope">
                        <el-switch v-model="scope.row.isOpen">
                        </el-switch>
                </template>
            </el-table-column>
            <el-table-column label="操作" width="180">
                <template slot-scope="scope">
                    <!-- <a href="/config/updateRoutingRule?routeid=7">修改</a> <a href="javascript:;" onclick="delete_url_route(7);">删除</a> -->
                    <el-button size="mini" @click="handleEdit(scope.$index, scope.row)">配置</el-button>
                    <el-button v-if="!scope.row.isDefault" size="mini" @click="handleEdit(scope.$index, scope.row)">删除</el-button>
                </template>
            </el-table-column>
        </el-table>

    </div>
</template>

<script>
    export default {
        data() {
            return {
                tableData: [{
                    rule: 'goods',
                    address: 'shop/goods/goodsinfo',
                    isOpen: true,
                    isDefault: true,
                    module: 'shop',
                    introduction: '文章详情'
                }, {
                    rule: 'list',
                    address: 'shop/goods/goodslist',
                    isOpen: true,
                    isDefault: true,
                    module: 'shop',
                    introduction: ''
                }, {
                    rule: 'brands',
                    address: 'shop/goods/brandlist',
                    isOpen: true,
                    isDefault: true,
                    module: 'shop',
                    introduction: ''
                }, {
                    rule: 'integralcenter',
                    address: 'shop/goods/integralcenter',
                    isOpen: true,
                    isDefault: true,
                    module: 'shop',
                    introduction: ''
                }, {
                    rule: 'discount',
                    address: 'shop/index/discount',
                    isOpen: true,
                    isDefault: true,
                    module: 'shop',
                    introduction: ''
                }, {
                    rule: 'membercenter',
                    address: 'shop/member/index',
                    isOpen: true,
                    isDefault: false,
                    module: 'shop',
                    introduction: ''
                }, {
                    rule: 'article',
                    address: 'shop/cms/articleclassinfo',
                    isOpen: true,
                    isDefault: true,
                    module: 'shop',
                    introduction: ''
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
