<template>
    <div>
      <el-row :gutter="8">
        <el-col :span="12">
          <el-button type="primary" size="small">备份</el-button>
          <el-button type="primary" size="small">修复</el-button>
        </el-col>

        <el-col :span="10">
          </el-col>
        <el-col :span="2">
        </el-col>
      </el-row>

      <br/>

        <el-table border :data="tableData" style="width: 100%">
            <el-table-column
              type="selection"
              width="35">
            </el-table-column>

            <el-table-column
                  prop="tableName"
                  label="表名">
            </el-table-column>

            <el-table-column
                  prop="count"
                  label="数据量"
                  width="120">
            </el-table-column>

            <el-table-column
                  prop="dataSize"
                  label="数据大小"
                  width="120">
            </el-table-column>

            <el-table-column
                  prop="createDate"
                  label="创建时间"
                  width="140">
            </el-table-column>

            <el-table-column label="操作"
                width="180">
                <template slot-scope="scope">
                    <el-button size="mini" @click="handleEdit(scope.$index, scope.row)">修复</el-button>
                </template>
            </el-table-column>
        </el-table>
  </div>
</template>

<script>
export default {
  name: 'backup',
  data () {
    return {
      tableData: [{
        tableName: 'nc_cms_article', count: 2, dataSize: '16KB', createDate: '2018-08-11 15:44:44'
      }, {
        tableName: 'nc_cms_article_class', count: 0, dataSize: '16KB', createDate: '2018-08-11 15:44:44'
      }, {
        tableName: 'nc_cms_comment', count: 0, dataSize: '16KB', createDate: '2018-08-11 15:44:44'
      }, {
        tableName: 'nc_cms_topic', count: 0, dataSize: '16KB', createDate: '2018-08-11 15:44:44'
      }, {
        tableName: 'nfx_commission_distribution', count: 80, dataSize: '16KB', createDate: '2018-08-11 15:44:44'
      }, {
        tableName: 'nfx_commission_partner', count: 0, dataSize: '16KB', createDate: '2018-08-11 15:44:44'
      }, {
        tableName: 'nfx_commission_partner_global', count: 6, dataSize: '16KB', createDate: '2018-08-11 15:44:44'
      }, {
        tableName: 'nfx_commission_partner_global_records', count: 3, dataSize: '16KB', createDate: '2018-08-11 15:44:44'
      }, {
        tableName: 'nfx_commission_region_agent', count: 8, dataSize: '16KB', createDate: '2018-08-11 15:44:44'
      }, {
        tableName: 'nfx_goods_commission_rate', count: 71, dataSize: '16KB', createDate: '2018-08-11 15:44:44'
      }, {
        tableName: 'nfx_partner', count: 0, dataSize: '16KB', createDate: '2018-08-11 15:44:44'
      }, {
        tableName: 'nfx_partner_level', count: 2, dataSize: '16KB', createDate: '2018-08-11 15:44:44'
      }, {
        tableName: 'nfx_promoter', count: 102, dataSize: '16KB', createDate: '2018-08-11 15:44:44'
      }, {
        tableName: 'nfx_promoter_level', count: 5, dataSize: '16KB', createDate: '2018-08-11 15:44:45'
      }, {
        tableName: 'nfx_promoter_region_agent', count: 4, dataSize: '16KB', createDate: '2018-08-11 15:44:45'
      }, {
        tableName: 'nfx_shop_commission_withdraw_config', count: 0, dataSize: '16KB', createDate: '2018-08-11 15:44:45'
      }, {
        tableName: 'nfx_shop_config', count: 0, dataSize: '16KB', createDate: '2018-08-11 15:44:45'
      }, {
        tableName: 'nfx_shop_member_association', count: 69, dataSize: '16KB', createDate: '2018-08-11 15:44:45'
      }, {
        tableName: 'nfx_shop_region_agent_config', count: 0, dataSize: '16KB', createDate: '2018-08-11 15:44:45'
      }, {
        tableName: 'nfx_user_account', count: 61, dataSize: '16KB', createDate: '2018-08-11 15:44:45'
      }, {
        tableName: 'nfx_user_account_records', count: 58, dataSize: '16KB', createDate: '2018-08-11 15:44:45'
      }, {
        tableName: 'nfx_user_account_type', count: 0, dataSize: '16KB', createDate: '2018-08-11 15:44:45'
      }, {
        tableName: 'nfx_user_bank_account', count: 0, dataSize: '16KB', createDate: '2018-08-11 15:44:45'
      }, {
        tableName: 'nfx_user_commission_withdraw', count: 0, dataSize: '16KB', createDate: '2018-08-11 15:44:45'
      }, {
        tableName: 'ns_account', count: 0, dataSize: '16KB', createDate: '2018-08-11 15:44:45'
      }, {
        tableName: 'ns_account_assistant_records', count: 0, dataSize: '16KB', createDate: '2018-08-11 15:44:45'
      }, {
        tableName: 'ns_account_order_records', count: 0, dataSize: '16KB', createDate: '2018-08-11 15:44:45'
      }, {
        tableName: 'ns_account_period', count: 0, dataSize: '16KB', createDate: '2018-08-11 15:44:46'
      }, {
        tableName: 'ns_account_records', count: 0, dataSize: '16KB', createDate: '2018-08-11 15:44:46'
      }, {
        tableName: 'ns_account_return_records', count: 0, dataSize: '16KB', createDate: '2018-08-11 15:44:46'
      }, {
        tableName: 'ns_account_withdraw_records', count: 0, dataSize: '16KB', createDate: '2018-08-11 15:44:46'
      }, {
        tableName: 'ns_account_withdraw_user_records', count: 0, dataSize: '16KB', createDate: '2018-08-11 15:44:46'
      }, {
        tableName: 'ns_attribute', count: 5, dataSize: '16KB', createDate: '2018-08-11 15:44:46'
      }, {
        tableName: 'ns_attribute_value', count: 10, dataSize: '16KB', createDate: '2018-08-11 15:44:46'
      }, {
        tableName: 'ns_cart', count: 18, dataSize: '16KB', createDate: '2018-08-11 15:44:46'
      }, {
        tableName: 'ns_click_fabulous', count: 0, dataSize: '16KB', createDate: '2018-08-11 15:44:46'
      }, {
        tableName: 'ns_combo_package_promotion', count: 6, dataSize: '16KB', createDate: '2018-08-11 15:44:46'
      }, {
        tableName: 'ns_consult', count: 0, dataSize: '16KB', createDate: '2018-08-11 15:44:46'
      }, {
        tableName: 'ns_consult_type', count: 0, dataSize: '16KB', createDate: '2018-08-11 15:44:46'
      }, {
        tableName: 'ns_coupon', count: 140999, dataSize: '></t.52MB', createDate: '2018-08-11 15:44:46'
      }, {
        tableName: 'ns_coupon_goods', count: 0, dataSize: '16KB', createDate: '2018-08-11 15:44:52'
      }, {
        tableName: 'ns_coupon_type', count: 3, dataSize: '16KB', createDate: '2018-08-14 09:59:23'
      }, {
        tableName: 'ns_customer_service', count: 0, dataSize: '16KB', createDate: '2018-08-11 15:44:52'
      }, {
        tableName: 'ns_customer_service_records', count: 6, dataSize: '16KB', createDate: '2018-08-11 15:44:52'
      }, {
        tableName: 'ns_express_company', count: 3, dataSize: '16KB', createDate: '2018-08-11 15:44:52'
      }, {
        tableName: 'ns_express_shipping', count: 3, dataSize: '16KB', createDate: '2018-08-11 15:44:52'
      }, {
        tableName: 'ns_express_shipping_items', count: 39, dataSize: '16KB', createDate: '2018-08-11 15:44:52'
      }, {
        tableName: 'ns_express_shipping_items_library', count: 0, dataSize: '16KB', createDate: '2018-08-11 15:44:52'
      }, {
        tableName: 'ns_gift_grant_records', count: 0, dataSize: '16KB', createDate: '2018-07-02 15:32:30'
      }, {
        tableName: 'ns_goods', count: 46, dataSize: '1td>2018-08-14 09:59:weixin.qq.com/'
      }, {
        tableName: 'ns_goods_attribute', count: 80, dataSize: '16KB', createDate: '2018-07-02 15:32:30'
      }, {
        tableName: 'ns_goods_attribute_deleted', count: 8, dataSize: '16KB', createDate: '2018-07-02 15:32:30'
      }, {
        tableName: 'ns_goods_attribute_value', count: 0, dataSize: '16KB', createDate: '2018-07-02 15:32:30'
      }, {
        tableName: 'ns_goods_brand', count: 0, dataSize: '16KB', createDate: '2018-07-02 15:32:30'
      }, {
        tableName: 'ns_goods_browse', count: 222, dataSize: '16KB', createDate: '2018-07-02 15:32:30'
      }, {
        tableName: 'ns_goods_category', count: 129, dataSize: '16KB', createDate: '2018-07-02 15:32:30'
      }, {
        tableName: 'ns_goods_category_block', count: 14, dataSize: '16KB', createDate: '2018-07-02 15:32:30'
      }, {
        tableName: 'ns_goods_comment', count: 0, dataSize: '16KB', createDate: '2018-07-02 15:32:30'
      }, {
        tableName: 'ns_goods_deleted', count: 14, dataSize: '112KB', createDate: '2018-08-14 09:59:24'
      }, {
        tableName: 'ns_goods_evaluate', count: 2, dataSize: '16KB', createDate: '2018-07-02 15:32:30'
      }, {
        tableName: 'ns_goods_group', count: 3, dataSize: '16KB', createDate: '2018-07-02 15:32:30'
      }, {
        tableName: 'ns_goods_ladder_preferential', count: 3, dataSize: '16KB', createDate: '2018-07-02 15:32:30'
      }, {
        tableName: 'ns_goods_member_discount', count: 16, dataSize: '16KB', createDate: '2018-07-02 15:32:30'
      }, {
        tableName: 'ns_goods_sku', count: 107, dataSize: '16KB', createDate: '2018-07-02 15:32:30'
      }, {
        tableName: 'ns_goods_sku_deleted', count: 283, dataSize: '80KB', createDate: '2018-07-02 15:32:30'
      }, {
        tableName: 'ns_goods_sku_picture', count: 0, dataSize: '16KB', createDate: '2018-07-02 15:32:30'
      }, {
        tableName: 'ns_goods_sku_picture_delete', count: 0, dataSize: '16KB', createDate: '2018-07-02 15:32:31'
      }, {
        tableName: 'ns_goods_spec', count: 5, dataSize: '16KB', createDate: '2018-07-02 15:32:31'
      }, {
        tableName: 'ns_goods_spec_value', count: 27, dataSize: '16KB', createDate: '2018-07-02 15:32:31'
      }, {
        tableName: 'ns_member', count: 95, dataSize: '16KB', createDate: '2018-07-02 15:32:31'
      }, {
        tableName: 'ns_member_account', count: 90, dataSize: '16KB', createDate: '2018-07-02 15:32:31'
      }, {
        tableName: 'ns_member_account_records', count: 164, dataSize: '16KB', createDate: '2018-07-02 15:32:31'
      }, {
        tableName: 'ns_member_balance_withdraw', count: 0, dataSize: '16KB', createDate: '2018-07-02 15:32:31'
      }, {
        tableName: 'ns_member_bank_account', count: 0, dataSize: '16KB', createDate: '2018-07-02 15:32:31'
      }, {
        tableName: 'ns_member_express_address', count: 14, dataSize: '16KB', createDate: '2018-07-02 15:32:31'
      }, {
        tableName: 'ns_member_favorites', count: 7, dataSize: '16KB', createDate: '2018-07-02 15:32:31'
      }, {
        tableName: 'ns_member_gift', count: 0, dataSize: '16KB', createDate: '2018-07-02 15:32:31'
      }, {
        tableName: 'ns_member_level', count: 4, dataSize: '16KB', createDate: '2018-07-02 15:32:31'
      }, {
        tableName: 'ns_member_recharge', count: 7, dataSize: '16KB', createDate: '2018-07-02 15:32:31'
      }, {
        tableName: 'ns_member_withdraw_setting', count: 0, dataSize: '16KB', createDate: '2018-07-02 15:32:31'
      }, {
        tableName: 'ns_notice', count: 0, dataSize: '16KB', createDate: '2018-07-02 15:32:31'
      }, {
        tableName: 'ns_o2o_distribution_area', count: 0, dataSize: '16KB', createDate: '2018-07-02 15:32:31'
      }, {
        tableName: 'ns_o2o_distribution_config', count: 0, dataSize: '16KB', createDate: '2018-07-02 15:32:31'
      }, {
        tableName: 'ns_o2o_distribution_user', count: 0, dataSize: '16KB', createDate: '2018-07-02 15:32:31'
      }, {
        tableName: 'ns_o2o_order_delivery', count: 0, dataSize: '16KB', createDate: '2018-07-02 15:32:31'
      }, {
        tableName: 'ns_offpay_area', count: 0, dataSize: '16KB', createDate: '2018-07-02 15:32:31'
      }, {
        tableName: 'ns_order', count: 132, dataSize: '80KB', createDate: '2018-08-14 09:58:29'
      }, {
        tableName: 'ns_order_action', count: 10, dataSize: '1td>2018-09-06 18:23:weixin.qq.com/'
      }, {
        tableName: 'ns_order_customer_account_records', count: 0, dataSize: '16KB', createDate: '2018-07-02 15:32:31'
      }, {
        tableName: 'ns_order_goods', count: 138, dataSize: '48KB', createDate: '2018-07-02 15:32:31'
      }, {
        tableName: 'ns_order_goods_express', count: 18, dataSize: '16KB', createDate: '2018-07-02 15:32:31'
      }, {
        tableName: 'ns_order_goods_promotion_details', count: 9, dataSize: '16KB', createDate: '2018-07-02 15:32:31'
      }, {
        tableName: 'ns_order_payment', count: 85, dataSize: '48KB', createDate: '2018-07-02 15:32:31'
      }, {
        tableName: 'ns_order_pickup', count: 2, dataSize: '16KB', createDate: '2018-08-14 09:58:29'
      }, {
        tableName: 'ns_order_presell', count: 2, dataSize: '16KB', createDate: '2018-07-02 15:32:31'
      }, {
        tableName: 'ns_order_promotion_details', count: 0, dataSize: '16KB', createDate: '2018-07-02 15:32:31'
      }, {
        tableName: 'ns_order_refund', count: 34, dataSize: '16KB', createDate: '2018-07-02 15:32:31'
      }, {
        tableName: 'ns_order_refund_account_records', count: 8, dataSize: '16KB', createDate: '2018-07-02 15:32:31'
      }, {
        tableName: 'ns_order_shipping_fee', count: 7, dataSize: '64KB', createDate: '2018-07-02 15:32:31'
      }, {
        tableName: 'ns_order_shipping_fee_extend', count: 0, dataSize: '16KB', createDate: '2018-07-02 15:32:31'
      }, {
        tableName: 'ns_order_shop_return', count: 0, dataSize: '16KB', createDate: '2018-07-02 15:32:31'
      }, {
        tableName: 'ns_picked_up_auditor', count: 0, dataSize: '16KB', createDate: '2018-08-14 09:58:29'
      }, {
        tableName: 'ns_pickup_point', count: 0, dataSize: '16KB', createDate: '2018-07-02 15:32:31'
      }, {
        tableName: 'ns_platform_adv', count: 39, dataSize: '16KB', createDate: '2018-07-02 15:32:31'
      }, {
        tableName: 'ns_platform_adv_position', count: 34, dataSize: '16KB', createDate: '2018-07-02 15:32:31'
      }, {
        tableName: 'ns_platform_block', count: 3, dataSize: '16KB', createDate: '2018-07-02 15:32:31'
      }, {
        tableName: 'ns_platform_goods_recommend', count: 0, dataSize: '16KB', createDate: '2018-07-02 15:32:31'
      }, {
        tableName: 'ns_platform_goods_recommend_class', count: 0, dataSize: '16KB', createDate: '2018-07-02 15:32:31'
      }, {
        tableName: 'ns_platform_help_class', count: 5, dataSize: '16KB', createDate: '2018-07-02 15:32:31'
      }, {
        tableName: 'ns_platform_help_document', count: 16, dataSize: '16KB', createDate: '2018-07-02 15:32:31'
      }, {
        tableName: 'ns_platform_link', count: 1, dataSize: '40B', createDate: '2018-07-02 15:32:31'
      }, {
        tableName: 'ns_point_config', count: 0, dataSize: '16KB', createDate: '2018-07-02 15:32:31'
      }, {
        tableName: 'ns_promotion_bargain', count: 2, dataSize: '16KB', createDate: '2018-07-02 15:32:31'
      }, {
        tableName: 'ns_promotion_bargain_goods', count: 3, dataSize: '16KB', createDate: '2018-07-02 15:32:31'
      }, {
        tableName: 'ns_promotion_bargain_launch', count: 6, dataSize: '16KB', createDate: '2018-08-14 09:59:24'
      }, {
        tableName: 'ns_promotion_bargain_partake', count: 28, dataSize: '16KB', createDate: '2018-07-02 15:32:32'
      }, {
        tableName: 'ns_promotion_bundling', count: 0, dataSize: '16KB', createDate: '2018-07-02 15:32:32'
      }, {
        tableName: 'ns_promotion_bundling_goods', count: 0, dataSize: '16KB', createDate: '2018-07-02 15:32:32'
      }, {
        tableName: 'ns_promotion_discount', count: 3, dataSize: '16KB', createDate: '2018-07-02 15:32:32'
      }, {
        tableName: 'ns_promotion_discount_goods', count: 17, dataSize: '16KB', createDate: '2018-07-02 15:32:32'
      }, {
        tableName: 'ns_promotion_full_mail', count: 0, dataSize: '16KB', createDate: '2018-07-02 15:32:32'
      }, {
        tableName: 'ns_promotion_game_rule', count: 5, dataSize: '16KB', createDate: '2018-07-02 15:32:32'
      }, {
        tableName: 'ns_promotion_game_type', count: 10, dataSize: '16KB', createDate: '2018-07-02 15:32:32'
      }, {
        tableName: 'ns_promotion_games', count: 3, dataSize: '16KB', createDate: '2018-07-02 15:32:32'
      }, {
        tableName: 'ns_promotion_games_winning_records', count: 14, dataSize: '16KB', createDate: '2018-07-02 15:32:32'
      }, {
        tableName: 'ns_promotion_gift', count: 3, dataSize: '16KB', createDate: '2018-07-02 15:32:32'
      }, {
        tableName: 'ns_promotion_gift_goods', count: 0, dataSize: '16KB', createDate: '2018-07-02 15:32:32'
      }, {
        tableName: 'ns_promotion_gift_grant_records', count: 2, dataSize: '16KB', createDate: '2018-07-02 15:32:32'
      }, {
        tableName: 'ns_promotion_group_buy', count: 0, dataSize: '16KB', createDate: '2018-07-02 15:32:32'
      }, {
        tableName: 'ns_promotion_group_buy_ladder', count: 1, dataSize: '16KB', createDate: '2018-07-02 15:32:32'
      }, {
        tableName: 'ns_promotion_mansong', count: 1, dataSize: '16KB', createDate: '2018-07-02 15:32:32'
      }, {
        tableName: 'ns_promotion_mansong_goods', count: 0, dataSize: '16KB', createDate: '2018-07-02 15:32:32'
      }, {
        tableName: 'ns_promotion_mansong_rule', count: 0, dataSize: '16KB', createDate: '2018-07-02 15:32:32'
      }, {
        tableName: 'ns_promotion_topic', count: 0, dataSize: '16KB', createDate: '2018-07-02 15:32:32'
      }, {
        tableName: 'ns_promotion_topic_goods', count: 8, dataSize: '16KB', createDate: '2018-07-02 15:32:32'
      }, {
        tableName: 'ns_promotion_tuangou', count: 15, dataSize: '16KB', createDate: '2018-07-02 15:32:32'
      }, {
        tableName: 'ns_reward_rule', count: 0, dataSize: '16KB', createDate: '2018-07-02 15:32:32'
      }, {
        tableName: 'ns_shop', count: 0, dataSize: '16KB', createDate: '2018-07-02 15:32:32'
      }, {
        tableName: 'ns_shop_account', count: 0, dataSize: '16KB', createDate: '2018-07-02 15:32:32'
      }, {
        tableName: 'ns_shop_ad', count: 0, dataSize: '16KB', createDate: '2018-07-02 15:32:32'
      }, {
        tableName: 'ns_shop_coin_records', count: 0, dataSize: '16KB', createDate: '2018-07-02 15:32:32'
      }, {
        tableName: 'ns_shop_express_address', count: 0, dataSize: '16KB', createDate: '2018-07-02 15:32:32'
      }, {
        tableName: 'ns_shop_group', count: 0, dataSize: '16KB', createDate: '2018-07-02 15:32:32'
      }, {
        tableName: 'ns_shop_navigation', count: 17, dataSize: '16KB', createDate: '2018-07-02 15:32:32'
      }, {
        tableName: 'ns_shop_navigation_template', count: 20, dataSize: '16KB', createDate: '2018-07-02 15:32:32'
      }, {
        tableName: 'ns_shop_order_account_records', count: 0, dataSize: '16KB', createDate: '2018-07-02 15:32:32'
      }, {
        tableName: 'ns_shop_weixin_share', count: 0, dataSize: '16KB', createDate: '2018-07-02 15:32:32'
      }, {
        tableName: 'ns_supplier', count: 0, dataSize: '16KB', createDate: '2018-07-02 15:32:32'
      }, {
        tableName: 'ns_tuangou_group', count: 8, dataSize: '16KB', createDate: '2018-07-02 15:32:32'
      }, {
        tableName: 'ns_tuangou_type', count: 3, dataSize: '16KB', createDate: '2018-07-02 15:32:32'
      }, {
        tableName: 'ns_verification_person', count: 0, dataSize: '16KB', createDate: '2018-07-02 15:32:32'
      }, {
        tableName: 'ns_virtual_goods', count: 9, dataSize: '16KB', createDate: '2018-07-02 15:32:32'
      }, {
        tableName: 'ns_virtual_goods_group', count: 4, dataSize: '16KB', createDate: '2018-07-02 15:32:32'
      }, {
        tableName: 'ns_virtual_goods_type', count: 0, dataSize: '16KB', createDate: '2018-07-02 15:32:33'
      }, {
        tableName: 'ns_virtual_goods_verification', count: 0, dataSize: '16KB', createDate: '2018-07-02 15:32:33'
      }, {
        tableName: 'sys_addons', count: 1, dataSize: '100B', createDate: '2018-07-02 15:32:33'
      }, {
        tableName: 'sys_addons_weixin_template_msg', count: 15, dataSize: '16KB', createDate: '2018-08-29 15:47:56'
      }, {
        tableName: 'sys_album_class', count: 0, dataSize: '16KB', createDate: '2018-07-02 15:32:33'
      }, {
        tableName: 'sys_album_picture', count: 126, dataSize: '64KB', createDate: '2018-07-02 15:32:33'
      }, {
        tableName: 'sys_applet_custom_template', count: 0, dataSize: '16KB', createDate: '2018-07-02 15:32:33'
      }, {
        tableName: 'sys_area', count: 8, dataSize: '16KB', createDate: '2018-07-02 15:32:33'
      }, {
        tableName: 'sys_city', count: 345, dataSize: '48KB', createDate: '2018-07-02 15:32:33'
      }, {
        tableName: 'sys_config', count: 56, dataSize: '16KB', createDate: '2018-07-02 15:32:33'
      }, {
        tableName: 'sys_custom_template', count: 0, dataSize: '16KB', createDate: '2018-07-02 15:32:33'
      }, {
        tableName: 'sys_district', count: 2864, dataSize: '160KB', createDate: '2018-07-02 15:32:33'
      }, {
        tableName: 'sys_hooks', count: 39, dataSize: '2td>2018-07-02 15:32:weixin.qq.com/'
      }, {
        tableName: 'sys_instance', count: 0, dataSize: '16KB', createDate: '2018-07-02 15:32:33'
      }, {
        tableName: 'sys_instance_type', count: 0, dataSize: '16KB', createDate: '2018-07-02 15:32:33'
      }, {
        tableName: 'sys_module', count: 290, dataSize: '80KB', createDate: '2018-07-02 15:32:33'
      }, {
        tableName: 'sys_notice', count: 0, dataSize: '16KB', createDate: '2018-07-02 15:32:33'
      }, {
        tableName: 'sys_notice_records', count: 16, dataSize: '16KB', createDate: '2018-07-02 15:32:33'
      }, {
        tableName: 'sys_notice_template', count: 0, dataSize: '16KB', createDate: '2018-07-02 15:32:33'
      }, {
        tableName: 'sys_notice_template_item', count: 19, dataSize: '16KB', createDate: '2018-08-14 09:59:24'
      }, {
        tableName: 'sys_notice_template_type', count: 22, dataSize: '16KB', createDate: '2018-07-02 15:32:33'
      }, {
        tableName: 'sys_province', count: 34, dataSize: '16KB', createDate: '2018-07-02 15:32:33'
      }, {
        tableName: 'sys_shortcut_menu', count: 18, dataSize: '378B', createDate: '2018-07-02 15:32:33'
      }, {
        tableName: 'sys_url_route', count: 7, dataSize: '16KB', createDate: '2018-07-02 15:32:33'
      }, {
        tableName: 'sys_user', count: 90, dataSize: '48KB', createDate: '2018-07-02 15:32:33'
      }, {
        tableName: 'sys_user_admin', count: 2, dataSize: '16KB', createDate: '2018-07-02 15:32:33'
      }, {
        tableName: 'sys_user_group', count: 2, dataSize: '16KB', createDate: '2018-07-02 15:32:33'
      }, {
        tableName: 'sys_user_log', count: 1859, dataSize: '288KB', createDate: '2018-07-02 15:32:33'
      }, {
        tableName: 'sys_version_devolution', count: 0, dataSize: '16KB', createDate: '2018-07-02 15:32:33'
      }, {
        tableName: 'sys_version_patch', count: 0, dataSize: '16KB', createDate: '2018-07-02 15:32:33'
      }, {
        tableName: 'sys_version_update_records', count: 0, dataSize: '16KB', createDate: '2018-07-02 15:32:33'
      }, {
        tableName: 'sys_wap_custom_template', count: 0, dataSize: '16KB', createDate: '2018-07-02 15:32:33'
      }, {
        tableName: 'sys_web_style', count: 3, dataSize: '16KB', createDate: '2018-07-02 15:32:33'
      }, {
        tableName: 'sys_website', count: 0, dataSize: '16KB', createDate: '2018-07-02 15:32:33'
      }, {
        tableName: 'sys_weixin_auth', count: 0, dataSize: '16KB', createDate: '2018-07-02 15:32:33'
      }, {
        tableName: 'sys_weixin_default_replay', count: 0, dataSize: '16KB', createDate: '2018-07-02 15:32:33'
      }, {
        tableName: 'sys_weixin_fans', count: 0, dataSize: '16KB', createDate: '2018-07-02 15:32:33'
      }, {
        tableName: 'sys_weixin_follow_replay', count: 1, dataSize: '16KB', createDate: '2018-07-02 15:32:33'
      }, {
        tableName: 'sys_weixin_functions_button', count: 0, dataSize: '16KB', createDate: '2018-07-02 15:32:33'
      }, {
        tableName: 'sys_weixin_instance_msg', count: 0, dataSize: '16KB', createDate: '2018-07-02 15:32:33'
      }, {
        tableName: 'sys_weixin_key_replay', count: 0, dataSize: '16KB', createDate: '2018-07-02 15:32:33'
      }, {
        tableName: 'sys_weixin_media', count: 1, dataSize: '16KB', createDate: '2018-07-02 15:32:33'
      }, {
        tableName: 'sys_weixin_media_item', count: 0, dataSize: '16KB', createDate: '2018-07-02 15:32:33'
      }, {
        tableName: 'sys_weixin_menu', count: 7, dataSize: '16KB', createDate: '2018-07-02 15:32:33'
      }, {
        tableName: 'sys_weixin_msg_template', count: 0, dataSize: '16KB', createDate: '2018-07-02 15:32:33'
      }, {
        tableName: 'sys_weixin_qrcode_template', count: 7, dataSize: '16KB', createDate: '2018-07-02 15:32:33'
      }, {
        tableName: 'sys_weixin_user_msg', count: 0, dataSize: '16KB', createDate: '2018-07-02 15:32:33'
      }, {
        tableName: 'sys_weixin_user_msg_replay', count: 0, dataSize: '16KB', createDate: '2018-07-02 15:32:33'
      }, {
        tableName: 'sys_wexin_onekeysubscribe', count: 0, dataSize: '16KB', createDate: '2018-07-02 15:32:33'
      }]
    }
  },
  methods: {
    handleEdit (index, row) {
      console.log(index, row)
    },
    handleDelete (index, row) {
      console.log(index, row)
    }
  }
}
</script>

<style lang="scss" scoped>
</style>
