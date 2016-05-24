package me.qinchao.pss.service;

import java.util.List;

import me.qinchao.pss.domain.ProductType;

public interface IProductTypeService extends IBaseService<ProductType> {
	/*
	 * 一级类型
	 */
	List<ProductType> getParents();

	/*
	 * 二级类型
	 */
	List<ProductType> findChildrentByParentId(Long parentId);
}
