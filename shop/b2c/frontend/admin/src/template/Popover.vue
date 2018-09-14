<template>
  <div>
    <el-popover
      placement="bottom"
      width="400"
      trigger="click"
      v-model="moreQueryPopoverVisible">
      <el-form ref="editForm" :model="queryForm" label-width="100px" size="small" label-position="right">
        <el-form-item label="商品编码">
          <el-input v-model="queryForm.goodsCode"></el-input>
        </el-form-item>

        <el-form-item label="供货商">
          <el-select v-model="queryForm.supplierId" clearable placeholder="请选择">
            <el-option label="小米供货商" :value="1"></el-option>
            <el-option label="三星供货商" :value="2"></el-option>
          </el-select>
        </el-form-item>

        <el-form-item label="商品类型">
          <el-select v-model="queryForm.goodsType" clearable placeholder="请选择">
            <el-option label="实物商品" :value="1"></el-option>
            <el-option label="虚拟商品" :value="2"></el-option>
          </el-select>
        </el-form-item>

        <el-form-item label="商品标签">
          <el-select v-model="queryForm.labels" multiple clearable placeholder="请选择">
            <el-option label="hot" :value="1"></el-option>
            <el-option label="牛逼的标签" :value="2"></el-option>
          </el-select>
        </el-form-item>

        <el-form-item>
          <el-button type="primary" @click="moreQueryPopoverVisible = false">确定</el-button>
        </el-form-item>
      </el-form>
      <el-button slot="reference" icon="el-icon-arrow-down" size="small" ></el-button>
    </el-popover>
    <el-popover
      class="popover-checkbox-group"
      title="标题"
      placement="bottom"
      width="80"
      trigger="click"
      v-model="seleteRecommendTypesPopoverVisible">
      <el-checkbox-group v-model="updateRecommendTypes">
        <el-checkbox label="热卖"></el-checkbox>
        <el-checkbox label="精品"></el-checkbox>
        <el-checkbox label="新品"></el-checkbox>
      </el-checkbox-group>
      <br/>
      <el-button type="primary" size="mini" @click="seleteRecommendTypesPopoverVisible = false">确定</el-button>
      <el-button slot="reference" size="small">推荐</el-button>
    </el-popover>
  </div>
</template>
