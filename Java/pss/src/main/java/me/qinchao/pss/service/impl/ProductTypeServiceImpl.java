package me.qinchao.pss.service.impl;

import java.util.List;

import me.qinchao.pss.domain.ProductType;
import me.qinchao.pss.service.IProductTypeService;

public class ProductTypeServiceImpl extends BaseServiceImpl<ProductType>
		implements IProductTypeService {

	public List<ProductType> getParents() {
		return baseDao
				.findByHql("SELECT o FROM ProductType o WHERE o.parent IS NULL");
	}

	public List<ProductType> findChildrentByParentId(Long parentId) {
		return baseDao.findByHql(
				"SELECT o FROM ProductType o WHERE o.parent.id=?", parentId);
	}
}
